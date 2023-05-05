/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.integration.servlets;

import org.jsoup.integration.TestServer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Slowly, interminably writes output. For the purposes of testing timeouts and interrupts.
 */
public class SlowRider extends BaseServlet {public static class __CLR4_4_1a1wa1wlh9yvgwx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,13065,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String Url = TestServer.map(SlowRider.class);
    private static final int SleepTime = 2000;
    public static final String MaxTimeParam = "maxTime";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {try{__CLR4_4_1a1wa1wlh9yvgwx.R.inc(13028);
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13029);pause(1000);
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13030);res.setContentType(TextHtml);
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13031);res.setStatus(HttpServletResponse.SC_OK);
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13032);PrintWriter w = res.getWriter();

        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13033);int maxTime = -1;
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13034);String maxTimeP = req.getParameter(MaxTimeParam);
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13035);if ((((maxTimeP != null)&&(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13036)!=0|true))||(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13037)==0&false))) {{
            __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13038);maxTime = Integer.valueOf(maxTimeP);
        }

        }__CLR4_4_1a1wa1wlh9yvgwx.R.inc(13039);long startTime = System.currentTimeMillis();
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13040);while (true) {{
            __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13041);w.println("<p>Are you still there?");
            __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13042);boolean err = w.checkError(); // flush, and check still ok
            __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13043);if ((((err)&&(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13044)!=0|true))||(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13045)==0&false))) {{
                __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13046);log("Remote connection lost");
                __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13047);break;
            }
            }__CLR4_4_1a1wa1wlh9yvgwx.R.inc(13048);if ((((pause(SleepTime))&&(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13049)!=0|true))||(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13050)==0&false))) {__CLR4_4_1a1wa1wlh9yvgwx.R.inc(13051);break;

            }__CLR4_4_1a1wa1wlh9yvgwx.R.inc(13052);if ((((maxTime > 0 && System.currentTimeMillis() > startTime + maxTime)&&(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13053)!=0|true))||(__CLR4_4_1a1wa1wlh9yvgwx.R.iget(13054)==0&false))) {{
                __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13055);w.println("<h1>outatime</h1>");
                __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13056);break;
            }
        }}
    }}finally{__CLR4_4_1a1wa1wlh9yvgwx.R.flushNeeded();}}

    private static boolean pause(int sleepTime) {try{__CLR4_4_1a1wa1wlh9yvgwx.R.inc(13057);
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13058);try {
            __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13059);Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13060);return true;
        }
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13061);return false;
    }finally{__CLR4_4_1a1wa1wlh9yvgwx.R.flushNeeded();}}

    // allow the servlet to run as a main program, for local test
    public static void main(String[] args) {try{__CLR4_4_1a1wa1wlh9yvgwx.R.inc(13062);
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13063);TestServer.start();
        __CLR4_4_1a1wa1wlh9yvgwx.R.inc(13064);System.out.println(Url);
    }finally{__CLR4_4_1a1wa1wlh9yvgwx.R.flushNeeded();}}
}
