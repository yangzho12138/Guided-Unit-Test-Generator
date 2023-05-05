/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.jsoup.integration.ParseTest.getFile;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class DataUtilTest {static class __CLR4_4_19ka9kalh9yvgvc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,12477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    public void testCharset() {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oh2zl9ka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.testCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oh2zl9ka(){try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12394);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12395);assertEquals("utf-8", DataUtil.getCharsetFromContentType("text/html;charset=utf-8 "));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12396);assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset=UTF-8"));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12397);assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1"));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12398);assertEquals(null, DataUtil.getCharsetFromContentType("text/html"));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12399);assertEquals(null, DataUtil.getCharsetFromContentType(null));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12400);assertEquals(null, DataUtil.getCharsetFromContentType("text/html;charset=Unknown"));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test public void testQuotedCharset() {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19skleh9kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.testQuotedCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19skleh9kh(){try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12401);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12402);assertEquals("utf-8", DataUtil.getCharsetFromContentType("text/html; charset=\"utf-8\""));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12403);assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html;charset=\"UTF-8\""));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12404);assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=\"ISO-8859-1\""));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12405);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset=\"Unsupported\""));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12406);assertEquals("UTF-8", DataUtil.getCharsetFromContentType("text/html; charset='UTF-8'"));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    private InputStream stream(String data) {try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12407);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12408);return new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    private InputStream stream(String data, String charset) {try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12409);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12410);try {
            __CLR4_4_19ka9kalh9yvgvc.R.inc(12411);return new ByteArrayInputStream(data.getBytes(charset));
        } catch (UnsupportedEncodingException e) {
            __CLR4_4_19ka9kalh9yvgvc.R.inc(12412);fail();
        }
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12413);return null;
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test public void discardsSpuriousByteOrderMark() throws IOException {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojnckn9ku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.discardsSpuriousByteOrderMark",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojnckn9ku() throws IOException{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12414);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12415);String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12416);Document doc = DataUtil.parseInputStream(stream(html), "UTF-8", "http://foo.com/", Parser.htmlParser());
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12417);assertEquals("One", doc.head().text());
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test public void discardsSpuriousByteOrderMarkWhenNoCharsetSet() throws IOException {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ylh0489ky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.discardsSpuriousByteOrderMarkWhenNoCharsetSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ylh0489ky() throws IOException{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12418);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12419);String html = "\ufeff<html><head><title>One</title></head><body>Two</body></html>";
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12420);Document doc = DataUtil.parseInputStream(stream(html), null, "http://foo.com/", Parser.htmlParser());
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12421);assertEquals("One", doc.head().text());
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12422);assertEquals("UTF-8", doc.outputSettings().charset().displayName());
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void shouldNotThrowExceptionOnEmptyCharset() {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uzf8z69l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldNotThrowExceptionOnEmptyCharset",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uzf8z69l3(){try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12423);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12424);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset="));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12425);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset=;"));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags() {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sjnfcw9l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sjnfcw9l6(){try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12426);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12427);assertEquals("ISO-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=ISO-8859-1, charset=1251"));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void shouldCorrectCharsetForDuplicateCharsetString() {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ebyfub9l8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldCorrectCharsetForDuplicateCharsetString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12428,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ebyfub9l8(){try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12428);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12429);assertEquals("iso-8859-1", DataUtil.getCharsetFromContentType("text/html; charset=charset=iso-8859-1"));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void shouldReturnNullForIllegalCharsetNames() {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ptw1ly9la();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.shouldReturnNullForIllegalCharsetNames",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ptw1ly9la(){try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12430);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12431);assertEquals(null, DataUtil.getCharsetFromContentType("text/html; charset=$HJKDF\u00a7$/("));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void generatesMimeBoundaries() {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tdrpr39lc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.generatesMimeBoundaries",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tdrpr39lc(){try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12432);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12433);String m1 = DataUtil.mimeBoundary();
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12434);String m2 = DataUtil.mimeBoundary();

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12435);assertEquals(DataUtil.boundaryLength, m1.length());
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12436);assertEquals(DataUtil.boundaryLength, m2.length());
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12437);assertNotSame(m1, m2);
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}
    
    @Test
    public void wrongMetaCharsetFallback() throws IOException {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkgknx9li();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.wrongMetaCharsetFallback",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12438,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkgknx9li() throws IOException{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12438);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12439);String html = "<html><head><meta charset=iso-8></head><body></body></html>";

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12440);Document doc = DataUtil.parseInputStream(stream(html), null, "http://example.com", Parser.htmlParser());

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12441);final String expected = "<html>\n" +
            " <head>\n" +
            "  <meta charset=\"iso-8\">\n" +
            " </head>\n" +
            " <body></body>\n" +
            "</html>";

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12442);assertEquals(expected, doc.toString());
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void secondMetaElementWithContentTypeContainsCharsetParameter() throws Exception {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cs9sq59ln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.secondMetaElementWithContentTypeContainsCharsetParameter",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cs9sq59ln() throws Exception{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12443);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12444);String html = "<html><head>" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html\">" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\">" +
                "</head><body>\ud55c\uad6d\uc5b4</body></html>";

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12445);Document doc = DataUtil.parseInputStream(stream(html, "euc-kr"), null, "http://example.com", Parser.htmlParser());

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12446);assertEquals("\ud55c\uad6d\uc5b4", doc.body().text());
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void firstMetaElementWithCharsetShouldBeUsedForDecoding() throws Exception {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bavg2x9lr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.firstMetaElementWithCharsetShouldBeUsedForDecoding",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bavg2x9lr() throws Exception{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12447);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12448);String html = "<html><head>" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=koi8-u\">" +
                "</head><body>\u00dcbergr\u00f6\u00dfentr\u00e4ger</body></html>";

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12449);Document doc = DataUtil.parseInputStream(stream(html, "iso-8859-1"), null, "http://example.com", Parser.htmlParser());

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12450);assertEquals("\u00dcbergr\u00f6\u00dfentr\u00e4ger", doc.body().text());
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void supportsBOMinFiles() throws IOException {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kb5fp99lv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.supportsBOMinFiles",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kb5fp99lv() throws IOException{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12451);
        // test files from http://www.i18nl10n.com/korean/utftest/
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12452);File in = getFile("/bomtests/bom_utf16be.html");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12453);Document doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12454);assertTrue(doc.title().contains("UTF-16BE"));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12455);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12456);in = getFile("/bomtests/bom_utf16le.html");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12457);doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12458);assertTrue(doc.title().contains("UTF-16LE"));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12459);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12460);in = getFile("/bomtests/bom_utf32be.html");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12461);doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12462);assertTrue(doc.title().contains("UTF-32BE"));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12463);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12464);in = getFile("/bomtests/bom_utf32le.html");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12465);doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12466);assertTrue(doc.title().contains("UTF-32LE"));
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12467);assertTrue(doc.text().contains("\uac00\uac01\uac02\uac03\uac04\uac05"));
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void supportsUTF8BOM() throws IOException {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o4cz3i9mc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.supportsUTF8BOM",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o4cz3i9mc() throws IOException{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12468);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12469);File in = getFile("/bomtests/bom_utf8.html");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12470);Document doc = Jsoup.parse(in, null, "http://example.com");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12471);assertEquals("OK", doc.head().select("title").text());
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}

    @Test
    public void supportsXmlCharsetDeclaration() throws IOException {__CLR4_4_19ka9kalh9yvgvc.R.globalSliceStart(getClass().getName(),12472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19wtfy09mg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ka9kalh9yvgvc.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ka9kalh9yvgvc.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.DataUtilTest.supportsXmlCharsetDeclaration",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12472,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19wtfy09mg() throws IOException{try{__CLR4_4_19ka9kalh9yvgvc.R.inc(12472);
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12473);String encoding = "iso-8859-1";
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12474);InputStream soup = new ByteArrayInputStream((
            "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>" +
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00f6 W\u00f6rld!</html>"
        ).getBytes(encoding));

        __CLR4_4_19ka9kalh9yvgvc.R.inc(12475);Document doc = Jsoup.parse(soup, null, "");
        __CLR4_4_19ka9kalh9yvgvc.R.inc(12476);assertEquals("Hell\u00f6 W\u00f6rld!", doc.body().text());
    }finally{__CLR4_4_19ka9kalh9yvgvc.R.flushNeeded();}}
}
