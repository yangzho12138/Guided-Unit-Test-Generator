/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 A list of {@link Element}s, with methods that act on every element in the list.
 <p>
 To get an {@code Elements} object, use the {@link Element#select(String)} method.
 </p>

 @author Jonathan Hedley, jonathan@hedley.net */
public class Elements extends ArrayList<Element> {public static class __CLR4_4_18om8omlh9yvgsb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,11498,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public Elements() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11254);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    public Elements(int initialCapacity) {
        super(initialCapacity);__CLR4_4_18om8omlh9yvgsb.R.inc(11256);try{__CLR4_4_18om8omlh9yvgsb.R.inc(11255);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    public Elements(Collection<Element> elements) {
        super(elements);__CLR4_4_18om8omlh9yvgsb.R.inc(11258);try{__CLR4_4_18om8omlh9yvgsb.R.inc(11257);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    public Elements(List<Element> elements) {
        super(elements);__CLR4_4_18om8omlh9yvgsb.R.inc(11260);try{__CLR4_4_18om8omlh9yvgsb.R.inc(11259);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    public Elements(Element... elements) {
    	super(Arrays.asList(elements));__CLR4_4_18om8omlh9yvgsb.R.inc(11262);try{__CLR4_4_18om8omlh9yvgsb.R.inc(11261);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Creates a deep copy of these elements.
     * @return a deep copy
     */
    @Override
	public Elements clone() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11263);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11264);Elements clone = new Elements(size());

        __CLR4_4_18om8omlh9yvgsb.R.inc(11265);for(Element e : this)
    		{__CLR4_4_18om8omlh9yvgsb.R.inc(11266);clone.add(e.clone());
    	
    	}__CLR4_4_18om8omlh9yvgsb.R.inc(11267);return clone;
	}finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

	// attribute methods
    /**
     Get an attribute value from the first matched element that has the attribute.
     @param attributeKey The attribute key.
     @return The attribute value from the first matched element that has the attribute.. If no elements were matched (isEmpty() == true),
     or if the no elements have the attribute, returns empty string.
     @see #hasAttr(String)
     */
    public String attr(String attributeKey) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11268);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11269);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11270);if ((((element.hasAttr(attributeKey))&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11271)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11272)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11273);return element.attr(attributeKey);
        }}
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11274);return "";
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Checks if any of the matched elements have this attribute defined.
     @param attributeKey attribute key
     @return true if any of the elements have the attribute; false if none do.
     */
    public boolean hasAttr(String attributeKey) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11275);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11276);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11277);if ((((element.hasAttr(attributeKey))&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11278)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11279)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11280);return true;
        }}
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11281);return false;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the attribute value for each of the matched elements. If an element does not have this attribute, no value is
     * included in the result set for that element.
     * @param attributeKey the attribute name to return values for. You can add the {@code abs:} prefix to the key to
     * get absolute URLs from relative URLs, e.g.: {@code doc.select("a").eachAttr("abs:href")} .
     * @return a list of each element's attribute value for the attribute
     */
    public List<String> eachAttr(String attributeKey) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11282);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11283);List<String> attrs = new ArrayList<>(size());
        __CLR4_4_18om8omlh9yvgsb.R.inc(11284);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11285);if ((((element.hasAttr(attributeKey))&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11286)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11287)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11288);attrs.add(element.attr(attributeKey));
        }}
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11289);return attrs;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Set an attribute on all matched elements.
     * @param attributeKey attribute key
     * @param attributeValue attribute value
     * @return this
     */
    public Elements attr(String attributeKey, String attributeValue) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11290);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11291);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11292);element.attr(attributeKey, attributeValue);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11293);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Remove an attribute from every matched element.
     * @param attributeKey The attribute to remove.
     * @return this (for chaining)
     */
    public Elements removeAttr(String attributeKey) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11294);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11295);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11296);element.removeAttr(attributeKey);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11297);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Add the class name to every matched element's {@code class} attribute.
     @param className class name to add
     @return this
     */
    public Elements addClass(String className) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11298);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11299);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11300);element.addClass(className);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11301);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Remove the class name from every matched element's {@code class} attribute, if present.
     @param className class name to remove
     @return this
     */
    public Elements removeClass(String className) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11302);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11303);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11304);element.removeClass(className);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11305);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Toggle the class name on every matched element's {@code class} attribute.
     @param className class name to add if missing, or remove if present, from every element.
     @return this
     */
    public Elements toggleClass(String className) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11306);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11307);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11308);element.toggleClass(className);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11309);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Determine if any of the matched elements have this class name set in their {@code class} attribute.
     @param className class name to check for
     @return true if any do, false if none do
     */
    public boolean hasClass(String className) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11310);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11311);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11312);if ((((element.hasClass(className))&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11313)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11314)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11315);return true;
        }}
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11316);return false;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Get the form element's value of the first matched element.
     * @return The form element's value, or empty if not set.
     * @see Element#val()
     */
    public String val() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11317);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11318);if ((((size() > 0)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11319)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11320)==0&false)))
            {__CLR4_4_18om8omlh9yvgsb.R.inc(11321);return first().val();
        }else
            {__CLR4_4_18om8omlh9yvgsb.R.inc(11322);return "";
    }}finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Set the form element's value in each of the matched elements.
     * @param value The value to set into each matched element
     * @return this (for chaining)
     */
    public Elements val(String value) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11323);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11324);for (Element element : this)
            {__CLR4_4_18om8omlh9yvgsb.R.inc(11325);element.val(value);
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11326);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Get the combined text of all the matched elements.
     * <p>
     * Note that it is possible to get repeats if the matched elements contain both parent elements and their own
     * children, as the Element.text() method returns the combined text of a parent and all its children.
     * @return string of all text: unescaped and no HTML.
     * @see Element#text()
     * @see #eachText()
     */
    public String text() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11327);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11328);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_4_18om8omlh9yvgsb.R.inc(11329);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11330);if ((((sb.length() != 0)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11331)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11332)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11333);sb.append(" ");
            }__CLR4_4_18om8omlh9yvgsb.R.inc(11334);sb.append(element.text());
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11335);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Test if any matched Element has any text content, that is not just whitespace.
     @return true if any element has non-blank text content.
     @see Element#hasText()
     */
    public boolean hasText() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11336);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11337);for (Element element: this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11338);if ((((element.hasText())&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11339)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11340)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11341);return true;
        }}
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11342);return false;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the text content of each of the matched elements. If an element has no text, then it is not included in the
     * result.
     * @return A list of each matched element's text content.
     * @see Element#text()
     * @see Element#hasText()
     * @see #text()
     */
    public List<String> eachText() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11343);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11344);ArrayList<String> texts = new ArrayList<>(size());
        __CLR4_4_18om8omlh9yvgsb.R.inc(11345);for (Element el: this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11346);if ((((el.hasText())&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11347)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11348)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11349);texts.add(el.text());
        }}
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11350);return texts;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Get the combined inner HTML of all matched elements.
     * @return string of all element's inner HTML.
     * @see #text()
     * @see #outerHtml()
     */
    public String html() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11351);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11352);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_4_18om8omlh9yvgsb.R.inc(11353);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11354);if ((((sb.length() != 0)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11355)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11356)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11357);sb.append("\n");
            }__CLR4_4_18om8omlh9yvgsb.R.inc(11358);sb.append(element.html());
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11359);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Get the combined outer HTML of all matched elements.
     * @return string of all element's outer HTML.
     * @see #text()
     * @see #html()
     */
    public String outerHtml() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11360);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11361);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_4_18om8omlh9yvgsb.R.inc(11362);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11363);if ((((sb.length() != 0)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11364)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11365)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11366);sb.append("\n");
            }__CLR4_4_18om8omlh9yvgsb.R.inc(11367);sb.append(element.outerHtml());
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11368);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the combined outer HTML of all matched elements. Alias of {@link #outerHtml()}.
     * @return string of all element's outer HTML.
     * @see #text()
     * @see #html()
     */
    @Override
    public String toString() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11369);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11370);return outerHtml();
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Update the tag name of each matched element. For example, to change each {@code <i>} to a {@code <em>}, do
     * {@code doc.select("i").tagName("em");}
     * @param tagName the new tag name
     * @return this, for chaining
     * @see Element#tagName(String)
     */
    public Elements tagName(String tagName) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11371);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11372);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11373);element.tagName(tagName);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11374);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Set the inner HTML of each matched element.
     * @param html HTML to parse and set into each matched element.
     * @return this, for chaining
     * @see Element#html(String)
     */
    public Elements html(String html) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11375);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11376);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11377);element.html(html);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11378);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Add the supplied HTML to the start of each matched element's inner HTML.
     * @param html HTML to add inside each element, before the existing HTML
     * @return this, for chaining
     * @see Element#prepend(String)
     */
    public Elements prepend(String html) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11379);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11380);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11381);element.prepend(html);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11382);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Add the supplied HTML to the end of each matched element's inner HTML.
     * @param html HTML to add inside each element, after the existing HTML
     * @return this, for chaining
     * @see Element#append(String)
     */
    public Elements append(String html) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11383);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11384);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11385);element.append(html);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11386);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Insert the supplied HTML before each matched element's outer HTML.
     * @param html HTML to insert before each element
     * @return this, for chaining
     * @see Element#before(String)
     */
    public Elements before(String html) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11387);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11388);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11389);element.before(html);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11390);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Insert the supplied HTML after each matched element's outer HTML.
     * @param html HTML to insert after each element
     * @return this, for chaining
     * @see Element#after(String)
     */
    public Elements after(String html) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11391);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11392);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11393);element.after(html);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11394);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Wrap the supplied HTML around each matched elements. For example, with HTML
     {@code <p><b>This</b> is <b>Jsoup</b></p>},
     <code>doc.select("b").wrap("&lt;i&gt;&lt;/i&gt;");</code>
     becomes {@code <p><i><b>This</b></i> is <i><b>jsoup</b></i></p>}
     @param html HTML to wrap around each element, e.g. {@code <div class="head"></div>}. Can be arbitrarily deep.
     @return this (for chaining)
     @see Element#wrap
     */
    public Elements wrap(String html) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11395);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11396);Validate.notEmpty(html);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11397);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11398);element.wrap(html);
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11399);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Removes the matched elements from the DOM, and moves their children up into their parents. This has the effect of
     * dropping the elements but keeping their children.
     * <p>
     * This is useful for e.g removing unwanted formatting elements but keeping their contents.
     * </p>
     * 
     * E.g. with HTML: <p>{@code <div><font>One</font> <font><a href="/">Two</a></font></div>}</p>
     * <p>{@code doc.select("font").unwrap();}</p>
     * <p>HTML = {@code <div>One <a href="/">Two</a></div>}</p>
     *
     * @return this (for chaining)
     * @see Node#unwrap
     */
    public Elements unwrap() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11400);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11401);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11402);element.unwrap();
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11403);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Empty (remove all child nodes from) each matched element. This is similar to setting the inner HTML of each
     * element to nothing.
     * <p>
     * E.g. HTML: {@code <div><p>Hello <b>there</b></p> <p>now</p></div>}<br>
     * <code>doc.select("p").empty();</code><br>
     * HTML = {@code <div><p></p> <p></p></div>}
     * @return this, for chaining
     * @see Element#empty()
     * @see #remove()
     */
    public Elements empty() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11404);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11405);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11406);element.empty();
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11407);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Remove each matched element from the DOM. This is similar to setting the outer HTML of each element to nothing.
     * <p>
     * E.g. HTML: {@code <div><p>Hello</p> <p>there</p> <img /></div>}<br>
     * <code>doc.select("p").remove();</code><br>
     * HTML = {@code <div> <img /></div>}
     * <p>
     * Note that this method should not be used to clean user-submitted HTML; rather, use {@link org.jsoup.safety.Cleaner} to clean HTML.
     * @return this, for chaining
     * @see Element#empty()
     * @see #empty()
     */
    public Elements remove() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11408);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11409);for (Element element : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11410);element.remove();
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11411);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    // filters
    
    /**
     * Find matching elements within this element list.
     * @param query A {@link Selector} query
     * @return the filtered list of elements, or an empty list if none match.
     */
    public Elements select(String query) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11412);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11413);return Selector.select(query, this);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Remove elements from this list that match the {@link Selector} query.
     * <p>
     * E.g. HTML: {@code <div class=logo>One</div> <div>Two</div>}<br>
     * <code>Elements divs = doc.select("div").not(".logo");</code><br>
     * Result: {@code divs: [<div>Two</div>]}
     * <p>
     * @param query the selector query whose results should be removed from these elements
     * @return a new elements list that contains only the filtered results
     */
    public Elements not(String query) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11414);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11415);Elements out = Selector.select(query, this);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11416);return Selector.filterOut(this, out);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Get the <i>nth</i> matched element as an Elements object.
     * <p>
     * See also {@link #get(int)} to retrieve an Element.
     * @param index the (zero-based) index of the element in the list to retain
     * @return Elements containing only the specified element, or, if that element did not exist, an empty list.
     */
    public Elements eq(int index) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11417);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11418);return (((size() > index )&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11419)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11420)==0&false))? new Elements(get(index)) : new Elements();
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}
    
    /**
     * Test if any of the matched elements match the supplied query.
     * @param query A selector
     * @return true if at least one element in the list matches the query.
     */
    public boolean is(String query) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11421);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11422);Evaluator eval = QueryParser.parse(query);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11423);for (Element e : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11424);if ((((e.is(eval))&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11425)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11426)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11427);return true;
        }}
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11428);return false;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the immediate next element sibling of each element in this list.
     * @return next element siblings.
     */
    public Elements next() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11429);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11430);return siblings(null, true, false);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the immediate next element sibling of each element in this list, filtered by the query.
     * @param query CSS query to match siblings against
     * @return next element siblings.
     */
    public Elements next(String query) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11431);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11432);return siblings(query, true, false);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get each of the following element siblings of each element in this list.
     * @return all following element siblings.
     */
    public Elements nextAll() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11433);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11434);return siblings(null, true, true);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get each of the following element siblings of each element in this list, that match the query.
     * @param query CSS query to match siblings against
     * @return all following element siblings.
     */
    public Elements nextAll(String query) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11435);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11436);return siblings(query, true, true);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the immediate previous element sibling of each element in this list.
     * @return previous element siblings.
     */
    public Elements prev() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11437);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11438);return siblings(null, false, false);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the immediate previous element sibling of each element in this list, filtered by the query.
     * @param query CSS query to match siblings against
     * @return previous element siblings.
     */
    public Elements prev(String query) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11439);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11440);return siblings(query, false, false);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get each of the previous element siblings of each element in this list.
     * @return all previous element siblings.
     */
    public Elements prevAll() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11441);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11442);return siblings(null, false, true);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get each of the previous element siblings of each element in this list, that match the query.
     * @param query CSS query to match siblings against
     * @return all previous element siblings.
     */
    public Elements prevAll(String query) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11443);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11444);return siblings(query, false, true);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    private Elements siblings(String query, boolean next, boolean all) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11445);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11446);Elements els = new Elements();
        __CLR4_4_18om8omlh9yvgsb.R.inc(11447);Evaluator eval = (((query != null)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11448)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11449)==0&false))? QueryParser.parse(query) : null;
        __CLR4_4_18om8omlh9yvgsb.R.inc(11450);for (Element e : this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11451);do {{
                __CLR4_4_18om8omlh9yvgsb.R.inc(11452);Element sib = (((next )&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11453)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11454)==0&false))? e.nextElementSibling() : e.previousElementSibling();
                __CLR4_4_18om8omlh9yvgsb.R.inc(11455);if ((((sib == null)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11456)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11457)==0&false))) {__CLR4_4_18om8omlh9yvgsb.R.inc(11458);break;
                }__CLR4_4_18om8omlh9yvgsb.R.inc(11459);if ((((eval == null)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11460)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11461)==0&false)))
                    {__CLR4_4_18om8omlh9yvgsb.R.inc(11462);els.add(sib);
                }else {__CLR4_4_18om8omlh9yvgsb.R.inc(11463);if ((((sib.is(eval))&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11464)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11465)==0&false)))
                    {__CLR4_4_18om8omlh9yvgsb.R.inc(11466);els.add(sib);
                }}__CLR4_4_18om8omlh9yvgsb.R.inc(11467);e = sib;
            } }while ((((all)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11468)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11469)==0&false)));
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11470);return els;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get all of the parents and ancestor elements of the matched elements.
     * @return all of the parents and ancestor elements of the matched elements
     */
    public Elements parents() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11471);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11472);HashSet<Element> combo = new LinkedHashSet<>();
        __CLR4_4_18om8omlh9yvgsb.R.inc(11473);for (Element e: this) {{
            __CLR4_4_18om8omlh9yvgsb.R.inc(11474);combo.addAll(e.parents());
        }
        }__CLR4_4_18om8omlh9yvgsb.R.inc(11475);return new Elements(combo);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    // list-like methods
    /**
     Get the first matched element.
     @return The first matched element, or <code>null</code> if contents is empty.
     */
    public Element first() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11476);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11477);return (((isEmpty() )&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11478)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11479)==0&false))? null : get(0);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     Get the last matched element.
     @return The last matched element, or <code>null</code> if contents is empty.
     */
    public Element last() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11480);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11481);return (((isEmpty() )&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11482)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11483)==0&false))? null : get(size() - 1);
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Perform a depth-first traversal on each of the selected elements.
     * @param nodeVisitor the visitor callbacks to perform on each node
     * @return this, for chaining
     */
    public Elements traverse(NodeVisitor nodeVisitor) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11484);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11485);NodeTraversor.traverse(nodeVisitor, this);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11486);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Perform a depth-first filtering on each of the selected elements.
     * @param nodeFilter the filter callbacks to perform on each node
     * @return this, for chaining
     */
    public Elements filter(NodeFilter nodeFilter) {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11487);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11488);NodeTraversor.filter(nodeFilter, this);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11489);return this;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

    /**
     * Get the {@link FormElement} forms from the selected elements, if any.
     * @return a list of {@link FormElement}s pulled from the matched elements. The list will be empty if the elements contain
     * no forms.
     */
    public List<FormElement> forms() {try{__CLR4_4_18om8omlh9yvgsb.R.inc(11490);
        __CLR4_4_18om8omlh9yvgsb.R.inc(11491);ArrayList<FormElement> forms = new ArrayList<>();
        __CLR4_4_18om8omlh9yvgsb.R.inc(11492);for (Element el: this)
            {__CLR4_4_18om8omlh9yvgsb.R.inc(11493);if ((((el instanceof FormElement)&&(__CLR4_4_18om8omlh9yvgsb.R.iget(11494)!=0|true))||(__CLR4_4_18om8omlh9yvgsb.R.iget(11495)==0&false)))
                {__CLR4_4_18om8omlh9yvgsb.R.inc(11496);forms.add((FormElement) el);
        }}__CLR4_4_18om8omlh9yvgsb.R.inc(11497);return forms;
    }finally{__CLR4_4_18om8omlh9yvgsb.R.flushNeeded();}}

}
