/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * Tests for Element (DOM stuff mostly).
 *
 * @author Jonathan Hedley
 */
public class ElementTest {static class __CLR4_4_1tgztgzlh9yvhpm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,39172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String reference = "<div id=div1><p>Hello</p><p>Another <b>element</b></p><div id=div2><img src=foo.png></div></div>";

    @Test public void getElementsByTagName() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q712jstgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.getElementsByTagName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q712jstgz(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38195);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38196);Document doc = Jsoup.parse(reference);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38197);List<Element> divs = doc.getElementsByTag("div");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38198);assertEquals(2, divs.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38199);assertEquals("div1", divs.get(0).id());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38200);assertEquals("div2", divs.get(1).id());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38201);List<Element> ps = doc.getElementsByTag("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38202);assertEquals(2, ps.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38203);assertEquals("Hello", ((TextNode) ps.get(0).childNode(0)).getWholeText());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38204);assertEquals("Another ", ((TextNode) ps.get(1).childNode(0)).getWholeText());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38205);List<Element> ps2 = doc.getElementsByTag("P");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38206);assertEquals(ps, ps2);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38207);List<Element> imgs = doc.getElementsByTag("img");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38208);assertEquals("foo.png", imgs.get(0).attr("src"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38209);List<Element> empty = doc.getElementsByTag("wtf");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38210);assertEquals(0, empty.size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void getNamespacedElementsByTag() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n1w2ukthf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.getNamespacedElementsByTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n1w2ukthf(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38211);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38212);Document doc = Jsoup.parse("<div><abc:def id=1>Hello</abc:def></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38213);Elements els = doc.getElementsByTag("abc:def");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38214);assertEquals(1, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38215);assertEquals("1", els.first().id());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38216);assertEquals("abc:def", els.first().tagName());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetElementById() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze0mj3thl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementById",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze0mj3thl(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38217);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38218);Document doc = Jsoup.parse(reference);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38219);Element div = doc.getElementById("div1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38220);assertEquals("div1", div.id());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38221);assertNull(doc.getElementById("none"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38222);Document doc2 = Jsoup.parse("<div id=1><div id=2><p>Hello <span id=2>world!</span></p></div></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38223);Element div2 = doc2.getElementById("2");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38224);assertEquals("div", div2.tagName()); // not the span
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38225);Element span = div2.child(0).getElementById("2"); // called from <p> context should be span
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38226);assertEquals("span", span.tagName());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testGetText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16rhyhkthv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16rhyhkthv(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38227);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38228);Document doc = Jsoup.parse(reference);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38229);assertEquals("Hello Another element", doc.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38230);assertEquals("Another element", doc.getElementsByTag("p").get(1).text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetChildText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aariesthz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetChildText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aariesthz(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38231);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38232);Document doc = Jsoup.parse("<p>Hello <b>there</b> now");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38233);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38234);assertEquals("Hello there now", p.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38235);assertEquals("Hello now", p.ownText());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testNormalisesText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1forhyzti4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNormalisesText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1forhyzti4(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38236);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38237);String h = "<p>Hello<p>There.</p> \n <p>Here <b>is</b> \n s<b>om</b>e text.";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38238);Document doc = Jsoup.parse(h);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38239);String text = doc.text();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38240);assertEquals("Hello There. Here is some text.", text);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testKeepsPreText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j7j9fpti9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testKeepsPreText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j7j9fpti9(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38241);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38242);String h = "<p>Hello \n \n there.</p> <div><pre>  What's \n\n  that?</pre>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38243);Document doc = Jsoup.parse(h);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38244);assertEquals("Hello there.   What's \n\n  that?", doc.text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testKeepsPreTextInCode() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vqca31tid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testKeepsPreTextInCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vqca31tid(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38245);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38246);String h = "<pre><code>code\n\ncode</code></pre>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38247);Document doc = Jsoup.parse(h);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38248);assertEquals("code\n\ncode", doc.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38249);assertEquals("<pre><code>code\n\ncode</code></pre>", doc.body().html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testKeepsPreTextAtDepth() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f8m7k3tii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testKeepsPreTextAtDepth",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f8m7k3tii(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38250);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38251);String h = "<pre><code><span><b>code\n\ncode</b></span></code></pre>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38252);Document doc = Jsoup.parse(h);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38253);assertEquals("code\n\ncode", doc.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38254);assertEquals("<pre><code><span><b>code\n\ncode</b></span></code></pre>", doc.body().html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testBrHasSpace() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1omr1rptin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testBrHasSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38255,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1omr1rptin(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38255);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38256);Document doc = Jsoup.parse("<p>Hello<br>there</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38257);assertEquals("Hello there", doc.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38258);assertEquals("Hello there", doc.select("p").first().ownText());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38259);doc = Jsoup.parse("<p>Hello <br> there</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38260);assertEquals("Hello there", doc.text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testWholeText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1blgycntit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testWholeText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38261,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1blgycntit(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38261);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38262);Document doc = Jsoup.parse("<p> Hello\nthere &nbsp;  </p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38263);assertEquals(" Hello\nthere \u00a0  ", doc.wholeText());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38264);doc = Jsoup.parse("<p>Hello  \n  there</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38265);assertEquals("Hello  \n  there", doc.wholeText());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38266);doc = Jsoup.parse("<p>Hello  <div>\n  there</div></p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38267);assertEquals("Hello  \n  there", doc.wholeText());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetSiblings() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111mostj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetSiblings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111mostj0(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38268);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38269);Document doc = Jsoup.parse("<div><p>Hello<p id=1>there<p>this<p>is<p>an<p id=last>element</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38270);Element p = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38271);assertEquals("there", p.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38272);assertEquals("Hello", p.previousElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38273);assertEquals("this", p.nextElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38274);assertEquals("Hello", p.firstElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38275);assertEquals("element", p.lastElementSibling().text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetSiblingsWithDuplicateContent() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mrsd8wtj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetSiblingsWithDuplicateContent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mrsd8wtj8(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38276);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38277);Document doc = Jsoup.parse("<div><p>Hello<p id=1>there<p>this<p>this<p>is<p>an<p id=last>element</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38278);Element p = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38279);assertEquals("there", p.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38280);assertEquals("Hello", p.previousElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38281);assertEquals("this", p.nextElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38282);assertEquals("this", p.nextElementSibling().nextElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38283);assertEquals("is", p.nextElementSibling().nextElementSibling().nextElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38284);assertEquals("Hello", p.firstElementSibling().text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38285);assertEquals("element", p.lastElementSibling().text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetParents() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d7h64tji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetParents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d7h64tji(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38286);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38287);Document doc = Jsoup.parse("<div><p>Hello <span>there</span></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38288);Element span = doc.select("span").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38289);Elements parents = span.parents();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38290);assertEquals(4, parents.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38291);assertEquals("p", parents.get(0).tagName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38292);assertEquals("div", parents.get(1).tagName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38293);assertEquals("body", parents.get(2).tagName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38294);assertEquals("html", parents.get(3).tagName());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testElementSiblingIndex() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fc8h3ztjr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testElementSiblingIndex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fc8h3ztjr(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38295);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38296);Document doc = Jsoup.parse("<div><p>One</p>...<p>Two</p>...<p>Three</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38297);Elements ps = doc.select("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38298);assertTrue(0 == ps.get(0).elementSiblingIndex());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38299);assertTrue(1 == ps.get(1).elementSiblingIndex());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38300);assertTrue(2 == ps.get(2).elementSiblingIndex());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testElementSiblingIndexSameContent() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybwwgwtjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testElementSiblingIndexSameContent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybwwgwtjx(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38301);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38302);Document doc = Jsoup.parse("<div><p>One</p>...<p>One</p>...<p>One</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38303);Elements ps = doc.select("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38304);assertTrue(0 == ps.get(0).elementSiblingIndex());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38305);assertTrue(1 == ps.get(1).elementSiblingIndex());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38306);assertTrue(2 == ps.get(2).elementSiblingIndex());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetElementsWithClass() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ltsrr2tk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ltsrr2tk3(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38307);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38308);Document doc = Jsoup.parse("<div class='mellow yellow'><span class=mellow>Hello <b class='yellow'>Yellow!</b></span><p>Empty</p></div>");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38309);List<Element> els = doc.getElementsByClass("mellow");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38310);assertEquals(2, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38311);assertEquals("div", els.get(0).tagName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38312);assertEquals("span", els.get(1).tagName());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38313);List<Element> els2 = doc.getElementsByClass("yellow");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38314);assertEquals(2, els2.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38315);assertEquals("div", els2.get(0).tagName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38316);assertEquals("b", els2.get(1).tagName());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38317);List<Element> none = doc.getElementsByClass("solo");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38318);assertEquals(0, none.size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetElementsWithAttribute() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_139ili6tkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_139ili6tkf(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38319);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38320);Document doc = Jsoup.parse("<div style='bold'><p title=qux><p><b style></b></p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38321);List<Element> els = doc.getElementsByAttribute("style");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38322);assertEquals(2, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38323);assertEquals("div", els.get(0).tagName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38324);assertEquals("b", els.get(1).tagName());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38325);List<Element> none = doc.getElementsByAttribute("class");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38326);assertEquals(0, none.size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetElementsWithAttributeDash() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4af84tkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithAttributeDash",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4af84tkn(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38327);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38328);Document doc = Jsoup.parse("<meta http-equiv=content-type value=utf8 id=1> <meta name=foo content=bar id=2> <div http-equiv=content-type value=utf8 id=3>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38329);Elements meta = doc.select("meta[http-equiv=content-type], meta[charset]");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38330);assertEquals(1, meta.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38331);assertEquals("1", meta.first().id());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetElementsWithAttributeValue() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lt3wjtks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetElementsWithAttributeValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lt3wjtks(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38332);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38333);Document doc = Jsoup.parse("<div style='bold'><p><p><b style></b></p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38334);List<Element> els = doc.getElementsByAttributeValue("style", "bold");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38335);assertEquals(1, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38336);assertEquals("div", els.get(0).tagName());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38337);List<Element> none = doc.getElementsByAttributeValue("style", "none");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38338);assertEquals(0, none.size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testClassDomMethods() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dq54ubtkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClassDomMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dq54ubtkz(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38339);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38340);Document doc = Jsoup.parse("<div><span class=' mellow yellow '>Hello <b>Yellow</b></span></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38341);List<Element> els = doc.getElementsByAttribute("class");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38342);Element span = els.get(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38343);assertEquals("mellow yellow", span.className());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38344);assertTrue(span.hasClass("mellow"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38345);assertTrue(span.hasClass("yellow"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38346);Set<String> classes = span.classNames();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38347);assertEquals(2, classes.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38348);assertTrue(classes.contains("mellow"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38349);assertTrue(classes.contains("yellow"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38350);assertEquals("", doc.className());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38351);classes = doc.classNames();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38352);assertEquals(0, classes.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38353);assertFalse(doc.hasClass("mellow"));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testHasClassDomMethods() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p22z15tle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHasClassDomMethods",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p22z15tle(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38354);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38355);Tag tag = Tag.valueOf("a");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38356);Attributes attribs = new Attributes();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38357);Element el = new Element(tag, "", attribs);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38358);attribs.put("class", "toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38359);boolean hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38360);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38361);attribs.put("class", " toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38362);hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38363);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38364);attribs.put("class", "toto ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38365);hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38366);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38367);attribs.put("class", "\ttoto ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38368);hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38369);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38370);attribs.put("class", "  toto ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38371);hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38372);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38373);attribs.put("class", "ab");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38374);hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38375);assertFalse(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38376);attribs.put("class", "     ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38377);hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38378);assertFalse(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38379);attribs.put("class", "tototo");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38380);hasClass = el.hasClass("toto");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38381);assertFalse(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38382);attribs.put("class", "raulpismuth  ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38383);hasClass = el.hasClass("raulpismuth");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38384);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38385);attribs.put("class", " abcd  raulpismuth efgh ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38386);hasClass = el.hasClass("raulpismuth");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38387);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38388);attribs.put("class", " abcd efgh raulpismuth");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38389);hasClass = el.hasClass("raulpismuth");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38390);assertTrue(hasClass);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38391);attribs.put("class", " abcd efgh raulpismuth ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38392);hasClass = el.hasClass("raulpismuth");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38393);assertTrue(hasClass);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    
    @Test public void testClassUpdates() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mr4mujtmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClassUpdates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mr4mujtmi(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38394);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38395);Document doc = Jsoup.parse("<div class='mellow yellow'></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38396);Element div = doc.select("div").first();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38397);div.addClass("green");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38398);assertEquals("mellow yellow green", div.className());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38399);div.removeClass("red"); // noop
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38400);div.removeClass("yellow");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38401);assertEquals("mellow green", div.className());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38402);div.toggleClass("green").toggleClass("red");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38403);assertEquals("mellow red", div.className());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testOuterHtml() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g25sm3tms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testOuterHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g25sm3tms(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38404);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38405);Document doc = Jsoup.parse("<div title='Tags &amp;c.'><img src=foo.png><p><!-- comment -->Hello<p>there");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38406);assertEquals("<html><head></head><body><div title=\"Tags &amp;c.\"><img src=\"foo.png\"><p><!-- comment -->Hello</p><p>there</p></div></body></html>",
                TextUtil.stripNewlines(doc.outerHtml()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testInnerHtml() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4p7vatmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testInnerHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4p7vatmv(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38407);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38408);Document doc = Jsoup.parse("<div>\n <p>Hello</p> </div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38409);assertEquals("<p>Hello</p>", doc.getElementsByTag("div").get(0).html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testFormatHtml() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12awshntmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testFormatHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38410,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12awshntmy(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38410);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38411);Document doc = Jsoup.parse("<title>Format test</title><div><p>Hello <span>jsoup <span>users</span></span></p><p>Good.</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38412);assertEquals("<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>Hello <span>jsoup <span>users</span></span></p>\n   <p>Good.</p>\n  </div>\n </body>\n</html>", doc.html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testFormatOutline() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fs7vggtn1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testFormatOutline",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fs7vggtn1(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38413);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38414);Document doc = Jsoup.parse("<title>Format test</title><div><p>Hello <span>jsoup <span>users</span></span></p><p>Good.</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38415);doc.outputSettings().outline(true);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38416);assertEquals("<html>\n <head>\n  <title>Format test</title>\n </head>\n <body>\n  <div>\n   <p>\n    Hello \n    <span>\n     jsoup \n     <span>users</span>\n    </span>\n   </p>\n   <p>Good.</p>\n  </div>\n </body>\n</html>", doc.html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testSetIndent() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l7eynxtn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetIndent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l7eynxtn5(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38417);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38418);Document doc = Jsoup.parse("<div><p>Hello\nthere</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38419);doc.outputSettings().indentAmount(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38420);assertEquals("<html>\n<head></head>\n<body>\n<div>\n<p>Hello there</p>\n</div>\n</body>\n</html>", doc.html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testNotPretty() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h190bmtn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNotPretty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h190bmtn9(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38421);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38422);Document doc = Jsoup.parse("<div>   \n<p>Hello\n there\n</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38423);doc.outputSettings().prettyPrint(false);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38424);assertEquals("<html><head></head><body><div>   \n<p>Hello\n there\n</p></div></body></html>", doc.html());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38425);Element div = doc.select("div").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38426);assertEquals("   \n<p>Hello\n there\n</p>", div.html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testEmptyElementFormatHtml() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vzruzutnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testEmptyElementFormatHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vzruzutnf(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38427);
        // don't put newlines into empty blocks
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38428);Document doc = Jsoup.parse("<section><div></div></section>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38429);assertEquals("<section>\n <div></div>\n</section>", doc.select("section").first().outerHtml());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testNoIndentOnScriptAndStyle() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dx63zqtni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNoIndentOnScriptAndStyle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dx63zqtni(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38430);
        // don't newline+indent closing </script> and </style> tags
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38431);Document doc = Jsoup.parse("<script>one\ntwo</script>\n<style>three\nfour</style>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38432);assertEquals("<script>one\ntwo</script> \n<style>three\nfour</style>", doc.head().html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testContainerOutput() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lmp87tnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testContainerOutput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lmp87tnl(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38433);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38434);Document doc = Jsoup.parse("<title>Hello there</title> <div><p>Hello</p><p>there</p></div> <div>Another</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38435);assertEquals("<title>Hello there</title>", doc.select("title").first().outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38436);assertEquals("<div>\n <p>Hello</p>\n <p>there</p>\n</div>", doc.select("div").first().outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38437);assertEquals("<div>\n <p>Hello</p>\n <p>there</p>\n</div> \n<div>\n Another\n</div>", doc.select("body").first().html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testSetText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xz7x5otnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xz7x5otnq(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38438);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38439);String h = "<div id=1>Hello <p>there <b>now</b></p></div>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38440);Document doc = Jsoup.parse(h);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38441);assertEquals("Hello there now", doc.text()); // need to sort out node whitespace
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38442);assertEquals("there now", doc.select("p").get(0).text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38443);Element div = doc.getElementById("1").text("Gone");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38444);assertEquals("Gone", div.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38445);assertEquals(0, doc.select("p").size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testAddNewElement() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11ufkfmtny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddNewElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38446,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11ufkfmtny(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38446);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38447);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38448);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38449);div.appendElement("p").text("there");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38450);div.appendElement("P").attr("CLASS", "second").text("now");
        // manually specifying tag and attributes should maintain case based on parser settings
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38451);assertEquals("<html><head></head><body><div id=\"1\"><p>Hello</p><p>there</p><p class=\"second\">now</p></div></body></html>",
                TextUtil.stripNewlines(doc.html()));

        // check sibling index (with short circuit on reindexChildren):
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38452);Elements ps = doc.select("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38453);for (int i = 0; (((i < ps.size())&&(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38454)!=0|true))||(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38455)==0&false)); i++) {{
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38456);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testAddBooleanAttribute() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1bjlito9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddBooleanAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1bjlito9(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38457);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38458);Element div = new Element(Tag.valueOf("div"), "");
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38459);div.attr("true", true);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38460);div.attr("false", "value");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38461);div.attr("false", false);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38462);assertTrue(div.hasAttr("true"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38463);assertEquals("", div.attr("true"));
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38464);List<Attribute> attributes = div.attributes().asList();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38465);assertEquals("There should be one attribute", 1, attributes.size());
		__CLR4_4_1tgztgzlh9yvhpm.R.inc(38466);assertTrue("Attribute should be boolean", attributes.get(0) instanceof BooleanAttribute);
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38467);assertFalse(div.hasAttr("false"));
 
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38468);assertEquals("<div true></div>", div.outerHtml());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}    

    @Test public void testAppendRowToTable() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u83hf0tol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAppendRowToTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u83hf0tol(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38469);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38470);Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38471);Element table = doc.select("tbody").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38472);table.append("<tr><td>2</td></tr>");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38473);assertEquals("<table><tbody><tr><td>1</td></tr><tr><td>2</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

        @Test public void testPrependRowToTable() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14pqbpgtoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependRowToTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14pqbpgtoq(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38474);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38475);Document doc = Jsoup.parse("<table><tr><td>1</td></tr></table>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38476);Element table = doc.select("tbody").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38477);table.prepend("<tr><td>2</td></tr>");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38478);assertEquals("<table><tbody><tr><td>2</td></tr><tr><td>1</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));

        // check sibling index (reindexChildren):
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38479);Elements ps = doc.select("tr");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38480);for (int i = 0; (((i < ps.size())&&(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38481)!=0|true))||(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38482)==0&false)); i++) {{
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38483);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testPrependElement() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n4r9xjtp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n4r9xjtp0(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38484);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38485);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38486);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38487);div.prependElement("p").text("Before");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38488);assertEquals("Before", div.child(0).text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38489);assertEquals("Hello", div.child(1).text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testAddNewText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t4hp6ttp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddNewText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38490,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t4hp6ttp6(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38490);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38491);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38492);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38493);div.appendText(" there & now >");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38494);assertEquals("<p>Hello</p> there &amp; now &gt;", TextUtil.stripNewlines(div.html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testPrependText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8o2dstpb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8o2dstpb(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38495);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38496);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38497);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38498);div.prependText("there & now > ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38499);assertEquals("there & now > Hello", div.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38500);assertEquals("there &amp; now &gt; <p>Hello</p>", TextUtil.stripNewlines(div.html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class) public void testThrowsOnAddNullText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fisd2atph();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,115,79,110,65,100,100,78,117,108,108,84,101,120,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testThrowsOnAddNullText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fisd2atph(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38501);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38502);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38503);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38504);div.appendText(null);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)  public void testThrowsOnPrependNullText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyjl0rtpl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,84,104,114,111,119,115,79,110,80,114,101,112,101,110,100,78,117,108,108,84,101,120,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testThrowsOnPrependNullText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38505,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyjl0rtpl(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38505);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38506);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38507);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38508);div.prependText(null);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testAddNewHtml() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c5q9abtpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAddNewHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c5q9abtpp(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38509);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38510);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38511);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38512);div.append("<p>there</p><p>now</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38513);assertEquals("<p>Hello</p><p>there</p><p>now</p>", TextUtil.stripNewlines(div.html()));

        // check sibling index (no reindexChildren):
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38514);Elements ps = doc.select("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38515);for (int i = 0; (((i < ps.size())&&(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38516)!=0|true))||(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38517)==0&false)); i++) {{
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38518);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testPrependNewHtml() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1et185ytpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPrependNewHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1et185ytpz(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38519);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38520);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38521);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38522);div.prepend("<p>there</p><p>now</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38523);assertEquals("<p>there</p><p>now</p><p>Hello</p>", TextUtil.stripNewlines(div.html()));

        // check sibling index (reindexChildren):
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38524);Elements ps = doc.select("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38525);for (int i = 0; (((i < ps.size())&&(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38526)!=0|true))||(__CLR4_4_1tgztgzlh9yvhpm.R.iget(38527)==0&false)); i++) {{
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38528);assertEquals(i, ps.get(i).siblingIndex);
        }
    }}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void testSetHtml() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k34owytq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38529,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k34owytq9(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38529);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38530);Document doc = Jsoup.parse("<div id=1><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38531);Element div = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38532);div.html("<p>there</p><p>now</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38533);assertEquals("<p>there</p><p>now</p>", TextUtil.stripNewlines(div.html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testSetHtmlTitle() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yl3ssctqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testSetHtmlTitle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yl3ssctqe(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38534);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38535);Document doc = Jsoup.parse("<html><head id=2><title id=1></title></head></html>");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38536);Element title = doc.getElementById("1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38537);title.html("good");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38538);assertEquals("good", title.html());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38539);title.html("<i>bad</i>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38540);assertEquals("&lt;i&gt;bad&lt;/i&gt;", title.html());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38541);Element head = doc.getElementById("2");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38542);head.html("<title><i>bad</i></title>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38543);assertEquals("<title>&lt;i&gt;bad&lt;/i&gt;</title>", head.html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testWrap() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8mz0jtqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testWrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8mz0jtqo(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38544);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38545);Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38546);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38547);p.wrap("<div class='head'></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38548);assertEquals("<div><div class=\"head\"><p>Hello</p></div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38549);Element ret = p.wrap("<div><div class=foo></div><p>What?</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38550);assertEquals("<div><div class=\"head\"><div><div class=\"foo\"><p>Hello</p></div><p>What?</p></div></div><p>There</p></div>",
                TextUtil.stripNewlines(doc.body().html()));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38551);assertEquals(ret, p);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void before() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd8owqtqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.before",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd8owqtqw(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38552);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38553);Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38554);Element p1 = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38555);p1.before("<div>one</div><div>two</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38556);assertEquals("<div><div>one</div><div>two</div><p>Hello</p><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38557);doc.select("p").last().before("<p>Three</p><!-- four -->");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38558);assertEquals("<div><div>one</div><div>two</div><p>Hello</p><p>Three</p><!-- four --><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
    
    @Test public void after() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4au71tr3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.after",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4au71tr3(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38559);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38560);Document doc = Jsoup.parse("<div><p>Hello</p><p>There</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38561);Element p1 = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38562);p1.after("<div>one</div><div>two</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38563);assertEquals("<div><p>Hello</p><div>one</div><div>two</div><p>There</p></div>", TextUtil.stripNewlines(doc.body().html()));
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38564);doc.select("p").last().after("<p>Three</p><!-- four -->");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38565);assertEquals("<div><p>Hello</p><div>one</div><div>two</div><p>There</p><p>Three</p><!-- four --></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testWrapWithRemainder() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ha5oqtra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testWrapWithRemainder",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ha5oqtra(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38566);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38567);Document doc = Jsoup.parse("<div><p>Hello</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38568);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38569);p.wrap("<div class='head'></div><p>There!</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38570);assertEquals("<div><div class=\"head\"><p>Hello</p><p>There!</p></div></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testHasText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zhj8mctrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHasText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zhj8mctrf(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38571);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38572);Document doc = Jsoup.parse("<div><p>Hello</p><p></p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38573);Element div = doc.select("div").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38574);Elements ps = doc.select("p");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38575);assertTrue(div.hasText());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38576);assertTrue(ps.first().hasText());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38577);assertFalse(ps.last().hasText());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void dataset() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1to8r7jtrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.dataset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1to8r7jtrm(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38578);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38579);Document doc = Jsoup.parse("<div id=1 data-name=jsoup class=new data-package=jar>Hello</div><p id=2>Hello</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38580);Element div = doc.select("div").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38581);Map<String, String> dataset = div.dataset();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38582);Attributes attributes = div.attributes();

        // size, get, set, add, remove
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38583);assertEquals(2, dataset.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38584);assertEquals("jsoup", dataset.get("name"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38585);assertEquals("jar", dataset.get("package"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38586);dataset.put("name", "jsoup updated");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38587);dataset.put("language", "java");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38588);dataset.remove("package");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38589);assertEquals(2, dataset.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38590);assertEquals(4, attributes.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38591);assertEquals("jsoup updated", attributes.get("data-name"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38592);assertEquals("jsoup updated", dataset.get("name"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38593);assertEquals("java", attributes.get("data-language"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38594);assertEquals("java", dataset.get("language"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38595);attributes.put("data-food", "bacon");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38596);assertEquals(3, dataset.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38597);assertEquals("bacon", dataset.get("food"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38598);attributes.put("data-", "empty");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38599);assertEquals(null, dataset.get("")); // data- is not a data attribute

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38600);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38601);assertEquals(0, p.dataset().size());

    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void parentlessToString() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ysvcnetsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.parentlessToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ysvcnetsa(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38602);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38603);Document doc = Jsoup.parse("<img src='foo'>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38604);Element img = doc.select("img").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38605);assertEquals("<img src=\"foo\">", img.toString());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38606);img.remove(); // lost its parent
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38607);assertEquals("<img src=\"foo\">", img.toString());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testClone() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejytsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejytsg(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38608);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38609);Document doc = Jsoup.parse("<div><p>One<p><span>Two</div>");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38610);Element p = doc.select("p").get(1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38611);Element clone = p.clone();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38612);assertNull(clone.parent()); // should be orphaned
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38613);assertEquals(0, clone.siblingIndex);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38614);assertEquals(1, p.siblingIndex);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38615);assertNotNull(p.parent());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38616);clone.append("<span>Three");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38617);assertEquals("<p><span>Two</span><span>Three</span></p>", TextUtil.stripNewlines(clone.outerHtml()));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38618);assertEquals("<div><p>One</p><p><span>Two</span></p></div>", TextUtil.stripNewlines(doc.body().html())); // not modified

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38619);doc.body().appendChild(clone); // adopt
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38620);assertNotNull(clone.parent());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38621);assertEquals("<div><p>One</p><p><span>Two</span></p></div><p><span>Two</span><span>Three</span></p>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testClonesClassnames() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gaw89ttsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClonesClassnames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gaw89ttsu(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38622);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38623);Document doc = Jsoup.parse("<div class='one two'></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38624);Element div = doc.select("div").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38625);Set<String> classes = div.classNames();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38626);assertEquals(2, classes.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38627);assertTrue(classes.contains("one"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38628);assertTrue(classes.contains("two"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38629);Element copy = div.clone();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38630);Set<String> copyClasses = copy.classNames();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38631);assertEquals(2, copyClasses.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38632);assertTrue(copyClasses.contains("one"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38633);assertTrue(copyClasses.contains("two"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38634);copyClasses.add("three");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38635);copyClasses.remove("one");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38636);assertTrue(classes.contains("one"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38637);assertFalse(classes.contains("three"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38638);assertFalse(copyClasses.contains("one"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38639);assertTrue(copyClasses.contains("three"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38640);assertEquals("", div.html());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38641);assertEquals("", copy.html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testShallowClone() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywl5fitte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testShallowClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywl5fitte(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38642);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38643);String base = "http://example.com/";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38644);Document doc = Jsoup.parse("<div id=1 class=one><p id=2 class=two>One", base);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38645);Element d = doc.selectFirst("div");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38646);Element p = doc.selectFirst("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38647);TextNode t = p.textNodes().get(0);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38648);Element d2 = d.shallowClone();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38649);Element p2 = p.shallowClone();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38650);TextNode t2 = (TextNode) t.shallowClone();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38651);assertEquals(1, d.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38652);assertEquals(0, d2.childNodeSize());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38653);assertEquals(1, p.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38654);assertEquals(0, p2.childNodeSize());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38655);assertEquals("", p2.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38656);assertEquals("One", t2.text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38657);assertEquals("two", p2.className());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38658);p2.removeClass("two");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38659);assertEquals("two", p.className());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38660);d2.append("<p id=3>Three");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38661);assertEquals(1, d2.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38662);assertEquals("Three", d2.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38663);assertEquals("One", d.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38664);assertEquals(base, d2.baseUri());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testTagNameSet() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ydkepitu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testTagNameSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ydkepitu1(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38665);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38666);Document doc = Jsoup.parse("<div><i>Hello</i>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38667);doc.select("i").first().tagName("em");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38668);assertEquals(0, doc.select("i").size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38669);assertEquals(1, doc.select("em").size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38670);assertEquals("<em>Hello</em>", doc.select("div").first().html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testHtmlContainsOuter() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vrulratu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHtmlContainsOuter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vrulratu7(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38671);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38672);Document doc = Jsoup.parse("<title>Check</title> <div>Hello there</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38673);doc.outputSettings().indentAmount(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38674);assertTrue(doc.html().contains(doc.select("title").outerHtml()));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38675);assertTrue(doc.html().contains(doc.select("div").outerHtml()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetTextNodes() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tqbpjtuc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetTextNodes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tqbpjtuc(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38676);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38677);Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38678);List<TextNode> textNodes = doc.select("p").first().textNodes();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38679);assertEquals(3, textNodes.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38680);assertEquals("One ", textNodes.get(0).text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38681);assertEquals(" Three ", textNodes.get(1).text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38682);assertEquals(" Four", textNodes.get(2).text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38683);assertEquals(0, doc.select("br").first().textNodes().size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testManipulateTextNodes() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4agchtuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testManipulateTextNodes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4agchtuk(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38684);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38685);Document doc = Jsoup.parse("<p>One <span>Two</span> Three <br> Four</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38686);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38687);List<TextNode> textNodes = p.textNodes();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38688);textNodes.get(1).text(" three-more ");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38689);textNodes.get(2).splitText(3).text("-ur");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38690);assertEquals("One Two three-more Fo-ur", p.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38691);assertEquals("One three-more Fo-ur", p.ownText());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38692);assertEquals(4, p.textNodes().size()); // grew because of split
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testGetDataNodes() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ho5qeutut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testGetDataNodes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38693,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ho5qeutut(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38693);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38694);Document doc = Jsoup.parse("<script>One Two</script> <style>Three Four</style> <p>Fix Six</p>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38695);Element script = doc.select("script").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38696);Element style = doc.select("style").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38697);Element p = doc.select("p").first();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38698);List<DataNode> scriptData = script.dataNodes();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38699);assertEquals(1, scriptData.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38700);assertEquals("One Two", scriptData.get(0).getWholeData());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38701);List<DataNode> styleData = style.dataNodes();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38702);assertEquals(1, styleData.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38703);assertEquals("Three Four", styleData.get(0).getWholeData());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38704);List<DataNode> pData = p.dataNodes();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38705);assertEquals(0, pData.size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void elementIsNotASiblingOfItself() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kx9j7ntv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.elementIsNotASiblingOfItself",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kx9j7ntv6(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38706);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38707);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38708);Element p2 = doc.select("p").get(1);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38709);assertEquals("Two", p2.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38710);Elements els = p2.siblingElements();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38711);assertEquals(2, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38712);assertEquals("<p>One</p>", els.get(0).outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38713);assertEquals("<p>Three</p>", els.get(1).outerHtml());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testChildThrowsIndexOutOfBoundsOnMissing() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wtao1btve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testChildThrowsIndexOutOfBoundsOnMissing",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wtao1btve(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38714);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38715);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38716);Element div = doc.select("div").first();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38717);assertEquals(2, div.children().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38718);assertEquals("One", div.child(0).text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38719);try {
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38720);div.child(3);
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38721);fail("Should throw index out of bounds");
        } catch (IndexOutOfBoundsException e) {}
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void moveByAppend() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1es5nbdtvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.moveByAppend",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38722,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1es5nbdtvm(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38722);
        // test for https://github.com/jhy/jsoup/issues/239
        // can empty an element and append its children to another element
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38723);Document doc = Jsoup.parse("<div id=1>Text <p>One</p> Text <p>Two</p></div><div id=2></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38724);Element div1 = doc.select("div").get(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38725);Element div2 = doc.select("div").get(1);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38726);assertEquals(4, div1.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38727);List<Node> children = div1.childNodes();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38728);assertEquals(4, children.size());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38729);div2.insertChildren(0, children);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38730);assertEquals(0, children.size()); // children is backed by div1.childNodes, moved, so should be 0 now
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38731);assertEquals(0, div1.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38732);assertEquals(4, div2.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38733);assertEquals("<div id=\"1\"></div>\n<div id=\"2\">\n Text \n <p>One</p> Text \n <p>Two</p>\n</div>",
            doc.body().html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void insertChildrenArgumentValidation() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uv1obvtvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.insertChildrenArgumentValidation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uv1obvtvy(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38734);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38735);Document doc = Jsoup.parse("<div id=1>Text <p>One</p> Text <p>Two</p></div><div id=2></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38736);Element div1 = doc.select("div").get(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38737);Element div2 = doc.select("div").get(1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38738);List<Node> children = div1.childNodes();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38739);try {
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38740);div2.insertChildren(6, children);
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38741);fail();
        } catch (IllegalArgumentException e) {}

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38742);try {
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38743);div2.insertChildren(-5, children);
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38744);fail();
        } catch (IllegalArgumentException e) {
        }

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38745);try {
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38746);div2.insertChildren(0, (Collection<? extends Node>) null);
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38747);fail();
        } catch (IllegalArgumentException e) {
        }
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void insertChildrenAtPosition() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a31e0rtwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.insertChildrenAtPosition",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a31e0rtwc(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38748);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38749);Document doc = Jsoup.parse("<div id=1>Text1 <p>One</p> Text2 <p>Two</p></div><div id=2>Text3 <p>Three</p></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38750);Element div1 = doc.select("div").get(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38751);Elements p1s = div1.select("p");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38752);Element div2 = doc.select("div").get(1);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38753);assertEquals(2, div2.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38754);div2.insertChildren(-1, p1s);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38755);assertEquals(2, div1.childNodeSize()); // moved two out
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38756);assertEquals(4, div2.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38757);assertEquals(3, p1s.get(1).siblingIndex()); // should be last

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38758);List<Node> els = new ArrayList<>();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38759);Element el1 = new Element(Tag.valueOf("span"), "").text("Span1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38760);Element el2 = new Element(Tag.valueOf("span"), "").text("Span2");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38761);TextNode tn1 = new TextNode("Text4");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38762);els.add(el1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38763);els.add(el2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38764);els.add(tn1);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38765);assertNull(el1.parent());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38766);div2.insertChildren(-2, els);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38767);assertEquals(div2, el1.parent());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38768);assertEquals(7, div2.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38769);assertEquals(3, el1.siblingIndex());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38770);assertEquals(4, el2.siblingIndex());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38771);assertEquals(5, tn1.siblingIndex());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void insertChildrenAsCopy() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119vvvqtx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.insertChildrenAsCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119vvvqtx0(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38772);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38773);Document doc = Jsoup.parse("<div id=1>Text <p>One</p> Text <p>Two</p></div><div id=2></div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38774);Element div1 = doc.select("div").get(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38775);Element div2 = doc.select("div").get(1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38776);Elements ps = doc.select("p").clone();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38777);ps.first().text("One cloned");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38778);div2.insertChildren(-1, ps);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38779);assertEquals(4, div1.childNodeSize()); // not moved -- cloned
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38780);assertEquals(2, div2.childNodeSize());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38781);assertEquals("<div id=\"1\">Text <p>One</p> Text <p>Two</p></div><div id=\"2\"><p>One cloned</p><p>Two</p></div>",
            TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testCssPath() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f30h25txa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testCssPath",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f30h25txa(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38782);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38783);Document doc = Jsoup.parse("<div id=\"id1\">A</div><div>B</div><div class=\"c1 c2\">C</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38784);Element divA = doc.select("div").get(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38785);Element divB = doc.select("div").get(1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38786);Element divC = doc.select("div").get(2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38787);assertEquals(divA.cssSelector(), "#id1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38788);assertEquals(divB.cssSelector(), "html > body > div:nth-child(2)");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38789);assertEquals(divC.cssSelector(), "html > body > div.c1.c2");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38790);assertTrue(divA == doc.select(divA.cssSelector()).first());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38791);assertTrue(divB == doc.select(divB.cssSelector()).first());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38792);assertTrue(divC == doc.select(divC.cssSelector()).first());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}


    @Test
    public void testClassNames() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15y4o47txl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClassNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15y4o47txl(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38793);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38794);Document doc = Jsoup.parse("<div class=\"c1 c2\">C</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38795);Element div = doc.select("div").get(0);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38796);assertEquals("c1 c2", div.className());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38797);final Set<String> set1 = div.classNames();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38798);final Object[] arr1 = set1.toArray();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38799);assertTrue(arr1.length==2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38800);assertEquals("c1", arr1[0]);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38801);assertEquals("c2", arr1[1]);

        // Changes to the set should not be reflected in the Elements getters
       	__CLR4_4_1tgztgzlh9yvhpm.R.inc(38802);set1.add("c3");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38803);assertTrue(2==div.classNames().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38804);assertEquals("c1 c2", div.className());

        // Update the class names to a fresh set
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38805);final Set<String> newSet = new LinkedHashSet<>(3);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38806);newSet.addAll(set1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38807);newSet.add("c3");
        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38808);div.classNames(newSet);

        
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38809);assertEquals("c1 c2 c3", div.className());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38810);final Set<String> set2 = div.classNames();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38811);final Object[] arr2 = set2.toArray();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38812);assertTrue(arr2.length==3);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38813);assertEquals("c1", arr2[0]);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38814);assertEquals("c2", arr2[1]);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38815);assertEquals("c3", arr2[2]);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testHashAndEqualsAndValue() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyfns9ty8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHashAndEqualsAndValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38816,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyfns9ty8(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38816);
        // .equals and hashcode are identity. value is content.

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38817);String doc1 = "<div id=1><p class=one>One</p><p class=one>One</p><p class=one>Two</p><p class=two>One</p></div>" +
                "<div id=2><p class=one>One</p><p class=one>One</p><p class=one>Two</p><p class=two>One</p></div>";

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38818);Document doc = Jsoup.parse(doc1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38819);Elements els = doc.select("p");

        /*
        for (Element el : els) {
            System.out.println(el.hashCode() + " - " + el.outerHtml());
        }

        0 1534787905 - <p class="one">One</p>
        1 1534787905 - <p class="one">One</p>
        2 1539683239 - <p class="one">Two</p>
        3 1535455211 - <p class="two">One</p>
        4 1534787905 - <p class="one">One</p>
        5 1534787905 - <p class="one">One</p>
        6 1539683239 - <p class="one">Two</p>
        7 1535455211 - <p class="two">One</p>
        */
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38820);assertEquals(8, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38821);Element e0 = els.get(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38822);Element e1 = els.get(1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38823);Element e2 = els.get(2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38824);Element e3 = els.get(3);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38825);Element e4 = els.get(4);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38826);Element e5 = els.get(5);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38827);Element e6 = els.get(6);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38828);Element e7 = els.get(7);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38829);assertEquals(e0, e0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38830);assertTrue(e0.hasSameValue(e1));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38831);assertTrue(e0.hasSameValue(e4));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38832);assertTrue(e0.hasSameValue(e5));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38833);assertFalse(e0.equals(e2));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38834);assertFalse(e0.hasSameValue(e2));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38835);assertFalse(e0.hasSameValue(e3));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38836);assertFalse(e0.hasSameValue(e6));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38837);assertFalse(e0.hasSameValue(e7));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38838);assertEquals(e0.hashCode(), e0.hashCode());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38839);assertFalse(e0.hashCode() == (e2.hashCode()));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38840);assertFalse(e0.hashCode() == (e3).hashCode());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38841);assertFalse(e0.hashCode() == (e6).hashCode());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38842);assertFalse(e0.hashCode() == (e7).hashCode());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testRelativeUrls() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5pls9tyz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRelativeUrls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5pls9tyz(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38843);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38844);String html = "<body><a href='./one.html'>One</a> <a href='two.html'>two</a> <a href='../three.html'>Three</a> <a href='//example2.com/four/'>Four</a> <a href='https://example2.com/five/'>Five</a>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38845);Document doc = Jsoup.parse(html, "http://example.com/bar/");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38846);Elements els = doc.select("a");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38847);assertEquals("http://example.com/bar/one.html", els.get(0).absUrl("href"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38848);assertEquals("http://example.com/bar/two.html", els.get(1).absUrl("href"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38849);assertEquals("http://example.com/three.html", els.get(2).absUrl("href"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38850);assertEquals("http://example2.com/four/", els.get(3).absUrl("href"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38851);assertEquals("https://example2.com/five/", els.get(4).absUrl("href"));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void appendMustCorrectlyMoveChildrenInsideOneParentElement() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ji8ek3tz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.appendMustCorrectlyMoveChildrenInsideOneParentElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ji8ek3tz8(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38852);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38853);Document doc = new Document("");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38854);Element body = doc.appendElement("body");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38855);body.appendElement("div1");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38856);body.appendElement("div2");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38857);final Element div3 = body.appendElement("div3");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38858);div3.text("Check");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38859);final Element div4 = body.appendElement("div4");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38860);ArrayList<Element> toMove = new ArrayList<>();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38861);toMove.add(div3);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38862);toMove.add(div4);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38863);body.insertChildren(0, toMove);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38864);String result = doc.toString().replaceAll("\\s+", "");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38865);assertEquals("<body><div3>Check</div3><div4></div4><div1></div1><div2></div2></body>", result);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testHashcodeIsStableWithContentChanges() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecixp3tzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testHashcodeIsStableWithContentChanges",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecixp3tzm(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38866);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38867);Element root = new Element(Tag.valueOf("root"), "");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38868);HashSet<Element> set = new HashSet<>();
        // Add root node:
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38869);set.add(root);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38870);root.appendChild(new Element(Tag.valueOf("a"), ""));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38871);assertTrue(set.contains(root));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testNamespacedElements() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1liw1bttzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNamespacedElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1liw1bttzs(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38872);
        // Namespaces with ns:tag in HTML must be translated to ns|tag in CSS.
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38873);String html = "<html><body><fb:comments /></body></html>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38874);Document doc = Jsoup.parse(html, "http://example.com/bar/");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38875);Elements els = doc.select("fb|comments");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38876);assertEquals(1, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38877);assertEquals("html > body > fb|comments", els.get(0).cssSelector());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testChainedRemoveAttributes() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aueavktzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testChainedRemoveAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38878,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aueavktzy(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38878);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38879);String html = "<a one two three four>Text</a>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38880);Document doc = Jsoup.parse(html);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38881);Element a = doc.select("a").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38882);a
            .removeAttr("zero")
            .removeAttr("one")
            .removeAttr("two")
            .removeAttr("three")
            .removeAttr("four")
            .removeAttr("five");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38883);assertEquals("<a>Text</a>", a.outerHtml());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testLoopedRemoveAttributes() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxty5lu04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testLoopedRemoveAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38884,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxty5lu04(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38884);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38885);String html = "<a one two three four>Text</a><p foo>Two</p>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38886);Document doc = Jsoup.parse(html);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38887);for (Element el : doc.getAllElements()) {{
            __CLR4_4_1tgztgzlh9yvhpm.R.inc(38888);el.clearAttributes();
        }

        }__CLR4_4_1tgztgzlh9yvhpm.R.inc(38889);assertEquals("<a>Text</a>\n<p>Two</p>", doc.body().html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testIs() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0dasdu0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testIs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0dasdu0a(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38890);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38891);String html = "<div><p>One <a class=big>Two</a> Three</p><p>Another</p>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38892);Document doc = Jsoup.parse(html);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38893);Element p = doc.select("p").first();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38894);assertTrue(p.is("p"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38895);assertFalse(p.is("div"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38896);assertTrue(p.is("p:has(a)"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38897);assertTrue(p.is("p:first-child"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38898);assertFalse(p.is("p:last-child"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38899);assertTrue(p.is("*"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38900);assertTrue(p.is("div p"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38901);Element q = doc.select("p").last();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38902);assertTrue(q.is("p"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38903);assertTrue(q.is("p ~ p"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38904);assertTrue(q.is("p + p"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38905);assertTrue(q.is("p:last-child"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38906);assertFalse(q.is("p a"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38907);assertFalse(q.is("a"));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}


    @Test public void elementByTagName() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrrbrtu0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.elementByTagName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrrbrtu0s(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38908);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38909);Element a = new Element("P");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38910);assertTrue(a.tagName().equals("P"));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testChildrenElements() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16lfze9u0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testChildrenElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16lfze9u0v(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38911);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38912);String html = "<div><p><a>One</a></p><p><a>Two</a></p>Three</div><span>Four</span><foo></foo><img>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38913);Document doc = Jsoup.parse(html);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38914);Element div = doc.select("div").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38915);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38916);Element span = doc.select("span").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38917);Element foo = doc.select("foo").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38918);Element img = doc.select("img").first();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38919);Elements docChildren = div.children();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38920);assertEquals(2, docChildren.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38921);assertEquals("<p><a>One</a></p>", docChildren.get(0).outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38922);assertEquals("<p><a>Two</a></p>", docChildren.get(1).outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38923);assertEquals(3, div.childNodes().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38924);assertEquals("Three", div.childNodes().get(2).outerHtml());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38925);assertEquals(1, p.children().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38926);assertEquals("One", p.children().text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38927);assertEquals(0, span.children().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38928);assertEquals(1, span.childNodes().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38929);assertEquals("Four", span.childNodes().get(0).outerHtml());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38930);assertEquals(0, foo.children().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38931);assertEquals(0, foo.childNodes().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38932);assertEquals(0, img.children().size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38933);assertEquals(0, img.childNodes().size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testShadowElementsAreUpdated() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eodo6hu1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testShadowElementsAreUpdated",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38934,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eodo6hu1i(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38934);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38935);String html = "<div><p><a>One</a></p><p><a>Two</a></p>Three</div><span>Four</span><foo></foo><img>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38936);Document doc = Jsoup.parse(html);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38937);Element div = doc.select("div").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38938);Elements els = div.children();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38939);List<Node> nodes = div.childNodes();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38940);assertEquals(2, els.size()); // the two Ps
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38941);assertEquals(3, nodes.size()); // the "Three" textnode

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38942);Element p3 = new Element("p").text("P3");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38943);Element p4 = new Element("p").text("P4");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38944);div.insertChildren(1, p3);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38945);div.insertChildren(3, p4);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38946);Elements els2 = div.children();

        // first els should not have changed
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38947);assertEquals(2, els.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38948);assertEquals(4, els2.size());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38949);assertEquals("<p><a>One</a></p>\n" +
            "<p>P3</p>\n" +
            "<p><a>Two</a></p>\n" +
            "<p>P4</p>Three", div.html());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38950);assertEquals("P3", els2.get(1).text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38951);assertEquals("P4", els2.get(3).text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38952);p3.after("<span>Another</span");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38953);Elements els3 = div.children();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38954);assertEquals(5, els3.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38955);assertEquals("span", els3.get(2).tagName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38956);assertEquals("Another", els3.get(2).text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38957);assertEquals("<p><a>One</a></p>\n" +
            "<p>P3</p>\n" +
            "<span>Another</span>\n" +
            "<p><a>Two</a></p>\n" +
            "<p>P4</p>Three", div.html());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void classNamesAndAttributeNameIsCaseInsensitive() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w75vyau26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.classNamesAndAttributeNameIsCaseInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38958,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w75vyau26(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38958);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38959);String html = "<p Class='SomeText AnotherText'>One</p>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38960);Document doc = Jsoup.parse(html);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38961);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38962);assertEquals("SomeText AnotherText", p.className());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38963);assertTrue(p.classNames().contains("SomeText"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38964);assertTrue(p.classNames().contains("AnotherText"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38965);assertTrue(p.hasClass("SomeText"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38966);assertTrue(p.hasClass("sometext"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38967);assertTrue(p.hasClass("AnotherText"));
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38968);assertTrue(p.hasClass("anothertext"));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38969);Element p1 = doc.select(".SomeText").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38970);Element p2 = doc.select(".sometext").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38971);Element p3 = doc.select("[class=SomeText AnotherText]").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38972);Element p4 = doc.select("[Class=SomeText AnotherText]").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38973);Element p5 = doc.select("[class=sometext anothertext]").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38974);Element p6 = doc.select("[class=SomeText AnotherText]").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38975);Element p7 = doc.select("[class^=sometext]").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38976);Element p8 = doc.select("[class$=nothertext]").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38977);Element p9 = doc.select("[class^=sometext]").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38978);Element p10 = doc.select("[class$=AnotherText]").first();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38979);assertEquals("One", p1.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38980);assertEquals(p1, p2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38981);assertEquals(p1, p3);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38982);assertEquals(p1, p4);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38983);assertEquals(p1, p5);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38984);assertEquals(p1, p6);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38985);assertEquals(p1, p7);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38986);assertEquals(p1, p8);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38987);assertEquals(p1, p9);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38988);assertEquals(p1, p10);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

	@Test
	public void testAppendTo() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),38989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwfv76u31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testAppendTo",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38989,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwfv76u31(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(38989);
		__CLR4_4_1tgztgzlh9yvhpm.R.inc(38990);String parentHtml = "<div class='a'></div>";
		__CLR4_4_1tgztgzlh9yvhpm.R.inc(38991);String childHtml = "<div class='b'></div><p>Two</p>";

		__CLR4_4_1tgztgzlh9yvhpm.R.inc(38992);Document parentDoc = Jsoup.parse(parentHtml);
		__CLR4_4_1tgztgzlh9yvhpm.R.inc(38993);Element parent = parentDoc.body();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38994);Document childDoc = Jsoup.parse(childHtml);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38995);Element div = childDoc.select("div").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38996);Element p = childDoc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38997);Element appendTo1 = div.appendTo(parent);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38998);assertEquals(div, appendTo1);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(38999);Element appendTo2 = p.appendTo(div);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39000);assertEquals(p, appendTo2);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39001);assertEquals("<div class=\"a\"></div>\n<div class=\"b\">\n <p>Two</p>\n</div>", parentDoc.body().html());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39002);assertEquals("", childDoc.body().html()); // got moved out
	}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

	@Test public void testNormalizesNbspInText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bmo3heu3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNormalizesNbspInText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39003,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bmo3heu3f(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39003);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39004);String escaped = "You can't always get what you&nbsp;want.";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39005);String withNbsp = "You can't always get what you\u00a0want."; // there is an nbsp char in there
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39006);Document doc = Jsoup.parse("<p>" + escaped);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39007);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39008);assertEquals("You can't always get what you want.", p.text()); // text is normalized

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39009);assertEquals("<p>" + escaped + "</p>", p.outerHtml()); // html / whole text keeps &nbsp;
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39010);assertEquals(withNbsp, p.textNodes().get(0).getWholeText());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39011);assertEquals(160, withNbsp.charAt(29));

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39012);Element matched = doc.select("p:contains(get what you want)").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39013);assertEquals("p", matched.nodeName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39014);assertTrue(matched.is(":containsOwn(get what you want)"));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test public void testNormalizesInvisiblesInText() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ln6oh5u3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNormalizesInvisiblesInText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ln6oh5u3r(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39015);
        // return Character.getType(c) == 16 && (c == 8203 || c == 8204 || c == 8205 || c == 173);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39016);String escaped = "This&shy;is&#x200b;one&#x200c;long&#x200d;word";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39017);String decoded = "This\u00adis\u200bone\u200clong\u200dword"; // browser would not display those soft hyphens / other chars, so we don't want them in the text

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39018);Document doc = Jsoup.parse("<p>" + escaped);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39019);Element p = doc.select("p").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39020);doc.outputSettings().charset("ascii"); // so that the outer html is easier to see with escaped invisibles
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39021);assertEquals("Thisisonelongword", p.text()); // text is normalized
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39022);assertEquals("<p>" + escaped + "</p>", p.outerHtml()); // html / whole text keeps &shy etc;
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39023);assertEquals(decoded, p.textNodes().get(0).getWholeText());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39024);Element matched = doc.select("p:contains(Thisisonelongword)").first(); // really just oneloneword, no invisibles
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39025);assertEquals("p", matched.nodeName());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39026);assertTrue(matched.is(":containsOwn(Thisisonelongword)"));

    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
	
	@Test
	public void testRemoveBeforeIndex() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12mh8rou43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemoveBeforeIndex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12mh8rou43(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39027);
		__CLR4_4_1tgztgzlh9yvhpm.R.inc(39028);Document doc = Jsoup.parse(
	            "<html><body><div><p>before1</p><p>before2</p><p>XXX</p><p>after1</p><p>after2</p></div></body></html>",
	            "");
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39029);Element body = doc.select("body").first();
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39030);Elements elems = body.select("p:matchesOwn(XXX)");
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39031);Element xElem = elems.first();
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39032);Elements beforeX = xElem.parent().getElementsByIndexLessThan(xElem.elementSiblingIndex());

	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39033);for(Element p : beforeX) {{
	        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39034);p.remove();
	    }

	    }__CLR4_4_1tgztgzlh9yvhpm.R.inc(39035);assertEquals("<body><div><p>XXX</p><p>after1</p><p>after2</p></div></body>", TextUtil.stripNewlines(body.outerHtml()));
	}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
	
	@Test
	public void testRemoveAfterIndex() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hz82odu4c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemoveAfterIndex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hz82odu4c(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39036);
		 __CLR4_4_1tgztgzlh9yvhpm.R.inc(39037);Document doc2 = Jsoup.parse(
		            "<html><body><div><p>before1</p><p>before2</p><p>XXX</p><p>after1</p><p>after2</p></div></body></html>",
		            "");
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39038);Element body = doc2.select("body").first();
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39039);Elements elems = body.select("p:matchesOwn(XXX)");
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39040);Element xElem = elems.first();
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39041);Elements afterX = xElem.parent().getElementsByIndexGreaterThan(xElem.elementSiblingIndex());

	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39042);for(Element p : afterX) {{
	        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39043);p.remove();
	    }

	    }__CLR4_4_1tgztgzlh9yvhpm.R.inc(39044);assertEquals("<body><div><p>before1</p><p>before2</p><p>XXX</p></div></body>", TextUtil.stripNewlines(body.outerHtml()));
	}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
	
    @Test 
    public void whiteSpaceClassElement(){__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jfrngou4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.whiteSpaceClassElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jfrngou4l(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39045);
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39046);Tag tag = Tag.valueOf("a");
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39047);Attributes attribs = new Attributes();
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39048);Element el = new Element(tag, "", attribs);
	    
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39049);attribs.put("class", "abc ");
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39050);boolean hasClass = el.hasClass("ab");
	    __CLR4_4_1tgztgzlh9yvhpm.R.inc(39051);assertFalse(hasClass);
	}finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

	@Test
    public void testNextElementSiblingAfterClone() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rmjeibu4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNextElementSiblingAfterClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rmjeibu4s(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39052);
        // via https://github.com/jhy/jsoup/issues/951
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39053);String html = "<!DOCTYPE html><html lang=\"en\"><head></head><body><div>Initial element</div></body></html>";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39054);String expectedText = "New element";
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39055);String cloneExpect = "New element in clone";

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39056);Document original = Jsoup.parse(html);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39057);Document clone = original.clone();

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39058);Element originalElement = original.body().child(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39059);originalElement.after("<div>" + expectedText + "</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39060);Element originalNextElementSibling = originalElement.nextElementSibling();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39061);Element originalNextSibling = (Element) originalElement.nextSibling();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39062);assertEquals(expectedText, originalNextElementSibling.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39063);assertEquals(expectedText, originalNextSibling.text());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39064);Element cloneElement = clone.body().child(0);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39065);cloneElement.after("<div>" + cloneExpect + "</div>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39066);Element cloneNextElementSibling = cloneElement.nextElementSibling();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39067);Element cloneNextSibling = (Element) cloneElement.nextSibling();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39068);assertEquals(cloneExpect, cloneNextElementSibling.text());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39069);assertEquals(cloneExpect, cloneNextSibling.text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testRemovingEmptyClassAttributeWhenLastClassRemoved() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19e3oe5u5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemovingEmptyClassAttributeWhenLastClassRemoved",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19e3oe5u5a(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39070);
        // https://github.com/jhy/jsoup/issues/947
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39071);Document doc = Jsoup.parse("<img class=\"one two\" />");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39072);Element img = doc.select("img").first();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39073);img.removeClass("one");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39074);img.removeClass("two");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39075);assertFalse(doc.body().html().contains("class=\"\""));
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void booleanAttributeOutput() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bapalgu5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.booleanAttributeOutput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39076,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bapalgu5g(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39076);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39077);Document doc = Jsoup.parse("<img src=foo noshade='' nohref async=async autofocus=false>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39078);Element img = doc.selectFirst("img");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39079);assertEquals("<img src=\"foo\" noshade nohref async autofocus=\"false\">", img.outerHtml());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void textHasSpaceAfterBlockTags() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1581l9mu5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.textHasSpaceAfterBlockTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1581l9mu5k(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39080);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39081);Document doc = Jsoup.parse("<div>One</div>Two");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39082);assertEquals("One Two", doc.text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void textHasSpaceBetweenDivAndCenterTags() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hbzq5mu5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.textHasSpaceBetweenDivAndCenterTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39083,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hbzq5mu5n(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39083);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39084);Document doc = Jsoup.parse("<div>One</div><div>Two</div><center>Three</center><center>Four</center>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39085);assertEquals("One Two Three Four", doc.text());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testNextElementSiblings() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c0r9xtu5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testNextElementSiblings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c0r9xtu5q(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39086);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39087);Document doc = Jsoup.parse("<ul id='ul'>" +
            "<li id='a'>a</li>" +
            "<li id='b'>b</li>" +
            "<li id='c'>c</li>" +
            "</ul> Not An Element but a node" +
            "<div id='div'>" +
            "<li id='d'>d</li>" +
            "</div>");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39088);Element element = doc.getElementById("a");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39089);Elements elementSiblings = element.nextElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39090);assertNotNull(elementSiblings);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39091);assertEquals(2, elementSiblings.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39092);assertEquals("b", elementSiblings.get(0).id());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39093);assertEquals("c", elementSiblings.get(1).id());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39094);Element element1 = doc.getElementById("b");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39095);List<Element> elementSiblings1 = element1.nextElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39096);assertNotNull(elementSiblings1);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39097);assertEquals(1, elementSiblings1.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39098);assertEquals("c", elementSiblings1.get(0).id());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39099);Element element2 = doc.getElementById("c");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39100);List<Element> elementSiblings2 = element2.nextElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39101);assertEquals(0, elementSiblings2.size());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39102);Element ul = doc.getElementById("ul");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39103);List<Element> elementSiblings3 = ul.nextElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39104);assertNotNull(elementSiblings3);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39105);assertEquals(1, elementSiblings3.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39106);assertEquals("div", elementSiblings3.get(0).id());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39107);Element div = doc.getElementById("div");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39108);List<Element> elementSiblings4 = div.nextElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39109);assertEquals(0, elementSiblings4.size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testPreviousElementSiblings() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dxh7o5u6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testPreviousElementSiblings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dxh7o5u6e(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39110);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39111);Document doc = Jsoup.parse("<ul id='ul'>" +
            "<li id='a'>a</li>" +
            "<li id='b'>b</li>" +
            "<li id='c'>c</li>" +
            "</ul>" +
            "<div id='div'>" +
            "<li id='d'>d</li>" +
            "</div>");

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39112);Element element = doc.getElementById("b");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39113);Elements elementSiblings = element.previousElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39114);assertNotNull(elementSiblings);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39115);assertEquals(1, elementSiblings.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39116);assertEquals("a", elementSiblings.get(0).id());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39117);Element element1 = doc.getElementById("a");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39118);List<Element> elementSiblings1 = element1.previousElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39119);assertEquals(0, elementSiblings1.size());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39120);Element element2 = doc.getElementById("c");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39121);List<Element> elementSiblings2 = element2.previousElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39122);assertNotNull(elementSiblings2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39123);assertEquals(2, elementSiblings2.size());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39124);assertEquals("b", elementSiblings2.get(0).id());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39125);assertEquals("a", elementSiblings2.get(1).id());

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39126);Element ul = doc.getElementById("ul");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39127);List<Element> elementSiblings3 = ul.previousElementSiblings();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39128);assertEquals(0, elementSiblings3.size());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testClearAttributes() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17nps2vu6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testClearAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17nps2vu6x(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39129);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39130);Element el = new Element("a").attr("href", "http://example.com").text("Hello");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39131);assertEquals("<a href=\"http://example.com\">Hello</a>", el.outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39132);Element el2 = el.clearAttributes(); // really just force testing the return type is Element
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39133);assertSame(el, el2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39134);assertEquals("<a>Hello</a>", el2.outerHtml());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testRemoveAttr() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xil4q6u73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRemoveAttr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xil4q6u73(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39135);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39136);Element el = new Element("a")
            .attr("href", "http://example.com")
            .attr("id", "1")
            .text("Hello");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39137);assertEquals("<a href=\"http://example.com\" id=\"1\">Hello</a>", el.outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39138);Element el2 = el.removeAttr("href"); // really just force testing the return type is Element
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39139);assertSame(el, el2);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39140);assertEquals("<a id=\"1\">Hello</a>", el2.outerHtml());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testRoot() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qvzj9u79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testRoot",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qvzj9u79(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39141);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39142);Element el = new Element("a");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39143);el.append("<span>Hello</span>");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39144);assertEquals("<a><span>Hello</span></a>", el.outerHtml());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39145);Element span = el.selectFirst("span");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39146);assertNotNull(span);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39147);Element el2 = span.root();
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39148);assertSame(el, el2);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39149);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39150);Element div = doc.selectFirst("div");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39151);assertSame(doc, div.root());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39152);assertSame(doc, div.ownerDocument());
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void testTraverse() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gby3o5u7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.testTraverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gby3o5u7l(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39153);
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39154);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39155);Element div = doc.selectFirst("div");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39156);final AtomicInteger counter = new AtomicInteger(0);

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39157);Element div2 = div.traverse(new NodeVisitor() {

            @Override
            public void head(Node node, int depth) {try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39158);
                __CLR4_4_1tgztgzlh9yvhpm.R.inc(39159);counter.incrementAndGet();
            }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39160);

            }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
        });

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39161);assertEquals(7, counter.get());
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39162);assertEquals(div2, div);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

    @Test
    public void voidTestFilterCallReturnsElement() {__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceStart(getClass().getName(),39163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v57zksu7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1tgztgzlh9yvhpm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1tgztgzlh9yvhpm.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.ElementTest.voidTestFilterCallReturnsElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v57zksu7v(){try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39163);
        // doesn't actually test the filter so much as the return type for Element. See node.nodeFilter for an acutal test
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39164);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39165);Element div = doc.selectFirst("div");
        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39166);Element div2 = div.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39167);
                __CLR4_4_1tgztgzlh9yvhpm.R.inc(39168);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_4_1tgztgzlh9yvhpm.R.inc(39169);
                __CLR4_4_1tgztgzlh9yvhpm.R.inc(39170);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
        });

        __CLR4_4_1tgztgzlh9yvhpm.R.inc(39171);assertSame(div, div2);
    }finally{__CLR4_4_1tgztgzlh9yvhpm.R.flushNeeded();}}
}
