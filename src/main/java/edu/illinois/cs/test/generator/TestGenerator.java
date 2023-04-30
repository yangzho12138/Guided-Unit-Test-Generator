package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.ReferenceType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static com.github.javaparser.StaticJavaParser.parse;

public class TestGenerator extends VoidVisitorAdapter{

    Set<Integer> integersPool;
    Set<String> stringsPool;
    Set<Character> charactersPool;
    Set<Long> longsPool;
    Set<Boolean> booleansPool;
    Set<Object> objectsPool;

    List<MethodDeclaration> methods;
    List<ConstructorDeclaration> constructors;
    List<ClassOrInterfaceDeclaration> classes;
//    List<List<Object>> argumentsList;

    StringBuilder sb;

    // to prevent the duplicate test methods name
    Set<String> testMethodsName;

    public Set<Object> getObjectPoolSize(){
        return objectsPool;
    }

    public Object getObjectFromPool(String type){
        Random random = new Random();
        // find a random object in the object pool
        Iterator<Object> it = objectsPool.iterator();
        List<Object> list = new ArrayList<>(objectsPool);

        // create a set of indexes of such type
        Set<Integer> indexes = new HashSet<>();

        // add indexes of objects of such type
        for (int i = 0; i < list.size(); i++) {
            Object s = it.next();
            if (s.getClass().toString().contains(type)) {
                indexes.add(i);
            }
        }

        // get a random index from the set
        if (indexes.size() == 0) {
            return null;
        }
        int randomIndex = random.nextInt(indexes.size());
        int i = 0;
        for (Integer idx : indexes) {
            if (i == randomIndex) {
                return list.get(idx);
            }
            i++;
        }

        return null;
    }

    public void putObjectToPool(Object obj){
        if (obj.getClass().toString().equals("class java.lang.String") || obj.getClass().toString().equals("class java.lang.Integer") || obj.getClass().toString().equals("class java.lang.Character") || obj.getClass().toString().equals("class java.lang.Long") || obj.getClass().toString().equals("class java.lang.Boolean")) {
            return;
        }
        objectsPool.add(obj);
    }

    public TestGenerator(String target) {
        integersPool = PoolInit.valuePool.integersPool;
        stringsPool = PoolInit.valuePool.stringsPool;
        charactersPool = PoolInit.valuePool.charactersPool;
        longsPool = PoolInit.valuePool.longsPool;
        booleansPool = PoolInit.valuePool.booleansPool;
        objectsPool = PoolInit.valuePool.objectsPool;
        methods = new ArrayList<>();
        constructors = new ArrayList<>();
        classes = new ArrayList<>();
        testMethodsName = new HashSet<>();

//        argumentsList = new ArrayList<>();
        MethodTraverse(target);
        sb = new StringBuilder();
        sb.append("package " + "org.jsoup.mytests" + ";\n");
        sb.append("import edu.illinois.cs.test.generator.TestGenerator;\n");
        sb.append("import org.junit.Test;\n");
        sb.append("import static org.junit.Assert.*;\n");
        sb.append("import org.jsoup.nodes.*;\n");
        sb.append("import org.jsoup.select.*;\n");
        sb.append("import org.jsoup.examples.*;\n");
        sb.append("import org.jsoup.parser.*;\n");
        sb.append("import org.jsoup.helper.*;\n");
        sb.append("import org.jsoup.internal.*;\n");
        sb.append("import org.jsoup.safety.*;\n");
        sb.append("import org.jsoup.*;\n");

        sb.append("import java.io.InputStream;\n");
        sb.append("import java.nio.charset.Charset;\n");
        sb.append("import java.util.regex.Pattern;\n");

        sb.append("import java.io.File;\n");
        sb.append("import java.io.IOException;\n");
        sb.append("import java.io.InputStream;\n");
        sb.append("import java.io.Reader;\n");
        sb.append("import java.net.URL;\n");
        sb.append("import java.nio.ByteBuffer;\n");
        sb.append("import java.util.*;\n");
        sb.append("import org.jsoup.nodes.Document.OutputSettings;\n");
        sb.append("import org.jsoup.nodes.Document.QuirksMode;\n");
        sb.append("import org.jsoup.Connection.Method;\n");
        sb.append("import org.jsoup.parser.helper.Validate;\n");
        sb.append("import javax.net.ssl.SSLSocketFactory;\n\n");
        sb.append("import java.net.Proxy;\n");
        sb.append("\n");
        sb.append("public class " + "AutomatedTest" + " {\n");

//        System.out.println(objectsPool);
        construct();

        generateTest();
        generateTestFile();

//        for(Object obj : objectsPool){
//            System.out.println(obj.getClass());
//        }
//        try{
//            Thread.sleep(10000000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        System.out.println(objectsPool);
    }

