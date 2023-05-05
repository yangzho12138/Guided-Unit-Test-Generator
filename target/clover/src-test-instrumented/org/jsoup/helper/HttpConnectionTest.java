/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.integration.ParseTest;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HttpConnectionTest {static class __CLR4_4_19ml9mllh9yvgvi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,12644,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /* most actual network http connection tests are in integration */

    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test(expected=IllegalArgumentException.class) public void throwsExceptionOnParseWithoutExecute() throws IOException {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ty3f3u9ml();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,80,97,114,115,101,87,105,116,104,111,117,116,69,120,101,99,117,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsExceptionOnParseWithoutExecute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ty3f3u9ml() throws IOException{try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12477);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12478);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12479);con.response().parse();
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsExceptionOnBodyWithoutExecute() throws IOException {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4tgcp9mo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,66,111,100,121,87,105,116,104,111,117,116,69,120,101,99,117,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsExceptionOnBodyWithoutExecute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4tgcp9mo() throws IOException{try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12480);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12481);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12482);con.response().body();
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsExceptionOnBodyAsBytesWithoutExecute() throws IOException {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ucjfa9mr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,69,120,99,101,112,116,105,111,110,79,110,66,111,100,121,65,115,66,121,116,101,115,87,105,116,104,111,117,116,69,120,101,99,117,116,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsExceptionOnBodyAsBytesWithoutExecute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12483,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ucjfa9mr() throws IOException{try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12483);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12484);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12485);con.response().bodyAsBytes();
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test @MultiLocaleTest public void caseInsensitiveHeaders() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwkca49mu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.caseInsensitiveHeaders",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwkca49mu(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12486);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12487);Connection.Response res = new HttpConnection.Response();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12488);res.header("Accept-Encoding", "gzip");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12489);res.header("content-type", "text/html");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12490);res.header("refErrer", "http://example.com");

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12491);assertTrue(res.hasHeader("Accept-Encoding"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12492);assertTrue(res.hasHeader("accept-encoding"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12493);assertTrue(res.hasHeader("accept-Encoding"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12494);assertTrue(res.hasHeader("ACCEPT-ENCODING"));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12495);assertEquals("gzip", res.header("accept-Encoding"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12496);assertEquals("gzip", res.header("ACCEPT-ENCODING"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12497);assertEquals("text/html", res.header("Content-Type"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12498);assertEquals("http://example.com", res.header("Referrer"));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12499);res.removeHeader("Content-Type");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12500);assertFalse(res.hasHeader("content-type"));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12501);res.removeHeader("ACCEPT-ENCODING");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12502);assertFalse(res.hasHeader("Accept-Encoding"));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12503);res.header("ACCEPT-ENCODING", "deflate");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12504);assertEquals("deflate", res.header("Accept-Encoding"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12505);assertEquals("deflate", res.header("accept-Encoding"));
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void headers() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jaq58t9ne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.headers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jaq58t9ne(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12506);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12507);Connection con = HttpConnection.connect("http://example.com");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12508);Map<String, String> headers = new HashMap<>();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12509);headers.put("content-type", "text/html");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12510);headers.put("Connection", "keep-alive");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12511);headers.put("Host", "http://example.com");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12512);con.headers(headers);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12513);assertEquals("text/html", con.request().header("content-type"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12514);assertEquals("keep-alive", con.request().header("Connection"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12515);assertEquals("http://example.com", con.request().header("Host"));
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void sameHeadersCombineWithComma() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a1kill9no();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.sameHeadersCombineWithComma",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a1kill9no(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12516);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12517);Map<String, List<String>> headers = new HashMap<>();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12518);List<String> values = new ArrayList<>();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12519);values.add("no-cache");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12520);values.add("no-store");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12521);headers.put("Cache-Control", values);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12522);HttpConnection.Response res = new HttpConnection.Response();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12523);res.processResponseHeaders(headers);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12524);assertEquals("no-cache, no-store", res.header("Cache-Control"));
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void multipleHeaders() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14i8zq59nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.multipleHeaders",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14i8zq59nx(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12525);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12526);Connection.Request req = new HttpConnection.Request();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12527);req.addHeader("Accept", "Something");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12528);req.addHeader("Accept", "Everything");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12529);req.addHeader("Foo", "Bar");

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12530);assertTrue(req.hasHeader("Accept"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12531);assertTrue(req.hasHeader("ACCEpt"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12532);assertEquals("Something, Everything", req.header("accept"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12533);assertTrue(req.hasHeader("fOO"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12534);assertEquals("Bar", req.header("foo"));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12535);List<String> accept = req.headers("accept");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12536);assertEquals(2, accept.size());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12537);assertEquals("Something", accept.get(0));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12538);assertEquals("Everything", accept.get(1));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12539);Map<String, List<String>> headers = req.multiHeaders();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12540);assertEquals(accept, headers.get("Accept"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12541);assertEquals("Bar", headers.get("Foo").get(0));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12542);assertTrue(req.hasHeader("Accept"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12543);assertTrue(req.hasHeaderWithValue("accept", "Something"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12544);assertTrue(req.hasHeaderWithValue("accept", "Everything"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12545);assertFalse(req.hasHeaderWithValue("accept", "Something for nothing"));

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12546);req.removeHeader("accept");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12547);headers = req.multiHeaders();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12548);assertEquals("Bar", headers.get("Foo").get(0));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12549);assertFalse(req.hasHeader("Accept"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12550);assertTrue(headers.get("Accept") == null);
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void ignoresEmptySetCookies() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14elerk9on();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.ignoresEmptySetCookies",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14elerk9on(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12551);
        // prep http response header map
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12552);Map<String, List<String>> headers = new HashMap<>();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12553);headers.put("Set-Cookie", Collections.<String>emptyList());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12554);HttpConnection.Response res = new HttpConnection.Response();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12555);res.processResponseHeaders(headers);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12556);assertEquals(0, res.cookies().size());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void ignoresEmptyCookieNameAndVals() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rkv50r9ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.ignoresEmptyCookieNameAndVals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rkv50r9ot(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12557);
        // prep http response header map
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12558);Map<String, List<String>> headers = new HashMap<>();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12559);List<String> cookieStrings = new ArrayList<>();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12560);cookieStrings.add(null);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12561);cookieStrings.add("");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12562);cookieStrings.add("one");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12563);cookieStrings.add("two=");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12564);cookieStrings.add("three=;");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12565);cookieStrings.add("four=data; Domain=.example.com; Path=/");

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12566);headers.put("Set-Cookie", cookieStrings);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12567);HttpConnection.Response res = new HttpConnection.Response();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12568);res.processResponseHeaders(headers);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12569);assertEquals(4, res.cookies().size());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12570);assertEquals("", res.cookie("one"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12571);assertEquals("", res.cookie("two"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12572);assertEquals("", res.cookie("three"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12573);assertEquals("data", res.cookie("four"));
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void connectWithUrl() throws MalformedURLException {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1azsqvu9pa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.connectWithUrl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12574,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1azsqvu9pa() throws MalformedURLException{try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12574);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12575);Connection con = HttpConnection.connect(new URL("http://example.com"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12576);assertEquals("http://example.com", con.request().url().toExternalForm());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsOnMalformedUrl() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v5lctj9pd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,79,110,77,97,108,102,111,114,109,101,100,85,114,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsOnMalformedUrl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12577,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v5lctj9pd(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12577);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12578);Connection con = HttpConnection.connect("bzzt");
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void userAgent() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_169v5kx9pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.userAgent",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12579,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_169v5kx9pf(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12579);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12580);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12581);assertEquals(HttpConnection.DEFAULT_UA, con.request().header("User-Agent"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12582);con.userAgent("Mozilla");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12583);assertEquals("Mozilla", con.request().header("User-Agent"));
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void timeout() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fyn4oo9pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.timeout",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fyn4oo9pk(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12584);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12585);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12586);assertEquals(30 * 1000, con.request().timeout());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12587);con.timeout(1000);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12588);assertEquals(1000, con.request().timeout());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void referrer() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dviiyu9pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.referrer",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12589,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dviiyu9pp(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12589);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12590);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12591);con.referrer("http://foo.com");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12592);assertEquals("http://foo.com", con.request().header("Referer"));
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void method() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q0y12w9pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.method",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q0y12w9pt(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12593);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12594);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12595);assertEquals(Connection.Method.GET, con.request().method());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12596);con.method(Connection.Method.POST);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12597);assertEquals(Connection.Method.POST, con.request().method());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class) public void throwsOnOddData() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_194tuvg9py();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,104,114,111,119,115,79,110,79,100,100,68,97,116,97,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.throwsOnOddData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_194tuvg9py(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12598);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12599);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12600);con.data("Name", "val", "what");
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void data() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15ffhrl9q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.data",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12601,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15ffhrl9q1(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12601);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12602);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12603);con.data("Name", "Val", "Foo", "bar");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12604);Collection<Connection.KeyVal> values = con.request().data();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12605);Object[] data =  values.toArray();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12606);Connection.KeyVal one = (Connection.KeyVal) data[0];
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12607);Connection.KeyVal two = (Connection.KeyVal) data[1];
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12608);assertEquals("Name", one.key());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12609);assertEquals("Val", one.value());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12610);assertEquals("Foo", two.key());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12611);assertEquals("bar", two.value());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void cookie() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u5cld79qc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.cookie",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u5cld79qc(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12612);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12613);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12614);con.cookie("Name", "Val");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12615);assertEquals("Val", con.request().cookie("Name"));
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void inputStream() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tv19fz9qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.inputStream",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tv19fz9qg(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12616);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12617);Connection.KeyVal kv = HttpConnection.KeyVal.create("file", "thumb.jpg", ParseTest.inputStreamFrom("Check"));
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12618);assertEquals("file", kv.key());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12619);assertEquals("thumb.jpg", kv.value());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12620);assertTrue(kv.hasInputStream());

        __CLR4_4_19ml9mllh9yvgvi.R.inc(12621);kv = HttpConnection.KeyVal.create("one", "two");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12622);assertEquals("one", kv.key());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12623);assertEquals("two", kv.value());
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12624);assertFalse(kv.hasInputStream());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void requestBody() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ozvug9qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.requestBody",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12625,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ozvug9qp(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12625);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12626);Connection con = HttpConnection.connect("http://example.com/");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12627);con.requestBody("foo");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12628);assertEquals("foo", con.request().requestBody());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void encodeUrl() throws MalformedURLException {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wxtkkg9qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.encodeUrl",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12629,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wxtkkg9qt() throws MalformedURLException{try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12629);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12630);URL url1 = new URL("http://test.com/?q=white space");
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12631);URL url2 = HttpConnection.encodeUrl(url1);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12632);assertEquals("http://test.com/?q=white%20space", url2.toExternalForm());
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void noUrlThrowsValidationError() throws IOException {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qslkl79qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.noUrlThrowsValidationError",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qslkl79qx() throws IOException{try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12633);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12634);HttpConnection con = new HttpConnection();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12635);boolean threw = false;
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12636);try {
            __CLR4_4_19ml9mllh9yvgvi.R.inc(12637);con.execute();
        } catch (IllegalArgumentException e) {
            __CLR4_4_19ml9mllh9yvgvi.R.inc(12638);threw = true;
            __CLR4_4_19ml9mllh9yvgvi.R.inc(12639);assertEquals("URL must be specified to connect", e.getMessage());
        }
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12640);assertTrue(threw);
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}

    @Test public void handlesHeaderEncodingOnRequest() {__CLR4_4_19ml9mllh9yvgvi.R.globalSliceStart(getClass().getName(),12641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w831o9r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_19ml9mllh9yvgvi.R.rethrow($CLV_t2$);}finally{__CLR4_4_19ml9mllh9yvgvi.R.globalSliceEnd(getClass().getName(),"org.jsoup.helper.HttpConnectionTest.handlesHeaderEncodingOnRequest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),12641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w831o9r5(){try{__CLR4_4_19ml9mllh9yvgvi.R.inc(12641);
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12642);Connection.Request req = new HttpConnection.Request();
        __CLR4_4_19ml9mllh9yvgvi.R.inc(12643);req.addHeader("xxx", "\u00e9");
    }finally{__CLR4_4_19ml9mllh9yvgvi.R.flushNeeded();}}
}
