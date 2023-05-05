/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.io.IOException;
import java.util.*;

/**
 The base, abstract Node model. Elements, Documents, Comments etc are all Node instances.

 @author Jonathan Hedley, jonathan@hedley.net */
public abstract class Node implements Cloneable {public static class __CLR4_4_13yu3yulh9yvgln{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,5464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final String EmptyString = "";
    Node parentNode;
    int siblingIndex;

    /**
     * Default constructor. Doesn't setup base uri, children, or attributes; use with caution.
     */
    protected Node() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5142);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Get the node name of this node. Use for debugging purposes and not logic switching (for that, use instanceof).
     @return node name
     */
    public abstract String nodeName();

    /**
     * Check if this Node has an actual Attributes object.
     */
    protected abstract boolean hasAttributes();

    public boolean hasParent() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5143);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5144);return parentNode != null;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Get an attribute's value by its key. <b>Case insensitive</b>
     * <p>
     * To get an absolute URL from an attribute that may be a relative URL, prefix the key with <code><b>abs</b></code>,
     * which is a shortcut to the {@link #absUrl} method.
     * </p>
     * E.g.:
     * <blockquote><code>String url = a.attr("abs:href");</code></blockquote>
     *
     * @param attributeKey The attribute key.
     * @return The attribute, or empty string if not present (to avoid nulls).
     * @see #attributes()
     * @see #hasAttr(String)
     * @see #absUrl(String)
     */
    public String attr(String attributeKey) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5145);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5146);Validate.notNull(attributeKey);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5147);if ((((!hasAttributes())&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5148)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5149)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5150);return EmptyString;

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5151);String val = attributes().getIgnoreCase(attributeKey);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5152);if ((((val.length() > 0)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5153)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5154)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5155);return val;
        }else {__CLR4_4_13yu3yulh9yvgln.R.inc(5156);if ((((attributeKey.startsWith("abs:"))&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5157)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5158)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5159);return absUrl(attributeKey.substring("abs:".length()));
        }else {__CLR4_4_13yu3yulh9yvgln.R.inc(5160);return "";
    }}}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Get all of the element's attributes.
     * @return attributes (which implements iterable, in same order as presented in original HTML).
     */
    public abstract Attributes attributes();

    /**
     * Set an attribute (key=value). If the attribute already exists, it is replaced. The attribute key comparison is
     * <b>case insensitive</b>. The key will be set with case sensitivity as set in the parser settings.
     * @param attributeKey The attribute key.
     * @param attributeValue The attribute value.
     * @return this (for chaining)
     */
    public Node attr(String attributeKey, String attributeValue) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5161);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5162);attributeKey = NodeUtils.parser(this).settings().normalizeAttribute(attributeKey);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5163);attributes().putIgnoreCase(attributeKey, attributeValue);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5164);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Test if this element has an attribute. <b>Case insensitive</b>
     * @param attributeKey The attribute key to check.
     * @return true if the attribute exists, false if not.
     */
    public boolean hasAttr(String attributeKey) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5165);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5166);Validate.notNull(attributeKey);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5167);if ((((attributeKey.startsWith("abs:"))&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5168)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5169)==0&false))) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5170);String key = attributeKey.substring("abs:".length());
            __CLR4_4_13yu3yulh9yvgln.R.inc(5171);if ((((attributes().hasKeyIgnoreCase(key) && !absUrl(key).equals(""))&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5172)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5173)==0&false)))
                {__CLR4_4_13yu3yulh9yvgln.R.inc(5174);return true;
        }}
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5175);return attributes().hasKeyIgnoreCase(attributeKey);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Remove an attribute from this node.
     * @param attributeKey The attribute to remove.
     * @return this (for chaining)
     */
    public Node removeAttr(String attributeKey) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5176);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5177);Validate.notNull(attributeKey);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5178);attributes().removeIgnoreCase(attributeKey);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5179);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Clear (remove) all of the attributes in this node.
     * @return this, for chaining
     */
    public Node clearAttributes() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5180);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5181);Iterator<Attribute> it = attributes().iterator();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5182);while ((((it.hasNext())&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5183)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5184)==0&false))) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5185);it.next();
            __CLR4_4_13yu3yulh9yvgln.R.inc(5186);it.remove();
        }
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5187);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Get the base URI of this node.
     @return base URI
     */
    public abstract String baseUri();

    /**
     * Set the baseUri for just this node (not its descendants), if this Node tracks base URIs.
     * @param baseUri new URI
     */
    protected abstract void doSetBaseUri(String baseUri);

    /**
     Update the base URI of this node and all of its descendants.
     @param baseUri base URI to set
     */
    public void setBaseUri(final String baseUri) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5188);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5189);Validate.notNull(baseUri);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5190);traverse(new NodeVisitor() {
            public void head(Node node, int depth) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5191);
                __CLR4_4_13yu3yulh9yvgln.R.inc(5192);node.doSetBaseUri(baseUri);
            }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

            public void tail(Node node, int depth) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5193);
            }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}
        });
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Get an absolute URL from a URL attribute that may be relative (i.e. an <code>&lt;a href&gt;</code> or
     * <code>&lt;img src&gt;</code>).
     * <p>
     * E.g.: <code>String absUrl = linkEl.absUrl("href");</code>
     * </p>
     * <p>
     * If the attribute value is already absolute (i.e. it starts with a protocol, like
     * <code>http://</code> or <code>https://</code> etc), and it successfully parses as a URL, the attribute is
     * returned directly. Otherwise, it is treated as a URL relative to the element's {@link #baseUri}, and made
     * absolute using that.
     * </p>
     * <p>
     * As an alternate, you can use the {@link #attr} method with the <code>abs:</code> prefix, e.g.:
     * <code>String absUrl = linkEl.attr("abs:href");</code>
     * </p>
     *
     * @param attributeKey The attribute key
     * @return An absolute URL if one could be made, or an empty string (not null) if the attribute was missing or
     * could not be made successfully into a URL.
     * @see #attr
     * @see java.net.URL#URL(java.net.URL, String)
     */
    public String absUrl(String attributeKey) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5194);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5195);Validate.notEmpty(attributeKey);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5196);if ((((!hasAttr(attributeKey))&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5197)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5198)==0&false))) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5199);return ""; // nothing to make absolute with
        } }else {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5200);return StringUtil.resolve(baseUri(), attr(attributeKey));
        }
    }}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected abstract List<Node> ensureChildNodes();

    /**
     Get a child node by its 0-based index.
     @param index index of child node
     @return the child node at this index. Throws a {@code IndexOutOfBoundsException} if the index is out of bounds.
     */
    public Node childNode(int index) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5201);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5202);return ensureChildNodes().get(index);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Get this node's children. Presented as an unmodifiable list: new children can not be added, but the child nodes
     themselves can be manipulated.
     @return list of children. If no children, returns an empty list.
     */
    public List<Node> childNodes() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5203);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5204);return Collections.unmodifiableList(ensureChildNodes());
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Returns a deep copy of this node's children. Changes made to these nodes will not be reflected in the original
     * nodes
     * @return a deep copy of this node's children
     */
    public List<Node> childNodesCopy() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5205);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5206);final List<Node> nodes = ensureChildNodes();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5207);final ArrayList<Node> children = new ArrayList<>(nodes.size());
        __CLR4_4_13yu3yulh9yvgln.R.inc(5208);for (Node node : nodes) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5209);children.add(node.clone());
        }
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5210);return children;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Get the number of child nodes that this node holds.
     * @return the number of child nodes that this node holds.
     */
    public abstract int childNodeSize();

    protected Node[] childNodesAsArray() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5211);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5212);return ensureChildNodes().toArray(new Node[0]);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Gets this node's parent node.
     @return parent node; or null if no parent.
     */
    public Node parent() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5213);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5214);return parentNode;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Gets this node's parent node. Not overridable by extending classes, so useful if you really just need the Node type.
     @return parent node; or null if no parent.
     */
    public final Node parentNode() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5215);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5216);return parentNode;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Get this node's root node; that is, its topmost ancestor. If this node is the top ancestor, returns {@code this}.
     * @return topmost ancestor.
     */
    public Node root() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5217);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5218);Node node = this;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5219);while ((((node.parentNode != null)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5220)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5221)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5222);node = node.parentNode;
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5223);return node;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Gets the Document associated with this Node.
     * @return the Document associated with this Node, or null if there is no such Document.
     */
    public Document ownerDocument() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5224);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5225);Node root = root();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5226);return ((((root instanceof Document) )&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5227)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5228)==0&false))? (Document) root : null;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Remove (delete) this node from the DOM tree. If this node has children, they are also removed.
     */
    public void remove() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5229);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5230);Validate.notNull(parentNode);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5231);parentNode.removeChild(this);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM before this node (i.e. as a preceding sibling).
     * @param html HTML to add before this node
     * @return this node, for chaining
     * @see #after(String)
     */
    public Node before(String html) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5232);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5233);addSiblingHtml(siblingIndex, html);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5234);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM before this node (i.e. as a preceding sibling).
     * @param node to add before this node
     * @return this node, for chaining
     * @see #after(Node)
     */
    public Node before(Node node) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5235);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5236);Validate.notNull(node);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5237);Validate.notNull(parentNode);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5238);parentNode.addChildren(siblingIndex, node);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5239);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Insert the specified HTML into the DOM after this node (i.e. as a following sibling).
     * @param html HTML to add after this node
     * @return this node, for chaining
     * @see #before(String)
     */
    public Node after(String html) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5240);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5241);addSiblingHtml(siblingIndex + 1, html);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5242);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Insert the specified node into the DOM after this node (i.e. as a following sibling).
     * @param node to add after this node
     * @return this node, for chaining
     * @see #before(Node)
     */
    public Node after(Node node) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5243);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5244);Validate.notNull(node);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5245);Validate.notNull(parentNode);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5246);parentNode.addChildren(siblingIndex + 1, node);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5247);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    private void addSiblingHtml(int index, String html) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5248);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5249);Validate.notNull(html);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5250);Validate.notNull(parentNode);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5251);Element context = (((parent() instanceof Element )&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5252)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5253)==0&false))? (Element) parent() : null;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5254);List<Node> nodes = NodeUtils.parser(this).parseFragmentInput(html, context, baseUri());
        __CLR4_4_13yu3yulh9yvgln.R.inc(5255);parentNode.addChildren(index, nodes.toArray(new Node[0]));
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Wrap the supplied HTML around this node.
     @param html HTML to wrap around this element, e.g. {@code <div class="head"></div>}. Can be arbitrarily deep.
     @return this node, for chaining.
     */
    public Node wrap(String html) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5256);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5257);Validate.notEmpty(html);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5258);Element context = (((parent() instanceof Element )&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5259)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5260)==0&false))? (Element) parent() : null;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5261);List<Node> wrapChildren = NodeUtils.parser(this).parseFragmentInput(html, context, baseUri());
        __CLR4_4_13yu3yulh9yvgln.R.inc(5262);Node wrapNode = wrapChildren.get(0);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5263);if ((((!(wrapNode instanceof Element))&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5264)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5265)==0&false))) // nothing to wrap with; noop
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5266);return null;

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5267);Element wrap = (Element) wrapNode;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5268);Element deepest = getDeepChild(wrap);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5269);parentNode.replaceChild(this, wrap);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5270);deepest.addChildren(this);

        // remainder (unbalanced wrap, like <div></div><p></p> -- The <p> is remainder
        __CLR4_4_13yu3yulh9yvgln.R.inc(5271);if ((((wrapChildren.size() > 0)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5272)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5273)==0&false))) {{
            //noinspection ForLoopReplaceableByForEach (beacause it allocates an Iterator which is wasteful here)
            __CLR4_4_13yu3yulh9yvgln.R.inc(5274);for (int i = 0; (((i < wrapChildren.size())&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5275)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5276)==0&false)); i++) {{
                __CLR4_4_13yu3yulh9yvgln.R.inc(5277);Node remainder = wrapChildren.get(i);
                __CLR4_4_13yu3yulh9yvgln.R.inc(5278);remainder.parentNode.removeChild(remainder);
                __CLR4_4_13yu3yulh9yvgln.R.inc(5279);wrap.appendChild(remainder);
            }
        }}
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5280);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Removes this node from the DOM, and moves its children up into the node's parent. This has the effect of dropping
     * the node but keeping its children.
     * <p>
     * For example, with the input html:
     * </p>
     * <p>{@code <div>One <span>Two <b>Three</b></span></div>}</p>
     * Calling {@code element.unwrap()} on the {@code span} element will result in the html:
     * <p>{@code <div>One Two <b>Three</b></div>}</p>
     * and the {@code "Two "} {@link TextNode} being returned.
     *
     * @return the first child of this node, after the node has been unwrapped. Null if the node had no children.
     * @see #remove()
     * @see #wrap(String)
     */
    public Node unwrap() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5281);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5282);Validate.notNull(parentNode);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5283);final List<Node> childNodes = ensureChildNodes();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5284);Node firstChild = (((childNodes.size() > 0 )&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5285)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5286)==0&false))? childNodes.get(0) : null;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5287);parentNode.addChildren(siblingIndex, this.childNodesAsArray());
        __CLR4_4_13yu3yulh9yvgln.R.inc(5288);this.remove();

        __CLR4_4_13yu3yulh9yvgln.R.inc(5289);return firstChild;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    private Element getDeepChild(Element el) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5290);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5291);List<Element> children = el.children();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5292);if ((((children.size() > 0)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5293)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5294)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5295);return getDeepChild(children.get(0));
        }else
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5296);return el;
    }}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    void nodelistChanged() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5297);
        // Element overrides this to clear its shadow children elements
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Replace this node in the DOM with the supplied node.
     * @param in the node that will will replace the existing node.
     */
    public void replaceWith(Node in) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5298);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5299);Validate.notNull(in);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5300);Validate.notNull(parentNode);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5301);parentNode.replaceChild(this, in);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void setParentNode(Node parentNode) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5302);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5303);Validate.notNull(parentNode);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5304);if ((((this.parentNode != null)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5305)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5306)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5307);this.parentNode.removeChild(this);
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5308);this.parentNode = parentNode;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void replaceChild(Node out, Node in) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5309);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5310);Validate.isTrue(out.parentNode == this);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5311);Validate.notNull(in);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5312);if ((((in.parentNode != null)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5313)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5314)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5315);in.parentNode.removeChild(in);

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5316);final int index = out.siblingIndex;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5317);ensureChildNodes().set(index, in);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5318);in.parentNode = this;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5319);in.setSiblingIndex(index);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5320);out.parentNode = null;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void removeChild(Node out) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5321);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5322);Validate.isTrue(out.parentNode == this);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5323);final int index = out.siblingIndex;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5324);ensureChildNodes().remove(index);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5325);reindexChildren(index);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5326);out.parentNode = null;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void addChildren(Node... children) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5327);
        //most used. short circuit addChildren(int), which hits reindex children and array copy
        __CLR4_4_13yu3yulh9yvgln.R.inc(5328);final List<Node> nodes = ensureChildNodes();

        __CLR4_4_13yu3yulh9yvgln.R.inc(5329);for (Node child: children) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5330);reparentChild(child);
            __CLR4_4_13yu3yulh9yvgln.R.inc(5331);nodes.add(child);
            __CLR4_4_13yu3yulh9yvgln.R.inc(5332);child.setSiblingIndex(nodes.size()-1);
        }
    }}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void addChildren(int index, Node... children) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5333);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5334);Validate.noNullElements(children);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5335);final List<Node> nodes = ensureChildNodes();

        __CLR4_4_13yu3yulh9yvgln.R.inc(5336);for (Node child : children) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5337);reparentChild(child);
        }
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5338);nodes.addAll(index, Arrays.asList(children));
        __CLR4_4_13yu3yulh9yvgln.R.inc(5339);reindexChildren(index);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}
    
    protected void reparentChild(Node child) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5340);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5341);child.setParentNode(this);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    private void reindexChildren(int start) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5342);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5343);final List<Node> childNodes = ensureChildNodes();

        __CLR4_4_13yu3yulh9yvgln.R.inc(5344);for (int i = start; (((i < childNodes.size())&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5345)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5346)==0&false)); i++) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5347);childNodes.get(i).setSiblingIndex(i);
        }
    }}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Retrieves this node's sibling nodes. Similar to {@link #childNodes()  node.parent.childNodes()}, but does not
     include this node (a node is not a sibling of itself).
     @return node siblings. If the node has no parent, returns an empty list.
     */
    public List<Node> siblingNodes() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5348);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5349);if ((((parentNode == null)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5350)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5351)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5352);return Collections.emptyList();

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5353);List<Node> nodes = parentNode.ensureChildNodes();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5354);List<Node> siblings = new ArrayList<>(nodes.size() - 1);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5355);for (Node node: nodes)
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5356);if ((((node != this)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5357)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5358)==0&false)))
                {__CLR4_4_13yu3yulh9yvgln.R.inc(5359);siblings.add(node);
        }}__CLR4_4_13yu3yulh9yvgln.R.inc(5360);return siblings;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Get this node's next sibling.
     @return next sibling, or null if this is the last sibling
     */
    public Node nextSibling() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5361);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5362);if ((((parentNode == null)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5363)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5364)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5365);return null; // root

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5366);final List<Node> siblings = parentNode.ensureChildNodes();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5367);final int index = siblingIndex+1;
        __CLR4_4_13yu3yulh9yvgln.R.inc(5368);if ((((siblings.size() > index)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5369)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5370)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5371);return siblings.get(index);
        }else
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5372);return null;
    }}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Get this node's previous sibling.
     @return the previous sibling, or null if this is the first sibling
     */
    public Node previousSibling() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5373);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5374);if ((((parentNode == null)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5375)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5376)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5377);return null; // root

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5378);if ((((siblingIndex > 0)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5379)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5380)==0&false)))
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5381);return parentNode.ensureChildNodes().get(siblingIndex-1);
        }else
            {__CLR4_4_13yu3yulh9yvgln.R.inc(5382);return null;
    }}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Get the list index of this node in its node sibling list. I.e. if this is the first node
     * sibling, returns 0.
     * @return position in node sibling list
     * @see org.jsoup.nodes.Element#elementSiblingIndex()
     */
    public int siblingIndex() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5383);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5384);return siblingIndex;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void setSiblingIndex(int siblingIndex) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5385);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5386);this.siblingIndex = siblingIndex;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Perform a depth-first traversal through this node and its descendants.
     * @param nodeVisitor the visitor callbacks to perform on each node
     * @return this node, for chaining
     */
    public Node traverse(NodeVisitor nodeVisitor) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5387);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5388);Validate.notNull(nodeVisitor);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5389);NodeTraversor.traverse(nodeVisitor, this);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5390);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Perform a depth-first filtering through this node and its descendants.
     * @param nodeFilter the filter callbacks to perform on each node
     * @return this node, for chaining
     */
    public Node filter(NodeFilter nodeFilter) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5391);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5392);Validate.notNull(nodeFilter);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5393);NodeTraversor.filter(nodeFilter, this);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5394);return this;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Get the outer HTML of this node. For example, on a {@code p} element, may return {@code <p>Para</p>}.
     @return outer HTML
     @see Element#html()
     @see Element#text()
     */
    public String outerHtml() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5395);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5396);StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5397);outerHtml(accum);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5398);return StringUtil.releaseBuilder(accum);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void outerHtml(Appendable accum) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5399);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5400);NodeTraversor.traverse(new OuterHtmlVisitor(accum, NodeUtils.outputSettings(this)), this);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     Get the outer HTML of this node.
     @param accum accumulator to place HTML into
     @throws IOException if appending to the given accumulator fails.
     */
    abstract void outerHtmlHead(final Appendable accum, int depth, final Document.OutputSettings out) throws IOException;

    abstract void outerHtmlTail(final Appendable accum, int depth, final Document.OutputSettings out) throws IOException;

    /**
     * Write this node and its children to the given {@link Appendable}.
     *
     * @param appendable the {@link Appendable} to write to.
     * @return the supplied {@link Appendable}, for chaining.
     */
    public <T extends Appendable> T html(T appendable) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5401);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5402);outerHtml(appendable);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5403);return appendable;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Gets this node's outer HTML.
     * @return outer HTML.
     * @see #outerHtml()
     */
	public String toString() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5404);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5405);return outerHtml();
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    protected void indent(Appendable accum, int depth, Document.OutputSettings out) throws IOException {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5406);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5407);accum.append('\n').append(StringUtil.padding(depth * out.indentAmount()));
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Check if this node is the same instance of another (object identity test).
     * @param o other object to compare to
     * @return true if the content of this node is the same as the other
     * @see Node#hasSameValue(Object) to compare nodes by their value
     */
    @Override
    public boolean equals(Object o) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5408);
        // implemented just so that javadoc is clear this is an identity test
        __CLR4_4_13yu3yulh9yvgln.R.inc(5409);return this == o;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Check if this node is has the same content as another node. A node is considered the same if its name, attributes and content match the
     * other node; particularly its position in the tree does not influence its similarity.
     * @param o other object to compare to
     * @return true if the content of this node is the same as the other
     */
    public boolean hasSameValue(Object o) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5410);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5411);if ((((this == o)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5412)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5413)==0&false))) {__CLR4_4_13yu3yulh9yvgln.R.inc(5414);return true;
        }__CLR4_4_13yu3yulh9yvgln.R.inc(5415);if ((((o == null || getClass() != o.getClass())&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5416)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5417)==0&false))) {__CLR4_4_13yu3yulh9yvgln.R.inc(5418);return false;

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5419);return this.outerHtml().equals(((Node) o).outerHtml());
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Create a stand-alone, deep copy of this node, and all of its children. The cloned node will have no siblings or
     * parent node. As a stand-alone object, any changes made to the clone or any of its children will not impact the
     * original node.
     * <p>
     * The cloned node may be adopted into another Document or node structure using {@link Element#appendChild(Node)}.
     * @return a stand-alone cloned node, including clones of any children
     * @see #shallowClone()
     */
    @Override
    public Node clone() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5420);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5421);Node thisClone = doClone(null); // splits for orphan

        // Queue up nodes that need their children cloned (BFS).
        __CLR4_4_13yu3yulh9yvgln.R.inc(5422);final LinkedList<Node> nodesToProcess = new LinkedList<>();
        __CLR4_4_13yu3yulh9yvgln.R.inc(5423);nodesToProcess.add(thisClone);

        __CLR4_4_13yu3yulh9yvgln.R.inc(5424);while ((((!nodesToProcess.isEmpty())&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5425)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5426)==0&false))) {{
            __CLR4_4_13yu3yulh9yvgln.R.inc(5427);Node currParent = nodesToProcess.remove();

            __CLR4_4_13yu3yulh9yvgln.R.inc(5428);final int size = currParent.childNodeSize();
            __CLR4_4_13yu3yulh9yvgln.R.inc(5429);for (int i = 0; (((i < size)&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5430)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5431)==0&false)); i++) {{
                __CLR4_4_13yu3yulh9yvgln.R.inc(5432);final List<Node> childNodes = currParent.ensureChildNodes();
                __CLR4_4_13yu3yulh9yvgln.R.inc(5433);Node childClone = childNodes.get(i).doClone(currParent);
                __CLR4_4_13yu3yulh9yvgln.R.inc(5434);childNodes.set(i, childClone);
                __CLR4_4_13yu3yulh9yvgln.R.inc(5435);nodesToProcess.add(childClone);
            }
        }}

        }__CLR4_4_13yu3yulh9yvgln.R.inc(5436);return thisClone;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /**
     * Create a stand-alone, shallow copy of this node. None of its children (if any) will be cloned, and it will have
     * no parent or sibling nodes.
     * @return a single independent copy of this node
     * @see #clone()
     */
    public Node shallowClone() {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5437);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5438);return doClone(null);
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    /*
     * Return a clone of the node using the given parent (which can be null).
     * Not a deep copy of children.
     */
    protected Node doClone(Node parent) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5439);
        __CLR4_4_13yu3yulh9yvgln.R.inc(5440);Node clone;

        __CLR4_4_13yu3yulh9yvgln.R.inc(5441);try {
            __CLR4_4_13yu3yulh9yvgln.R.inc(5442);clone = (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_4_13yu3yulh9yvgln.R.inc(5443);throw new RuntimeException(e);
        }

        __CLR4_4_13yu3yulh9yvgln.R.inc(5444);clone.parentNode = parent; // can be null, to create an orphan split
        __CLR4_4_13yu3yulh9yvgln.R.inc(5445);clone.siblingIndex = (((parent == null )&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5446)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5447)==0&false))? 0 : siblingIndex;

        __CLR4_4_13yu3yulh9yvgln.R.inc(5448);return clone;
    }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

    private static class OuterHtmlVisitor implements NodeVisitor {
        private Appendable accum;
        private Document.OutputSettings out;

        OuterHtmlVisitor(Appendable accum, Document.OutputSettings out) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5449);
            __CLR4_4_13yu3yulh9yvgln.R.inc(5450);this.accum = accum;
            __CLR4_4_13yu3yulh9yvgln.R.inc(5451);this.out = out;
            __CLR4_4_13yu3yulh9yvgln.R.inc(5452);out.prepareEncoder();
        }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

        public void head(Node node, int depth) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5453);
            __CLR4_4_13yu3yulh9yvgln.R.inc(5454);try {
				__CLR4_4_13yu3yulh9yvgln.R.inc(5455);node.outerHtmlHead(accum, depth, out);
			} catch (IOException exception) {
				__CLR4_4_13yu3yulh9yvgln.R.inc(5456);throw new SerializationException(exception);
			}
        }finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}

        public void tail(Node node, int depth) {try{__CLR4_4_13yu3yulh9yvgln.R.inc(5457);
            __CLR4_4_13yu3yulh9yvgln.R.inc(5458);if ((((!node.nodeName().equals("#text"))&&(__CLR4_4_13yu3yulh9yvgln.R.iget(5459)!=0|true))||(__CLR4_4_13yu3yulh9yvgln.R.iget(5460)==0&false))) {{ // saves a void hit.
				__CLR4_4_13yu3yulh9yvgln.R.inc(5461);try {
					__CLR4_4_13yu3yulh9yvgln.R.inc(5462);node.outerHtmlTail(accum, depth, out);
				} catch (IOException exception) {
					__CLR4_4_13yu3yulh9yvgln.R.inc(5463);throw new SerializationException(exception);
				}
            }
        }}finally{__CLR4_4_13yu3yulh9yvgln.R.flushNeeded();}}
    }
}
