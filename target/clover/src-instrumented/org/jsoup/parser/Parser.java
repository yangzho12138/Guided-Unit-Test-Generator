/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/**
 * Parses HTML into a {@link org.jsoup.nodes.Document}. Generally best to use one of the  more convenient parse methods
 * in {@link org.jsoup.Jsoup}.
 */
public class Parser {public static class __CLR4_4_16f96f9lh9yvgpf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,8390,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private TreeBuilder treeBuilder;
    private ParseErrorList errors;
    private ParseSettings settings;

    /**
     * Create a new Parser, using the specified TreeBuilder
     * @param treeBuilder TreeBuilder to use to parse input into Documents.
     */
    public Parser(TreeBuilder treeBuilder) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8325);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8326);this.treeBuilder = treeBuilder;
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8327);settings = treeBuilder.defaultSettings();
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8328);errors = ParseErrorList.noTracking();
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}
    
    public Document parseInput(String html, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8329);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8330);return treeBuilder.parse(new StringReader(html), baseUri, this);
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    public Document parseInput(Reader inputHtml, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8331);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8332);return treeBuilder.parse(inputHtml, baseUri, this);
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    public List<Node> parseFragmentInput(String fragment, Element context, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8333);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8334);return treeBuilder.parseFragment(fragment, context, baseUri, this);
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}
    // gets & sets
    /**
     * Get the TreeBuilder currently in use.
     * @return current TreeBuilder.
     */
    public TreeBuilder getTreeBuilder() {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8335);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8336);return treeBuilder;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Update the TreeBuilder used when parsing content.
     * @param treeBuilder current TreeBuilder
     * @return this, for chaining
     */
    public Parser setTreeBuilder(TreeBuilder treeBuilder) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8337);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8338);this.treeBuilder = treeBuilder;
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8339);treeBuilder.parser = this;
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8340);return this;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Check if parse error tracking is enabled.
     * @return current track error state.
     */
    public boolean isTrackErrors() {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8341);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8342);return errors.getMaxSize() > 0;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Enable or disable parse error tracking for the next parse.
     * @param maxErrors the maximum number of errors to track. Set to 0 to disable.
     * @return this, for chaining
     */
    public Parser setTrackErrors(int maxErrors) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8343);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8344);errors = (((maxErrors > 0 )&&(__CLR4_4_16f96f9lh9yvgpf.R.iget(8345)!=0|true))||(__CLR4_4_16f96f9lh9yvgpf.R.iget(8346)==0&false))? ParseErrorList.tracking(maxErrors) : ParseErrorList.noTracking();
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8347);return this;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Retrieve the parse errors, if any, from the last parse.
     * @return list of parse errors, up to the size of the maximum errors tracked.
     */
    public ParseErrorList getErrors() {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8348);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8349);return errors;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    public Parser settings(ParseSettings settings) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8350);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8351);this.settings = settings;
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8352);return this;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    public ParseSettings settings() {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8353);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8354);return settings;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    // static parse functions below
    /**
     * Parse HTML into a Document.
     *
     * @param html HTML to parse
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return parsed Document
     */
    public static Document parse(String html, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8355);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8356);TreeBuilder treeBuilder = new HtmlTreeBuilder();
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8357);return treeBuilder.parse(new StringReader(html), baseUri, new Parser(treeBuilder));
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.
     *
     * @param fragmentHtml the fragment of HTML to parse
     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This
     * provides stack context (for implicit element creation).
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.
     */
    public static List<Node> parseFragment(String fragmentHtml, Element context, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8358);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8359);HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8360);return treeBuilder.parseFragment(fragmentHtml, context, baseUri, new Parser(treeBuilder));
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Parse a fragment of HTML into a list of nodes. The context element, if supplied, supplies parsing context.
     *
     * @param fragmentHtml the fragment of HTML to parse
     * @param context (optional) the element that this HTML fragment is being parsed for (i.e. for inner HTML). This
     * provides stack context (for implicit element creation).
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     * @param errorList list to add errors to
     *
     * @return list of nodes parsed from the input HTML. Note that the context element, if supplied, is not modified.
     */
    public static List<Node> parseFragment(String fragmentHtml, Element context, String baseUri, ParseErrorList errorList) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8361);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8362);HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8363);Parser parser = new Parser(treeBuilder);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8364);parser.errors = errorList;
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8365);return treeBuilder.parseFragment(fragmentHtml, context, baseUri, parser);
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Parse a fragment of XML into a list of nodes.
     *
     * @param fragmentXml the fragment of XML to parse
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     * @return list of nodes parsed from the input XML.
     */
    public static List<Node> parseXmlFragment(String fragmentXml, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8366);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8367);XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8368);return treeBuilder.parseFragment(fragmentXml, baseUri, new Parser(treeBuilder));
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Parse a fragment of HTML into the {@code body} of a Document.
     *
     * @param bodyHtml fragment of HTML
     * @param baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return Document, with empty head, and HTML parsed into body
     */
    public static Document parseBodyFragment(String bodyHtml, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8369);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8370);Document doc = Document.createShell(baseUri);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8371);Element body = doc.body();
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8372);List<Node> nodeList = parseFragment(bodyHtml, body, baseUri);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8373);Node[] nodes = nodeList.toArray(new Node[0]); // the node list gets modified when re-parented
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8374);for (int i = nodes.length - 1; (((i > 0)&&(__CLR4_4_16f96f9lh9yvgpf.R.iget(8375)!=0|true))||(__CLR4_4_16f96f9lh9yvgpf.R.iget(8376)==0&false)); i--) {{
            __CLR4_4_16f96f9lh9yvgpf.R.inc(8377);nodes[i].remove();
        }
        }__CLR4_4_16f96f9lh9yvgpf.R.inc(8378);for (Node node : nodes) {{
            __CLR4_4_16f96f9lh9yvgpf.R.inc(8379);body.appendChild(node);
        }
        }__CLR4_4_16f96f9lh9yvgpf.R.inc(8380);return doc;
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Utility method to unescape HTML entities from a string
     * @param string HTML escaped string
     * @param inAttribute if the string is to be escaped in strict mode (as attributes are)
     * @return an unescaped string
     */
    public static String unescapeEntities(String string, boolean inAttribute) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8381);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8382);Tokeniser tokeniser = new Tokeniser(new CharacterReader(string), ParseErrorList.noTracking());
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8383);return tokeniser.unescapeEntities(inAttribute);
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * @param bodyHtml HTML to parse
     * @param baseUri baseUri base URI of document (i.e. original fetch location), for resolving relative URLs.
     *
     * @return parsed Document
     * @deprecated Use {@link #parseBodyFragment} or {@link #parseFragment} instead.
     */
    public static Document parseBodyFragmentRelaxed(String bodyHtml, String baseUri) {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8384);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8385);return parse(bodyHtml, baseUri);
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}
    
    // builders

    /**
     * Create a new HTML parser. This parser treats input as HTML5, and enforces the creation of a normalised document,
     * based on a knowledge of the semantics of the incoming tags.
     * @return a new HTML parser.
     */
    public static Parser htmlParser() {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8386);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8387);return new Parser(new HtmlTreeBuilder());
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}

    /**
     * Create a new XML parser. This parser assumes no knowledge of the incoming tags and does not treat it as HTML,
     * rather creates a simple tree directly from the input.
     * @return a new simple XML parser.
     */
    public static Parser xmlParser() {try{__CLR4_4_16f96f9lh9yvgpf.R.inc(8388);
        __CLR4_4_16f96f9lh9yvgpf.R.inc(8389);return new Parser(new XmlTreeBuilder());
    }finally{__CLR4_4_16f96f9lh9yvgpf.R.flushNeeded();}}
}
