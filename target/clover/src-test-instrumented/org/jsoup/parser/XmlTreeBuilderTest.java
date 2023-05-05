/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

import static org.jsoup.nodes.Document.OutputSettings.Syntax;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Tests XmlTreeBuilder.
 *
 * @author Jonathan Hedley
 */
public class XmlTreeBuilderTest {static class __CLR4_4_1voavoalh9yvhth{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,41170,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testSimpleXmlParse() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o01dt3voa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testSimpleXmlParse",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41050,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o01dt3voa(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41050);
        __CLR4_4_1voavoalh9yvhth.R.inc(41051);String xml = "<doc id=2 href='/bar'>Foo <br /><link>One</link><link>Two</link></doc>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41052);XmlTreeBuilder tb = new XmlTreeBuilder();
        __CLR4_4_1voavoalh9yvhth.R.inc(41053);Document doc = tb.parse(xml, "http://foo.com/");
        __CLR4_4_1voavoalh9yvhth.R.inc(41054);assertEquals("<doc id=\"2\" href=\"/bar\">Foo <br /><link>One</link><link>Two</link></doc>",
                TextUtil.stripNewlines(doc.html()));
        __CLR4_4_1voavoalh9yvhth.R.inc(41055);assertEquals(doc.getElementById("2").absUrl("href"), "http://foo.com/bar");
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testPopToClose() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fzqisbvog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testPopToClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fzqisbvog(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41056);
        // test: </val> closes Two, </bar> ignored
        __CLR4_4_1voavoalh9yvhth.R.inc(41057);String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41058);XmlTreeBuilder tb = new XmlTreeBuilder();
        __CLR4_4_1voavoalh9yvhth.R.inc(41059);Document doc = tb.parse(xml, "http://foo.com/");
        __CLR4_4_1voavoalh9yvhth.R.inc(41060);assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testCommentAndDocType() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wy9genvol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testCommentAndDocType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wy9genvol(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41061);
        __CLR4_4_1voavoalh9yvhth.R.inc(41062);String xml = "<!DOCTYPE HTML><!-- a comment -->One <qux />Two";
        __CLR4_4_1voavoalh9yvhth.R.inc(41063);XmlTreeBuilder tb = new XmlTreeBuilder();
        __CLR4_4_1voavoalh9yvhth.R.inc(41064);Document doc = tb.parse(xml, "http://foo.com/");
        __CLR4_4_1voavoalh9yvhth.R.inc(41065);assertEquals("<!DOCTYPE HTML><!-- a comment -->One <qux />Two",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testSupplyParserToJsoupClass() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13lbxs7voq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testSupplyParserToJsoupClass",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13lbxs7voq(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41066);
        __CLR4_4_1voavoalh9yvhth.R.inc(41067);String xml = "<doc><val>One<val>Two</val></bar>Three</doc>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41068);Document doc = Jsoup.parse(xml, "http://foo.com/", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41069);assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    /*
    @Ignore
    @Test
    public void testSupplyParserToConnection() throws IOException {
        String xmlUrl = "http://direct.infohound.net/tools/jsoup-xml-test.xml";

        // parse with both xml and html parser, ensure different
        Document xmlDoc = Jsoup.connect(xmlUrl).parser(Parser.xmlParser()).get();
        Document htmlDoc = Jsoup.connect(xmlUrl).parser(Parser.htmlParser()).get();
        Document autoXmlDoc = Jsoup.connect(xmlUrl).get(); // check connection auto detects xml, uses xml parser

        assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(xmlDoc.html()));
        assertFalse(htmlDoc.equals(xmlDoc));
        assertEquals(xmlDoc, autoXmlDoc);
        assertEquals(1, htmlDoc.select("head").size()); // html parser normalises
        assertEquals(0, xmlDoc.select("head").size()); // xml parser does not
        assertEquals(0, autoXmlDoc.select("head").size()); // xml parser does not
    }*/