    public void MethodTraverse(String target) {
        Path sourcePath = Paths.get(target);
        SourceRoot sourceRoot = new SourceRoot(sourcePath);

        try {
            Files.walk(sourcePath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        try {
                            CompilationUnit cu = parse(path.toFile());
                            visit(cu, null);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visit(MethodDeclaration n, Object arg) {

        if(n.isPublic()){
            methods.add(n);
        }

        super.visit(n, arg);
    }

    @Override
    public void visit(ClassOrInterfaceDeclaration n, Object arg) {
        super.visit(n, arg);
        if(!n.isInterface() && !n.isAbstract() && n.isPublic() && !n.isInnerClass() && !n.isStatic()){
            classes.add(n);
        }
    }

    public Map constructMap(String type){
        type = type.substring(type.indexOf("<") + 1, type.indexOf(">"));
        String[] types = type.split(",");
        Map map = new HashMap();
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        while(randomNumber -- > 0){
            map.put(getValueFromPool(types[0]), getValueFromPool(types[1]));
        }
        return map;
    }

    public Object getValueFromPool(String type) {
        if(type.contains("Map")){
            return constructMap(type);
        }else if (type.contains("[]") || type.contains("List") || type.contains("Set")) {
            if (type.contains("Integer") || type.contains("int")) {
                Random random = new Random();
                int randomNumber = random.nextInt(integersPool.size());

                if(type.contains("List")){
                    List<Integer> intList = new ArrayList<>();
                    int j = 0;
                    Iterator<Integer> it = integersPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        intList.add(it.next());
                        j++;
                    }
                    return intList;
                } else if(type.contains("Set")){
                    Set<Integer> intSet = new HashSet<>();
                    int j = 0;
                    Iterator<Integer> it = integersPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        intSet.add(it.next());
                        j++;
                    }
                    return intSet;
                }
                int[] intArray = new int[randomNumber];
                int j = 0;
                Iterator<Integer> it = integersPool.iterator();
                while (it.hasNext() && j < randomNumber) {
                    intArray[j] = it.next();
                    j++;
                }
                return intArray;
            } else if (type.contains("String")) {
                Random random = new Random();
                int randomNumber = random.nextInt(stringsPool.size());

                if(type.contains("List")){
                    List<String> stringList = new ArrayList<>();
                    int j = 0;
                    Iterator<String> it = stringsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        stringList.add(it.next());
                        j++;
                    }
                    return stringList;
                } else if(type.contains("Set")){
                    Set<String> stringSet = new HashSet<>();
                    int j = 0;
                    Iterator<String> it = stringsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        stringSet.add(it.next());
                        j++;
                    }
                    return stringSet;
                }

                if(type.contains("StringBuilder")){
                    StringBuilder[] stringArray = new StringBuilder[randomNumber];
                    int j = 0;
                    Iterator<String> it = stringsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        stringArray[j] = new StringBuilder(it.next());
                        j++;
                    }
                    return stringArray;
                }

                String[] stringArray = new String[randomNumber];
                int j = 0;
                Iterator<String> it = stringsPool.iterator();
                while (it.hasNext() && j < randomNumber) {
                    stringArray[j] = it.next();
                    j++;
                }
                return stringArray;
            } else if (type.contains("Character") || type.contains("char")) {
                Random random = new Random();
                int randomNumber = random.nextInt(charactersPool.size());

                if(type.contains("List")){
                    List<Character> charList = new ArrayList<>();
                    int j = 0;
                    Iterator<Character> it = charactersPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        charList.add(it.next());
                        j++;
                    }
                    return charList;
                } else if(type.contains("Set")){
                    Set<Character> charSet = new HashSet<>();
                    int j = 0;
                    Iterator<Character> it = charactersPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        charSet.add(it.next());
                        j++;
                    }
                    return charSet;
                }

