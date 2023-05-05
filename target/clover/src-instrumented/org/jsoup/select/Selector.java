/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;

/**
 * CSS-like element selector, that finds elements matching a query.
 *
 * <h2>Selector syntax</h2>
 * <p>
 * A selector is a chain of simple selectors, separated by combinators. Selectors are <b>case insensitive</b> (including against
 * elements, attributes, and attribute values).
 * </p>
 * <p>
 * The universal selector (*) is implicit when no element selector is supplied (i.e. {@code *.header} and {@code .header}
 * is equivalent).
 * </p>
 * <style>table.syntax tr td {vertical-align: top; padding-right: 2em; padding-top:0.5em; padding-bottom:0.5em; } table.syntax tr:hover{background-color: #eee;} table.syntax {border-spacing: 0px 0px;}</style>
 * <table summary="" class="syntax"><colgroup><col span="1" style="width: 20%;"><col span="1" style="width: 40%;"><col span="1" style="width: 40%;"></colgroup>
 * <tr><th align="left">Pattern</th><th align="left">Matches</th><th align="left">Example</th></tr>
 * <tr><td><code>*</code></td><td>any element</td><td><code>*</code></td></tr>
 * <tr><td><code>tag</code></td><td>elements with the given tag name</td><td><code>div</code></td></tr>
 * <tr><td><code>*|E</code></td><td>elements of type E in any namespace <i>ns</i></td><td><code>*|name</code> finds <code>&lt;fb:name&gt;</code> elements</td></tr>
 * <tr><td><code>ns|E</code></td><td>elements of type E in the namespace <i>ns</i></td><td><code>fb|name</code> finds <code>&lt;fb:name&gt;</code> elements</td></tr>
 * <tr><td><code>#id</code></td><td>elements with attribute ID of "id"</td><td><code>div#wrap</code>, <code>#logo</code></td></tr>
 * <tr><td><code>.class</code></td><td>elements with a class name of "class"</td><td><code>div.left</code>, <code>.result</code></td></tr>
 * <tr><td><code>[attr]</code></td><td>elements with an attribute named "attr" (with any value)</td><td><code>a[href]</code>, <code>[title]</code></td></tr>
 * <tr><td><code>[^attrPrefix]</code></td><td>elements with an attribute name starting with "attrPrefix". Use to find elements with HTML5 datasets</td><td><code>[^data-]</code>, <code>div[^data-]</code></td></tr>
 * <tr><td><code>[attr=val]</code></td><td>elements with an attribute named "attr", and value equal to "val"</td><td><code>img[width=500]</code>, <code>a[rel=nofollow]</code></td></tr>
 * <tr><td><code>[attr=&quot;val&quot;]</code></td><td>elements with an attribute named "attr", and value equal to "val"</td><td><code>span[hello="Cleveland"][goodbye="Columbus"]</code>, <code>a[rel=&quot;nofollow&quot;]</code></td></tr>
 * <tr><td><code>[attr^=valPrefix]</code></td><td>elements with an attribute named "attr", and value starting with "valPrefix"</td><td><code>a[href^=http:]</code></td></tr>
 * <tr><td><code>[attr$=valSuffix]</code></td><td>elements with an attribute named "attr", and value ending with "valSuffix"</td><td><code>img[src$=.png]</code></td></tr>
 * <tr><td><code>[attr*=valContaining]</code></td><td>elements with an attribute named "attr", and value containing "valContaining"</td><td><code>a[href*=/search/]</code></td></tr>
 * <tr><td><code>[attr~=<em>regex</em>]</code></td><td>elements with an attribute named "attr", and value matching the regular expression</td><td><code>img[src~=(?i)\\.(png|jpe?g)]</code></td></tr>
 * <tr><td></td><td>The above may be combined in any order</td><td><code>div.header[title]</code></td></tr>
 * <tr><td><td colspan="3"><h3>Combinators</h3></td></tr>
 * <tr><td><code>E F</code></td><td>an F element descended from an E element</td><td><code>div a</code>, <code>.logo h1</code></td></tr>
 * <tr><td><code>E {@literal >} F</code></td><td>an F direct child of E</td><td><code>ol {@literal >} li</code></td></tr>
 * <tr><td><code>E + F</code></td><td>an F element immediately preceded by sibling E</td><td><code>li + li</code>, <code>div.head + div</code></td></tr>
 * <tr><td><code>E ~ F</code></td><td>an F element preceded by sibling E</td><td><code>h1 ~ p</code></td></tr>
 * <tr><td><code>E, F, G</code></td><td>all matching elements E, F, or G</td><td><code>a[href], div, h3</code></td></tr>
 * <tr><td><td colspan="3"><h3>Pseudo selectors</h3></td></tr>
 * <tr><td><code>:lt(<em>n</em>)</code></td><td>elements whose sibling index is less than <em>n</em></td><td><code>td:lt(3)</code> finds the first 3 cells of each row</td></tr>
 * <tr><td><code>:gt(<em>n</em>)</code></td><td>elements whose sibling index is greater than <em>n</em></td><td><code>td:gt(1)</code> finds cells after skipping the first two</td></tr>
 * <tr><td><code>:eq(<em>n</em>)</code></td><td>elements whose sibling index is equal to <em>n</em></td><td><code>td:eq(0)</code> finds the first cell of each row</td></tr>
 * <tr><td><code>:has(<em>selector</em>)</code></td><td>elements that contains at least one element matching the <em>selector</em></td><td><code>div:has(p)</code> finds <code>div</code>s that contain <code>p</code> elements.<br><code>div:has(&gt; a)</code> selects <code>div</code> elements that have at least one direct child <code>a</code> element.</td></tr>
 * <tr><td><code>:not(<em>selector</em>)</code></td><td>elements that do not match the <em>selector</em>. See also {@link Elements#not(String)}</td><td><code>div:not(.logo)</code> finds all divs that do not have the "logo" class.<p><code>div:not(:has(div))</code> finds divs that do not contain divs.</p></td></tr>
 * <tr><td><code>:contains(<em>text</em>)</code></td><td>elements that contains the specified text. The search is case insensitive. The text may appear in the found element, or any of its descendants.</td><td><code>p:contains(jsoup)</code> finds p elements containing the text "jsoup".</td></tr>
 * <tr><td><code>:matches(<em>regex</em>)</code></td><td>elements whose text matches the specified regular expression. The text may appear in the found element, or any of its descendants.</td><td><code>td:matches(\\d+)</code> finds table cells containing digits. <code>div:matches((?i)login)</code> finds divs containing the text, case insensitively.</td></tr>
 * <tr><td><code>:containsOwn(<em>text</em>)</code></td><td>elements that directly contain the specified text. The search is case insensitive. The text must appear in the found element, not any of its descendants.</td><td><code>p:containsOwn(jsoup)</code> finds p elements with own text "jsoup".</td></tr>
 * <tr><td><code>:matchesOwn(<em>regex</em>)</code></td><td>elements whose own text matches the specified regular expression. The text must appear in the found element, not any of its descendants.</td><td><code>td:matchesOwn(\\d+)</code> finds table cells directly containing digits. <code>div:matchesOwn((?i)login)</code> finds divs containing the text, case insensitively.</td></tr>
 * <tr><td><code>:containsData(<em>data</em>)</code></td><td>elements that contains the specified <em>data</em>. The contents of {@code script} and {@code style} elements, and {@code comment} nodes (etc) are considered data nodes, not text nodes. The search is case insensitive. The data may appear in the found element, or any of its descendants.</td><td><code>script:contains(jsoup)</code> finds script elements containing the data "jsoup".</td></tr>
 * <tr><td></td><td>The above may be combined in any order and with other selectors</td><td><code>.light:contains(name):eq(0)</code></td></tr>
 * <tr><td><code>:matchText</code></td><td>treats text nodes as elements, and so allows you to match against and select text nodes.<p><b>Note</b> that using this selector will modify the DOM, so you may want to {@code clone} your document before using.</td><td>{@code p:matchText:firstChild} with input {@code <p>One<br />Two</p>} will return one {@link org.jsoup.nodes.PseudoTextElement} with text "{@code One}".</td></tr>
 * <tr><td colspan="3"><h3>Structural pseudo selectors</h3></td></tr>
 * <tr><td><code>:root</code></td><td>The element that is the root of the document. In HTML, this is the <code>html</code> element</td><td><code>:root</code></td></tr>
 * <tr><td><code>:nth-child(<em>a</em>n+<em>b</em>)</code></td><td><p>elements that have <code><em>a</em>n+<em>b</em>-1</code> siblings <b>before</b> it in the document tree, for any positive integer or zero value of <code>n</code>, and has a parent element. For values of <code>a</code> and <code>b</code> greater than zero, this effectively divides the element's children into groups of a elements (the last group taking the remainder), and selecting the <em>b</em>th element of each group. For example, this allows the selectors to address every other row in a table, and could be used to alternate the color of paragraph text in a cycle of four. The <code>a</code> and <code>b</code> values must be integers (positive, negative, or zero). The index of the first child of an element is 1.</p>
 * In addition to this, <code>:nth-child()</code> can take <code>odd</code> and <code>even</code> as arguments instead. <code>odd</code> has the same signification as <code>2n+1</code>, and <code>even</code> has the same signification as <code>2n</code>.</td><td><code>tr:nth-child(2n+1)</code> finds every odd row of a table. <code>:nth-child(10n-1)</code> the 9th, 19th, 29th, etc, element. <code>li:nth-child(5)</code> the 5h li</td></tr>
 * <tr><td><code>:nth-last-child(<em>a</em>n+<em>b</em>)</code></td><td>elements that have <code><em>a</em>n+<em>b</em>-1</code> siblings <b>after</b> it in the document tree. Otherwise like <code>:nth-child()</code></td><td><code>tr:nth-last-child(-n+2)</code> the last two rows of a table</td></tr>
 * <tr><td><code>:nth-of-type(<em>a</em>n+<em>b</em>)</code></td><td>pseudo-class notation represents an element that has <code><em>a</em>n+<em>b</em>-1</code> siblings with the same expanded element name <em>before</em> it in the document tree, for any zero or positive integer value of n, and has a parent element</td><td><code>img:nth-of-type(2n+1)</code></td></tr>
 * <tr><td><code>:nth-last-of-type(<em>a</em>n+<em>b</em>)</code></td><td>pseudo-class notation represents an element that has <code><em>a</em>n+<em>b</em>-1</code> siblings with the same expanded element name <em>after</em> it in the document tree, for any zero or positive integer value of n, and has a parent element</td><td><code>img:nth-last-of-type(2n+1)</code></td></tr>
 * <tr><td><code>:first-child</code></td><td>elements that are the first child of some other element.</td><td><code>div {@literal >} p:first-child</code></td></tr>
 * <tr><td><code>:last-child</code></td><td>elements that are the last child of some other element.</td><td><code>ol {@literal >} li:last-child</code></td></tr>
 * <tr><td><code>:first-of-type</code></td><td>elements that are the first sibling of its type in the list of children of its parent element</td><td><code>dl dt:first-of-type</code></td></tr>
 * <tr><td><code>:last-of-type</code></td><td>elements that are the last sibling of its type in the list of children of its parent element</td><td><code>tr {@literal >} td:last-of-type</code></td></tr>
 * <tr><td><code>:only-child</code></td><td>elements that have a parent element and whose parent element have no other element children</td><td></td></tr>
 * <tr><td><code>:only-of-type</code></td><td> an element that has a parent element and whose parent element has no other element children with the same expanded element name</td><td></td></tr>
 * <tr><td><code>:empty</code></td><td>elements that have no children at all</td><td></td></tr>
 * </table>
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 * @see Element#select(String)
 */
