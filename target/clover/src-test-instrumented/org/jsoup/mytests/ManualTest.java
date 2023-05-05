/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.mytests;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;

public class ManualTest {static class __CLR4_4_1a4sa4slh9yvgxd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,13159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test public void testIframe() {__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceStart(getClass().getName(),13132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xyol7ha4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a4sa4slh9yvgxd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testIframe",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xyol7ha4s(){try{__CLR4_4_1a4sa4slh9yvgxd.R.inc(13132);
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13133);Document doc = Jsoup.parse("<html><head id=2><iframe id=1></iframe></head></html>");

        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13134);Element iframe = doc.getElementById("1");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13135);iframe.html("good");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13136);assertEquals("good", iframe.html());
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13137);iframe.html("<i>bad</i>");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13138);assertEquals("&lt;i&gt;bad&lt;/i&gt;", iframe.html());

        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13139);Element head = doc.getElementById("2");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13140);head.html("<iframe><i>bad</i></iframe>");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13141);assertEquals("<iframe>&lt;i&gt;bad&lt;/i&gt;</iframe>", head.html());
    }finally{__CLR4_4_1a4sa4slh9yvgxd.R.flushNeeded();}}

    @Test public void testScript() {__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceStart(getClass().getName(),13142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mg32xwa52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a4sa4slh9yvgxd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mg32xwa52(){try{__CLR4_4_1a4sa4slh9yvgxd.R.inc(13142);
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13143);Document doc = Jsoup.parse("<html><head id=2><script id=1></script></head></html>");

        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13144);Element script = doc.getElementById("1");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13145);script.html("good");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13146);assertEquals("good", script.html());
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13147);script.html("<i>bad</i>");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13148);assertEquals("&lt;i&gt;bad&lt;/i&gt;", script.html());
    }finally{__CLR4_4_1a4sa4slh9yvgxd.R.flushNeeded();}}

    @Test public void testNoScript() {__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceStart(getClass().getName(),13149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ug6ifva59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a4sa4slh9yvgxd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testNoScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ug6ifva59(){try{__CLR4_4_1a4sa4slh9yvgxd.R.inc(13149);
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13150);Document doc = Jsoup.parse("<html><head id=2><noscript id=1></noscript></head></html>");

        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13151);Element noscript = doc.getElementById("1");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13152);noscript.html("good");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13153);assertEquals("good", noscript.html());
        //noscript.html("<i>bad</i>");
        //assertEquals("&lt;i&gt;bad&lt;/i&gt;", noscript.html());
    }finally{__CLR4_4_1a4sa4slh9yvgxd.R.flushNeeded();}}

    @Test public void testPlainText() {__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceStart(getClass().getName(),13154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdrhhoa5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a4sa4slh9yvgxd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a4sa4slh9yvgxd.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.ManualTest.testPlainText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdrhhoa5e(){try{__CLR4_4_1a4sa4slh9yvgxd.R.inc(13154);
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13155);Document doc = Jsoup.parse("<html><head id=2><plaintext id=1></plaintext></head></html>");

        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13156);Element plaintext = doc.getElementById("1");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13157);plaintext.html("good");
        __CLR4_4_1a4sa4slh9yvgxd.R.inc(13158);assertEquals("good", plaintext.html());
        //noscript.html("<i>bad</i>");
        //assertEquals("&lt;i&gt;bad&lt;/i&gt;", noscript.html());
    }finally{__CLR4_4_1a4sa4slh9yvgxd.R.flushNeeded();}}

}