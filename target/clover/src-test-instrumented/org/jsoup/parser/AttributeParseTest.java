/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 Test suite for attribute parser.

 @author Jonathan Hedley, jonathan@hedley.net */
public class AttributeParseTest {static class __CLR4_4_1ukpukplh9yvhrv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,39683,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test public void parsesRoughAttributeString() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uhigbpukp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.parsesRoughAttributeString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uhigbpukp(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39625);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39626);String html = "<a id=\"123\" class=\"baz = 'bar'\" style = 'border: 2px'qux zim foo = 12 mux=18 />";
        // should be: <id=123>, <class=baz = 'bar'>, <qux=>, <zim=>, <foo=12>, <mux.=18>

        __CLR4_4_1ukpukplh9yvhrv.R.inc(39627);Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39628);Attributes attr = el.attributes();
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39629);assertEquals(7, attr.size());
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39630);assertEquals("123", attr.get("id"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39631);assertEquals("baz = 'bar'", attr.get("class"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39632);assertEquals("border: 2px", attr.get("style"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39633);assertEquals("", attr.get("qux"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39634);assertEquals("", attr.get("zim"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39635);assertEquals("12", attr.get("foo"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39636);assertEquals("18", attr.get("mux"));
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}

    @Test public void handlesNewLinesAndReturns() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18pku2lul1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.handlesNewLinesAndReturns",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18pku2lul1(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39637);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39638);String html = "<a\r\nfoo='bar\r\nqux'\r\nbar\r\n=\r\ntwo>One</a>";
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39639);Element el = Jsoup.parse(html).select("a").first();
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39640);assertEquals(2, el.attributes().size());
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39641);assertEquals("bar\r\nqux", el.attr("foo")); // currently preserves newlines in quoted attributes. todo confirm if should.
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39642);assertEquals("two", el.attr("bar"));
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}

    @Test public void parsesEmptyString() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j41mgrul7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.parsesEmptyString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j41mgrul7(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39643);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39644);String html = "<a />";
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39645);Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39646);Attributes attr = el.attributes();
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39647);assertEquals(0, attr.size());
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}

    @Test public void canStartWithEq() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19egzdhulc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.canStartWithEq",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39648,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19egzdhulc(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39648);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39649);String html = "<a =empty />";
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39650);Element el = Jsoup.parse(html).getElementsByTag("a").get(0);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39651);Attributes attr = el.attributes();
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39652);assertEquals(1, attr.size());
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39653);assertTrue(attr.hasKey("=empty"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39654);assertEquals("", attr.get("=empty"));
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}

    @Test public void strictAttributeUnescapes() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_182sc3xulj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.strictAttributeUnescapes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_182sc3xulj(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39655);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39656);String html = "<a id=1 href='?foo=bar&mid&lt=true'>One</a> <a id=2 href='?foo=bar&lt;qux&lg=1'>Two</a>";
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39657);Elements els = Jsoup.parse(html).select("a");
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39658);assertEquals("?foo=bar&mid&lt=true", els.first().attr("href"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39659);assertEquals("?foo=bar<qux&lg=1", els.last().attr("href"));
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}

    @Test public void moreAttributeUnescapes() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v29i6xulo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.moreAttributeUnescapes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39660,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v29i6xulo(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39660);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39661);String html = "<a href='&wr_id=123&mid-size=true&ok=&wr'>Check</a>";
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39662);Elements els = Jsoup.parse(html).select("a");
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39663);assertEquals("&wr_id=123&mid-size=true&ok=&wr", els.first().attr("href"));
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}

    @Test public void parsesBooleanAttributes() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i22d6iuls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.parsesBooleanAttributes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i22d6iuls(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39664);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39665);String html = "<a normal=\"123\" boolean empty=\"\"></a>";
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39666);Element el = Jsoup.parse(html).select("a").first();

        __CLR4_4_1ukpukplh9yvhrv.R.inc(39667);assertEquals("123", el.attr("normal"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39668);assertEquals("", el.attr("boolean"));
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39669);assertEquals("", el.attr("empty"));

        __CLR4_4_1ukpukplh9yvhrv.R.inc(39670);List<Attribute> attributes = el.attributes().asList();
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39671);assertEquals("There should be 3 attribute present", 3, attributes.size());

        // Assuming the list order always follows the parsed html
		__CLR4_4_1ukpukplh9yvhrv.R.inc(39672);assertFalse("'normal' attribute should not be boolean", attributes.get(0) instanceof BooleanAttribute);
		__CLR4_4_1ukpukplh9yvhrv.R.inc(39673);assertTrue("'boolean' attribute should be boolean", attributes.get(1) instanceof BooleanAttribute);
		__CLR4_4_1ukpukplh9yvhrv.R.inc(39674);assertFalse("'empty' attribute should not be boolean", attributes.get(2) instanceof BooleanAttribute);

        __CLR4_4_1ukpukplh9yvhrv.R.inc(39675);assertEquals(html, el.outerHtml());
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}

    @Test public void dropsSlashFromAttributeName() {__CLR4_4_1ukpukplh9yvhrv.R.globalSliceStart(getClass().getName(),39676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pkunedum4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ukpukplh9yvhrv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ukpukplh9yvhrv.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.AttributeParseTest.dropsSlashFromAttributeName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39676,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pkunedum4(){try{__CLR4_4_1ukpukplh9yvhrv.R.inc(39676);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39677);String html = "<img /onerror='doMyJob'/>";
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39678);Document doc = Jsoup.parse(html);
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39679);assertTrue("SelfClosingStartTag ignores last character", !doc.select("img[onerror]").isEmpty());
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39680);assertEquals("<img onerror=\"doMyJob\">", doc.body().html());

        __CLR4_4_1ukpukplh9yvhrv.R.inc(39681);doc = Jsoup.parse(html, "", Parser.xmlParser());
        __CLR4_4_1ukpukplh9yvhrv.R.inc(39682);assertEquals("<img onerror=\"doMyJob\" />", doc.html());
    }finally{__CLR4_4_1ukpukplh9yvhrv.R.flushNeeded();}}
}
