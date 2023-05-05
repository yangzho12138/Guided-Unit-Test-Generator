/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import java.io.IOException;

/**
 A data node, for contents of style, script tags etc, where contents should not show in text().

 @author Jonathan Hedley, jonathan@hedley.net */
public class DataNode extends LeafNode {public static class __CLR4_4_12yb2yblh9yvghu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3846,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     Create a new DataNode.
     @param data data contents
     */
    public DataNode(String data) {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3827);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3828);value = data;
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

    /**
     Create a new DataNode.
     @param data data contents
     @param baseUri Unused, Leaf Nodes do not hold base URis
     @deprecated use {@link #DataNode(String)} instead
     */
    public DataNode(String data, String baseUri) {
        this(data);__CLR4_4_12yb2yblh9yvghu.R.inc(3830);try{__CLR4_4_12yb2yblh9yvghu.R.inc(3829);
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

    public String nodeName() {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3831);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3832);return "#data";
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

    /**
     Get the data contents of this node. Will be unescaped and with original new lines, space etc.
     @return data
     */
    public String getWholeData() {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3833);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3834);return coreValue();
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

    /**
     * Set the data contents of this node.
     * @param data unencoded data
     * @return this node, for chaining
     */
    public DataNode setWholeData(String data) {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3835);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3836);coreValue(data);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3837);return this;
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

	void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3838);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3839);accum.append(getWholeData()); // data is not escaped in return from data nodes, so " in script, style is plain
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3840);}finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3841);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3842);return outerHtml();
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}

    /**
     Create a new DataNode from HTML encoded data.
     @param encodedData encoded data
     @param baseUri bass URI
     @return new DataNode
     */
    public static DataNode createFromEncoded(String encodedData, String baseUri) {try{__CLR4_4_12yb2yblh9yvghu.R.inc(3843);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3844);String data = Entities.unescape(encodedData);
        __CLR4_4_12yb2yblh9yvghu.R.inc(3845);return new DataNode(data);
    }finally{__CLR4_4_12yb2yblh9yvghu.R.flushNeeded();}}
}
