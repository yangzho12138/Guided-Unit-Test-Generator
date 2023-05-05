/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

/**
 * HTML Tag capabilities.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Tag {public static class __CLR4_4_16h26h2lh9yvgpk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,8545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Map<String, Tag> tags = new HashMap<>(); // map of known tags

    private String tagName;
    private String normalName; // always the lower case version of this tag, regardless of case preservation mode
    private boolean isBlock = true; // block or inline
    private boolean formatAsBlock = true; // should be formatted as a block
    private boolean canContainInline = true; // only pcdata if not
    private boolean empty = false; // can hold nothing; e.g. img
    private boolean selfClosing = false; // can self close (<foo />). used for unknown tags that self close, without forcing them as empty.
    private boolean preserveWhitespace = false; // for pre, textarea, script etc
    private boolean formList = false; // a control that appears in forms: input, textarea, output etc
    private boolean formSubmit = false; // a control that can be submitted in a form: input etc

    public Tag(String tagName) {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8390);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8391);this.tagName = tagName;
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8392);normalName = Normalizer.lowerCase(tagName);
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get this tag's name.
     *
     * @return the tag's name
     */
    public String getName() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8393);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8394);return tagName;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get this tag's normalized (lowercased) name.
     * @return the tag's normal name.
     */
    public String normalName() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8395);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8396);return normalName;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.
     * <p>
     * Pre-defined tags (P, DIV etc) will be ==, but unknown tags are not registered and will only .equals().
     * </p>
     * 
     * @param tagName Name of tag, e.g. "p". Case insensitive.
     * @param settings used to control tag name sensitivity
     * @return The tag, either defined or new generic.
     */
    public static Tag valueOf(String tagName, ParseSettings settings) {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8397);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8398);Validate.notNull(tagName);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8399);Tag tag = tags.get(tagName);

        __CLR4_4_16h26h2lh9yvgpk.R.inc(8400);if ((((tag == null)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8401)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8402)==0&false))) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8403);tagName = settings.normalizeTag(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8404);Validate.notEmpty(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8405);tag = tags.get(tagName);

            __CLR4_4_16h26h2lh9yvgpk.R.inc(8406);if ((((tag == null)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8407)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8408)==0&false))) {{
                // not defined: create default; go anywhere, do anything! (incl be inside a <p>)
                __CLR4_4_16h26h2lh9yvgpk.R.inc(8409);tag = new Tag(tagName);
                __CLR4_4_16h26h2lh9yvgpk.R.inc(8410);tag.isBlock = false;
            }
        }}
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8411);return tag;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get a Tag by name. If not previously defined (unknown), returns a new generic tag, that can do anything.
     * <p>
     * Pre-defined tags (P, DIV etc) will be ==, but unknown tags are not registered and will only .equals().
     * </p>
     *
     * @param tagName Name of tag, e.g. "p". <b>Case sensitive</b>.
     * @return The tag, either defined or new generic.
     */
    public static Tag valueOf(String tagName) {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8412);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8413);return valueOf(tagName, ParseSettings.preserveCase);
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Gets if this is a block tag.
     *
     * @return if block tag
     */
    public boolean isBlock() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8414);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8415);return isBlock;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Gets if this tag should be formatted as a block (or as inline)
     *
     * @return if should be formatted as block or inline
     */
    public boolean formatAsBlock() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8416);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8417);return formatAsBlock;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Gets if this tag can contain block tags.
     *
     * @return if tag can contain block tags
     * @deprecated No longer used, and no different result than {{@link #isBlock()}}
     */
    public boolean canContainBlock() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8418);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8419);return isBlock;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Gets if this tag is an inline tag.
     *
     * @return if this tag is an inline tag.
     */
    public boolean isInline() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8420);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8421);return !isBlock;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Gets if this tag is a data only tag.
     *
     * @return if this tag is a data only tag
     */
    public boolean isData() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8422);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8423);return !canContainInline && !isEmpty();
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get if this is an empty tag
     *
     * @return if this is an empty tag
     */
    public boolean isEmpty() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8424);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8425);return empty;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get if this tag is self closing.
     *
     * @return if this tag should be output as self closing.
     */
    public boolean isSelfClosing() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8426);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8427);return empty || selfClosing;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get if this is a pre-defined tag, or was auto created on parsing.
     *
     * @return if a known tag
     */
    public boolean isKnownTag() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8428);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8429);return tags.containsKey(tagName);
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Check if this tagname is a known tag.
     *
     * @param tagName name of tag
     * @return if known HTML tag
     */
    public static boolean isKnownTag(String tagName) {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8430);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8431);return tags.containsKey(tagName);
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get if this tag should preserve whitespace within child text nodes.
     *
     * @return if preserve whitespace
     */
    public boolean preserveWhitespace() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8432);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8433);return preserveWhitespace;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get if this tag represents a control associated with a form. E.g. input, textarea, output
     * @return if associated with a form
     */
    public boolean isFormListed() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8434);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8435);return formList;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    /**
     * Get if this tag represents an element that should be submitted with a form. E.g. input, option
     * @return if submittable with a form
     */
    public boolean isFormSubmittable() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8436);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8437);return formSubmit;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    Tag setSelfClosing() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8438);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8439);selfClosing = true;
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8440);return this;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8441);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8442);if ((((this == o)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8443)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8444)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8445);return true;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8446);if ((((!(o instanceof Tag))&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8447)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8448)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8449);return false;

        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8450);Tag tag = (Tag) o;

        __CLR4_4_16h26h2lh9yvgpk.R.inc(8451);if ((((!tagName.equals(tag.tagName))&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8452)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8453)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8454);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8455);if ((((canContainInline != tag.canContainInline)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8456)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8457)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8458);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8459);if ((((empty != tag.empty)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8460)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8461)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8462);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8463);if ((((formatAsBlock != tag.formatAsBlock)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8464)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8465)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8466);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8467);if ((((isBlock != tag.isBlock)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8468)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8469)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8470);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8471);if ((((preserveWhitespace != tag.preserveWhitespace)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8472)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8473)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8474);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8475);if ((((selfClosing != tag.selfClosing)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8476)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8477)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8478);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8479);if ((((formList != tag.formList)&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8480)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8481)==0&false))) {__CLR4_4_16h26h2lh9yvgpk.R.inc(8482);return false;
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8483);return formSubmit == tag.formSubmit;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8484);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8485);int result = tagName.hashCode();
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8486);result = 31 * result + ((((isBlock )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8487)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8488)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8489);result = 31 * result + ((((formatAsBlock )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8490)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8491)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8492);result = 31 * result + ((((canContainInline )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8493)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8494)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8495);result = 31 * result + ((((empty )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8496)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8497)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8498);result = 31 * result + ((((selfClosing )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8499)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8500)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8501);result = 31 * result + ((((preserveWhitespace )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8502)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8503)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8504);result = 31 * result + ((((formList )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8505)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8506)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8507);result = 31 * result + ((((formSubmit )&&(__CLR4_4_16h26h2lh9yvgpk.R.iget(8508)!=0|true))||(__CLR4_4_16h26h2lh9yvgpk.R.iget(8509)==0&false))? 1 : 0);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8510);return result;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8511);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8512);return tagName;
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    // internal static initialisers:
    // prepped from http://www.w3.org/TR/REC-html40/sgml/dtd.html and other sources
    private static final String[] blockTags = {
            "html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame",
            "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6",
            "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins",
            "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th",
            "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main",
            "svg", "math", "center"
    };
    private static final String[] inlineTags = {
            "object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd",
            "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q",
            "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup",
            "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track",
            "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track",
            "data", "bdi", "s"
    };
    private static final String[] emptyTags = {
            "meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command",
            "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"
    };
    private static final String[] formatAsInlineTags = {
            "title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style",
            "ins", "del", "s"
    };
    private static final String[] preserveWhitespaceTags = {
            "pre", "plaintext", "title", "textarea"
            // script is not here as it is a data node, which always preserve whitespace
    };
    // todo: I think we just need submit tags, and can scrub listed
    private static final String[] formListedTags = {
            "button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"
    };
    private static final String[] formSubmitTags = {
            "input", "keygen", "object", "select", "textarea"
    };

    static {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8513);
        // creates
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8514);for (String tagName : blockTags) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8515);Tag tag = new Tag(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8516);register(tag);
        }
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8517);for (String tagName : inlineTags) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8518);Tag tag = new Tag(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8519);tag.isBlock = false;
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8520);tag.formatAsBlock = false;
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8521);register(tag);
        }

        // mods:
        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8522);for (String tagName : emptyTags) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8523);Tag tag = tags.get(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8524);Validate.notNull(tag);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8525);tag.canContainInline = false;
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8526);tag.empty = true;
        }

        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8527);for (String tagName : formatAsInlineTags) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8528);Tag tag = tags.get(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8529);Validate.notNull(tag);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8530);tag.formatAsBlock = false;
        }

        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8531);for (String tagName : preserveWhitespaceTags) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8532);Tag tag = tags.get(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8533);Validate.notNull(tag);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8534);tag.preserveWhitespace = true;
        }

        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8535);for (String tagName : formListedTags) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8536);Tag tag = tags.get(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8537);Validate.notNull(tag);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8538);tag.formList = true;
        }

        }__CLR4_4_16h26h2lh9yvgpk.R.inc(8539);for (String tagName : formSubmitTags) {{
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8540);Tag tag = tags.get(tagName);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8541);Validate.notNull(tag);
            __CLR4_4_16h26h2lh9yvgpk.R.inc(8542);tag.formSubmit = true;
        }
    }}finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}

    private static void register(Tag tag) {try{__CLR4_4_16h26h2lh9yvgpk.R.inc(8543);
        __CLR4_4_16h26h2lh9yvgpk.R.inc(8544);tags.put(tag.tagName, tag);
    }finally{__CLR4_4_16h26h2lh9yvgpk.R.flushNeeded();}}
}
