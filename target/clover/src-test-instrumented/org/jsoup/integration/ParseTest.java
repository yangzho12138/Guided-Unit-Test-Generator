/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.integration;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;

import static org.junit.Assert.*;

/**
 * Integration test: parses from real-world example HTML.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class ParseTest {static class __CLR4_4_19uc9uclh9yvgw8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,12857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSmhBizArticle() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u1j5iy9uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testSmhBizArticle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12756,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u1j5iy9uc() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12756);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12757);File in = getFile("/htmltests/smh-biz-article-1.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12758);Document doc = Jsoup.parse(in, "UTF-8",
                "http://www.smh.com.au/business/the-boards-next-fear-the-female-quota-20100106-lteq.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12759);assertEquals("The board\u2019s next fear: the female quota",
                doc.title()); // note that the apos in the source is a literal \u2019 (8217), not escaped or '
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12760);assertEquals("en", doc.select("html").attr("xml:lang"));

        __CLR4_4_19uc9uclh9yvgw8.R.inc(12761);Elements articleBody = doc.select(".articleBody > *");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12762);assertEquals(17, articleBody.size());
        // todo: more tests!

    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testNewsHomepage() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12vn1iy9uj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testNewsHomepage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12vn1iy9uj() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12763);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12764);File in = getFile("/htmltests/news-com-au-home.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12765);Document doc = Jsoup.parse(in, "UTF-8", "http://www.news.com.au/");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12766);assertEquals("News.com.au | News from Australia and around the world online | NewsComAu", doc.title());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12767);assertEquals("Brace yourself for Metro meltdown", doc.select(".id1225817868581 h4").text().trim());

        __CLR4_4_19uc9uclh9yvgw8.R.inc(12768);Element a = doc.select("a[href=/entertainment/horoscopes]").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12769);assertEquals("/entertainment/horoscopes", a.attr("href"));
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12770);assertEquals("http://www.news.com.au/entertainment/horoscopes", a.attr("abs:href"));

        __CLR4_4_19uc9uclh9yvgw8.R.inc(12771);Element hs = doc.select("a[href*=naughty-corners-are-a-bad-idea]").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12772);assertEquals(
                "http://www.heraldsun.com.au/news/naughty-corners-are-a-bad-idea-for-kids/story-e6frf7jo-1225817899003",
                hs.attr("href"));
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12773);assertEquals(hs.attr("href"), hs.attr("abs:href"));
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testGoogleSearchIpod() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bvml6y9uu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testGoogleSearchIpod",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bvml6y9uu() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12774);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12775);File in = getFile("/htmltests/google-ipod.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12776);Document doc = Jsoup.parse(in, "UTF-8", "http://www.google.com/search?hl=en&q=ipod&aq=f&oq=&aqi=g10");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12777);assertEquals("ipod - Google Search", doc.title());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12778);Elements results = doc.select("h3.r > a");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12779);assertEquals(12, results.size());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12780);assertEquals(
                "http://news.google.com/news?hl=en&q=ipod&um=1&ie=UTF-8&ei=uYlKS4SbBoGg6gPf-5XXCw&sa=X&oi=news_group&ct=title&resnum=1&ved=0CCIQsQQwAA",
                results.get(0).attr("href"));
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12781);assertEquals("http://www.apple.com/itunes/",
                results.get(1).attr("href"));
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testBinaryThrowsException() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ixffp29v2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBinaryThrowsException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ixffp29v2() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12782);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12783);File in = getFile("/htmltests/thumb.jpg");

        __CLR4_4_19uc9uclh9yvgw8.R.inc(12784);boolean threw = false;
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12785);try {
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12786);Document doc = Jsoup.parse(in, "UTF-8");
        } catch (IOException e) {
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12787);threw = true;
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12788);assertEquals("Input is binary and unsupported", e.getMessage());
        }
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12789);assertTrue(threw);
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testYahooJp() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9azqz9va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testYahooJp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9azqz9va() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12790);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12791);File in = getFile("/htmltests/yahoo-jp.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12792);Document doc = Jsoup.parse(in, "UTF-8", "http://www.yahoo.co.jp/index.html"); // http charset is utf-8.
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12793);assertEquals("Yahoo! JAPAN", doc.title());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12794);Element a = doc.select("a[href=t/2322m2]").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12795);assertEquals("http://www.yahoo.co.jp/_ylh=X3oDMTB0NWxnaGxsBF9TAzIwNzcyOTYyNjUEdGlkAzEyBHRtcGwDZ2Ex/t/2322m2",
                a.attr("abs:href")); // session put into <base>
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12796);assertEquals("\u5168\u56fd\u3001\u4eba\u6c17\u306e\u99c5\u30e9\u30f3\u30ad\u30f3\u30b0", a.text());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testBaidu() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1msil2o9vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBaidu",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1msil2o9vh() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12797);
        // tests <meta http-equiv="Content-Type" content="text/html;charset=gb2312">
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12798);File in = getFile("/htmltests/baidu-cn-home.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12799);Document doc = Jsoup.parse(in, null,
                "http://www.baidu.com/"); // http charset is gb2312, but NOT specifying it, to test http-equiv parse
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12800);Element submit = doc.select("#su").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12801);assertEquals("\u767e\u5ea6\u4e00\u4e0b", submit.attr("value"));

        // test from attribute match
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12802);submit = doc.select("input[value=\u767e\u5ea6\u4e00\u4e0b]").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12803);assertEquals("su", submit.id());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12804);Element newsLink = doc.select("a:contains(\u65b0)").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12805);assertEquals("http://news.baidu.com", newsLink.absUrl("href"));

        // check auto-detect from meta
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12806);assertEquals("GB2312", doc.outputSettings().charset().displayName());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12807);assertEquals("<title>\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053      </title>", doc.select("title").outerHtml());

        __CLR4_4_19uc9uclh9yvgw8.R.inc(12808);doc.outputSettings().charset("ascii");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12809);assertEquals("<title>&#x767e;&#x5ea6;&#x4e00;&#x4e0b;&#xff0c;&#x4f60;&#x5c31;&#x77e5;&#x9053;      </title>",
                doc.select("title").outerHtml());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testBaiduVariant() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7isv19vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBaiduVariant",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12810,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7isv19vu() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12810);
        // tests <meta charset> when preceded by another <meta>
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12811);File in = getFile("/htmltests/baidu-variant.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12812);Document doc = Jsoup.parse(in, null,
                "http://www.baidu.com/"); // http charset is gb2312, but NOT specifying it, to test http-equiv parse
        // check auto-detect from meta
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12813);assertEquals("GB2312", doc.outputSettings().charset().displayName());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12814);assertEquals("<title>\u767e\u5ea6\u4e00\u4e0b\uff0c\u4f60\u5c31\u77e5\u9053</title>", doc.select("title").outerHtml());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testHtml5Charset() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9t0ud9vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testHtml5Charset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9t0ud9vz() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12815);
        // test that <meta charset="gb2312"> works
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12816);File in = getFile("/htmltests/meta-charset-1.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12817);Document doc = Jsoup.parse(in, null, "http://example.com/"); //gb2312, has html5 <meta charset>
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12818);assertEquals("\u65b0", doc.text());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12819);assertEquals("GB2312", doc.outputSettings().charset().displayName());

        // double check, no charset, falls back to utf8 which is incorrect
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12820);in = getFile("/htmltests/meta-charset-2.html"); //
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12821);doc = Jsoup.parse(in, null, "http://example.com"); // gb2312, no charset
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12822);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12823);assertFalse("\u65b0".equals(doc.text()));

        // confirm fallback to utf8
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12824);in = getFile("/htmltests/meta-charset-3.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12825);doc = Jsoup.parse(in, null, "http://example.com/"); // utf8, no charset
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12826);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12827);assertEquals("\u65b0", doc.text());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testBrokenHtml5CharsetWithASingleDoubleQuote() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rgp5h49wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testBrokenHtml5CharsetWithASingleDoubleQuote",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rgp5h49wc() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12828);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12829);InputStream in = inputStreamFrom("<html>\n" +
                "<head><meta charset=UTF-8\"></head>\n" +
                "<body></body>\n" +
                "</html>");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12830);Document doc = Jsoup.parse(in, null, "http://example.com/");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12831);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testNytArticle() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18y856u9wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testNytArticle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18y856u9wg() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12832);
        // has tags like <nyt_text>
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12833);File in = getFile("/htmltests/nyt-article-1.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12834);Document doc = Jsoup.parse(in, null, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp");

        __CLR4_4_19uc9uclh9yvgw8.R.inc(12835);Element headline = doc.select("nyt_headline[version=1.0]").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12836);assertEquals("As BP Lays Out Future, It Will Not Include Hayward", headline.text());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testYahooArticle() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13flor39wl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testYahooArticle",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13flor39wl() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12837);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12838);File in = getFile("/htmltests/yahoo-article-1.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12839);Document doc = Jsoup.parse(in, "UTF-8", "http://news.yahoo.com/s/nm/20100831/bs_nm/us_gm_china");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12840);Element p = doc.select("p:contains(Volt will be sold in the United States)").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12841);assertEquals("In July, GM said its electric Chevrolet Volt will be sold in the United States at $41,000 -- $8,000 more than its nearest competitor, the Nissan Leaf.", p.text());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    @Test
    public void testLowercaseUtf8Charset() throws IOException {__CLR4_4_19uc9uclh9yvgw8.R.globalSliceStart(getClass().getName(),12842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vgwggt9wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19uc9uclh9yvgw8.R.rethrow($CLV_t2$);}finally{__CLR4_4_19uc9uclh9yvgw8.R.globalSliceEnd(getClass().getName(),"org.jsoup.integration.ParseTest.testLowercaseUtf8Charset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vgwggt9wq() throws IOException{try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12842);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12843);File in = getFile("/htmltests/lowercase-charset-test.html");
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12844);Document doc = Jsoup.parse(in, null);

        __CLR4_4_19uc9uclh9yvgw8.R.inc(12845);Element form = doc.select("#form").first();
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12846);assertEquals(2, form.children().size());
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12847);assertEquals("UTF-8", doc.outputSettings().charset().name());
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    public static File getFile(String resourceName) {try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12848);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12849);try {
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12850);File file = new File(ParseTest.class.getResource(resourceName).toURI());
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12851);return file;
        } catch (URISyntaxException e) {
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12852);throw new IllegalStateException(e);
        }
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

    public static InputStream inputStreamFrom(String s) {try{__CLR4_4_19uc9uclh9yvgw8.R.inc(12853);
        __CLR4_4_19uc9uclh9yvgw8.R.inc(12854);try {
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12855);return new ByteArrayInputStream(s.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            __CLR4_4_19uc9uclh9yvgw8.R.inc(12856);throw new RuntimeException(e);
        }
    }finally{__CLR4_4_19uc9uclh9yvgw8.R.flushNeeded();}}

}
