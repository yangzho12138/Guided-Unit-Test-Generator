/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 Tests for Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class DocumentTest {static class __CLR4_4_1t9pt9plh9yvhoy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,38162,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String charsetUtf8 = "UTF-8";
    private static final String charsetIso8859 = "ISO-8859-1";
    
    
    @Test public void setTextPreservesDocumentStructure() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5fv21t9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.setTextPreservesDocumentStructure",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5fv21t9p(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37933);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37934);Document doc = Jsoup.parse("<p>Hello</p>");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37935);doc.text("Replaced");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37936);assertEquals("Replaced", doc.text());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37937);assertEquals("Replaced", doc.body().text());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37938);assertEquals(1, doc.select("head").size());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test public void testTitles() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ybsokt9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testTitles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ybsokt9v(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37939);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37940);Document noTitle = Jsoup.parse("<p>Hello</p>");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37941);Document withTitle = Jsoup.parse("<title>First</title><title>Ignore</title><p>Hello</p>");
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37942);assertEquals("", noTitle.title());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37943);noTitle.title("Hello");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37944);assertEquals("Hello", noTitle.title());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37945);assertEquals("Hello", noTitle.select("title").first().text());
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37946);assertEquals("First", withTitle.title());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37947);withTitle.title("Hello");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37948);assertEquals("Hello", withTitle.title());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37949);assertEquals("Hello", withTitle.select("title").first().text());

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37950);Document normaliseTitle = Jsoup.parse("<title>   Hello\nthere   \n   now   \n");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37951);assertEquals("Hello there now", normaliseTitle.title());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void testOutputEncoding() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ymftppta8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testOutputEncoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37952,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ymftppta8(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37952);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37953);Document doc = Jsoup.parse("<p title=\u03c0>\u03c0 & < > </p>");
        // default is utf-8
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37954);assertEquals("<p title=\"\u03c0\">\u03c0 &amp; &lt; &gt; </p>", doc.body().html());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37955);assertEquals("UTF-8", doc.outputSettings().charset().name());

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37956);doc.outputSettings().charset("ascii");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37957);assertEquals(Entities.EscapeMode.base, doc.outputSettings().escapeMode());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37958);assertEquals("<p title=\"&#x3c0;\">&#x3c0; &amp; &lt; &gt; </p>", doc.body().html());

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37959);doc.outputSettings().escapeMode(Entities.EscapeMode.extended);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37960);assertEquals("<p title=\"&pi;\">&pi; &amp; &lt; &gt; </p>", doc.body().html());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void testXhtmlReferences() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1khgegwtah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testXhtmlReferences",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37961,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1khgegwtah(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37961);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37962);Document doc = Jsoup.parse("&lt; &gt; &amp; &quot; &apos; &times;");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37963);doc.outputSettings().escapeMode(Entities.EscapeMode.xhtml);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37964);assertEquals("&lt; &gt; &amp; \" ' \u00d7", doc.body().html());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void testNormalisesStructure() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_143a7wptal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testNormalisesStructure",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_143a7wptal(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37965);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37966);Document doc = Jsoup.parse("<html><head><script>one</script><noscript><p>two</p></noscript></head><body><p>three</p></body><p>four</p></html>");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37967);assertEquals("<html><head><script>one</script><noscript>&lt;p&gt;two</noscript></head><body><p>three</p><p>four</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void testClone() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1csyejytao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testClone",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1csyejytao(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37968);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37969);Document doc = Jsoup.parse("<title>Hello</title> <p>One<p>Two");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37970);Document clone = doc.clone();

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37971);assertEquals("<html><head><title>Hello</title> </head><body><p>One</p><p>Two</p></body></html>", TextUtil.stripNewlines(clone.html()));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37972);clone.title("Hello there");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37973);clone.select("p").first().text("One more").attr("id", "1");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37974);assertEquals("<html><head><title>Hello there</title> </head><body><p id=\"1\">One more</p><p>Two</p></body></html>", TextUtil.stripNewlines(clone.html()));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37975);assertEquals("<html><head><title>Hello</title> </head><body><p>One</p><p>Two</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void testClonesDeclarations() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ery4bstaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testClonesDeclarations",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ery4bstaw(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37976);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37977);Document doc = Jsoup.parse("<!DOCTYPE html><html><head><title>Doctype test");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37978);Document clone = doc.clone();

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37979);assertEquals(doc.html(), clone.html());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37980);assertEquals("<!doctype html><html><head><title>Doctype test</title></head><body></body></html>",
                TextUtil.stripNewlines(clone.html()));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test public void testLocation() throws IOException {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eng6cytb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testLocation",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eng6cytb1() throws IOException{try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37981);
    	__CLR4_4_1t9pt9plh9yvhoy.R.inc(37982);File in = new ParseTest().getFile("/htmltests/yahoo-jp.html");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37983);Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37984);String location = doc.location();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37985);String baseUri = doc.baseUri();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37986);assertEquals("http://www.yahoo.co.jp/index.html",location);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37987);assertEquals("http://www.yahoo.co.jp/_ylh=X3oDMTB0NWxnaGxsBF9TAzIwNzcyOTYyNjUEdGlkAzEyBHRtcGwDZ2Ex/",baseUri);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37988);in = new ParseTest().getFile("/htmltests/nyt-article-1.html");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37989);doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37990);location = doc.location();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37991);baseUri = doc.baseUri();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37992);assertEquals("http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp",location);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37993);assertEquals("http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp",baseUri);
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void testHtmlAndXmlSyntax() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),37994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ggq8eftbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testHtmlAndXmlSyntax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37994,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ggq8eftbe(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(37994);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37995);String h = "<!DOCTYPE html><body><img async checked='checked' src='&<>\"'>&lt;&gt;&amp;&quot;<foo />bar";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37996);Document doc = Jsoup.parse(h);

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37997);doc.outputSettings().syntax(Syntax.html);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37998);assertEquals("<!doctype html>\n" +
                "<html>\n" +
                " <head></head>\n" +
                " <body>\n" +
                "  <img async checked src=\"&amp;<>&quot;\">&lt;&gt;&amp;\"\n" +
                "  <foo />bar\n" +
                " </body>\n" +
                "</html>", doc.html());

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(37999);doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38000);assertEquals("<!DOCTYPE html>\n" +
                "<html>\n" +
                " <head></head>\n" +
                " <body>\n" +
                "  <img async=\"\" checked=\"checked\" src=\"&amp;<>&quot;\" />&lt;&gt;&amp;\"\n" +
                "  <foo />bar\n" +
                " </body>\n" +
                "</html>", doc.html());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void htmlParseDefaultsToHtmlOutputSyntax() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d3kde3tbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.htmlParseDefaultsToHtmlOutputSyntax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38001,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d3kde3tbl(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38001);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38002);Document doc = Jsoup.parse("x");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38003);assertEquals(Syntax.html, doc.outputSettings().syntax());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test public void testHtmlAppendable() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b0ous8tbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testHtmlAppendable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b0ous8tbo(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38004);
    	__CLR4_4_1t9pt9plh9yvhoy.R.inc(38005);String htmlContent = "<html><head><title>Hello</title></head><body><p>One</p><p>Two</p></body></html>";
    	__CLR4_4_1t9pt9plh9yvhoy.R.inc(38006);Document document = Jsoup.parse(htmlContent);
    	__CLR4_4_1t9pt9plh9yvhoy.R.inc(38007);OutputSettings outputSettings = new OutputSettings();
    	
    	__CLR4_4_1t9pt9plh9yvhoy.R.inc(38008);outputSettings.prettyPrint(false);
    	__CLR4_4_1t9pt9plh9yvhoy.R.inc(38009);document.outputSettings(outputSettings);
    	__CLR4_4_1t9pt9plh9yvhoy.R.inc(38010);assertEquals(htmlContent, document.html(new StringWriter()).toString());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    // Ignored since this test can take awhile to run.
    /*@Ignore
    @Test public void testOverflowClone() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.insert(0, "<i>");
            builder.append("</i>");
        }

        Document doc = Jsoup.parse(builder.toString());
        doc.clone();
    }*/

    @Test public void DocumentsWithSameContentAreEqual() throws Exception {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y0cvfotbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.DocumentsWithSameContentAreEqual",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y0cvfotbv() throws Exception{try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38011);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38012);Document docA = Jsoup.parse("<div/>One");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38013);Document docB = Jsoup.parse("<div/>One");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38014);Document docC = Jsoup.parse("<div/>Two");

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38015);assertFalse(docA.equals(docB));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38016);assertTrue(docA.equals(docA));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38017);assertEquals(docA.hashCode(), docA.hashCode());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38018);assertFalse(docA.hashCode() == docC.hashCode());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void DocumentsWithSameContentAreVerifialbe() throws Exception {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14x62m5tc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.DocumentsWithSameContentAreVerifialbe",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14x62m5tc3() throws Exception{try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38019);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38020);Document docA = Jsoup.parse("<div/>One");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38021);Document docB = Jsoup.parse("<div/>One");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38022);Document docC = Jsoup.parse("<div/>Two");

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38023);assertTrue(docA.hasSameValue(docB));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38024);assertFalse(docA.hasSameValue(docC));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateUtf8() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hgarp2tc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hgarp2tc9(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38025);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38026);final Document doc = createHtmlDocument("changeThis");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38027);doc.updateMetaCharsetElement(true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38028);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38029);final String htmlCharsetUTF8 = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetUtf8 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38030);assertEquals(htmlCharsetUTF8, doc.toString());
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38031);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38032);assertEquals(charsetUtf8, doc.charset().name());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38033);assertEquals(charsetUtf8, selectedElement.attr("charset"));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38034);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateIso8859() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tzdfjmtcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateIso8859",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tzdfjmtcj(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38035);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38036);final Document doc = createHtmlDocument("changeThis");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38037);doc.updateMetaCharsetElement(true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38038);doc.charset(Charset.forName(charsetIso8859));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38039);final String htmlCharsetISO = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetIso8859 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38040);assertEquals(htmlCharsetISO, doc.toString());
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38041);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38042);assertEquals(charsetIso8859, doc.charset().name());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38043);assertEquals(charsetIso8859, selectedElement.attr("charset"));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38044);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateNoCharset() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19489potct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateNoCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19489potct(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38045);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38046);final Document docNoCharset = Document.createShell("");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38047);docNoCharset.updateMetaCharsetElement(true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38048);docNoCharset.charset(Charset.forName(charsetUtf8));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38049);assertEquals(charsetUtf8, docNoCharset.select("meta[charset]").first().attr("charset"));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38050);final String htmlCharsetUTF8 = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetUtf8 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38051);assertEquals(htmlCharsetUTF8, docNoCharset.toString()); 
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateDisabled() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2vqldtd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateDisabled",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2vqldtd0(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38052);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38053);final Document docDisabled = Document.createShell("");
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38054);final String htmlNoCharset = "<html>\n" +
                                        " <head></head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38055);assertEquals(htmlNoCharset, docDisabled.toString());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38056);assertNull(docDisabled.select("meta[charset]").first());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateDisabledNoChanges() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14q2b4ftd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateDisabledNoChanges",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14q2b4ftd5(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38057);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38058);final Document doc = createHtmlDocument("dontTouch");
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38059);final String htmlCharset = "<html>\n" +
                                    " <head>\n" +
                                    "  <meta charset=\"dontTouch\">\n" +
                                    "  <meta name=\"charset\" content=\"dontTouch\">\n" +
                                    " </head>\n" +
                                    " <body></body>\n" +
                                    "</html>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38060);assertEquals(htmlCharset, doc.toString());
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38061);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38062);assertNotNull(selectedElement);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38063);assertEquals("dontTouch", selectedElement.attr("charset"));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38064);selectedElement = doc.select("meta[name=charset]").first();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38065);assertNotNull(selectedElement);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38066);assertEquals("dontTouch", selectedElement.attr("content"));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateEnabledAfterCharsetChange() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwkoeitdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateEnabledAfterCharsetChange",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwkoeitdf(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38067);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38068);final Document doc = createHtmlDocument("dontTouch");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38069);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38070);Element selectedElement = doc.select("meta[charset]").first();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38071);assertEquals(charsetUtf8, selectedElement.attr("charset"));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38072);assertTrue(doc.select("meta[name=charset]").isEmpty());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
            
    @Test
    public void testMetaCharsetUpdateCleanup() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wnzgy5tdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateCleanup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38073,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wnzgy5tdl(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38073);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38074);final Document doc = createHtmlDocument("dontTouch");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38075);doc.updateMetaCharsetElement(true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38076);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38077);final String htmlCharsetUTF8 = "<html>\n" +
                                        " <head>\n" +
                                        "  <meta charset=\"" + charsetUtf8 + "\">\n" +
                                        " </head>\n" +
                                        " <body></body>\n" +
                                        "</html>";
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38078);assertEquals(htmlCharsetUTF8, doc.toString());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlUtf8() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t1xshbtdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlUtf8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38079,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t1xshbtdr(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38079);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38080);final Document doc = createXmlDocument("1.0", "changeThis", true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38081);doc.updateMetaCharsetElement(true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38082);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38083);final String xmlCharsetUTF8 = "<?xml version=\"1.0\" encoding=\"" + charsetUtf8 + "\"?>\n" +
                                        "<root>\n" +
                                        " node\n" +
                                        "</root>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38084);assertEquals(xmlCharsetUTF8, doc.toString());

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38085);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38086);assertEquals(charsetUtf8, doc.charset().name());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38087);assertEquals(charsetUtf8, selectedNode.attr("encoding"));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38088);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlIso8859() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19javxzte1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlIso8859",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19javxzte1(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38089);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38090);final Document doc = createXmlDocument("1.0", "changeThis", true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38091);doc.updateMetaCharsetElement(true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38092);doc.charset(Charset.forName(charsetIso8859));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38093);final String xmlCharsetISO = "<?xml version=\"1.0\" encoding=\"" + charsetIso8859 + "\"?>\n" +
                                        "<root>\n" +
                                        " node\n" +
                                        "</root>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38094);assertEquals(xmlCharsetISO, doc.toString());
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38095);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38096);assertEquals(charsetIso8859, doc.charset().name());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38097);assertEquals(charsetIso8859, selectedNode.attr("encoding"));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38098);assertEquals(doc.charset(), doc.outputSettings().charset());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlNoCharset() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hg1ot5teb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlNoCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hg1ot5teb(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38099);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38100);final Document doc = createXmlDocument("1.0", "none", false);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38101);doc.updateMetaCharsetElement(true);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38102);doc.charset(Charset.forName(charsetUtf8));
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38103);final String xmlCharsetUTF8 = "<?xml version=\"1.0\" encoding=\"" + charsetUtf8 + "\"?>\n" +
                                        "<root>\n" +
                                        " node\n" +
                                        "</root>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38104);assertEquals(xmlCharsetUTF8, doc.toString());
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38105);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38106);assertEquals(charsetUtf8, selectedNode.attr("encoding"));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdateXmlDisabled() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yipcqktej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlDisabled",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yipcqktej(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38107);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38108);final Document doc = createXmlDocument("none", "none", false);
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38109);final String xmlNoCharset = "<root>\n" +
                                    " node\n" +
                                    "</root>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38110);assertEquals(xmlNoCharset, doc.toString());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test
    public void testMetaCharsetUpdateXmlDisabledNoChanges() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12sqwusten();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdateXmlDisabledNoChanges",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12sqwusten(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38111);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38112);final Document doc = createXmlDocument("dontTouch", "dontTouch", true);
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38113);final String xmlCharset = "<?xml version=\"dontTouch\" encoding=\"dontTouch\"?>\n" +
                                    "<root>\n" +
                                    " node\n" +
                                    "</root>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38114);assertEquals(xmlCharset, doc.toString());
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38115);XmlDeclaration selectedNode = (XmlDeclaration) doc.childNode(0);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38116);assertEquals("dontTouch", selectedNode.attr("encoding"));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38117);assertEquals("dontTouch", selectedNode.attr("version"));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    @Test
    public void testMetaCharsetUpdatedDisabledPerDefault() {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxk9yrteu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testMetaCharsetUpdatedDisabledPerDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxk9yrteu(){try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38118);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38119);final Document doc = createHtmlDocument("none");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38120);assertFalse(doc.updateMetaCharsetElement());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    private Document createHtmlDocument(String charset) {try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38121);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38122);final Document doc = Document.createShell("");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38123);doc.head().appendElement("meta").attr("charset", charset);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38124);doc.head().appendElement("meta").attr("name", "charset").attr("content", charset);
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38125);return doc;
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
    
    private Document createXmlDocument(String version, String charset, boolean addDecl) {try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38126);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38127);final Document doc = new Document("");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38128);doc.appendElement("root").text("node");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38129);doc.outputSettings().syntax(Syntax.xml);
        
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38130);if((((addDecl)&&(__CLR4_4_1t9pt9plh9yvhoy.R.iget(38131)!=0|true))||(__CLR4_4_1t9pt9plh9yvhoy.R.iget(38132)==0&false))) {{
            __CLR4_4_1t9pt9plh9yvhoy.R.inc(38133);XmlDeclaration decl = new XmlDeclaration("xml", false);
            __CLR4_4_1t9pt9plh9yvhoy.R.inc(38134);decl.attr("version", version);
            __CLR4_4_1t9pt9plh9yvhoy.R.inc(38135);decl.attr("encoding", charset);
            __CLR4_4_1t9pt9plh9yvhoy.R.inc(38136);doc.prependChild(decl);
        }
        
        }__CLR4_4_1t9pt9plh9yvhoy.R.inc(38137);return doc;
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test
    public void testShiftJisRoundtrip() throws Exception {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_172dd2itfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.testShiftJisRoundtrip",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_172dd2itfe() throws Exception{try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38138);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38139);String input =
                "<html>"
                        +   "<head>"
                        +     "<meta http-equiv=\"content-type\" content=\"text/html; charset=Shift_JIS\" />"
                        +   "</head>"
                        +   "<body>"
                        +     "before&nbsp;after"
                        +   "</body>"
                        + "</html>";
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38140);InputStream is = new ByteArrayInputStream(input.getBytes(Charset.forName("ASCII")));

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38141);Document doc = Jsoup.parse(is, null, "http://example.com");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38142);doc.outputSettings().escapeMode(Entities.EscapeMode.xhtml);

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38143);String output = new String(doc.html().getBytes(doc.outputSettings().charset()), doc.outputSettings().charset());

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38144);assertFalse("Should not have contained a '?'.", output.contains("?"));
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38145);assertTrue("Should have contained a '&#xa0;' or a '&nbsp;'.",
                output.contains("&#xa0;") || output.contains("&nbsp;"));
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}

    @Test public void parseAndHtmlOnDifferentThreads() throws InterruptedException {__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceStart(getClass().getName(),38146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i4fyf9tfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t9pt9plh9yvhoy.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t9pt9plh9yvhoy.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.DocumentTest.parseAndHtmlOnDifferentThreads",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),38146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i4fyf9tfm() throws InterruptedException{try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38146);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38147);String html = "<p>Alrighty then it's not \ud83d\udca9. <span>Next</span></p>"; // \ud83d\udca9
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38148);String asci = "<p>Alrighty then it's not &#x1f4a9;. <span>Next</span></p>";

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38149);final Document doc = Jsoup.parse(html);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38150);final String[] out = new String[1];
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38151);final Elements p = doc.select("p");
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38152);assertEquals(html, p.outerHtml());

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38153);Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {try{__CLR4_4_1t9pt9plh9yvhoy.R.inc(38154);
                __CLR4_4_1t9pt9plh9yvhoy.R.inc(38155);out[0] = p.outerHtml();
                __CLR4_4_1t9pt9plh9yvhoy.R.inc(38156);doc.outputSettings().charset(StandardCharsets.US_ASCII);
            }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
        });
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38157);thread.start();
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38158);thread.join();

        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38159);assertEquals(html, out[0]);
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38160);assertEquals(StandardCharsets.US_ASCII, doc.outputSettings().charset());
        __CLR4_4_1t9pt9plh9yvhoy.R.inc(38161);assertEquals(asci, p.outerHtml());
    }finally{__CLR4_4_1t9pt9plh9yvhoy.R.flushNeeded();}}
}
