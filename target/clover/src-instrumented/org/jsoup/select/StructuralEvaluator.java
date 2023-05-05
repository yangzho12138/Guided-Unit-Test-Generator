/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.nodes.Element;

/**
 * Base structural evaluator.
 */
abstract class StructuralEvaluator extends Evaluator {public static class __CLR4_4_19hi9hilh9yvgtf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,12375,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Evaluator evaluator;

    static class Root extends Evaluator {
        public boolean matches(Element root, Element element) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12294);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12295);return root == element;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}
    }

    static class Has extends StructuralEvaluator {
        public Has(Evaluator evaluator) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12296);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12297);this.evaluator = evaluator;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12298);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12299);for (Element e : element.getAllElements()) {{
                __CLR4_4_19hi9hilh9yvgtf.R.inc(12300);if ((((e != element && evaluator.matches(element, e))&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12301)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12302)==0&false)))
                    {__CLR4_4_19hi9hilh9yvgtf.R.inc(12303);return true;
            }}
            }__CLR4_4_19hi9hilh9yvgtf.R.inc(12304);return false;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12305);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12306);return String.format(":has(%s)", evaluator);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}
    }

    static class Not extends StructuralEvaluator {
        public Not(Evaluator evaluator) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12307);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12308);this.evaluator = evaluator;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        public boolean matches(Element root, Element node) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12309);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12310);return !evaluator.matches(root, node);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12311);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12312);return String.format(":not%s", evaluator);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}
    }

    static class Parent extends StructuralEvaluator {
        public Parent(Evaluator evaluator) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12313);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12314);this.evaluator = evaluator;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12315);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12316);if ((((root == element)&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12317)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12318)==0&false)))
                {__CLR4_4_19hi9hilh9yvgtf.R.inc(12319);return false;

            }__CLR4_4_19hi9hilh9yvgtf.R.inc(12320);Element parent = element.parent();
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12321);while (true) {{
                __CLR4_4_19hi9hilh9yvgtf.R.inc(12322);if ((((evaluator.matches(root, parent))&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12323)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12324)==0&false)))
                    {__CLR4_4_19hi9hilh9yvgtf.R.inc(12325);return true;
                }__CLR4_4_19hi9hilh9yvgtf.R.inc(12326);if ((((parent == root)&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12327)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12328)==0&false)))
                    {__CLR4_4_19hi9hilh9yvgtf.R.inc(12329);break;
                }__CLR4_4_19hi9hilh9yvgtf.R.inc(12330);parent = parent.parent();
            }
            }__CLR4_4_19hi9hilh9yvgtf.R.inc(12331);return false;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12332);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12333);return String.format(":parent%s", evaluator);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}
    }

    static class ImmediateParent extends StructuralEvaluator {
        public ImmediateParent(Evaluator evaluator) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12334);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12335);this.evaluator = evaluator;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12336);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12337);if ((((root == element)&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12338)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12339)==0&false)))
                {__CLR4_4_19hi9hilh9yvgtf.R.inc(12340);return false;

            }__CLR4_4_19hi9hilh9yvgtf.R.inc(12341);Element parent = element.parent();
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12342);return parent != null && evaluator.matches(root, parent);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12343);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12344);return String.format(":ImmediateParent%s", evaluator);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}
    }

    static class PreviousSibling extends StructuralEvaluator {
        public PreviousSibling(Evaluator evaluator) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12345);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12346);this.evaluator = evaluator;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12347);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12348);if ((((root == element)&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12349)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12350)==0&false)))
                {__CLR4_4_19hi9hilh9yvgtf.R.inc(12351);return false;

            }__CLR4_4_19hi9hilh9yvgtf.R.inc(12352);Element prev = element.previousElementSibling();

            __CLR4_4_19hi9hilh9yvgtf.R.inc(12353);while ((((prev != null)&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12354)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12355)==0&false))) {{
                __CLR4_4_19hi9hilh9yvgtf.R.inc(12356);if ((((evaluator.matches(root, prev))&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12357)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12358)==0&false)))
                    {__CLR4_4_19hi9hilh9yvgtf.R.inc(12359);return true;

                }__CLR4_4_19hi9hilh9yvgtf.R.inc(12360);prev = prev.previousElementSibling();
            }
            }__CLR4_4_19hi9hilh9yvgtf.R.inc(12361);return false;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12362);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12363);return String.format(":prev*%s", evaluator);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}
    }

    static class ImmediatePreviousSibling extends StructuralEvaluator {
        public ImmediatePreviousSibling(Evaluator evaluator) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12364);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12365);this.evaluator = evaluator;
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        public boolean matches(Element root, Element element) {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12366);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12367);if ((((root == element)&&(__CLR4_4_19hi9hilh9yvgtf.R.iget(12368)!=0|true))||(__CLR4_4_19hi9hilh9yvgtf.R.iget(12369)==0&false)))
                {__CLR4_4_19hi9hilh9yvgtf.R.inc(12370);return false;

            }__CLR4_4_19hi9hilh9yvgtf.R.inc(12371);Element prev = element.previousElementSibling();
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12372);return prev != null && evaluator.matches(root, prev);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_19hi9hilh9yvgtf.R.inc(12373);
            __CLR4_4_19hi9hilh9yvgtf.R.inc(12374);return String.format(":prev%s", evaluator);
        }finally{__CLR4_4_19hi9hilh9yvgtf.R.flushNeeded();}}
    }
}
