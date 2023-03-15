package edu.illinois.cs.test.generator;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import edu.illinois.cs.test.pojo.ValuePool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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

    @Override
    public void visit(MethodDeclaration n, Object arg) {
        super.visit(n, arg);

    }

    public void scanNodes(List<Node> nodes, Map<String, Object> paramterList){


    }
}
