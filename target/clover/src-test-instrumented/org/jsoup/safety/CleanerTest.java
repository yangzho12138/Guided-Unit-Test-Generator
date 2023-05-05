/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.safety;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Tests for the cleaner.

 @author Jonathan Hedley, jonathan@hedley.net */
public class CleanerTest {static class __CLR4_4_1vrmvrmlh9yvhtn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,41352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test public void simpleBehaviourTest() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sud43gvrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.simpleBehaviourTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41170,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sud43gvrm(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41170);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41171);String h = "<div><p class=foo><a href='http://evil.com'>Hello <b id=bar>there</b>!</a></div>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41172);String cleanHtml = Jsoup.clean(h, Whitelist.simpleText());

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41173);assertEquals("Hello <b>there</b>!", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void simpleBehaviourTest2() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_110idcsvrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.simpleBehaviourTest2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_110idcsvrq(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41174);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41175);String h = "Hello <b>there</b>!";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41176);String cleanHtml = Jsoup.clean(h, Whitelist.simpleText());

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41177);assertEquals("Hello <b>there</b>!", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void basicBehaviourTest() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t6phfsvru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.basicBehaviourTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t6phfsvru(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41178);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41179);String h = "<div><p><a href='javascript:sendAllMoney()'>Dodgy</a> <A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41180);String cleanHtml = Jsoup.clean(h, Whitelist.basic());

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41181);assertEquals("<p><a rel=\"nofollow\">Dodgy</a> <a href=\"http://nice.com\" rel=\"nofollow\">Nice</a></p><blockquote>Hello</blockquote>",
                TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void basicWithImagesTest() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194zd2dvry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.basicWithImagesTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194zd2dvry(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41182);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41183);String h = "<div><p><img src='http://example.com/' alt=Image></p><p><img src='ftp://ftp.example.com'></p></div>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41184);String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41185);assertEquals("<p><img src=\"http://example.com/\" alt=\"Image\"></p><p><img></p>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void testRelaxed() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16vdq04vs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRelaxed",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16vdq04vs2(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41186);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41187);String h = "<h1>Head</h1><table><tr><td>One<td>Two</td></tr></table>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41188);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41189);assertEquals("<h1>Head</h1><table><tbody><tr><td>One</td><td>Two</td></tr></tbody></table>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testRemoveTags() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13q148avs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13q148avs6(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41190);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41191);String h = "<div><p><A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41192);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeTags("a"));

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41193);assertEquals("<p>Nice</p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testRemoveAttributes() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tb1cnovsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tb1cnovsa(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41194);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41195);String h = "<div><p>Nice</p><blockquote cite='http://example.com/quotations'>Hello</blockquote>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41196);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeAttributes("blockquote", "cite"));

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41197);assertEquals("<p>Nice</p><blockquote>Hello</blockquote>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testRemoveEnforcedAttributes() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131gfpmvse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveEnforcedAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131gfpmvse(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41198);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41199);String h = "<div><p><A HREF='HTTP://nice.com'>Nice</a></p><blockquote>Hello</blockquote>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41200);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeEnforcedAttribute("a", "rel"));

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41201);assertEquals("<p><a href=\"http://nice.com\">Nice</a></p><blockquote>Hello</blockquote>",
                TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testRemoveProtocols() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b2qo30vsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testRemoveProtocols",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b2qo30vsi(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41202);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41203);String h = "<p>Contact me <a href='mailto:info@example.com'>here</a></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41204);String cleanHtml = Jsoup.clean(h, Whitelist.basic().removeProtocols("a", "href", "ftp", "mailto"));

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41205);assertEquals("<p>Contact me <a rel=\"nofollow\">here</a></p>",
                TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test @MultiLocaleTest public void whitelistedProtocolShouldBeRetained() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_146do0xvsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.whitelistedProtocolShouldBeRetained",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_146do0xvsm(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41206);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41207);Whitelist whitelist = Whitelist.none()
                .addTags("a")
                .addAttributes("a", "href")
                .addProtocols("a", "href", "something");

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41208);String cleanHtml = Jsoup.clean("<a href=\"SOMETHING://x\"></a>", whitelist);

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41209);assertEquals("<a href=\"SOMETHING://x\"></a>", TextUtil.stripNewlines(cleanHtml));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testDropComments() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136jr1gvsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropComments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136jr1gvsq(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41210);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41211);String h = "<p>Hello<!-- no --></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41212);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41213);assertEquals("<p>Hello</p>", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void testDropXmlProc() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ovkelvsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropXmlProc",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ovkelvsu(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41214);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41215);String h = "<?import namespace=\"xss\"><p>Hello</p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41216);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41217);assertEquals("<p>Hello</p>", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void testDropScript() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qdumqbvsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qdumqbvsy(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41218);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41219);String h = "<SCRIPT SRC=//ha.ckers.org/.j><SCRIPT>alert(/XSS/.source)</SCRIPT>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41220);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41221);assertEquals("", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void testDropImageScript() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mv8tkkvt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropImageScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mv8tkkvt2(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41222);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41223);String h = "<IMG SRC=\"javascript:alert('XSS')\">";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41224);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41225);assertEquals("<img>", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void testCleanJavascriptHref() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cp8wiyvt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testCleanJavascriptHref",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cp8wiyvt6(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41226);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41227);String h = "<A HREF=\"javascript:document.location='http://www.google.com/'\">XSS</A>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41228);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41229);assertEquals("<a>XSS</a>", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testCleanAnchorProtocol() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7uh3pvta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testCleanAnchorProtocol",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7uh3pvta(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41230);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41231);String validAnchor = "<a href=\"#valid\">Valid anchor</a>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41232);String invalidAnchor = "<a href=\"#anchor with spaces\">Invalid anchor</a>";

        // A Whitelist that does not allow anchors will strip them out.
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41233);String cleanHtml = Jsoup.clean(validAnchor, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41234);assertEquals("<a>Valid anchor</a>", cleanHtml);

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41235);cleanHtml = Jsoup.clean(invalidAnchor, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41236);assertEquals("<a>Invalid anchor</a>", cleanHtml);

        // A Whitelist that allows them will keep them.
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41237);Whitelist relaxedWithAnchor = Whitelist.relaxed().addProtocols("a", "href", "#");

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41238);cleanHtml = Jsoup.clean(validAnchor, relaxedWithAnchor);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41239);assertEquals(validAnchor, cleanHtml);

        // An invalid anchor is never valid.
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41240);cleanHtml = Jsoup.clean(invalidAnchor, relaxedWithAnchor);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41241);assertEquals("<a>Invalid anchor</a>", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testDropsUnknownTags() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwjyhkvtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testDropsUnknownTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwjyhkvtm(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41242);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41243);String h = "<p><custom foo=true>Test</custom></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41244);String cleanHtml = Jsoup.clean(h, Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41245);assertEquals("<p>Test</p>", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void testHandlesEmptyAttributes() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bf46y6vtq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testHandlesEmptyAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bf46y6vtq(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41246);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41247);String h = "<img alt=\"\" src= unknown=''>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41248);String cleanHtml = Jsoup.clean(h, Whitelist.basicWithImages());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41249);assertEquals("<img alt=\"\">", cleanHtml);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testIsValidBodyHtml() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gg0bw4vtu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testIsValidBodyHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gg0bw4vtu(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41250);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41251);String ok = "<p>Test <b><a href='http://example.com/' rel='nofollow'>OK</a></b></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41252);String ok1 = "<p>Test <b><a href='http://example.com/'>OK</a></b></p>"; // missing enforced is OK because still needs run thru cleaner
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41253);String nok1 = "<p><script></script>Not <b>OK</b></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41254);String nok2 = "<p align=right>Test Not <b>OK</b></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41255);String nok3 = "<!-- comment --><p>Not OK</p>"; // comments and the like will be cleaned
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41256);String nok4 = "<html><head>Foo</head><body><b>OK</b></body></html>"; // not body html
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41257);String nok5 = "<p>Test <b><a href='http://example.com/' rel='nofollowme'>OK</a></b></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41258);String nok6 = "<p>Test <b><a href='http://example.com/'>OK</b></p>"; // missing close tag
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41259);String nok7 = "</div>What";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41260);assertTrue(Jsoup.isValid(ok, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41261);assertTrue(Jsoup.isValid(ok1, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41262);assertFalse(Jsoup.isValid(nok1, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41263);assertFalse(Jsoup.isValid(nok2, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41264);assertFalse(Jsoup.isValid(nok3, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41265);assertFalse(Jsoup.isValid(nok4, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41266);assertFalse(Jsoup.isValid(nok5, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41267);assertFalse(Jsoup.isValid(nok6, Whitelist.basic()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41268);assertFalse(Jsoup.isValid(ok, Whitelist.none()));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41269);assertFalse(Jsoup.isValid(nok7, Whitelist.basic()));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void testIsValidDocument() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hcrbxevue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testIsValidDocument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hcrbxevue(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41270);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41271);String ok = "<html><head></head><body><p>Hello</p></body><html>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41272);String nok = "<html><head><script>woops</script><title>Hello</title></head><body><p>Hello</p></body><html>";

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41273);Whitelist relaxed = Whitelist.relaxed();
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41274);Cleaner cleaner = new Cleaner(relaxed);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41275);Document okDoc = Jsoup.parse(ok);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41276);assertTrue(cleaner.isValid(okDoc));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41277);assertFalse(cleaner.isValid(Jsoup.parse(nok)));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41278);assertFalse(new Cleaner(Whitelist.none()).isValid(okDoc));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void resolvesRelativeLinks() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oxs3cjvun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.resolvesRelativeLinks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oxs3cjvun(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41279);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41280);String html = "<a href='/foo'>Link</a><img src='/bar'>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41281);String clean = Jsoup.clean(html, "http://example.com/", Whitelist.basicWithImages());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41282);assertEquals("<a href=\"http://example.com/foo\" rel=\"nofollow\">Link</a>\n<img src=\"http://example.com/bar\">", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void preservesRelativeLinksIfConfigured() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1voaoo8vur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.preservesRelativeLinksIfConfigured",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1voaoo8vur(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41283);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41284);String html = "<a href='/foo'>Link</a><img src='/bar'> <img src='javascript:alert()'>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41285);String clean = Jsoup.clean(html, "http://example.com/", Whitelist.basicWithImages().preserveRelativeLinks(true));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41286);assertEquals("<a href=\"/foo\" rel=\"nofollow\">Link</a>\n<img src=\"/bar\"> \n<img>", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
    
    @Test public void dropsUnresolvableRelativeLinks() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15j1cakvuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.dropsUnresolvableRelativeLinks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15j1cakvuv(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41287);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41288);String html = "<a href='/foo'>Link</a>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41289);String clean = Jsoup.clean(html, Whitelist.basic());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41290);assertEquals("<a rel=\"nofollow\">Link</a>", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void handlesCustomProtocols() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rvqzgmvuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesCustomProtocols",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rvqzgmvuz(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41291);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41292);String html = "<img src='cid:12345' /> <img src='data:gzzt' />";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41293);String dropped = Jsoup.clean(html, Whitelist.basicWithImages());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41294);assertEquals("<img> \n<img>", dropped);

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41295);String preserved = Jsoup.clean(html, Whitelist.basicWithImages().addProtocols("img", "src", "cid", "data"));
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41296);assertEquals("<img src=\"cid:12345\"> \n<img src=\"data:gzzt\">", preserved);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void handlesAllPseudoTag() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h01mbvv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesAllPseudoTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h01mbvv5(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41297);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41298);String html = "<p class='foo' src='bar'><a class='qux'>link</a></p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41299);Whitelist whitelist = new Whitelist()
                .addAttributes(":all", "class")
                .addAttributes("p", "style")
                .addTags("p", "a");

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41300);String clean = Jsoup.clean(html, whitelist);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41301);assertEquals("<p class=\"foo\"><a class=\"qux\">link</a></p>", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void addsTagOnAttributesIfNotSet() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o1a5lbvva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.addsTagOnAttributesIfNotSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o1a5lbvva(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41302);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41303);String html = "<p class='foo' src='bar'>One</p>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41304);Whitelist whitelist = new Whitelist()
            .addAttributes("p", "class");
        // ^^ whitelist does not have explicit tag add for p, inferred from add attributes.
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41305);String clean = Jsoup.clean(html, whitelist);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41306);assertEquals("<p class=\"foo\">One</p>", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void supplyOutputSettings() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ne1q0qvvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.supplyOutputSettings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ne1q0qvvf(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41307);
        // test that one can override the default document output settings
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41308);Document.OutputSettings os = new Document.OutputSettings();
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41309);os.prettyPrint(false);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41310);os.escapeMode(Entities.EscapeMode.extended);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41311);os.charset("ascii");

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41312);String html = "<div><p>&bernou;</p></div>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41313);String customOut = Jsoup.clean(html, "http://foo.com/", Whitelist.relaxed(), os);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41314);String defaultOut = Jsoup.clean(html, "http://foo.com/", Whitelist.relaxed());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41315);assertNotSame(defaultOut, customOut);

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41316);assertEquals("<div><p>&Bscr;</p></div>", customOut); // entities now prefers shorted names if aliased
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41317);assertEquals("<div>\n" +
            " <p>\u212c</p>\n" +
            "</div>", defaultOut);

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41318);os.charset("ASCII");
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41319);os.escapeMode(Entities.EscapeMode.base);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41320);String customOut2 = Jsoup.clean(html, "http://foo.com/", Whitelist.relaxed(), os);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41321);assertEquals("<div><p>&#x212c;</p></div>", customOut2);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void handlesFramesets() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t9f5k6vvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesFramesets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t9f5k6vvu(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41322);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41323);String dirty = "<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\" /><frame src=\"foo\" /></frameset></html>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41324);String clean = Jsoup.clean(dirty, Whitelist.basic());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41325);assertEquals("", clean); // nothing good can come out of that

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41326);Document dirtyDoc = Jsoup.parse(dirty);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41327);Document cleanDoc = new Cleaner(Whitelist.basic()).clean(dirtyDoc);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41328);assertNotNull(cleanDoc);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41329);assertEquals(0, cleanDoc.body().childNodeSize());
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void cleansInternationalText() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1alnwo8vw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.cleansInternationalText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1alnwo8vw2(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41330);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41331);assertEquals("\u043f\u0440\u0438\u0432\u0435\u0442", Jsoup.clean("\u043f\u0440\u0438\u0432\u0435\u0442", Whitelist.none()));
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test
    public void testScriptTagInWhiteList() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1phkfn8vw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.testScriptTagInWhiteList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1phkfn8vw4(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41332);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41333);Whitelist whitelist = Whitelist.relaxed();
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41334);whitelist.addTags( "script" );
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41335);assertTrue( Jsoup.isValid("Hello<script>alert('Doh')</script>World !", whitelist ) );
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void bailsIfRemovingProtocolThatsNotSet() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nqk4mzvw8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,98,97,105,108,115,73,102,82,101,109,111,118,105,110,103,80,114,111,116,111,99,111,108,84,104,97,116,115,78,111,116,83,101,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.bailsIfRemovingProtocolThatsNotSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nqk4mzvw8(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41336);
        // a case that came up on the email list
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41337);Whitelist w = Whitelist.none();

        // note no add tag, and removing protocol without adding first
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41338);w.addAttributes("a", "href");
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41339);w.removeProtocols("a", "href", "javascript"); // with no protocols enforced, this was a noop. Now validates.
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void handlesControlCharactersAfterTagName() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11njmzwvwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesControlCharactersAfterTagName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11njmzwvwc(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41340);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41341);String html = "<a/\06>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41342);String clean = Jsoup.clean(html, Whitelist.basic());
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41343);assertEquals("<a rel=\"nofollow\"></a>", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void handlesAttributesWithNoValue() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ar0r5vwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesAttributesWithNoValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ar0r5vwg(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41344);
        // https://github.com/jhy/jsoup/issues/973
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41345);String clean = Jsoup.clean("<a href>Clean</a>", Whitelist.basic());

        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41346);assertEquals("<a rel=\"nofollow\">Clean</a>", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}

    @Test public void handlesNoHrefAttribute() {__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceStart(getClass().getName(),41347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3md2svwj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vrmvrmlh9yvhtn.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vrmvrmlh9yvhtn.R.globalSliceEnd(getClass().getName(),"org.jsoup.safety.CleanerTest.handlesNoHrefAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3md2svwj(){try{__CLR4_4_1vrmvrmlh9yvhtn.R.inc(41347);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41348);String dirty = "<a>One</a> <a href>Two</a>";
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41349);Whitelist relaxedWithAnchor = Whitelist.relaxed().addProtocols("a", "href", "#");
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41350);String clean = Jsoup.clean(dirty, relaxedWithAnchor);
        __CLR4_4_1vrmvrmlh9yvhtn.R.inc(41351);assertEquals("<a>One</a> \n<a>Two</a>", clean);
    }finally{__CLR4_4_1vrmvrmlh9yvhtn.R.flushNeeded();}}
}
