/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Stack;

/**
 * Helper class to transform a {@link org.jsoup.nodes.Document} to a {@link org.w3c.dom.Document org.w3c.dom.Document},
 * for integration with toolsets that use the W3C DOM.
 */
public class W3CDom {public static class __CLR4_4_12dc2dclh9yvgft{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3171,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    /**
     * Convert a jsoup Document to a W3C Document.
     * @param in jsoup doc
     * @return w3c doc
     */
    public Document fromJsoup(org.jsoup.nodes.Document in) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3072);
        __CLR4_4_12dc2dclh9yvgft.R.inc(3073);Validate.notNull(in);
        __CLR4_4_12dc2dclh9yvgft.R.inc(3074);DocumentBuilder builder;
        __CLR4_4_12dc2dclh9yvgft.R.inc(3075);try {
        	//set the factory to be namespace-aware
        	__CLR4_4_12dc2dclh9yvgft.R.inc(3076);factory.setNamespaceAware(true);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3077);builder = factory.newDocumentBuilder();
            __CLR4_4_12dc2dclh9yvgft.R.inc(3078);Document out = builder.newDocument();
            __CLR4_4_12dc2dclh9yvgft.R.inc(3079);convert(in, out);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3080);return out;
        } catch (ParserConfigurationException e) {
            __CLR4_4_12dc2dclh9yvgft.R.inc(3081);throw new IllegalStateException(e);
        }
    }finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}

    /**
     * Converts a jsoup document into the provided W3C Document. If required, you can set options on the output document
     * before converting.
     * @param in jsoup doc
     * @param out w3c doc
     * @see org.jsoup.helper.W3CDom#fromJsoup(org.jsoup.nodes.Document)
     */
    public void convert(org.jsoup.nodes.Document in, Document out) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3082);
        __CLR4_4_12dc2dclh9yvgft.R.inc(3083);if ((((!StringUtil.isBlank(in.location()))&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3084)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3085)==0&false)))
            {__CLR4_4_12dc2dclh9yvgft.R.inc(3086);out.setDocumentURI(in.location());

        }__CLR4_4_12dc2dclh9yvgft.R.inc(3087);org.jsoup.nodes.Element rootEl = in.child(0); // skip the #root node
        __CLR4_4_12dc2dclh9yvgft.R.inc(3088);NodeTraversor.traverse(new W3CBuilder(out), rootEl);
    }finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}

    /**
     * Implements the conversion by walking the input.
     */
    protected static class W3CBuilder implements NodeVisitor {
        private static final String xmlnsKey = "xmlns";
        private static final String xmlnsPrefix = "xmlns:";

        private final Document doc;
        private final Stack<HashMap<String, String>> namespacesStack = new Stack<>(); // stack of namespaces, prefix => urn
        private Element dest;

        public W3CBuilder(Document doc) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3089);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3090);this.doc = doc;
            __CLR4_4_12dc2dclh9yvgft.R.inc(3091);this.namespacesStack.push(new HashMap<String, String>());
        }finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}

        public void head(org.jsoup.nodes.Node source, int depth) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3092);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3093);namespacesStack.push(new HashMap<>(namespacesStack.peek())); // inherit from above on the stack
            __CLR4_4_12dc2dclh9yvgft.R.inc(3094);if ((((source instanceof org.jsoup.nodes.Element)&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3095)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3096)==0&false))) {{
                __CLR4_4_12dc2dclh9yvgft.R.inc(3097);org.jsoup.nodes.Element sourceEl = (org.jsoup.nodes.Element) source;

                __CLR4_4_12dc2dclh9yvgft.R.inc(3098);String prefix = updateNamespaces(sourceEl);
                __CLR4_4_12dc2dclh9yvgft.R.inc(3099);String namespace = namespacesStack.peek().get(prefix);
                __CLR4_4_12dc2dclh9yvgft.R.inc(3100);String tagName = sourceEl.tagName();

                __CLR4_4_12dc2dclh9yvgft.R.inc(3101);Element el = (((namespace == null && tagName.contains(":") )&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3102)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3103)==0&false))?
                    doc.createElementNS("", tagName) : // doesn't have a real namespace defined
                    doc.createElementNS(namespace, tagName);
                __CLR4_4_12dc2dclh9yvgft.R.inc(3104);copyAttributes(sourceEl, el);
                __CLR4_4_12dc2dclh9yvgft.R.inc(3105);if ((((dest == null)&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3106)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3107)==0&false))) {{ // sets up the root
                    __CLR4_4_12dc2dclh9yvgft.R.inc(3108);doc.appendChild(el);
                } }else {{
                    __CLR4_4_12dc2dclh9yvgft.R.inc(3109);dest.appendChild(el);
                }
                }__CLR4_4_12dc2dclh9yvgft.R.inc(3110);dest = el; // descend
            } }else {__CLR4_4_12dc2dclh9yvgft.R.inc(3111);if ((((source instanceof org.jsoup.nodes.TextNode)&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3112)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3113)==0&false))) {{
                __CLR4_4_12dc2dclh9yvgft.R.inc(3114);org.jsoup.nodes.TextNode sourceText = (org.jsoup.nodes.TextNode) source;
                __CLR4_4_12dc2dclh9yvgft.R.inc(3115);Text text = doc.createTextNode(sourceText.getWholeText());
                __CLR4_4_12dc2dclh9yvgft.R.inc(3116);dest.appendChild(text);
            } }else {__CLR4_4_12dc2dclh9yvgft.R.inc(3117);if ((((source instanceof org.jsoup.nodes.Comment)&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3118)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3119)==0&false))) {{
                __CLR4_4_12dc2dclh9yvgft.R.inc(3120);org.jsoup.nodes.Comment sourceComment = (org.jsoup.nodes.Comment) source;
                __CLR4_4_12dc2dclh9yvgft.R.inc(3121);Comment comment = doc.createComment(sourceComment.getData());
                __CLR4_4_12dc2dclh9yvgft.R.inc(3122);dest.appendChild(comment);
            } }else {__CLR4_4_12dc2dclh9yvgft.R.inc(3123);if ((((source instanceof org.jsoup.nodes.DataNode)&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3124)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3125)==0&false))) {{
                __CLR4_4_12dc2dclh9yvgft.R.inc(3126);org.jsoup.nodes.DataNode sourceData = (org.jsoup.nodes.DataNode) source;
                __CLR4_4_12dc2dclh9yvgft.R.inc(3127);Text node = doc.createTextNode(sourceData.getWholeData());
                __CLR4_4_12dc2dclh9yvgft.R.inc(3128);dest.appendChild(node);
            } }else {{
                // unhandled
            }
        }}}}}finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}

        public void tail(org.jsoup.nodes.Node source, int depth) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3129);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3130);if ((((source instanceof org.jsoup.nodes.Element && dest.getParentNode() instanceof Element)&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3131)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3132)==0&false))) {{
                __CLR4_4_12dc2dclh9yvgft.R.inc(3133);dest = (Element) dest.getParentNode(); // undescend. cromulent.
            }
            }__CLR4_4_12dc2dclh9yvgft.R.inc(3134);namespacesStack.pop();
        }finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}

        private void copyAttributes(org.jsoup.nodes.Node source, Element el) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3135);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3136);for (Attribute attribute : source.attributes()) {{
                // valid xml attribute names are: ^[a-zA-Z_:][-a-zA-Z0-9_:.]
                __CLR4_4_12dc2dclh9yvgft.R.inc(3137);String key = attribute.getKey().replaceAll("[^-a-zA-Z0-9_:.]", "");
                __CLR4_4_12dc2dclh9yvgft.R.inc(3138);if ((((key.matches("[a-zA-Z_:][-a-zA-Z0-9_:.]*"))&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3139)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3140)==0&false)))
                    {__CLR4_4_12dc2dclh9yvgft.R.inc(3141);el.setAttribute(key, attribute.getValue());
            }}
        }}finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}

        /**
         * Finds any namespaces defined in this element. Returns any tag prefix.
         */
        private String updateNamespaces(org.jsoup.nodes.Element el) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3142);
            // scan the element for namespace declarations
            // like: xmlns="blah" or xmlns:prefix="blah"
            __CLR4_4_12dc2dclh9yvgft.R.inc(3143);Attributes attributes = el.attributes();
            __CLR4_4_12dc2dclh9yvgft.R.inc(3144);for (Attribute attr : attributes) {{
                __CLR4_4_12dc2dclh9yvgft.R.inc(3145);String key = attr.getKey();
                __CLR4_4_12dc2dclh9yvgft.R.inc(3146);String prefix;
                __CLR4_4_12dc2dclh9yvgft.R.inc(3147);if ((((key.equals(xmlnsKey))&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3148)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3149)==0&false))) {{
                    __CLR4_4_12dc2dclh9yvgft.R.inc(3150);prefix = "";
                } }else {__CLR4_4_12dc2dclh9yvgft.R.inc(3151);if ((((key.startsWith(xmlnsPrefix))&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3152)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3153)==0&false))) {{
                    __CLR4_4_12dc2dclh9yvgft.R.inc(3154);prefix = key.substring(xmlnsPrefix.length());
                } }else {{
                    __CLR4_4_12dc2dclh9yvgft.R.inc(3155);continue;
                }
                }}__CLR4_4_12dc2dclh9yvgft.R.inc(3156);namespacesStack.peek().put(prefix, attr.getValue());
            }

            // get the element prefix if any
            }__CLR4_4_12dc2dclh9yvgft.R.inc(3157);int pos = el.tagName().indexOf(":");
            __CLR4_4_12dc2dclh9yvgft.R.inc(3158);return (((pos > 0 )&&(__CLR4_4_12dc2dclh9yvgft.R.iget(3159)!=0|true))||(__CLR4_4_12dc2dclh9yvgft.R.iget(3160)==0&false))? el.tagName().substring(0, pos) : "";
        }finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}

    }

    /**
     * Serialize a W3C document to a String.
     * @param doc Document
     * @return Document as string
     */
    public String asString(Document doc) {try{__CLR4_4_12dc2dclh9yvgft.R.inc(3161);
        __CLR4_4_12dc2dclh9yvgft.R.inc(3162);try {
            __CLR4_4_12dc2dclh9yvgft.R.inc(3163);DOMSource domSource = new DOMSource(doc);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3164);StringWriter writer = new StringWriter();
            __CLR4_4_12dc2dclh9yvgft.R.inc(3165);StreamResult result = new StreamResult(writer);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3166);TransformerFactory tf = TransformerFactory.newInstance();
            __CLR4_4_12dc2dclh9yvgft.R.inc(3167);Transformer transformer = tf.newTransformer();
            __CLR4_4_12dc2dclh9yvgft.R.inc(3168);transformer.transform(domSource, result);
            __CLR4_4_12dc2dclh9yvgft.R.inc(3169);return writer.toString();
        } catch (TransformerException e) {
            __CLR4_4_12dc2dclh9yvgft.R.inc(3170);throw new IllegalStateException(e);
        }
    }finally{__CLR4_4_12dc2dclh9yvgft.R.flushNeeded();}}
}
