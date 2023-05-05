/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.*;
import org.jsoup.examples.HtmlToPlainText;;

/**
 * A character queue with parsing helpers.
 *
 * @author Jonathan Hedley
 */
public class TokenQueue {public static class __CLR4_4_16r26r2lh9yvgq2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,8986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String queue;
    private int pos = 0;
    
    private static final char ESC = '\\'; // escape char for chomp balanced.

    /**
     Create a new TokenQueue.
     @param data string of data to back queue.
     */
    public TokenQueue(String data) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8750);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8751);Validate.notNull(data);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8752);queue = data;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Is the queue empty?
     * @return true if no data left in queue.
     */
    public boolean isEmpty() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8753);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8754);return remainingLength() == 0;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    
    private int remainingLength() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8755);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8756);return queue.length() - pos;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Retrieves but does not remove the first character from the queue.
     * @return First character, or 0 if empty.
     */
    public char peek() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8757);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8758);return (((isEmpty() )&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8759)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8760)==0&false))? 0 : queue.charAt(pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Add a character to the start of the queue (will be the next character retrieved).
     @param c character to add
     */
    public void addFirst(Character c) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8761);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8762);addFirst(c.toString());
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Add a string to the start of the queue.
     @param seq string to add.
     */
    public void addFirst(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8763);
        // not very performant, but an edge case
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8764);queue = seq + queue.substring(pos);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8765);pos = 0;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Tests if the next characters on the queue match the sequence. Case insensitive.
     * @param seq String to check queue for.
     * @return true if the next characters match.
     */
    public boolean matches(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8766);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8767);return queue.regionMatches(true, pos, seq, 0, seq.length());
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Case sensitive match test.
     * @param seq string to case sensitively check for
     * @return true if matched, false if not
     */
    public boolean matchesCS(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8768);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8769);return queue.startsWith(seq, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    

    /**
     Tests if the next characters match any of the sequences. Case insensitive.
     @param seq list of strings to case insensitively check for
     @return true of any matched, false if none did
     */
    public boolean matchesAny(String... seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8770);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8771);for (String s : seq) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8772);if ((((matches(s))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8773)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8774)==0&false)))
                {__CLR4_4_16r26r2lh9yvgq2.R.inc(8775);return true;
        }}
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8776);return false;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    public boolean matchesAny(char... seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8777);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8778);if ((((isEmpty())&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8779)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8780)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8781);return false;

        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8782);for (char c: seq) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8783);if ((((queue.charAt(pos) == c)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8784)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8785)==0&false)))
                {__CLR4_4_16r26r2lh9yvgq2.R.inc(8786);return true;
        }}
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8787);return false;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    public boolean matchesStartTag() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8788);
        // micro opt for matching "<x"
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8789);return (remainingLength() >= 2 && queue.charAt(pos) == '<' && Character.isLetter(queue.charAt(pos+1)));
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Tests if the queue matches the sequence (as with match), and if they do, removes the matched string from the
     * queue.
     * @param seq String to search for, and if found, remove from queue.
     * @return true if found and removed, false if not found.
     */
    public boolean matchChomp(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8790);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8791);if ((((matches(seq))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8792)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8793)==0&false))) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8794);pos += seq.length();
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8795);return true;
        } }else {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8796);return false;
        }
    }}finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Tests if queue starts with a whitespace character.
     @return if starts with whitespace
     */
    public boolean matchesWhitespace() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8797);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8798);return !isEmpty() && StringUtil.isWhitespace(queue.charAt(pos));
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Test if the queue matches a word character (letter or digit).
     @return if matches a word character
     */
    public boolean matchesWord() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8799);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8800);return !isEmpty() && Character.isLetterOrDigit(queue.charAt(pos));
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Drops the next character off the queue.
     */
    public void advance() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8801);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8802);if ((((!isEmpty())&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8803)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8804)==0&false))) {__CLR4_4_16r26r2lh9yvgq2.R.inc(8805);pos++;
    }}finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Consume one character off queue.
     * @return first character on queue.
     */
    public char consume() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8806);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8807);return queue.charAt(pos++);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Consumes the supplied sequence of the queue. If the queue does not start with the supplied sequence, will
     * throw an illegal state exception -- but you should be running match() against that condition.
     <p>
     Case insensitive.
     * @param seq sequence to remove from head of queue.
     */
    public void consume(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8808);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8809);if ((((!matches(seq))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8810)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8811)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8812);throw new IllegalStateException("Queue did not match expected sequence");
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8813);int len = seq.length();
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8814);if ((((len > remainingLength())&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8815)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8816)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8817);throw new IllegalStateException("Queue not long enough to consume sequence");
        }else{{
        }
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8818);pos += len;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Pulls a string off the queue, up to but exclusive of the match sequence, or to the queue running out.
     * @param seq String to end on (and not include in return, but leave on queue). <b>Case sensitive.</b>
     * @return The matched data consumed from queue.
     */
    public String consumeTo(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8819);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8820);int offset = queue.indexOf(seq, pos);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8821);if ((((offset != -1)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8822)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8823)==0&false))) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8824);String consumed = queue.substring(pos, offset);
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8825);pos += consumed.length();
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8826);return consumed;
        } }else 
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8827);return remainder();
    }}finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    
    public String consumeToIgnoreCase(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8828);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8829);int start = pos; __CLR4_4_16r26r2lh9yvgq2.R.inc(8830);String first = seq.substring(0, 1);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8831);boolean canScan = first.toLowerCase().equals(first.toUpperCase()); // if first is not cased, use index of
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8832);while ((((!isEmpty())&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8833)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8834)==0&false))) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8835);if ((((matches(seq))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8836)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8837)==0&false)))
                {__CLR4_4_16r26r2lh9yvgq2.R.inc(8838);break;
            
            }__CLR4_4_16r26r2lh9yvgq2.R.inc(8839);if ((((canScan)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8840)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8841)==0&false))) {{
                __CLR4_4_16r26r2lh9yvgq2.R.inc(8842);int skip = queue.indexOf(first, pos) - pos;
                __CLR4_4_16r26r2lh9yvgq2.R.inc(8843);if ((((skip == 0)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8844)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8845)==0&false))) // this char is the skip char, but not match, so force advance of pos
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8846);pos++;
                }else {__CLR4_4_16r26r2lh9yvgq2.R.inc(8847);if ((((skip < 0)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8848)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8849)==0&false))) // no chance of finding, grab to end
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8850);pos = queue.length();
                }else
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8851);pos += skip;
            }}}
            }else
                {__CLR4_4_16r26r2lh9yvgq2.R.inc(8852);pos++;
        }}

        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8853);return queue.substring(start, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Consumes to the first sequence provided, or to the end of the queue. Leaves the terminator on the queue.
     @param seq any number of terminators to consume to. <b>Case insensitive.</b>
     @return consumed string   
     */
    // todo: method name. not good that consumeTo cares for case, and consume to any doesn't. And the only use for this
    // is is a case sensitive time...
    public String consumeToAny(String... seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8854);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8855);int start = pos;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8856);while ((((!isEmpty() && !matchesAny(seq))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8857)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8858)==0&false))) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8859);pos++;
        }

        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8860);return queue.substring(start, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Pulls a string off the queue (like consumeTo), and then pulls off the matched string (but does not return it).
     * <p>
     * If the queue runs out of characters before finding the seq, will return as much as it can (and queue will go
     * isEmpty() == true).
     * @param seq String to match up to, and not include in return, and to pull off queue. <b>Case sensitive.</b>
     * @return Data matched from queue.
     */
    public String chompTo(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8861);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8862);String data = consumeTo(seq);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8863);matchChomp(seq);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8864);return data;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    
    public String chompToIgnoreCase(String seq) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8865);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8866);String data = consumeToIgnoreCase(seq); // case insensitive scan
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8867);matchChomp(seq);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8868);return data;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Pulls a balanced string off the queue. E.g. if queue is "(one (two) three) four", (,) will return "one (two) three",
     * and leave " four" on the queue. Unbalanced openers and closers can be quoted (with ' or ") or escaped (with \). Those escapes will be left
     * in the returned string, which is suitable for regexes (where we need to preserve the escape), but unsuitable for
     * contains text strings; use unescape for that.
     * @param open opener
     * @param close closer
     * @return data matched from the queue
     */
    public String chompBalanced(char open, char close) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8869);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8870);int start = -1, end = -1;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8871);int depth = 0;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8872);char last = 0;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8873);boolean inSingleQuote = false, inDoubleQuote = false;

        __CLR4_4_16r26r2lh9yvgq2.R.inc(8874);do {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8875);if ((((isEmpty())&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8876)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8877)==0&false))) {__CLR4_4_16r26r2lh9yvgq2.R.inc(8878);break;
            }__CLR4_4_16r26r2lh9yvgq2.R.inc(8879);Character c = consume();
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8880);if ((((last == 0 || last != ESC)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8881)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8882)==0&false))) {{
                __CLR4_4_16r26r2lh9yvgq2.R.inc(8883);if ((((c.equals('\'') && c != open && !inDoubleQuote)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8884)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8885)==0&false)))
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8886);inSingleQuote = !inSingleQuote;
                }else {__CLR4_4_16r26r2lh9yvgq2.R.inc(8887);if ((((c.equals('"') && c != open && !inSingleQuote)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8888)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8889)==0&false)))
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8890);inDoubleQuote = !inDoubleQuote;
                }}__CLR4_4_16r26r2lh9yvgq2.R.inc(8891);if ((((inSingleQuote || inDoubleQuote)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8892)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8893)==0&false)))
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8894);continue;

                }__CLR4_4_16r26r2lh9yvgq2.R.inc(8895);if ((((c.equals(open))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8896)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8897)==0&false))) {{
                    __CLR4_4_16r26r2lh9yvgq2.R.inc(8898);depth++;
                    __CLR4_4_16r26r2lh9yvgq2.R.inc(8899);if ((((start == -1)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8900)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8901)==0&false)))
                        {__CLR4_4_16r26r2lh9yvgq2.R.inc(8902);start = pos;
                }}
                }else {__CLR4_4_16r26r2lh9yvgq2.R.inc(8903);if ((((c.equals(close))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8904)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8905)==0&false)))
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8906);depth--;
            }}}

            }__CLR4_4_16r26r2lh9yvgq2.R.inc(8907);if ((((depth > 0 && last != 0)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8908)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8909)==0&false)))
                {__CLR4_4_16r26r2lh9yvgq2.R.inc(8910);end = pos; // don't include the outer match pair in the return
            }__CLR4_4_16r26r2lh9yvgq2.R.inc(8911);last = c;
        } }while ((((depth > 0)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8912)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8913)==0&false)));
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8914);final String out = ((((end >= 0) )&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8915)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8916)==0&false))? queue.substring(start, end) : "";
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8917);if ((((depth > 0)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8918)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8919)==0&false))) {{// ran out of queue before seeing enough )
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8920);Validate.fail("Did not find balanced marker at '" + out + "'");
        }}else{{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8921);return out;
        }
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8922);return out;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    
    /**
     * Unescape a \ escaped string.
     * @param in backslash escaped string
     * @return unescaped string
     */
    public static String unescape(String in) {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8923);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8924);StringBuilder out = StringUtil.borrowBuilder();
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8925);char last = 0;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8926);for (char c : in.toCharArray()) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8927);if ((((c == ESC)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8928)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8929)==0&false))) {{
                __CLR4_4_16r26r2lh9yvgq2.R.inc(8930);if ((((last != 0 && last == ESC)&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8931)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8932)==0&false)))
                    {__CLR4_4_16r26r2lh9yvgq2.R.inc(8933);out.append(c);
            }}
            }else 
                {__CLR4_4_16r26r2lh9yvgq2.R.inc(8934);out.append(c);
            }__CLR4_4_16r26r2lh9yvgq2.R.inc(8935);last = c;
        }
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8936);return StringUtil.releaseBuilder(out);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Pulls the next run of whitespace characters of the queue.
     * @return Whether consuming whitespace or not
     */
    public boolean consumeWhitespace() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8937);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8938);boolean seen = false;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8939);while ((((matchesWhitespace())&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8940)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8941)==0&false))) {{
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8942);pos++;
            __CLR4_4_16r26r2lh9yvgq2.R.inc(8943);seen = true;
        }
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8944);return seen;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     * Retrieves the next run of word type (letter or digit) off the queue.
     * @return String of word characters from queue, or empty string if none.
     */
    public String consumeWord() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8945);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8946);int start = pos;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8947);while ((((matchesWord())&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8948)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8949)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8950);pos++;
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8951);return queue.substring(start, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    
    /**
     * Consume an tag name off the queue (word or :, _, -)
     * 
     * @return tag name
     */
    public String consumeTagName() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8952);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8953);int start = pos;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8954);while ((((!isEmpty() && (matchesWord() || matchesAny(':', '_', '-')))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8955)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8956)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8957);pos++;
        
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8958);return queue.substring(start, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    
    /**
     * Consume a CSS element selector (tag name, but | instead of : for namespaces (or *| for wildcard namespace), to not conflict with :pseudo selects).
     * 
     * @return tag name
     */
    public String consumeElementSelector() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8959);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8960);int start = pos;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8961);while ((((!isEmpty() && (matchesWord() || matchesAny("*|","|", "_", "-")))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8962)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8963)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8964);pos++;
        
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8965);return queue.substring(start, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Consume a CSS identifier (ID or class) off the queue (letter, digit, -, _)
     http://www.w3.org/TR/CSS2/syndata.html#value-def-identifier
     @return identifier
     */
    public String consumeCssIdentifier() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8966);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8967);int start = pos;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8968);while ((((!isEmpty() && (matchesWord() || matchesAny('-', '_')))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8969)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8970)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8971);pos++; }__CLR4_4_16r26r2lh9yvgq2.R.inc(8972);return queue.substring(start, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Consume an attribute key off the queue (letter, digit, -, _, :")
     @return attribute key
     */
    public String consumeAttributeKey() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8973);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8974);int start = pos;
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8975);while ((((!isEmpty() && (matchesWord() || matchesAny('-', '_', ':')))&&(__CLR4_4_16r26r2lh9yvgq2.R.iget(8976)!=0|true))||(__CLR4_4_16r26r2lh9yvgq2.R.iget(8977)==0&false)))
            {__CLR4_4_16r26r2lh9yvgq2.R.inc(8978);pos++;
        
        }__CLR4_4_16r26r2lh9yvgq2.R.inc(8979);return queue.substring(start, pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}

    /**
     Consume and return whatever is left on the queue.
     @return remained of queue.
     */
    public String remainder() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8980);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8981);final String remainder = queue.substring(pos, queue.length());
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8982);pos = queue.length();
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8983);return remainder;
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
    
    @Override
    public String toString() {try{__CLR4_4_16r26r2lh9yvgq2.R.inc(8984);
        __CLR4_4_16r26r2lh9yvgq2.R.inc(8985);return queue.substring(pos);
    }finally{__CLR4_4_16r26r2lh9yvgq2.R.flushNeeded();}}
}
