package edu.illinois.cs.analysis;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;

public class CodeGeneratorTest
{
	@Test
	public void testToyProgram() {
		// Get the code representation for the content of the toy java file
		CompilationUnit cu = StaticJavaParser.parse(
				"class X {public Object m(Object x, Object y){if(x!=null) return x; if(null==y) return \"error\"; return y; }}");

		// Instantiate the CodeGenerator class that you will implement to perform
		// the actual task. This is a visitor class according to the visitor
		// pattern (one of the most important design patterns).
		CodeGenerator codeGenerator = new CodeGenerator();

		// Apply our visitor class on the code representation for the given
		// Java file. In this way, our visit function(s) can be automatically
		// applied to all possible elements of the specified type(s).
		codeGenerator.visit(cu, null);


		// Obtain the expected method to be generated
		MethodDeclaration expected_meth = StaticJavaParser
				.parseMethodDeclaration(
						"@Override public String toString() { String str = super.toString(); int len=str.length(); if (len > 40) return \"OMITTED\"; else return str;}");
		
		// Check if the expected toString method has been correctly added to
		// class X
		MethodDeclaration actual_generated_meth=cu.getClassByName("X").get().getMethodsByName("toString").get(0);
		assertEquals(expected_meth,
				actual_generated_meth);
	}
}
