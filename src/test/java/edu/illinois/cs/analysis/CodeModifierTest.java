package edu.illinois.cs.analysis;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.Test;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.resolution.TypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.SourceRoot;

public class CodeModifierTest
{
	@Test
	public void testToyProgram() {
		// Get the code representation for the content of the toy java file
		CompilationUnit cu = StaticJavaParser.parse(
				"class X {public Object m(Object x, Object y){if(x!=null) return x; if(null==y) return \"error\"; return y; }}");

		// Instantiate the CodeModifier class that you will implement to perform
		// the actual task. This is a visitor class according to the visitor
		// pattern (one of the most important design patterns).
		CodeModifier codeModifier = new CodeModifier();

		// Apply our visitor class on the code representation for the given
		// Java file. In this way, our visit function(s) can be automatically
		// applied to all possible elements of the specified type(s).
		codeModifier.visit(cu, null);

		// Check if the modified cu is as expected, i.e., equivalent to the
		// expected_cu defined below
		CompilationUnit expected_cu = StaticJavaParser.parse(
				"class X {public Object m(Object x, Object y){if(null!=x) return x; if(y==null) return \"error\"; return y; }}");
		assertEquals(expected_cu, cu);
	}

	@Test
	public void testJsoup() {
		// Initialize the source root as the "target/test-classes" dir, which
		// includes the test resource information (i.e., the source code info
		// for Jsoup for this assignment) copied from src/test/resources
		// during test execution
		SourceRoot sourceRoot = new SourceRoot(
				CodeGenerationUtils.mavenModuleRoot(CodeParserTest.class)
						.resolve("target/test-classes"));

		// Get the code representation for the specific java file using its
		// package and name info
		CompilationUnit cu = sourceRoot.parse("org.jsoup.nodes",
				"Document.java");

		// Instantiate the CodeModifier class that you will implement to perform
		// the actual task. This is a visitor class according to the visitor
		// pattern (one of the most important design patterns).
		CodeModifier codeModifier = new CodeModifier();

		// Apply our visitor class on the code representation for the given
		// Java file. In this way, our visit function(s) can be automatically
		// applied to all possible elements of the specified type(s).
		codeModifier.visit(cu, null);

		// Check if the modified cu is as expected, i.e., equivalent to the
		// expected_cu defined below		
		CompilationUnit expected_cu = sourceRoot.parse("org.jsoup.nodes",
				"Document-Modified.java");
		assertEquals(expected_cu, cu);		
	}

}
