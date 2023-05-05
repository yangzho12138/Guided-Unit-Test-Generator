/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.helper;

import org.jsoup.UncheckedIOException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Internal static utilities for handling data.
 *
 */
public final class DataUtil {public static class __CLR4_4_11kt1ktlh9yvge0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,2226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final Pattern charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    static final String defaultCharset = "UTF-8"; // used if not found in header or meta charset
    private static final int firstReadBufferSize = 1024 * 5;
    static final int bufferSize = 1024 * 32;
    private static final char[] mimeBoundaryChars =
            "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static final int boundaryLength = 32;

    public DataUtil() {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2045);}finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    /**
     * Loads a file to a Document.
     * @param in file to load
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(File in, String charsetName, String baseUri) throws IOException {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2046);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2047);return parseInputStream(new FileInputStream(in), charsetName, baseUri, Parser.htmlParser());
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    /**
     * Parses a Document from an input steam.
     * @param in input stream to parse. You will need to close it.
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(InputStream in, String charsetName, String baseUri) throws IOException {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2048);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2049);return parseInputStream(in, charsetName, baseUri, Parser.htmlParser());
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    /**
     * Parses a Document from an input steam, using the provided Parser.
     * @param in input stream to parse. You will need to close it.
     * @param charsetName character set of input
     * @param baseUri base URI of document, to resolve relative links against
     * @param parser alternate {@link Parser#xmlParser() parser} to use.
     * @return Document
     * @throws IOException on IO error
     */
    public static Document load(InputStream in, String charsetName, String baseUri, Parser parser) throws IOException {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2050);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2051);return parseInputStream(in, charsetName, baseUri, parser);
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    /**
     * Writes the input stream to the output stream. Doesn't close them.
     * @param in input stream to read from
     * @param out output stream to write to
     * @throws IOException on IO error
     */
    static void crossStreams(final InputStream in, final OutputStream out) throws IOException {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2052);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2053);final byte[] buffer = new byte[bufferSize];
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2054);int len;
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2055);while ((len = in.read(buffer)) != -1) {{
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2058);out.write(buffer, 0, len);
        }
    }}finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    static Document parseInputStream(InputStream input, String charsetName, String baseUri, Parser parser) throws IOException  {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2059);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2060);if ((((input == null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2061)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2062)==0&false))) // empty body
            {__CLR4_4_11kt1ktlh9yvge0.R.inc(2063);return new Document(baseUri);
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2064);input = ConstrainableInputStream.wrap(input, bufferSize, 0);

        __CLR4_4_11kt1ktlh9yvge0.R.inc(2065);Document doc = null;

        // read the start of the stream and look for a BOM or meta charset
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2066);input.mark(bufferSize);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2067);ByteBuffer firstBytes = readToByteBuffer(input, firstReadBufferSize - 1); // -1 because we read one more to see if completed. First read is < buffer size, so can't be invalid.
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2068);boolean fullyRead = (input.read() == -1);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2069);input.reset();

        // look for BOM - overrides any other header or input
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2070);BomCharset bomCharset = detectCharsetFromBom(firstBytes);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2071);if ((((bomCharset != null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2072)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2073)==0&false)))
            {__CLR4_4_11kt1ktlh9yvge0.R.inc(2074);charsetName = bomCharset.charset;

        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2075);if ((((charsetName == null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2076)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2077)==0&false))) {{ // determine from meta. safe first parse as UTF-8
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2078);String docData = Charset.forName(defaultCharset).decode(firstBytes).toString();
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2079);try {
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2080);doc = parser.parseInput(docData, baseUri);
            } catch (UncheckedIOException e) {
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2081);throw e.ioException();
            }

            // look for <meta http-equiv="Content-Type" content="text/html;charset=gb2312"> or HTML5 <meta charset="gb2312">
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2082);Elements metaElements = doc.select("meta[http-equiv=content-type], meta[charset]");
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2083);String foundCharset = null; // if not found, will keep utf-8 as best attempt
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2084);for (Element meta : metaElements) {{
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2085);if ((((meta.hasAttr("http-equiv"))&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2086)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2087)==0&false)))
                    {__CLR4_4_11kt1ktlh9yvge0.R.inc(2088);foundCharset = getCharsetFromContentType(meta.attr("content"));
                }__CLR4_4_11kt1ktlh9yvge0.R.inc(2089);if ((((foundCharset == null && meta.hasAttr("charset"))&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2090)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2091)==0&false)))
                    {__CLR4_4_11kt1ktlh9yvge0.R.inc(2092);foundCharset = meta.attr("charset");
                }__CLR4_4_11kt1ktlh9yvge0.R.inc(2093);if ((((foundCharset != null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2094)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2095)==0&false)))
                    {__CLR4_4_11kt1ktlh9yvge0.R.inc(2096);break;
            }}

            // look for <?xml encoding='ISO-8859-1'?>
            }__CLR4_4_11kt1ktlh9yvge0.R.inc(2097);if ((((foundCharset == null && doc.childNodeSize() > 0)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2098)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2099)==0&false))) {{
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2100);Node first = doc.childNode(0);
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2101);XmlDeclaration decl = null;
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2102);if ((((first instanceof XmlDeclaration)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2103)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2104)==0&false)))
                    {__CLR4_4_11kt1ktlh9yvge0.R.inc(2105);decl = (XmlDeclaration) first;
                }else {__CLR4_4_11kt1ktlh9yvge0.R.inc(2106);if ((((first instanceof Comment)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2107)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2108)==0&false))) {{
                    __CLR4_4_11kt1ktlh9yvge0.R.inc(2109);Comment comment = (Comment) first;
                    __CLR4_4_11kt1ktlh9yvge0.R.inc(2110);if ((((comment.isXmlDeclaration())&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2111)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2112)==0&false)))
                        {__CLR4_4_11kt1ktlh9yvge0.R.inc(2113);decl = comment.asXmlDeclaration();
                }}
                }}__CLR4_4_11kt1ktlh9yvge0.R.inc(2114);if ((((decl != null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2115)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2116)==0&false))) {{
                    __CLR4_4_11kt1ktlh9yvge0.R.inc(2117);if ((((decl.name().equalsIgnoreCase("xml"))&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2118)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2119)==0&false)))
                        {__CLR4_4_11kt1ktlh9yvge0.R.inc(2120);foundCharset = decl.attr("encoding");
                }}
            }}
            }__CLR4_4_11kt1ktlh9yvge0.R.inc(2121);foundCharset = validateCharset(foundCharset);
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2122);if ((((foundCharset != null && !foundCharset.equalsIgnoreCase(defaultCharset))&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2123)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2124)==0&false))) {{ // need to re-decode. (case insensitive check here to match how validate works)
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2125);foundCharset = foundCharset.trim().replaceAll("[\"']", "");
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2126);charsetName = foundCharset;
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2127);doc = null;
            } }else {__CLR4_4_11kt1ktlh9yvge0.R.inc(2128);if ((((!fullyRead)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2129)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2130)==0&false))) {{
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2131);doc = null;
            }
        }}} }else {{ // specified by content type header (or by user on file load)
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2132);Validate.notEmpty(charsetName, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2133);if ((((doc == null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2134)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2135)==0&false))) {{
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2136);if ((((charsetName == null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2137)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2138)==0&false)))
                {__CLR4_4_11kt1ktlh9yvge0.R.inc(2139);charsetName = defaultCharset;
            }__CLR4_4_11kt1ktlh9yvge0.R.inc(2140);BufferedReader reader = new BufferedReader(new InputStreamReader(input, charsetName), bufferSize);
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2141);if ((((bomCharset != null && bomCharset.offset)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2142)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2143)==0&false))) {{ // creating the buffered reader ignores the input pos, so must skip here
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2144);long skipped = reader.skip(1);
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2145);Validate.isTrue(skipped == 1); // WTF if this fails.
            }
            }__CLR4_4_11kt1ktlh9yvge0.R.inc(2146);try {
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2147);doc = parser.parseInput(reader, baseUri);
            } catch (UncheckedIOException e) {
                // io exception when parsing (not seen before because reading the stream as we go)
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2148);throw e.ioException();
            }
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2149);Charset charset = Charset.forName(charsetName);
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2150);doc.outputSettings().charset(charset);
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2151);if ((((!charset.canEncode())&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2152)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2153)==0&false))) {{
                // some charsets can read but not encode; switch to an encodable charset and update the meta el
                __CLR4_4_11kt1ktlh9yvge0.R.inc(2154);doc.charset(Charset.forName(defaultCharset));
            }
        }}
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2155);input.close();
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2156);return doc;
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    /**
     * Read the input stream into a byte buffer. To deal with slow input streams, you may interrupt the thread this
     * method is executing on. The data read until being interrupted will be available.
     * @param inStream the input stream to read from
     * @param maxSize the maximum size in bytes to read from the stream. Set to 0 to be unlimited.
     * @return the filled byte buffer
     * @throws IOException if an exception occurs whilst reading from the input stream.
     */
    public static ByteBuffer readToByteBuffer(InputStream inStream, int maxSize) throws IOException {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2157);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2158);Validate.isTrue(maxSize >= 0, "maxSize must be 0 (unlimited) or larger");
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2159);final ConstrainableInputStream input = ConstrainableInputStream.wrap(inStream, bufferSize, maxSize);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2160);return input.readToByteBuffer(maxSize);
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    static ByteBuffer emptyByteBuffer() {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2161);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2162);return ByteBuffer.allocate(0);
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    /**
     * Parse out a charset from a content type header. If the charset is not supported, returns null (so the default
     * will kick in.)
     * @param contentType e.g. "text/html; charset=EUC-JP"
     * @return "EUC-JP", or null if not found. Charset is trimmed and uppercased.
     */
    static String getCharsetFromContentType(String contentType) {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2163);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2164);if ((((contentType == null)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2165)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2166)==0&false))) {__CLR4_4_11kt1ktlh9yvge0.R.inc(2167);return null;
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2168);Matcher m = charsetPattern.matcher(contentType);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2169);if ((((m.find())&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2170)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2171)==0&false))) {{
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2172);String charset = m.group(1).trim();
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2173);charset = charset.replace("charset=", "");
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2174);return validateCharset(charset);
        }
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2175);return null;
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    private static String validateCharset(String cs) {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2176);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2177);if ((((cs == null || cs.length() == 0)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2178)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2179)==0&false))) {__CLR4_4_11kt1ktlh9yvge0.R.inc(2180);return null;
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2181);cs = cs.trim().replaceAll("[\"']", "");
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2182);try {
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2183);if ((((Charset.isSupported(cs))&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2184)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2185)==0&false))) {__CLR4_4_11kt1ktlh9yvge0.R.inc(2186);return cs;
            }__CLR4_4_11kt1ktlh9yvge0.R.inc(2187);cs = cs.toUpperCase(Locale.ENGLISH);
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2188);if ((((Charset.isSupported(cs))&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2189)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2190)==0&false))) {__CLR4_4_11kt1ktlh9yvge0.R.inc(2191);return cs;
        }} catch (IllegalCharsetNameException e) {
            // if our this charset matching fails.... we just take the default
        }
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2192);return null;
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    /**
     * Creates a random string, suitable for use as a mime boundary
     */
    static String mimeBoundary() {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2193);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2194);final StringBuilder mime = StringUtil.borrowBuilder();
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2195);final Random rand = new Random();
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2196);for (int i = 0; (((i < boundaryLength)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2197)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2198)==0&false)); i++) {{
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2199);mime.append(mimeBoundaryChars[rand.nextInt(mimeBoundaryChars.length)]);
        }
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2200);return StringUtil.releaseBuilder(mime);
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    private static BomCharset detectCharsetFromBom(final ByteBuffer byteData) {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2201);
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2202);final Buffer buffer = byteData; // .mark and rewind used to return Buffer, now ByteBuffer, so cast for backward compat
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2203);buffer.mark();
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2204);byte[] bom = new byte[4];
        __CLR4_4_11kt1ktlh9yvge0.R.inc(2205);if ((((byteData.remaining() >= bom.length)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2206)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2207)==0&false))) {{
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2208);byteData.get(bom);
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2209);buffer.rewind();
        }
        }__CLR4_4_11kt1ktlh9yvge0.R.inc(2210);if ((((bom[0] == 0x00 && bom[1] == 0x00 && bom[2] == (byte) 0xFE && bom[3] == (byte) 0xFF || // BE
            bom[0] == (byte) 0xFF && bom[1] == (byte) 0xFE && bom[2] == 0x00 && bom[3] == 0x00)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2211)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2212)==0&false))) {{ // LE
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2213);return new BomCharset("UTF-32", false); // and I hope it's on your system
        } }else {__CLR4_4_11kt1ktlh9yvge0.R.inc(2214);if ((((bom[0] == (byte) 0xFE && bom[1] == (byte) 0xFF || // BE
            bom[0] == (byte) 0xFF && bom[1] == (byte) 0xFE)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2215)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2216)==0&false))) {{
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2217);return new BomCharset("UTF-16", false); // in all Javas
        } }else {__CLR4_4_11kt1ktlh9yvge0.R.inc(2218);if ((((bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF)&&(__CLR4_4_11kt1ktlh9yvge0.R.iget(2219)!=0|true))||(__CLR4_4_11kt1ktlh9yvge0.R.iget(2220)==0&false))) {{
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2221);return new BomCharset("UTF-8", true); // in all Javas
            // 16 and 32 decoders consume the BOM to determine be/le; utf-8 should be consumed here
        }
        }}}__CLR4_4_11kt1ktlh9yvge0.R.inc(2222);return null;
    }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}

    private static class BomCharset {
        private final String charset;
        private final boolean offset;

        public BomCharset(String charset, boolean offset) {try{__CLR4_4_11kt1ktlh9yvge0.R.inc(2223);
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2224);this.charset = charset;
            __CLR4_4_11kt1ktlh9yvge0.R.inc(2225);this.offset = offset;
        }finally{__CLR4_4_11kt1ktlh9yvge0.R.flushNeeded();}}
    }
}
