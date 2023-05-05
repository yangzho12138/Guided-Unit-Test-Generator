/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests that the selector selects correctly.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class SelectorTest {static class __CLR4_4_1w8iw8ilh9yvhvc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,42345,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test public void testByTag() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13u95dkw8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13u95dkw8i(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41778);
        // should be case insensitive
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41779);Elements els = Jsoup.parse("<div id=1><div id=2><p>Hello</p></div></div><DIV id=3>").select("DIV");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41780);assertEquals(3, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41781);assertEquals("1", els.get(0).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41782);assertEquals("2", els.get(1).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41783);assertEquals("3", els.get(2).id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41784);Elements none = Jsoup.parse("<div id=1><div id=2><p>Hello</p></div></div><div id=3>").select("span");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41785);assertEquals(0, none.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testById() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15gy185w8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testById",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15gy185w8q(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41786);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41787);Elements els = Jsoup.parse("<div><p id=foo>Hello</p><p id=foo>Foo two!</p></div>").select("#foo");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41788);assertEquals(2, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41789);assertEquals("Hello", els.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41790);assertEquals("Foo two!", els.get(1).text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41791);Elements none = Jsoup.parse("<div id=1></div>").select("#foo");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41792);assertEquals(0, none.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testByClass() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nsum6uw8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nsum6uw8x(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41793);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41794);Elements els = Jsoup.parse("<p id=0 class='ONE two'><p id=1 class='one'><p id=2 class='two'>").select("P.One");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41795);assertEquals(2, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41796);assertEquals("0", els.get(0).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41797);assertEquals("1", els.get(1).id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41798);Elements none = Jsoup.parse("<div class='one'></div>").select(".foo");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41799);assertEquals(0, none.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41800);Elements els2 = Jsoup.parse("<div class='One-Two'></div>").select(".one-two");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41801);assertEquals(1, els2.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testByClassCaseInsensitive() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bclgnw96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByClassCaseInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bclgnw96(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41802);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41803);String html = "<p Class=foo>One <p Class=Foo>Two <p class=FOO>Three <p class=farp>Four";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41804);Elements elsFromClass = Jsoup.parse(html).select("P.Foo");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41805);Elements elsFromAttr = Jsoup.parse(html).select("p[class=foo]");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41806);assertEquals(elsFromAttr.size(), elsFromClass.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41807);assertEquals(3, elsFromClass.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41808);assertEquals("Two", elsFromClass.get(1).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test @MultiLocaleTest public void testByAttribute() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmdmvaw9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41809,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmdmvaw9d(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41809);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41810);String h = "<div Title=Foo /><div Title=Bar /><div Style=Qux /><div title=Balim /><div title=SLIM />" +
                "<div data-name='with spaces'/>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41811);Document doc = Jsoup.parse(h);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41812);Elements withTitle = doc.select("[title]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41813);assertEquals(4, withTitle.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41814);Elements foo = doc.select("[TITLE=foo]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41815);assertEquals(1, foo.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41816);Elements foo2 = doc.select("[title=\"foo\"]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41817);assertEquals(1, foo2.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41818);Elements foo3 = doc.select("[title=\"Foo\"]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41819);assertEquals(1, foo3.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41820);Elements dataName = doc.select("[data-name=\"with spaces\"]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41821);assertEquals(1, dataName.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41822);assertEquals("with spaces", dataName.first().attr("data-name"));

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41823);Elements not = doc.select("div[title!=bar]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41824);assertEquals(5, not.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41825);assertEquals("Foo", not.first().attr("title"));

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41826);Elements starts = doc.select("[title^=ba]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41827);assertEquals(2, starts.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41828);assertEquals("Bar", starts.first().attr("title"));
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41829);assertEquals("Balim", starts.last().attr("title"));

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41830);Elements ends = doc.select("[title$=im]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41831);assertEquals(2, ends.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41832);assertEquals("Balim", ends.first().attr("title"));
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41833);assertEquals("SLIM", ends.last().attr("title"));

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41834);Elements contains = doc.select("[title*=i]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41835);assertEquals(2, contains.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41836);assertEquals("Balim", contains.first().attr("title"));
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41837);assertEquals("SLIM", contains.last().attr("title"));
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testNamespacedTag() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xmcujewa6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testNamespacedTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xmcujewa6(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41838);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41839);Document doc = Jsoup.parse("<div><abc:def id=1>Hello</abc:def></div> <abc:def class=bold id=2>There</abc:def>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41840);Elements byTag = doc.select("abc|def");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41841);assertEquals(2, byTag.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41842);assertEquals("1", byTag.first().id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41843);assertEquals("2", byTag.last().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41844);Elements byAttr = doc.select(".bold");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41845);assertEquals(1, byAttr.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41846);assertEquals("2", byAttr.last().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41847);Elements byTagAttr = doc.select("abc|def.bold");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41848);assertEquals(1, byTagAttr.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41849);assertEquals("2", byTagAttr.last().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41850);Elements byContains = doc.select("abc|def:contains(e)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41851);assertEquals(2, byContains.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41852);assertEquals("1", byContains.first().id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41853);assertEquals("2", byContains.last().id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testWildcardNamespacedTag() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ct2ar0wam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testWildcardNamespacedTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ct2ar0wam(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41854);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41855);Document doc = Jsoup.parse("<div><abc:def id=1>Hello</abc:def></div> <abc:def class=bold id=2>There</abc:def>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41856);Elements byTag = doc.select("*|def");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41857);assertEquals(2, byTag.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41858);assertEquals("1", byTag.first().id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41859);assertEquals("2", byTag.last().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41860);Elements byAttr = doc.select(".bold");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41861);assertEquals(1, byAttr.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41862);assertEquals("2", byAttr.last().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41863);Elements byTagAttr = doc.select("*|def.bold");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41864);assertEquals(1, byTagAttr.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41865);assertEquals("2", byTagAttr.last().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41866);Elements byContains = doc.select("*|def:contains(e)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41867);assertEquals(2, byContains.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41868);assertEquals("1", byContains.first().id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41869);assertEquals("2", byContains.last().id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test @MultiLocaleTest public void testByAttributeStarting() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o29weywb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeStarting",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o29weywb2(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41870);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41871);Document doc = Jsoup.parse("<div id=1 ATTRIBUTE data-name=jsoup>Hello</div><p data-val=5 id=2>There</p><p id=3>No</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41872);Elements withData = doc.select("[^data-]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41873);assertEquals(2, withData.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41874);assertEquals("1", withData.first().id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41875);assertEquals("2", withData.last().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41876);withData = doc.select("p[^data-]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41877);assertEquals(1, withData.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41878);assertEquals("2", withData.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41879);assertEquals(1, doc.select("[^attrib]").size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testByAttributeRegex() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17as0jfwbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeRegex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17as0jfwbc(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41880);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41881);Document doc = Jsoup.parse("<p><img src=foo.png id=1><img src=bar.jpg id=2><img src=qux.JPEG id=3><img src=old.gif><img></p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41882);Elements imgs = doc.select("img[src~=(?i)\\.(png|jpe?g)]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41883);assertEquals(3, imgs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41884);assertEquals("1", imgs.get(0).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41885);assertEquals("2", imgs.get(1).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41886);assertEquals("3", imgs.get(2).id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testByAttributeRegexCharacterClass() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11akhmewbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeRegexCharacterClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41887,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11akhmewbj(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41887);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41888);Document doc = Jsoup.parse("<p><img src=foo.png id=1><img src=bar.jpg id=2><img src=qux.JPEG id=3><img src=old.gif id=4></p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41889);Elements imgs = doc.select("img[src~=[o]]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41890);assertEquals(2, imgs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41891);assertEquals("1", imgs.get(0).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41892);assertEquals("4", imgs.get(1).id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testByAttributeRegexCombined() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2s534wbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testByAttributeRegexCombined",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2s534wbp(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41893);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41894);Document doc = Jsoup.parse("<div><table class=x><td>Hello</td></table></div>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41895);Elements els = doc.select("div table[class~=x|y]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41896);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41897);assertEquals("Hello", els.text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testCombinedWithContains() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtzv19wbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testCombinedWithContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtzv19wbu(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41898);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41899);Document doc = Jsoup.parse("<p id=1>One</p><p>Two +</p><p>Three +</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41900);Elements els = doc.select("p#1 + :contains(+)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41901);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41902);assertEquals("Two +", els.text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41903);assertEquals("p", els.first().tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testAllElements() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13s3u0jwc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testAllElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41904,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13s3u0jwc0(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41904);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41905);String h = "<div><p>Hello</p><p><b>there</b></p></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41906);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41907);Elements allDoc = doc.select("*");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41908);Elements allUnderDiv = doc.select("div *");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41909);assertEquals(8, allDoc.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41910);assertEquals(3, allUnderDiv.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41911);assertEquals("p", allUnderDiv.first().tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testAllWithClass() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gyclmwc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testAllWithClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gyclmwc8(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41912);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41913);String h = "<p class=first>One<p class=first>Two<p>Three";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41914);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41915);Elements ps = doc.select("*.first");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41916);assertEquals(2, ps.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testGroupOr() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qugijtwcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testGroupOr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41917,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qugijtwcd(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41917);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41918);String h = "<div title=foo /><div title=bar /><div /><p></p><img /><span title=qux>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41919);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41920);Elements els = doc.select("p,div,[title]");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41921);assertEquals(5, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41922);assertEquals("div", els.get(0).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41923);assertEquals("foo", els.get(0).attr("title"));
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41924);assertEquals("div", els.get(1).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41925);assertEquals("bar", els.get(1).attr("title"));
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41926);assertEquals("div", els.get(2).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41927);assertTrue(els.get(2).attr("title").length() == 0); // missing attributes come back as empty string
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41928);assertFalse(els.get(2).hasAttr("title"));
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41929);assertEquals("p", els.get(3).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41930);assertEquals("span", els.get(4).tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testGroupOrAttribute() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gfmw0dwcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testGroupOrAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41931,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gfmw0dwcr(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41931);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41932);String h = "<div id=1 /><div id=2 /><div title=foo /><div title=bar />";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41933);Elements els = Jsoup.parse(h).select("[id],[title=foo]");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41934);assertEquals(3, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41935);assertEquals("1", els.get(0).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41936);assertEquals("2", els.get(1).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41937);assertEquals("foo", els.get(2).attr("title"));
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void descendant() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uayfkswcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.descendant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uayfkswcy(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41938);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41939);String h = "<div class=head><p class=first>Hello</p><p>There</p></div><p>None</p>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41940);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41941);Element root = doc.getElementsByClass("HEAD").first();
        
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41942);Elements els = root.select(".head p");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41943);assertEquals(2, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41944);assertEquals("Hello", els.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41945);assertEquals("There", els.get(1).text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41946);Elements p = root.select("p.first");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41947);assertEquals(1, p.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41948);assertEquals("Hello", p.get(0).text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41949);Elements empty = root.select("p .first"); // self, not descend, should not match
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41950);assertEquals(0, empty.size());
        
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41951);Elements aboveRoot = root.select("body div.head");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41952);assertEquals(0, aboveRoot.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void and() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193608ywdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.and",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193608ywdd(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41953);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41954);String h = "<div id=1 class='foo bar' title=bar name=qux><p class=foo title=bar>Hello</p></div";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41955);Document doc = Jsoup.parse(h);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41956);Elements div = doc.select("div.foo");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41957);assertEquals(1, div.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41958);assertEquals("div", div.first().tagName());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41959);Elements p = doc.select("div .foo"); // space indicates like "div *.foo"
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41960);assertEquals(1, p.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41961);assertEquals("p", p.first().tagName());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41962);Elements div2 = doc.select("div#1.foo.bar[title=bar][name=qux]"); // very specific!
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41963);assertEquals(1, div2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41964);assertEquals("div", div2.first().tagName());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41965);Elements p2 = doc.select("div *.foo"); // space indicates like "div *.foo"
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41966);assertEquals(1, p2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41967);assertEquals("p", p2.first().tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void deeperDescendant() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11mv6rnwds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.deeperDescendant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11mv6rnwds(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41968);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41969);String h = "<div class=head><p><span class=first>Hello</div><div class=head><p class=first><span>Another</span><p>Again</div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41970);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41971);Element root = doc.getElementsByClass("head").first();

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41972);Elements els = root.select("div p .first");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41973);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41974);assertEquals("Hello", els.first().text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41975);assertEquals("span", els.first().tagName());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41976);Elements aboveRoot = root.select("body p .first");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41977);assertEquals(0, aboveRoot.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void parentChildElement() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11gzkltwe2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.parentChildElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11gzkltwe2(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41978);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41979);String h = "<div id=1><div id=2><div id = 3></div></div></div><div id=4></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41980);Document doc = Jsoup.parse(h);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41981);Elements divs = doc.select("div > div");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41982);assertEquals(2, divs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41983);assertEquals("2", divs.get(0).id()); // 2 is child of 1
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41984);assertEquals("3", divs.get(1).id()); // 3 is child of 2

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41985);Elements div2 = doc.select("div#1 > div");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41986);assertEquals(1, div2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41987);assertEquals("2", div2.get(0).id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void parentWithClassChild() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nxvy3wec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.parentWithClassChild",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41988,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nxvy3wec(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41988);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41989);String h = "<h1 class=foo><a href=1 /></h1><h1 class=foo><a href=2 class=bar /></h1><h1><a href=3 /></h1>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41990);Document doc = Jsoup.parse(h);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41991);Elements allAs = doc.select("h1 > a");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41992);assertEquals(3, allAs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41993);assertEquals("a", allAs.first().tagName());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41994);Elements fooAs = doc.select("h1.foo > a");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41995);assertEquals(2, fooAs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41996);assertEquals("a", fooAs.first().tagName());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41997);Elements barAs = doc.select("h1.foo > a.bar");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(41998);assertEquals(1, barAs.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void parentChildStar() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),41999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o3g1cbwen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.parentChildStar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o3g1cbwen(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(41999);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42000);String h = "<div id=1><p>Hello<p><b>there</b></p></div><div id=2><span>Hi</span></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42001);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42002);Elements divChilds = doc.select("div > *");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42003);assertEquals(3, divChilds.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42004);assertEquals("p", divChilds.get(0).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42005);assertEquals("p", divChilds.get(1).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42006);assertEquals("span", divChilds.get(2).tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void multiChildDescent() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162ktduwev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.multiChildDescent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42007,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162ktduwev(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42007);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42008);String h = "<div id=foo><h1 class=bar><a href=http://example.com/>One</a></h1></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42009);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42010);Elements els = doc.select("div#foo > h1.bar > a[href*=example]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42011);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42012);assertEquals("a", els.first().tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void caseInsensitive() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi2yugwf1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.caseInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi2yugwf1(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42013);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42014);String h = "<dIv tItle=bAr><div>"; // mixed case so a simple toLowerCase() on value doesn't catch
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42015);Document doc = Jsoup.parse(h);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42016);assertEquals(2, doc.select("DiV").size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42017);assertEquals(1, doc.select("DiV[TiTLE]").size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42018);assertEquals(1, doc.select("DiV[TiTLE=BAR]").size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42019);assertEquals(0, doc.select("DiV[TiTLE=BARBARELLA]").size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void adjacentSiblings() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19kz7sqwf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.adjacentSiblings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19kz7sqwf8(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42020);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42021);String h = "<ol><li>One<li>Two<li>Three</ol>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42022);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42023);Elements sibs = doc.select("li + li");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42024);assertEquals(2, sibs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42025);assertEquals("Two", sibs.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42026);assertEquals("Three", sibs.get(1).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void adjacentSiblingsWithId() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1945nqzwff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.adjacentSiblingsWithId",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1945nqzwff(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42027);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42028);String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42029);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42030);Elements sibs = doc.select("li#1 + li#2");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42031);assertEquals(1, sibs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42032);assertEquals("Two", sibs.get(0).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void notAdjacent() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16aoezgwfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notAdjacent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16aoezgwfl(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42033);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42034);String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42035);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42036);Elements sibs = doc.select("li#1 + li#3");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42037);assertEquals(0, sibs.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void mixCombinator() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljqtxbwfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.mixCombinator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljqtxbwfq(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42038);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42039);String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42040);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42041);Elements sibs = doc.select("body > div.foo li + li");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42042);assertEquals(2, sibs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42043);assertEquals("Two", sibs.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42044);assertEquals("Three", sibs.get(1).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void mixCombinatorGroup() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z3el8uwfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.mixCombinatorGroup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z3el8uwfx(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42045);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42046);String h = "<div class=foo><ol><li>One<li>Two<li>Three</ol></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42047);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42048);Elements els = doc.select(".foo > ol, ol > li + li");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42049);assertEquals(3, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42050);assertEquals("ol", els.get(0).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42051);assertEquals("Two", els.get(1).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42052);assertEquals("Three", els.get(2).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void generalSiblings() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rixbkwwg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.generalSiblings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42053,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rixbkwwg5(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42053);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42054);String h = "<ol><li id=1>One<li id=2>Two<li id=3>Three</ol>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42055);Document doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42056);Elements els = doc.select("#1 ~ #3");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42057);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42058);assertEquals("Three", els.first().text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    // for http://github.com/jhy/jsoup/issues#issue/10
    @Test public void testCharactersInIdAndClass() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12db6o4wgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testCharactersInIdAndClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42059,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12db6o4wgb(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42059);
        // using CSS spec for identifiers (id and class): a-z0-9, -, _. NOT . (which is OK in html spec, but not css)
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42060);String h = "<div><p id='a1-foo_bar'>One</p><p class='b2-qux_bif'>Two</p></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42061);Document doc = Jsoup.parse(h);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42062);Element el1 = doc.getElementById("a1-foo_bar");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42063);assertEquals("One", el1.text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42064);Element el2 = doc.getElementsByClass("b2-qux_bif").first();
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42065);assertEquals("Two", el2.text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42066);Element el3 = doc.select("#a1-foo_bar").first();
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42067);assertEquals("One", el3.text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42068);Element el4 = doc.select(".b2-qux_bif").first();
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42069);assertEquals("Two", el4.text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    // for http://github.com/jhy/jsoup/issues#issue/13
    @Test public void testSupportsLeadingCombinator() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15cmxozwgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testSupportsLeadingCombinator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15cmxozwgm(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42070);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42071);String h = "<div><p><span>One</span><span>Two</span></p></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42072);Document doc = Jsoup.parse(h);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42073);Element p = doc.select("div > p").first();
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42074);Elements spans = p.select("> span");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42075);assertEquals(2, spans.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42076);assertEquals("One", spans.first().text());

        // make sure doesn't get nested
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42077);h = "<div id=1><div id=2><div id=3></div></div></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42078);doc = Jsoup.parse(h);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42079);Element div = doc.select("div").select(" > div").first();
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42080);assertEquals("2", div.id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testPseudoLessThan() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pcwoa9wgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoLessThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pcwoa9wgx(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42081);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42082);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42083);Elements ps = doc.select("div p:lt(2)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42084);assertEquals(3, ps.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42085);assertEquals("One", ps.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42086);assertEquals("Two", ps.get(1).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42087);assertEquals("Four", ps.get(2).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testPseudoGreaterThan() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c9e2z6wh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoGreaterThan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42088,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c9e2z6wh4(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42088);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42089);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</p></div><div><p>Four</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42090);Elements ps = doc.select("div p:gt(0)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42091);assertEquals(2, ps.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42092);assertEquals("Two", ps.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42093);assertEquals("Three", ps.get(1).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testPseudoEquals() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16tcxjewha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42094,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16tcxjewha(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42094);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42095);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42096);Elements ps = doc.select("div p:eq(0)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42097);assertEquals(2, ps.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42098);assertEquals("One", ps.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42099);assertEquals("Four", ps.get(1).text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42100);Elements ps2 = doc.select("div:eq(0) p:eq(0)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42101);assertEquals(1, ps2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42102);assertEquals("One", ps2.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42103);assertEquals("p", ps2.get(0).tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testPseudoBetween() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12cwx4xwhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoBetween",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12cwx4xwhk(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42104);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42105);Document doc = Jsoup.parse("<div><p>One</p><p>Two</p><p>Three</>p></div><div><p>Four</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42106);Elements ps = doc.select("div p:gt(0):lt(2)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42107);assertEquals(1, ps.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42108);assertEquals("Two", ps.get(0).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testPseudoCombined() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_132njnowhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoCombined",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_132njnowhp(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42109);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42110);Document doc = Jsoup.parse("<div class='foo'><p>One</p><p>Two</p></div><div><p>Three</p><p>Four</p></div>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42111);Elements ps = doc.select("div.foo p:gt(0)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42112);assertEquals(1, ps.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42113);assertEquals("Two", ps.get(0).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testPseudoHas() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9wkupwhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoHas",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9wkupwhu(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42114);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42115);Document doc = Jsoup.parse("<div id=0><p><span>Hello</span></p></div> <div id=1><span class=foo>There</span></div> <div id=2><p>Not</p></div>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42116);Elements divs1 = doc.select("div:has(span)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42117);assertEquals(2, divs1.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42118);assertEquals("0", divs1.get(0).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42119);assertEquals("1", divs1.get(1).id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42120);Elements divs2 = doc.select("div:has([class])");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42121);assertEquals(1, divs2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42122);assertEquals("1", divs2.get(0).id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42123);Elements divs3 = doc.select("div:has(span, p)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42124);assertEquals(3, divs3.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42125);assertEquals("0", divs3.get(0).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42126);assertEquals("1", divs3.get(1).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42127);assertEquals("2", divs3.get(2).id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42128);Elements els1 = doc.body().select(":has(p)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42129);assertEquals(3, els1.size()); // body, div, dib
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42130);assertEquals("body", els1.first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42131);assertEquals("0", els1.get(1).id());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42132);assertEquals("2", els1.get(2).id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42133);Elements els2 = doc.body().select(":has(> span)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42134);assertEquals(2,els2.size()); // p, div
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42135);assertEquals("p",els2.first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42136);assertEquals("1", els2.get(1).id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testNestedHas() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1offcbswih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testNestedHas",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1offcbswih(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42137);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42138);Document doc = Jsoup.parse("<div><p><span>One</span></p></div> <div><p>Two</p></div>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42139);Elements divs = doc.select("div:has(p:has(span))");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42140);assertEquals(1, divs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42141);assertEquals("One", divs.first().text());

        // test matches in has
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42142);divs = doc.select("div:has(p:matches((?i)two))");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42143);assertEquals(1, divs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42144);assertEquals("div", divs.first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42145);assertEquals("Two", divs.first().text());

        // test contains in has
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42146);divs = doc.select("div:has(p:contains(two))");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42147);assertEquals(1, divs.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42148);assertEquals("div", divs.first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42149);assertEquals("Two", divs.first().text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test @MultiLocaleTest public void testPseudoContains() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fmg8yywiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPseudoContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fmg8yywiu(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42150);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42151);Document doc = Jsoup.parse("<div><p>The Rain.</p> <p class=light>The <i>RAIN</i>.</p> <p>Rain, the.</p></div>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42152);Elements ps1 = doc.select("p:contains(Rain)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42153);assertEquals(3, ps1.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42154);Elements ps2 = doc.select("p:contains(the rain)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42155);assertEquals(2, ps2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42156);assertEquals("The Rain.", ps2.first().html());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42157);assertEquals("The <i>RAIN</i>.", ps2.last().html());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42158);Elements ps3 = doc.select("p:contains(the Rain):has(i)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42159);assertEquals(1, ps3.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42160);assertEquals("light", ps3.first().className());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42161);Elements ps4 = doc.select(".light:contains(rain)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42162);assertEquals(1, ps4.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42163);assertEquals("light", ps3.first().className());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42164);Elements ps5 = doc.select(":contains(rain)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42165);assertEquals(8, ps5.size()); // html, body, div,...

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42166);Elements ps6 = doc.select(":contains(RAIN)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42167);assertEquals(8, ps6.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testPsuedoContainsWithParentheses() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aupjjowjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testPsuedoContainsWithParentheses",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42168,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aupjjowjc(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42168);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42169);Document doc = Jsoup.parse("<div><p id=1>This (is good)</p><p id=2>This is bad)</p>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42170);Elements ps1 = doc.select("p:contains(this (is good))");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42171);assertEquals(1, ps1.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42172);assertEquals("1", ps1.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42173);Elements ps2 = doc.select("p:contains(this is bad\\))");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42174);assertEquals(1, ps2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42175);assertEquals("2", ps2.first().id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test @MultiLocaleTest public void containsOwn() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1orvgb2wjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.containsOwn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1orvgb2wjk(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42176);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42177);Document doc = Jsoup.parse("<p id=1>Hello <b>there</b> igor</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42178);Elements ps = doc.select("p:containsOwn(Hello IGOR)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42179);assertEquals(1, ps.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42180);assertEquals("1", ps.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42181);assertEquals(0, doc.select("p:containsOwn(there)").size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42182);Document doc2 = Jsoup.parse("<p>Hello <b>there</b> IGOR</p>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42183);assertEquals(1, doc2.select("p:containsOwn(igor)").size());

    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testMatches() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1asg2ncwjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testMatches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1asg2ncwjs(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42184);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42185);Document doc = Jsoup.parse("<p id=1>The <i>Rain</i></p> <p id=2>There are 99 bottles.</p> <p id=3>Harder (this)</p> <p id=4>Rain</p>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42186);Elements p1 = doc.select("p:matches(The rain)"); // no match, case sensitive
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42187);assertEquals(0, p1.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42188);Elements p2 = doc.select("p:matches((?i)the rain)"); // case insense. should include root, html, body
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42189);assertEquals(1, p2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42190);assertEquals("1", p2.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42191);Elements p4 = doc.select("p:matches((?i)^rain$)"); // bounding
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42192);assertEquals(1, p4.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42193);assertEquals("4", p4.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42194);Elements p5 = doc.select("p:matches(\\d+)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42195);assertEquals(1, p5.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42196);assertEquals("2", p5.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42197);Elements p6 = doc.select("p:matches(\\w+\\s+\\(\\w+\\))"); // test bracket matching
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42198);assertEquals(1, p6.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42199);assertEquals("3", p6.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42200);Elements p7 = doc.select("p:matches((?i)the):has(i)"); // multi
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42201);assertEquals(1, p7.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42202);assertEquals("1", p7.first().id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void matchesOwn() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1335f0awkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.matchesOwn",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1335f0awkb(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42203);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42204);Document doc = Jsoup.parse("<p id=1>Hello <b>there</b> now</p>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42205);Elements p1 = doc.select("p:matchesOwn((?i)hello now)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42206);assertEquals(1, p1.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42207);assertEquals("1", p1.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42208);assertEquals(0, doc.select("p:matchesOwn(there)").size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void testRelaxedTags() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xulrwjwkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.testRelaxedTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xulrwjwkh(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42209);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42210);Document doc = Jsoup.parse("<abc_def id=1>Hello</abc_def> <abc-def id=2>There</abc-def>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42211);Elements el1 = doc.select("abc_def");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42212);assertEquals(1, el1.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42213);assertEquals("1", el1.first().id());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42214);Elements el2 = doc.select("abc-def");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42215);assertEquals(1, el2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42216);assertEquals("2", el2.first().id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void notParas() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xc3phjwkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notParas",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xc3phjwkp(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42217);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42218);Document doc = Jsoup.parse("<p id=1>One</p> <p>Two</p> <p><span>Three</span></p>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42219);Elements el1 = doc.select("p:not([id=1])");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42220);assertEquals(2, el1.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42221);assertEquals("Two", el1.first().text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42222);assertEquals("Three", el1.last().text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42223);Elements el2 = doc.select("p:not(:has(span))");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42224);assertEquals(2, el2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42225);assertEquals("One", el2.first().text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42226);assertEquals("Two", el2.last().text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void notAll() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i9zfsbwkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notAll",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i9zfsbwkz(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42227);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42228);Document doc = Jsoup.parse("<p>Two</p> <p><span>Three</span></p>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42229);Elements el1 = doc.body().select(":not(p)"); // should just be the span
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42230);assertEquals(2, el1.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42231);assertEquals("body", el1.first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42232);assertEquals("span", el1.last().tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void notClass() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j0a0hgwl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.notClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j0a0hgwl5(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42233);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42234);Document doc = Jsoup.parse("<div class=left>One</div><div class=right id=1><p>Two</p></div>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42235);Elements el1 = doc.select("div:not(.left)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42236);assertEquals(1, el1.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42237);assertEquals("1", el1.first().id());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void handlesCommasInSelector() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udv46kwla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.handlesCommasInSelector",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udv46kwla(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42238);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42239);Document doc = Jsoup.parse("<p name='1,2'>One</p><div>Two</div><ol><li>123</li><li>Text</li></ol>");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42240);Elements ps = doc.select("[name=1,2]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42241);assertEquals(1, ps.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42242);Elements containers = doc.select("div, li:matches([0-9,]+)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42243);assertEquals(2, containers.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42244);assertEquals("div", containers.get(0).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42245);assertEquals("li", containers.get(1).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42246);assertEquals("123", containers.get(1).text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void selectSupplementaryCharacter() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11bl5dvwlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectSupplementaryCharacter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11bl5dvwlj(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42247);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42248);String s = new String(Character.toChars(135361));
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42249);Document doc = Jsoup.parse("<div k" + s + "='" + s + "'>^" + s +"$/div>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42250);assertEquals("div", doc.select("div[k" + s + "]").first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42251);assertEquals("div", doc.select("div:containsOwn(" + s + ")").first().tagName());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}
    
    @Test
    public void selectClassWithSpace() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12txplhwlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectClassWithSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42252,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12txplhwlo(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42252);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42253);final String html = "<div class=\"value\">class without space</div>\n"
                          + "<div class=\"value \">class with space</div>";
        
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42254);Document doc = Jsoup.parse(html);
        
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42255);Elements found = doc.select("div[class=value ]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42256);assertEquals(2, found.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42257);assertEquals("class without space", found.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42258);assertEquals("class with space", found.get(1).text());
        
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42259);found = doc.select("div[class=\"value \"]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42260);assertEquals(2, found.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42261);assertEquals("class without space", found.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42262);assertEquals("class with space", found.get(1).text());
        
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42263);found = doc.select("div[class=\"value\\ \"]");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42264);assertEquals(0, found.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void selectSameElements() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gr8wu8wm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectSameElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gr8wu8wm1(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42265);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42266);final String html = "<div>one</div><div>one</div>";

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42267);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42268);Elements els = doc.select("div");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42269);assertEquals(2, els.size());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42270);Elements subSelect = els.select(":contains(one)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42271);assertEquals(2, subSelect.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void attributeWithBrackets() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uy4kr8wm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.attributeWithBrackets",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uy4kr8wm8(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42272);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42273);String html = "<div data='End]'>One</div> <div data='[Another)]]'>Two</div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42274);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42275);assertEquals("One", doc.select("div[data='End]']").first().text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42276);assertEquals("Two", doc.select("div[data='[Another)]]']").first().text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42277);assertEquals("One", doc.select("div[data=\"End]\"]").first().text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42278);assertEquals("Two", doc.select("div[data=\"[Another)]]\"]").first().text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test @MultiLocaleTest public void containsData() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_111xncgwmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.containsData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_111xncgwmf(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42279);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42280);String html = "<p>function</p><script>FUNCTION</script><style>item</style><span><!-- comments --></span>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42281);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42282);Element body = doc.body();

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42283);Elements dataEls1 = body.select(":containsData(function)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42284);Elements dataEls2 = body.select("script:containsData(function)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42285);Elements dataEls3 = body.select("span:containsData(comments)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42286);Elements dataEls4 = body.select(":containsData(o)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42287);Elements dataEls5 = body.select("style:containsData(ITEM)");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42288);assertEquals(2, dataEls1.size()); // body and script
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42289);assertEquals(1, dataEls2.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42290);assertEquals(dataEls1.last(), dataEls2.first());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42291);assertEquals("<script>FUNCTION</script>", dataEls2.outerHtml());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42292);assertEquals(1, dataEls3.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42293);assertEquals("span", dataEls3.first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42294);assertEquals(3, dataEls4.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42295);assertEquals("body", dataEls4.first().tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42296);assertEquals("script", dataEls4.get(1).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42297);assertEquals("span", dataEls4.get(2).tagName());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42298);assertEquals(1, dataEls5.size());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void containsWithQuote() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148jwyqwmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.containsWithQuote",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148jwyqwmz(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42299);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42300);String html = "<p>One'One</p><p>One'Two</p>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42301);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42302);Elements els = doc.select("p:contains(One\\'One)");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42303);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42304);assertEquals("One'One", els.text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void selectFirst() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l687c5wn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l687c5wn5(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42305);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42306);String html = "<p>One<p>Two<p>Three";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42307);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42308);assertEquals("One", doc.selectFirst("p").text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void selectFirstWithAnd() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18z40ykwn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectFirstWithAnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18z40ykwn9(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42309);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42310);String html = "<p>One<p class=foo>Two<p>Three";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42311);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42312);assertEquals("Two", doc.selectFirst("p.foo").text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void selectFirstWithOr() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17eyb6swnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.selectFirstWithOr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17eyb6swnd(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42313);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42314);String html = "<p>One<p>Two<p>Three<div>Four";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42315);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42316);assertEquals("One", doc.selectFirst("p, div").text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void matchText() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ud1daxwnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.matchText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ud1daxwnh(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42317);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42318);String html = "<p>One<br>Two</p>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42319);Document doc = Jsoup.parse(html);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42320);String origHtml = doc.html();

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42321);Elements one = doc.select("p:matchText:first-child");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42322);assertEquals("One", one.first().text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42323);Elements two = doc.select("p:matchText:last-child");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42324);assertEquals("Two", two.first().text());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42325);assertEquals(origHtml, doc.html());

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42326);assertEquals("Two", doc.select("p:matchText + br + *").text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void splitOnBr() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avl59swnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.splitOnBr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avl59swnr(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42327);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42328);String html = "<div><p>One<br>Two<br>Three</p></div>";
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42329);Document doc = Jsoup.parse(html);

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42330);Elements els = doc.select("p:matchText");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42331);assertEquals(3, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42332);assertEquals("One", els.get(0).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42333);assertEquals("Two", els.get(1).text());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42334);assertEquals("Three", els.get(2).toString());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void matchTextAttributes() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1itoaj4wnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.matchTextAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1itoaj4wnz(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42335);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42336);Document doc = Jsoup.parse("<div><p class=one>One<br>Two<p class=two>Three<br>Four");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42337);Elements els = doc.select("p.two:matchText:last-child");

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42338);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42339);assertEquals("Four", els.text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}

    @Test public void findBetweenSpan() {__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceStart(getClass().getName(),42340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrw5b4wo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w8iw8ilh9yvhvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w8iw8ilh9yvhvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.SelectorTest.findBetweenSpan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrw5b4wo4(){try{__CLR4_4_1w8iw8ilh9yvhvc.R.inc(42340);
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42341);Document doc = Jsoup.parse("<p><span>One</span> Two <span>Three</span>");
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42342);Elements els = doc.select("span ~ p:matchText"); // the Two becomes its own p, sibling of the span

        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42343);assertEquals(1, els.size());
        __CLR4_4_1w8iw8ilh9yvhvc.R.inc(42344);assertEquals("Two", els.text());
    }finally{__CLR4_4_1w8iw8ilh9yvhvc.R.flushNeeded();}}
}
