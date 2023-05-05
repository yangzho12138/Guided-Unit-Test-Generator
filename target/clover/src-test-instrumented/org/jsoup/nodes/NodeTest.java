/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeVisitor;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
/**
 Tests Nodes

 @author Jonathan Hedley, jonathan@hedley.net */
public class NodeTest {static class __CLR4_4_1udhudhlh9yvhq9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,39573,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void handlesBaseUri() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dlj4x5udh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesBaseUri",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dlj4x5udh(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39365);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39366);Tag tag = Tag.valueOf("a");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39367);Attributes attribs = new Attributes();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39368);attribs.put("relHref", "/foo");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39369);attribs.put("absHref", "http://bar/qux");

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39370);Element noBase = new Element(tag, "", attribs);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39371);assertEquals("", noBase.absUrl("relHref")); // with no base, should NOT fallback to href attrib, whatever it is
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39372);assertEquals("http://bar/qux", noBase.absUrl("absHref")); // no base but valid attrib, return attrib

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39373);Element withBase = new Element(tag, "http://foo/", attribs);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39374);assertEquals("http://foo/foo", withBase.absUrl("relHref")); // construct abs from base + rel
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39375);assertEquals("http://bar/qux", withBase.absUrl("absHref")); // href is abs, so returns that
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39376);assertEquals("", withBase.absUrl("noval"));

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39377);Element dodgyBase = new Element(tag, "wtf://no-such-protocol/", attribs);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39378);assertEquals("http://bar/qux", dodgyBase.absUrl("absHref")); // base fails, but href good, so get that
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39379);assertEquals("", dodgyBase.absUrl("relHref")); // base fails, only rel href, so return nothing
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void setBaseUriIsRecursive() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_149srliudw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.setBaseUriIsRecursive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_149srliudw(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39380);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39381);Document doc = Jsoup.parse("<div><p></p></div>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39382);String baseUri = "https://jsoup.org";
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39383);doc.setBaseUri(baseUri);

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39384);assertEquals(baseUri, doc.baseUri());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39385);assertEquals(baseUri, doc.select("div").first().baseUri());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39386);assertEquals(baseUri, doc.select("p").first().baseUri());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void handlesAbsPrefix() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ztl4wue3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39387,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ztl4wue3(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39387);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39388);Document doc = Jsoup.parse("<a href=/foo>Hello</a>", "https://jsoup.org/");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39389);Element a = doc.select("a").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39390);assertEquals("/foo", a.attr("href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39391);assertEquals("https://jsoup.org/foo", a.attr("abs:href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39392);assertTrue(a.hasAttr("abs:href"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void handlesAbsOnImage() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fx3ltoue9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsOnImage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39393,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fx3ltoue9(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39393);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39394);Document doc = Jsoup.parse("<p><img src=\"/rez/osi_logo.png\" /></p>", "https://jsoup.org/");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39395);Element img = doc.select("img").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39396);assertEquals("https://jsoup.org/rez/osi_logo.png", img.attr("abs:src"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39397);assertEquals(img.absUrl("src"), img.attr("abs:src"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void handlesAbsPrefixOnHasAttr() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jyshd2uee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsPrefixOnHasAttr",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jyshd2uee(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39398);
        // 1: no abs url; 2: has abs url
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39399);Document doc = Jsoup.parse("<a id=1 href='/foo'>One</a> <a id=2 href='https://jsoup.org/'>Two</a>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39400);Element one = doc.select("#1").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39401);Element two = doc.select("#2").first();

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39402);assertFalse(one.hasAttr("abs:href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39403);assertTrue(one.hasAttr("href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39404);assertEquals("", one.absUrl("href"));

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39405);assertTrue(two.hasAttr("abs:href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39406);assertTrue(two.hasAttr("href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39407);assertEquals("https://jsoup.org/", two.absUrl("href"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void literalAbsPrefix() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l9xns4ueo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.literalAbsPrefix",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l9xns4ueo(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39408);
        // if there is a literal attribute "abs:xxx", don't try and make absolute.
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39409);Document doc = Jsoup.parse("<a abs:href='odd'>One</a>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39410);Element el = doc.select("a").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39411);assertTrue(el.hasAttr("abs:href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39412);assertEquals("odd", el.attr("abs:href"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void handleAbsOnFileUris() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pr4fnxuet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handleAbsOnFileUris",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pr4fnxuet(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39413);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39414);Document doc = Jsoup.parse("<a href='password'>One/a><a href='/var/log/messages'>Two</a>", "file:/etc/");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39415);Element one = doc.select("a").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39416);assertEquals("file:/etc/password", one.absUrl("href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39417);Element two = doc.select("a").get(1);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39418);assertEquals("file:/var/log/messages", two.absUrl("href"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test
    public void handleAbsOnLocalhostFileUris() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11a5m3wuez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handleAbsOnLocalhostFileUris",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11a5m3wuez(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39419);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39420);Document doc = Jsoup.parse("<a href='password'>One/a><a href='/var/log/messages'>Two</a>", "file://localhost/etc/");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39421);Element one = doc.select("a").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39422);assertEquals("file://localhost/etc/password", one.absUrl("href"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test
    public void handlesAbsOnProtocolessAbsoluteUris() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1woknlguf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.handlesAbsOnProtocolessAbsoluteUris",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1woknlguf3(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39423);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39424);Document doc1 = Jsoup.parse("<a href='//example.net/foo'>One</a>", "http://example.com/");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39425);Document doc2 = Jsoup.parse("<a href='//example.net/foo'>One</a>", "https://example.com/");

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39426);Element one = doc1.select("a").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39427);Element two = doc2.select("a").first();

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39428);assertEquals("http://example.net/foo", one.absUrl("href"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39429);assertEquals("https://example.net/foo", two.absUrl("href"));

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39430);Document doc3 = Jsoup.parse("<img src=//www.google.com/images/errors/logo_sm.gif alt=Google>", "https://google.com");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39431);assertEquals("https://www.google.com/images/errors/logo_sm.gif", doc3.select("img").attr("abs:src"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    /*
    Test for an issue with Java's abs URL handler.
     */
    @Test public void absHandlesRelativeQuery() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11i0tyuufc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.absHandlesRelativeQuery",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11i0tyuufc(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39432);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39433);Document doc = Jsoup.parse("<a href='?foo'>One</a> <a href='bar.html?foo'>Two</a>", "https://jsoup.org/path/file?bar");

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39434);Element a1 = doc.select("a").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39435);assertEquals("https://jsoup.org/path/file?foo", a1.absUrl("href"));

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39436);Element a2 = doc.select("a").get(1);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39437);assertEquals("https://jsoup.org/path/bar.html?foo", a2.absUrl("href"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void absHandlesDotFromIndex() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lig7flufi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.absHandlesDotFromIndex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lig7flufi(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39438);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39439);Document doc = Jsoup.parse("<a href='./one/two.html'>One</a>", "http://example.com");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39440);Element a1 = doc.select("a").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39441);assertEquals("http://example.com/one/two.html", a1.absUrl("href"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void testRemove() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej1cn1ufm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.testRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej1cn1ufm(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39442);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39443);Document doc = Jsoup.parse("<p>One <span>two</span> three</p>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39444);Element p = doc.select("p").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39445);p.childNode(0).remove();

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39446);assertEquals("two three", p.text());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39447);assertEquals("<span>two</span> three", TextUtil.stripNewlines(p.html()));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void testReplace() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fkob0pufs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.testReplace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fkob0pufs(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39448);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39449);Document doc = Jsoup.parse("<p>One <span>two</span> three</p>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39450);Element p = doc.select("p").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39451);Element insert = doc.createElement("em").text("foo");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39452);p.childNode(1).replaceWith(insert);

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39453);assertEquals("One <em>foo</em> three", p.html());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void ownerDocument() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ni1305ufy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.ownerDocument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ni1305ufy(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39454);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39455);Document doc = Jsoup.parse("<p>Hello");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39456);Element p = doc.select("p").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39457);assertTrue(p.ownerDocument() == doc);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39458);assertTrue(doc.ownerDocument() == doc);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39459);assertNull(doc.parent());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void root() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnvqw9ug4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.root",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnvqw9ug4(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39460);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39461);Document doc = Jsoup.parse("<div><p>Hello");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39462);Element p = doc.select("p").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39463);Node root = p.root();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39464);assertTrue(doc == root);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39465);assertNull(root.parent());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39466);assertTrue(doc.root() == doc);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39467);assertTrue(doc.root() == doc.ownerDocument());

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39468);Element standAlone = new Element(Tag.valueOf("p"), "");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39469);assertTrue(standAlone.parent() == null);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39470);assertTrue(standAlone.root() == standAlone);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39471);assertTrue(standAlone.ownerDocument() == null);
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void before() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qd8owqugg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.before",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qd8owqugg(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39472);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39473);Document doc = Jsoup.parse("<p>One <b>two</b> three</p>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39474);Element newNode = new Element(Tag.valueOf("em"), "");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39475);newNode.appendText("four");

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39476);doc.select("b").first().before(newNode);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39477);assertEquals("<p>One <em>four</em><b>two</b> three</p>", doc.body().html());

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39478);doc.select("b").first().before("<i>five</i>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39479);assertEquals("<p>One <em>four</em><i>five</i><b>two</b> three</p>", doc.body().html());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void after() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v4au71ugo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.after",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v4au71ugo(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39480);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39481);Document doc = Jsoup.parse("<p>One <b>two</b> three</p>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39482);Element newNode = new Element(Tag.valueOf("em"), "");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39483);newNode.appendText("four");

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39484);doc.select("b").first().after(newNode);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39485);assertEquals("<p>One <b>two</b><em>four</em> three</p>", doc.body().html());

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39486);doc.select("b").first().after("<i>five</i>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39487);assertEquals("<p>One <b>two</b><i>five</i><em>four</em> three</p>", doc.body().html());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void unwrap() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5yq16ugw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.unwrap",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5yq16ugw(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39488);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39489);Document doc = Jsoup.parse("<div>One <span>Two <b>Three</b></span> Four</div>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39490);Element span = doc.select("span").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39491);Node twoText = span.childNode(0);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39492);Node node = span.unwrap();

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39493);assertEquals("<div>One Two <b>Three</b> Four</div>", TextUtil.stripNewlines(doc.body().html()));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39494);assertTrue(node instanceof TextNode);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39495);assertEquals("Two ", ((TextNode) node).text());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39496);assertEquals(node, twoText);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39497);assertEquals(node.parent(), doc.select("div").first());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void unwrapNoChildren() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17iv7ueuh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.unwrapNoChildren",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17iv7ueuh6(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39498);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39499);Document doc = Jsoup.parse("<div>One <span></span> Two</div>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39500);Element span = doc.select("span").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39501);Node node = span.unwrap();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39502);assertEquals("<div>One  Two</div>", TextUtil.stripNewlines(doc.body().html()));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39503);assertTrue(node == null);
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void traverse() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1h4dh15uhc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.traverse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39504,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1h4dh15uhc(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39504);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39505);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39506);final StringBuilder accum = new StringBuilder();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39507);doc.select("div").first().traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39508);
                __CLR4_4_1udhudhlh9yvhq9.R.inc(39509);accum.append("<").append(node.nodeName()).append(">");
            }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39510);
                __CLR4_4_1udhudhlh9yvhq9.R.inc(39511);accum.append("</").append(node.nodeName()).append(">");
            }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}
        });
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39512);assertEquals("<div><p><#text></#text></p></div>", accum.toString());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void orphanNodeReturnsNullForSiblingElements() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ink4gnuhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.orphanNodeReturnsNullForSiblingElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ink4gnuhl(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39513);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39514);Node node = new Element(Tag.valueOf("p"), "");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39515);Element el = new Element(Tag.valueOf("p"), "");

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39516);assertEquals(0, node.siblingIndex());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39517);assertEquals(0, node.siblingNodes().size());

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39518);assertNull(node.previousSibling());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39519);assertNull(node.nextSibling());

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39520);assertEquals(0, el.siblingElements().size());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39521);assertNull(el.previousElementSibling());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39522);assertNull(el.nextElementSibling());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void nodeIsNotASiblingOfItself() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143nqppuhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.nodeIsNotASiblingOfItself",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143nqppuhv(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39523);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39524);Document doc = Jsoup.parse("<div><p>One<p>Two<p>Three</div>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39525);Element p2 = doc.select("p").get(1);

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39526);assertEquals("Two", p2.text());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39527);List<Node> nodes = p2.siblingNodes();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39528);assertEquals(2, nodes.size());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39529);assertEquals("<p>One</p>", nodes.get(0).outerHtml());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39530);assertEquals("<p>Three</p>", nodes.get(1).outerHtml());
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void childNodesCopy() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptou1dui3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.childNodesCopy",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39531,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptou1dui3(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39531);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39532);Document doc = Jsoup.parse("<div id=1>Text 1 <p>One</p> Text 2 <p>Two<p>Three</div><div id=2>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39533);Element div1 = doc.select("#1").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39534);Element div2 = doc.select("#2").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39535);List<Node> divChildren = div1.childNodesCopy();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39536);assertEquals(5, divChildren.size());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39537);TextNode tn1 = (TextNode) div1.childNode(0);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39538);TextNode tn2 = (TextNode) divChildren.get(0);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39539);tn2.text("Text 1 updated");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39540);assertEquals("Text 1 ", tn1.text());
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39541);div2.insertChildren(-1, divChildren);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39542);assertEquals("<div id=\"1\">Text 1 <p>One</p> Text 2 <p>Two</p><p>Three</p></div><div id=\"2\">Text 1 updated"
            +"<p>One</p> Text 2 <p>Two</p><p>Three</p></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void supportsClone() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xk9siouif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.supportsClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xk9siouif(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39543);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39544);Document doc = org.jsoup.Jsoup.parse("<div class=foo>Text</div>");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39545);Element el = doc.select("div").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39546);assertTrue(el.hasClass("foo"));

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39547);Element elClone = doc.clone().select("div").first();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39548);assertTrue(elClone.hasClass("foo"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39549);assertTrue(elClone.text().equals("Text"));

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39550);el.removeClass("foo");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39551);el.text("None");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39552);assertFalse(el.hasClass("foo"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39553);assertTrue(elClone.hasClass("foo"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39554);assertTrue(el.text().equals("None"));
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39555);assertTrue(elClone.text().equals("Text"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    @Test public void changingAttributeValueShouldReplaceExistingAttributeCaseInsensitive() {__CLR4_4_1udhudhlh9yvhq9.R.globalSliceStart(getClass().getName(),39556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jd0zfauis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1udhudhlh9yvhq9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1udhudhlh9yvhq9.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.NodeTest.changingAttributeValueShouldReplaceExistingAttributeCaseInsensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jd0zfauis(){try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39556);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39557);Document document = Jsoup.parse("<INPUT id=\"foo\" NAME=\"foo\" VALUE=\"\">");
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39558);Element inputElement = document.select("#foo").first();

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39559);inputElement.attr("value","bar");

        __CLR4_4_1udhudhlh9yvhq9.R.inc(39560);assertEquals(singletonAttributes("value", "bar"), getAttributesCaseInsensitive(inputElement, "value"));
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    private Attributes getAttributesCaseInsensitive(Element element, String attributeName) {try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39561);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39562);Attributes matches = new Attributes();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39563);for (Attribute attribute : element.attributes()) {{
            __CLR4_4_1udhudhlh9yvhq9.R.inc(39564);if ((((attribute.getKey().equalsIgnoreCase(attributeName))&&(__CLR4_4_1udhudhlh9yvhq9.R.iget(39565)!=0|true))||(__CLR4_4_1udhudhlh9yvhq9.R.iget(39566)==0&false))) {{
                __CLR4_4_1udhudhlh9yvhq9.R.inc(39567);matches.put(attribute);
            }
        }}
        }__CLR4_4_1udhudhlh9yvhq9.R.inc(39568);return matches;
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}

    private Attributes singletonAttributes(String key, String value) {try{__CLR4_4_1udhudhlh9yvhq9.R.inc(39569);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39570);Attributes attributes = new Attributes();
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39571);attributes.put(key, value);
        __CLR4_4_1udhudhlh9yvhq9.R.inc(39572);return attributes;
    }finally{__CLR4_4_1udhudhlh9yvhq9.R.flushNeeded();}}
}
