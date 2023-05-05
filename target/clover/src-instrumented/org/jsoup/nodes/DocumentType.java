/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings.Syntax;

import java.io.IOException;

/**
 * A {@code <!DOCTYPE>} node.
 */
public class DocumentType extends LeafNode {public static class __CLR4_4_135i35ilh9yvgi9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,4146,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // todo needs a bit of a chunky cleanup. this level of detail isn't needed
    public static final String PUBLIC_KEY = "PUBLIC";
    public static final String SYSTEM_KEY = "SYSTEM";
    private static final String NAME = "name";
    private static final String PUB_SYS_KEY = "pubSysKey"; // PUBLIC or SYSTEM
    private static final String PUBLIC_ID = "publicId";
    private static final String SYSTEM_ID = "systemId";
    // todo: quirk mode from publicId and systemId

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     */
    public DocumentType(String name, String publicId, String systemId) {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4086);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4087);Validate.notNull(name);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4088);Validate.notNull(publicId);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4089);Validate.notNull(systemId);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4090);attr(NAME, name);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4091);attr(PUBLIC_ID, publicId);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4092);if ((((has(PUBLIC_ID))&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4093)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4094)==0&false))) {{
            __CLR4_4_135i35ilh9yvgi9.R.inc(4095);attr(PUB_SYS_KEY, PUBLIC_KEY);
        }
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4096);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     * @param baseUri unused
     * @deprecated
     */
    public DocumentType(String name, String publicId, String systemId, String baseUri) {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4097);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4098);attr(NAME, name);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4099);attr(PUBLIC_ID, publicId);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4100);if ((((has(PUBLIC_ID))&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4101)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4102)==0&false))) {{
            __CLR4_4_135i35ilh9yvgi9.R.inc(4103);attr(PUB_SYS_KEY, PUBLIC_KEY);
        }
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4104);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}

    /**
     * Create a new doctype element.
     * @param name the doctype's name
     * @param publicId the doctype's public ID
     * @param systemId the doctype's system ID
     * @param baseUri unused
     * @deprecated
     */
    public DocumentType(String name, String pubSysKey, String publicId, String systemId, String baseUri) {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4105);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4106);attr(NAME, name);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4107);if ((((pubSysKey != null)&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4108)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4109)==0&false))) {{
            __CLR4_4_135i35ilh9yvgi9.R.inc(4110);attr(PUB_SYS_KEY, pubSysKey);
        }
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4111);attr(PUBLIC_ID, publicId);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4112);attr(SYSTEM_ID, systemId);
    }finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}
    public void setPubSysKey(String value) {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4113);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4114);if ((((value != null)&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4115)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4116)==0&false)))
            {__CLR4_4_135i35ilh9yvgi9.R.inc(4117);attr(PUB_SYS_KEY, value);
    }}finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4118);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4119);return "#doctype";
    }finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}

    @Override
    void outerHtmlHead(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4120);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4121);if ((((out.syntax() == Syntax.html && !has(PUBLIC_ID) && !has(SYSTEM_ID))&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4122)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4123)==0&false))) {{
            // looks like a html5 doctype, go lowercase for aesthetics
            __CLR4_4_135i35ilh9yvgi9.R.inc(4124);accum.append("<!doctype");
        } }else {{
            __CLR4_4_135i35ilh9yvgi9.R.inc(4125);accum.append("<!DOCTYPE");
        }
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4126);if ((((has(NAME))&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4127)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4128)==0&false)))
            {__CLR4_4_135i35ilh9yvgi9.R.inc(4129);accum.append(" ").append(attr(NAME));
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4130);if ((((has(PUB_SYS_KEY))&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4131)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4132)==0&false)))
            {__CLR4_4_135i35ilh9yvgi9.R.inc(4133);accum.append(" ").append(attr(PUB_SYS_KEY));
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4134);if ((((has(PUBLIC_ID))&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4135)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4136)==0&false)))
            {__CLR4_4_135i35ilh9yvgi9.R.inc(4137);accum.append(" \"").append(attr(PUBLIC_ID)).append('"');
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4138);if ((((has(SYSTEM_ID))&&(__CLR4_4_135i35ilh9yvgi9.R.iget(4139)!=0|true))||(__CLR4_4_135i35ilh9yvgi9.R.iget(4140)==0&false)))
            {__CLR4_4_135i35ilh9yvgi9.R.inc(4141);accum.append(" \"").append(attr(SYSTEM_ID)).append('"');
        }__CLR4_4_135i35ilh9yvgi9.R.inc(4142);accum.append('>');
    }finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}

    @Override
    void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4143);
    }finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}

    private boolean has(final String attribute) {try{__CLR4_4_135i35ilh9yvgi9.R.inc(4144);
        __CLR4_4_135i35ilh9yvgi9.R.inc(4145);return !StringUtil.isBlank(attr(attribute));
    }finally{__CLR4_4_135i35ilh9yvgi9.R.flushNeeded();}}
}
