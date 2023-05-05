package org.jsoup.mytests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) ' ');
        String str9 = elements8.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        String str4 = keyVal3.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str10 = document9.className();
        String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str14 = document13.id();
        String str15 = document13.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean18 = document13.is((org.jsoup.select.Evaluator) indexLessThan17);
        boolean boolean19 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document13);
        String str20 = document13.cssSelector();
        org.jsoup.nodes.Element element21 = document13.clearAttributes();
        org.jsoup.nodes.Node node22 = document13.clone();
        org.jsoup.select.Elements elements24 = document13.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements25 = elements24.remove();
        int int26 = elements24.size();
        boolean boolean28 = elements24.is("[public=<!#root!>]");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        boolean boolean12 = parseErrorList1.equals((Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        parseErrorList14.ensureCapacity(10);
        boolean boolean18 = parseErrorList1.remove((Object) parseErrorList14);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor19 = parseErrorList14.listIterator();
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
        org.junit.Assert.assertNotNull(parseErrorItor19);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        org.jsoup.nodes.Attributes attributes15 = attributes12.put("ultipart", false);
        org.jsoup.nodes.Attributes attributes16 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute19 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes20 = attributes16.put(attribute19);
        org.jsoup.nodes.Attribute attribute21 = attribute19.clone();
        String str22 = attribute21.html();
        org.jsoup.nodes.Attributes attributes23 = attributes15.put(attribute21);
        org.jsoup.nodes.Attributes attributes24 = attributes15.clone();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attribute19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attribute21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root=\"\"" + "'", str22, "#root=\"\"");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        java.net.Proxy proxy4 = null;
        org.jsoup.Connection connection5 = httpConnection0.proxy(proxy4);
        org.jsoup.Connection connection8 = httpConnection0.cookie("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        org.jsoup.Connection.Request request13 = request4.cookie("#document", "#document");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Request request17 = request4.data((org.jsoup.Connection.KeyVal) keyVal16);
        org.jsoup.parser.Parser parser18 = request4.parser();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(parser18);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document8 = document1.parser(parser7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = document8.is("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body>?  hi!? </body>?</html>=\"#root\"': unexpected token at '<html>? <head></head>? <body>?  hi!? </body>?</html>=\"#root\"'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        java.io.InputStream inputStream7 = null;
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse(inputStream7, "", "#root", parser10);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser10);
        org.jsoup.select.Elements elements14 = document12.getElementsByIndexLessThan(0);
        int int15 = parseErrorList1.indexOf((Object) elements14);
        Object[] objArray16 = parseErrorList1.toArray();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        java.io.InputStream inputStream6 = null;
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse(inputStream6, "", "#root", parser9);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser9);
        org.jsoup.nodes.Document document12 = document11.normalise();
        org.jsoup.nodes.Element element13 = document1.appendTo((org.jsoup.nodes.Element) document12);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator18 = parseErrorList17.spliterator();
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parseErrorSpliterator18);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("hi!hi!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue(" ");
        tokenQueue1.consume("");
        String str4 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements7 = document1.siblingElements();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements7.listIterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementItor8);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.before("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str11 = document10.className();
        String str12 = document10.outerHtml();
        boolean boolean14 = document10.hasSameValue((Object) 1);
        String str15 = document10.tagName();
        org.jsoup.nodes.Element element16 = document10.head();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.nodes.Element element20 = document10.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = tag1.equals((Object) document19);
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str24 = document23.className();
        String str26 = document23.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str27 = document23.normalName();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType30 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str33 = document32.wholeText();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str36 = document35.className();
        boolean boolean37 = isNthLastOfType30.matches((org.jsoup.nodes.Element) document32, (org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Document document38 = document32.clone();
        org.jsoup.nodes.Element element40 = document32.tagName("#root");
        String str41 = element40.tagName();
        org.jsoup.nodes.Node node42 = element40.clone();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str45 = document44.className();
        String str46 = document44.outerHtml();
        boolean boolean48 = document44.hasSameValue((Object) 1);
        String str49 = document44.tagName();
        String str50 = document44.baseUri();
        org.jsoup.nodes.Element[] elementArray51 = new org.jsoup.nodes.Element[] { document19, document23, element40, document44 };
        org.jsoup.select.Elements elements52 = new org.jsoup.select.Elements(elementArray51);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element54 = elements52.get((int) 'm');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 109 out of bounds for length 4");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#root" + "'", str41, "#root");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str46, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#root" + "'", str49, "#root");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(elementArray51);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("                                   ", ":matchesOwn(null)");
        String str3 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("/form-data", "Content-Type");
        boolean boolean4 = document2.is("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.className();
        String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str16 = document15.id();
        String str17 = document15.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        String str22 = document15.cssSelector();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str25 = document24.className();
        String str26 = document24.outerHtml();
        boolean boolean28 = document24.hasSameValue((Object) 1);
        boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Document.QuirksMode quirksMode30 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document31 = document24.quirksMode(quirksMode30);
        org.jsoup.nodes.Node node32 = document31.nextSibling();
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
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        tokenQueue1.addFirst((Character) 'a');
        boolean boolean4 = tokenQueue1.matchesWhitespace();
        char char5 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        boolean boolean13 = parseErrorList11.isEmpty();
        int int14 = parseErrorList11.size();
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList15.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList15.parallelStream();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        org.jsoup.select.Elements elements24 = elements21.empty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.select.Elements elements30 = elements28.prev("#text");
        boolean boolean31 = elements28.hasText();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        org.jsoup.select.Elements elements38 = elements35.empty();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str41 = document40.id();
        org.jsoup.select.Elements elements42 = document40.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor43 = elements42.listIterator();
        boolean boolean45 = elements42.equals((Object) 1.0d);
        String str46 = elements42.text();
        org.jsoup.select.Elements elements48 = elements42.wrap("#root");
        org.jsoup.select.Elements[] elementsArray49 = new org.jsoup.select.Elements[] { elements21, elements28, elements35, elements48 };
        org.jsoup.select.Elements[] elementsArray50 = parseErrorList15.toArray(elementsArray49);
        boolean boolean51 = parseErrorList11.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        boolean boolean52 = elements3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        org.jsoup.parser.ParseError[] parseErrorArray53 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList54 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList54, parseErrorArray53);
        org.jsoup.parser.ParseErrorList parseErrorList56 = org.jsoup.parser.ParseErrorList.noTracking();
        int int57 = parseErrorList54.indexOf((Object) parseErrorList56);
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory59 = null;
        org.jsoup.Connection connection60 = httpConnection58.sslSocketFactory(sSLSocketFactory59);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory61 = null;
        org.jsoup.Connection connection62 = httpConnection58.sslSocketFactory(sSLSocketFactory61);
        org.jsoup.Connection connection64 = httpConnection58.ignoreContentType(true);
        boolean boolean65 = parseErrorList54.equals((Object) true);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream66 = parseErrorList54.parallelStream();
        boolean boolean67 = parseErrorList15.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList54);
        int int68 = parseErrorList54.size();
        int int69 = parseErrorList54.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parseErrorItor16);
        org.junit.Assert.assertNotNull(parseErrorStream17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementItor22);
        org.junit.Assert.assertNotNull(elementItor23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elementItor36);
        org.junit.Assert.assertNotNull(elementItor37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elementItor43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elementsArray49);
        org.junit.Assert.assertNotNull(elementsArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(parseErrorArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseErrorList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(parseErrorStream66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str10 = document9.className();
        String str11 = document9.outerHtml();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str14 = document13.id();
        String str15 = document13.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan17 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean18 = document13.is((org.jsoup.select.Evaluator) indexLessThan17);
        boolean boolean19 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document9, (org.jsoup.nodes.Element) document13);
        String str20 = document13.cssSelector();
        org.jsoup.nodes.Element element21 = document13.clearAttributes();
        org.jsoup.nodes.Node node22 = document13.clone();
        org.jsoup.select.Elements elements24 = document13.getElementsByAttribute("#root");
        org.jsoup.select.Elements elements25 = elements24.remove();
        int int26 = elements24.size();
        org.jsoup.select.Elements elements28 = elements24.prevAll("multipart");
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        boolean boolean4 = xmlDeclaration3.hasParent();
        String str5 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("#declaration");
        String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#declaration" + "'", str2, "#declaration");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("#document");
        String str2 = tag1.toString();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute7 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes8 = attributes4.put(attribute7);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str11 = document10.id();
        org.jsoup.select.Elements elements12 = document10.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor14 = elements12.listIterator();
        org.jsoup.select.Elements elements15 = elements12.empty();
        boolean boolean16 = attributes8.equals((Object) elements12);
        org.jsoup.nodes.Attributes attributes19 = attributes8.add("#root=\"\"", " hi!=\"multipart/form-data\"");
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor20 = attributes8.iterator();
        org.jsoup.nodes.PseudoTextElement pseudoTextElement21 = new org.jsoup.nodes.PseudoTextElement(tag1, ":matchesOwn(null)", attributes8);
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor23 = parseErrorList22.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList22.iterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream25 = parseErrorList22.stream();
        boolean boolean26 = tag1.equals((Object) parseErrorStream25);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
        org.junit.Assert.assertNotNull(attribute7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementItor13);
        org.junit.Assert.assertNotNull(elementItor14);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributeItor20);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parseErrorItor23);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertNotNull(parseErrorStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method9 = request4.method();
        org.jsoup.Connection.Method method10 = request4.method();
        org.jsoup.Connection.Request request13 = request4.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection.Request request16 = request4.header(" ", "<!#root!>");
        int int17 = request16.timeout();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30000 + "'", int17 == 30000);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        org.jsoup.nodes.TextNode textNode4 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node6 = textNode4.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node8 = textNode4.removeAttr("#document");
        int int9 = parseErrorList0.lastIndexOf((Object) node8);
        org.jsoup.parser.ParseError[] parseErrorArray10 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList11 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11, parseErrorArray10);
        org.jsoup.parser.ParseErrorList parseErrorList13 = org.jsoup.parser.ParseErrorList.noTracking();
        int int14 = parseErrorList11.indexOf((Object) parseErrorList13);
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        org.jsoup.Connection connection17 = httpConnection15.sslSocketFactory(sSLSocketFactory16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        org.jsoup.Connection connection19 = httpConnection15.sslSocketFactory(sSLSocketFactory18);
        org.jsoup.Connection connection21 = httpConnection15.ignoreContentType(true);
        boolean boolean22 = parseErrorList11.equals((Object) true);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream23 = parseErrorList11.parallelStream();
        boolean boolean24 = parseErrorList0.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        java.util.Collection<org.jsoup.parser.ParseError> parseErrorCollection25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = parseErrorList11.containsAll(parseErrorCollection25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(parseErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parseErrorStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsContainingOwnText("[]");
        org.jsoup.select.Elements elements10 = elements8.prev("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document2);
        org.jsoup.select.Elements elements10 = elements8.toggleClass("PUBLIC");
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = elements10.set((int) (byte) 1, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        String str5 = keyVal3.key();
        String str6 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal3.key("Content-Type");
        String str9 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Encoding=#declaration" + "'", str6, "Content-Encoding=#declaration");
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Type=#declaration" + "'", str9, "Content-Type=#declaration");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        boolean boolean13 = parseErrorList11.isEmpty();
        int int14 = parseErrorList11.size();
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList15.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList15.parallelStream();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        org.jsoup.select.Elements elements24 = elements21.empty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.select.Elements elements30 = elements28.prev("#text");
        boolean boolean31 = elements28.hasText();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        org.jsoup.select.Elements elements38 = elements35.empty();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str41 = document40.id();
        org.jsoup.select.Elements elements42 = document40.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor43 = elements42.listIterator();
        boolean boolean45 = elements42.equals((Object) 1.0d);
        String str46 = elements42.text();
        org.jsoup.select.Elements elements48 = elements42.wrap("#root");
        org.jsoup.select.Elements[] elementsArray49 = new org.jsoup.select.Elements[] { elements21, elements28, elements35, elements48 };
        org.jsoup.select.Elements[] elementsArray50 = parseErrorList15.toArray(elementsArray49);
        boolean boolean51 = parseErrorList11.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        boolean boolean52 = elements3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        org.jsoup.parser.ParseError[] parseErrorArray53 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList54 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList54, parseErrorArray53);
        org.jsoup.parser.ParseErrorList parseErrorList56 = org.jsoup.parser.ParseErrorList.noTracking();
        int int57 = parseErrorList54.indexOf((Object) parseErrorList56);
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory59 = null;
        org.jsoup.Connection connection60 = httpConnection58.sslSocketFactory(sSLSocketFactory59);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory61 = null;
        org.jsoup.Connection connection62 = httpConnection58.sslSocketFactory(sSLSocketFactory61);
        org.jsoup.Connection connection64 = httpConnection58.ignoreContentType(true);
        boolean boolean65 = parseErrorList54.equals((Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray66 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList67 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList67, parseErrorArray66);
        parseErrorList67.ensureCapacity(10);
        boolean boolean71 = parseErrorList54.remove((Object) parseErrorList67);
        boolean boolean72 = elements3.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList67);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor74 = parseErrorList67.listIterator(0);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parseErrorItor16);
        org.junit.Assert.assertNotNull(parseErrorStream17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementItor22);
        org.junit.Assert.assertNotNull(elementItor23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elementItor36);
        org.junit.Assert.assertNotNull(elementItor37);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertNotNull(elementItor43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(elements48);
        org.junit.Assert.assertNotNull(elementsArray49);
        org.junit.Assert.assertNotNull(elementsArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(parseErrorArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseErrorList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(parseErrorArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parseErrorItor74);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("#document", "#root=\"\"", inputStream2);
        org.jsoup.Connection.KeyVal keyVal5 = keyVal3.value("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        String str6 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]" + "'", str6, "#document=[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jsoup.nodes.DataNode dataNode2 = new org.jsoup.nodes.DataNode("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]", "                                                                                                    ");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elements3.spliterator();
        java.util.List<String> strList12 = elements3.eachText();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList15 = elements3.subList((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String[] strArray6 = new String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        String str7 = tokenQueue1.consumeToAny(strArray6);
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
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'm' + "'", char8 == 'm');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + 'm' + "'", char13 == 'm');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + 'm' + "'", char18 == 'm');
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.jsoup.parser.TokenQueue tokenQueue3 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        tokenQueue3.addFirst((Character) 'a');
        boolean boolean6 = tokenQueue3.matchesWhitespace();
        org.jsoup.parser.TokenQueue tokenQueue8 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean10 = tokenQueue8.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char11 = tokenQueue8.consume();
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean15 = tokenQueue13.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char16 = tokenQueue13.consume();
        char[] charArray17 = new char[] {};
        boolean boolean18 = tokenQueue13.matchesAny(charArray17);
        boolean boolean19 = tokenQueue8.matchesAny(charArray17);
        boolean boolean20 = tokenQueue3.matchesAny(charArray17);
        String str21 = characterReader1.consumeToAny(charArray17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'm' + "'", char11 == 'm');
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'm' + "'", char16 == 'm');
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str21, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.select.Elements elements9 = elements7.tagName("Content-Encoding");
        org.jsoup.select.Elements elements11 = elements7.addClass("");
        String str12 = elements7.val();
        java.util.List<org.jsoup.nodes.FormElement> formElementList13 = elements7.forms();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(formElementList13);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        String str7 = document1.title();
        org.jsoup.nodes.Element element9 = document1.val("Content-Encoding");
        org.jsoup.nodes.Element element11 = document1.appendElement("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.jsoup.nodes.Element element13 = element11.after(":containsData( )");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(element13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jsoup.nodes.Document.QuirksMode quirksMode0 = org.jsoup.nodes.Document.QuirksMode.limitedQuirks;
        org.junit.Assert.assertTrue("'" + quirksMode0 + "' != '" + org.jsoup.nodes.Document.QuirksMode.limitedQuirks + "'", quirksMode0.equals(org.jsoup.nodes.Document.QuirksMode.limitedQuirks));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        boolean boolean13 = method11.hasBody();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("multipart", 100, "application/x-www-form-urlencoded");
        String str4 = httpStatusException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.jsoup.HttpStatusException: multipart. Status=100, URL=application/x-www-form-urlencoded" + "'", str4, "org.jsoup.HttpStatusException: multipart. Status=100, URL=application/x-www-form-urlencoded");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection6 = httpConnection0.header("#data", ":only-child");
        org.jsoup.Connection.Response response7 = connection6.response();
        org.jsoup.Connection.Response response9 = response7.charset("<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream10 = response7.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        org.jsoup.select.Elements elements4 = elements1.attr(":eq(-1)", "[]");
        org.jsoup.select.Elements elements6 = elements1.tagName("Content-Encoding=\"#root\"");
        org.jsoup.select.Elements elements7 = elements1.parents();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        boolean boolean12 = parseErrorList1.equals((Object) true);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList1.parallelStream();
        org.jsoup.helper.Validate.notNull((Object) parseErrorStream13);
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorStream13);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        org.jsoup.Connection.Request request13 = request4.cookie("#document", "#document");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Request request17 = request4.data((org.jsoup.Connection.KeyVal) keyVal16);
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection18 = request4.data();
        org.jsoup.Connection.Request request20 = request4.removeHeader(":lt(52)");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(keyValCollection18);
        org.junit.Assert.assertNotNull(request20);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        boolean boolean4 = xmlDeclaration3.hasParent();
        String str5 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("PUBLIC", "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.headers();
        java.util.Map<String, String> strMap7 = request4.cookies();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        request4.sslSocketFactory(sSLSocketFactory8);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jsoup.safety.Whitelist whitelist4 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean5 = org.jsoup.Jsoup.isValid("hi!", whitelist4);
        org.jsoup.safety.Whitelist whitelist8 = whitelist4.removeEnforcedAttribute("Content-Encoding", "#root");
        String str9 = org.jsoup.Jsoup.clean("", whitelist8);
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String[] strArray17 = new String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        String str18 = tokenQueue12.consumeToAny(strArray17);
        org.jsoup.safety.Whitelist whitelist19 = whitelist8.removeAttributes("multipart", strArray17);
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean21 = outputSettings20.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings23 = outputSettings20.outline(false);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str26 = document25.wholeText();
        org.jsoup.select.Elements elements27 = document25.parents();
        java.nio.charset.Charset charset28 = document25.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = outputSettings23.charset(charset28);
        String str30 = org.jsoup.Jsoup.clean("", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist8, outputSettings29);
        org.jsoup.nodes.Entities.EscapeMode escapeMode31 = outputSettings29.escapeMode();
        org.junit.Assert.assertNotNull(whitelist4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(whitelist8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(whitelist19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(outputSettings23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(charset28);
        org.junit.Assert.assertNotNull(outputSettings29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + escapeMode31 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode31.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.nodes.Node node10 = document2.attr("#text", "");
        org.jsoup.nodes.Node node11 = document2.clone();
        String str12 = document2.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements13 = org.jsoup.select.Selector.select("", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.io.InputStream inputStream0 = null;
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request4 = httpConnection3.request();
        org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        boolean boolean9 = request7.hasHeader("multipart/form-data");
        boolean boolean11 = request7.hasCookie("#text");
        org.jsoup.parser.Parser parser12 = request7.parser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        org.jsoup.select.NodeFilter nodeFilter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document13.filter(nodeFilter14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jsoup.examples.HtmlToPlainText htmlToPlainText0 = new org.jsoup.examples.HtmlToPlainText();
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild1 = new org.jsoup.select.Evaluator.IsOnlyChild();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str4 = document3.id();
        String str5 = document3.baseUri();
        org.jsoup.nodes.Element element7 = document3.toggleClass("multipart");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str10 = document9.className();
        String str11 = document9.outerHtml();
        boolean boolean13 = document9.hasSameValue((Object) 1);
        boolean boolean14 = isOnlyChild1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document9);
        String str15 = htmlToPlainText0.getPlainText((org.jsoup.nodes.Element) document9);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jsoup.parser.ParseSettings parseSettings3 = new org.jsoup.parser.ParseSettings(false, true);
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", parseSettings3);
        boolean boolean5 = tag4.isFormSubmittable();
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.className();
        String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((Object) 1);
        String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        String str15 = document4.wholeText();
        org.jsoup.nodes.Element element17 = document4.removeClass("#root=\"\"");
        org.jsoup.nodes.Element element18 = element17.clone();
        org.jsoup.select.Elements elements19 = element18.parents();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        boolean boolean6 = tag1.isEmpty();
        String str7 = tag1.normalName();
        boolean boolean8 = tag1.isEmpty();
        boolean boolean9 = tag1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        String str5 = tokenQueue1.consumeTo("multipart");
        tokenQueue1.addFirst("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        boolean boolean9 = tokenQueue1.matchChomp("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.util.Map<String, java.util.List<String>> strMap32 = request31.multiHeaders();
        java.util.Map<String, String> strMap33 = request31.cookies();
        org.jsoup.Connection connection34 = httpConnection21.headers(strMap33);
        org.jsoup.helper.HttpConnection.KeyVal keyVal37 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.KeyVal[] keyValArray38 = new org.jsoup.Connection.KeyVal[] { keyVal37 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList39 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39, keyValArray38);
        org.jsoup.Connection connection41 = connection34.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        org.jsoup.Connection connection42 = httpConnection10.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        org.jsoup.Connection connection43 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList39);
        java.net.URL uRL44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection45 = httpConnection0.url(uRL44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("", "[public=<!#root!>]");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str9 = document8.id();
        org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        org.jsoup.nodes.Element element11 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str14 = document13.className();
        String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str18 = document17.id();
        String str19 = document17.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean22 = document17.is((org.jsoup.select.Evaluator) indexLessThan21);
        boolean boolean23 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document17);
        String str24 = document17.cssSelector();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.className();
        String str28 = document26.outerHtml();
        boolean boolean30 = document26.hasSameValue((Object) 1);
        boolean boolean31 = indexLessThan3.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document26);
        org.jsoup.nodes.Document.QuirksMode quirksMode32 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document33 = document26.quirksMode(quirksMode32);
        document26.updateMetaCharsetElement(false);
        org.jsoup.nodes.Element element37 = document26.append("SYSTEM");
        org.jsoup.nodes.Attributes attributes38 = element37.attributes();
        org.jsoup.nodes.Attribute attribute39 = new org.jsoup.nodes.Attribute("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", "hi!hi!", attributes38);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str15, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str28, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + quirksMode32 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode32.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str6 = document5.id();
        String str7 = document5.baseUri();
        org.jsoup.nodes.Element element8 = document5.clearAttributes();
        java.util.Map<String, String> strMap9 = document5.dataset();
        org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreContentType(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = connection12.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes2);
        String str4 = attribute3.getValue();
        String str5 = attribute3.getKey();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        String str7 = attribute6.html();
        org.jsoup.nodes.Attribute attribute8 = attribute6.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding=\"#root\"" + "'", str7, "Content-Encoding=\"#root\"");
        org.junit.Assert.assertNotNull(attribute8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.fail("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: #declaration");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        java.util.Map<String, java.util.List<String>> strMap15 = request14.multiHeaders();
        java.util.Map<String, String> strMap16 = request14.cookies();
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
        java.util.Map<String, java.util.List<String>> strMap37 = request36.multiHeaders();
        java.util.Map<String, String> strMap38 = request36.cookies();
        org.jsoup.Connection connection39 = httpConnection26.headers(strMap38);
        java.io.InputStream inputStream42 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream45 = new org.jsoup.internal.ConstrainableInputStream(inputStream42, 1, (int) (byte) 0);
        org.jsoup.Connection connection46 = httpConnection26.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream45);
        org.jsoup.helper.HttpConnection.KeyVal keyVal47 = keyVal24.inputStream((java.io.InputStream) constrainableInputStream45);
        constrainableInputStream45.skipNBytes(0L);
        org.jsoup.Connection connection50 = httpConnection0.data("[:eq(-1)!=#doctype]", ":contains(content-encoding)", (java.io.InputStream) constrainableInputStream45);
        org.jsoup.Connection connection53 = httpConnection0.cookie("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", "#cdata");
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
        org.junit.Assert.assertNotNull(connection53);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection7 = httpConnection0.cookie("multipart", "#doctype");
        String[] strArray15 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean16 = org.jsoup.internal.StringUtil.in("", strArray15);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("", strArray15);
        String str19 = org.jsoup.internal.StringUtil.join(strArray15, " hi!=\"multipart/form-data\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.data(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str19, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        boolean boolean7 = response4.hasCookie("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.util.Map<String, String> strMap8 = response4.headers();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        parseErrorList1.ensureCapacity(10);
        parseErrorList1.ensureCapacity(100);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList1.iterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream8 = parseErrorList1.parallelStream();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor7);
        org.junit.Assert.assertNotNull(parseErrorStream8);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("[#declaration!=content-encoding]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        org.jsoup.parser.Tag tag14 = new org.jsoup.parser.Tag("#document");
        boolean boolean15 = tag14.isInline();
        org.jsoup.nodes.Attributes attributes17 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes20 = attributes17.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes23 = attributes17.add("hi!", "multipart/form-data");
        attributes23.normalize();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag14, "[public=<!#root!>]", attributes23);
        attributes12.addAll(attributes23);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#declaration", "Content-Encoding");
        String str3 = attributeWithValueNot2.toString();
        String str4 = attributeWithValueNot2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[#declaration!=content-encoding]" + "'", str3, "[#declaration!=content-encoding]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[#declaration!=content-encoding]" + "'", str4, "[#declaration!=content-encoding]");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection5.sslSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        org.jsoup.Connection connection9 = httpConnection5.sslSocketFactory(sSLSocketFactory8);
        org.jsoup.Connection connection11 = httpConnection5.ignoreContentType(true);
        boolean boolean12 = parseErrorList1.equals((Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        parseErrorList14.ensureCapacity(10);
        boolean boolean18 = parseErrorList1.remove((Object) parseErrorList14);
        parseErrorList14.ensureCapacity((int) (short) 100);
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList14.replaceAll(parseErrorUnaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.fail("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: #root");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        String str8 = request4.cookie("#root");
        org.jsoup.Connection.Request request10 = request4.timeout((int) ' ');
        boolean boolean11 = request10.ignoreHttpErrors();
        boolean boolean12 = request10.followRedirects();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "#doctype", attributes2);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes2.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes8 = attributes2.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes11);
        String str13 = attribute12.getValue();
        org.jsoup.nodes.Attributes attributes14 = attributes2.put(attribute12);
        org.jsoup.nodes.Attribute attribute15 = new org.jsoup.nodes.Attribute(":first-of-type", "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!", attributes2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("PUBLIC", "<!#root!>");
        String str3 = attributeWithValue2.toString();
        String str4 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[public=<!#root!>]" + "'", str3, "[public=<!#root!>]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[public=<!#root!>]" + "'", str4, "[public=<!#root!>]");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.simpleText();
        String str2 = org.jsoup.Jsoup.clean("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist1);
        org.jsoup.safety.Cleaner cleaner3 = new org.jsoup.safety.Cleaner(whitelist1);
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]" + "'", str2, "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.select.Elements elements5 = document2.getElementsByAttributeValueMatching("#root=\"\"", "#cdata");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.util.Map<String, java.util.List<String>> strMap16 = request15.multiHeaders();
        java.util.Map<String, String> strMap17 = request15.cookies();
        org.jsoup.Connection connection18 = httpConnection5.headers(strMap17);
        java.io.InputStream inputStream21 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream24 = new org.jsoup.internal.ConstrainableInputStream(inputStream21, 1, (int) (byte) 0);
        org.jsoup.Connection connection25 = httpConnection5.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream24);
        org.jsoup.helper.HttpConnection.KeyVal keyVal26 = keyVal3.inputStream((java.io.InputStream) constrainableInputStream24);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream29 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream24, (int) (short) -1, 10);
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
        org.junit.Assert.assertNotNull(constrainableInputStream29);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        constrainableInputStream3.close();
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream10 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream3, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = constrainableInputStream10.readNBytes(1);
            org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: Read timeout");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
        org.junit.Assert.assertNotNull(constrainableInputStream10);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType((-1), (-1));
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element7 = document5.val("hi!");
        org.jsoup.nodes.Element element8 = document5.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList9 = document5.dataNodes();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan11 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType14 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str17 = document16.id();
        org.jsoup.select.Elements elements18 = document16.previousElementSiblings();
        org.jsoup.nodes.Element element19 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType14, (org.jsoup.nodes.Element) document16);
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str22 = document21.className();
        String str23 = document21.outerHtml();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str26 = document25.id();
        String str27 = document25.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan29 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean30 = document25.is((org.jsoup.select.Evaluator) indexLessThan29);
        boolean boolean31 = isNthLastOfType14.matches((org.jsoup.nodes.Element) document21, (org.jsoup.nodes.Element) document25);
        String str32 = document25.cssSelector();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str35 = document34.className();
        String str36 = document34.outerHtml();
        boolean boolean38 = document34.hasSameValue((Object) 1);
        boolean boolean39 = indexLessThan11.matches((org.jsoup.nodes.Element) document25, (org.jsoup.nodes.Element) document34);
        org.jsoup.nodes.Document.QuirksMode quirksMode40 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document41 = document34.quirksMode(quirksMode40);
        org.jsoup.select.Elements elements44 = document41.getElementsByAttributeValueMatching("multipart/form-data", "hi!");
        java.util.Set<String> strSet45 = document41.classNames();
        org.jsoup.nodes.Element element46 = document5.appendTo((org.jsoup.nodes.Element) document41);
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str49 = document48.wholeText();
        org.jsoup.nodes.Document document50 = document48.clone();
        String str51 = document50.title();
        boolean boolean52 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document41, (org.jsoup.nodes.Element) document50);
        org.jsoup.nodes.Element element53 = org.jsoup.select.Selector.selectFirst(":gt(100)", (org.jsoup.nodes.Element) document41);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(dataNodeList9);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNull(element19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str23, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#root" + "'", str32, "#root");
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str36, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + quirksMode40 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode40.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(elements44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(element53);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element5 = document1.appendElement("#root=\"\"");
        String str6 = element5.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<#root=\"\"></#root=\"\">" + "'", str6, "<#root=\"\"></#root=\"\">");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor2 = parseErrorList0.iterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList0.stream();
        parseErrorList0.clear();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str7 = document6.id();
        String str8 = document6.baseUri();
        org.jsoup.nodes.Element element11 = document6.attr("", true);
        org.jsoup.select.Elements elements13 = document6.getElementsContainingOwnText("[]");
        org.jsoup.nodes.Element element15 = document6.tagName("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.select.Elements elements17 = document6.getElementsByTag("multipart");
        org.jsoup.parser.ParseError[] parseErrorArray18 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList19 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19, parseErrorArray18);
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.noTracking();
        int int22 = parseErrorList19.indexOf((Object) parseErrorList21);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor23 = parseErrorList19.iterator();
        org.jsoup.parser.ParseError parseError25 = null;
        parseErrorList19.add(0, parseError25);
        int int27 = parseErrorList19.size();
        boolean boolean28 = elements17.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19);
        boolean boolean29 = parseErrorList0.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19);
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorItor2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(element15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(parseErrorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        String str7 = document1.title();
        String str8 = document1.className();
        StringBuilder stringBuilder9 = org.jsoup.internal.StringUtil.borrowBuilder();
        Appendable appendable10 = document1.html((Appendable) stringBuilder9);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(appendable10);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        document10.setBaseUri("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType17 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.nodes.Element element22 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType17, (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str25 = document24.className();
        String str26 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str29 = document28.id();
        String str30 = document28.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan32 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean33 = document28.is((org.jsoup.select.Evaluator) indexLessThan32);
        boolean boolean34 = isNthLastOfType17.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document28);
        String str35 = document28.cssSelector();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str38 = document37.className();
        String str39 = document37.outerHtml();
        boolean boolean41 = document37.hasSameValue((Object) 1);
        boolean boolean42 = indexLessThan14.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document37);
        org.jsoup.nodes.Element element43 = document10.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.parser.Tag tag44 = document10.tag();
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
        org.junit.Assert.assertNotNull(tag44);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.charset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.after("");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator(0);
        org.jsoup.select.Elements elements11 = elements3.remove();
        org.jsoup.select.Elements elements12 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements11);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingText("#text");
        org.jsoup.select.Elements elements10 = elements8.addClass("Content-Encoding");
        org.jsoup.select.Elements elements12 = elements10.before("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.select.Elements elements13 = elements12.nextAll();
        org.jsoup.select.Elements elements15 = elements13.after("multipart");
        org.jsoup.helper.W3CDom w3CDom17 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.className();
        String str22 = document19.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str23 = document19.normalName();
        org.w3c.dom.Document document24 = w3CDom17.fromJsoup(document19);
        boolean boolean26 = document19.is(":contains(content-encoding)");
        elements15.add((int) (byte) 0, (org.jsoup.nodes.Element) document19);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull("document24.getDocumentURI() == null", document24.getDocumentURI());
        org.junit.Assert.assertNull("document24.getInputEncoding() == null", document24.getInputEncoding());
        org.junit.Assert.assertNull("document24.getXmlEncoding() == null", document24.getXmlEncoding());
        org.junit.Assert.assertEquals(document24.getXmlVersion(), "1.0");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("", "<#root=\"\"></#root=\"\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.io.InputStream inputStream0 = null;
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request4 = httpConnection3.request();
        org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        boolean boolean9 = request7.hasHeader("multipart/form-data");
        boolean boolean11 = request7.hasCookie("#text");
        org.jsoup.parser.Parser parser12 = request7.parser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        org.jsoup.parser.ParseErrorList parseErrorList14 = parser12.getErrors();
        boolean boolean15 = parser12.isTrackErrors();
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response7 = response1.header("Content-Type", "application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response10 = response1.cookie("Content-Encoding", "SYSTEM");
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.className();
        String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str16 = document15.id();
        String str17 = document15.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        String str22 = document15.cssSelector();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str25 = document24.className();
        String str26 = document24.outerHtml();
        boolean boolean28 = document24.hasSameValue((Object) 1);
        boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Document.QuirksMode quirksMode30 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document31 = document24.quirksMode(quirksMode30);
        document24.updateMetaCharsetElement(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = document24.selectFirst("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query 'hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!': unexpected token at '! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method9 = request4.method();
        org.jsoup.Connection.Method method10 = request4.method();
        org.jsoup.Connection.Request request13 = request4.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection.Request request16 = request13.addHeader("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", "                                   ");
        String str18 = request13.header("");
        boolean boolean21 = request13.hasHeaderWithValue("amultipart", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        String str7 = document1.title();
        String str8 = document1.className();
        org.jsoup.select.Evaluator.Attribute attribute10 = new org.jsoup.select.Evaluator.Attribute("Content-Encoding");
        org.jsoup.parser.Tag tag12 = new org.jsoup.parser.Tag("#document");
        boolean boolean13 = tag12.isFormListed();
        boolean boolean14 = tag12.isBlock();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag12, "ultipart");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str19 = document18.id();
        String str20 = document18.baseUri();
        org.jsoup.nodes.Element element23 = document18.attr("", true);
        org.jsoup.select.Elements elements25 = document18.getElementsContainingText("#text");
        boolean boolean26 = attribute10.matches(element16, (org.jsoup.nodes.Element) document18);
        boolean boolean27 = document1.is((org.jsoup.select.Evaluator) attribute10);
        String str28 = document1.data();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response5 = response1.header("multipart/form-data", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType4 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        org.jsoup.nodes.Element element9 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType4, (org.jsoup.nodes.Element) document6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.className();
        String str13 = document11.outerHtml();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str16 = document15.id();
        String str17 = document15.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan19 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean20 = document15.is((org.jsoup.select.Evaluator) indexLessThan19);
        boolean boolean21 = isNthLastOfType4.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document15);
        String str22 = document15.cssSelector();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str25 = document24.className();
        String str26 = document24.outerHtml();
        boolean boolean28 = document24.hasSameValue((Object) 1);
        boolean boolean29 = indexLessThan1.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document24);
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection.KeyVal keyVal34 = keyVal32.inputStream(inputStream33);
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = keyVal32.value("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = keyVal32.key("[]");
        boolean boolean39 = document15.equals((Object) keyVal32);
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
        org.junit.Assert.assertNotNull(keyVal32);
        org.junit.Assert.assertNotNull(keyVal34);
        org.junit.Assert.assertNotNull(keyVal36);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.jsoup.parser.TokenQueue tokenQueue3 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean5 = tokenQueue3.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char6 = tokenQueue3.consume();
        char[] charArray7 = new char[] {};
        boolean boolean8 = tokenQueue3.matchesAny(charArray7);
        String str9 = characterReader1.consumeToAny(charArray7);
        org.jsoup.parser.CharacterReader characterReader11 = new org.jsoup.parser.CharacterReader("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.jsoup.parser.TokenQueue tokenQueue13 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean15 = tokenQueue13.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char16 = tokenQueue13.consume();
        char[] charArray17 = new char[] {};
        boolean boolean18 = tokenQueue13.matchesAny(charArray17);
        String str19 = characterReader11.consumeToAny(charArray17);
        String str20 = characterReader1.consumeToAny(charArray17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'm' + "'", char6 == 'm');
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str9, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + 'm' + "'", char16 == 'm');
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str19, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes14 = attributes0.clone();
        boolean boolean16 = attributes0.hasKey("*");
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element5 = document1.toggleClass("multipart");
        org.jsoup.nodes.Element element6 = document1.root();
        org.jsoup.nodes.Element element8 = document1.text(":gt(35)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jsoup.select.Evaluator.AllElements allElements0 = new org.jsoup.select.Evaluator.AllElements();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str6 = document5.className();
        String str7 = document5.outerHtml();
        boolean boolean9 = document5.hasSameValue((Object) 1);
        String str10 = document5.tagName();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element14 = document12.val("hi!");
        boolean boolean15 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document5, element14);
        org.jsoup.select.Elements elements16 = element14.nextElementSiblings();
        org.jsoup.nodes.Element element17 = null;
        boolean boolean18 = allElements0.matches(element14, element17);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str21 = document20.wholeText();
        org.jsoup.nodes.Document document22 = document20.clone();
        String str23 = document22.title();
        org.jsoup.nodes.Element element24 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) allElements0, (org.jsoup.nodes.Element) document22);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.select.Elements elements30 = elements28.prev("#text");
        String str31 = elements30.val();
        org.jsoup.select.Elements elements33 = elements30.addClass("Content-Encoding");
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str36 = document35.wholeText();
        org.jsoup.select.Elements elements37 = document35.parents();
        org.jsoup.nodes.Element element38 = document35.shallowClone();
        Object obj39 = null;
        boolean boolean40 = document35.hasSameValue(obj39);
        boolean boolean41 = elements30.equals((Object) document35);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType44 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str47 = document46.className();
        String str48 = document46.outerHtml();
        boolean boolean50 = document46.hasSameValue((Object) 1);
        String str51 = document46.tagName();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element55 = document53.val("hi!");
        boolean boolean56 = isNthLastOfType44.matches((org.jsoup.nodes.Element) document46, element55);
        String str57 = document46.wholeText();
        org.jsoup.nodes.Element element59 = document46.removeClass("#root=\"\"");
        org.jsoup.nodes.Element element60 = element59.clone();
        boolean boolean61 = allElements0.matches((org.jsoup.nodes.Element) document35, element59);
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
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str48, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#root" + "'", str51, "#root");
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        String str2 = textNode1.getWholeText();
        boolean boolean4 = textNode1.hasAttr("Content-Encoding=#declaration");
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType(":first-child", "<!#root!>", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", " hi!=\"multipart/form-data\"");
        String str5 = documentType4.baseUri();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        document10.setBaseUri("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan14 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType17 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.nodes.Element element22 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType17, (org.jsoup.nodes.Element) document19);
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str25 = document24.className();
        String str26 = document24.outerHtml();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str29 = document28.id();
        String str30 = document28.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan32 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean33 = document28.is((org.jsoup.select.Evaluator) indexLessThan32);
        boolean boolean34 = isNthLastOfType17.matches((org.jsoup.nodes.Element) document24, (org.jsoup.nodes.Element) document28);
        String str35 = document28.cssSelector();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str38 = document37.className();
        String str39 = document37.outerHtml();
        boolean boolean41 = document37.hasSameValue((Object) 1);
        boolean boolean42 = indexLessThan14.matches((org.jsoup.nodes.Element) document28, (org.jsoup.nodes.Element) document37);
        org.jsoup.nodes.Element element43 = document10.prependChild((org.jsoup.nodes.Node) document37);
        org.jsoup.nodes.Document document44 = element43.ownerDocument();
        boolean boolean45 = element43.hasParent();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class(":only-child");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute("#root", "#root");
        attribute2.setKey("[#declaration!=content-encoding]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.io.InputStream inputStream0 = null;
        org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#root=\"\"", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList4 = document3.childNodes();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList0.parallelStream();
        boolean boolean4 = parseErrorList0.contains((Object) "#text");
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = outputSettings0.escapeMode();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax5 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.syntax(syntax5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.base));
        org.junit.Assert.assertTrue("'" + syntax5 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax5.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        String str3 = dataNode2.getWholeData();
        org.jsoup.nodes.DataNode dataNode5 = dataNode2.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.DataNode dataNode7 = dataNode5.setWholeData("org.jsoup.HttpStatusException: multipart. Status=100, URL=application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(dataNode5);
        org.junit.Assert.assertNotNull(dataNode7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response6 = response4.charset("PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        org.jsoup.Connection.Response response7 = response4.charset("PUBLIC");
        org.jsoup.Connection.Response response9 = response4.removeHeader(":matchesOwn(null)");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request8 = httpConnection7.request();
        org.jsoup.Connection.Request request11 = request8.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap12 = request11.multiHeaders();
        java.util.Map<String, String> strMap13 = request11.cookies();
        org.jsoup.Connection connection14 = httpConnection0.headers(strMap13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection19 = httpConnection0.proxy(":containsData( )", (int) (byte) 1);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.listIterator();
        String str4 = parseErrorList1.toString();
        boolean boolean5 = parseErrorList1.isEmpty();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        org.jsoup.Connection connection15 = httpConnection13.sslSocketFactory(sSLSocketFactory14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        org.jsoup.Connection connection17 = httpConnection13.sslSocketFactory(sSLSocketFactory16);
        org.jsoup.Connection.Request request18 = httpConnection13.request();
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request20 = httpConnection19.request();
        org.jsoup.Connection.Request request23 = request20.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap24 = request23.multiHeaders();
        java.util.Map<String, String> strMap25 = request23.cookies();
        org.jsoup.Connection connection26 = httpConnection13.headers(strMap25);
        org.jsoup.Connection connection27 = httpConnection0.headers(strMap25);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        java.io.InputStream inputStream9 = null;
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream9, "", "#root", parser12);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser12);
        org.jsoup.Connection connection15 = connection6.parser(parser12);
        org.jsoup.Connection connection17 = connection15.ignoreContentType(false);
        java.net.Proxy proxy18 = null;
        org.jsoup.Connection connection19 = connection17.proxy(proxy18);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.util.Map<String, java.util.List<String>> strMap15 = request14.multiHeaders();
        java.util.Map<String, String> strMap16 = request14.cookies();
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
        java.util.Map<String, java.util.List<String>> strMap37 = request36.multiHeaders();
        java.util.Map<String, String> strMap38 = request36.cookies();
        org.jsoup.Connection connection39 = httpConnection26.headers(strMap38);
        java.io.InputStream inputStream42 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream45 = new org.jsoup.internal.ConstrainableInputStream(inputStream42, 1, (int) (byte) 0);
        org.jsoup.Connection connection46 = httpConnection26.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream45);
        org.jsoup.helper.HttpConnection.KeyVal keyVal47 = keyVal24.inputStream((java.io.InputStream) constrainableInputStream45);
        constrainableInputStream45.skipNBytes(0L);
        org.jsoup.Connection connection50 = httpConnection0.data("[:eq(-1)!=#doctype]", ":contains(content-encoding)", (java.io.InputStream) constrainableInputStream45);
        java.io.OutputStream outputStream51 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long52 = constrainableInputStream45.transferTo(outputStream51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (NullPointerException e) {
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.outline(false);
        boolean boolean4 = outputSettings3.outline();
        boolean boolean5 = outputSettings3.prettyPrint();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.nodes.Element element6 = document1.appendText("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        String str7 = document1.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str7, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.cookies();
        org.jsoup.Connection.Request request9 = request4.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#root");
        boolean boolean11 = request9.hasHeader("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.util.Map<String, java.util.List<String>> strMap15 = request14.multiHeaders();
        java.util.Map<String, String> strMap16 = request14.cookies();
        org.jsoup.Connection connection17 = httpConnection4.headers(strMap16);
        org.jsoup.Connection connection18 = httpConnection0.data(strMap16);
        org.jsoup.Connection connection20 = httpConnection0.referrer("#document");
        org.jsoup.Connection.Response response21 = null;
        org.jsoup.Connection connection22 = httpConnection0.response(response21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response24 = httpConnection23.response();
        String str25 = response24.statusMessage();
        String str26 = response24.statusMessage();
        org.jsoup.Connection.Method method27 = response24.method();
        String str28 = response24.charset();
        org.jsoup.Connection connection29 = connection22.response(response24);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray30 = response24.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response6 = response4.charset("PUBLIC");
        java.util.Map<String, String> strMap7 = response6.headers();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        String str2 = elements1.outerHtml();
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.noTracking();
        int int7 = parseErrorList4.indexOf((Object) parseErrorList6);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection8.sslSocketFactory(sSLSocketFactory9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection8.sslSocketFactory(sSLSocketFactory11);
        org.jsoup.Connection connection14 = httpConnection8.ignoreContentType(true);
        boolean boolean15 = parseErrorList4.equals((Object) true);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream16 = parseErrorList4.parallelStream();
        boolean boolean17 = elements1.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseErrorStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("SYSTEM", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str3 = keyVal2.value();
        String str4 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SYSTEM=<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str4, "SYSTEM=<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.simpleText();
        org.jsoup.safety.Cleaner cleaner1 = new org.jsoup.safety.Cleaner(whitelist0);
        String[] strArray11 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.in("", strArray11);
        String str15 = org.jsoup.internal.StringUtil.join(strArray11, " hi!=\"multipart/form-data\"");
        org.jsoup.helper.Validate.noNullElements((Object[]) strArray11, ":first-of-type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist18 = whitelist0.removeProtocols("/form-data", "#doctype", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot remove a protocol that is not set.");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str15, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str11 = document10.className();
        String str12 = document10.outerHtml();
        boolean boolean14 = document10.hasSameValue((Object) 1);
        String str15 = document10.tagName();
        org.jsoup.nodes.Element element16 = document10.head();
        org.jsoup.nodes.Document document19 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.nodes.Element element20 = document10.prependChild((org.jsoup.nodes.Node) document19);
        boolean boolean21 = tag1.equals((Object) document19);
        boolean boolean22 = tag1.isData();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}

