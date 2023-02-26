package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;
import edu.illinois.cs.test.pojo.ValuePool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.github.javaparser.StaticJavaParser.parse;

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

//    @Override
//    public void visit(IfStmt n, Object arg) {
//        super.visit(n, arg);
//
//        // TODO
//        // parse the code to get values add to pool
//        Expression condition = n.getCondition();
//        Set<Object> candidateValues = new HashSet<>();
//        Object[] objects = condition.stream().toArray();
//        for(Object o : objects){
//            System.out.println(o);
//            System.out.println(o.getClass().toString());
//            // Integer Type
//            if(o instanceof com.github.javaparser.ast.expr.BinaryExpr &&
//                    (((BinaryExpr) o).getLeft().isIntegerLiteralExpr() ||
//                            ((BinaryExpr) o).getRight().isIntegerLiteralExpr())){
//                BinaryExpr expr = (BinaryExpr) o;
//                int boundValue = 0;
//                if(expr.getLeft().isIntegerLiteralExpr()){
//                    String num = expr.getLeft().toString().trim();
//                    // Hexadecimal
//                    if(num.startsWith("0x")){
//                        num = num.substring(2);
//                        boundValue = Integer.parseInt(num,16);
//                    }else{
//                        boundValue = Integer.parseInt(num);
//                    }
//                }else{
//                    String num = expr.getRight().toString().trim();
//                    if(num.startsWith("0x")){
//                        num = num.substring(2);
//                        boundValue = Integer.parseInt(num,16);
//                    }else{
//                        boundValue = Integer.parseInt(num);
//                    }
//                }
//                BinaryExpr.Operator operator = expr.getOperator();
//                if(operator.equals(BinaryExpr.Operator.EQUALS)){
//                    candidateValues.add(boundValue);
//                }else if(operator.equals(BinaryExpr.Operator.LESS)){
//                    candidateValues.add(boundValue - 1);
//                }else if(operator.equals(BinaryExpr.Operator.LESS_EQUALS)){
//                    candidateValues.add(boundValue);
//                    candidateValues.add(boundValue - 1);
//                }else if(operator.equals(BinaryExpr.Operator.GREATER)){
//                    candidateValues.add(boundValue + 1);
//                }else if(operator.equals(BinaryExpr.Operator.GREATER_EQUALS)){
//                    candidateValues.add(boundValue);
//                    candidateValues.add(boundValue + 1);
//                }
//            }
//            // String Type
//            if(o instanceof com.github.javaparser.ast.expr.StringLiteralExpr){
//                String s = ((StringLiteralExpr) o).asString().trim();
//                if(s.length() != 0){
//                    char c = s.charAt(s.length() - 1);
//                    candidateValues.add(s);
//                    candidateValues.add(s.substring(0, s.length() - 1) + (char)(c + 1));
//                    candidateValues.add(s.substring(0, s.length() - 1) + (char)(c - 1));
//                }else{
//                    candidateValues.add("");
//                }
//            }
//            // Char Type
//            if(o instanceof com.github.javaparser.ast.expr.CharLiteralExpr){
//                char c = ((CharLiteralExpr) o).asChar();
//                candidateValues.add(c);
//                candidateValues.add((char)(c-1));
//                candidateValues.add((char)(c+1));
//            }
//            // Double type
//            if(o instanceof com.github.javaparser.ast.expr.BinaryExpr &&
//                    (((BinaryExpr) o).getLeft().isDoubleLiteralExpr() ||
//                            ((BinaryExpr) o).getRight().isDoubleLiteralExpr())){
//
//                BinaryExpr expr = (BinaryExpr) o;
//                double boundValue = 0;
//                if(expr.getLeft().isDoubleLiteralExpr()){
//                    boundValue = Double.parseDouble(expr.getLeft().toString().trim());
//                }else{
//                    boundValue = Double.parseDouble(expr.getRight().toString().trim());
//                }
//                BinaryExpr.Operator operator = expr.getOperator();
//                if(operator.equals(BinaryExpr.Operator.EQUALS)){
//                    candidateValues.add(boundValue);
//                }else if(operator.equals(BinaryExpr.Operator.LESS)){
//                    candidateValues.add(boundValue - 10e-16); // double precise
//                }else if(operator.equals(BinaryExpr.Operator.LESS_EQUALS)){
//                    candidateValues.add(boundValue);
//                    candidateValues.add(boundValue - 10e-16);
//                }else if(operator.equals(BinaryExpr.Operator.GREATER)){
//                    candidateValues.add(boundValue + 10e-16);
//                }else if(operator.equals(BinaryExpr.Operator.GREATER_EQUALS)){
//                    candidateValues.add(boundValue);
//                    candidateValues.add(boundValue + 10e-16);
//                }
//            }
//        }
//
//        for(Object o : candidateValues){
//            valuePool.addValue(o);
//        }
//    }


}
