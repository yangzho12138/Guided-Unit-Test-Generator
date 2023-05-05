/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.internal;

import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.util.Arrays;

import static org.jsoup.internal.StringUtil.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {static class __CLR4_4_1a2xa2xlh9yvgx0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,13132,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test public void join() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_144lj5da2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.join",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13065,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_144lj5da2x(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13065);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13066);assertEquals("", StringUtil.join(Arrays.asList(""), " "));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13067);assertEquals("one", StringUtil.join(Arrays.asList("one"), " "));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13068);assertEquals("one two three", StringUtil.join(Arrays.asList("one", "two", "three"), " "));
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void padding() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1psbu14a31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.padding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1psbu14a31(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13069);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13070);assertEquals("", StringUtil.padding(0));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13071);assertEquals(" ", StringUtil.padding(1));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13072);assertEquals("  ", StringUtil.padding(2));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13073);assertEquals("               ", StringUtil.padding(15));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13074);assertEquals("                                             ", StringUtil.padding(45));
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void paddingInACan() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14z1c3wa37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.paddingInACan",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14z1c3wa37(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13075);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13076);String[] padding = StringUtil.padding;
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13077);assertEquals(21, padding.length);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13078);for (int i = 0; (((i < padding.length)&&(__CLR4_4_1a2xa2xlh9yvgx0.R.iget(13079)!=0|true))||(__CLR4_4_1a2xa2xlh9yvgx0.R.iget(13080)==0&false)); i++) {{
            __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13081);assertEquals(i, padding[i].length());
        }
    }}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void isBlank() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wakoy9a3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.isBlank",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13082,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wakoy9a3e(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13082);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13083);assertTrue(StringUtil.isBlank(null));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13084);assertTrue(StringUtil.isBlank(""));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13085);assertTrue(StringUtil.isBlank("      "));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13086);assertTrue(StringUtil.isBlank("   \r\n  "));

        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13087);assertFalse(StringUtil.isBlank("hello"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13088);assertFalse(StringUtil.isBlank("   hello   "));
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void isNumeric() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l58ygaa3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.isNumeric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13089,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l58ygaa3l(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13089);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13090);assertFalse(StringUtil.isNumeric(null));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13091);assertFalse(StringUtil.isNumeric(" "));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13092);assertFalse(StringUtil.isNumeric("123 546"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13093);assertFalse(StringUtil.isNumeric("hello"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13094);assertFalse(StringUtil.isNumeric("123.334"));

        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13095);assertTrue(StringUtil.isNumeric("1"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13096);assertTrue(StringUtil.isNumeric("1234"));
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void isWhitespace() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fagklua3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.isWhitespace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13097,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fagklua3t(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13097);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13098);assertTrue(StringUtil.isWhitespace('\t'));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13099);assertTrue(StringUtil.isWhitespace('\n'));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13100);assertTrue(StringUtil.isWhitespace('\r'));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13101);assertTrue(StringUtil.isWhitespace('\f'));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13102);assertTrue(StringUtil.isWhitespace(' '));
        
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13103);assertFalse(StringUtil.isWhitespace('\u00a0'));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13104);assertFalse(StringUtil.isWhitespace('\u2000'));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13105);assertFalse(StringUtil.isWhitespace('\u3000'));
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void normaliseWhiteSpace() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eh8svca42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.normaliseWhiteSpace",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eh8svca42(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13106);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13107);assertEquals(" ", normaliseWhitespace("    \r \n \r\n"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13108);assertEquals(" hello there ", normaliseWhitespace("   hello   \r \n  there    \n"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13109);assertEquals("hello", normaliseWhitespace("hello"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13110);assertEquals("hello there", normaliseWhitespace("hello\nthere"));
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void normaliseWhiteSpaceHandlesHighSurrogates() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qbj7b6a47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.normaliseWhiteSpaceHandlesHighSurrogates",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qbj7b6a47(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13111);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13112);String test71540chars = "\ud869\udeb2\u304b\u309a  1";
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13113);String test71540charsExpectedSingleWhitespace = "\ud869\udeb2\u304b\u309a 1";

        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13114);assertEquals(test71540charsExpectedSingleWhitespace, normaliseWhitespace(test71540chars));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13115);String extractedText = Jsoup.parse(test71540chars).text();
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13116);assertEquals(test71540charsExpectedSingleWhitespace, extractedText);
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}

    @Test public void resolvesRelativeUrls() {__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceStart(getClass().getName(),13117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bt4mhqa4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1a2xa2xlh9yvgx0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1a2xa2xlh9yvgx0.R.globalSliceEnd(getClass().getName(),"org.jsoup.internal.StringUtilTest.resolvesRelativeUrls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),13117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bt4mhqa4d(){try{__CLR4_4_1a2xa2xlh9yvgx0.R.inc(13117);
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13118);assertEquals("http://example.com/one/two?three", resolve("http://example.com", "./one/two?three"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13119);assertEquals("http://example.com/one/two?three", resolve("http://example.com?one", "./one/two?three"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13120);assertEquals("http://example.com/one/two?three#four", resolve("http://example.com", "./one/two?three#four"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13121);assertEquals("https://example.com/one", resolve("http://example.com/", "https://example.com/one"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13122);assertEquals("http://example.com/one/two.html", resolve("http://example.com/two/", "../one/two.html"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13123);assertEquals("https://example2.com/one", resolve("https://example.com/", "//example2.com/one"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13124);assertEquals("https://example.com:8080/one", resolve("https://example.com:8080", "./one"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13125);assertEquals("https://example2.com/one", resolve("http://example.com/", "https://example2.com/one"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13126);assertEquals("https://example.com/one", resolve("wrong", "https://example.com/one"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13127);assertEquals("https://example.com/one", resolve("https://example.com/one", ""));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13128);assertEquals("", resolve("wrong", "also wrong"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13129);assertEquals("ftp://example.com/one", resolve("ftp://example.com/two/", "../one"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13130);assertEquals("ftp://example.com/one/two.c", resolve("ftp://example.com/one/", "./two.c"));
        __CLR4_4_1a2xa2xlh9yvgx0.R.inc(13131);assertEquals("ftp://example.com/one/two.c", resolve("ftp://example.com/one/", "two.c"));
    }finally{__CLR4_4_1a2xa2xlh9yvgx0.R.flushNeeded();}}
}
