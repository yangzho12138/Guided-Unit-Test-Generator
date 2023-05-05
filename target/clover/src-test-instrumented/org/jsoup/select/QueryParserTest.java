/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the Selector Query Parser.
 *
 * @author Jonathan Hedley
 */
public class QueryParserTest {static class __CLR4_4_1w7tw7tlh9yvhuv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,41778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void testOrGetsCorrectPrecedence() {__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceStart(getClass().getName(),41753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17gl8pjw7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7tw7tlh9yvhuv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.QueryParserTest.testOrGetsCorrectPrecedence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17gl8pjw7t(){try{__CLR4_4_1w7tw7tlh9yvhuv.R.inc(41753);
        // tests that a selector "a b, c d, e f" evals to (a AND b) OR (c AND d) OR (e AND f)"
        // top level or, three child ands
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41754);Evaluator eval = QueryParser.parse("a b, c d, e f");
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41755);assertTrue(eval instanceof CombiningEvaluator.Or);
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41756);CombiningEvaluator.Or or = (CombiningEvaluator.Or) eval;
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41757);assertEquals(3, or.evaluators.size());
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41758);for (Evaluator innerEval: or.evaluators) {{
            __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41759);assertTrue(innerEval instanceof CombiningEvaluator.And);
            __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41760);CombiningEvaluator.And and = (CombiningEvaluator.And) innerEval;
            __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41761);assertEquals(2, and.evaluators.size());
            __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41762);assertTrue(and.evaluators.get(0) instanceof Evaluator.Tag);
            __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41763);assertTrue(and.evaluators.get(1) instanceof StructuralEvaluator.Parent);
        }
    }}finally{__CLR4_4_1w7tw7tlh9yvhuv.R.flushNeeded();}}

    @Test public void testParsesMultiCorrectly() {__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceStart(getClass().getName(),41764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vnwghjw84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7tw7tlh9yvhuv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.QueryParserTest.testParsesMultiCorrectly",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41764,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vnwghjw84(){try{__CLR4_4_1w7tw7tlh9yvhuv.R.inc(41764);
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41765);Evaluator eval = QueryParser.parse(".foo > ol, ol > li + li");
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41766);assertTrue(eval instanceof CombiningEvaluator.Or);
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41767);CombiningEvaluator.Or or = (CombiningEvaluator.Or) eval;
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41768);assertEquals(2, or.evaluators.size());

        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41769);CombiningEvaluator.And andLeft = (CombiningEvaluator.And) or.evaluators.get(0);
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41770);CombiningEvaluator.And andRight = (CombiningEvaluator.And) or.evaluators.get(1);

        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41771);assertEquals("ol :ImmediateParent.foo", andLeft.toString());
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41772);assertEquals(2, andLeft.evaluators.size());
//        assertEquals("li :prevli :ImmediateParentol", andRight.toString());
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41773);assertEquals(2, andLeft.evaluators.size());
    }finally{__CLR4_4_1w7tw7tlh9yvhuv.R.flushNeeded();}}

    @Test(expected = Selector.SelectorParseException.class) public void exceptionOnUncloseAttribute() {__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceStart(getClass().getName(),41774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p979wyw8e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,101,120,99,101,112,116,105,111,110,79,110,85,110,99,108,111,115,101,65,116,116,114,105,98,117,116,101,58,32,91,83,101,108,101,99,116,111,114,46,83,101,108,101,99,116,111,114,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof Selector.SelectorParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7tw7tlh9yvhuv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.QueryParserTest.exceptionOnUncloseAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p979wyw8e(){try{__CLR4_4_1w7tw7tlh9yvhuv.R.inc(41774);
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41775);Evaluator parse = QueryParser.parse("section > a[href=\"]");
    }finally{__CLR4_4_1w7tw7tlh9yvhuv.R.flushNeeded();}}

    @Test(expected = Selector.SelectorParseException.class)  public void testParsesSingleQuoteInContains() {__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceStart(getClass().getName(),41776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5zac3w8g();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,114,115,101,115,83,105,110,103,108,101,81,117,111,116,101,73,110,67,111,110,116,97,105,110,115,58,32,91,83,101,108,101,99,116,111,114,46,83,101,108,101,99,116,111,114,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof Selector.SelectorParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1w7tw7tlh9yvhuv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1w7tw7tlh9yvhuv.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.QueryParserTest.testParsesSingleQuoteInContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41776,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5zac3w8g(){try{__CLR4_4_1w7tw7tlh9yvhuv.R.inc(41776);
        __CLR4_4_1w7tw7tlh9yvhuv.R.inc(41777);Evaluator parse = QueryParser.parse("p:contains(One \" One)");
    }finally{__CLR4_4_1w7tw7tlh9yvhuv.R.flushNeeded();}}
}
