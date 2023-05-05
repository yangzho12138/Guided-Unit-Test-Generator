/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

import static org.jsoup.nodes.Entities.EscapeMode.base;
import static org.jsoup.nodes.Entities.EscapeMode.extended;

/**
 * HTML entities, and escape routines. Source: <a href="http://www.w3.org/TR/html5/named-character-references.html#named-character-references">W3C
 * HTML named character references</a>.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Entities {public static class __CLR4_4_13po3polh9yvgl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,5015,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int empty = -1;
    private static final String emptyName = "";
    static final int codepointRadix = 36;
    private static final char[] codeDelims = {',', ';'};
    private static final HashMap<String, String> multipoints = new HashMap<>(); // name -> multiple character references
    private static final Document.OutputSettings DefaultOutput = new Document.OutputSettings();

    public enum EscapeMode {
        /**
         * Restricted entities suitable for XHTML output: lt, gt, amp, and quot only.
         */
        xhtml(EntitiesData.xmlPoints, 4),
        /**
         * Default HTML output entities.
         */
        base(EntitiesData.basePoints, 106),
        /**
         * Complete HTML entities.
         */
        extended(EntitiesData.fullPoints, 2125);

        // table of named references to their codepoints. sorted so we can binary search. built by BuildEntities.
        private String[] nameKeys;
        private int[] codeVals; // limitation is the few references with multiple characters; those go into multipoints.

        // table of codepoints to named entities.
        private int[] codeKeys; // we don' support multicodepoints to single named value currently
        private String[] nameVals;

        EscapeMode(String file, int size) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4812);
            __CLR4_4_13po3polh9yvgl2.R.inc(4813);load(this, file, size);
        }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

        int codepointForName(final String name) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4814);
            __CLR4_4_13po3polh9yvgl2.R.inc(4815);int index = Arrays.binarySearch(nameKeys, name);
            __CLR4_4_13po3polh9yvgl2.R.inc(4816);return (((index >= 0 )&&(__CLR4_4_13po3polh9yvgl2.R.iget(4817)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4818)==0&false))? codeVals[index] : empty;
        }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

        String nameForCodepoint(final int codepoint) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4819);
            __CLR4_4_13po3polh9yvgl2.R.inc(4820);final int index = Arrays.binarySearch(codeKeys, codepoint);
            __CLR4_4_13po3polh9yvgl2.R.inc(4821);if ((((index >= 0)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4822)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4823)==0&false))) {{
                // the results are ordered so lower case versions of same codepoint come after uppercase, and we prefer to emit lower
                // (and binary search for same item with multi results is undefined
                __CLR4_4_13po3polh9yvgl2.R.inc(4824);return ((((index < nameVals.length - 1 && codeKeys[index + 1] == codepoint) )&&(__CLR4_4_13po3polh9yvgl2.R.iget(4825)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4826)==0&false))?
                    nameVals[index + 1] : nameVals[index];
            }
            }__CLR4_4_13po3polh9yvgl2.R.inc(4827);return emptyName;
        }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

        private int size() {try{__CLR4_4_13po3polh9yvgl2.R.inc(4828);
            __CLR4_4_13po3polh9yvgl2.R.inc(4829);return nameKeys.length;
        }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}
    }

    public Entities() {try{__CLR4_4_13po3polh9yvgl2.R.inc(4830);
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * Check if the input is a known named entity
     *
     * @param name the possible entity name (e.g. "lt" or "amp")
     * @return true if a known named entity
     */
    public static boolean isNamedEntity(final String name) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4831);
        __CLR4_4_13po3polh9yvgl2.R.inc(4832);return extended.codepointForName(name) != empty;
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * Check if the input is a known named entity in the base entity set.
     *
     * @param name the possible entity name (e.g. "lt" or "amp")
     * @return true if a known named entity in the base set
     * @see #isNamedEntity(String)
     */
    public static boolean isBaseNamedEntity(final String name) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4833);
        __CLR4_4_13po3polh9yvgl2.R.inc(4834);return base.codepointForName(name) != empty;
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * Get the Character value of the named entity
     *
     * @param name named entity (e.g. "lt" or "amp")
     * @return the Character value of the named entity (e.g. '{@literal <}' or '{@literal &}')
     * @deprecated does not support characters outside the BMP or multiple character names
     */
    public static Character getCharacterByName(String name) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4835);
        __CLR4_4_13po3polh9yvgl2.R.inc(4836);return (char) extended.codepointForName(name);
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * Get the character(s) represented by the named entity
     *
     * @param name entity (e.g. "lt" or "amp")
     * @return the string value of the character(s) represented by this entity, or "" if not defined
     */
    public static String getByName(String name) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4837);
        __CLR4_4_13po3polh9yvgl2.R.inc(4838);String val = multipoints.get(name);
        __CLR4_4_13po3polh9yvgl2.R.inc(4839);if ((((val != null)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4840)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4841)==0&false)))
            {__CLR4_4_13po3polh9yvgl2.R.inc(4842);return val;
        }__CLR4_4_13po3polh9yvgl2.R.inc(4843);int codepoint = extended.codepointForName(name);
        __CLR4_4_13po3polh9yvgl2.R.inc(4844);if ((((codepoint != empty)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4845)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4846)==0&false)))
            {__CLR4_4_13po3polh9yvgl2.R.inc(4847);return new String(new int[]{codepoint}, 0, 1);
        }__CLR4_4_13po3polh9yvgl2.R.inc(4848);return emptyName;
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    public static int codepointsForName(final String name, final int[] codepoints) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4849);
        __CLR4_4_13po3polh9yvgl2.R.inc(4850);String val = multipoints.get(name);
        __CLR4_4_13po3polh9yvgl2.R.inc(4851);if ((((val != null)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4852)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4853)==0&false))) {{
            __CLR4_4_13po3polh9yvgl2.R.inc(4854);codepoints[0] = val.codePointAt(0);
            __CLR4_4_13po3polh9yvgl2.R.inc(4855);codepoints[1] = val.codePointAt(1);
            __CLR4_4_13po3polh9yvgl2.R.inc(4856);return 2;
        }
        }__CLR4_4_13po3polh9yvgl2.R.inc(4857);int codepoint = extended.codepointForName(name);
        __CLR4_4_13po3polh9yvgl2.R.inc(4858);if ((((codepoint != empty)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4859)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4860)==0&false))) {{
            __CLR4_4_13po3polh9yvgl2.R.inc(4861);codepoints[0] = codepoint;
            __CLR4_4_13po3polh9yvgl2.R.inc(4862);return 1;
        }
        }__CLR4_4_13po3polh9yvgl2.R.inc(4863);return 0;
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * HTML escape an input string. That is, {@code <} is returned as {@code &lt;}
     *
     * @param string the un-escaped string to escape
     * @param out the output settings to use
     * @return the escaped string
     */
    public static String escape(String string, Document.OutputSettings out) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4864);
        __CLR4_4_13po3polh9yvgl2.R.inc(4865);if ((((string == null)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4866)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4867)==0&false)))
            {__CLR4_4_13po3polh9yvgl2.R.inc(4868);return "";
        }__CLR4_4_13po3polh9yvgl2.R.inc(4869);StringBuilder accum = StringUtil.borrowBuilder();
        __CLR4_4_13po3polh9yvgl2.R.inc(4870);try {
            __CLR4_4_13po3polh9yvgl2.R.inc(4871);escape(accum, string, out, false, false, false);
        } catch (IOException e) {
            __CLR4_4_13po3polh9yvgl2.R.inc(4872);throw new SerializationException(e); // doesn't happen
        }
        __CLR4_4_13po3polh9yvgl2.R.inc(4873);return StringUtil.releaseBuilder(accum);
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * HTML escape an input string, using the default settings (UTF-8, base entities). That is, {@code <} is returned as
     * {@code &lt;}
     *
     * @param string the un-escaped string to escape
     * @return the escaped string
     */
    public static String escape(String string) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4874);
        __CLR4_4_13po3polh9yvgl2.R.inc(4875);return escape(string, DefaultOutput);
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    // this method is ugly, and does a lot. but other breakups cause rescanning and stringbuilder generations
    static void escape(Appendable accum, String string, Document.OutputSettings out,
                       boolean inAttribute, boolean normaliseWhite, boolean stripLeadingWhite) throws IOException {try{__CLR4_4_13po3polh9yvgl2.R.inc(4876);

        __CLR4_4_13po3polh9yvgl2.R.inc(4877);boolean lastWasWhite = false;
        __CLR4_4_13po3polh9yvgl2.R.inc(4878);boolean reachedNonWhite = false;
        __CLR4_4_13po3polh9yvgl2.R.inc(4879);final EscapeMode escapeMode = out.escapeMode();
        __CLR4_4_13po3polh9yvgl2.R.inc(4880);final CharsetEncoder encoder = out.encoder();
        __CLR4_4_13po3polh9yvgl2.R.inc(4881);final CoreCharset coreCharset = out.coreCharset; // init in out.prepareEncoder()
        __CLR4_4_13po3polh9yvgl2.R.inc(4882);final int length = string.length();

        __CLR4_4_13po3polh9yvgl2.R.inc(4883);int codePoint;
        __CLR4_4_13po3polh9yvgl2.R.inc(4884);for (int offset = 0; (((offset < length)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4885)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4886)==0&false)); offset += Character.charCount(codePoint)) {{
            __CLR4_4_13po3polh9yvgl2.R.inc(4887);codePoint = string.codePointAt(offset);

            __CLR4_4_13po3polh9yvgl2.R.inc(4888);if ((((normaliseWhite)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4889)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4890)==0&false))) {{
                __CLR4_4_13po3polh9yvgl2.R.inc(4891);if ((((StringUtil.isWhitespace(codePoint))&&(__CLR4_4_13po3polh9yvgl2.R.iget(4892)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4893)==0&false))) {{
                    __CLR4_4_13po3polh9yvgl2.R.inc(4894);if (((((stripLeadingWhite && !reachedNonWhite) || lastWasWhite)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4895)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4896)==0&false)))
                        {__CLR4_4_13po3polh9yvgl2.R.inc(4897);continue;
                    }__CLR4_4_13po3polh9yvgl2.R.inc(4898);accum.append(' ');
                    __CLR4_4_13po3polh9yvgl2.R.inc(4899);lastWasWhite = true;
                    __CLR4_4_13po3polh9yvgl2.R.inc(4900);continue;
                } }else {{
                    __CLR4_4_13po3polh9yvgl2.R.inc(4901);lastWasWhite = false;
                    __CLR4_4_13po3polh9yvgl2.R.inc(4902);reachedNonWhite = true;
                }
            }}
            // surrogate pairs, split implementation for efficiency on single char common case (saves creating strings, char[]):
            }__CLR4_4_13po3polh9yvgl2.R.inc(4903);if ((((codePoint < Character.MIN_SUPPLEMENTARY_CODE_POINT)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4904)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4905)==0&false))) {{
                __CLR4_4_13po3polh9yvgl2.R.inc(4906);final char c = (char) codePoint;
                // html specific and required escapes:
                boolean __CLB4_4_1_bool0=false;__CLR4_4_13po3polh9yvgl2.R.inc(4907);switch (c) {
                    case '&':if (!__CLB4_4_1_bool0) {__CLR4_4_13po3polh9yvgl2.R.inc(4908);__CLB4_4_1_bool0=true;}
                        __CLR4_4_13po3polh9yvgl2.R.inc(4909);accum.append("&amp;");
                        __CLR4_4_13po3polh9yvgl2.R.inc(4910);break;
                    case 0xA0:if (!__CLB4_4_1_bool0) {__CLR4_4_13po3polh9yvgl2.R.inc(4911);__CLB4_4_1_bool0=true;}
                        __CLR4_4_13po3polh9yvgl2.R.inc(4912);if ((((escapeMode != EscapeMode.xhtml)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4913)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4914)==0&false)))
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4915);accum.append("&nbsp;");
                        }else
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4916);accum.append("&#xa0;");
                        }__CLR4_4_13po3polh9yvgl2.R.inc(4917);break;
                    case '<':if (!__CLB4_4_1_bool0) {__CLR4_4_13po3polh9yvgl2.R.inc(4918);__CLB4_4_1_bool0=true;}
                        // escape when in character data or when in a xml attribue val; not needed in html attr val
                        __CLR4_4_13po3polh9yvgl2.R.inc(4919);if ((((!inAttribute || escapeMode == EscapeMode.xhtml)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4920)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4921)==0&false)))
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4922);accum.append("&lt;");
                        }else
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4923);accum.append(c);
                        }__CLR4_4_13po3polh9yvgl2.R.inc(4924);break;
                    case '>':if (!__CLB4_4_1_bool0) {__CLR4_4_13po3polh9yvgl2.R.inc(4925);__CLB4_4_1_bool0=true;}
                        __CLR4_4_13po3polh9yvgl2.R.inc(4926);if ((((!inAttribute)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4927)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4928)==0&false)))
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4929);accum.append("&gt;");
                        }else
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4930);accum.append(c);
                        }__CLR4_4_13po3polh9yvgl2.R.inc(4931);break;
                    case '"':if (!__CLB4_4_1_bool0) {__CLR4_4_13po3polh9yvgl2.R.inc(4932);__CLB4_4_1_bool0=true;}
                        __CLR4_4_13po3polh9yvgl2.R.inc(4933);if ((((inAttribute)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4934)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4935)==0&false)))
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4936);accum.append("&quot;");
                        }else
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4937);accum.append(c);
                        }__CLR4_4_13po3polh9yvgl2.R.inc(4938);break;
                    default:if (!__CLB4_4_1_bool0) {__CLR4_4_13po3polh9yvgl2.R.inc(4939);__CLB4_4_1_bool0=true;}
                        __CLR4_4_13po3polh9yvgl2.R.inc(4940);if ((((canEncode(coreCharset, c, encoder))&&(__CLR4_4_13po3polh9yvgl2.R.iget(4941)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4942)==0&false)))
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4943);accum.append(c);
                        }else
                            {__CLR4_4_13po3polh9yvgl2.R.inc(4944);appendEncoded(accum, escapeMode, codePoint);
                }}
            } }else {{
                __CLR4_4_13po3polh9yvgl2.R.inc(4945);final String c = new String(Character.toChars(codePoint));
                __CLR4_4_13po3polh9yvgl2.R.inc(4946);if ((((encoder.canEncode(c))&&(__CLR4_4_13po3polh9yvgl2.R.iget(4947)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4948)==0&false))) // uses fallback encoder for simplicity
                    {__CLR4_4_13po3polh9yvgl2.R.inc(4949);accum.append(c);
                }else
                    {__CLR4_4_13po3polh9yvgl2.R.inc(4950);appendEncoded(accum, escapeMode, codePoint);
            }}
        }}
    }}finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    private static void appendEncoded(Appendable accum, EscapeMode escapeMode, int codePoint) throws IOException {try{__CLR4_4_13po3polh9yvgl2.R.inc(4951);
        __CLR4_4_13po3polh9yvgl2.R.inc(4952);final String name = escapeMode.nameForCodepoint(codePoint);
        __CLR4_4_13po3polh9yvgl2.R.inc(4953);if ((((name != emptyName)&&(__CLR4_4_13po3polh9yvgl2.R.iget(4954)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4955)==0&false))) // ok for identity check
            {__CLR4_4_13po3polh9yvgl2.R.inc(4956);accum.append('&').append(name).append(';');
        }else
            {__CLR4_4_13po3polh9yvgl2.R.inc(4957);accum.append("&#x").append(Integer.toHexString(codePoint)).append(';');
    }}finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * Un-escape an HTML escaped string. That is, {@code &lt;} is returned as {@code <}.
     *
     * @param string the HTML string to un-escape
     * @return the unescaped string
     */
    public static String unescape(String string) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4958);
        __CLR4_4_13po3polh9yvgl2.R.inc(4959);return unescape(string, false);
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /**
     * Unescape the input string.
     *
     * @param string to un-HTML-escape
     * @param strict if "strict" (that is, requires trailing ';' char, otherwise that's optional)
     * @return unescaped string
     */
    static String unescape(String string, boolean strict) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4960);
        __CLR4_4_13po3polh9yvgl2.R.inc(4961);return Parser.unescapeEntities(string, strict);
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    /*
     * Provides a fast-path for Encoder.canEncode, which drastically improves performance on Android post JellyBean.
     * After KitKat, the implementation of canEncode degrades to the point of being useless. For non ASCII or UTF,
     * performance may be bad. We can add more encoders for common character sets that are impacted by performance
     * issues on Android if required.
     *
     * Benchmarks:     *
     * OLD toHtml() impl v New (fastpath) in millis
     * Wiki: 1895, 16
     * CNN: 6378, 55
     * Alterslash: 3013, 28
     * Jsoup: 167, 2
     */
    private static boolean canEncode(final CoreCharset charset, final char c, final CharsetEncoder fallback) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4962);
        // todo add more charset tests if impacted by Android's bad perf in canEncode
        boolean __CLB4_4_1_bool1=false;__CLR4_4_13po3polh9yvgl2.R.inc(4963);switch (charset) {
            case ascii:if (!__CLB4_4_1_bool1) {__CLR4_4_13po3polh9yvgl2.R.inc(4964);__CLB4_4_1_bool1=true;}
                __CLR4_4_13po3polh9yvgl2.R.inc(4965);return c < 0x80;
            case utf:if (!__CLB4_4_1_bool1) {__CLR4_4_13po3polh9yvgl2.R.inc(4966);__CLB4_4_1_bool1=true;}
                __CLR4_4_13po3polh9yvgl2.R.inc(4967);return true; // real is:!(Character.isLowSurrogate(c) || Character.isHighSurrogate(c)); - but already check above
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_13po3polh9yvgl2.R.inc(4968);__CLB4_4_1_bool1=true;}
                __CLR4_4_13po3polh9yvgl2.R.inc(4969);return fallback.canEncode(c);
        }
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}

    enum CoreCharset {
        ascii, utf, fallback;

        static CoreCharset byName(final String name) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4970);
            __CLR4_4_13po3polh9yvgl2.R.inc(4971);if ((((name.equals("US-ASCII"))&&(__CLR4_4_13po3polh9yvgl2.R.iget(4972)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4973)==0&false)))
                {__CLR4_4_13po3polh9yvgl2.R.inc(4974);return ascii;
            }__CLR4_4_13po3polh9yvgl2.R.inc(4975);if ((((name.startsWith("UTF-"))&&(__CLR4_4_13po3polh9yvgl2.R.iget(4976)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4977)==0&false))) // covers UTF-8, UTF-16, et al
                {__CLR4_4_13po3polh9yvgl2.R.inc(4978);return utf;
            }__CLR4_4_13po3polh9yvgl2.R.inc(4979);return fallback;
        }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}
    }

    private static void load(EscapeMode e, String pointsData, int size) {try{__CLR4_4_13po3polh9yvgl2.R.inc(4980);
        __CLR4_4_13po3polh9yvgl2.R.inc(4981);e.nameKeys = new String[size];
        __CLR4_4_13po3polh9yvgl2.R.inc(4982);e.codeVals = new int[size];
        __CLR4_4_13po3polh9yvgl2.R.inc(4983);e.codeKeys = new int[size];
        __CLR4_4_13po3polh9yvgl2.R.inc(4984);e.nameVals = new String[size];

        __CLR4_4_13po3polh9yvgl2.R.inc(4985);int i = 0;
        __CLR4_4_13po3polh9yvgl2.R.inc(4986);CharacterReader reader = new CharacterReader(pointsData);

        __CLR4_4_13po3polh9yvgl2.R.inc(4987);while ((((!reader.isEmpty())&&(__CLR4_4_13po3polh9yvgl2.R.iget(4988)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4989)==0&false))) {{
            // NotNestedLessLess=10913,824;1887&

            __CLR4_4_13po3polh9yvgl2.R.inc(4990);final String name = reader.consumeTo('=');
            __CLR4_4_13po3polh9yvgl2.R.inc(4991);reader.advance();
            __CLR4_4_13po3polh9yvgl2.R.inc(4992);final int cp1 = Integer.parseInt(reader.consumeToAny(codeDelims), codepointRadix);
            __CLR4_4_13po3polh9yvgl2.R.inc(4993);final char codeDelim = reader.current();
            __CLR4_4_13po3polh9yvgl2.R.inc(4994);reader.advance();
            __CLR4_4_13po3polh9yvgl2.R.inc(4995);final int cp2;
            __CLR4_4_13po3polh9yvgl2.R.inc(4996);if ((((codeDelim == ',')&&(__CLR4_4_13po3polh9yvgl2.R.iget(4997)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(4998)==0&false))) {{
                __CLR4_4_13po3polh9yvgl2.R.inc(4999);cp2 = Integer.parseInt(reader.consumeTo(';'), codepointRadix);
                __CLR4_4_13po3polh9yvgl2.R.inc(5000);reader.advance();
            } }else {{
                __CLR4_4_13po3polh9yvgl2.R.inc(5001);cp2 = empty;
            }
            }__CLR4_4_13po3polh9yvgl2.R.inc(5002);final String indexS = reader.consumeTo('&');
            __CLR4_4_13po3polh9yvgl2.R.inc(5003);final int index = Integer.parseInt(indexS, codepointRadix);
            __CLR4_4_13po3polh9yvgl2.R.inc(5004);reader.advance();

            __CLR4_4_13po3polh9yvgl2.R.inc(5005);e.nameKeys[i] = name;
            __CLR4_4_13po3polh9yvgl2.R.inc(5006);e.codeVals[i] = cp1;
            __CLR4_4_13po3polh9yvgl2.R.inc(5007);e.codeKeys[index] = cp1;
            __CLR4_4_13po3polh9yvgl2.R.inc(5008);e.nameVals[index] = name;

            __CLR4_4_13po3polh9yvgl2.R.inc(5009);if ((((cp2 != empty)&&(__CLR4_4_13po3polh9yvgl2.R.iget(5010)!=0|true))||(__CLR4_4_13po3polh9yvgl2.R.iget(5011)==0&false))) {{
                __CLR4_4_13po3polh9yvgl2.R.inc(5012);multipoints.put(name, new String(new int[]{cp1, cp2}, 0, 2));
            }
            }__CLR4_4_13po3polh9yvgl2.R.inc(5013);i++;
        }

        }__CLR4_4_13po3polh9yvgl2.R.inc(5014);Validate.isTrue(i == size, "Unexpected count of entities loaded");
    }finally{__CLR4_4_13po3polh9yvgl2.R.flushNeeded();}}
}
