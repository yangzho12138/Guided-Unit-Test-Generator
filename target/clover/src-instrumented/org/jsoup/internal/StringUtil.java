/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.internal;

import org.jsoup.helper.Validate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/**
 * A minimal String utility class. Designed for internal jsoup use only.
 */
public final class StringUtil {public static class __CLR4_4_12id2idlh9yvggk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3402,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // memoised padding up to 21
    static final String[] padding = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ",
        "         ", "          ", "           ", "            ", "             ", "              ", "               ",
        "                ", "                 ", "                  ", "                   ", "                    "};

    /**
     * Join a collection of strings by a separator
     * @param strings collection of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(Collection strings, String sep) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3253);
        __CLR4_4_12id2idlh9yvggk.R.inc(3254);return join(strings.iterator(), sep);
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Join a collection of strings by a separator
     * @param strings iterator of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(Iterator strings, String sep) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3255);
        __CLR4_4_12id2idlh9yvggk.R.inc(3256);if ((((!strings.hasNext())&&(__CLR4_4_12id2idlh9yvggk.R.iget(3257)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3258)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3259);return "";

        }__CLR4_4_12id2idlh9yvggk.R.inc(3260);String start = strings.next().toString();
        __CLR4_4_12id2idlh9yvggk.R.inc(3261);if ((((!strings.hasNext())&&(__CLR4_4_12id2idlh9yvggk.R.iget(3262)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3263)==0&false))) // only one, avoid builder
            {__CLR4_4_12id2idlh9yvggk.R.inc(3264);return start;

        }__CLR4_4_12id2idlh9yvggk.R.inc(3265);StringBuilder sb = StringUtil.borrowBuilder().append(start);
        __CLR4_4_12id2idlh9yvggk.R.inc(3266);while ((((strings.hasNext())&&(__CLR4_4_12id2idlh9yvggk.R.iget(3267)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3268)==0&false))) {{
            __CLR4_4_12id2idlh9yvggk.R.inc(3269);sb.append(sep);
            __CLR4_4_12id2idlh9yvggk.R.inc(3270);sb.append(strings.next());
        }
        }__CLR4_4_12id2idlh9yvggk.R.inc(3271);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Join an array of strings by a separator
     * @param strings collection of string objects
     * @param sep string to place between strings
     * @return joined string
     */
    public static String join(String[] strings, String sep) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3272);
        __CLR4_4_12id2idlh9yvggk.R.inc(3273);return join(Arrays.asList(strings), sep);
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Returns space padding
     * @param width amount of padding desired
     * @return string of spaces * width
     */
    public static String padding(int width) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3274);
        __CLR4_4_12id2idlh9yvggk.R.inc(3275);if ((((width < 0)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3276)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3277)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3278);throw new IllegalArgumentException("width must be > 0");

        }__CLR4_4_12id2idlh9yvggk.R.inc(3279);if ((((width < padding.length)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3280)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3281)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3282);return padding[width];
        }__CLR4_4_12id2idlh9yvggk.R.inc(3283);char[] out = new char[width];
        __CLR4_4_12id2idlh9yvggk.R.inc(3284);for (int i = 0; (((i < width)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3285)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3286)==0&false)); i++)
            {__CLR4_4_12id2idlh9yvggk.R.inc(3287);out[i] = ' ';
        }__CLR4_4_12id2idlh9yvggk.R.inc(3288);return String.valueOf(out);
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Tests if a string is blank: null, empty, or only whitespace (" ", \r\n, \t, etc)
     * @param string string to test
     * @return if string is blank
     */
    public static boolean isBlank(String string) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3289);
        __CLR4_4_12id2idlh9yvggk.R.inc(3290);if ((((string == null || string.length() == 0)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3291)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3292)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3293);return true;

        }__CLR4_4_12id2idlh9yvggk.R.inc(3294);int l = string.length();
        __CLR4_4_12id2idlh9yvggk.R.inc(3295);for (int i = 0; (((i < l)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3296)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3297)==0&false)); i++) {{
            __CLR4_4_12id2idlh9yvggk.R.inc(3298);if ((((!StringUtil.isWhitespace(string.codePointAt(i)))&&(__CLR4_4_12id2idlh9yvggk.R.iget(3299)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3300)==0&false)))
                {__CLR4_4_12id2idlh9yvggk.R.inc(3301);return false;
        }}
        }__CLR4_4_12id2idlh9yvggk.R.inc(3302);return true;
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Tests if a string is numeric, i.e. contains only digit characters
     * @param string string to test
     * @return true if only digit chars, false if empty or null or contains non-digit chars
     */
    public static boolean isNumeric(String string) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3303);
        __CLR4_4_12id2idlh9yvggk.R.inc(3304);if ((((string == null || string.length() == 0)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3305)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3306)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3307);return false;

        }__CLR4_4_12id2idlh9yvggk.R.inc(3308);int l = string.length();
        __CLR4_4_12id2idlh9yvggk.R.inc(3309);for (int i = 0; (((i < l)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3310)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3311)==0&false)); i++) {{
            __CLR4_4_12id2idlh9yvggk.R.inc(3312);if ((((!Character.isDigit(string.codePointAt(i)))&&(__CLR4_4_12id2idlh9yvggk.R.iget(3313)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3314)==0&false)))
                {__CLR4_4_12id2idlh9yvggk.R.inc(3315);return false;
        }}
        }__CLR4_4_12id2idlh9yvggk.R.inc(3316);return true;
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Tests if a code point is "whitespace" as defined in the HTML spec. Used for output HTML.
     * @param c code point to test
     * @return true if code point is whitespace, false otherwise
     * @see #isActuallyWhitespace(int)
     */
    public static boolean isWhitespace(int c){try{__CLR4_4_12id2idlh9yvggk.R.inc(3317);
        __CLR4_4_12id2idlh9yvggk.R.inc(3318);return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Tests if a code point is "whitespace" as defined by what it looks like. Used for Element.text etc.
     * @param c code point to test
     * @return true if code point is whitespace, false otherwise
     */
    public static boolean isActuallyWhitespace(int c){try{__CLR4_4_12id2idlh9yvggk.R.inc(3319);
        __CLR4_4_12id2idlh9yvggk.R.inc(3320);return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == 160;
        // 160 is &nbsp; (non-breaking space). Not in the spec but expected.
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    public static boolean isInvisibleChar(int c) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3321);
        __CLR4_4_12id2idlh9yvggk.R.inc(3322);return Character.getType(c) == 16 && (c == 8203 || c == 8204 || c == 8205 || c == 173);
        // zero width sp, zw non join, zw join, soft hyphen
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Normalise the whitespace within this string; multiple spaces collapse to a single, and all whitespace characters
     * (e.g. newline, tab) convert to a simple space
     * @param string content to normalise
     * @return normalised string
     */
    public static String normaliseWhitespace(String string) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3323);
        __CLR4_4_12id2idlh9yvggk.R.inc(3324);StringBuilder sb = StringUtil.borrowBuilder();
        __CLR4_4_12id2idlh9yvggk.R.inc(3325);appendNormalisedWhitespace(sb, string, false);
        __CLR4_4_12id2idlh9yvggk.R.inc(3326);return StringUtil.releaseBuilder(sb);
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * After normalizing the whitespace within a string, appends it to a string builder.
     * @param accum builder to append to
     * @param string string to normalize whitespace within
     * @param stripLeading set to true if you wish to remove any leading whitespace
     */
    public static void appendNormalisedWhitespace(StringBuilder accum, String string, boolean stripLeading) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3327);
        __CLR4_4_12id2idlh9yvggk.R.inc(3328);boolean lastWasWhite = false;
        __CLR4_4_12id2idlh9yvggk.R.inc(3329);boolean reachedNonWhite = false;

        __CLR4_4_12id2idlh9yvggk.R.inc(3330);int len = string.length();
        __CLR4_4_12id2idlh9yvggk.R.inc(3331);int c;
        __CLR4_4_12id2idlh9yvggk.R.inc(3332);for (int i = 0; (((i < len)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3333)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3334)==0&false)); i+= Character.charCount(c)) {{
            __CLR4_4_12id2idlh9yvggk.R.inc(3335);c = string.codePointAt(i);
            __CLR4_4_12id2idlh9yvggk.R.inc(3336);if ((((isActuallyWhitespace(c))&&(__CLR4_4_12id2idlh9yvggk.R.iget(3337)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3338)==0&false))) {{
                __CLR4_4_12id2idlh9yvggk.R.inc(3339);if (((((stripLeading && !reachedNonWhite) || lastWasWhite)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3340)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3341)==0&false)))
                    {__CLR4_4_12id2idlh9yvggk.R.inc(3342);continue;
                }__CLR4_4_12id2idlh9yvggk.R.inc(3343);accum.append(' ');
                __CLR4_4_12id2idlh9yvggk.R.inc(3344);lastWasWhite = true;
            }
            }else {__CLR4_4_12id2idlh9yvggk.R.inc(3345);if ((((!isInvisibleChar(c))&&(__CLR4_4_12id2idlh9yvggk.R.iget(3346)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3347)==0&false))) {{
                __CLR4_4_12id2idlh9yvggk.R.inc(3348);accum.appendCodePoint(c);
                __CLR4_4_12id2idlh9yvggk.R.inc(3349);lastWasWhite = false;
                __CLR4_4_12id2idlh9yvggk.R.inc(3350);reachedNonWhite = true;
            }
        }}}
    }}finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    public static boolean in(final String needle, final String... haystack) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3351);
        __CLR4_4_12id2idlh9yvggk.R.inc(3352);final int len = haystack.length;
        __CLR4_4_12id2idlh9yvggk.R.inc(3353);for (int i = 0; (((i < len)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3354)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3355)==0&false)); i++) {{
            __CLR4_4_12id2idlh9yvggk.R.inc(3356);if ((((haystack[i].equals(needle))&&(__CLR4_4_12id2idlh9yvggk.R.iget(3357)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3358)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3359);return true;
        }}
        }__CLR4_4_12id2idlh9yvggk.R.inc(3360);return false;
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    public static boolean inSorted(String needle, String[] haystack) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3361);
        __CLR4_4_12id2idlh9yvggk.R.inc(3362);return Arrays.binarySearch(haystack, needle) >= 0;
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.
     * @param base the existing absolute base URL
     * @param relUrl the relative URL to resolve. (If it's already absolute, it will be returned)
     * @return the resolved absolute URL
     * @throws MalformedURLException if an error occurred generating the URL
     */
    public static URL resolve(URL base, String relUrl) throws MalformedURLException {try{__CLR4_4_12id2idlh9yvggk.R.inc(3363);
        // workaround: java resolves '//path/file + ?foo' to '//path/?foo', not '//path/file?foo' as desired
        __CLR4_4_12id2idlh9yvggk.R.inc(3364);if ((((relUrl.startsWith("?"))&&(__CLR4_4_12id2idlh9yvggk.R.iget(3365)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3366)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3367);relUrl = base.getPath() + relUrl;
        // workaround: //example.com + ./foo = //example.com/./foo, not //example.com/foo
        }__CLR4_4_12id2idlh9yvggk.R.inc(3368);if ((((relUrl.indexOf('.') == 0 && base.getFile().indexOf('/') != 0)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3369)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3370)==0&false))) {{
            __CLR4_4_12id2idlh9yvggk.R.inc(3371);base = new URL(base.getProtocol(), base.getHost(), base.getPort(), "/" + base.getFile());
        }
        }__CLR4_4_12id2idlh9yvggk.R.inc(3372);return new URL(base, relUrl);
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.
     * @param baseUrl the existing absolute base URL
     * @param relUrl the relative URL to resolve. (If it's already absolute, it will be returned)
     * @return an absolute URL if one was able to be generated, or the empty string if not
     */
    public static String resolve(final String baseUrl, final String relUrl) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3373);
        __CLR4_4_12id2idlh9yvggk.R.inc(3374);URL base;
        __CLR4_4_12id2idlh9yvggk.R.inc(3375);try {
            __CLR4_4_12id2idlh9yvggk.R.inc(3376);try {
                __CLR4_4_12id2idlh9yvggk.R.inc(3377);base = new URL(baseUrl);
            } catch (MalformedURLException e) {
                // the base is unsuitable, but the attribute/rel may be abs on its own, so try that
                __CLR4_4_12id2idlh9yvggk.R.inc(3378);URL abs = new URL(relUrl);
                __CLR4_4_12id2idlh9yvggk.R.inc(3379);return abs.toExternalForm();
            }
            __CLR4_4_12id2idlh9yvggk.R.inc(3380);return resolve(base, relUrl).toExternalForm();
        } catch (MalformedURLException e) {
            __CLR4_4_12id2idlh9yvggk.R.inc(3381);return "";
        }
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    private static final Stack<StringBuilder> builders = new Stack<>();

    /**
     * Maintains cached StringBuilders in a flyweight pattern, to minimize new StringBuilder GCs. The StringBuilder is
     * prevented from growing too large.
     * <p>
     * Care must be taken to release the builder once its work has been completed, with {@link #releaseBuilder}
     * @return an empty StringBuilder
     * @
     */
    public static StringBuilder borrowBuilder() {try{__CLR4_4_12id2idlh9yvggk.R.inc(3382);
        __CLR4_4_12id2idlh9yvggk.R.inc(3383);synchronized (builders) {
            __CLR4_4_12id2idlh9yvggk.R.inc(3384);return (((builders.empty() )&&(__CLR4_4_12id2idlh9yvggk.R.iget(3385)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3386)==0&false))?
                new StringBuilder(MaxCachedBuilderSize) :
                builders.pop();
        }
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    /**
     * Release a borrowed builder. Care must be taken not to use the builder after it has been returned, as its
     * contents may be changed by this method, or by a concurrent thread.
     * @param sb the StringBuilder to release.
     * @return the string value of the released String Builder (as an incentive to release it!).
     */
    public static String releaseBuilder(StringBuilder sb) {try{__CLR4_4_12id2idlh9yvggk.R.inc(3387);
        __CLR4_4_12id2idlh9yvggk.R.inc(3388);Validate.notNull(sb);
        __CLR4_4_12id2idlh9yvggk.R.inc(3389);String string = sb.toString();

        __CLR4_4_12id2idlh9yvggk.R.inc(3390);if ((((sb.length() > MaxCachedBuilderSize)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3391)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3392)==0&false)))
            {__CLR4_4_12id2idlh9yvggk.R.inc(3393);sb = new StringBuilder(MaxCachedBuilderSize); // make sure it hasn't grown too big
        }else
            {__CLR4_4_12id2idlh9yvggk.R.inc(3394);sb.delete(0, sb.length()); // make sure it's emptied on release

        }__CLR4_4_12id2idlh9yvggk.R.inc(3395);synchronized (builders) {
            __CLR4_4_12id2idlh9yvggk.R.inc(3396);builders.push(sb);

            __CLR4_4_12id2idlh9yvggk.R.inc(3397);while ((((builders.size() > MaxIdleBuilders)&&(__CLR4_4_12id2idlh9yvggk.R.iget(3398)!=0|true))||(__CLR4_4_12id2idlh9yvggk.R.iget(3399)==0&false))) {{
                __CLR4_4_12id2idlh9yvggk.R.inc(3400);builders.pop();
            }
        }}
        __CLR4_4_12id2idlh9yvggk.R.inc(3401);return string;
    }finally{__CLR4_4_12id2idlh9yvggk.R.flushNeeded();}}

    private static final int MaxCachedBuilderSize = 8 * 1024;
    private static final int MaxIdleBuilders = 8;
}
