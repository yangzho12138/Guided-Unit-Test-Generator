/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;

import java.util.Arrays;

/**
 * Readers the input stream into tokens.
 */
final class Tokeniser {public static class __CLR4_4_16xm6xmlh9yvgqa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,9200,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final char replacementChar = '\ufffd'; // replaces null character
    private static final char[] notCharRefCharsSorted = new char[]{'\t', '\n', '\r', '\f', ' ', '<', '&'};

    // Some illegal character escapes are parsed by browsers as windows-1252 instead. See issue #1034
    // https://html.spec.whatwg.org/multipage/parsing.html#numeric-character-reference-end-state
    static final int win1252ExtensionsStart = 0x80;
    static final int[] win1252Extensions = new int[] {
            // we could build this manually, but Windows-1252 is not a standard java charset so that could break on
            // some platforms - this table is verified with a test
            0x20AC, 0x0081, 0x201A, 0x0192, 0x201E, 0x2026, 0x2020, 0x2021,
            0x02C6, 0x2030, 0x0160, 0x2039, 0x0152, 0x008D, 0x017D, 0x008F,
            0x0090, 0x2018, 0x2019, 0x201C, 0x201D, 0x2022, 0x2013, 0x2014,
            0x02DC, 0x2122, 0x0161, 0x203A, 0x0153, 0x009D, 0x017E, 0x0178,
    };

