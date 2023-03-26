package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
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

    public TestGenerator(String target) {
        integersPool = PoolInit.valuePool.integersPool;
        stringsPool = PoolInit.valuePool.stringsPool;
        charactersPool = PoolInit.valuePool.charactersPool;
        longsPool = PoolInit.valuePool.longsPool;
        booleansPool = PoolInit.valuePool.booleansPool;
        objectsPool = PoolInit.valuePool.objectsPool;
        methods = new ArrayList<>();
        constructors = new ArrayList<>();
        MethodTraverse(target);
//        for (ConstructorDeclaration cd: constructors) {
//            System.out.println("==============");
//            System.out.println(cd.toString());
//        }
        try{
            construct();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public void MethodTraverse(String target){
        Path sourcePath = Paths.get(target);
        SourceRoot sourceRoot = new SourceRoot(sourcePath);

        try{
            Files.walk(sourcePath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        try{
                            CompilationUnit cu = parse(path.toFile());
                            visit(cu, null);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void visit(MethodDeclaration n, Object arg) {
        super.visit(n, arg);

        methods.add(n);

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

    @Override
    public void visit(ConstructorDeclaration n, Object arg) {
        super.visit(n, arg);

        constructors.add(n);
    }

    public void invokeMethod(List<String> parametersList, int i, MethodDeclaration n, int argumentLength, List<Object> arguments) {
        if (i == argumentLength) {
            // get class object and method
            System.out.println(arguments);
            return;
//            Class<? extends MethodDeclaration> NClass = n.getClass();
//            String methodName = String.valueOf(n.getName());
//            try {
//                Object classObject = NClass.newInstance();
//                Method methodCall = classObject.getClass().getMethod(methodName);
//
//                Object[] argumentsArray = arguments.toArray();
//                methodCall.invoke(classObject, argumentsArray);
//            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
//                     NoSuchMethodException e) {
//                throw new RuntimeException(e);
//            }
        }
        String currentParameter = parametersList.get(i);
        if (currentParameter.equals("String")) {
            for (String stringValueFromPool : stringsPool) {
                arguments.add(stringValueFromPool);
                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
                arguments.remove(stringValueFromPool);
            }
        }
        else if (currentParameter.equals("int")) {
            for (int intValueFromPool: integersPool) {
                arguments.add(intValueFromPool);
                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
                arguments.remove((Object) intValueFromPool);
            }
        }
        else if (currentParameter.equals("Character")) {
            for (Character charValueFromPool: charactersPool) {
                arguments.add(charValueFromPool);
                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
                arguments.remove(charValueFromPool);
            }
        }
        else if (currentParameter.equals("long")) {
            for (Long longValueFromPool: longsPool) {
                arguments.add(longValueFromPool);
                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
                arguments.remove(longValueFromPool);
            }
        }
        else if (currentParameter.equals("boolean")) {
            for (boolean boolValueFromPool: booleansPool) {
                arguments.add(boolValueFromPool);
                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
                arguments.remove(boolValueFromPool);
            }
        }
        else {
            for (Object objectValueFromPool: objectsPool) {
                if (currentParameter.equals(objectValueFromPool.getClass().toString())) {
                    arguments.add(objectValueFromPool);
                    invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
                    arguments.remove(objectValueFromPool);
                }
            }
        }
    }

    public void generateTestFile(){

    }

    public void construct() throws ClassNotFoundException, NoSuchMethodException {
        for(ConstructorDeclaration cd : constructors) {
            // 创建constructor -> 加入pool -> 生成test

            if (cd.isPrivate()) {
                continue;
            }
            // get the parameters of the constructor
            NodeList<Parameter> parameters = cd.getParameters();
            for (Parameter p: parameters) {
                System.out.println(p.getType());
            }
            System.out.println(parameters);

            // get the name of the constructor and find its class
            String constructorName = cd.getNameAsString();
            System.out.println(constructorName);
            ClassOrInterfaceDeclaration classDeclaration = cd.findAncestor(ClassOrInterfaceDeclaration.class).get();
            String className = classDeclaration.getFullyQualifiedName().get();
            System.out.println(className);
            // get the class object
            Class<?> classObject = Class.forName(className);


            // invoke the constructor


//            System.out.println(constructor);

            System.out.println("==============");
        }

    }

    public void generateTest(){
        Random rand = new Random();
        int randomInt = rand.nextInt(methods.size());
        // pick a method randomly
        MethodDeclaration method = methods.get(randomInt);

        // find parameter types
        NodeList<Parameter> parameters = method.getParameters();
        List<String> parametersList = new ArrayList<>();
        for (Parameter p: parameters) {
            parametersList.add(p.getType().toString());
        }
        System.out.println(parametersList);

        // create arguments from value pools
        List<Object> arguments = new ArrayList<Object>();
        int argumentLength = parameters.size();
        invokeMethod(parametersList, 0, method, argumentLength, arguments);

        // 根据方法所在的类，去constructor list中找到对应的实体，调用该函数，生成test

    }

}
