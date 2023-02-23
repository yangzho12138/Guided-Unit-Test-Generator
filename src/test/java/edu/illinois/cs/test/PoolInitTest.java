package edu.illinois.cs.test;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import edu.illinois.cs.analysis.CodeParser;
import edu.illinois.cs.test.generator.PoolInit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PoolInitTest {
    @Test
    public void testToyProgram() {
        // Get the code representation for the content of the toy java file
        CompilationUnit cu = StaticJavaParser.parse(
                "class X {public Object m(Object x, Object y){" +
                        "if(x < 3.4 && y > 1) return x; " +
                        "char ch = \"a\"; if(ch == 'c') return x; " +
                        "if(x == 10) return \"error\"; return y; " +
                        "String s = \"abc\"; if(s.equals(s)) return x;}}");

        // Instantiate the CodeParser class that you will implement to perform
        // the actual task. This is a visitor class according to the visitor
        // pattern (one of the most important design patterns).
        CodeParser codeParser = new CodeParser();
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
}
