/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.MultiLocaleRule;
import org.jsoup.MultiLocaleRule.MultiLocaleTest;
import org.jsoup.nodes.Attributes;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserSettingsTest {static class __CLR4_4_1ve1ve1lh9yvhst{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,40704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Rule public MultiLocaleRule rule = new MultiLocaleRule();

    @Test @MultiLocaleTest public void caseSupport() {__CLR4_4_1ve1ve1lh9yvhst.R.globalSliceStart(getClass().getName(),40681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a25dlmve1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ve1ve1lh9yvhst.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ve1ve1lh9yvhst.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserSettingsTest.caseSupport",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a25dlmve1(){try{__CLR4_4_1ve1ve1lh9yvhst.R.inc(40681);
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40682);ParseSettings bothOn = new ParseSettings(true, true);
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40683);ParseSettings bothOff = new ParseSettings(false, false);
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40684);ParseSettings tagOn = new ParseSettings(true, false);
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40685);ParseSettings attrOn = new ParseSettings(false, true);

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40686);assertEquals("IMG", bothOn.normalizeTag("IMG"));
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40687);assertEquals("ID", bothOn.normalizeAttribute("ID"));

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40688);assertEquals("img", bothOff.normalizeTag("IMG"));
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40689);assertEquals("id", bothOff.normalizeAttribute("ID"));

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40690);assertEquals("IMG", tagOn.normalizeTag("IMG"));
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40691);assertEquals("id", tagOn.normalizeAttribute("ID"));

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40692);assertEquals("img", attrOn.normalizeTag("IMG"));
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40693);assertEquals("ID", attrOn.normalizeAttribute("ID"));
    }finally{__CLR4_4_1ve1ve1lh9yvhst.R.flushNeeded();}}

    @Test @MultiLocaleTest public void attributeCaseNormalization() throws Exception {__CLR4_4_1ve1ve1lh9yvhst.R.globalSliceStart(getClass().getName(),40694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14vemgvee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ve1ve1lh9yvhst.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ve1ve1lh9yvhst.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserSettingsTest.attributeCaseNormalization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14vemgvee() throws Exception{try{__CLR4_4_1ve1ve1lh9yvhst.R.inc(40694);
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40695);ParseSettings parseSettings = new ParseSettings(false, false);

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40696);String normalizedAttribute = parseSettings.normalizeAttribute("HIDDEN");

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40697);assertEquals("hidden", normalizedAttribute);
    }finally{__CLR4_4_1ve1ve1lh9yvhst.R.flushNeeded();}}

    @Test @MultiLocaleTest public void attributesCaseNormalization() throws Exception {__CLR4_4_1ve1ve1lh9yvhst.R.globalSliceStart(getClass().getName(),40698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hvzf7nvei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ve1ve1lh9yvhst.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ve1ve1lh9yvhst.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.ParserSettingsTest.attributesCaseNormalization",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),40698,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hvzf7nvei() throws Exception{try{__CLR4_4_1ve1ve1lh9yvhst.R.inc(40698);
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40699);ParseSettings parseSettings = new ParseSettings(false, false);
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40700);Attributes attributes = new Attributes();
        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40701);attributes.put("ITEM", "1");

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40702);Attributes normalizedAttributes = parseSettings.normalizeAttributes(attributes);

        __CLR4_4_1ve1ve1lh9yvhst.R.inc(40703);assertEquals("item", normalizedAttributes.asList().get(0).getKey());
    }finally{__CLR4_4_1ve1ve1lh9yvhst.R.flushNeeded();}}
}
