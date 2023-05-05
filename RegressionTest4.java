import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", ":lt(52)");
        java.lang.String str9 = document1.title();
        org.jsoup.nodes.Element element11 = document1.text("#doctype");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsContainingOwnText("[]");
        org.jsoup.nodes.Element element10 = document1.tagName("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String str11 = document1.html();
        org.jsoup.nodes.Element element13 = document1.removeAttr("hi!hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((java.lang.Object) 1);
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element7 = document1.head();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.nodes.Element element11 = document1.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document1.getElementsContainingOwnText("");
        java.lang.String str14 = document1.val();
        org.jsoup.nodes.Element element16 = document1.toggleClass("SYSTEM");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.net.URL uRL2 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(uRL2);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request8 = httpConnection7.request();
        org.jsoup.Connection.Request request11 = request8.addHeader("multipart/form-data", "hi!");
        boolean boolean13 = request11.hasHeader("multipart/form-data");
        boolean boolean15 = request11.hasCookie("#text");
        org.jsoup.parser.Parser parser16 = request11.parser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse(inputStream4, "", "multipart/form-data", parser16);
        org.jsoup.parser.ParseErrorList parseErrorList18 = parser16.getErrors();
        org.jsoup.Connection connection19 = connection3.parser(parser16);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser21 = parser16.setTreeBuilder((org.jsoup.parser.TreeBuilder) htmlTreeBuilder20);
        org.jsoup.parser.ParseSettings parseSettings24 = new org.jsoup.parser.ParseSettings(true, false);
        org.jsoup.parser.Parser parser25 = parser16.settings(parseSettings24);
        boolean boolean26 = parseSettings24.preserveAttributeCase();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.select.Elements elements5 = elements3.addClass("hi!");
        org.jsoup.select.Elements elements8 = elements5.attr(":eq(-1)", ":eq(-1)");
        java.lang.Object[] objArray9 = elements5.toArray();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.io.InputStream inputStream0 = null;
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request4 = httpConnection3.request();
        org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        boolean boolean9 = request7.hasHeader("multipart/form-data");
        boolean boolean11 = request7.hasCookie("#text");
        org.jsoup.parser.Parser parser12 = request7.parser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        boolean boolean14 = parser12.isTrackErrors();
        org.jsoup.parser.Parser parser16 = parser12.setTrackErrors(10);
        org.jsoup.parser.ParseErrorList parseErrorList17 = parser16.getErrors();
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        org.jsoup.Connection connection20 = httpConnection18.sslSocketFactory(sSLSocketFactory19);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        org.jsoup.Connection connection22 = httpConnection18.sslSocketFactory(sSLSocketFactory21);
        org.jsoup.Connection.Request request23 = httpConnection18.request();
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request25 = httpConnection24.request();
        org.jsoup.Connection.Request request28 = request25.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method29 = request25.method();
        org.jsoup.Connection connection30 = httpConnection18.method(method29);
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request32 = httpConnection31.request();
        org.jsoup.Connection.Request request35 = request32.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap36 = request35.multiHeaders();
        org.jsoup.Connection.Request request38 = request35.ignoreHttpErrors(true);
        org.jsoup.Connection connection39 = httpConnection18.request(request38);
        boolean boolean40 = parseErrorList17.contains((java.lang.Object) httpConnection18);
        org.jsoup.Connection connection42 = httpConnection18.referrer(":nth-last-of-type(100n-1)");
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parseErrorList17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertTrue("'" + method29 + "' != '" + org.jsoup.Connection.Method.GET + "'", method29.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(connection42);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data(":lt(52)");
        org.jsoup.Connection connection9 = httpConnection0.cookie(":eq(-1)=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":containsData( )");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding=#declaration" + "'", str4, "Content-Encoding=#declaration");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        boolean boolean6 = tag1.isEmpty();
        java.lang.String str7 = tag1.normalName();
        boolean boolean8 = tag1.isEmpty();
        boolean boolean9 = tag1.isEmpty();
        boolean boolean10 = tag1.isBlock();
        boolean boolean11 = tag1.isBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.className();
        java.lang.String str5 = document2.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str6 = document2.normalName();
        org.w3c.dom.Document document7 = w3CDom0.fromJsoup(document2);
        org.w3c.dom.Document document8 = null;
        java.lang.String str9 = w3CDom0.asString(document8);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull("document7.getDocumentURI() == null", document7.getDocumentURI());
        org.junit.Assert.assertNull("document7.getInputEncoding() == null", document7.getInputEncoding());
        org.junit.Assert.assertNull("document7.getXmlEncoding() == null", document7.getXmlEncoding());
        org.junit.Assert.assertEquals(document7.getXmlVersion(), "1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>" + "'", str9, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.simpleText();
        java.lang.String str2 = org.jsoup.Jsoup.clean("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist1);
        org.jsoup.safety.Cleaner cleaner3 = new org.jsoup.safety.Cleaner(whitelist1);
        boolean boolean5 = cleaner3.isValidBodyHtml(":eq(-1)");
        org.jsoup.select.Evaluator.Class class7 = new org.jsoup.select.Evaluator.Class("Content-Encoding");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.wholeText();
        org.jsoup.select.Elements elements11 = document9.parents();
        org.jsoup.nodes.Element element13 = document9.appendElement("#root=\"\"");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.wholeText();
        org.jsoup.select.Elements elements17 = document15.parents();
        java.nio.charset.Charset charset18 = document15.charset();
        org.jsoup.select.Elements elements20 = document15.getElementsByIndexGreaterThan((int) '#');
        boolean boolean21 = class7.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document15);
        org.jsoup.nodes.Document document22 = cleaner3.clean(document15);
        boolean boolean24 = cleaner3.isValidBodyHtml("hi!");
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str2, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(charset18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str1 = isFirstChild0.toString();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.wholeText();
        org.jsoup.nodes.Document document5 = document3.clone();
        java.io.InputStream inputStream7 = null;
        org.jsoup.nodes.Document document10 = org.jsoup.helper.DataUtil.load(inputStream7, "#root=\"\"", "#text");
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList12.listIterator();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node18 = textNode16.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node20 = textNode16.removeAttr("#document");
        int int21 = parseErrorList12.lastIndexOf((java.lang.Object) node20);
        org.jsoup.parser.ParseError[] parseErrorArray22 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList23 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23, parseErrorArray22);
        org.jsoup.parser.ParseErrorList parseErrorList25 = org.jsoup.parser.ParseErrorList.noTracking();
        int int26 = parseErrorList23.indexOf((java.lang.Object) parseErrorList25);
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        org.jsoup.Connection connection29 = httpConnection27.sslSocketFactory(sSLSocketFactory28);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory30 = null;
        org.jsoup.Connection connection31 = httpConnection27.sslSocketFactory(sSLSocketFactory30);
        org.jsoup.Connection connection33 = httpConnection27.ignoreContentType(true);
        boolean boolean34 = parseErrorList23.equals((java.lang.Object) true);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream35 = parseErrorList23.parallelStream();
        boolean boolean36 = parseErrorList12.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = org.jsoup.parser.Parser.parseFragment("&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n  hi!\n &lt;/body&gt;\n&lt;/html&gt;=\"#root\"", (org.jsoup.nodes.Element) document10, "<!hi!!>", parseErrorList12);
        boolean boolean38 = isFirstChild0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document10);
        org.jsoup.select.Elements elements40 = document3.getElementsByIndexGreaterThan(30000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(parseErrorArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseErrorList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parseErrorStream35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(elements40);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("", strArray8);
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) strArray8);
        org.jsoup.select.Selector.SelectorParseException selectorParseException12 = new org.jsoup.select.Selector.SelectorParseException("#doctype", (java.lang.Object[]) strArray8);
        java.lang.Throwable[] throwableArray13 = selectorParseException12.getSuppressed();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.select.Evaluator.IsRoot isRoot0 = new org.jsoup.select.Evaluator.IsRoot();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.id();
        java.lang.String str4 = document2.baseUri();
        org.jsoup.nodes.Element element5 = document2.clearAttributes();
        document2.title("");
        document2.updateMetaCharsetElement(false);
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot12 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str15 = document14.id();
        org.jsoup.select.Elements elements16 = document14.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode17 = document14.quirksMode();
        boolean boolean19 = document14.hasClass("multipart/form-data");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType22 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.wholeText();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str28 = document27.className();
        boolean boolean29 = isNthLastOfType22.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document27);
        boolean boolean30 = attributeWithValueNot12.matches((org.jsoup.nodes.Element) document14, (org.jsoup.nodes.Element) document24);
        boolean boolean31 = isRoot0.matches((org.jsoup.nodes.Element) document2, (org.jsoup.nodes.Element) document14);
        java.lang.String str32 = isRoot0.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + quirksMode17 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode17.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":root" + "'", str32, ":root");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements6 = elements5.prev();
        java.util.List<java.lang.String> strList7 = elements6.eachText();
        org.jsoup.select.Elements elements10 = elements6.attr("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", "#comment");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str3 = tokenQueue1.chompTo("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String str4 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean15 = org.jsoup.internal.StringUtil.in("", strArray14);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("", strArray14);
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray14, " hi!=\"multipart/form-data\"");
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) strArray14, ":first-of-type");
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) strArray14, ":nth-of-type(10n+100)");
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) strArray14, "[system$=<html>\n    <head>\n        <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">\n    </head>\n    <body>hi!</body>\n</html>]");
        java.lang.String str25 = tokenQueue1.consumeToAny(strArray14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data" + "'", str3, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str18, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList0.parallelStream();
        boolean boolean4 = parseErrorList0.contains((java.lang.Object) "#text");
        java.lang.String str5 = parseErrorList0.toString();
        org.jsoup.parser.ParseError parseError6 = null;
        boolean boolean7 = parseErrorList0.add(parseError6);
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.helper.HttpConnection httpConnection2 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request3 = httpConnection2.request();
        org.jsoup.Connection connection5 = httpConnection2.referrer("multipart/form-data");
        org.jsoup.Connection.Response response6 = httpConnection2.response();
        org.jsoup.Connection connection8 = httpConnection2.ignoreContentType(false);
        org.jsoup.Connection.Request request9 = httpConnection2.request();
        org.jsoup.Connection connection12 = httpConnection2.cookie(":lt(52)", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        org.jsoup.Connection connection17 = httpConnection15.sslSocketFactory(sSLSocketFactory16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        org.jsoup.Connection connection19 = httpConnection15.sslSocketFactory(sSLSocketFactory18);
        org.jsoup.Connection.Request request20 = httpConnection15.request();
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request22 = httpConnection21.request();
        org.jsoup.Connection.Request request25 = request22.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = request25.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = request25.cookies();
        org.jsoup.Connection connection28 = httpConnection15.headers(strMap27);
        java.io.InputStream inputStream31 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream34 = new org.jsoup.internal.ConstrainableInputStream(inputStream31, 1, (int) (byte) 0);
        org.jsoup.Connection connection35 = httpConnection15.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream34);
        org.jsoup.Connection connection36 = httpConnection2.data("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", (java.io.InputStream) constrainableInputStream34);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream39 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream34, (int) (short) 0, (int) (short) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal40 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "application/x-www-form-urlencoded", (java.io.InputStream) constrainableInputStream34);
        boolean boolean41 = keyVal40.hasInputStream();
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(constrainableInputStream39);
        org.junit.Assert.assertNotNull(keyVal40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        java.lang.String str3 = isLastOfType0.toString();
        java.lang.String str4 = isLastOfType0.toString();
        java.lang.String str5 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":last-of-type" + "'", str3, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":last-of-type" + "'", str4, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ":last-of-type" + "'", str5, ":last-of-type");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("Content-Encoding");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.wholeText();
        org.jsoup.select.Elements elements5 = document3.parents();
        org.jsoup.nodes.Element element7 = document3.appendElement("#root=\"\"");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.wholeText();
        org.jsoup.select.Elements elements11 = document9.parents();
        java.nio.charset.Charset charset12 = document9.charset();
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexGreaterThan((int) '#');
        boolean boolean15 = class1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.id();
        java.lang.String str19 = document17.baseUri();
        org.jsoup.nodes.Element element20 = document17.body();
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request22 = httpConnection21.request();
        org.jsoup.Connection.Request request25 = request22.addHeader("multipart/form-data", "hi!");
        boolean boolean27 = request25.hasHeader("multipart/form-data");
        boolean boolean29 = request25.hasCookie("#text");
        org.jsoup.parser.Parser parser30 = request25.parser();
        org.jsoup.nodes.Document document31 = document17.parser(parser30);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = document31.siblingNodes();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str35 = document34.id();
        boolean boolean36 = document34.hasText();
        boolean boolean37 = class1.matches((org.jsoup.nodes.Element) document31, (org.jsoup.nodes.Element) document34);
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot40 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str43 = document42.id();
        org.jsoup.select.Elements elements44 = document42.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode45 = document42.quirksMode();
        boolean boolean47 = document42.hasClass("multipart/form-data");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType50 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str53 = document52.wholeText();
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str56 = document55.className();
        boolean boolean57 = isNthLastOfType50.matches((org.jsoup.nodes.Element) document52, (org.jsoup.nodes.Element) document55);
        boolean boolean58 = attributeWithValueNot40.matches((org.jsoup.nodes.Element) document42, (org.jsoup.nodes.Element) document52);
        org.jsoup.nodes.Element element59 = document31.prependChild((org.jsoup.nodes.Node) document52);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(charset12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertTrue("'" + quirksMode45 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode45.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        boolean boolean11 = request9.hasHeader("multipart/form-data");
        boolean boolean13 = request9.hasCookie("#text");
        org.jsoup.parser.Parser parser14 = request9.parser();
        org.jsoup.nodes.Document document15 = document1.parser(parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        java.io.InputStream inputStream23 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal24 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream23);
        java.io.InputStream inputStream25 = keyVal24.inputStream();
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        org.jsoup.Connection connection28 = httpConnection26.sslSocketFactory(sSLSocketFactory27);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        org.jsoup.Connection connection30 = httpConnection26.sslSocketFactory(sSLSocketFactory29);
        org.jsoup.Connection.Request request31 = httpConnection26.request();
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request33 = httpConnection32.request();
        org.jsoup.Connection.Request request36 = request33.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = request36.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = request36.cookies();
        org.jsoup.Connection connection39 = httpConnection26.headers(strMap38);
        java.io.InputStream inputStream42 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream45 = new org.jsoup.internal.ConstrainableInputStream(inputStream42, 1, (int) (byte) 0);
        org.jsoup.Connection connection46 = httpConnection26.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream45);
        org.jsoup.helper.HttpConnection.KeyVal keyVal47 = keyVal24.inputStream((java.io.InputStream) constrainableInputStream45);
        constrainableInputStream45.skipNBytes(0L);
        org.jsoup.Connection connection50 = httpConnection0.data("[:eq(-1)!=#doctype]", ":contains(content-encoding)", (java.io.InputStream) constrainableInputStream45);
        constrainableInputStream45.close();
        // The following exception was thrown during execution in test generation
        try {
            int int52 = constrainableInputStream45.available();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(keyVal24);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(keyVal47);
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.id();
        java.lang.String str8 = document6.baseUri();
        org.jsoup.nodes.Element element9 = document6.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = document6.dataset();
        org.jsoup.Connection connection11 = httpConnection4.data(strMap10);
        java.io.InputStream inputStream14 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream17 = new org.jsoup.internal.ConstrainableInputStream(inputStream14, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream20 = constrainableInputStream17.timeout((long) ' ', (long) (short) 1);
        constrainableInputStream17.close();
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream24 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream17, (int) '4', (int) (short) 0);
        org.jsoup.Connection connection25 = connection11.data("[]", "Content-Encoding=\"#root\"", (java.io.InputStream) constrainableInputStream17);
        org.jsoup.Connection.KeyVal keyVal26 = keyVal3.inputStream((java.io.InputStream) constrainableInputStream17);
        java.io.InputStream inputStream27 = keyVal26.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(constrainableInputStream20);
        org.junit.Assert.assertNotNull(constrainableInputStream24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNotNull(inputStream27);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.select.Evaluator.AttributeWithValueStarting attributeWithValueStarting2 = new org.jsoup.select.Evaluator.AttributeWithValueStarting("SYSTEM", "org.jsoup.select.Selector$SelectorParseException: :lt(52)");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        boolean boolean12 = request10.hasHeader("multipart/form-data");
        boolean boolean14 = request10.hasCookie("#text");
        org.jsoup.parser.Parser parser15 = request10.parser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse(inputStream3, "", "multipart/form-data", parser15);
        org.jsoup.nodes.Document document17 = document16.normalise();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        boolean boolean24 = elements21.equals((java.lang.Object) 1.0d);
        java.lang.String str25 = elements21.text();
        org.jsoup.select.Elements elements27 = elements21.wrap("#root");
        org.jsoup.select.Elements elements29 = elements27.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements31 = elements27.html("#text");
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str34 = document33.id();
        java.lang.String str35 = document33.baseUri();
        org.jsoup.nodes.Element element36 = document33.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = document33.dataset();
        boolean boolean38 = elements27.add((org.jsoup.nodes.Element) document33);
        org.jsoup.nodes.Element element39 = elements27.first();
        org.jsoup.select.Elements elements41 = element39.getElementsByIndexGreaterThan((int) 'l');
        boolean boolean42 = attributeWithValueStarting2.matches((org.jsoup.nodes.Element) document17, element39);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Element element4 = elements3.last();
        org.jsoup.select.Elements elements6 = elements3.append(":lt(52)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.nodes.DataNode dataNode4 = org.jsoup.nodes.DataNode.createFromEncoded("", ":first-of-type");
        org.jsoup.nodes.Attributes attributes5 = dataNode4.attributes();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("#document", " hi!=\"multipart/form-data\"", attributes5);
        java.lang.String str7 = attribute6.getKey();
        org.jsoup.nodes.Attribute attribute8 = attribute6.clone();
        org.junit.Assert.assertNotNull(dataNode4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("Content-Type", (-1), "#declaration");
        java.lang.String str4 = httpStatusException3.getUrl();
        int int5 = httpStatusException3.getStatusCode();
        int int6 = httpStatusException3.getStatusCode();
        java.lang.Throwable[] throwableArray7 = httpStatusException3.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements6 = elements5.prev();
        int int7 = elements5.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str5 = tokenQueue1.consumeTo("multipart");
        java.lang.String str7 = tokenQueue1.consumeToIgnoreCase("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data" + "'", str7, "multipart/form-data");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request10 = httpConnection9.request();
        org.jsoup.Connection.Request request13 = request10.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method14 = request10.method();
        org.jsoup.Connection.Request request15 = request4.method(method14);
        org.jsoup.Connection.Request request18 = request15.addHeader(":first-child", ":contains(content-encoding)");
        java.io.InputStream inputStream19 = null;
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse(inputStream19, "", "#root", parser22);
        org.jsoup.Connection.Request request24 = request18.parser(parser22);
        int int25 = request18.maxBodySize();
        boolean boolean26 = request18.ignoreHttpErrors();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1048576 + "'", int25 == 1048576);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#text", ":contains(content-encoding)");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.lang.String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response5 = response1.header("multipart/form-data", "");
        org.jsoup.Connection.Method method6 = response5.method();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.className();
        java.lang.String str5 = document2.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element7 = document2.removeAttr("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeFilter.FilterResult filterResult8 = org.jsoup.select.NodeTraversor.filter(nodeFilter0, (org.jsoup.nodes.Node) document2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.NodeFilter.head(org.jsoup.nodes.Node, int)\" because \"filter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = request10.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request20 = httpConnection19.request();
        org.jsoup.Connection connection22 = httpConnection19.referrer("multipart/form-data");
        org.jsoup.Connection.Response response23 = httpConnection19.response();
        org.jsoup.Connection connection25 = httpConnection19.ignoreContentType(false);
        java.io.InputStream inputStream28 = null;
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse(inputStream28, "", "#root", parser31);
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser31);
        org.jsoup.Connection connection34 = connection25.parser(parser31);
        org.jsoup.Connection connection35 = httpConnection0.parser(parser31);
        java.io.Reader reader36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document38 = parser31.parseInput(reader36, "<![CDATA[<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>]]>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection35);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.childNodesCopy();
        java.lang.String str8 = element6.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild1 = new org.jsoup.select.Evaluator.IsOnlyChild();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.id();
        java.lang.String str5 = document3.baseUri();
        org.jsoup.nodes.Element element7 = document3.toggleClass("multipart");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.className();
        java.lang.String str11 = document9.outerHtml();
        boolean boolean13 = document9.hasSameValue((java.lang.Object) 1);
        boolean boolean14 = isOnlyChild1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean16 = outputSettings15.outline();
        int int17 = outputSettings15.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax18 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = outputSettings15.syntax(syntax18);
        java.nio.charset.Charset charset20 = outputSettings19.charset();
        document3.charset(charset20);
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element25 = document23.val("hi!");
        int int26 = document23.childNodeSize();
        boolean boolean27 = isOnlyChild0.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document23);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str30 = document29.wholeText();
        org.jsoup.select.Elements elements31 = document29.parents();
        org.jsoup.nodes.Element element32 = document29.shallowClone();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str35 = document34.wholeText();
        org.jsoup.nodes.Document document36 = document34.clone();
        java.lang.String str37 = document36.title();
        boolean boolean39 = document36.is("amultipart");
        boolean boolean40 = isOnlyChild0.matches((org.jsoup.nodes.Element) document29, (org.jsoup.nodes.Element) document36);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + syntax18 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax18.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings19);
        org.junit.Assert.assertNotNull(charset20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.ParseErrorList parseErrorList9 = parser5.getErrors();
        boolean boolean10 = parser5.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings11 = parser5.settings();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseSettings11);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        java.net.Proxy proxy19 = null;
        org.jsoup.Connection connection20 = httpConnection0.proxy(proxy19);
        org.jsoup.Connection connection23 = httpConnection0.header("[]", "/form-data");
        java.net.Proxy proxy24 = null;
        org.jsoup.Connection connection25 = httpConnection0.proxy(proxy24);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        boolean boolean6 = tag1.isEmpty();
        java.lang.String str7 = tag1.normalName();
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType9 = new org.jsoup.select.Evaluator.IsFirstOfType();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType18 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str21 = document20.wholeText();
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str24 = document23.className();
        boolean boolean25 = isNthLastOfType18.matches((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document23);
        org.jsoup.nodes.Document document26 = document20.clone();
        document26.setBaseUri("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan30 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType33 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str36 = document35.id();
        org.jsoup.select.Elements elements37 = document35.previousElementSiblings();
        org.jsoup.nodes.Element element38 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType33, (org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str41 = document40.className();
        java.lang.String str42 = document40.outerHtml();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str45 = document44.id();
        java.lang.String str46 = document44.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan48 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean49 = document44.is((org.jsoup.select.Evaluator) indexLessThan48);
        boolean boolean50 = isNthLastOfType33.matches((org.jsoup.nodes.Element) document40, (org.jsoup.nodes.Element) document44);
        java.lang.String str51 = document44.cssSelector();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str54 = document53.className();
        java.lang.String str55 = document53.outerHtml();
        boolean boolean57 = document53.hasSameValue((java.lang.Object) 1);
        boolean boolean58 = indexLessThan30.matches((org.jsoup.nodes.Element) document44, (org.jsoup.nodes.Element) document53);
        org.jsoup.nodes.Element element59 = document26.prependChild((org.jsoup.nodes.Node) document53);
        org.jsoup.nodes.Element element61 = element59.removeClass("#root");
        boolean boolean62 = isFirstOfType9.matches(element13, element59);
        org.jsoup.nodes.Attributes attributes63 = element59.attributes();
        org.jsoup.nodes.FormElement formElement64 = new org.jsoup.nodes.FormElement(tag1, "multipart", attributes63);
        java.util.List<org.jsoup.Connection.KeyVal> keyValList65 = formElement64.formData();
        org.jsoup.select.Elements elements66 = formElement64.elements();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str42, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#root" + "'", str51, "#root");
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str55, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(keyValList65);
        org.junit.Assert.assertNotNull(elements66);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method11 = request7.method();
        org.jsoup.Connection connection12 = httpConnection0.method(method11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request14 = httpConnection13.request();
        org.jsoup.Connection.Request request17 = request14.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = request17.multiHeaders();
        org.jsoup.Connection.Request request20 = request17.ignoreHttpErrors(true);
        org.jsoup.Connection connection21 = httpConnection0.request(request20);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request23 = httpConnection22.request();
        org.jsoup.Connection connection25 = httpConnection22.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        org.jsoup.Connection connection28 = httpConnection26.sslSocketFactory(sSLSocketFactory27);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        org.jsoup.Connection connection30 = httpConnection26.sslSocketFactory(sSLSocketFactory29);
        org.jsoup.Connection.Request request31 = httpConnection26.request();
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request33 = httpConnection32.request();
        org.jsoup.Connection.Request request36 = request33.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap37 = request36.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = request36.cookies();
        org.jsoup.Connection connection39 = httpConnection26.headers(strMap38);
        org.jsoup.Connection connection40 = httpConnection22.data(strMap38);
        org.jsoup.Connection connection42 = httpConnection22.referrer("#document");
        org.jsoup.helper.HttpConnection httpConnection43 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request44 = httpConnection43.request();
        org.jsoup.Connection.Request request47 = request44.addHeader("multipart/form-data", "hi!");
        boolean boolean49 = request47.hasHeader("multipart/form-data");
        boolean boolean51 = request47.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method52 = request47.method();
        org.jsoup.Connection.Method method53 = request47.method();
        org.jsoup.Connection.Request request56 = request47.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection connection57 = httpConnection22.request(request47);
        org.jsoup.Connection.Method method58 = org.jsoup.Connection.Method.PATCH;
        org.jsoup.Connection.Request request59 = request47.method(method58);
        org.jsoup.Connection.Request request60 = request20.method(method58);
        boolean boolean63 = request20.hasHeaderWithValue("SYSTEM", ":matches(null)");
        org.jsoup.Connection.Method method64 = request20.method();
        java.net.URL uRL65 = request20.url();
        java.net.Proxy proxy66 = null;
        org.jsoup.Connection.Request request67 = request20.proxy(proxy66);
        org.jsoup.Connection.Request request69 = request20.requestBody("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + method52 + "' != '" + org.jsoup.Connection.Method.GET + "'", method52.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method53 + "' != '" + org.jsoup.Connection.Method.GET + "'", method53.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertTrue("'" + method58 + "' != '" + org.jsoup.Connection.Method.PATCH + "'", method58.equals(org.jsoup.Connection.Method.PATCH));
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertNotNull(request60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + method64 + "' != '" + org.jsoup.Connection.Method.PATCH + "'", method64.equals(org.jsoup.Connection.Method.PATCH));
        org.junit.Assert.assertNull(uRL65);
        org.junit.Assert.assertNotNull(request67);
        org.junit.Assert.assertNotNull(request69);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection6 = httpConnection0.header("#data", ":only-child");
        org.jsoup.Connection.Response response7 = connection6.response();
        org.jsoup.Connection connection9 = connection6.timeout((int) (short) 0);
        org.jsoup.Connection.Request request10 = connection6.request();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(request10);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.simpleText();
        java.lang.String str2 = org.jsoup.Jsoup.clean("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist1);
        org.jsoup.safety.Cleaner cleaner3 = new org.jsoup.safety.Cleaner(whitelist1);
        boolean boolean5 = cleaner3.isValidBodyHtml(":eq(-1)");
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.id();
        java.lang.String str9 = document7.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan11 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean12 = document7.is((org.jsoup.select.Evaluator) indexLessThan11);
        boolean boolean13 = cleaner3.isValid(document7);
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str2, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        org.jsoup.nodes.TextNode textNode3 = textNode1.text("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str4 = textNode3.baseUri();
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(textNode3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag(":eq(-1)=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.className();
        java.lang.String str7 = document5.outerHtml();
        boolean boolean9 = document5.hasSameValue((java.lang.Object) 1);
        java.lang.String str10 = document5.tagName();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element14 = document12.val("hi!");
        boolean boolean15 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document5, element14);
        org.jsoup.select.Elements elements16 = element14.nextElementSiblings();
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = allElements0.matches(element14, element17);
        java.lang.String str19 = allElements0.toString();
        java.lang.String str20 = allElements0.toString();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str23 = document22.wholeText();
        org.jsoup.select.Elements elements24 = document22.parents();
        org.jsoup.nodes.Element element25 = document22.shallowClone();
        java.lang.Object obj26 = null;
        boolean boolean27 = document22.hasSameValue(obj26);
        org.jsoup.nodes.Element element29 = document22.removeAttr(":last-of-type");
        org.jsoup.nodes.Node node30 = element29.parent();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType33 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str36 = document35.className();
        java.lang.String str37 = document35.outerHtml();
        boolean boolean39 = document35.hasSameValue((java.lang.Object) 1);
        java.lang.String str40 = document35.tagName();
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element44 = document42.val("hi!");
        boolean boolean45 = isNthLastOfType33.matches((org.jsoup.nodes.Element) document35, element44);
        java.lang.String str46 = document35.title();
        org.jsoup.select.Elements elements48 = document35.getElementsMatchingText("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element50 = document35.addClass("#document");
        boolean boolean51 = allElements0.matches(element29, element50);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str7, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "*" + "'", str19, "*");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "*" + "'", str20, "*");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str37, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#root" + "'", str40, "#root");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.KeyVal keyVal3 = httpConnection0.data("Content-Encoding");
        java.net.Proxy proxy4 = null;
        org.jsoup.Connection connection5 = httpConnection0.proxy(proxy4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection connection9 = httpConnection6.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection10.sslSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        org.jsoup.Connection connection14 = httpConnection10.sslSocketFactory(sSLSocketFactory13);
        org.jsoup.Connection.Request request15 = httpConnection10.request();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request17 = httpConnection16.request();
        org.jsoup.Connection.Request request20 = request17.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = request20.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = request20.cookies();
        org.jsoup.Connection connection23 = httpConnection10.headers(strMap22);
        org.jsoup.Connection connection24 = httpConnection6.data(strMap22);
        org.jsoup.Connection.Request request25 = httpConnection6.request();
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request27 = httpConnection26.request();
        org.jsoup.Connection.Request request30 = request27.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request33 = request30.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean36 = request30.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        org.jsoup.Connection.Request request39 = request30.cookie("#document", "#document");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = request39.headers();
        org.jsoup.Connection connection41 = httpConnection6.headers(strMap40);
        org.jsoup.Connection connection42 = httpConnection0.headers(strMap40);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory43 = null;
        org.jsoup.Connection connection44 = httpConnection0.sslSocketFactory(sSLSocketFactory43);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(keyVal3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.simpleText();
        org.jsoup.safety.Cleaner cleaner1 = new org.jsoup.safety.Cleaner(whitelist0);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.wholeText();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.className();
        boolean boolean11 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document6, (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Document document12 = document6.clone();
        org.jsoup.nodes.Element element14 = document6.tagName("#root");
        org.jsoup.select.Elements elements16 = document6.getElementsByIndexLessThan(100);
        java.lang.String str17 = document6.data();
        boolean boolean18 = cleaner1.isValid(document6);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str21 = document20.id();
        org.jsoup.select.Elements elements22 = document20.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode23 = document20.quirksMode();
        boolean boolean25 = document20.hasClass("multipart/form-data");
        org.jsoup.parser.Tag tag26 = document20.tag();
        org.jsoup.select.Elements elements28 = document20.getElementsByAttribute("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        boolean boolean29 = cleaner1.isValid(document20);
        org.junit.Assert.assertNotNull(whitelist0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + quirksMode23 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode23.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("Content-Encoding");
        org.jsoup.parser.Tag tag3 = new org.jsoup.parser.Tag("#document");
        boolean boolean4 = tag3.isFormListed();
        boolean boolean5 = tag3.isBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag3, "ultipart");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.id();
        java.lang.String str11 = document9.baseUri();
        org.jsoup.nodes.Element element14 = document9.attr("", true);
        org.jsoup.select.Elements elements16 = document9.getElementsContainingText("#text");
        boolean boolean17 = attribute1.matches(element7, (org.jsoup.nodes.Element) document9);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType20 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str23 = document22.id();
        org.jsoup.select.Elements elements24 = document22.previousElementSiblings();
        org.jsoup.nodes.Element element25 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType20, (org.jsoup.nodes.Element) document22);
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str28 = document27.className();
        java.lang.String str30 = document27.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element32 = document27.text("");
        boolean boolean33 = attribute1.matches((org.jsoup.nodes.Element) document22, element32);
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str36 = document35.id();
        java.lang.String str37 = document35.baseUri();
        org.jsoup.nodes.Element element40 = document35.attr("", true);
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document42 = document35.parser(parser41);
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str45 = document44.id();
        org.jsoup.select.Elements elements46 = document44.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode47 = document44.quirksMode();
        boolean boolean49 = document44.hasClass("multipart/form-data");
        org.jsoup.parser.Tag tag50 = document44.tag();
        boolean boolean51 = attribute1.matches((org.jsoup.nodes.Element) document42, (org.jsoup.nodes.Element) document44);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(element25);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertTrue("'" + quirksMode47 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode47.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.lang.String str5 = keyVal3.key();
        java.io.InputStream inputStream6 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.outline(false);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.wholeText();
        org.jsoup.select.Elements elements7 = document5.parents();
        java.nio.charset.Charset charset8 = document5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings3.charset(charset8);
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean11 = outputSettings10.outline();
        int int12 = outputSettings10.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax13 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = outputSettings10.syntax(syntax13);
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = outputSettings9.syntax(syntax13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + syntax13 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax13.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings14);
        org.junit.Assert.assertNotNull(outputSettings15);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        document10.setBaseUri("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType17 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.nodes.Element element22 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType17, (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.className();
        java.lang.String str26 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str29 = document28.id();
        java.lang.String str30 = document28.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan32 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean33 = document28.is((org.jsoup.select.Evaluator) indexLessThan32);
        boolean boolean34 = isNthLastOfType17.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document28);
        java.lang.String str35 = document28.cssSelector();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str38 = document37.className();
        java.lang.String str39 = document37.outerHtml();
        boolean boolean41 = document37.hasSameValue((java.lang.Object) 1);
        boolean boolean42 = indexLessThan14.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document37);
        org.jsoup.nodes.Element element43 = document10.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Document document44 = element43.ownerDocument();
        org.jsoup.select.Elements elements46 = document44.getElementsByIndexGreaterThan((int) (byte) 1);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str39, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(elements46);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((java.lang.Object) 1);
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element7 = document1.head();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.nodes.Element element11 = document1.prependChild((org.jsoup.nodes.Node) document10);
        org.jsoup.select.Elements elements13 = document1.getElementsContainingOwnText("");
        java.lang.String str14 = document1.val();
        org.jsoup.select.Elements elements15 = document1.siblingElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.className();
        java.lang.String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.id();
        java.lang.String str17 = document15.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        java.lang.String str22 = document15.cssSelector();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.className();
        java.lang.String str26 = document24.outerHtml();
        boolean boolean28 = document24.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Element element31 = document24.prependText("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        int int32 = element31.childNodeSize();
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("multipart/form-data", ":matchesOwn(null)");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.className();
        org.jsoup.select.Elements elements6 = document2.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements7 = elements6.prev();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.filter(nodeFilter0, elements6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method9 = request4.method();
        org.jsoup.Connection.Method method10 = request4.method();
        java.net.URL uRL11 = request4.url();
        org.jsoup.Connection.Request request14 = request4.header("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", "SYSTEM");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(request14);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.parser.ParseError[] parseErrorArray8 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList9 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9, parseErrorArray8);
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        int int12 = parseErrorList9.indexOf((java.lang.Object) parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList9.iterator();
        boolean boolean14 = elements5.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9);
        java.io.InputStream inputStream15 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream18 = new org.jsoup.internal.ConstrainableInputStream(inputStream15, 1, (int) (byte) 0);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document22 = org.jsoup.helper.DataUtil.load(inputStream15, ":eq(-1)", "Content-Encoding", parser21);
        boolean boolean23 = elements5.add((org.jsoup.nodes.Element) document22);
        org.jsoup.select.Elements elements24 = document22.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>", "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertNotNull(dataNode2);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) 1);
        org.jsoup.select.Evaluator.AllElements allElements2 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType5 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        boolean boolean11 = document7.hasSameValue((java.lang.Object) 1);
        java.lang.String str12 = document7.tagName();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element16 = document14.val("hi!");
        boolean boolean17 = isNthLastOfType5.matches((org.jsoup.nodes.Element) document7, element16);
        org.jsoup.select.Elements elements18 = element16.nextElementSiblings();
        org.jsoup.nodes.Element element19 = null;
        boolean boolean20 = allElements2.matches(element16, element19);
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot23 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        java.lang.String str24 = attributeWithValueNot23.toString();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType27 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str30 = document29.wholeText();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str33 = document32.className();
        boolean boolean34 = isNthLastOfType27.matches((org.jsoup.nodes.Element) document29, (org.jsoup.nodes.Element) document32);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str37 = document36.id();
        int int38 = document36.elementSiblingIndex();
        boolean boolean39 = attributeWithValueNot23.matches((org.jsoup.nodes.Element) document29, (org.jsoup.nodes.Element) document36);
        boolean boolean40 = indexEquals1.matches(element16, (org.jsoup.nodes.Element) document36);
        org.jsoup.select.Elements elements43 = document36.getElementsByAttributeValueStarting("#cdata", ".Content-Encoding");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[:eq(-1)!=#doctype]" + "'", str24, "[:eq(-1)!=#doctype]");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements43);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document8 = document1.parser(parser7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser7.settings();
        org.jsoup.nodes.Document document12 = parser7.parseInput(":only-of-type", ":matchesOwn(null)");
        org.jsoup.nodes.Element element14 = document12.append("UTF-8");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean2 = outputSettings1.outline();
        int int3 = outputSettings1.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax4 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.syntax(syntax4);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", outputSettings5);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.indentAmount((int) (short) 10);
        boolean boolean10 = outputSettings5.prettyPrint();
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings5.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + syntax4 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax4.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(outputSettings11);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection6 = httpConnection0.header("#data", ":only-child");
        org.jsoup.Connection.Response response7 = connection6.response();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasCookie("#text");
        org.jsoup.parser.Parser parser9 = request4.parser();
        org.jsoup.nodes.Document document12 = parser9.parseInput(":eq(1)", "*");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((java.lang.Object) parseErrorList3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        boolean boolean12 = parseErrorList1.equals((java.lang.Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        parseErrorList14.ensureCapacity(10);
        boolean boolean18 = parseErrorList1.remove((java.lang.Object) parseErrorList14);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request20 = httpConnection19.request();
        org.jsoup.Connection.Request request23 = request20.addHeader("multipart/form-data", "hi!");
        boolean boolean25 = request23.hasHeader("multipart/form-data");
        int int26 = parseErrorList14.indexOf((java.lang.Object) request23);
        parseErrorList14.ensureCapacity((int) (short) -1);
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild29 = new org.jsoup.select.Evaluator.IsFirstChild();
        java.lang.String str30 = isFirstChild29.toString();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str33 = document32.wholeText();
        org.jsoup.nodes.Document document34 = document32.clone();
        java.io.InputStream inputStream36 = null;
        org.jsoup.nodes.Document document39 = org.jsoup.helper.DataUtil.load(inputStream36, "#root=\"\"", "#text");
        org.jsoup.parser.ParseErrorList parseErrorList41 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor42 = parseErrorList41.listIterator();
        org.jsoup.nodes.TextNode textNode45 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node47 = textNode45.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node49 = textNode45.removeAttr("#document");
        int int50 = parseErrorList41.lastIndexOf((java.lang.Object) node49);
        org.jsoup.parser.ParseError[] parseErrorArray51 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList52 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList52, parseErrorArray51);
        org.jsoup.parser.ParseErrorList parseErrorList54 = org.jsoup.parser.ParseErrorList.noTracking();
        int int55 = parseErrorList52.indexOf((java.lang.Object) parseErrorList54);
        org.jsoup.helper.HttpConnection httpConnection56 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory57 = null;
        org.jsoup.Connection connection58 = httpConnection56.sslSocketFactory(sSLSocketFactory57);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory59 = null;
        org.jsoup.Connection connection60 = httpConnection56.sslSocketFactory(sSLSocketFactory59);
        org.jsoup.Connection connection62 = httpConnection56.ignoreContentType(true);
        boolean boolean63 = parseErrorList52.equals((java.lang.Object) true);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream64 = parseErrorList52.parallelStream();
        boolean boolean65 = parseErrorList41.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList52);
        java.util.List<org.jsoup.nodes.Node> nodeList66 = org.jsoup.parser.Parser.parseFragment("&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n  hi!\n &lt;/body&gt;\n&lt;/html&gt;=\"#root\"", (org.jsoup.nodes.Element) document39, "<!hi!!>", parseErrorList41);
        boolean boolean67 = isFirstChild29.matches((org.jsoup.nodes.Element) document32, (org.jsoup.nodes.Element) document39);
        int int68 = parseErrorList14.lastIndexOf((java.lang.Object) document32);
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ":first-child" + "'", str30, ":first-child");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseErrorList41);
        org.junit.Assert.assertNotNull(parseErrorItor42);
        org.junit.Assert.assertNotNull(textNode45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(parseErrorArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parseErrorList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(parseErrorStream64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.className();
        java.lang.String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.id();
        java.lang.String str17 = document15.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        java.lang.String str22 = document15.cssSelector();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.className();
        java.lang.String str26 = document24.outerHtml();
        boolean boolean28 = document24.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Document.QuirksMode quirksMode30 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document31 = document24.quirksMode(quirksMode30);
        org.jsoup.select.Elements elements33 = document24.getElementsMatchingOwnText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str36 = document35.id();
        org.jsoup.select.Elements elements37 = document35.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor38 = elements37.listIterator();
        boolean boolean40 = elements37.equals((java.lang.Object) 1.0d);
        java.lang.String str41 = elements37.text();
        org.jsoup.select.Elements elements43 = elements37.wrap("#root");
        org.jsoup.select.Elements elements45 = elements43.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements47 = elements43.html("#text");
        boolean boolean48 = elements33.contains((java.lang.Object) elements43);
        elements43.clear();
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + quirksMode30 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode30.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(elementItor38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elements47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.lang.String str6 = org.jsoup.internal.StringUtil.join((java.util.Collection) elements3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = elements3.append("#declaration");
        org.jsoup.select.Elements elements10 = elements3.eq((int) 'u');
        boolean boolean11 = elements3.hasText();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator12 = elements3.spliterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(elementSpliterator12);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = request10.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        java.io.InputStream inputStream6 = null;
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse(inputStream6, "", "#root", parser9);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser9);
        org.jsoup.nodes.Document document12 = document11.normalise();
        org.jsoup.nodes.Element element13 = document1.appendTo((org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Element element14 = document12.shallowClone();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        boolean boolean11 = request9.hasHeader("multipart/form-data");
        boolean boolean13 = request9.hasCookie("#text");
        org.jsoup.parser.Parser parser14 = request9.parser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse(inputStream2, "", "multipart/form-data", parser14);
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request17 = httpConnection16.request();
        org.jsoup.Connection connection19 = httpConnection16.referrer("multipart/form-data");
        org.jsoup.Connection.Response response20 = httpConnection16.response();
        org.jsoup.Connection connection22 = httpConnection16.ignoreContentType(false);
        java.io.InputStream inputStream25 = null;
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse(inputStream25, "", "#root", parser28);
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser28);
        org.jsoup.Connection connection31 = connection22.parser(parser28);
        org.jsoup.parser.ParseSettings parseSettings32 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str34 = parseSettings32.normalizeTag("#doctype");
        org.jsoup.parser.Parser parser35 = parser28.settings(parseSettings32);
        org.jsoup.parser.Parser parser36 = parser14.settings(parseSettings32);
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse(":last-of-type", "", parser14);
        int int38 = document37.childNodeSize();
        java.lang.String str39 = document37.val();
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.util.List<java.lang.String> strList3 = response1.headers(" hi!=\"multipart/form-data\"");
        org.jsoup.Connection.Response response5 = response1.removeHeader(":nth-last-of-type(100n-1)");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        boolean boolean12 = request10.hasHeader("multipart/form-data");
        boolean boolean14 = request10.hasHeader("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request16 = httpConnection15.request();
        org.jsoup.Connection.Request request19 = request16.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method20 = request16.method();
        org.jsoup.Connection.Request request21 = request10.method(method20);
        org.jsoup.Connection.Response response22 = response5.method(method20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response5.headers();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertTrue("'" + method20 + "' != '" + org.jsoup.Connection.Method.GET + "'", method20.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.select.Evaluator.MatchText matchText0 = new org.jsoup.select.Evaluator.MatchText();
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot3 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.id();
        java.lang.String str7 = document5.baseUri();
        org.jsoup.nodes.Element element10 = document5.attr("", true);
        org.jsoup.nodes.Node node13 = document5.attr("#text", "");
        org.jsoup.nodes.Element element14 = document5.shallowClone();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str17 = document16.id();
        java.lang.String str18 = document16.baseUri();
        org.jsoup.nodes.Element element19 = document16.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = document16.dataset();
        org.jsoup.nodes.Element element22 = document16.html("#root=\"\"");
        boolean boolean23 = attributeWithValueNot3.matches(element14, (org.jsoup.nodes.Element) document16);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType26 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str29 = document28.wholeText();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str32 = document31.className();
        boolean boolean33 = isNthLastOfType26.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document31);
        org.jsoup.nodes.Document document34 = document28.clone();
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot37 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#text", "#text");
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("", "#doctype");
        org.jsoup.nodes.Document document43 = org.jsoup.parser.Parser.parse(" hi!=\"multipart/form-data\"", "Content-Encoding");
        boolean boolean44 = attributeWithValueNot37.matches((org.jsoup.nodes.Element) document40, (org.jsoup.nodes.Element) document43);
        boolean boolean45 = attributeWithValueNot3.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document40);
        org.jsoup.nodes.Document document47 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str48 = document47.id();
        java.lang.String str49 = document47.baseUri();
        org.jsoup.nodes.Element element50 = document47.body();
        org.jsoup.helper.HttpConnection httpConnection51 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request52 = httpConnection51.request();
        org.jsoup.Connection.Request request55 = request52.addHeader("multipart/form-data", "hi!");
        boolean boolean57 = request55.hasHeader("multipart/form-data");
        boolean boolean59 = request55.hasCookie("#text");
        org.jsoup.parser.Parser parser60 = request55.parser();
        org.jsoup.nodes.Document document61 = document47.parser(parser60);
        org.jsoup.nodes.Node node62 = document61.parent();
        org.jsoup.select.Elements elements63 = document61.children();
        boolean boolean64 = matchText0.matches((org.jsoup.nodes.Element) document40, (org.jsoup.nodes.Element) document61);
        org.jsoup.nodes.Document document66 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str67 = document66.id();
        java.lang.String str68 = document66.baseUri();
        org.jsoup.nodes.Element element71 = document66.attr("", true);
        org.jsoup.select.Elements elements73 = document66.getElementsContainingOwnText("[]");
        org.jsoup.nodes.Element element75 = document66.tagName("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String str76 = document66.html();
        org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str79 = document78.id();
        java.lang.String str80 = document78.baseUri();
        org.jsoup.nodes.Element element81 = document78.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap82 = document78.dataset();
        boolean boolean83 = matchText0.matches((org.jsoup.nodes.Element) document66, (org.jsoup.nodes.Element) document78);
        org.jsoup.nodes.Node node84 = document78.shallowClone();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertNotNull(element75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str76, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(element81);
        org.junit.Assert.assertNotNull(strMap82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("SYSTEM");
        java.lang.String str2 = containsOwnText1.toString();
        java.lang.String str3 = containsOwnText1.toString();
        java.lang.String str4 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(system)" + "'", str2, ":containsOwn(system)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":containsOwn(system)" + "'", str3, ":containsOwn(system)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":containsOwn(system)" + "'", str4, ":containsOwn(system)");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        org.jsoup.Connection.Request request19 = httpConnection0.request();
        org.jsoup.Connection connection21 = httpConnection0.requestBody("#document");
        org.jsoup.Connection connection23 = httpConnection0.userAgent("/form-data");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.KeyVal keyVal3 = httpConnection0.data("Content-Encoding");
        org.jsoup.Connection connection5 = httpConnection0.maxBodySize((int) (short) 100);
        org.jsoup.Connection connection8 = httpConnection0.cookie("\n<!--<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>-->", ":eq(-1)=mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(keyVal3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.parser.ParseError[] parseErrorArray8 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList9 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9, parseErrorArray8);
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        int int12 = parseErrorList9.indexOf((java.lang.Object) parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList9.iterator();
        boolean boolean14 = elements5.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9);
        org.jsoup.parser.ParseError parseError15 = null;
        boolean boolean16 = parseErrorList9.add(parseError15);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request18 = httpConnection17.request();
        org.jsoup.Connection.Request request21 = request18.addHeader("multipart/form-data", "hi!");
        boolean boolean23 = request21.hasHeader("multipart/form-data");
        boolean boolean25 = request21.hasCookie("#text");
        org.jsoup.parser.Parser parser26 = request21.parser();
        org.jsoup.Connection.Request request29 = request21.header("#text", "multipart/form-data");
        boolean boolean30 = parseErrorList9.remove((java.lang.Object) request29);
        boolean boolean33 = request29.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", " hi!=\"multipart/form-data\"");
        java.lang.String str35 = request29.cookie("#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str1 = allElements0.toString();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        boolean boolean5 = allElements0.matches(element2, element4);
        java.lang.String str6 = element4.nodeName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "*" + "'", str1, "*");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str6, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.helper.HttpConnection httpConnection2 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request3 = httpConnection2.request();
        org.jsoup.Connection connection5 = httpConnection2.referrer("multipart/form-data");
        org.jsoup.Connection.Response response6 = httpConnection2.response();
        org.jsoup.Connection connection8 = httpConnection2.ignoreContentType(false);
        org.jsoup.Connection.Method method9 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean10 = method9.hasBody();
        org.jsoup.Connection connection11 = httpConnection2.method(method9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser13 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder12);
        org.jsoup.Connection connection14 = httpConnection2.parser(parser13);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("Content-Encoding=\"#root\"", ":nth-last-of-type(100n-1)", parser13);
        org.jsoup.nodes.Element element16 = document15.body();
        org.jsoup.select.Elements elements17 = document15.children();
        org.jsoup.select.Elements elements18 = elements17.nextAll();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor20 = elements18.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method9.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        boolean boolean1 = org.jsoup.nodes.Entities.isNamedEntity("<!#root!>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        java.lang.String str2 = indexEquals1.toString();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan6 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType9 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        org.jsoup.nodes.Element element14 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType9, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str17 = document16.className();
        java.lang.String str18 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str21 = document20.id();
        java.lang.String str22 = document20.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan24 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean25 = document20.is((org.jsoup.select.Evaluator) indexLessThan24);
        boolean boolean26 = isNthLastOfType9.matches((org.jsoup.nodes.Element) document16, (org.jsoup.nodes.Element) document20);
        java.lang.String str27 = document20.cssSelector();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str30 = document29.className();
        java.lang.String str31 = document29.outerHtml();
        boolean boolean33 = document29.hasSameValue((java.lang.Object) 1);
        boolean boolean34 = indexLessThan6.matches((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document29);
        org.jsoup.parser.Parser parser35 = document20.parser();
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType36 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str37 = isFirstOfType36.toString();
        boolean boolean38 = document20.is((org.jsoup.select.Evaluator) isFirstOfType36);
        boolean boolean39 = indexEquals1.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document20);
        java.util.Set<java.lang.String> strSet40 = document20.classNames();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(-1)" + "'", str2, ":eq(-1)");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str18, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str31, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(parser35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ":first-of-type" + "'", str37, ":first-of-type");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.className();
        java.lang.String str6 = document3.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str7 = document3.normalName();
        org.w3c.dom.Document document8 = w3CDom1.fromJsoup(document3);
        java.lang.String str9 = w3CDom0.asString(document8);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.className();
        java.lang.String str16 = document13.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str17 = document13.normalName();
        org.w3c.dom.Document document18 = w3CDom11.fromJsoup(document13);
        java.lang.String str19 = w3CDom10.asString(document18);
        java.lang.String str20 = w3CDom0.asString(document18);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType23 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str26 = document25.id();
        org.jsoup.select.Elements elements27 = document25.previousElementSiblings();
        org.jsoup.nodes.Element element28 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType23, (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str31 = document30.className();
        java.lang.String str32 = document30.outerHtml();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str35 = document34.id();
        java.lang.String str36 = document34.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan38 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean39 = document34.is((org.jsoup.select.Evaluator) indexLessThan38);
        boolean boolean40 = isNthLastOfType23.matches((org.jsoup.nodes.Element) document30, (org.jsoup.nodes.Element) document34);
        java.lang.String str41 = document34.cssSelector();
        org.jsoup.nodes.Element element42 = document34.clearAttributes();
        java.lang.String str43 = document34.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = document34.dataset();
        org.w3c.dom.Document document45 = w3CDom0.fromJsoup(document34);
        org.jsoup.nodes.Document.OutputSettings outputSettings46 = document34.outputSettings();
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild47 = new org.jsoup.select.Evaluator.IsOnlyChild();
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str50 = document49.id();
        java.lang.String str51 = document49.baseUri();
        org.jsoup.nodes.Element element53 = document49.toggleClass("multipart");
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str56 = document55.className();
        java.lang.String str57 = document55.outerHtml();
        boolean boolean59 = document55.hasSameValue((java.lang.Object) 1);
        boolean boolean60 = isOnlyChild47.matches((org.jsoup.nodes.Element) document49, (org.jsoup.nodes.Element) document55);
        org.jsoup.nodes.Document.OutputSettings outputSettings61 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean62 = outputSettings61.outline();
        int int63 = outputSettings61.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax64 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings65 = outputSettings61.syntax(syntax64);
        java.nio.charset.Charset charset66 = outputSettings65.charset();
        document49.charset(charset66);
        org.jsoup.nodes.Document.OutputSettings outputSettings68 = outputSettings46.charset(charset66);
        java.nio.charset.Charset charset69 = outputSettings46.charset();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull("document8.getDocumentURI() == null", document8.getDocumentURI());
        org.junit.Assert.assertNull("document8.getInputEncoding() == null", document8.getInputEncoding());
        org.junit.Assert.assertNull("document8.getXmlEncoding() == null", document8.getXmlEncoding());
        org.junit.Assert.assertEquals(document8.getXmlVersion(), "1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str9, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull("document18.getDocumentURI() == null", document18.getDocumentURI());
        org.junit.Assert.assertNull("document18.getInputEncoding() == null", document18.getInputEncoding());
        org.junit.Assert.assertNull("document18.getXmlEncoding() == null", document18.getXmlEncoding());
        org.junit.Assert.assertEquals(document18.getXmlVersion(), "1.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str19, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str20, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str32, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNull("document45.getDocumentURI() == null", document45.getDocumentURI());
        org.junit.Assert.assertNull("document45.getInputEncoding() == null", document45.getInputEncoding());
        org.junit.Assert.assertNull("document45.getXmlEncoding() == null", document45.getXmlEncoding());
        org.junit.Assert.assertEquals(document45.getXmlVersion(), "1.0");
        org.junit.Assert.assertNotNull(outputSettings46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str57, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + syntax64 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax64.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings65);
        org.junit.Assert.assertNotNull(charset66);
        org.junit.Assert.assertNotNull(outputSettings68);
        org.junit.Assert.assertNotNull(charset69);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("\n<!--<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>-->");
        tokenQueue1.advance();
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection9 = httpConnection0.data("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "Content-Encoding", inputStream7, "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection connection13 = httpConnection10.referrer("multipart/form-data");
        org.jsoup.Connection.Response response14 = httpConnection10.response();
        org.jsoup.Connection connection16 = httpConnection10.ignoreContentType(false);
        org.jsoup.Connection.Request request17 = httpConnection10.request();
        org.jsoup.Connection connection20 = httpConnection10.cookie(":lt(52)", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        org.jsoup.Connection connection23 = httpConnection21.sslSocketFactory(sSLSocketFactory22);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection21.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection.Request request26 = httpConnection21.request();
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request28 = httpConnection27.request();
        org.jsoup.Connection.Request request31 = request28.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = request31.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = request31.cookies();
        org.jsoup.Connection connection34 = httpConnection21.headers(strMap33);
        org.jsoup.helper.HttpConnection.KeyVal keyVal37 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.KeyVal[] keyValArray38 = new org.jsoup.Connection.KeyVal[] { keyVal37 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList39 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39, keyValArray38);
        org.jsoup.Connection connection41 = connection34.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        org.jsoup.Connection connection42 = httpConnection10.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        org.jsoup.Connection connection43 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        org.jsoup.Connection connection46 = connection43.proxy("/form-data", (int) (short) 1);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(keyVal37);
        org.junit.Assert.assertNotNull(keyValArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection46);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element5 = document1.toggleClass("multipart");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        boolean boolean12 = request10.hasHeader("multipart/form-data");
        boolean boolean14 = request10.hasHeader("multipart/form-data");
        java.lang.String str15 = request10.requestBody();
        org.jsoup.parser.Parser parser16 = request10.parser();
        org.jsoup.nodes.Document document17 = document1.parser(parser16);
        java.util.regex.Pattern pattern18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements19 = document17.getElementsMatchingText(pattern18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element8 = document1.empty();
        int int9 = document1.childNodeSize();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.internal.StringUtil.padding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: width must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        org.jsoup.Connection.Request request19 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response21 = httpConnection20.response();
        java.lang.String str22 = response21.statusMessage();
        java.lang.String str23 = response21.statusMessage();
        org.jsoup.Connection.Method method24 = response21.method();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = response21.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response21.cookies();
        org.jsoup.Connection connection27 = httpConnection0.data(strMap26);
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        org.jsoup.Connection connection30 = httpConnection28.sslSocketFactory(sSLSocketFactory29);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        org.jsoup.Connection connection32 = httpConnection28.sslSocketFactory(sSLSocketFactory31);
        org.jsoup.Connection.Request request33 = httpConnection28.request();
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request35 = httpConnection34.request();
        org.jsoup.Connection.Request request38 = request35.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method39 = request35.method();
        org.jsoup.Connection connection40 = httpConnection28.method(method39);
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request42 = httpConnection41.request();
        org.jsoup.Connection.Request request45 = request42.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap46 = request45.multiHeaders();
        org.jsoup.Connection.Request request48 = request45.ignoreHttpErrors(true);
        org.jsoup.Connection connection49 = httpConnection28.request(request48);
        org.jsoup.Connection connection50 = httpConnection0.request(request48);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection52 = httpConnection0.postDataCharset("#:first-child");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #:first-child");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertTrue("'" + method39 + "' != '" + org.jsoup.Connection.Method.GET + "'", method39.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(request45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(request48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection.Request request9 = connection8.request();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.lang.String str6 = org.jsoup.internal.StringUtil.join((java.util.Collection) elements3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = elements3.append("#declaration");
        boolean boolean9 = elements3.hasText();
        org.jsoup.select.Elements elements11 = elements3.prev("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom1 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.className();
        java.lang.String str6 = document3.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str7 = document3.normalName();
        org.w3c.dom.Document document8 = w3CDom1.fromJsoup(document3);
        java.lang.String str9 = w3CDom0.asString(document8);
        org.jsoup.helper.W3CDom w3CDom10 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom11 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.className();
        java.lang.String str16 = document13.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str17 = document13.normalName();
        org.w3c.dom.Document document18 = w3CDom11.fromJsoup(document13);
        java.lang.String str19 = w3CDom10.asString(document18);
        java.lang.String str20 = w3CDom0.asString(document18);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType23 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str26 = document25.id();
        org.jsoup.select.Elements elements27 = document25.previousElementSiblings();
        org.jsoup.nodes.Element element28 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType23, (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str31 = document30.className();
        java.lang.String str32 = document30.outerHtml();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str35 = document34.id();
        java.lang.String str36 = document34.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan38 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean39 = document34.is((org.jsoup.select.Evaluator) indexLessThan38);
        boolean boolean40 = isNthLastOfType23.matches((org.jsoup.nodes.Element) document30, (org.jsoup.nodes.Element) document34);
        java.lang.String str41 = document34.cssSelector();
        org.jsoup.nodes.Element element42 = document34.clearAttributes();
        java.lang.String str43 = document34.tagName();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = document34.dataset();
        org.w3c.dom.Document document45 = w3CDom0.fromJsoup(document34);
        org.jsoup.helper.W3CDom w3CDom46 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str49 = document48.className();
        java.lang.String str51 = document48.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str52 = document48.normalName();
        org.w3c.dom.Document document53 = w3CDom46.fromJsoup(document48);
        org.jsoup.helper.W3CDom w3CDom54 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom55 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str58 = document57.className();
        java.lang.String str60 = document57.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str61 = document57.normalName();
        org.w3c.dom.Document document62 = w3CDom55.fromJsoup(document57);
        java.lang.String str63 = w3CDom54.asString(document62);
        org.jsoup.helper.W3CDom w3CDom64 = new org.jsoup.helper.W3CDom();
        org.jsoup.helper.W3CDom w3CDom65 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document67 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str68 = document67.className();
        java.lang.String str70 = document67.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str71 = document67.normalName();
        org.w3c.dom.Document document72 = w3CDom65.fromJsoup(document67);
        java.lang.String str73 = w3CDom64.asString(document72);
        java.lang.String str74 = w3CDom54.asString(document72);
        java.lang.String str75 = w3CDom46.asString(document72);
        java.lang.String str76 = w3CDom0.asString(document72);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull("document8.getDocumentURI() == null", document8.getDocumentURI());
        org.junit.Assert.assertNull("document8.getInputEncoding() == null", document8.getInputEncoding());
        org.junit.Assert.assertNull("document8.getXmlEncoding() == null", document8.getXmlEncoding());
        org.junit.Assert.assertEquals(document8.getXmlVersion(), "1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str9, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull("document18.getDocumentURI() == null", document18.getDocumentURI());
        org.junit.Assert.assertNull("document18.getInputEncoding() == null", document18.getInputEncoding());
        org.junit.Assert.assertNull("document18.getXmlEncoding() == null", document18.getXmlEncoding());
        org.junit.Assert.assertEquals(document18.getXmlVersion(), "1.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str19, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str20, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNull(element28);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str32, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNull("document45.getDocumentURI() == null", document45.getDocumentURI());
        org.junit.Assert.assertNull("document45.getInputEncoding() == null", document45.getInputEncoding());
        org.junit.Assert.assertNull("document45.getXmlEncoding() == null", document45.getXmlEncoding());
        org.junit.Assert.assertEquals(document45.getXmlVersion(), "1.0");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#root" + "'", str52, "#root");
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNull("document53.getDocumentURI() == null", document53.getDocumentURI());
        org.junit.Assert.assertNull("document53.getInputEncoding() == null", document53.getInputEncoding());
        org.junit.Assert.assertNull("document53.getXmlEncoding() == null", document53.getXmlEncoding());
        org.junit.Assert.assertEquals(document53.getXmlVersion(), "1.0");
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "#root" + "'", str61, "#root");
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNull("document62.getDocumentURI() == null", document62.getDocumentURI());
        org.junit.Assert.assertNull("document62.getInputEncoding() == null", document62.getInputEncoding());
        org.junit.Assert.assertNull("document62.getXmlEncoding() == null", document62.getXmlEncoding());
        org.junit.Assert.assertEquals(document62.getXmlVersion(), "1.0");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str63, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "#root" + "'", str71, "#root");
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNull("document72.getDocumentURI() == null", document72.getDocumentURI());
        org.junit.Assert.assertNull("document72.getInputEncoding() == null", document72.getInputEncoding());
        org.junit.Assert.assertNull("document72.getXmlEncoding() == null", document72.getXmlEncoding());
        org.junit.Assert.assertEquals(document72.getXmlVersion(), "1.0");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str73, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str74, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str75, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str76, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        java.lang.Object obj5 = null;
        boolean boolean6 = document1.hasSameValue(obj5);
        org.jsoup.nodes.Element element8 = document1.appendText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Element element9 = document1.root();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = document1.siblingNodes();
        document1.updateMetaCharsetElement(true);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        boolean boolean5 = tokenQueue1.matches("");
        java.lang.String str6 = tokenQueue1.consumeWord();
        char char7 = tokenQueue1.peek();
        boolean boolean8 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart" + "'", str6, "multipart");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '/' + "'", char7 == '/');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        java.lang.String str9 = tag1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.Connection connection10 = httpConnection0.cookie(":lt(52)", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        org.jsoup.Connection connection15 = httpConnection13.sslSocketFactory(sSLSocketFactory14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        org.jsoup.Connection connection17 = httpConnection13.sslSocketFactory(sSLSocketFactory16);
        org.jsoup.Connection.Request request18 = httpConnection13.request();
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request20 = httpConnection19.request();
        org.jsoup.Connection.Request request23 = request20.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = request23.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = request23.cookies();
        org.jsoup.Connection connection26 = httpConnection13.headers(strMap25);
        java.io.InputStream inputStream29 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream32 = new org.jsoup.internal.ConstrainableInputStream(inputStream29, 1, (int) (byte) 0);
        org.jsoup.Connection connection33 = httpConnection13.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream32);
        org.jsoup.Connection connection34 = httpConnection0.data("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", (java.io.InputStream) constrainableInputStream32);
        org.jsoup.Connection connection36 = httpConnection0.requestBody(":lt(52)");
        java.io.InputStream inputStream37 = null;
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request41 = httpConnection40.request();
        org.jsoup.Connection.Request request44 = request41.addHeader("multipart/form-data", "hi!");
        boolean boolean46 = request44.hasHeader("multipart/form-data");
        boolean boolean48 = request44.hasCookie("#text");
        org.jsoup.parser.Parser parser49 = request44.parser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse(inputStream37, "", "multipart/form-data", parser49);
        org.jsoup.helper.HttpConnection httpConnection51 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request52 = httpConnection51.request();
        org.jsoup.Connection connection54 = httpConnection51.referrer("multipart/form-data");
        org.jsoup.Connection.Response response55 = httpConnection51.response();
        org.jsoup.Connection connection57 = httpConnection51.ignoreContentType(false);
        java.io.InputStream inputStream60 = null;
        org.jsoup.parser.Parser parser63 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parse(inputStream60, "", "#root", parser63);
        org.jsoup.nodes.Document document65 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser63);
        org.jsoup.Connection connection66 = connection57.parser(parser63);
        org.jsoup.parser.ParseSettings parseSettings67 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str69 = parseSettings67.normalizeTag("#doctype");
        org.jsoup.parser.Parser parser70 = parser63.settings(parseSettings67);
        org.jsoup.parser.Parser parser71 = parser49.settings(parseSettings67);
        org.jsoup.Connection connection72 = httpConnection0.parser(parser71);
        org.jsoup.parser.ParseErrorList parseErrorList73 = parser71.getErrors();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "#doctype" + "'", str69, "#doctype");
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(parseErrorList73);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Method method2 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean3 = method2.hasBody();
        org.jsoup.Connection.Response response4 = response1.method(method2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response1.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method2.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.listIterator();
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList1.replaceAll(parseErrorUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor3);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection.Request request10 = httpConnection5.request();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request12 = httpConnection11.request();
        org.jsoup.Connection.Request request15 = request12.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = request15.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = request15.cookies();
        org.jsoup.Connection connection18 = httpConnection5.headers(strMap17);
        java.io.InputStream inputStream21 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream24 = new org.jsoup.internal.ConstrainableInputStream(inputStream21, 1, (int) (byte) 0);
        org.jsoup.Connection connection25 = httpConnection5.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream24);
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal3.inputStream((java.io.InputStream) constrainableInputStream24);
        boolean boolean27 = keyVal26.hasInputStream();
        org.jsoup.Connection.KeyVal keyVal29 = keyVal26.value("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>");
        org.jsoup.Connection.KeyVal keyVal31 = keyVal29.contentType("                                                                                                    ");
        org.jsoup.Connection.KeyVal keyVal33 = keyVal29.contentType("org.jsoup.HttpStatusException: Content-Encoding=\"#root\". Status=1, URL=:nth-last-of-type(100n-1)");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(keyVal29);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNotNull(keyVal33);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        java.lang.String str2 = elements1.text();
        int int3 = elements1.size();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.className();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.id();
        java.lang.String str15 = document13.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean18 = document13.is((org.jsoup.select.Evaluator) indexLessThan17);
        boolean boolean19 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document13);
        org.jsoup.select.Elements elements21 = document13.getElementsMatchingOwnText("#document");
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator22 = elements21.spliterator();
        org.jsoup.select.Elements elements23 = elements21.prevAll();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementSpliterator22);
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request8 = httpConnection7.request();
        org.jsoup.Connection.Request request11 = request8.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = request11.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = request11.cookies();
        org.jsoup.Connection connection14 = httpConnection0.headers(strMap13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request18 = httpConnection17.request();
        org.jsoup.Connection.Request request21 = request18.addHeader("multipart/form-data", "hi!");
        boolean boolean23 = request21.hasHeader("multipart/form-data");
        boolean boolean25 = request21.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method26 = request21.method();
        org.jsoup.Connection connection27 = httpConnection0.method(method26);
        org.jsoup.Connection connection30 = httpConnection0.data("#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", "[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection32 = httpConnection0.postDataCharset("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!<html>? <head></head>? <body>?  hi!? </body>?</html>hi!<html>? <head></head>? <body>?  hi!? </body>?</html><html>? <head></head>? <body>?  hi!? </body>?</html>multipart/form-data<html>? <head></head>? <body>?  hi!? </body>?</html>hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + method26 + "' != '" + org.jsoup.Connection.Method.GET + "'", method26.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        java.lang.String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str15 = document14.id();
        org.jsoup.select.Elements elements16 = document14.previousElementSiblings();
        org.jsoup.select.Elements elements18 = elements16.prev("#text");
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.noTracking();
        int int23 = parseErrorList20.indexOf((java.lang.Object) parseErrorList22);
        boolean boolean24 = elements18.equals((java.lang.Object) parseErrorList22);
        org.jsoup.nodes.Element element26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList28 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = org.jsoup.parser.Parser.parseFragment("", element26, "", parseErrorList28);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor30 = parseErrorList28.listIterator();
        boolean boolean31 = parseErrorList22.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList28);
        org.jsoup.parser.ParseError[] parseErrorArray32 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList33 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33, parseErrorArray32);
        org.jsoup.parser.ParseErrorList parseErrorList35 = org.jsoup.parser.ParseErrorList.noTracking();
        int int36 = parseErrorList33.indexOf((java.lang.Object) parseErrorList35);
        boolean boolean37 = parseErrorList22.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33);
        org.jsoup.parser.ParseError parseError38 = null;
        boolean boolean39 = parseErrorList22.add(parseError38);
        boolean boolean40 = attributes12.equals((java.lang.Object) parseErrorList22);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(parseErrorArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseErrorList28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(parseErrorItor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parseErrorArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parseErrorList35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingText("#text");
        org.jsoup.select.Elements elements10 = elements8.addClass("Content-Encoding");
        org.jsoup.select.Elements elements12 = elements10.before("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.select.Elements elements13 = elements12.nextAll();
        org.jsoup.select.Elements elements15 = elements13.addClass("#root=\"\"");
        org.jsoup.select.NodeFilter nodeFilter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements17 = elements15.filter(nodeFilter16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream7);
        java.io.InputStream inputStream9 = keyVal8.inputStream();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection10.sslSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        org.jsoup.Connection connection14 = httpConnection10.sslSocketFactory(sSLSocketFactory13);
        org.jsoup.Connection.Request request15 = httpConnection10.request();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request17 = httpConnection16.request();
        org.jsoup.Connection.Request request20 = request17.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = request20.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = request20.cookies();
        org.jsoup.Connection connection23 = httpConnection10.headers(strMap22);
        java.io.InputStream inputStream26 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream29 = new org.jsoup.internal.ConstrainableInputStream(inputStream26, 1, (int) (byte) 0);
        org.jsoup.Connection connection30 = httpConnection10.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream29);
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = keyVal8.inputStream((java.io.InputStream) constrainableInputStream29);
        constrainableInputStream29.skipNBytes(0L);
        org.jsoup.helper.HttpConnection.KeyVal keyVal34 = keyVal3.inputStream((java.io.InputStream) constrainableInputStream29);
        byte[] byteArray36 = new byte[] { (byte) 100 };
        int int39 = constrainableInputStream29.read(byteArray36, 1, (int) (byte) 0);
        java.io.InputStream inputStream42 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal43 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream42);
        java.io.InputStream inputStream44 = keyVal43.inputStream();
        java.io.InputStream inputStream47 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal48 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream47);
        java.io.InputStream inputStream49 = keyVal48.inputStream();
        org.jsoup.helper.HttpConnection httpConnection50 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory51 = null;
        org.jsoup.Connection connection52 = httpConnection50.sslSocketFactory(sSLSocketFactory51);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory53 = null;
        org.jsoup.Connection connection54 = httpConnection50.sslSocketFactory(sSLSocketFactory53);
        org.jsoup.Connection.Request request55 = httpConnection50.request();
        org.jsoup.helper.HttpConnection httpConnection56 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request57 = httpConnection56.request();
        org.jsoup.Connection.Request request60 = request57.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = request60.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap62 = request60.cookies();
        org.jsoup.Connection connection63 = httpConnection50.headers(strMap62);
        java.io.InputStream inputStream66 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream69 = new org.jsoup.internal.ConstrainableInputStream(inputStream66, 1, (int) (byte) 0);
        org.jsoup.Connection connection70 = httpConnection50.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream69);
        org.jsoup.helper.HttpConnection.KeyVal keyVal71 = keyVal48.inputStream((java.io.InputStream) constrainableInputStream69);
        constrainableInputStream69.skipNBytes(0L);
        org.jsoup.helper.HttpConnection.KeyVal keyVal74 = keyVal43.inputStream((java.io.InputStream) constrainableInputStream69);
        byte[] byteArray76 = new byte[] { (byte) 100 };
        int int79 = constrainableInputStream69.read(byteArray76, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = constrainableInputStream29.read(byteArray76);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNotNull(keyVal34);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(keyVal43);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(keyVal48);
        org.junit.Assert.assertNull(inputStream49);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertNotNull(request57);
        org.junit.Assert.assertNotNull(request60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(keyVal71);
        org.junit.Assert.assertNotNull(keyVal74);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[100]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        boolean boolean4 = xmlDeclaration3.hasParent();
        java.lang.String str5 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.removeAttr(":matches(null)");
        java.lang.String str9 = xmlDeclaration3.baseUri();
        java.lang.String str10 = xmlDeclaration3.name();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        boolean boolean6 = tag1.isEmpty();
        java.lang.String str7 = tag1.normalName();
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType9 = new org.jsoup.select.Evaluator.IsFirstOfType();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        org.jsoup.nodes.Element element15 = element13.html("");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType18 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str21 = document20.wholeText();
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str24 = document23.className();
        boolean boolean25 = isNthLastOfType18.matches((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document23);
        org.jsoup.nodes.Document document26 = document20.clone();
        document26.setBaseUri("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan30 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType33 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str36 = document35.id();
        org.jsoup.select.Elements elements37 = document35.previousElementSiblings();
        org.jsoup.nodes.Element element38 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType33, (org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str41 = document40.className();
        java.lang.String str42 = document40.outerHtml();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str45 = document44.id();
        java.lang.String str46 = document44.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan48 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean49 = document44.is((org.jsoup.select.Evaluator) indexLessThan48);
        boolean boolean50 = isNthLastOfType33.matches((org.jsoup.nodes.Element) document40, (org.jsoup.nodes.Element) document44);
        java.lang.String str51 = document44.cssSelector();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str54 = document53.className();
        java.lang.String str55 = document53.outerHtml();
        boolean boolean57 = document53.hasSameValue((java.lang.Object) 1);
        boolean boolean58 = indexLessThan30.matches((org.jsoup.nodes.Element) document44, (org.jsoup.nodes.Element) document53);
        org.jsoup.nodes.Element element59 = document26.prependChild((org.jsoup.nodes.Node) document53);
        org.jsoup.nodes.Element element61 = element59.removeClass("#root");
        boolean boolean62 = isFirstOfType9.matches(element13, element59);
        org.jsoup.nodes.Attributes attributes63 = element59.attributes();
        org.jsoup.nodes.FormElement formElement64 = new org.jsoup.nodes.FormElement(tag1, "multipart", attributes63);
        java.util.List<org.jsoup.Connection.KeyVal> keyValList65 = formElement64.formData();
        java.util.List<org.jsoup.Connection.KeyVal> keyValList66 = formElement64.formData();
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot69 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document71 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str72 = document71.id();
        java.lang.String str73 = document71.baseUri();
        org.jsoup.nodes.Element element76 = document71.attr("", true);
        org.jsoup.nodes.Node node79 = document71.attr("#text", "");
        org.jsoup.nodes.Element element80 = document71.shallowClone();
        org.jsoup.nodes.Document document82 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str83 = document82.id();
        java.lang.String str84 = document82.baseUri();
        org.jsoup.nodes.Element element85 = document82.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap86 = document82.dataset();
        org.jsoup.nodes.Element element88 = document82.html("#root=\"\"");
        boolean boolean89 = attributeWithValueNot69.matches(element80, (org.jsoup.nodes.Element) document82);
        org.jsoup.nodes.FormElement formElement90 = formElement64.addElement(element80);
        java.lang.String str92 = formElement64.attr("org.jsoup.select.Selector$SelectorParseException: :lt(52)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str42, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#root" + "'", str51, "#root");
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str55, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(attributes63);
        org.junit.Assert.assertNotNull(keyValList65);
        org.junit.Assert.assertNotNull(keyValList66);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(document82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(element88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(formElement90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.select.Elements elements12 = document4.getElementsByIndexEquals((int) (short) 10);
        java.lang.String str13 = document4.data();
        org.jsoup.select.Elements elements14 = document4.siblingElements();
        org.jsoup.nodes.Attributes attributes15 = document4.attributes();
        org.jsoup.select.Elements elements18 = document4.getElementsByAttributeValueEnding("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]", ":first-child");
        java.lang.String str19 = document4.nodeName();
        org.jsoup.parser.Tag tag20 = document4.tag();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#document" + "'", str19, "#document");
        org.junit.Assert.assertNotNull(tag20);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean2 = outputSettings1.outline();
        int int3 = outputSettings1.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax4 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.syntax(syntax4);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        boolean boolean7 = outputSettings5.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.prettyPrint(true);
        java.lang.String str10 = org.jsoup.nodes.Entities.escape("[public=<!#root!>]", outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + syntax4 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax4.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[public=&lt;!#root!&gt;]" + "'", str10, "[public=&lt;!#root!&gt;]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("multipart");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = org.jsoup.parser.Parser.parseFragment("", element1, "", parseErrorList3);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        org.jsoup.parser.ParseError[] parseErrorArray6 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList7 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7, parseErrorArray6);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList7.listIterator();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method15 = request11.method();
        int int16 = parseErrorList7.indexOf((java.lang.Object) request11);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList7.stream();
        boolean boolean18 = parseErrorList3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor22 = parseErrorList20.listIterator();
        java.lang.String str23 = parseErrorList20.toString();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str26 = document25.id();
        org.jsoup.select.Elements elements27 = document25.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor28 = elements27.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements27.listIterator();
        org.jsoup.select.Elements elements31 = elements27.next("#text");
        org.jsoup.nodes.Element element33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = org.jsoup.parser.Parser.parseFragment("", element33, "", parseErrorList35);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor37 = parseErrorList35.iterator();
        boolean boolean38 = elements27.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList35);
        int int39 = parseErrorList20.lastIndexOf((java.lang.Object) elements27);
        boolean boolean40 = parseErrorList3.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20);
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList3.replaceAll(parseErrorUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseErrorItor9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertTrue("'" + method15 + "' != '" + org.jsoup.Connection.Method.GET + "'", method15.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(parseErrorStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(parseErrorArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseErrorItor22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elementItor28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(parseErrorList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseErrorItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = request9.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = request9.headers();
        java.net.Proxy proxy12 = request9.proxy();
        org.jsoup.Connection connection13 = httpConnection0.request(request9);
        org.jsoup.Connection connection16 = connection13.data(":only-child", "[:eq(-1)!=#doctype]");
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request20 = httpConnection19.request();
        org.jsoup.Connection connection22 = httpConnection19.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection23.sslSocketFactory(sSLSocketFactory24);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = null;
        org.jsoup.Connection connection27 = httpConnection23.sslSocketFactory(sSLSocketFactory26);
        org.jsoup.Connection.Request request28 = httpConnection23.request();
        org.jsoup.helper.HttpConnection httpConnection29 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request30 = httpConnection29.request();
        org.jsoup.Connection.Request request33 = request30.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = request33.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = request33.cookies();
        org.jsoup.Connection connection36 = httpConnection23.headers(strMap35);
        org.jsoup.Connection connection37 = httpConnection19.data(strMap35);
        java.io.InputStream inputStream42 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal43 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream42);
        java.io.InputStream inputStream44 = keyVal43.inputStream();
        org.jsoup.helper.HttpConnection httpConnection45 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory46 = null;
        org.jsoup.Connection connection47 = httpConnection45.sslSocketFactory(sSLSocketFactory46);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory48 = null;
        org.jsoup.Connection connection49 = httpConnection45.sslSocketFactory(sSLSocketFactory48);
        org.jsoup.Connection.Request request50 = httpConnection45.request();
        org.jsoup.helper.HttpConnection httpConnection51 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request52 = httpConnection51.request();
        org.jsoup.Connection.Request request55 = request52.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = request55.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = request55.cookies();
        org.jsoup.Connection connection58 = httpConnection45.headers(strMap57);
        java.io.InputStream inputStream61 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream64 = new org.jsoup.internal.ConstrainableInputStream(inputStream61, 1, (int) (byte) 0);
        org.jsoup.Connection connection65 = httpConnection45.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream64);
        org.jsoup.helper.HttpConnection.KeyVal keyVal66 = keyVal43.inputStream((java.io.InputStream) constrainableInputStream64);
        constrainableInputStream64.skipNBytes(0L);
        org.jsoup.Connection connection69 = httpConnection19.data("[:eq(-1)!=#doctype]", ":contains(content-encoding)", (java.io.InputStream) constrainableInputStream64);
        constrainableInputStream64.mark((int) '\uffff');
        org.jsoup.Connection connection72 = connection16.data("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", "application/x-www-form-urlencoded", (java.io.InputStream) constrainableInputStream64);
        constrainableInputStream64.reset();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(keyVal43);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(keyVal66);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection72);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute(":first-child", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Attribute attribute3 = attribute2.clone();
        org.junit.Assert.assertNotNull(attribute3);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        java.lang.String str6 = tag1.normalName();
        boolean boolean7 = tag1.isBlock();
        boolean boolean8 = tag1.formatAsBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements6 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList9 = elements6.subList(0, 82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 82");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode7 = document4.quirksMode();
        boolean boolean9 = document4.hasClass("multipart/form-data");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType12 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str15 = document14.wholeText();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.className();
        boolean boolean19 = isNthLastOfType12.matches((org.jsoup.nodes.Element) document14, (org.jsoup.nodes.Element) document17);
        boolean boolean20 = attributeWithValueNot2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document14);
        // The following exception was thrown during execution in test generation
        try {
            document14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + quirksMode7 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode7.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart" + "'", str2, "multipart");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request4.headers();
        java.net.Proxy proxy7 = request4.proxy();
        org.jsoup.Connection.Request request9 = request4.removeHeader("#doctype");
        java.net.Proxy proxy10 = request9.proxy();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Request request14 = request9.data((org.jsoup.Connection.KeyVal) keyVal13);
        org.jsoup.Connection.Request request16 = request14.removeCookie("<html>\n <head></head>\n <body>\n  Content-Encoding=\"#root\"\n </body>\n</html>");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(request16);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = request10.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        org.jsoup.Connection.Request request14 = httpConnection0.request();
        org.jsoup.Connection.Request request17 = request14.header("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", ":contains(content-encoding)");
        org.jsoup.Connection.Request request19 = request14.removeHeader("[=:first-child]");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request19);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.simpleText();
        java.lang.String str2 = org.jsoup.Jsoup.clean("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist1);
        org.jsoup.safety.Cleaner cleaner3 = new org.jsoup.safety.Cleaner(whitelist1);
        boolean boolean5 = cleaner3.isValidBodyHtml(":eq(-1)");
        boolean boolean7 = cleaner3.isValidBodyHtml("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!multipart/form-data");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType10 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str13 = document12.className();
        java.lang.String str14 = document12.outerHtml();
        boolean boolean16 = document12.hasSameValue((java.lang.Object) 1);
        java.lang.String str17 = document12.tagName();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element21 = document19.val("hi!");
        boolean boolean22 = isNthLastOfType10.matches((org.jsoup.nodes.Element) document12, element21);
        java.lang.String str23 = document12.location();
        org.jsoup.nodes.Document document24 = cleaner3.clean(document12);
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str2, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#root" + "'", str17, "#root");
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(document24);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) '/');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        java.lang.String str7 = document1.title();
        org.jsoup.nodes.Element element9 = document1.val("Content-Encoding");
        element9.setBaseUri("hi!hi!");
        java.lang.String str12 = element9.html();
        java.lang.String str13 = element9.wholeText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.root();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (short) 0);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection.Request request8 = request5.header("hi", "[]");
        org.jsoup.Connection.Request request10 = request5.removeHeader("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request10);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean2 = org.jsoup.Jsoup.isValid("hi!", whitelist1);
        org.jsoup.safety.Whitelist whitelist5 = whitelist1.removeEnforcedAttribute("Content-Encoding", "#root");
        org.jsoup.safety.Whitelist whitelist8 = whitelist1.removeEnforcedAttribute("Content-Encoding", "multipart/form-data");
        org.jsoup.safety.Whitelist whitelist11 = whitelist8.removeEnforcedAttribute("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", "#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        org.jsoup.safety.Whitelist whitelist13 = whitelist8.preserveRelativeLinks(true);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean25 = org.jsoup.internal.StringUtil.in("", strArray24);
        boolean boolean26 = org.jsoup.internal.StringUtil.in("", strArray24);
        java.lang.String str28 = org.jsoup.internal.StringUtil.join(strArray24, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean29 = org.jsoup.internal.StringUtil.in("#root", strArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist30 = whitelist8.removeProtocols("content-encoding=\"#root\"", "#data", strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot remove a protocol that is not set.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(whitelist5);
        org.junit.Assert.assertNotNull(whitelist8);
        org.junit.Assert.assertNotNull(whitelist11);
        org.junit.Assert.assertNotNull(whitelist13);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!" + "'", str28, "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.internal.StringUtil.borrowBuilder();
        java.lang.String str1 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder0);
        java.lang.String str2 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder0);
        java.lang.String str3 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder0);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection7 = httpConnection0.cookie("multipart", "#doctype");
        org.jsoup.Connection connection9 = httpConnection0.timeout(2);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse(":matchesOwn(null)");
        document1.updateMetaCharsetElement(false);
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str11 = document10.className();
        java.lang.String str12 = document10.outerHtml();
        boolean boolean14 = document10.hasSameValue((java.lang.Object) 1);
        java.lang.String str15 = document10.tagName();
        org.jsoup.nodes.Element element16 = document10.head();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.nodes.Element element20 = document10.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = tag1.equals((java.lang.Object) document19);
        org.jsoup.nodes.Element element23 = document19.removeAttr("multipart");
        java.lang.String str24 = element23.baseUri();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "multipart/form-data" + "'", str24, "multipart/form-data");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        org.jsoup.select.Elements elements4 = elements1.attr(":eq(-1)", "[]");
        org.jsoup.select.Elements elements6 = elements1.tagName("Content-Encoding=\"#root\"");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements1.replaceAll(elementUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        java.lang.String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes16 = attributes0.put("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", " ");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor17 = attributes0.iterator();
        java.util.List<org.jsoup.nodes.Attribute> attributeList18 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(attributeItor17);
        org.junit.Assert.assertNotNull(attributeList18);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.lang.Object obj2 = parseErrorList0.clone();
        parseErrorList0.ensureCapacity((int) '[');
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection9 = httpConnection0.data("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "Content-Encoding", inputStream7, "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection10.sslSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        org.jsoup.Connection connection14 = httpConnection10.sslSocketFactory(sSLSocketFactory13);
        org.jsoup.Connection.Request request15 = httpConnection10.request();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request17 = httpConnection16.request();
        org.jsoup.Connection.Request request20 = request17.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method21 = request17.method();
        org.jsoup.Connection connection22 = httpConnection10.method(method21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request24 = httpConnection23.request();
        org.jsoup.Connection.Request request27 = request24.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = request27.multiHeaders();
        org.jsoup.Connection.Request request30 = request27.ignoreHttpErrors(true);
        org.jsoup.Connection connection31 = httpConnection10.request(request30);
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request33 = httpConnection32.request();
        org.jsoup.Connection connection35 = httpConnection32.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory37 = null;
        org.jsoup.Connection connection38 = httpConnection36.sslSocketFactory(sSLSocketFactory37);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory39 = null;
        org.jsoup.Connection connection40 = httpConnection36.sslSocketFactory(sSLSocketFactory39);
        org.jsoup.Connection.Request request41 = httpConnection36.request();
        org.jsoup.helper.HttpConnection httpConnection42 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request43 = httpConnection42.request();
        org.jsoup.Connection.Request request46 = request43.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = request46.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = request46.cookies();
        org.jsoup.Connection connection49 = httpConnection36.headers(strMap48);
        org.jsoup.Connection connection50 = httpConnection32.data(strMap48);
        org.jsoup.Connection connection52 = httpConnection32.referrer("#document");
        org.jsoup.helper.HttpConnection httpConnection53 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request54 = httpConnection53.request();
        org.jsoup.Connection.Request request57 = request54.addHeader("multipart/form-data", "hi!");
        boolean boolean59 = request57.hasHeader("multipart/form-data");
        boolean boolean61 = request57.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method62 = request57.method();
        org.jsoup.Connection.Method method63 = request57.method();
        org.jsoup.Connection.Request request66 = request57.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection connection67 = httpConnection32.request(request57);
        org.jsoup.Connection.Method method68 = org.jsoup.Connection.Method.PATCH;
        org.jsoup.Connection.Request request69 = request57.method(method68);
        org.jsoup.Connection.Request request70 = request30.method(method68);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = request70.cookies();
        org.jsoup.Connection connection72 = connection9.data(strMap71);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertTrue("'" + method21 + "' != '" + org.jsoup.Connection.Method.GET + "'", method21.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(request43);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertNotNull(request57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + method62 + "' != '" + org.jsoup.Connection.Method.GET + "'", method62.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method63 + "' != '" + org.jsoup.Connection.Method.GET + "'", method63.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request66);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertTrue("'" + method68 + "' != '" + org.jsoup.Connection.Method.PATCH + "'", method68.equals(org.jsoup.Connection.Method.PATCH));
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertNotNull(request70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(connection72);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element5 = document1.toggleClass("multipart");
        org.jsoup.nodes.Element element6 = document1.root();
        org.jsoup.nodes.Element element8 = document1.text(":gt(35)");
        org.jsoup.select.NodeFilter nodeFilter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = element8.filter(nodeFilter9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = connection8.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.parser.ParseError[] parseErrorArray8 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList9 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9, parseErrorArray8);
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        int int12 = parseErrorList9.indexOf((java.lang.Object) parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList9.iterator();
        boolean boolean14 = elements5.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9);
        org.jsoup.parser.ParseError parseError15 = null;
        boolean boolean16 = parseErrorList9.add(parseError15);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator17 = parseErrorList9.spliterator();
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList9.replaceAll(parseErrorUnaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(parseErrorSpliterator17);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        document2.updateMetaCharsetElement(true);
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection8 = httpConnection0.timeout(30000);
        java.io.InputStream inputStream11 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream14 = new org.jsoup.internal.ConstrainableInputStream(inputStream11, 1, (int) (byte) 0);
        boolean boolean15 = constrainableInputStream14.markSupported();
        org.jsoup.Connection connection17 = httpConnection0.data("                                                                                                    ", ":only-child", (java.io.InputStream) constrainableInputStream14, "#data");
        org.jsoup.Connection connection19 = httpConnection0.requestBody("UTF-8");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax3 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.syntax(syntax3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings4);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = org.jsoup.parser.ParseSettings.preserveCase;
        org.jsoup.parser.Parser parser10 = parser5.settings(parseSettings9);
        org.jsoup.parser.Parser parser12 = parser5.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.Parser parser14 = parser5.setTrackErrors((int) '#');
        org.jsoup.parser.TreeBuilder treeBuilder15 = parser5.getTreeBuilder();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(treeBuilder15);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        java.lang.Object obj5 = null;
        boolean boolean6 = document1.hasSameValue(obj5);
        org.jsoup.nodes.Element element8 = document1.appendText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Element element9 = document1.root();
        java.lang.String str10 = element9.nodeName();
        org.jsoup.nodes.Element element11 = element9.root();
        int int12 = element11.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#document" + "'", str10, "#document");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.parser.ParseError[] parseErrorArray8 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList9 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9, parseErrorArray8);
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        int int12 = parseErrorList9.indexOf((java.lang.Object) parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList9.iterator();
        boolean boolean14 = elements5.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9);
        org.jsoup.parser.ParseError parseError15 = null;
        boolean boolean16 = parseErrorList9.add(parseError15);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request18 = httpConnection17.request();
        org.jsoup.Connection.Request request21 = request18.addHeader("multipart/form-data", "hi!");
        boolean boolean23 = request21.hasHeader("multipart/form-data");
        boolean boolean25 = request21.hasCookie("#text");
        org.jsoup.parser.Parser parser26 = request21.parser();
        org.jsoup.Connection.Request request29 = request21.header("#text", "multipart/form-data");
        boolean boolean30 = parseErrorList9.remove((java.lang.Object) request29);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str33 = document32.id();
        java.lang.String str34 = document32.baseUri();
        org.jsoup.nodes.Element element35 = document32.body();
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request37 = httpConnection36.request();
        org.jsoup.Connection.Request request40 = request37.addHeader("multipart/form-data", "hi!");
        boolean boolean42 = request40.hasHeader("multipart/form-data");
        boolean boolean44 = request40.hasCookie("#text");
        org.jsoup.parser.Parser parser45 = request40.parser();
        org.jsoup.nodes.Document document46 = document32.parser(parser45);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = document46.siblingNodes();
        boolean boolean48 = parseErrorList9.equals((java.lang.Object) document46);
        org.jsoup.parser.ParseError parseError50 = parseErrorList9.get(0);
        org.jsoup.parser.ParseError[] parseErrorArray52 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList53 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList53, parseErrorArray52);
        int int55 = parseErrorList53.size();
        boolean boolean56 = parseErrorList9.addAll(0, (java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList53);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(parseError50);
        org.junit.Assert.assertNotNull(parseErrorArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char4 = tokenQueue1.consume();
        org.jsoup.parser.TokenQueue tokenQueue6 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str7 = tokenQueue6.toString();
        boolean boolean8 = tokenQueue6.consumeWhitespace();
        java.lang.String str10 = tokenQueue6.consumeTo("multipart");
        tokenQueue6.addFirst("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean21 = org.jsoup.internal.StringUtil.in("", strArray20);
        boolean boolean22 = org.jsoup.internal.StringUtil.in("", strArray20);
        java.lang.String str24 = org.jsoup.internal.StringUtil.join(strArray20, " hi!=\"multipart/form-data\"");
        java.lang.String str25 = tokenQueue6.consumeToAny(strArray20);
        boolean boolean26 = tokenQueue1.matchesAny(strArray20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'm' + "'", char4 == 'm');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data" + "'", str7, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str24, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((java.lang.Object) parseErrorList3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        boolean boolean12 = parseErrorList1.equals((java.lang.Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        parseErrorList14.ensureCapacity(10);
        boolean boolean18 = parseErrorList1.remove((java.lang.Object) parseErrorList14);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request20 = httpConnection19.request();
        org.jsoup.Connection.Request request23 = request20.addHeader("multipart/form-data", "hi!");
        boolean boolean25 = request23.hasHeader("multipart/form-data");
        int int26 = parseErrorList14.indexOf((java.lang.Object) request23);
        org.jsoup.Connection.Method method27 = org.jsoup.Connection.Method.HEAD;
        org.jsoup.Connection.Request request28 = request23.method(method27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = request23.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = request23.cookies();
        org.jsoup.Connection.Request request33 = request23.header("hi", "/form-data");
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + method27 + "' != '" + org.jsoup.Connection.Method.HEAD + "'", method27.equals(org.jsoup.Connection.Method.HEAD));
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(request33);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        java.lang.String str3 = dataNode2.getWholeData();
        org.jsoup.nodes.DataNode dataNode5 = dataNode2.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.DataNode dataNode7 = dataNode5.setWholeData("<!#root!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = dataNode5.childNodes();
        java.lang.String str9 = dataNode5.toString();
        java.lang.String str10 = dataNode5.nodeName();
        java.lang.String str11 = dataNode5.baseUri();
        java.lang.String str12 = dataNode5.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(dataNode5);
        org.junit.Assert.assertNotNull(dataNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!#root!>" + "'", str9, "<!#root!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#data" + "'", str10, "#data");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!#root!>" + "'", str12, "<!#root!>");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str5 = tokenQueue1.consumeTo("multipart");
        tokenQueue1.addFirst("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#text", "#text");
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "#doctype");
        org.jsoup.nodes.Document document8 = org.jsoup.parser.Parser.parse(" hi!=\"multipart/form-data\"", "Content-Encoding");
        boolean boolean9 = attributeWithValueNot2.matches((org.jsoup.nodes.Element) document5, (org.jsoup.nodes.Element) document8);
        java.lang.String str10 = attributeWithValueNot2.toString();
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[#text!=#text]" + "'", str10, "[#text!=#text]");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String str1 = org.jsoup.nodes.Entities.escape("<html>\n <head></head>\n <body>\n  Content-Encoding=\"#root\"\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n  Content-Encoding=\"#root\"\n &lt;/body&gt;\n&lt;/html&gt;" + "'", str1, "&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n  Content-Encoding=\"#root\"\n &lt;/body&gt;\n&lt;/html&gt;");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.className();
        java.lang.String str4 = document2.outerHtml();
        org.jsoup.nodes.Element element6 = document2.createElement("#root");
        org.jsoup.nodes.Element element7 = org.jsoup.select.Selector.selectFirst(":matches(null)", (org.jsoup.nodes.Element) document2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = element7.cssSelector();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.postDataCharset("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>#text");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <html>? <head></head>? <body>?  hi!? </body>?</html>#text");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node5 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.select.Evaluator.MatchText matchText0 = new org.jsoup.select.Evaluator.MatchText();
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.nodes.Document document3 = new org.jsoup.nodes.Document("");
        java.lang.String str4 = document3.nodeName();
        boolean boolean5 = matchText0.matches(element1, (org.jsoup.nodes.Element) document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) (short) 10, (int) 'm');
        java.lang.Object obj3 = parseErrorList2.clone();
        parseErrorList2.trimToSize();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str5 = document1.normalName();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element8 = document1.addClass("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        org.jsoup.nodes.Document document9 = document1.normalise();
        org.jsoup.nodes.Element element11 = document1.append("ultipart/form-data");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(element11);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes2);
        java.lang.String str4 = attribute3.getValue();
        java.lang.String str6 = attribute3.setValue("#root");
        java.lang.String str7 = attribute3.toString();
        java.lang.String str8 = attribute3.toString();
        java.lang.String str9 = attribute3.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=\"#root\"" + "'", str7, "Content-Encoding=\"#root\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=\"#root\"" + "'", str8, "Content-Encoding=\"#root\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Encoding" + "'", str9, "Content-Encoding");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        boolean boolean3 = tokenQueue1.matches("UTF-8");
        boolean boolean5 = tokenQueue1.matchesCS(":containsOwn(system)");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        java.lang.String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        org.jsoup.nodes.Attributes attributes15 = attributes0.put("Content-Encoding=\"#root\"", "SYSTEM");
        java.util.List<org.jsoup.nodes.Attribute> attributeList16 = attributes0.asList();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributeList16);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("[]", "#text");
        org.jsoup.nodes.Document document3 = document2.ownerDocument();
        org.jsoup.select.Elements elements5 = document2.getElementsByIndexGreaterThan(1048576);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        boolean boolean5 = tokenQueue1.matches("");
        char[] charArray10 = new char[] { ':', '/', '\000', 'u' };
        boolean boolean11 = tokenQueue1.matchesAny(charArray10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), ":/\000u");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), ":/\000u");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[:, /, \000, u]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        document10.setBaseUri("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType17 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.nodes.Element element22 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType17, (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.className();
        java.lang.String str26 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str29 = document28.id();
        java.lang.String str30 = document28.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan32 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean33 = document28.is((org.jsoup.select.Evaluator) indexLessThan32);
        boolean boolean34 = isNthLastOfType17.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document28);
        java.lang.String str35 = document28.cssSelector();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str38 = document37.className();
        java.lang.String str39 = document37.outerHtml();
        boolean boolean41 = document37.hasSameValue((java.lang.Object) 1);
        boolean boolean42 = indexLessThan14.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document37);
        org.jsoup.nodes.Element element43 = document10.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Document document44 = element43.ownerDocument();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList45 = element43.textNodes();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str39, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(textNodeList45);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements6 = elements5.prev();
        org.jsoup.select.Elements elements8 = elements5.after(".Content-Encoding");
        org.jsoup.select.Elements elements10 = elements8.nextAll("#comment");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (int) '\uffff');
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element6 = document4.html("Content-Encoding");
        java.io.InputStream inputStream9 = null;
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream9, "", "#root", parser12);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser12);
        org.jsoup.nodes.Document document15 = document14.normalise();
        org.jsoup.nodes.Element element16 = document4.appendTo((org.jsoup.nodes.Element) document15);
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str19 = document18.id();
        java.lang.String str20 = document18.baseUri();
        org.jsoup.nodes.Element element22 = document18.toggleClass("multipart");
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request24 = httpConnection23.request();
        org.jsoup.Connection.Request request27 = request24.addHeader("multipart/form-data", "hi!");
        boolean boolean29 = request27.hasHeader("multipart/form-data");
        boolean boolean31 = request27.hasHeader("multipart/form-data");
        java.lang.String str32 = request27.requestBody();
        org.jsoup.parser.Parser parser33 = request27.parser();
        org.jsoup.nodes.Document document34 = document18.parser(parser33);
        boolean boolean35 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Element element37 = document4.append("hi");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.outerHtml();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = org.jsoup.helper.HttpConnection.KeyVal.create("SYSTEM", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str9 = keyVal8.value();
        java.lang.String str10 = keyVal8.toString();
        boolean boolean11 = document1.hasSameValue((java.lang.Object) keyVal8);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM=<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str10, "SYSTEM=<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("#root");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(#root)" + "'", str2, ":containsOwn(#root)");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.clearAttributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValue("[public=<!#root!>]", ":matches(null)");
        org.jsoup.nodes.Element element9 = document1.prependText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.simpleText();
        java.lang.String str2 = org.jsoup.Jsoup.clean("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist1);
        org.jsoup.safety.Cleaner cleaner3 = new org.jsoup.safety.Cleaner(whitelist1);
        boolean boolean5 = cleaner3.isValidBodyHtml("Content-Type");
        org.jsoup.select.Evaluator.AllElements allElements6 = new org.jsoup.select.Evaluator.AllElements();
        java.lang.String str7 = allElements6.toString();
        java.lang.String str8 = allElements6.toString();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.select.Evaluator.AllElements allElements10 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType13 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.className();
        java.lang.String str17 = document15.outerHtml();
        boolean boolean19 = document15.hasSameValue((java.lang.Object) 1);
        java.lang.String str20 = document15.tagName();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element24 = document22.val("hi!");
        boolean boolean25 = isNthLastOfType13.matches((org.jsoup.nodes.Element) document15, element24);
        org.jsoup.select.Elements elements26 = element24.nextElementSiblings();
        org.jsoup.nodes.Element element27 = null;
        boolean boolean28 = allElements10.matches(element24, element27);
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element32 = document30.val("hi!");
        org.jsoup.nodes.Element element33 = document30.clone();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan35 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) '#');
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType40 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str43 = document42.className();
        java.lang.String str44 = document42.outerHtml();
        boolean boolean46 = document42.hasSameValue((java.lang.Object) 1);
        java.lang.String str47 = document42.tagName();
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element51 = document49.val("hi!");
        boolean boolean52 = isNthLastOfType40.matches((org.jsoup.nodes.Element) document42, element51);
        java.lang.String str53 = document42.title();
        org.jsoup.select.Elements elements55 = document42.getElementsMatchingText("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean56 = indexGreaterThan35.matches((org.jsoup.nodes.Element) document37, (org.jsoup.nodes.Element) document42);
        boolean boolean57 = allElements10.matches((org.jsoup.nodes.Element) document30, (org.jsoup.nodes.Element) document42);
        org.jsoup.select.Elements elements58 = document42.nextElementSiblings();
        boolean boolean59 = allElements6.matches(element9, (org.jsoup.nodes.Element) document42);
        org.jsoup.nodes.Document document60 = cleaner3.clean(document42);
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str2, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*" + "'", str7, "*");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "*" + "'", str8, "*");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str17, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str44, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#root" + "'", str47, "#root");
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(elements55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(elements58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(document60);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("PUBLIC", "<!#root!>");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType5 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.id();
        org.jsoup.select.Elements elements9 = document7.previousElementSiblings();
        org.jsoup.nodes.Element element10 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType5, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str13 = document12.className();
        java.lang.String str14 = document12.outerHtml();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str17 = document16.id();
        java.lang.String str18 = document16.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan20 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean21 = document16.is((org.jsoup.select.Evaluator) indexLessThan20);
        boolean boolean22 = isNthLastOfType5.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document16);
        org.jsoup.select.Elements elements24 = document16.getElementsMatchingOwnText("#document");
        org.jsoup.select.Elements elements26 = document16.select("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild27 = new org.jsoup.select.Evaluator.IsOnlyChild();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType30 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str33 = document32.wholeText();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str36 = document35.className();
        boolean boolean37 = isNthLastOfType30.matches((org.jsoup.nodes.Element) document32, (org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Document document38 = document32.clone();
        document38.setBaseUri("#root");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType43 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str46 = document45.className();
        java.lang.String str47 = document45.outerHtml();
        boolean boolean49 = document45.hasSameValue((java.lang.Object) 1);
        java.lang.String str50 = document45.tagName();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element54 = document52.val("hi!");
        boolean boolean55 = isNthLastOfType43.matches((org.jsoup.nodes.Element) document45, element54);
        boolean boolean56 = isOnlyChild27.matches((org.jsoup.nodes.Element) document38, (org.jsoup.nodes.Element) document45);
        boolean boolean57 = attributeWithValue2.matches((org.jsoup.nodes.Element) document16, (org.jsoup.nodes.Element) document45);
        org.jsoup.nodes.Document document60 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str61 = document60.id();
        java.lang.String str62 = document60.baseUri();
        org.jsoup.nodes.Element element65 = document60.attr("", true);
        org.jsoup.select.Elements elements66 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document60);
        org.jsoup.nodes.Document.QuirksMode quirksMode67 = document60.quirksMode();
        org.jsoup.nodes.Document document68 = document45.quirksMode(quirksMode67);
        java.lang.String str69 = document45.baseUri();
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str14, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str47, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#root" + "'", str50, "#root");
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertTrue("'" + quirksMode67 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode67.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingText("#text");
        org.jsoup.select.Elements elements10 = elements8.addClass("Content-Encoding");
        org.jsoup.select.Elements elements12 = elements10.before("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.select.Elements elements13 = elements12.nextAll();
        org.jsoup.select.Elements elements15 = elements12.before("                                   ");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi");
        org.jsoup.nodes.Element element3 = element1.appendElement("#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(element3);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        int int3 = document2.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements9 = elements8.remove();
        org.jsoup.select.Elements elements10 = elements8.nextAll();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.canContainBlock();
        java.lang.String str4 = tag1.normalName();
        org.jsoup.nodes.Attributes attributes6 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute9 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes10 = attributes6.put(attribute9);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements14.listIterator();
        org.jsoup.select.Elements elements17 = elements14.empty();
        boolean boolean18 = attributes10.equals((java.lang.Object) elements14);
        org.jsoup.nodes.Attributes attributes21 = attributes10.add("#root=\"\"", " hi!=\"multipart/form-data\"");
        boolean boolean22 = attributes21.isEmpty();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator23 = attributes21.spliterator();
        org.jsoup.parser.ParseSettings parseSettings24 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str26 = parseSettings24.normalizeAttribute("#root");
        int int27 = attributes21.deduplicate(parseSettings24);
        org.jsoup.nodes.FormElement formElement28 = new org.jsoup.nodes.FormElement(tag1, "ltipart/form-data", attributes21);
        org.jsoup.nodes.Node node29 = formElement28.clearAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertNotNull(attribute9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertNotNull(elementItor16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributeSpliterator23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#root" + "'", str26, "#root");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"");
        java.lang.String str2 = textNode1.toString();
        java.lang.String str3 = textNode1.nodeName();
        int int4 = textNode1.childNodeSize();
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n  hi!\n &lt;/body&gt;\n&lt;/html&gt;=\"#root\"" + "'", str2, "&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n  hi!\n &lt;/body&gt;\n&lt;/html&gt;=\"#root\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((java.lang.Object) parseErrorList3);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList1.iterator();
        org.jsoup.parser.ParseError parseError7 = null;
        parseErrorList1.add(0, parseError7);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList1.listIterator();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorItor9);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = request4.headers();
        java.lang.String str13 = request4.header("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.jsoup.Connection.Request request15 = request4.followRedirects(false);
        int int16 = request15.timeout();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30000 + "'", int16 == 30000);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded(":matchesOwn(null)", "Content-Encoding=#declaration");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text(":gt(35)");
        org.jsoup.nodes.Node node5 = textNode4.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.nodes.DataNode dataNode1 = new org.jsoup.nodes.DataNode(":last-of-type");
        java.lang.String str2 = dataNode1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#data" + "'", str2, "#data");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection6 = httpConnection0.header("#data", ":only-child");
        org.jsoup.Connection connection8 = httpConnection0.userAgent("multipart/form-data");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor2 = elements1.listIterator();
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList3.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream5 = parseErrorList3.parallelStream();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.id();
        org.jsoup.select.Elements elements9 = document7.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements9.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements9.listIterator();
        org.jsoup.select.Elements elements12 = elements9.empty();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str15 = document14.id();
        org.jsoup.select.Elements elements16 = document14.previousElementSiblings();
        org.jsoup.select.Elements elements18 = elements16.prev("#text");
        boolean boolean19 = elements16.hasText();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str22 = document21.id();
        org.jsoup.select.Elements elements23 = document21.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor24 = elements23.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor25 = elements23.listIterator();
        org.jsoup.select.Elements elements26 = elements23.empty();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str29 = document28.id();
        org.jsoup.select.Elements elements30 = document28.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor31 = elements30.listIterator();
        boolean boolean33 = elements30.equals((java.lang.Object) 1.0d);
        java.lang.String str34 = elements30.text();
        org.jsoup.select.Elements elements36 = elements30.wrap("#root");
        org.jsoup.select.Elements[] elementsArray37 = new org.jsoup.select.Elements[] { elements9, elements16, elements23, elements36 };
        org.jsoup.select.Elements[] elementsArray38 = parseErrorList3.toArray(elementsArray37);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream39 = parseErrorList3.stream();
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request41 = httpConnection40.request();
        org.jsoup.Connection.KeyVal keyVal43 = httpConnection40.data("Content-Encoding");
        org.jsoup.Connection connection45 = httpConnection40.maxBodySize((int) (short) 100);
        org.jsoup.Connection connection47 = httpConnection40.timeout((int) '4');
        boolean boolean48 = parseErrorList3.equals((java.lang.Object) httpConnection40);
        boolean boolean49 = elements1.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList3);
        org.junit.Assert.assertNotNull(elementItor2);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorStream5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(elementItor24);
        org.junit.Assert.assertNotNull(elementItor25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elementItor31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(elementsArray37);
        org.junit.Assert.assertNotNull(elementsArray38);
        org.junit.Assert.assertNotNull(parseErrorStream39);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNull(keyVal43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream1 = parseErrorList0.stream();
        int int2 = parseErrorList0.size();
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.noTracking();
        int int7 = parseErrorList4.indexOf((java.lang.Object) parseErrorList6);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection8.sslSocketFactory(sSLSocketFactory9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection8.sslSocketFactory(sSLSocketFactory11);
        org.jsoup.Connection connection14 = httpConnection8.ignoreContentType(true);
        boolean boolean15 = parseErrorList4.equals((java.lang.Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray16 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList17 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList17, parseErrorArray16);
        parseErrorList17.ensureCapacity(10);
        boolean boolean21 = parseErrorList4.remove((java.lang.Object) parseErrorList17);
        parseErrorList17.ensureCapacity((int) (short) 100);
        boolean boolean24 = parseErrorList0.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList17);
        java.lang.Object[] objArray25 = parseErrorList17.toArray();
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorStream1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseErrorArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.String str1 = org.jsoup.nodes.Entities.getByName(":eq(-1)=mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.safety.Whitelist whitelist2 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean3 = org.jsoup.Jsoup.isValid("hi!", whitelist2);
        org.jsoup.safety.Whitelist whitelist6 = whitelist2.removeEnforcedAttribute("Content-Encoding", "#root");
        java.lang.String str7 = org.jsoup.Jsoup.clean("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", whitelist2);
        org.jsoup.safety.Cleaner cleaner8 = new org.jsoup.safety.Cleaner(whitelist2);
        org.junit.Assert.assertNotNull(whitelist2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(whitelist6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str7, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        java.lang.String str4 = attributes0.toString();
        java.lang.String str6 = attributes0.get("<html>\n <head></head>\n <body>\n  Content-Encoding=\"#root\"\n </body>\n</html>");
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = document1.before(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String[] strArray6 = new java.lang.String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        java.lang.String str7 = tokenQueue1.consumeToAny(strArray6);
        char char8 = tokenQueue1.peek();
        org.jsoup.parser.TokenQueue tokenQueue10 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean12 = tokenQueue10.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char13 = tokenQueue10.consume();
        org.jsoup.parser.TokenQueue tokenQueue15 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean17 = tokenQueue15.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char18 = tokenQueue15.consume();
        char[] charArray19 = new char[] {};
        boolean boolean20 = tokenQueue15.matchesAny(charArray19);
        boolean boolean21 = tokenQueue10.matchesAny(charArray19);
        boolean boolean22 = tokenQueue1.matchesAny(charArray19);
        boolean boolean23 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'm' + "'", char8 == 'm');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'm' + "'", char13 == 'm');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'm' + "'", char18 == 'm');
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        boolean boolean11 = request9.hasHeader("multipart/form-data");
        boolean boolean13 = request9.hasCookie("#text");
        org.jsoup.parser.Parser parser14 = request9.parser();
        org.jsoup.nodes.Document document15 = document1.parser(parser14);
        boolean boolean16 = document15.updateMetaCharsetElement();
        org.jsoup.nodes.Element element18 = document15.removeAttr("[#declaration!=content-encoding]");
        java.lang.String str19 = document15.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        java.lang.Object obj5 = null;
        boolean boolean6 = document1.hasSameValue(obj5);
        org.jsoup.nodes.Element element8 = document1.removeAttr(":last-of-type");
        org.jsoup.nodes.Element element10 = element8.tagName("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.jsoup.nodes.Element element12 = element8.prepend("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType17 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.nodes.Element element22 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType17, (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.className();
        java.lang.String str26 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str29 = document28.id();
        java.lang.String str30 = document28.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan32 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean33 = document28.is((org.jsoup.select.Evaluator) indexLessThan32);
        boolean boolean34 = isNthLastOfType17.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document28);
        java.lang.String str35 = document28.cssSelector();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str38 = document37.className();
        java.lang.String str39 = document37.outerHtml();
        boolean boolean41 = document37.hasSameValue((java.lang.Object) 1);
        boolean boolean42 = indexLessThan14.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document37);
        org.jsoup.parser.Parser parser43 = document28.parser();
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType44 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str45 = isFirstOfType44.toString();
        boolean boolean46 = document28.is((org.jsoup.select.Evaluator) isFirstOfType44);
        boolean boolean47 = element8.is((org.jsoup.select.Evaluator) isFirstOfType44);
        java.lang.String str48 = isFirstOfType44.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNull(element22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#root" + "'", str35, "#root");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str39, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(parser43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ":first-of-type" + "'", str45, ":first-of-type");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ":first-of-type" + "'", str48, ":first-of-type");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.className();
        java.lang.String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.id();
        java.lang.String str17 = document15.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        java.lang.String str22 = document15.cssSelector();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.className();
        java.lang.String str26 = document24.outerHtml();
        boolean boolean28 = document24.hasSameValue((java.lang.Object) 1);
        boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Document.QuirksMode quirksMode30 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document31 = document24.quirksMode(quirksMode30);
        org.jsoup.select.Elements elements34 = document31.getElementsByAttributeValueMatching("multipart/form-data", "hi!");
        org.jsoup.select.Elements elements35 = document31.children();
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNull(element9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str26, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + quirksMode30 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode30.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.className();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.id();
        java.lang.String str15 = document13.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean18 = document13.is((org.jsoup.select.Evaluator) indexLessThan17);
        boolean boolean19 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document13);
        java.lang.String str20 = document13.cssSelector();
        org.jsoup.nodes.Element element21 = document13.clearAttributes();
        org.jsoup.nodes.Node node22 = document13.clone();
        org.jsoup.select.Elements elements24 = document13.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements25 = elements24.remove();
        int int26 = elements24.size();
        org.jsoup.select.Elements elements28 = elements24.eq(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements30 = elements28.prevAll("[]");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(elements28);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.className();
        java.lang.String str7 = document5.outerHtml();
        boolean boolean9 = document5.hasSameValue((java.lang.Object) 1);
        java.lang.String str10 = document5.tagName();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element14 = document12.val("hi!");
        boolean boolean15 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document5, element14);
        org.jsoup.select.Elements elements16 = element14.nextElementSiblings();
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = allElements0.matches(element14, element17);
        java.lang.String str19 = allElements0.toString();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element23 = document21.val("hi!");
        org.jsoup.nodes.Element element24 = document21.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList25 = document21.dataNodes();
        java.lang.String str26 = document21.nodeName();
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node31 = textNode29.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node33 = textNode29.removeAttr("#document");
        org.jsoup.nodes.Element element34 = document21.prependChild(node33);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str37 = document36.id();
        org.jsoup.select.Elements elements38 = document36.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode39 = document36.quirksMode();
        org.jsoup.nodes.Document document40 = document21.quirksMode(quirksMode39);
        org.jsoup.select.Elements elements43 = document40.getElementsByAttributeValueContaining("[]", "[#declaration!=content-encoding]");
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Attributes attributes46 = document45.attributes();
        org.jsoup.nodes.Element element48 = document45.prependText(":first-child");
        boolean boolean49 = allElements0.matches((org.jsoup.nodes.Element) document40, element48);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str7, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "*" + "'", str19, "*");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(dataNodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#document" + "'", str26, "#document");
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + quirksMode39 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode39.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(elements43);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request12 = request4.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean15 = org.jsoup.internal.StringUtil.in("", strArray14);
        boolean boolean16 = org.jsoup.internal.StringUtil.in("", strArray14);
        java.lang.String str18 = org.jsoup.internal.StringUtil.join(strArray14, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.data(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!" + "'", str18, "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jsoup.helper.HttpConnection httpConnection2 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request3 = httpConnection2.request();
        org.jsoup.Connection connection5 = httpConnection2.referrer("multipart/form-data");
        org.jsoup.Connection.Response response6 = httpConnection2.response();
        org.jsoup.Connection connection8 = httpConnection2.ignoreContentType(false);
        org.jsoup.Connection.Method method9 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean10 = method9.hasBody();
        org.jsoup.Connection connection11 = httpConnection2.method(method9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser13 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder12);
        org.jsoup.Connection connection14 = httpConnection2.parser(parser13);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("Content-Encoding=\"#root\"", ":nth-last-of-type(100n-1)", parser13);
        org.jsoup.nodes.Element element16 = document15.body();
        org.jsoup.select.Elements elements17 = document15.children();
        java.lang.String str18 = document15.outerHtml();
        org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method9.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<html>\n <head></head>\n <body>\n  Content-Encoding=\"#root\"\n </body>\n</html>" + "'", str18, "<html>\n <head></head>\n <body>\n  Content-Encoding=\"#root\"\n </body>\n</html>");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        org.jsoup.Connection.Request request19 = httpConnection0.request();
        org.jsoup.Connection.Request request21 = request19.removeCookie(":nth-last-of-type(100n-1)");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection22 = request21.data();
        org.jsoup.Connection.Method method23 = org.jsoup.Connection.Method.TRACE;
        org.jsoup.Connection.Request request24 = request21.method(method23);
        java.io.InputStream inputStream27 = null;
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse(inputStream27, "", "#root", parser30);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser30);
        org.jsoup.parser.ParseSettings parseSettings33 = parser30.settings();
        org.jsoup.parser.ParseSettings parseSettings34 = org.jsoup.parser.ParseSettings.preserveCase;
        org.jsoup.parser.Parser parser35 = parser30.settings(parseSettings34);
        org.jsoup.parser.Parser parser37 = parser30.setTrackErrors((int) (byte) 10);
        org.jsoup.Connection.Request request38 = request24.parser(parser30);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(keyValCollection22);
        org.junit.Assert.assertTrue("'" + method23 + "' != '" + org.jsoup.Connection.Method.TRACE + "'", method23.equals(org.jsoup.Connection.Method.TRACE));
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(request38);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes5.clone();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", attributes5);
        java.lang.String str8 = tag1.normalName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#document" + "'", str8, "#document");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((java.lang.Object) 1);
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element7 = document1.head();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.nodes.Element element11 = document1.prependChild((org.jsoup.nodes.Node) document10);
        java.lang.String str12 = document10.nodeName();
        org.jsoup.nodes.Element element13 = document10.lastElementSibling();
        org.jsoup.select.Elements elements16 = document10.getElementsByAttributeValueContaining("Content-Type=#declaration", "#:first-child");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("<!#root!>");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.id();
        java.lang.String str5 = document3.baseUri();
        org.jsoup.nodes.Element element8 = document3.attr("", true);
        java.lang.String str9 = document3.title();
        java.lang.String str10 = document3.className();
        java.lang.StringBuilder stringBuilder11 = org.jsoup.internal.StringUtil.borrowBuilder();
        java.lang.Appendable appendable12 = document3.html((java.lang.Appendable) stringBuilder11);
        boolean boolean13 = tag1.equals((java.lang.Object) stringBuilder11);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(appendable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        java.net.URL uRL8 = request7.url();
        boolean boolean11 = request7.hasHeaderWithValue("Content-Encoding", "                                   ");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element5 = document1.toggleClass("multipart");
        org.jsoup.nodes.Element element6 = document1.root();
        org.jsoup.nodes.Element element8 = document1.text(":gt(35)");
        org.jsoup.select.Elements elements11 = element8.getElementsByAttributeValueNot("Content-Encoding=#declaration", "#declaration");
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList12.listIterator();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node18 = textNode16.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node20 = textNode16.removeAttr("#document");
        int int21 = parseErrorList12.lastIndexOf((java.lang.Object) node20);
        org.jsoup.nodes.Entities entities22 = new org.jsoup.nodes.Entities();
        boolean boolean23 = parseErrorList12.remove((java.lang.Object) entities22);
        org.jsoup.parser.ParseError[] parseErrorArray24 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList25 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList25, parseErrorArray24);
        org.jsoup.parser.ParseErrorList parseErrorList27 = org.jsoup.parser.ParseErrorList.noTracking();
        int int28 = parseErrorList25.indexOf((java.lang.Object) parseErrorList27);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor29 = parseErrorList25.iterator();
        org.jsoup.parser.ParseError parseError31 = null;
        parseErrorList25.add(0, parseError31);
        int int33 = parseErrorList25.size();
        boolean boolean34 = parseErrorList12.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList25);
        boolean boolean35 = elements11.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList12);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseErrorArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parseErrorList27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.className();
        java.lang.String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.id();
        java.lang.String str15 = document13.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean18 = document13.is((org.jsoup.select.Evaluator) indexLessThan17);
        boolean boolean19 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document13);
        org.jsoup.select.Elements elements21 = document9.getElementsMatchingOwnText("multipart/form-data");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType24 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.nodes.Element element29 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType24, (org.jsoup.nodes.Element) document26);
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str32 = document31.className();
        java.lang.String str33 = document31.outerHtml();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str36 = document35.id();
        java.lang.String str37 = document35.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan39 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean40 = document35.is((org.jsoup.select.Evaluator) indexLessThan39);
        boolean boolean41 = isNthLastOfType24.matches((org.jsoup.nodes.Element) document31, (org.jsoup.nodes.Element) document35);
        java.lang.String str42 = document35.cssSelector();
        org.jsoup.nodes.Element element43 = document35.clearAttributes();
        org.jsoup.nodes.Element element45 = element43.html("Content-Encoding");
        boolean boolean46 = elements21.add(element43);
        org.jsoup.nodes.Document document47 = element43.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = element43.is(" ");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query ' ': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str33, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#root" + "'", str42, "#root");
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(document47);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData("");
        java.lang.String str2 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData()" + "'", str2, ":containsData()");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        java.lang.String str7 = document1.title();
        java.lang.String str8 = document1.className();
        org.jsoup.select.Evaluator.Attribute attribute10 = new org.jsoup.select.Evaluator.Attribute("Content-Encoding");
        org.jsoup.parser.Tag tag12 = new org.jsoup.parser.Tag("#document");
        boolean boolean13 = tag12.isFormListed();
        boolean boolean14 = tag12.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "ultipart");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str19 = document18.id();
        java.lang.String str20 = document18.baseUri();
        org.jsoup.nodes.Element element23 = document18.attr("", true);
        org.jsoup.select.Elements elements25 = document18.getElementsContainingText("#text");
        boolean boolean26 = attribute10.matches(element16, (org.jsoup.nodes.Element) document18);
        boolean boolean27 = document1.is((org.jsoup.select.Evaluator) attribute10);
        java.lang.String str28 = attribute10.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[Content-Encoding]" + "'", str28, "[Content-Encoding]");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jsoup.nodes.DataNode dataNode4 = org.jsoup.nodes.DataNode.createFromEncoded("", ":first-of-type");
        org.jsoup.nodes.Attributes attributes5 = dataNode4.attributes();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("#document", " hi!=\"multipart/form-data\"", attributes5);
        org.jsoup.nodes.Attributes attributes9 = attributes5.put("[]", true);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType12 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str15 = document14.className();
        java.lang.String str16 = document14.outerHtml();
        boolean boolean18 = document14.hasSameValue((java.lang.Object) 1);
        java.lang.String str19 = document14.tagName();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element23 = document21.val("hi!");
        boolean boolean24 = isNthLastOfType12.matches((org.jsoup.nodes.Element) document14, element23);
        java.lang.String str25 = document14.wholeText();
        org.jsoup.nodes.Element element27 = document14.removeClass("#root=\"\"");
        org.jsoup.nodes.Element element28 = element27.clone();
        boolean boolean29 = attributes5.equals((java.lang.Object) element28);
        org.junit.Assert.assertNotNull(dataNode4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str16, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request20 = httpConnection19.request();
        org.jsoup.Connection connection22 = httpConnection19.referrer("multipart/form-data");
        org.jsoup.Connection.Response response23 = httpConnection19.response();
        org.jsoup.Connection connection25 = httpConnection19.ignoreContentType(false);
        java.io.InputStream inputStream28 = null;
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse(inputStream28, "", "#root", parser31);
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser31);
        org.jsoup.Connection connection34 = connection25.parser(parser31);
        org.jsoup.Connection connection35 = httpConnection0.parser(parser31);
        org.jsoup.Connection.Method method36 = org.jsoup.Connection.Method.DELETE;
        org.jsoup.Connection connection37 = httpConnection0.method(method36);
        org.jsoup.Connection connection40 = httpConnection0.proxy("#:first-child", (int) (short) 1);
        java.io.InputStream inputStream41 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream44 = new org.jsoup.internal.ConstrainableInputStream(inputStream41, 1, (int) (byte) 0);
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document48 = org.jsoup.helper.DataUtil.load(inputStream41, ":eq(-1)", "Content-Encoding", parser47);
        org.jsoup.parser.ParseErrorList parseErrorList49 = parser47.getErrors();
        org.jsoup.Connection connection50 = httpConnection0.parser(parser47);
        org.jsoup.helper.Validate.notNull((java.lang.Object) connection50);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertTrue("'" + method36 + "' != '" + org.jsoup.Connection.Method.DELETE + "'", method36.equals(org.jsoup.Connection.Method.DELETE));
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseErrorList49);
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jsoup.select.Evaluator.IsEmpty isEmpty0 = new org.jsoup.select.Evaluator.IsEmpty();
        java.lang.String str1 = isEmpty0.toString();
        java.lang.String str2 = isEmpty0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":empty" + "'", str1, ":empty");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":empty" + "'", str2, ":empty");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.nodes.Node node9 = document1.attr("#text", "");
        org.jsoup.nodes.Element element11 = document1.html("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.Element element12 = document1.previousElementSibling();
        org.jsoup.parser.ParseErrorList parseErrorList13 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream14 = parseErrorList13.stream();
        int int15 = parseErrorList13.size();
        org.jsoup.parser.ParseError[] parseErrorArray16 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList17 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList17, parseErrorArray16);
        org.jsoup.parser.ParseErrorList parseErrorList19 = org.jsoup.parser.ParseErrorList.noTracking();
        int int20 = parseErrorList17.indexOf((java.lang.Object) parseErrorList19);
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        org.jsoup.Connection connection23 = httpConnection21.sslSocketFactory(sSLSocketFactory22);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection21.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection connection27 = httpConnection21.ignoreContentType(true);
        boolean boolean28 = parseErrorList17.equals((java.lang.Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray29 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList30 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList30, parseErrorArray29);
        parseErrorList30.ensureCapacity(10);
        boolean boolean34 = parseErrorList17.remove((java.lang.Object) parseErrorList30);
        parseErrorList30.ensureCapacity((int) (short) 100);
        boolean boolean37 = parseErrorList13.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList30);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor38 = parseErrorList30.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = element12.equals((java.lang.Object) parseErrorItor38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parseErrorStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(parseErrorArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseErrorArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parseErrorItor38);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) 0);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        java.lang.String str6 = document4.baseUri();
        org.jsoup.nodes.Element element9 = document4.attr("", true);
        org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element14 = document12.val("hi!");
        org.jsoup.nodes.Element element15 = document12.clone();
        org.jsoup.nodes.Element element17 = document12.appendText("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        java.lang.String str18 = document12.data();
        boolean boolean19 = indexGreaterThan1.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document12);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.outline(false);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.wholeText();
        org.jsoup.select.Elements elements7 = document5.parents();
        java.nio.charset.Charset charset8 = document5.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings3.charset(charset8);
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = outputSettings9.prettyPrint(true);
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = outputSettings9.prettyPrint(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(charset8);
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertNotNull(outputSettings11);
        org.junit.Assert.assertNotNull(outputSettings13);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#doctype");
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str7 = document4.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document4.removeAttr("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.jsoup.nodes.Element element11 = document4.tagName("ultipart/form-data");
        org.jsoup.nodes.Element element12 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) attributeWithValueContaining2, element11);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jsoup.helper.Validate.notEmpty("[public=&lt;!#root!&gt;]", "&lt;html&gt;\n &lt;head&gt;&lt;/head&gt;\n &lt;body&gt;\n  hi!\n &lt;/body&gt;\n&lt;/html&gt;=\"#root\"");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.select.Evaluator.Attribute attribute1 = new org.jsoup.select.Evaluator.Attribute("Content-Encoding");
        java.lang.String str2 = attribute1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[Content-Encoding]" + "'", str2, "[Content-Encoding]");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream9 = constrainableInputStream6.timeout((long) 'a', (long) (short) -1);
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream12);
        java.io.InputStream inputStream14 = keyVal13.inputStream();
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream17);
        java.io.InputStream inputStream19 = keyVal18.inputStream();
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        org.jsoup.Connection connection22 = httpConnection20.sslSocketFactory(sSLSocketFactory21);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = null;
        org.jsoup.Connection connection24 = httpConnection20.sslSocketFactory(sSLSocketFactory23);
        org.jsoup.Connection.Request request25 = httpConnection20.request();
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request27 = httpConnection26.request();
        org.jsoup.Connection.Request request30 = request27.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = request30.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = request30.cookies();
        org.jsoup.Connection connection33 = httpConnection20.headers(strMap32);
        java.io.InputStream inputStream36 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream39 = new org.jsoup.internal.ConstrainableInputStream(inputStream36, 1, (int) (byte) 0);
        org.jsoup.Connection connection40 = httpConnection20.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream39);
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = keyVal18.inputStream((java.io.InputStream) constrainableInputStream39);
        constrainableInputStream39.skipNBytes(0L);
        org.jsoup.helper.HttpConnection.KeyVal keyVal44 = keyVal13.inputStream((java.io.InputStream) constrainableInputStream39);
        byte[] byteArray46 = new byte[] { (byte) 100 };
        int int49 = constrainableInputStream39.read(byteArray46, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = constrainableInputStream6.readNBytes(byteArray46, (int) (byte) -1, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Range [-1, -1 + 117) out of bounds for length 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
        org.junit.Assert.assertNotNull(constrainableInputStream9);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(keyVal41);
        org.junit.Assert.assertNotNull(keyVal44);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[100]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((java.lang.Object) parseErrorList3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        boolean boolean12 = parseErrorList1.equals((java.lang.Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        parseErrorList14.ensureCapacity(10);
        boolean boolean18 = parseErrorList1.remove((java.lang.Object) parseErrorList14);
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.noTracking();
        int int23 = parseErrorList20.indexOf((java.lang.Object) parseErrorList22);
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        org.jsoup.Connection connection26 = httpConnection24.sslSocketFactory(sSLSocketFactory25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        org.jsoup.Connection connection28 = httpConnection24.sslSocketFactory(sSLSocketFactory27);
        org.jsoup.Connection connection30 = httpConnection24.ignoreContentType(true);
        boolean boolean31 = parseErrorList20.equals((java.lang.Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray32 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList33 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33, parseErrorArray32);
        parseErrorList33.ensureCapacity(10);
        boolean boolean37 = parseErrorList20.remove((java.lang.Object) parseErrorList33);
        boolean boolean38 = parseErrorList20.isEmpty();
        java.lang.String str39 = parseErrorList20.toString();
        boolean boolean40 = parseErrorList14.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor41 = parseErrorList14.iterator();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parseErrorArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseErrorItor41);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = request14.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        org.jsoup.Connection connection20 = httpConnection0.referrer("#document");
        java.io.InputStream inputStream25 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream25);
        java.io.InputStream inputStream27 = keyVal26.inputStream();
        java.io.InputStream inputStream30 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream30);
        java.io.InputStream inputStream32 = keyVal31.inputStream();
        org.jsoup.helper.HttpConnection httpConnection33 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory34 = null;
        org.jsoup.Connection connection35 = httpConnection33.sslSocketFactory(sSLSocketFactory34);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory36 = null;
        org.jsoup.Connection connection37 = httpConnection33.sslSocketFactory(sSLSocketFactory36);
        org.jsoup.Connection.Request request38 = httpConnection33.request();
        org.jsoup.helper.HttpConnection httpConnection39 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request40 = httpConnection39.request();
        org.jsoup.Connection.Request request43 = request40.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap44 = request43.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = request43.cookies();
        org.jsoup.Connection connection46 = httpConnection33.headers(strMap45);
        java.io.InputStream inputStream49 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream52 = new org.jsoup.internal.ConstrainableInputStream(inputStream49, 1, (int) (byte) 0);
        org.jsoup.Connection connection53 = httpConnection33.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream52);
        org.jsoup.helper.HttpConnection.KeyVal keyVal54 = keyVal31.inputStream((java.io.InputStream) constrainableInputStream52);
        constrainableInputStream52.skipNBytes(0L);
        org.jsoup.helper.HttpConnection.KeyVal keyVal57 = keyVal26.inputStream((java.io.InputStream) constrainableInputStream52);
        byte[] byteArray59 = new byte[] { (byte) 100 };
        int int62 = constrainableInputStream52.read(byteArray59, 1, (int) (byte) 0);
        org.jsoup.Connection connection63 = httpConnection0.data("#declaration", "", (java.io.InputStream) constrainableInputStream52);
        org.jsoup.Connection connection66 = connection63.header("<!#root!>", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!multipart/form-data");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(keyVal26);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(keyVal54);
        org.junit.Assert.assertNotNull(keyVal57);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[100]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection66);
    }
}
