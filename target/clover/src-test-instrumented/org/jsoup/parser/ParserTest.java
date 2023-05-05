/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {static class __CLR4_4_1veoveolh9yvhsw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,40715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void unescapeEntities() {__CLR4_4_1veoveolh9yvhsw.R.globalSliceStart(getClass().getName(),40704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_189549qveo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1veoveolh9yvhsw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1veoveolh9yvhsw.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserTest.unescapeEntities",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_189549qveo(){try{__CLR4_4_1veoveolh9yvhsw.R.inc(40704);
        __CLR4_4_1veoveolh9yvhsw.R.inc(40705);String s = Parser.unescapeEntities("One &amp; Two", false);
        __CLR4_4_1veoveolh9yvhsw.R.inc(40706);assertEquals("One & Two", s);
    }finally{__CLR4_4_1veoveolh9yvhsw.R.flushNeeded();}}

    @Test
    public void unescapeEntitiesHandlesLargeInput() {__CLR4_4_1veoveolh9yvhsw.R.globalSliceStart(getClass().getName(),40707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1346mw6ver();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1veoveolh9yvhsw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1veoveolh9yvhsw.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserTest.unescapeEntitiesHandlesLargeInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40707,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1346mw6ver(){try{__CLR4_4_1veoveolh9yvhsw.R.inc(40707);
        __CLR4_4_1veoveolh9yvhsw.R.inc(40708);StringBuilder longBody = new StringBuilder(500000);
        __CLR4_4_1veoveolh9yvhsw.R.inc(40709);do {{
            __CLR4_4_1veoveolh9yvhsw.R.inc(40710);longBody.append("SomeNonEncodedInput");
        } }while ((((longBody.length() < 64 * 1024)&&(__CLR4_4_1veoveolh9yvhsw.R.iget(40711)!=0|true))||(__CLR4_4_1veoveolh9yvhsw.R.iget(40712)==0&false)));

        __CLR4_4_1veoveolh9yvhsw.R.inc(40713);String body = longBody.toString();
        __CLR4_4_1veoveolh9yvhsw.R.inc(40714);assertEquals(body, Parser.unescapeEntities(body, false));
    }finally{__CLR4_4_1veoveolh9yvhsw.R.flushNeeded();}}
}