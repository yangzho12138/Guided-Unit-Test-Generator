/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.safety;

/*
    Thank you to Ryan Grove (wonko.com) for the Ruby HTML cleaner http://github.com/rgrove/sanitize/, which inspired
    this whitelist configuration, and the initial defaults.
 */

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;


/**
 Whitelists define what HTML (elements and attributes) to allow through the cleaner. Everything else is removed.
 <p>
 Start with one of the defaults:
 </p>
 <ul>
 <li>{@link #none}
 <li>{@link #simpleText}
 <li>{@link #basic}
 <li>{@link #basicWithImages}
 <li>{@link #relaxed}
 </ul>
 <p>
 If you need to allow more through (please be careful!), tweak a base whitelist with:
 </p>
 <ul>
 <li>{@link #addTags}
 <li>{@link #addAttributes}
 <li>{@link #addEnforcedAttribute}
 <li>{@link #addProtocols}
 </ul>
 <p>
 You can remove any setting from an existing whitelist with:
 </p>
 <ul>
 <li>{@link #removeTags}
 <li>{@link #removeAttributes}
 <li>{@link #removeEnforcedAttribute}
 <li>{@link #removeProtocols}
 </ul>
 
 <p>
 The cleaner and these whitelists assume that you want to clean a <code>body</code> fragment of HTML (to add user
 supplied HTML into a templated page), and not to clean a full HTML document. If the latter is the case, either wrap the
 document HTML around the cleaned body HTML, or create a whitelist that allows <code>html</code> and <code>head</code>
 elements as appropriate.
 </p>
 <p>
 If you are going to extend a whitelist, please be very careful. Make sure you understand what attributes may lead to
 XSS attack vectors. URL attributes are particularly vulnerable and require careful validation. See 
 http://ha.ckers.org/xss.html for some XSS attack examples.
 </p>

 @author Jonathan Hedley
 */
public class Whitelist {public static class __CLR4_4_18ed8edlh9yvgru{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,11157,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Set<TagName> tagNames; // tags allowed, lower case. e.g. [p, br, span]
    private Map<TagName, Set<AttributeKey>> attributes; // tag -> attribute[]. allowed attributes [href] for a tag.
    private Map<TagName, Map<AttributeKey, AttributeValue>> enforcedAttributes; // always set these attribute values
    private Map<TagName, Map<AttributeKey, Set<Protocol>>> protocols; // allowed URL protocols for attributes
    private boolean preserveRelativeLinks; // option to preserve relative links

