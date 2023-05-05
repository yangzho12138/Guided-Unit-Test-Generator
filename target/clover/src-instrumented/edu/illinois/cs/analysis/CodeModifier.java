/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package edu.illinois.cs.analysis;

import com.github.javaparser.ast.comments.BlockComment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class CodeModifier extends VoidVisitorAdapter
{public static class __CLR4_4_11717lh9yvg53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,58,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * This visit function will be automatically applied to all binary
	 * expressions in the given Java file
	 */
	@Override
	public void visit(BinaryExpr n, Object arg) {try{__CLR4_4_11717lh9yvg53.R.inc(43);
		__CLR4_4_11717lh9yvg53.R.inc(44);super.visit(n, arg);
		// TODO: complete this visit function to automatically switch the two
		// operands for all null checks specified in the homework assignment
		__CLR4_4_11717lh9yvg53.R.inc(45);Expression left = n.getLeft();
		__CLR4_4_11717lh9yvg53.R.inc(46);Expression right = n.getRight();
		__CLR4_4_11717lh9yvg53.R.inc(47);if(((("null".equals(left.toString()) || "null".equals(right.toString()))&&(__CLR4_4_11717lh9yvg53.R.iget(48)!=0|true))||(__CLR4_4_11717lh9yvg53.R.iget(49)==0&false))){{
			__CLR4_4_11717lh9yvg53.R.inc(50);n.setLeft(right);
			__CLR4_4_11717lh9yvg53.R.inc(51);n.setRight(left);
		}
	}}finally{__CLR4_4_11717lh9yvg53.R.flushNeeded();}}

	// The following three visit functions are used to remove all comments to
	// facilicate the comparison with the expected version; please do not change
	@Override
	public void visit(LineComment n, Object arg) {try{__CLR4_4_11717lh9yvg53.R.inc(52);
		__CLR4_4_11717lh9yvg53.R.inc(53);n.remove();
	}finally{__CLR4_4_11717lh9yvg53.R.flushNeeded();}}

	@Override
	public void visit(BlockComment n, Object arg) {try{__CLR4_4_11717lh9yvg53.R.inc(54);
		__CLR4_4_11717lh9yvg53.R.inc(55);n.remove();
	}finally{__CLR4_4_11717lh9yvg53.R.flushNeeded();}}

	@Override
	public void visit(JavadocComment n, Object arg) {try{__CLR4_4_11717lh9yvg53.R.inc(56);
		__CLR4_4_11717lh9yvg53.R.inc(57);n.remove();
	}finally{__CLR4_4_11717lh9yvg53.R.flushNeeded();}}

}
