/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Tag tests.
 @author Jonathan Hedley, jonathan@hedley.net */
public class TagTest {static class __CLR4_4_1vezvezlh9yvhsy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,40755,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test public void isCaseSensitive() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sp5ywtvez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.isCaseSensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sp5ywtvez(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40715);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40716);Tag p1 = Tag.valueOf("P");
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40717);Tag p2 = Tag.valueOf("p");
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40718);assertFalse(p1.equals(p2));
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test @MultiLocaleTest public void canBeInsensitive() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1neopk5vf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.canBeInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1neopk5vf3(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40719);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40720);Tag script1 = Tag.valueOf("script", ParseSettings.htmlDefault);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40721);Tag script2 = Tag.valueOf("SCRIPT", ParseSettings.htmlDefault);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40722);assertSame(script1, script2);
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test public void trims() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9f06wvf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.trims",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9f06wvf7(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40723);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40724);Tag p1 = Tag.valueOf("p");
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40725);Tag p2 = Tag.valueOf(" p ");
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40726);assertEquals(p1, p2);
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test public void equality() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5v6ypvfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.equality",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40727,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5v6ypvfb(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40727);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40728);Tag p1 = Tag.valueOf("p");
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40729);Tag p2 = Tag.valueOf("p");
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40730);assertTrue(p1.equals(p2));
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40731);assertTrue(p1 == p2);
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test public void divSemantics() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcm277vfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.divSemantics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcm277vfg(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40732);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40733);Tag div = Tag.valueOf("div");

        __CLR4_4_1vezvezlh9yvhsy.R.inc(40734);assertTrue(div.isBlock());
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40735);assertTrue(div.formatAsBlock());
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test public void pSemantics() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12nfu64vfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.pSemantics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12nfu64vfk(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40736);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40737);Tag p = Tag.valueOf("p");

        __CLR4_4_1vezvezlh9yvhsy.R.inc(40738);assertTrue(p.isBlock());
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40739);assertFalse(p.formatAsBlock());
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test public void imgSemantics() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1siqy9dvfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.imgSemantics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1siqy9dvfo(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40740);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40741);Tag img = Tag.valueOf("img");
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40742);assertTrue(img.isInline());
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40743);assertTrue(img.isSelfClosing());
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40744);assertFalse(img.isBlock());
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test public void defaultSemantics() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mu7nkdvft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.defaultSemantics",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40745,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mu7nkdvft(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40745);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40746);Tag foo = Tag.valueOf("FOO"); // not defined
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40747);Tag foo2 = Tag.valueOf("FOO");

        __CLR4_4_1vezvezlh9yvhsy.R.inc(40748);assertEquals(foo, foo2);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40749);assertTrue(foo.isInline());
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40750);assertTrue(foo.formatAsBlock());
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class) public void valueOfChecksNotNull() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogix1uvfz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,118,97,108,117,101,79,102,67,104,101,99,107,115,78,111,116,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.valueOfChecksNotNull",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogix1uvfz(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40751);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40752);Tag.valueOf(null);
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class) public void valueOfChecksNotEmpty() {__CLR4_4_1vezvezlh9yvhsy.R.globalSliceStart(getClass().getName(),40753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eebwi4vg1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,118,97,108,117,101,79,102,67,104,101,99,107,115,78,111,116,69,109,112,116,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vezvezlh9yvhsy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vezvezlh9yvhsy.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TagTest.valueOfChecksNotEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eebwi4vg1(){try{__CLR4_4_1vezvezlh9yvhsy.R.inc(40753);
        __CLR4_4_1vezvezlh9yvhsy.R.inc(40754);Tag.valueOf(" ");
    }finally{__CLR4_4_1vezvezlh9yvhsy.R.flushNeeded();}}
}