    @Test
    public void testSupplyParserToDataStream() throws IOException, URISyntaxException {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14x79jgvou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testSupplyParserToDataStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41070,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14x79jgvou() throws IOException, URISyntaxException{try{__CLR4_4_1voavoalh9yvhth.R.inc(41070);
        __CLR4_4_1voavoalh9yvhth.R.inc(41071);File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-test.xml").toURI());
        __CLR4_4_1voavoalh9yvhth.R.inc(41072);InputStream inStream = new FileInputStream(xmlFile);
        __CLR4_4_1voavoalh9yvhth.R.inc(41073);Document doc = Jsoup.parse(inStream, null, "http://foo.com", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41074);assertEquals("<doc><val>One<val>Two</val>Three</val></doc>",
                TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testDoesNotForceSelfClosingKnownTags() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yp7059voz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testDoesNotForceSelfClosingKnownTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yp7059voz(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41075);
        // html will force "<br>one</br>" to logically "<br />One<br />". XML should be stay "<br>one</br> -- don't recognise tag.
        __CLR4_4_1voavoalh9yvhth.R.inc(41076);Document htmlDoc = Jsoup.parse("<br>one</br>");
        __CLR4_4_1voavoalh9yvhth.R.inc(41077);assertEquals("<br>one\n<br>", htmlDoc.body().html());

        __CLR4_4_1voavoalh9yvhth.R.inc(41078);Document xmlDoc = Jsoup.parse("<br>one</br>", "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41079);assertEquals("<br>one</br>", xmlDoc.html());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test public void handlesXmlDeclarationAsDeclaration() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wsusfzvp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.handlesXmlDeclarationAsDeclaration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41080,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wsusfzvp4(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41080);
        __CLR4_4_1voavoalh9yvhth.R.inc(41081);String html = "<?xml encoding='UTF-8' ?><body>One</body><!-- comment -->";
        __CLR4_4_1voavoalh9yvhth.R.inc(41082);Document doc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41083);assertEquals("<?xml encoding=\"UTF-8\"?> <body> One </body> <!-- comment -->",
                StringUtil.normaliseWhitespace(doc.outerHtml()));
        __CLR4_4_1voavoalh9yvhth.R.inc(41084);assertEquals("#declaration", doc.childNode(0).nodeName());
        __CLR4_4_1voavoalh9yvhth.R.inc(41085);assertEquals("#comment", doc.childNode(2).nodeName());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test public void xmlFragment() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uceqjyvpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.xmlFragment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uceqjyvpa(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41086);
        __CLR4_4_1voavoalh9yvhth.R.inc(41087);String xml = "<one src='/foo/' />Two<three><four /></three>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41088);List<Node> nodes = Parser.parseXmlFragment(xml, "http://example.com/");
        __CLR4_4_1voavoalh9yvhth.R.inc(41089);assertEquals(3, nodes.size());

        __CLR4_4_1voavoalh9yvhth.R.inc(41090);assertEquals("http://example.com/foo/", nodes.get(0).absUrl("src"));
        __CLR4_4_1voavoalh9yvhth.R.inc(41091);assertEquals("one", nodes.get(0).nodeName());
        __CLR4_4_1voavoalh9yvhth.R.inc(41092);assertEquals("Two", ((TextNode)nodes.get(1)).text());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test public void xmlParseDefaultsToHtmlOutputSyntax() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ex3hk1vph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.xmlParseDefaultsToHtmlOutputSyntax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ex3hk1vph(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41093);
        __CLR4_4_1voavoalh9yvhth.R.inc(41094);Document doc = Jsoup.parse("x", "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41095);assertEquals(Syntax.xml, doc.outputSettings().syntax());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testDoesHandleEOFInTag() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kspinnvpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testDoesHandleEOFInTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kspinnvpk(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41096);
        __CLR4_4_1voavoalh9yvhth.R.inc(41097);String html = "<img src=asdf onerror=\"alert(1)\" x=";
        __CLR4_4_1voavoalh9yvhth.R.inc(41098);Document xmlDoc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41099);assertEquals("<img src=\"asdf\" onerror=\"alert(1)\" x=\"\" />", xmlDoc.html());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testDetectCharsetEncodingDeclaration() throws IOException, URISyntaxException {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178j7zrvpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testDetectCharsetEncodingDeclaration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41100,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178j7zrvpo() throws IOException, URISyntaxException{try{__CLR4_4_1voavoalh9yvhth.R.inc(41100);
        __CLR4_4_1voavoalh9yvhth.R.inc(41101);File xmlFile = new File(XmlTreeBuilder.class.getResource("/htmltests/xml-charset.xml").toURI());
        __CLR4_4_1voavoalh9yvhth.R.inc(41102);InputStream inStream = new FileInputStream(xmlFile);
        __CLR4_4_1voavoalh9yvhth.R.inc(41103);Document doc = Jsoup.parse(inStream, null, "http://example.com/", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41104);assertEquals("ISO-8859-1", doc.charset().name());
        __CLR4_4_1voavoalh9yvhth.R.inc(41105);assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?> <data>\u00e4\u00f6\u00e5\u00e9\u00fc</data>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testParseDeclarationAttributes() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gfv65zvpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testParseDeclarationAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gfv65zvpu(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41106);
        __CLR4_4_1voavoalh9yvhth.R.inc(41107);String xml = "<?xml version='1' encoding='UTF-8' something='else'?><val>One</val>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41108);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41109);XmlDeclaration decl = (XmlDeclaration) doc.childNode(0);
        __CLR4_4_1voavoalh9yvhth.R.inc(41110);assertEquals("1", decl.attr("version"));
        __CLR4_4_1voavoalh9yvhth.R.inc(41111);assertEquals("UTF-8", decl.attr("encoding"));
        __CLR4_4_1voavoalh9yvhth.R.inc(41112);assertEquals("else", decl.attr("something"));
        __CLR4_4_1voavoalh9yvhth.R.inc(41113);assertEquals("version=\"1\" encoding=\"UTF-8\" something=\"else\"", decl.getWholeDeclaration());
        __CLR4_4_1voavoalh9yvhth.R.inc(41114);assertEquals("<?xml version=\"1\" encoding=\"UTF-8\" something=\"else\"?>", decl.outerHtml());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void caseSensitiveDeclaration() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_133n50bvq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.caseSensitiveDeclaration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_133n50bvq3(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41115);
        __CLR4_4_1voavoalh9yvhth.R.inc(41116);String xml = "<?XML version='1' encoding='UTF-8' something='else'?>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41117);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41118);assertEquals("<?XML version=\"1\" encoding=\"UTF-8\" something=\"else\"?>", doc.outerHtml());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void testCreatesValidProlog() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15vs5yjvq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.testCreatesValidProlog",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15vs5yjvq7(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41119);
        __CLR4_4_1voavoalh9yvhth.R.inc(41120);Document document = Document.createShell("");
        __CLR4_4_1voavoalh9yvhth.R.inc(41121);document.outputSettings().syntax(Syntax.xml);
        __CLR4_4_1voavoalh9yvhth.R.inc(41122);document.charset(Charset.forName("utf-8"));
        __CLR4_4_1voavoalh9yvhth.R.inc(41123);assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<html>\n" +
            " <head></head>\n" +
            " <body></body>\n" +
            "</html>", document.outerHtml());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void preservesCaseByDefault() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sopafuvqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.preservesCaseByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sopafuvqc(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41124);
        __CLR4_4_1voavoalh9yvhth.R.inc(41125);String xml = "<CHECK>One</CHECK><TEST ID=1>Check</TEST>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41126);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41127);assertEquals("<CHECK>One</CHECK><TEST ID=\"1\">Check</TEST>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void appendPreservesCaseByDefault() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nec978vqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.appendPreservesCaseByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nec978vqg(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41128);
        __CLR4_4_1voavoalh9yvhth.R.inc(41129);String xml = "<One>One</One>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41130);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41131);Elements one = doc.select("One");
        __CLR4_4_1voavoalh9yvhth.R.inc(41132);one.append("<Two ID=2>Two</Two>");
        __CLR4_4_1voavoalh9yvhth.R.inc(41133);assertEquals("<One>One<Two ID=\"2\">Two</Two></One>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void canNormalizeCase() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126v624vqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.canNormalizeCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126v624vqm(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41134);
        __CLR4_4_1voavoalh9yvhth.R.inc(41135);String xml = "<TEST ID=1>Check</TEST>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41136);Document doc = Jsoup.parse(xml, "", Parser.xmlParser().settings(ParseSettings.htmlDefault));
        __CLR4_4_1voavoalh9yvhth.R.inc(41137);assertEquals("<test id=\"1\">Check</test>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test public void normalizesDiscordantTags() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183kh27vqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.normalizesDiscordantTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183kh27vqq(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41138);
        __CLR4_4_1voavoalh9yvhth.R.inc(41139);Parser parser = Parser.xmlParser().settings(ParseSettings.htmlDefault);
        __CLR4_4_1voavoalh9yvhth.R.inc(41140);Document document = Jsoup.parse("<div>test</DIV><p></p>", "", parser);
        __CLR4_4_1voavoalh9yvhth.R.inc(41141);assertEquals("<div>\n test\n</div>\n<p></p>", document.html());
        // was failing -> toString() = "<div>\n test\n <p></p>\n</div>"
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test public void roundTripsCdata() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12v8ahgvqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.roundTripsCdata",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12v8ahgvqu(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41142);
        __CLR4_4_1voavoalh9yvhth.R.inc(41143);String xml = "<div id=1><![CDATA[\n<html>\n <foo><&amp;]]></div>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41144);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());

        __CLR4_4_1voavoalh9yvhth.R.inc(41145);Element div = doc.getElementById("1");
        __CLR4_4_1voavoalh9yvhth.R.inc(41146);assertEquals("<html>\n <foo><&amp;", div.text());
        __CLR4_4_1voavoalh9yvhth.R.inc(41147);assertEquals(0, div.children().size());
        __CLR4_4_1voavoalh9yvhth.R.inc(41148);assertEquals(1, div.childNodeSize()); // no elements, one text node

        __CLR4_4_1voavoalh9yvhth.R.inc(41149);assertEquals("<div id=\"1\"><![CDATA[\n<html>\n <foo><&amp;]]>\n</div>", div.outerHtml());

        __CLR4_4_1voavoalh9yvhth.R.inc(41150);CDataNode cdata = (CDataNode) div.textNodes().get(0);
        __CLR4_4_1voavoalh9yvhth.R.inc(41151);assertEquals("\n<html>\n <foo><&amp;", cdata.text());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test public void cdataPreservesWhiteSpace() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17psr9avr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.cdataPreservesWhiteSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41152,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17psr9avr4(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41152);
        __CLR4_4_1voavoalh9yvhth.R.inc(41153);String xml = "<script type=\"text/javascript\">//<![CDATA[\n\n  foo();\n//]]></script>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41154);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41155);assertEquals(xml, doc.outerHtml());

        __CLR4_4_1voavoalh9yvhth.R.inc(41156);assertEquals("//\n\n  foo();\n//", doc.selectFirst("script").text());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void handlesDodgyXmlDecl() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i5tfjsvr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.handlesDodgyXmlDecl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i5tfjsvr9(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41157);
        __CLR4_4_1voavoalh9yvhth.R.inc(41158);String xml = "<?xml version='1.0'><val>One</val>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41159);Document doc = Jsoup.parse(xml, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41160);assertEquals("One", doc.select("val").text());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test
    public void handlesLTinScript() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14hh3d6vrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.handlesLTinScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14hh3d6vrd(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41161);
        // https://github.com/jhy/jsoup/issues/1139
        __CLR4_4_1voavoalh9yvhth.R.inc(41162);String html = "<script> var a=\"<?\"; var b=\"?>\"; </script>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41163);Document doc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_4_1voavoalh9yvhth.R.inc(41164);assertEquals("<script> var a=\"\n <!--?\"; var b=\"?-->\"; </script>", doc.html()); // converted from pseudo xmldecl to comment
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

    @Test public void dropsDuplicateAttributes() {__CLR4_4_1voavoalh9yvhth.R.globalSliceStart(getClass().getName(),41165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n6hxhvrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1voavoalh9yvhth.R.rethrow($CLV_t2$);}finally{__CLR4_4_1voavoalh9yvhth.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.XmlTreeBuilderTest.dropsDuplicateAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n6hxhvrh(){try{__CLR4_4_1voavoalh9yvhth.R.inc(41165);
        // case sensitive, so should drop Four and Five
        __CLR4_4_1voavoalh9yvhth.R.inc(41166);String html = "<p One=One ONE=Two one=Three One=Four ONE=Five two=Six two=Seven Two=Eight>Text</p>";
        __CLR4_4_1voavoalh9yvhth.R.inc(41167);Parser parser = Parser.xmlParser().setTrackErrors(10);
        __CLR4_4_1voavoalh9yvhth.R.inc(41168);Document doc = parser.parseInput(html, "");

        __CLR4_4_1voavoalh9yvhth.R.inc(41169);assertEquals("<p One=\"One\" ONE=\"Two\" one=\"Three\" two=\"Six\" Two=\"Eight\">Text</p>", doc.selectFirst("p").outerHtml());
    }finally{__CLR4_4_1voavoalh9yvhth.R.flushNeeded();}}

}
