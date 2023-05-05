/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for Attributes.
 *
 * @author Jonathan Hedley
 */
public class AttributesTest {static class __CLR4_4_1t4zt4zlh9yvhon{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,37862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void html() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p3af0yt4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.html",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p3af0yt4z(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37763);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37764);Attributes a = new Attributes();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37765);a.put("Tot", "a&p");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37766);a.put("Hello", "There");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37767);a.put("data-name", "Jsoup");

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37768);assertEquals(3, a.size());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37769);assertTrue(a.hasKey("Tot"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37770);assertTrue(a.hasKey("Hello"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37771);assertTrue(a.hasKey("data-name"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37772);assertFalse(a.hasKey("tot"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37773);assertTrue(a.hasKeyIgnoreCase("tot"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37774);assertEquals("There", a.getIgnoreCase("hEllo"));

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37775);Map<String, String> dataset = a.dataset();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37776);assertEquals(1, dataset.size());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37777);assertEquals("Jsoup", dataset.get("name"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37778);assertEquals("", a.get("tot"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37779);assertEquals("a&p", a.get("Tot"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37780);assertEquals("a&p", a.getIgnoreCase("tot"));

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37781);assertEquals(" Tot=\"a&amp;p\" Hello=\"There\" data-name=\"Jsoup\"", a.html());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37782);assertEquals(a.html(), a.toString());
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}

    @Test
    public void testIteratorRemovable() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uktq4it5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorRemovable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uktq4it5j(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37783);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37784);Attributes a = new Attributes();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37785);a.put("Tot", "a&p");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37786);a.put("Hello", "There");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37787);a.put("data-name", "Jsoup");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37788);assertTrue(a.hasKey("Tot"));

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37789);Iterator<Attribute> iterator = a.iterator();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37790);Attribute attr = iterator.next();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37791);assertEquals("Tot", attr.getKey());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37792);iterator.remove();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37793);assertEquals(2, a.size());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37794);attr = iterator.next();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37795);assertEquals("Hello", attr.getKey());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37796);assertEquals("There", attr.getValue());

        // make sure that's flowing to the underlying attributes object
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37797);assertEquals(2, a.size());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37798);assertEquals("There", a.get("Hello"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37799);assertFalse(a.hasKey("Tot"));
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}

    @Test
    public void testIteratorUpdateable() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14yhgl2t60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorUpdateable",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37800,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14yhgl2t60(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37800);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37801);Attributes a = new Attributes();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37802);a.put("Tot", "a&p");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37803);a.put("Hello", "There");

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37804);assertFalse(a.hasKey("Foo"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37805);Iterator<Attribute> iterator = a.iterator();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37806);Attribute attr = iterator.next();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37807);attr.setKey("Foo");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37808);attr = iterator.next();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37809);attr.setKey("Bar");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37810);attr.setValue("Qux");

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37811);assertEquals("a&p", a.get("Foo"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37812);assertEquals("Qux", a.get("Bar"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37813);assertFalse(a.hasKey("Tot"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37814);assertFalse(a.hasKey("Hello"));
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}

    @Test public void testIteratorHasNext() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lv4y6st6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorHasNext",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37815,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lv4y6st6f(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37815);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37816);Attributes a = new Attributes();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37817);a.put("Tot", "1");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37818);a.put("Hello", "2");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37819);a.put("data-name", "3");

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37820);int seen = 0;
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37821);for (Attribute attribute : a) {{
            __CLR4_4_1t4zt4zlh9yvhon.R.inc(37822);seen++;
            __CLR4_4_1t4zt4zlh9yvhon.R.inc(37823);assertEquals(String.valueOf(seen), attribute.getValue());
        }
        }__CLR4_4_1t4zt4zlh9yvhon.R.inc(37824);assertEquals(3, seen);
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d9uicnt6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIterator",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d9uicnt6p(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37825);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37826);Attributes a = new Attributes();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37827);String[][] datas = {{"Tot", "raul"},
            {"Hello", "pismuth"},
            {"data-name", "Jsoup"}};
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37828);for (String[] atts : datas) {{
            __CLR4_4_1t4zt4zlh9yvhon.R.inc(37829);a.put(atts[0], atts[1]);
        }

        }__CLR4_4_1t4zt4zlh9yvhon.R.inc(37830);Iterator<Attribute> iterator = a.iterator();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37831);assertTrue(iterator.hasNext());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37832);int i = 0;
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37833);for (Attribute attribute : a) {{
            __CLR4_4_1t4zt4zlh9yvhon.R.inc(37834);assertEquals(datas[i][0], attribute.getKey());
            __CLR4_4_1t4zt4zlh9yvhon.R.inc(37835);assertEquals(datas[i][1], attribute.getValue());
            __CLR4_4_1t4zt4zlh9yvhon.R.inc(37836);i++;
        }
        }__CLR4_4_1t4zt4zlh9yvhon.R.inc(37837);assertEquals(datas.length, i);
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}

    @Test
    public void testIteratorEmpty() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hj65vwt72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testIteratorEmpty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hj65vwt72(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37838);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37839);Attributes a = new Attributes();

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37840);Iterator<Attribute> iterator = a.iterator();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37841);assertFalse(iterator.hasNext());
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}

    @Test
    public void removeCaseSensitive() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1714p1zt76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.removeCaseSensitive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1714p1zt76(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37842);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37843);Attributes a = new Attributes();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37844);a.put("Tot", "a&p");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37845);a.put("tot", "one");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37846);a.put("Hello", "There");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37847);a.put("hello", "There");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37848);a.put("data-name", "Jsoup");

        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37849);assertEquals(5, a.size());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37850);a.remove("Tot");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37851);a.remove("Hello");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37852);assertEquals(3, a.size());
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37853);assertTrue(a.hasKey("tot"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37854);assertFalse(a.hasKey("Tot"));
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}

    @Test
    public void testSetKeyConsistency() {__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceStart(getClass().getName(),37855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vwk9w0t7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1t4zt4zlh9yvhon.R.rethrow($CLV_t2$);}finally{__CLR4_4_1t4zt4zlh9yvhon.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.AttributesTest.testSetKeyConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),37855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vwk9w0t7j(){try{__CLR4_4_1t4zt4zlh9yvhon.R.inc(37855);
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37856);Attributes a = new Attributes();
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37857);a.put("a", "a");
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37858);for(Attribute at : a) {{
            __CLR4_4_1t4zt4zlh9yvhon.R.inc(37859);at.setKey("b");
        }
        }__CLR4_4_1t4zt4zlh9yvhon.R.inc(37860);assertFalse("Attribute 'a' not correctly removed", a.hasKey("a"));
        __CLR4_4_1t4zt4zlh9yvhon.R.inc(37861);assertTrue("Attribute 'b' not present after renaming", a.hasKey("b"));
    }finally{__CLR4_4_1t4zt4zlh9yvhon.R.flushNeeded();}}
}
