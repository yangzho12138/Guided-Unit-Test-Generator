/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import static org.junit.Assert.assertEquals;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class TraversorTest {static class __CLR4_4_1wo9wo9lh9yvhvj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,42409,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Note: NodeTraversor.traverse(new NodeVisitor) is tested in
    // ElementsTest#traverse()

    @Test
    public void filterVisit() {__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceStart(getClass().getName(),42345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19i2umywo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wo9wo9lh9yvhvj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterVisit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19i2umywo9(){try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42345);
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42346);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42347);final StringBuilder accum = new StringBuilder();
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42348);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42349);
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42350);accum.append("<").append(node.nodeName()).append(">");
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42351);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42352);
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42353);accum.append("</").append(node.nodeName()).append(">");
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42354);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42355);assertEquals("<div><p><#text></#text></p></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

    @Test
    public void filterSkipChildren() {__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceStart(getClass().getName(),42356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ps531wok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wo9wo9lh9yvhvj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterSkipChildren",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ps531wok(){try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42356);
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42357);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42358);final StringBuilder accum = new StringBuilder();
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42359);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42360);
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42361);accum.append("<").append(node.nodeName()).append(">");
                // OMIT contents of p:
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42362);return (((("p".equals(node.nodeName())) )&&(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42363)!=0|true))||(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42364)==0&false))? FilterResult.SKIP_CHILDREN : FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42365);
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42366);accum.append("</").append(node.nodeName()).append(">");
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42367);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42368);assertEquals("<div><p></p></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

    @Test
    public void filterSkipEntirely() {__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceStart(getClass().getName(),42369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1oahg78wox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wo9wo9lh9yvhvj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterSkipEntirely",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1oahg78wox(){try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42369);
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42370);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42371);final StringBuilder accum = new StringBuilder();
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42372);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42373);
                // OMIT p:
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42374);if (((("p".equals(node.nodeName()))&&(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42375)!=0|true))||(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42376)==0&false)))
                    {__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42377);return FilterResult.SKIP_ENTIRELY;
                }__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42378);accum.append("<").append(node.nodeName()).append(">");
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42379);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42380);
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42381);accum.append("</").append(node.nodeName()).append(">");
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42382);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42383);assertEquals("<div></div><div><#text></#text></div>", accum.toString());
    }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

    @Test
    public void filterRemove() {__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceStart(getClass().getName(),42384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1inp143wpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wo9wo9lh9yvhvj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1inp143wpc(){try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42384);
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42385);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There be <b>bold</b></div>");
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42386);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42387);
                // Delete "p" in head:
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42388);return (((("p".equals(node.nodeName())) )&&(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42389)!=0|true))||(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42390)==0&false))? FilterResult.REMOVE : FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42391);
                // Delete "b" in tail:
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42392);return (((("b".equals(node.nodeName())) )&&(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42393)!=0|true))||(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42394)==0&false))? FilterResult.REMOVE : FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42395);assertEquals("<div></div>\n<div>\n There be \n</div>", doc.select("body").html());
    }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

    @Test
    public void filterStop() {__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceStart(getClass().getName(),42396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16s2b35wpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wo9wo9lh9yvhvj.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wo9wo9lh9yvhvj.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.TraversorTest.filterStop",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),42396,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16s2b35wpo(){try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42396);
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42397);Document doc = Jsoup.parse("<div><p>Hello</p></div><div>There</div>");
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42398);final StringBuilder accum = new StringBuilder();
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42399);NodeTraversor.filter(new NodeFilter() {
            @Override
            public FilterResult head(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42400);
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42401);accum.append("<").append(node.nodeName()).append(">");
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42402);return FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}

            @Override
            public FilterResult tail(Node node, int depth) {try{__CLR4_4_1wo9wo9lh9yvhvj.R.inc(42403);
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42404);accum.append("</").append(node.nodeName()).append(">");
                // Stop after p.
                __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42405);return (((("p".equals(node.nodeName())) )&&(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42406)!=0|true))||(__CLR4_4_1wo9wo9lh9yvhvj.R.iget(42407)==0&false))? FilterResult.STOP : FilterResult.CONTINUE;
            }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}
        }, doc.select("div"));
        __CLR4_4_1wo9wo9lh9yvhvj.R.inc(42408);assertEquals("<div><p><#text></#text></p>", accum.toString());
    }finally{__CLR4_4_1wo9wo9lh9yvhvj.R.flushNeeded();}}
}
