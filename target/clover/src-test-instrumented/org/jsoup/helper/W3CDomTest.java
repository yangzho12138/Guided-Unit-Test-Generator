/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class W3CDomTest {static class __CLR4_4_19r89r8lh9yvgvq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,12735,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void simpleConversion() {__CLR4_4_19r89r8lh9yvgvq.R.globalSliceStart(getClass().getName(),12644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hnz4up9r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19r89r8lh9yvgvq.R.rethrow($CLV_t2$);}finally{__CLR4_4_19r89r8lh9yvgvq.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.simpleConversion",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hnz4up9r8(){try{__CLR4_4_19r89r8lh9yvgvq.R.inc(12644);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12645);String html = "<html><head><title>W3c</title></head><body><p class='one' id=12>Text</p><!-- comment --><invalid>What<script>alert('!')";
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12646);org.jsoup.nodes.Document doc = Jsoup.parse(html);

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12647);W3CDom w3c = new W3CDom();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12648);Document wDoc = w3c.fromJsoup(doc);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12649);String out = TextUtil.stripNewlines(w3c.asString(wDoc));
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12650);String expected = TextUtil.stripNewlines(
                "<html><head><META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>W3c</title>" +
                "</head><body><p class=\"one\" id=\"12\">Text</p><!-- comment --><invalid>What<script>alert('!')</script>" +
                "</invalid></body></html>"
        );
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12651);assertEquals(expected, out);
    }finally{__CLR4_4_19r89r8lh9yvgvq.R.flushNeeded();}}

    @Test
    public void convertsGoogle() throws IOException {__CLR4_4_19r89r8lh9yvgvq.R.globalSliceStart(getClass().getName(),12652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199saqo9rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19r89r8lh9yvgvq.R.rethrow($CLV_t2$);}finally{__CLR4_4_19r89r8lh9yvgvq.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.convertsGoogle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12652,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199saqo9rg() throws IOException{try{__CLR4_4_19r89r8lh9yvgvq.R.inc(12652);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12653);File in = ParseTest.getFile("/htmltests/google-ipod.html");
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12654);org.jsoup.nodes.Document doc = Jsoup.parse(in, "UTF8");

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12655);W3CDom w3c = new W3CDom();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12656);Document wDoc = w3c.fromJsoup(doc);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12657);Node htmlEl = wDoc.getChildNodes().item(0);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12658);assertEquals(null, htmlEl.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12659);assertEquals("html", htmlEl.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12660);assertEquals("html", htmlEl.getNodeName());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12661);String out = w3c.asString(wDoc);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12662);assertTrue(out.contains("ipod"));
    }finally{__CLR4_4_19r89r8lh9yvgvq.R.flushNeeded();}}
    
    
    @Test
    public void convertsGoogleLocation() throws IOException {__CLR4_4_19r89r8lh9yvgvq.R.globalSliceStart(getClass().getName(),12663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ekp63v9rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19r89r8lh9yvgvq.R.rethrow($CLV_t2$);}finally{__CLR4_4_19r89r8lh9yvgvq.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.convertsGoogleLocation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12663,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ekp63v9rr() throws IOException{try{__CLR4_4_19r89r8lh9yvgvq.R.inc(12663);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12664);File in = ParseTest.getFile("/htmltests/google-ipod.html");
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12665);org.jsoup.nodes.Document doc = Jsoup.parse(in, "UTF8");

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12666);W3CDom w3c = new W3CDom();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12667);Document wDoc = w3c.fromJsoup(doc);

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12668);String out = w3c.asString(wDoc);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12669);assertEquals(doc.location(), wDoc.getDocumentURI() );
    }finally{__CLR4_4_19r89r8lh9yvgvq.R.flushNeeded();}}
    
    

    @Test
    public void namespacePreservation() throws IOException {__CLR4_4_19r89r8lh9yvgvq.R.globalSliceStart(getClass().getName(),12670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qwdhdu9ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19r89r8lh9yvgvq.R.rethrow($CLV_t2$);}finally{__CLR4_4_19r89r8lh9yvgvq.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.namespacePreservation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qwdhdu9ry() throws IOException{try{__CLR4_4_19r89r8lh9yvgvq.R.inc(12670);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12671);File in = ParseTest.getFile("/htmltests/namespaces.xhtml");
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12672);org.jsoup.nodes.Document jsoupDoc;
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12673);jsoupDoc = Jsoup.parse(in, "UTF-8");

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12674);Document doc;
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12675);org.jsoup.helper.W3CDom jDom = new org.jsoup.helper.W3CDom();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12676);doc = jDom.fromJsoup(jsoupDoc);

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12677);Node htmlEl = doc.getChildNodes().item(0);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12678);assertEquals("http://www.w3.org/1999/xhtml", htmlEl.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12679);assertEquals("html", htmlEl.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12680);assertEquals("html", htmlEl.getNodeName());

        // inherits default namespace
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12681);Node head = htmlEl.getFirstChild();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12682);assertEquals("http://www.w3.org/1999/xhtml", head.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12683);assertEquals("head", head.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12684);assertEquals("head", head.getNodeName());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12685);Node epubTitle = htmlEl.getChildNodes().item(2).getChildNodes().item(3);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12686);assertEquals("Check", epubTitle.getTextContent());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12687);assertEquals("http://www.idpf.org/2007/ops", epubTitle.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12688);assertEquals("title", epubTitle.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12689);assertEquals("epub:title", epubTitle.getNodeName());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12690);Node xSection = epubTitle.getNextSibling().getNextSibling();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12691);assertEquals("urn:test", xSection.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12692);assertEquals("section", xSection.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12693);assertEquals("x:section", xSection.getNodeName());

        // https://github.com/jhy/jsoup/issues/977
        // does not keep last set namespace
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12694);Node svg = xSection.getNextSibling().getNextSibling();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12695);assertEquals("http://www.w3.org/2000/svg", svg.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12696);assertEquals("svg", svg.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12697);assertEquals("svg", svg.getNodeName());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12698);Node path = svg.getChildNodes().item(1);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12699);assertEquals("http://www.w3.org/2000/svg", path.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12700);assertEquals("path", path.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12701);assertEquals("path", path.getNodeName());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12702);Node clip = path.getChildNodes().item(1);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12703);assertEquals("http://example.com/clip", clip.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12704);assertEquals("clip", clip.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12705);assertEquals("clip", clip.getNodeName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12706);assertEquals("456", clip.getTextContent());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12707);Node picture = svg.getNextSibling().getNextSibling();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12708);assertEquals("http://www.w3.org/1999/xhtml", picture.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12709);assertEquals("picture", picture.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12710);assertEquals("picture", picture.getNodeName());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12711);Node img = picture.getFirstChild();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12712);assertEquals("http://www.w3.org/1999/xhtml", img.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12713);assertEquals("img", img.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12714);assertEquals("img", img.getNodeName());

    }finally{__CLR4_4_19r89r8lh9yvgvq.R.flushNeeded();}}

    @Test
    public void handlesInvalidAttributeNames() {__CLR4_4_19r89r8lh9yvgvq.R.globalSliceStart(getClass().getName(),12715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12zz1cv9t7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19r89r8lh9yvgvq.R.rethrow($CLV_t2$);}finally{__CLR4_4_19r89r8lh9yvgvq.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.handlesInvalidAttributeNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12zz1cv9t7(){try{__CLR4_4_19r89r8lh9yvgvq.R.inc(12715);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12716);String html = "<html><head></head><body style=\"color: red\" \" name\"></body></html>";
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12717);org.jsoup.nodes.Document jsoupDoc;
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12718);jsoupDoc = Jsoup.parse(html);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12719);Element body = jsoupDoc.select("body").first();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12720);assertTrue(body.hasAttr("\"")); // actually an attribute with key '"'. Correct per HTML5 spec, but w3c xml dom doesn't dig it
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12721);assertTrue(body.hasAttr("name\""));

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12722);Document w3Doc = new W3CDom().fromJsoup(jsoupDoc);
    }finally{__CLR4_4_19r89r8lh9yvgvq.R.flushNeeded();}}

    @Test public void treatsUndeclaredNamespaceAsLocalName() {__CLR4_4_19r89r8lh9yvgvq.R.globalSliceStart(getClass().getName(),12723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w8i75w9tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19r89r8lh9yvgvq.R.rethrow($CLV_t2$);}finally{__CLR4_4_19r89r8lh9yvgvq.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.W3CDomTest.treatsUndeclaredNamespaceAsLocalName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w8i75w9tf(){try{__CLR4_4_19r89r8lh9yvgvq.R.inc(12723);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12724);String html = "<fb:like>One</fb:like>";
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12725);org.jsoup.nodes.Document doc = Jsoup.parse(html);

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12726);Document w3Doc = new W3CDom().fromJsoup(doc);
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12727);Node htmlEl = w3Doc.getFirstChild();

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12728);assertNull(htmlEl.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12729);assertEquals("html", htmlEl.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12730);assertEquals("html", htmlEl.getNodeName());

        __CLR4_4_19r89r8lh9yvgvq.R.inc(12731);Node fb = htmlEl.getFirstChild().getNextSibling().getFirstChild();
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12732);assertNull(fb.getNamespaceURI());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12733);assertEquals("like", fb.getLocalName());
        __CLR4_4_19r89r8lh9yvgvq.R.inc(12734);assertEquals("fb:like", fb.getNodeName());

    }finally{__CLR4_4_19r89r8lh9yvgvq.R.flushNeeded();}}
}

