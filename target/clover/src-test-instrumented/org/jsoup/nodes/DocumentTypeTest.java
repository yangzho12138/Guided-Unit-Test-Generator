/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the DocumentType node
 *
 * @author Jonathan Hedley, http://jonathanhedley.com/
 */
public class DocumentTypeTest {static class __CLR4_4_1tg2tg2lh9yvhp1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,38195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void constructorValidationOkWithBlankName() {__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceStart(getClass().getName(),38162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1efazovtg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tg2tg2lh9yvhp1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.constructorValidationOkWithBlankName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1efazovtg2(){try{__CLR4_4_1tg2tg2lh9yvhp1.R.inc(38162);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38163);DocumentType fail = new DocumentType("","", "");
    }finally{__CLR4_4_1tg2tg2lh9yvhp1.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void constructorValidationThrowsExceptionOnNulls() {__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceStart(getClass().getName(),38164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z4ssvvtg4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,99,111,110,115,116,114,117,99,116,111,114,86,97,108,105,100,97,116,105,111,110,84,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,78,117,108,108,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tg2tg2lh9yvhp1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.constructorValidationThrowsExceptionOnNulls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38164,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z4ssvvtg4(){try{__CLR4_4_1tg2tg2lh9yvhp1.R.inc(38164);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38165);DocumentType fail = new DocumentType("html", null, null);
    }finally{__CLR4_4_1tg2tg2lh9yvhp1.R.flushNeeded();}}

    @Test
    public void constructorValidationOkWithBlankPublicAndSystemIds() {__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceStart(getClass().getName(),38166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ruwaptg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tg2tg2lh9yvhp1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.constructorValidationOkWithBlankPublicAndSystemIds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ruwaptg6(){try{__CLR4_4_1tg2tg2lh9yvhp1.R.inc(38166);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38167);DocumentType fail = new DocumentType("html","", "");
    }finally{__CLR4_4_1tg2tg2lh9yvhp1.R.flushNeeded();}}

    @Test public void outerHtmlGeneration() {__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceStart(getClass().getName(),38168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a3gu0rtg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tg2tg2lh9yvhp1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.outerHtmlGeneration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a3gu0rtg8(){try{__CLR4_4_1tg2tg2lh9yvhp1.R.inc(38168);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38169);DocumentType html5 = new DocumentType("html", "", "");
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38170);assertEquals("<!doctype html>", html5.outerHtml());

        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38171);DocumentType publicDocType = new DocumentType("html", "-//IETF//DTD HTML//", "");
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38172);assertEquals("<!DOCTYPE html PUBLIC \"-//IETF//DTD HTML//\">", publicDocType.outerHtml());

        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38173);DocumentType systemDocType = new DocumentType("html", "", "http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd");
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38174);assertEquals("<!DOCTYPE html \"http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd\">", systemDocType.outerHtml());

        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38175);DocumentType combo = new DocumentType("notHtml", "--public", "--system");
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38176);assertEquals("<!DOCTYPE notHtml PUBLIC \"--public\" \"--system\">", combo.outerHtml());
    }finally{__CLR4_4_1tg2tg2lh9yvhp1.R.flushNeeded();}}

    @Test public void testRoundTrip() {__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceStart(getClass().getName(),38177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yhw67stgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tg2tg2lh9yvhp1.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tg2tg2lh9yvhp1.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTypeTest.testRoundTrip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38177,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yhw67stgh(){try{__CLR4_4_1tg2tg2lh9yvhp1.R.inc(38177);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38178);String base = "<!DOCTYPE html>";
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38179);assertEquals("<!doctype html>", htmlOutput(base));
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38180);assertEquals(base, xmlOutput(base));

        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38181);String publicDoc = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38182);assertEquals(publicDoc, htmlOutput(publicDoc));
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38183);assertEquals(publicDoc, xmlOutput(publicDoc));

        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38184);String systemDoc = "<!DOCTYPE html SYSTEM \"exampledtdfile.dtd\">";
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38185);assertEquals(systemDoc, htmlOutput(systemDoc));
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38186);assertEquals(systemDoc, xmlOutput(systemDoc));

        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38187);String legacyDoc = "<!DOCTYPE html SYSTEM \"about:legacy-compat\">";
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38188);assertEquals(legacyDoc, htmlOutput(legacyDoc));
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38189);assertEquals(legacyDoc, xmlOutput(legacyDoc));
    }finally{__CLR4_4_1tg2tg2lh9yvhp1.R.flushNeeded();}}

    private String htmlOutput(String in) {try{__CLR4_4_1tg2tg2lh9yvhp1.R.inc(38190);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38191);DocumentType type = (DocumentType) Jsoup.parse(in).childNode(0);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38192);return type.outerHtml();
    }finally{__CLR4_4_1tg2tg2lh9yvhp1.R.flushNeeded();}}

    private String xmlOutput(String in) {try{__CLR4_4_1tg2tg2lh9yvhp1.R.inc(38193);
        __CLR4_4_1tg2tg2lh9yvhp1.R.inc(38194);return Jsoup.parse(in, "", Parser.xmlParser()).childNode(0).outerHtml();
    }finally{__CLR4_4_1tg2tg2lh9yvhp1.R.flushNeeded();}}
}
