/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 Test TextNodes

 @author Jonathan Hedley, jonathan@hedley.net */
public class TextNodeTest {static class __CLR4_4_1uj9uj9lh9yvhrs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,39625,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void testBlank() {__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceStart(getClass().getName(),39573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s7z6qxuj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uj9uj9lh9yvhrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testBlank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39573,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s7z6qxuj9(){try{__CLR4_4_1uj9uj9lh9yvhrs.R.inc(39573);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39574);TextNode one = new TextNode("");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39575);TextNode two = new TextNode("     ");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39576);TextNode three = new TextNode("  \n\n   ");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39577);TextNode four = new TextNode("Hello");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39578);TextNode five = new TextNode("  \nHello ");

        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39579);assertTrue(one.isBlank());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39580);assertTrue(two.isBlank());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39581);assertTrue(three.isBlank());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39582);assertFalse(four.isBlank());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39583);assertFalse(five.isBlank());
    }finally{__CLR4_4_1uj9uj9lh9yvhrs.R.flushNeeded();}}
    
    @Test public void testTextBean() {__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceStart(getClass().getName(),39584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eff9m2ujk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uj9uj9lh9yvhrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testTextBean",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eff9m2ujk(){try{__CLR4_4_1uj9uj9lh9yvhrs.R.inc(39584);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39585);Document doc = Jsoup.parse("<p>One <span>two &amp;</span> three &amp;</p>");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39586);Element p = doc.select("p").first();

        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39587);Element span = doc.select("span").first();
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39588);assertEquals("two &", span.text());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39589);TextNode spanText = (TextNode) span.childNode(0);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39590);assertEquals("two &", spanText.text());
        
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39591);TextNode tn = (TextNode) p.childNode(2);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39592);assertEquals(" three &", tn.text());
        
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39593);tn.text(" POW!");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39594);assertEquals("One <span>two &amp;</span> POW!", TextUtil.stripNewlines(p.html()));

        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39595);tn.attr(tn.nodeName(), "kablam &");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39596);assertEquals("kablam &", tn.text());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39597);assertEquals("One <span>two &amp;</span>kablam &amp;", TextUtil.stripNewlines(p.html()));
    }finally{__CLR4_4_1uj9uj9lh9yvhrs.R.flushNeeded();}}

    @Test public void testSplitText() {__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceStart(getClass().getName(),39598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aoxzl0ujy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uj9uj9lh9yvhrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testSplitText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aoxzl0ujy(){try{__CLR4_4_1uj9uj9lh9yvhrs.R.inc(39598);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39599);Document doc = Jsoup.parse("<div>Hello there</div>");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39600);Element div = doc.select("div").first();
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39601);TextNode tn = (TextNode) div.childNode(0);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39602);TextNode tail = tn.splitText(6);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39603);assertEquals("Hello ", tn.getWholeText());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39604);assertEquals("there", tail.getWholeText());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39605);tail.text("there!");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39606);assertEquals("Hello there!", div.text());
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39607);assertTrue(tn.parent() == tail.parent());
    }finally{__CLR4_4_1uj9uj9lh9yvhrs.R.flushNeeded();}}

    @Test public void testSplitAnEmbolden() {__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceStart(getClass().getName(),39608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w53nfyuk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uj9uj9lh9yvhrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testSplitAnEmbolden",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w53nfyuk8(){try{__CLR4_4_1uj9uj9lh9yvhrs.R.inc(39608);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39609);Document doc = Jsoup.parse("<div>Hello there</div>");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39610);Element div = doc.select("div").first();
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39611);TextNode tn = (TextNode) div.childNode(0);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39612);TextNode tail = tn.splitText(6);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39613);tail.wrap("<b></b>");

        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39614);assertEquals("Hello <b>there</b>", TextUtil.stripNewlines(div.html())); // not great that we get \n<b>there there... must correct
    }finally{__CLR4_4_1uj9uj9lh9yvhrs.R.flushNeeded();}}

    @Test public void testWithSupplementaryCharacter(){__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceStart(getClass().getName(),39615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecmcmxukf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uj9uj9lh9yvhrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testWithSupplementaryCharacter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecmcmxukf(){try{__CLR4_4_1uj9uj9lh9yvhrs.R.inc(39615);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39616);Document doc = Jsoup.parse(new String(Character.toChars(135361)));
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39617);TextNode t = doc.body().textNodes().get(0);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39618);assertEquals(new String(Character.toChars(135361)), t.outerHtml().trim());
    }finally{__CLR4_4_1uj9uj9lh9yvhrs.R.flushNeeded();}}

    @Test public void testLeadNodesHaveNoChildren() {__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceStart(getClass().getName(),39619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_136d8y6ukj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uj9uj9lh9yvhrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uj9uj9lh9yvhrs.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.TextNodeTest.testLeadNodesHaveNoChildren",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_136d8y6ukj(){try{__CLR4_4_1uj9uj9lh9yvhrs.R.inc(39619);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39620);Document doc = Jsoup.parse("<div>Hello there</div>");
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39621);Element div = doc.select("div").first();
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39622);TextNode tn = (TextNode) div.childNode(0);
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39623);List<Node> nodes = tn.childNodes();
        __CLR4_4_1uj9uj9lh9yvhrs.R.inc(39624);assertEquals(0, nodes.size());
    }finally{__CLR4_4_1uj9uj9lh9yvhrs.R.flushNeeded();}}
}