                Character[] charArray = new Character[randomNumber];
                int j = 0;
                Iterator<Character> it = charactersPool.iterator();
                while (it.hasNext() && j < randomNumber) {
                    charArray[j] = it.next();
                    j++;
                }
                return charArray;
            } else if (type.contains("Long") || type.contains("long")) {
                Random random = new Random();
                int randomNumber = random.nextInt(longsPool.size());

                if(type.contains("List")){
                    List<Long> longList = new ArrayList<>();
                    int j = 0;
                    Iterator<Long> it = longsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        longList.add(it.next());
                        j++;
                    }
                    return longList;
                } else if(type.contains("Set")){
                    Set<Long> longSet = new HashSet<>();
                    int j = 0;
                    Iterator<Long> it = longsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        longSet.add(it.next());
                        j++;
                    }
                    return longSet;
                }

                long[] longArray = new long[randomNumber];
                int j = 0;
                Iterator<Long> it = longsPool.iterator();
                while (it.hasNext() && j < randomNumber) {
                    longArray[j] = it.next();
                    j++;
                }
                return longArray;
            } else if (type.contains("boolean")) {
                boolean[] boolArray = new boolean[2];
                boolArray[0] = true;
                return boolArray;
            }
//            } else {
//                Random random = new Random();
//                int randomNumber = random.nextInt(objectsPool.size());
////                System.out.println(type);
//                Object[] objectArray = new Object[randomNumber];
//                int j = 0;
//                Iterator<Object> it = objectsPool.iterator();
//                while (it.hasNext() && j < randomNumber) {
//                    objectArray[j] = it.next();
//                    j++;
//                }
//                return objectArray;
//            }
        } else if (type.contains("String")) {
            Random random = new Random();
            int index = random.nextInt(stringsPool.size());

            if(type.contains("StringBuilder")){
                Iterator<String> it = stringsPool.iterator();
                int i = 0;
                while(it.hasNext()){
                    String s = it.next();
                    if(i == index){
                        StringBuilder sb = new StringBuilder(s);
                        return sb;
                    }
                    i++;
                }
            }

            // find a random string in the string pool
            Iterator<String> it = stringsPool.iterator();
            int i = 0;
            while (it.hasNext()) {
                String s = it.next();
                if (i == index) {
                    return s;
                }
                i++;
            }
        } else if (type.contains("Integer") || type.contains("int")) {
            Random random = new Random();
            int index = random.nextInt(integersPool.size());

            // find a random int in the int pool
            Iterator<Integer> it = integersPool.iterator();
            int i = 0;
            while (it.hasNext()) {
                Integer s = it.next();
                if (i == index) {
                    return s;
                }
                i++;
            }
        } else if (type.contains("Character") || type.contains("char")) {
            Random random = new Random();
            int index = random.nextInt(charactersPool.size());

            // find a random char in the char pool
            Iterator<Character> it = charactersPool.iterator();
            int i = 0;
            while (it.hasNext()) {
                Character s = it.next();
                if (i == index) {
                    return s;
                }
                i++;
            }
        } else if (type.contains("Long") || type.contains("long")) {
            Random random = new Random();
            int index = random.nextInt(longsPool.size());

            // find a random long in the long pool
            Iterator<Long> it = longsPool.iterator();
            int i = 0;
            while (it.hasNext()) {
                Long s = it.next();
                if (i == index) {
                    return s;
                }
                i++;
            }
        } else if (type.contains("boolean")) {
            Random random = new Random();
            int index = random.nextInt(1);

            return index == 0;
        }
