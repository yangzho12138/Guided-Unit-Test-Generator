package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static com.github.javaparser.StaticJavaParser.parse;
import static com.github.javaparser.StaticJavaParser.parseExplicitConstructorInvocationStmt;

public class TestGenerator extends VoidVisitorAdapter {

    Set<Integer> integersPool;
    Set<String> stringsPool;
    Set<Character> charactersPool;
    Set<Long> longsPool;
    Set<Boolean> booleansPool;
    Set<Object> objectsPool;
    public TestGenerator(String target) {
        integersPool = PoolInit.valuePool.integersPool;
        stringsPool = PoolInit.valuePool.stringsPool;
        charactersPool = PoolInit.valuePool.charactersPool;
        longsPool = PoolInit.valuePool.longsPool;
        booleansPool = PoolInit.valuePool.booleansPool;
        objectsPool = PoolInit.valuePool.objectsPool;
        MethodTraverse(target);
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

//        for (Parameter p: n.getParameters()) {
//            System.out.println(p);
//        }
//        for (int i: this.integers) {
//            System.out.println(i);
//        }
//        System.out.println(this.integersPool.size());

        // find parameter types
        NodeList<Parameter> parameters = n.getParameters();
        List<String> parametersList = new ArrayList<String>();
        for (Parameter p: parameters) {
            parametersList.add(p.getType().toString());
        }
        System.out.println(parametersList);
//        System.out.println("+++++++++++++");

        // create arguments from value pools
//        Object[] arguments = new Object[parameters.size()];
        List<Object> arguments = new ArrayList<Object>();
        int argumentLength = parameters.size();
        invokeMethod(parametersList, 0, n, argumentLength, arguments);

        System.out.println("-----------");
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

}
