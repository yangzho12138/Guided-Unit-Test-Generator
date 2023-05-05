/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package edu.illinois.cs.test.pojo;

import java.util.HashSet;
import java.util.Set;

public class ValuePool{public static class __CLR4_4_118b18blh9yvg93{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,1618,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public Set<Integer> integersPool = new HashSet<>();
    public Set<String> stringsPool = new HashSet<>();
    public Set<Character> charactersPool = new HashSet<>();
    public Set<Long> longsPool = new HashSet<>();
    public Set<Boolean> booleansPool = new HashSet<>();
    public Set<Object> objectsPool = new HashSet<>();

    // add the value into the pool
    public void addValue(Object o){try{__CLR4_4_118b18blh9yvg93.R.inc(1595);
        __CLR4_4_118b18blh9yvg93.R.inc(1596);synchronized (this) {
            __CLR4_4_118b18blh9yvg93.R.inc(1597);if((((o instanceof Integer)&&(__CLR4_4_118b18blh9yvg93.R.iget(1598)!=0|true))||(__CLR4_4_118b18blh9yvg93.R.iget(1599)==0&false))){{
                __CLR4_4_118b18blh9yvg93.R.inc(1600);integersPool.add((Integer) o);
            }}else {__CLR4_4_118b18blh9yvg93.R.inc(1601);if((((o instanceof String)&&(__CLR4_4_118b18blh9yvg93.R.iget(1602)!=0|true))||(__CLR4_4_118b18blh9yvg93.R.iget(1603)==0&false))){{
                __CLR4_4_118b18blh9yvg93.R.inc(1604);stringsPool.add((String) o);
            }}else {__CLR4_4_118b18blh9yvg93.R.inc(1605);if((((o instanceof Character)&&(__CLR4_4_118b18blh9yvg93.R.iget(1606)!=0|true))||(__CLR4_4_118b18blh9yvg93.R.iget(1607)==0&false))){{
                __CLR4_4_118b18blh9yvg93.R.inc(1608);charactersPool.add((Character) o);
            }}else {__CLR4_4_118b18blh9yvg93.R.inc(1609);if((((o instanceof Long)&&(__CLR4_4_118b18blh9yvg93.R.iget(1610)!=0|true))||(__CLR4_4_118b18blh9yvg93.R.iget(1611)==0&false))){{
                __CLR4_4_118b18blh9yvg93.R.inc(1612);longsPool.add((Long) o);
            }}else {__CLR4_4_118b18blh9yvg93.R.inc(1613);if((((o instanceof Boolean)&&(__CLR4_4_118b18blh9yvg93.R.iget(1614)!=0|true))||(__CLR4_4_118b18blh9yvg93.R.iget(1615)==0&false))){{
                __CLR4_4_118b18blh9yvg93.R.inc(1616);booleansPool.add((Boolean) o);
            }}else{{
                __CLR4_4_118b18blh9yvg93.R.inc(1617);objectsPool.add(o);
            }
        }}}}}}
    }finally{__CLR4_4_118b18blh9yvg93.R.flushNeeded();}}
}
