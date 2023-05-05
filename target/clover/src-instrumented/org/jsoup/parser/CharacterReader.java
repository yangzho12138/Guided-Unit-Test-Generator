/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Locale;

/**
 CharacterReader consumes tokens off a string. Used internally by jsoup. API subject to changes.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public final class CharacterReader {public static class __CLR4_4_14aj4ajlh9yvgmq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,5984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static final char EOF = (char) -1;
    private static final int maxStringCacheLen = 12;
    static final int maxBufferLen = 1024 * 32; // visible for testing
    private static final int readAheadLimit = (int) (maxBufferLen * 0.75);

    private final char[] charBuf;
    private final Reader reader;
    private int bufLength;
    private int bufSplitPoint;
    private int bufPos;
    private int readerPos;
    private int bufMark = -1;
    private final String[] stringCache = new String[512]; // holds reused strings in this doc, to lessen garbage

    public CharacterReader(Reader input, int sz) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5563);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5564);Validate.notNull(input);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5565);Validate.isTrue(input.markSupported());
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5566);reader = input;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5567);charBuf = new char[(((sz > maxBufferLen )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5568)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5569)==0&false))? maxBufferLen : sz];
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5570);bufferUp();

        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5571);if ((((isBinary())&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5572)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5573)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5574);throw new UncheckedIOException("Input is binary and unsupported");
        }
    }}finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    public CharacterReader(Reader input) {
        this(input, maxBufferLen);__CLR4_4_14aj4ajlh9yvgmq.R.inc(5576);try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5575);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    public CharacterReader(String input) {
        this(new StringReader(input), input.length());__CLR4_4_14aj4ajlh9yvgmq.R.inc(5578);try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5577);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    private void bufferUp() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5579);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5580);final int pos = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5581);if ((((pos < bufSplitPoint)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5582)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5583)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5584);return;

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5585);try {
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5586);final long skipped = reader.skip(pos);
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5587);reader.mark(maxBufferLen);
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5588);final int read = reader.read(charBuf);
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5589);reader.reset();
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5590);if ((((read != -1)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5591)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5592)==0&false))) {{
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5593);Validate.isTrue(skipped == pos); // Previously asserted that there is room in buf to skip, so this will be a WTF
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5594);bufLength = read;
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5595);readerPos += pos;
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5596);bufPos = 0;
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5597);bufMark = -1;
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5598);bufSplitPoint = (((bufLength > readAheadLimit )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5599)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5600)==0&false))? readAheadLimit : bufLength;
            }
        }} catch (IOException e) {
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5601);throw new UncheckedIOException(e);
        }
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Gets the current cursor position in the content.
     * @return current position
     */
    public int pos() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5602);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5603);return readerPos + bufPos;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Tests if all the content has been read.
     * @return true if nothing left to read.
     */
    public boolean isEmpty() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5604);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5605);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5606);return bufPos >= bufLength;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    private boolean isEmptyNoBufferUp() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5607);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5608);return bufPos >= bufLength;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Get the char at the current position.
     * @return char
     */
    public char current() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5609);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5610);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5611);return (((isEmptyNoBufferUp() )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5612)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5613)==0&false))? EOF : charBuf[bufPos];
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    char consume() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5614);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5615);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5616);char val = (((isEmptyNoBufferUp() )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5617)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5618)==0&false))? EOF : charBuf[bufPos];
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5619);bufPos++;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5620);return val;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    void unconsume() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5621);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5622);if ((((bufPos < 1)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5623)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5624)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5625);throw new UncheckedIOException(new IOException("No buffer left to unconsume"));

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5626);bufPos--;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Moves the current position by one.
     */
    public void advance() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5627);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5628);bufPos++;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    void mark() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5629);
        // extra buffer up, to get as much rewind capacity as possible
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5630);bufSplitPoint = 0;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5631);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5632);bufMark = bufPos;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    void rewindToMark() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5633);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5634);if ((((bufMark == -1)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5635)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5636)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5637);throw new UncheckedIOException(new IOException("Mark invalid"));

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5638);bufPos = bufMark;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Returns the number of characters between the current position and the next instance of the input char
     * @param c scan target
     * @return offset between current position and next instance of target. -1 if not found.
     */
    int nextIndexOf(char c) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5639);
        // doesn't handle scanning for surrogates
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5640);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5641);for (int i = bufPos; (((i < bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5642)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5643)==0&false)); i++) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5644);if ((((c == charBuf[i])&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5645)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5646)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5647);return i - bufPos;
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5648);return -1;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Returns the number of characters between the current position and the next instance of the input sequence
     *
     * @param seq scan target
     * @return offset between current position and next instance of target. -1 if not found.
     */
    int nextIndexOf(CharSequence seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5649);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5650);bufferUp();
        // doesn't handle scanning for surrogates
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5651);char startChar = seq.charAt(0);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5652);for (int offset = bufPos; (((offset < bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5653)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5654)==0&false)); offset++) {{
            // scan to first instance of startchar:
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5655);if ((((startChar != charBuf[offset])&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5656)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5657)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5658);while((((++offset < bufLength && startChar != charBuf[offset])&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5659)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5660)==0&false))) {{ /* empty */ }
            }}__CLR4_4_14aj4ajlh9yvgmq.R.inc(5661);int i = offset + 1;
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5662);int last = i + seq.length()-1;
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5663);if ((((offset < bufLength && last <= bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5664)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5665)==0&false))) {{
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5666);for (int j = 1; (((i < last && seq.charAt(j) == charBuf[i])&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5667)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5668)==0&false)); i++, j++) {{ /* empty */ }
                }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5669);if ((((i == last)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5670)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5671)==0&false))) // found full sequence
                    {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5672);return offset - bufPos;
            }}
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5673);return -1;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Reads characters up to the specific char.
     * @param c the delimiter
     * @return the chars read
     */
    public String consumeTo(char c) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5674);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5675);int offset = nextIndexOf(c);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5676);if ((((offset != -1)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5677)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5678)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5679);String consumed = cacheString(charBuf, stringCache, bufPos, offset);
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5680);bufPos += offset;
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5681);return consumed;
        } }else {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5682);return consumeToEnd();
        }
    }}finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeTo(String seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5683);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5684);int offset = nextIndexOf(seq);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5685);if ((((offset != -1)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5686)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5687)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5688);String consumed = cacheString(charBuf, stringCache, bufPos, offset);
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5689);bufPos += offset;
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5690);return consumed;
        } }else {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5691);return consumeToEnd();
        }
    }}finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Read characters until the first of any delimiters is found.
     * @param chars delimiters to scan for
     * @return characters read up to the matched delimiter.
     */
    public String consumeToAny(final char... chars) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5692);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5693);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5694);int pos = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5695);final int start = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5696);final int remaining = bufLength;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5697);final char[] val = charBuf;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5698);final int charLen = chars.length;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5699);int i;

        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5700);OUTER: while ((((pos < remaining)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5701)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5702)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5703);for (i = 0; (((i < charLen)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5704)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5705)==0&false)); i++) {{
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5706);if ((((val[pos] == chars[i])&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5707)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5708)==0&false)))
                    {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5709);break OUTER;
            }}
            }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5710);pos++;
        }

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5711);bufPos = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5712);return (((pos > start )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5713)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5714)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeToAnySorted(final char... chars) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5715);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5716);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5717);int pos = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5718);final int start = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5719);final int remaining = bufLength;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5720);final char[] val = charBuf;

        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5721);while ((((pos < remaining)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5722)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5723)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5724);if ((((Arrays.binarySearch(chars, val[pos]) >= 0)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5725)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5726)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5727);break;
            }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5728);pos++;
        }
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5729);bufPos = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5730);return (((bufPos > start )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5731)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5732)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeData() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5733);
        // &, <, null
        //bufferUp(); // no need to bufferUp, just called consume()
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5734);int pos = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5735);final int start = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5736);final int remaining = bufLength;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5737);final char[] val = charBuf;

        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5738);OUTER: while ((((pos < remaining)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5739)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5740)==0&false))) {{
            boolean __CLB4_4_1_bool0=false;__CLR4_4_14aj4ajlh9yvgmq.R.inc(5741);switch (val[pos]) {
                case '&':if (!__CLB4_4_1_bool0) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5742);__CLB4_4_1_bool0=true;}
                case '<':if (!__CLB4_4_1_bool0) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5743);__CLB4_4_1_bool0=true;}
                case TokeniserState.nullChar:if (!__CLB4_4_1_bool0) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5744);__CLB4_4_1_bool0=true;}
                    __CLR4_4_14aj4ajlh9yvgmq.R.inc(5745);break OUTER;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5746);__CLB4_4_1_bool0=true;}
                    __CLR4_4_14aj4ajlh9yvgmq.R.inc(5747);pos++;
            }
        }
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5748);bufPos = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5749);return (((pos > start )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5750)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5751)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeTagName() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5752);
        // '\t', '\n', '\r', '\f', ' ', '/', '>', nullChar
        // NOTE: out of spec, added '<' to fix common author bugs
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5753);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5754);int pos = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5755);final int start = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5756);final int remaining = bufLength;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5757);final char[] val = charBuf;

        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5758);OUTER: while ((((pos < remaining)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5759)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5760)==0&false))) {{
            boolean __CLB4_4_1_bool1=false;__CLR4_4_14aj4ajlh9yvgmq.R.inc(5761);switch (val[pos]) {
                case '\t':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5762);__CLB4_4_1_bool1=true;}
                case '\n':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5763);__CLB4_4_1_bool1=true;}
                case '\r':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5764);__CLB4_4_1_bool1=true;}
                case '\f':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5765);__CLB4_4_1_bool1=true;}
                case ' ':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5766);__CLB4_4_1_bool1=true;}
                case '/':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5767);__CLB4_4_1_bool1=true;}
                case '>':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5768);__CLB4_4_1_bool1=true;}
                case '<':if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5769);__CLB4_4_1_bool1=true;}
                case TokeniserState.nullChar:if (!__CLB4_4_1_bool1) {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5770);__CLB4_4_1_bool1=true;}
                    __CLR4_4_14aj4ajlh9yvgmq.R.inc(5771);break OUTER;
            }
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5772);pos++;
        }

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5773);bufPos = pos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5774);return (((pos > start )&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5775)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5776)==0&false))? cacheString(charBuf, stringCache, start, pos -start) : "";
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeToEnd() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5777);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5778);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5779);String data = cacheString(charBuf, stringCache, bufPos, bufLength - bufPos);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5780);bufPos = bufLength;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5781);return data;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeLetterSequence() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5782);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5783);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5784);int start = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5785);while ((((bufPos < bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5786)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5787)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5788);char c = charBuf[bufPos];
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5789);if (((((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c))&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5790)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5791)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5792);bufPos++;
            }else
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5793);break;
        }}

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5794);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeLetterThenDigitSequence() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5795);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5796);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5797);int start = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5798);while ((((bufPos < bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5799)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5800)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5801);char c = charBuf[bufPos];
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5802);if (((((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c))&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5803)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5804)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5805);bufPos++;
            }else
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5806);break;
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5807);while ((((!isEmptyNoBufferUp())&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5808)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5809)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5810);char c = charBuf[bufPos];
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5811);if ((((c >= '0' && c <= '9')&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5812)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5813)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5814);bufPos++;
            }else
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5815);break;
        }}

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5816);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeHexSequence() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5817);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5818);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5819);int start = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5820);while ((((bufPos < bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5821)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5822)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5823);char c = charBuf[bufPos];
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5824);if (((((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5825)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5826)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5827);bufPos++;
            }else
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5828);break;
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5829);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    String consumeDigitSequence() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5830);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5831);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5832);int start = bufPos;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5833);while ((((bufPos < bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5834)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5835)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5836);char c = charBuf[bufPos];
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5837);if ((((c >= '0' && c <= '9')&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5838)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5839)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5840);bufPos++;
            }else
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5841);break;
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5842);return cacheString(charBuf, stringCache, start, bufPos - start);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matches(char c) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5843);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5844);return !isEmpty() && charBuf[bufPos] == c;

    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matches(String seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5845);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5846);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5847);int scanLength = seq.length();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5848);if ((((scanLength > bufLength - bufPos)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5849)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5850)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5851);return false;

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5852);for (int offset = 0; (((offset < scanLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5853)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5854)==0&false)); offset++)
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5855);if ((((seq.charAt(offset) != charBuf[bufPos +offset])&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5856)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5857)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5858);return false;
        }}__CLR4_4_14aj4ajlh9yvgmq.R.inc(5859);return true;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matchesIgnoreCase(String seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5860);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5861);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5862);int scanLength = seq.length();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5863);if ((((scanLength > bufLength - bufPos)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5864)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5865)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5866);return false;

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5867);for (int offset = 0; (((offset < scanLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5868)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5869)==0&false)); offset++) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5870);char upScan = Character.toUpperCase(seq.charAt(offset));
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5871);char upTarget = Character.toUpperCase(charBuf[bufPos + offset]);
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5872);if ((((upScan != upTarget)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5873)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5874)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5875);return false;
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5876);return true;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matchesAny(char... seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5877);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5878);if ((((isEmpty())&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5879)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5880)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5881);return false;

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5882);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5883);char c = charBuf[bufPos];
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5884);for (char seek : seq) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5885);if ((((seek == c)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5886)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5887)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5888);return true;
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5889);return false;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matchesAnySorted(char[] seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5890);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5891);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5892);return !isEmpty() && Arrays.binarySearch(seq, charBuf[bufPos]) >= 0;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matchesLetter() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5893);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5894);if ((((isEmpty())&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5895)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5896)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5897);return false;
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5898);char c = charBuf[bufPos];
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5899);return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matchesDigit() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5900);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5901);if ((((isEmpty())&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5902)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5903)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5904);return false;
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5905);char c = charBuf[bufPos];
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5906);return (c >= '0' && c <= '9');
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matchConsume(String seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5907);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5908);bufferUp();
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5909);if ((((matches(seq))&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5910)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5911)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5912);bufPos += seq.length();
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5913);return true;
        } }else {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5914);return false;
        }
    }}finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean matchConsumeIgnoreCase(String seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5915);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5916);if ((((matchesIgnoreCase(seq))&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5917)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5918)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5919);bufPos += seq.length();
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5920);return true;
        } }else {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5921);return false;
        }
    }}finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    boolean containsIgnoreCase(String seq) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5922);
        // used to check presence of </title>, </style>. only finds consistent case.
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5923);String loScan = seq.toLowerCase(Locale.ENGLISH);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5924);String hiScan = seq.toUpperCase(Locale.ENGLISH);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5925);return (nextIndexOf(loScan) > -1) || (nextIndexOf(hiScan) > -1);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    private static final int numNullsConsideredBinary = 10; // conservative

    /**
     *  Heuristic to determine if the current buffer looks like binary content. Reader will already hopefully be
     *  decoded correctly, so a bunch of NULLs indicates a binary file
     */
    boolean isBinary() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5926);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5927);int nullsSeen = 0;

        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5928);for (int i = bufPos; (((i < bufLength)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5929)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5930)==0&false)); i++) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5931);if ((((charBuf[i] == '\0')&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5932)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5933)==0&false)))
                {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5934);nullsSeen++;
        }}

        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5935);return nullsSeen >= numNullsConsideredBinary;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5936);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5937);return new String(charBuf, bufPos, bufLength - bufPos);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Caches short strings, as a flywheel pattern, to reduce GC load. Just for this doc, to prevent leaks.
     * <p />
     * Simplistic, and on hash collisions just falls back to creating a new string, vs a full HashMap with Entry list.
     * That saves both having to create objects as hash keys, and running through the entry list, at the expense of
     * some more duplicates.
     */
    private static String cacheString(final char[] charBuf, final String[] stringCache, final int start, final int count) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5938);
        // limit (no cache):
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5939);if ((((count > maxStringCacheLen)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5940)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5941)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5942);return new String(charBuf, start, count);
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5943);if ((((count < 1)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5944)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5945)==0&false)))
            {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5946);return "";

        // calculate hash:
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5947);int hash = 0;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5948);int offset = start;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5949);for (int i = 0; (((i < count)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5950)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5951)==0&false)); i++) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5952);hash = 31 * hash + charBuf[offset++];
        }

        // get from cache
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5953);final int index = hash & stringCache.length - 1;
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5954);String cached = stringCache[index];

        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5955);if ((((cached == null)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5956)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5957)==0&false))) {{ // miss, add
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5958);cached = new String(charBuf, start, count);
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5959);stringCache[index] = cached;
        } }else {{ // hashcode hit, check equality
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5960);if ((((rangeEquals(charBuf, start, count, cached))&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5961)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5962)==0&false))) {{ // hit
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5963);return cached;
            } }else {{ // hashcode conflict
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5964);cached = new String(charBuf, start, count);
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5965);stringCache[index] = cached; // update the cache, as recently used strings are more likely to show up again
            }
        }}
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5966);return cached;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    /**
     * Check if the value of the provided range equals the string.
     */
    static boolean rangeEquals(final char[] charBuf, final int start, int count, final String cached) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5967);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5968);if ((((count == cached.length())&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5969)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5970)==0&false))) {{
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5971);int i = start;
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5972);int j = 0;
            __CLR4_4_14aj4ajlh9yvgmq.R.inc(5973);while ((((count-- != 0)&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5974)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5975)==0&false))) {{
                __CLR4_4_14aj4ajlh9yvgmq.R.inc(5976);if ((((charBuf[i++] != cached.charAt(j++))&&(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5977)!=0|true))||(__CLR4_4_14aj4ajlh9yvgmq.R.iget(5978)==0&false)))
                    {__CLR4_4_14aj4ajlh9yvgmq.R.inc(5979);return false;
            }}
            }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5980);return true;
        }
        }__CLR4_4_14aj4ajlh9yvgmq.R.inc(5981);return false;
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}

    // just used for testing
    boolean rangeEquals(final int start, final int count, final String cached) {try{__CLR4_4_14aj4ajlh9yvgmq.R.inc(5982);
        __CLR4_4_14aj4ajlh9yvgmq.R.inc(5983);return rangeEquals(charBuf, start, count, cached);
    }finally{__CLR4_4_14aj4ajlh9yvgmq.R.flushNeeded();}}
}
