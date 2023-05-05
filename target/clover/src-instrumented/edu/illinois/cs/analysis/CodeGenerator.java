/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package edu.illinois.cs.analysis;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.*;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.printer.DotPrinter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator extends VoidVisitorAdapter
{public static class __CLR4_4_100lh9yvg4u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,43,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public static void main(String[] args) throws IOException {try{__CLR4_4_100lh9yvg4u.R.inc(0);
		__CLR4_4_100lh9yvg4u.R.inc(1);Statement cu = StaticJavaParser.parseStatement(
				"{String str = super.toString(); int len=str.length(); if (len > 40) return \"OMITTED\"; else return str;}");

		__CLR4_4_100lh9yvg4u.R.inc(2);DotPrinter printer = new DotPrinter(true);
		class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_100lh9yvg4u.R.inc(3);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_100lh9yvg4u.R.inc(4);}};FileWriter fileWriter = new FileWriter("ast.dot");
				__CLR4_4_1$AC0 __CLR$ACI1=new __CLR4_4_1$AC0(){{__CLR4_4_100lh9yvg4u.R.inc(5);}};PrintWriter printWriter = new PrintWriter(fileWriter)) {
			__CLR4_4_100lh9yvg4u.R.inc(6);printWriter.print(printer.output(cu));
		}
	}finally{__CLR4_4_100lh9yvg4u.R.flushNeeded();}}

	@Override
	public void visit(ClassOrInterfaceDeclaration n, Object arg) {try{__CLR4_4_100lh9yvg4u.R.inc(7);
		__CLR4_4_100lh9yvg4u.R.inc(8);super.visit(n, arg);
		__CLR4_4_100lh9yvg4u.R.inc(9);AnnotationExpr ann = new MarkerAnnotationExpr();
		__CLR4_4_100lh9yvg4u.R.inc(10);ann.setName("Override");
		__CLR4_4_100lh9yvg4u.R.inc(11);if ((((!n.isInterface() & !n.isAbstract())&&(__CLR4_4_100lh9yvg4u.R.iget(12)!=0|true))||(__CLR4_4_100lh9yvg4u.R.iget(13)==0&false))) {{
			__CLR4_4_100lh9yvg4u.R.inc(14);BlockStmt body = new BlockStmt();

			__CLR4_4_100lh9yvg4u.R.inc(15);VariableDeclarator varDec1 = new VariableDeclarator();
			__CLR4_4_100lh9yvg4u.R.inc(16);varDec1.setType("String");
			__CLR4_4_100lh9yvg4u.R.inc(17);varDec1.setName("str");
			__CLR4_4_100lh9yvg4u.R.inc(18);varDec1.setInitializer(
					new MethodCallExpr(new SuperExpr(), "toString"));
			__CLR4_4_100lh9yvg4u.R.inc(19);VariableDeclarationExpr varExpr1 = new VariableDeclarationExpr(
					varDec1);
			__CLR4_4_100lh9yvg4u.R.inc(20);ExpressionStmt varDef1 = new ExpressionStmt(varExpr1);
			__CLR4_4_100lh9yvg4u.R.inc(21);body.addStatement(varDef1);

			// TODO: complete this visit function to add the specified toString
			// method to the given Java file; we have provided the partial
			// implementation to add the method with only one statement: "String
			// str = super.toString();" for your reference, and you can complete
			// the implementation to include the remaining statements here
			__CLR4_4_100lh9yvg4u.R.inc(22);VariableDeclarator varDec2 = new VariableDeclarator();
			__CLR4_4_100lh9yvg4u.R.inc(23);varDec2.setType("int");
			__CLR4_4_100lh9yvg4u.R.inc(24);varDec2.setName("len");
			__CLR4_4_100lh9yvg4u.R.inc(25);varDec2.setInitializer(new MethodCallExpr(varDec1.getNameAsExpression(), "length"));
			__CLR4_4_100lh9yvg4u.R.inc(26);VariableDeclarationExpr varExpr2 = new VariableDeclarationExpr(varDec2);
			__CLR4_4_100lh9yvg4u.R.inc(27);ExpressionStmt varDef2 = new ExpressionStmt(varExpr2);
			__CLR4_4_100lh9yvg4u.R.inc(28);body.addStatement(varDef2);

			__CLR4_4_100lh9yvg4u.R.inc(29);IfStmt ifStmt = new IfStmt();

			__CLR4_4_100lh9yvg4u.R.inc(30);BinaryExpr binaryExpr = new BinaryExpr();
			__CLR4_4_100lh9yvg4u.R.inc(31);binaryExpr.setLeft(new NameExpr(varDec2.getName()));
			__CLR4_4_100lh9yvg4u.R.inc(32);binaryExpr.setOperator(BinaryExpr.Operator.GREATER);
			__CLR4_4_100lh9yvg4u.R.inc(33);binaryExpr.setRight(new IntegerLiteralExpr(40));
			__CLR4_4_100lh9yvg4u.R.inc(34);ifStmt.setCondition(binaryExpr);

			__CLR4_4_100lh9yvg4u.R.inc(35);ReturnStmt returnStmt1 = new ReturnStmt();
			__CLR4_4_100lh9yvg4u.R.inc(36);returnStmt1.setExpression(new StringLiteralExpr("OMITTED"));
			__CLR4_4_100lh9yvg4u.R.inc(37);ifStmt.setThenStmt(returnStmt1);

			__CLR4_4_100lh9yvg4u.R.inc(38);ReturnStmt returnStmt2 = new ReturnStmt();
			__CLR4_4_100lh9yvg4u.R.inc(39);returnStmt2.setExpression(new NameExpr(varDec1.getName()));
			__CLR4_4_100lh9yvg4u.R.inc(40);ifStmt.setElseStmt(returnStmt2);

			__CLR4_4_100lh9yvg4u.R.inc(41);body.addStatement(ifStmt);


			__CLR4_4_100lh9yvg4u.R.inc(42);n.addMethod("toString", Modifier.Keyword.PUBLIC).setType("String")
					.addAnnotation(ann).setBody(body);
		}
	}}finally{__CLR4_4_100lh9yvg4u.R.flushNeeded();}}
}