public class Selector {public static class __CLR4_4_19gb9gblh9yvgtc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,12294,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // not instantiable
    public Selector() {try{__CLR4_4_19gb9gblh9yvgtc.R.inc(12251);}finally{__CLR4_4_19gb9gblh9yvgtc.R.flushNeeded();}}

    /**
     * Find elements matching selector.
     *
     * @param query CSS selector
     * @param root  root element to descend into
     * @return matching elements, empty if none
     * @throws Selector.SelectorParseException (unchecked) on an invalid CSS query.
     */
    public static Elements select(String query, Element root) {try{__CLR4_4_19gb9gblh9yvgtc.R.inc(12252);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12253);Validate.notEmpty(query);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12254);return select(QueryParser.parse(query), root);
    }finally{__CLR4_4_19gb9gblh9yvgtc.R.flushNeeded();}}

    /**
     * Find elements matching selector.
     *
     * @param evaluator CSS selector
     * @param root root element to descend into
     * @return matching elements, empty if none
     */
    public static Elements select(Evaluator evaluator, Element root) {try{__CLR4_4_19gb9gblh9yvgtc.R.inc(12255);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12256);Validate.notNull(evaluator);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12257);Validate.notNull(root);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12258);return Collector.collect(evaluator, root);
    }finally{__CLR4_4_19gb9gblh9yvgtc.R.flushNeeded();}}

    /**
     * Find elements matching selector.
     *
     * @param query CSS selector
     * @param roots root elements to descend into
     * @return matching elements, empty if none
     */
    public static Elements select(String query, Iterable<Element> roots) {try{__CLR4_4_19gb9gblh9yvgtc.R.inc(12259);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12260);Validate.notEmpty(query);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12261);Validate.notNull(roots);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12262);Evaluator evaluator = QueryParser.parse(query);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12263);ArrayList<Element> elements = new ArrayList<>();
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12264);IdentityHashMap<Element, Boolean> seenElements = new IdentityHashMap<>();
        // dedupe elements by identity, not equality

        __CLR4_4_19gb9gblh9yvgtc.R.inc(12265);for (Element root : roots) {{
            __CLR4_4_19gb9gblh9yvgtc.R.inc(12266);final Elements found = select(evaluator, root);
            __CLR4_4_19gb9gblh9yvgtc.R.inc(12267);for (Element el : found) {{
                __CLR4_4_19gb9gblh9yvgtc.R.inc(12268);if ((((!seenElements.containsKey(el))&&(__CLR4_4_19gb9gblh9yvgtc.R.iget(12269)!=0|true))||(__CLR4_4_19gb9gblh9yvgtc.R.iget(12270)==0&false))) {{
                    __CLR4_4_19gb9gblh9yvgtc.R.inc(12271);elements.add(el);
                    __CLR4_4_19gb9gblh9yvgtc.R.inc(12272);seenElements.put(el, Boolean.TRUE);
                }
            }}
        }}
        }__CLR4_4_19gb9gblh9yvgtc.R.inc(12273);return new Elements(elements);
    }finally{__CLR4_4_19gb9gblh9yvgtc.R.flushNeeded();}}

    // exclude set. package open so that Elements can implement .not() selector.
    static Elements filterOut(Collection<Element> elements, Collection<Element> outs) {try{__CLR4_4_19gb9gblh9yvgtc.R.inc(12274);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12275);Elements output = new Elements();
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12276);for (Element el : elements) {{
            __CLR4_4_19gb9gblh9yvgtc.R.inc(12277);boolean found = false;
            __CLR4_4_19gb9gblh9yvgtc.R.inc(12278);for (Element out : outs) {{
                __CLR4_4_19gb9gblh9yvgtc.R.inc(12279);if ((((el.equals(out))&&(__CLR4_4_19gb9gblh9yvgtc.R.iget(12280)!=0|true))||(__CLR4_4_19gb9gblh9yvgtc.R.iget(12281)==0&false))) {{
                    __CLR4_4_19gb9gblh9yvgtc.R.inc(12282);found = true;
                    __CLR4_4_19gb9gblh9yvgtc.R.inc(12283);break;
                }
            }}
            }__CLR4_4_19gb9gblh9yvgtc.R.inc(12284);if ((((!found)&&(__CLR4_4_19gb9gblh9yvgtc.R.iget(12285)!=0|true))||(__CLR4_4_19gb9gblh9yvgtc.R.iget(12286)==0&false)))
                {__CLR4_4_19gb9gblh9yvgtc.R.inc(12287);output.add(el);
        }}
        }__CLR4_4_19gb9gblh9yvgtc.R.inc(12288);return output;
    }finally{__CLR4_4_19gb9gblh9yvgtc.R.flushNeeded();}}

    /**
     * Find the first element that matches the query.
     * @param cssQuery CSS selector
     * @param root root element to descend into
     * @return the matching element, or <b>null</b> if none.
     */
    public static Element selectFirst(String cssQuery, Element root) {try{__CLR4_4_19gb9gblh9yvgtc.R.inc(12289);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12290);Validate.notEmpty(cssQuery);
        __CLR4_4_19gb9gblh9yvgtc.R.inc(12291);return Collector.findFirst(QueryParser.parse(cssQuery), root);
    }finally{__CLR4_4_19gb9gblh9yvgtc.R.flushNeeded();}}

    public static class SelectorParseException extends IllegalStateException {
        public SelectorParseException(String msg, Object... params) {
            super(String.format(msg, params));__CLR4_4_19gb9gblh9yvgtc.R.inc(12293);try{__CLR4_4_19gb9gblh9yvgtc.R.inc(12292);
        }finally{__CLR4_4_19gb9gblh9yvgtc.R.flushNeeded();}}
    }
}
