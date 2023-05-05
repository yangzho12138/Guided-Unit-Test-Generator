/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import java.io.UnsupportedEncodingException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.jsoup.parser.CharacterReader.maxBufferLen;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TokeniserTest {static class __CLR4_4_1vkmvkmlh9yvhtd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,41050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void bufferUpInAttributeVal() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),40918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ee33gvkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.bufferUpInAttributeVal",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ee33gvkm(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(40918);
        // https://github.com/jhy/jsoup/issues/967

        // check each double, singlem, unquoted impls
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40919);String[] quotes = {"\"", "'", ""};
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40920);for (String quote : quotes) {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40921);String preamble = "<img src=" + quote;
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40922);String tail = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40923);StringBuilder sb = new StringBuilder(preamble);

            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40924);final int charsToFillBuffer = maxBufferLen - preamble.length();
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40925);for (int i = 0; (((i < charsToFillBuffer)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40926)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40927)==0&false)); i++) {{
                __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40928);sb.append('a');
            }

            }__CLR4_4_1vkmvkmlh9yvhtd.R.inc(40929);sb.append('X'); // First character to cross character buffer boundary
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40930);sb.append(tail).append(quote).append(">\n");

            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40931);String html = sb.toString();
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40932);Document doc = Jsoup.parse(html);
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40933);String src = doc.select("img").attr("src");

            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40934);assertTrue("Handles for quote " + quote, src.contains("X"));
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40935);assertTrue(src.contains(tail));
        }
    }}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void handleSuperLargeTagNames() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),40936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agk05fvl4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleSuperLargeTagNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agk05fvl4(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(40936);
        // unlikely, but valid. so who knows.

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40937);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40938);do {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40939);sb.append("LargeTagName");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40940)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40941)==0&false)));
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40942);String tag = sb.toString();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40943);String html = "<" + tag + ">One</" + tag + ">";

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40944);Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput(html, "");
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40945);Elements els = doc.select(tag);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40946);assertEquals(1, els.size());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40947);Element el = els.first();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40948);assertNotNull(el);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40949);assertEquals("One", el.text());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40950);assertEquals(tag, el.tagName());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void handleSuperLargeAttributeName() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),40951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o2vgvuvlj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleSuperLargeAttributeName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o2vgvuvlj(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(40951);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40952);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40953);do {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40954);sb.append("LargAttributeName");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40955)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40956)==0&false)));
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40957);String attrName = sb.toString();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40958);String html = "<p " + attrName + "=foo>One</p>";

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40959);Document doc = Jsoup.parse(html);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40960);Elements els = doc.getElementsByAttribute(attrName);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40961);assertEquals(1, els.size());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40962);Element el = els.first();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40963);assertNotNull(el);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40964);assertEquals("One", el.text());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40965);Attribute attribute = el.attributes().asList().get(0);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40966);assertEquals(attrName.toLowerCase(), attribute.getKey());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40967);assertEquals("foo", attribute.getValue());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void handleLargeText() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),40968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lj16uxvm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeText",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lj16uxvm0(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(40968);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40969);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40970);do {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40971);sb.append("A Large Amount of Text");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40972)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40973)==0&false)));
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40974);String text = sb.toString();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40975);String html = "<p>" + text + "</p>";

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40976);Document doc = Jsoup.parse(html);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40977);Elements els = doc.select("p");
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40978);assertEquals(1, els.size());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40979);Element el = els.first();

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40980);assertNotNull(el);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40981);assertEquals(text, el.text());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void handleLargeComment() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),40982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bakkabvme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeComment",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40982,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bakkabvme(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(40982);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40983);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40984);do {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40985);sb.append("Quite a comment ");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40986)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(40987)==0&false)));
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40988);String comment = sb.toString();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40989);String html = "<p><!-- " + comment + " --></p>";

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40990);Document doc = Jsoup.parse(html);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40991);Elements els = doc.select("p");
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40992);assertEquals(1, els.size());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40993);Element el = els.first();

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40994);assertNotNull(el);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40995);Comment child = (Comment) el.childNode(0);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40996);assertEquals(" " + comment + " ", child.getData());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void handleLargeCdata() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),40997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11hqgf3vmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeCdata",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40997,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11hqgf3vmt(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(40997);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40998);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(40999);do {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41000);sb.append("Quite a lot of CDATA <><><><>");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41001)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41002)==0&false)));
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41003);String cdata = sb.toString();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41004);String html = "<p><![CDATA[" + cdata + "]]></p>";

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41005);Document doc = Jsoup.parse(html);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41006);Elements els = doc.select("p");
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41007);assertEquals(1, els.size());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41008);Element el = els.first();

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41009);assertNotNull(el);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41010);TextNode child = (TextNode) el.childNode(0);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41011);assertEquals(cdata, el.text());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41012);assertEquals(cdata, child.getWholeText());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void handleLargeTitle() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),41013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdbrxwvn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.handleLargeTitle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdbrxwvn9(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(41013);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41014);StringBuilder sb = new StringBuilder(maxBufferLen);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41015);do {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41016);sb.append("Quite a long title");
        } }while ((((sb.length() < maxBufferLen)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41017)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41018)==0&false)));
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41019);String title = sb.toString();
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41020);String html = "<title>" + title + "</title>";

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41021);Document doc = Jsoup.parse(html);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41022);Elements els = doc.select("title");
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41023);assertEquals(1, els.size());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41024);Element el = els.first();

        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41025);assertNotNull(el);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41026);TextNode child = (TextNode) el.childNode(0);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41027);assertEquals(title, el.text());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41028);assertEquals(title, child.getWholeText());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41029);assertEquals(title, doc.title());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void cp1252Entities() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),41030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7v6z7vnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.cp1252Entities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7v6z7vnq(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(41030);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41031);assertEquals("\u20ac", Jsoup.parse("&#0128;").text());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41032);assertEquals("\u201a", Jsoup.parse("&#0130;").text());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41033);assertEquals("\u20ac", Jsoup.parse("&#x80;").text());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void cp1252EntitiesProduceError() {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),41034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ga0a85vnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.cp1252EntitiesProduceError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ga0a85vnu(){try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(41034);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41035);Parser parser = new Parser(new HtmlTreeBuilder());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41036);parser.setTrackErrors(10);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41037);assertEquals("\u20ac", parser.parseInput("<html><body>&#0128;</body></html>", "").text());
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41038);assertEquals(1, parser.getErrors().size());
    }finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}

    @Test public void cp1252SubstitutionTable() throws UnsupportedEncodingException {__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceStart(getClass().getName(),41039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12t252lvnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vkmvkmlh9yvhtd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserTest.cp1252SubstitutionTable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12t252lvnz() throws UnsupportedEncodingException{try{__CLR4_4_1vkmvkmlh9yvhtd.R.inc(41039);
        __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41040);for (int i = 0; (((i < Tokeniser.win1252Extensions.length)&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41041)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41042)==0&false)); i++) {{
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41043);String s = new String(new byte[]{ (byte) (i + Tokeniser.win1252ExtensionsStart) }, "Windows-1252");
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41044);assertEquals(1, s.length());

            // some of these characters are illegal
            __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41045);if ((((s.charAt(0) == '\ufffd')&&(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41046)!=0|true))||(__CLR4_4_1vkmvkmlh9yvhtd.R.iget(41047)==0&false))) {{ __CLR4_4_1vkmvkmlh9yvhtd.R.inc(41048);continue; }

            }__CLR4_4_1vkmvkmlh9yvhtd.R.inc(41049);assertEquals("At: " + i, s.charAt(0), Tokeniser.win1252Extensions[i]);
        }
    }}finally{__CLR4_4_1vkmvkmlh9yvhtd.R.flushNeeded();}}
}
