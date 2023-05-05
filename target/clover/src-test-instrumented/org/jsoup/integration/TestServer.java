/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.integration;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
import org.jsoup.integration.servlets.BaseServlet;

import java.util.concurrent.atomic.AtomicInteger;

public class TestServer {static class __CLR4_4_19x59x5lh9yvgwe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,12888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Server jetty = new Server(0);
    private static final ServletHandler handler = new ServletHandler();
    private static AtomicInteger latch = new AtomicInteger(0);

    static {try{__CLR4_4_19x59x5lh9yvgwe.R.inc(12857);
        __CLR4_4_19x59x5lh9yvgwe.R.inc(12858);jetty.setHandler(handler);
    }finally{__CLR4_4_19x59x5lh9yvgwe.R.flushNeeded();}}

    private TestServer() {try{__CLR4_4_19x59x5lh9yvgwe.R.inc(12859);
    }finally{__CLR4_4_19x59x5lh9yvgwe.R.flushNeeded();}}

    public static void start() {try{__CLR4_4_19x59x5lh9yvgwe.R.inc(12860);
        __CLR4_4_19x59x5lh9yvgwe.R.inc(12861);synchronized (jetty) {
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12862);int count = latch.getAndIncrement();
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12863);if ((((count == 0)&&(__CLR4_4_19x59x5lh9yvgwe.R.iget(12864)!=0|true))||(__CLR4_4_19x59x5lh9yvgwe.R.iget(12865)==0&false))) {{
                __CLR4_4_19x59x5lh9yvgwe.R.inc(12866);try {
                    __CLR4_4_19x59x5lh9yvgwe.R.inc(12867);jetty.start();
                } catch (Exception e) {
                    __CLR4_4_19x59x5lh9yvgwe.R.inc(12868);throw new IllegalStateException(e);
                }
            }
        }}
    }finally{__CLR4_4_19x59x5lh9yvgwe.R.flushNeeded();}}

    public static void stop() {try{__CLR4_4_19x59x5lh9yvgwe.R.inc(12869);
        __CLR4_4_19x59x5lh9yvgwe.R.inc(12870);synchronized (jetty) {
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12871);int count = latch.decrementAndGet();
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12872);if ((((count == 0)&&(__CLR4_4_19x59x5lh9yvgwe.R.iget(12873)!=0|true))||(__CLR4_4_19x59x5lh9yvgwe.R.iget(12874)==0&false))) {{
                __CLR4_4_19x59x5lh9yvgwe.R.inc(12875);try {
                    __CLR4_4_19x59x5lh9yvgwe.R.inc(12876);jetty.stop();
                } catch (Exception e) {
                    __CLR4_4_19x59x5lh9yvgwe.R.inc(12877);throw new IllegalStateException(e);
                }
            }
        }}
    }finally{__CLR4_4_19x59x5lh9yvgwe.R.flushNeeded();}}

    public static String map(Class<? extends BaseServlet> servletClass) {try{__CLR4_4_19x59x5lh9yvgwe.R.inc(12878);
        __CLR4_4_19x59x5lh9yvgwe.R.inc(12879);synchronized (jetty) {
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12880);if ((((!jetty.isStarted())&&(__CLR4_4_19x59x5lh9yvgwe.R.iget(12881)!=0|true))||(__CLR4_4_19x59x5lh9yvgwe.R.iget(12882)==0&false)))
                {__CLR4_4_19x59x5lh9yvgwe.R.inc(12883);start(); // if running out of the test cases

            }__CLR4_4_19x59x5lh9yvgwe.R.inc(12884);String path = "/" + servletClass.getSimpleName();
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12885);handler.addServletWithMapping(servletClass, path + "/*");
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12886);int port = ((ServerConnector) jetty.getConnectors()[0]).getLocalPort();
            __CLR4_4_19x59x5lh9yvgwe.R.inc(12887);return "http://localhost:" + port + path;
        }
    }finally{__CLR4_4_19x59x5lh9yvgwe.R.flushNeeded();}}
}
