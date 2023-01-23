package edu.illinois.cs.analysis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.SourceRoot;

public class CodeParserTest
{
	@Test
	public void testToyProgram() {
		// Get the code representation for the content of the toy java file
		CompilationUnit cu = StaticJavaParser.parse(
				"abstract class X {public void m1(){} public abstract int m2(int i); public int m3(int i){return i;} static int m4(int i){return i;}}");

		// Instantiate the CodeParser class that you will implement to perform
		// the actual task. This is a visitor class according to the visitor
		// pattern (one of the most important design patterns).
		CodeParser codeParser = new CodeParser();

		// Apply our visitor class on the code representation for the given
		// Java file. In this way, our visit function(s) can be automatically
		// applied to all possible elements of the specified type(s).
		codeParser.visit(cu, null);

		// Check if the number of returned methods is as expected
		assertEquals(1, codeParser.methNum);
		
		// Just for your reference, you can print out any elements within a
		// compilation unit
		// System.out.println(cu);
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

		// Instantiate the CodeParser class that you will implement to perform
		// the actual task. This is a visitor class according to the visitor
		// pattern (one of the most important design patterns).
		CodeParser codeParser = new CodeParser();

		// Apply our visitor class on the code representation for the given
		// Java file. In this way, our visit function(s) can be automatically
		// applied to all possible elements of the specified type(s).
		codeParser.visit(cu, null);

		// Check if the number of returned methods is as expected
		assertEquals(12, codeParser.methNum);

	}
}
