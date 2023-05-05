/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.integration.servlets;

import org.jsoup.integration.TestServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectServlet extends BaseServlet {public static class __CLR4_4_1a1ga1glh9yvgwv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,13028,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String Url = TestServer.map(RedirectServlet.class);
    public static final String LocationParam = "loc";
    public static final String CodeParam = "code";
    private static final int DefaultCode = HttpServletResponse.SC_MOVED_TEMPORARILY;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {try{__CLR4_4_1a1ga1glh9yvgwv.R.inc(13012);
        __CLR4_4_1a1ga1glh9yvgwv.R.inc(13013);String location = req.getParameter(LocationParam);
        __CLR4_4_1a1ga1glh9yvgwv.R.inc(13014);if ((((location == null)&&(__CLR4_4_1a1ga1glh9yvgwv.R.iget(13015)!=0|true))||(__CLR4_4_1a1ga1glh9yvgwv.R.iget(13016)==0&false)))
            {__CLR4_4_1a1ga1glh9yvgwv.R.inc(13017);location = "";

        }__CLR4_4_1a1ga1glh9yvgwv.R.inc(13018);int intCode = DefaultCode;
        __CLR4_4_1a1ga1glh9yvgwv.R.inc(13019);String code = req.getParameter(CodeParam);
        __CLR4_4_1a1ga1glh9yvgwv.R.inc(13020);if ((((code != null)&&(__CLR4_4_1a1ga1glh9yvgwv.R.iget(13021)!=0|true))||(__CLR4_4_1a1ga1glh9yvgwv.R.iget(13022)==0&false)))
            {__CLR4_4_1a1ga1glh9yvgwv.R.inc(13023);intCode = Integer.parseInt(code);

        }__CLR4_4_1a1ga1glh9yvgwv.R.inc(13024);res.setHeader("Location", location);
        __CLR4_4_1a1ga1glh9yvgwv.R.inc(13025);res.setStatus(intCode);
    }finally{__CLR4_4_1a1ga1glh9yvgwv.R.flushNeeded();}}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_4_1a1ga1glh9yvgwv.R.inc(13026);
        __CLR4_4_1a1ga1glh9yvgwv.R.inc(13027);doGet(req, res);
    }finally{__CLR4_4_1a1ga1glh9yvgwv.R.flushNeeded();}}
}
