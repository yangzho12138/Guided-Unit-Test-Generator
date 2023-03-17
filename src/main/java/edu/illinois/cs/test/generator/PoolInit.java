package edu.illinois.cs.test.generator;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
<<<<<<< HEAD
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.CharLiteralExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.IfStmt;
=======
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.type.PrimitiveType;
>>>>>>> 0c7da65617dd5b8d4042999c2195f106932e24dd
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import edu.illinois.cs.test.pojo.ValuePool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
=======
import java.util.*;
>>>>>>> 0c7da65617dd5b8d4042999c2195f106932e24dd

import static com.github.javaparser.StaticJavaParser.parse;
import static com.github.javaparser.StaticJavaParser.parseExpression;

// scan the target resources to generate the primitive value pool
public class PoolInit extends VoidVisitorAdapter {
    static public ValuePool valuePool;

    public PoolInit(String target){
        this.valuePool = new ValuePool();
        valuePool.addValue(null);
        valuePool.addValue(true);
        valuePool.addValue(false);

        preParse(target);
    }


    public void preParse(String target){
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

<<<<<<< HEAD
//    @Override
//    public void visit(MethodDeclaration n, Object arg) {
//        super.visit(n, arg);
//
//        System.out.println(n);


    @Override
    public void visit(IfStmt n, Object arg) {
        super.visit(n, arg);

//        System.out.println(arg);
        // TODO
        // parse the code to get values add to pool
        Expression condition = n.getCondition();
        Set<Object> candidateValues = new HashSet<>();
        Object[] objects = condition.stream().toArray();
        for(Object o : objects){
//            System.out.println(o);
//            System.out.println(o.getClass().toString());
            // Integer Type
            if(o instanceof com.github.javaparser.ast.expr.BinaryExpr &&
                    (((BinaryExpr) o).getLeft().isIntegerLiteralExpr() ||
                            ((BinaryExpr) o).getRight().isIntegerLiteralExpr())){
                BinaryExpr expr = (BinaryExpr) o;
                int boundValue = 0;
                if(expr.getLeft().isIntegerLiteralExpr()){
                    String num = expr.getLeft().toString().trim();
                    // Hexadecimal
                    if(num.startsWith("0x")){
                        num = num.substring(2);
                        boundValue = Integer.parseInt(num,16);
                    }else{
                        boundValue = Integer.parseInt(num);
                    }
                }else{
                    String num = expr.getRight().toString().trim();
                    if(num.startsWith("0x")){
                        num = num.substring(2);
                        boundValue = Integer.parseInt(num,16);
                    }else{
                        boundValue = Integer.parseInt(num);
                    }
                }
                BinaryExpr.Operator operator = expr.getOperator();
                if(operator.equals(BinaryExpr.Operator.EQUALS)){
                    candidateValues.add(boundValue);
                }else if(operator.equals(BinaryExpr.Operator.LESS)){
                    candidateValues.add(boundValue - 1);
                }else if(operator.equals(BinaryExpr.Operator.LESS_EQUALS)){
                    candidateValues.add(boundValue);
                    candidateValues.add(boundValue - 1);
                }else if(operator.equals(BinaryExpr.Operator.GREATER)){
                    candidateValues.add(boundValue + 1);
                }else if(operator.equals(BinaryExpr.Operator.GREATER_EQUALS)){
                    candidateValues.add(boundValue);
                    candidateValues.add(boundValue + 1);
                }
            }
            // String Type
            if(o instanceof com.github.javaparser.ast.expr.StringLiteralExpr){
                String s = ((StringLiteralExpr) o).asString().trim();
                if(s.length() != 0){
                    char c = s.charAt(s.length() - 1);
                    candidateValues.add(s);
                    candidateValues.add(s.substring(0, s.length() - 1) + (char)(c + 1));
                    candidateValues.add(s.substring(0, s.length() - 1) + (char)(c - 1));
                }else{
                    candidateValues.add("");
                }
            }
            // Char Type
            if(o instanceof com.github.javaparser.ast.expr.CharLiteralExpr){
                char c = ((CharLiteralExpr) o).asChar();
                candidateValues.add(c);
                candidateValues.add((char)(c-1));
                candidateValues.add((char)(c+1));
            }
            // Double type
            if(o instanceof com.github.javaparser.ast.expr.BinaryExpr &&
                    (((BinaryExpr) o).getLeft().isDoubleLiteralExpr() ||
                            ((BinaryExpr) o).getRight().isDoubleLiteralExpr())){
=======
    @Override
    public void visit(MethodDeclaration n, Object arg) {
        super.visit(n, arg);
        NodeList<Parameter> parameters = n.getParameters();

        Map<String, Object> parameterList = new HashMap<>();
        for(Parameter p : parameters){
            String type = p.getType().toString();
            if("String".equals(type) || "int".equals(type) || "long".equals(type) || "short".equals(type) || "double".equals(type) || "float".equals(type)){
                if("int".equals(type)) {
                    parameterList.put(p.getName().toString(), 0);
                }else if("String".equals(type)){
                    parameterList.put(p.getName().toString(), "");
                }else if("long".equals(type)){
                    parameterList.put(p.getName().toString(), 0L);
                }
            }
        }

        Optional<BlockStmt> op = n.getBody();
        if(op.isPresent()){
            BlockStmt body = n.getBody().get();
            scanNodes(body.getChildNodes(), parameterList);
        }
    }

    public void scanNodes(List<Node> nodes, Map<String, Object> paramterList){
>>>>>>> 0c7da65617dd5b8d4042999c2195f106932e24dd

                BinaryExpr expr = (BinaryExpr) o;
                double boundValue = 0;
                if(expr.getLeft().isDoubleLiteralExpr()){
                    boundValue = Double.parseDouble(expr.getLeft().toString().trim());
                }else{
                    boundValue = Double.parseDouble(expr.getRight().toString().trim());
                }
                BinaryExpr.Operator operator = expr.getOperator();
                if(operator.equals(BinaryExpr.Operator.EQUALS)){
                    candidateValues.add(boundValue);
                }else if(operator.equals(BinaryExpr.Operator.LESS)){
                    candidateValues.add(boundValue - 10e-16); // double precise
                }else if(operator.equals(BinaryExpr.Operator.LESS_EQUALS)){
                    candidateValues.add(boundValue);
                    candidateValues.add(boundValue - 10e-16);
                }else if(operator.equals(BinaryExpr.Operator.GREATER)){
                    candidateValues.add(boundValue + 10e-16);
                }else if(operator.equals(BinaryExpr.Operator.GREATER_EQUALS)){
                    candidateValues.add(boundValue);
                    candidateValues.add(boundValue + 10e-16);
                }
            }
        }

<<<<<<< HEAD
        for(Object o : candidateValues){
            valuePool.addValue(o);
        }
    }

}
=======
    }
}
>>>>>>> 0c7da65617dd5b8d4042999c2195f106932e24dd
