/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.List;


/**
 The whitelist based HTML cleaner. Use to ensure that end-user provided HTML contains only the elements and attributes
 that you are expecting; no junk, and no cross-site scripting attacks!
 <p>
 The HTML cleaner parses the input as HTML and then runs it through a white-list, so the output HTML can only contain
 HTML that is allowed by the whitelist.
 </p>
 <p>
 It is assumed that the input HTML is a body fragment; the clean methods only pull from the source's body, and the
 canned white-lists only allow body contained tags.
 </p>
 <p>
 Rather than interacting directly with a Cleaner object, generally see the {@code clean} methods in {@link org.jsoup.Jsoup}.
 </p>
 */
public class Cleaner {public static class __CLR4_4_18c18c1lh9yvgrg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,10885,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Whitelist whitelist;

    /**
     Create a new cleaner, that sanitizes documents using the supplied whitelist.
     @param whitelist white-list to clean with
     */
    public Cleaner(Whitelist whitelist) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10801);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10802);Validate.notNull(whitelist);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10803);this.whitelist = whitelist;
    }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

    /**
     Creates a new, clean document, from the original dirty document, containing only elements allowed by the whitelist.
     The original document is not modified. Only elements from the dirt document's <code>body</code> are used.
     @param dirtyDocument Untrusted base document to clean.
     @return cleaned document.
     */
    public Document clean(Document dirtyDocument) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10804);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10805);Validate.notNull(dirtyDocument);

        __CLR4_4_18c18c1lh9yvgrg.R.inc(10806);Document clean = Document.createShell(dirtyDocument.baseUri());
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10807);if ((((dirtyDocument.body() != null)&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10808)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10809)==0&false))) // frameset documents won't have a body. the clean doc will have empty body.
            {__CLR4_4_18c18c1lh9yvgrg.R.inc(10810);copySafeNodes(dirtyDocument.body(), clean.body());

        }__CLR4_4_18c18c1lh9yvgrg.R.inc(10811);return clean;
    }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

    /**
     Determines if the input document <b>body</b>is valid, against the whitelist. It is considered valid if all the tags and attributes
     in the input HTML are allowed by the whitelist, and that there is no content in the <code>head</code>.
     <p>
     This method can be used as a validator for user input. An invalid document will still be cleaned successfully
     using the {@link #clean(Document)} document. If using as a validator, it is recommended to still clean the document
     to ensure enforced attributes are set correctly, and that the output is tidied.
     </p>
     @param dirtyDocument document to test
     @return true if no tags or attributes need to be removed; false if they do
     */
    public boolean isValid(Document dirtyDocument) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10812);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10813);Validate.notNull(dirtyDocument);

        __CLR4_4_18c18c1lh9yvgrg.R.inc(10814);Document clean = Document.createShell(dirtyDocument.baseUri());
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10815);int numDiscarded = copySafeNodes(dirtyDocument.body(), clean.body());
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10816);return numDiscarded == 0
            && dirtyDocument.head().childNodes().isEmpty(); // because we only look at the body, but we start from a shell, make sure there's nothing in the head
    }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

    public boolean isValidBodyHtml(String bodyHtml) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10817);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10818);Document clean = Document.createShell("");
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10819);Document dirty = Document.createShell("");
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10820);ParseErrorList errorList = ParseErrorList.tracking(1);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10821);List<Node> nodes = Parser.parseFragment(bodyHtml, dirty.body(), "", errorList);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10822);dirty.body().insertChildren(0, nodes);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10823);int numDiscarded = copySafeNodes(dirty.body(), clean.body());
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10824);return numDiscarded == 0 && errorList.isEmpty();
    }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

    /**
     Iterates the input and copies trusted nodes (tags, attributes, text) into the destination.
     */
    private final class CleaningVisitor implements NodeVisitor {
        private int numDiscarded = 0;
        private final Element root;
        private Element destination; // current element to append nodes to

        private CleaningVisitor(Element root, Element destination) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10825);
            __CLR4_4_18c18c1lh9yvgrg.R.inc(10826);this.root = root;
            __CLR4_4_18c18c1lh9yvgrg.R.inc(10827);this.destination = destination;
        }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

        public void head(Node source, int depth) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10828);
            __CLR4_4_18c18c1lh9yvgrg.R.inc(10829);if ((((source instanceof Element)&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10830)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10831)==0&false))) {{
                __CLR4_4_18c18c1lh9yvgrg.R.inc(10832);Element sourceEl = (Element) source;

                __CLR4_4_18c18c1lh9yvgrg.R.inc(10833);if ((((whitelist.isSafeTag(sourceEl.tagName()))&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10834)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10835)==0&false))) {{ // safe, clone and copy safe attrs
                    __CLR4_4_18c18c1lh9yvgrg.R.inc(10836);ElementMeta meta = createSafeElement(sourceEl);
                    __CLR4_4_18c18c1lh9yvgrg.R.inc(10837);Element destChild = meta.el;
                    __CLR4_4_18c18c1lh9yvgrg.R.inc(10838);destination.appendChild(destChild);

                    __CLR4_4_18c18c1lh9yvgrg.R.inc(10839);numDiscarded += meta.numAttribsDiscarded;
                    __CLR4_4_18c18c1lh9yvgrg.R.inc(10840);destination = destChild;
                } }else {__CLR4_4_18c18c1lh9yvgrg.R.inc(10841);if ((((source != root)&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10842)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10843)==0&false))) {{ // not a safe tag, so don't add. don't count root against discarded.
                    __CLR4_4_18c18c1lh9yvgrg.R.inc(10844);numDiscarded++;
                }
            }}} }else {__CLR4_4_18c18c1lh9yvgrg.R.inc(10845);if ((((source instanceof TextNode)&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10846)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10847)==0&false))) {{
                __CLR4_4_18c18c1lh9yvgrg.R.inc(10848);TextNode sourceText = (TextNode) source;
                __CLR4_4_18c18c1lh9yvgrg.R.inc(10849);TextNode destText = new TextNode(sourceText.getWholeText());
                __CLR4_4_18c18c1lh9yvgrg.R.inc(10850);destination.appendChild(destText);
            } }else {__CLR4_4_18c18c1lh9yvgrg.R.inc(10851);if ((((source instanceof DataNode && whitelist.isSafeTag(source.parent().nodeName()))&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10852)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10853)==0&false))) {{
              __CLR4_4_18c18c1lh9yvgrg.R.inc(10854);DataNode sourceData = (DataNode) source;
              __CLR4_4_18c18c1lh9yvgrg.R.inc(10855);DataNode destData = new DataNode(sourceData.getWholeData());
              __CLR4_4_18c18c1lh9yvgrg.R.inc(10856);destination.appendChild(destData);
            } }else {{ // else, we don't care about comments, xml proc instructions, etc
                __CLR4_4_18c18c1lh9yvgrg.R.inc(10857);numDiscarded++;
            }
        }}}}finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

        public void tail(Node source, int depth) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10858);
            __CLR4_4_18c18c1lh9yvgrg.R.inc(10859);if ((((source instanceof Element && whitelist.isSafeTag(source.nodeName()))&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10860)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10861)==0&false))) {{
                __CLR4_4_18c18c1lh9yvgrg.R.inc(10862);destination = destination.parent(); // would have descended, so pop destination stack
            }
        }}finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}
    }

    private int copySafeNodes(Element source, Element dest) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10863);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10864);CleaningVisitor cleaningVisitor = new CleaningVisitor(source, dest);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10865);NodeTraversor.traverse(cleaningVisitor, source);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10866);return cleaningVisitor.numDiscarded;
    }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

    private ElementMeta createSafeElement(Element sourceEl) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10867);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10868);String sourceTag = sourceEl.tagName();
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10869);Attributes destAttrs = new Attributes();
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10870);Element dest = new Element(Tag.valueOf(sourceTag), sourceEl.baseUri(), destAttrs);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10871);int numDiscarded = 0;

        __CLR4_4_18c18c1lh9yvgrg.R.inc(10872);Attributes sourceAttrs = sourceEl.attributes();
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10873);for (Attribute sourceAttr : sourceAttrs) {{
            __CLR4_4_18c18c1lh9yvgrg.R.inc(10874);if ((((whitelist.isSafeAttribute(sourceTag, sourceEl, sourceAttr))&&(__CLR4_4_18c18c1lh9yvgrg.R.iget(10875)!=0|true))||(__CLR4_4_18c18c1lh9yvgrg.R.iget(10876)==0&false)))
                {__CLR4_4_18c18c1lh9yvgrg.R.inc(10877);destAttrs.put(sourceAttr);
            }else
                {__CLR4_4_18c18c1lh9yvgrg.R.inc(10878);numDiscarded++;
        }}
        }__CLR4_4_18c18c1lh9yvgrg.R.inc(10879);Attributes enforcedAttrs = whitelist.getEnforcedAttributes(sourceTag);
        __CLR4_4_18c18c1lh9yvgrg.R.inc(10880);destAttrs.addAll(enforcedAttrs);

        __CLR4_4_18c18c1lh9yvgrg.R.inc(10881);return new ElementMeta(dest, numDiscarded);
    }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}

    private static class ElementMeta {
        Element el;
        int numAttribsDiscarded;

        ElementMeta(Element el, int numAttribsDiscarded) {try{__CLR4_4_18c18c1lh9yvgrg.R.inc(10882);
            __CLR4_4_18c18c1lh9yvgrg.R.inc(10883);this.el = el;
            __CLR4_4_18c18c1lh9yvgrg.R.inc(10884);this.numAttribsDiscarded = numAttribsDiscarded;
        }finally{__CLR4_4_18c18c1lh9yvgrg.R.flushNeeded();}}
    }

}