    static {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(8986);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(8987);Arrays.sort(notCharRefCharsSorted);
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    private final CharacterReader reader; // html input
    private final ParseErrorList errors; // errors found while tokenising

    private TokeniserState state = TokeniserState.Data; // current tokenisation state
    private Token emitPending; // the token we are about to emit on next read
    private boolean isEmitPending = false;
    private String charsString = null; // characters pending an emit. Will fall to charsBuilder if more than one
    private StringBuilder charsBuilder = new StringBuilder(1024); // buffers characters to output as one token, if more than one emit per read
    StringBuilder dataBuffer = new StringBuilder(1024); // buffers data looking for </script>

    Token.Tag tagPending; // tag we are building up
    Token.StartTag startPending = new Token.StartTag();
    Token.EndTag endPending = new Token.EndTag();
    Token.Character charPending = new Token.Character();
    Token.Doctype doctypePending = new Token.Doctype(); // doctype building up
    Token.Comment commentPending = new Token.Comment(); // comment building up
    private String lastStartTag; // the last start tag emitted, to test appropriate end tag

    Tokeniser(CharacterReader reader, ParseErrorList errors) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(8988);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(8989);this.reader = reader;
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(8990);this.errors = errors;
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    Token read() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(8991);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(8992);while ((((!isEmitPending)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(8993)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(8994)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(8995);state.read(this, reader);

        // if emit is pending, a non-character token was found: return any chars in buffer, and leave token for next read:
        }__CLR4_4_16xm6xmlh9yvgqa.R.inc(8996);if ((((charsBuilder.length() > 0)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(8997)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(8998)==0&false))) {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(8999);String str = charsBuilder.toString();
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9000);charsBuilder.delete(0, charsBuilder.length());
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9001);charsString = null;
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9002);return charPending.data(str);
        } }else {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9003);if ((((charsString != null)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9004)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9005)==0&false))) {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9006);Token token = charPending.data(charsString);
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9007);charsString = null;
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9008);return token;
        } }else {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9009);isEmitPending = false;
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9010);return emitPending;
        }
    }}}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emit(Token token) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9011);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9012);Validate.isFalse(isEmitPending, "There is an unread token pending!");

        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9013);emitPending = token;
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9014);isEmitPending = true;

        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9015);if ((((token.type == Token.TokenType.StartTag)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9016)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9017)==0&false))) {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9018);Token.StartTag startTag = (Token.StartTag) token;
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9019);lastStartTag = startTag.tagName;
        } }else {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9020);if ((((token.type == Token.TokenType.EndTag)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9021)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9022)==0&false))) {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9023);Token.EndTag endTag = (Token.EndTag) token;
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9024);if ((((endTag.attributes != null)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9025)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9026)==0&false)))
                {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9027);error("Attributes incorrectly present on end tag");
        }}
    }}}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emit(final String str) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9028);
        // buffer strings up until last string token found, to emit only one token for a run of character refs etc.
        // does not set isEmitPending; read checks that
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9029);if ((((charsString == null)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9030)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9031)==0&false))) {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9032);charsString = str;
        }
        }else {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9033);if ((((charsBuilder.length() == 0)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9034)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9035)==0&false))) {{ // switching to string builder as more than one emit before read
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9036);charsBuilder.append(charsString);
            }
            }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9037);charsBuilder.append(str);
        }
    }}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emit(char[] chars) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9038);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9039);emit(String.valueOf(chars));
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emit(int[] codepoints) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9040);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9041);emit(new String(codepoints, 0, codepoints.length));
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emit(char c) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9042);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9043);emit(String.valueOf(c));
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    TokeniserState getState() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9044);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9045);return state;
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void transition(TokeniserState state) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9046);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9047);this.state = state;
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void advanceTransition(TokeniserState state) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9048);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9049);reader.advance();
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9050);this.state = state;
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    final private int[] codepointHolder = new int[1]; // holder to not have to keep creating arrays
    final private int[] multipointHolder = new int[2];
    int[] consumeCharacterReference(Character additionalAllowedCharacter, boolean inAttribute) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9051);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9052);if ((((reader.isEmpty())&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9053)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9054)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9055);return null;
        }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9056);if ((((additionalAllowedCharacter != null && additionalAllowedCharacter == reader.current())&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9057)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9058)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9059);return null;
        }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9060);if ((((reader.matchesAnySorted(notCharRefCharsSorted))&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9061)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9062)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9063);return null;

        }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9064);final int[] codeRef = codepointHolder;
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9065);reader.mark();
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9066);if ((((reader.matchConsume("#"))&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9067)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9068)==0&false))) {{ // numbered
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9069);boolean isHexMode = reader.matchConsumeIgnoreCase("X");
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9070);String numRef = (((isHexMode )&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9071)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9072)==0&false))? reader.consumeHexSequence() : reader.consumeDigitSequence();
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9073);if ((((numRef.length() == 0)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9074)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9075)==0&false))) {{ // didn't match anything
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9076);characterReferenceError("numeric reference with no numerals");
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9077);reader.rewindToMark();
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9078);return null;
            }
            }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9079);if ((((!reader.matchConsume(";"))&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9080)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9081)==0&false)))
                {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9082);characterReferenceError("missing semicolon"); // missing semi
            }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9083);int charval = -1;
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9084);try {
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9085);int base = (((isHexMode )&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9086)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9087)==0&false))? 16 : 10;
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9088);charval = Integer.valueOf(numRef, base);
            } catch (NumberFormatException ignored) {
            } // skip
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9089);if ((((charval == -1 || (charval >= 0xD800 && charval <= 0xDFFF) || charval > 0x10FFFF)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9090)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9091)==0&false))) {{
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9092);characterReferenceError("character outside of valid range");
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9093);codeRef[0] = replacementChar;
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9094);return codeRef;
            } }else {{
                // fix illegal unicode characters to match browser behavior
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9095);if ((((charval >= win1252ExtensionsStart && charval < win1252ExtensionsStart + win1252Extensions.length)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9096)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9097)==0&false))) {{
                    __CLR4_4_16xm6xmlh9yvgqa.R.inc(9098);characterReferenceError("character is not a valid unicode code point");
                    __CLR4_4_16xm6xmlh9yvgqa.R.inc(9099);charval = win1252Extensions[charval - win1252ExtensionsStart];
                }

                // todo: implement number replacement table
                // todo: check for extra illegal unicode points as parse errors
                }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9100);codeRef[0] = charval;
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9101);return codeRef;
            }
        }} }else {{ // named
            // get as many letters as possible, and look for matching entities.
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9102);String nameRef = reader.consumeLetterThenDigitSequence();
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9103);boolean looksLegit = reader.matches(';');
            // found if a base named entity without a ;, or an extended entity with the ;.
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9104);boolean found = (Entities.isBaseNamedEntity(nameRef) || (Entities.isNamedEntity(nameRef) && looksLegit));

            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9105);if ((((!found)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9106)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9107)==0&false))) {{
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9108);reader.rewindToMark();
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9109);if ((((looksLegit)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9110)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9111)==0&false))) // named with semicolon
                    {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9112);characterReferenceError(String.format("invalid named reference '%s'", nameRef));
                }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9113);return null;
            }
            }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9114);if ((((inAttribute && (reader.matchesLetter() || reader.matchesDigit() || reader.matchesAny('=', '-', '_')))&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9115)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9116)==0&false))) {{
                // don't want that to match
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9117);reader.rewindToMark();
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9118);return null;
            }
            }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9119);if ((((!reader.matchConsume(";"))&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9120)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9121)==0&false)))
                {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9122);characterReferenceError("missing semicolon"); // missing semi
            }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9123);int numChars = Entities.codepointsForName(nameRef, multipointHolder);
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9124);if ((((numChars == 1)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9125)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9126)==0&false))) {{
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9127);codeRef[0] = multipointHolder[0];
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9128);return codeRef;
            } }else {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9129);if ((((numChars ==2)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9130)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9131)==0&false))) {{
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9132);return multipointHolder;
            } }else {{
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9133);Validate.fail("Unexpected characters returned for " + nameRef);
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9134);return multipointHolder;
            }
        }}}
    }}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    Token.Tag createTagPending(boolean start) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9135);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9136);tagPending = (((start )&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9137)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9138)==0&false))? startPending.reset() : endPending.reset();
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9139);return tagPending;
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emitTagPending() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9140);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9141);tagPending.finaliseTag();
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9142);emit(tagPending);
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void createCommentPending() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9143);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9144);commentPending.reset();
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emitCommentPending() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9145);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9146);emit(commentPending);
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void createDoctypePending() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9147);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9148);doctypePending.reset();
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void emitDoctypePending() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9149);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9150);emit(doctypePending);
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void createTempBuffer() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9151);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9152);Token.reset(dataBuffer);
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    boolean isAppropriateEndTagToken() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9153);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9154);return lastStartTag != null && tagPending.name().equalsIgnoreCase(lastStartTag);
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    String appropriateEndTagName() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9155);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9156);return lastStartTag; // could be null
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void error(TokeniserState state) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9157);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9158);if ((((errors.canAddError())&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9159)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9160)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9161);errors.add(new ParseError(reader.pos(), "Unexpected character '%s' in input state [%s]", reader.current(), state));
    }}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void eofError(TokeniserState state) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9162);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9163);if ((((errors.canAddError())&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9164)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9165)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9166);errors.add(new ParseError(reader.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", state));
    }}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    private void characterReferenceError(String message) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9167);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9168);if ((((errors.canAddError())&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9169)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9170)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9171);errors.add(new ParseError(reader.pos(), "Invalid character reference: %s", message));
    }}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    void error(String errorMsg) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9172);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9173);if ((((errors.canAddError())&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9174)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9175)==0&false)))
            {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9176);errors.add(new ParseError(reader.pos(), errorMsg));
    }}finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    boolean currentNodeInHtmlNS() {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9177);
        // todo: implement namespaces correctly
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9178);return true;
        // Element currentNode = currentNode();
        // return currentNode != null && currentNode.namespace().equals("HTML");
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}

    /**
     * Utility method to consume reader and unescape entities found within.
     * @param inAttribute if the text to be unescaped is in an attribute
     * @return unescaped string from reader
     */
    String unescapeEntities(boolean inAttribute) {try{__CLR4_4_16xm6xmlh9yvgqa.R.inc(9179);
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9180);StringBuilder builder = StringUtil.borrowBuilder();
        __CLR4_4_16xm6xmlh9yvgqa.R.inc(9181);while ((((!reader.isEmpty())&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9182)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9183)==0&false))) {{
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9184);builder.append(reader.consumeTo('&'));
            __CLR4_4_16xm6xmlh9yvgqa.R.inc(9185);if ((((reader.matches('&'))&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9186)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9187)==0&false))) {{
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9188);reader.consume();
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9189);int[] c = consumeCharacterReference(null, inAttribute);
                __CLR4_4_16xm6xmlh9yvgqa.R.inc(9190);if ((((c == null || c.length==0)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9191)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9192)==0&false)))
                    {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9193);builder.append('&');
                }else {{
                    __CLR4_4_16xm6xmlh9yvgqa.R.inc(9194);builder.appendCodePoint(c[0]);
                    __CLR4_4_16xm6xmlh9yvgqa.R.inc(9195);if ((((c.length == 2)&&(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9196)!=0|true))||(__CLR4_4_16xm6xmlh9yvgqa.R.iget(9197)==0&false)))
                        {__CLR4_4_16xm6xmlh9yvgqa.R.inc(9198);builder.appendCodePoint(c[1]);
                }}

            }}
        }}
        }__CLR4_4_16xm6xmlh9yvgqa.R.inc(9199);return StringUtil.releaseBuilder(builder);
    }finally{__CLR4_4_16xm6xmlh9yvgqa.R.flushNeeded();}}
}
