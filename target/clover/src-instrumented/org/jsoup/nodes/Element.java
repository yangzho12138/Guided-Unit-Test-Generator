/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.helper.ChangeNotifyingArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import static org.jsoup.internal.Normalizer.normalize;

/**
 * A HTML element consists of a tag name, attributes, and child nodes (including text nodes and
 * other elements).
 * 
 * From an Element, you can extract data, traverse the node graph, and manipulate the HTML.
 * 
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Element extends Node {public static class __CLR4_4_1376376lh9yvgkd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,4812,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final List<Node> EMPTY_NODES = Collections.emptyList();
    private static final Pattern classSplit = Pattern.compile("\\s+");
    private Tag tag;
    private WeakReference<List<Element>> shadowChildrenRef; // points to child elements shadowed from node children
    List<Node> childNodes;
    private Attributes attributes;
    private String baseUri;

    /**
     * Create a new, standalone element.
     * @param tag tag name
     */
    public Element(String tag) {
        this(Tag.valueOf(tag), "", new Attributes());__CLR4_4_1376376lh9yvgkd.R.inc(4147);try{__CLR4_4_1376376lh9yvgkd.R.inc(4146);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Create a new, standalone Element. (Standalone in that is has no parent.)
     * 
     * @param tag tag of this element
     * @param baseUri the base URI
     * @param attributes initial attributes
     * @see #appendChild(Node)
     * @see #appendElement(String)
     */
    public Element(Tag tag, String baseUri, Attributes attributes) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4148);
        __CLR4_4_1376376lh9yvgkd.R.inc(4149);Validate.notNull(tag);
        __CLR4_4_1376376lh9yvgkd.R.inc(4150);Validate.notNull(baseUri);
        __CLR4_4_1376376lh9yvgkd.R.inc(4151);childNodes = EMPTY_NODES;
        __CLR4_4_1376376lh9yvgkd.R.inc(4152);this.baseUri = baseUri;
        __CLR4_4_1376376lh9yvgkd.R.inc(4153);this.attributes = attributes;
        __CLR4_4_1376376lh9yvgkd.R.inc(4154);this.tag = tag;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Create a new Element from a tag and a base URI.
     * 
     * @param tag element tag
     * @param baseUri the base URI of this element. It is acceptable for the base URI to be an empty
     *            string, but not null.
     * @see Tag#valueOf(String, ParseSettings)
     */
    public Element(Tag tag, String baseUri) {
        this(tag, baseUri, null);__CLR4_4_1376376lh9yvgkd.R.inc(4156);try{__CLR4_4_1376376lh9yvgkd.R.inc(4155);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    protected List<Node> ensureChildNodes() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4157);
        __CLR4_4_1376376lh9yvgkd.R.inc(4158);if ((((childNodes == EMPTY_NODES)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4159)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4160)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4161);childNodes = new NodeList(this, 4);
        }
        }__CLR4_4_1376376lh9yvgkd.R.inc(4162);return childNodes;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    protected boolean hasAttributes() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4163);
        __CLR4_4_1376376lh9yvgkd.R.inc(4164);return attributes != null;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public Attributes attributes() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4165);
        __CLR4_4_1376376lh9yvgkd.R.inc(4166);if ((((!hasAttributes())&&(__CLR4_4_1376376lh9yvgkd.R.iget(4167)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4168)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4169);attributes = new Attributes();
        }__CLR4_4_1376376lh9yvgkd.R.inc(4170);return attributes;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public String baseUri() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4171);
        __CLR4_4_1376376lh9yvgkd.R.inc(4172);return baseUri;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    protected void doSetBaseUri(String baseUri) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4173);
        __CLR4_4_1376376lh9yvgkd.R.inc(4174);this.baseUri = baseUri;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public int childNodeSize() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4175);
        __CLR4_4_1376376lh9yvgkd.R.inc(4176);return childNodes.size();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4177);
        __CLR4_4_1376376lh9yvgkd.R.inc(4178);return tag.getName();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get the name of the tag for this element. E.g. {@code div}. If you are using {@link ParseSettings#preserveCase
     * case preserving parsing}, this will return the source's original case.
     * 
     * @return the tag name
     */
    public String tagName() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4179);
        __CLR4_4_1376376lh9yvgkd.R.inc(4180);return tag.getName();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get the normalized name of this Element's tag. This will always be the lowercased version of the tag, regardless
     * of the tag case preserving setting of the parser.
     * @return
     */
    public String normalName() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4181);
        __CLR4_4_1376376lh9yvgkd.R.inc(4182);return tag.normalName();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Change the tag of this element. For example, convert a {@code <span>} to a {@code <div>} with
     * {@code el.tagName("div");}.
     *
     * @param tagName new tag name for this element
     * @return this element, for chaining
     */
    public Element tagName(String tagName) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4183);
        __CLR4_4_1376376lh9yvgkd.R.inc(4184);Validate.notEmpty(tagName, "Tag name must not be empty.");
        __CLR4_4_1376376lh9yvgkd.R.inc(4185);tag = Tag.valueOf(tagName, NodeUtils.parser(this).settings()); // maintains the case option of the original parse
        __CLR4_4_1376376lh9yvgkd.R.inc(4186);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get the Tag for this element.
     * 
     * @return the tag object
     */
    public Tag tag() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4187);
        __CLR4_4_1376376lh9yvgkd.R.inc(4188);return tag;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Test if this element is a block-level element. (E.g. {@code <div> == true} or an inline element
     * {@code <p> == false}).
     * 
     * @return true if block, false if not (and thus inline)
     */
    public boolean isBlock() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4189);
        __CLR4_4_1376376lh9yvgkd.R.inc(4190);return tag.isBlock();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get the {@code id} attribute of this element.
     * 
     * @return The id attribute, if present, or an empty string if not.
     */
    public String id() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4191);
        __CLR4_4_1376376lh9yvgkd.R.inc(4192);return attributes().getIgnoreCase("id");
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Set an attribute value on this element. If this element already has an attribute with the
     * key, its value is updated; otherwise, a new attribute is added.
     * 
     * @return this element
     */
    public Element attr(String attributeKey, String attributeValue) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4193);
        __CLR4_4_1376376lh9yvgkd.R.inc(4194);super.attr(attributeKey, attributeValue);
        __CLR4_4_1376376lh9yvgkd.R.inc(4195);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Set a boolean attribute value on this element. Setting to <code>true</code> sets the attribute value to "" and
     * marks the attribute as boolean so no value is written out. Setting to <code>false</code> removes the attribute
     * with the same key if it exists.
     * 
     * @param attributeKey the attribute key
     * @param attributeValue the attribute value
     * 
     * @return this element
     */
    public Element attr(String attributeKey, boolean attributeValue) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4196);
        __CLR4_4_1376376lh9yvgkd.R.inc(4197);attributes().put(attributeKey, attributeValue);
        __CLR4_4_1376376lh9yvgkd.R.inc(4198);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get this element's HTML5 custom data attributes. Each attribute in the element that has a key
     * starting with "data-" is included the dataset.
     * <p>
     * E.g., the element {@code <div data-package="jsoup" data-language="Java" class="group">...} has the dataset
     * {@code package=jsoup, language=java}.
     * <p>
     * This map is a filtered view of the element's attribute map. Changes to one map (add, remove, update) are reflected
     * in the other map.
     * <p>
     * You can find elements that have data attributes using the {@code [^data-]} attribute key prefix selector.
     * @return a map of {@code key=value} custom data attributes.
     */
    public Map<String, String> dataset() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4199);
        __CLR4_4_1376376lh9yvgkd.R.inc(4200);return attributes().dataset();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public final Element parent() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4201);
        __CLR4_4_1376376lh9yvgkd.R.inc(4202);return (Element) parentNode;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get this element's parent and ancestors, up to the document root.
     * @return this element's stack of parents, closest first.
     */
    public Elements parents() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4203);
        __CLR4_4_1376376lh9yvgkd.R.inc(4204);Elements parents = new Elements();
        __CLR4_4_1376376lh9yvgkd.R.inc(4205);accumulateParents(this, parents);
        __CLR4_4_1376376lh9yvgkd.R.inc(4206);return parents;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    private static void accumulateParents(Element el, Elements parents) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4207);
        __CLR4_4_1376376lh9yvgkd.R.inc(4208);Element parent = el.parent();
        __CLR4_4_1376376lh9yvgkd.R.inc(4209);if ((((parent != null && !parent.tagName().equals("#root"))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4210)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4211)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4212);parents.add(parent);
            __CLR4_4_1376376lh9yvgkd.R.inc(4213);accumulateParents(parent, parents);
        }
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get a child element of this element, by its 0-based index number.
     * <p>
     * Note that an element can have both mixed Nodes and Elements as children. This method inspects
     * a filtered list of children that are elements, and the index is based on that filtered list.
     * </p>
     * 
     * @param index the index number of the element to retrieve
     * @return the child element, if it exists, otherwise throws an {@code IndexOutOfBoundsException}
     * @see #childNode(int)
     */
    public Element child(int index) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4214);
        __CLR4_4_1376376lh9yvgkd.R.inc(4215);return childElementsList().get(index);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get this element's child elements.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Element nodes.
     * </p>
     * @return child elements. If this element has no children, returns an empty list.
     * @see #childNodes()
     */
    public Elements children() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4216);
        __CLR4_4_1376376lh9yvgkd.R.inc(4217);return new Elements(childElementsList());
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Maintains a shadow copy of this element's child elements. If the nodelist is changed, this cache is invalidated.
     * TODO - think about pulling this out as a helper as there are other shadow lists (like in Attributes) kept around.
     * @return a list of child elements
     */
    private List<Element> childElementsList() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4218);
        __CLR4_4_1376376lh9yvgkd.R.inc(4219);List<Element> children;
        __CLR4_4_1376376lh9yvgkd.R.inc(4220);if (shadowChildrenRef == null || (children = shadowChildrenRef.get()) == null) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4223);final int size = childNodes.size();
            __CLR4_4_1376376lh9yvgkd.R.inc(4224);children = new ArrayList<>(size);
            //noinspection ForLoopReplaceableByForEach (beacause it allocates an Iterator which is wasteful here)
            __CLR4_4_1376376lh9yvgkd.R.inc(4225);for (int i = 0; (((i < size)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4226)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4227)==0&false)); i++) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4228);final Node node = childNodes.get(i);
                __CLR4_4_1376376lh9yvgkd.R.inc(4229);if ((((node instanceof Element)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4230)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4231)==0&false)))
                    {__CLR4_4_1376376lh9yvgkd.R.inc(4232);children.add((Element) node);
            }}
            }__CLR4_4_1376376lh9yvgkd.R.inc(4233);shadowChildrenRef = new WeakReference<>(children);
        }
        }__CLR4_4_1376376lh9yvgkd.R.inc(4234);return children;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Clears the cached shadow child elements.
     */
    @Override
    void nodelistChanged() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4235);
        __CLR4_4_1376376lh9yvgkd.R.inc(4236);super.nodelistChanged();
        __CLR4_4_1376376lh9yvgkd.R.inc(4237);shadowChildrenRef = null;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get this element's child text nodes. The list is unmodifiable but the text nodes may be manipulated.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Text nodes.
     * @return child text nodes. If this element has no text nodes, returns an
     * empty list.
     * </p>
     * For example, with the input HTML: {@code <p>One <span>Two</span> Three <br> Four</p>} with the {@code p} element selected:
     * <ul>
     *     <li>{@code p.text()} = {@code "One Two Three Four"}</li>
     *     <li>{@code p.ownText()} = {@code "One Three Four"}</li>
     *     <li>{@code p.children()} = {@code Elements[<span>, <br>]}</li>
     *     <li>{@code p.childNodes()} = {@code List<Node>["One ", <span>, " Three ", <br>, " Four"]}</li>
     *     <li>{@code p.textNodes()} = {@code List<TextNode>["One ", " Three ", " Four"]}</li>
     * </ul>
     */
    public List<TextNode> textNodes() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4238);
        __CLR4_4_1376376lh9yvgkd.R.inc(4239);List<TextNode> textNodes = new ArrayList<>();
        __CLR4_4_1376376lh9yvgkd.R.inc(4240);for (Node node : childNodes) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4241);if ((((node instanceof TextNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4242)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4243)==0&false)))
                {__CLR4_4_1376376lh9yvgkd.R.inc(4244);textNodes.add((TextNode) node);
        }}
        }__CLR4_4_1376376lh9yvgkd.R.inc(4245);return Collections.unmodifiableList(textNodes);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get this element's child data nodes. The list is unmodifiable but the data nodes may be manipulated.
     * <p>
     * This is effectively a filter on {@link #childNodes()} to get Data nodes.
     * </p>
     * @return child data nodes. If this element has no data nodes, returns an
     * empty list.
     * @see #data()
     */
    public List<DataNode> dataNodes() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4246);
        __CLR4_4_1376376lh9yvgkd.R.inc(4247);List<DataNode> dataNodes = new ArrayList<>();
        __CLR4_4_1376376lh9yvgkd.R.inc(4248);for (Node node : childNodes) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4249);if ((((node instanceof DataNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4250)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4251)==0&false)))
                {__CLR4_4_1376376lh9yvgkd.R.inc(4252);dataNodes.add((DataNode) node);
        }}
        }__CLR4_4_1376376lh9yvgkd.R.inc(4253);return Collections.unmodifiableList(dataNodes);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that match the {@link Selector} CSS query, with this element as the starting context. Matched elements
     * may include this element, or any of its children.
     * <p>
     * This method is generally more powerful to use than the DOM-type {@code getElementBy*} methods, because
     * multiple filters can be combined, e.g.:
     * </p>
     * <ul>
     * <li>{@code el.select("a[href]")} - finds links ({@code a} tags with {@code href} attributes)
     * <li>{@code el.select("a[href*=example.com]")} - finds links pointing to example.com (loosely)
     * </ul>
     * <p>
     * See the query syntax documentation in {@link org.jsoup.select.Selector}.
     * </p>
     * 
     * @param cssQuery a {@link Selector} CSS-like query
     * @return elements that match the query (empty if none match)
     * @see org.jsoup.select.Selector
     * @throws Selector.SelectorParseException (unchecked) on an invalid CSS query.
     */
    public Elements select(String cssQuery) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4254);
        __CLR4_4_1376376lh9yvgkd.R.inc(4255);return Selector.select(cssQuery, this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find the first Element that matches the {@link Selector} CSS query, with this element as the starting context.
     * <p>This is effectively the same as calling {@code element.select(query).first()}, but is more efficient as query
     * execution stops on the first hit.</p>
     * @param cssQuery cssQuery a {@link Selector} CSS-like query
     * @return the first matching element, or <b>{@code null}</b> if there is no match.
     */
    public Element selectFirst(String cssQuery) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4256);
        __CLR4_4_1376376lh9yvgkd.R.inc(4257);return Selector.selectFirst(cssQuery, this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Check if this element matches the given {@link Selector} CSS query.
     * @param cssQuery a {@link Selector} CSS query
     * @return if this element matches the query
     */
    public boolean is(String cssQuery) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4258);
        __CLR4_4_1376376lh9yvgkd.R.inc(4259);return is(QueryParser.parse(cssQuery));
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Check if this element matches the given evaluator.
     * @param evaluator an element evaluator
     * @return if this element matches
     */
    public boolean is(Evaluator evaluator) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4260);
        __CLR4_4_1376376lh9yvgkd.R.inc(4261);return evaluator.matches((Element)this.root(), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Add a node child node to this element.
     * 
     * @param child node to add.
     * @return this element, so that you can add more child nodes or elements.
     */
    public Element appendChild(Node child) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4262);
        __CLR4_4_1376376lh9yvgkd.R.inc(4263);Validate.notNull(child);

        // was - Node#addChildren(child). short-circuits an array create and a loop.
        __CLR4_4_1376376lh9yvgkd.R.inc(4264);reparentChild(child);
        __CLR4_4_1376376lh9yvgkd.R.inc(4265);ensureChildNodes();
        __CLR4_4_1376376lh9yvgkd.R.inc(4266);childNodes.add(child);
        __CLR4_4_1376376lh9yvgkd.R.inc(4267);child.setSiblingIndex(childNodes.size() - 1);
        __CLR4_4_1376376lh9yvgkd.R.inc(4268);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Add this element to the supplied parent element, as its next child.
     *
     * @param parent element to which this element will be appended
     * @return this element, so that you can continue modifying the element
     */
    public Element appendTo(Element parent) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4269);
        __CLR4_4_1376376lh9yvgkd.R.inc(4270);Validate.notNull(parent);
        __CLR4_4_1376376lh9yvgkd.R.inc(4271);parent.appendChild(this);
        __CLR4_4_1376376lh9yvgkd.R.inc(4272);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Add a node to the start of this element's children.
     * 
     * @param child node to add.
     * @return this element, so that you can add more child nodes or elements.
     */
    public Element prependChild(Node child) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4273);
        __CLR4_4_1376376lh9yvgkd.R.inc(4274);Validate.notNull(child);
        
        __CLR4_4_1376376lh9yvgkd.R.inc(4275);addChildren(0, child);
        __CLR4_4_1376376lh9yvgkd.R.inc(4276);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}


    /**
     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the
     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.
     *
     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the
     * end
     * @param children child nodes to insert
     * @return this element, for chaining.
     */
    public Element insertChildren(int index, Collection<? extends Node> children) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4277);
        __CLR4_4_1376376lh9yvgkd.R.inc(4278);Validate.notNull(children, "Children collection to be inserted must not be null.");
        __CLR4_4_1376376lh9yvgkd.R.inc(4279);int currentSize = childNodeSize();
        __CLR4_4_1376376lh9yvgkd.R.inc(4280);if ((((index < 0)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4281)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4282)==0&false))) {__CLR4_4_1376376lh9yvgkd.R.inc(4283);index += currentSize +1; // roll around
        }__CLR4_4_1376376lh9yvgkd.R.inc(4284);Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");

        __CLR4_4_1376376lh9yvgkd.R.inc(4285);ArrayList<Node> nodes = new ArrayList<>(children);
        __CLR4_4_1376376lh9yvgkd.R.inc(4286);Node[] nodeArray = nodes.toArray(new Node[0]);
        __CLR4_4_1376376lh9yvgkd.R.inc(4287);addChildren(index, nodeArray);
        __CLR4_4_1376376lh9yvgkd.R.inc(4288);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Inserts the given child nodes into this element at the specified index. Current nodes will be shifted to the
     * right. The inserted nodes will be moved from their current parent. To prevent moving, copy the nodes first.
     *
     * @param index 0-based index to insert children at. Specify {@code 0} to insert at the start, {@code -1} at the
     * end
     * @param children child nodes to insert
     * @return this element, for chaining.
     */
    public Element insertChildren(int index, Node... children) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4289);
        __CLR4_4_1376376lh9yvgkd.R.inc(4290);Validate.notNull(children, "Children collection to be inserted must not be null.");
        __CLR4_4_1376376lh9yvgkd.R.inc(4291);int currentSize = childNodeSize();
        __CLR4_4_1376376lh9yvgkd.R.inc(4292);if ((((index < 0)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4293)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4294)==0&false))) {__CLR4_4_1376376lh9yvgkd.R.inc(4295);index += currentSize +1; // roll around
        }__CLR4_4_1376376lh9yvgkd.R.inc(4296);Validate.isTrue(index >= 0 && index <= currentSize, "Insert position out of bounds.");

        __CLR4_4_1376376lh9yvgkd.R.inc(4297);addChildren(index, children);
        __CLR4_4_1376376lh9yvgkd.R.inc(4298);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Create a new element by tag name, and add it as the last child.
     * 
     * @param tagName the name of the tag (e.g. {@code div}).
     * @return the new element, to allow you to add content to it, e.g.:
     *  {@code parent.appendElement("h1").attr("id", "header").text("Welcome");}
     */
    public Element appendElement(String tagName) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4299);
        __CLR4_4_1376376lh9yvgkd.R.inc(4300);Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
        __CLR4_4_1376376lh9yvgkd.R.inc(4301);appendChild(child);
        __CLR4_4_1376376lh9yvgkd.R.inc(4302);return child;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Create a new element by tag name, and add it as the first child.
     * 
     * @param tagName the name of the tag (e.g. {@code div}).
     * @return the new element, to allow you to add content to it, e.g.:
     *  {@code parent.prependElement("h1").attr("id", "header").text("Welcome");}
     */
    public Element prependElement(String tagName) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4303);
        __CLR4_4_1376376lh9yvgkd.R.inc(4304);Element child = new Element(Tag.valueOf(tagName, NodeUtils.parser(this).settings()), baseUri());
        __CLR4_4_1376376lh9yvgkd.R.inc(4305);prependChild(child);
        __CLR4_4_1376376lh9yvgkd.R.inc(4306);return child;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Create and append a new TextNode to this element.
     * 
     * @param text the unencoded text to add
     * @return this element
     */
    public Element appendText(String text) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4307);
        __CLR4_4_1376376lh9yvgkd.R.inc(4308);Validate.notNull(text);
        __CLR4_4_1376376lh9yvgkd.R.inc(4309);TextNode node = new TextNode(text);
        __CLR4_4_1376376lh9yvgkd.R.inc(4310);appendChild(node);
        __CLR4_4_1376376lh9yvgkd.R.inc(4311);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Create and prepend a new TextNode to this element.
     * 
     * @param text the unencoded text to add
     * @return this element
     */
    public Element prependText(String text) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4312);
        __CLR4_4_1376376lh9yvgkd.R.inc(4313);Validate.notNull(text);
        __CLR4_4_1376376lh9yvgkd.R.inc(4314);TextNode node = new TextNode(text);
        __CLR4_4_1376376lh9yvgkd.R.inc(4315);prependChild(node);
        __CLR4_4_1376376lh9yvgkd.R.inc(4316);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Add inner HTML to this element. The supplied HTML will be parsed, and each node appended to the end of the children.
     * @param html HTML to add inside this element, after the existing HTML
     * @return this element
     * @see #html(String)
     */
    public Element append(String html) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4317);
        __CLR4_4_1376376lh9yvgkd.R.inc(4318);Validate.notNull(html);
        __CLR4_4_1376376lh9yvgkd.R.inc(4319);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, this, baseUri());
        __CLR4_4_1376376lh9yvgkd.R.inc(4320);addChildren(nodes.toArray(new Node[0]));
        __CLR4_4_1376376lh9yvgkd.R.inc(4321);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Add inner HTML into this element. The supplied HTML will be parsed, and each node prepended to the start of the element's children.
     * @param html HTML to add inside this element, before the existing HTML
     * @return this element
     * @see #html(String)
     */
    public Element prepend(String html) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4322);
        __CLR4_4_1376376lh9yvgkd.R.inc(4323);Validate.notNull(html);
        __CLR4_4_1376376lh9yvgkd.R.inc(4324);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, this, baseUri());
        __CLR4_4_1376376lh9yvgkd.R.inc(4325);addChildren(0, nodes.toArray(new Node[0]));
        __CLR4_4_1376376lh9yvgkd.R.inc(4326);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM before this element (as a preceding sibling).
     *
     * @param html HTML to add before this element
     * @return this element, for chaining
     * @see #after(String)
     */
    @Override
    public Element before(String html) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4327);
        __CLR4_4_1376376lh9yvgkd.R.inc(4328);return (Element) super.before(html);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM before this node (as a preceding sibling).
     * @param node to add before this element
     * @return this Element, for chaining
     * @see #after(Node)
     */
    @Override
    public Element before(Node node) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4329);
        __CLR4_4_1376376lh9yvgkd.R.inc(4330);return (Element) super.before(node);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM after this element (as a following sibling).
     *
     * @param html HTML to add after this element
     * @return this element, for chaining
     * @see #before(String)
     */
    @Override
    public Element after(String html) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4331);
        __CLR4_4_1376376lh9yvgkd.R.inc(4332);return (Element) super.after(html);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM after this node (as a following sibling).
     * @param node to add after this element
     * @return this element, for chaining
     * @see #before(Node)
     */
    @Override
    public Element after(Node node) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4333);
        __CLR4_4_1376376lh9yvgkd.R.inc(4334);return (Element) super.after(node);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Remove all of the element's child nodes. Any attributes are left as-is.
     * @return this element
     */
    public Element empty() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4335);
        __CLR4_4_1376376lh9yvgkd.R.inc(4336);childNodes.clear();
        __CLR4_4_1376376lh9yvgkd.R.inc(4337);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Wrap the supplied HTML around this element.
     *
     * @param html HTML to wrap around this element, e.g. {@code <div class="head"></div>}. Can be arbitrarily deep.
     * @return this element, for chaining.
     */
    @Override
    public Element wrap(String html) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4338);
        __CLR4_4_1376376lh9yvgkd.R.inc(4339);return (Element) super.wrap(html);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get a CSS selector that will uniquely select this element.
     * <p>
     * If the element has an ID, returns #id;
     * otherwise returns the parent (if any) CSS selector, followed by {@literal '>'},
     * followed by a unique selector for the element (tag.class.class:nth-child(n)).
     * </p>
     *
     * @return the CSS Path that can be used to retrieve the element in a selector.
     */
    public String cssSelector() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4340);
        __CLR4_4_1376376lh9yvgkd.R.inc(4341);if ((((id().length() > 0)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4342)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4343)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4344);return "#" + id();

        // Translate HTML namespace ns:tag to CSS namespace syntax ns|tag
        }__CLR4_4_1376376lh9yvgkd.R.inc(4345);String tagName = tagName().replace(':', '|');
        __CLR4_4_1376376lh9yvgkd.R.inc(4346);StringBuilder selector = new StringBuilder(tagName);
        __CLR4_4_1376376lh9yvgkd.R.inc(4347);String classes = StringUtil.join(classNames(), ".");
        __CLR4_4_1376376lh9yvgkd.R.inc(4348);if ((((classes.length() > 0)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4349)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4350)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4351);selector.append('.').append(classes);

        }__CLR4_4_1376376lh9yvgkd.R.inc(4352);if ((((parent() == null || parent() instanceof Document)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4353)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4354)==0&false))) // don't add Document to selector, as will always have a html node
            {__CLR4_4_1376376lh9yvgkd.R.inc(4355);return selector.toString();

        }__CLR4_4_1376376lh9yvgkd.R.inc(4356);selector.insert(0, " > ");
        __CLR4_4_1376376lh9yvgkd.R.inc(4357);if ((((parent().select(selector.toString()).size() > 1)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4358)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4359)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4360);selector.append(String.format(
                ":nth-child(%d)", elementSiblingIndex() + 1));

        }__CLR4_4_1376376lh9yvgkd.R.inc(4361);return parent().cssSelector() + selector.toString();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get sibling elements. If the element has no sibling elements, returns an empty list. An element is not a sibling
     * of itself, so will not be included in the returned list.
     * @return sibling elements
     */
    public Elements siblingElements() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4362);
        __CLR4_4_1376376lh9yvgkd.R.inc(4363);if ((((parentNode == null)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4364)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4365)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4366);return new Elements(0);

        }__CLR4_4_1376376lh9yvgkd.R.inc(4367);List<Element> elements = parent().childElementsList();
        __CLR4_4_1376376lh9yvgkd.R.inc(4368);Elements siblings = new Elements(elements.size() - 1);
        __CLR4_4_1376376lh9yvgkd.R.inc(4369);for (Element el: elements)
            {__CLR4_4_1376376lh9yvgkd.R.inc(4370);if ((((el != this)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4371)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4372)==0&false)))
                {__CLR4_4_1376376lh9yvgkd.R.inc(4373);siblings.add(el);
        }}__CLR4_4_1376376lh9yvgkd.R.inc(4374);return siblings;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Gets the next sibling element of this element. E.g., if a {@code div} contains two {@code p}s, 
     * the {@code nextElementSibling} of the first {@code p} is the second {@code p}.
     * <p>
     * This is similar to {@link #nextSibling()}, but specifically finds only Elements
     * </p>
     * @return the next element, or null if there is no next element
     * @see #previousElementSibling()
     */
    public Element nextElementSibling() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4375);
        __CLR4_4_1376376lh9yvgkd.R.inc(4376);if ((((parentNode == null)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4377)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4378)==0&false))) {__CLR4_4_1376376lh9yvgkd.R.inc(4379);return null;
        }__CLR4_4_1376376lh9yvgkd.R.inc(4380);List<Element> siblings = parent().childElementsList();
        __CLR4_4_1376376lh9yvgkd.R.inc(4381);Integer index = indexInList(this, siblings);
        __CLR4_4_1376376lh9yvgkd.R.inc(4382);Validate.notNull(index);
        __CLR4_4_1376376lh9yvgkd.R.inc(4383);if ((((siblings.size() > index+1)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4384)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4385)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4386);return siblings.get(index+1);
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4387);return null;
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get each of the sibling elements that come after this element.
     *
     * @return each of the element siblings after this element, or an empty list if there are no next sibling elements
     */
    public Elements nextElementSiblings() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4388);
        __CLR4_4_1376376lh9yvgkd.R.inc(4389);return nextElementSiblings(true);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Gets the previous element sibling of this element.
     * @return the previous element, or null if there is no previous element
     * @see #nextElementSibling()
     */
    public Element previousElementSibling() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4390);
        __CLR4_4_1376376lh9yvgkd.R.inc(4391);if ((((parentNode == null)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4392)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4393)==0&false))) {__CLR4_4_1376376lh9yvgkd.R.inc(4394);return null;
        }__CLR4_4_1376376lh9yvgkd.R.inc(4395);List<Element> siblings = parent().childElementsList();
        __CLR4_4_1376376lh9yvgkd.R.inc(4396);Integer index = indexInList(this, siblings);
        __CLR4_4_1376376lh9yvgkd.R.inc(4397);Validate.notNull(index);
        __CLR4_4_1376376lh9yvgkd.R.inc(4398);if ((((index > 0)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4399)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4400)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4401);return siblings.get(index-1);
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4402);return null;
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get each of the element siblings before this element.
     *
     * @return the previous element siblings, or an empty list if there are none.
     */
    public Elements previousElementSiblings() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4403);
        __CLR4_4_1376376lh9yvgkd.R.inc(4404);return nextElementSiblings(false);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    private Elements nextElementSiblings(boolean next) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4405);
        __CLR4_4_1376376lh9yvgkd.R.inc(4406);Elements els = new Elements();
        __CLR4_4_1376376lh9yvgkd.R.inc(4407);if ((((parentNode == null)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4408)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4409)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4410);return  els;
        }__CLR4_4_1376376lh9yvgkd.R.inc(4411);els.add(this);
        __CLR4_4_1376376lh9yvgkd.R.inc(4412);return (((next )&&(__CLR4_4_1376376lh9yvgkd.R.iget(4413)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4414)==0&false))?  els.nextAll() : els.prevAll();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Gets the first element sibling of this element.
     * @return the first sibling that is an element (aka the parent's first element child) 
     */
    public Element firstElementSibling() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4415);
        // todo: should firstSibling() exclude this?
        __CLR4_4_1376376lh9yvgkd.R.inc(4416);List<Element> siblings = parent().childElementsList();
        __CLR4_4_1376376lh9yvgkd.R.inc(4417);return (((siblings.size() > 1 )&&(__CLR4_4_1376376lh9yvgkd.R.iget(4418)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4419)==0&false))? siblings.get(0) : null;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Get the list index of this element in its element sibling list. I.e. if this is the first element
     * sibling, returns 0.
     * @return position in element sibling list
     */
    public int elementSiblingIndex() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4420);
       __CLR4_4_1376376lh9yvgkd.R.inc(4421);if ((((parent() == null)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4422)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4423)==0&false))) {__CLR4_4_1376376lh9yvgkd.R.inc(4424);return 0;
       }__CLR4_4_1376376lh9yvgkd.R.inc(4425);return indexInList(this, parent().childElementsList());
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Gets the last element sibling of this element
     * @return the last sibling that is an element (aka the parent's last element child) 
     */
    public Element lastElementSibling() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4426);
        __CLR4_4_1376376lh9yvgkd.R.inc(4427);List<Element> siblings = parent().childElementsList();
        __CLR4_4_1376376lh9yvgkd.R.inc(4428);return (((siblings.size() > 1 )&&(__CLR4_4_1376376lh9yvgkd.R.iget(4429)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4430)==0&false))? siblings.get(siblings.size() - 1) : null;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    private static <E extends Element> int indexInList(Element search, List<E> elements) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4431);
        __CLR4_4_1376376lh9yvgkd.R.inc(4432);final int size = elements.size();
        __CLR4_4_1376376lh9yvgkd.R.inc(4433);for (int i = 0; (((i < size)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4434)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4435)==0&false)); i++) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4436);if ((((elements.get(i) == search)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4437)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4438)==0&false)))
                {__CLR4_4_1376376lh9yvgkd.R.inc(4439);return i;
        }}
        }__CLR4_4_1376376lh9yvgkd.R.inc(4440);return 0;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    // DOM type methods

    /**
     * Finds elements, including and recursively under this element, with the specified tag name.
     * @param tagName The tag name to search for (case insensitively).
     * @return a matching unmodifiable list of elements. Will be empty if this element and none of its children match.
     */
    public Elements getElementsByTag(String tagName) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4441);
        __CLR4_4_1376376lh9yvgkd.R.inc(4442);Validate.notEmpty(tagName);
        __CLR4_4_1376376lh9yvgkd.R.inc(4443);tagName = normalize(tagName);

        __CLR4_4_1376376lh9yvgkd.R.inc(4444);return Collector.collect(new Evaluator.Tag(tagName), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find an element by ID, including or under this element.
     * <p>
     * Note that this finds the first matching ID, starting with this element. If you search down from a different
     * starting point, it is possible to find a different element by ID. For unique element by ID within a Document,
     * use {@link Document#getElementById(String)}
     * @param id The ID to search for.
     * @return The first matching element by ID, starting with this element, or null if none found.
     */
    public Element getElementById(String id) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4445);
        __CLR4_4_1376376lh9yvgkd.R.inc(4446);Validate.notEmpty(id);
        
        __CLR4_4_1376376lh9yvgkd.R.inc(4447);Elements elements = Collector.collect(new Evaluator.Id(id), this);
        __CLR4_4_1376376lh9yvgkd.R.inc(4448);if ((((elements.size() > 0)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4449)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4450)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4451);return elements.get(0);
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4452);return null;
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that have this class, including or under this element. Case insensitive.
     * <p>
     * Elements can have multiple classes (e.g. {@code <div class="header round first">}. This method
     * checks each class, so you can find the above with {@code el.getElementsByClass("header");}.
     * 
     * @param className the name of the class to search for.
     * @return elements with the supplied class name, empty if none
     * @see #hasClass(String)
     * @see #classNames()
     */
    public Elements getElementsByClass(String className) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4453);
        __CLR4_4_1376376lh9yvgkd.R.inc(4454);Validate.notEmpty(className);

        __CLR4_4_1376376lh9yvgkd.R.inc(4455);return Collector.collect(new Evaluator.Class(className), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that have a named attribute set. Case insensitive.
     *
     * @param key name of the attribute, e.g. {@code href}
     * @return elements that have this attribute, empty if none
     */
    public Elements getElementsByAttribute(String key) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4456);
        __CLR4_4_1376376lh9yvgkd.R.inc(4457);Validate.notEmpty(key);
        __CLR4_4_1376376lh9yvgkd.R.inc(4458);key = key.trim();

        __CLR4_4_1376376lh9yvgkd.R.inc(4459);return Collector.collect(new Evaluator.Attribute(key), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that have an attribute name starting with the supplied prefix. Use {@code data-} to find elements
     * that have HTML5 datasets.
     * @param keyPrefix name prefix of the attribute e.g. {@code data-}
     * @return elements that have attribute names that start with with the prefix, empty if none.
     */
    public Elements getElementsByAttributeStarting(String keyPrefix) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4460);
        __CLR4_4_1376376lh9yvgkd.R.inc(4461);Validate.notEmpty(keyPrefix);
        __CLR4_4_1376376lh9yvgkd.R.inc(4462);keyPrefix = keyPrefix.trim();

        __CLR4_4_1376376lh9yvgkd.R.inc(4463);return Collector.collect(new Evaluator.AttributeStarting(keyPrefix), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that have an attribute with the specific value. Case insensitive.
     * 
     * @param key name of the attribute
     * @param value value of the attribute
     * @return elements that have this attribute with this value, empty if none
     */
    public Elements getElementsByAttributeValue(String key, String value) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4464);
        __CLR4_4_1376376lh9yvgkd.R.inc(4465);return Collector.collect(new Evaluator.AttributeWithValue(key, value), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that either do not have this attribute, or have it with a different value. Case insensitive.
     * 
     * @param key name of the attribute
     * @param value value of the attribute
     * @return elements that do not have a matching attribute
     */
    public Elements getElementsByAttributeValueNot(String key, String value) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4466);
        __CLR4_4_1376376lh9yvgkd.R.inc(4467);return Collector.collect(new Evaluator.AttributeWithValueNot(key, value), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that have attributes that start with the value prefix. Case insensitive.
     * 
     * @param key name of the attribute
     * @param valuePrefix start of attribute value
     * @return elements that have attributes that start with the value prefix
     */
    public Elements getElementsByAttributeValueStarting(String key, String valuePrefix) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4468);
        __CLR4_4_1376376lh9yvgkd.R.inc(4469);return Collector.collect(new Evaluator.AttributeWithValueStarting(key, valuePrefix), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that have attributes that end with the value suffix. Case insensitive.
     * 
     * @param key name of the attribute
     * @param valueSuffix end of the attribute value
     * @return elements that have attributes that end with the value suffix
     */
    public Elements getElementsByAttributeValueEnding(String key, String valueSuffix) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4470);
        __CLR4_4_1376376lh9yvgkd.R.inc(4471);return Collector.collect(new Evaluator.AttributeWithValueEnding(key, valueSuffix), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Find elements that have attributes whose value contains the match string. Case insensitive.
     * 
     * @param key name of the attribute
     * @param match substring of value to search for
     * @return elements that have attributes containing this text
     */
    public Elements getElementsByAttributeValueContaining(String key, String match) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4472);
        __CLR4_4_1376376lh9yvgkd.R.inc(4473);return Collector.collect(new Evaluator.AttributeWithValueContaining(key, match), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements that have attributes whose values match the supplied regular expression.
     * @param key name of the attribute
     * @param pattern compiled regular expression to match against attribute values
     * @return elements that have attributes matching this regular expression
     */
    public Elements getElementsByAttributeValueMatching(String key, Pattern pattern) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4474);
        __CLR4_4_1376376lh9yvgkd.R.inc(4475);return Collector.collect(new Evaluator.AttributeWithValueMatching(key, pattern), this);
        
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements that have attributes whose values match the supplied regular expression.
     * @param key name of the attribute
     * @param regex regular expression to match against attribute values. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements that have attributes matching this regular expression
     */
    public Elements getElementsByAttributeValueMatching(String key, String regex) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4476);
        __CLR4_4_1376376lh9yvgkd.R.inc(4477);Pattern pattern;
        __CLR4_4_1376376lh9yvgkd.R.inc(4478);try {
            __CLR4_4_1376376lh9yvgkd.R.inc(4479);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_4_1376376lh9yvgkd.R.inc(4480);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_4_1376376lh9yvgkd.R.inc(4481);return getElementsByAttributeValueMatching(key, pattern);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is less than the supplied index.
     * @param index 0-based index
     * @return elements less than index
     */
    public Elements getElementsByIndexLessThan(int index) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4482);
        __CLR4_4_1376376lh9yvgkd.R.inc(4483);return Collector.collect(new Evaluator.IndexLessThan(index), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is greater than the supplied index.
     * @param index 0-based index
     * @return elements greater than index
     */
    public Elements getElementsByIndexGreaterThan(int index) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4484);
        __CLR4_4_1376376lh9yvgkd.R.inc(4485);return Collector.collect(new Evaluator.IndexGreaterThan(index), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements whose sibling index is equal to the supplied index.
     * @param index 0-based index
     * @return elements equal to index
     */
    public Elements getElementsByIndexEquals(int index) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4486);
        __CLR4_4_1376376lh9yvgkd.R.inc(4487);return Collector.collect(new Evaluator.IndexEquals(index), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements that contain the specified string. The search is case insensitive. The text may appear directly
     * in the element, or in any of its descendants.
     * @param searchText to look for in the element's text
     * @return elements that contain the string, case insensitive.
     * @see Element#text()
     */
    public Elements getElementsContainingText(String searchText) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4488);
        __CLR4_4_1376376lh9yvgkd.R.inc(4489);return Collector.collect(new Evaluator.ContainsText(searchText), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements that directly contain the specified string. The search is case insensitive. The text must appear directly
     * in the element, not in any of its descendants.
     * @param searchText to look for in the element's own text
     * @return elements that contain the string, case insensitive.
     * @see Element#ownText()
     */
    public Elements getElementsContainingOwnText(String searchText) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4490);
        __CLR4_4_1376376lh9yvgkd.R.inc(4491);return Collector.collect(new Evaluator.ContainsOwnText(searchText), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements whose text matches the supplied regular expression.
     * @param pattern regular expression to match text against
     * @return elements matching the supplied regular expression.
     * @see Element#text()
     */
    public Elements getElementsMatchingText(Pattern pattern) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4492);
        __CLR4_4_1376376lh9yvgkd.R.inc(4493);return Collector.collect(new Evaluator.Matches(pattern), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements whose text matches the supplied regular expression.
     * @param regex regular expression to match text against. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements matching the supplied regular expression.
     * @see Element#text()
     */
    public Elements getElementsMatchingText(String regex) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4494);
        __CLR4_4_1376376lh9yvgkd.R.inc(4495);Pattern pattern;
        __CLR4_4_1376376lh9yvgkd.R.inc(4496);try {
            __CLR4_4_1376376lh9yvgkd.R.inc(4497);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_4_1376376lh9yvgkd.R.inc(4498);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_4_1376376lh9yvgkd.R.inc(4499);return getElementsMatchingText(pattern);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements whose own text matches the supplied regular expression.
     * @param pattern regular expression to match text against
     * @return elements matching the supplied regular expression.
     * @see Element#ownText()
     */
    public Elements getElementsMatchingOwnText(Pattern pattern) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4500);
        __CLR4_4_1376376lh9yvgkd.R.inc(4501);return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find elements whose own text matches the supplied regular expression.
     * @param regex regular expression to match text against. You can use <a href="http://java.sun.com/docs/books/tutorial/essential/regex/pattern.html#embedded">embedded flags</a> (such as (?i) and (?m) to control regex options.
     * @return elements matching the supplied regular expression.
     * @see Element#ownText()
     */
    public Elements getElementsMatchingOwnText(String regex) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4502);
        __CLR4_4_1376376lh9yvgkd.R.inc(4503);Pattern pattern;
        __CLR4_4_1376376lh9yvgkd.R.inc(4504);try {
            __CLR4_4_1376376lh9yvgkd.R.inc(4505);pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            __CLR4_4_1376376lh9yvgkd.R.inc(4506);throw new IllegalArgumentException("Pattern syntax error: " + regex, e);
        }
        __CLR4_4_1376376lh9yvgkd.R.inc(4507);return getElementsMatchingOwnText(pattern);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Find all elements under this element (including self, and children of children).
     * 
     * @return all elements
     */
    public Elements getAllElements() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4508);
        __CLR4_4_1376376lh9yvgkd.R.inc(4509);return Collector.collect(new Evaluator.AllElements(), this);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Gets the combined text of this element and all its children. Whitespace is normalized and trimmed.
     * <p>
     * For example, given HTML {@code <p>Hello  <b>there</b> now! </p>}, {@code p.text()} returns {@code "Hello there now!"}
     *
     * @return unencoded, normalized text, or empty string if none.
     * @see #wholeText() if you don't want the text to be normalized.
     * @see #ownText()
     * @see #textNodes()
     */
    public String text() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4510);
        __CLR4_4_1376376lh9yvgkd.R.inc(4511);final StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_4_1376376lh9yvgkd.R.inc(4512);NodeTraversor.traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4513);
                __CLR4_4_1376376lh9yvgkd.R.inc(4514);if ((((node instanceof TextNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4515)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4516)==0&false))) {{
                    __CLR4_4_1376376lh9yvgkd.R.inc(4517);TextNode textNode = (TextNode) node;
                    __CLR4_4_1376376lh9yvgkd.R.inc(4518);appendNormalisedText(accum, textNode);
                } }else {__CLR4_4_1376376lh9yvgkd.R.inc(4519);if ((((node instanceof Element)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4520)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4521)==0&false))) {{
                    __CLR4_4_1376376lh9yvgkd.R.inc(4522);Element element = (Element) node;
                    __CLR4_4_1376376lh9yvgkd.R.inc(4523);if ((((accum.length() > 0 &&
                        (element.isBlock() || element.tag.getName().equals("br")) &&
                        !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4524)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4525)==0&false)))
                        {__CLR4_4_1376376lh9yvgkd.R.inc(4526);accum.append(' ');
                }}
            }}}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4527);
                // make sure there is a space between block tags and immediately following text nodes <div>One</div>Two should be "One Two".
                __CLR4_4_1376376lh9yvgkd.R.inc(4528);if ((((node instanceof Element)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4529)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4530)==0&false))) {{
                    __CLR4_4_1376376lh9yvgkd.R.inc(4531);Element element = (Element) node;
                    __CLR4_4_1376376lh9yvgkd.R.inc(4532);if ((((element.isBlock() && (node.nextSibling() instanceof TextNode) && !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4533)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4534)==0&false)))
                        {__CLR4_4_1376376lh9yvgkd.R.inc(4535);accum.append(' ');
                }}

            }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
        }, this);

        __CLR4_4_1376376lh9yvgkd.R.inc(4536);return StringUtil.releaseBuilder(accum).trim();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get the (unencoded) text of all children of this element, including any newlines and spaces present in the
     * original.
     *
     * @return unencoded, un-normalized text
     * @see #text()
     */
    public String wholeText() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4537);
        __CLR4_4_1376376lh9yvgkd.R.inc(4538);final StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_4_1376376lh9yvgkd.R.inc(4539);NodeTraversor.traverse(new NodeVisitor() {
            @Override
            public void head(Node node, int depth) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4540);
                __CLR4_4_1376376lh9yvgkd.R.inc(4541);if ((((node instanceof TextNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4542)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4543)==0&false))) {{
                    __CLR4_4_1376376lh9yvgkd.R.inc(4544);TextNode textNode = (TextNode) node;
                    __CLR4_4_1376376lh9yvgkd.R.inc(4545);accum.append(textNode.getWholeText());
                }
            }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

            @Override
            public void tail(Node node, int depth) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4546);
            }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
        }, this);

        __CLR4_4_1376376lh9yvgkd.R.inc(4547);return StringUtil.releaseBuilder(accum);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Gets the text owned by this element only; does not get the combined text of all children.
     * <p>
     * For example, given HTML {@code <p>Hello <b>there</b> now!</p>}, {@code p.ownText()} returns {@code "Hello now!"},
     * whereas {@code p.text()} returns {@code "Hello there now!"}.
     * Note that the text within the {@code b} element is not returned, as it is not a direct child of the {@code p} element.
     *
     * @return unencoded text, or empty string if none.
     * @see #text()
     * @see #textNodes()
     */
    public String ownText() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4548);
        __CLR4_4_1376376lh9yvgkd.R.inc(4549);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_4_1376376lh9yvgkd.R.inc(4550);ownText(sb);
        __CLR4_4_1376376lh9yvgkd.R.inc(4551);return StringUtil.releaseBuilder(sb).trim();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    private void ownText(StringBuilder accum) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4552);
        __CLR4_4_1376376lh9yvgkd.R.inc(4553);for (Node child : childNodes) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4554);if ((((child instanceof TextNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4555)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4556)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4557);TextNode textNode = (TextNode) child;
                __CLR4_4_1376376lh9yvgkd.R.inc(4558);appendNormalisedText(accum, textNode);
            } }else {__CLR4_4_1376376lh9yvgkd.R.inc(4559);if ((((child instanceof Element)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4560)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4561)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4562);appendWhitespaceIfBr((Element) child, accum);
            }
        }}}
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    private static void appendNormalisedText(StringBuilder accum, TextNode textNode) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4563);
        __CLR4_4_1376376lh9yvgkd.R.inc(4564);String text = textNode.getWholeText();

        __CLR4_4_1376376lh9yvgkd.R.inc(4565);if ((((preserveWhitespace(textNode.parentNode) || textNode instanceof CDataNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4566)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4567)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4568);accum.append(text);
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4569);StringUtil.appendNormalisedWhitespace(accum, text, TextNode.lastCharIsWhitespace(accum));
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    private static void appendWhitespaceIfBr(Element element, StringBuilder accum) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4570);
        __CLR4_4_1376376lh9yvgkd.R.inc(4571);if ((((element.tag.getName().equals("br") && !TextNode.lastCharIsWhitespace(accum))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4572)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4573)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4574);accum.append(" ");
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    static boolean preserveWhitespace(Node node) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4575);
        // looks only at this element and five levels up, to prevent recursion & needless stack searches
        __CLR4_4_1376376lh9yvgkd.R.inc(4576);if ((((node instanceof Element)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4577)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4578)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4579);Element el = (Element) node;
            __CLR4_4_1376376lh9yvgkd.R.inc(4580);int i = 0;
            __CLR4_4_1376376lh9yvgkd.R.inc(4581);do {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4582);if ((((el.tag.preserveWhitespace())&&(__CLR4_4_1376376lh9yvgkd.R.iget(4583)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4584)==0&false)))
                    {__CLR4_4_1376376lh9yvgkd.R.inc(4585);return true;
                }__CLR4_4_1376376lh9yvgkd.R.inc(4586);el = el.parent();
                __CLR4_4_1376376lh9yvgkd.R.inc(4587);i++;
            } }while ((((i < 6 && el != null)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4588)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4589)==0&false)));
        }
        }__CLR4_4_1376376lh9yvgkd.R.inc(4590);return false;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Set the text of this element. Any existing contents (text or elements) will be cleared
     * @param text unencoded text
     * @return this element
     */
    public Element text(String text) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4591);
        __CLR4_4_1376376lh9yvgkd.R.inc(4592);Validate.notNull(text);

        __CLR4_4_1376376lh9yvgkd.R.inc(4593);empty();
        __CLR4_4_1376376lh9yvgkd.R.inc(4594);TextNode textNode = new TextNode(text);
        __CLR4_4_1376376lh9yvgkd.R.inc(4595);appendChild(textNode);

        __CLR4_4_1376376lh9yvgkd.R.inc(4596);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     Test if this element has any text content (that is not just whitespace).
     @return true if element has non-blank text content.
     */
    public boolean hasText() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4597);
        __CLR4_4_1376376lh9yvgkd.R.inc(4598);for (Node child: childNodes) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4599);if ((((child instanceof TextNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4600)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4601)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4602);TextNode textNode = (TextNode) child;
                __CLR4_4_1376376lh9yvgkd.R.inc(4603);if ((((!textNode.isBlank())&&(__CLR4_4_1376376lh9yvgkd.R.iget(4604)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4605)==0&false)))
                    {__CLR4_4_1376376lh9yvgkd.R.inc(4606);return true;
            }} }else {__CLR4_4_1376376lh9yvgkd.R.inc(4607);if ((((child instanceof Element)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4608)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4609)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4610);Element el = (Element) child;
                __CLR4_4_1376376lh9yvgkd.R.inc(4611);if ((((el.hasText())&&(__CLR4_4_1376376lh9yvgkd.R.iget(4612)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4613)==0&false)))
                    {__CLR4_4_1376376lh9yvgkd.R.inc(4614);return true;
            }}
        }}}
        }__CLR4_4_1376376lh9yvgkd.R.inc(4615);return false;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get the combined data of this element. Data is e.g. the inside of a {@code script} tag. Note that data is NOT the
     * text of the element. Use {@link #text()} to get the text that would be visible to a user, and {@link #data()}
     * for the contents of scripts, comments, CSS styles, etc.
     *
     * @return the data, or empty string if none
     *
     * @see #dataNodes()
     */
    public String data() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4616);
        __CLR4_4_1376376lh9yvgkd.R.inc(4617);StringBuilder sb = StringUtil.borrowBuilder();

        __CLR4_4_1376376lh9yvgkd.R.inc(4618);for (Node childNode : childNodes) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4619);if ((((childNode instanceof DataNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4620)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4621)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4622);DataNode data = (DataNode) childNode;
                __CLR4_4_1376376lh9yvgkd.R.inc(4623);sb.append(data.getWholeData());
            } }else {__CLR4_4_1376376lh9yvgkd.R.inc(4624);if ((((childNode instanceof Comment)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4625)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4626)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4627);Comment comment = (Comment) childNode;
                __CLR4_4_1376376lh9yvgkd.R.inc(4628);sb.append(comment.getData());
            } }else {__CLR4_4_1376376lh9yvgkd.R.inc(4629);if ((((childNode instanceof Element)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4630)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4631)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4632);Element element = (Element) childNode;
                __CLR4_4_1376376lh9yvgkd.R.inc(4633);String elementData = element.data();
                __CLR4_4_1376376lh9yvgkd.R.inc(4634);sb.append(elementData);
            } }else {__CLR4_4_1376376lh9yvgkd.R.inc(4635);if ((((childNode instanceof CDataNode)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4636)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4637)==0&false))) {{
                // this shouldn't really happen because the html parser won't see the cdata as anything special when parsing script.
                // but incase another type gets through.
                __CLR4_4_1376376lh9yvgkd.R.inc(4638);CDataNode cDataNode = (CDataNode) childNode;
                __CLR4_4_1376376lh9yvgkd.R.inc(4639);sb.append(cDataNode.getWholeText());
            }
        }}}}}
        }__CLR4_4_1376376lh9yvgkd.R.inc(4640);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}   

    /**
     * Gets the literal value of this element's "class" attribute, which may include multiple class names, space
     * separated. (E.g. on <code>&lt;div class="header gray"&gt;</code> returns, "<code>header gray</code>")
     * @return The literal class attribute, or <b>empty string</b> if no class attribute set.
     */
    public String className() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4641);
        __CLR4_4_1376376lh9yvgkd.R.inc(4642);return attr("class").trim();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Get all of the element's class names. E.g. on element {@code <div class="header gray">},
     * returns a set of two elements {@code "header", "gray"}. Note that modifications to this set are not pushed to
     * the backing {@code class} attribute; use the {@link #classNames(java.util.Set)} method to persist them.
     * @return set of classnames, empty if no class attribute
     */
    public Set<String> classNames() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4643);
    	__CLR4_4_1376376lh9yvgkd.R.inc(4644);String[] names = classSplit.split(className());
    	__CLR4_4_1376376lh9yvgkd.R.inc(4645);Set<String> classNames = new LinkedHashSet<>(Arrays.asList(names));
    	__CLR4_4_1376376lh9yvgkd.R.inc(4646);classNames.remove(""); // if classNames() was empty, would include an empty class

        __CLR4_4_1376376lh9yvgkd.R.inc(4647);return classNames;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     Set the element's {@code class} attribute to the supplied class names.
     @param classNames set of classes
     @return this element, for chaining
     */
    public Element classNames(Set<String> classNames) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4648);
        __CLR4_4_1376376lh9yvgkd.R.inc(4649);Validate.notNull(classNames);
        __CLR4_4_1376376lh9yvgkd.R.inc(4650);if ((((classNames.isEmpty())&&(__CLR4_4_1376376lh9yvgkd.R.iget(4651)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4652)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4653);attributes().remove("class");
        } }else {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4654);attributes().put("class", StringUtil.join(classNames, " "));
        }
        }__CLR4_4_1376376lh9yvgkd.R.inc(4655);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Tests if this element has a class. Case insensitive.
     * @param className name of class to check for
     * @return true if it does, false if not
     */
    // performance sensitive
    public boolean hasClass(String className) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4656);
        __CLR4_4_1376376lh9yvgkd.R.inc(4657);final String classAttr = attributes().getIgnoreCase("class");
        __CLR4_4_1376376lh9yvgkd.R.inc(4658);final int len = classAttr.length();
        __CLR4_4_1376376lh9yvgkd.R.inc(4659);final int wantLen = className.length();

        __CLR4_4_1376376lh9yvgkd.R.inc(4660);if ((((len == 0 || len < wantLen)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4661)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4662)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4663);return false;
        }

        // if both lengths are equal, only need compare the className with the attribute
        }__CLR4_4_1376376lh9yvgkd.R.inc(4664);if ((((len == wantLen)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4665)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4666)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4667);return className.equalsIgnoreCase(classAttr);
        }

        // otherwise, scan for whitespace and compare regions (with no string or arraylist allocations)
        }__CLR4_4_1376376lh9yvgkd.R.inc(4668);boolean inClass = false;
        __CLR4_4_1376376lh9yvgkd.R.inc(4669);int start = 0;
        __CLR4_4_1376376lh9yvgkd.R.inc(4670);for (int i = 0; (((i < len)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4671)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4672)==0&false)); i++) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4673);if ((((Character.isWhitespace(classAttr.charAt(i)))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4674)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4675)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4676);if ((((inClass)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4677)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4678)==0&false))) {{
                    // white space ends a class name, compare it with the requested one, ignore case
                    __CLR4_4_1376376lh9yvgkd.R.inc(4679);if ((((i - start == wantLen && classAttr.regionMatches(true, start, className, 0, wantLen))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4680)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4681)==0&false))) {{
                        __CLR4_4_1376376lh9yvgkd.R.inc(4682);return true;
                    }
                    }__CLR4_4_1376376lh9yvgkd.R.inc(4683);inClass = false;
                }
            }} }else {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4684);if ((((!inClass)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4685)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4686)==0&false))) {{
                    // we're in a class name : keep the start of the substring
                    __CLR4_4_1376376lh9yvgkd.R.inc(4687);inClass = true;
                    __CLR4_4_1376376lh9yvgkd.R.inc(4688);start = i;
                }
            }}
        }}

        // check the last entry
        }__CLR4_4_1376376lh9yvgkd.R.inc(4689);if ((((inClass && len - start == wantLen)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4690)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4691)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4692);return classAttr.regionMatches(true, start, className, 0, wantLen);
        }

        }__CLR4_4_1376376lh9yvgkd.R.inc(4693);return false;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     Add a class name to this element's {@code class} attribute.
     @param className class name to add
     @return this element
     */
    public Element addClass(String className) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4694);
        __CLR4_4_1376376lh9yvgkd.R.inc(4695);Validate.notNull(className);

        __CLR4_4_1376376lh9yvgkd.R.inc(4696);Set<String> classes = classNames();
        __CLR4_4_1376376lh9yvgkd.R.inc(4697);classes.add(className);
        __CLR4_4_1376376lh9yvgkd.R.inc(4698);classNames(classes);

        __CLR4_4_1376376lh9yvgkd.R.inc(4699);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     Remove a class name from this element's {@code class} attribute.
     @param className class name to remove
     @return this element
     */
    public Element removeClass(String className) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4700);
        __CLR4_4_1376376lh9yvgkd.R.inc(4701);Validate.notNull(className);

        __CLR4_4_1376376lh9yvgkd.R.inc(4702);Set<String> classes = classNames();
        __CLR4_4_1376376lh9yvgkd.R.inc(4703);classes.remove(className);
        __CLR4_4_1376376lh9yvgkd.R.inc(4704);classNames(classes);

        __CLR4_4_1376376lh9yvgkd.R.inc(4705);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     Toggle a class name on this element's {@code class} attribute: if present, remove it; otherwise add it.
     @param className class name to toggle
     @return this element
     */
    public Element toggleClass(String className) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4706);
        __CLR4_4_1376376lh9yvgkd.R.inc(4707);Validate.notNull(className);

        __CLR4_4_1376376lh9yvgkd.R.inc(4708);Set<String> classes = classNames();
        __CLR4_4_1376376lh9yvgkd.R.inc(4709);if ((((classes.contains(className))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4710)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4711)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4712);classes.remove(className);
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4713);classes.add(className);
        }__CLR4_4_1376376lh9yvgkd.R.inc(4714);classNames(classes);

        __CLR4_4_1376376lh9yvgkd.R.inc(4715);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Get the value of a form element (input, textarea, etc).
     * @return the value of the form element, or empty string if not set.
     */
    public String val() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4716);
        __CLR4_4_1376376lh9yvgkd.R.inc(4717);if ((((tagName().equals("textarea"))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4718)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4719)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4720);return text();
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4721);return attr("value");
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Set the value of a form element (input, textarea, etc).
     * @param value value to set
     * @return this element (for chaining)
     */
    public Element val(String value) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4722);
        __CLR4_4_1376376lh9yvgkd.R.inc(4723);if ((((tagName().equals("textarea"))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4724)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4725)==0&false)))
            {__CLR4_4_1376376lh9yvgkd.R.inc(4726);text(value);
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4727);attr("value", value);
        }__CLR4_4_1376376lh9yvgkd.R.inc(4728);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    void outerHtmlHead(final Appendable accum, int depth, final Document.OutputSettings out) throws IOException {try{__CLR4_4_1376376lh9yvgkd.R.inc(4729);
        __CLR4_4_1376376lh9yvgkd.R.inc(4730);if ((((out.prettyPrint() && (tag.formatAsBlock() || (parent() != null && parent().tag().formatAsBlock()) || out.outline()))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4731)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4732)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4733);if ((((accum instanceof StringBuilder)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4734)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4735)==0&false))) {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4736);if ((((((StringBuilder) accum).length() > 0)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4737)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4738)==0&false)))
                    {__CLR4_4_1376376lh9yvgkd.R.inc(4739);indent(accum, depth, out);
            }} }else {{
                __CLR4_4_1376376lh9yvgkd.R.inc(4740);indent(accum, depth, out);
            }
        }}
        }__CLR4_4_1376376lh9yvgkd.R.inc(4741);accum.append('<').append(tagName());
        __CLR4_4_1376376lh9yvgkd.R.inc(4742);if ((((attributes != null)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4743)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4744)==0&false))) {__CLR4_4_1376376lh9yvgkd.R.inc(4745);attributes.html(accum, out);

        // selfclosing includes unknown tags, isEmpty defines tags that are always empty
        }__CLR4_4_1376376lh9yvgkd.R.inc(4746);if ((((childNodes.isEmpty() && tag.isSelfClosing())&&(__CLR4_4_1376376lh9yvgkd.R.iget(4747)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4748)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4749);if ((((out.syntax() == Document.OutputSettings.Syntax.html && tag.isEmpty())&&(__CLR4_4_1376376lh9yvgkd.R.iget(4750)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4751)==0&false)))
                {__CLR4_4_1376376lh9yvgkd.R.inc(4752);accum.append('>');
            }else
                {__CLR4_4_1376376lh9yvgkd.R.inc(4753);accum.append(" />"); // <img> in html, <img /> in xml
        }}
        }else
            {__CLR4_4_1376376lh9yvgkd.R.inc(4754);accum.append('>');
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

	void outerHtmlTail(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_4_1376376lh9yvgkd.R.inc(4755);
        __CLR4_4_1376376lh9yvgkd.R.inc(4756);if ((((!(childNodes.isEmpty() && tag.isSelfClosing()))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4757)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4758)==0&false))) {{
            __CLR4_4_1376376lh9yvgkd.R.inc(4759);if ((((out.prettyPrint() && (!childNodes.isEmpty() && (
                    tag.formatAsBlock() || (out.outline() && (childNodes.size()>1 || (childNodes.size()==1 && !(childNodes.get(0) instanceof TextNode))))
            )))&&(__CLR4_4_1376376lh9yvgkd.R.iget(4760)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4761)==0&false)))
                {__CLR4_4_1376376lh9yvgkd.R.inc(4762);indent(accum, depth, out);
            }__CLR4_4_1376376lh9yvgkd.R.inc(4763);accum.append("</").append(tagName()).append('>');
        }
    }}finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    /**
     * Retrieves the element's inner HTML. E.g. on a {@code <div>} with one empty {@code <p>}, would return
     * {@code <p></p>}. (Whereas {@link #outerHtml()} would return {@code <div><p></p></div>}.)
     * 
     * @return String of HTML.
     * @see #outerHtml()
     */
    public String html() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4764);
        __CLR4_4_1376376lh9yvgkd.R.inc(4765);StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_4_1376376lh9yvgkd.R.inc(4766);html(accum);
        __CLR4_4_1376376lh9yvgkd.R.inc(4767);String html = StringUtil.releaseBuilder(accum);
        __CLR4_4_1376376lh9yvgkd.R.inc(4768);return (((NodeUtils.outputSettings(this).prettyPrint() )&&(__CLR4_4_1376376lh9yvgkd.R.iget(4769)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4770)==0&false))? html.trim() : html;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public <T extends Appendable> T html(T appendable) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4771);
        __CLR4_4_1376376lh9yvgkd.R.inc(4772);final int size = childNodes.size();
        __CLR4_4_1376376lh9yvgkd.R.inc(4773);for (int i = 0; (((i < size)&&(__CLR4_4_1376376lh9yvgkd.R.iget(4774)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4775)==0&false)); i++)
            {__CLR4_4_1376376lh9yvgkd.R.inc(4776);childNodes.get(i).outerHtml(appendable);

        }__CLR4_4_1376376lh9yvgkd.R.inc(4777);return appendable;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    
    /**
     * Set this element's inner HTML. Clears the existing HTML first.
     * @param html HTML to parse and set into this element
     * @return this element
     * @see #append(String)
     */
    public Element html(String html) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4778);
        __CLR4_4_1376376lh9yvgkd.R.inc(4779);empty();
        __CLR4_4_1376376lh9yvgkd.R.inc(4780);append(html);
        __CLR4_4_1376376lh9yvgkd.R.inc(4781);return this;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public Element clone() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4782);
        __CLR4_4_1376376lh9yvgkd.R.inc(4783);return (Element) super.clone();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public Element shallowClone() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4784);
        // simpler than implementing a clone version with no child copy
        __CLR4_4_1376376lh9yvgkd.R.inc(4785);return new Element(tag, baseUri, (((attributes == null )&&(__CLR4_4_1376376lh9yvgkd.R.iget(4786)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4787)==0&false))? null : attributes.clone());
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    protected Element doClone(Node parent) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4788);
        __CLR4_4_1376376lh9yvgkd.R.inc(4789);Element clone = (Element) super.doClone(parent);
        __CLR4_4_1376376lh9yvgkd.R.inc(4790);clone.attributes = (((attributes != null )&&(__CLR4_4_1376376lh9yvgkd.R.iget(4791)!=0|true))||(__CLR4_4_1376376lh9yvgkd.R.iget(4792)==0&false))? attributes.clone() : null;
        __CLR4_4_1376376lh9yvgkd.R.inc(4793);clone.baseUri = baseUri;
        __CLR4_4_1376376lh9yvgkd.R.inc(4794);clone.childNodes = new NodeList(clone, childNodes.size());
        __CLR4_4_1376376lh9yvgkd.R.inc(4795);clone.childNodes.addAll(childNodes); // the children then get iterated and cloned in Node.clone

        __CLR4_4_1376376lh9yvgkd.R.inc(4796);return clone;
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    // overrides of Node for call chaining
    @Override
    public Element clearAttributes() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4797);
        __CLR4_4_1376376lh9yvgkd.R.inc(4798);return (Element) super.clearAttributes();
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public Element removeAttr(String attributeKey) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4799);
        __CLR4_4_1376376lh9yvgkd.R.inc(4800);return (Element) super.removeAttr(attributeKey);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public Element root() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4801);
        __CLR4_4_1376376lh9yvgkd.R.inc(4802);return (Element) super.root(); // probably a document, but always at least an element
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public Element traverse(NodeVisitor nodeVisitor) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4803);
        __CLR4_4_1376376lh9yvgkd.R.inc(4804);return  (Element) super.traverse(nodeVisitor);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    @Override
    public Element filter(NodeFilter nodeFilter) {try{__CLR4_4_1376376lh9yvgkd.R.inc(4805);
        __CLR4_4_1376376lh9yvgkd.R.inc(4806);return  (Element) super.filter(nodeFilter);
    }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

    private static final class NodeList extends ChangeNotifyingArrayList<Node> {
        private final Element owner;

        NodeList(Element owner, int initialCapacity) {
            super(initialCapacity);__CLR4_4_1376376lh9yvgkd.R.inc(4808);try{__CLR4_4_1376376lh9yvgkd.R.inc(4807);
            __CLR4_4_1376376lh9yvgkd.R.inc(4809);this.owner = owner;
        }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}

        public void onContentsChanged() {try{__CLR4_4_1376376lh9yvgkd.R.inc(4810);
            __CLR4_4_1376376lh9yvgkd.R.inc(4811);owner.nodelistChanged();
        }finally{__CLR4_4_1376376lh9yvgkd.R.flushNeeded();}}
    }
}
