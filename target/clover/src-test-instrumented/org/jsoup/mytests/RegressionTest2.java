/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.mytests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {static class __CLR4_4_1ql8ql8lh9yvhnw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,37734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bjl721ql8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1001",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bjl721ql8() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34460);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34461);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34462)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34463)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34464);System.out.format("%n%s%n", "RegressionTest2.test1001");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34465);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34466);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34467);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34468);org.jsoup.nodes.Element element6 = document1.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34469);org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) ' ');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34470);String str9 = elements8.html();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34471);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34472);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34473);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34474);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34475);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34476);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1002() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1esl5uiqlp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1002",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34477,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1esl5uiqlp() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34477);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34478);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34479)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34480)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34481);System.out.format("%n%s%n", "RegressionTest2.test1002");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34482);java.io.InputStream inputStream2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34483);org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34484);String str4 = keyVal3.contentType();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34485);org.junit.Assert.assertNotNull(keyVal3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34486);org.junit.Assert.assertNull(str4);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1003() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i1l4mzqlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1003",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i1l4mzqlz() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34487);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34488);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34489)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34490)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34491);System.out.format("%n%s%n", "RegressionTest2.test1003");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34492);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34493);org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34494);String str5 = document4.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34495);org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34496);org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34497);org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34498);String str10 = document9.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34499);String str11 = document9.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34500);org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34501);String str14 = document13.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34502);String str15 = document13.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34503);org.jsoup.select.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34504);boolean boolean18 = document13.is((org.jsoup.select.Evaluator) indexLessThan17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34505);boolean boolean19 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34506);String str20 = document13.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34507);org.jsoup.nodes.Element element21 = document13.clearAttributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34508);org.jsoup.nodes.Node node22 = document13.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34509);org.jsoup.select.Elements elements24 = document13.getElementsByAttribute("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34510);org.jsoup.select.Elements elements25 = elements24.remove();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34511);int int26 = elements24.size();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34512);boolean boolean28 = elements24.is("[public=<!#root!>]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34513);org.junit.Assert.assertNotNull(document4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34514);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34515);org.junit.Assert.assertNotNull(elements6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34516);org.junit.Assert.assertNull(element7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34517);org.junit.Assert.assertNotNull(document9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34518);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34519);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34520);org.junit.Assert.assertNotNull(document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34521);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34522);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34523);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34524);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34525);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34526);org.junit.Assert.assertNotNull(element21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34527);org.junit.Assert.assertNotNull(node22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34528);org.junit.Assert.assertNotNull(elements24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34529);org.junit.Assert.assertNotNull(elements25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34530);org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34531);org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1004() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lal3fgqn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1004",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34532,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lal3fgqn8() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34532);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34533);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34534)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34535)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34536);System.out.format("%n%s%n", "RegressionTest2.test1004");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34537);org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34538);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34539);boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34540);org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34541);int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34542);org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34543);javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34544);org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34545);javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34546);org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34547);org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34548);boolean boolean12 = parseErrorList1.equals((Object) true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34549);org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34550);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34551);boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34552);parseErrorList14.ensureCapacity(10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34553);boolean boolean18 = parseErrorList1.remove((Object) parseErrorList14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34554);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor19 = parseErrorList14.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34555);org.junit.Assert.assertNotNull(parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34556);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34557);org.junit.Assert.assertNotNull(parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34558);org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34559);org.junit.Assert.assertNotNull(connection7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34560);org.junit.Assert.assertNotNull(connection9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34561);org.junit.Assert.assertNotNull(connection11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34562);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34563);org.junit.Assert.assertNotNull(parseErrorArray13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34564);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34565);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34566);org.junit.Assert.assertNotNull(parseErrorItor19);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1005() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ojl27xqo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1005",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ojl27xqo7() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34567);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34568);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34569)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34570)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34571);System.out.format("%n%s%n", "RegressionTest2.test1005");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34572);org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34573);org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34574);org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34575);org.jsoup.nodes.Attributes attributes9 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34576);org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34577);String str11 = attribute10.getValue();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34578);org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34579);org.jsoup.nodes.Attributes attributes15 = attributes12.put("ultipart", false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34580);org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34581);org.jsoup.nodes.Attribute attribute19 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34582);org.jsoup.nodes.Attributes attributes20 = attributes16.put(attribute19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34583);org.jsoup.nodes.Attribute attribute21 = attribute19.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34584);String str22 = attribute21.html();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34585);org.jsoup.nodes.Attributes attributes23 = attributes15.put(attribute21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34586);org.jsoup.nodes.Attributes attributes24 = attributes15.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34587);org.junit.Assert.assertNotNull(attributes3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34588);org.junit.Assert.assertNotNull(attributes6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34589);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34590);org.junit.Assert.assertNotNull(attributes12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34591);org.junit.Assert.assertNotNull(attributes15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34592);org.junit.Assert.assertNotNull(attribute19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34593);org.junit.Assert.assertNotNull(attributes20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34594);org.junit.Assert.assertNotNull(attribute21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34595);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root=\"\"" + "'", str22, "#root=\"\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34596);org.junit.Assert.assertNotNull(attributes23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34597);org.junit.Assert.assertNotNull(attributes24);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1006() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rsl10eqp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1006",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34598,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rsl10eqp2() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34598);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34599);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34600)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34601)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34602);System.out.format("%n%s%n", "RegressionTest2.test1006");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34603);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34604);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34605);javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34606);org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34607);java.net.Proxy proxy4 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34608);org.jsoup.Connection connection5 = httpConnection0.proxy(proxy4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34609);org.jsoup.Connection connection8 = httpConnection0.cookie("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34610);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34611);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34612);org.junit.Assert.assertNotNull(connection5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34613);org.junit.Assert.assertNotNull(connection8);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1007() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1kzsvqpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1007",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34614,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1kzsvqpi() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34614);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34615);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34616)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34617)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34618);System.out.format("%n%s%n", "RegressionTest2.test1007");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34619);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34620);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34621);org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34622);org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34623);boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34624);org.jsoup.Connection.Request request13 = request4.cookie("#document", "#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34625);org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34626);org.jsoup.Connection.Request request17 = request4.data((org.jsoup.Connection.KeyVal) keyVal16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34627);org.jsoup.parser.Parser parser18 = request4.parser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34628);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34629);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34630);org.junit.Assert.assertNotNull(request7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34631);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34632);org.junit.Assert.assertNotNull(request13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34633);org.junit.Assert.assertNotNull(keyVal16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34634);org.junit.Assert.assertNotNull(request17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34635);org.junit.Assert.assertNotNull(parser18);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1008() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yakylcqq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1008",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yakylcqq4() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34636);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34637);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34638)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34639)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34640);System.out.format("%n%s%n", "RegressionTest2.test1008");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34641);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34642);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34643);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34644);org.jsoup.nodes.Element element6 = document1.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34645);org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.htmlParser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34646);org.jsoup.nodes.Document document8 = document1.parser(parser7);
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34647);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34648);boolean boolean10 = document8.is("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"");
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34649);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body>?  hi!? </body>?</html>=\"#root\"': unexpected token at '<html>? <head></head>? <body>?  hi!? </body>?</html>=\"#root\"'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34650);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34651);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34652);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34653);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34654);org.junit.Assert.assertNotNull(parser7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34655);org.junit.Assert.assertNotNull(document8);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1009() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xhj4lbqqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1009",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xhj4lbqqo() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34656);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34657);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34658)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34659)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34660);System.out.format("%n%s%n", "RegressionTest2.test1009");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34661);org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34662);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34663);boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34664);org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34665);int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34666);java.io.InputStream inputStream7 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34667);org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.htmlParser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34668);org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse(inputStream7, "", "#root", parser10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34669);org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34670);org.jsoup.select.Elements elements14 = document12.getElementsByIndexLessThan(0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34671);int int15 = parseErrorList1.indexOf((Object) elements14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34672);Object[] objArray16 = parseErrorList1.toArray();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34673);org.junit.Assert.assertNotNull(parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34674);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34675);org.junit.Assert.assertNotNull(parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34676);org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34677);org.junit.Assert.assertNotNull(parser10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34678);org.junit.Assert.assertNotNull(document11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34679);org.junit.Assert.assertNotNull(document12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34680);org.junit.Assert.assertNotNull(elements14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34681);org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34682);org.junit.Assert.assertNotNull(objArray16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34683);org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34684);org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1010() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x0nx61qrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1010",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x0nx61qrh() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34685);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34686);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34687)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34688)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34689);System.out.format("%n%s%n", "RegressionTest2.test1010");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34690);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34691);org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34692);java.io.InputStream inputStream6 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34693);org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.htmlParser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34694);org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse(inputStream6, "", "#root", parser9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34695);org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34696);org.jsoup.nodes.Document document12 = document11.normalise();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34697);org.jsoup.nodes.Element element13 = document1.appendTo((org.jsoup.nodes.Element) document12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34698);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34699);org.junit.Assert.assertNotNull(element3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34700);org.junit.Assert.assertNotNull(parser9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34701);org.junit.Assert.assertNotNull(document10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34702);org.junit.Assert.assertNotNull(document11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34703);org.junit.Assert.assertNotNull(document12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34704);org.junit.Assert.assertNotNull(element13);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1011() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1trnydkqs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1011",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1trnydkqs1() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34705);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34706);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34707)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34708)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34709);System.out.format("%n%s%n", "RegressionTest2.test1011");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34710);java.io.InputStream inputStream0 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34711);org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34712);org.jsoup.Connection.Request request4 = httpConnection3.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34713);org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34714);boolean boolean9 = request7.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34715);boolean boolean11 = request7.hasCookie("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34716);org.jsoup.parser.Parser parser12 = request7.parser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34717);org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34718);boolean boolean14 = parser12.isTrackErrors();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34719);org.jsoup.parser.Parser parser16 = parser12.setTrackErrors(10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34720);org.jsoup.parser.ParseErrorList parseErrorList17 = parser16.getErrors();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34721);java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator18 = parseErrorList17.spliterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34722);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34723);org.junit.Assert.assertNotNull(request7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34724);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34725);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34726);org.junit.Assert.assertNotNull(parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34727);org.junit.Assert.assertNotNull(document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34728);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34729);org.junit.Assert.assertNotNull(parser16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34730);org.junit.Assert.assertNotNull(parseErrorList17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34731);org.junit.Assert.assertNotNull(parseErrorSpliterator18);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1012() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qinzl3qss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1012",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34732,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qinzl3qss() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34732);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34733);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34734)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34735)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34736);System.out.format("%n%s%n", "RegressionTest2.test1012");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34737);org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("hi!hi!");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1013() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n9o0smqsy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1013",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34738,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n9o0smqsy() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34738);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34739);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34740)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34741)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34742);System.out.format("%n%s%n", "RegressionTest2.test1013");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34743);org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue(" ");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34744);tokenQueue1.consume("");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34745);String str4 = tokenQueue1.remainder();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34746);org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1014() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k0o205qt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1014",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34747,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k0o205qt7() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34747);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34748);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34749)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34750)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34751);System.out.format("%n%s%n", "RegressionTest2.test1014");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34752);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34753);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34754);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34755);org.jsoup.nodes.Element element6 = document1.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34756);org.jsoup.select.Elements elements7 = document1.siblingElements();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34757);java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements7.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34758);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34759);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34760);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34761);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34762);org.junit.Assert.assertNotNull(elements7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34763);org.junit.Assert.assertNotNull(elementItor8);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1015() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gro37oqto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1015",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gro37oqto() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34764);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34765);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34766)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34767)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34768);System.out.format("%n%s%n", "RegressionTest2.test1015");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34769);boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (short) 100);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34770);org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1016() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dio4f7qtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1016",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dio4f7qtv() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34771);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34772);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34773)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34774)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34775);System.out.format("%n%s%n", "RegressionTest2.test1016");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34776);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34777);org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34778);org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34779);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34780);org.jsoup.nodes.Node node7 = document1.before("SYSTEM");
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34781);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34782);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34783);org.junit.Assert.assertNotNull(element3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34784);org.junit.Assert.assertNotNull(elements5);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1017() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a9o5mqqu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1017",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34785,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a9o5mqqu9() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34785);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34786);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34787)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34788)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34789);System.out.format("%n%s%n", "RegressionTest2.test1017");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34790);org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34791);boolean boolean2 = tag1.formatAsBlock();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34792);org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34793);org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34794);attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34795);org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34796);org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34797);String str11 = document10.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34798);String str12 = document10.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34799);boolean boolean14 = document10.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34800);String str15 = document10.tagName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34801);org.jsoup.nodes.Element element16 = document10.head();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34802);org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34803);org.jsoup.nodes.Element element20 = document10.prependChild((org.jsoup.nodes.Node) document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34804);boolean boolean21 = tag1.equals((Object) document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34805);org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34806);String str24 = document23.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34807);String str26 = document23.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34808);String str27 = document23.normalName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34809);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType30 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34810);org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34811);String str33 = document32.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34812);org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34813);String str36 = document35.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34814);boolean boolean37 = isNthLastOfType30.matches((org.jsoup.nodes.Element) document32, (org.jsoup.nodes.Element) document35);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34815);org.jsoup.nodes.Document document38 = document32.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34816);org.jsoup.nodes.Element element40 = document32.tagName("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34817);String str41 = element40.tagName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34818);org.jsoup.nodes.Node node42 = element40.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34819);org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34820);String str45 = document44.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34821);String str46 = document44.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34822);boolean boolean48 = document44.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34823);String str49 = document44.tagName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34824);String str50 = document44.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34825);org.jsoup.nodes.Element[] elementArray51 = new org.jsoup.nodes.Element[] { document19, document23, element40, document44 };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34826);org.jsoup.select.Elements elements52 = new org.jsoup.select.Elements(elementArray51);
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34827);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34828);org.jsoup.nodes.Element element54 = elements52.get((int) 'm');
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34829);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 109 out of bounds for length 4");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34830);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34831);org.junit.Assert.assertNotNull(attributes5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34832);org.junit.Assert.assertNotNull(document10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34833);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34834);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34835);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34836);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34837);org.junit.Assert.assertNotNull(element16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34838);org.junit.Assert.assertNotNull(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34839);org.junit.Assert.assertNotNull(element20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34840);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34841);org.junit.Assert.assertNotNull(document23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34842);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34843);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34844);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34845);org.junit.Assert.assertNotNull(document32);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34846);org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34847);org.junit.Assert.assertNotNull(document35);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34848);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34849);org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34850);org.junit.Assert.assertNotNull(document38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34851);org.junit.Assert.assertNotNull(element40);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34852);org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34853);org.junit.Assert.assertNotNull(node42);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34854);org.junit.Assert.assertNotNull(document44);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34855);org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34856);org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str46, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34857);org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34858);org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#root" + "'", str49, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34859);org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34860);org.junit.Assert.assertNotNull(elementArray51);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1018() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_170o6u9qwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1018",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_170o6u9qwd() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34861);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34862);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34863)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34864)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34865);System.out.format("%n%s%n", "RegressionTest2.test1018");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34866);org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("                                   ", ":matchesOwn(null)");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34867);String str3 = keyVal2.contentType();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34868);org.junit.Assert.assertNotNull(keyVal2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34869);org.junit.Assert.assertNull(str3);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1019() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13ro81sqwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1019",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13ro81sqwm() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34870);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34871);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34872)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34873)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34874);System.out.format("%n%s%n", "RegressionTest2.test1019");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34875);org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("/form-data", "Content-Type");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34876);boolean boolean4 = document2.is("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34877);org.junit.Assert.assertNotNull(document2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34878);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1020() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13at0miqwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1020",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13at0miqwv() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34879);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34880);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34881)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34882)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34883);System.out.format("%n%s%n", "RegressionTest2.test1020");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34884);org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34885);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34886);org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34887);String str7 = document6.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34888);org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34889);org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34890);org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34891);String str12 = document11.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34892);String str13 = document11.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34893);org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34894);String str16 = document15.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34895);String str17 = document15.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34896);org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34897);boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34898);boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34899);String str22 = document15.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34900);org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34901);String str25 = document24.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34902);String str26 = document24.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34903);boolean boolean28 = document24.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34904);boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34905);org.jsoup.nodes.Document.QuirksMode quirksMode30 = org.jsoup.nodes.Document.QuirksMode.quirks;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34906);org.jsoup.nodes.Document document31 = document24.quirksMode(quirksMode30);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34907);org.jsoup.nodes.Node node32 = document31.nextSibling();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34908);org.junit.Assert.assertNotNull(document6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34909);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34910);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34911);org.junit.Assert.assertNull(element9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34912);org.junit.Assert.assertNotNull(document11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34913);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34914);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34915);org.junit.Assert.assertNotNull(document15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34916);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34917);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34918);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34919);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34920);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34921);org.junit.Assert.assertNotNull(document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34922);org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34923);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34924);org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34925);org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34926);org.junit.Assert.assertTrue("'" + quirksMode30 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode30.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34927);org.junit.Assert.assertNotNull(document31);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34928);org.junit.Assert.assertNull(node32);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1021() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11t1u1qy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1021",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11t1u1qy9() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34929);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34930);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34931)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34932)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34933);System.out.format("%n%s%n", "RegressionTest2.test1021");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34934);org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34935);tokenQueue1.addFirst((Character) 'a');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34936);boolean boolean4 = tokenQueue1.matchesWhitespace();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34937);char char5 = tokenQueue1.peek();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34938);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34939);org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1022() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),34940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1376wygqyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1022",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1376wygqyk() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34940);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34941);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34942)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(34943)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34944);System.out.format("%n%s%n", "RegressionTest2.test1022");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(34945);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34946);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34947);org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34948);java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34949);boolean boolean6 = elements3.equals((Object) 1.0d);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34950);String str7 = elements3.text();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34951);org.jsoup.nodes.Element element9 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34952);org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34953);java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34954);boolean boolean13 = parseErrorList11.isEmpty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34955);int int14 = parseErrorList11.size();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34956);org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34957);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList15.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34958);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList15.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34959);org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34960);String str20 = document19.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34961);org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34962);java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34963);java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34964);org.jsoup.select.Elements elements24 = elements21.empty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34965);org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34966);String str27 = document26.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34967);org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34968);org.jsoup.select.Elements elements30 = elements28.prev("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34969);boolean boolean31 = elements28.hasText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34970);org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34971);String str34 = document33.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34972);org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34973);java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34974);java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34975);org.jsoup.select.Elements elements38 = elements35.empty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34976);org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34977);String str41 = document40.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34978);org.jsoup.select.Elements elements42 = document40.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34979);java.util.ListIterator<org.jsoup.nodes.Element> elementItor43 = elements42.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34980);boolean boolean45 = elements42.equals((Object) 1.0d);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34981);String str46 = elements42.text();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34982);org.jsoup.select.Elements elements48 = elements42.wrap("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34983);org.jsoup.select.Elements[] elementsArray49 = new org.jsoup.select.Elements[] { elements21, elements28, elements35, elements48 };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34984);org.jsoup.select.Elements[] elementsArray50 = parseErrorList15.toArray(elementsArray49);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34985);boolean boolean51 = parseErrorList11.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34986);boolean boolean52 = elements3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34987);org.jsoup.parser.ParseError[] parseErrorArray53 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34988);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList54 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34989);boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList54, parseErrorArray53);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34990);org.jsoup.parser.ParseErrorList parseErrorList56 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34991);int int57 = parseErrorList54.indexOf((Object) parseErrorList56);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34992);org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34993);javax.net.ssl.SSLSocketFactory sSLSocketFactory59 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34994);org.jsoup.Connection connection60 = httpConnection58.sslSocketFactory(sSLSocketFactory59);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34995);javax.net.ssl.SSLSocketFactory sSLSocketFactory61 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34996);org.jsoup.Connection connection62 = httpConnection58.sslSocketFactory(sSLSocketFactory61);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34997);org.jsoup.Connection connection64 = httpConnection58.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34998);boolean boolean65 = parseErrorList54.equals((Object) true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(34999);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream66 = parseErrorList54.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35000);boolean boolean67 = parseErrorList15.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList54);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35001);int int68 = parseErrorList54.size();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35002);int int69 = parseErrorList54.size();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35003);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35004);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35005);org.junit.Assert.assertNotNull(elements3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35006);org.junit.Assert.assertNotNull(elementItor4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35007);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35008);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35009);org.junit.Assert.assertNotNull(parseErrorList11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35010);org.junit.Assert.assertNotNull(nodeList12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35011);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35012);org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35013);org.junit.Assert.assertNotNull(parseErrorList15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35014);org.junit.Assert.assertNotNull(parseErrorItor16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35015);org.junit.Assert.assertNotNull(parseErrorStream17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35016);org.junit.Assert.assertNotNull(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35017);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35018);org.junit.Assert.assertNotNull(elements21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35019);org.junit.Assert.assertNotNull(elementItor22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35020);org.junit.Assert.assertNotNull(elementItor23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35021);org.junit.Assert.assertNotNull(elements24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35022);org.junit.Assert.assertNotNull(document26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35023);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35024);org.junit.Assert.assertNotNull(elements28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35025);org.junit.Assert.assertNotNull(elements30);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35026);org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35027);org.junit.Assert.assertNotNull(document33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35028);org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35029);org.junit.Assert.assertNotNull(elements35);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35030);org.junit.Assert.assertNotNull(elementItor36);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35031);org.junit.Assert.assertNotNull(elementItor37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35032);org.junit.Assert.assertNotNull(elements38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35033);org.junit.Assert.assertNotNull(document40);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35034);org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35035);org.junit.Assert.assertNotNull(elements42);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35036);org.junit.Assert.assertNotNull(elementItor43);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35037);org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35038);org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35039);org.junit.Assert.assertNotNull(elements48);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35040);org.junit.Assert.assertNotNull(elementsArray49);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35041);org.junit.Assert.assertNotNull(elementsArray50);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35042);org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35043);org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35044);org.junit.Assert.assertNotNull(parseErrorArray53);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35045);org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35046);org.junit.Assert.assertNotNull(parseErrorList56);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35047);org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35048);org.junit.Assert.assertNotNull(connection60);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35049);org.junit.Assert.assertNotNull(connection62);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35050);org.junit.Assert.assertNotNull(connection64);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35051);org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35052);org.junit.Assert.assertNotNull(parseErrorStream66);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35053);org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35054);org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35055);org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1023() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16g6vqxr1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1023",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16g6vqxr1s() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35056);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35057);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35058)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35059)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35060);System.out.format("%n%s%n", "RegressionTest2.test1023");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35061);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35062);org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35063);String str5 = document4.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35064);org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35065);org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35066);org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35067);String str10 = document9.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35068);String str11 = document9.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35069);org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35070);String str14 = document13.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35071);String str15 = document13.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35072);org.jsoup.select.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35073);boolean boolean18 = document13.is((org.jsoup.select.Evaluator) indexLessThan17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35074);boolean boolean19 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35075);String str20 = document13.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35076);org.jsoup.nodes.Element element21 = document13.clearAttributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35077);org.jsoup.nodes.Node node22 = document13.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35078);org.jsoup.select.Elements elements24 = document13.getElementsByAttribute("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35079);org.jsoup.select.Elements elements25 = elements24.remove();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35080);int int26 = elements24.size();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35081);org.jsoup.select.Elements elements28 = elements24.prevAll("multipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35082);org.junit.Assert.assertNotNull(document4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35083);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35084);org.junit.Assert.assertNotNull(elements6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35085);org.junit.Assert.assertNull(element7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35086);org.junit.Assert.assertNotNull(document9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35087);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35088);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35089);org.junit.Assert.assertNotNull(document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35090);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35091);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35092);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35093);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35094);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35095);org.junit.Assert.assertNotNull(element21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35096);org.junit.Assert.assertNotNull(node22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35097);org.junit.Assert.assertNotNull(elements24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35098);org.junit.Assert.assertNotNull(elements25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35099);org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35100);org.junit.Assert.assertNotNull(elements28);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1024() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19p6ujer31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1024",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19p6ujer31() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35101);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35102);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35103)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35104)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35105);System.out.format("%n%s%n", "RegressionTest2.test1024");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35106);org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35107);boolean boolean4 = xmlDeclaration3.hasParent();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35108);String str5 = xmlDeclaration3.nodeName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35109);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35110);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1025() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cy6tbvr3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1025",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cy6tbvr3b() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35111);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35112);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35113)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35114)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35115);System.out.format("%n%s%n", "RegressionTest2.test1025");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35116);org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("#declaration");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35117);String str2 = tagEndsWith1.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35118);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#declaration" + "'", str2, "#declaration");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1026() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g76s4cr3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1026",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g76s4cr3j() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35119);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35120);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35121)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35122)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35123);System.out.format("%n%s%n", "RegressionTest2.test1026");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35124);org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35125);String str2 = tag1.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35126);org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35127);org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35128);org.jsoup.nodes.Attributes attributes8 = attributes4.put(attribute7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35129);org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35130);String str11 = document10.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35131);org.jsoup.select.Elements elements12 = document10.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35132);java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35133);java.util.ListIterator<org.jsoup.nodes.Element> elementItor14 = elements12.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35134);org.jsoup.select.Elements elements15 = elements12.empty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35135);boolean boolean16 = attributes8.equals((Object) elements12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35136);org.jsoup.nodes.Attributes attributes19 = attributes8.add("#root=\"\"", " hi!=\"multipart/form-data\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35137);java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes8.iterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35138);org.jsoup.nodes.PseudoTextElement pseudoTextElement21 = new org.jsoup.nodes.PseudoTextElement(tag1, ":matchesOwn(null)", attributes8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35139);org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35140);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor23 = parseErrorList22.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35141);java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList22.iterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35142);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream25 = parseErrorList22.stream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35143);boolean boolean26 = tag1.equals((Object) parseErrorStream25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35144);org.junit.Assert.assertNotNull(tag1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35145);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35146);org.junit.Assert.assertNotNull(attribute7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35147);org.junit.Assert.assertNotNull(attributes8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35148);org.junit.Assert.assertNotNull(document10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35149);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35150);org.junit.Assert.assertNotNull(elements12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35151);org.junit.Assert.assertNotNull(elementItor13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35152);org.junit.Assert.assertNotNull(elementItor14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35153);org.junit.Assert.assertNotNull(elements15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35154);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35155);org.junit.Assert.assertNotNull(attributes19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35156);org.junit.Assert.assertNotNull(attributeItor20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35157);org.junit.Assert.assertNotNull(parseErrorList22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35158);org.junit.Assert.assertNotNull(parseErrorItor23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35159);org.junit.Assert.assertNotNull(parseErrorItor24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35160);org.junit.Assert.assertNotNull(parseErrorStream25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35161);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1027() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jg6qwtr4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1027",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35162,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jg6qwtr4q() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35162);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35163);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35164)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35165)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35166);System.out.format("%n%s%n", "RegressionTest2.test1027");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35167);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35168);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35169);org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35170);boolean boolean6 = request4.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35171);boolean boolean8 = request4.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35172);org.jsoup.Connection.Method method9 = request4.method();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35173);org.jsoup.Connection.Method method10 = request4.method();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35174);org.jsoup.Connection.Request request13 = request4.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35175);org.jsoup.Connection.Request request16 = request4.header(" ", "<!#root!>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35176);int int17 = request16.timeout();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35177);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35178);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35179);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35180);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35181);org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35182);org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35183);org.junit.Assert.assertNotNull(request13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35184);org.junit.Assert.assertNotNull(request16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35185);org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30000 + "'", int17 == 30000);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1028() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mp6ppar5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1028",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mp6ppar5e() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35186);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35187);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35188)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35189)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35190);System.out.format("%n%s%n", "RegressionTest2.test1028");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35191);org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35192);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35193);org.jsoup.nodes.TextNode textNode4 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35194);org.jsoup.nodes.Node node6 = textNode4.removeAttr("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35195);org.jsoup.nodes.Node node8 = textNode4.removeAttr("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35196);int int9 = parseErrorList0.lastIndexOf((Object) node8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35197);org.jsoup.parser.ParseError[] parseErrorArray10 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35198);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList11 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35199);boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11, parseErrorArray10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35200);org.jsoup.parser.ParseErrorList parseErrorList13 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35201);int int14 = parseErrorList11.indexOf((Object) parseErrorList13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35202);org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35203);javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35204);org.jsoup.Connection connection17 = httpConnection15.sslSocketFactory(sSLSocketFactory16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35205);javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35206);org.jsoup.Connection connection19 = httpConnection15.sslSocketFactory(sSLSocketFactory18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35207);org.jsoup.Connection connection21 = httpConnection15.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35208);boolean boolean22 = parseErrorList11.equals((Object) true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35209);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream23 = parseErrorList11.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35210);boolean boolean24 = parseErrorList0.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35211);java.util.Collection<org.jsoup.parser.ParseError> parseErrorCollection25 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35212);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35213);boolean boolean26 = parseErrorList11.containsAll(parseErrorCollection25);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35214);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35215);org.junit.Assert.assertNotNull(parseErrorList0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35216);org.junit.Assert.assertNotNull(parseErrorItor1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35217);org.junit.Assert.assertNotNull(textNode4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35218);org.junit.Assert.assertNotNull(node6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35219);org.junit.Assert.assertNotNull(node8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35220);org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35221);org.junit.Assert.assertNotNull(parseErrorArray10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35222);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35223);org.junit.Assert.assertNotNull(parseErrorList13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35224);org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35225);org.junit.Assert.assertNotNull(connection17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35226);org.junit.Assert.assertNotNull(connection19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35227);org.junit.Assert.assertNotNull(connection21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35228);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35229);org.junit.Assert.assertNotNull(parseErrorStream23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35230);org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1029() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1py6ohrr6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1029",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1py6ohrr6n() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35231);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35232);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35233)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35234)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35235);System.out.format("%n%s%n", "RegressionTest2.test1029");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35236);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35237);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35238);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35239);org.jsoup.nodes.Element element6 = document1.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35240);org.jsoup.select.Elements elements8 = document1.getElementsContainingOwnText("[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35241);org.jsoup.select.Elements elements10 = elements8.prev("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35242);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35243);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35244);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35245);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35246);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35247);org.junit.Assert.assertNotNull(elements10);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1030() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qf1vx1r74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1030",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35248,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qf1vx1r74() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35248);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35249);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35250)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35251)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35252);System.out.format("%n%s%n", "RegressionTest2.test1030");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35253);org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35254);String str3 = document2.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35255);String str4 = document2.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35256);org.jsoup.nodes.Element element7 = document2.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35257);org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35258);org.jsoup.select.Elements elements10 = elements8.toggleClass("PUBLIC");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35259);org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35260);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35261);org.jsoup.nodes.Element element13 = elements10.set((int) (byte) 1, element12);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35262);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35263);org.junit.Assert.assertNotNull(document2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35264);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35265);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35266);org.junit.Assert.assertNotNull(element7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35267);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35268);org.junit.Assert.assertNotNull(elements10);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1031() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1to1upir7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1031",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35269,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1to1upir7p() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35269);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35270);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35271)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35272)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35273);System.out.format("%n%s%n", "RegressionTest2.test1031");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35274);java.io.InputStream inputStream2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35275);org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35276);java.io.InputStream inputStream4 = keyVal3.inputStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35277);String str5 = keyVal3.key();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35278);String str6 = keyVal3.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35279);org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Type");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35280);String str9 = keyVal3.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35281);org.junit.Assert.assertNotNull(keyVal3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35282);org.junit.Assert.assertNull(inputStream4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35283);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35284);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=#declaration" + "'", str6, "Content-Encoding=#declaration");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35285);org.junit.Assert.assertNotNull(keyVal8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35286);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Type=#declaration" + "'", str9, "Content-Type=#declaration");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1032() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wx1thzr87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1032",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wx1thzr87() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35287);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35288);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35289)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35290)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35291);System.out.format("%n%s%n", "RegressionTest2.test1032");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35292);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35293);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35294);org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35295);java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35296);boolean boolean6 = elements3.equals((Object) 1.0d);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35297);String str7 = elements3.text();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35298);org.jsoup.nodes.Element element9 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35299);org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35300);java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35301);boolean boolean13 = parseErrorList11.isEmpty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35302);int int14 = parseErrorList11.size();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35303);org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35304);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList15.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35305);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList15.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35306);org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35307);String str20 = document19.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35308);org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35309);java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35310);java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35311);org.jsoup.select.Elements elements24 = elements21.empty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35312);org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35313);String str27 = document26.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35314);org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35315);org.jsoup.select.Elements elements30 = elements28.prev("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35316);boolean boolean31 = elements28.hasText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35317);org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35318);String str34 = document33.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35319);org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35320);java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35321);java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35322);org.jsoup.select.Elements elements38 = elements35.empty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35323);org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35324);String str41 = document40.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35325);org.jsoup.select.Elements elements42 = document40.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35326);java.util.ListIterator<org.jsoup.nodes.Element> elementItor43 = elements42.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35327);boolean boolean45 = elements42.equals((Object) 1.0d);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35328);String str46 = elements42.text();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35329);org.jsoup.select.Elements elements48 = elements42.wrap("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35330);org.jsoup.select.Elements[] elementsArray49 = new org.jsoup.select.Elements[] { elements21, elements28, elements35, elements48 };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35331);org.jsoup.select.Elements[] elementsArray50 = parseErrorList15.toArray(elementsArray49);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35332);boolean boolean51 = parseErrorList11.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35333);boolean boolean52 = elements3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35334);org.jsoup.parser.ParseError[] parseErrorArray53 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35335);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList54 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35336);boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList54, parseErrorArray53);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35337);org.jsoup.parser.ParseErrorList parseErrorList56 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35338);int int57 = parseErrorList54.indexOf((Object) parseErrorList56);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35339);org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35340);javax.net.ssl.SSLSocketFactory sSLSocketFactory59 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35341);org.jsoup.Connection connection60 = httpConnection58.sslSocketFactory(sSLSocketFactory59);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35342);javax.net.ssl.SSLSocketFactory sSLSocketFactory61 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35343);org.jsoup.Connection connection62 = httpConnection58.sslSocketFactory(sSLSocketFactory61);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35344);org.jsoup.Connection connection64 = httpConnection58.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35345);boolean boolean65 = parseErrorList54.equals((Object) true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35346);org.jsoup.parser.ParseError[] parseErrorArray66 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35347);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList67 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35348);boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList67, parseErrorArray66);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35349);parseErrorList67.ensureCapacity(10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35350);boolean boolean71 = parseErrorList54.remove((Object) parseErrorList67);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35351);boolean boolean72 = elements3.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList67);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35352);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor74 = parseErrorList67.listIterator(0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35353);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35354);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35355);org.junit.Assert.assertNotNull(elements3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35356);org.junit.Assert.assertNotNull(elementItor4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35357);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35358);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35359);org.junit.Assert.assertNotNull(parseErrorList11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35360);org.junit.Assert.assertNotNull(nodeList12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35361);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35362);org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35363);org.junit.Assert.assertNotNull(parseErrorList15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35364);org.junit.Assert.assertNotNull(parseErrorItor16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35365);org.junit.Assert.assertNotNull(parseErrorStream17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35366);org.junit.Assert.assertNotNull(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35367);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35368);org.junit.Assert.assertNotNull(elements21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35369);org.junit.Assert.assertNotNull(elementItor22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35370);org.junit.Assert.assertNotNull(elementItor23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35371);org.junit.Assert.assertNotNull(elements24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35372);org.junit.Assert.assertNotNull(document26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35373);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35374);org.junit.Assert.assertNotNull(elements28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35375);org.junit.Assert.assertNotNull(elements30);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35376);org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35377);org.junit.Assert.assertNotNull(document33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35378);org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35379);org.junit.Assert.assertNotNull(elements35);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35380);org.junit.Assert.assertNotNull(elementItor36);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35381);org.junit.Assert.assertNotNull(elementItor37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35382);org.junit.Assert.assertNotNull(elements38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35383);org.junit.Assert.assertNotNull(document40);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35384);org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35385);org.junit.Assert.assertNotNull(elements42);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35386);org.junit.Assert.assertNotNull(elementItor43);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35387);org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35388);org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35389);org.junit.Assert.assertNotNull(elements48);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35390);org.junit.Assert.assertNotNull(elementsArray49);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35391);org.junit.Assert.assertNotNull(elementsArray50);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35392);org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35393);org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35394);org.junit.Assert.assertNotNull(parseErrorArray53);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35395);org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35396);org.junit.Assert.assertNotNull(parseErrorList56);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35397);org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35398);org.junit.Assert.assertNotNull(connection60);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35399);org.junit.Assert.assertNotNull(connection62);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35400);org.junit.Assert.assertNotNull(connection64);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35401);org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35402);org.junit.Assert.assertNotNull(parseErrorArray66);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35403);org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35404);org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35405);org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35406);org.junit.Assert.assertNotNull(parseErrorItor74);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1033() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yv29oorbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1033",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35407,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yv29oorbj() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35407);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35408);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35409)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35410)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35411);System.out.format("%n%s%n", "RegressionTest2.test1033");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35412);java.io.InputStream inputStream2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35413);org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("#document", "#root=\"\"", inputStream2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35414);org.jsoup.Connection.KeyVal keyVal5 = keyVal3.value("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35415);String str6 = keyVal3.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35416);org.junit.Assert.assertNotNull(keyVal3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35417);org.junit.Assert.assertNotNull(keyVal5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35418);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]" + "'", str6, "#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1034() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vm2aw7rbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1034",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35419,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vm2aw7rbv() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35419);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35420);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35421)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35422)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35423);System.out.format("%n%s%n", "RegressionTest2.test1034");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35424);org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]", "                                                                                                    ");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1035() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sd2c3qrc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1035",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sd2c3qrc1() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35425);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35426);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35427)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35428)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35429);System.out.format("%n%s%n", "RegressionTest2.test1035");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35430);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35431);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35432);org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35433);java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35434);boolean boolean6 = elements3.equals((Object) 1.0d);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35435);String str7 = elements3.text();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35436);org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35437);java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35438);java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elements3.spliterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35439);java.util.List<String> strList12 = elements3.eachText();
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35440);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35441);java.util.List<org.jsoup.nodes.Element> elementList15 = elements3.subList((int) '#', (int) (short) 1);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35442);org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35443);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35444);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35445);org.junit.Assert.assertNotNull(elements3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35446);org.junit.Assert.assertNotNull(elementItor4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35447);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35448);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35449);org.junit.Assert.assertNotNull(elements9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35450);org.junit.Assert.assertNotNull(elementItor10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35451);org.junit.Assert.assertNotNull(elementSpliterator11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35452);org.junit.Assert.assertNotNull(strList12);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1036() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p42db9rct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1036",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p42db9rct() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35453);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35454);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35455)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35456)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35457);System.out.format("%n%s%n", "RegressionTest2.test1036");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35458);org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35459);String[] strArray6 = new String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35460);String str7 = tokenQueue1.consumeToAny(strArray6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35461);char char8 = tokenQueue1.peek();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35462);org.jsoup.parser.TokenQueue tokenQueue10 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35463);boolean boolean12 = tokenQueue10.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35464);char char13 = tokenQueue10.consume();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35465);org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35466);boolean boolean17 = tokenQueue15.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35467);char char18 = tokenQueue15.consume();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35468);char[] charArray19 = new char[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35469);boolean boolean20 = tokenQueue15.matchesAny(charArray19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35470);boolean boolean21 = tokenQueue10.matchesAny(charArray19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35471);boolean boolean22 = tokenQueue1.matchesAny(charArray19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35472);org.junit.Assert.assertNotNull(strArray6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35473);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35474);org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'm' + "'", char8 == 'm');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35475);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35476);org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'm' + "'", char13 == 'm');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35477);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35478);org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'm' + "'", char18 == 'm');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35479);org.junit.Assert.assertNotNull(charArray19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35480);org.junit.Assert.assertEquals(String.copyValueOf(charArray19), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35481);org.junit.Assert.assertEquals(String.valueOf(charArray19), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35482);org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35483);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35484);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35485);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1037() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lv2eisrdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1037",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35486,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lv2eisrdq() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35486);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35487);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35488)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35489)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35490);System.out.format("%n%s%n", "RegressionTest2.test1037");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35491);org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35492);org.jsoup.parser.TokenQueue tokenQueue3 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35493);tokenQueue3.addFirst((Character) 'a');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35494);boolean boolean6 = tokenQueue3.matchesWhitespace();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35495);org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35496);boolean boolean10 = tokenQueue8.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35497);char char11 = tokenQueue8.consume();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35498);org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35499);boolean boolean15 = tokenQueue13.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35500);char char16 = tokenQueue13.consume();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35501);char[] charArray17 = new char[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35502);boolean boolean18 = tokenQueue13.matchesAny(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35503);boolean boolean19 = tokenQueue8.matchesAny(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35504);boolean boolean20 = tokenQueue3.matchesAny(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35505);String str21 = characterReader1.consumeToAny(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35506);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35507);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35508);org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'm' + "'", char11 == 'm');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35509);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35510);org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'm' + "'", char16 == 'm');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35511);org.junit.Assert.assertNotNull(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35512);org.junit.Assert.assertEquals(String.copyValueOf(charArray17), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35513);org.junit.Assert.assertEquals(String.valueOf(charArray17), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35514);org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35515);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35516);org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35517);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35518);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str21, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1038() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1im2fqbren();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1038",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35519,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1im2fqbren() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35519);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35520);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35521)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35522)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35523);System.out.format("%n%s%n", "RegressionTest2.test1038");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35524);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35525);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35526);org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35527);org.jsoup.select.Elements elements5 = elements3.prev("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35528);org.jsoup.select.Elements elements7 = elements5.prev("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35529);org.jsoup.select.Elements elements9 = elements7.tagName("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35530);org.jsoup.select.Elements elements11 = elements7.addClass("");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35531);String str12 = elements7.val();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35532);java.util.List<org.jsoup.nodes.FormElement> formElementList13 = elements7.forms();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35533);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35534);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35535);org.junit.Assert.assertNotNull(elements3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35536);org.junit.Assert.assertNotNull(elements5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35537);org.junit.Assert.assertNotNull(elements7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35538);org.junit.Assert.assertNotNull(elements9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35539);org.junit.Assert.assertNotNull(elements11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35540);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35541);org.junit.Assert.assertNotNull(formElementList13);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1039() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fd2gxurfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1039",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fd2gxurfa() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35542);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35543);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35544)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35545)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35546);System.out.format("%n%s%n", "RegressionTest2.test1039");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35547);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35548);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35549);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35550);org.jsoup.nodes.Element element6 = document1.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35551);String str7 = document1.title();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35552);org.jsoup.nodes.Element element9 = document1.val("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35553);org.jsoup.nodes.Element element11 = document1.appendElement("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35554);org.jsoup.nodes.Element element13 = element11.after(":containsData( )");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35555);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35556);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35557);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35558);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35559);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35560);org.junit.Assert.assertNotNull(element9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35561);org.junit.Assert.assertNotNull(element11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35562);org.junit.Assert.assertNotNull(element13);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1040() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ew79ikrfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1040",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ew79ikrfv() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35563);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35564);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35565)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35566)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35567);System.out.format("%n%s%n", "RegressionTest2.test1040");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35568);org.jsoup.nodes.Document.QuirksMode quirksMode0 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35569);org.junit.Assert.assertTrue("'" + quirksMode0 + "' != '" + org.jsoup.nodes.Document.QuirksMode.limitedQuirks + "'", quirksMode0.equals(org.jsoup.nodes.Document.QuirksMode.limitedQuirks));
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1041() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bn7aq3rg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1041",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bn7aq3rg2() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35570);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35571);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35572)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35573)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35574);System.out.format("%n%s%n", "RegressionTest2.test1041");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35575);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35576);javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35577);org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35578);javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35579);org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35580);org.jsoup.Connection.Request request5 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35581);org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35582);org.jsoup.Connection.Request request7 = httpConnection6.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35583);org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35584);org.jsoup.Connection.Method method11 = request7.method();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35585);org.jsoup.Connection connection12 = httpConnection0.method(method11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35586);boolean boolean13 = method11.hasBody();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35587);org.junit.Assert.assertNotNull(connection2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35588);org.junit.Assert.assertNotNull(connection4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35589);org.junit.Assert.assertNotNull(request5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35590);org.junit.Assert.assertNotNull(request7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35591);org.junit.Assert.assertNotNull(request10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35592);org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35593);org.junit.Assert.assertNotNull(connection12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35594);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1042() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18e7bxmrgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1042",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18e7bxmrgr() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35595);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35596);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35597)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35598)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35599);System.out.format("%n%s%n", "RegressionTest2.test1042");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35600);org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("multipart", 100, "application/x-www-form-urlencoded");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35601);String str4 = httpStatusException3.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35602);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: multipart. Status=100, URL=application/x-www-form-urlencoded" + "'", str4, "org.jsoup.HttpStatusException: multipart. Status=100, URL=application/x-www-form-urlencoded");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1043() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1557d55rgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1043",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1557d55rgz() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35603);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35604);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35605)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35606)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35607);System.out.format("%n%s%n", "RegressionTest2.test1043");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35608);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35609);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35610);org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35611);org.jsoup.Connection connection6 = httpConnection0.header("#data", ":only-child");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35612);org.jsoup.Connection.Response response7 = connection6.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35613);org.jsoup.Connection.Response response9 = response7.charset("<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35614);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35615);java.io.BufferedInputStream bufferedInputStream10 = response7.bodyStream();
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35616);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35617);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35618);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35619);org.junit.Assert.assertNotNull(connection6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35620);org.junit.Assert.assertNotNull(response7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35621);org.junit.Assert.assertNotNull(response9);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1044() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11w7ecorhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1044",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11w7ecorhi() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35622);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35623);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35624)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35625)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35626);System.out.format("%n%s%n", "RegressionTest2.test1044");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35627);org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35628);org.jsoup.select.Elements elements4 = elements1.attr(":eq(-1)", "[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35629);org.jsoup.select.Elements elements6 = elements1.tagName("Content-Encoding=\"#root\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35630);org.jsoup.select.Elements elements7 = elements1.parents();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35631);org.junit.Assert.assertNotNull(elements4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35632);org.junit.Assert.assertNotNull(elements6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35633);org.junit.Assert.assertNotNull(elements7);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1045() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11cskftrhu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1045",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11cskftrhu() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35634);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35635);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35636)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35637)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35638);System.out.format("%n%s%n", "RegressionTest2.test1045");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35639);org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35640);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35641);boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35642);org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35643);int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35644);org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35645);javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35646);org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35647);javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35648);org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35649);org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35650);boolean boolean12 = parseErrorList1.equals((Object) true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35651);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList1.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35652);org.jsoup.helper.Validate.notNull((Object) parseErrorStream13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35653);org.junit.Assert.assertNotNull(parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35654);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35655);org.junit.Assert.assertNotNull(parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35656);org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35657);org.junit.Assert.assertNotNull(connection7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35658);org.junit.Assert.assertNotNull(connection9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35659);org.junit.Assert.assertNotNull(connection11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35660);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35661);org.junit.Assert.assertNotNull(parseErrorStream13);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1046() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14lsj8arim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1046",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14lsj8arim() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35662);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35663);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35664)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35665)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35666);System.out.format("%n%s%n", "RegressionTest2.test1046");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35667);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35668);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35669);org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35670);org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35671);boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35672);org.jsoup.Connection.Request request13 = request4.cookie("#document", "#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35673);org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35674);org.jsoup.Connection.Request request17 = request4.data((org.jsoup.Connection.KeyVal) keyVal16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35675);java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection18 = request4.data();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35676);org.jsoup.Connection.Request request20 = request4.removeHeader(":lt(52)");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35677);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35678);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35679);org.junit.Assert.assertNotNull(request7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35680);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35681);org.junit.Assert.assertNotNull(request13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35682);org.junit.Assert.assertNotNull(keyVal16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35683);org.junit.Assert.assertNotNull(request17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35684);org.junit.Assert.assertNotNull(keyValCollection18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35685);org.junit.Assert.assertNotNull(request20);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1047() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17usi0rrja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1047",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17usi0rrja() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35686);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35687);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35688)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35689)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35690);System.out.format("%n%s%n", "RegressionTest2.test1047");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35691);org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35692);boolean boolean4 = xmlDeclaration3.hasParent();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35693);String str5 = xmlDeclaration3.name();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35694);java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35695);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35696);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35697);org.junit.Assert.assertNotNull(nodeList6);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1048() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b3sgt8rjm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1048",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b3sgt8rjm() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35698);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35699);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35700)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35701)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35702);System.out.format("%n%s%n", "RegressionTest2.test1048");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35703);org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("PUBLIC", "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35704);org.junit.Assert.assertNotNull(document2);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1049() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecsflprjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1049",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35705,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecsflprjt() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35705);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35706);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35707)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35708)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35709);System.out.format("%n%s%n", "RegressionTest2.test1049");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35710);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35711);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35712);org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35713);java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35714);java.util.Map<String, String> strMap6 = request4.headers();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35715);java.util.Map<String, String> strMap7 = request4.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35716);javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35717);request4.sslSocketFactory(sSLSocketFactory8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35718);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35719);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35720);org.junit.Assert.assertNotNull(strMap5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35721);org.junit.Assert.assertNotNull(strMap6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35722);org.junit.Assert.assertNotNull(strMap7);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1050() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1etnn0zrkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1050",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35723,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1etnn0zrkb() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35723);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35724);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35725)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35726)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35727);System.out.format("%n%s%n", "RegressionTest2.test1050");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35728);org.jsoup.safety.Whitelist whitelist4 = org.jsoup.safety.Whitelist.basicWithImages();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35729);boolean boolean5 = org.jsoup.Jsoup.isValid("hi!", whitelist4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35730);org.jsoup.safety.Whitelist whitelist8 = whitelist4.removeEnforcedAttribute("Content-Encoding", "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35731);String str9 = org.jsoup.Jsoup.clean("", whitelist8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35732);org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35733);String[] strArray17 = new String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35734);String str18 = tokenQueue12.consumeToAny(strArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35735);org.jsoup.safety.Whitelist whitelist19 = whitelist8.removeAttributes("multipart", strArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35736);org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35737);boolean boolean21 = outputSettings20.outline();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35738);org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.outline(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35739);org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35740);String str26 = document25.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35741);org.jsoup.select.Elements elements27 = document25.parents();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35742);java.nio.charset.Charset charset28 = document25.charset();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35743);org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.charset(charset28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35744);String str30 = org.jsoup.Jsoup.clean("", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist8, outputSettings29);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35745);org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35746);org.junit.Assert.assertNotNull(whitelist4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35747);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35748);org.junit.Assert.assertNotNull(whitelist8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35749);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35750);org.junit.Assert.assertNotNull(strArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35751);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35752);org.junit.Assert.assertNotNull(whitelist19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35753);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35754);org.junit.Assert.assertNotNull(outputSettings23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35755);org.junit.Assert.assertNotNull(document25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35756);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35757);org.junit.Assert.assertNotNull(elements27);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35758);org.junit.Assert.assertNotNull(charset28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35759);org.junit.Assert.assertNotNull(outputSettings29);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35760);org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35761);org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1051() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i2nltgrle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1051",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i2nltgrle() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35762);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35763);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35764)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35765)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35766);System.out.format("%n%s%n", "RegressionTest2.test1051");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35767);org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35768);String str3 = document2.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35769);String str4 = document2.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35770);org.jsoup.nodes.Element element7 = document2.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35771);org.jsoup.nodes.Node node10 = document2.attr("#text", "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35772);org.jsoup.nodes.Node node11 = document2.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35773);String str12 = document2.outerHtml();
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35774);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35775);org.jsoup.select.Elements elements13 = org.jsoup.select.Selector.select("", (org.jsoup.nodes.Element) document2);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35776);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35777);org.junit.Assert.assertNotNull(document2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35778);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35779);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35780);org.junit.Assert.assertNotNull(element7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35781);org.junit.Assert.assertNotNull(node10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35782);org.junit.Assert.assertNotNull(node11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35783);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1052() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lbnklxrm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1052",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lbnklxrm0() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35784);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35785);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35786)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35787)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35788);System.out.format("%n%s%n", "RegressionTest2.test1052");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35789);java.io.InputStream inputStream0 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35790);org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35791);org.jsoup.Connection.Request request4 = httpConnection3.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35792);org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35793);boolean boolean9 = request7.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35794);boolean boolean11 = request7.hasCookie("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35795);org.jsoup.parser.Parser parser12 = request7.parser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35796);org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35797);org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35798);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35799);org.jsoup.nodes.Element element15 = document13.filter(nodeFilter14);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35800);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35801);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35802);org.junit.Assert.assertNotNull(request7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35803);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35804);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35805);org.junit.Assert.assertNotNull(parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35806);org.junit.Assert.assertNotNull(document13);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1053() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oknjeermn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1053",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oknjeermn() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35807);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35808);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35809)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35810)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35811);System.out.format("%n%s%n", "RegressionTest2.test1053");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35812);org.jsoup.examples.HtmlToPlainText htmlToPlainText0 = new org.jsoup.examples.HtmlToPlainText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35813);org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild1 = new org.jsoup.select.Evaluator.IsOnlyChild();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35814);org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35815);String str4 = document3.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35816);String str5 = document3.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35817);org.jsoup.nodes.Element element7 = document3.toggleClass("multipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35818);org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35819);String str10 = document9.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35820);String str11 = document9.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35821);boolean boolean13 = document9.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35822);boolean boolean14 = isOnlyChild1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35823);String str15 = htmlToPlainText0.getPlainText((org.jsoup.nodes.Element) document9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35824);org.junit.Assert.assertNotNull(document3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35825);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35826);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35827);org.junit.Assert.assertNotNull(element7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35828);org.junit.Assert.assertNotNull(document9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35829);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35830);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35831);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35832);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35833);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1054() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rtni6vrne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1054",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rtni6vrne() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35834);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35835);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35836)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35837)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35838);System.out.format("%n%s%n", "RegressionTest2.test1054");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35839);org.jsoup.parser.ParseSettings parseSettings3 = new org.jsoup.parser.ParseSettings(false, true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35840);org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", parseSettings3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35841);boolean boolean5 = tag4.isFormSubmittable();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35842);org.junit.Assert.assertNotNull(tag4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35843);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1055() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v2ngzcrno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1055",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35844,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v2ngzcrno() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35844);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35845);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35846)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35847)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35848);System.out.format("%n%s%n", "RegressionTest2.test1055");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35849);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35850);org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35851);String str5 = document4.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35852);String str6 = document4.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35853);boolean boolean8 = document4.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35854);String str9 = document4.tagName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35855);org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35856);org.jsoup.nodes.Element element13 = document11.val("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35857);boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35858);String str15 = document4.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35859);org.jsoup.nodes.Element element17 = document4.removeClass("#root=\"\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35860);org.jsoup.nodes.Element element18 = element17.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35861);org.jsoup.select.Elements elements19 = element18.parents();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35862);org.junit.Assert.assertNotNull(document4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35863);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35864);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35865);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35866);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35867);org.junit.Assert.assertNotNull(document11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35868);org.junit.Assert.assertNotNull(element13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35869);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35870);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35871);org.junit.Assert.assertNotNull(element17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35872);org.junit.Assert.assertNotNull(element18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35873);org.junit.Assert.assertNotNull(elements19);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1056() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ybnfrtroi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1056",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35874,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ybnfrtroi() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35874);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35875);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35876)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35877)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35878);System.out.format("%n%s%n", "RegressionTest2.test1056");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35879);org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35880);boolean boolean2 = tag1.isFormListed();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35881);boolean boolean3 = tag1.isBlock();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35882);org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35883);boolean boolean6 = tag1.isEmpty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35884);String str7 = tag1.normalName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35885);boolean boolean8 = tag1.isEmpty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35886);boolean boolean9 = tag1.isEmpty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35887);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35888);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35889);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35890);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35891);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35892);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1057() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xggneurp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1057",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35893,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xggneurp1() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35893);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35894);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35895)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35896)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35897);System.out.format("%n%s%n", "RegressionTest2.test1057");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35898);org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35899);String str2 = tokenQueue1.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35900);boolean boolean3 = tokenQueue1.consumeWhitespace();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35901);String str5 = tokenQueue1.consumeTo("multipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35902);tokenQueue1.addFirst("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35903);boolean boolean9 = tokenQueue1.matchChomp("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35904);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35905);org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35906);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35907);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1058() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u7gomdrpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1058",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35908,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u7gomdrpg() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35908);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35909);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35910)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35911)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35912);System.out.format("%n%s%n", "RegressionTest2.test1058");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35913);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35914);javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35915);org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35916);org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35917);java.io.InputStream inputStream7 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35918);org.jsoup.Connection connection9 = httpConnection0.data("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "Content-Encoding", inputStream7, "Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35919);org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35920);org.jsoup.Connection.Request request11 = httpConnection10.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35921);org.jsoup.Connection connection13 = httpConnection10.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35922);org.jsoup.Connection.Response response14 = httpConnection10.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35923);org.jsoup.Connection connection16 = httpConnection10.ignoreContentType(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35924);org.jsoup.Connection.Request request17 = httpConnection10.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35925);org.jsoup.Connection connection20 = httpConnection10.cookie(":lt(52)", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35926);org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35927);javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35928);org.jsoup.Connection connection23 = httpConnection21.sslSocketFactory(sSLSocketFactory22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35929);javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35930);org.jsoup.Connection connection25 = httpConnection21.sslSocketFactory(sSLSocketFactory24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35931);org.jsoup.Connection.Request request26 = httpConnection21.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35932);org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35933);org.jsoup.Connection.Request request28 = httpConnection27.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35934);org.jsoup.Connection.Request request31 = request28.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35935);java.util.Map<String, java.util.List<String>> strMap32 = request31.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35936);java.util.Map<String, String> strMap33 = request31.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35937);org.jsoup.Connection connection34 = httpConnection21.headers(strMap33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35938);org.jsoup.helper.HttpConnection.KeyVal keyVal37 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35939);org.jsoup.Connection.KeyVal[] keyValArray38 = new org.jsoup.Connection.KeyVal[] { keyVal37 };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35940);java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList39 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35941);boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39, keyValArray38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35942);org.jsoup.Connection connection41 = connection34.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35943);org.jsoup.Connection connection42 = httpConnection10.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35944);org.jsoup.Connection connection43 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35945);java.net.URL uRL44 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35946);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35947);org.jsoup.Connection connection45 = httpConnection0.url(uRL44);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35948);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35949);org.junit.Assert.assertNotNull(connection2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35950);org.junit.Assert.assertNotNull(connection4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35951);org.junit.Assert.assertNotNull(connection9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35952);org.junit.Assert.assertNotNull(request11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35953);org.junit.Assert.assertNotNull(connection13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35954);org.junit.Assert.assertNotNull(response14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35955);org.junit.Assert.assertNotNull(connection16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35956);org.junit.Assert.assertNotNull(request17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35957);org.junit.Assert.assertNotNull(connection20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35958);org.junit.Assert.assertNotNull(connection23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35959);org.junit.Assert.assertNotNull(connection25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35960);org.junit.Assert.assertNotNull(request26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35961);org.junit.Assert.assertNotNull(request28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35962);org.junit.Assert.assertNotNull(request31);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35963);org.junit.Assert.assertNotNull(strMap32);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35964);org.junit.Assert.assertNotNull(strMap33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35965);org.junit.Assert.assertNotNull(connection34);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35966);org.junit.Assert.assertNotNull(keyVal37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35967);org.junit.Assert.assertNotNull(keyValArray38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35968);org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35969);org.junit.Assert.assertNotNull(connection41);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35970);org.junit.Assert.assertNotNull(connection42);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35971);org.junit.Assert.assertNotNull(connection43);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1059() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qygptwrr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1059",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qygptwrr8() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35972);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35973);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35974)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35975)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35976);System.out.format("%n%s%n", "RegressionTest2.test1059");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35977);org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", "[public=<!#root!>]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35978);org.junit.Assert.assertNotNull(document2);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1060() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),35979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qhliemrrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1060",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),35979,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qhliemrrf() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35979);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35980);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35981)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(35982)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35983);System.out.format("%n%s%n", "RegressionTest2.test1060");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(35984);org.jsoup.select.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35985);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35986);org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35987);String str9 = document8.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35988);org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35989);org.jsoup.nodes.Element element11 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35990);org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35991);String str14 = document13.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35992);String str15 = document13.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35993);org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35994);String str18 = document17.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35995);String str19 = document17.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35996);org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35997);boolean boolean22 = document17.is((org.jsoup.select.Evaluator) indexLessThan21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35998);boolean boolean23 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(35999);String str24 = document17.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36000);org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36001);String str27 = document26.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36002);String str28 = document26.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36003);boolean boolean30 = document26.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36004);boolean boolean31 = indexLessThan3.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36005);org.jsoup.nodes.Document.QuirksMode quirksMode32 = org.jsoup.nodes.Document.QuirksMode.quirks;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36006);org.jsoup.nodes.Document document33 = document26.quirksMode(quirksMode32);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36007);document26.updateMetaCharsetElement(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36008);org.jsoup.nodes.Element element37 = document26.append("SYSTEM");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36009);org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36010);org.jsoup.nodes.Attribute attribute39 = new org.jsoup.nodes.Attribute("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", "hi!hi!", attributes38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36011);org.junit.Assert.assertNotNull(document8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36012);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36013);org.junit.Assert.assertNotNull(elements10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36014);org.junit.Assert.assertNull(element11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36015);org.junit.Assert.assertNotNull(document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36016);org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36017);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36018);org.junit.Assert.assertNotNull(document17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36019);org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36020);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36021);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36022);org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36023);org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36024);org.junit.Assert.assertNotNull(document26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36025);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36026);org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36027);org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36028);org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36029);org.junit.Assert.assertTrue("'" + quirksMode32 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode32.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36030);org.junit.Assert.assertNotNull(document33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36031);org.junit.Assert.assertNotNull(element37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36032);org.junit.Assert.assertNotNull(attributes38);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1061() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n8ljm5rsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1061",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36033,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n8ljm5rsx() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36033);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36034);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36035)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36036)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36037);System.out.format("%n%s%n", "RegressionTest2.test1061");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36038);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36039);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36040);javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36041);org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36042);org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36043);String str6 = document5.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36044);String str7 = document5.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36045);org.jsoup.nodes.Element element8 = document5.clearAttributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36046);java.util.Map<String, String> strMap9 = document5.dataset();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36047);org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36048);org.jsoup.Connection connection12 = httpConnection0.ignoreContentType(false);
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36049);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36050);org.jsoup.nodes.Document document13 = connection12.get();
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36051);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36052);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36053);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36054);org.junit.Assert.assertNotNull(document5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36055);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36056);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36057);org.junit.Assert.assertNotNull(element8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36058);org.junit.Assert.assertNotNull(strMap9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36059);org.junit.Assert.assertNotNull(connection10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36060);org.junit.Assert.assertNotNull(connection12);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1062() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jzlktortp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1062",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jzlktortp() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36061);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36062);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36063)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36064)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36065);System.out.format("%n%s%n", "RegressionTest2.test1062");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36066);org.jsoup.nodes.Attributes attributes2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36067);org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36068);String str4 = attribute3.getValue();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36069);String str5 = attribute3.getKey();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36070);org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36071);String str7 = attribute6.html();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36072);org.jsoup.nodes.Attribute attribute8 = attribute6.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36073);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36074);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36075);org.junit.Assert.assertNotNull(attribute6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36076);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=\"#root\"" + "'", str7, "Content-Encoding=\"#root\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36077);org.junit.Assert.assertNotNull(attribute8);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1063() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqlm17ru6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1063",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqlm17ru6() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36078);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36079);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36080)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36081)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36082);System.out.format("%n%s%n", "RegressionTest2.test1063");
        // The following exception was thrown during execution in test generation
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36083);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36084);org.jsoup.helper.Validate.fail("#declaration");
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36085);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: #declaration");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1064() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dhln8qrue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1064",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36086,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dhln8qrue() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36086);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36087);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36088)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36089)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36090);System.out.format("%n%s%n", "RegressionTest2.test1064");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36091);boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) 100);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36092);org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1065() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a8log9rul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1065",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a8log9rul() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36093);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36094);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36095)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36096)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36097);System.out.format("%n%s%n", "RegressionTest2.test1065");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36098);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36099);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36100);org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36101);org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36102);javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36103);org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36104);javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36105);org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36106);org.jsoup.Connection.Request request9 = httpConnection4.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36107);org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36108);org.jsoup.Connection.Request request11 = httpConnection10.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36109);org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36110);java.util.Map<String, java.util.List<String>> strMap15 = request14.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36111);java.util.Map<String, String> strMap16 = request14.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36112);org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36113);org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36114);java.io.InputStream inputStream23 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36115);org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36116);java.io.InputStream inputStream25 = keyVal24.inputStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36117);org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36118);javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36119);org.jsoup.Connection connection28 = httpConnection26.sslSocketFactory(sSLSocketFactory27);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36120);javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36121);org.jsoup.Connection connection30 = httpConnection26.sslSocketFactory(sSLSocketFactory29);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36122);org.jsoup.Connection.Request request31 = httpConnection26.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36123);org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36124);org.jsoup.Connection.Request request33 = httpConnection32.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36125);org.jsoup.Connection.Request request36 = request33.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36126);java.util.Map<String, java.util.List<String>> strMap37 = request36.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36127);java.util.Map<String, String> strMap38 = request36.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36128);org.jsoup.Connection connection39 = httpConnection26.headers(strMap38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36129);java.io.InputStream inputStream42 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36130);org.jsoup.internal.ConstrainableInputStream constrainableInputStream45 = new org.jsoup.internal.ConstrainableInputStream(inputStream42, 1, (int) (byte) 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36131);org.jsoup.Connection connection46 = httpConnection26.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream45);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36132);org.jsoup.helper.HttpConnection.KeyVal keyVal47 = keyVal24.inputStream((java.io.InputStream) constrainableInputStream45);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36133);constrainableInputStream45.skipNBytes(0L);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36134);org.jsoup.Connection connection50 = httpConnection0.data("[:eq(-1)!=#doctype]", ":contains(content-encoding)", (java.io.InputStream) constrainableInputStream45);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36135);org.jsoup.Connection connection53 = httpConnection0.cookie("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", "#cdata");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36136);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36137);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36138);org.junit.Assert.assertNotNull(connection6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36139);org.junit.Assert.assertNotNull(connection8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36140);org.junit.Assert.assertNotNull(request9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36141);org.junit.Assert.assertNotNull(request11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36142);org.junit.Assert.assertNotNull(request14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36143);org.junit.Assert.assertNotNull(strMap15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36144);org.junit.Assert.assertNotNull(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36145);org.junit.Assert.assertNotNull(connection17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36146);org.junit.Assert.assertNotNull(connection18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36147);org.junit.Assert.assertNotNull(keyVal24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36148);org.junit.Assert.assertNull(inputStream25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36149);org.junit.Assert.assertNotNull(connection28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36150);org.junit.Assert.assertNotNull(connection30);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36151);org.junit.Assert.assertNotNull(request31);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36152);org.junit.Assert.assertNotNull(request33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36153);org.junit.Assert.assertNotNull(request36);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36154);org.junit.Assert.assertNotNull(strMap37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36155);org.junit.Assert.assertNotNull(strMap38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36156);org.junit.Assert.assertNotNull(connection39);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36157);org.junit.Assert.assertNotNull(connection46);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36158);org.junit.Assert.assertNotNull(keyVal47);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36159);org.junit.Assert.assertNotNull(connection50);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36160);org.junit.Assert.assertNotNull(connection53);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1066() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16zlpnsrwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1066",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36161,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16zlpnsrwh() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36161);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36162);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36163)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36164)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36165);System.out.format("%n%s%n", "RegressionTest2.test1066");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36166);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36167);javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36168);org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36169);org.jsoup.Connection connection4 = httpConnection0.ignoreHttpErrors(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36170);org.jsoup.Connection connection7 = httpConnection0.cookie("multipart", "#doctype");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36171);String[] strArray15 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36172);boolean boolean16 = org.jsoup.internal.StringUtil.in("", strArray15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36173);boolean boolean17 = org.jsoup.internal.StringUtil.in("", strArray15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36174);String str19 = org.jsoup.internal.StringUtil.join(strArray15, " hi!=\"multipart/form-data\"");
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36175);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36176);org.jsoup.Connection connection20 = httpConnection0.data(strArray15);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36177);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36178);org.junit.Assert.assertNotNull(connection2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36179);org.junit.Assert.assertNotNull(connection4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36180);org.junit.Assert.assertNotNull(connection7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36181);org.junit.Assert.assertNotNull(strArray15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36182);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36183);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36184);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str19, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1067() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13qlqvbrx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1067",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36185,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13qlqvbrx5() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36185);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36186);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36187)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36188)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36189);System.out.format("%n%s%n", "RegressionTest2.test1067");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36190);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36191);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36192);org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36193);org.jsoup.Connection.Response response4 = httpConnection0.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36194);java.net.URL uRL5 = response4.url();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36195);boolean boolean7 = response4.hasCookie("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36196);java.util.Map<String, String> strMap8 = response4.headers();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36197);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36198);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36199);org.junit.Assert.assertNotNull(response4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36200);org.junit.Assert.assertNull(uRL5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36201);org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36202);org.junit.Assert.assertNotNull(strMap8);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1068() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hls2urxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1068",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36203,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hls2urxn() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36203);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36204);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36205)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36206)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36207);System.out.format("%n%s%n", "RegressionTest2.test1068");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36208);org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36209);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36210);boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36211);parseErrorList1.ensureCapacity(10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36212);parseErrorList1.ensureCapacity(100);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36213);java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList1.iterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36214);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream8 = parseErrorList1.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36215);org.junit.Assert.assertNotNull(parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36216);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36217);org.junit.Assert.assertNotNull(parseErrorItor7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36218);org.junit.Assert.assertNotNull(parseErrorStream8);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1069() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12re6pnry3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1069",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12re6pnry3() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36219);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36220);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36221)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36222)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36223);System.out.format("%n%s%n", "RegressionTest2.test1069");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36224);org.jsoup.helper.HttpConnection httpConnection2 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36225);org.jsoup.Connection.Request request3 = httpConnection2.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36226);org.jsoup.Connection connection5 = httpConnection2.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36227);org.jsoup.Connection.Response response6 = httpConnection2.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36228);org.jsoup.Connection connection8 = httpConnection2.ignoreContentType(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36229);org.jsoup.Connection.Method method9 = org.jsoup.Connection.Method.OPTIONS;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36230);boolean boolean10 = method9.hasBody();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36231);org.jsoup.Connection connection11 = httpConnection2.method(method9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36232);org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36233);org.jsoup.parser.Parser parser13 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36234);org.jsoup.Connection connection14 = httpConnection2.parser(parser13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36235);org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("Content-Encoding=\"#root\"", ":nth-last-of-type(100n-1)", parser13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36236);org.jsoup.nodes.Element element16 = document15.body();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36237);org.junit.Assert.assertNotNull(request3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36238);org.junit.Assert.assertNotNull(connection5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36239);org.junit.Assert.assertNotNull(response6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36240);org.junit.Assert.assertNotNull(connection8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36241);org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method9.equals(org.jsoup.Connection.Method.OPTIONS));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36242);org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36243);org.junit.Assert.assertNotNull(connection11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36244);org.junit.Assert.assertNotNull(connection14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36245);org.junit.Assert.assertNotNull(document15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36246);org.junit.Assert.assertNotNull(element16);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1070() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1389e4xryv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1070",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1389e4xryv() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36247);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36248);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36249)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36250)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36251);System.out.format("%n%s%n", "RegressionTest2.test1070");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36252);org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[#declaration!=content-encoding]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1071() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16h9cxerz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1071",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16h9cxerz1() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36253);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36254);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36255)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36256)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36257);System.out.format("%n%s%n", "RegressionTest2.test1071");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36258);org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36259);org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36260);org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36261);org.jsoup.nodes.Attributes attributes9 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36262);org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36263);String str11 = attribute10.getValue();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36264);org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36265);org.jsoup.parser.Tag tag14 = new org.jsoup.parser.Tag("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36266);boolean boolean15 = tag14.isInline();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36267);org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36268);org.jsoup.nodes.Attributes attributes20 = attributes17.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36269);org.jsoup.nodes.Attributes attributes23 = attributes17.add("hi!", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36270);attributes23.normalize();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36271);org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag14, "[public=<!#root!>]", attributes23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36272);attributes12.addAll(attributes23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36273);org.junit.Assert.assertNotNull(attributes3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36274);org.junit.Assert.assertNotNull(attributes6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36275);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36276);org.junit.Assert.assertNotNull(attributes12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36277);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36278);org.junit.Assert.assertNotNull(attributes20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36279);org.junit.Assert.assertNotNull(attributes23);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1072() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19q9bpvrzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1072",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19q9bpvrzs() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36280);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36281);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36282)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36283)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36284);System.out.format("%n%s%n", "RegressionTest2.test1072");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36285);org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#declaration", "Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36286);String str3 = attributeWithValueNot2.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36287);String str4 = attributeWithValueNot2.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36288);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#declaration!=content-encoding]" + "'", str3, "[#declaration!=content-encoding]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36289);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[#declaration!=content-encoding]" + "'", str4, "[#declaration!=content-encoding]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1073() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cz9aics02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1073",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cz9aics02() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36290);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36291);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36292)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36293)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36294);System.out.format("%n%s%n", "RegressionTest2.test1073");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36295);org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36296);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36297);boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36298);org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36299);int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36300);org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36301);javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36302);org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36303);javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36304);org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36305);org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36306);boolean boolean12 = parseErrorList1.equals((Object) true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36307);org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36308);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36309);boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36310);parseErrorList14.ensureCapacity(10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36311);boolean boolean18 = parseErrorList1.remove((Object) parseErrorList14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36312);parseErrorList14.ensureCapacity((int) (short) 100);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36313);java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36314);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36315);parseErrorList14.replaceAll(parseErrorUnaryOperator21);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36316);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36317);org.junit.Assert.assertNotNull(parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36318);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36319);org.junit.Assert.assertNotNull(parseErrorList3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36320);org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36321);org.junit.Assert.assertNotNull(connection7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36322);org.junit.Assert.assertNotNull(connection9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36323);org.junit.Assert.assertNotNull(connection11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36324);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36325);org.junit.Assert.assertNotNull(parseErrorArray13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36326);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36327);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1074() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g899ats14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1074",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36328,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g899ats14() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36328);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36329);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36330)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36331)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36332);System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36333);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36334);org.jsoup.helper.Validate.fail("#root");
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36335);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: #root");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1075() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jh983as1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1075",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jh983as1c() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36336);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36337);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36338)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36339)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36340);System.out.format("%n%s%n", "RegressionTest2.test1075");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36341);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36342);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36343);org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36344);boolean boolean6 = request4.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36345);String str8 = request4.cookie("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36346);org.jsoup.Connection.Request request10 = request4.timeout((int) ' ');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36347);boolean boolean11 = request10.ignoreHttpErrors();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36348);boolean boolean12 = request10.followRedirects();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36349);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36350);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36351);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36352);org.junit.Assert.assertNull(str8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36353);org.junit.Assert.assertNotNull(request10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36354);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36355);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1076() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mq96vrs1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1076",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mq96vrs1w() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36356);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36357);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36358)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36359)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36360);System.out.format("%n%s%n", "RegressionTest2.test1076");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36361);org.jsoup.nodes.Attributes attributes2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36362);org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "#doctype", attributes2);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1077() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pz95o8s23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1077",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pz95o8s23() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36363);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36364);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36365)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36366)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36367);System.out.format("%n%s%n", "RegressionTest2.test1077");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36368);org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36369);org.jsoup.nodes.Attributes attributes5 = attributes2.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36370);org.jsoup.nodes.Attributes attributes8 = attributes2.add("hi!", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36371);org.jsoup.nodes.Attributes attributes11 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36372);org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36373);String str13 = attribute12.getValue();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36374);org.jsoup.nodes.Attributes attributes14 = attributes2.put(attribute12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36375);org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute(":first-of-type", "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!", attributes2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36376);org.junit.Assert.assertNotNull(attributes5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36377);org.junit.Assert.assertNotNull(attributes8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36378);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36379);org.junit.Assert.assertNotNull(attributes14);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1078() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1t894gps2k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1078",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36380,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1t894gps2k() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36380);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36381);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36382)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36383)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36384);System.out.format("%n%s%n", "RegressionTest2.test1078");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36385);org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("PUBLIC", "<!#root!>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36386);String str3 = attributeWithValue2.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36387);String str4 = attributeWithValue2.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36388);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[public=<!#root!>]" + "'", str3, "[public=<!#root!>]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36389);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[public=<!#root!>]" + "'", str4, "[public=<!#root!>]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1079() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wh9396s2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1079",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36390,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wh9396s2u() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36390);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36391);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36392)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36393)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36394);System.out.format("%n%s%n", "RegressionTest2.test1079");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36395);org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.simpleText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36396);String str2 = org.jsoup.Jsoup.clean("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36397);org.jsoup.safety.Cleaner cleaner3 = new org.jsoup.safety.Cleaner(whitelist1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36398);org.junit.Assert.assertNotNull(whitelist1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36399);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str2, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1080() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wy4aogs34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1080",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wy4aogs34() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36400);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36401);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36402)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36403)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36404);System.out.format("%n%s%n", "RegressionTest2.test1080");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36405);org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36406);org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueMatching("#root=\"\"", "#cdata");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36407);org.junit.Assert.assertNotNull(document2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36408);org.junit.Assert.assertNotNull(elements5);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1081() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ytzsi7s3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1081",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ytzsi7s3d() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36409);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36410);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36411)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36412)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36413);System.out.format("%n%s%n", "RegressionTest2.test1081");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36414);java.io.InputStream inputStream2 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36415);org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36416);java.io.InputStream inputStream4 = keyVal3.inputStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36417);org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36418);javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36419);org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36420);javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36421);org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36422);org.jsoup.Connection.Request request10 = httpConnection5.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36423);org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36424);org.jsoup.Connection.Request request12 = httpConnection11.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36425);org.jsoup.Connection.Request request15 = request12.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36426);java.util.Map<String, java.util.List<String>> strMap16 = request15.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36427);java.util.Map<String, String> strMap17 = request15.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36428);org.jsoup.Connection connection18 = httpConnection5.headers(strMap17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36429);java.io.InputStream inputStream21 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36430);org.jsoup.internal.ConstrainableInputStream constrainableInputStream24 = new org.jsoup.internal.ConstrainableInputStream(inputStream21, 1, (int) (byte) 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36431);org.jsoup.Connection connection25 = httpConnection5.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36432);org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal3.inputStream((java.io.InputStream) constrainableInputStream24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36433);org.jsoup.internal.ConstrainableInputStream constrainableInputStream29 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream24, (int) (short) -1, 10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36434);org.junit.Assert.assertNotNull(keyVal3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36435);org.junit.Assert.assertNull(inputStream4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36436);org.junit.Assert.assertNotNull(connection7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36437);org.junit.Assert.assertNotNull(connection9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36438);org.junit.Assert.assertNotNull(request10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36439);org.junit.Assert.assertNotNull(request12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36440);org.junit.Assert.assertNotNull(request15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36441);org.junit.Assert.assertNotNull(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36442);org.junit.Assert.assertNotNull(strMap17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36443);org.junit.Assert.assertNotNull(connection18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36444);org.junit.Assert.assertNotNull(connection25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36445);org.junit.Assert.assertNotNull(keyVal26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36446);org.junit.Assert.assertNotNull(constrainableInputStream29);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1082() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vkztpqs4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1082",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36447,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vkztpqs4f() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36447);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36448);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36449)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36450)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36451);System.out.format("%n%s%n", "RegressionTest2.test1082");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36452);java.io.InputStream inputStream0 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36453);org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36454);org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36455);constrainableInputStream3.close();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36456);org.jsoup.internal.ConstrainableInputStream constrainableInputStream10 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream3, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36457);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36458);byte[] byteArray12 = constrainableInputStream10.readNBytes(1);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36459);org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: Read timeout");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36460);org.junit.Assert.assertNotNull(constrainableInputStream6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36461);org.junit.Assert.assertNotNull(constrainableInputStream10);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1083() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sbzux9s4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1083",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36462,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sbzux9s4u() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36462);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36463);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36464)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36465)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36466);System.out.format("%n%s%n", "RegressionTest2.test1083");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36467);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36468);org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36469);org.jsoup.nodes.Element element7 = document5.val("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36470);org.jsoup.nodes.Element element8 = document5.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36471);java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = document5.dataNodes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36472);org.jsoup.select.Evaluator.IndexLessThan indexLessThan11 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36473);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType14 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36474);org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36475);String str17 = document16.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36476);org.jsoup.select.Elements elements18 = document16.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36477);org.jsoup.nodes.Element element19 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType14, (org.jsoup.nodes.Element) document16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36478);org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36479);String str22 = document21.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36480);String str23 = document21.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36481);org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36482);String str26 = document25.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36483);String str27 = document25.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36484);org.jsoup.select.Evaluator.IndexLessThan indexLessThan29 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36485);boolean boolean30 = document25.is((org.jsoup.select.Evaluator) indexLessThan29);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36486);boolean boolean31 = isNthLastOfType14.matches((org.jsoup.nodes.Element) document21, (org.jsoup.nodes.Element) document25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36487);String str32 = document25.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36488);org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36489);String str35 = document34.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36490);String str36 = document34.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36491);boolean boolean38 = document34.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36492);boolean boolean39 = indexLessThan11.matches((org.jsoup.nodes.Element) document25, (org.jsoup.nodes.Element) document34);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36493);org.jsoup.nodes.Document.QuirksMode quirksMode40 = org.jsoup.nodes.Document.QuirksMode.quirks;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36494);org.jsoup.nodes.Document document41 = document34.quirksMode(quirksMode40);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36495);org.jsoup.select.Elements elements44 = document41.getElementsByAttributeValueMatching("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36496);java.util.Set<String> strSet45 = document41.classNames();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36497);org.jsoup.nodes.Element element46 = document5.appendTo((org.jsoup.nodes.Element) document41);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36498);org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36499);String str49 = document48.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36500);org.jsoup.nodes.Document document50 = document48.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36501);String str51 = document50.title();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36502);boolean boolean52 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document41, (org.jsoup.nodes.Element) document50);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36503);org.jsoup.nodes.Element element53 = org.jsoup.select.Selector.selectFirst(":gt(100)", (org.jsoup.nodes.Element) document41);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36504);org.junit.Assert.assertNotNull(document5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36505);org.junit.Assert.assertNotNull(element7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36506);org.junit.Assert.assertNotNull(element8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36507);org.junit.Assert.assertNotNull(dataNodeList9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36508);org.junit.Assert.assertNotNull(document16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36509);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36510);org.junit.Assert.assertNotNull(elements18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36511);org.junit.Assert.assertNull(element19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36512);org.junit.Assert.assertNotNull(document21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36513);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36514);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36515);org.junit.Assert.assertNotNull(document25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36516);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36517);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36518);org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36519);org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36520);org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36521);org.junit.Assert.assertNotNull(document34);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36522);org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36523);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36524);org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36525);org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36526);org.junit.Assert.assertTrue("'" + quirksMode40 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode40.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36527);org.junit.Assert.assertNotNull(document41);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36528);org.junit.Assert.assertNotNull(elements44);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36529);org.junit.Assert.assertNotNull(strSet45);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36530);org.junit.Assert.assertNotNull(element46);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36531);org.junit.Assert.assertNotNull(document48);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36532);org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36533);org.junit.Assert.assertNotNull(document50);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36534);org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36535);org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36536);org.junit.Assert.assertNull(element53);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1084() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p2zw4ss6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1084",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36537,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p2zw4ss6x() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36537);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36538);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36539)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36540)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36541);System.out.format("%n%s%n", "RegressionTest2.test1084");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36542);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36543);String str2 = document1.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36544);org.jsoup.select.Elements elements3 = document1.parents();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36545);org.jsoup.nodes.Element element5 = document1.appendElement("#root=\"\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36546);String str6 = element5.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36547);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36548);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36549);org.junit.Assert.assertNotNull(elements3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36550);org.junit.Assert.assertNotNull(element5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36551);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root=\"\"></#root=\"\">" + "'", str6, "<#root=\"\"></#root=\"\">");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1085() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ltzxcbs7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1085",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ltzxcbs7c() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36552);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36553);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36554)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36555)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36556);System.out.format("%n%s%n", "RegressionTest2.test1085");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36557);org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36558);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36559);java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor2 = parseErrorList0.iterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36560);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList0.stream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36561);parseErrorList0.clear();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36562);org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36563);String str7 = document6.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36564);String str8 = document6.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36565);org.jsoup.nodes.Element element11 = document6.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36566);org.jsoup.select.Elements elements13 = document6.getElementsContainingOwnText("[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36567);org.jsoup.nodes.Element element15 = document6.tagName("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36568);org.jsoup.select.Elements elements17 = document6.getElementsByTag("multipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36569);org.jsoup.parser.ParseError[] parseErrorArray18 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36570);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList19 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36571);boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19, parseErrorArray18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36572);org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36573);int int22 = parseErrorList19.indexOf((Object) parseErrorList21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36574);java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor23 = parseErrorList19.iterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36575);org.jsoup.parser.ParseError parseError25 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36576);parseErrorList19.add(0, parseError25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36577);int int27 = parseErrorList19.size();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36578);boolean boolean28 = elements17.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36579);boolean boolean29 = parseErrorList0.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36580);org.junit.Assert.assertNotNull(parseErrorList0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36581);org.junit.Assert.assertNotNull(parseErrorItor1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36582);org.junit.Assert.assertNotNull(parseErrorItor2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36583);org.junit.Assert.assertNotNull(parseErrorStream3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36584);org.junit.Assert.assertNotNull(document6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36585);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36586);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36587);org.junit.Assert.assertNotNull(element11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36588);org.junit.Assert.assertNotNull(elements13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36589);org.junit.Assert.assertNotNull(element15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36590);org.junit.Assert.assertNotNull(elements17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36591);org.junit.Assert.assertNotNull(parseErrorArray18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36592);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36593);org.junit.Assert.assertNotNull(parseErrorList21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36594);org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36595);org.junit.Assert.assertNotNull(parseErrorItor23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36596);org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36597);org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36598);org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1086() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ikzyjus8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1086",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ikzyjus8n() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36599);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36600);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36601)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36602)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36603);System.out.format("%n%s%n", "RegressionTest2.test1086");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36604);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36605);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36606);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36607);org.jsoup.nodes.Element element6 = document1.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36608);String str7 = document1.title();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36609);String str8 = document1.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36610);StringBuilder stringBuilder9 = org.jsoup.internal.StringUtil.borrowBuilder();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36611);Appendable appendable10 = document1.html((Appendable) stringBuilder9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36612);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36613);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36614);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36615);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36616);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36617);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36618);org.junit.Assert.assertNotNull(stringBuilder9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36619);org.junit.Assert.assertEquals(stringBuilder9.toString(), "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36620);org.junit.Assert.assertNotNull(appendable10);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1087() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fbzzrds99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1087",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fbzzrds99() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36621);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36622);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36623)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36624)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36625);System.out.format("%n%s%n", "RegressionTest2.test1087");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36626);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36627);org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36628);String str5 = document4.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36629);org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36630);String str8 = document7.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36631);boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36632);org.jsoup.nodes.Document document10 = document4.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36633);document10.setBaseUri("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36634);org.jsoup.select.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36635);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType17 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36636);org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36637);String str20 = document19.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36638);org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36639);org.jsoup.nodes.Element element22 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType17, (org.jsoup.nodes.Element) document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36640);org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36641);String str25 = document24.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36642);String str26 = document24.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36643);org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36644);String str29 = document28.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36645);String str30 = document28.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36646);org.jsoup.select.Evaluator.IndexLessThan indexLessThan32 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36647);boolean boolean33 = document28.is((org.jsoup.select.Evaluator) indexLessThan32);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36648);boolean boolean34 = isNthLastOfType17.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36649);String str35 = document28.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36650);org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36651);String str38 = document37.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36652);String str39 = document37.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36653);boolean boolean41 = document37.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36654);boolean boolean42 = indexLessThan14.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36655);org.jsoup.nodes.Element element43 = document10.prependChild((org.jsoup.nodes.Node) document37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36656);org.jsoup.parser.Tag tag44 = document10.tag();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36657);org.junit.Assert.assertNotNull(document4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36658);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36659);org.junit.Assert.assertNotNull(document7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36660);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36661);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36662);org.junit.Assert.assertNotNull(document10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36663);org.junit.Assert.assertNotNull(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36664);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36665);org.junit.Assert.assertNotNull(elements21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36666);org.junit.Assert.assertNull(element22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36667);org.junit.Assert.assertNotNull(document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36668);org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36669);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36670);org.junit.Assert.assertNotNull(document28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36671);org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36672);org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36673);org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36674);org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36675);org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36676);org.junit.Assert.assertNotNull(document37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36677);org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36678);org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str39, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36679);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36680);org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36681);org.junit.Assert.assertNotNull(element43);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36682);org.junit.Assert.assertNotNull(tag44);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1088() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c300ywsaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1088",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c300ywsaz() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36683);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36684);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36685)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36686)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36687);System.out.format("%n%s%n", "RegressionTest2.test1088");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36688);org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36689);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36690);org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.charset("hi!");
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36691);org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1089() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18u026fsb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1089",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18u026fsb8() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36692);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36693);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36694)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36695)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36696);System.out.format("%n%s%n", "RegressionTest2.test1089");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36697);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36698);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36699);org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36700);java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36701);boolean boolean6 = elements3.equals((Object) 1.0d);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36702);org.jsoup.select.Elements elements8 = elements3.after("");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36703);java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator(0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36704);org.jsoup.select.Elements elements11 = elements3.remove();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36705);org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36706);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36707);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36708);org.junit.Assert.assertNotNull(elements3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36709);org.junit.Assert.assertNotNull(elementItor4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36710);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36711);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36712);org.junit.Assert.assertNotNull(elementItor10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36713);org.junit.Assert.assertNotNull(elements11);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1090() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18d4ur5sbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1090",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36714,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18d4ur5sbu() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36714);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36715);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36716)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36717)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36718);System.out.format("%n%s%n", "RegressionTest2.test1090");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36719);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36720);org.jsoup.nodes.Element element3 = document1.val("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36721);org.jsoup.nodes.Element element4 = document1.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36722);org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36723);org.jsoup.select.Elements elements8 = element4.getElementsContainingText("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36724);org.jsoup.select.Elements elements10 = elements8.addClass("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36725);org.jsoup.select.Elements elements12 = elements10.before("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36726);org.jsoup.select.Elements elements13 = elements12.nextAll();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36727);org.jsoup.select.Elements elements15 = elements13.after("multipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36728);org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36729);org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36730);String str20 = document19.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36731);String str22 = document19.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36732);String str23 = document19.normalName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36733);org.w3c.dom.Document document24 = w3CDom17.fromJsoup(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36734);boolean boolean26 = document19.is(":contains(content-encoding)");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36735);elements15.add((int) (byte) 0, (org.jsoup.nodes.Element) document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36736);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36737);org.junit.Assert.assertNotNull(element3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36738);org.junit.Assert.assertNotNull(element4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36739);org.junit.Assert.assertNotNull(elements6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36740);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36741);org.junit.Assert.assertNotNull(elements10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36742);org.junit.Assert.assertNotNull(elements12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36743);org.junit.Assert.assertNotNull(elements13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36744);org.junit.Assert.assertNotNull(elements15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36745);org.junit.Assert.assertNotNull(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36746);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36747);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36748);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36749);org.junit.Assert.assertNotNull(document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36750);org.junit.Assert.assertNull("document24.getDocumentURI() == null", document24.getDocumentURI());
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36751);org.junit.Assert.assertNull("document24.getInputEncoding() == null", document24.getInputEncoding());
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36752);org.junit.Assert.assertNull("document24.getXmlEncoding() == null", document24.getXmlEncoding());
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36753);org.junit.Assert.assertEquals(document24.getXmlVersion(), "1.0");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36754);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1091() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1544vyoscz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1091",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1544vyoscz() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36755);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36756);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36757)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36758)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36759);System.out.format("%n%s%n", "RegressionTest2.test1091");
        // The following exception was thrown during execution in test generation
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36760);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36761);org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("", "<#root=\"\"></#root=\"\">");
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36762);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1092() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v4x67sd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1092",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v4x67sd7() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36763);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36764);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36765)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36766)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36767);System.out.format("%n%s%n", "RegressionTest2.test1092");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36768);java.io.InputStream inputStream0 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36769);org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36770);org.jsoup.Connection.Request request4 = httpConnection3.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36771);org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36772);boolean boolean9 = request7.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36773);boolean boolean11 = request7.hasCookie("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36774);org.jsoup.parser.Parser parser12 = request7.parser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36775);org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36776);org.jsoup.parser.ParseErrorList parseErrorList14 = parser12.getErrors();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36777);boolean boolean15 = parser12.isTrackErrors();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36778);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36779);org.junit.Assert.assertNotNull(request7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36780);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36781);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36782);org.junit.Assert.assertNotNull(parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36783);org.junit.Assert.assertNotNull(document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36784);org.junit.Assert.assertNotNull(parseErrorList14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36785);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1093() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11dv1masdu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1093",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36786,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11dv1masdu() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36786);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36787);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36788)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36789)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36790);System.out.format("%n%s%n", "RegressionTest2.test1093");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36791);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36792);org.jsoup.Connection.Response response1 = httpConnection0.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36793);String str2 = response1.statusMessage();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36794);org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36795);org.jsoup.Connection.Response response7 = response1.header("Content-Type", "application/x-www-form-urlencoded");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36796);org.jsoup.Connection.Response response10 = response1.cookie("Content-Encoding", "SYSTEM");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36797);org.junit.Assert.assertNotNull(response1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36798);org.junit.Assert.assertNull(str2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36799);org.junit.Assert.assertNotNull(response4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36800);org.junit.Assert.assertNotNull(response7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36801);org.junit.Assert.assertNotNull(response10);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1094() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14mv0ersea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1094",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14mv0ersea() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36802);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36803);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36804)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36805)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36806);System.out.format("%n%s%n", "RegressionTest2.test1094");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36807);org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36808);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36809);org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36810);String str7 = document6.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36811);org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36812);org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36813);org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36814);String str12 = document11.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36815);String str13 = document11.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36816);org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36817);String str16 = document15.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36818);String str17 = document15.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36819);org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36820);boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36821);boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36822);String str22 = document15.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36823);org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36824);String str25 = document24.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36825);String str26 = document24.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36826);boolean boolean28 = document24.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36827);boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36828);org.jsoup.nodes.Document.QuirksMode quirksMode30 = org.jsoup.nodes.Document.QuirksMode.quirks;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36829);org.jsoup.nodes.Document document31 = document24.quirksMode(quirksMode30);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36830);document24.updateMetaCharsetElement(false);
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36831);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36832);org.jsoup.nodes.Element element35 = document24.selectFirst("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36833);org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!': unexpected token at '! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36834);org.junit.Assert.assertNotNull(document6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36835);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36836);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36837);org.junit.Assert.assertNull(element9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36838);org.junit.Assert.assertNotNull(document11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36839);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36840);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36841);org.junit.Assert.assertNotNull(document15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36842);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36843);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36844);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36845);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36846);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36847);org.junit.Assert.assertNotNull(document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36848);org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36849);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36850);org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36851);org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36852);org.junit.Assert.assertTrue("'" + quirksMode30 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode30.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36853);org.junit.Assert.assertNotNull(document31);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1095() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17vuz78sfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1095",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17vuz78sfq() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36854);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36855);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36856)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36857)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36858);System.out.format("%n%s%n", "RegressionTest2.test1095");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36859);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36860);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36861);org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36862);boolean boolean6 = request4.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36863);boolean boolean8 = request4.hasHeader("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36864);org.jsoup.Connection.Method method9 = request4.method();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36865);org.jsoup.Connection.Method method10 = request4.method();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36866);org.jsoup.Connection.Request request13 = request4.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36867);org.jsoup.Connection.Request request16 = request13.addHeader("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", "                                   ");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36868);String str18 = request13.header("");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36869);boolean boolean21 = request13.hasHeaderWithValue("amultipart", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36870);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36871);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36872);org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36873);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36874);org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36875);org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36876);org.junit.Assert.assertNotNull(request13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36877);org.junit.Assert.assertNotNull(request16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36878);org.junit.Assert.assertNull(str18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36879);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1096() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4uxzpsgg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1096",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36880,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4uxzpsgg() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36880);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36881);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36882)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36883)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36884);System.out.format("%n%s%n", "RegressionTest2.test1096");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36885);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36886);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36887);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36888);org.jsoup.nodes.Element element6 = document1.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36889);String str7 = document1.title();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36890);String str8 = document1.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36891);org.jsoup.select.Evaluator.Attribute attribute10 = new org.jsoup.select.Evaluator.Attribute("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36892);org.jsoup.parser.Tag tag12 = new org.jsoup.parser.Tag("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36893);boolean boolean13 = tag12.isFormListed();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36894);boolean boolean14 = tag12.isBlock();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36895);org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "ultipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36896);org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36897);String str19 = document18.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36898);String str20 = document18.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36899);org.jsoup.nodes.Element element23 = document18.attr("", true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36900);org.jsoup.select.Elements elements25 = document18.getElementsContainingText("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36901);boolean boolean26 = attribute10.matches(element16, (org.jsoup.nodes.Element) document18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36902);boolean boolean27 = document1.is((org.jsoup.select.Evaluator) attribute10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36903);String str28 = document1.data();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36904);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36905);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36906);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36907);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36908);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36909);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36910);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36911);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36912);org.junit.Assert.assertNotNull(document18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36913);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36914);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36915);org.junit.Assert.assertNotNull(element23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36916);org.junit.Assert.assertNotNull(elements25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36917);org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36918);org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36919);org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1097() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eduws6shk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1097",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36920,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eduws6shk() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36920);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36921);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36922)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36923)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36924);System.out.format("%n%s%n", "RegressionTest2.test1097");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36925);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36926);org.jsoup.Connection.Response response1 = httpConnection0.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36927);String str2 = response1.statusMessage();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36928);org.jsoup.Connection.Response response5 = response1.header("multipart/form-data", "");
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36929);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36930);byte[] byteArray6 = response5.bodyAsBytes();
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36931);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36932);org.junit.Assert.assertNotNull(response1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36933);org.junit.Assert.assertNull(str2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36934);org.junit.Assert.assertNotNull(response5);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1098() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hmuvknshz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1098",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hmuvknshz() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36935);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36936);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36937)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36938)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36939);System.out.format("%n%s%n", "RegressionTest2.test1098");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36940);org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36941);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36942);org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36943);String str7 = document6.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36944);org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36945);org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36946);org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36947);String str12 = document11.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36948);String str13 = document11.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36949);org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36950);String str16 = document15.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36951);String str17 = document15.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36952);org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36953);boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36954);boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36955);String str22 = document15.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36956);org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36957);String str25 = document24.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36958);String str26 = document24.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36959);boolean boolean28 = document24.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36960);boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36961);org.jsoup.helper.HttpConnection.KeyVal keyVal32 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36962);java.io.InputStream inputStream33 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36963);org.jsoup.Connection.KeyVal keyVal34 = keyVal32.inputStream(inputStream33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36964);org.jsoup.helper.HttpConnection.KeyVal keyVal36 = keyVal32.value("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36965);org.jsoup.helper.HttpConnection.KeyVal keyVal38 = keyVal32.key("[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36966);boolean boolean39 = document15.equals((Object) keyVal32);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36967);org.junit.Assert.assertNotNull(document6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36968);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36969);org.junit.Assert.assertNotNull(elements8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36970);org.junit.Assert.assertNull(element9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36971);org.junit.Assert.assertNotNull(document11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36972);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36973);org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36974);org.junit.Assert.assertNotNull(document15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36975);org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36976);org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36977);org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36978);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36979);org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36980);org.junit.Assert.assertNotNull(document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36981);org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36982);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36983);org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36984);org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36985);org.junit.Assert.assertNotNull(keyVal32);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36986);org.junit.Assert.assertNotNull(keyVal34);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36987);org.junit.Assert.assertNotNull(keyVal36);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36988);org.junit.Assert.assertNotNull(keyVal38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36989);org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1099() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),36990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kvuud4sji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1099",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kvuud4sji() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36990);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36991);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36992)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(36993)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36994);System.out.format("%n%s%n", "RegressionTest2.test1099");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(36995);org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36996);org.jsoup.parser.TokenQueue tokenQueue3 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36997);boolean boolean5 = tokenQueue3.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36998);char char6 = tokenQueue3.consume();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(36999);char[] charArray7 = new char[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37000);boolean boolean8 = tokenQueue3.matchesAny(charArray7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37001);String str9 = characterReader1.consumeToAny(charArray7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37002);org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37003);org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37004);boolean boolean15 = tokenQueue13.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37005);char char16 = tokenQueue13.consume();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37006);char[] charArray17 = new char[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37007);boolean boolean18 = tokenQueue13.matchesAny(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37008);String str19 = characterReader11.consumeToAny(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37009);String str20 = characterReader1.consumeToAny(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37010);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37011);org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'm' + "'", char6 == 'm');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37012);org.junit.Assert.assertNotNull(charArray7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37013);org.junit.Assert.assertEquals(String.copyValueOf(charArray7), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37014);org.junit.Assert.assertEquals(String.valueOf(charArray7), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37015);org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37016);org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37017);org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str9, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37018);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37019);org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'm' + "'", char16 == 'm');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37020);org.junit.Assert.assertNotNull(charArray17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37021);org.junit.Assert.assertEquals(String.copyValueOf(charArray17), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37022);org.junit.Assert.assertEquals(String.valueOf(charArray17), "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37023);org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37024);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37025);org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str19, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37026);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1100() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_165qjehskj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1100",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_165qjehskj() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37027);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37028);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37029)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37030)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37031);System.out.format("%n%s%n", "RegressionTest2.test1100");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37032);org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37033);org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37034);org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37035);org.jsoup.nodes.Attributes attributes9 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37036);org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37037);String str11 = attribute10.getValue();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37038);org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37039);java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes0.spliterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37040);org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37041);boolean boolean16 = attributes0.hasKey("*");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37042);org.junit.Assert.assertNotNull(attributes3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37043);org.junit.Assert.assertNotNull(attributes6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37044);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37045);org.junit.Assert.assertNotNull(attributes12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37046);org.junit.Assert.assertNotNull(attributeSpliterator13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37047);org.junit.Assert.assertNotNull(attributes14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37048);org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1101() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19eqi6ysl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1101",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19eqi6ysl5() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37049);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37050);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37051)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37052)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37053);System.out.format("%n%s%n", "RegressionTest2.test1101");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37054);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37055);String str2 = document1.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37056);String str3 = document1.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37057);org.jsoup.nodes.Element element5 = document1.toggleClass("multipart");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37058);org.jsoup.nodes.Element element6 = document1.root();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37059);org.jsoup.nodes.Element element8 = document1.text(":gt(35)");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37060);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37061);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37062);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37063);org.junit.Assert.assertNotNull(element5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37064);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37065);org.junit.Assert.assertNotNull(element8);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1102() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnqgzfslm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1102",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnqgzfslm() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37066);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37067);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37068)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37069)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37070);System.out.format("%n%s%n", "RegressionTest2.test1102");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37071);org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37072);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37073);org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37074);String str6 = document5.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37075);String str7 = document5.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37076);boolean boolean9 = document5.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37077);String str10 = document5.tagName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37078);org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37079);org.jsoup.nodes.Element element14 = document12.val("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37080);boolean boolean15 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document5, element14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37081);org.jsoup.select.Elements elements16 = element14.nextElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37082);org.jsoup.nodes.Element element17 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37083);boolean boolean18 = allElements0.matches(element14, element17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37084);org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37085);String str21 = document20.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37086);org.jsoup.nodes.Document document22 = document20.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37087);String str23 = document22.title();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37088);org.jsoup.nodes.Element element24 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) allElements0, (org.jsoup.nodes.Element) document22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37089);org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37090);String str27 = document26.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37091);org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37092);org.jsoup.select.Elements elements30 = elements28.prev("#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37093);String str31 = elements30.val();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37094);org.jsoup.select.Elements elements33 = elements30.addClass("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37095);org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37096);String str36 = document35.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37097);org.jsoup.select.Elements elements37 = document35.parents();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37098);org.jsoup.nodes.Element element38 = document35.shallowClone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37099);Object obj39 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37100);boolean boolean40 = document35.hasSameValue(obj39);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37101);boolean boolean41 = elements30.equals((Object) document35);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37102);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType44 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37103);org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37104);String str47 = document46.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37105);String str48 = document46.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37106);boolean boolean50 = document46.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37107);String str51 = document46.tagName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37108);org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37109);org.jsoup.nodes.Element element55 = document53.val("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37110);boolean boolean56 = isNthLastOfType44.matches((org.jsoup.nodes.Element) document46, element55);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37111);String str57 = document46.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37112);org.jsoup.nodes.Element element59 = document46.removeClass("#root=\"\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37113);org.jsoup.nodes.Element element60 = element59.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37114);boolean boolean61 = allElements0.matches((org.jsoup.nodes.Element) document35, element59);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37115);org.junit.Assert.assertNotNull(document5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37116);org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37117);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str7, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37118);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37119);org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37120);org.junit.Assert.assertNotNull(document12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37121);org.junit.Assert.assertNotNull(element14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37122);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37123);org.junit.Assert.assertNotNull(elements16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37124);org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37125);org.junit.Assert.assertNotNull(document20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37126);org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37127);org.junit.Assert.assertNotNull(document22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37128);org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37129);org.junit.Assert.assertNotNull(element24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37130);org.junit.Assert.assertNotNull(document26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37131);org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37132);org.junit.Assert.assertNotNull(elements28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37133);org.junit.Assert.assertNotNull(elements30);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37134);org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37135);org.junit.Assert.assertNotNull(elements33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37136);org.junit.Assert.assertNotNull(document35);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37137);org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37138);org.junit.Assert.assertNotNull(elements37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37139);org.junit.Assert.assertNotNull(element38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37140);org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37141);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37142);org.junit.Assert.assertNotNull(document46);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37143);org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37144);org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str48, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37145);org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37146);org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#root" + "'", str51, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37147);org.junit.Assert.assertNotNull(document53);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37148);org.junit.Assert.assertNotNull(element55);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37149);org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37150);org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37151);org.junit.Assert.assertNotNull(element59);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37152);org.junit.Assert.assertNotNull(element60);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37153);org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1103() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fwqfrwso2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1103",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fwqfrwso2() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37154);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37155);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37156)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37157)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37158);System.out.format("%n%s%n", "RegressionTest2.test1103");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37159);org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37160);String str2 = textNode1.getWholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37161);boolean boolean4 = textNode1.hasAttr("Content-Encoding=#declaration");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37162);org.junit.Assert.assertNotNull(textNode1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37163);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37164);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1104() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j5qekdsod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1104",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37165,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j5qekdsod() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37165);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37166);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37167)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37168)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37169);System.out.format("%n%s%n", "RegressionTest2.test1104");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37170);org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType(":first-child", "<!#root!>", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", " hi!=\"multipart/form-data\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37171);String str5 = documentType4.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37172);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1105() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1meqdcusol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1105",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37173,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1meqdcusol() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37173);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37174);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37175)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37176)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37177);System.out.format("%n%s%n", "RegressionTest2.test1105");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37178);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37179);org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37180);String str5 = document4.wholeText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37181);org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37182);String str8 = document7.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37183);boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37184);org.jsoup.nodes.Document document10 = document4.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37185);document10.setBaseUri("#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37186);org.jsoup.select.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37187);org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType17 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37188);org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37189);String str20 = document19.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37190);org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37191);org.jsoup.nodes.Element element22 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType17, (org.jsoup.nodes.Element) document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37192);org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37193);String str25 = document24.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37194);String str26 = document24.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37195);org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37196);String str29 = document28.id();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37197);String str30 = document28.baseUri();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37198);org.jsoup.select.Evaluator.IndexLessThan indexLessThan32 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37199);boolean boolean33 = document28.is((org.jsoup.select.Evaluator) indexLessThan32);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37200);boolean boolean34 = isNthLastOfType17.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37201);String str35 = document28.cssSelector();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37202);org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37203);String str38 = document37.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37204);String str39 = document37.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37205);boolean boolean41 = document37.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37206);boolean boolean42 = indexLessThan14.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37207);org.jsoup.nodes.Element element43 = document10.prependChild((org.jsoup.nodes.Node) document37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37208);org.jsoup.nodes.Document document44 = element43.ownerDocument();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37209);boolean boolean45 = element43.hasParent();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37210);org.junit.Assert.assertNotNull(document4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37211);org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37212);org.junit.Assert.assertNotNull(document7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37213);org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37214);org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37215);org.junit.Assert.assertNotNull(document10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37216);org.junit.Assert.assertNotNull(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37217);org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37218);org.junit.Assert.assertNotNull(elements21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37219);org.junit.Assert.assertNull(element22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37220);org.junit.Assert.assertNotNull(document24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37221);org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37222);org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37223);org.junit.Assert.assertNotNull(document28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37224);org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37225);org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37226);org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37227);org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37228);org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37229);org.junit.Assert.assertNotNull(document37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37230);org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37231);org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str39, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37232);org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37233);org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37234);org.junit.Assert.assertNotNull(element43);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37235);org.junit.Assert.assertNotNull(document44);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37236);org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1106() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pnqc5bsqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1106",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37237,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pnqc5bsqd() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37237);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37238);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37239)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37240)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37241);System.out.format("%n%s%n", "RegressionTest2.test1106");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37242);org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":only-child");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1107() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1swqaxssqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1107",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37243,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1swqaxssqj() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37243);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37244);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37245)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37246)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37247);System.out.format("%n%s%n", "RegressionTest2.test1107");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37248);org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37249);attribute2.setKey("[#declaration!=content-encoding]");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1108() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w5q9q9sqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1108",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w5q9q9sqq() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37250);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37251);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37252)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37253)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37254);System.out.format("%n%s%n", "RegressionTest2.test1108");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37255);java.io.InputStream inputStream0 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37256);org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#root=\"\"", "#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37257);java.util.List<org.jsoup.nodes.Node> nodeList4 = document3.childNodes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37258);org.junit.Assert.assertNotNull(document3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37259);org.junit.Assert.assertNotNull(nodeList4);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1109() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zeq8iqsr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1109",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37260,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zeq8iqsr0() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37260);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37261);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37262)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37263)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37264);System.out.format("%n%s%n", "RegressionTest2.test1109");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37265);org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37266);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37267);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList0.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37268);boolean boolean4 = parseErrorList0.contains((Object) "#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37269);org.junit.Assert.assertNotNull(parseErrorList0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37270);org.junit.Assert.assertNotNull(parseErrorItor1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37271);org.junit.Assert.assertNotNull(parseErrorStream2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37272);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1110() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1z5im14srd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1110",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1z5im14srd() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37273);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37274);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37275)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37276)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37277);System.out.format("%n%s%n", "RegressionTest2.test1110");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37278);org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37279);boolean boolean1 = outputSettings0.outline();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37280);org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37281);org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings0.escapeMode();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37282);org.jsoup.nodes.Document.OutputSettings.Syntax syntax5 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37283);org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.syntax(syntax5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37284);org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37285);org.junit.Assert.assertNotNull(outputSettings3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37286);org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37287);org.junit.Assert.assertTrue("'" + syntax5 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax5.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37288);org.junit.Assert.assertNotNull(outputSettings6);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1111() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwin8nsrt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1111",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwin8nsrt() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37289);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37290);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37291)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37292)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37293);System.out.format("%n%s%n", "RegressionTest2.test1111");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37294);org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37295);String str3 = dataNode2.getWholeData();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37296);org.jsoup.nodes.DataNode dataNode5 = dataNode2.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37297);org.jsoup.nodes.DataNode dataNode7 = dataNode5.setWholeData("org.jsoup.HttpStatusException: multipart. Status=100, URL=application/x-www-form-urlencoded");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37298);org.junit.Assert.assertNotNull(dataNode2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37299);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37300);org.junit.Assert.assertNotNull(dataNode5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37301);org.junit.Assert.assertNotNull(dataNode7);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1112() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sniog6ss6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1112",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sniog6ss6() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37302);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37303);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37304)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37305)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37306);System.out.format("%n%s%n", "RegressionTest2.test1112");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37307);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37308);org.jsoup.Connection.Response response1 = httpConnection0.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37309);String str2 = response1.statusMessage();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37310);org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37311);org.jsoup.Connection.Response response6 = response4.charset("PUBLIC");
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37312);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37313);org.jsoup.nodes.Document document7 = response6.parse();
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37314);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37315);org.junit.Assert.assertNotNull(response1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37316);org.junit.Assert.assertNull(str2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37317);org.junit.Assert.assertNotNull(response4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37318);org.junit.Assert.assertNotNull(response6);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1113() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1peipnpssn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1113",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1peipnpssn() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37319);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37320);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37321)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37322)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37323);System.out.format("%n%s%n", "RegressionTest2.test1113");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37324);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37325);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37326);org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37327);org.jsoup.Connection.Response response4 = httpConnection0.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37328);java.net.URL uRL5 = response4.url();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37329);org.jsoup.Connection.Response response7 = response4.charset("PUBLIC");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37330);org.jsoup.Connection.Response response9 = response4.removeHeader(":matchesOwn(null)");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37331);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37332);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37333);org.junit.Assert.assertNotNull(response4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37334);org.junit.Assert.assertNull(uRL5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37335);org.junit.Assert.assertNotNull(response7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37336);org.junit.Assert.assertNotNull(response9);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1114() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5iqv8st5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1114",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5iqv8st5() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37337);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37338);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37339)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37340)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37341);System.out.format("%n%s%n", "RegressionTest2.test1114");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37342);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37343);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37344);java.io.InputStream inputStream4 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37345);org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37346);org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37347);org.jsoup.Connection.Request request8 = httpConnection7.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37348);org.jsoup.Connection.Request request11 = request8.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37349);java.util.Map<String, java.util.List<String>> strMap12 = request11.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37350);java.util.Map<String, String> strMap13 = request11.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37351);org.jsoup.Connection connection14 = httpConnection0.headers(strMap13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37352);org.jsoup.Connection connection16 = httpConnection0.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37353);org.jsoup.Connection connection19 = httpConnection0.proxy(":containsData( )", (int) (byte) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37354);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37355);org.junit.Assert.assertNotNull(connection6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37356);org.junit.Assert.assertNotNull(request8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37357);org.junit.Assert.assertNotNull(request11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37358);org.junit.Assert.assertNotNull(strMap12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37359);org.junit.Assert.assertNotNull(strMap13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37360);org.junit.Assert.assertNotNull(connection14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37361);org.junit.Assert.assertNotNull(connection16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37362);org.junit.Assert.assertNotNull(connection19);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1115() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iwis2rstv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1115",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37363,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iwis2rstv() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37363);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37364);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37365)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37366)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37367);System.out.format("%n%s%n", "RegressionTest2.test1115");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37368);org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37369);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37370);boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37371);java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.listIterator();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37372);String str4 = parseErrorList1.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37373);boolean boolean5 = parseErrorList1.isEmpty();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37374);org.junit.Assert.assertNotNull(parseErrorArray0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37375);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37376);org.junit.Assert.assertNotNull(parseErrorItor3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37377);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37378);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1116() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fnitaasub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1116",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fnitaasub() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37379);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37380);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37381)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37382)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37383);System.out.format("%n%s%n", "RegressionTest2.test1116");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37384);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37385);javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37386);org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37387);javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37388);org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37389);org.jsoup.Connection.Request request5 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37390);org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37391);org.jsoup.Connection.Request request7 = httpConnection6.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37392);org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37393);org.jsoup.Connection.Method method11 = request7.method();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37394);org.jsoup.Connection connection12 = httpConnection0.method(method11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37395);org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37396);javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37397);org.jsoup.Connection connection15 = httpConnection13.sslSocketFactory(sSLSocketFactory14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37398);javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37399);org.jsoup.Connection connection17 = httpConnection13.sslSocketFactory(sSLSocketFactory16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37400);org.jsoup.Connection.Request request18 = httpConnection13.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37401);org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37402);org.jsoup.Connection.Request request20 = httpConnection19.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37403);org.jsoup.Connection.Request request23 = request20.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37404);java.util.Map<String, java.util.List<String>> strMap24 = request23.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37405);java.util.Map<String, String> strMap25 = request23.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37406);org.jsoup.Connection connection26 = httpConnection13.headers(strMap25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37407);org.jsoup.Connection connection27 = httpConnection0.headers(strMap25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37408);org.junit.Assert.assertNotNull(connection2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37409);org.junit.Assert.assertNotNull(connection4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37410);org.junit.Assert.assertNotNull(request5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37411);org.junit.Assert.assertNotNull(request7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37412);org.junit.Assert.assertNotNull(request10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37413);org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37414);org.junit.Assert.assertNotNull(connection12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37415);org.junit.Assert.assertNotNull(connection15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37416);org.junit.Assert.assertNotNull(connection17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37417);org.junit.Assert.assertNotNull(request18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37418);org.junit.Assert.assertNotNull(request20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37419);org.junit.Assert.assertNotNull(request23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37420);org.junit.Assert.assertNotNull(strMap24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37421);org.junit.Assert.assertNotNull(strMap25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37422);org.junit.Assert.assertNotNull(connection26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37423);org.junit.Assert.assertNotNull(connection27);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1117() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ceiuhtsvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1117",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ceiuhtsvk() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37424);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37425);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37426)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37427)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37428);System.out.format("%n%s%n", "RegressionTest2.test1117");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37429);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37430);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37431);org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37432);org.jsoup.Connection.Response response4 = httpConnection0.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37433);org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37434);java.io.InputStream inputStream9 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37435);org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.htmlParser();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37436);org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream9, "", "#root", parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37437);org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37438);org.jsoup.Connection connection15 = connection6.parser(parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37439);org.jsoup.Connection connection17 = connection15.ignoreContentType(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37440);java.net.Proxy proxy18 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37441);org.jsoup.Connection connection19 = connection17.proxy(proxy18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37442);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37443);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37444);org.junit.Assert.assertNotNull(response4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37445);org.junit.Assert.assertNotNull(connection6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37446);org.junit.Assert.assertNotNull(parser12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37447);org.junit.Assert.assertNotNull(document13);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37448);org.junit.Assert.assertNotNull(document14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37449);org.junit.Assert.assertNotNull(connection15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37450);org.junit.Assert.assertNotNull(connection17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37451);org.junit.Assert.assertNotNull(connection19);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1118() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_195ivpcswc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1118",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_195ivpcswc() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37452);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37453);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37454)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37455)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37456);System.out.format("%n%s%n", "RegressionTest2.test1118");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37457);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37458);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37459);org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37460);org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37461);javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37462);org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37463);javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37464);org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37465);org.jsoup.Connection.Request request9 = httpConnection4.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37466);org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37467);org.jsoup.Connection.Request request11 = httpConnection10.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37468);org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37469);java.util.Map<String, java.util.List<String>> strMap15 = request14.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37470);java.util.Map<String, String> strMap16 = request14.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37471);org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37472);org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37473);java.io.InputStream inputStream23 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37474);org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream23);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37475);java.io.InputStream inputStream25 = keyVal24.inputStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37476);org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37477);javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37478);org.jsoup.Connection connection28 = httpConnection26.sslSocketFactory(sSLSocketFactory27);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37479);javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37480);org.jsoup.Connection connection30 = httpConnection26.sslSocketFactory(sSLSocketFactory29);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37481);org.jsoup.Connection.Request request31 = httpConnection26.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37482);org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37483);org.jsoup.Connection.Request request33 = httpConnection32.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37484);org.jsoup.Connection.Request request36 = request33.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37485);java.util.Map<String, java.util.List<String>> strMap37 = request36.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37486);java.util.Map<String, String> strMap38 = request36.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37487);org.jsoup.Connection connection39 = httpConnection26.headers(strMap38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37488);java.io.InputStream inputStream42 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37489);org.jsoup.internal.ConstrainableInputStream constrainableInputStream45 = new org.jsoup.internal.ConstrainableInputStream(inputStream42, 1, (int) (byte) 0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37490);org.jsoup.Connection connection46 = httpConnection26.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream45);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37491);org.jsoup.helper.HttpConnection.KeyVal keyVal47 = keyVal24.inputStream((java.io.InputStream) constrainableInputStream45);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37492);constrainableInputStream45.skipNBytes(0L);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37493);org.jsoup.Connection connection50 = httpConnection0.data("[:eq(-1)!=#doctype]", ":contains(content-encoding)", (java.io.InputStream) constrainableInputStream45);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37494);java.io.OutputStream outputStream51 = null;
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37495);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37496);long long52 = constrainableInputStream45.transferTo(outputStream51);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37497);org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37498);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37499);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37500);org.junit.Assert.assertNotNull(connection6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37501);org.junit.Assert.assertNotNull(connection8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37502);org.junit.Assert.assertNotNull(request9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37503);org.junit.Assert.assertNotNull(request11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37504);org.junit.Assert.assertNotNull(request14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37505);org.junit.Assert.assertNotNull(strMap15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37506);org.junit.Assert.assertNotNull(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37507);org.junit.Assert.assertNotNull(connection17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37508);org.junit.Assert.assertNotNull(connection18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37509);org.junit.Assert.assertNotNull(keyVal24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37510);org.junit.Assert.assertNull(inputStream25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37511);org.junit.Assert.assertNotNull(connection28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37512);org.junit.Assert.assertNotNull(connection30);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37513);org.junit.Assert.assertNotNull(request31);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37514);org.junit.Assert.assertNotNull(request33);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37515);org.junit.Assert.assertNotNull(request36);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37516);org.junit.Assert.assertNotNull(strMap37);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37517);org.junit.Assert.assertNotNull(strMap38);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37518);org.junit.Assert.assertNotNull(connection39);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37519);org.junit.Assert.assertNotNull(connection46);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37520);org.junit.Assert.assertNotNull(keyVal47);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37521);org.junit.Assert.assertNotNull(connection50);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1119() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15wiwwvsya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1119",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15wiwwvsya() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37522);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37523);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37524)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37525)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37526);System.out.format("%n%s%n", "RegressionTest2.test1119");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37527);org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37528);boolean boolean1 = outputSettings0.outline();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37529);org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.outline(false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37530);boolean boolean4 = outputSettings3.outline();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37531);boolean boolean5 = outputSettings3.prettyPrint();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37532);org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37533);org.junit.Assert.assertNotNull(outputSettings3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37534);org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37535);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1120() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15fnphlsyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1120",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15fnphlsyo() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37536);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37537);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37538)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37539)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37540);System.out.format("%n%s%n", "RegressionTest2.test1120");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37541);org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37542);org.jsoup.nodes.Element element3 = document1.val("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37543);org.jsoup.nodes.Element element4 = document1.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37544);org.jsoup.nodes.Element element6 = document1.appendText("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37545);String str7 = document1.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37546);org.junit.Assert.assertNotNull(document1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37547);org.junit.Assert.assertNotNull(element3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37548);org.junit.Assert.assertNotNull(element4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37549);org.junit.Assert.assertNotNull(element6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37550);org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str7, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1121() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_126nqp4sz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1121",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_126nqp4sz3() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37551);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37552);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37553)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37554)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37555);System.out.format("%n%s%n", "RegressionTest2.test1121");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37556);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37557);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37558);org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37559);java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37560);java.util.Map<String, String> strMap6 = request4.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37561);org.jsoup.Connection.Request request9 = request4.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37562);boolean boolean11 = request9.hasHeader("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37563);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37564);org.junit.Assert.assertNotNull(request4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37565);org.junit.Assert.assertNotNull(strMap5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37566);org.junit.Assert.assertNotNull(strMap6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37567);org.junit.Assert.assertNotNull(request9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37568);org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1122() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_112c83dszl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1122",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_112c83dszl() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37569);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37570);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37571)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37572)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37573);System.out.format("%n%s%n", "RegressionTest2.test1122");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37574);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37575);org.jsoup.Connection.Request request1 = httpConnection0.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37576);org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37577);org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37578);javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37579);org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37580);javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37581);org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37582);org.jsoup.Connection.Request request9 = httpConnection4.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37583);org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37584);org.jsoup.Connection.Request request11 = httpConnection10.request();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37585);org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37586);java.util.Map<String, java.util.List<String>> strMap15 = request14.multiHeaders();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37587);java.util.Map<String, String> strMap16 = request14.cookies();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37588);org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37589);org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37590);org.jsoup.Connection connection20 = httpConnection0.referrer("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37591);org.jsoup.Connection.Response response21 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37592);org.jsoup.Connection connection22 = httpConnection0.response(response21);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37593);org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37594);org.jsoup.Connection.Response response24 = httpConnection23.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37595);String str25 = response24.statusMessage();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37596);String str26 = response24.statusMessage();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37597);org.jsoup.Connection.Method method27 = response24.method();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37598);String str28 = response24.charset();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37599);org.jsoup.Connection connection29 = connection22.response(response24);
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37600);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37601);byte[] byteArray30 = response24.bodyAsBytes();
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37602);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37603);org.junit.Assert.assertNotNull(request1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37604);org.junit.Assert.assertNotNull(connection3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37605);org.junit.Assert.assertNotNull(connection6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37606);org.junit.Assert.assertNotNull(connection8);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37607);org.junit.Assert.assertNotNull(request9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37608);org.junit.Assert.assertNotNull(request11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37609);org.junit.Assert.assertNotNull(request14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37610);org.junit.Assert.assertNotNull(strMap15);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37611);org.junit.Assert.assertNotNull(strMap16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37612);org.junit.Assert.assertNotNull(connection17);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37613);org.junit.Assert.assertNotNull(connection18);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37614);org.junit.Assert.assertNotNull(connection20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37615);org.junit.Assert.assertNotNull(connection22);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37616);org.junit.Assert.assertNotNull(response24);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37617);org.junit.Assert.assertNull(str25);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37618);org.junit.Assert.assertNull(str26);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37619);org.junit.Assert.assertNull(method27);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37620);org.junit.Assert.assertNull(str28);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37621);org.junit.Assert.assertNotNull(connection29);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1123() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14bc6vut12();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1123",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37622,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14bc6vut12() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37622);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37623);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37624)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37625)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37626);System.out.format("%n%s%n", "RegressionTest2.test1123");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37627);org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37628);org.jsoup.Connection.Response response1 = httpConnection0.response();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37629);String str2 = response1.statusMessage();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37630);org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37631);org.jsoup.Connection.Response response6 = response4.charset("PUBLIC");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37632);java.util.Map<String, String> strMap7 = response6.headers();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37633);org.junit.Assert.assertNotNull(response1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37634);org.junit.Assert.assertNull(str2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37635);org.junit.Assert.assertNotNull(response4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37636);org.junit.Assert.assertNotNull(response6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37637);org.junit.Assert.assertNotNull(strMap7);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1124() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17kc5obt1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1124",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17kc5obt1i() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37638);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37639);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37640)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37641)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37642);System.out.format("%n%s%n", "RegressionTest2.test1124");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37643);org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37644);String str2 = elements1.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37645);org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37646);java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37647);boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37648);org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.noTracking();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37649);int int7 = parseErrorList4.indexOf((Object) parseErrorList6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37650);org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37651);javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37652);org.jsoup.Connection connection10 = httpConnection8.sslSocketFactory(sSLSocketFactory9);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37653);javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37654);org.jsoup.Connection connection12 = httpConnection8.sslSocketFactory(sSLSocketFactory11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37655);org.jsoup.Connection connection14 = httpConnection8.ignoreContentType(true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37656);boolean boolean15 = parseErrorList4.equals((Object) true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37657);java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream16 = parseErrorList4.parallelStream();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37658);boolean boolean17 = elements1.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37659);org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37660);org.junit.Assert.assertNotNull(parseErrorArray3);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37661);org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37662);org.junit.Assert.assertNotNull(parseErrorList6);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37663);org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37664);org.junit.Assert.assertNotNull(connection10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37665);org.junit.Assert.assertNotNull(connection12);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37666);org.junit.Assert.assertNotNull(connection14);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37667);org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37668);org.junit.Assert.assertNotNull(parseErrorStream16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37669);org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1125() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1atc4gst2e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1125",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1atc4gst2e() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37670);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37671);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37672)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37673)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37674);System.out.format("%n%s%n", "RegressionTest2.test1125");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37675);org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("SYSTEM", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37676);String str3 = keyVal2.value();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37677);String str4 = keyVal2.toString();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37678);org.junit.Assert.assertNotNull(keyVal2);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37679);org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37680);org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SYSTEM=<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str4, "SYSTEM=<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1126() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e2c399t2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1126",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e2c399t2p() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37681);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37682);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37683)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37684)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37685);System.out.format("%n%s%n", "RegressionTest2.test1126");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37686);org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.simpleText();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37687);org.jsoup.safety.Cleaner cleaner1 = new org.jsoup.safety.Cleaner(whitelist0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37688);String[] strArray11 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37689);boolean boolean12 = org.jsoup.internal.StringUtil.in("", strArray11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37690);boolean boolean13 = org.jsoup.internal.StringUtil.in("", strArray11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37691);String str15 = org.jsoup.internal.StringUtil.join(strArray11, " hi!=\"multipart/form-data\"");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37692);org.jsoup.helper.Validate.noNullElements((Object[]) strArray11, ":first-of-type");
        // The following exception was thrown during execution in test generation
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37693);try {
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37694);org.jsoup.safety.Whitelist whitelist18 = whitelist0.removeProtocols("/form-data", "#doctype", strArray11);
            __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37695);org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot remove a protocol that is not set.");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37696);org.junit.Assert.assertNotNull(whitelist0);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37697);org.junit.Assert.assertNotNull(strArray11);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37698);org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37699);org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37700);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str15, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}

    @Test
    public void test1127() throws Throwable {__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceStart(getClass().getName(),37701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hbc21qt39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ql8ql8lh9yvhnw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ql8ql8lh9yvhnw.R.globalSliceEnd(getClass().getName(),"org.jsoup.mytests.RegressionTest2.test1127",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37701,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hbc21qt39() throws Throwable{try{__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37701);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37702);if ((((debug)&&(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37703)!=0|true))||(__CLR4_4_1ql8ql8lh9yvhnw.R.iget(37704)==0&false)))
            {__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37705);System.out.format("%n%s%n", "RegressionTest2.test1127");
        }__CLR4_4_1ql8ql8lh9yvhnw.R.inc(37706);org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37707);boolean boolean2 = tag1.formatAsBlock();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37708);org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37709);org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37710);attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37711);org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37712);org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37713);String str11 = document10.className();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37714);String str12 = document10.outerHtml();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37715);boolean boolean14 = document10.hasSameValue((Object) 1);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37716);String str15 = document10.tagName();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37717);org.jsoup.nodes.Element element16 = document10.head();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37718);org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37719);org.jsoup.nodes.Element element20 = document10.prependChild((org.jsoup.nodes.Node) document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37720);boolean boolean21 = tag1.equals((Object) document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37721);boolean boolean22 = tag1.isData();
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37722);org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37723);org.junit.Assert.assertNotNull(attributes5);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37724);org.junit.Assert.assertNotNull(document10);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37725);org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37726);org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37727);org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37728);org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37729);org.junit.Assert.assertNotNull(element16);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37730);org.junit.Assert.assertNotNull(document19);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37731);org.junit.Assert.assertNotNull(element20);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37732);org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        __CLR4_4_1ql8ql8lh9yvhnw.R.inc(37733);org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }finally{__CLR4_4_1ql8ql8lh9yvhnw.R.flushNeeded();}}
}

