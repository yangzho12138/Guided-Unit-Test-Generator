/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.jsoup.select.NodeFilter.FilterResult.CONTINUE;
import static org.jsoup.select.NodeFilter.FilterResult.STOP;

/**
 * Collects a list of elements that match the supplied criteria.
 *
 * @author Jonathan Hedley
 */
public class Collector {public static class __CLR4_4_18lx8lxlh9yvgry{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,11196,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Collector() {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11157);
    }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}

    /**
     Build a list of elements, by visiting root and every descendant of root, and testing it against the evaluator.
     @param eval Evaluator to test elements against
     @param root root of tree to descend
     @return list of matches; empty if none
     */
    public static Elements collect (Evaluator eval, Element root) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11158);
        __CLR4_4_18lx8lxlh9yvgry.R.inc(11159);Elements elements = new Elements();
        __CLR4_4_18lx8lxlh9yvgry.R.inc(11160);NodeTraversor.traverse(new Accumulator(root, elements, eval), root);
        __CLR4_4_18lx8lxlh9yvgry.R.inc(11161);return elements;
    }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}

    private static class Accumulator implements NodeVisitor {
        private final Element root;
        private final Elements elements;
        private final Evaluator eval;

        Accumulator(Element root, Elements elements, Evaluator eval) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11162);
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11163);this.root = root;
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11164);this.elements = elements;
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11165);this.eval = eval;
        }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}

        public void head(Node node, int depth) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11166);
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11167);if ((((node instanceof Element)&&(__CLR4_4_18lx8lxlh9yvgry.R.iget(11168)!=0|true))||(__CLR4_4_18lx8lxlh9yvgry.R.iget(11169)==0&false))) {{
                __CLR4_4_18lx8lxlh9yvgry.R.inc(11170);Element el = (Element) node;
                __CLR4_4_18lx8lxlh9yvgry.R.inc(11171);if ((((eval.matches(root, el))&&(__CLR4_4_18lx8lxlh9yvgry.R.iget(11172)!=0|true))||(__CLR4_4_18lx8lxlh9yvgry.R.iget(11173)==0&false)))
                    {__CLR4_4_18lx8lxlh9yvgry.R.inc(11174);elements.add(el);
            }}
        }}finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}

        public void tail(Node node, int depth) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11175);
            // void
        }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}
    }

    public static Element findFirst(Evaluator eval, Element root) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11176);
        __CLR4_4_18lx8lxlh9yvgry.R.inc(11177);FirstFinder finder = new FirstFinder(root, eval);
        __CLR4_4_18lx8lxlh9yvgry.R.inc(11178);NodeTraversor.filter(finder, root);
        __CLR4_4_18lx8lxlh9yvgry.R.inc(11179);return finder.match;
    }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}

    private static class FirstFinder implements NodeFilter {
        private final Element root;
        private Element match = null;
        private final Evaluator eval;

        FirstFinder(Element root, Evaluator eval) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11180);
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11181);this.root = root;
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11182);this.eval = eval;
        }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}

        @Override
        public FilterResult head(Node node, int depth) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11183);
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11184);if ((((node instanceof Element)&&(__CLR4_4_18lx8lxlh9yvgry.R.iget(11185)!=0|true))||(__CLR4_4_18lx8lxlh9yvgry.R.iget(11186)==0&false))) {{
                __CLR4_4_18lx8lxlh9yvgry.R.inc(11187);Element el = (Element) node;
                __CLR4_4_18lx8lxlh9yvgry.R.inc(11188);if ((((eval.matches(root, el))&&(__CLR4_4_18lx8lxlh9yvgry.R.iget(11189)!=0|true))||(__CLR4_4_18lx8lxlh9yvgry.R.iget(11190)==0&false))) {{
                    __CLR4_4_18lx8lxlh9yvgry.R.inc(11191);match = el;
                    __CLR4_4_18lx8lxlh9yvgry.R.inc(11192);return STOP;
                }
            }}
            }__CLR4_4_18lx8lxlh9yvgry.R.inc(11193);return CONTINUE;
        }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}

        @Override
        public FilterResult tail(Node node, int depth) {try{__CLR4_4_18lx8lxlh9yvgry.R.inc(11194);
            __CLR4_4_18lx8lxlh9yvgry.R.inc(11195);return CONTINUE;
        }finally{__CLR4_4_18lx8lxlh9yvgry.R.flushNeeded();}}
    }

}
