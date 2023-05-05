/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Base combining (and, or) evaluator.
 */
abstract class CombiningEvaluator extends Evaluator {public static class __CLR4_4_18n08n0lh9yvgs0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,11254,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final ArrayList<Evaluator> evaluators;
    int num = 0;

    CombiningEvaluator() {
        super();__CLR4_4_18n08n0lh9yvgs0.R.inc(11197);try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11196);
        __CLR4_4_18n08n0lh9yvgs0.R.inc(11198);evaluators = new ArrayList<>();
    }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

    CombiningEvaluator(Collection<Evaluator> evaluators) {
        this();__CLR4_4_18n08n0lh9yvgs0.R.inc(11200);try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11199);
        __CLR4_4_18n08n0lh9yvgs0.R.inc(11201);this.evaluators.addAll(evaluators);
        __CLR4_4_18n08n0lh9yvgs0.R.inc(11202);updateNumEvaluators();
    }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

    Evaluator rightMostEvaluator() {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11203);
        __CLR4_4_18n08n0lh9yvgs0.R.inc(11204);return (((num > 0 )&&(__CLR4_4_18n08n0lh9yvgs0.R.iget(11205)!=0|true))||(__CLR4_4_18n08n0lh9yvgs0.R.iget(11206)==0&false))? evaluators.get(num - 1) : null;
    }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}
    
    void replaceRightMostEvaluator(Evaluator replacement) {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11207);
        __CLR4_4_18n08n0lh9yvgs0.R.inc(11208);evaluators.set(num - 1, replacement);
    }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

    void updateNumEvaluators() {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11209);
        // used so we don't need to bash on size() for every match test
        __CLR4_4_18n08n0lh9yvgs0.R.inc(11210);num = evaluators.size();
    }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

    static final class And extends CombiningEvaluator {
        And(Collection<Evaluator> evaluators) {
            super(evaluators);__CLR4_4_18n08n0lh9yvgs0.R.inc(11212);try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11211);
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        And(Evaluator... evaluators) {
            this(Arrays.asList(evaluators));__CLR4_4_18n08n0lh9yvgs0.R.inc(11214);try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11213);
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element node) {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11215);
            __CLR4_4_18n08n0lh9yvgs0.R.inc(11216);for (int i = 0; (((i < num)&&(__CLR4_4_18n08n0lh9yvgs0.R.iget(11217)!=0|true))||(__CLR4_4_18n08n0lh9yvgs0.R.iget(11218)==0&false)); i++) {{
                __CLR4_4_18n08n0lh9yvgs0.R.inc(11219);Evaluator s = evaluators.get(i);
                __CLR4_4_18n08n0lh9yvgs0.R.inc(11220);if ((((!s.matches(root, node))&&(__CLR4_4_18n08n0lh9yvgs0.R.iget(11221)!=0|true))||(__CLR4_4_18n08n0lh9yvgs0.R.iget(11222)==0&false)))
                    {__CLR4_4_18n08n0lh9yvgs0.R.inc(11223);return false;
            }}
            }__CLR4_4_18n08n0lh9yvgs0.R.inc(11224);return true;
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11225);
            __CLR4_4_18n08n0lh9yvgs0.R.inc(11226);return StringUtil.join(evaluators, " ");
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}
    }

    static final class Or extends CombiningEvaluator {
        /**
         * Create a new Or evaluator. The initial evaluators are ANDed together and used as the first clause of the OR.
         * @param evaluators initial OR clause (these are wrapped into an AND evaluator).
         */
        Or(Collection<Evaluator> evaluators) {
            super();__CLR4_4_18n08n0lh9yvgs0.R.inc(11228);try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11227);
            __CLR4_4_18n08n0lh9yvgs0.R.inc(11229);if ((((num > 1)&&(__CLR4_4_18n08n0lh9yvgs0.R.iget(11230)!=0|true))||(__CLR4_4_18n08n0lh9yvgs0.R.iget(11231)==0&false)))
                {__CLR4_4_18n08n0lh9yvgs0.R.inc(11232);this.evaluators.add(new And(evaluators));
            }else // 0 or 1
                {__CLR4_4_18n08n0lh9yvgs0.R.inc(11233);this.evaluators.addAll(evaluators);
            }__CLR4_4_18n08n0lh9yvgs0.R.inc(11234);updateNumEvaluators();
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        Or(Evaluator... evaluators) { this(Arrays.asList(evaluators));__CLR4_4_18n08n0lh9yvgs0.R.inc(11236);try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11235); }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        Or() {
            super();__CLR4_4_18n08n0lh9yvgs0.R.inc(11238);try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11237);
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        public void add(Evaluator e) {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11239);
            __CLR4_4_18n08n0lh9yvgs0.R.inc(11240);evaluators.add(e);
            __CLR4_4_18n08n0lh9yvgs0.R.inc(11241);updateNumEvaluators();
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element node) {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11242);
            __CLR4_4_18n08n0lh9yvgs0.R.inc(11243);for (int i = 0; (((i < num)&&(__CLR4_4_18n08n0lh9yvgs0.R.iget(11244)!=0|true))||(__CLR4_4_18n08n0lh9yvgs0.R.iget(11245)==0&false)); i++) {{
                __CLR4_4_18n08n0lh9yvgs0.R.inc(11246);Evaluator s = evaluators.get(i);
                __CLR4_4_18n08n0lh9yvgs0.R.inc(11247);if ((((s.matches(root, node))&&(__CLR4_4_18n08n0lh9yvgs0.R.iget(11248)!=0|true))||(__CLR4_4_18n08n0lh9yvgs0.R.iget(11249)==0&false)))
                    {__CLR4_4_18n08n0lh9yvgs0.R.inc(11250);return true;
            }}
            }__CLR4_4_18n08n0lh9yvgs0.R.inc(11251);return false;
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18n08n0lh9yvgs0.R.inc(11252);
            __CLR4_4_18n08n0lh9yvgs0.R.inc(11253);return StringUtil.join(evaluators, ", ");
        }finally{__CLR4_4_18n08n0lh9yvgs0.R.flushNeeded();}}
    }
}
