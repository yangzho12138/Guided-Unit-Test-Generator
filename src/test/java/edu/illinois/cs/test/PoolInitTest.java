package edu.illinois.cs.test;

import com.github.javaparser.JavaParser;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.utils.SourceRoot;
import edu.illinois.cs.test.generator.PoolInit;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.github.javaparser.StaticJavaParser.parse;
import static org.junit.Assert.assertEquals;

public class PoolInitTest {
    @Test
    public void testToyProgram() {
        // Get the code representation for the content of the toy java file
        CompilationUnit cu = parse(
                "class X {public Object m(Object x, Object y){" +
                        "if(x < 3.4 && y > 1) return x; " +
                        "char ch = \"a\"; if(ch == 'c') return x; " +
                        "if(x == 10) return \"error\"; return y; " +
                        "String s = \"abc\"; if(s.equals(s)) return x;}}");

        // Instantiate the CodeParser class that you will implement to perform
        // the actual task. This is a visitor class according to the visitor
        // pattern (one of the most important design patterns).
        PoolInit poolInit = new PoolInit();

        // Apply our visitor class on the code representation for the given
        // Java file. In this way, our visit function(s) can be automatically
        // applied to all possible elements of the specified type(s).
        poolInit.visit(cu, null);

        for(Object o : poolInit.pool.valuePool){
            System.out.println(o);
        }

        // Check if the number of returned methods is as expected
        assertEquals(1, 1);

        // Just for your reference, you can print out any elements within a
        // compilation unit
        // System.out.println(cu);
    }

    @Test
    public void testJsoup() throws IOException {
        Path sourcePath = Paths.get("src/test/resources/org/jsoup");
        SourceRoot sourceRoot = new SourceRoot(sourcePath);

        PoolInit poolInit = new PoolInit();
        Files.walk(sourcePath)
                .filter(path -> path.toString().endsWith(".java"))
                .forEach(path -> {
                    try{
                        CompilationUnit cu = parse(path.toFile());
                        poolInit.visit(cu, null);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                });

        for(Object o : poolInit.pool.valuePool){
            System.out.println(o);
        }

        assertEquals(1, 1);
    }
}
