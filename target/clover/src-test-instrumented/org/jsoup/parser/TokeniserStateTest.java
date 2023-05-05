/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TokeniserStateTest {static class __CLR4_4_1vhpvhplh9yvht7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,40918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    final char[] whiteSpace = { '\t', '\n', '\r', '\f', ' ' };
    final char[] quote = { '\'', '"' };

    @Test
    public void ensureSearchArraysAreSorted() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g7vftkvhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.ensureSearchArraysAreSorted",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40813,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g7vftkvhp(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40813);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40814);char[][] arrays = {
            TokeniserState.attributeSingleValueCharsSorted,
            TokeniserState.attributeDoubleValueCharsSorted,
            TokeniserState.attributeNameCharsSorted,
            TokeniserState.attributeValueUnquoted
        };

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40815);for (char[] array : arrays) {{
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40816);char[] copy = Arrays.copyOf(array, array.length);
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40817);Arrays.sort(array);
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40818);assertArrayEquals(array, copy);
        }
    }}finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testCharacterReferenceInRcdata() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rr1rz9vhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testCharacterReferenceInRcdata",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40819,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rr1rz9vhv(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40819);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40820);String body = "<textarea>You&I</textarea>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40821);Document doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40822);Elements els = doc.select("textarea");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40823);assertEquals("You&I", els.text());
    }finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testBeforeTagName() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1smkrmtvi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testBeforeTagName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1smkrmtvi0(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40824);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40825);for (char c : whiteSpace) {{
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40826);String body = String.format("<div%c>test</div>", c);
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40827);Document doc = Jsoup.parse(body);
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40828);Elements els = doc.select("div");
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40829);assertEquals("test", els.text());
        }
    }}finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testEndTagOpen() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8le0uvi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testEndTagOpen",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8le0uvi6(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40830);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40831);String body;
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40832);Document doc;
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40833);Elements els;

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40834);body = "<div>hello world</";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40835);doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40836);els = doc.select("div");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40837);assertEquals("hello world</", els.text());

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40838);body = "<div>hello world</div>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40839);doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40840);els = doc.select("div");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40841);assertEquals("hello world", els.text());

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40842);body = "<div>fake</></div>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40843);doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40844);els = doc.select("div");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40845);assertEquals("fake", els.text());

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40846);body = "<div>fake</?</div>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40847);doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40848);els = doc.select("div");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40849);assertEquals("fake", els.text());
    }finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testRcdataLessthanSign() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y6tlrpviq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testRcdataLessthanSign",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y6tlrpviq(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40850);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40851);String body;
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40852);Document doc;
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40853);Elements els;

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40854);body = "<textarea><fake></textarea>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40855);doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40856);els = doc.select("textarea");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40857);assertEquals("<fake>", els.text());

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40858);body = "<textarea><open";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40859);doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40860);els = doc.select("textarea");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40861);assertEquals("", els.text());

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40862);body = "<textarea>hello world</?fake</textarea>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40863);doc = Jsoup.parse(body);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40864);els = doc.select("textarea");
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40865);assertEquals("hello world</?fake", els.text());
    }finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testRCDATAEndTagName() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14enl3yvj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testRCDATAEndTagName",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14enl3yvj6(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40866);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40867);for (char c : whiteSpace) {{
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40868);String body = String.format("<textarea>data</textarea%c>", c);
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40869);Document doc = Jsoup.parse(body);
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40870);Elements els = doc.select("textarea");
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40871);assertEquals("data", els.text());
        }
    }}finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testCommentEndCoverage() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aydd4tvjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testCommentEndCoverage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40872,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aydd4tvjc(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40872);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40873);String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --! --- --><p>Hello</p></body></html>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40874);Document doc = Jsoup.parse(html);

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40875);Element body = doc.body();
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40876);Comment comment = (Comment) body.childNode(1);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40877);assertEquals(" <table><tr><td></table> --! --- ", comment.getData());
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40878);Element p = body.child(1);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40879);TextNode text = (TextNode) p.childNode(0);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40880);assertEquals("Hello", text.getWholeText());
    }finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testCommentEndBangCoverage() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1os2ot1vjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testCommentEndBangCoverage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40881,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1os2ot1vjl(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40881);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40882);String html = "<html><head></head><body><img src=foo><!-- <table><tr><td></table> --!---!>--><p>Hello</p></body></html>";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40883);Document doc = Jsoup.parse(html);

        __CLR4_4_1vhpvhplh9yvht7.R.inc(40884);Element body = doc.body();
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40885);Comment comment = (Comment) body.childNode(1);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40886);assertEquals(" <table><tr><td></table> --!-", comment.getData());
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40887);Element p = body.child(1);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40888);TextNode text = (TextNode) p.childNode(0);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40889);assertEquals("Hello", text.getWholeText());
    }finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testPublicIdentifiersWithWhitespace() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16b18gpvju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testPublicIdentifiersWithWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40890,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16b18gpvju(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40890);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40891);String expectedOutput = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0//EN\">";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40892);for (char q : quote) {{
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40893);for (char ws : whiteSpace) {{
                __CLR4_4_1vhpvhplh9yvht7.R.inc(40894);String[] htmls = { 
                        String.format("<!DOCTYPE html%cPUBLIC %c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html %cPUBLIC %c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC%c%c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC %c%c-//W3C//DTD HTML 4.0//EN%c>", ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC %c-//W3C//DTD HTML 4.0//EN%c%c>", q, q, ws),
                        String.format("<!DOCTYPE html PUBLIC%c-//W3C//DTD HTML 4.0//EN%c%c>", q, q, ws)
                    };
                __CLR4_4_1vhpvhplh9yvht7.R.inc(40895);for (String html : htmls) {{
                    __CLR4_4_1vhpvhplh9yvht7.R.inc(40896);Document doc = Jsoup.parse(html);
                    __CLR4_4_1vhpvhplh9yvht7.R.inc(40897);assertEquals(expectedOutput, doc.childNode(0).outerHtml());
                }
            }}
        }}
    }}finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testSystemIdentifiersWithWhitespace() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oxg7cdvk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testSystemIdentifiersWithWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40898,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oxg7cdvk2(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40898);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40899);String expectedOutput = "<!DOCTYPE html SYSTEM \"http://www.w3.org/TR/REC-html40/strict.dtd\">";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40900);for (char q : quote) {{
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40901);for (char ws : whiteSpace) {{
                __CLR4_4_1vhpvhplh9yvht7.R.inc(40902);String[] htmls = {
                        String.format("<!DOCTYPE html%cSYSTEM %chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html %cSYSTEM %chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html SYSTEM%c%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html SYSTEM %c%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", ws, q, q),
                        String.format("<!DOCTYPE html SYSTEM %chttp://www.w3.org/TR/REC-html40/strict.dtd%c%c>", q, q, ws),
                        String.format("<!DOCTYPE html SYSTEM%chttp://www.w3.org/TR/REC-html40/strict.dtd%c%c>", q, q, ws)
                    };
                __CLR4_4_1vhpvhplh9yvht7.R.inc(40903);for (String html : htmls) {{
                    __CLR4_4_1vhpvhplh9yvht7.R.inc(40904);Document doc = Jsoup.parse(html);
                    __CLR4_4_1vhpvhplh9yvht7.R.inc(40905);assertEquals(expectedOutput, doc.childNode(0).outerHtml());
                }
            }}
        }}
    }}finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test
    public void testPublicAndSystemIdentifiersWithWhitespace() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14r03pzvka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.testPublicAndSystemIdentifiersWithWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14r03pzvka(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40906);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40907);String expectedOutput = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0//EN\""
                + " \"http://www.w3.org/TR/REC-html40/strict.dtd\">";
    	__CLR4_4_1vhpvhplh9yvht7.R.inc(40908);for (char q : quote) {{
            __CLR4_4_1vhpvhplh9yvht7.R.inc(40909);for (char ws : whiteSpace) {{
                __CLR4_4_1vhpvhplh9yvht7.R.inc(40910);String[] htmls = {
                        String.format("<!DOCTYPE html PUBLIC %c-//W3C//DTD HTML 4.0//EN%c"
                                + "%c%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", q, q, ws, q, q),
                        String.format("<!DOCTYPE html PUBLIC %c-//W3C//DTD HTML 4.0//EN%c"
                                + "%chttp://www.w3.org/TR/REC-html40/strict.dtd%c>", q, q, q, q)
                    };
                __CLR4_4_1vhpvhplh9yvht7.R.inc(40911);for (String html : htmls) {{
                    __CLR4_4_1vhpvhplh9yvht7.R.inc(40912);Document doc = Jsoup.parse(html);
                    __CLR4_4_1vhpvhplh9yvht7.R.inc(40913);assertEquals(expectedOutput, doc.childNode(0).outerHtml());
                }
            }}
        }}
    }}finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}

    @Test public void handlesLessInTagThanAsNewTag() {__CLR4_4_1vhpvhplh9yvht7.R.globalSliceStart(getClass().getName(),40914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c4ge5hvki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vhpvhplh9yvht7.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vhpvhplh9yvht7.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokeniserStateTest.handlesLessInTagThanAsNewTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40914,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c4ge5hvki(){try{__CLR4_4_1vhpvhplh9yvht7.R.inc(40914);
        // out of spec, but clear author intent
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40915);String html = "<p\n<p<div id=one <span>Two";
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40916);Document doc = Jsoup.parse(html);
        __CLR4_4_1vhpvhplh9yvht7.R.inc(40917);assertEquals("<p></p><p></p><div id=\"one\"><span>Two</span></div>", TextUtil.stripNewlines(doc.body().html()));
    }finally{__CLR4_4_1vhpvhplh9yvht7.R.flushNeeded();}}
}
