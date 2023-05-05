/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 A HTML Document.

 @author Jonathan Hedley, jonathan@hedley.net */
public class Document extends Element {public static class __CLR4_4_12yu2yulh9yvgi3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,4086,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private OutputSettings outputSettings = new OutputSettings();
    private Parser parser; // the parser used to parse this document
    private QuirksMode quirksMode = QuirksMode.noQuirks;
    private String location;
    private boolean updateMetaCharset = false;

    /**
     Create a new, empty Document.
     @param baseUri base URI of document
     @see org.jsoup.Jsoup#parse
     @see #createShell
     */
    public Document(String baseUri) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), baseUri);__CLR4_4_12yu2yulh9yvgi3.R.inc(3847);try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3846);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3848);this.location = baseUri;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     Create a valid, empty shell of a document, suitable for adding more elements to.
     @param baseUri baseUri of document
     @return document with html, head, and body elements.
     */
    public static Document createShell(String baseUri) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3849);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3850);Validate.notNull(baseUri);

        __CLR4_4_12yu2yulh9yvgi3.R.inc(3851);Document doc = new Document(baseUri);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3852);doc.parser = doc.parser();
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3853);Element html = doc.appendElement("html");
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3854);html.appendElement("head");
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3855);html.appendElement("body");

        __CLR4_4_12yu2yulh9yvgi3.R.inc(3856);return doc;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     * Get the URL this Document was parsed from. If the starting URL is a redirect,
     * this will return the final URL from which the document was served from.
     * @return location
     */
    public String location() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3857);
     __CLR4_4_12yu2yulh9yvgi3.R.inc(3858);return location;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    
    /**
     Accessor to the document's {@code head} element.
     @return {@code head}
     */
    public Element head() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3859);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3860);return findFirstElementByTagName("head", this);
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     Accessor to the document's {@code body} element.
     @return {@code body}
     */
    public Element body() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3861);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3862);return findFirstElementByTagName("body", this);
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     Get the string contents of the document's {@code title} element.
     @return Trimmed title, or empty string if none set.
     */
    public String title() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3863);
        // title is a preserve whitespace tag (for document output), but normalised here
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3864);Element titleEl = getElementsByTag("title").first();
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3865);return (((titleEl != null )&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3866)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3867)==0&false))? StringUtil.normaliseWhitespace(titleEl.text()).trim() : "";
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     Set the document's {@code title} element. Updates the existing element, or adds {@code title} to {@code head} if
     not present
     @param title string to set as title
     */
    public void title(String title) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3868);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3869);Validate.notNull(title);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3870);Element titleEl = getElementsByTag("title").first();
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3871);if ((((titleEl == null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3872)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3873)==0&false))) {{ // add to head
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3874);head().appendElement("title").text(title);
        } }else {{
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3875);titleEl.text(title);
        }
    }}finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     Create a new Element, with this document's base uri. Does not make the new element a child of this document.
     @param tagName element tag name (e.g. {@code a})
     @return new element
     */
    public Element createElement(String tagName) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3876);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3877);return new Element(Tag.valueOf(tagName, ParseSettings.preserveCase), this.baseUri());
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     Normalise the document. This happens after the parse phase so generally does not need to be called.
     Moves any text content that is not in the body element into the body.
     @return this document after normalisation
     */
    public Document normalise() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3878);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3879);Element htmlEl = findFirstElementByTagName("html", this);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3880);if ((((htmlEl == null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3881)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3882)==0&false)))
            {__CLR4_4_12yu2yulh9yvgi3.R.inc(3883);htmlEl = appendElement("html");
        }__CLR4_4_12yu2yulh9yvgi3.R.inc(3884);if ((((head() == null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3885)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3886)==0&false)))
            {__CLR4_4_12yu2yulh9yvgi3.R.inc(3887);htmlEl.prependElement("head");
        }__CLR4_4_12yu2yulh9yvgi3.R.inc(3888);if ((((body() == null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3889)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3890)==0&false)))
            {__CLR4_4_12yu2yulh9yvgi3.R.inc(3891);htmlEl.appendElement("body");

        // pull text nodes out of root, html, and head els, and push into body. non-text nodes are already taken care
        // of. do in inverse order to maintain text order.
        }__CLR4_4_12yu2yulh9yvgi3.R.inc(3892);normaliseTextNodes(head());
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3893);normaliseTextNodes(htmlEl);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3894);normaliseTextNodes(this);

        __CLR4_4_12yu2yulh9yvgi3.R.inc(3895);normaliseStructure("head", htmlEl);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3896);normaliseStructure("body", htmlEl);
        
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3897);ensureMetaCharsetElement();
        
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3898);return this;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    // does not recurse.
    private void normaliseTextNodes(Element element) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3899);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3900);List<Node> toMove = new ArrayList<>();
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3901);for (Node node: element.childNodes) {{
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3902);if ((((node instanceof TextNode)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3903)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3904)==0&false))) {{
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3905);TextNode tn = (TextNode) node;
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3906);if ((((!tn.isBlank())&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3907)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3908)==0&false)))
                    {__CLR4_4_12yu2yulh9yvgi3.R.inc(3909);toMove.add(tn);
            }}
        }}

        }__CLR4_4_12yu2yulh9yvgi3.R.inc(3910);for (int i = toMove.size()-1; (((i >= 0)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3911)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3912)==0&false)); i--) {{
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3913);Node node = toMove.get(i);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3914);element.removeChild(node);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3915);body().prependChild(new TextNode(" "));
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3916);body().prependChild(node);
        }
    }}finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    // merge multiple <head> or <body> contents into one, delete the remainder, and ensure they are owned by <html>
    private void normaliseStructure(String tag, Element htmlEl) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3917);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3918);Elements elements = this.getElementsByTag(tag);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3919);Element master = elements.first(); // will always be available as created above if not existent
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3920);if ((((elements.size() > 1)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3921)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3922)==0&false))) {{ // dupes, move contents to master
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3923);List<Node> toMove = new ArrayList<>();
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3924);for (int i = 1; (((i < elements.size())&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3925)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3926)==0&false)); i++) {{
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3927);Node dupe = elements.get(i);
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3928);toMove.addAll(dupe.ensureChildNodes());
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3929);dupe.remove();
            }

            }__CLR4_4_12yu2yulh9yvgi3.R.inc(3930);for (Node dupe : toMove)
                {__CLR4_4_12yu2yulh9yvgi3.R.inc(3931);master.appendChild(dupe);
        }}
        // ensure parented by <html>
        }__CLR4_4_12yu2yulh9yvgi3.R.inc(3932);if ((((!master.parent().equals(htmlEl))&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3933)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3934)==0&false))) {{
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3935);htmlEl.appendChild(master); // includes remove()            
        }
    }}finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    // fast method to get first by tag name, used for html, head, body finders
    private Element findFirstElementByTagName(String tag, Node node) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3936);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3937);if ((((node.nodeName().equals(tag))&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3938)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3939)==0&false)))
            {__CLR4_4_12yu2yulh9yvgi3.R.inc(3940);return (Element) node;
        }else {{
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3941);int size = node.childNodeSize();
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3942);for (int i = 0; (((i < size)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3943)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3944)==0&false)); i++) {{
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3945);Element found = findFirstElementByTagName(tag, node.childNode(i));
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3946);if ((((found != null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3947)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3948)==0&false)))
                    {__CLR4_4_12yu2yulh9yvgi3.R.inc(3949);return found;
            }}
        }}
        }__CLR4_4_12yu2yulh9yvgi3.R.inc(3950);return null;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    @Override
    public String outerHtml() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3951);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3952);return super.html(); // no outer wrapper tag
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     Set the text of the {@code body} of this document. Any existing nodes within the body will be cleared.
     @param text unencoded text
     @return this document
     */
    @Override
    public Element text(String text) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3953);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3954);body().text(text); // overridden to not nuke doc structure
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3955);return this;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    @Override
    public String nodeName() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3956);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3957);return "#document";
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    
    /**
     * Sets the charset used in this document. This method is equivalent
     * to {@link OutputSettings#charset(java.nio.charset.Charset)
     * OutputSettings.charset(Charset)} but in addition it updates the
     * charset / encoding element within the document.
     * 
     * <p>This enables
     * {@link #updateMetaCharsetElement(boolean) meta charset update}.</p>
     * 
     * <p>If there's no element with charset / encoding information yet it will
     * be created. Obsolete charset / encoding definitions are removed!</p>
     * 
     * <p><b>Elements used:</b></p>
     * 
     * <ul>
     * <li><b>Html:</b> <i>&lt;meta charset="CHARSET"&gt;</i></li>
     * <li><b>Xml:</b> <i>&lt;?xml version="1.0" encoding="CHARSET"&gt;</i></li>
     * </ul>
     * 
     * @param charset Charset
     * 
     * @see #updateMetaCharsetElement(boolean) 
     * @see OutputSettings#charset(java.nio.charset.Charset) 
     */
    public void charset(Charset charset) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3958);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3959);updateMetaCharsetElement(true);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3960);outputSettings.charset(charset);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3961);ensureMetaCharsetElement();
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    
    /**
     * Returns the charset used in this document. This method is equivalent
     * to {@link OutputSettings#charset()}.
     * 
     * @return Current Charset
     * 
     * @see OutputSettings#charset() 
     */
    public Charset charset() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3962);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3963);return outputSettings.charset();
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    
    /**
     * Sets whether the element with charset information in this document is
     * updated on changes through {@link #charset(java.nio.charset.Charset)
     * Document.charset(Charset)} or not.
     * 
     * <p>If set to <tt>false</tt> <i>(default)</i> there are no elements
     * modified.</p>
     * 
     * @param update If <tt>true</tt> the element updated on charset
     * changes, <tt>false</tt> if not
     * 
     * @see #charset(java.nio.charset.Charset) 
     */
    public void updateMetaCharsetElement(boolean update) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3964);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3965);this.updateMetaCharset = update;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    
    /**
     * Returns whether the element with charset information in this document is
     * updated on changes through {@link #charset(java.nio.charset.Charset)
     * Document.charset(Charset)} or not.
     * 
     * @return Returns <tt>true</tt> if the element is updated on charset
     * changes, <tt>false</tt> if not
     */
    public boolean updateMetaCharsetElement() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3966);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3967);return updateMetaCharset;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    @Override
    public Document clone() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3968);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3969);Document clone = (Document) super.clone();
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3970);clone.outputSettings = this.outputSettings.clone();
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3971);return clone;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    
    /**
     * Ensures a meta charset (html) or xml declaration (xml) with the current
     * encoding used. This only applies with
     * {@link #updateMetaCharsetElement(boolean) updateMetaCharset} set to
     * <tt>true</tt>, otherwise this method does nothing.
     * 
     * <ul>
     * <li>An existing element gets updated with the current charset</li>
     * <li>If there's no element yet it will be inserted</li>
     * <li>Obsolete elements are removed</li>
     * </ul>
     * 
     * <p><b>Elements used:</b></p>
     * 
     * <ul>
     * <li><b>Html:</b> <i>&lt;meta charset="CHARSET"&gt;</i></li>
     * <li><b>Xml:</b> <i>&lt;?xml version="1.0" encoding="CHARSET"&gt;</i></li>
     * </ul>
     */
    private void ensureMetaCharsetElement() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(3972);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(3973);if ((((updateMetaCharset)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3974)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3975)==0&false))) {{
            __CLR4_4_12yu2yulh9yvgi3.R.inc(3976);OutputSettings.Syntax syntax = outputSettings().syntax();

            __CLR4_4_12yu2yulh9yvgi3.R.inc(3977);if ((((syntax == OutputSettings.Syntax.html)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3978)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3979)==0&false))) {{
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3980);Element metaCharset = select("meta[charset]").first();

                __CLR4_4_12yu2yulh9yvgi3.R.inc(3981);if ((((metaCharset != null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3982)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3983)==0&false))) {{
                    __CLR4_4_12yu2yulh9yvgi3.R.inc(3984);metaCharset.attr("charset", charset().displayName());
                } }else {{
                    __CLR4_4_12yu2yulh9yvgi3.R.inc(3985);Element head = head();

                    __CLR4_4_12yu2yulh9yvgi3.R.inc(3986);if ((((head != null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3987)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3988)==0&false))) {{
                        __CLR4_4_12yu2yulh9yvgi3.R.inc(3989);head.appendElement("meta").attr("charset", charset().displayName());
                    }
                }}

                // Remove obsolete elements
                }__CLR4_4_12yu2yulh9yvgi3.R.inc(3990);select("meta[name=charset]").remove();
            } }else {__CLR4_4_12yu2yulh9yvgi3.R.inc(3991);if ((((syntax == OutputSettings.Syntax.xml)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3992)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3993)==0&false))) {{
                __CLR4_4_12yu2yulh9yvgi3.R.inc(3994);Node node = childNodes().get(0);

                __CLR4_4_12yu2yulh9yvgi3.R.inc(3995);if ((((node instanceof XmlDeclaration)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(3996)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(3997)==0&false))) {{
                    __CLR4_4_12yu2yulh9yvgi3.R.inc(3998);XmlDeclaration decl = (XmlDeclaration) node;

                    __CLR4_4_12yu2yulh9yvgi3.R.inc(3999);if ((((decl.name().equals("xml"))&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(4000)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(4001)==0&false))) {{
                        __CLR4_4_12yu2yulh9yvgi3.R.inc(4002);decl.attr("encoding", charset().displayName());

                        __CLR4_4_12yu2yulh9yvgi3.R.inc(4003);final String version = decl.attr("version");

                        __CLR4_4_12yu2yulh9yvgi3.R.inc(4004);if ((((version != null)&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(4005)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(4006)==0&false))) {{
                            __CLR4_4_12yu2yulh9yvgi3.R.inc(4007);decl.attr("version", "1.0");
                        }
                    }} }else {{
                        __CLR4_4_12yu2yulh9yvgi3.R.inc(4008);decl = new XmlDeclaration("xml", false);
                        __CLR4_4_12yu2yulh9yvgi3.R.inc(4009);decl.attr("version", "1.0");
                        __CLR4_4_12yu2yulh9yvgi3.R.inc(4010);decl.attr("encoding", charset().displayName());

                        __CLR4_4_12yu2yulh9yvgi3.R.inc(4011);prependChild(decl);
                    }
                }} }else {{
                    __CLR4_4_12yu2yulh9yvgi3.R.inc(4012);XmlDeclaration decl = new XmlDeclaration("xml", false);
                    __CLR4_4_12yu2yulh9yvgi3.R.inc(4013);decl.attr("version", "1.0");
                    __CLR4_4_12yu2yulh9yvgi3.R.inc(4014);decl.attr("encoding", charset().displayName());

                    __CLR4_4_12yu2yulh9yvgi3.R.inc(4015);prependChild(decl);
                }
            }}
        }}}
    }}finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    

    /**
     * A Document's output settings control the form of the text() and html() methods.
     */
    public static class OutputSettings implements Cloneable {
        /**
         * The output serialization syntax.
         */
        public enum Syntax {html, xml}

        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        private Charset charset;
        private ThreadLocal<CharsetEncoder> encoderThreadLocal = new ThreadLocal<>(); // initialized by start of OuterHtmlVisitor
        Entities.CoreCharset coreCharset; // fast encoders for ascii and utf8

        private boolean prettyPrint = true;
        private boolean outline = false;
        private int indentAmount = 1;
        private Syntax syntax = Syntax.html;

        public OutputSettings() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4016);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4017);charset(Charset.forName("UTF8"));
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
        
        /**
         * Get the document's current HTML escape mode: <code>base</code>, which provides a limited set of named HTML
         * entities and escapes other characters as numbered entities for maximum compatibility; or <code>extended</code>,
         * which uses the complete set of HTML named entities.
         * <p>
         * The default escape mode is <code>base</code>.
         * @return the document's current escape mode
         */
        public Entities.EscapeMode escapeMode() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4018);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4019);return escapeMode;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Set the document's escape mode, which determines how characters are escaped when the output character set
         * does not support a given character:- using either a named or a numbered escape.
         * @param escapeMode the new escape mode to use
         * @return the document's output settings, for chaining
         */
        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4020);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4021);this.escapeMode = escapeMode;
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4022);return this;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Get the document's current output charset, which is used to control which characters are escaped when
         * generating HTML (via the <code>html()</code> methods), and which are kept intact.
         * <p>
         * Where possible (when parsing from a URL or File), the document's output charset is automatically set to the
         * input charset. Otherwise, it defaults to UTF-8.
         * @return the document's current charset.
         */
        public Charset charset() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4023);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4024);return charset;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Update the document's output charset.
         * @param charset the new charset to use.
         * @return the document's output settings, for chaining
         */
        public OutputSettings charset(Charset charset) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4025);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4026);this.charset = charset;
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4027);return this;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Update the document's output charset.
         * @param charset the new charset (by name) to use.
         * @return the document's output settings, for chaining
         */
        public OutputSettings charset(String charset) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4028);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4029);charset(Charset.forName(charset));
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4030);return this;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        CharsetEncoder prepareEncoder() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4031);
            // created at start of OuterHtmlVisitor so each pass has own encoder, so OutputSettings can be shared among threads
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4032);CharsetEncoder encoder = charset.newEncoder();
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4033);encoderThreadLocal.set(encoder);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4034);coreCharset = Entities.CoreCharset.byName(encoder.charset().name());
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4035);return encoder;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        CharsetEncoder encoder() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4036);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4037);CharsetEncoder encoder = encoderThreadLocal.get();
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4038);return (((encoder != null )&&(__CLR4_4_12yu2yulh9yvgi3.R.iget(4039)!=0|true))||(__CLR4_4_12yu2yulh9yvgi3.R.iget(4040)==0&false))? encoder : prepareEncoder();
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Get the document's current output syntax.
         * @return current syntax
         */
        public Syntax syntax() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4041);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4042);return syntax;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Set the document's output syntax. Either {@code html}, with empty tags and boolean attributes (etc), or
         * {@code xml}, with self-closing tags.
         * @param syntax serialization syntax
         * @return the document's output settings, for chaining
         */
        public OutputSettings syntax(Syntax syntax) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4043);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4044);this.syntax = syntax;
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4045);return this;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Get if pretty printing is enabled. Default is true. If disabled, the HTML output methods will not re-format
         * the output, and the output will generally look like the input.
         * @return if pretty printing is enabled.
         */
        public boolean prettyPrint() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4046);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4047);return prettyPrint;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Enable or disable pretty printing.
         * @param pretty new pretty print setting
         * @return this, for chaining
         */
        public OutputSettings prettyPrint(boolean pretty) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4048);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4049);prettyPrint = pretty;
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4050);return this;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
        
        /**
         * Get if outline mode is enabled. Default is false. If enabled, the HTML output methods will consider
         * all tags as block.
         * @return if outline mode is enabled.
         */
        public boolean outline() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4051);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4052);return outline;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
        
        /**
         * Enable or disable HTML outline mode.
         * @param outlineMode new outline setting
         * @return this, for chaining
         */
        public OutputSettings outline(boolean outlineMode) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4053);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4054);outline = outlineMode;
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4055);return this;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Get the current tag indent amount, used when pretty printing.
         * @return the current indent amount
         */
        public int indentAmount() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4056);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4057);return indentAmount;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        /**
         * Set the indent amount for pretty printing
         * @param indentAmount number of spaces to use for indenting each level. Must be {@literal >=} 0.
         * @return this, for chaining
         */
        public OutputSettings indentAmount(int indentAmount) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4058);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4059);Validate.isTrue(indentAmount >= 0);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4060);this.indentAmount = indentAmount;
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4061);return this;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

        @Override
        public OutputSettings clone() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4062);
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4063);OutputSettings clone;
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4064);try {
                __CLR4_4_12yu2yulh9yvgi3.R.inc(4065);clone = (OutputSettings) super.clone();
            } catch (CloneNotSupportedException e) {
                __CLR4_4_12yu2yulh9yvgi3.R.inc(4066);throw new RuntimeException(e);
            }
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4067);clone.charset(charset.name()); // new charset and charset encoder
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4068);clone.escapeMode = Entities.EscapeMode.valueOf(escapeMode.name());
            // indentAmount, prettyPrint are primitives so object.clone() will handle
            __CLR4_4_12yu2yulh9yvgi3.R.inc(4069);return clone;
        }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
    }

    /**
     * Get the document's current output settings.
     * @return the document's current output settings.
     */
    public OutputSettings outputSettings() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4070);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4071);return outputSettings;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     * Set the document's output settings.
     * @param outputSettings new output settings.
     * @return this document, for chaining.
     */
    public Document outputSettings(OutputSettings outputSettings) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4072);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4073);Validate.notNull(outputSettings);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4074);this.outputSettings = outputSettings;
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4075);return this;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    public enum QuirksMode {
        noQuirks, quirks, limitedQuirks
    }

    public QuirksMode quirksMode() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4076);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4077);return quirksMode;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    public Document quirksMode(QuirksMode quirksMode) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4078);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4079);this.quirksMode = quirksMode;
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4080);return this;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     * Get the parser that was used to parse this document.
     * @return the parser
     */
    public Parser parser() {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4081);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4082);return parser;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}

    /**
     * Set the parser used to create this document. This parser is then used when further parsing within this document
     * is required.
     * @param parser the configured parser to use when further parsing is required for this document.
     * @return this document, for chaining.
     */
    public Document parser(Parser parser) {try{__CLR4_4_12yu2yulh9yvgi3.R.inc(4083);
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4084);this.parser = parser;
        __CLR4_4_12yu2yulh9yvgi3.R.inc(4085);return this;
    }finally{__CLR4_4_12yu2yulh9yvgi3.R.flushNeeded();}}
}