//        } else {
//        else {
//            Random random = new Random();
////            System.out.println(type);
//            // find a random object in the object pool
//            Iterator<Object> it = objectsPool.iterator();
//            List<Object> list = new ArrayList<>(objectsPool);
//
//            // create a set of indexes of such type
//            Set<Integer> indexes = new HashSet<>();
//
//            // add indexes of objects of such type
//            for (int i = 0; i < list.size(); i++) {
//                Object s = it.next();
//                if (s.getClass().toString().equals(type)) {
//                    indexes.add(i);
//                }
//            }
//
//            // get a random index from the set
//            if (indexes.size() == 0) {
//                return null;
//            }
//            int randomIndex = random.nextInt(indexes.size());
//            int i = 0;
//            for (Integer idx : indexes) {
//                if (i == randomIndex) {
//                    return list.get(idx);
//                }
//                i++;
//            }
//        }
        return null;
    }

//    public void invokeMethod(List<String> parametersList, int i, MethodDeclaration n, int argumentLength, List<Object> arguments) {
//        if (i == argumentLength) {
//            // get class object and method
//            System.out.println(arguments);
//            argumentsList.add(arguments);
//            return;
//        }
//        String currentParameter = parametersList.get(i);
//        if (currentParameter.equals("String")) {
//            for (String stringValueFromPool : stringsPool) {
//                arguments.add(stringValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(stringValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("int")) {
//            for (int intValueFromPool: integersPool) {
//                arguments.add(intValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove((Object) intValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("Character")) {
//            for (Character charValueFromPool: charactersPool) {
//                arguments.add(charValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(charValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("long")) {
//            for (Long longValueFromPool: longsPool) {
//                arguments.add(longValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(longValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("boolean")) {
//            for (boolean boolValueFromPool: booleansPool) {
//                arguments.add(boolValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(boolValueFromPool);
//            }
//        }
//        else if(currentParameter.contains("[]")){
//            if(currentParameter.contains("int")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(integersPool.size());
//                int[] intArray = new int[randomNumber];
//                int j = 0;
//                Iterator<Integer> it = integersPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    intArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(intArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(intArray);
//            }
//            else if(currentParameter.contains("String")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(stringsPool.size());
//                String[] stringArray = new String[randomNumber];
//                int j = 0;
//                Iterator<String> it = stringsPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    stringArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(stringArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(stringArray);
//            }
//            else if(currentParameter.contains("Character")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(charactersPool.size());
//                Character[] charArray = new Character[randomNumber];
//                int j = 0;
//                Iterator<Character> it = charactersPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    charArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(charArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(charArray);
//            }
//            else if(currentParameter.contains("long")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(longsPool.size());
//                long[] longArray = new long[randomNumber];
//                int j = 0;
//                Iterator<Long> it = longsPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    longArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(longArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(longArray);
//            }
//            else if(currentParameter.contains("boolean")){
//                boolean[] boolArray = new boolean[2];
//                boolArray[0] = true;
//                arguments.add(boolArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(boolArray);
//            }
//            else{
//                Random random = new Random();
//                int randomNumber = random.nextInt(objectsPool.size());
//                Object[] objectArray = new Object[randomNumber];
//                int j = 0;
//                Iterator<Object> it = objectsPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    objectArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(objectArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(objectArray);
//            }
//        }
//        else {
//            for (Object objectValueFromPool: objectsPool) {
//                System.out.println(objectsPool);
//                if (objectsPool.size() == 1 || currentParameter.equals(objectValueFromPool.getClass().toString())) {
//                    arguments.add(objectValueFromPool);
//                    invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                    arguments.remove(objectValueFromPool);
//                }
//            }
//        }
//    }

    public void generateTestFile() {
        Path dir = Paths.get("src/test/java/edu/illinois/cs/test");
        if (!Files.exists(dir)) {
            try {
                Files.createDirectories(dir);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Path file = dir.resolve("AutomatedTest.java");
        try {
            Files.write(file, sb.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Recursive method to search for the class
    private void searchForClass(File directory, String className, List<Class<?>> clazzes) throws ClassNotFoundException {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchForClass(file, className, clazzes);
                } else if (file.getName().endsWith(".class")) {
                    String fileName = file.getName().substring(0, file.getName().length() - 6);
                    String fullClassName = directory.getPath().substring(directory.getPath().lastIndexOf("org")).replace('/', '.') + "." + fileName;
                    if (fullClassName.endsWith(className)) {
                        Class<?> clazz = Class.forName(fullClassName);
                        clazzes.add(clazz);
                    }
                }
            }
        }
    }

    public Object[] getConstructorParam(List<String> parametersTypeList){
        Object[] arguments = new Object[parametersTypeList.size()];
        for(int i = 0; i < parametersTypeList.size(); i++){
            String type = parametersTypeList.get(i);
            if(type.contains("[]")) {
                if (type.contains("String")) {
                    String[] strs = (String[]) getValueFromPool(type);
                    arguments[i] = strs;
                } else if (type.contains("Integer") || type.contains("int")) {
                    int[] ints = (int[]) getValueFromPool(type);
                    arguments[i] = ints;
                } else if (type.contains("Long") || type.contains("long")) {
                    long[] longs = (long[]) getValueFromPool(type);
                    arguments[i] = longs;
                } else if (type.contains("boolean")) {
                    boolean[] bools = (boolean[]) getValueFromPool(type);
                    arguments[i] = bools;
                } else if (type.contains("Character") || type.contains("char")) {
                    Character[] chars = (Character[]) getValueFromPool(type);
                    arguments[i] = chars;
                } else {
                    Random random = new Random();
                    int randomNumber = random.nextInt(objectsPool.size());
                    Object[] objectArray = new Object[randomNumber];
                    for(int j = 0; j < randomNumber; j++){
                        objectArray[j] = getObjectFromPool(type);
                    }
                    arguments[i] = objectArray;
                }
            }else if (type.contains("String")) {
                String s = (String) getValueFromPool(type);
                arguments[i] = s;
            } else if (type.contains("Integer") || type.contains("int")) {
                int in = (int) getValueFromPool(type);
                arguments[i] = in;
            } else if (type.contains("Long") || type.contains("long")) {
                long l = (long) getValueFromPool(type);
                arguments[i] = l;
            } else if (type.contains("boolean")) {
                boolean b = (boolean) getValueFromPool(type);
                arguments[i] = b;
            } else if (type.contains("Character") || type.contains("char")) {
                char ch = (char) getValueFromPool(type);
                arguments[i] = ch;
            } else {
                Object o = getObjectFromPool(type);
                arguments[i] = o;
            }
        }
        return arguments;
    }

    public void construct() {
        for (ClassOrInterfaceDeclaration c : classes){
            String className = c.getNameAsString();

            List<Class<?>> clazzes = new ArrayList<>();

            try{
                ClassLoader classLoader = ClassLoader.getSystemClassLoader();
                Enumeration<URL> resources = classLoader.getResources("org/jsoup");
                while (resources.hasMoreElements()) {
                    URL resource = resources.nextElement();
                    File directory = new File(resource.getFile());
                    searchForClass(directory, className, clazzes);
                }
            }catch(Exception e){
                e.printStackTrace();
            }

            if(clazzes.size() != 0){
                try {
                    // generate the constructor without arguments
                    for(Class<?> cl : clazzes){
                        Constructor<?>[] constructors = cl.getConstructors();
                        for (Constructor<?> constructor : constructors) {
                            if (constructor.getParameterCount() == 0) {
                                Object obj = constructor.newInstance();
                                objectsPool.add(obj);
                            }
                        }
                    }

                    // generate the constructor with arguments
                    for(Class<?> cl : clazzes){
                        Constructor<?>[] constructors = cl.getConstructors();
                        for (Constructor<?> constructor : constructors) {
                            if (constructor.getParameterCount() != 0) {
                                Class<?>[] parameterTypes = constructor.getParameterTypes();
                                List<String> parametersTypeList = new ArrayList<>();
                                for (Class<?> parameterType : parameterTypes) {
                                    parametersTypeList.add(parameterType.toString());
                                }
                                Object[] arguments = getConstructorParam(parametersTypeList);
                                Object obj = constructor.newInstance(arguments);
                                objectsPool.add(obj);
                            }
                        }
                    }

                } catch (Exception e) {
//                    e.printStackTrace();
                }
            }
        }
    }

    public void generateTest() {
        for (MethodDeclaration method : methods) {
            if("Optional.empty".equals(method.findAncestor(ClassOrInterfaceDeclaration.class).toString())){
                continue;
            }
            if(method.findAncestor(ClassOrInterfaceDeclaration.class).get().isPrivate() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isProtected() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isStatic() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isAbstract() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isInterface()){
                continue;
            }

            if (Objects.equals(method.getName().toString(), "iterator")) {
                continue;
            }
            // Pass the override method
            if (method.isAnnotationPresent("Override")) {
                continue;
            }

            // check if the return type is an abstract class
//            String returnClass = method.getType().toString();
            if (method.getName().asString().equals("getTreeBuilder") || method.getName().asString().equals("setTreeBuilder")) {
                continue;
            }

            String className = method.findAncestor(ClassOrInterfaceDeclaration.class).get().getNameAsString();

            NodeList<ReferenceType> exceptionList = method.getThrownExceptions();

            // find parameter types
            NodeList<Parameter> parameters = method.getParameters();
            List<String> parametersList = new ArrayList<>();

            for (Parameter p : parameters) {
                parametersList.add(p.getType().toString());
            }
//            System.out.println(parametersList);

            List<List<Object>> argumentsList = new ArrayList<>();

            // generate 3 groups of arguments for each method
            for (int num = 0; num < 5; num++) {
                List<Object> arguments = new ArrayList<>();
                for (int i = 0; i < parametersList.size(); i++) {
                    String type = parametersList.get(i);
                    if (type.equals("String")) {
                        String s = (String) getValueFromPool(type);
                        arguments.add(s);
                    } else if (type.equals("Integer") || type.equals("int")) {
                        int in = (int) getValueFromPool(type);
                        arguments.add(in);
                    } else if (type.equals("Long") || type.equals("long")) {
                        long l = (long) getValueFromPool(type);
                        arguments.add(l);
                    } else if (type.equals("boolean")) {
                        boolean b = (boolean) getValueFromPool(type);
                        arguments.add(b);
                    } else if (type.equals("Character") || type.equals("char")) {
                        char c = (char) getValueFromPool(type);
//                        System.out.println(c);
                        arguments.add(c);
                    } else if(type.contains("[]")){
                        if(type.contains("String")){
                            String[] strs = (String[]) getValueFromPool(type);
                            arguments.add(strs);
                        }else if(type.contains("Integer") || type.contains("int")) {
                            int[] ints = (int[]) getValueFromPool(type);
                            arguments.add(ints);
                        }else if(type.contains("Long") || type.contains("long")) {
                            long[] longs = (long[]) getValueFromPool(type);
                            arguments.add(longs);
                        }else if(type.contains("boolean")) {
                            boolean[] bools = (boolean[]) getValueFromPool(type);
                            arguments.add(bools);
                        }else if(type.contains("Character") || type.contains("char")) {
                            Character[] chars = (Character[]) getValueFromPool(type);
                            arguments.add(chars);
                        }else{
                            Object[] objects = (Object[]) getValueFromPool(type);
                            arguments.add(objects);
                        }
                    } else {
//                        System.out.println(type);
                        Object o = getValueFromPool(type);
                        arguments.add(o);
                    }
                }
                argumentsList.add(arguments);
            }
//            if(method.getName().toString().equals("put")){
//                System.out.println(argumentsList);
//            }

            // 根据方法所在的类，去constructor list中找到对应的实体，调用该函数，生成test
            // TODO: Object can not be put into the code directly!!!
            for (int i = 0; i < argumentsList.size(); i++) {

                // get the parameter list
                List<Object> currentArguments = argumentsList.get(i);

                sb.append("    @Test\n");
                String throwException;
                if (exceptionList.size() != 0) {
                    throwException = "throws Exception ";
                } else {
                    throwException = "";
                }

                Random random = new Random();
                int randomNum = random.nextInt(99999999);
                String methodName = "test" + className + method.getName() + randomNum;
                while(testMethodsName.contains(methodName)){
                    randomNum = random.nextInt(99999999);
                    methodName = "test" + className + method.getName() + randomNum;
                }

                testMethodsName.add(methodName);

                sb.append("    public void " + methodName + "() " + throwException + "{\n");

                // TODO: add parameters
                sb.append("        " + className + " " + className.toLowerCase() + " = (" + className + ") " + "TestGenerator.getObjectFromPool(\"" + className + "\");\n");
                sb.append("        " + "if (" + className.toLowerCase() + " == null) {\n");
                sb.append("            return;\n");
                sb.append("        }\n");

                StringBuilder parameterList = new StringBuilder();
                parameterList.append("(");
                for (int j = 0; j < currentArguments.size(); j++) {
                    Object o = currentArguments.get(j);
                    if(o != null){
                        String type = o.getClass().toString();
                        if(type.contains("[L") || type.contains("[I")){
                            if(type.contains("String")) {
                                parameterList.append("new String[]{");
                                for(int k = 0; k < ((String[]) o).length; k++){
                                    parameterList.append("\"" + ((String[]) o)[k] + "\"");
                                    if(k != ((String[]) o).length - 1){
                                        parameterList.append(",");
                                    }
                                }
                            }else if(type.contains("Integer") || type.contains("int") || type.contains("[I")) {
//                                System.out.println("int array");
                                parameterList.append("new int[]{");
                                for (int k = 0; k < ((int[]) o).length; k++) {
                                    parameterList.append(((int[]) o)[k]);
                                    if (k != ((int[]) o).length - 1) {
                                        parameterList.append(",");
                                    }
                                }
                            }else if(type.contains("Long") || type.contains("long")) {
                                parameterList.append("new long[]{");
                                for (int k = 0; k < ((long[]) o).length; k++) {
                                    parameterList.append(((long[]) o)[k]);
                                    if (k != ((long[]) o).length - 1) {
                                        parameterList.append(",");
                                    }
                                }
                            }else if(type.contains("boolean")) {
                                parameterList.append("new boolean[]{");
                                for (int k = 0; k < ((boolean[]) o).length; k++) {
                                    parameterList.append(((boolean[]) o)[k]);
                                    if (k != ((boolean[]) o).length - 1) {
                                        parameterList.append(",");
                                    }
                                }
                            }else if(type.contains("Character") || type.contains("char")) {
                                parameterList.append("new Character[]{");
                                for (int k = 0; k < ((Character[]) o).length; k++) {
                                    Character c = ((Character[]) o)[k];
                                    System.out.println(c);
                                    if (c == '\\') {
                                        parameterList.append("'\\\\'");
                                    }else{
                                        parameterList.append("\'" + c + "\'");
                                    }
                                    if (k != ((Character[]) o).length - 1) {
                                        parameterList.append(",");
                                    }
                                }
                            }else{
//                                System.out.println("Object array");
                                // Get object array from pool as parameter
                                parameterList.append("String type = " + type + ";");
                                parameterList.append("new Object[]{");
                                for (int k = 0; k < ((Object[]) o).length; k++) {
//                                    System.out.println(type);
                                    parameterList.append("TestGenerator.getObjectFromPool(\"type\")");
                                    if (k != ((Object[]) o).length - 1) {
                                        parameterList.append(",");
                                    }
                                }
                            }
                            parameterList.append("}");
                            if(j != currentArguments.size() - 1){
                                parameterList.append(",");
                            }
                            continue;
                        }
                    }
                    if (o instanceof String) {
                        parameterList.append("\"" + o + "\"");
                    } else if(o instanceof Character){
                        if((Character) o == '\\'){
                            parameterList.append("'\\\\'");
                        }else if ((Character) o == '\''){
                            parameterList.append("\'\\" + o + "\'");
                        } else {
                            parameterList.append("\'" + o + "\'");
                        }
                    }
                    else if (o instanceof Integer) {
                        parameterList.append(o);
                    } else if (o instanceof Long) {
                        parameterList.append(o);
                    } else if (o instanceof Boolean) {
                        parameterList.append(o);
                    } else {
                        // Get object from pool as parameter
//                        System.out.println(o.getClass());
//                        parameterList.append(o);
                        String type = parametersList.get(j);
//                        parameterList.append("String type = " + type + ";");
//                        System.out.println(type);
//                        if(o == null){
////                            System.out.println("null");
//                            parameterList.append("(" + type + ") " + "null");
//                        }else{

                        if(className.toLowerCase().contains("w3cdom")){
                            if(method.getName().toString().contains("convert")){
                                if (j == 1){
                                    type = "org.w3c.dom.Document";
                                }
                            }else{
                                type = "org.w3c.dom.Document";
                            }
                        }
                        if(method.getName().toString().contains("fromJsoup")) {
                            type = "Document";
                        }
                        parameterList.append("(" + type + ") " + "TestGenerator.getObjectFromPool(\"" + type + "\")");
//                        }
                    }
                    if(j != currentArguments.size() - 1){
                        parameterList.append(",");
                    }
                }

                parameterList.append(")");
//                sb.append("        " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");

                // get the return type of the MethodDeclaration method

                if (!Objects.equals(method.getType().toString(), "void")) {
                    String returnType = method.getType().toString();
                    if(method.getName().toString().contains("fromJsoup")){
                        sb.append("        " + returnType + " result = (Document) " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");
                    }else{
                        sb.append("        " + returnType + " result = " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");
                    }
                } else {
                    sb.append("        " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");
                }
                // add the return value from previous step
                if (!Objects.equals(method.getType().toString(), "void")) {
                    sb.append("        " + "TestGenerator.putObjectToPool(result);\n");
                }
                // o.equals(o)==true
                sb.append("        " + "assertTrue(" + className.toLowerCase() + ".equals(" + className.toLowerCase() + "));\n");
                // o.equals(o) throws no exception
                sb.append("        " + "try {\n");
                sb.append("            " + className.toLowerCase() + ".equals(" + className.toLowerCase() + ");\n");
                sb.append("        " + "} catch (Exception e) {\n");
                sb.append("            " + "fail(\""+ className.toLowerCase() + ".equals(" + className.toLowerCase() +") throws an exception\");\n");
                sb.append("        " + "}\n");
                // o.hashCode() throws no exception
                sb.append("        " + "try {\n");
                sb.append("            " + className.toLowerCase() + ".hashCode();\n");
                sb.append("        " + "} catch (Exception e) {\n");
                sb.append("            " + "fail(\""+ className.toLowerCase() + ".hashCode() throws an exception\");\n");
                sb.append("        " + "}\n");
                // o.toString() throws no exception
                sb.append("        " + "try {\n");
                sb.append("            " + className.toLowerCase() + ".toString();\n");
                sb.append("        " + "} catch (Exception e) {\n");
                sb.append("            " + "fail(\""+ className.toLowerCase() + ".toString() throws an exception\");\n");
                sb.append("        " + "}\n");

                sb.append("    }\n");
            }
        }
        sb.append("}");
    }
}