/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * The attributes of an Element.
 * <p>
 * Attributes are treated as a map: there can be only one value associated with an attribute key/name.
 * </p>
 * <p>
 * Attribute name and value comparisons are  generally <b>case sensitive</b>. By default for HTML, attribute names are
 * normalized to lower-case on parsing. That means you should use lower-case strings when referring to attributes by
 * name.
 * </p>
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class Attributes implements Iterable<Attribute>, Cloneable {public static class __CLR4_4_12pd2pdlh9yvghm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3780,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected static final String dataPrefix = "data-";
    private static final int InitialCapacity = 4; // todo - analyze Alexa 1MM sites, determine best setting

    // manages the key/val arrays
    private static final int GrowthFactor = 2;
    private static final String[] Empty = {};
    static final int NotFound = -1;
    private static final String EmptyString = "";

    private int size = 0; // number of slots used (not capacity, which is keys.length
    String[] keys = Empty;
    String[] vals = Empty;

    // check there's room for more
    private void checkCapacity(int minNewSize) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3505);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3506);Validate.isTrue(minNewSize >= size);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3507);int curSize = keys.length;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3508);if ((((curSize >= minNewSize)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3509)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3510)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3511);return;

        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3512);int newSize = (((curSize >= InitialCapacity )&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3513)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3514)==0&false))? size * GrowthFactor : InitialCapacity;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3515);if ((((minNewSize > newSize)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3516)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3517)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3518);newSize = minNewSize;

        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3519);keys = copyOf(keys, newSize);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3520);vals = copyOf(vals, newSize);
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    // simple implementation of Arrays.copy, for support of Android API 8.
    private static String[] copyOf(String[] orig, int size) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3521);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3522);final String[] copy = new String[size];
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3523);System.arraycopy(orig, 0, copy, 0,
                Math.min(orig.length, size));
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3524);return copy;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    int indexOfKey(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3525);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3526);Validate.notNull(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3527);for (int i = 0; (((i < size)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3528)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3529)==0&false)); i++) {{
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3530);if ((((key.equals(keys[i]))&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3531)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3532)==0&false)))
                {__CLR4_4_12pd2pdlh9yvghm.R.inc(3533);return i;
        }}
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3534);return NotFound;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    private int indexOfKeyIgnoreCase(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3535);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3536);Validate.notNull(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3537);for (int i = 0; (((i < size)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3538)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3539)==0&false)); i++) {{
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3540);if ((((key.equalsIgnoreCase(keys[i]))&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3541)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3542)==0&false)))
                {__CLR4_4_12pd2pdlh9yvghm.R.inc(3543);return i;
        }}
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3544);return NotFound;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    // we track boolean attributes as null in values - they're just keys. so returns empty for consumers
    static String checkNotNull(String val) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3545);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3546);return (((val == null )&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3547)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3548)==0&false))? EmptyString : val;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Get an attribute value by key.
     @param key the (case-sensitive) attribute key
     @return the attribute value if set; or empty string if not set (or a boolean attribute).
     @see #hasKey(String)
     */
    public String get(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3549);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3550);int i = indexOfKey(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3551);return (((i == NotFound )&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3552)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3553)==0&false))? EmptyString : checkNotNull(vals[i]);
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Get an attribute's value by case-insensitive key
     * @param key the attribute name
     * @return the first matching attribute value if set; or empty string if not set (ora boolean attribute).
     */
    public String getIgnoreCase(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3554);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3555);int i = indexOfKeyIgnoreCase(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3556);return (((i == NotFound )&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3557)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3558)==0&false))? EmptyString : checkNotNull(vals[i]);
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Adds a new attribute. Will produce duplicates if the key already exists.
     * @see Attributes#put(String, String)
     */
    public Attributes add(String key, String value) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3559);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3560);checkCapacity(size + 1);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3561);keys[size] = key;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3562);vals[size] = value;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3563);size++;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3564);return this;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Set a new attribute, or replace an existing one by key.
     * @param key case sensitive attribute key
     * @param value attribute value
     * @return these attributes, for chaining
     */
    public Attributes put(String key, String value) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3565);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3566);int i = indexOfKey(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3567);if ((((i != NotFound)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3568)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3569)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3570);vals[i] = value;
        }else
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3571);add(key, value);
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3572);return this;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    void putIgnoreCase(String key, String value) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3573);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3574);int i = indexOfKeyIgnoreCase(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3575);if ((((i != NotFound)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3576)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3577)==0&false))) {{
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3578);vals[i] = value;
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3579);if ((((!keys[i].equals(key))&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3580)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3581)==0&false))) // case changed, update
                {__CLR4_4_12pd2pdlh9yvghm.R.inc(3582);keys[i] = key;
        }}
        }else
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3583);add(key, value);
    }}finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Set a new boolean attribute, remove attribute if value is false.
     * @param key case <b>insensitive</b> attribute key
     * @param value attribute value
     * @return these attributes, for chaining
     */
    public Attributes put(String key, boolean value) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3584);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3585);if ((((value)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3586)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3587)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3588);putIgnoreCase(key, null);
        }else
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3589);remove(key);
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3590);return this;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Set a new attribute, or replace an existing one by key.
     @param attribute attribute with case sensitive key
     @return these attributes, for chaining
     */
    public Attributes put(Attribute attribute) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3591);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3592);Validate.notNull(attribute);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3593);put(attribute.getKey(), attribute.getValue());
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3594);attribute.parent = this;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3595);return this;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    // removes and shifts up
    private void remove(int index) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3596);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3597);Validate.isFalse(index >= size);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3598);int shifted = size - index - 1;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3599);if ((((shifted > 0)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3600)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3601)==0&false))) {{
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3602);System.arraycopy(keys, index + 1, keys, index, shifted);
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3603);System.arraycopy(vals, index + 1, vals, index, shifted);
        }
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3604);size--;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3605);keys[size] = null; // release hold
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3606);vals[size] = null;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Remove an attribute by key. <b>Case sensitive.</b>
     @param key attribute key to remove
     */
    public void remove(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3607);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3608);int i = indexOfKey(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3609);if ((((i != NotFound)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3610)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3611)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3612);remove(i);
    }}finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Remove an attribute by key. <b>Case insensitive.</b>
     @param key attribute key to remove
     */
    public void removeIgnoreCase(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3613);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3614);int i = indexOfKeyIgnoreCase(key);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3615);if ((((i != NotFound)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3616)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3617)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3618);remove(i);
    }}finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Tests if these attributes contain an attribute with this key.
     @param key case-sensitive key to check for
     @return true if key exists, false otherwise
     */
    public boolean hasKey(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3619);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3620);return indexOfKey(key) != NotFound;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Tests if these attributes contain an attribute with this key.
     @param key key to check for
     @return true if key exists, false otherwise
     */
    public boolean hasKeyIgnoreCase(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3621);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3622);return indexOfKeyIgnoreCase(key) != NotFound;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Get the number of attributes in this set.
     @return size
     */
    public int size() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3623);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3624);return size;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Test if this Attributes list is empty (size==0).
     */
    public boolean isEmpty() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3625);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3626);return size == 0;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Add all the attributes from the incoming set to this set.
     @param incoming attributes to add to these attributes.
     */
    public void addAll(Attributes incoming) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3627);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3628);if ((((incoming.size() == 0)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3629)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3630)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3631);return;
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3632);checkCapacity(size + incoming.size);

        __CLR4_4_12pd2pdlh9yvghm.R.inc(3633);for (Attribute attr : incoming) {{
            // todo - should this be case insensitive?
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3634);put(attr);
        }

    }}finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    public Iterator<Attribute> iterator() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3635);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3636);return new Iterator<Attribute>() {
            int i = 0;

            @Override
            public boolean hasNext() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3637);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3638);return i < size;
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

            @Override
            public Attribute next() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3639);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3640);final Attribute attr = new Attribute(keys[i], vals[i], Attributes.this);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3641);i++;
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3642);return attr;
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

            @Override
            public void remove() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3643);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3644);Attributes.this.remove(--i); // next() advanced, so rewind
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}
        };
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Get the attributes as a List, for iteration.
     @return an view of the attributes as an unmodifialbe List.
     */
    public List<Attribute> asList() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3645);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3646);ArrayList<Attribute> list = new ArrayList<>(size);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3647);for (int i = 0; (((i < size)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3648)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3649)==0&false)); i++) {{
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3650);Attribute attr = (((vals[i] == null )&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3651)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3652)==0&false))?
                new BooleanAttribute(keys[i]) : // deprecated class, but maybe someone still wants it
                new Attribute(keys[i], vals[i], Attributes.this);
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3653);list.add(attr);
        }
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3654);return Collections.unmodifiableList(list);
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Retrieves a filtered view of attributes that are HTML5 custom data attributes; that is, attributes with keys
     * starting with {@code data-}.
     * @return map of custom data attributes.
     */
    public Map<String, String> dataset() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3655);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3656);return new Dataset(this);
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     Get the HTML representation of these attributes.
     @return HTML
     @throws SerializationException if the HTML representation of the attributes cannot be constructed.
     */
    public String html() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3657);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3658);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3659);try {
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3660);html(sb, (new Document("")).outputSettings()); // output settings a bit funky, but this html() seldom used
        } catch (IOException e) { // ought never happen
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3661);throw new SerializationException(e);
        }
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3662);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    final void html(final Appendable accum, final Document.OutputSettings out) throws IOException {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3663);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3664);final int sz = size;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3665);for (int i = 0; (((i < sz)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3666)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3667)==0&false)); i++) {{
            // inlined from Attribute.html()
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3668);final String key = keys[i];
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3669);final String val = vals[i];
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3670);accum.append(' ').append(key);

            // collapse checked=null, checked="", checked=checked; write out others
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3671);if ((((!Attribute.shouldCollapseAttribute(key, val, out))&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3672)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3673)==0&false))) {{
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3674);accum.append("=\"");
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3675);Entities.escape(accum, (((val == null )&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3676)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3677)==0&false))? EmptyString : val, out, true, false, false);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3678);accum.append('"');
            }
        }}
    }}finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3679);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3680);return html();
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Checks if these attributes are equal to another set of attributes, by comparing the two sets
     * @param o attributes to compare with
     * @return if both sets of attributes have the same content
     */
    @Override
    public boolean equals(Object o) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3681);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3682);if ((((this == o)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3683)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3684)==0&false))) {__CLR4_4_12pd2pdlh9yvghm.R.inc(3685);return true;
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3686);if ((((o == null || getClass() != o.getClass())&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3687)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3688)==0&false))) {__CLR4_4_12pd2pdlh9yvghm.R.inc(3689);return false;

        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3690);Attributes that = (Attributes) o;

        __CLR4_4_12pd2pdlh9yvghm.R.inc(3691);if ((((size != that.size)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3692)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3693)==0&false))) {__CLR4_4_12pd2pdlh9yvghm.R.inc(3694);return false;
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3695);if ((((!Arrays.equals(keys, that.keys))&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3696)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3697)==0&false))) {__CLR4_4_12pd2pdlh9yvghm.R.inc(3698);return false;
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3699);return Arrays.equals(vals, that.vals);
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Calculates the hashcode of these attributes, by iterating all attributes and summing their hashcodes.
     * @return calculated hashcode
     */
    @Override
    public int hashCode() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3700);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3701);int result = size;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3702);result = 31 * result + Arrays.hashCode(keys);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3703);result = 31 * result + Arrays.hashCode(vals);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3704);return result;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    @Override
    public Attributes clone() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3705);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3706);Attributes clone;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3707);try {
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3708);clone = (Attributes) super.clone();
        } catch (CloneNotSupportedException e) {
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3709);throw new RuntimeException(e);
        }
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3710);clone.size = size;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3711);keys = copyOf(keys, size);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3712);vals = copyOf(vals, size);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3713);return clone;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Internal method. Lowercases all keys.
     */
    public void normalize() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3714);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3715);for (int i = 0; (((i < size)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3716)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3717)==0&false)); i++) {{
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3718);keys[i] = lowerCase(keys[i]);
        }
    }}finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    /**
     * Internal method. Removes duplicate attribute by name. Settings for case sensitivity of key names.
     * @param settings case sensitivity
     * @return number of removed dupes
     */
    public int deduplicate(ParseSettings settings) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3719);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3720);if ((((isEmpty())&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3721)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3722)==0&false)))
            {__CLR4_4_12pd2pdlh9yvghm.R.inc(3723);return 0;
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3724);boolean preserve = settings.preserveAttributeCase();
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3725);int dupes = 0;
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3726);OUTER: for (int i = 0; (((i < keys.length)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3727)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3728)==0&false)); i++) {{
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3729);for (int j = i + 1; (((j < keys.length)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3730)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3731)==0&false)); j++) {{
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3732);if ((((keys[j] == null)&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3733)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3734)==0&false)))
                    {__CLR4_4_12pd2pdlh9yvghm.R.inc(3735);continue OUTER; // keys.length doesn't shrink when removing, so re-test
                }__CLR4_4_12pd2pdlh9yvghm.R.inc(3736);if (((((preserve && keys[i].equals(keys[j])) || (!preserve && keys[i].equalsIgnoreCase(keys[j])))&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3737)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3738)==0&false))) {{
                    __CLR4_4_12pd2pdlh9yvghm.R.inc(3739);dupes++;
                    __CLR4_4_12pd2pdlh9yvghm.R.inc(3740);remove(j);
                    __CLR4_4_12pd2pdlh9yvghm.R.inc(3741);j--;
                }
            }}
        }}
        }__CLR4_4_12pd2pdlh9yvghm.R.inc(3742);return dupes;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

    private static class Dataset extends AbstractMap<String, String> {
        private final Attributes attributes;

        private Dataset(Attributes attributes) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3743);
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3744);this.attributes = attributes;
        }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

        @Override
        public Set<Entry<String, String>> entrySet() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3745);
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3746);return new EntrySet();
        }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

        @Override
        public String put(String key, String value) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3747);
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3748);String dataKey = dataKey(key);
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3749);String oldValue = (((attributes.hasKey(dataKey) )&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3750)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3751)==0&false))? attributes.get(dataKey) : null;
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3752);attributes.put(dataKey, value);
            __CLR4_4_12pd2pdlh9yvghm.R.inc(3753);return oldValue;
        }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

        private class EntrySet extends AbstractSet<Map.Entry<String, String>> {

            @Override
            public Iterator<Map.Entry<String, String>> iterator() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3754);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3755);return new DatasetIterator();
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

            @Override
            public int size() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3756);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3757);int count = 0;
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3758);Iterator iter = new DatasetIterator();
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3759);while ((((iter.hasNext())&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3760)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3761)==0&false)))
                    {__CLR4_4_12pd2pdlh9yvghm.R.inc(3762);count++;
                }__CLR4_4_12pd2pdlh9yvghm.R.inc(3763);return count;
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}
        }

        private class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Iterator<Attribute> attrIter = attributes.iterator();
            private Attribute attr;
            public boolean hasNext() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3764);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3765);while ((((attrIter.hasNext())&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3766)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3767)==0&false))) {{
                    __CLR4_4_12pd2pdlh9yvghm.R.inc(3768);attr = attrIter.next();
                    __CLR4_4_12pd2pdlh9yvghm.R.inc(3769);if ((((attr.isDataAttribute())&&(__CLR4_4_12pd2pdlh9yvghm.R.iget(3770)!=0|true))||(__CLR4_4_12pd2pdlh9yvghm.R.iget(3771)==0&false))) {__CLR4_4_12pd2pdlh9yvghm.R.inc(3772);return true;
                }}
                }__CLR4_4_12pd2pdlh9yvghm.R.inc(3773);return false;
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

            public Entry<String, String> next() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3774);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3775);return new Attribute(attr.getKey().substring(dataPrefix.length()), attr.getValue());
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}

            public void remove() {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3776);
                __CLR4_4_12pd2pdlh9yvghm.R.inc(3777);attributes.remove(attr.getKey());
            }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}
        }
    }

    private static String dataKey(String key) {try{__CLR4_4_12pd2pdlh9yvghm.R.inc(3778);
        __CLR4_4_12pd2pdlh9yvghm.R.inc(3779);return dataPrefix + key;
    }finally{__CLR4_4_12pd2pdlh9yvghm.R.flushNeeded();}}
}
