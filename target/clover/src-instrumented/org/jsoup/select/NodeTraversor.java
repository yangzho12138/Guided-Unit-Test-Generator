/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter.FilterResult;

/**
 * Depth-first node traversor. Use to iterate through all nodes under and including the specified root node.
 * <p>
 * This implementation does not use recursion, so a deep DOM does not risk blowing the stack.
 * </p>
 */
public class NodeTraversor {public static class __CLR4_4_193c93clh9yvgt0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,11880,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private NodeVisitor visitor;

    /**
     * Create a new traversor.
     * @param visitor a class implementing the {@link NodeVisitor} interface, to be called when visiting each node.
     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.
     */
    public NodeTraversor(NodeVisitor visitor) {try{__CLR4_4_193c93clh9yvgt0.R.inc(11784);
        __CLR4_4_193c93clh9yvgt0.R.inc(11785);this.visitor = visitor;
    }finally{__CLR4_4_193c93clh9yvgt0.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of the root and all of its descendants.
     * @param root the root node point to traverse.
     * @deprecated Just use the static {@link NodeTraversor#filter(NodeFilter, Node)} method.
     */
    public void traverse(Node root) {try{__CLR4_4_193c93clh9yvgt0.R.inc(11786);
        __CLR4_4_193c93clh9yvgt0.R.inc(11787);traverse(visitor, root);
    }finally{__CLR4_4_193c93clh9yvgt0.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of the root and all of its descendants.
     * @param visitor Node visitor.
     * @param root the root node point to traverse.
     */
    public static void traverse(NodeVisitor visitor, Node root) {try{__CLR4_4_193c93clh9yvgt0.R.inc(11788);
        __CLR4_4_193c93clh9yvgt0.R.inc(11789);Node node = root;
        __CLR4_4_193c93clh9yvgt0.R.inc(11790);int depth = 0;
        
        __CLR4_4_193c93clh9yvgt0.R.inc(11791);while ((((node != null)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11792)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11793)==0&false))) {{
            __CLR4_4_193c93clh9yvgt0.R.inc(11794);visitor.head(node, depth);
            __CLR4_4_193c93clh9yvgt0.R.inc(11795);if ((((node.childNodeSize() > 0)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11796)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11797)==0&false))) {{
                __CLR4_4_193c93clh9yvgt0.R.inc(11798);node = node.childNode(0);
                __CLR4_4_193c93clh9yvgt0.R.inc(11799);depth++;
            } }else {{
                __CLR4_4_193c93clh9yvgt0.R.inc(11800);while ((((node.nextSibling() == null && depth > 0)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11801)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11802)==0&false))) {{
                    __CLR4_4_193c93clh9yvgt0.R.inc(11803);visitor.tail(node, depth);
                    __CLR4_4_193c93clh9yvgt0.R.inc(11804);node = node.parentNode();
                    __CLR4_4_193c93clh9yvgt0.R.inc(11805);depth--;
                }
                }__CLR4_4_193c93clh9yvgt0.R.inc(11806);visitor.tail(node, depth);
                __CLR4_4_193c93clh9yvgt0.R.inc(11807);if ((((node == root)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11808)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11809)==0&false)))
                    {__CLR4_4_193c93clh9yvgt0.R.inc(11810);break;
                }__CLR4_4_193c93clh9yvgt0.R.inc(11811);node = node.nextSibling();
            }
        }}
    }}finally{__CLR4_4_193c93clh9yvgt0.R.flushNeeded();}}

    /**
     * Start a depth-first traverse of all elements.
     * @param visitor Node visitor.
     * @param elements Elements to filter.
     */
    public static void traverse(NodeVisitor visitor, Elements elements) {try{__CLR4_4_193c93clh9yvgt0.R.inc(11812);
        __CLR4_4_193c93clh9yvgt0.R.inc(11813);Validate.notNull(visitor);
        __CLR4_4_193c93clh9yvgt0.R.inc(11814);Validate.notNull(elements);
        __CLR4_4_193c93clh9yvgt0.R.inc(11815);for (Element el : elements)
            {__CLR4_4_193c93clh9yvgt0.R.inc(11816);traverse(visitor, el);
    }}finally{__CLR4_4_193c93clh9yvgt0.R.flushNeeded();}}

    /**
     * Start a depth-first filtering of the root and all of its descendants.
     * @param filter Node visitor.
     * @param root the root node point to traverse.
     * @return The filter result of the root node, or {@link FilterResult#STOP}.
     */
    public static FilterResult filter(NodeFilter filter, Node root) {try{__CLR4_4_193c93clh9yvgt0.R.inc(11817);
        __CLR4_4_193c93clh9yvgt0.R.inc(11818);Node node = root;
        __CLR4_4_193c93clh9yvgt0.R.inc(11819);int depth = 0;

        __CLR4_4_193c93clh9yvgt0.R.inc(11820);while ((((node != null)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11821)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11822)==0&false))) {{
            __CLR4_4_193c93clh9yvgt0.R.inc(11823);FilterResult result = filter.head(node, depth);
            __CLR4_4_193c93clh9yvgt0.R.inc(11824);if ((((result == FilterResult.STOP)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11825)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11826)==0&false)))
                {__CLR4_4_193c93clh9yvgt0.R.inc(11827);return result;
            // Descend into child nodes:
            }__CLR4_4_193c93clh9yvgt0.R.inc(11828);if ((((result == FilterResult.CONTINUE && node.childNodeSize() > 0)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11829)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11830)==0&false))) {{
                __CLR4_4_193c93clh9yvgt0.R.inc(11831);node = node.childNode(0);
                __CLR4_4_193c93clh9yvgt0.R.inc(11832);++depth;
                __CLR4_4_193c93clh9yvgt0.R.inc(11833);continue;
            }
            // No siblings, move upwards:
            }__CLR4_4_193c93clh9yvgt0.R.inc(11834);while ((((node.nextSibling() == null && depth > 0)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11835)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11836)==0&false))) {{
                // 'tail' current node:
                __CLR4_4_193c93clh9yvgt0.R.inc(11837);if ((((result == FilterResult.CONTINUE || result == FilterResult.SKIP_CHILDREN)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11838)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11839)==0&false))) {{
                    __CLR4_4_193c93clh9yvgt0.R.inc(11840);result = filter.tail(node, depth);
                    __CLR4_4_193c93clh9yvgt0.R.inc(11841);if ((((result == FilterResult.STOP)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11842)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11843)==0&false)))
                        {__CLR4_4_193c93clh9yvgt0.R.inc(11844);return result;
                }}
                }__CLR4_4_193c93clh9yvgt0.R.inc(11845);Node prev = node; // In case we need to remove it below.
                __CLR4_4_193c93clh9yvgt0.R.inc(11846);node = node.parentNode();
                __CLR4_4_193c93clh9yvgt0.R.inc(11847);depth--;
                __CLR4_4_193c93clh9yvgt0.R.inc(11848);if ((((result == FilterResult.REMOVE)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11849)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11850)==0&false)))
                    {__CLR4_4_193c93clh9yvgt0.R.inc(11851);prev.remove(); // Remove AFTER finding parent.
                }__CLR4_4_193c93clh9yvgt0.R.inc(11852);result = FilterResult.CONTINUE; // Parent was not pruned.
            }
            // 'tail' current node, then proceed with siblings:
            }__CLR4_4_193c93clh9yvgt0.R.inc(11853);if ((((result == FilterResult.CONTINUE || result == FilterResult.SKIP_CHILDREN)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11854)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11855)==0&false))) {{
                __CLR4_4_193c93clh9yvgt0.R.inc(11856);result = filter.tail(node, depth);
                __CLR4_4_193c93clh9yvgt0.R.inc(11857);if ((((result == FilterResult.STOP)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11858)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11859)==0&false)))
                    {__CLR4_4_193c93clh9yvgt0.R.inc(11860);return result;
            }}
            }__CLR4_4_193c93clh9yvgt0.R.inc(11861);if ((((node == root)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11862)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11863)==0&false)))
                {__CLR4_4_193c93clh9yvgt0.R.inc(11864);return result;
            }__CLR4_4_193c93clh9yvgt0.R.inc(11865);Node prev = node; // In case we need to remove it below.
            __CLR4_4_193c93clh9yvgt0.R.inc(11866);node = node.nextSibling();
            __CLR4_4_193c93clh9yvgt0.R.inc(11867);if ((((result == FilterResult.REMOVE)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11868)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11869)==0&false)))
                {__CLR4_4_193c93clh9yvgt0.R.inc(11870);prev.remove(); // Remove AFTER finding sibling.
        }}
        // root == null?
        }__CLR4_4_193c93clh9yvgt0.R.inc(11871);return FilterResult.CONTINUE;
    }finally{__CLR4_4_193c93clh9yvgt0.R.flushNeeded();}}

    /**
     * Start a depth-first filtering of all elements.
     * @param filter Node filter.
     * @param elements Elements to filter.
     */
    public static void filter(NodeFilter filter, Elements elements) {try{__CLR4_4_193c93clh9yvgt0.R.inc(11872);
        __CLR4_4_193c93clh9yvgt0.R.inc(11873);Validate.notNull(filter);
        __CLR4_4_193c93clh9yvgt0.R.inc(11874);Validate.notNull(elements);
        __CLR4_4_193c93clh9yvgt0.R.inc(11875);for (Element el : elements)
            {__CLR4_4_193c93clh9yvgt0.R.inc(11876);if ((((filter(filter, el) == FilterResult.STOP)&&(__CLR4_4_193c93clh9yvgt0.R.iget(11877)!=0|true))||(__CLR4_4_193c93clh9yvgt0.R.iget(11878)==0&false)))
                {__CLR4_4_193c93clh9yvgt0.R.inc(11879);break;
    }}}finally{__CLR4_4_193c93clh9yvgt0.R.flushNeeded();}}
}
