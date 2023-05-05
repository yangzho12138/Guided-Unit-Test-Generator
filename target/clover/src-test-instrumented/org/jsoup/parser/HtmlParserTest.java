/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.integration.ParseTest;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the Parser
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class HtmlParserTest {static class __CLR4_4_1uskusklh9yvhsk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,40669,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test public void parsesSimpleDocument() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uyhknousk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesSimpleDocument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uyhknousk(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39908);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39909);String html = "<html><head><title>First!</title></head><body><p>First post! <img src=\"foo.png\" /></p></body></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39910);Document doc = Jsoup.parse(html);
        // need a better way to verify these:
        __CLR4_4_1uskusklh9yvhsk.R.inc(39911);Element p = doc.body().child(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39912);assertEquals("p", p.tagName());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39913);Element img = p.child(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39914);assertEquals("foo.png", img.attr("src"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(39915);assertEquals("img", img.tagName());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void parsesRoughAttributes() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119kdmfuss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesRoughAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39916,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119kdmfuss(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39916);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39917);String html = "<html><head><title>First!</title></head><body><p class=\"foo > bar\">First post! <img src=\"foo.png\" /></p></body></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39918);Document doc = Jsoup.parse(html);

        // need a better way to verify these:
        __CLR4_4_1uskusklh9yvhsk.R.inc(39919);Element p = doc.body().child(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39920);assertEquals("p", p.tagName());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39921);assertEquals("foo > bar", p.attr("class"));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void dropsDuplicateAttributes() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11n6hxhusy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.dropsDuplicateAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39922,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11n6hxhusy(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39922);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39923);String html = "<p One=One ONE=Two Two=two one=Three One=Four two=Five>Text</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39924);Parser parser = Parser.htmlParser().setTrackErrors(10);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39925);Document doc = parser.parseInput(html, "");

        __CLR4_4_1uskusklh9yvhsk.R.inc(39926);Element p = doc.selectFirst("p");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39927);assertEquals("<p one=\"One\" two=\"two\">Text</p>", p.outerHtml()); // normalized names due to lower casing

        __CLR4_4_1uskusklh9yvhsk.R.inc(39928);assertEquals(1, parser.getErrors().size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39929);assertEquals("Duplicate attribute", parser.getErrors().get(0).getErrorMessage());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void retainsAttributesOfDifferentCaseIfSensitive() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5mywdut6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.retainsAttributesOfDifferentCaseIfSensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5mywdut6(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39930);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39931);String html = "<p One=One One=Two one=Three two=Four two=Five Two=Six>Text</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39932);Parser parser = Parser.htmlParser().settings(ParseSettings.preserveCase);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39933);Document doc = parser.parseInput(html, "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39934);assertEquals("<p One=\"One\" one=\"Three\" two=\"Four\" Two=\"Six\">Text</p>", doc.selectFirst("p").outerHtml());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void parsesQuiteRoughAttributes() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z1hodbutb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesQuiteRoughAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z1hodbutb(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39935);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39936);String html = "<p =a>One<a <p>Something</p>Else";
        // this (used to; now gets cleaner) gets a <p> with attr '=a' and an <a tag with an attribue named '<p'; and then auto-recreated
        __CLR4_4_1uskusklh9yvhsk.R.inc(39937);Document doc = Jsoup.parse(html);

        // NOTE: per spec this should be the test case. but impacts too many ppl
        // assertEquals("<p =a>One<a <p>Something</a></p>\n<a <p>Else</a>", doc.body().html());

        __CLR4_4_1uskusklh9yvhsk.R.inc(39938);assertEquals("<p =a>One<a></a></p><p><a>Something</a></p><a>Else</a>", TextUtil.stripNewlines(doc.body().html()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(39939);doc = Jsoup.parse("<p .....>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39940);assertEquals("<p .....></p>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void parsesComments() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ltfdaduth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesComments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ltfdaduth(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39941);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39942);String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --><p>Hello</p></body></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39943);Document doc = Jsoup.parse(html);

        __CLR4_4_1uskusklh9yvhsk.R.inc(39944);Element body = doc.body();
        __CLR4_4_1uskusklh9yvhsk.R.inc(39945);Comment comment = (Comment) body.childNode(1); // comment should not be sub of img, as it's an empty tag
        __CLR4_4_1uskusklh9yvhsk.R.inc(39946);assertEquals(" <table><tr><td></table> ", comment.getData());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39947);Element p = body.child(1);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39948);TextNode text = (TextNode) p.childNode(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39949);assertEquals("Hello", text.getWholeText());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void parsesUnterminatedComments() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p8zspjutq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesUnterminatedComments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p8zspjutq(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39950);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39951);String html = "<p>Hello<!-- <tr><td>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39952);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39953);Element p = doc.getElementsByTag("p").get(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39954);assertEquals("Hello", p.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39955);TextNode text = (TextNode) p.childNode(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39956);assertEquals("Hello", text.getWholeText());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39957);Comment comment = (Comment) p.childNode(1);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39958);assertEquals(" <tr><td>", comment.getData());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void dropsUnterminatedTag() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sso77jutz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.dropsUnterminatedTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sso77jutz(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39959);
        // jsoup used to parse this to <p>, but whatwg, webkit will drop.
        __CLR4_4_1uskusklh9yvhsk.R.inc(39960);String h1 = "<p";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39961);Document doc = Jsoup.parse(h1);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39962);assertEquals(0, doc.getElementsByTag("p").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39963);assertEquals("", doc.text());

        __CLR4_4_1uskusklh9yvhsk.R.inc(39964);String h2 = "<div id=1<p id='2'";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39965);doc = Jsoup.parse(h2);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39966);assertEquals("", doc.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void dropsUnterminatedAttribute() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e8d0vxuu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.dropsUnterminatedAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39967,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e8d0vxuu7(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39967);
        // jsoup used to parse this to <p id="foo">, but whatwg, webkit will drop.
        __CLR4_4_1uskusklh9yvhsk.R.inc(39968);String h1 = "<p id=\"foo";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39969);Document doc = Jsoup.parse(h1);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39970);assertEquals("", doc.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void parsesUnterminatedTextarea() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jwtj8duub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesUnterminatedTextarea",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jwtj8duub(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39971);
        // don't parse right to end, but break on <p>
        __CLR4_4_1uskusklh9yvhsk.R.inc(39972);Document doc = Jsoup.parse("<body><p><textarea>one<p>two");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39973);Element t = doc.select("textarea").first();
        __CLR4_4_1uskusklh9yvhsk.R.inc(39974);assertEquals("one", t.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39975);assertEquals("two", doc.select("p").get(1).text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void parsesUnterminatedOption() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12pcf3suug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesUnterminatedOption",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39976,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12pcf3suug(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39976);
        // bit weird this -- browsers and spec get stuck in select until there's a </select>
        __CLR4_4_1uskusklh9yvhsk.R.inc(39977);Document doc = Jsoup.parse("<body><p><select><option>One<option>Two</p><p>Three</p>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39978);Elements options = doc.select("option");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39979);assertEquals(2, options.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39980);assertEquals("One", options.first().text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39981);assertEquals("TwoThree", options.last().text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testSelectWithOption() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qvdkgguum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSelectWithOption",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qvdkgguum(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39982);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39983);Parser parser = Parser.htmlParser();
        __CLR4_4_1uskusklh9yvhsk.R.inc(39984);parser.setTrackErrors(10);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39985);Document document = parser.parseInput("<select><option>Option 1</option></select>", "http://jsoup.org");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39986);assertEquals(0, parser.getErrors().size());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testSpaceAfterTag() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gftvzbuur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSpaceAfterTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gftvzbuur(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39987);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39988);Document doc = Jsoup.parse("<div > <a name=\"top\"></a ><p id=1 >Hello</p></div>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(39989);assertEquals("<div> <a name=\"top\"></a><p id=\"1\">Hello</p></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void createsDocumentStructure() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),39990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nracncuuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.createsDocumentStructure",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nracncuuu(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(39990);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39991);String html = "<meta name=keywords /><link rel=stylesheet /><title>jsoup</title><p>Hello world</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(39992);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(39993);Element head = doc.head();
        __CLR4_4_1uskusklh9yvhsk.R.inc(39994);Element body = doc.body();

        __CLR4_4_1uskusklh9yvhsk.R.inc(39995);assertEquals(1, doc.children().size()); // root node: contains html node
        __CLR4_4_1uskusklh9yvhsk.R.inc(39996);assertEquals(2, doc.child(0).children().size()); // html node: head and body
        __CLR4_4_1uskusklh9yvhsk.R.inc(39997);assertEquals(3, head.children().size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(39998);assertEquals(1, body.children().size());

        __CLR4_4_1uskusklh9yvhsk.R.inc(39999);assertEquals("keywords", head.getElementsByTag("meta").get(0).attr("name"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40000);assertEquals(0, body.getElementsByTag("meta").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40001);assertEquals("jsoup", doc.title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40002);assertEquals("Hello world", body.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40003);assertEquals("Hello world", body.children().get(0).text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void createsStructureFromBodySnippet() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14a1o0suv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.createsStructureFromBodySnippet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40004,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14a1o0suv8(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40004);
        // the bar baz stuff naturally goes into the body, but the 'foo' goes into root, and the normalisation routine
        // needs to move into the start of the body
        __CLR4_4_1uskusklh9yvhsk.R.inc(40005);String html = "foo <b>bar</b> baz";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40006);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40007);assertEquals("foo bar baz", doc.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesEscapedData() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19q4gdzuvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesEscapedData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19q4gdzuvc(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40008);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40009);String html = "<div title='Surf &amp; Turf'>Reef &amp; Beef</div>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40010);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40011);Element div = doc.getElementsByTag("div").get(0);

        __CLR4_4_1uskusklh9yvhsk.R.inc(40012);assertEquals("Surf & Turf", div.attr("title"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40013);assertEquals("Reef & Beef", div.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesDataOnlyTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_178opltuvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesDataOnlyTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_178opltuvi(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40014);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40015);String t = "<style>font-family: bold</style>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40016);List<Element> tels = Jsoup.parse(t).getElementsByTag("style");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40017);assertEquals("font-family: bold", tels.get(0).data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40018);assertEquals("", tels.get(0).text());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40019);String s = "<p>Hello</p><script>obj.insert('<a rel=\"none\" />');\ni++;</script><p>There</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40020);Document doc = Jsoup.parse(s);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40021);assertEquals("Hello There", doc.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40022);assertEquals("obj.insert('<a rel=\"none\" />');\ni++;", doc.data());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesTextAfterData() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d30e17uvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTextAfterData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d30e17uvr(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40023);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40024);String h = "<html><body>pre <script>inner</script> aft</body></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40025);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40026);assertEquals("<html><head></head><body>pre <script>inner</script> aft</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesTextArea() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sx0tqsuvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTextArea",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sx0tqsuvv(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40027);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40028);Document doc = Jsoup.parse("<textarea>Hello</textarea>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40029);Elements els = doc.select("textarea");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40030);assertEquals("Hello", els.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40031);assertEquals("Hello", els.val());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void preservesSpaceInTextArea() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a5qnmtuw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preservesSpaceInTextArea",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a5qnmtuw0(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40032);
        // preserve because the tag is marked as preserve white space
        __CLR4_4_1uskusklh9yvhsk.R.inc(40033);Document doc = Jsoup.parse("<textarea>\n\tOne\n\tTwo\n\tThree\n</textarea>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40034);String expect = "One\n\tTwo\n\tThree"; // the leading and trailing spaces are dropped as a convenience to authors
        __CLR4_4_1uskusklh9yvhsk.R.inc(40035);Element el = doc.select("textarea").first();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40036);assertEquals(expect, el.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40037);assertEquals(expect, el.val());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40038);assertEquals(expect, el.html());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40039);assertEquals("<textarea>\n\t" + expect + "\n</textarea>", el.outerHtml()); // but preserved in round-trip html
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void preservesSpaceInScript() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1voetmyuw8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preservesSpaceInScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1voetmyuw8(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40040);
        // preserve because it's content is a data node
        __CLR4_4_1uskusklh9yvhsk.R.inc(40041);Document doc = Jsoup.parse("<script>\nOne\n\tTwo\n\tThree\n</script>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40042);String expect = "\nOne\n\tTwo\n\tThree\n";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40043);Element el = doc.select("script").first();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40044);assertEquals(expect, el.data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40045);assertEquals("One\n\tTwo\n\tThree", el.html());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40046);assertEquals("<script>" + expect + "</script>", el.outerHtml());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void doesNotCreateImplicitLists() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13g8sgxuwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.doesNotCreateImplicitLists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40047,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13g8sgxuwf(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40047);
        // old jsoup used to wrap this in <ul>, but that's not to spec
        __CLR4_4_1uskusklh9yvhsk.R.inc(40048);String h = "<li>Point one<li>Point two";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40049);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40050);Elements ol = doc.select("ul"); // should NOT have created a default ul.
        __CLR4_4_1uskusklh9yvhsk.R.inc(40051);assertEquals(0, ol.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40052);Elements lis = doc.select("li");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40053);assertEquals(2, lis.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40054);assertEquals("body", lis.first().parent().tagName());

        // no fiddling with non-implicit lists
        __CLR4_4_1uskusklh9yvhsk.R.inc(40055);String h2 = "<ol><li><p>Point the first<li><p>Point the second";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40056);Document doc2 = Jsoup.parse(h2);

        __CLR4_4_1uskusklh9yvhsk.R.inc(40057);assertEquals(0, doc2.select("ul").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40058);assertEquals(1, doc2.select("ol").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40059);assertEquals(2, doc2.select("ol li").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40060);assertEquals(2, doc2.select("ol li p").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40061);assertEquals(1, doc2.select("ol li").get(0).children().size()); // one p in first li
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void discardsNakedTds() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_129adeguwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.discardsNakedTds",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40062,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_129adeguwu(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40062);
        // jsoup used to make this into an implicit table; but browsers make it into a text run
        __CLR4_4_1uskusklh9yvhsk.R.inc(40063);String h = "<td>Hello<td><p>There<p>now";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40064);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40065);assertEquals("Hello<p>There</p><p>now</p>", TextUtil.stripNewlines(doc.body().html()));
        // <tbody> is introduced if no implicitly creating table, but allows tr to be directly under table
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesNestedImplicitTable() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l4b3ciuwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNestedImplicitTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l4b3ciuwy(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40066);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40067);Document doc = Jsoup.parse("<table><td>1</td></tr> <td>2</td></tr> <td> <table><td>3</td> <td>4</td></table> <tr><td>5</table>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40068);assertEquals("<table><tbody><tr><td>1</td></tr> <tr><td>2</td></tr> <tr><td> <table><tbody><tr><td>3</td> <td>4</td></tr></tbody></table> </td></tr><tr><td>5</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesWhatWgExpensesTableExample() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bnvzb7ux1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesWhatWgExpensesTableExample",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bnvzb7ux1(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40069);
        // http://www.whatwg.org/specs/web-apps/current-work/multipage/tabular-data.html#examples-0
        __CLR4_4_1uskusklh9yvhsk.R.inc(40070);Document doc = Jsoup.parse("<table> <colgroup> <col> <colgroup> <col> <col> <col> <thead> <tr> <th> <th>2008 <th>2007 <th>2006 <tbody> <tr> <th scope=rowgroup> Research and development <td> $ 1,109 <td> $ 782 <td> $ 712 <tr> <th scope=row> Percentage of net sales <td> 3.4% <td> 3.3% <td> 3.7% <tbody> <tr> <th scope=rowgroup> Selling, general, and administrative <td> $ 3,761 <td> $ 2,963 <td> $ 2,433 <tr> <th scope=row> Percentage of net sales <td> 11.6% <td> 12.3% <td> 12.6% </table>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40071);assertEquals("<table> <colgroup> <col> </colgroup><colgroup> <col> <col> <col> </colgroup><thead> <tr> <th> </th><th>2008 </th><th>2007 </th><th>2006 </th></tr></thead><tbody> <tr> <th scope=\"rowgroup\"> Research and development </th><td> $ 1,109 </td><td> $ 782 </td><td> $ 712 </td></tr><tr> <th scope=\"row\"> Percentage of net sales </th><td> 3.4% </td><td> 3.3% </td><td> 3.7% </td></tr></tbody><tbody> <tr> <th scope=\"rowgroup\"> Selling, general, and administrative </th><td> $ 3,761 </td><td> $ 2,963 </td><td> $ 2,433 </td></tr><tr> <th scope=\"row\"> Percentage of net sales </th><td> 11.6% </td><td> 12.3% </td><td> 12.6% </td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesTbodyTable() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rv9yi2ux4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTbodyTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rv9yi2ux4(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40072);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40073);Document doc = Jsoup.parse("<html><head></head><body><table><tbody><tr><td>aaa</td><td>bbb</td></tr></tbody></table></body></html>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40074);assertEquals("<table><tbody><tr><td>aaa</td><td>bbb</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesImplicitCaptionClose() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rbojzdux7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesImplicitCaptionClose",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rbojzdux7(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40075);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40076);Document doc = Jsoup.parse("<table><caption>A caption<td>One<td>Two");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40077);assertEquals("<table><caption>A caption</caption><tbody><tr><td>One</td><td>Two</td></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void noTableDirectInTable() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lyp5muxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.noTableDirectInTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lyp5muxa(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40078);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40079);Document doc = Jsoup.parse("<table> <td>One <td><table><td>Two</table> <table><td>Three");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40080);assertEquals("<table> <tbody><tr><td>One </td><td><table><tbody><tr><td>Two</td></tr></tbody></table> <table><tbody><tr><td>Three</td></tr></tbody></table></td></tr></tbody></table>",
            TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void ignoresDupeEndTrTag() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ilhz67uxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.ignoresDupeEndTrTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ilhz67uxd(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40081);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40082);Document doc = Jsoup.parse("<table><tr><td>One</td><td><table><tr><td>Two</td></tr></tr></table></td><td>Three</td></tr></table>"); // two </tr></tr>, must ignore or will close table
        __CLR4_4_1uskusklh9yvhsk.R.inc(40083);assertEquals("<table><tbody><tr><td>One</td><td><table><tbody><tr><td>Two</td></tr></tbody></table></td><td>Three</td></tr></tbody></table>",
            TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesBaseTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hlc9ssuxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesBaseTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40084,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hlc9ssuxg(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40084);
        // only listen to the first base href
        __CLR4_4_1uskusklh9yvhsk.R.inc(40085);String h = "<a href=1>#</a><base href='/2/'><a href='3'>#</a><base href='http://bar'><a href=/4>#</a>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40086);Document doc = Jsoup.parse(h, "http://foo/");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40087);assertEquals("http://foo/2/", doc.baseUri()); // gets set once, so doc and descendants have first only

        __CLR4_4_1uskusklh9yvhsk.R.inc(40088);Elements anchors = doc.getElementsByTag("a");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40089);assertEquals(3, anchors.size());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40090);assertEquals("http://foo/2/", anchors.get(0).baseUri());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40091);assertEquals("http://foo/2/", anchors.get(1).baseUri());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40092);assertEquals("http://foo/2/", anchors.get(2).baseUri());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40093);assertEquals("http://foo/2/1", anchors.get(0).absUrl("href"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40094);assertEquals("http://foo/2/3", anchors.get(1).absUrl("href"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40095);assertEquals("http://foo/4", anchors.get(2).absUrl("href"));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesProtocolRelativeUrl() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g2ybt3uxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesProtocolRelativeUrl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g2ybt3uxs(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40096);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40097);String base = "https://example.com/";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40098);String html = "<img src='//example.net/img.jpg'>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40099);Document doc = Jsoup.parse(html, base);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40100);Element el = doc.select("img").first();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40101);assertEquals("https://example.net/img.jpg", el.absUrl("src"));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesCdata() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x9stmfuxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCdata",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x9stmfuxy(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40102);
        // todo: as this is html namespace, should actually treat as bogus comment, not cdata. keep as cdata for now
        __CLR4_4_1uskusklh9yvhsk.R.inc(40103);String h = "<div id=1><![CDATA[<html>\n <foo><&amp;]]></div>"; // the &amp; in there should remain literal
        __CLR4_4_1uskusklh9yvhsk.R.inc(40104);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40105);Element div = doc.getElementById("1");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40106);assertEquals("<html>\n <foo><&amp;", div.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40107);assertEquals(0, div.children().size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40108);assertEquals(1, div.childNodeSize()); // no elements, one text node
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void roundTripsCdata() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12v8ahguy5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.roundTripsCdata",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12v8ahguy5(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40109);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40110);String h = "<div id=1><![CDATA[\n<html>\n <foo><&amp;]]></div>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40111);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40112);Element div = doc.getElementById("1");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40113);assertEquals("<html>\n <foo><&amp;", div.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40114);assertEquals(0, div.children().size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40115);assertEquals(1, div.childNodeSize()); // no elements, one text node

        __CLR4_4_1uskusklh9yvhsk.R.inc(40116);assertEquals("<div id=\"1\"><![CDATA[\n<html>\n <foo><&amp;]]>\n</div>", div.outerHtml());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40117);CDataNode cdata = (CDataNode) div.textNodes().get(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40118);assertEquals("\n<html>\n <foo><&amp;", cdata.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesCdataAcrossBuffer() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ogvq54uyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCdataAcrossBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ogvq54uyf(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40119);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40120);StringBuilder sb = new StringBuilder();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40121);while ((((sb.length() <= CharacterReader.maxBufferLen)&&(__CLR4_4_1uskusklh9yvhsk.R.iget(40122)!=0|true))||(__CLR4_4_1uskusklh9yvhsk.R.iget(40123)==0&false))) {{
            __CLR4_4_1uskusklh9yvhsk.R.inc(40124);sb.append("A suitable amount of CData.\n");
        }
        }__CLR4_4_1uskusklh9yvhsk.R.inc(40125);String cdata = sb.toString();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40126);String h = "<div><![CDATA[" + cdata + "]]></div>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40127);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40128);Element div = doc.selectFirst("div");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40129);CDataNode node = (CDataNode) div.textNodes().get(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40130);assertEquals(cdata, node.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesCdataInScript() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17z2vspuyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCdataInScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17z2vspuyr(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40131);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40132);String html = "<script type=\"text/javascript\">//<![CDATA[\n\n  foo();\n//]]></script>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40133);Document doc = Jsoup.parse(html);

        __CLR4_4_1uskusklh9yvhsk.R.inc(40134);String data = "//<![CDATA[\n\n  foo();\n//]]>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40135);Element script = doc.selectFirst("script");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40136);assertEquals("", script.text()); // won't be parsed as cdata because in script data section
        __CLR4_4_1uskusklh9yvhsk.R.inc(40137);assertEquals(data, script.data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40138);assertEquals(html, script.outerHtml());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40139);DataNode dataNode = (DataNode) script.childNode(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40140);assertEquals(data, dataNode.getWholeData());
        // see - not a cdata node, because in script. contrast with XmlTreeBuilder - will be cdata.
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedCdataAtEOF() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guy5sjuz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedCdataAtEOF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40141,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guy5sjuz1(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40141);
        // https://github.com/jhy/jsoup/issues/349 would crash, as character reader would try to seek past EOF
        __CLR4_4_1uskusklh9yvhsk.R.inc(40142);String h = "<![CDATA[]]";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40143);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40144);assertEquals(1, doc.body().childNodeSize());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handleCDataInText() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ap5o2muz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handleCDataInText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ap5o2muz5(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40145);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40146);String h = "<p>One <![CDATA[Two <&]]> Three</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40147);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40148);Element p = doc.selectFirst("p");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40149);List<Node> nodes = p.childNodes();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40150);assertEquals("One ", ((TextNode) nodes.get(0)).getWholeText());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40151);assertEquals("Two <&", ((TextNode) nodes.get(1)).getWholeText());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40152);assertEquals("Two <&", ((CDataNode) nodes.get(1)).getWholeText());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40153);assertEquals(" Three", ((TextNode) nodes.get(2)).getWholeText());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40154);assertEquals(h, p.outerHtml());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void cdataNodesAreTextNodes() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o67r8buzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.cdataNodesAreTextNodes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40155,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o67r8buzf(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40155);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40156);String h = "<p>One <![CDATA[ Two <& ]]> Three</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40157);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40158);Element p = doc.selectFirst("p");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40159);List<TextNode> nodes = p.textNodes();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40160);assertEquals("One ", nodes.get(0).text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40161);assertEquals(" Two <& ", nodes.get(1).text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40162);assertEquals(" Three", nodes.get(2).text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesInvalidStartTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iv0zbeuzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesInvalidStartTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iv0zbeuzn(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40163);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40164);String h = "<div>Hello < There <&amp;></div>"; // parse to <div {#text=Hello < There <&>}>
        __CLR4_4_1uskusklh9yvhsk.R.inc(40165);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40166);assertEquals("Hello < There <&>", doc.select("div").first().text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnknownTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r41u2nuzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnknownTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40167,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r41u2nuzr(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40167);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40168);String h = "<div><foo title=bar>Hello<foo title=qux>there</foo></div>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40169);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40170);Elements foos = doc.select("foo");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40171);assertEquals(2, foos.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40172);assertEquals("bar", foos.first().attr("title"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40173);assertEquals("qux", foos.last().attr("title"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40174);assertEquals("there", foos.last().text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnknownInlineTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yqbluguzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnknownInlineTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40175,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yqbluguzz(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40175);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40176);String h = "<p><cust>Test</cust></p><p><cust><cust>Test</cust></cust></p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40177);Document doc = Jsoup.parseBodyFragment(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40178);String out = doc.body().html();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40179);assertEquals(h, TextUtil.stripNewlines(out));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void parsesBodyFragment() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11jbm8pv04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.parsesBodyFragment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11jbm8pv04(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40180);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40181);String h = "<!-- comment --><p><a href='foo'>One</a></p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40182);Document doc = Jsoup.parseBodyFragment(h, "http://example.com");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40183);assertEquals("<body><!-- comment --><p><a href=\"foo\">One</a></p></body>", TextUtil.stripNewlines(doc.body().outerHtml()));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40184);assertEquals("http://example.com/foo", doc.select("a").first().absUrl("href"));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnknownNamespaceTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s58jgv09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnknownNamespaceTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s58jgv09(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40185);
        // note that the first foo:bar should not really be allowed to be self closing, if parsed in html mode.
        __CLR4_4_1uskusklh9yvhsk.R.inc(40186);String h = "<foo:bar id='1' /><abc:def id=2>Foo<p>Hello</p></abc:def><foo:bar>There</foo:bar>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40187);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40188);assertEquals("<foo:bar id=\"1\" /><abc:def id=\"2\">Foo<p>Hello</p></abc:def><foo:bar>There</foo:bar>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesKnownEmptyBlocks() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1punk1uv0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyBlocks",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40189,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1punk1uv0d(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40189);
        // if a known tag, allow self closing outside of spec, but force an end tag. unknown tags can be self closing.
        __CLR4_4_1uskusklh9yvhsk.R.inc(40190);String h = "<div id='1' /><script src='/foo' /><div id=2><img /><img></div><a id=3 /><i /><foo /><foo>One</foo> <hr /> hr text <hr> hr text two";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40191);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40192);assertEquals("<div id=\"1\"></div><script src=\"/foo\"></script><div id=\"2\"><img><img></div><a id=\"3\"></a><i></i><foo /><foo>One</foo> <hr> hr text <hr> hr text two", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesKnownEmptyNoFrames() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uehs65v0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyNoFrames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40193,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uehs65v0h(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40193);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40194);String h = "<html><head><noframes /><meta name=foo></head><body>One</body></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40195);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40196);assertEquals("<html><head><noframes></noframes><meta name=\"foo\"></head><body>One</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesKnownEmptyStyle() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nojzstv0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyStyle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nojzstv0l(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40197);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40198);String h = "<html><head><style /><meta name=foo></head><body>One</body></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40199);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40200);assertEquals("<html><head><style></style><meta name=\"foo\"></head><body>One</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesKnownEmptyTitle() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d0aaq2v0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyTitle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d0aaq2v0p(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40201);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40202);String h = "<html><head><title /><meta name=foo></head><body>One</body></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40203);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40204);assertEquals("<html><head><title></title><meta name=\"foo\"></head><body>One</body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesKnownEmptyIframe() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o0igrkv0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesKnownEmptyIframe",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40205,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o0igrkv0t(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40205);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40206);String h = "<p>One</p><iframe id=1 /><p>Two";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40207);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40208);assertEquals("<html><head></head><body><p>One</p><iframe id=\"1\"></iframe><p>Two</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesSolidusAtAttributeEnd() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwwahjv0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesSolidusAtAttributeEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40209,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwwahjv0x(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40209);
        // this test makes sure [<a href=/>link</a>] is parsed as [<a href="/">link</a>], not [<a href="" /><a>link</a>]
        __CLR4_4_1uskusklh9yvhsk.R.inc(40210);String h = "<a href=/>link</a>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40211);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40212);assertEquals("<a href=\"/\">link</a>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesMultiClosingBody() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dv7er4v11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesMultiClosingBody",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dv7er4v11(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40213);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40214);String h = "<body><p>Hello</body><p>there</p></body></body></html><p>now";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40215);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40216);assertEquals(3, doc.select("p").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40217);assertEquals(3, doc.body().children().size());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedDefinitionLists() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q51ph5v16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedDefinitionLists",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q51ph5v16(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40218);
        // jsoup used to create a <dl>, but that's not to spec
        __CLR4_4_1uskusklh9yvhsk.R.inc(40219);String h = "<dt>Foo<dd>Bar<dt>Qux<dd>Zug";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40220);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40221);assertEquals(0, doc.select("dl").size()); // no auto dl
        __CLR4_4_1uskusklh9yvhsk.R.inc(40222);assertEquals(4, doc.select("dt, dd").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40223);Elements dts = doc.select("dt");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40224);assertEquals(2, dts.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40225);assertEquals("Zug", dts.get(1).nextElementSibling().text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesBlocksInDefinitions() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q69afjv1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesBlocksInDefinitions",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q69afjv1e(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40226);
        // per the spec, dt and dd are inline, but in practise are block
        __CLR4_4_1uskusklh9yvhsk.R.inc(40227);String h = "<dl><dt><div id=1>Term</div></dt><dd><div id=2>Def</div></dd></dl>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40228);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40229);assertEquals("dt", doc.select("#1").first().parent().tagName());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40230);assertEquals("dd", doc.select("#2").first().parent().tagName());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40231);assertEquals("<dl><dt><div id=\"1\">Term</div></dt><dd><div id=\"2\">Def</div></dd></dl>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesFrames() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2ui2wv1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesFrames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2ui2wv1k(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40232);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40233);String h = "<html><head><script></script><noscript></noscript></head><frameset><frame src=foo></frame><frame src=foo></frameset></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40234);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40235);assertEquals("<html><head><script></script><noscript></noscript></head><frameset><frame src=\"foo\"><frame src=\"foo\"></frameset></html>",
            TextUtil.stripNewlines(doc.html()));
        // no body auto vivification
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void ignoresContentAfterFrameset() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c90n0gv1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.ignoresContentAfterFrameset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c90n0gv1o(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40236);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40237);String h = "<html><head><title>One</title></head><frameset><frame /><frame /></frameset><table></table></html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40238);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40239);assertEquals("<html><head><title>One</title></head><frameset><frame><frame></frameset></html>", TextUtil.stripNewlines(doc.html()));
        // no body, no table. No crash!
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesJavadocFont() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gfrmkhv1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesJavadocFont",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40240,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gfrmkhv1s(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40240);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40241);String h = "<TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\">    <A HREF=\"deprecated-list.html\"><FONT CLASS=\"NavBarFont1\"><B>Deprecated</B></FONT></A>&nbsp;</TD>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40242);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40243);Element a = doc.select("a").first();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40244);assertEquals("Deprecated", a.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40245);assertEquals("font", a.child(0).tagName());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40246);assertEquals("b", a.child(0).child(0).tagName());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesBaseWithoutHref() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_193t7hav1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesBaseWithoutHref",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_193t7hav1z(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40247);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40248);String h = "<head><base target='_blank'></head><body><a href=/foo>Test</a></body>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40249);Document doc = Jsoup.parse(h, "http://example.com/");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40250);Element a = doc.select("a").first();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40251);assertEquals("/foo", a.attr("href"));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40252);assertEquals("http://example.com/foo", a.attr("abs:href"));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void normalisesDocument() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sm4mbjv25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisesDocument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sm4mbjv25(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40253);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40254);String h = "<!doctype html>One<html>Two<head>Three<link></head>Four<body>Five </body>Six </html>Seven ";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40255);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40256);assertEquals("<!doctype html><html><head></head><body>OneTwoThree<link>FourFive Six Seven </body></html>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void normalisesEmptyDocument() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19sw79sv29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisesEmptyDocument",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40257,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19sw79sv29(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40257);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40258);Document doc = Jsoup.parse("");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40259);assertEquals("<html><head></head><body></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void normalisesHeadlessBody() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t2yz35v2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisesHeadlessBody",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t2yz35v2c(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40260);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40261);Document doc = Jsoup.parse("<html><body><span class=\"foo\">bar</span>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40262);assertEquals("<html><head></head><body><span class=\"foo\">bar</span></body></html>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void normalisedBodyAfterContent() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16u7h1mv2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalisedBodyAfterContent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40263,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16u7h1mv2f(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40263);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40264);Document doc = Jsoup.parse("<font face=Arial><body class=name><div>One</div></body></font>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40265);assertEquals("<html><head></head><body class=\"name\"><font face=\"Arial\"><div>One</div></font></body></html>",
            TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void findsCharsetInMalformedMeta() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hga8eov2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.findsCharsetInMalformedMeta",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hga8eov2i(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40266);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40267);String h = "<meta http-equiv=Content-Type content=text/html; charset=gb2312>";
        // example cited for reason of html5's <meta charset> element
        __CLR4_4_1uskusklh9yvhsk.R.inc(40268);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40269);assertEquals("gb2312", doc.select("meta").attr("charset"));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testHgroup() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qqpi7kv2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHgroup",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qqpi7kv2m(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40270);
        // jsoup used to not allow hroup in h{n}, but that's not in spec, and browsers are OK
        __CLR4_4_1uskusklh9yvhsk.R.inc(40271);Document doc = Jsoup.parse("<h1>Hello <h2>There <hgroup><h1>Another<h2>headline</hgroup> <hgroup><h1>More</h1><p>stuff</p></hgroup>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40272);assertEquals("<h1>Hello </h1><h2>There <hgroup><h1>Another</h1><h2>headline</h2></hgroup> <hgroup><h1>More</h1><p>stuff</p></hgroup></h2>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testRelaxedTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xulrwjv2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testRelaxedTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xulrwjv2p(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40273);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40274);Document doc = Jsoup.parse("<abc_def id=1>Hello</abc_def> <abc-def>There</abc-def>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40275);assertEquals("<abc_def id=\"1\">Hello</abc_def> <abc-def>There</abc-def>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testHeaderContents() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v8c3c0v2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHeaderContents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v8c3c0v2s(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40276);
        // h* tags (h1 .. h9) in browsers can handle any internal content other than other h*. which is not per any
        // spec, which defines them as containing phrasing content only. so, reality over theory.
        __CLR4_4_1uskusklh9yvhsk.R.inc(40277);Document doc = Jsoup.parse("<h1>Hello <div>There</div> now</h1> <h2>More <h3>Content</h3></h2>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40278);assertEquals("<h1>Hello <div>There</div> now</h1> <h2>More </h2><h3>Content</h3>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testSpanContents() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k2vt8dv2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSpanContents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40279,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k2vt8dv2v(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40279);
        // like h1 tags, the spec says SPAN is phrasing only, but browsers and publisher treat span as a block tag
        __CLR4_4_1uskusklh9yvhsk.R.inc(40280);Document doc = Jsoup.parse("<span>Hello <div>there</div> <span>now</span></span>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40281);assertEquals("<span>Hello <div>there</div> <span>now</span></span>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testNoImagesInNoScriptInHead() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11vh4jcv2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testNoImagesInNoScriptInHead",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11vh4jcv2y(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40282);
        // jsoup used to allow, but against spec if parsing with noscript
        __CLR4_4_1uskusklh9yvhsk.R.inc(40283);Document doc = Jsoup.parse("<html><head><noscript><img src='foo'></noscript></head><body><p>Hello</p></body></html>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40284);assertEquals("<html><head><noscript>&lt;img src=\"foo\"&gt;</noscript></head><body><p>Hello</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testAFlowContents() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dbae6v31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testAFlowContents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dbae6v31(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40285);
        // html5 has <a> as either phrasing or block
        __CLR4_4_1uskusklh9yvhsk.R.inc(40286);Document doc = Jsoup.parse("<a>Hello <div>there</div> <span>now</span></a>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40287);assertEquals("<a>Hello <div>there</div> <span>now</span></a>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testFontFlowContents() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ub80tsv34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testFontFlowContents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ub80tsv34(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40288);
        // html5 has no definition of <font>; often used as flow
        __CLR4_4_1uskusklh9yvhsk.R.inc(40289);Document doc = Jsoup.parse("<font>Hello <div>there</div> <span>now</span></font>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40290);assertEquals("<font>Hello <div>there</div> <span>now</span></font>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesMisnestedTagsBI() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14ccjkmv37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesMisnestedTagsBI",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14ccjkmv37(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40291);
        // whatwg: <b><i></b></i>
        __CLR4_4_1uskusklh9yvhsk.R.inc(40292);String h = "<p>1<b>2<i>3</b>4</i>5</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40293);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40294);assertEquals("<p>1<b>2<i>3</i></b><i>4</i>5</p>", doc.body().html());
        // adoption agency on </b>, reconstruction of formatters on 4.
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesMisnestedTagsBP() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ien7ypv3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesMisnestedTagsBP",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ien7ypv3b(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40295);
        //  whatwg: <b><p></b></p>
        __CLR4_4_1uskusklh9yvhsk.R.inc(40296);String h = "<b>1<p>2</b>3</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40297);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40298);assertEquals("<b>1</b>\n<p><b>2</b>3</p>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    /*@Ignore // todo: test case for https://github.com/jhy/jsoup/issues/845. Doesn't work yet.
    @Test public void handlesMisnestedAInDivs() {
        String h = "<a href='#1'><div><div><a href='#2'>child</a</div</div></a>";
        String w = "<a href=\"#1\"></a><div><a href=\"#1\"></a><div><a href=\"#1\"></a><a href=\"#2\">child</a></div></div>";
        Document doc = Jsoup.parse(h);
        assertEquals(
            StringUtil.normaliseWhitespace(w),
            StringUtil.normaliseWhitespace(doc.body().html()));
    }*/

    @Test public void handlesUnexpectedMarkupInTables() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fa9gkrv3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnexpectedMarkupInTables",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fa9gkrv3f(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40299);
        // whatwg - tests markers in active formatting (if they didn't work, would get in in table)
        // also tests foster parenting
        __CLR4_4_1uskusklh9yvhsk.R.inc(40300);String h = "<table><b><tr><td>aaa</td></tr>bbb</table>ccc";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40301);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40302);assertEquals("<b></b><b>bbb</b><table><tbody><tr><td>aaa</td></tr></tbody></table><b>ccc</b>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedFormattingElements() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q8tn1pv3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedFormattingElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q8tn1pv3j(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40303);
        // whatwg: formatting elements get collected and applied, but excess elements are thrown away
        __CLR4_4_1uskusklh9yvhsk.R.inc(40304);String h = "<!DOCTYPE html>\n" +
            "<p><b class=x><b class=x><b><b class=x><b class=x><b>X\n" +
            "<p>X\n" +
            "<p><b><b class=x><b>X\n" +
            "<p></b></b></b></b></b></b>X";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40305);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40306);doc.outputSettings().indentAmount(0);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40307);String want = "<!doctype html>\n" +
            "<html>\n" +
            "<head></head>\n" +
            "<body>\n" +
            "<p><b class=\"x\"><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></b></p>\n" +
            "<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b>X </b></b></b></b></b></p>\n" +
            "<p><b class=\"x\"><b><b class=\"x\"><b class=\"x\"><b><b><b class=\"x\"><b>X </b></b></b></b></b></b></b></b></p>\n" +
            "<p>X</p>\n" +
            "</body>\n" +
            "</html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40308);assertEquals(want, doc.html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedAnchors() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13c6r6dv3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedAnchors",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13c6r6dv3p(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40309);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40310);String h = "<a href='http://example.com/'>Link<p>Error link</a>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40311);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40312);String want = "<a href=\"http://example.com/\">Link</a>\n<p><a href=\"http://example.com/\">Error link</a></p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40313);assertEquals(want, doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void reconstructFormattingElements() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lwm9yfv3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.reconstructFormattingElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lwm9yfv3u(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40314);
        // tests attributes and multi b
        __CLR4_4_1uskusklh9yvhsk.R.inc(40315);String h = "<p><b class=one>One <i>Two <b>Three</p><p>Hello</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40316);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40317);assertEquals("<p><b class=\"one\">One <i>Two <b>Three</b></i></b></p>\n<p><b class=\"one\"><i><b>Hello</b></i></b></p>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void reconstructFormattingElementsInTable() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oy2ihcv3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.reconstructFormattingElementsInTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oy2ihcv3y(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40318);
        // tests that tables get formatting markers -- the <b> applies outside the table and does not leak in,
        // and the <i> inside the table and does not leak out.
        __CLR4_4_1uskusklh9yvhsk.R.inc(40319);String h = "<p><b>One</p> <table><tr><td><p><i>Three<p>Four</i></td></tr></table> <p>Five</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40320);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40321);String want = "<p><b>One</b></p>\n" +
            "<b> \n" +
            " <table>\n" +
            "  <tbody>\n" +
            "   <tr>\n" +
            "    <td><p><i>Three</i></p><p><i>Four</i></p></td>\n" +
            "   </tr>\n" +
            "  </tbody>\n" +
            " </table> <p>Five</p></b>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40322);assertEquals(want, doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void commentBeforeHtml() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azkxwwv43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.commentBeforeHtml",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azkxwwv43(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40323);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40324);String h = "<!-- comment --><!-- comment 2 --><p>One</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40325);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40326);assertEquals("<!-- comment --><!-- comment 2 --><html><head></head><body><p>One</p></body></html>", TextUtil.stripNewlines(doc.html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void emptyTdTag() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_199jct8v47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.emptyTdTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_199jct8v47(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40327);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40328);String h = "<table><tr><td>One</td><td id='2' /></tr></table>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40329);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40330);assertEquals("<td>One</td>\n<td id=\"2\"></td>", doc.select("tr").first().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesSolidusInA() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqqlr9v4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesSolidusInA",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40331,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqqlr9v4b(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40331);
        // test for bug #66
        __CLR4_4_1uskusklh9yvhsk.R.inc(40332);String h = "<a class=lp href=/lib/14160711/>link text</a>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40333);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40334);Element a = doc.select("a").first();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40335);assertEquals("link text", a.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40336);assertEquals("/lib/14160711/", a.attr("href"));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesSpanInTbody() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1se0fr7v4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesSpanInTbody",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1se0fr7v4h(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40337);
        // test for bug 64
        __CLR4_4_1uskusklh9yvhsk.R.inc(40338);String h = "<table><tbody><span class='1'><tr><td>One</td></tr><tr><td>Two</td></tr></span></tbody></table>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40339);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40340);assertEquals(doc.select("span").first().children().size(), 0); // the span gets closed
        __CLR4_4_1uskusklh9yvhsk.R.inc(40341);assertEquals(doc.select("table").size(), 1); // only one table
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedTitleAtEof() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hutm4ov4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedTitleAtEof",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hutm4ov4m(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40342);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40343);assertEquals("Data", Jsoup.parse("<title>Data").title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40344);assertEquals("Data<", Jsoup.parse("<title>Data<").title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40345);assertEquals("Data</", Jsoup.parse("<title>Data</").title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40346);assertEquals("Data</t", Jsoup.parse("<title>Data</t").title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40347);assertEquals("Data</ti", Jsoup.parse("<title>Data</ti").title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40348);assertEquals("Data", Jsoup.parse("<title>Data</title>").title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40349);assertEquals("Data", Jsoup.parse("<title>Data</title >").title());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedTitle() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m7b775v4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedTitle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m7b775v4u(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40350);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40351);Document one = Jsoup.parse("<title>One <b>Two <b>Three</TITLE><p>Test</p>"); // has title, so <b> is plain text
        __CLR4_4_1uskusklh9yvhsk.R.inc(40352);assertEquals("One <b>Two <b>Three", one.title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40353);assertEquals("Test", one.select("p").first().text());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40354);Document two = Jsoup.parse("<title>One<b>Two <p>Test</p>"); // no title, so <b> causes </title> breakout
        __CLR4_4_1uskusklh9yvhsk.R.inc(40355);assertEquals("One", two.title());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40356);assertEquals("<b>Two <p>Test</p></b>", two.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedScriptAtEof() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qtsjnvv51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedScriptAtEof",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qtsjnvv51(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40357);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40358);assertEquals("Data", Jsoup.parse("<script>Data").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40359);assertEquals("Data<", Jsoup.parse("<script>Data<").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40360);assertEquals("Data</sc", Jsoup.parse("<script>Data</sc").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40361);assertEquals("Data</-sc", Jsoup.parse("<script>Data</-sc").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40362);assertEquals("Data</sc-", Jsoup.parse("<script>Data</sc-").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40363);assertEquals("Data</sc--", Jsoup.parse("<script>Data</sc--").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40364);assertEquals("Data", Jsoup.parse("<script>Data</script>").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40365);assertEquals("Data</script", Jsoup.parse("<script>Data</script").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40366);assertEquals("Data", Jsoup.parse("<script>Data</script ").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40367);assertEquals("Data", Jsoup.parse("<script>Data</script n").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40368);assertEquals("Data", Jsoup.parse("<script>Data</script n=").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40369);assertEquals("Data", Jsoup.parse("<script>Data</script n=\"").select("script").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40370);assertEquals("Data", Jsoup.parse("<script>Data</script n=\"p").select("script").first().data());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesUnclosedRawtextAtEof() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13y51itv5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesUnclosedRawtextAtEof",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40371,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13y51itv5f(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40371);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40372);assertEquals("Data", Jsoup.parse("<style>Data").select("style").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40373);assertEquals("Data</st", Jsoup.parse("<style>Data</st").select("style").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40374);assertEquals("Data", Jsoup.parse("<style>Data</style>").select("style").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40375);assertEquals("Data</style", Jsoup.parse("<style>Data</style").select("style").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40376);assertEquals("Data</-style", Jsoup.parse("<style>Data</-style").select("style").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40377);assertEquals("Data</style-", Jsoup.parse("<style>Data</style-").select("style").first().data());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40378);assertEquals("Data</style--", Jsoup.parse("<style>Data</style--").select("style").first().data());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void noImplicitFormForTextAreas() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13il275v5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.noImplicitFormForTextAreas",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13il275v5n(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40379);
        // old jsoup parser would create implicit forms for form children like <textarea>, but no more
        __CLR4_4_1uskusklh9yvhsk.R.inc(40380);Document doc = Jsoup.parse("<textarea>One</textarea>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40381);assertEquals("<textarea>One</textarea>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesEscapedScript() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ho4tu2v5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesEscapedScript",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ho4tu2v5q(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40382);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40383);Document doc = Jsoup.parse("<script><!-- one <script>Blah</script> --></script>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40384);assertEquals("<!-- one <script>Blah</script> -->", doc.select("script").first().data());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handles0CharacterAsText() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmdfqiv5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handles0CharacterAsText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmdfqiv5t(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40385);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40386);Document doc = Jsoup.parse("0<p>0</p>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40387);assertEquals("0\n<p>0</p>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesNullInData() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ph1pw8v5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNullInData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ph1pw8v5w(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40388);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40389);Document doc = Jsoup.parse("<p id=\u0000>Blah \u0000</p>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40390);assertEquals("<p id=\"\ufffd\">Blah \u0000</p>", doc.body().html()); // replaced in attr, NOT replaced in data
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesNullInComments() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14wess2v5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNullInComments",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14wess2v5z(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40391);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40392);Document doc = Jsoup.parse("<body><!-- \u0000 \u0000 -->");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40393);assertEquals("<!-- \ufffd \ufffd -->", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesNewlinesAndWhitespaceInTag() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrbdwyv62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesNewlinesAndWhitespaceInTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrbdwyv62(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40394);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40395);Document doc = Jsoup.parse("<a \n href=\"one\" \r\n id=\"two\" \f >");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40396);assertEquals("<a href=\"one\" id=\"two\"></a>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesWhitespaceInoDocType() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1udex49v65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesWhitespaceInoDocType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1udex49v65(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40397);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40398);String html = "<!DOCTYPE html\r\n" +
            "      PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\r\n" +
            "      \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40399);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40400);assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">", doc.childNode(0).outerHtml());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void tracksErrorsWhenRequested() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18ofxsov69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.tracksErrorsWhenRequested",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18ofxsov69(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40401);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40402);String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40403);Parser parser = Parser.htmlParser().setTrackErrors(500);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40404);Document doc = Jsoup.parse(html, "http://example.com", parser);

        __CLR4_4_1uskusklh9yvhsk.R.inc(40405);List<ParseError> errors = parser.getErrors();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40406);assertEquals(5, errors.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40407);assertEquals("20: Attributes incorrectly present on end tag", errors.get(0).toString());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40408);assertEquals("35: Unexpected token [Doctype] when in state [InBody]", errors.get(1).toString());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40409);assertEquals("36: Invalid character reference: invalid named reference 'arrgh'", errors.get(2).toString());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40410);assertEquals("50: Tag cannot be self closing; not a void tag", errors.get(3).toString());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40411);assertEquals("61: Unexpectedly reached end of file (EOF) in input state [TagName]", errors.get(4).toString());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void tracksLimitedErrorsWhenRequested() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xk373yv6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.tracksLimitedErrorsWhenRequested",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xk373yv6k(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40412);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40413);String html = "<p>One</p href='no'><!DOCTYPE html>&arrgh;<font /><br /><foo";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40414);Parser parser = Parser.htmlParser().setTrackErrors(3);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40415);Document doc = parser.parseInput(html, "http://example.com");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40416);List<ParseError> errors = parser.getErrors();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40417);assertEquals(3, errors.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40418);assertEquals("20: Attributes incorrectly present on end tag", errors.get(0).toString());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40419);assertEquals("35: Unexpected token [Doctype] when in state [InBody]", errors.get(1).toString());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40420);assertEquals("36: Invalid character reference: invalid named reference 'arrgh'", errors.get(2).toString());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void noErrorsByDefault() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oypw3fv6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.noErrorsByDefault",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oypw3fv6t(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40421);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40422);String html = "<p>One</p href='no'>&arrgh;<font /><br /><foo";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40423);Parser parser = Parser.htmlParser();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40424);Document doc = Jsoup.parse(html, "http://example.com", parser);

        __CLR4_4_1uskusklh9yvhsk.R.inc(40425);List<ParseError> errors = parser.getErrors();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40426);assertEquals(0, errors.size());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesCommentsInTable() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148wer3v6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesCommentsInTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148wer3v6z(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40427);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40428);String html = "<table><tr><td>text</td><!-- Comment --></tr></table>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40429);Document node = Jsoup.parseBodyFragment(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40430);assertEquals("<html><head></head><body><table><tbody><tr><td>text</td><!-- Comment --></tr></tbody></table></body></html>", TextUtil.stripNewlines(node.outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesQuotesInCommentsInScripts() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqi21dv73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesQuotesInCommentsInScripts",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqi21dv73(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40431);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40432);String html = "<script>\n" +
            "  <!--\n" +
            "    document.write('</scr' + 'ipt>');\n" +
            "  // -->\n" +
            "</script>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40433);Document node = Jsoup.parseBodyFragment(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40434);assertEquals("<script>\n" +
            "  <!--\n" +
            "    document.write('</scr' + 'ipt>');\n" +
            "  // -->\n" +
            "</script>", node.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handleNullContextInParseFragment() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1os0ozpv77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handleNullContextInParseFragment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40435,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1os0ozpv77(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40435);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40436);String html = "<ol><li>One</li></ol><p>Two</p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40437);List<Node> nodes = Parser.parseFragment(html, null, "http://example.com/");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40438);assertEquals(1, nodes.size()); // returns <html> node (not document) -- no context means doc gets created
        __CLR4_4_1uskusklh9yvhsk.R.inc(40439);assertEquals("html", nodes.get(0).nodeName());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40440);assertEquals("<html> <head></head> <body> <ol> <li>One</li> </ol> <p>Two</p> </body> </html>", StringUtil.normaliseWhitespace(nodes.get(0).outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void doesNotFindShortestMatchingEntity() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j9ajxgv7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.doesNotFindShortestMatchingEntity",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40441,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j9ajxgv7d(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40441);
        // previous behaviour was to identify a possible entity, then chomp down the string until a match was found.
        // (as defined in html5.) However in practise that lead to spurious matches against the author's intent.
        __CLR4_4_1uskusklh9yvhsk.R.inc(40442);String html = "One &clubsuite; &clubsuit;";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40443);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40444);assertEquals(StringUtil.normaliseWhitespace("One &amp;clubsuite; \u2663"), doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void relaxedBaseEntityMatchAndStrictExtendedMatch() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_148cbqtv7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.relaxedBaseEntityMatchAndStrictExtendedMatch",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_148cbqtv7h(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40445);
        // extended entities need a ; at the end to match, base does not
        __CLR4_4_1uskusklh9yvhsk.R.inc(40446);String html = "&amp &quot &reg &icy &hopf &icy; &hopf;";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40447);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40448);doc.outputSettings().escapeMode(Entities.EscapeMode.extended).charset("ascii"); // modifies output only to clarify test
        __CLR4_4_1uskusklh9yvhsk.R.inc(40449);assertEquals("&amp; \" &reg; &amp;icy &amp;hopf &icy; &hopf;", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesXmlDeclarationAsBogusComment() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhow8iv7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesXmlDeclarationAsBogusComment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40450,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhow8iv7m(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40450);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40451);String html = "<?xml encoding='UTF-8' ?><body>One</body>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40452);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40453);assertEquals("<!--?xml encoding='UTF-8' ?--> <html> <head></head> <body> One </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesTagsInTextarea() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mydgtyv7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesTagsInTextarea",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40454,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mydgtyv7q(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40454);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40455);String html = "<textarea><p>Jsoup</p></textarea>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40456);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40457);assertEquals("<textarea>&lt;p&gt;Jsoup&lt;/p&gt;</textarea>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    // form tests
    @Test public void createsFormElements() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x89rifv7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.createsFormElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40458,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x89rifv7u(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40458);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40459);String html = "<body><form><input id=1><input id=2></form></body>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40460);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40461);Element el = doc.select("form").first();

        __CLR4_4_1uskusklh9yvhsk.R.inc(40462);assertTrue("Is form element", el instanceof FormElement);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40463);FormElement form = (FormElement) el;
        __CLR4_4_1uskusklh9yvhsk.R.inc(40464);Elements controls = form.elements();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40465);assertEquals(2, controls.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40466);assertEquals("1", controls.get(0).id());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40467);assertEquals("2", controls.get(1).id());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void associatedFormControlsWithDisjointForms() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vvsebwv84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.associatedFormControlsWithDisjointForms",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vvsebwv84(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40468);
        // form gets closed, isn't parent of controls
        __CLR4_4_1uskusklh9yvhsk.R.inc(40469);String html = "<table><tr><form><input type=hidden id=1><td><input type=text id=2></td><tr></table>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40470);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40471);Element el = doc.select("form").first();

        __CLR4_4_1uskusklh9yvhsk.R.inc(40472);assertTrue("Is form element", el instanceof FormElement);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40473);FormElement form = (FormElement) el;
        __CLR4_4_1uskusklh9yvhsk.R.inc(40474);Elements controls = form.elements();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40475);assertEquals(2, controls.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40476);assertEquals("1", controls.get(0).id());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40477);assertEquals("2", controls.get(1).id());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40478);assertEquals("<table><tbody><tr><form></form><input type=\"hidden\" id=\"1\"><td><input type=\"text\" id=\"2\"></td></tr><tr></tr></tbody></table>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesInputInTable() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1abw9rlv8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesInputInTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1abw9rlv8f(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40479);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40480);String h = "<body>\n" +
            "<input type=\"hidden\" name=\"a\" value=\"\">\n" +
            "<table>\n" +
            "<input type=\"hidden\" name=\"b\" value=\"\" />\n" +
            "</table>\n" +
            "</body>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40481);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40482);assertEquals(1, doc.select("table input").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40483);assertEquals(2, doc.select("input").size());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void convertsImageToImg() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dwykj0v8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.convertsImageToImg",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dwykj0v8k(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40484);
        // image to img, unless in a svg. old html cruft.
        __CLR4_4_1uskusklh9yvhsk.R.inc(40485);String h = "<body><image><svg><image /></svg></body>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40486);Document doc = Jsoup.parse(h);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40487);assertEquals("<img>\n<svg>\n <image />\n</svg>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesInvalidDoctypes() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12q1uesv8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesInvalidDoctypes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12q1uesv8o(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40488);
        // would previously throw invalid name exception on empty doctype
        __CLR4_4_1uskusklh9yvhsk.R.inc(40489);Document doc = Jsoup.parse("<!DOCTYPE>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40490);assertEquals(
            "<!doctype> <html> <head></head> <body></body> </html>",
            StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(40491);doc = Jsoup.parse("<!DOCTYPE><html><p>Foo</p></html>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40492);assertEquals(
            "<!doctype> <html> <head></head> <body> <p>Foo</p> </body> </html>",
            StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(40493);doc = Jsoup.parse("<!DOCTYPE \u0000>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40494);assertEquals(
            "<!doctype \ufffd> <html> <head></head> <body></body> </html>",
            StringUtil.normaliseWhitespace(doc.outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesManyChildren() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b8f634v8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesManyChildren",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b8f634v8v(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40495);
        // Arrange
        __CLR4_4_1uskusklh9yvhsk.R.inc(40496);StringBuilder longBody = new StringBuilder(500000);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40497);for (int i = 0; (((i < 25000)&&(__CLR4_4_1uskusklh9yvhsk.R.iget(40498)!=0|true))||(__CLR4_4_1uskusklh9yvhsk.R.iget(40499)==0&false)); i++) {{
            __CLR4_4_1uskusklh9yvhsk.R.inc(40500);longBody.append(i).append("<br>");
        }

        // Act
        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // long start = System.currentTimeMillis();
        }__CLR4_4_1uskusklh9yvhsk.R.inc(40501);Document doc = Parser.parseBodyFragment(longBody.toString(), "");

        // Assert
        __CLR4_4_1uskusklh9yvhsk.R.inc(40502);assertEquals(50000, doc.body().childNodeSize());
        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // assertTrue(System.currentTimeMillis() - start < 1000);
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesDeepStack() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gl9t7cv93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesDeepStack",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gl9t7cv93(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40503);
        // inspired by http://sv.stargate.wikia.com/wiki/M2J and https://github.com/jhy/jsoup/issues/955
        // I didn't put it in the integration tests, because explorer and intellij kept dieing trying to preview/index it

        // Arrange
        __CLR4_4_1uskusklh9yvhsk.R.inc(40504);StringBuilder longBody = new StringBuilder(500000);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40505);for (int i = 0; (((i < 25000)&&(__CLR4_4_1uskusklh9yvhsk.R.iget(40506)!=0|true))||(__CLR4_4_1uskusklh9yvhsk.R.iget(40507)==0&false)); i++) {{
            __CLR4_4_1uskusklh9yvhsk.R.inc(40508);longBody.append(i).append("<dl><dd>");
        }
        }__CLR4_4_1uskusklh9yvhsk.R.inc(40509);for (int i = 0; (((i < 25000)&&(__CLR4_4_1uskusklh9yvhsk.R.iget(40510)!=0|true))||(__CLR4_4_1uskusklh9yvhsk.R.iget(40511)==0&false)); i++) {{
            __CLR4_4_1uskusklh9yvhsk.R.inc(40512);longBody.append(i).append("</dd></dl>");
        }

        // Act
        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // long start = System.currentTimeMillis();
        }__CLR4_4_1uskusklh9yvhsk.R.inc(40513);Document doc = Parser.parseBodyFragment(longBody.toString(), "");

        // Assert
        __CLR4_4_1uskusklh9yvhsk.R.inc(40514);assertEquals(2, doc.body().childNodeSize());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40515);assertEquals(25000, doc.select("dd").size());

        // Commenting out this time check due to issues reported in Campuswire #427 and #524
        // assertTrue(System.currentTimeMillis() - start < 2000);
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test
    public void testInvalidTableContents() throws IOException {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19r0xliv9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testInvalidTableContents",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19r0xliv9g() throws IOException{try{__CLR4_4_1uskusklh9yvhsk.R.inc(40516);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40517);File in = ParseTest.getFile("/htmltests/table-invalid-elements.html");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40518);Document doc = Jsoup.parse(in, "UTF-8");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40519);doc.outputSettings().prettyPrint(true);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40520);String rendered = doc.toString();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40521);int endOfEmail = rendered.indexOf("Comment");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40522);int guarantee = rendered.indexOf("Why am I here?");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40523);assertTrue("Comment not found", endOfEmail > -1);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40524);assertTrue("Search text not found", guarantee > -1);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40525);assertTrue("Search text did not come after comment", guarantee > endOfEmail);
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testNormalisesIsIndex() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uwwz5qv9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testNormalisesIsIndex",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40526,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uwwz5qv9q(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40526);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40527);Document doc = Jsoup.parse("<body><isindex action='/submit'></body>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40528);String html = doc.outerHtml();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40529);assertEquals("<form action=\"/submit\"> <hr> <label>This is a searchable index. Enter search keywords: <input name=\"isindex\"></label> <hr> </form>",
            StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testReinsertionModeForThCelss() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nc1swxv9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testReinsertionModeForThCelss",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nc1swxv9u(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40530);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40531);String body = "<body> <table> <tr> <th> <table><tr><td></td></tr></table> <div> <table><tr><td></td></tr></table> </div> <div></div> <div></div> <div></div> </th> </tr> </table> </body>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40532);Document doc = Jsoup.parse(body);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40533);assertEquals(1, doc.body().children().size());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testUsingSingleQuotesInQueries() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1adgmdlv9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testUsingSingleQuotesInQueries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1adgmdlv9y(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40534);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40535);String body = "<body> <div class='main'>hello</div></body>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40536);Document doc = Jsoup.parse(body);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40537);Elements main = doc.select("div[class='main']");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40538);assertEquals("hello", main.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testSupportsNonAsciiTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhxhiyva3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSupportsNonAsciiTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhxhiyva3(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40539);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40540);String body = "<\u9032\u6357\u63a8\u79fb\u30b0\u30e9\u30d5>Yes</\u9032\u6357\u63a8\u79fb\u30b0\u30e9\u30d5><\u0440\u0443\u0441\u0441\u043a\u0438\u0439-\u0442\u044d\u0433>Correct</<\u0440\u0443\u0441\u0441\u043a\u0438\u0439-\u0442\u044d\u0433>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40541);Document doc = Jsoup.parse(body);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40542);Elements els = doc.select("\u9032\u6357\u63a8\u79fb\u30b0\u30e9\u30d5");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40543);assertEquals("Yes", els.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40544);els = doc.select("\u0440\u0443\u0441\u0441\u043a\u0438\u0439-\u0442\u044d\u0433");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40545);assertEquals("Correct", els.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testSupportsPartiallyNonAsciiTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oyn3novaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testSupportsPartiallyNonAsciiTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oyn3novaa(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40546);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40547);String body = "<div>Check</div\u00e1>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40548);Document doc = Jsoup.parse(body);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40549);Elements els = doc.select("div");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40550);assertEquals("Check", els.text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testFragment() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qpibbvaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testFragment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qpibbvaf(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40551);
        // make sure when parsing a body fragment, a script tag at start goes into the body
        __CLR4_4_1uskusklh9yvhsk.R.inc(40552);String html =
            "<script type=\"text/javascript\">console.log('foo');</script>\n" +
                "<div id=\"somecontent\">some content</div>\n" +
                "<script type=\"text/javascript\">console.log('bar');</script>";

        __CLR4_4_1uskusklh9yvhsk.R.inc(40553);Document body = Jsoup.parseBodyFragment(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40554);assertEquals("<script type=\"text/javascript\">console.log('foo');</script> \n" +
            "<div id=\"somecontent\">\n" +
            " some content\n" +
            "</div> \n" +
            "<script type=\"text/javascript\">console.log('bar');</script>", body.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testHtmlLowerCase() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r00kslvaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHtmlLowerCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40555,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r00kslvaj(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40555);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40556);String html = "<!doctype HTML><DIV ID=1>One</DIV>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40557);Document doc = Jsoup.parse(html);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40558);assertEquals("<!doctype html> <html> <head></head> <body> <div id=\"1\"> One </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(40559);Element div = doc.selectFirst("#1");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40560);div.after("<TaG>One</TaG>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40561);assertEquals("<tag>One</tag>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void canPreserveTagCase() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_140p579vaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.canPreserveTagCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_140p579vaq(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40562);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40563);Parser parser = Parser.htmlParser();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40564);parser.settings(new ParseSettings(true, false));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40565);Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40566);assertEquals("<html> <head></head> <body> <div id=\"1\"> <SPAN id=\"2\"></SPAN> </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(40567);Element div = doc.selectFirst("#1");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40568);div.after("<TaG ID=one>One</TaG>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40569);assertEquals("<TaG id=\"one\">One</TaG>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void canPreserveAttributeCase() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17xjivrvay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.canPreserveAttributeCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17xjivrvay(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40570);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40571);Parser parser = Parser.htmlParser();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40572);parser.settings(new ParseSettings(false, true));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40573);Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40574);assertEquals("<html> <head></head> <body> <div id=\"1\"> <span ID=\"2\"></span> </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(40575);Element div = doc.selectFirst("#1");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40576);div.after("<TaG ID=one>One</TaG>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40577);assertEquals("<tag ID=\"one\">One</tag>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void canPreserveBothCase() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bv6wd0vb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.canPreserveBothCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bv6wd0vb6(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40578);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40579);Parser parser = Parser.htmlParser();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40580);parser.settings(new ParseSettings(true, true));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40581);Document doc = parser.parseInput("<div id=1><SPAN ID=2>", "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40582);assertEquals("<html> <head></head> <body> <div id=\"1\"> <SPAN ID=\"2\"></SPAN> </div> </body> </html>", StringUtil.normaliseWhitespace(doc.outerHtml()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(40583);Element div = doc.selectFirst("#1");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40584);div.after("<TaG ID=one>One</TaG>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40585);assertEquals("<TaG ID=\"one\">One</TaG>", TextUtil.stripNewlines(div.nextElementSibling().outerHtml()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesControlCodeInAttributeName() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dl11yvbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesControlCodeInAttributeName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dl11yvbe(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40586);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40587);Document doc = Jsoup.parse("<p><a \06=foo>One</a><a/\06=bar><a foo\06=bar>Two</a></p>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40588);assertEquals("<p><a>One</a><a></a><a foo=\"bar\">Two</a></p>", doc.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void caseSensitiveParseTree() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g8rt1qvbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.caseSensitiveParseTree",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g8rt1qvbh(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40589);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40590);String html = "<r><X>A</X><y>B</y></r>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40591);Parser parser = Parser.htmlParser();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40592);parser.settings(ParseSettings.preserveCase);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40593);Document doc = parser.parseInput(html, "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40594);assertEquals("<r> <X> A </X> <y> B </y> </r>", StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void caseInsensitiveParseTree() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nmadfbvbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.caseInsensitiveParseTree",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nmadfbvbn(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40595);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40596);String html = "<r><X>A</X><y>B</y></r>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40597);Parser parser = Parser.htmlParser();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40598);Document doc = parser.parseInput(html, "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40599);assertEquals("<r> <x> A </x> <y> B </y> </r>", StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void preservedCaseLinksCantNest() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkhcwkvbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preservedCaseLinksCantNest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkhcwkvbs(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40600);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40601);String html = "<A>ONE <A>Two</A></A>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40602);Document doc = Parser.htmlParser()
            .settings(ParseSettings.preserveCase)
            .parseInput(html, "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40603);assertEquals("<A> ONE </A> <A> Two </A>", StringUtil.normaliseWhitespace(doc.body().html()));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void normalizesDiscordantTags() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_183kh27vbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.normalizesDiscordantTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40604,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_183kh27vbw(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40604);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40605);Document document = Jsoup.parse("<div>test</DIV><p></p>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40606);assertEquals("<div>\n test\n</div>\n<p></p>", document.body().html());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void selfClosingVoidIsNotAnError() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybpj8qvbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.selfClosingVoidIsNotAnError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40607,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybpj8qvbz(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40607);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40608);String html = "<p>test<br/>test<br/></p>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40609);Parser parser = Parser.htmlParser().setTrackErrors(5);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40610);parser.parseInput(html, "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40611);assertEquals(0, parser.getErrors().size());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40612);assertTrue(Jsoup.isValid(html, Whitelist.basic()));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40613);String clean = Jsoup.clean(html, Whitelist.basic());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40614);assertEquals("<p>test<br>test<br></p>", clean);
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void selfClosingOnNonvoidIsError() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ym8r8vc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.selfClosingOnNonvoidIsError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ym8r8vc7(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40615);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40616);String html = "<p>test</p><div /><div>Two</div>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40617);Parser parser = Parser.htmlParser().setTrackErrors(5);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40618);parser.parseInput(html, "");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40619);assertEquals(1, parser.getErrors().size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40620);assertEquals("18: Tag cannot be self closing; not a void tag", parser.getErrors().get(0).toString());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40621);assertFalse(Jsoup.isValid(html, Whitelist.relaxed()));
        __CLR4_4_1uskusklh9yvhsk.R.inc(40622);String clean = Jsoup.clean(html, Whitelist.relaxed());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40623);assertEquals("<p>test</p> <div></div> <div> Two </div>", StringUtil.normaliseWhitespace(clean));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testTemplateInsideTable() throws IOException {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s6myhfvcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testTemplateInsideTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s6myhfvcg() throws IOException{try{__CLR4_4_1uskusklh9yvhsk.R.inc(40624);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40625);File in = ParseTest.getFile("/htmltests/table-polymer-template.html");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40626);Document doc = Jsoup.parse(in, "UTF-8");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40627);doc.outputSettings().prettyPrint(true);

        __CLR4_4_1uskusklh9yvhsk.R.inc(40628);Elements templates = doc.body().getElementsByTag("template");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40629);for (Element template : templates) {{
            __CLR4_4_1uskusklh9yvhsk.R.inc(40630);assertTrue(template.childNodes().size() > 1);
        }
    }}finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void testHandlesDeepSpans() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19rkgnfvcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.testHandlesDeepSpans",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19rkgnfvcn(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40631);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40632);StringBuilder sb = new StringBuilder();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40633);for (int i = 0; (((i < 200)&&(__CLR4_4_1uskusklh9yvhsk.R.iget(40634)!=0|true))||(__CLR4_4_1uskusklh9yvhsk.R.iget(40635)==0&false)); i++) {{
            __CLR4_4_1uskusklh9yvhsk.R.inc(40636);sb.append("<span>");
        }

        }__CLR4_4_1uskusklh9yvhsk.R.inc(40637);sb.append("<p>One</p>");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40638);Document doc = Jsoup.parse(sb.toString());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40639);assertEquals(200, doc.select("span").size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40640);assertEquals(1, doc.select("p").size());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void commentAtEnd() throws Exception {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i06i0gvcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.commentAtEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i06i0gvcx() throws Exception{try{__CLR4_4_1uskusklh9yvhsk.R.inc(40641);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40642);Document doc = Jsoup.parse("<!");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40643);assertTrue(doc.childNode(0) instanceof Comment);
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void preSkipsFirstNewline() {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12e9ds4vd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.preSkipsFirstNewline",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12e9ds4vd0(){try{__CLR4_4_1uskusklh9yvhsk.R.inc(40644);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40645);Document doc = Jsoup.parse("<pre>\n\nOne\nTwo\n</pre>");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40646);Element pre = doc.selectFirst("pre");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40647);assertEquals("One\nTwo", pre.text());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40648);assertEquals("\nOne\nTwo\n", pre.wholeText());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void handlesXmlDeclAndCommentsBeforeDoctype() throws IOException {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ugge3vd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.handlesXmlDeclAndCommentsBeforeDoctype",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40649,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ugge3vd5() throws IOException{try{__CLR4_4_1uskusklh9yvhsk.R.inc(40649);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40650);File in = ParseTest.getFile("/htmltests/comments.html");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40651);Document doc = Jsoup.parse(in, "UTF-8");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40652);assertEquals("<!--?xml version=\"1.0\" encoding=\"utf-8\"?--> <!-- so --><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> <!-- what --> <html xml:lang=\"en\" lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\"> <!-- now --> <head> <!-- then --> <meta http-equiv=\"Content-type\" content=\"text/html; charset=utf-8\"> <title>A Certain Kind of Test</title> </head> <body> <h1>Hello</h1>h1&gt; (There is a UTF8 hidden BOM at the top of this file.) </body> </html>",
            StringUtil.normaliseWhitespace(doc.html()));

        __CLR4_4_1uskusklh9yvhsk.R.inc(40653);assertEquals("A Certain Kind of Test", doc.head().select("title").text());
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void fallbackToUtfIfCantEncode() throws IOException {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2if7cvda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.fallbackToUtfIfCantEncode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40654,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2if7cvda() throws IOException{try{__CLR4_4_1uskusklh9yvhsk.R.inc(40654);
        // that charset can't be encoded, so make sure we flip to utf

        __CLR4_4_1uskusklh9yvhsk.R.inc(40655);String in = "<html><meta charset=\"ISO-2022-CN\"/>One</html>";
        __CLR4_4_1uskusklh9yvhsk.R.inc(40656);Document doc = Jsoup.parse(new ByteArrayInputStream(in.getBytes()), null, "");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40657);assertEquals("UTF-8", doc.charset().name());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40658);assertEquals("One", doc.text());

        __CLR4_4_1uskusklh9yvhsk.R.inc(40659);String html = doc.outerHtml();
        __CLR4_4_1uskusklh9yvhsk.R.inc(40660);assertEquals("<html><head><meta charset=\"UTF-8\"></head><body>One</body></html>", TextUtil.stripNewlines(html));
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}

    @Test public void characterReaderBuffer() throws IOException {__CLR4_4_1uskusklh9yvhsk.R.globalSliceStart(getClass().getName(),40661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gy5099vdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uskusklh9yvhsk.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uskusklh9yvhsk.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.HtmlParserTest.characterReaderBuffer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40661,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gy5099vdh() throws IOException{try{__CLR4_4_1uskusklh9yvhsk.R.inc(40661);
        __CLR4_4_1uskusklh9yvhsk.R.inc(40662);File in = ParseTest.getFile("/htmltests/character-reader-buffer.html");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40663);Document doc = Jsoup.parse(in, "UTF-8");

        __CLR4_4_1uskusklh9yvhsk.R.inc(40664);String expectedHref = "http://www.domain.com/path?param_one=value&param_two=value";

        __CLR4_4_1uskusklh9yvhsk.R.inc(40665);Elements links = doc.select("a");
        __CLR4_4_1uskusklh9yvhsk.R.inc(40666);assertEquals(2, links.size());
        __CLR4_4_1uskusklh9yvhsk.R.inc(40667);assertEquals(expectedHref, links.get(0).attr("href")); // passes
        __CLR4_4_1uskusklh9yvhsk.R.inc(40668);assertEquals(expectedHref, links.get(1).attr("href")); // fails, "but was:<...ath?param_one=value&[]_two-value>"
    }finally{__CLR4_4_1uskusklh9yvhsk.R.flushNeeded();}}
}
