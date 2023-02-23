package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.CharLiteralExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import edu.illinois.cs.test.ValuePool;

import java.util.*;

// scan the target resources to generate the primitive value pool
public class PoolInit extends VoidVisitorAdapter {
    public ValuePool pool;

    public PoolInit(){
        this.pool = new ValuePool();
        pool.addValue(null);
        pool.addValue(true);
        pool.addValue(false);
    }

    @Override
    public void visit(IfStmt n, Object arg) {
        super.visit(n, arg);

        // TODO
        // parse the code to get values add to pool
        Expression condition = n.getCondition();
        Set<Object> candidateValues = new HashSet<>();
        Object[] objects = condition.stream().toArray();
        for(Object o : objects){
            System.out.println(o);
            System.out.println(o.getClass().toString());
            // Integer Type
            if(o instanceof com.github.javaparser.ast.expr.BinaryExpr &&
                    (((BinaryExpr) o).getLeft().isIntegerLiteralExpr() ||
                            ((BinaryExpr) o).getRight().isIntegerLiteralExpr())){

                BinaryExpr expr = (BinaryExpr) o;
                int boundValue = 0;
                if(expr.getLeft().isIntegerLiteralExpr()){
                    boundValue = Integer.parseInt(expr.getLeft().toString());
                }else{
                    boundValue = Integer.parseInt(expr.getRight().toString());
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
                String s = ((StringLiteralExpr) o).asString();
                char c = s.charAt(s.length() - 1);
                candidateValues.add(s);
                candidateValues.add(s.substring(0, s.length() - 1) + (char)(c + 1));
                candidateValues.add(s.substring(0, s.length() - 1) + (char)(c - 1));
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

                BinaryExpr expr = (BinaryExpr) o;
                double boundValue = 0;
                if(expr.getLeft().isDoubleLiteralExpr()){
                    boundValue = Double.parseDouble(expr.getLeft().toString());
                }else{
                    boundValue = Double.parseDouble(expr.getRight().toString());
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

        for(Object o : candidateValues){
            pool.addValue(o);
        }
    }

}
