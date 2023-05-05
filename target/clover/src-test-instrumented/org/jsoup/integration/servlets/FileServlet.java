/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.integration.servlets;

import org.jsoup.integration.ParseTest;
import org.jsoup.integration.TestServer;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class FileServlet extends BaseServlet {public static class __CLR4_4_1a0ea0elh9yvgws{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,12995,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String Url = TestServer.map(FileServlet.class);
    public static final String ContentTypeParam = "contentType";
    public static final String LocationParam = "loc";
    public static final String DefaultType = "text/html";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {try{__CLR4_4_1a0ea0elh9yvgws.R.inc(12974);
        __CLR4_4_1a0ea0elh9yvgws.R.inc(12975);String contentType = req.getParameter(ContentTypeParam);
        __CLR4_4_1a0ea0elh9yvgws.R.inc(12976);if ((((contentType == null)&&(__CLR4_4_1a0ea0elh9yvgws.R.iget(12977)!=0|true))||(__CLR4_4_1a0ea0elh9yvgws.R.iget(12978)==0&false)))
            {__CLR4_4_1a0ea0elh9yvgws.R.inc(12979);contentType = DefaultType;
        }__CLR4_4_1a0ea0elh9yvgws.R.inc(12980);String location = req.getPathInfo();

        __CLR4_4_1a0ea0elh9yvgws.R.inc(12981);File file = ParseTest.getFile(location);
        __CLR4_4_1a0ea0elh9yvgws.R.inc(12982);if ((((file.exists())&&(__CLR4_4_1a0ea0elh9yvgws.R.iget(12983)!=0|true))||(__CLR4_4_1a0ea0elh9yvgws.R.iget(12984)==0&false))) {{
            __CLR4_4_1a0ea0elh9yvgws.R.inc(12985);res.setContentType(contentType);
            __CLR4_4_1a0ea0elh9yvgws.R.inc(12986);res.setStatus(HttpServletResponse.SC_OK);

            __CLR4_4_1a0ea0elh9yvgws.R.inc(12987);ServletOutputStream out = res.getOutputStream();
            __CLR4_4_1a0ea0elh9yvgws.R.inc(12988);Files.copy(file.toPath(), out);
            __CLR4_4_1a0ea0elh9yvgws.R.inc(12989);out.flush();
        } }else {{
            __CLR4_4_1a0ea0elh9yvgws.R.inc(12990);res.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }}finally{__CLR4_4_1a0ea0elh9yvgws.R.flushNeeded();}}

    public static String urlTo(String path) {try{__CLR4_4_1a0ea0elh9yvgws.R.inc(12991);
        __CLR4_4_1a0ea0elh9yvgws.R.inc(12992);return Url + path;
    }finally{__CLR4_4_1a0ea0elh9yvgws.R.flushNeeded();}}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_4_1a0ea0elh9yvgws.R.inc(12993);
        __CLR4_4_1a0ea0elh9yvgws.R.inc(12994);doGet(req, res);
    }finally{__CLR4_4_1a0ea0elh9yvgws.R.flushNeeded();}}
}
