/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.examples;

import org.jsoup.Jsoup;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.io.IOException;

/**
 * HTML to plain-text. This example program demonstrates the use of jsoup to convert HTML input to lightly-formatted
 * plain-text. That is divergent from the general goal of jsoup's .text() methods, which is to get clean data from a
 * scrape.
 * <p>
 * Note that this is a fairly simplistic formatter -- for real world use you'll want to embrace and extend.
 * </p>
 * <p>
 * To invoke from the command line, assuming you've downloaded the jsoup jar to your current directory:</p>
 * <p><code>java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]</code></p>
 * where <i>url</i> is the URL to fetch, and <i>selector</i> is an optional CSS selector.
 * 
 * @author Jonathan Hedley, jonathan@hedley.net
 */
public class HtmlToPlainText {public static class __CLR4_4_11gj1gjlh9yvgd4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,1973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String userAgent = "Mozilla/5.0 (jsoup)";
    private static final int timeout = 5 * 1000;

    public static void main(String... args) throws IOException {try{__CLR4_4_11gj1gjlh9yvgd4.R.inc(1891);
        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1892);Validate.isTrue(args.length == 1 || args.length == 2, "usage: java -cp jsoup.jar org.jsoup.examples.HtmlToPlainText url [selector]");
        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1893);final String url = args[0];
        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1894);final String selector = (((args.length == 2 )&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1895)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1896)==0&false))? args[1] : null;

        // fetch the specified URL and parse to a HTML DOM
        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1897);Document doc = Jsoup.connect(url).userAgent(userAgent).timeout(timeout).get();

        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1898);HtmlToPlainText formatter = new HtmlToPlainText();

        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1899);if ((((selector != null)&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1900)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1901)==0&false))) {{
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1902);Elements elements = doc.select(selector); // get each element that matches the CSS selector
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1903);for (Element element : elements) {{
                __CLR4_4_11gj1gjlh9yvgd4.R.inc(1904);String plainText = formatter.getPlainText(element); // format that element to plain text
                __CLR4_4_11gj1gjlh9yvgd4.R.inc(1905);System.out.println(plainText);
            }
        }} }else {{ // format the whole doc
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1906);String plainText = formatter.getPlainText(doc);
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1907);System.out.println(plainText);
        }
    }}finally{__CLR4_4_11gj1gjlh9yvgd4.R.flushNeeded();}}

    /**
     * Format an Element to plain-text
     * @param element the root element to format
     * @return formatted text
     */
    public String getPlainText(Element element) {try{__CLR4_4_11gj1gjlh9yvgd4.R.inc(1908);
        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1909);FormattingVisitor formatter = new FormattingVisitor();
        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1910);NodeTraversor.traverse(formatter, element); // walk the DOM, and call .head() and .tail() for each node

        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1911);return formatter.toString();
    }finally{__CLR4_4_11gj1gjlh9yvgd4.R.flushNeeded();}}

    // the formatting rules, implemented in a breadth-first DOM traverse
    private static class FormattingVisitor implements NodeVisitor {
        private static final int maxWidth = 80;
        private int width = 0;
        private StringBuilder accum = new StringBuilder(); // holds the accumulated text

        // hit when the node is first seen
        public void head(Node node, int depth) {try{__CLR4_4_11gj1gjlh9yvgd4.R.inc(1912);
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1913);String name = node.nodeName();
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1914);if ((((node instanceof TextNode)&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1915)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1916)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1917);append(((TextNode) node).text()); // TextNodes carry all user-readable text in the DOM.
            }else {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1918);if ((((name.equals("li"))&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1919)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1920)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1921);append("\n * ");
            }else {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1922);if ((((name.equals("dt"))&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1923)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1924)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1925);append("  ");
            }else {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1926);if ((((StringUtil.in(name, "p", "h1", "h2", "h3", "h4", "h5", "tr"))&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1927)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1928)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1929);append("\n");
        }}}}}finally{__CLR4_4_11gj1gjlh9yvgd4.R.flushNeeded();}}

        // hit when all of the node's children (if any) have been visited
        public void tail(Node node, int depth) {try{__CLR4_4_11gj1gjlh9yvgd4.R.inc(1930);
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1931);String name = node.nodeName();
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1932);if ((((StringUtil.in(name, "br", "dd", "dt", "p", "h1", "h2", "h3", "h4", "h5"))&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1933)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1934)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1935);append("\n");
            }else {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1936);if ((((name.equals("a"))&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1937)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1938)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1939);append(String.format(" <%s>", node.absUrl("href")));
        }}}finally{__CLR4_4_11gj1gjlh9yvgd4.R.flushNeeded();}}

        // appends text to the string builder with a simple word wrap method
        private void append(String text) {try{__CLR4_4_11gj1gjlh9yvgd4.R.inc(1940);
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1941);if ((((text.startsWith("\n"))&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1942)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1943)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1944);width = 0; // reset counter if starts with a newline. only from formats above, not in natural text
            }__CLR4_4_11gj1gjlh9yvgd4.R.inc(1945);if ((((text.equals(" ") &&
                    (accum.length() == 0 || StringUtil.in(accum.substring(accum.length() - 1), " ", "\n")))&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1946)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1947)==0&false)))
                {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1948);return; // don't accumulate long runs of empty spaces

            }__CLR4_4_11gj1gjlh9yvgd4.R.inc(1949);if ((((text.length() + width > maxWidth)&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1950)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1951)==0&false))) {{ // won't fit, needs to wrap
                __CLR4_4_11gj1gjlh9yvgd4.R.inc(1952);String[] words = text.split("\\s+");
                __CLR4_4_11gj1gjlh9yvgd4.R.inc(1953);for (int i = 0; (((i < words.length)&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1954)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1955)==0&false)); i++) {{
                    __CLR4_4_11gj1gjlh9yvgd4.R.inc(1956);String word = words[i];
                    __CLR4_4_11gj1gjlh9yvgd4.R.inc(1957);boolean last = i == words.length - 1;
                    __CLR4_4_11gj1gjlh9yvgd4.R.inc(1958);if ((((!last)&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1959)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1960)==0&false))) // insert a space if not the last word
                        {__CLR4_4_11gj1gjlh9yvgd4.R.inc(1961);word = word + " ";
                    }__CLR4_4_11gj1gjlh9yvgd4.R.inc(1962);if ((((word.length() + width > maxWidth)&&(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1963)!=0|true))||(__CLR4_4_11gj1gjlh9yvgd4.R.iget(1964)==0&false))) {{ // wrap and reset counter
                        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1965);accum.append("\n").append(word);
                        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1966);width = word.length();
                    } }else {{
                        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1967);accum.append(word);
                        __CLR4_4_11gj1gjlh9yvgd4.R.inc(1968);width += word.length();
                    }
                }}
            }} }else {{ // fits as is, without need to wrap text
                __CLR4_4_11gj1gjlh9yvgd4.R.inc(1969);accum.append(text);
                __CLR4_4_11gj1gjlh9yvgd4.R.inc(1970);width += text.length();
            }
        }}finally{__CLR4_4_11gj1gjlh9yvgd4.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_11gj1gjlh9yvgd4.R.inc(1971);
            __CLR4_4_11gj1gjlh9yvgd4.R.inc(1972);return accum.toString();
        }finally{__CLR4_4_11gj1gjlh9yvgd4.R.flushNeeded();}}
    }
}
