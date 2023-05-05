/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementation of ArrayList that watches out for changes to the contents.
 */
public abstract class ChangeNotifyingArrayList<E> extends ArrayList<E> {public static class __CLR4_4_11ju1julh9yvgdj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,2045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public ChangeNotifyingArrayList(int initialCapacity) {
        super(initialCapacity);__CLR4_4_11ju1julh9yvgdj.R.inc(2011);try{__CLR4_4_11ju1julh9yvgdj.R.inc(2010);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    public abstract void onContentsChanged();

    @Override
    public E set(int index, E element) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2012);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2013);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2014);return super.set(index, element);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public boolean add(E e) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2015);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2016);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2017);return super.add(e);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public void add(int index, E element) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2018);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2019);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2020);super.add(index, element);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public E remove(int index) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2021);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2022);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2023);return super.remove(index);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public boolean remove(Object o) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2024);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2025);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2026);return super.remove(o);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public void clear() {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2027);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2028);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2029);super.clear();
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public boolean addAll(Collection<? extends E> c) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2030);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2031);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2032);return super.addAll(c);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2033);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2034);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2035);return super.addAll(index, c);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    protected void removeRange(int fromIndex, int toIndex) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2036);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2037);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2038);super.removeRange(fromIndex, toIndex);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public boolean removeAll(Collection<?> c) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2039);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2040);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2041);return super.removeAll(c);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

    @Override
    public boolean retainAll(Collection<?> c) {try{__CLR4_4_11ju1julh9yvgdj.R.inc(2042);
        __CLR4_4_11ju1julh9yvgdj.R.inc(2043);onContentsChanged();
        __CLR4_4_11ju1julh9yvgdj.R.inc(2044);return super.retainAll(c);
    }finally{__CLR4_4_11ju1julh9yvgdj.R.flushNeeded();}}

}
