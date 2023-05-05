/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 Tests for ElementList.

 @author Jonathan Hedley, jonathan@hedley.net */
public class ElementsTest {static class __CLR4_4_1w0mw0mlh9yvhul{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,41753,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void filter() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vv3jzw0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.filter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vv3jzw0m(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41494);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41495);String h = "<p>Excl</p><div class=headline><p>Hello</p><p>There</p></div><div class=headline><h1>Headline</h1></div>";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41496);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41497);Elements els = doc.select(".headline").select("p");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41498);assertEquals(2, els.size());
//        assertEquals("Hello", els.get(0).text());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41499);assertEquals("There", els.get(1).text());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void attributes() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17des02w0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.attributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17des02w0s(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41500);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41501);String h = "<p title=foo><p title=bar><p class=foo><p class=bar>";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41502);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41503);Elements withTitle = doc.select("p[title]");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41504);assertEquals(2, withTitle.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41505);assertTrue(withTitle.hasAttr("title"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41506);assertFalse(withTitle.hasAttr("class"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41507);assertEquals("foo", withTitle.attr("title"));

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41508);withTitle.removeAttr("title");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41509);assertEquals(2, withTitle.size()); // existing Elements are not reevaluated
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41510);assertEquals(0, doc.select("p[title]").size());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41511);Elements ps = doc.select("p").attr("style", "classy");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41512);assertEquals(4, ps.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41513);assertEquals("classy", ps.last().attr("style"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41514);assertEquals("bar", ps.last().attr("class"));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void hasAttr() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7d0fiw17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasAttr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7d0fiw17(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41515);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41516);Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41517);Elements ps = doc.select("p");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41518);assertTrue(ps.hasAttr("class"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41519);assertFalse(ps.hasAttr("style"));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void hasAbsAttr() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yo4hiow1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasAbsAttr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41520,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yo4hiow1c(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41520);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41521);Document doc = Jsoup.parse("<a id=1 href='/foo'>One</a> <a id=2 href='https://jsoup.org'>Two</a>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41522);Elements one = doc.select("#1");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41523);Elements two = doc.select("#2");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41524);Elements both = doc.select("a");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41525);assertFalse(one.hasAttr("abs:href"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41526);assertTrue(two.hasAttr("abs:href"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41527);assertTrue(both.hasAttr("abs:href")); // hits on #2
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void attr() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15k5v6gw1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.attr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41528,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15k5v6gw1k(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41528);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41529);Document doc = Jsoup.parse("<p title=foo><p title=bar><p class=foo><p class=bar>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41530);String classVal = doc.select("p").attr("class");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41531);assertEquals("foo", classVal);
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void absAttr() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v7inpyw1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.absAttr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v7inpyw1o(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41532);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41533);Document doc = Jsoup.parse("<a id=1 href='/foo'>One</a> <a id=2 href='https://jsoup.org'>Two</a>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41534);Elements one = doc.select("#1");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41535);Elements two = doc.select("#2");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41536);Elements both = doc.select("a");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41537);assertEquals("", one.attr("abs:href"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41538);assertEquals("https://jsoup.org", two.attr("abs:href"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41539);assertEquals("https://jsoup.org", both.attr("abs:href"));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void classes() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rd3rn1w1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.classes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rd3rn1w1w(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41540);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41541);Document doc = Jsoup.parse("<div><p class='mellow yellow'></p><p class='red green'></p>");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41542);Elements els = doc.select("p");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41543);assertTrue(els.hasClass("red"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41544);assertFalse(els.hasClass("blue"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41545);els.addClass("blue");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41546);els.removeClass("yellow");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41547);els.toggleClass("mellow");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41548);assertEquals("blue", els.get(0).className());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41549);assertEquals("red green blue mellow", els.get(1).className());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void hasClassCaseInsensitive() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17y3u8aw26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasClassCaseInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41550,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17y3u8aw26(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41550);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41551);Elements els = Jsoup.parse("<p Class=One>One <p class=Two>Two <p CLASS=THREE>THREE").select("p");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41552);Element one = els.get(0);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41553);Element two = els.get(1);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41554);Element thr = els.get(2);

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41555);assertTrue(one.hasClass("One"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41556);assertTrue(one.hasClass("ONE"));

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41557);assertTrue(two.hasClass("TWO"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41558);assertTrue(two.hasClass("Two"));

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41559);assertTrue(thr.hasClass("ThreE"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41560);assertTrue(thr.hasClass("three"));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void text() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sz271ow2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.text",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41561,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sz271ow2h(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41561);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41562);String h = "<div><p>Hello<p>there<p>world</div>";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41563);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41564);assertEquals("Hello there world", doc.select("div > *").text());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void hasText() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iaizbiw2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.hasText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41565,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iaizbiw2l(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41565);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41566);Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p></p></div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41567);Elements divs = doc.select("div");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41568);assertTrue(divs.hasText());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41569);assertFalse(doc.select("div + div").hasText());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void html() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3af0yw2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.html",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3af0yw2q(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41570);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41571);Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41572);Elements divs = doc.select("div");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41573);assertEquals("<p>Hello</p>\n<p>There</p>", divs.html());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void outerHtml() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cck78zw2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.outerHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cck78zw2u(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41574);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41575);Document doc = Jsoup.parse("<div><p>Hello</p></div><div><p>There</p></div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41576);Elements divs = doc.select("div");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41577);assertEquals("<div><p>Hello</p></div><div><p>There</p></div>", TextUtil.stripNewlines(divs.outerHtml()));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void setHtml() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12u2uvow2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.setHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12u2uvow2y(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41578);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41579);Document doc = Jsoup.parse("<p>One</p><p>Two</p><p>Three</p>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41580);Elements ps = doc.select("p");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41581);ps.prepend("<b>Bold</b>").append("<i>Ital</i>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41582);assertEquals("<p><b>Bold</b>Two<i>Ital</i></p>", TextUtil.stripNewlines(ps.get(1).outerHtml()));

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41583);ps.html("<span>Gone</span>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41584);assertEquals("<p><span>Gone</span></p>", TextUtil.stripNewlines(ps.get(1).outerHtml()));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void val() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bxfsqww35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.val",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41585,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bxfsqww35(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41585);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41586);Document doc = Jsoup.parse("<input value='one' /><textarea>two</textarea>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41587);Elements els = doc.select("input, textarea");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41588);assertEquals(2, els.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41589);assertEquals("one", els.val());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41590);assertEquals("two", els.last().val());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41591);els.val("three");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41592);assertEquals("three", els.first().val());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41593);assertEquals("three", els.last().val());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41594);assertEquals("<textarea>three</textarea>", els.last().outerHtml());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void before() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd8owqw3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.before",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd8owqw3f(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41595);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41596);Document doc = Jsoup.parse("<p>This <a>is</a> <a>jsoup</a>.</p>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41597);doc.select("a").before("<span>foo</span>");
//        assertEquals("<p>This <span>foo</span><a>is</a> <span>foo</span><a>jsoup</a>.</p>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void after() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4au71w3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.after",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4au71w3i(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41598);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41599);Document doc = Jsoup.parse("<p>This <a>is</a> <a>jsoup</a>.</p>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41600);doc.select("a").after("<span>foo</span>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41601);assertEquals("<p>This <a>is</a><span>foo</span> <a>jsoup</a><span>foo</span>.</p>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void wrap() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sdpcj3w3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.wrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sdpcj3w3m(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41602);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41603);String h = "<p><b>This</b> is <b>jsoup</b></p>";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41604);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41605);doc.select("b").wrap("<i></i>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41606);assertEquals("<p><i><b>This</b></i> is <i><b>jsoup</b></i></p>", doc.body().html());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void wrapDiv() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n32fg2w3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.wrapDiv",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n32fg2w3r(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41607);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41608);String h = "<p><b>This</b> is <b>jsoup</b>.</p> <p>How do you like it?</p>";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41609);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41610);doc.select("p").wrap("<div></div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41611);assertEquals("<div><p><b>This</b> is <b>jsoup</b>.</p></div> <div><p>How do you like it?</p></div>",
                TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void unwrap() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5yq16w3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.unwrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5yq16w3w(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41612);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41613);String h = "<div><font>One</font> <font><a href=\"/\">Two</a></font></div";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41614);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41615);doc.select("font").unwrap();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41616);assertEquals("<div>One <a href=\"/\">Two</a></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void unwrapP() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183la8cw41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.unwrapP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41617,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183la8cw41(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41617);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41618);String h = "<p><a>One</a> Two</p> Three <i>Four</i> <p>Fix <i>Six</i></p>";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41619);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41620);doc.select("p").unwrap();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41621);assertEquals("<a>One</a> Two Three <i>Four</i> Fix <i>Six</i>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void unwrapKeepsSpace() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1anuwxqw46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.unwrapKeepsSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1anuwxqw46(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41622);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41623);String h = "<p>One <span>two</span> <span>three</span> four</p>";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41624);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41625);doc.select("span").unwrap();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41626);assertEquals("<p>One two three four</p>", doc.body().html());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void empty() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4yvp0w4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.empty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4yvp0w4b(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41627);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41628);Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> <p>now!</p></div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41629);doc.outputSettings().prettyPrint(false);

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41630);doc.select("p").empty();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41631);assertEquals("<div><p></p> <p></p></div>", doc.body().html());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void remove() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1boikwbw4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.remove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1boikwbw4g(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41632);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41633);Document doc = Jsoup.parse("<div><p>Hello <b>there</b></p> jsoup <p>now!</p></div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41634);doc.outputSettings().prettyPrint(false);

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41635);doc.select("p").remove();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41636);assertEquals("<div> jsoup </div>", doc.body().html());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void eq() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r87l3hw4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.eq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r87l3hw4l(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41637);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41638);String h = "<p>Hello<p>there<p>world";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41639);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41640);assertEquals("there", doc.select("p").eq(1).text());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41641);assertEquals("there", doc.select("p").get(1).text());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void is() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r43wohw4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.is",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r43wohw4q(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41642);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41643);String h = "<p>Hello<p title=foo>there<p>world";
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41644);Document doc = Jsoup.parse(h);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41645);Elements ps = doc.select("p");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41646);assertTrue(ps.is("[title=foo]"));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41647);assertFalse(ps.is("[title=bar]"));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void parents() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1imqf5cw4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.parents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1imqf5cw4w(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41648);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41649);Document doc = Jsoup.parse("<div><p>Hello</p></div><p>There</p>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41650);Elements parents = doc.select("p").parents();

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41651);assertEquals(3, parents.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41652);assertEquals("div", parents.get(0).tagName());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41653);assertEquals("body", parents.get(1).tagName());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41654);assertEquals("html", parents.get(2).tagName());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void not() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q5io92w53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.not",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q5io92w53(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41655);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41656);Document doc = Jsoup.parse("<div id=1><p>One</p></div> <div id=2><p><span>Two</span></p></div>");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41657);Elements div1 = doc.select("div").not(":has(p > span)");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41658);assertEquals(1, div1.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41659);assertEquals("1", div1.first().id());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41660);Elements div2 = doc.select("div").not("#1");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41661);assertEquals(1, div2.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41662);assertEquals("2", div2.first().id());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void tagNameSet() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_162j6o4w5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.tagNameSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_162j6o4w5b(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41663);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41664);Document doc = Jsoup.parse("<p>Hello <i>there</i> <i>now</i></p>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41665);doc.select("i").tagName("em");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41666);assertEquals("<p>Hello <em>there</em> <em>now</em></p>", doc.body().html());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void traverse() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4dh15w5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.traverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41667,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4dh15w5f(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41667);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41668);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41669);final StringBuilder accum = new StringBuilder();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41670);doc.select("div").traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41671);
                __CLR4_4_1w0mw0mlh9yvhul.R.inc(41672);accum.append("<").append(node.nodeName()).append(">");
            }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41673);
                __CLR4_4_1w0mw0mlh9yvhul.R.inc(41674);accum.append("</").append(node.nodeName()).append(">");
            }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}
        });
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41675);assertEquals("<div><p><#text></#text></p></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void forms() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fhypauw5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.forms",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fhypauw5o(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41676);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41677);Document doc = Jsoup.parse("<form id=1><input name=q></form><div /><form id=2><input name=f></form>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41678);Elements els = doc.select("*");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41679);assertEquals(9, els.size());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41680);List<FormElement> forms = els.forms();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41681);assertEquals(2, forms.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41682);assertTrue(forms.get(0) != null);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41683);assertTrue(forms.get(1) != null);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41684);assertEquals("1", forms.get(0).id());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41685);assertEquals("2", forms.get(1).id());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void classWithHyphen() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c6bb0pw5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.classWithHyphen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c6bb0pw5y(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41686);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41687);Document doc = Jsoup.parse("<p class='tab-nav'>Check</p>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41688);Elements els = doc.getElementsByClass("tab-nav");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41689);assertEquals(1, els.size());
//        assertEquals("Check", els.text());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void siblings() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_120jjs8w62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.siblings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_120jjs8w62(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41690);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41691);Document doc = Jsoup.parse("<div><p>1<p>2<p>3<p>4<p>5<p>6</div><div><p>7<p>8<p>9<p>10<p>11<p>12</div>");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41692);Elements els = doc.select("p:eq(3)"); // gets p4 and p10
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41693);assertEquals(2, els.size());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41694);Elements next = els.next();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41695);assertEquals(2, next.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41696);assertEquals("5", next.first().text());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41697);assertEquals("11", next.last().text());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41698);assertEquals(0, els.next("p:contains(6)").size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41699);final Elements nextF = els.next("p:contains(5)");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41700);assertEquals(1, nextF.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41701);assertEquals("5", nextF.first().text());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41702);Elements nextA = els.nextAll();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41703);assertEquals(4, nextA.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41704);assertEquals("5", nextA.first().text());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41705);assertEquals("12", nextA.last().text());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41706);Elements nextAF = els.nextAll("p:contains(6)");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41707);assertEquals(1, nextAF.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41708);assertEquals("6", nextAF.first().text());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41709);Elements prev = els.prev();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41710);assertEquals(2, prev.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41711);assertEquals("3", prev.first().text());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41712);assertEquals("9", prev.last().text());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41713);assertEquals(0, els.prev("p:contains(1)").size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41714);final Elements prevF = els.prev("p:contains(3)");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41715);assertEquals(1, prevF.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41716);assertEquals("3", prevF.first().text());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41717);Elements prevA = els.prevAll();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41718);assertEquals(6, prevA.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41719);assertEquals("3", prevA.first().text());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41720);assertEquals("7", prevA.last().text());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41721);Elements prevAF = els.prevAll("p:contains(1)");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41722);assertEquals(1, prevAF.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41723);assertEquals("1", prevAF.first().text());
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void eachText() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s3q10rw70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.eachText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41724,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s3q10rw70(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41724);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41725);Document doc = Jsoup.parse("<div><p>1<p>2<p>3<p>4<p>5<p>6</div><div><p>7<p>8<p>9<p>10<p>11<p>12<p></p></div>");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41726);List<String> divText = doc.select("div").eachText();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41727);assertEquals(2, divText.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41728);assertEquals("1 2 3 4 5 6", divText.get(0));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41729);assertEquals("7 8 9 10 11 12", divText.get(1));

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41730);List<String> pText = doc.select("p").eachText();
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41731);Elements ps = doc.select("p");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41732);assertEquals(13, ps.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41733);assertEquals(12, pText.size()); // not 13, as last doesn't have text
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41734);assertEquals("1", pText.get(0));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41735);assertEquals("2", pText.get(1));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41736);assertEquals("5", pText.get(4));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41737);assertEquals("7", pText.get(6));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41738);assertEquals("12", pText.get(11));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}

    @Test public void eachAttr() {__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceStart(getClass().getName(),41739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16fi17dw7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w0mw0mlh9yvhul.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w0mw0mlh9yvhul.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.ElementsTest.eachAttr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16fi17dw7f(){try{__CLR4_4_1w0mw0mlh9yvhul.R.inc(41739);
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41740);Document doc = Jsoup.parse(
            "<div><a href='/foo'>1</a><a href='http://example.com/bar'>2</a><a href=''>3</a><a>4</a>",
            "http://example.com");

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41741);List<String> hrefAttrs = doc.select("a").eachAttr("href");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41742);assertEquals(3, hrefAttrs.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41743);assertEquals("/foo", hrefAttrs.get(0));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41744);assertEquals("http://example.com/bar", hrefAttrs.get(1));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41745);assertEquals("", hrefAttrs.get(2));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41746);assertEquals(4, doc.select("a").size());

        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41747);List<String> absAttrs = doc.select("a").eachAttr("abs:href");
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41748);assertEquals(3, absAttrs.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41749);assertEquals(3, absAttrs.size());
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41750);assertEquals("http://example.com/foo", absAttrs.get(0));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41751);assertEquals("http://example.com/bar", absAttrs.get(1));
        __CLR4_4_1w0mw0mlh9yvhul.R.inc(41752);assertEquals("http://example.com", absAttrs.get(2));
    }finally{__CLR4_4_1w0mw0mlh9yvhul.R.flushNeeded();}}
}
