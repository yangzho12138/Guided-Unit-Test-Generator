package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.beans.Expression;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static com.github.javaparser.StaticJavaParser.parse;

public class TestGenerator extends VoidVisitorAdapter {

    Set<Integer> integersPool;
    Set<String> stringsPool;
    Set<Character> charactersPool;
    Set<Long> longsPool;
    Set<Boolean> booleansPool;
    Set<Object> objectsPool;

    List<MethodDeclaration> methods;
    List<ConstructorDeclaration> constructors;
//    List<List<Object>> argumentsList;

    StringBuilder sb;

    public TestGenerator(String target) {
        integersPool = PoolInit.valuePool.integersPool;
        stringsPool = PoolInit.valuePool.stringsPool;
        charactersPool = PoolInit.valuePool.charactersPool;
        longsPool = PoolInit.valuePool.longsPool;
        booleansPool = PoolInit.valuePool.booleansPool;
        objectsPool = PoolInit.valuePool.objectsPool;
        methods = new ArrayList<>();
        constructors = new ArrayList<>();
//        argumentsList = new ArrayList<>();
        MethodTraverse(target);
        sb = new StringBuilder();
        sb.append("package " + "edu.illinois.cs.test" + ";\n");
        sb.append("import org.junit.Test;\n");
        sb.append("import static org.junit.Assert.*;\n");
        sb.append("import org.jsoup.nodes.*;\n");
        sb.append("public class " + "AutomatedTest" + " {\n");

        generateTest();
        generateTestFile();
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

//        for (Parameter p: n.getParameters()) {
//            System.out.println(p);
//        }
//        for (int i: this.integers) {
//            System.out.println(i);
//        }
//        System.out.println(this.integersPool.size());
//
//        // find parameter types
//        NodeList<Parameter> parameters = n.getParameters();
//        List<String> parametersList = new ArrayList<String>();
//        for (Parameter p: parameters) {
//            parametersList.add(p.getType().toString());
//        }
//        System.out.println(parametersList);
////        System.out.println("+++++++++++++");
//
//        // create arguments from value pools
////        Object[] arguments = new Object[parameters.size()];
//        List<Object> arguments = new ArrayList<Object>();
//        int argumentLength = parameters.size();
//        invokeMethod(parametersList, 0, n, argumentLength, arguments);
//
//        System.out.println("-----------");
    }

//    @Override
//    public void visit(ClassOrInterfaceDeclaration n, Object arg) {
//        // This method is called for every class or interface declaration
//        // Do nothing here to avoid visiting the anonymous inner class
//    }

    @Override
    public void visit(ConstructorDeclaration n, Object arg) {
        super.visit(n, arg);

    }

    public Object getValueFromPool(String type) {
        if (type.equals("String")) {
            Random random = new Random();
            int index = random.nextInt(stringsPool.size());

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
        } else if (type.equals("Integer") || type.equals("int")) {
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
        } else if (type.equals("Character") || type.equals("char")) {
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
        } else if (type.equals("Long") || type.equals("long")) {
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
        } else if (type.equals("boolean")) {
            Random random = new Random();
            int index = random.nextInt(1);

            return index == 0;
        } else if (type.contains("[]")) {
            if (type.equals("Integer") || type.contains("int")) {
                Random random = new Random();
                int randomNumber = random.nextInt(integersPool.size());
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
                String[] stringArray = new String[randomNumber];
                int j = 0;
                Iterator<String> it = stringsPool.iterator();
                while (it.hasNext() && j < randomNumber) {
                    stringArray[j] = it.next();
                    j++;
                }
                return stringArray;
            } else if (type.contains("Character") || type.contains("char")){
                Random random = new Random();
                int randomNumber = random.nextInt(charactersPool.size());
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
            } else {
                Random random = new Random();
                int randomNumber = random.nextInt(objectsPool.size());
                Object[] objectArray = new Object[randomNumber];
                int j = 0;
                Iterator<Object> it = objectsPool.iterator();
                while (it.hasNext() && j < randomNumber) {
                    objectArray[j] = it.next();
                    j++;
                }
                return objectArray;
            }
        } else {
            Random random = new Random();
            int index = random.nextInt(objectsPool.size());

            // find a random object in the object pool
            Iterator<Object> it = objectsPool.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object s = it.next();
                if (i == index) {
                    return s;
                }
                i++;
            }
        }
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

//    public void construct() {
//        for (ConstructorDeclaration cd : constructors) {
//            // 创建constructor -> 加入pool -> 生成test
//        }
//    }

