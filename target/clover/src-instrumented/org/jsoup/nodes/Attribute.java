/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 A single key + value attribute. (Only used for presentation.)
 */
public class Attribute implements Map.Entry<String, String>, Cloneable  {public static class __CLR4_4_12mi2milh9yvgh6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String[] booleanAttributes = {
            "allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled",
            "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize",
            "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected",
            "sortable", "truespeed", "typemustmatch"
    };

    private String key;
    private String val;
    Attributes parent; // used to update the holding Attributes when the key / value is changed via this interface

    /**
     * Create a new attribute from unencoded (raw) key and value.
     * @param key attribute key; case is preserved.
     * @param value attribute value
     * @see #createFromEncoded
     */
    public Attribute(String key, String value) {
        this(key, value, null);__CLR4_4_12mi2milh9yvgh6.R.inc(3403);try{__CLR4_4_12mi2milh9yvgh6.R.inc(3402);
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     * Create a new attribute from unencoded (raw) key and value.
     * @param key attribute key; case is preserved.
     * @param val attribute value
     * @param parent the containing Attributes (this Attribute is not automatically added to said Attributes)
     * @see #createFromEncoded*/
    public Attribute(String key, String val, Attributes parent) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3404);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3405);Validate.notNull(key);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3406);key = key.trim();
        __CLR4_4_12mi2milh9yvgh6.R.inc(3407);Validate.notEmpty(key); // trimming could potentially make empty, so validate here
        __CLR4_4_12mi2milh9yvgh6.R.inc(3408);this.key = key;
        __CLR4_4_12mi2milh9yvgh6.R.inc(3409);this.val = val;
        __CLR4_4_12mi2milh9yvgh6.R.inc(3410);this.parent = parent;
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     Get the attribute key.
     @return the attribute key
     */
    public String getKey() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3411);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3412);return key;
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     Set the attribute key; case is preserved.
     @param key the new key; must not be null
     */
    public void setKey(String key) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3413);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3414);Validate.notNull(key);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3415);key = key.trim();
        __CLR4_4_12mi2milh9yvgh6.R.inc(3416);Validate.notEmpty(key); // trimming could potentially make empty, so validate here
        __CLR4_4_12mi2milh9yvgh6.R.inc(3417);if ((((parent != null)&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3418)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3419)==0&false))) {{
            __CLR4_4_12mi2milh9yvgh6.R.inc(3420);int i = parent.indexOfKey(this.key);
            __CLR4_4_12mi2milh9yvgh6.R.inc(3421);if ((((i != Attributes.NotFound)&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3422)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3423)==0&false)))
                {__CLR4_4_12mi2milh9yvgh6.R.inc(3424);parent.keys[i] = key;
        }}
        }__CLR4_4_12mi2milh9yvgh6.R.inc(3425);this.key = key;
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     Get the attribute value.
     @return the attribute value
     */
    public String getValue() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3426);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3427);return Attributes.checkNotNull(val);
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     Set the attribute value.
     @param val the new attribute value; must not be null
     */
    public String setValue(String val) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3428);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3429);String oldVal = this.val;
        __CLR4_4_12mi2milh9yvgh6.R.inc(3430);if ((((parent != null)&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3431)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3432)==0&false))) {{
            __CLR4_4_12mi2milh9yvgh6.R.inc(3433);oldVal = parent.get(this.key); // trust the container more
            __CLR4_4_12mi2milh9yvgh6.R.inc(3434);int i = parent.indexOfKey(this.key);
            __CLR4_4_12mi2milh9yvgh6.R.inc(3435);if ((((i != Attributes.NotFound)&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3436)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3437)==0&false)))
                {__CLR4_4_12mi2milh9yvgh6.R.inc(3438);parent.vals[i] = val;
        }}
        }__CLR4_4_12mi2milh9yvgh6.R.inc(3439);this.val = val;
        __CLR4_4_12mi2milh9yvgh6.R.inc(3440);return Attributes.checkNotNull(oldVal);
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     Get the HTML representation of this attribute; e.g. {@code href="index.html"}.
     @return HTML
     */
    public String html() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3441);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3442);StringBuilder sb = StringUtil.borrowBuilder();
        
        __CLR4_4_12mi2milh9yvgh6.R.inc(3443);try {
        	__CLR4_4_12mi2milh9yvgh6.R.inc(3444);html(sb, (new Document("")).outputSettings());
        } catch(IOException exception) {
        	__CLR4_4_12mi2milh9yvgh6.R.inc(3445);throw new SerializationException(exception);
        }
        __CLR4_4_12mi2milh9yvgh6.R.inc(3446);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    protected static void html(String key, String val, Appendable accum, Document.OutputSettings out) throws IOException {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3447);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3448);accum.append(key);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3449);if ((((!shouldCollapseAttribute(key, val, out))&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3450)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3451)==0&false))) {{
            __CLR4_4_12mi2milh9yvgh6.R.inc(3452);accum.append("=\"");
            __CLR4_4_12mi2milh9yvgh6.R.inc(3453);Entities.escape(accum, Attributes.checkNotNull(val) , out, true, false, false);
            __CLR4_4_12mi2milh9yvgh6.R.inc(3454);accum.append('"');
        }
    }}finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}
    
    protected void html(Appendable accum, Document.OutputSettings out) throws IOException {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3455);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3456);html(key, val, accum, out);
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     Get the string representation of this attribute, implemented as {@link #html()}.
     @return string
     */
    @Override
    public String toString() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3457);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3458);return html();
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     * Create a new Attribute from an unencoded key and a HTML attribute encoded value.
     * @param unencodedKey assumes the key is not encoded, as can be only run of simple \w chars.
     * @param encodedValue HTML attribute encoded value
     * @return attribute
     */
    public static Attribute createFromEncoded(String unencodedKey, String encodedValue) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3459);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3460);String value = Entities.unescape(encodedValue, true);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3461);return new Attribute(unencodedKey, value, null); // parent will get set when Put
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    protected boolean isDataAttribute() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3462);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3463);return isDataAttribute(key);
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    protected static boolean isDataAttribute(String key) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3464);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3465);return key.startsWith(Attributes.dataPrefix) && key.length() > Attributes.dataPrefix.length();
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     * Collapsible if it's a boolean attribute and value is empty or same as name
     * 
     * @param out output settings
     * @return  Returns whether collapsible or not
     */
    protected final boolean shouldCollapseAttribute(Document.OutputSettings out) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3466);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3467);return shouldCollapseAttribute(key, val, out);
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    protected static boolean shouldCollapseAttribute(final String key, final String val, final Document.OutputSettings out) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3468);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3469);return (
            out.syntax() == Document.OutputSettings.Syntax.html &&
                (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key)));
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     * @deprecated
     */
    protected boolean isBooleanAttribute() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3470);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3471);return Arrays.binarySearch(booleanAttributes, key) >= 0 || val == null;
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    /**
     * Checks if this attribute name is defined as a boolean attribute in HTML5
     */
    protected static boolean isBooleanAttribute(final String key) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3472);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3473);return Arrays.binarySearch(booleanAttributes, key) >= 0;
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    @Override
    public boolean equals(Object o) {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3474); // note parent not considered
        __CLR4_4_12mi2milh9yvgh6.R.inc(3475);if ((((this == o)&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3476)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3477)==0&false))) {__CLR4_4_12mi2milh9yvgh6.R.inc(3478);return true;
        }__CLR4_4_12mi2milh9yvgh6.R.inc(3479);if ((((o == null || getClass() != o.getClass())&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3480)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3481)==0&false))) {__CLR4_4_12mi2milh9yvgh6.R.inc(3482);return false;
        }__CLR4_4_12mi2milh9yvgh6.R.inc(3483);Attribute attribute = (Attribute) o;
        __CLR4_4_12mi2milh9yvgh6.R.inc(3484);if (((((((key != null )&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3485)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3486)==0&false))? !key.equals(attribute.key) : attribute.key != null)&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3487)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3488)==0&false))) {__CLR4_4_12mi2milh9yvgh6.R.inc(3489);return false;
        }__CLR4_4_12mi2milh9yvgh6.R.inc(3490);return (((val != null )&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3491)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3492)==0&false))? val.equals(attribute.val) : attribute.val == null;
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3493); // note parent not considered
        __CLR4_4_12mi2milh9yvgh6.R.inc(3494);int result = (((key != null )&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3495)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3496)==0&false))? key.hashCode() : 0;
        __CLR4_4_12mi2milh9yvgh6.R.inc(3497);result = 31 * result + ((((val != null )&&(__CLR4_4_12mi2milh9yvgh6.R.iget(3498)!=0|true))||(__CLR4_4_12mi2milh9yvgh6.R.iget(3499)==0&false))? val.hashCode() : 0);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3500);return result;
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}

    @Override
    public Attribute clone() {try{__CLR4_4_12mi2milh9yvgh6.R.inc(3501);
        __CLR4_4_12mi2milh9yvgh6.R.inc(3502);try {
            __CLR4_4_12mi2milh9yvgh6.R.inc(3503);return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_4_12mi2milh9yvgh6.R.inc(3504);throw new RuntimeException(e);
        }
    }finally{__CLR4_4_12mi2milh9yvgh6.R.flushNeeded();}}
}
