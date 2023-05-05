/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.integration.servlets;

import org.eclipse.jetty.server.Request;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.jsoup.integration.TestServer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Enumeration;

import static org.jsoup.nodes.Entities.escape;

public class EchoServlet extends BaseServlet {public static class __CLR4_4_19yh9yhlh9yvgwq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,12974,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String CodeParam = "code";
    public static final String Url = TestServer.map(EchoServlet.class);
    private static final int DefaultCode = HttpServletResponse.SC_OK;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_4_19yh9yhlh9yvgwq.R.inc(12905);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12906);doIt(req, res);
    }finally{__CLR4_4_19yh9yhlh9yvgwq.R.flushNeeded();}}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_4_19yh9yhlh9yvgwq.R.inc(12907);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12908);doIt(req, res);
    }finally{__CLR4_4_19yh9yhlh9yvgwq.R.flushNeeded();}}

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {try{__CLR4_4_19yh9yhlh9yvgwq.R.inc(12909);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12910);doIt(req, res);
    }finally{__CLR4_4_19yh9yhlh9yvgwq.R.flushNeeded();}}

    private void doIt(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {try{__CLR4_4_19yh9yhlh9yvgwq.R.inc(12911);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12912);int intCode = DefaultCode;
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12913);String code = req.getHeader(CodeParam);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12914);if ((((code != null)&&(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12915)!=0|true))||(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12916)==0&false)))
            {__CLR4_4_19yh9yhlh9yvgwq.R.inc(12917);intCode = Integer.parseInt(code);

        }__CLR4_4_19yh9yhlh9yvgwq.R.inc(12918);boolean isMulti = maybeEnableMultipart(req);

        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12919);res.setContentType(TextHtml);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12920);res.setStatus(intCode);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12921);PrintWriter w = res.getWriter();

        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12922);w.write("<title>Webserver Environment Variables</title>\n" +
            "    <style type=\"text/css\">\n" +
            "      body, td, th {font: 10pt Verdana, Arial, sans-serif; text-align: left}\n" +
            "      th {font-weight: bold}        \n" +
            "    </style>\n" +
            "    <body>\n" +
            "    <table border=\"0\">");

        // some get items
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12923);write(w, "Method", req.getMethod());
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12924);write(w, "Request URI", req.getRequestURI());
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12925);write(w, "Query String", req.getQueryString());

        // request headers (why is it an enumeration?)
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12926);Enumeration<String> headerNames = req.getHeaderNames();
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12927);while ((((headerNames.hasMoreElements())&&(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12928)!=0|true))||(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12929)==0&false))) {{
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12930);String header = headerNames.nextElement();
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12931);Enumeration<String> headers = req.getHeaders(header);
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12932);while ((((headers.hasMoreElements())&&(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12933)!=0|true))||(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12934)==0&false))) {{
                __CLR4_4_19yh9yhlh9yvgwq.R.inc(12935);write(w, header, headers.nextElement());
            }
        }}

        // the request params
        }__CLR4_4_19yh9yhlh9yvgwq.R.inc(12936);Enumeration<String> parameterNames = req.getParameterNames();
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12937);while ((((parameterNames.hasMoreElements())&&(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12938)!=0|true))||(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12939)==0&false))) {{
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12940);String name = parameterNames.nextElement();
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12941);String[] values = req.getParameterValues(name);
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12942);write(w, name, StringUtil.join(values, ", "));
        }

        // post body
        }__CLR4_4_19yh9yhlh9yvgwq.R.inc(12943);ByteBuffer byteBuffer = DataUtil.readToByteBuffer(req.getInputStream(), 0);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12944);String postData = new String(byteBuffer.array(), StandardCharsets.UTF_8);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12945);if ((((!StringUtil.isBlank(postData))&&(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12946)!=0|true))||(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12947)==0&false))) {{
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12948);write(w, "Post Data", postData);
        }

        // file uploads
        }__CLR4_4_19yh9yhlh9yvgwq.R.inc(12949);if ((((isMulti)&&(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12950)!=0|true))||(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12951)==0&false))) {{
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12952);Collection<Part> parts = req.getParts();
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12953);write(w, "Parts", String.valueOf(parts.size()));

            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12954);for (Part part : parts) {{
                __CLR4_4_19yh9yhlh9yvgwq.R.inc(12955);String name = part.getName();
                __CLR4_4_19yh9yhlh9yvgwq.R.inc(12956);write(w, "Part " + name + " ContentType", part.getContentType());
                __CLR4_4_19yh9yhlh9yvgwq.R.inc(12957);write(w, "Part " + name + " Name", name);
                __CLR4_4_19yh9yhlh9yvgwq.R.inc(12958);write(w, "Part " + name + " Filename", part.getSubmittedFileName());
                __CLR4_4_19yh9yhlh9yvgwq.R.inc(12959);write(w, "Part " + name + " Size", String.valueOf(part.getSize()));
                __CLR4_4_19yh9yhlh9yvgwq.R.inc(12960);part.delete();
            }
        }}

        }__CLR4_4_19yh9yhlh9yvgwq.R.inc(12961);w.println("</table>");
    }finally{__CLR4_4_19yh9yhlh9yvgwq.R.flushNeeded();}}

    private static void write(PrintWriter w, String key, String val) {try{__CLR4_4_19yh9yhlh9yvgwq.R.inc(12962);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12963);w.println("<tr><th>" + escape(key) + "</th><td>" + escape(val) + "</td></tr>");
    }finally{__CLR4_4_19yh9yhlh9yvgwq.R.flushNeeded();}}

    // allow the servlet to run as a main program, for local test
    public static void main(String[] args) {try{__CLR4_4_19yh9yhlh9yvgwq.R.inc(12964);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12965);TestServer.start();
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12966);System.out.println(Url);
    }finally{__CLR4_4_19yh9yhlh9yvgwq.R.flushNeeded();}}

    private static boolean maybeEnableMultipart(HttpServletRequest req) {try{__CLR4_4_19yh9yhlh9yvgwq.R.inc(12967);
        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12968);boolean isMulti = req.getContentType() != null
            && req.getContentType().startsWith("multipart/form-data");

        __CLR4_4_19yh9yhlh9yvgwq.R.inc(12969);if ((((isMulti)&&(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12970)!=0|true))||(__CLR4_4_19yh9yhlh9yvgwq.R.iget(12971)==0&false))) {{
            __CLR4_4_19yh9yhlh9yvgwq.R.inc(12972);req.setAttribute(Request.__MULTIPART_CONFIG_ELEMENT, new MultipartConfigElement(
                System.getProperty("java.io.tmpdir")));
        }
        }__CLR4_4_19yh9yhlh9yvgwq.R.inc(12973);return isMulti;
    }finally{__CLR4_4_19yh9yhlh9yvgwq.R.flushNeeded();}}
}
