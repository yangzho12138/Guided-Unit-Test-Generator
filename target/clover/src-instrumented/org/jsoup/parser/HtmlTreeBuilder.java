/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.jsoup.internal.StringUtil.inSorted;

/**
 * HTML Tree Builder; creates a DOM from Tokens.
 */
public class HtmlTreeBuilder extends TreeBuilder {public static class __CLR4_4_14m84m8lh9yvgnf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,6570,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // tag searches. must be sorted, used in inSorted. MUST update HtmlTreeBuilderTest if more arrays are added.
    static final String[] TagsSearchInScope = new String[]{"applet", "caption", "html", "marquee", "object", "table", "td", "th"};
    static final String[] TagSearchList = new String[]{"ol", "ul"};
    static final String[] TagSearchButton = new String[]{"button"};
    static final String[] TagSearchTableScope = new String[]{"html", "table"};
    static final String[] TagSearchSelectScope = new String[]{"optgroup", "option"};
    static final String[] TagSearchEndTags = new String[]{"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};
    static final String[] TagSearchSpecial = new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound",
        "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd",
        "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form",
        "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html",
        "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav",
        "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script",
        "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead",
        "title", "tr", "ul", "wbr", "xmp"};

    public static final int MaxScopeSearchDepth = 100; // prevents the parser bogging down in exceptionally broken pages

    private HtmlTreeBuilderState state; // the current state
    private HtmlTreeBuilderState originalState; // original / marked state

    private boolean baseUriSetFromDoc;
    private Element headElement; // the current head element
    private FormElement formElement; // the current form element
    private Element contextElement; // fragment parse context -- could be null even if fragment parsing
    private ArrayList<Element> formattingElements; // active (open) formatting elements
    private List<String> pendingTableCharacters; // chars in table to be shifted out
    private Token.EndTag emptyEnd; // reused empty end tag

    private boolean framesetOk; // if ok to go into frameset
    private boolean fosterInserts; // if next inserts should be fostered
    private boolean fragmentParsing; // if parsing a fragment of html

