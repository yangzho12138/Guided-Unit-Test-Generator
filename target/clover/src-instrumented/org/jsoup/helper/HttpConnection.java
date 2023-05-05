/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Implementation of {@link Connection}.
 * @see org.jsoup.Jsoup#connect(String)
 */
public class HttpConnection implements Connection {public static class __CLR4_4_11pu1pulh9yvgfd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,3021,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static final String CONTENT_ENCODING = "Content-Encoding";
    /**
     * Many users would get caught by not setting a user-agent and therefore getting different responses on their desktop
     * vs in jsoup, which would otherwise default to {@code Java}. So by default, use a desktop UA.
     */
    public static final String DEFAULT_UA =
        "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
    private static final String USER_AGENT = "User-Agent";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";
    public static final String FORM_URL_ENCODED = "application/x-www-form-urlencoded";
    private static final int HTTP_TEMP_REDIR = 307; // http/1.1 temporary redirect, not in Java's set.
    private static final String DefaultUploadType = "application/octet-stream";

    public static Connection connect(String url) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2226);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2227);Connection con = new HttpConnection();
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2228);con.url(url);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2229);return con;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public static Connection connect(URL url) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2230);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2231);Connection con = new HttpConnection();
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2232);con.url(url);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2233);return con;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public HttpConnection() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2234);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2235);req = new Request();
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2236);res = new Response();
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    /**
     * Encodes the input URL into a safe ASCII URL string
     * @param url unescaped URL
     * @return escaped URL
     */
	private static String encodeUrl(String url) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2237);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2238);try {
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2239);URL u = new URL(url);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2240);return encodeUrl(u).toExternalForm();
        } catch (Exception e) {
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2241);return url;
        }
	}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    static URL encodeUrl(URL u) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2242);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2243);try {
            //  odd way to encode urls, but it works!
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2244);String urlS = u.toExternalForm(); // URL external form may have spaces which is illegal in new URL() (odd asymmetry)
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2245);urlS = urlS.replaceAll(" ", "%20");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2246);final URI uri = new URI(urlS);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2247);return new URL(uri.toASCIIString());
        } catch (URISyntaxException | MalformedURLException e) {
            // give up and return the original input
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2248);return u;
        }
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    private static String encodeMimeName(String val) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2249);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2250);if ((((val == null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2251)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2252)==0&false)))
            {__CLR4_4_11pu1pulh9yvgfd.R.inc(2253);return null;
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2254);return val.replaceAll("\"", "%22");
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    private Connection.Request req;
    private Connection.Response res;

    public Connection url(URL url) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2255);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2256);req.url(url);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2257);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection url(String url) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2258);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2259);Validate.notEmpty(url, "Must supply a valid URL");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2260);try {
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2261);req.url(new URL(encodeUrl(url)));
        } catch (MalformedURLException e) {
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2262);throw new IllegalArgumentException("Malformed URL: " + url, e);
        }
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2263);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection proxy(Proxy proxy) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2264);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2265);req.proxy(proxy);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2266);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection proxy(String host, int port) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2267);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2268);req.proxy(host, port);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2269);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection userAgent(String userAgent) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2270);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2271);Validate.notNull(userAgent, "User agent must not be null");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2272);req.header(USER_AGENT, userAgent);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2273);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection timeout(int millis) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2274);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2275);req.timeout(millis);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2276);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection maxBodySize(int bytes) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2277);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2278);req.maxBodySize(bytes);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2279);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection followRedirects(boolean followRedirects) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2280);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2281);req.followRedirects(followRedirects);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2282);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection referrer(String referrer) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2283);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2284);Validate.notNull(referrer, "Referrer must not be null");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2285);req.header("Referer", referrer);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2286);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection method(Method method) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2287);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2288);req.method(method);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2289);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection ignoreHttpErrors(boolean ignoreHttpErrors) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2290);
		__CLR4_4_11pu1pulh9yvgfd.R.inc(2291);req.ignoreHttpErrors(ignoreHttpErrors);
		__CLR4_4_11pu1pulh9yvgfd.R.inc(2292);return this;
	}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection ignoreContentType(boolean ignoreContentType) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2293);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2294);req.ignoreContentType(ignoreContentType);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2295);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}


    public Connection data(String key, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2296);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2297);req.data(KeyVal.create(key, value));
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2298);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection sslSocketFactory(SSLSocketFactory sslSocketFactory) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2299);
	    __CLR4_4_11pu1pulh9yvgfd.R.inc(2300);req.sslSocketFactory(sslSocketFactory);
	    __CLR4_4_11pu1pulh9yvgfd.R.inc(2301);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection data(String key, String filename, InputStream inputStream) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2302);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2303);req.data(KeyVal.create(key, filename, inputStream));
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2304);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    @Override
    public Connection data(String key, String filename, InputStream inputStream, String contentType) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2305);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2306);req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2307);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection data(Map<String, String> data) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2308);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2309);Validate.notNull(data, "Data map must not be null");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2310);for (Map.Entry<String, String> entry : data.entrySet()) {{
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2311);req.data(KeyVal.create(entry.getKey(), entry.getValue()));
        }
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2312);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection data(String... keyvals) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2313);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2314);Validate.notNull(keyvals, "Data key value pairs must not be null");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2315);Validate.isTrue(keyvals.length %2 == 0, "Must supply an even number of key value pairs");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2316);for (int i = 0; (((i < keyvals.length)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2317)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2318)==0&false)); i += 2) {{
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2319);String key = keyvals[i];
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2320);String value = keyvals[i+1];
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2321);Validate.notEmpty(key, "Data key must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2322);Validate.notNull(value, "Data value must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2323);req.data(KeyVal.create(key, value));
        }
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2324);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection data(Collection<Connection.KeyVal> data) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2325);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2326);Validate.notNull(data, "Data collection must not be null");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2327);for (Connection.KeyVal entry: data) {{
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2328);req.data(entry);
        }
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2329);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection.KeyVal data(String key) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2330);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2331);Validate.notEmpty(key, "Data key must not be empty");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2332);for (Connection.KeyVal keyVal : request().data()) {{
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2333);if ((((keyVal.key().equals(key))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2334)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2335)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2336);return keyVal;
        }}
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2337);return null;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection requestBody(String body) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2338);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2339);req.requestBody(body);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2340);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection header(String name, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2341);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2342);req.header(name, value);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2343);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection headers(Map<String,String> headers) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2344);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2345);Validate.notNull(headers, "Header map must not be null");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2346);for (Map.Entry<String,String> entry : headers.entrySet()) {{
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2347);req.header(entry.getKey(),entry.getValue());
        }
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2348);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection cookie(String name, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2349);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2350);req.cookie(name, value);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2351);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection cookies(Map<String, String> cookies) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2352);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2353);Validate.notNull(cookies, "Cookie map must not be null");
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2354);for (Map.Entry<String, String> entry : cookies.entrySet()) {{
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2355);req.cookie(entry.getKey(), entry.getValue());
        }
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2356);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection parser(Parser parser) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2357);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2358);req.parser(parser);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2359);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Document get() throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2360);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2361);req.method(Method.GET);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2362);execute();
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2363);return res.parse();
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Document post() throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2364);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2365);req.method(Method.POST);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2366);execute();
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2367);return res.parse();
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection.Response execute() throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2368);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2369);res = Response.execute(req);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2370);return res;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection.Request request() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2371);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2372);return req;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection request(Connection.Request request) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2373);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2374);req = request;
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2375);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection.Response response() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2376);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2377);return res;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection response(Connection.Response response) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2378);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2379);res = response;
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2380);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public Connection postDataCharset(String charset) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2381);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2382);req.postDataCharset(charset);
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2383);return this;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    @SuppressWarnings({"unchecked"})
    private static abstract class Base<T extends Connection.Base> implements Connection.Base<T> {
        URL url;
        Method method;
        Map<String, List<String>> headers;
        Map<String, String> cookies;

        private Base() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2384);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2385);headers = new LinkedHashMap<>();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2386);cookies = new LinkedHashMap<>();
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public URL url() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2387);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2388);return url;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public T url(URL url) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2389);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2390);Validate.notNull(url, "URL must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2391);this.url = url;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2392);return (T) this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Method method() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2393);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2394);return method;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public T method(Method method) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2395);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2396);Validate.notNull(method, "Method must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2397);this.method = method;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2398);return (T) this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String header(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2399);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2400);Validate.notNull(name, "Header name must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2401);List<String> vals = getHeadersCaseInsensitive(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2402);if ((((vals.size() > 0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2403)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2404)==0&false))) {{
                // https://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2405);return StringUtil.join(vals, ", ");
            }

            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2406);return null;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public T addHeader(String name, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2407);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2408);Validate.notEmpty(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2409);value = (((value == null )&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2410)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2411)==0&false))? "" : value;

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2412);List<String> values = headers(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2413);if ((((values.isEmpty())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2414)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2415)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2416);values = new ArrayList<>();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2417);headers.put(name, values);
            }
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2418);values.add(fixHeaderEncoding(value));

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2419);return (T) this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public List<String> headers(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2420);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2421);Validate.notEmpty(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2422);return getHeadersCaseInsensitive(name);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private static String fixHeaderEncoding(String val) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2423);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2424);try {
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2425);byte[] bytes = val.getBytes("ISO-8859-1");
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2426);if ((((!looksLikeUtf8(bytes))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2427)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2428)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2429);return val;
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2430);return new String(bytes, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                // shouldn't happen as these both always exist
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2431);return val;
            }
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private static boolean looksLikeUtf8(byte[] input) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2432);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2433);int i = 0;
            // BOM:
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2434);if ((((input.length >= 3 && (input[0] & 0xFF) == 0xEF
                && (input[1] & 0xFF) == 0xBB & (input[2] & 0xFF) == 0xBF)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2435)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2436)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2437);i = 3;
            }

            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2438);int end;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2439);for (int j = input.length; (((i < j)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2440)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2441)==0&false)); ++i) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2442);int o = input[i];
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2443);if (((((o & 0x80) == 0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2444)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2445)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2446);continue; // ASCII
                }

                // UTF-8 leading:
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2447);if (((((o & 0xE0) == 0xC0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2448)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2449)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2450);end = i + 1;
                } }else {__CLR4_4_11pu1pulh9yvgfd.R.inc(2451);if (((((o & 0xF0) == 0xE0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2452)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2453)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2454);end = i + 2;
                } }else {__CLR4_4_11pu1pulh9yvgfd.R.inc(2455);if (((((o & 0xF8) == 0xF0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2456)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2457)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2458);end = i + 3;
                } }else {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2459);return false;
                }

                }}}__CLR4_4_11pu1pulh9yvgfd.R.inc(2460);if ((((end >= input.length)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2461)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2462)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2463);return false;

                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2464);while ((((i < end)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2465)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2466)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2467);i++;
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2468);o = input[i];
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2469);if (((((o & 0xC0) != 0x80)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2470)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2471)==0&false))) {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2472);return false;
                    }
                }}
            }}
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2473);return true;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public T header(String name, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2474);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2475);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2476);removeHeader(name); // ensures we don't get an "accept-encoding" and a "Accept-Encoding"
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2477);addHeader(name, value);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2478);return (T) this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public boolean hasHeader(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2479);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2480);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2481);return !getHeadersCaseInsensitive(name).isEmpty();
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        /**
         * Test if the request has a header with this value (case insensitive).
         */
        public boolean hasHeaderWithValue(String name, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2482);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2483);Validate.notEmpty(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2484);Validate.notEmpty(value);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2485);List<String> values = headers(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2486);for (String candidate : values) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2487);if ((((value.equalsIgnoreCase(candidate))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2488)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2489)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2490);return true;
            }}
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2491);return false;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public T removeHeader(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2492);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2493);Validate.notEmpty(name, "Header name must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2494);Map.Entry<String, List<String>> entry = scanHeaders(name); // remove is case insensitive too
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2495);if ((((entry != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2496)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2497)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2498);headers.remove(entry.getKey()); // ensures correct case
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2499);return (T) this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Map<String, String> headers() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2500);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2501);LinkedHashMap<String, String> map = new LinkedHashMap<>(headers.size());
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2502);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2503);String header = entry.getKey();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2504);List<String> values = entry.getValue();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2505);if ((((values.size() > 0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2506)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2507)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2508);map.put(header, values.get(0));
            }}
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2509);return map;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public Map<String, List<String>> multiHeaders() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2510);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2511);return headers;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private List<String> getHeadersCaseInsensitive(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2512);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2513);Validate.notNull(name);

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2514);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2515);if ((((name.equalsIgnoreCase(entry.getKey()))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2516)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2517)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2518);return entry.getValue();
            }}

            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2519);return Collections.emptyList();
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private Map.Entry<String, List<String>> scanHeaders(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2520);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2521);String lc = lowerCase(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2522);for (Map.Entry<String, List<String>> entry : headers.entrySet()) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2523);if ((((lowerCase(entry.getKey()).equals(lc))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2524)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2525)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2526);return entry;
            }}
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2527);return null;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String cookie(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2528);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2529);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2530);return cookies.get(name);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public T cookie(String name, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2531);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2532);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2533);Validate.notNull(value, "Cookie value must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2534);cookies.put(name, value);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2535);return (T) this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public boolean hasCookie(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2536);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2537);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2538);return cookies.containsKey(name);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public T removeCookie(String name) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2539);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2540);Validate.notEmpty(name, "Cookie name must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2541);cookies.remove(name);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2542);return (T) this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Map<String, String> cookies() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2543);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2544);return cookies;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}
    }

    public static class Request extends HttpConnection.Base<Connection.Request> implements Connection.Request {
        private Proxy proxy; // nullable
        private int timeoutMilliseconds;
        private int maxBodySizeBytes;
        private boolean followRedirects;
        private Collection<Connection.KeyVal> data;
        private String body = null;
        private boolean ignoreHttpErrors = false;
        private boolean ignoreContentType = false;
        private Parser parser;
        private boolean parserDefined = false; // called parser(...) vs initialized in ctor
        private String postDataCharset = DataUtil.defaultCharset;
        private SSLSocketFactory sslSocketFactory;

        Request() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2545);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2546);timeoutMilliseconds = 30000; // 30 seconds
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2547);maxBodySizeBytes = 1024 * 1024; // 1MB
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2548);followRedirects = true;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2549);data = new ArrayList<>();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2550);method = Method.GET;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2551);addHeader("Accept-Encoding", "gzip");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2552);addHeader(USER_AGENT, DEFAULT_UA);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2553);parser = Parser.htmlParser();
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Proxy proxy() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2554);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2555);return proxy;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Request proxy(Proxy proxy) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2556);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2557);this.proxy = proxy;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2558);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Request proxy(String host, int port) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2559);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2560);this.proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(host, port));
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2561);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public int timeout() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2562);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2563);return timeoutMilliseconds;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Request timeout(int millis) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2564);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2565);Validate.isTrue(millis >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2566);timeoutMilliseconds = millis;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2567);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public int maxBodySize() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2568);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2569);return maxBodySizeBytes;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Connection.Request maxBodySize(int bytes) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2570);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2571);Validate.isTrue(bytes >= 0, "maxSize must be 0 (unlimited) or larger");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2572);maxBodySizeBytes = bytes;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2573);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public boolean followRedirects() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2574);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2575);return followRedirects;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Connection.Request followRedirects(boolean followRedirects) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2576);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2577);this.followRedirects = followRedirects;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2578);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public boolean ignoreHttpErrors() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2579);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2580);return ignoreHttpErrors;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public SSLSocketFactory sslSocketFactory() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2581);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2582);return sslSocketFactory;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public void sslSocketFactory(SSLSocketFactory sslSocketFactory) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2583);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2584);this.sslSocketFactory = sslSocketFactory;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Connection.Request ignoreHttpErrors(boolean ignoreHttpErrors) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2585);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2586);this.ignoreHttpErrors = ignoreHttpErrors;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2587);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public boolean ignoreContentType() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2588);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2589);return ignoreContentType;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Connection.Request ignoreContentType(boolean ignoreContentType) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2590);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2591);this.ignoreContentType = ignoreContentType;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2592);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Request data(Connection.KeyVal keyval) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2593);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2594);Validate.notNull(keyval, "Key val must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2595);data.add(keyval);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2596);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Collection<Connection.KeyVal> data() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2597);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2598);return data;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Connection.Request requestBody(String body) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2599);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2600);this.body = body;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2601);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String requestBody() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2602);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2603);return body;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Request parser(Parser parser) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2604);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2605);this.parser = parser;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2606);parserDefined = true;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2607);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Parser parser() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2608);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2609);return parser;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Connection.Request postDataCharset(String charset) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2610);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2611);Validate.notNull(charset, "Charset must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2612);if ((((!Charset.isSupported(charset))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2613)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2614)==0&false))) {__CLR4_4_11pu1pulh9yvgfd.R.inc(2615);throw new IllegalCharsetNameException(charset);
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2616);this.postDataCharset = charset;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2617);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String postDataCharset() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2618);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2619);return postDataCharset;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}
    }

    public static class Response extends HttpConnection.Base<Connection.Response> implements Connection.Response {
        private static final int MAX_REDIRECTS = 20;
        private static final String LOCATION = "Location";
        private int statusCode;
        private String statusMessage;
        private ByteBuffer byteData;
        private InputStream bodyStream;
        private HttpURLConnection conn;
        private String charset;
        private String contentType;
        private boolean executed = false;
        private boolean inputStreamRead = false;
        private int numRedirects = 0;
        private Connection.Request req;

        /*
         * Matches XML content types (like text/xml, application/xhtml+xml;charset=UTF8, etc)
         */
        private static final Pattern xmlContentTypeRxp = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        Response() {
            super();__CLR4_4_11pu1pulh9yvgfd.R.inc(2621);try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2620);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private Response(Response previousResponse) throws IOException {
            super();__CLR4_4_11pu1pulh9yvgfd.R.inc(2623);try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2622);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2624);if ((((previousResponse != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2625)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2626)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2627);numRedirects = previousResponse.numRedirects + 1;
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2628);if ((((numRedirects >= MAX_REDIRECTS)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2629)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2630)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2631);throw new IOException(String.format("Too many redirects occurred trying to load URL %s", previousResponse.url()));
            }}
        }}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        static Response execute(Connection.Request req) throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2632);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2633);return execute(req, null);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        static Response execute(Connection.Request req, Response previousResponse) throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2634);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2635);Validate.notNull(req, "Request must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2636);Validate.notNull(req.url(), "URL must be specified to connect");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2637);String protocol = req.url().getProtocol();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2638);if ((((!protocol.equals("http") && !protocol.equals("https"))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2639)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2640)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2641);throw new MalformedURLException("Only http & https protocols supported");
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2642);final boolean methodHasBody = req.method().hasBody();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2643);final boolean hasRequestBody = req.requestBody() != null;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2644);if ((((!methodHasBody)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2645)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2646)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2647);Validate.isFalse(hasRequestBody, "Cannot set a request body for HTTP method " + req.method());

            // set up the request for execution
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2648);String mimeBoundary = null;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2649);if ((((req.data().size() > 0 && (!methodHasBody || hasRequestBody))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2650)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2651)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2652);serialiseRequestUrl(req);
            }else {__CLR4_4_11pu1pulh9yvgfd.R.inc(2653);if ((((methodHasBody)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2654)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2655)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2656);mimeBoundary = setOutputContentType(req);

            }}__CLR4_4_11pu1pulh9yvgfd.R.inc(2657);long startTime = System.nanoTime();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2658);HttpURLConnection conn = createConnection(req);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2659);Response res;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2660);try {
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2661);conn.connect();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2662);if ((((conn.getDoOutput())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2663)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2664)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2665);writePost(req, conn.getOutputStream(), mimeBoundary);

                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2666);int status = conn.getResponseCode();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2667);res = new Response(previousResponse);
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2668);res.setupFromConnection(conn, previousResponse);
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2669);res.req = req;

                // redirect if there's a location header (from 3xx, or 201 etc)
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2670);if ((((res.hasHeader(LOCATION) && req.followRedirects())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2671)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2672)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2673);if ((((status != HTTP_TEMP_REDIR)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2674)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2675)==0&false))) {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2676);req.method(Method.GET); // always redirect with a get. any data param from original req are dropped.
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2677);req.data().clear();
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2678);req.requestBody(null);
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2679);req.removeHeader(CONTENT_TYPE);
                    }

                    }__CLR4_4_11pu1pulh9yvgfd.R.inc(2680);String location = res.header(LOCATION);
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2681);if ((((location.startsWith("http:/") && location.charAt(6) != '/')&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2682)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2683)==0&false))) // fix broken Location: http:/temp/AAG_New/en/index.php
                        {__CLR4_4_11pu1pulh9yvgfd.R.inc(2684);location = location.substring(6);
                    }__CLR4_4_11pu1pulh9yvgfd.R.inc(2685);URL redir = StringUtil.resolve(req.url(), location);
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2686);req.url(encodeUrl(redir));

                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2687);for (Map.Entry<String, String> cookie : res.cookies.entrySet()) {{ // add response cookies to request (for e.g. login posts)
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2688);req.cookie(cookie.getKey(), cookie.getValue());
                    }
                    }__CLR4_4_11pu1pulh9yvgfd.R.inc(2689);return execute(req, res);
                }
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2690);if (((((status < 200 || status >= 400) && !req.ignoreHttpErrors())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2691)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2692)==0&false)))
                        {__CLR4_4_11pu1pulh9yvgfd.R.inc(2693);throw new HttpStatusException("HTTP error fetching URL", status, req.url().toString());

                // check that we can handle the returned content type; if not, abort before fetching it
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2694);String contentType = res.contentType();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2695);if ((((contentType != null
                        && !req.ignoreContentType()
                        && !contentType.startsWith("text/")
                        && !xmlContentTypeRxp.matcher(contentType).matches()
                        )&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2696)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2697)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2698);throw new UnsupportedMimeTypeException("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml",
                            contentType, req.url().toString());

                // switch to the XML parser if content type is xml and not parser not explicitly set
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2699);if ((((contentType != null && xmlContentTypeRxp.matcher(contentType).matches())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2700)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2701)==0&false))) {{
                    // only flip it if a HttpConnection.Request (i.e. don't presume other impls want it):
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2702);if ((((req instanceof HttpConnection.Request && !((Request) req).parserDefined)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2703)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2704)==0&false))) {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2705);req.parser(Parser.xmlParser());
                    }
                }}

                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2706);res.charset = DataUtil.getCharsetFromContentType(res.contentType); // may be null, readInputStream deals with it
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2707);if ((((conn.getContentLength() != 0 && req.method() != HEAD)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2708)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2709)==0&false))) {{ // -1 means unknown, chunked. sun throws an IO exception on 500 response with no content when trying to read body
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2710);res.bodyStream = null;
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2711);res.bodyStream = (((conn.getErrorStream() != null )&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2712)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2713)==0&false))? conn.getErrorStream() : conn.getInputStream();
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2714);if ((((res.hasHeaderWithValue(CONTENT_ENCODING, "gzip"))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2715)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2716)==0&false))) {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2717);res.bodyStream = new GZIPInputStream(res.bodyStream);
                    } }else {__CLR4_4_11pu1pulh9yvgfd.R.inc(2718);if ((((res.hasHeaderWithValue(CONTENT_ENCODING, "deflate"))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2719)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2720)==0&false))) {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2721);res.bodyStream = new InflaterInputStream(res.bodyStream, new Inflater(true));
                    }
                    }}__CLR4_4_11pu1pulh9yvgfd.R.inc(2722);res.bodyStream = ConstrainableInputStream
                        .wrap(res.bodyStream, DataUtil.bufferSize, req.maxBodySize())
                        .timeout(startTime, req.timeout())
                    ;
                } }else {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2723);res.byteData = DataUtil.emptyByteBuffer();
                }
            }} catch (IOException e){
                // per Java's documentation, this is not necessary, and precludes keepalives. However in practice,
                // connection errors will not be released quickly enough and can cause a too many open files error.
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2724);conn.disconnect();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2725);throw e;
            }

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2726);res.executed = true;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2727);return res;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public int statusCode() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2728);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2729);return statusCode;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String statusMessage() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2730);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2731);return statusMessage;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String charset() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2732);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2733);return charset;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Response charset(String charset) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2734);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2735);this.charset = charset;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2736);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String contentType() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2737);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2738);return contentType;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public Document parse() throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2739);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2740);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2741);if ((((byteData != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2742)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2743)==0&false))) {{ // bytes have been read in to the buffer, parse that
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2744);bodyStream = new ByteArrayInputStream(byteData.array());
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2745);inputStreamRead = false; // ok to reparse if in bytes
            }
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2746);Validate.isFalse(inputStreamRead, "Input stream already read and parsed, cannot re-read.");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2747);Document doc = DataUtil.parseInputStream(bodyStream, charset, url.toExternalForm(), req.parser());
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2748);charset = doc.outputSettings().charset().name(); // update charset from meta-equiv, possibly
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2749);inputStreamRead = true;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2750);safeClose();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2751);return doc;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private void prepareByteData() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2752);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2753);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2754);if ((((byteData == null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2755)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2756)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2757);Validate.isFalse(inputStreamRead, "Request has already been read (with .parse())");
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2758);try {
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2759);byteData = DataUtil.readToByteBuffer(bodyStream, req.maxBodySize());
                } catch (IOException e) {
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2760);throw new UncheckedIOException(e);
                } finally {
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2761);inputStreamRead = true;
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2762);safeClose();
                }
            }
        }}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String body() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2763);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2764);prepareByteData();
            // charset gets set from header on execute, and from meta-equiv on parse. parse may not have happened yet
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2765);String body;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2766);if ((((charset == null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2767)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2768)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2769);body = Charset.forName(DataUtil.defaultCharset).decode(byteData).toString();
            }else
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2770);body = Charset.forName(charset).decode(byteData).toString();
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2771);((Buffer)byteData).rewind(); // cast to avoid covariant return type change in jdk9
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2772);return body;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public byte[] bodyAsBytes() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2773);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2774);prepareByteData();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2775);return byteData.array();
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public Connection.Response bufferUp() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2776);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2777);prepareByteData();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2778);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public BufferedInputStream bodyStream() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2779);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2780);Validate.isTrue(executed, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2781);Validate.isFalse(inputStreamRead, "Request has already been read");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2782);inputStreamRead = true;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2783);return ConstrainableInputStream.wrap(bodyStream, DataUtil.bufferSize, req.maxBodySize());
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        // set up connection defaults, and details from request
        private static HttpURLConnection createConnection(Connection.Request req) throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2784);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2785);final HttpURLConnection conn = (HttpURLConnection) (
                (((req.proxy() == null )&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2786)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2787)==0&false))?
                req.url().openConnection() :
                req.url().openConnection(req.proxy())
            );

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2788);conn.setRequestMethod(req.method().name());
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2789);conn.setInstanceFollowRedirects(false); // don't rely on native redirection support
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2790);conn.setConnectTimeout(req.timeout());
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2791);conn.setReadTimeout(req.timeout() / 2); // gets reduced after connection is made and status is read

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2792);if ((((req.sslSocketFactory() != null && conn instanceof HttpsURLConnection)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2793)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2794)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2795);((HttpsURLConnection) conn).setSSLSocketFactory(req.sslSocketFactory());
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2796);if ((((req.method().hasBody())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2797)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2798)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2799);conn.setDoOutput(true);
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2800);if ((((req.cookies().size() > 0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2801)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2802)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2803);conn.addRequestProperty("Cookie", getRequestCookieString(req));
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2804);for (Map.Entry<String, List<String>> header : req.multiHeaders().entrySet()) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2805);for (String value : header.getValue()) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2806);conn.addRequestProperty(header.getKey(), value);
                }
            }}
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2807);return conn;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        /**
         * Call on completion of stream read, to close the body (or error) stream
         */
        private void safeClose() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2808);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2809);if ((((conn != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2810)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2811)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2812);conn.disconnect();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2813);conn = null;
            }
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2814);if ((((bodyStream != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2815)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2816)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2817);try {
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2818);bodyStream.close();
                } catch (IOException e) {
                    // no-op
                } finally {
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2819);bodyStream = null;
                }
            }
        }}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        // set up url, method, header, cookies
        private void setupFromConnection(HttpURLConnection conn, HttpConnection.Response previousResponse) throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2820);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2821);this.conn = conn;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2822);method = Method.valueOf(conn.getRequestMethod());
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2823);url = conn.getURL();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2824);statusCode = conn.getResponseCode();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2825);statusMessage = conn.getResponseMessage();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2826);contentType = conn.getContentType();

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2827);Map<String, List<String>> resHeaders = createHeaderMap(conn);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2828);processResponseHeaders(resHeaders);

            // if from a redirect, map previous response cookies into this response
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2829);if ((((previousResponse != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2830)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2831)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2832);for (Map.Entry<String, String> prevCookie : previousResponse.cookies().entrySet()) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2833);if ((((!hasCookie(prevCookie.getKey()))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2834)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2835)==0&false)))
                        {__CLR4_4_11pu1pulh9yvgfd.R.inc(2836);cookie(prevCookie.getKey(), prevCookie.getValue());
                }}
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2837);previousResponse.safeClose();
            }
        }}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private static LinkedHashMap<String, List<String>> createHeaderMap(HttpURLConnection conn) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2838);
            // the default sun impl of conn.getHeaderFields() returns header values out of order
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2839);final LinkedHashMap<String, List<String>> headers = new LinkedHashMap<>();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2840);int i = 0;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2841);while (true) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2842);final String key = conn.getHeaderFieldKey(i);
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2843);final String val = conn.getHeaderField(i);
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2844);if ((((key == null && val == null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2845)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2846)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2847);break;
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2848);i++;
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2849);if ((((key == null || val == null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2850)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2851)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2852);continue; // skip http1.1 line

                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2853);if ((((headers.containsKey(key))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2854)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2855)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2856);headers.get(key).add(val);
                }else {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2857);final ArrayList<String> vals = new ArrayList<>();
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2858);vals.add(val);
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2859);headers.put(key, vals);
                }
            }}
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2860);return headers;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        void processResponseHeaders(Map<String, List<String>> resHeaders) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2861);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2862);for (Map.Entry<String, List<String>> entry : resHeaders.entrySet()) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2863);String name = entry.getKey();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2864);if ((((name == null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2865)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2866)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2867);continue; // http/1.1 line

                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2868);List<String> values = entry.getValue();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2869);if ((((name.equalsIgnoreCase("Set-Cookie"))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2870)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2871)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2872);for (String value : values) {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2873);if ((((value == null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2874)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2875)==0&false)))
                            {__CLR4_4_11pu1pulh9yvgfd.R.inc(2876);continue;
                        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2877);TokenQueue cd = new TokenQueue(value);
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2878);String cookieName = cd.chompTo("=").trim();
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2879);String cookieVal = cd.consumeTo(";").trim();
                        // ignores path, date, domain, validateTLSCertificates et al. req'd?
                        // name not blank, value not null
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2880);if ((((cookieName.length() > 0)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2881)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2882)==0&false)))
                            {__CLR4_4_11pu1pulh9yvgfd.R.inc(2883);cookie(cookieName, cookieVal);
                    }}
                }}
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2884);for (String value : values) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2885);addHeader(name, value);
                }
            }}
        }}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private static String setOutputContentType(final Connection.Request req) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2886);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2887);String bound = null;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2888);if ((((req.hasHeader(CONTENT_TYPE))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2889)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2890)==0&false))) {{
                // no-op; don't add content type as already set (e.g. for requestBody())
                // todo - if content type already set, we could add charset

                // if user has set content type to multipart/form-data, auto add boundary.
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2891);if((((req.header(CONTENT_TYPE).contains(MULTIPART_FORM_DATA) &&
                        !req.header(CONTENT_TYPE).contains("boundary"))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2892)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2893)==0&false))) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2894);bound = DataUtil.mimeBoundary();
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2895);req.header(CONTENT_TYPE, MULTIPART_FORM_DATA + "; boundary=" + bound);
                }

            }}
            }else {__CLR4_4_11pu1pulh9yvgfd.R.inc(2896);if ((((needsMultipart(req))&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2897)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2898)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2899);bound = DataUtil.mimeBoundary();
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2900);req.header(CONTENT_TYPE, MULTIPART_FORM_DATA + "; boundary=" + bound);
            } }else {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2901);req.header(CONTENT_TYPE, FORM_URL_ENCODED + "; charset=" + req.postDataCharset());
            }
            }}__CLR4_4_11pu1pulh9yvgfd.R.inc(2902);return bound;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private static void writePost(final Connection.Request req, final OutputStream outputStream, final String bound) throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2903);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2904);final Collection<Connection.KeyVal> data = req.data();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2905);final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(outputStream, req.postDataCharset()));

            __CLR4_4_11pu1pulh9yvgfd.R.inc(2906);if ((((bound != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2907)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2908)==0&false))) {{
                // boundary will be set if we're in multipart mode
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2909);for (Connection.KeyVal keyVal : data) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2910);w.write("--");
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2911);w.write(bound);
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2912);w.write("\r\n");
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2913);w.write("Content-Disposition: form-data; name=\"");
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2914);w.write(encodeMimeName(keyVal.key())); // encodes " to %22
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2915);w.write("\"");
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2916);if ((((keyVal.hasInputStream())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2917)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2918)==0&false))) {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2919);w.write("; filename=\"");
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2920);w.write(encodeMimeName(keyVal.value()));
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2921);w.write("\"\r\nContent-Type: ");
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2922);w.write((((keyVal.contentType() != null )&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2923)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2924)==0&false))? keyVal.contentType() : DefaultUploadType);
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2925);w.write("\r\n\r\n");
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2926);w.flush(); // flush
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2927);DataUtil.crossStreams(keyVal.inputStream(), outputStream);
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2928);outputStream.flush();
                    } }else {{
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2929);w.write("\r\n\r\n");
                        __CLR4_4_11pu1pulh9yvgfd.R.inc(2930);w.write(keyVal.value());
                    }
                    }__CLR4_4_11pu1pulh9yvgfd.R.inc(2931);w.write("\r\n");
                }
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2932);w.write("--");
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2933);w.write(bound);
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2934);w.write("--");
            } }else {__CLR4_4_11pu1pulh9yvgfd.R.inc(2935);if ((((req.requestBody() != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2936)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2937)==0&false))) {{
                // data will be in query string, we're sending a plaintext body
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2938);w.write(req.requestBody());
            }
            }else {{
                // regular form data (application/x-www-form-urlencoded)
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2939);boolean first = true;
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2940);for (Connection.KeyVal keyVal : data) {{
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2941);if ((((!first)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2942)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2943)==0&false)))
                        {__CLR4_4_11pu1pulh9yvgfd.R.inc(2944);w.append('&');
                    }else
                        {__CLR4_4_11pu1pulh9yvgfd.R.inc(2945);first = false;

                    }__CLR4_4_11pu1pulh9yvgfd.R.inc(2946);w.write(URLEncoder.encode(keyVal.key(), req.postDataCharset()));
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2947);w.write('=');
                    __CLR4_4_11pu1pulh9yvgfd.R.inc(2948);w.write(URLEncoder.encode(keyVal.value(), req.postDataCharset()));
                }
            }}
            }}__CLR4_4_11pu1pulh9yvgfd.R.inc(2949);w.close();
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private static String getRequestCookieString(Connection.Request req) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2950);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2951);StringBuilder sb = StringUtil.borrowBuilder();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2952);boolean first = true;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2953);for (Map.Entry<String, String> cookie : req.cookies().entrySet()) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2954);if ((((!first)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2955)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2956)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2957);sb.append("; ");
                }else
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2958);first = false;
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2959);sb.append(cookie.getKey()).append('=').append(cookie.getValue());
                // todo: spec says only ascii, no escaping / encoding defined. validate on set? or escape somehow here?
            }
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2960);return StringUtil.releaseBuilder(sb);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        // for get url reqs, serialise the data map into the url
        private static void serialiseRequestUrl(Connection.Request req) throws IOException {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2961);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2962);URL in = req.url();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2963);StringBuilder url = StringUtil.borrowBuilder();
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2964);boolean first = true;
            // reconstitute the query, ready for appends
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2965);url
                .append(in.getProtocol())
                .append("://")
                .append(in.getAuthority()) // includes host, port
                .append(in.getPath())
                .append("?");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2966);if ((((in.getQuery() != null)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2967)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2968)==0&false))) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2969);url.append(in.getQuery());
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2970);first = false;
            }
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2971);for (Connection.KeyVal keyVal : req.data()) {{
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2972);Validate.isFalse(keyVal.hasInputStream(), "InputStream data not supported in URL query string.");
                __CLR4_4_11pu1pulh9yvgfd.R.inc(2973);if ((((!first)&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2974)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2975)==0&false)))
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2976);url.append('&');
                }else
                    {__CLR4_4_11pu1pulh9yvgfd.R.inc(2977);first = false;
                }__CLR4_4_11pu1pulh9yvgfd.R.inc(2978);url
                    .append(URLEncoder.encode(keyVal.key(), DataUtil.defaultCharset))
                    .append('=')
                    .append(URLEncoder.encode(keyVal.value(), DataUtil.defaultCharset));
            }
            }__CLR4_4_11pu1pulh9yvgfd.R.inc(2979);req.url(new URL(StringUtil.releaseBuilder(url)));
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2980);req.data().clear(); // moved into url as get params
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}
    }

    private static boolean needsMultipart(Connection.Request req) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2981);
        // multipart mode, for files. add the header if we see something with an inputstream, and return a non-null boundary
        __CLR4_4_11pu1pulh9yvgfd.R.inc(2982);for (Connection.KeyVal keyVal : req.data()) {{
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2983);if ((((keyVal.hasInputStream())&&(__CLR4_4_11pu1pulh9yvgfd.R.iget(2984)!=0|true))||(__CLR4_4_11pu1pulh9yvgfd.R.iget(2985)==0&false)))
                {__CLR4_4_11pu1pulh9yvgfd.R.inc(2986);return true;
        }}
        }__CLR4_4_11pu1pulh9yvgfd.R.inc(2987);return false;
    }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

    public static class KeyVal implements Connection.KeyVal {
        private String key;
        private String value;
        private InputStream stream;
        private String contentType;

        public static KeyVal create(String key, String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2988);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2989);return new KeyVal().key(key).value(value);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public static KeyVal create(String key, String filename, InputStream stream) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2990);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2991);return new KeyVal().key(key).value(filename).inputStream(stream);
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        private KeyVal() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2992);}finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public KeyVal key(String key) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2993);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2994);Validate.notEmpty(key, "Data key must not be empty");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2995);this.key = key;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2996);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String key() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2997);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(2998);return key;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public KeyVal value(String value) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(2999);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3000);Validate.notNull(value, "Data value must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3001);this.value = value;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3002);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public String value() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(3003);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3004);return value;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public KeyVal inputStream(InputStream inputStream) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(3005);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3006);Validate.notNull(value, "Data input stream must not be null");
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3007);this.stream = inputStream;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3008);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public InputStream inputStream() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(3009);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3010);return stream;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        public boolean hasInputStream() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(3011);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3012);return stream != null;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public Connection.KeyVal contentType(String contentType) {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(3013);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3014);Validate.notEmpty(contentType);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3015);this.contentType = contentType;
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3016);return this;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public String contentType() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(3017);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3018);return contentType;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_11pu1pulh9yvgfd.R.inc(3019);
            __CLR4_4_11pu1pulh9yvgfd.R.inc(3020);return key + "=" + value;
        }finally{__CLR4_4_11pu1pulh9yvgfd.R.flushNeeded();}}
    }
}
