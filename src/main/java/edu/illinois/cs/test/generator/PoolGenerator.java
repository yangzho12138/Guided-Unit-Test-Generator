package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.ReferenceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static com.github.javaparser.StaticJavaParser.parse;

public class PoolGenerator extends VoidVisitorAdapter {
    Set<Integer> integersPool;
    Set<String> stringsPool;
    Set<Character> charactersPool;
    Set<Long> longsPool;
    Set<Boolean> booleansPool;
    public static Set<Object> objectsPool = PoolInit.valuePool.objectsPool;

    List<MethodDeclaration> methods;
    List<ConstructorDeclaration> constructors;
    List<ClassOrInterfaceDeclaration> classes;

    // to prevent the duplicate test methods name
    Set<String> testMethodsName;


    public static Object getObjectFromPool(String type) {
        Random random = new Random();
        // find a random object in the object pool
        Iterator<Object> it = objectsPool.iterator();
        List<Object> list = new ArrayList<>(objectsPool);

        // create a set of indexes of such type
        Set<Integer> indexes = new HashSet<>();

        // add indexes of objects of such type
        for (int i = 0; i < list.size(); i++) {
            Object s = it.next();
            if (s.getClass().toString().equals(type)) {
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

    public static void putObjectToPool(Object obj) {
        if (obj.getClass().toString().equals("class java.lang.String") || obj.getClass().toString().equals("class java.lang.Integer") || obj.getClass().toString().equals("class java.lang.Character") || obj.getClass().toString().equals("class java.lang.Long") || obj.getClass().toString().equals("class java.lang.Boolean")) {
            return;
        }
        objectsPool.add(obj);
    }

    public PoolGenerator(String target) {
        integersPool = PoolInit.valuePool.integersPool;
        stringsPool = PoolInit.valuePool.stringsPool;
        charactersPool = PoolInit.valuePool.charactersPool;
        longsPool = PoolInit.valuePool.longsPool;
        booleansPool = PoolInit.valuePool.booleansPool;
//        objectsPool = PoolInit.valuePool.objectsPool;
        methods = new ArrayList<>();
        constructors = new ArrayList<>();
        classes = new ArrayList<>();
        testMethodsName = new HashSet<>();

//        argumentsList = new ArrayList<>();
        MethodTraverse(target);
        construct();

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

        if (n.isPublic()) {
            methods.add(n);
        }

        super.visit(n, arg);
    }

    @Override
    public void visit(ClassOrInterfaceDeclaration n, Object arg) {
        super.visit(n, arg);
        if (!n.isInterface() && !n.isAbstract() && n.isPublic() && !n.isInnerClass() && !n.isStatic()) {
            classes.add(n);
        }
    }

    public Map constructMap(String type) {
        type = type.substring(type.indexOf("<") + 1, type.indexOf(">"));
        String[] types = type.split(",");
        Map map = new HashMap();
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        while (randomNumber-- > 0) {
            map.put(getValueFromPool(types[0]), getValueFromPool(types[1]));
        }
        return map;
    }

    public Object getValueFromPool(String type) {
        if (type.contains("Map")) {
            return constructMap(type);
        } else if (type.contains("[]") || type.contains("List") || type.contains("Set")) {
            if (type.contains("Integer") || type.contains("int")) {
                Random random = new Random();
                int randomNumber = random.nextInt(integersPool.size());

                if (type.contains("List")) {
                    List<Integer> intList = new ArrayList<>();
                    int j = 0;
                    Iterator<Integer> it = integersPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        intList.add(it.next());
                        j++;
                    }
                    return intList;
                } else if (type.contains("Set")) {
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

                if (type.contains("List")) {
                    List<String> stringList = new ArrayList<>();
                    int j = 0;
                    Iterator<String> it = stringsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        stringList.add(it.next());
                        j++;
                    }
                    return stringList;
                } else if (type.contains("Set")) {
                    Set<String> stringSet = new HashSet<>();
                    int j = 0;
                    Iterator<String> it = stringsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        stringSet.add(it.next());
                        j++;
                    }
                    return stringSet;
                }

                if (type.contains("StringBuilder")) {
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

                if (type.contains("List")) {
                    List<Character> charList = new ArrayList<>();
                    int j = 0;
                    Iterator<Character> it = charactersPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        charList.add(it.next());
                        j++;
                    }
                    return charList;
                } else if (type.contains("Set")) {
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

                if (type.contains("List")) {
                    List<Long> longList = new ArrayList<>();
                    int j = 0;
                    Iterator<Long> it = longsPool.iterator();
                    while (it.hasNext() && j < randomNumber) {
                        longList.add(it.next());
                        j++;
                    }
                    return longList;
                } else if (type.contains("Set")) {
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
        } else if (type.contains("String")) {
            Random random = new Random();
            int index = random.nextInt(stringsPool.size());

            if (type.contains("StringBuilder")) {
                Iterator<String> it = stringsPool.iterator();
                int i = 0;
                while (it.hasNext()) {
                    String s = it.next();
                    if (i == index) {
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
        return null;
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

    public Object[] getConstructorParam(List<String> parametersTypeList) {
        Object[] arguments = new Object[parametersTypeList.size()];
        for (int i = 0; i < parametersTypeList.size(); i++) {
            String type = parametersTypeList.get(i);
            if (type.contains("[]")) {
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
                    for (int j = 0; j < randomNumber; j++) {
                        objectArray[j] = getObjectFromPool(type);
                    }
                    arguments[i] = objectArray;
                }
            } else if (type.contains("String")) {
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
        for (ClassOrInterfaceDeclaration c : classes) {
            String className = c.getNameAsString();

            List<Class<?>> clazzes = new ArrayList<>();

            try {
                ClassLoader classLoader = ClassLoader.getSystemClassLoader();
                Enumeration<URL> resources = classLoader.getResources("org/jsoup");
                while (resources.hasMoreElements()) {
                    URL resource = resources.nextElement();
                    File directory = new File(resource.getFile());
                    searchForClass(directory, className, clazzes);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (clazzes.size() != 0) {
                try {
                    // generate the constructor without arguments
                    for (Class<?> cl : clazzes) {
                        Constructor<?>[] constructors = cl.getConstructors();
                        for (Constructor<?> constructor : constructors) {
                            if (constructor.getParameterCount() == 0) {
                                Object obj = constructor.newInstance();
                                objectsPool.add(obj);
                            }
                        }
                    }

                    // generate the constructor with arguments
                    for (Class<?> cl : clazzes) {
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
}
