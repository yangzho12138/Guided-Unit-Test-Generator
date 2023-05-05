/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test suite for character reader.
 *
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class CharacterReaderTest {static class __CLR4_4_1umbumblh9yvhs4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,39908,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public final static int maxBufferLen = CharacterReader.maxBufferLen;

    @Test public void consume() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yvvy2lumb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consume",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yvvy2lumb(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39683);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39684);CharacterReader r = new CharacterReader("one");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39685);assertEquals(0, r.pos());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39686);assertEquals('o', r.current());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39687);assertEquals('o', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39688);assertEquals(1, r.pos());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39689);assertEquals('n', r.current());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39690);assertEquals(1, r.pos());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39691);assertEquals('n', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39692);assertEquals('e', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39693);assertTrue(r.isEmpty());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39694);assertEquals(CharacterReader.EOF, r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39695);assertTrue(r.isEmpty());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39696);assertEquals(CharacterReader.EOF, r.consume());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void unconsume() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1q192iump();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.unconsume",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39697,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1q192iump(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39697);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39698);CharacterReader r = new CharacterReader("one");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39699);assertEquals('o', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39700);assertEquals('n', r.current());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39701);r.unconsume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39702);assertEquals('o', r.current());

        __CLR4_4_1umbumblh9yvhs4.R.inc(39703);assertEquals('o', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39704);assertEquals('n', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39705);assertEquals('e', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39706);assertTrue(r.isEmpty());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39707);r.unconsume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39708);assertFalse(r.isEmpty());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39709);assertEquals('e', r.current());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39710);assertEquals('e', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39711);assertTrue(r.isEmpty());

        __CLR4_4_1umbumblh9yvhs4.R.inc(39712);assertEquals(CharacterReader.EOF, r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39713);r.unconsume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39714);assertTrue(r.isEmpty());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39715);assertEquals(CharacterReader.EOF, r.current());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void mark() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1m5v5h0un8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.mark",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39716,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1m5v5h0un8(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39716);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39717);CharacterReader r = new CharacterReader("one");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39718);r.consume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39719);r.mark();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39720);assertEquals('n', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39721);assertEquals('e', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39722);assertTrue(r.isEmpty());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39723);r.rewindToMark();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39724);assertEquals('n', r.consume());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void consumeToEnd() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6ehytunh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToEnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6ehytunh(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39725);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39726);String in = "one two three";
        __CLR4_4_1umbumblh9yvhs4.R.inc(39727);CharacterReader r = new CharacterReader(in);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39728);String toEnd = r.consumeToEnd();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39729);assertEquals(in, toEnd);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39730);assertTrue(r.isEmpty());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void nextIndexOfChar() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qgh9m5unn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.nextIndexOfChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qgh9m5unn(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39731);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39732);String in = "blah blah";
        __CLR4_4_1umbumblh9yvhs4.R.inc(39733);CharacterReader r = new CharacterReader(in);

        __CLR4_4_1umbumblh9yvhs4.R.inc(39734);assertEquals(-1, r.nextIndexOf('x'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39735);assertEquals(3, r.nextIndexOf('h'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39736);String pull = r.consumeTo('h');
        __CLR4_4_1umbumblh9yvhs4.R.inc(39737);assertEquals("bla", pull);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39738);r.consume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39739);assertEquals(2, r.nextIndexOf('l'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39740);assertEquals(" blah", r.consumeToEnd());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39741);assertEquals(-1, r.nextIndexOf('x'));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void nextIndexOfString() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15joageuny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.nextIndexOfString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39742,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15joageuny(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39742);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39743);String in = "One Two something Two Three Four";
        __CLR4_4_1umbumblh9yvhs4.R.inc(39744);CharacterReader r = new CharacterReader(in);

        __CLR4_4_1umbumblh9yvhs4.R.inc(39745);assertEquals(-1, r.nextIndexOf("Foo"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39746);assertEquals(4, r.nextIndexOf("Two"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39747);assertEquals("One Two ", r.consumeTo("something"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39748);assertEquals(10, r.nextIndexOf("Two"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39749);assertEquals("something Two Three Four", r.consumeToEnd());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39750);assertEquals(-1, r.nextIndexOf("Two"));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void nextIndexOfUnmatched() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x2rpi4uo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.nextIndexOfUnmatched",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39751,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x2rpi4uo7(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39751);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39752);CharacterReader r = new CharacterReader("<[[one]]");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39753);assertEquals(-1, r.nextIndexOf("]]>"));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void consumeToChar() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vbexbouoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToChar",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vbexbouoa(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39754);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39755);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39756);assertEquals("One ", r.consumeTo('T'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39757);assertEquals("", r.consumeTo('T')); // on Two
        __CLR4_4_1umbumblh9yvhs4.R.inc(39758);assertEquals('T', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39759);assertEquals("wo ", r.consumeTo('T'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39760);assertEquals('T', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39761);assertEquals("hree", r.consumeTo('T')); // consume to end
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void consumeToString() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j01dtduoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j01dtduoi(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39762);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39763);CharacterReader r = new CharacterReader("One Two Two Four");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39764);assertEquals("One ", r.consumeTo("Two"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39765);assertEquals('T', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39766);assertEquals("wo ", r.consumeTo("Two"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39767);assertEquals('T', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39768);assertEquals("wo Four", r.consumeTo("Qux"));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void advance() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_196izqvuop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.advance",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39769,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_196izqvuop(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39769);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39770);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39771);assertEquals('O', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39772);r.advance();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39773);assertEquals('e', r.consume());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void consumeToAny() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15f4hvouou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToAny",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39774,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15f4hvouou(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39774);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39775);CharacterReader r = new CharacterReader("One &bar; qux");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39776);assertEquals("One ", r.consumeToAny('&', ';'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39777);assertTrue(r.matches('&'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39778);assertTrue(r.matches("&bar;"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39779);assertEquals('&', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39780);assertEquals("bar", r.consumeToAny('&', ';'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39781);assertEquals(';', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39782);assertEquals(" qux", r.consumeToAny('&', ';'));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void consumeLetterSequence() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ryjqq2up3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeLetterSequence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ryjqq2up3(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39783);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39784);CharacterReader r = new CharacterReader("One &bar; qux");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39785);assertEquals("One", r.consumeLetterSequence());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39786);assertEquals(" &", r.consumeTo("bar;"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39787);assertEquals("bar", r.consumeLetterSequence());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39788);assertEquals("; qux", r.consumeToEnd());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void consumeLetterThenDigitSequence() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19ty1x2up9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeLetterThenDigitSequence",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39789,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19ty1x2up9(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39789);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39790);CharacterReader r = new CharacterReader("One12 Two &bar; qux");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39791);assertEquals("One12", r.consumeLetterThenDigitSequence());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39792);assertEquals(' ', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39793);assertEquals("Two", r.consumeLetterThenDigitSequence());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39794);assertEquals(" &bar; qux", r.consumeToEnd());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void matches() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16glrdyupf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.matches",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16glrdyupf(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39795);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39796);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39797);assertTrue(r.matches('O'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39798);assertTrue(r.matches("One Two Three"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39799);assertTrue(r.matches("One"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39800);assertFalse(r.matches("one"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39801);assertEquals('O', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39802);assertFalse(r.matches("One"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39803);assertTrue(r.matches("ne Two Three"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39804);assertFalse(r.matches("ne Two Three Four"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39805);assertEquals("ne Two Three", r.consumeToEnd());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39806);assertFalse(r.matches("ne"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39807);assertTrue(r.isEmpty());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test
    public void matchesIgnoreCase() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3qh0kups();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.matchesIgnoreCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3qh0kups(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39808);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39809);CharacterReader r = new CharacterReader("One Two Three");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39810);assertTrue(r.matchesIgnoreCase("O"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39811);assertTrue(r.matchesIgnoreCase("o"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39812);assertTrue(r.matches('O'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39813);assertFalse(r.matches('o'));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39814);assertTrue(r.matchesIgnoreCase("One Two Three"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39815);assertTrue(r.matchesIgnoreCase("ONE two THREE"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39816);assertTrue(r.matchesIgnoreCase("One"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39817);assertTrue(r.matchesIgnoreCase("one"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39818);assertEquals('O', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39819);assertFalse(r.matchesIgnoreCase("One"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39820);assertTrue(r.matchesIgnoreCase("NE Two Three"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39821);assertFalse(r.matchesIgnoreCase("ne Two Three Four"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39822);assertEquals("ne Two Three", r.consumeToEnd());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39823);assertFalse(r.matchesIgnoreCase("ne"));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void containsIgnoreCase() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w31qgouq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.containsIgnoreCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39824,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w31qgouq8(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39824);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39825);CharacterReader r = new CharacterReader("One TWO three");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39826);assertTrue(r.containsIgnoreCase("two"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39827);assertTrue(r.containsIgnoreCase("three"));
        // weird one: does not find one, because it scans for consistent case only
        __CLR4_4_1umbumblh9yvhs4.R.inc(39828);assertFalse(r.containsIgnoreCase("one"));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void matchesAny() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ecoqu8uqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.matchesAny",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ecoqu8uqd(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39829);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39830);char[] scan = {' ', '\n', '\t'};
        __CLR4_4_1umbumblh9yvhs4.R.inc(39831);CharacterReader r = new CharacterReader("One\nTwo\tThree");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39832);assertFalse(r.matchesAny(scan));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39833);assertEquals("One", r.consumeToAny(scan));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39834);assertTrue(r.matchesAny(scan));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39835);assertEquals('\n', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39836);assertFalse(r.matchesAny(scan));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void cachesStrings() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1j1du7suql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.cachesStrings",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1j1du7suql(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39837);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39838);CharacterReader r = new CharacterReader("Check\tCheck\tCheck\tCHOKE\tA string that is longer than 16 chars");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39839);String one = r.consumeTo('\t');
        __CLR4_4_1umbumblh9yvhs4.R.inc(39840);r.consume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39841);String two = r.consumeTo('\t');
        __CLR4_4_1umbumblh9yvhs4.R.inc(39842);r.consume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39843);String three = r.consumeTo('\t');
        __CLR4_4_1umbumblh9yvhs4.R.inc(39844);r.consume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39845);String four = r.consumeTo('\t');
        __CLR4_4_1umbumblh9yvhs4.R.inc(39846);r.consume();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39847);String five = r.consumeTo('\t');

        __CLR4_4_1umbumblh9yvhs4.R.inc(39848);assertEquals("Check", one);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39849);assertEquals("Check", two);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39850);assertEquals("Check", three);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39851);assertEquals("CHOKE", four);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39852);assertTrue(one == two);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39853);assertTrue(two == three);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39854);assertTrue(three != four);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39855);assertTrue(four != five);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39856);assertEquals(five, "A string that is longer than 16 chars");
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test
    public void rangeEquals() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpedp9ur5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.rangeEquals",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpedp9ur5(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39857);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39858);CharacterReader r = new CharacterReader("Check\tCheck\tCheck\tCHOKE");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39859);assertTrue(r.rangeEquals(0, 5, "Check"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39860);assertFalse(r.rangeEquals(0, 5, "CHOKE"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39861);assertFalse(r.rangeEquals(0, 5, "Chec"));

        __CLR4_4_1umbumblh9yvhs4.R.inc(39862);assertTrue(r.rangeEquals(6, 5, "Check"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39863);assertFalse(r.rangeEquals(6, 5, "Chuck"));

        __CLR4_4_1umbumblh9yvhs4.R.inc(39864);assertTrue(r.rangeEquals(12, 5, "Check"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39865);assertFalse(r.rangeEquals(12, 5, "Cheeky"));

        __CLR4_4_1umbumblh9yvhs4.R.inc(39866);assertTrue(r.rangeEquals(18, 5, "CHOKE"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39867);assertFalse(r.rangeEquals(18, 5, "CHIKE"));
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test
    public void empty() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4yvp0urg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.empty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39868,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4yvp0urg(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39868);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39869);CharacterReader r = new CharacterReader("One");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39870);assertTrue(r.matchConsume("One"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39871);assertTrue(r.isEmpty());

        __CLR4_4_1umbumblh9yvhs4.R.inc(39872);r = new CharacterReader("Two");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39873);String two = r.consumeToEnd();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39874);assertEquals("Two", two);
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test
    public void consumeToNonexistentEndWhenAtAnd() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y5x2tcurn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.consumeToNonexistentEndWhenAtAnd",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39875,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y5x2tcurn(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39875);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39876);CharacterReader r = new CharacterReader("<!");
        __CLR4_4_1umbumblh9yvhs4.R.inc(39877);assertTrue(r.matchConsume("<!"));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39878);assertTrue(r.isEmpty());

        __CLR4_4_1umbumblh9yvhs4.R.inc(39879);String after = r.consumeTo('>');
        __CLR4_4_1umbumblh9yvhs4.R.inc(39880);assertEquals("", after);

        __CLR4_4_1umbumblh9yvhs4.R.inc(39881);assertTrue(r.isEmpty());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test
    public void notEmptyAtBufferSplitPoint() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nb1a16uru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.notEmptyAtBufferSplitPoint",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nb1a16uru(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39882);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39883);CharacterReader r = new CharacterReader(new StringReader("How about now"), 3);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39884);assertEquals("How", r.consumeTo(' '));
        __CLR4_4_1umbumblh9yvhs4.R.inc(39885);assertFalse("Should not be empty", r.isEmpty());

        __CLR4_4_1umbumblh9yvhs4.R.inc(39886);assertEquals(' ', r.consume());
        __CLR4_4_1umbumblh9yvhs4.R.inc(39887);assertFalse(r.isEmpty());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}

    @Test public void bufferUp() {__CLR4_4_1umbumblh9yvhs4.R.globalSliceStart(getClass().getName(),39888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tn63a6us0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1umbumblh9yvhs4.R.rethrow($CLV_t2$);}finally{__CLR4_4_1umbumblh9yvhs4.R.globalSliceEnd(getClass().getName(),"org.jsoup.parser.CharacterReaderTest.bufferUp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tn63a6us0(){try{__CLR4_4_1umbumblh9yvhs4.R.inc(39888);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39889);String note = "HelloThere"; // + ! = 11 chars
        __CLR4_4_1umbumblh9yvhs4.R.inc(39890);int loopCount = 64;
        __CLR4_4_1umbumblh9yvhs4.R.inc(39891);StringBuilder sb = new StringBuilder();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39892);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1umbumblh9yvhs4.R.iget(39893)!=0|true))||(__CLR4_4_1umbumblh9yvhs4.R.iget(39894)==0&false)); i++) {{
            __CLR4_4_1umbumblh9yvhs4.R.inc(39895);sb.append(note);
            __CLR4_4_1umbumblh9yvhs4.R.inc(39896);sb.append("!");
        }

        }__CLR4_4_1umbumblh9yvhs4.R.inc(39897);String s = sb.toString();
        __CLR4_4_1umbumblh9yvhs4.R.inc(39898);BufferedReader br = new BufferedReader(new StringReader(s));

        __CLR4_4_1umbumblh9yvhs4.R.inc(39899);CharacterReader r = new CharacterReader(br);
        __CLR4_4_1umbumblh9yvhs4.R.inc(39900);for (int i = 0; (((i < loopCount)&&(__CLR4_4_1umbumblh9yvhs4.R.iget(39901)!=0|true))||(__CLR4_4_1umbumblh9yvhs4.R.iget(39902)==0&false)); i++) {{
            __CLR4_4_1umbumblh9yvhs4.R.inc(39903);String pull = r.consumeTo('!');
            __CLR4_4_1umbumblh9yvhs4.R.inc(39904);assertEquals(note, pull);
            __CLR4_4_1umbumblh9yvhs4.R.inc(39905);assertEquals('!', r.current());
            __CLR4_4_1umbumblh9yvhs4.R.inc(39906);r.advance();
        }

        }__CLR4_4_1umbumblh9yvhs4.R.inc(39907);assertTrue(r.isEmpty());
    }finally{__CLR4_4_1umbumblh9yvhs4.R.flushNeeded();}}


}
