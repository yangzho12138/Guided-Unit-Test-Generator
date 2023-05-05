/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Token queue tests.
 */
public class TokenQueueTest {static class __CLR4_4_1vg3vg3lh9yvht2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,40813,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void chompBalanced() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nznrdwvg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompBalanced",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nznrdwvg3(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40755);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40756);TokenQueue tq = new TokenQueue(":contains(one (two) three) four");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40757);String pre = tq.consumeTo("(");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40758);String guts = tq.chompBalanced('(', ')');
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40759);String remainder = tq.remainder();

        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40760);assertEquals(":contains", pre);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40761);assertEquals("one (two) three", guts);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40762);assertEquals(" four", remainder);
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    @Test public void chompEscapedBalanced() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1eylpnpvgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompEscapedBalanced",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1eylpnpvgb(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40763);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40764);TokenQueue tq = new TokenQueue(":contains(one (two) \\( \\) \\) three) four");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40765);String pre = tq.consumeTo("(");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40766);String guts = tq.chompBalanced('(', ')');
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40767);String remainder = tq.remainder();

        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40768);assertEquals(":contains", pre);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40769);assertEquals("one (two) \\( \\) \\) three", guts);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40770);assertEquals("one (two) ( ) ) three", TokenQueue.unescape(guts));
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40771);assertEquals(" four", remainder);
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    @Test public void chompBalancedMatchesAsMuchAsPossible() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqnixlvgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompBalancedMatchesAsMuchAsPossible",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqnixlvgk(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40772);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40773);TokenQueue tq = new TokenQueue("unbalanced(something(or another)) else");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40774);tq.consumeTo("(");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40775);String match = tq.chompBalanced('(', ')');
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40776);assertEquals("something(or another)", match);
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    @Test public void unescape() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dbipwfvgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.unescape",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dbipwfvgp(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40777);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40778);assertEquals("one ( ) \\", TokenQueue.unescape("one \\( \\) \\\\"));
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    @Test public void chompToIgnoreCase() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1v1a2drvgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompToIgnoreCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1v1a2drvgr(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40779);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40780);String t = "<textarea>one < two </TEXTarea>";
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40781);TokenQueue tq = new TokenQueue(t);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40782);String data = tq.chompToIgnoreCase("</textarea");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40783);assertEquals("<textarea>one < two ", data);

        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40784);tq = new TokenQueue("<textarea> one two < three </oops>");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40785);data = tq.chompToIgnoreCase("</textarea");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40786);assertEquals("<textarea> one two < three </oops>", data);
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    @Test public void addFirst() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1crxkayvgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.addFirst",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1crxkayvgz(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40787);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40788);TokenQueue tq = new TokenQueue("One Two");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40789);tq.consumeWord();
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40790);tq.addFirst("Three");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40791);assertEquals("Three Two", tq.remainder());
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}


    @Test public void consumeToIgnoreSecondCallTest() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b1ccgcvh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.consumeToIgnoreSecondCallTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b1ccgcvh4(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40792);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40793);String t = "<textarea>one < two </TEXTarea> third </TEXTarea>";
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40794);TokenQueue tq = new TokenQueue(t);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40795);String data = tq.chompToIgnoreCase("</textarea>");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40796);assertEquals("<textarea>one < two ", data);

        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40797);data = tq.chompToIgnoreCase("</textarea>");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40798);assertEquals(" third ", data);
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    @Test public void testNestedQuotes() {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15whj21vhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.testNestedQuotes",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15whj21vhb(){try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40799);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40800);validateNestedQuotes("<html><body><a id=\"identifier\" onclick=\"func('arg')\" /></body></html>", "a[onclick*=\"('arg\"]");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40801);validateNestedQuotes("<html><body><a id=\"identifier\" onclick=func('arg') /></body></html>", "a[onclick*=\"('arg\"]");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40802);validateNestedQuotes("<html><body><a id=\"identifier\" onclick='func(\"arg\")' /></body></html>", "a[onclick*='(\"arg']");
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40803);validateNestedQuotes("<html><body><a id=\"identifier\" onclick=func(\"arg\") /></body></html>", "a[onclick*='(\"arg']");
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    private static void validateNestedQuotes(String html, String selector) {try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40804);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40805);assertEquals("#identifier", Jsoup.parse(html).select(selector).first().cssSelector());
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}

    @Test
    public void chompBalancedThrowIllegalArgumentException() throws Exception {__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceStart(getClass().getName(),40806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mdvpx0vhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vg3vg3lh9yvht2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vg3vg3lh9yvht2.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.TokenQueueTest.chompBalancedThrowIllegalArgumentException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40806,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mdvpx0vhi() throws Exception{try{__CLR4_4_1vg3vg3lh9yvht2.R.inc(40806);
        __CLR4_4_1vg3vg3lh9yvht2.R.inc(40807);try {
            __CLR4_4_1vg3vg3lh9yvht2.R.inc(40808);TokenQueue tq = new TokenQueue("unbalanced(something(or another)) else");
            __CLR4_4_1vg3vg3lh9yvht2.R.inc(40809);tq.consumeTo("(");
            __CLR4_4_1vg3vg3lh9yvht2.R.inc(40810);tq.chompBalanced('(', '+');
            __CLR4_4_1vg3vg3lh9yvht2.R.inc(40811);org.junit.Assert.fail("should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            __CLR4_4_1vg3vg3lh9yvht2.R.inc(40812);assertEquals("Did not find balanced marker at \'something(or another)) else\'", expected.getMessage());
        }
    }finally{__CLR4_4_1vg3vg3lh9yvht2.R.flushNeeded();}}
}
