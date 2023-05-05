/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

/**
 * Simple validation methods. Designed for jsoup internal use
 */
public final class Validate {public static class __CLR4_4_12bx2bxlh9yvgfn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3072,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public Validate() {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3021);}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the object is not null
     * @param obj object to test
     */
    public static void notNull(Object obj) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3022);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3023);if ((((obj == null)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3024)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3025)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3026);throw new IllegalArgumentException("Object must not be null");
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the object is not null
     * @param obj object to test
     * @param msg message to output if validation fails
     */
    public static void notNull(Object obj, String msg) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3027);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3028);if ((((obj == null)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3029)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3030)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3031);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the value is true
     * @param val object to test
     */
    public static void isTrue(boolean val) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3032);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3033);if ((((!val)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3034)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3035)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3036);throw new IllegalArgumentException("Must be true");
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the value is true
     * @param val object to test
     * @param msg message to output if validation fails
     */
    public static void isTrue(boolean val, String msg) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3037);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3038);if ((((!val)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3039)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3040)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3041);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the value is false
     * @param val object to test
     */
    public static void isFalse(boolean val) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3042);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3043);if ((((val)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3044)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3045)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3046);throw new IllegalArgumentException("Must be false");
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the value is false
     * @param val object to test
     * @param msg message to output if validation fails
     */
    public static void isFalse(boolean val, String msg) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3047);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3048);if ((((val)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3049)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3050)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3051);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     */
    public static void noNullElements(Object[] objects) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3052);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3053);noNullElements(objects, "Array must not contain any null objects");
    }finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     * @param msg message to output if validation fails
     */
    public static void noNullElements(Object[] objects, String msg) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3054);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3055);for (Object obj : objects)
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3056);if ((((obj == null)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3057)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3058)==0&false)))
                {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3059);throw new IllegalArgumentException(msg);
    }}}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the string is not empty
     * @param string the string to test
     */
    public static void notEmpty(String string) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3060);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3061);if ((((string == null || string.length() == 0)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3062)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3063)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3064);throw new IllegalArgumentException("String must not be empty");
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     * Validates that the string is not empty
     * @param string the string to test
     * @param msg message to output if validation fails
     */
    public static void notEmpty(String string, String msg) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3065);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3066);if ((((string == null || string.length() == 0)&&(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3067)!=0|true))||(__CLR4_4_12bx2bxlh9yvgfn.R.iget(3068)==0&false)))
            {__CLR4_4_12bx2bxlh9yvgfn.R.inc(3069);throw new IllegalArgumentException(msg);
    }}finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}

    /**
     Cause a failure.
     @param msg message to output.
     */
    public static void fail(String msg) {try{__CLR4_4_12bx2bxlh9yvgfn.R.inc(3070);
        __CLR4_4_12bx2bxlh9yvgfn.R.inc(3071);throw new IllegalArgumentException(msg);
    }finally{__CLR4_4_12bx2bxlh9yvgfn.R.flushNeeded();}}
}
