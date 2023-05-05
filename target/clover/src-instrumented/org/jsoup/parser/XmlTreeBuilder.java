/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/**
 * Use the {@code XmlTreeBuilder} when you want to parse XML without any of the HTML DOM rules being applied to the
 * document.
 * <p>Usage example: {@code Document xmlDoc = Jsoup.parse(html, baseUrl, Parser.xmlParser());}</p>
 *
 * @author Jonathan Hedley
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class XmlTreeBuilder extends TreeBuilder {public static class __CLR4_4_1899899lh9yvgrc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,10801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParseSettings defaultSettings() {try{__CLR4_4_1899899lh9yvgrc.R.inc(10701);
        __CLR4_4_1899899lh9yvgrc.R.inc(10702);return ParseSettings.preserveCase;
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10703);
        __CLR4_4_1899899lh9yvgrc.R.inc(10704);super.initialiseParse(input, baseUri, parser);
        __CLR4_4_1899899lh9yvgrc.R.inc(10705);stack.add(doc); // place the document onto the stack. differs from HtmlTreeBuilder (not on stack)
        __CLR4_4_1899899lh9yvgrc.R.inc(10706);doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    Document parse(Reader input, String baseUri) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10707);
        __CLR4_4_1899899lh9yvgrc.R.inc(10708);return parse(input, baseUri, new Parser(this));
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    Document parse(String input, String baseUri) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10709);
        __CLR4_4_1899899lh9yvgrc.R.inc(10710);return parse(new StringReader(input), baseUri, new Parser(this));
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    @Override
    protected boolean process(Token token) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10711);
        // start tag, end tag, doctype, comment, character, eof
        boolean __CLB4_4_1_bool0=false;__CLR4_4_1899899lh9yvgrc.R.inc(10712);switch (token.type) {
            case StartTag:if (!__CLB4_4_1_bool0) {__CLR4_4_1899899lh9yvgrc.R.inc(10713);__CLB4_4_1_bool0=true;}
                __CLR4_4_1899899lh9yvgrc.R.inc(10714);insert(token.asStartTag());
                __CLR4_4_1899899lh9yvgrc.R.inc(10715);break;
            case EndTag:if (!__CLB4_4_1_bool0) {__CLR4_4_1899899lh9yvgrc.R.inc(10716);__CLB4_4_1_bool0=true;}
                __CLR4_4_1899899lh9yvgrc.R.inc(10717);popStackToClose(token.asEndTag());
                __CLR4_4_1899899lh9yvgrc.R.inc(10718);break;
            case Comment:if (!__CLB4_4_1_bool0) {__CLR4_4_1899899lh9yvgrc.R.inc(10719);__CLB4_4_1_bool0=true;}
                __CLR4_4_1899899lh9yvgrc.R.inc(10720);insert(token.asComment());
                __CLR4_4_1899899lh9yvgrc.R.inc(10721);break;
            case Character:if (!__CLB4_4_1_bool0) {__CLR4_4_1899899lh9yvgrc.R.inc(10722);__CLB4_4_1_bool0=true;}
                __CLR4_4_1899899lh9yvgrc.R.inc(10723);insert(token.asCharacter());
                __CLR4_4_1899899lh9yvgrc.R.inc(10724);break;
            case Doctype:if (!__CLB4_4_1_bool0) {__CLR4_4_1899899lh9yvgrc.R.inc(10725);__CLB4_4_1_bool0=true;}
                __CLR4_4_1899899lh9yvgrc.R.inc(10726);insert(token.asDoctype());
                __CLR4_4_1899899lh9yvgrc.R.inc(10727);break;
            case EOF:if (!__CLB4_4_1_bool0) {__CLR4_4_1899899lh9yvgrc.R.inc(10728);__CLB4_4_1_bool0=true;} // could put some normalisation here if desired
                __CLR4_4_1899899lh9yvgrc.R.inc(10729);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_1899899lh9yvgrc.R.inc(10730);__CLB4_4_1_bool0=true;}
                __CLR4_4_1899899lh9yvgrc.R.inc(10731);Validate.fail("Unexpected token type: " + token.type);
        }
        __CLR4_4_1899899lh9yvgrc.R.inc(10732);return true;
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    private void insertNode(Node node) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10733);
        __CLR4_4_1899899lh9yvgrc.R.inc(10734);currentElement().appendChild(node);
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    Element insert(Token.StartTag startTag) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10735);
        __CLR4_4_1899899lh9yvgrc.R.inc(10736);Tag tag = Tag.valueOf(startTag.name(), settings);
        // todo: wonder if for xml parsing, should treat all tags as unknown? because it's not html.
        __CLR4_4_1899899lh9yvgrc.R.inc(10737);startTag.attributes.deduplicate(settings);

        __CLR4_4_1899899lh9yvgrc.R.inc(10738);Element el = new Element(tag, baseUri, settings.normalizeAttributes(startTag.attributes));
        __CLR4_4_1899899lh9yvgrc.R.inc(10739);insertNode(el);
        __CLR4_4_1899899lh9yvgrc.R.inc(10740);if ((((startTag.isSelfClosing())&&(__CLR4_4_1899899lh9yvgrc.R.iget(10741)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10742)==0&false))) {{
            __CLR4_4_1899899lh9yvgrc.R.inc(10743);if ((((!tag.isKnownTag())&&(__CLR4_4_1899899lh9yvgrc.R.iget(10744)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10745)==0&false))) // unknown tag, remember this is self closing for output. see above.
                {__CLR4_4_1899899lh9yvgrc.R.inc(10746);tag.setSelfClosing();
        }} }else {{
            __CLR4_4_1899899lh9yvgrc.R.inc(10747);stack.add(el);
        }
        }__CLR4_4_1899899lh9yvgrc.R.inc(10748);return el;
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    void insert(Token.Comment commentToken) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10749);
        __CLR4_4_1899899lh9yvgrc.R.inc(10750);Comment comment = new Comment(commentToken.getData());
        __CLR4_4_1899899lh9yvgrc.R.inc(10751);Node insert = comment;
        __CLR4_4_1899899lh9yvgrc.R.inc(10752);if ((((commentToken.bogus && comment.isXmlDeclaration())&&(__CLR4_4_1899899lh9yvgrc.R.iget(10753)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10754)==0&false))) {{
            // xml declarations are emitted as bogus comments (which is right for html, but not xml)
            // so we do a bit of a hack and parse the data as an element to pull the attributes out
            __CLR4_4_1899899lh9yvgrc.R.inc(10755);XmlDeclaration decl = comment.asXmlDeclaration(); // else, we couldn't parse it as a decl, so leave as a comment
            __CLR4_4_1899899lh9yvgrc.R.inc(10756);if ((((decl != null)&&(__CLR4_4_1899899lh9yvgrc.R.iget(10757)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10758)==0&false)))
                {__CLR4_4_1899899lh9yvgrc.R.inc(10759);insert = decl;
        }}
        }__CLR4_4_1899899lh9yvgrc.R.inc(10760);insertNode(insert);
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    void insert(Token.Character token) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10761);
        __CLR4_4_1899899lh9yvgrc.R.inc(10762);final String data = token.getData();
        __CLR4_4_1899899lh9yvgrc.R.inc(10763);insertNode((((token.isCData() )&&(__CLR4_4_1899899lh9yvgrc.R.iget(10764)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10765)==0&false))? new CDataNode(data) : new TextNode(data));
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    void insert(Token.Doctype d) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10766);
        __CLR4_4_1899899lh9yvgrc.R.inc(10767);DocumentType doctypeNode = new DocumentType(settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
        __CLR4_4_1899899lh9yvgrc.R.inc(10768);doctypeNode.setPubSysKey(d.getPubSysKey());
        __CLR4_4_1899899lh9yvgrc.R.inc(10769);insertNode(doctypeNode);
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    /**
     * If the stack contains an element with this tag's name, pop up the stack to remove the first occurrence. If not
     * found, skips.
     *
     * @param endTag tag to close
     */
    private void popStackToClose(Token.EndTag endTag) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10770);
        __CLR4_4_1899899lh9yvgrc.R.inc(10771);String elName = settings.normalizeTag(endTag.tagName);
        __CLR4_4_1899899lh9yvgrc.R.inc(10772);Element firstFound = null;

        __CLR4_4_1899899lh9yvgrc.R.inc(10773);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_1899899lh9yvgrc.R.iget(10774)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10775)==0&false)); pos--) {{
            __CLR4_4_1899899lh9yvgrc.R.inc(10776);Element next = stack.get(pos);
            __CLR4_4_1899899lh9yvgrc.R.inc(10777);if ((((next.nodeName().equals(elName))&&(__CLR4_4_1899899lh9yvgrc.R.iget(10778)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10779)==0&false))) {{
                __CLR4_4_1899899lh9yvgrc.R.inc(10780);firstFound = next;
                __CLR4_4_1899899lh9yvgrc.R.inc(10781);break;
            }
        }}
        }__CLR4_4_1899899lh9yvgrc.R.inc(10782);if ((((firstFound == null)&&(__CLR4_4_1899899lh9yvgrc.R.iget(10783)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10784)==0&false)))
            {__CLR4_4_1899899lh9yvgrc.R.inc(10785);return; // not found, skip

        }__CLR4_4_1899899lh9yvgrc.R.inc(10786);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_1899899lh9yvgrc.R.iget(10787)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10788)==0&false)); pos--) {{
            __CLR4_4_1899899lh9yvgrc.R.inc(10789);Element next = stack.get(pos);
            __CLR4_4_1899899lh9yvgrc.R.inc(10790);stack.remove(pos);
            __CLR4_4_1899899lh9yvgrc.R.inc(10791);if ((((next == firstFound)&&(__CLR4_4_1899899lh9yvgrc.R.iget(10792)!=0|true))||(__CLR4_4_1899899lh9yvgrc.R.iget(10793)==0&false)))
                {__CLR4_4_1899899lh9yvgrc.R.inc(10794);break;
        }}
    }}finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}


    List<Node> parseFragment(String inputFragment, String baseUri, Parser parser) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10795);
        __CLR4_4_1899899lh9yvgrc.R.inc(10796);initialiseParse(new StringReader(inputFragment), baseUri, parser);
        __CLR4_4_1899899lh9yvgrc.R.inc(10797);runParser();
        __CLR4_4_1899899lh9yvgrc.R.inc(10798);return doc.childNodes();
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}

    List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser) {try{__CLR4_4_1899899lh9yvgrc.R.inc(10799);
        __CLR4_4_1899899lh9yvgrc.R.inc(10800);return parseFragment(inputFragment, baseUri, parser);
    }finally{__CLR4_4_1899899lh9yvgrc.R.flushNeeded();}}
}