    /**
     This whitelist allows only text nodes: all HTML will be stripped.

     @return whitelist
     */
    public static Whitelist none() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10885);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10886);return new Whitelist();
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     This whitelist allows only simple text formatting: <code>b, em, i, strong, u</code>. All other HTML (tags and
     attributes) will be removed.

     @return whitelist
     */
    public static Whitelist simpleText() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10887);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10888);return new Whitelist()
                .addTags("b", "em", "i", "strong", "u")
                ;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     <p>
     This whitelist allows a fuller range of text nodes: <code>a, b, blockquote, br, cite, code, dd, dl, dt, em, i, li,
     ol, p, pre, q, small, span, strike, strong, sub, sup, u, ul</code>, and appropriate attributes.
     </p>
     <p>
     Links (<code>a</code> elements) can point to <code>http, https, ftp, mailto</code>, and have an enforced
     <code>rel=nofollow</code> attribute.
     </p>
     <p>
     Does not allow images.
     </p>

     @return whitelist
     */
    public static Whitelist basic() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10889);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10890);return new Whitelist()
                .addTags(
                        "a", "b", "blockquote", "br", "cite", "code", "dd", "dl", "dt", "em",
                        "i", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong", "sub",
                        "sup", "u", "ul")

                .addAttributes("a", "href")
                .addAttributes("blockquote", "cite")
                .addAttributes("q", "cite")

                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")

                .addEnforcedAttribute("a", "rel", "nofollow")
                ;

    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     This whitelist allows the same text tags as {@link #basic}, and also allows <code>img</code> tags, with appropriate
     attributes, with <code>src</code> pointing to <code>http</code> or <code>https</code>.

     @return whitelist
     */
    public static Whitelist basicWithImages() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10891);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10892);return basic()
                .addTags("img")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addProtocols("img", "src", "http", "https")
                ;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     This whitelist allows a full range of text and structural body HTML: <code>a, b, blockquote, br, caption, cite,
     code, col, colgroup, dd, div, dl, dt, em, h1, h2, h3, h4, h5, h6, i, img, li, ol, p, pre, q, small, span, strike, strong, sub,
     sup, table, tbody, td, tfoot, th, thead, tr, u, ul</code>
     <p>
     Links do not have an enforced <code>rel=nofollow</code> attribute, but you can add that if desired.
     </p>

     @return whitelist
     */
    public static Whitelist relaxed() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10893);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10894);return new Whitelist()
                .addTags(
                        "a", "b", "blockquote", "br", "caption", "cite", "code", "col",
                        "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6",
                        "i", "img", "li", "ol", "p", "pre", "q", "small", "span", "strike", "strong",
                        "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", "u",
                        "ul")

                .addAttributes("a", "href", "title")
                .addAttributes("blockquote", "cite")
                .addAttributes("col", "span", "width")
                .addAttributes("colgroup", "span", "width")
                .addAttributes("img", "align", "alt", "height", "src", "title", "width")
                .addAttributes("ol", "start", "type")
                .addAttributes("q", "cite")
                .addAttributes("table", "summary", "width")
                .addAttributes("td", "abbr", "axis", "colspan", "rowspan", "width")
                .addAttributes(
                        "th", "abbr", "axis", "colspan", "rowspan", "scope",
                        "width")
                .addAttributes("ul", "type")

                .addProtocols("a", "href", "ftp", "http", "https", "mailto")
                .addProtocols("blockquote", "cite", "http", "https")
                .addProtocols("cite", "cite", "http", "https")
                .addProtocols("img", "src", "http", "https")
                .addProtocols("q", "cite", "http", "https")
                ;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Create a new, empty whitelist. Generally it will be better to start with a default prepared whitelist instead.

     @see #basic()
     @see #basicWithImages()
     @see #simpleText()
     @see #relaxed()
     */
    public Whitelist() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10895);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10896);tagNames = new HashSet<>();
        __CLR4_4_18ed8edlh9yvgru.R.inc(10897);attributes = new HashMap<>();
        __CLR4_4_18ed8edlh9yvgru.R.inc(10898);enforcedAttributes = new HashMap<>();
        __CLR4_4_18ed8edlh9yvgru.R.inc(10899);protocols = new HashMap<>();
        __CLR4_4_18ed8edlh9yvgru.R.inc(10900);preserveRelativeLinks = false;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Add a list of allowed elements to a whitelist. (If a tag is not allowed, it will be removed from the HTML.)

     @param tags tag names to allow
     @return this (for chaining)
     */
    public Whitelist addTags(String... tags) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10901);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10902);Validate.notNull(tags);

        __CLR4_4_18ed8edlh9yvgru.R.inc(10903);for (String tagName : tags) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10904);Validate.notEmpty(tagName);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10905);tagNames.add(TagName.valueOf(tagName));
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10906);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Remove a list of allowed elements from a whitelist. (If a tag is not allowed, it will be removed from the HTML.)

     @param tags tag names to disallow
     @return this (for chaining)
     */
    public Whitelist removeTags(String... tags) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10907);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10908);Validate.notNull(tags);

        __CLR4_4_18ed8edlh9yvgru.R.inc(10909);for(String tag: tags) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10910);Validate.notEmpty(tag);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10911);TagName tagName = TagName.valueOf(tag);

            __CLR4_4_18ed8edlh9yvgru.R.inc(10912);if((((tagNames.remove(tagName))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10913)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10914)==0&false))) {{ // Only look in sub-maps if tag was allowed
                __CLR4_4_18ed8edlh9yvgru.R.inc(10915);attributes.remove(tagName);
                __CLR4_4_18ed8edlh9yvgru.R.inc(10916);enforcedAttributes.remove(tagName);
                __CLR4_4_18ed8edlh9yvgru.R.inc(10917);protocols.remove(tagName);
            }
        }}
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10918);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Add a list of allowed attributes to a tag. (If an attribute is not allowed on an element, it will be removed.)
     <p>
     E.g.: <code>addAttributes("a", "href", "class")</code> allows <code>href</code> and <code>class</code> attributes
     on <code>a</code> tags.
     </p>
     <p>
     To make an attribute valid for <b>all tags</b>, use the pseudo tag <code>:all</code>, e.g.
     <code>addAttributes(":all", "class")</code>.
     </p>

     @param tag  The tag the attributes are for. The tag will be added to the allowed tag list if necessary.
     @param attributes List of valid attributes for the tag
     @return this (for chaining)
     */
    public Whitelist addAttributes(String tag, String... attributes) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10919);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10920);Validate.notEmpty(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10921);Validate.notNull(attributes);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10922);Validate.isTrue(attributes.length > 0, "No attribute names supplied.");

        __CLR4_4_18ed8edlh9yvgru.R.inc(10923);TagName tagName = TagName.valueOf(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10924);tagNames.add(tagName);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10925);Set<AttributeKey> attributeSet = new HashSet<>();
        __CLR4_4_18ed8edlh9yvgru.R.inc(10926);for (String key : attributes) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10927);Validate.notEmpty(key);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10928);attributeSet.add(AttributeKey.valueOf(key));
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10929);if ((((this.attributes.containsKey(tagName))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10930)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10931)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10932);Set<AttributeKey> currentSet = this.attributes.get(tagName);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10933);currentSet.addAll(attributeSet);
        } }else {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10934);this.attributes.put(tagName, attributeSet);
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10935);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Remove a list of allowed attributes from a tag. (If an attribute is not allowed on an element, it will be removed.)
     <p>
     E.g.: <code>removeAttributes("a", "href", "class")</code> disallows <code>href</code> and <code>class</code>
     attributes on <code>a</code> tags.
     </p>
     <p>
     To make an attribute invalid for <b>all tags</b>, use the pseudo tag <code>:all</code>, e.g.
     <code>removeAttributes(":all", "class")</code>.
     </p>

     @param tag  The tag the attributes are for.
     @param attributes List of invalid attributes for the tag
     @return this (for chaining)
     */
    public Whitelist removeAttributes(String tag, String... attributes) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10936);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10937);Validate.notEmpty(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10938);Validate.notNull(attributes);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10939);Validate.isTrue(attributes.length > 0, "No attribute names supplied.");

        __CLR4_4_18ed8edlh9yvgru.R.inc(10940);TagName tagName = TagName.valueOf(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10941);Set<AttributeKey> attributeSet = new HashSet<>();
        __CLR4_4_18ed8edlh9yvgru.R.inc(10942);for (String key : attributes) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10943);Validate.notEmpty(key);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10944);attributeSet.add(AttributeKey.valueOf(key));
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10945);if((((tagNames.contains(tagName) && this.attributes.containsKey(tagName))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10946)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10947)==0&false))) {{ // Only look in sub-maps if tag was allowed
            __CLR4_4_18ed8edlh9yvgru.R.inc(10948);Set<AttributeKey> currentSet = this.attributes.get(tagName);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10949);currentSet.removeAll(attributeSet);

            __CLR4_4_18ed8edlh9yvgru.R.inc(10950);if((((currentSet.isEmpty())&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10951)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10952)==0&false))) // Remove tag from attribute map if no attributes are allowed for tag
                {__CLR4_4_18ed8edlh9yvgru.R.inc(10953);this.attributes.remove(tagName);
        }}
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10954);if((((tag.equals(":all"))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10955)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10956)==0&false))) // Attribute needs to be removed from all individually set tags
            {__CLR4_4_18ed8edlh9yvgru.R.inc(10957);for(TagName name: this.attributes.keySet()) {{
                __CLR4_4_18ed8edlh9yvgru.R.inc(10958);Set<AttributeKey> currentSet = this.attributes.get(name);
                __CLR4_4_18ed8edlh9yvgru.R.inc(10959);currentSet.removeAll(attributeSet);

                __CLR4_4_18ed8edlh9yvgru.R.inc(10960);if((((currentSet.isEmpty())&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10961)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10962)==0&false))) // Remove tag from attribute map if no attributes are allowed for tag
                    {__CLR4_4_18ed8edlh9yvgru.R.inc(10963);this.attributes.remove(name);
            }}
        }}__CLR4_4_18ed8edlh9yvgru.R.inc(10964);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Add an enforced attribute to a tag. An enforced attribute will always be added to the element. If the element
     already has the attribute set, it will be overridden with this value.
     <p>
     E.g.: <code>addEnforcedAttribute("a", "rel", "nofollow")</code> will make all <code>a</code> tags output as
     <code>&lt;a href="..." rel="nofollow"&gt;</code>
     </p>

     @param tag   The tag the enforced attribute is for. The tag will be added to the allowed tag list if necessary.
     @param attribute   The attribute name
     @param value The enforced attribute value
     @return this (for chaining)
     */
    public Whitelist addEnforcedAttribute(String tag, String attribute, String value) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10965);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10966);Validate.notEmpty(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10967);Validate.notEmpty(attribute);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10968);Validate.notEmpty(value);

        __CLR4_4_18ed8edlh9yvgru.R.inc(10969);TagName tagName = TagName.valueOf(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10970);tagNames.add(tagName);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10971);AttributeKey attrKey = AttributeKey.valueOf(attribute);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10972);AttributeValue attrVal = AttributeValue.valueOf(value);

        __CLR4_4_18ed8edlh9yvgru.R.inc(10973);if ((((enforcedAttributes.containsKey(tagName))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10974)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10975)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10976);enforcedAttributes.get(tagName).put(attrKey, attrVal);
        } }else {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10977);Map<AttributeKey, AttributeValue> attrMap = new HashMap<>();
            __CLR4_4_18ed8edlh9yvgru.R.inc(10978);attrMap.put(attrKey, attrVal);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10979);enforcedAttributes.put(tagName, attrMap);
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10980);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Remove a previously configured enforced attribute from a tag.

     @param tag   The tag the enforced attribute is for.
     @param attribute   The attribute name
     @return this (for chaining)
     */
    public Whitelist removeEnforcedAttribute(String tag, String attribute) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10981);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10982);Validate.notEmpty(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10983);Validate.notEmpty(attribute);

        __CLR4_4_18ed8edlh9yvgru.R.inc(10984);TagName tagName = TagName.valueOf(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10985);if((((tagNames.contains(tagName) && enforcedAttributes.containsKey(tagName))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10986)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10987)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(10988);AttributeKey attrKey = AttributeKey.valueOf(attribute);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10989);Map<AttributeKey, AttributeValue> attrMap = enforcedAttributes.get(tagName);
            __CLR4_4_18ed8edlh9yvgru.R.inc(10990);attrMap.remove(attrKey);

            __CLR4_4_18ed8edlh9yvgru.R.inc(10991);if((((attrMap.isEmpty())&&(__CLR4_4_18ed8edlh9yvgru.R.iget(10992)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(10993)==0&false))) // Remove tag from enforced attribute map if no enforced attributes are present
                {__CLR4_4_18ed8edlh9yvgru.R.inc(10994);enforcedAttributes.remove(tagName);
        }}
        }__CLR4_4_18ed8edlh9yvgru.R.inc(10995);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     * Configure this Whitelist to preserve relative links in an element's URL attribute, or convert them to absolute
     * links. By default, this is <b>false</b>: URLs will be  made absolute (e.g. start with an allowed protocol, like
     * e.g. {@code http://}.
     * <p>
     * Note that when handling relative links, the input document must have an appropriate {@code base URI} set when
     * parsing, so that the link's protocol can be confirmed. Regardless of the setting of the {@code preserve relative
     * links} option, the link must be resolvable against the base URI to an allowed protocol; otherwise the attribute
     * will be removed.
     * </p>
     *
     * @param preserve {@code true} to allow relative links, {@code false} (default) to deny
     * @return this Whitelist, for chaining.
     * @see #addProtocols
     */
    public Whitelist preserveRelativeLinks(boolean preserve) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10996);
        __CLR4_4_18ed8edlh9yvgru.R.inc(10997);preserveRelativeLinks = preserve;
        __CLR4_4_18ed8edlh9yvgru.R.inc(10998);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Add allowed URL protocols for an element's URL attribute. This restricts the possible values of the attribute to
     URLs with the defined protocol.
     <p>
     E.g.: <code>addProtocols("a", "href", "ftp", "http", "https")</code>
     </p>
     <p>
     To allow a link to an in-page URL anchor (i.e. <code>&lt;a href="#anchor"&gt;</code>, add a <code>#</code>:<br>
     E.g.: <code>addProtocols("a", "href", "#")</code>
     </p>

     @param tag       Tag the URL protocol is for
     @param attribute       Attribute name
     @param protocols List of valid protocols
     @return this, for chaining
     */
    public Whitelist addProtocols(String tag, String attribute, String... protocols) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(10999);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11000);Validate.notEmpty(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11001);Validate.notEmpty(attribute);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11002);Validate.notNull(protocols);

        __CLR4_4_18ed8edlh9yvgru.R.inc(11003);TagName tagName = TagName.valueOf(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11004);AttributeKey attrKey = AttributeKey.valueOf(attribute);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11005);Map<AttributeKey, Set<Protocol>> attrMap;
        __CLR4_4_18ed8edlh9yvgru.R.inc(11006);Set<Protocol> protSet;

        __CLR4_4_18ed8edlh9yvgru.R.inc(11007);if ((((this.protocols.containsKey(tagName))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11008)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11009)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11010);attrMap = this.protocols.get(tagName);
        } }else {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11011);attrMap = new HashMap<>();
            __CLR4_4_18ed8edlh9yvgru.R.inc(11012);this.protocols.put(tagName, attrMap);
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11013);if ((((attrMap.containsKey(attrKey))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11014)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11015)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11016);protSet = attrMap.get(attrKey);
        } }else {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11017);protSet = new HashSet<>();
            __CLR4_4_18ed8edlh9yvgru.R.inc(11018);attrMap.put(attrKey, protSet);
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11019);for (String protocol : protocols) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11020);Validate.notEmpty(protocol);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11021);Protocol prot = Protocol.valueOf(protocol);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11022);protSet.add(prot);
        }
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11023);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     Remove allowed URL protocols for an element's URL attribute. If you remove all protocols for an attribute, that
     attribute will allow any protocol.
     <p>
     E.g.: <code>removeProtocols("a", "href", "ftp")</code>
     </p>

     @param tag Tag the URL protocol is for
     @param attribute Attribute name
     @param removeProtocols List of invalid protocols
     @return this, for chaining
     */
    public Whitelist removeProtocols(String tag, String attribute, String... removeProtocols) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11024);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11025);Validate.notEmpty(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11026);Validate.notEmpty(attribute);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11027);Validate.notNull(removeProtocols);

        __CLR4_4_18ed8edlh9yvgru.R.inc(11028);TagName tagName = TagName.valueOf(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11029);AttributeKey attr = AttributeKey.valueOf(attribute);

        // make sure that what we're removing actually exists; otherwise can open the tag to any data and that can
        // be surprising
        __CLR4_4_18ed8edlh9yvgru.R.inc(11030);Validate.isTrue(protocols.containsKey(tagName), "Cannot remove a protocol that is not set.");
        __CLR4_4_18ed8edlh9yvgru.R.inc(11031);Map<AttributeKey, Set<Protocol>> tagProtocols = protocols.get(tagName);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11032);Validate.isTrue(tagProtocols.containsKey(attr), "Cannot remove a protocol that is not set.");

        __CLR4_4_18ed8edlh9yvgru.R.inc(11033);Set<Protocol> attrProtocols = tagProtocols.get(attr);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11034);for (String protocol : removeProtocols) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11035);Validate.notEmpty(protocol);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11036);attrProtocols.remove(Protocol.valueOf(protocol));
        }

        }__CLR4_4_18ed8edlh9yvgru.R.inc(11037);if ((((attrProtocols.isEmpty())&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11038)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11039)==0&false))) {{ // Remove protocol set if empty
            __CLR4_4_18ed8edlh9yvgru.R.inc(11040);tagProtocols.remove(attr);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11041);if ((((tagProtocols.isEmpty())&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11042)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11043)==0&false))) // Remove entry for tag if empty
                {__CLR4_4_18ed8edlh9yvgru.R.inc(11044);protocols.remove(tagName);
        }}
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11045);return this;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     * Test if the supplied tag is allowed by this whitelist
     * @param tag test tag
     * @return true if allowed
     */
    protected boolean isSafeTag(String tag) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11046);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11047);return tagNames.contains(TagName.valueOf(tag));
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    /**
     * Test if the supplied attribute is allowed by this whitelist for this tag
     * @param tagName tag to consider allowing the attribute in
     * @param el element under test, to confirm protocol
     * @param attr attribute under test
     * @return true if allowed
     */
    protected boolean isSafeAttribute(String tagName, Element el, Attribute attr) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11048);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11049);TagName tag = TagName.valueOf(tagName);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11050);AttributeKey key = AttributeKey.valueOf(attr.getKey());

        __CLR4_4_18ed8edlh9yvgru.R.inc(11051);Set<AttributeKey> okSet = attributes.get(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11052);if ((((okSet != null && okSet.contains(key))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11053)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11054)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11055);if ((((protocols.containsKey(tag))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11056)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11057)==0&false))) {{
                __CLR4_4_18ed8edlh9yvgru.R.inc(11058);Map<AttributeKey, Set<Protocol>> attrProts = protocols.get(tag);
                // ok if not defined protocol; otherwise test
                __CLR4_4_18ed8edlh9yvgru.R.inc(11059);return !attrProts.containsKey(key) || testValidProtocol(el, attr, attrProts.get(key));
            } }else {{ // attribute found, no protocols defined, so OK
                __CLR4_4_18ed8edlh9yvgru.R.inc(11060);return true;
            }
        }}
        // might be an enforced attribute?
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11061);Map<AttributeKey, AttributeValue> enforcedSet = enforcedAttributes.get(tag);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11062);if ((((enforcedSet != null)&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11063)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11064)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11065);Attributes expect = getEnforcedAttributes(tagName);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11066);String attrKey = attr.getKey();
            __CLR4_4_18ed8edlh9yvgru.R.inc(11067);if ((((expect.hasKeyIgnoreCase(attrKey))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11068)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11069)==0&false))) {{
                __CLR4_4_18ed8edlh9yvgru.R.inc(11070);return expect.getIgnoreCase(attrKey).equals(attr.getValue());
            }
        }}
        // no attributes defined for tag, try :all tag
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11071);return !tagName.equals(":all") && isSafeAttribute(":all", el, attr);
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    private boolean testValidProtocol(Element el, Attribute attr, Set<Protocol> protocols) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11072);
        // try to resolve relative urls to abs, and optionally update the attribute so output html has abs.
        // rels without a baseuri get removed
        __CLR4_4_18ed8edlh9yvgru.R.inc(11073);String value = el.absUrl(attr.getKey());
        __CLR4_4_18ed8edlh9yvgru.R.inc(11074);if ((((value.length() == 0)&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11075)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11076)==0&false)))
            {__CLR4_4_18ed8edlh9yvgru.R.inc(11077);value = attr.getValue(); // if it could not be made abs, run as-is to allow custom unknown protocols
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11078);if ((((!preserveRelativeLinks)&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11079)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11080)==0&false)))
            {__CLR4_4_18ed8edlh9yvgru.R.inc(11081);attr.setValue(value);
        
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11082);for (Protocol protocol : protocols) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11083);String prot = protocol.toString();

            __CLR4_4_18ed8edlh9yvgru.R.inc(11084);if ((((prot.equals("#"))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11085)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11086)==0&false))) {{ // allows anchor links
                __CLR4_4_18ed8edlh9yvgru.R.inc(11087);if ((((isValidAnchor(value))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11088)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11089)==0&false))) {{
                    __CLR4_4_18ed8edlh9yvgru.R.inc(11090);return true;
                } }else {{
                    __CLR4_4_18ed8edlh9yvgru.R.inc(11091);continue;
                }
            }}

            }__CLR4_4_18ed8edlh9yvgru.R.inc(11092);prot += ":";

            __CLR4_4_18ed8edlh9yvgru.R.inc(11093);if ((((lowerCase(value).startsWith(prot))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11094)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11095)==0&false))) {{
                __CLR4_4_18ed8edlh9yvgru.R.inc(11096);return true;
            }
        }}
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11097);return false;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    private boolean isValidAnchor(String value) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11098);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11099);return value.startsWith("#") && !value.matches(".*\\s.*");
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

    Attributes getEnforcedAttributes(String tagName) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11100);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11101);Attributes attrs = new Attributes();
        __CLR4_4_18ed8edlh9yvgru.R.inc(11102);TagName tag = TagName.valueOf(tagName);
        __CLR4_4_18ed8edlh9yvgru.R.inc(11103);if ((((enforcedAttributes.containsKey(tag))&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11104)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11105)==0&false))) {{
            __CLR4_4_18ed8edlh9yvgru.R.inc(11106);Map<AttributeKey, AttributeValue> keyVals = enforcedAttributes.get(tag);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11107);for (Map.Entry<AttributeKey, AttributeValue> entry : keyVals.entrySet()) {{
                __CLR4_4_18ed8edlh9yvgru.R.inc(11108);attrs.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }}
        }__CLR4_4_18ed8edlh9yvgru.R.inc(11109);return attrs;
    }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}
    
    // named types for config. All just hold strings, but here for my sanity.

    static class TagName extends TypedValue {
        TagName(String value) {
            super(value);__CLR4_4_18ed8edlh9yvgru.R.inc(11111);try{__CLR4_4_18ed8edlh9yvgru.R.inc(11110);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

        static TagName valueOf(String value) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11112);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11113);return new TagName(value);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}
    }

    static class AttributeKey extends TypedValue {
        AttributeKey(String value) {
            super(value);__CLR4_4_18ed8edlh9yvgru.R.inc(11115);try{__CLR4_4_18ed8edlh9yvgru.R.inc(11114);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

        static AttributeKey valueOf(String value) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11116);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11117);return new AttributeKey(value);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}
    }

    static class AttributeValue extends TypedValue {
        AttributeValue(String value) {
            super(value);__CLR4_4_18ed8edlh9yvgru.R.inc(11119);try{__CLR4_4_18ed8edlh9yvgru.R.inc(11118);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

        static AttributeValue valueOf(String value) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11120);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11121);return new AttributeValue(value);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}
    }

    static class Protocol extends TypedValue {
        Protocol(String value) {
            super(value);__CLR4_4_18ed8edlh9yvgru.R.inc(11123);try{__CLR4_4_18ed8edlh9yvgru.R.inc(11122);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

        static Protocol valueOf(String value) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11124);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11125);return new Protocol(value);
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}
    }

    abstract static class TypedValue {
        private String value;

        TypedValue(String value) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11126);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11127);Validate.notNull(value);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11128);this.value = value;
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11129);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11130);final int prime = 31;
            __CLR4_4_18ed8edlh9yvgru.R.inc(11131);int result = 1;
            __CLR4_4_18ed8edlh9yvgru.R.inc(11132);result = prime * result + (((((value == null) )&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11133)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11134)==0&false))? 0 : value.hashCode());
            __CLR4_4_18ed8edlh9yvgru.R.inc(11135);return result;
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11136);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11137);if ((((this == obj)&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11138)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11139)==0&false))) {__CLR4_4_18ed8edlh9yvgru.R.inc(11140);return true;
            }__CLR4_4_18ed8edlh9yvgru.R.inc(11141);if ((((obj == null)&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11142)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11143)==0&false))) {__CLR4_4_18ed8edlh9yvgru.R.inc(11144);return false;
            }__CLR4_4_18ed8edlh9yvgru.R.inc(11145);if ((((getClass() != obj.getClass())&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11146)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11147)==0&false))) {__CLR4_4_18ed8edlh9yvgru.R.inc(11148);return false;
            }__CLR4_4_18ed8edlh9yvgru.R.inc(11149);TypedValue other = (TypedValue) obj;
            __CLR4_4_18ed8edlh9yvgru.R.inc(11150);if ((((value == null)&&(__CLR4_4_18ed8edlh9yvgru.R.iget(11151)!=0|true))||(__CLR4_4_18ed8edlh9yvgru.R.iget(11152)==0&false))) {{
                __CLR4_4_18ed8edlh9yvgru.R.inc(11153);return other.value == null;
            } }else {__CLR4_4_18ed8edlh9yvgru.R.inc(11154);return value.equals(other.value);
        }}finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ed8edlh9yvgru.R.inc(11155);
            __CLR4_4_18ed8edlh9yvgru.R.inc(11156);return value;
        }finally{__CLR4_4_18ed8edlh9yvgru.R.flushNeeded();}}
    }
}