    ParseSettings defaultSettings() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(5984);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5985);return ParseSettings.htmlDefault;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(5986);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5987);super.initialiseParse(input, baseUri, parser);

        // this is a bit mucky. todo - probably just create new parser objects to ensure all reset.
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5988);state = HtmlTreeBuilderState.Initial;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5989);originalState = null;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5990);baseUriSetFromDoc = false;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5991);headElement = null;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5992);formElement = null;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5993);contextElement = null;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5994);formattingElements = new ArrayList<>();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5995);pendingTableCharacters = new ArrayList<>();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5996);emptyEnd = new Token.EndTag();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5997);framesetOk = true;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5998);fosterInserts = false;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(5999);fragmentParsing = false;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6000);
        // context may be null
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6001);state = HtmlTreeBuilderState.Initial;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6002);initialiseParse(new StringReader(inputFragment), baseUri, parser);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6003);contextElement = context;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6004);fragmentParsing = true;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6005);Element root = null;

        __CLR4_4_14m84m8lh9yvgnf.R.inc(6006);if ((((context != null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6007)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6008)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6009);if ((((context.ownerDocument() != null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6010)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6011)==0&false))) // quirks setup:
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6012);doc.quirksMode(context.ownerDocument().quirksMode());

            // initialise the tokeniser state:
            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6013);String contextTag = context.tagName();
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6014);if ((((StringUtil.in(contextTag, "title", "textarea"))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6015)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6016)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6017);tokeniser.transition(TokeniserState.Rcdata);
            }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6018);if ((((StringUtil.in(contextTag, "iframe", "noembed", "noframes", "style", "xmp"))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6019)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6020)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6021);tokeniser.transition(TokeniserState.Rawtext);
            }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6022);if ((((contextTag.equals("script"))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6023)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6024)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6025);tokeniser.transition(TokeniserState.ScriptData);
            }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6026);if ((((contextTag.equals(("noscript")))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6027)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6028)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6029);tokeniser.transition(TokeniserState.Data); // if scripting enabled, rawtext
            }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6030);if ((((contextTag.equals("plaintext"))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6031)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6032)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6033);tokeniser.transition(TokeniserState.Data);
            }else
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6034);tokeniser.transition(TokeniserState.Data); // default

            }}}}}__CLR4_4_14m84m8lh9yvgnf.R.inc(6035);root = new Element(Tag.valueOf("html", settings), baseUri);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6036);doc.appendChild(root);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6037);stack.add(root);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6038);resetInsertionMode();

            // setup form element to nearest form on context (up ancestor chain). ensures form controls are associated
            // with form correctly
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6039);Elements contextChain = context.parents();
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6040);contextChain.add(0, context);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6041);for (Element parent: contextChain) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6042);if ((((parent instanceof FormElement)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6043)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6044)==0&false))) {{
                    __CLR4_4_14m84m8lh9yvgnf.R.inc(6045);formElement = (FormElement) parent;
                    __CLR4_4_14m84m8lh9yvgnf.R.inc(6046);break;
                }
            }}
        }}

        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6047);runParser();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6048);if ((((context != null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6049)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6050)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6051);return root.childNodes();
        }else
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6052);return doc.childNodes();
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    @Override
    protected boolean process(Token token) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6053);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6054);currentToken = token;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6055);return this.state.process(token, this);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean process(Token token, HtmlTreeBuilderState state) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6056);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6057);currentToken = token;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6058);return state.process(token, this);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void transition(HtmlTreeBuilderState state) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6059);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6060);this.state = state;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    HtmlTreeBuilderState state() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6061);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6062);return state;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void markInsertionMode() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6063);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6064);originalState = state;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    HtmlTreeBuilderState originalState() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6065);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6066);return originalState;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void framesetOk(boolean framesetOk) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6067);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6068);this.framesetOk = framesetOk;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean framesetOk() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6069);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6070);return framesetOk;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Document getDocument() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6071);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6072);return doc;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    String getBaseUri() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6073);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6074);return baseUri;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void maybeSetBaseUri(Element base) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6075);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6076);if ((((baseUriSetFromDoc)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6077)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6078)==0&false))) // only listen to the first <base href> in parse
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6079);return;

        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6080);String href = base.absUrl("href");
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6081);if ((((href.length() != 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6082)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6083)==0&false))) {{ // ignore <base target> etc
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6084);baseUri = href;
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6085);baseUriSetFromDoc = true;
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6086);doc.setBaseUri(href); // set on the doc so doc.createElement(Tag) will get updated base, and to update all descendants
        }
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean isFragmentParsing() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6087);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6088);return fragmentParsing;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void error(HtmlTreeBuilderState state) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6089);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6090);if ((((parser.getErrors().canAddError())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6091)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6092)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6093);parser.getErrors().add(new ParseError(reader.pos(), "Unexpected token [%s] when in state [%s]", currentToken.tokenType(), state));
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element insert(final Token.StartTag startTag) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6094);
        // cleanup duplicate attributes:
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6095);if ((((!startTag.attributes.isEmpty())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6096)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6097)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6098);int dupes = startTag.attributes.deduplicate(settings);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6099);if ((((dupes > 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6100)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6101)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6102);error("Duplicate attribute");
            }
        }}

        // handle empty unknown tags
        // when the spec expects an empty tag, will directly hit insertEmpty, so won't generate this fake end tag.
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6103);if ((((startTag.isSelfClosing())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6104)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6105)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6106);Element el = insertEmpty(startTag);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6107);stack.add(el);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6108);tokeniser.transition(TokeniserState.Data); // handles <script />, otherwise needs breakout steps from script data
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6109);tokeniser.emit(emptyEnd.reset().name(el.tagName()));  // ensure we get out of whatever state we are in. emitted for yielded processing
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6110);return el;
        }

        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6111);Element el = new Element(Tag.valueOf(startTag.name(), settings), baseUri, settings.normalizeAttributes(startTag.attributes));
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6112);insert(el);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6113);return el;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element insertStartTag(String startTagName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6114);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6115);Element el = new Element(Tag.valueOf(startTagName, settings), baseUri);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6116);insert(el);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6117);return el;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void insert(Element el) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6118);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6119);insertNode(el);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6120);stack.add(el);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element insertEmpty(Token.StartTag startTag) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6121);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6122);Tag tag = Tag.valueOf(startTag.name(), settings);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6123);Element el = new Element(tag, baseUri, startTag.attributes);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6124);insertNode(el);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6125);if ((((startTag.isSelfClosing())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6126)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6127)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6128);if ((((tag.isKnownTag())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6129)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6130)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6131);if ((((!tag.isEmpty())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6132)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6133)==0&false)))
                    {__CLR4_4_14m84m8lh9yvgnf.R.inc(6134);tokeniser.error("Tag cannot be self closing; not a void tag");
            }}
            }else // unknown tag, remember this is self closing for output
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6135);tag.setSelfClosing();
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6136);return el;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    FormElement insertForm(Token.StartTag startTag, boolean onStack) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6137);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6138);Tag tag = Tag.valueOf(startTag.name(), settings);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6139);FormElement el = new FormElement(tag, baseUri, startTag.attributes);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6140);setFormElement(el);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6141);insertNode(el);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6142);if ((((onStack)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6143)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6144)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6145);stack.add(el);
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6146);return el;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void insert(Token.Comment commentToken) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6147);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6148);Comment comment = new Comment(commentToken.getData());
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6149);insertNode(comment);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void insert(Token.Character characterToken) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6150);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6151);final Node node;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6152);final Element el = currentElement();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6153);final String tagName = el.tagName();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6154);final String data = characterToken.getData();

        __CLR4_4_14m84m8lh9yvgnf.R.inc(6155);if ((((characterToken.isCData())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6156)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6157)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6158);node = new CDataNode(data);
        }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6159);if ((((tagName.equals("script") || tagName.equals("style"))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6160)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6161)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6162);node = new DataNode(data);
        }else
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6163);node = new TextNode(data);
        }}__CLR4_4_14m84m8lh9yvgnf.R.inc(6164);el.appendChild(node); // doesn't use insertNode, because we don't foster these; and will always have a stack.
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    private void insertNode(Node node) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6165);
        // if the stack hasn't been set up yet, elements (doctype, comments) go into the doc
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6166);if ((((stack.isEmpty())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6167)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6168)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6169);doc.appendChild(node);
        }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6170);if ((((isFosterInserts())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6171)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6172)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6173);insertInFosterParent(node);
        }else
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6174);currentElement().appendChild(node);

        // connect form controls to their form element
        }}__CLR4_4_14m84m8lh9yvgnf.R.inc(6175);if ((((node instanceof Element && ((Element) node).tag().isFormListed())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6176)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6177)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6178);if ((((formElement != null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6179)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6180)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6181);formElement.addElement((Element) node);
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element pop() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6182);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6183);int size = stack.size();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6184);return stack.remove(size-1);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void push(Element element) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6185);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6186);stack.add(element);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    ArrayList<Element> getStack() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6187);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6188);return stack;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean onStack(Element el) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6189);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6190);return isElementInQueue(stack, el);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    private boolean isElementInQueue(ArrayList<Element> queue, Element element) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6191);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6192);for (int pos = queue.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6193)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6194)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6195);Element next = queue.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6196);if ((((next == element)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6197)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6198)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6199);return true;
            }
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6200);return false;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element getFromStack(String elName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6201);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6202);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6203)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6204)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6205);Element next = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6206);if ((((next.normalName().equals(elName))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6207)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6208)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6209);return next;
            }
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6210);return null;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean removeFromStack(Element el) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6211);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6212);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6213)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6214)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6215);Element next = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6216);if ((((next == el)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6217)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6218)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6219);stack.remove(pos);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6220);return true;
            }
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6221);return false;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void popStackToClose(String elName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6222);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6223);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6224)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6225)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6226);Element next = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6227);stack.remove(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6228);if ((((next.normalName().equals(elName))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6229)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6230)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6231);break;
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    // elnames is sorted, comes from Constants
    void popStackToClose(String... elNames) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6232);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6233);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6234)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6235)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6236);Element next = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6237);stack.remove(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6238);if ((((inSorted(next.normalName(), elNames))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6239)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6240)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6241);break;
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void popStackToBefore(String elName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6242);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6243);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6244)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6245)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6246);Element next = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6247);if ((((next.normalName().equals(elName))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6248)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6249)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6250);break;
            } }else {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6251);stack.remove(pos);
            }
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void clearStackToTableContext() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6252);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6253);clearStackToContext("table");
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void clearStackToTableBodyContext() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6254);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6255);clearStackToContext("tbody", "tfoot", "thead", "template");
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void clearStackToTableRowContext() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6256);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6257);clearStackToContext("tr", "template");
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    private void clearStackToContext(String... nodeNames) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6258);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6259);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6260)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6261)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6262);Element next = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6263);if ((((StringUtil.in(next.normalName(), nodeNames) || next.normalName().equals("html"))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6264)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6265)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6266);break;
            }else
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6267);stack.remove(pos);
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element aboveOnStack(Element el) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6268);
        assert (((onStack(el))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6269)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6270)==0&false));
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6271);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6272)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6273)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6274);Element next = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6275);if ((((next == el)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6276)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6277)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6278);return stack.get(pos-1);
            }
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6279);return null;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void insertOnStackAfter(Element after, Element in) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6280);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6281);int i = stack.lastIndexOf(after);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6282);Validate.isTrue(i != -1);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6283);stack.add(i+1, in);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void replaceOnStack(Element out, Element in) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6284);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6285);replaceInQueue(stack, out, in);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    private void replaceInQueue(ArrayList<Element> queue, Element out, Element in) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6286);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6287);int i = queue.lastIndexOf(out);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6288);Validate.isTrue(i != -1);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6289);queue.set(i, in);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void resetInsertionMode() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6290);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6291);boolean last = false;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6292);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6293)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6294)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6295);Element node = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6296);if ((((pos == 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6297)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6298)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6299);last = true;
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6300);node = contextElement;
            }
            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6301);String name = node.normalName();
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6302);if (((("select".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6303)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6304)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6305);transition(HtmlTreeBuilderState.InSelect);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6306);break; // frag
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6307);if ((((("td".equals(name) || "th".equals(name) && !last))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6308)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6309)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6310);transition(HtmlTreeBuilderState.InCell);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6311);break;
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6312);if (((("tr".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6313)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6314)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6315);transition(HtmlTreeBuilderState.InRow);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6316);break;
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6317);if (((("tbody".equals(name) || "thead".equals(name) || "tfoot".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6318)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6319)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6320);transition(HtmlTreeBuilderState.InTableBody);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6321);break;
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6322);if (((("caption".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6323)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6324)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6325);transition(HtmlTreeBuilderState.InCaption);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6326);break;
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6327);if (((("colgroup".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6328)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6329)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6330);transition(HtmlTreeBuilderState.InColumnGroup);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6331);break; // frag
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6332);if (((("table".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6333)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6334)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6335);transition(HtmlTreeBuilderState.InTable);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6336);break;
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6337);if (((("head".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6338)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6339)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6340);transition(HtmlTreeBuilderState.InBody);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6341);break; // frag
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6342);if (((("body".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6343)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6344)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6345);transition(HtmlTreeBuilderState.InBody);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6346);break;
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6347);if (((("frameset".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6348)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6349)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6350);transition(HtmlTreeBuilderState.InFrameset);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6351);break; // frag
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6352);if (((("html".equals(name))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6353)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6354)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6355);transition(HtmlTreeBuilderState.BeforeHead);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6356);break; // frag
            } }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6357);if ((((last)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6358)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6359)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6360);transition(HtmlTreeBuilderState.InBody);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6361);break; // frag
            }
        }}}}}}}}}}}}}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    // todo: tidy up in specific scope methods
    private String[] specificScopeTarget = {null};

    private boolean inSpecificScope(String targetName, String[] baseTypes, String[] extraTypes) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6362);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6363);specificScopeTarget[0] = targetName;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6364);return inSpecificScope(specificScopeTarget, baseTypes, extraTypes);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    private boolean inSpecificScope(String[] targetNames, String[] baseTypes, String[] extraTypes) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6365);
        // https://html.spec.whatwg.org/multipage/parsing.html#has-an-element-in-the-specific-scope
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6366);final int bottom = stack.size() -1;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6367);final int top = (((bottom > MaxScopeSearchDepth )&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6368)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6369)==0&false))? bottom - MaxScopeSearchDepth : 0;
        // don't walk too far up the tree

        __CLR4_4_14m84m8lh9yvgnf.R.inc(6370);for (int pos = bottom; (((pos >= top)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6371)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6372)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6373);final String elName = stack.get(pos).normalName();
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6374);if ((((inSorted(elName, targetNames))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6375)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6376)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6377);return true;
            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6378);if ((((inSorted(elName, baseTypes))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6379)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6380)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6381);return false;
            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6382);if ((((extraTypes != null && inSorted(elName, extraTypes))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6383)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6384)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6385);return false;
        }}
        //Validate.fail("Should not be reachable"); // would end up false because hitting 'html' at root (basetypes)
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6386);return false;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean inScope(String[] targetNames) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6387);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6388);return inSpecificScope(targetNames, TagsSearchInScope, null);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean inScope(String targetName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6389);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6390);return inScope(targetName, null);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean inScope(String targetName, String[] extras) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6391);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6392);return inSpecificScope(targetName, TagsSearchInScope, extras);
        // todo: in mathml namespace: mi, mo, mn, ms, mtext annotation-xml
        // todo: in svg namespace: forignOjbect, desc, title
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean inListItemScope(String targetName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6393);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6394);return inScope(targetName, TagSearchList);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean inButtonScope(String targetName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6395);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6396);return inScope(targetName, TagSearchButton);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean inTableScope(String targetName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6397);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6398);return inSpecificScope(targetName, TagSearchTableScope, null);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean inSelectScope(String targetName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6399);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6400);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6401)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6402)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6403);Element el = stack.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6404);String elName = el.normalName();
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6405);if ((((elName.equals(targetName))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6406)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6407)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6408);return true;
            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6409);if ((((!inSorted(elName, TagSearchSelectScope))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6410)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6411)==0&false))) // all elements except
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6412);return false;
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6413);Validate.fail("Should not be reachable");
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6414);return false;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void setHeadElement(Element headElement) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6415);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6416);this.headElement = headElement;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element getHeadElement() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6417);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6418);return headElement;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean isFosterInserts() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6419);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6420);return fosterInserts;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void setFosterInserts(boolean fosterInserts) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6421);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6422);this.fosterInserts = fosterInserts;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    FormElement getFormElement() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6423);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6424);return formElement;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void setFormElement(FormElement formElement) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6425);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6426);this.formElement = formElement;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void newPendingTableCharacters() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6427);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6428);pendingTableCharacters = new ArrayList<>();
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    List<String> getPendingTableCharacters() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6429);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6430);return pendingTableCharacters;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    /**
     11.2.5.2 Closing elements that have implied end tags<p/>
     When the steps below require the UA to generate implied end tags, then, while the current node is a dd element, a
     dt element, an li element, an option element, an optgroup element, a p element, an rp element, or an rt element,
     the UA must pop the current node off the stack of open elements.

     @param excludeTag If a step requires the UA to generate implied end tags but lists an element to exclude from the
     process, then the UA must perform the above steps as if that element was not in the above list.
     */
    void generateImpliedEndTags(String excludeTag) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6431);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6432);while (((((excludeTag != null && !currentElement().normalName().equals(excludeTag)) &&
                inSorted(currentElement().normalName(), TagSearchEndTags))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6433)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6434)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6435);pop();
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void generateImpliedEndTags() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6436);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6437);generateImpliedEndTags(null);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean isSpecial(Element el) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6438);
        // todo: mathml's mi, mo, mn
        // todo: svg's foreigObject, desc, title
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6439);String name = el.normalName();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6440);return inSorted(name, TagSearchSpecial);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element lastFormattingElement() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6441);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6442);return (((formattingElements.size() > 0 )&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6443)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6444)==0&false))? formattingElements.get(formattingElements.size()-1) : null;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element removeLastFormattingElement() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6445);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6446);int size = formattingElements.size();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6447);if ((((size > 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6448)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6449)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6450);return formattingElements.remove(size-1);
        }else
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6451);return null;
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    // active formatting elements
    void pushActiveFormattingElements(Element in) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6452);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6453);int numSeen = 0;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6454);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6455)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6456)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6457);Element el = formattingElements.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6458);if ((((el == null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6459)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6460)==0&false))) // marker
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6461);break;

            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6462);if ((((isSameFormattingElement(in, el))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6463)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6464)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6465);numSeen++;

            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6466);if ((((numSeen == 3)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6467)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6468)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6469);formattingElements.remove(pos);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6470);break;
            }
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6471);formattingElements.add(in);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    private boolean isSameFormattingElement(Element a, Element b) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6472);
        // same if: same namespace, tag, and attributes. Element.equals only checks tag, might in future check children
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6473);return a.normalName().equals(b.normalName()) &&
                // a.namespace().equals(b.namespace()) &&
                a.attributes().equals(b.attributes());
        // todo: namespaces
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void reconstructFormattingElements() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6474);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6475);Element last = lastFormattingElement();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6476);if ((((last == null || onStack(last))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6477)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6478)==0&false)))
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6479);return;

        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6480);Element entry = last;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6481);int size = formattingElements.size();
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6482);int pos = size - 1;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6483);boolean skip = false;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6484);while (true) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6485);if ((((pos == 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6486)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6487)==0&false))) {{ // step 4. if none before, skip to 8
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6488);skip = true;
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6489);break;
            }
            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6490);entry = formattingElements.get(--pos); // step 5. one earlier than entry
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6491);if ((((entry == null || onStack(entry))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6492)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6493)==0&false))) // step 6 - neither marker nor on stack
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6494);break; // jump to 8, else continue back to 4
        }}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6495);while(true) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6496);if ((((!skip)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6497)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6498)==0&false))) // step 7: on later than entry
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6499);entry = formattingElements.get(++pos);
            }__CLR4_4_14m84m8lh9yvgnf.R.inc(6500);Validate.notNull(entry); // should not occur, as we break at last element

            // 8. create new element from element, 9 insert into current node, onto stack
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6501);skip = false; // can only skip increment from 4.
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6502);Element newEl = insertStartTag(entry.normalName()); // todo: avoid fostering here?
            // newEl.namespace(entry.namespace()); // todo: namespaces
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6503);newEl.attributes().addAll(entry.attributes());

            // 10. replace entry with new entry
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6504);formattingElements.set(pos, newEl);

            // 11
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6505);if ((((pos == size-1)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6506)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6507)==0&false))) // if not last entry in list, jump to 7
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6508);break;
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void clearFormattingElementsToLastMarker() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6509);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6510);while ((((!formattingElements.isEmpty())&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6511)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6512)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6513);Element el = removeLastFormattingElement();
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6514);if ((((el == null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6515)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6516)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6517);break;
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void removeFromActiveFormattingElements(Element el) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6518);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6519);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6520)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6521)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6522);Element next = formattingElements.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6523);if ((((next == el)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6524)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6525)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6526);formattingElements.remove(pos);
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6527);break;
            }
        }}
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    boolean isInActiveFormattingElements(Element el) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6528);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6529);return isElementInQueue(formattingElements, el);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    Element getActiveFormattingElement(String nodeName) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6530);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6531);for (int pos = formattingElements.size() -1; (((pos >= 0)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6532)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6533)==0&false)); pos--) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6534);Element next = formattingElements.get(pos);
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6535);if ((((next == null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6536)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6537)==0&false))) // scope marker
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6538);break;
            }else {__CLR4_4_14m84m8lh9yvgnf.R.inc(6539);if ((((next.normalName().equals(nodeName))&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6540)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6541)==0&false)))
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6542);return next;
        }}}
        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6543);return null;
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void replaceActiveFormattingElement(Element out, Element in) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6544);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6545);replaceInQueue(formattingElements, out, in);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void insertMarkerToFormattingElements() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6546);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6547);formattingElements.add(null);
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    void insertInFosterParent(Node in) {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6548);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6549);Element fosterParent;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6550);Element lastTable = getFromStack("table");
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6551);boolean isLastTableParent = false;
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6552);if ((((lastTable != null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6553)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6554)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6555);if ((((lastTable.parent() != null)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6556)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6557)==0&false))) {{
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6558);fosterParent = lastTable.parent();
                __CLR4_4_14m84m8lh9yvgnf.R.inc(6559);isLastTableParent = true;
            } }else
                {__CLR4_4_14m84m8lh9yvgnf.R.inc(6560);fosterParent = aboveOnStack(lastTable);
        }} }else {{ // no table == frag
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6561);fosterParent = stack.get(0);
        }

        }__CLR4_4_14m84m8lh9yvgnf.R.inc(6562);if ((((isLastTableParent)&&(__CLR4_4_14m84m8lh9yvgnf.R.iget(6563)!=0|true))||(__CLR4_4_14m84m8lh9yvgnf.R.iget(6564)==0&false))) {{
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6565);Validate.notNull(lastTable); // last table cannot be null by this point.
            __CLR4_4_14m84m8lh9yvgnf.R.inc(6566);lastTable.before(in);
        }
        }else
            {__CLR4_4_14m84m8lh9yvgnf.R.inc(6567);fosterParent.appendChild(in);
    }}finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_14m84m8lh9yvgnf.R.inc(6568);
        __CLR4_4_14m84m8lh9yvgnf.R.inc(6569);return "TreeBuilder{" +
                "currentToken=" + currentToken +
                ", state=" + state +
                ", currentElement=" + currentElement() +
                '}';
    }finally{__CLR4_4_14m84m8lh9yvgnf.R.flushNeeded();}}
}
