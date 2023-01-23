package edu.illinois.cs.analysis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.IntegerLiteralExpr;
import com.github.javaparser.ast.expr.MarkerAnnotationExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.expr.SuperExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.stmt.Statement;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.printer.DotPrinter;

public class CodeGenerator extends VoidVisitorAdapter
{

	public static void main(String[] args) throws IOException {
		Statement cu = StaticJavaParser.parseStatement(
				"{String str = super.toString(); int len=str.length(); if (len > 40) return \"OMITTED\"; else return str;}");

		DotPrinter printer = new DotPrinter(true);
		try (FileWriter fileWriter = new FileWriter("ast.dot");
				PrintWriter printWriter = new PrintWriter(fileWriter)) {
			printWriter.print(printer.output(cu));
		}
	}

	@Override
	public void visit(ClassOrInterfaceDeclaration n, Object arg) {
		super.visit(n, arg);
		AnnotationExpr ann = new MarkerAnnotationExpr();
		ann.setName("Override");
		if (!n.isInterface() & !n.isAbstract()) {
			BlockStmt body = new BlockStmt();

			VariableDeclarator varDec1 = new VariableDeclarator();
			varDec1.setType("String");
			varDec1.setName("str");
			varDec1.setInitializer(
					new MethodCallExpr(new SuperExpr(), "toString"));
			VariableDeclarationExpr varExpr1 = new VariableDeclarationExpr(
					varDec1);
			ExpressionStmt varDef1 = new ExpressionStmt(varExpr1);
			body.addStatement(varDef1);

			// TODO: complete this visit function to add the specified toString
			// method to the given Java file; we have provided the partial
			// implementation to add the method with only one statement: "String
			// str = super.toString();" for your reference, and you can complete
			// the implementation to include the remaining statements here

			n.addMethod("toString", Modifier.Keyword.PUBLIC).setType("String")
					.addAnnotation(ann).setBody(body);
		}
	}
}
