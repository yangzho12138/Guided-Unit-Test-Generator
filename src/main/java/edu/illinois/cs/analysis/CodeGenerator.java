package edu.illinois.cs.analysis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
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
			VariableDeclarator varDec2 = new VariableDeclarator();
			varDec2.setType("int");
			varDec2.setName("len");
			varDec2.setInitializer(new MethodCallExpr(varDec1.getNameAsExpression(), "length"));
			VariableDeclarationExpr varExpr2 = new VariableDeclarationExpr(varDec2);
			ExpressionStmt varDef2 = new ExpressionStmt(varExpr2);
			body.addStatement(varDef2);

			IfStmt ifStmt = new IfStmt();

			BinaryExpr binaryExpr = new BinaryExpr();
			binaryExpr.setLeft(new NameExpr(varDec2.getName()));
			binaryExpr.setOperator(BinaryExpr.Operator.GREATER);
			binaryExpr.setRight(new IntegerLiteralExpr(40));
			ifStmt.setCondition(binaryExpr);

			ReturnStmt returnStmt1 = new ReturnStmt();
			returnStmt1.setExpression(new StringLiteralExpr("OMITTED"));
			ifStmt.setThenStmt(returnStmt1);

			ReturnStmt returnStmt2 = new ReturnStmt();
			returnStmt2.setExpression(new NameExpr(varDec1.getName()));
			ifStmt.setElseStmt(returnStmt2);

			body.addStatement(ifStmt);


			n.addMethod("toString", Modifier.Keyword.PUBLIC).setType("String")
					.addAnnotation(ann).setBody(body);
		}
	}
}