    public void generateTest() {
        for (MethodDeclaration method : methods) {
            if("Optional.empty".equals(method.findAncestor(ClassOrInterfaceDeclaration.class).toString())){
                continue;
            }
            if(method.findAncestor(ClassOrInterfaceDeclaration.class).get().isPrivate() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isProtected() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isStatic() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isAbstract() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isInterface()){
                continue;
            }
            String className = method.findAncestor(ClassOrInterfaceDeclaration.class).get().getNameAsString();

            // TODO: delete after successfully generating constructor
            if(className.equals("Element") || className.equals("Document") || className.equals("CDataNode")){
                continue;
            }

            System.out.println(method.getName().asString());

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
                        Object o = getValueFromPool(type);
                        arguments.add(o);
                    }
                }
                argumentsList.add(arguments);
            }

            // create arguments from value pools
//            List<Object> arguments = new ArrayList<>();
//            int argumentLength = parameters.size();
//            argumentsList.clear();
//            invokeMethod(parametersList, 0, method, argumentLength, arguments);

            // 根据方法所在的类，去constructor list中找到对应的实体，调用该函数，生成test
            // TODO: Object can not be put into the code directly!!!
            for (int i = 0; i < argumentsList.size(); i++) {
                // get the parameter list
                List<Object> currentArguments = argumentsList.get(i);

                sb.append("    @Test\n");
                sb.append("    public void test" + className + method.getName() + Math.abs(currentArguments.hashCode()) + i + "() {\n");
                sb.append("        " + className + " " + className.toLowerCase() + " = new " + className + "();\n");

                StringBuilder parameterList = new StringBuilder();
                parameterList.append("(");
                for (int j = 0; j < currentArguments.size(); j++) {
                    Object o = currentArguments.get(j);
                    if(o != null){
                        String type = o.getClass().toString();
                        if(method.getName().toString().equals("codepointsForName")){
                            System.out.println(type);
                        }
                        if(type.contains("[L") || type.contains("[I") || type.contains("[J") || type.contains("[Z") || type.contains("[C")){
                            if(type.contains("String")) {
                                parameterList.append("new String[]{");
                                for(int k = 0; k < ((String[]) o).length; k++){
                                    parameterList.append("\"" + ((String[]) o)[k] + "\"");
                                    if(k != ((String[]) o).length - 1){
                                        parameterList.append(",");
                                    }
                                }
                            }else if(type.contains("Integer") || type.contains("int")) {
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
                                    if (c == '\\') {
                                        parameterList.append("'\\\\'");
                                    }else{
                                        parameterList.append("'" + c + "'");
                                    }
                                    if (k != ((Character[]) o).length - 1) {
                                        parameterList.append(",");
                                    }
                                }
                            }else{
                                parameterList.append("new Object[]{");
                                for (int k = 0; k < ((Object[]) o).length; k++) {
                                    parameterList.append(((Object[]) o)[k]);
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
                    } else {
                        parameterList.append(o);
                    }
                    if(j != currentArguments.size() - 1){
                        parameterList.append(",");
                    }
                }
                parameterList.append(")");
                sb.append("        " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");
                sb.append("        " + "assertTrue(" + className.toLowerCase() + ".equals(" + className.toLowerCase() + "));\n");

                sb.append("    }\n");
            }
        }
        sb.append("}");
    }
}
