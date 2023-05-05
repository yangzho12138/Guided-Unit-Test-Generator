/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.nodes.Attributes;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Controls parser settings, to optionally preserve tag and/or attribute name case.
 */
public class ParseSettings {public static class __CLR4_4_16ef6eflh9yvgpb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,8325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * HTML default settings: both tag and attribute names are lower-cased during parsing.
     */
    public static final ParseSettings htmlDefault;
    /**
     * Preserve both tag and attribute case.
     */
    public static final ParseSettings preserveCase;

    static {try{__CLR4_4_16ef6eflh9yvgpb.R.inc(8295);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8296);htmlDefault = new ParseSettings(false, false);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8297);preserveCase = new ParseSettings(true, true);
    }finally{__CLR4_4_16ef6eflh9yvgpb.R.flushNeeded();}}

    private final boolean preserveTagCase;
    private final boolean preserveAttributeCase;

    /**
     * Returns true if preserving tag name case.
     */
    public boolean preserveTagCase() {try{__CLR4_4_16ef6eflh9yvgpb.R.inc(8298);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8299);return preserveTagCase;
    }finally{__CLR4_4_16ef6eflh9yvgpb.R.flushNeeded();}}

    /**
     * Returns true if preserving attribute case.
     */
    public boolean preserveAttributeCase() {try{__CLR4_4_16ef6eflh9yvgpb.R.inc(8300);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8301);return preserveAttributeCase;
    }finally{__CLR4_4_16ef6eflh9yvgpb.R.flushNeeded();}}

    /**
     * Define parse settings.
     * @param tag preserve tag case?
     * @param attribute preserve attribute name case?
     */
    public ParseSettings(boolean tag, boolean attribute) {try{__CLR4_4_16ef6eflh9yvgpb.R.inc(8302);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8303);preserveTagCase = tag;
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8304);preserveAttributeCase = attribute;
    }finally{__CLR4_4_16ef6eflh9yvgpb.R.flushNeeded();}}

    /**
     * Normalizes a tag name according to the case preservation setting.
     */
    public String normalizeTag(String name) {try{__CLR4_4_16ef6eflh9yvgpb.R.inc(8305);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8306);name = name.trim();
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8307);if ((((!preserveTagCase)&&(__CLR4_4_16ef6eflh9yvgpb.R.iget(8308)!=0|true))||(__CLR4_4_16ef6eflh9yvgpb.R.iget(8309)==0&false)))
            {__CLR4_4_16ef6eflh9yvgpb.R.inc(8310);name = lowerCase(name);
        }__CLR4_4_16ef6eflh9yvgpb.R.inc(8311);return name;
    }finally{__CLR4_4_16ef6eflh9yvgpb.R.flushNeeded();}}

    /**
     * Normalizes an attribute according to the case preservation setting.
     */
    public String normalizeAttribute(String name) {try{__CLR4_4_16ef6eflh9yvgpb.R.inc(8312);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8313);name = name.trim();
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8314);if ((((!preserveAttributeCase)&&(__CLR4_4_16ef6eflh9yvgpb.R.iget(8315)!=0|true))||(__CLR4_4_16ef6eflh9yvgpb.R.iget(8316)==0&false)))
            {__CLR4_4_16ef6eflh9yvgpb.R.inc(8317);name = lowerCase(name);
        }__CLR4_4_16ef6eflh9yvgpb.R.inc(8318);return name;
    }finally{__CLR4_4_16ef6eflh9yvgpb.R.flushNeeded();}}

    Attributes normalizeAttributes(Attributes attributes) {try{__CLR4_4_16ef6eflh9yvgpb.R.inc(8319);
        __CLR4_4_16ef6eflh9yvgpb.R.inc(8320);if ((((!preserveAttributeCase)&&(__CLR4_4_16ef6eflh9yvgpb.R.iget(8321)!=0|true))||(__CLR4_4_16ef6eflh9yvgpb.R.iget(8322)==0&false))) {{
            __CLR4_4_16ef6eflh9yvgpb.R.inc(8323);attributes.normalize();
        }
        }__CLR4_4_16ef6eflh9yvgpb.R.inc(8324);return attributes;
    }finally{__CLR4_4_16ef6eflh9yvgpb.R.flushNeeded();}}
}
