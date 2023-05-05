/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.util.Collections;
import java.util.List;

public abstract class LeafNode extends Node {public static class __CLR4_4_13xb3xblh9yvglc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,5142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final List<Node> EmptyNodes = Collections.emptyList();

    Object value; // either a string value, or an attribute map (in the rare case multiple attributes are set)

    protected final boolean hasAttributes() {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5087);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5088);return value instanceof Attributes;
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public final Attributes attributes() {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5089);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5090);ensureAttributes();
        __CLR4_4_13xb3xblh9yvglc.R.inc(5091);return (Attributes) value;
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    private void ensureAttributes() {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5092);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5093);if ((((!hasAttributes())&&(__CLR4_4_13xb3xblh9yvglc.R.iget(5094)!=0|true))||(__CLR4_4_13xb3xblh9yvglc.R.iget(5095)==0&false))) {{
            __CLR4_4_13xb3xblh9yvglc.R.inc(5096);Object coreValue = value;
            __CLR4_4_13xb3xblh9yvglc.R.inc(5097);Attributes attributes = new Attributes();
            __CLR4_4_13xb3xblh9yvglc.R.inc(5098);value = attributes;
            __CLR4_4_13xb3xblh9yvglc.R.inc(5099);if ((((coreValue != null)&&(__CLR4_4_13xb3xblh9yvglc.R.iget(5100)!=0|true))||(__CLR4_4_13xb3xblh9yvglc.R.iget(5101)==0&false)))
                {__CLR4_4_13xb3xblh9yvglc.R.inc(5102);attributes.put(nodeName(), (String) coreValue);
        }}
    }}finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    String coreValue() {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5103);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5104);return attr(nodeName());
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    void coreValue(String value) {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5105);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5106);attr(nodeName(), value);
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public String attr(String key) {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5107);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5108);Validate.notNull(key);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5109);if ((((!hasAttributes())&&(__CLR4_4_13xb3xblh9yvglc.R.iget(5110)!=0|true))||(__CLR4_4_13xb3xblh9yvglc.R.iget(5111)==0&false))) {{
            __CLR4_4_13xb3xblh9yvglc.R.inc(5112);return (((key.equals(nodeName()) )&&(__CLR4_4_13xb3xblh9yvglc.R.iget(5113)!=0|true))||(__CLR4_4_13xb3xblh9yvglc.R.iget(5114)==0&false))? (String) value : EmptyString;
        }
        }__CLR4_4_13xb3xblh9yvglc.R.inc(5115);return super.attr(key);
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public Node attr(String key, String value) {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5116);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5117);if ((((!hasAttributes() && key.equals(nodeName()))&&(__CLR4_4_13xb3xblh9yvglc.R.iget(5118)!=0|true))||(__CLR4_4_13xb3xblh9yvglc.R.iget(5119)==0&false))) {{
            __CLR4_4_13xb3xblh9yvglc.R.inc(5120);this.value = value;
        } }else {{
            __CLR4_4_13xb3xblh9yvglc.R.inc(5121);ensureAttributes();
            __CLR4_4_13xb3xblh9yvglc.R.inc(5122);super.attr(key, value);
        }
        }__CLR4_4_13xb3xblh9yvglc.R.inc(5123);return this;
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public boolean hasAttr(String key) {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5124);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5125);ensureAttributes();
        __CLR4_4_13xb3xblh9yvglc.R.inc(5126);return super.hasAttr(key);
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public Node removeAttr(String key) {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5127);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5128);ensureAttributes();
        __CLR4_4_13xb3xblh9yvglc.R.inc(5129);return super.removeAttr(key);
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public String absUrl(String key) {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5130);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5131);ensureAttributes();
        __CLR4_4_13xb3xblh9yvglc.R.inc(5132);return super.absUrl(key);
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public String baseUri() {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5133);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5134);return (((hasParent() )&&(__CLR4_4_13xb3xblh9yvglc.R.iget(5135)!=0|true))||(__CLR4_4_13xb3xblh9yvglc.R.iget(5136)==0&false))? parent().baseUri() : "";
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    protected void doSetBaseUri(String baseUri) {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5137);
        // noop
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    public int childNodeSize() {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5138);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5139);return 0;
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}

    @Override
    protected List<Node> ensureChildNodes() {try{__CLR4_4_13xb3xblh9yvglc.R.inc(5140);
        __CLR4_4_13xb3xblh9yvglc.R.inc(5141);return EmptyNodes;
    }finally{__CLR4_4_13xb3xblh9yvglc.R.flushNeeded();}}
}
