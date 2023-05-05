/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.jsoup.nodes.Document.OutputSettings;
import static org.jsoup.nodes.Entities.EscapeMode.*;
import static org.junit.Assert.*;

public class EntitiesTest {static class __CLR4_4_1u84u84lh9yvhpx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,39271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void escape() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7spcou84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escape",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7spcou84(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39172);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39173);String text = "Hello &<> \u00c5 \u00e5 \u03c0 \u65b0 there \u00be \u00a9 \u00bb";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39174);String escapedAscii = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(base));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39175);String escapedAsciiFull = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(extended));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39176);String escapedAsciiXhtml = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(xhtml));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39177);String escapedUtfFull = Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(extended));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39178);String escapedUtfMin = Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(xhtml));

        __CLR4_4_1u84u84lh9yvhpx.R.inc(39179);assertEquals("Hello &amp;&lt;&gt; &Aring; &aring; &#x3c0; &#x65b0; there &frac34; &copy; &raquo;", escapedAscii);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39180);assertEquals("Hello &amp;&lt;&gt; &angst; &aring; &pi; &#x65b0; there &frac34; &copy; &raquo;", escapedAsciiFull);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39181);assertEquals("Hello &amp;&lt;&gt; &#xc5; &#xe5; &#x3c0; &#x65b0; there &#xbe; &#xa9; &#xbb;", escapedAsciiXhtml);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39182);assertEquals("Hello &amp;&lt;&gt; \u00c5 \u00e5 \u03c0 \u65b0 there \u00be \u00a9 \u00bb", escapedUtfFull);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39183);assertEquals("Hello &amp;&lt;&gt; \u00c5 \u00e5 \u03c0 \u65b0 there \u00be \u00a9 \u00bb", escapedUtfMin);
        // odd that it's defined as aring in base but angst in full

        // round trip
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39184);assertEquals(text, Entities.unescape(escapedAscii));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39185);assertEquals(text, Entities.unescape(escapedAsciiFull));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39186);assertEquals(text, Entities.unescape(escapedAsciiXhtml));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39187);assertEquals(text, Entities.unescape(escapedUtfFull));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39188);assertEquals(text, Entities.unescape(escapedUtfMin));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void escapedSupplementary() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a0mpnxu8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escapedSupplementary",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a0mpnxu8l(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39189);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39190);String text = "\ud835\udd59";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39191);String escapedAscii = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(base));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39192);assertEquals("&#x1d559;", escapedAscii);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39193);String escapedAsciiFull = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(extended));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39194);assertEquals("&hopf;", escapedAsciiFull);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39195);String escapedUtf= Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(extended));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39196);assertEquals(text, escapedUtf);
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void unescapeMultiChars() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y8hd97u8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.unescapeMultiChars",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y8hd97u8t(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39197);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39198);String text = "&NestedGreaterGreater; &nGg; &nGt; &nGtv; &Gt; &gg;"; // gg is not combo, but 8811 could conflict with NestedGreaterGreater or others
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39199);String un = "\u226b \u22d9\u0338 \u226b\u20d2 \u226b\u0338 \u226b \u226b";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39200);assertEquals(un, Entities.unescape(text));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39201);String escaped = Entities.escape(un, new OutputSettings().charset("ascii").escapeMode(extended));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39202);assertEquals("&Gt; &Gg;&#x338; &Gt;&#x20d2; &Gt;&#x338; &Gt; &Gt;", escaped);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39203);assertEquals(un, Entities.unescape(escaped));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void xhtml() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xzar62u90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.xhtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xzar62u90(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39204);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39205);String text = "&amp; &gt; &lt; &quot;";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39206);assertEquals(38, xhtml.codepointForName("amp"));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39207);assertEquals(62, xhtml.codepointForName("gt"));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39208);assertEquals(60, xhtml.codepointForName("lt"));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39209);assertEquals(34, xhtml.codepointForName("quot"));

        __CLR4_4_1u84u84lh9yvhpx.R.inc(39210);assertEquals("amp", xhtml.nameForCodepoint(38));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39211);assertEquals("gt", xhtml.nameForCodepoint(62));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39212);assertEquals("lt", xhtml.nameForCodepoint(60));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39213);assertEquals("quot", xhtml.nameForCodepoint(34));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void getByName() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fm47r5u9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.getByName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fm47r5u9a(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39214);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39215);assertEquals("\u226b\u20d2", Entities.getByName("nGt"));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39216);assertEquals("fj", Entities.getByName("fjlig"));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39217);assertEquals("\u226b", Entities.getByName("gg"));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39218);assertEquals("\u00a9", Entities.getByName("copy"));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void escapeSupplementaryCharacter() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a058biu9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escapeSupplementaryCharacter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a058biu9f(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39219);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39220);String text = new String(Character.toChars(135361));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39221);String escapedAscii = Entities.escape(text, new OutputSettings().charset("ascii").escapeMode(base));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39222);assertEquals("&#x210c1;", escapedAscii);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39223);String escapedUtf = Entities.escape(text, new OutputSettings().charset("UTF-8").escapeMode(base));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39224);assertEquals(text, escapedUtf);
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void notMissingMultis() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fj39pwu9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.notMissingMultis",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fj39pwu9l(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39225);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39226);String text = "&nparsl;";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39227);String un = "\u2afd\u20e5";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39228);assertEquals(un, Entities.unescape(text));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void notMissingSupplementals() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psbarhu9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.notMissingSupplementals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psbarhu9p(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39229);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39230);String text = "&npolint; &qfr;";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39231);String un = "\u2a14 \ud835\udd2e"; // \ud835\udd2e
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39232);assertEquals(un, Entities.unescape(text));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void unescape() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbipwfu9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.unescape",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbipwfu9t(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39233);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39234);String text = "Hello &AElig; &amp;&LT&gt; &reg &angst; &angst &#960; &#960 &#x65B0; there &! &frac34; &copy; &COPY;";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39235);assertEquals("Hello \u00c6 &<> \u00ae \u00c5 &angst \u03c0 \u03c0 \u65b0 there &! \u00be \u00a9 \u00a9", Entities.unescape(text));

        __CLR4_4_1u84u84lh9yvhpx.R.inc(39236);assertEquals("&0987654321; &unknown", Entities.unescape("&0987654321; &unknown"));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void strictUnescape() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rpil9mu9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.strictUnescape",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rpil9mu9x(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39237); // for attributes, enforce strict unescaping (must look like &#xxx; , not just &#xxx)
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39238);String text = "Hello &amp= &amp;";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39239);assertEquals("Hello &amp= &", Entities.unescape(text, true));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39240);assertEquals("Hello &= &", Entities.unescape(text));
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39241);assertEquals("Hello &= &", Entities.unescape(text, false));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    
    @Test public void caseSensitive() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xica8dua2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.caseSensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xica8dua2(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39242);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39243);String unescaped = "\u00dc \u00fc & &";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39244);assertEquals("&Uuml; &uuml; &amp; &amp;",
                Entities.escape(unescaped, new OutputSettings().charset("ascii").escapeMode(extended)));
        
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39245);String escaped = "&Uuml; &uuml; &amp; &AMP";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39246);assertEquals("\u00dc \u00fc & &", Entities.unescape(escaped));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}
    
    @Test public void quoteReplacements() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pggahoua7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.quoteReplacements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pggahoua7(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39247);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39248);String escaped = "&#92; &#36;";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39249);String unescaped = "\\ $";
        
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39250);assertEquals(unescaped, Entities.unescape(escaped));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void letterDigitEntities() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xofmsxuab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.letterDigitEntities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xofmsxuab(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39251);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39252);String html = "<p>&sup1;&sup2;&sup3;&frac14;&frac12;&frac34;</p>";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39253);Document doc = Jsoup.parse(html);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39254);doc.outputSettings().charset("ascii");
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39255);Element p = doc.select("p").first();
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39256);assertEquals("&sup1;&sup2;&sup3;&frac14;&frac12;&frac34;", p.html());
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39257);assertEquals("\u00b9\u00b2\u00b3\u00bc\u00bd\u00be", p.text());
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39258);doc.outputSettings().charset("UTF-8");
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39259);assertEquals("\u00b9\u00b2\u00b3\u00bc\u00bd\u00be", p.html());
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void noSpuriousDecodes() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lqz2ruak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.noSpuriousDecodes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lqz2ruak(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39260);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39261);String string = "http://www.foo.com?a=1&num_rooms=1&children=0&int=VA&b=2";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39262);assertEquals(string, Entities.unescape(string));
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}

    @Test public void escapesGtInXmlAttributesButNotInHtml() {__CLR4_4_1u84u84lh9yvhpx.R.globalSliceStart(getClass().getName(),39263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqn0bxuan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1u84u84lh9yvhpx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1u84u84lh9yvhpx.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.EntitiesTest.escapesGtInXmlAttributesButNotInHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqn0bxuan(){try{__CLR4_4_1u84u84lh9yvhpx.R.inc(39263);
        // https://github.com/jhy/jsoup/issues/528 - < is OK in HTML attribute values, but not in XML


        __CLR4_4_1u84u84lh9yvhpx.R.inc(39264);String docHtml = "<a title='<p>One</p>'>One</a>";
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39265);Document doc = Jsoup.parse(docHtml);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39266);Element element = doc.select("a").first();

        __CLR4_4_1u84u84lh9yvhpx.R.inc(39267);doc.outputSettings().escapeMode(base);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39268);assertEquals("<a title=\"<p>One</p>\">One</a>", element.outerHtml());

        __CLR4_4_1u84u84lh9yvhpx.R.inc(39269);doc.outputSettings().escapeMode(xhtml);
        __CLR4_4_1u84u84lh9yvhpx.R.inc(39270);assertEquals("<a title=\"&lt;p>One&lt;/p>\">One</a>", element.outerHtml());
    }finally{__CLR4_4_1u84u84lh9yvhpx.R.flushNeeded();}}
}
