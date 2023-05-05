package org.jsoup.mytests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.jsoup.helper.Validate validate0 = new org.jsoup.helper.Validate();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        String str0 = org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "multipart/form-data" + "'", str0, "multipart/form-data");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.select.NodeFilter.FilterResult filterResult0 = org.jsoup.select.NodeFilter.FilterResult.STOP;
        org.junit.Assert.assertTrue("'" + filterResult0 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.STOP + "'", filterResult0.equals(org.jsoup.select.NodeFilter.FilterResult.STOP));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.select.Evaluator evaluator0 = null;
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements2 = org.jsoup.select.Selector.select(evaluator0, element1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.CDataNode cDataNode1 = new org.jsoup.nodes.CDataNode("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node2 = cDataNode1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        Object obj0 = new Object();
        org.jsoup.helper.Validate.notNull(obj0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        String str1 = org.jsoup.nodes.Entities.escape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        String str1 = org.jsoup.nodes.Entities.getByName("multipart/form-data");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal3 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node3 = document1.traverse(nodeVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = document1.child((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.net.URL uRL2 = request1.url();
        org.jsoup.Connection.KeyVal keyVal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request4 = request1.data(keyVal3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key val must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(uRL2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element[] elementArray2 = new org.jsoup.nodes.Element[] { document1 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList3 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList3, elementArray2);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            elementList3.replaceAll(elementUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elementArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request6 = request4.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request6 = request4.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        String str1 = org.jsoup.nodes.Entities.escape("multipart/form-data");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "multipart/form-data" + "'", str1, "multipart/form-data");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList0.replaceAll(parseErrorUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str6 = document5.id();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str9 = document8.wholeText();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str16 = document15.id();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str19 = document18.id();
        org.jsoup.select.Elements elements20 = document18.previousElementSiblings();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element24 = document22.val("hi!");
        org.jsoup.nodes.Element[] elementArray25 = new org.jsoup.nodes.Element[] { document1, document5, document8, element13, document15, document18, document22 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList26 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList26, elementArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element29 = elementList26.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 7");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elementArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsMatchingText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        String str1 = org.jsoup.internal.StringUtil.padding((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = org.jsoup.parser.Parser.parseFragment("", element1, "", parseErrorList3);
        parseErrorList3.clear();
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = connection4.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.Entities.EscapeMode escapeMode0 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
        org.junit.Assert.assertTrue("'" + escapeMode0 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.xhtml + "'", escapeMode0.equals(org.jsoup.nodes.Entities.EscapeMode.xhtml));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method5 = request1.method();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request7 = request1.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str3 = document1.outerHtml();
        java.util.regex.Pattern pattern4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText(pattern4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.Entities.EscapeMode escapeMode0 = org.jsoup.nodes.Entities.EscapeMode.base;
        org.junit.Assert.assertTrue("'" + escapeMode0 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.base + "'", escapeMode0.equals(org.jsoup.nodes.Entities.EscapeMode.base));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.select.NodeVisitor nodeVisitor0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        org.jsoup.select.Elements elements4 = document2.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        boolean boolean7 = elements4.equals((Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.traverse(nodeVisitor0, elements4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.select.NodeVisitor nodeVisitor0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        org.jsoup.select.Elements elements4 = document2.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements4.listIterator();
        boolean boolean7 = elements4.equals((Object) 1.0d);
        String str8 = elements4.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.traverse(nodeVisitor0, elements4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        parseErrorList1.ensureCapacity(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError6 = parseErrorList1.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((Object) 1);
        String str6 = document1.tagName();
        String str7 = document1.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        String str0 = org.jsoup.helper.HttpConnection.CONTENT_ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Content-Encoding" + "'", str0, "Content-Encoding");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.internal.StringUtil stringUtil0 = new org.jsoup.internal.StringUtil();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.Attribute attribute2 = org.jsoup.nodes.Attribute.createFromEncoded("hi!", "Content-Encoding");
        org.junit.Assert.assertNotNull(attribute2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.select.NodeFilter.FilterResult filterResult0 = org.jsoup.select.NodeFilter.FilterResult.CONTINUE;
        org.junit.Assert.assertTrue("'" + filterResult0 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.CONTINUE + "'", filterResult0.equals(org.jsoup.select.NodeFilter.FilterResult.CONTINUE));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(false, true);
        String str4 = parseSettings2.normalizeAttribute("multipart/form-data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data" + "'", str4, "multipart/form-data");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.internal.StringUtil.appendNormalisedWhitespace(stringBuilder0, "#root", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuilder.appendCodePoint(int)\" because \"accum\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream5 = response4.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.clearAttributes();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.nodes.TextNode textNode1 = new org.jsoup.nodes.TextNode("");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.PseudoTextElement pseudoTextElement3 = new org.jsoup.nodes.PseudoTextElement(tag0, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan5 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean6 = document1.is((org.jsoup.select.Evaluator) indexLessThan5);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        String str10 = textNode9.text();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document1.after((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor2 = parseErrorList0.iterator();
        java.util.Collection<org.jsoup.parser.ParseError> parseErrorCollection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = parseErrorList0.addAll(parseErrorCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.toArray()\" because \"c\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorItor2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList0.parallelStream();
        org.jsoup.parser.ParseError[] parseErrorArray4 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList5 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList5, parseErrorArray4);
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.noTracking();
        int int8 = parseErrorList5.indexOf((Object) parseErrorList7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = parseErrorList0.addAll(1, (java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertNotNull(parseErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.select.NodeVisitor nodeVisitor0 = null;
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.traverse(nodeVisitor0, (org.jsoup.nodes.Node) textNode2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.NodeVisitor.head(org.jsoup.nodes.Node, int)\" because \"visitor\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.isTrue(false, "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: #text");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        boolean boolean1 = org.jsoup.internal.StringUtil.isActuallyWhitespace((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.after((org.jsoup.nodes.Node) document6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(document6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = element7.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = elements3.select("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body>?  hi!? </body>?</html>': unexpected token at '<html>? <head></head>? <body>?  hi!? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        String str8 = request4.cookie("#root");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request10 = request4.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.fail("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: #text");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        String str6 = org.jsoup.internal.StringUtil.join((java.util.Collection) elements3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean8 = elements3.hasAttr("hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.htmlDefault;
        org.junit.Assert.assertNotNull(parseSettings0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = org.jsoup.parser.Parser.parseFragment("", element1, "", parseErrorList3);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = org.jsoup.parser.Parser.parseFragment("", element8, "", parseErrorList10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = parseErrorList3.addAll((int) '4', (java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = elements3.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
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
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response4.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = document1.dataNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.selectFirst("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>? <head></head>? <body>?  hi!? </body>?</html>': unexpected token at '<html>? <head></head>? <body>?  hi!? </body>?</html>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(dataNodeList5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeStarting attributeStarting1 = new org.jsoup.select.Evaluator.AttributeStarting("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response4.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        String str0 = org.jsoup.helper.HttpConnection.DEFAULT_UA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str0, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        attributes4.removeIgnoreCase("#document");
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection.KeyVal[] keyValArray6 = new org.jsoup.Connection.KeyVal[] {};
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList7 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList7, keyValArray6);
        org.jsoup.Connection connection9 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList7);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(keyValArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.safety.Whitelist whitelist2 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean3 = org.jsoup.Jsoup.isValid("hi!", whitelist2);
        org.jsoup.safety.Whitelist whitelist6 = whitelist2.removeEnforcedAttribute("Content-Encoding", "#root");
        String str7 = org.jsoup.Jsoup.clean("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", whitelist2);
        org.junit.Assert.assertNotNull(whitelist2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(whitelist6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str7, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        java.util.List<String> strList9 = elements3.eachAttr("multipart/form-data");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node4.after("#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements6 = elements3.empty();
        boolean boolean8 = elements3.hasAttr("Content-Encoding");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.select.QueryParser queryParser1 = new org.jsoup.select.QueryParser("");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.select.NodeFilter.FilterResult filterResult0 = org.jsoup.select.NodeFilter.FilterResult.SKIP_ENTIRELY;
        org.junit.Assert.assertTrue("'" + filterResult0 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.SKIP_ENTIRELY + "'", filterResult0.equals(org.jsoup.select.NodeFilter.FilterResult.SKIP_ENTIRELY));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((Object) 1);
        java.util.Set<String> strSet6 = document1.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("#text");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        String str1 = org.jsoup.nodes.Entities.getByName("#document");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("", "#root");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str2 = org.jsoup.nodes.Entities.escape("", outputSettings1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.nodes.Document$OutputSettings.escapeMode()\" because \"out\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect(uRL0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        String str1 = org.jsoup.internal.Normalizer.lowerCase("multipart/form-data");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "multipart/form-data" + "'", str1, "multipart/form-data");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        int int6 = request5.maxBodySize();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request8 = request5.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1048576 + "'", int6 == 1048576);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 0);
        Class<?> wildcardClass2 = indexLessThan1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = elements3.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        boolean boolean14 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        java.util.Collection<org.jsoup.parser.ParseError> parseErrorCollection15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = parseErrorList11.retainAll(parseErrorCollection15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.select.NodeFilter nodeFilter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = document7.filter(nodeFilter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element4 = document2.val("hi!");
        org.jsoup.nodes.Element element5 = document2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = org.jsoup.parser.Parser.parseFragment("multipart/form-data", element5, "");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        String str9 = request7.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = request7.hasHeaderWithValue("Content-Encoding", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("#text");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        boolean boolean1 = org.jsoup.nodes.Entities.isNamedEntity("#text");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        String str1 = org.jsoup.internal.Normalizer.normalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType7 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str10 = document9.id();
        org.jsoup.select.Elements elements11 = document9.previousElementSiblings();
        org.jsoup.nodes.Element element12 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType7, (org.jsoup.nodes.Element) document9);
        boolean boolean13 = document1.is((org.jsoup.select.Evaluator) isNthLastOfType7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document1.child(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "#root");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = connection6.data(keyValCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data collection must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        String str3 = textNode2.text();
        Class<?> wildcardClass4 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasCookie("#text");
        org.jsoup.parser.Parser parser9 = request4.parser();
        org.jsoup.Connection.Request request12 = request4.header("#text", "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = request4.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(request12);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.internal.Normalizer normalizer0 = new org.jsoup.internal.Normalizer();
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str3 = response1.header("Content-Encoding");
        String str4 = response1.contentType();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.preserveWhitespace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element4.tagName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tag name must not be empty.");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.select.Collector collector0 = new org.jsoup.select.Collector();
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Elements elements9 = document2.getElementsByIndexEquals((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.filter(nodeFilter0, elements9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap11 = request10.multiHeaders();
        java.util.Map<String, String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        org.jsoup.Connection connection16 = connection13.data("multipart/form-data", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = connection16.url("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!");
        } catch (IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.net.Proxy proxy2 = request1.proxy();
        String str3 = request1.requestBody();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request6 = request1.proxy("#document", 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:1048576");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        boolean boolean4 = tag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.select.NodeFilter.FilterResult filterResult0 = org.jsoup.select.NodeFilter.FilterResult.SKIP_CHILDREN;
        org.junit.Assert.assertTrue("'" + filterResult0 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.SKIP_CHILDREN + "'", filterResult0.equals(org.jsoup.select.NodeFilter.FilterResult.SKIP_CHILDREN));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            String str6 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        org.jsoup.nodes.TextNode textNode3 = textNode1.text("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertNotNull(textNode3);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        String[] strArray11 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("", strArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.data(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        String str4 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection9 = httpConnection0.data("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "Content-Encoding", inputStream7, "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.helper.Validate.isTrue(true, "#text");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("#doctype");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        Class<?> wildcardClass7 = attributes6.getClass();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.basicWithImages();
        String[] strArray4 = new String[] { "multipart/form-data" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist5 = whitelist0.addProtocols("", "hi!", strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.clearAttributes();
        org.jsoup.select.Elements elements7 = element4.getElementsByAttributeValueNot("hi!", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = element4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        String str2 = textNode1.nodeName();
        String str3 = textNode1.toString();
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#text" + "'", str2, "#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        String[] strArray9 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean10 = org.jsoup.internal.StringUtil.in("", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.data(strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document2);
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = elements8.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode4 = document1.quirksMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = document1.before("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + quirksMode4 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode4.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.timeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((-1));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList8.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList8.parallelStream();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements14.listIterator();
        org.jsoup.select.Elements elements17 = elements14.empty();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.select.Elements elements23 = elements21.prev("#text");
        boolean boolean24 = elements21.hasText();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements28.listIterator();
        org.jsoup.select.Elements elements31 = elements28.empty();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        boolean boolean38 = elements35.equals((Object) 1.0d);
        String str39 = elements35.text();
        org.jsoup.select.Elements elements41 = elements35.wrap("#root");
        org.jsoup.select.Elements[] elementsArray42 = new org.jsoup.select.Elements[] { elements14, elements21, elements28, elements41 };
        org.jsoup.select.Elements[] elementsArray43 = parseErrorList8.toArray(elementsArray42);
        int int44 = elements3.indexOf((Object) parseErrorList8);
        org.jsoup.nodes.Element element46 = null;
        org.jsoup.parser.ParseErrorList parseErrorList48 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = org.jsoup.parser.Parser.parseFragment("", element46, "", parseErrorList48);
        boolean boolean50 = parseErrorList48.isEmpty();
        int int51 = parseErrorList48.size();
        int int52 = parseErrorList8.lastIndexOf((Object) parseErrorList48);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parseErrorItor9);
        org.junit.Assert.assertNotNull(parseErrorStream10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertNotNull(elementItor16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertNotNull(elementItor30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elementItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elementsArray42);
        org.junit.Assert.assertNotNull(elementsArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(parseErrorList48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        String str2 = org.jsoup.parser.Parser.unescapeEntities("Content-Encoding", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Content-Encoding" + "'", str2, "Content-Encoding");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap11 = request10.multiHeaders();
        java.util.Map<String, String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.KeyVal[] keyValArray17 = new org.jsoup.Connection.KeyVal[] { keyVal16 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList18 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList18, keyValArray17);
        org.jsoup.Connection connection20 = connection13.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList18);
        org.jsoup.Connection connection23 = connection20.header("hi!", "");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyValArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal2 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap11 = request10.multiHeaders();
        java.util.Map<String, String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        java.io.InputStream inputStream16 = null;
        org.jsoup.Connection connection17 = connection13.data("#document", "hi!", inputStream16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = connection13.postDataCharset("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.select.NodeFilter nodeFilter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document7.filter(nodeFilter10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document2);
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream9 = elements8.stream();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementStream9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(true);
        Class<?> wildcardClass7 = connection6.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse("#document", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document7.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        String str2 = textNode1.nodeName();
        String str3 = textNode1.nodeName();
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#text" + "'", str2, "#text");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.nodes.Element element12 = document4.tagName("#root");
        String str13 = element12.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = element12.before("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        Object obj5 = null;
        boolean boolean6 = document1.hasSameValue(obj5);
        int int7 = document1.siblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor2 = elements1.listIterator();
        org.junit.Assert.assertNotNull(elementItor2);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList1.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.preserveCase;
        String str2 = parseSettings0.normalizeAttribute("#root");
        String str4 = parseSettings0.normalizeAttribute("multipart/form-data");
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data" + "'", str4, "multipart/form-data");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.jsoup.nodes.Attributes attributes16 = document4.attributes();
        attributes16.remove("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList1.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        String str2 = indexEquals1.toString();
        String str3 = indexEquals1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(-1)" + "'", str2, ":eq(-1)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":eq(-1)" + "'", str3, ":eq(-1)");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.className();
        org.jsoup.select.Elements elements37 = document33.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element38 = document24.appendChild((org.jsoup.nodes.Node) document33);
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
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean6 = elements5.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        boolean boolean9 = request7.hasCookie("multipart");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.helper.Validate.isTrue(true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request12 = httpConnection11.request();
        org.jsoup.Connection.Request request15 = request12.addHeader("multipart/form-data", "hi!");
        boolean boolean17 = request15.hasHeader("multipart/form-data");
        boolean boolean19 = request15.hasCookie("#text");
        org.jsoup.parser.Parser parser20 = request15.parser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse(inputStream8, "", "multipart/form-data", parser20);
        org.jsoup.nodes.Document document22 = document7.parser(parser20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = document22.wrap("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.nodes.Node.replaceChild(org.jsoup.nodes.Node, org.jsoup.nodes.Node)\" because \"this.parentNode\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.tagName("");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        String str4 = attributes0.toString();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream8 = elements7.stream();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementStream8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str3 = tokenQueue1.chompTo("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        String str5 = tokenQueue1.chompToIgnoreCase("#root=\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data" + "'", str3, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int0 = org.jsoup.parser.HtmlTreeBuilder.MaxScopeSearchDepth;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        String str8 = request4.cookie("#root");
        String str9 = request4.requestBody();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.nodes.Attributes attributes1 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute4 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes5 = attributes1.put(attribute4);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.id();
        org.jsoup.select.Elements elements9 = document7.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements9.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements9.listIterator();
        org.jsoup.select.Elements elements12 = elements9.empty();
        boolean boolean13 = attributes5.equals((Object) elements9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeTraversor.filter(nodeFilter0, elements9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attribute4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements3.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str6 = document5.wholeText();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str9 = document8.className();
        boolean boolean10 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document5, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document11 = document5.clone();
        org.jsoup.nodes.Element element13 = document5.tagName("#root");
        String str14 = element13.tagName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeFilter.FilterResult filterResult15 = org.jsoup.select.NodeTraversor.filter(nodeFilter0, (org.jsoup.nodes.Node) element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.NodeFilter.head(org.jsoup.nodes.Node, int)\" because \"filter\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        parseErrorList1.ensureCapacity(10);
        parseErrorList1.ensureCapacity(100);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList1.iterator();
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList1.replaceAll(parseErrorUnaryOperator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        boolean boolean14 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        String str15 = elements3.toString();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request17 = httpConnection16.request();
        org.jsoup.Connection connection19 = httpConnection16.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        org.jsoup.Connection connection22 = httpConnection20.sslSocketFactory(sSLSocketFactory21);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = null;
        org.jsoup.Connection connection24 = httpConnection20.sslSocketFactory(sSLSocketFactory23);
        org.jsoup.Connection.Request request25 = httpConnection20.request();
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request27 = httpConnection26.request();
        org.jsoup.Connection.Request request30 = request27.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap31 = request30.multiHeaders();
        java.util.Map<String, String> strMap32 = request30.cookies();
        org.jsoup.Connection connection33 = httpConnection20.headers(strMap32);
        org.jsoup.Connection connection34 = httpConnection16.data(strMap32);
        boolean boolean35 = elements3.equals((Object) connection34);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str11 = document10.className();
        String str12 = document10.outerHtml();
        boolean boolean14 = document10.hasSameValue((Object) 1);
        String str15 = document10.tagName();
        // The following exception was thrown during execution in test generation
        try {
            elements3.add(1, (org.jsoup.nodes.Element) document10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#root" + "'", str15, "#root");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.proxy("multipart", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.helper.Validate.isFalse(false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str3 = document1.outerHtml();
        org.jsoup.nodes.Element element5 = document1.createElement("#root");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection5 = connection2.data("#root=\"\"", " hi!=\"multipart/form-data\"");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "multipart/form-data", false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.clearAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.url("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        org.jsoup.Connection.Request request19 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request21 = request19.postDataCharset(" hi!=\"multipart/form-data\"");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message:  hi!=\"multipart/form-data\"");
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
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan6 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType9 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        org.jsoup.nodes.Element element14 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType9, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str17 = document16.className();
        String str18 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str21 = document20.id();
        String str22 = document20.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan24 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean25 = document20.is((org.jsoup.select.Evaluator) indexLessThan24);
        boolean boolean26 = isNthLastOfType9.matches((org.jsoup.nodes.Element) document16, (org.jsoup.nodes.Element) document20);
        String str27 = document20.cssSelector();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str30 = document29.className();
        String str31 = document29.outerHtml();
        boolean boolean33 = document29.hasSameValue((Object) 1);
        boolean boolean34 = indexLessThan6.matches((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document29);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType37 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str40 = document39.id();
        org.jsoup.select.Elements elements41 = document39.previousElementSiblings();
        org.jsoup.nodes.Element element42 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType37, (org.jsoup.nodes.Element) document39);
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str45 = document44.className();
        String str46 = document44.outerHtml();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str49 = document48.id();
        String str50 = document48.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan52 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean53 = document48.is((org.jsoup.select.Evaluator) indexLessThan52);
        boolean boolean54 = isNthLastOfType37.matches((org.jsoup.nodes.Element) document44, (org.jsoup.nodes.Element) document48);
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parse("", "#doctype");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType60 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str63 = document62.className();
        String str64 = document62.outerHtml();
        boolean boolean66 = document62.hasSameValue((Object) 1);
        String str67 = document62.tagName();
        org.jsoup.nodes.Document document69 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element71 = document69.val("hi!");
        boolean boolean72 = isNthLastOfType60.matches((org.jsoup.nodes.Element) document62, element71);
        org.jsoup.nodes.Document document74 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str75 = document74.id();
        String str76 = document74.baseUri();
        org.jsoup.nodes.Element element79 = document74.attr("", true);
        org.jsoup.nodes.Node node82 = document74.attr("#text", "");
        org.jsoup.nodes.Element[] elementArray83 = new org.jsoup.nodes.Element[] { element4, document29, document48, document57, element71, document74 };
        java.util.ArrayList<org.jsoup.nodes.Element> elementList84 = new java.util.ArrayList<org.jsoup.nodes.Element>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList84, elementArray83);
        org.jsoup.select.Elements elements86 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elementList84);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
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
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNull(element42);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str46, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str64, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "#root" + "'", str67, "#root");
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(elementArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.clearAttributes();
        String str5 = element4.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = connection20.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection8 = httpConnection0.data("#document", "hi!", inputStream7);
        org.jsoup.Connection connection10 = httpConnection0.maxBodySize(1);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str3 = document1.outerHtml();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("multipart/form-data");
        org.jsoup.select.NodeFilter nodeFilter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = elements5.filter(nodeFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        org.jsoup.Connection.KeyVal keyVal12 = connection10.data("#document");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements5.val();
        org.jsoup.select.Elements elements7 = elements5.nextAll();
        org.jsoup.select.Elements elements8 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements7);
        String str9 = elements7.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        Object obj2 = parseErrorList0.clone();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = elements6.last();
        boolean boolean8 = parseErrorList0.equals((Object) element7);
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        java.util.regex.Pattern pattern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements4 = document1.getElementsMatchingText(pattern3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = document1.before(" hi!=\"multipart/form-data\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        String str1 = org.jsoup.internal.StringUtil.padding((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.jsoup.Connection connection15 = httpConnection0.data("#root", "Content-Encoding");
        org.jsoup.Connection connection18 = connection15.cookie(" hi!=\"multipart/form-data\"", ":first-of-type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + method11 + "' != '" + org.jsoup.Connection.Method.GET + "'", method11.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        String str1 = org.jsoup.nodes.Entities.getByName("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.examples.ListLinks listLinks0 = new org.jsoup.examples.ListLinks();
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, "multipart/form-data", "#document");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.wholeText();
        org.jsoup.select.Elements elements35 = document33.parents();
        org.jsoup.nodes.Element element36 = document33.shallowClone();
        Object obj37 = null;
        boolean boolean38 = document33.hasSameValue(obj37);
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str41 = document40.id();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str44 = document43.id();
        String str45 = document43.baseUri();
        org.jsoup.nodes.Element element48 = document43.attr("", true);
        org.jsoup.nodes.Node node51 = document43.attr("#text", "");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan53 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType56 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str59 = document58.id();
        org.jsoup.select.Elements elements60 = document58.previousElementSiblings();
        org.jsoup.nodes.Element element61 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType56, (org.jsoup.nodes.Element) document58);
        org.jsoup.nodes.Document document63 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str64 = document63.className();
        String str65 = document63.outerHtml();
        org.jsoup.nodes.Document document67 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str68 = document67.id();
        String str69 = document67.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan71 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean72 = document67.is((org.jsoup.select.Evaluator) indexLessThan71);
        boolean boolean73 = isNthLastOfType56.matches((org.jsoup.nodes.Element) document63, (org.jsoup.nodes.Element) document67);
        String str74 = document67.cssSelector();
        org.jsoup.nodes.Document document76 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str77 = document76.className();
        String str78 = document76.outerHtml();
        boolean boolean80 = document76.hasSameValue((Object) 1);
        boolean boolean81 = indexLessThan53.matches((org.jsoup.nodes.Element) document67, (org.jsoup.nodes.Element) document76);
        org.jsoup.nodes.Document.QuirksMode quirksMode82 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document83 = document76.quirksMode(quirksMode82);
        org.jsoup.nodes.Element[] elementArray84 = new org.jsoup.nodes.Element[] { document24, document33, document40, document43, document83 };
        org.jsoup.select.Elements elements85 = new org.jsoup.select.Elements(elementArray84);
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
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNull(element61);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str65, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "#root" + "'", str74, "#root");
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str78, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + quirksMode82 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode82.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        org.junit.Assert.assertNotNull(document83);
        org.junit.Assert.assertNotNull(elementArray84);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList8.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList8.parallelStream();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements14.listIterator();
        org.jsoup.select.Elements elements17 = elements14.empty();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.select.Elements elements23 = elements21.prev("#text");
        boolean boolean24 = elements21.hasText();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements28.listIterator();
        org.jsoup.select.Elements elements31 = elements28.empty();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        boolean boolean38 = elements35.equals((Object) 1.0d);
        String str39 = elements35.text();
        org.jsoup.select.Elements elements41 = elements35.wrap("#root");
        org.jsoup.select.Elements[] elementsArray42 = new org.jsoup.select.Elements[] { elements14, elements21, elements28, elements41 };
        org.jsoup.select.Elements[] elementsArray43 = parseErrorList8.toArray(elementsArray42);
        int int44 = elements3.indexOf((Object) parseErrorList8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor46 = parseErrorList8.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parseErrorItor9);
        org.junit.Assert.assertNotNull(parseErrorStream10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertNotNull(elementItor16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertNotNull(elementItor30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elementItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elementsArray42);
        org.junit.Assert.assertNotNull(elementsArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" hi!=\"multipart/form-data\"", "Content-Encoding");
        boolean boolean3 = document2.isBlock();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) ' ');
        String str9 = document1.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#document" + "'", str9, "#document");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: Content-Encoding");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str3 = document1.outerHtml();
        org.jsoup.select.Elements elements5 = document1.getElementsMatchingOwnText("multipart/form-data");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements7 = elements5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        String str2 = org.jsoup.parser.Parser.unescapeEntities("#declaration", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#declaration" + "'", str2, "#declaration");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("hi!", "#text", "#root", "#document");
        String str5 = documentType4.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        boolean boolean4 = document1.hasParent();
        org.jsoup.nodes.Document.QuirksMode quirksMode5 = document1.quirksMode();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + quirksMode5 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode5.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.io.InputStream inputStream3 = null;
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key(":eq(-1)");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal8 = keyVal6.contentType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        String str0 = org.jsoup.helper.HttpConnection.FORM_URL_ENCODED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/x-www-form-urlencoded" + "'", str0, "application/x-www-form-urlencoded");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        String str1 = isOnlyChild0.toString();
        String str2 = isOnlyChild0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-child" + "'", str1, ":only-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":only-child" + "'", str2, ":only-child");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor2 = parseErrorList0.iterator();
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList0.replaceAll(parseErrorUnaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorItor2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response1 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.after("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList11 = elements8.subList((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 100");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements3.text();
        boolean boolean8 = elements3.hasAttr("#declaration");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        String str7 = document1.title();
        org.jsoup.nodes.Element element8 = document1.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements5.val();
        org.jsoup.select.Elements elements8 = elements5.addClass("Content-Encoding");
        String str9 = elements8.val();
        int int10 = elements8.size();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan1 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) -1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection5 = httpConnection0.url("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: hi!<html>? <head></head>? <body>?  hi!? </body>?</html>hi!<html>? <head></head>? <body>?  hi!? </body>?</html><html>? <head></head>? <body>?  hi!? </body>?</html>multipart/form-data<html>? <head></head>? <body>?  hi!? </body>?</html>hi!");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.jsoup.select.NodeFilter nodeFilter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = document15.filter(nodeFilter30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
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
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        String str1 = org.jsoup.internal.StringUtil.padding((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = request5.sslSocketFactory();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = org.jsoup.parser.Parser.parseXmlFragment("multipart/form-data", "#doctype");
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        boolean boolean1 = org.jsoup.parser.Tag.isKnownTag(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("#document", "#root=\"\"", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements6 = elements3.empty();
        boolean boolean7 = elements3.hasText();
        String str8 = elements3.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.io.InputStream inputStream3 = null;
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key(":eq(-1)");
        java.io.InputStream inputStream7 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream10 = new org.jsoup.internal.ConstrainableInputStream(inputStream7, 1, (int) (byte) 0);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.inputStream((java.io.InputStream) constrainableInputStream10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = constrainableInputStream10.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.helper.Validate.notEmpty(" hi!=\"multipart/form-data\"");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        int int16 = document4.siblingIndex();
        java.nio.charset.Charset charset17 = null;
        // The following exception was thrown during execution in test generation
        try {
            document4.charset(charset17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.displayName()\" because the return value of \"org.jsoup.nodes.Document.charset()\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document2);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.className();
        String str13 = document11.outerHtml();
        boolean boolean15 = document11.hasSameValue((Object) 1);
        String str16 = document11.tagName();
        int int17 = document11.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element18 = elements8.set(0, (org.jsoup.nodes.Element) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str13, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        boolean boolean14 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parseErrorList11.subList((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.Connection.Method method0 = org.jsoup.Connection.Method.TRACE;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + org.jsoup.Connection.Method.TRACE + "'", method0.equals(org.jsoup.Connection.Method.TRACE));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        String str7 = elements3.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str8 = elements3.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList1.listIterator();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorItor13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse(" hi!=\"multipart/form-data\"", "Content-Encoding");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType5 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.id();
        org.jsoup.select.Elements elements9 = document7.previousElementSiblings();
        org.jsoup.nodes.Element element10 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType5, (org.jsoup.nodes.Element) document7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document2.before((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.Jsoup jsoup0 = new org.jsoup.Jsoup();
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes2);
        String str4 = attribute3.getValue();
        String str6 = attribute3.setValue("#root");
        String str7 = attribute3.getKey();
        String str8 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Encoding=\"#root\"" + "'", str8, "Content-Encoding=\"#root\"");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(file0, "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"in\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        String str2 = org.jsoup.internal.StringUtil.resolve("", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        boolean boolean11 = request9.hasHeader("multipart/form-data");
        boolean boolean13 = request9.hasCookie("#text");
        org.jsoup.parser.Parser parser14 = request9.parser();
        org.jsoup.nodes.Document document15 = document1.parser(parser14);
        boolean boolean16 = document15.updateMetaCharsetElement();
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
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.nodes.Node node1 = null;
        org.jsoup.select.NodeFilter.FilterResult filterResult2 = org.jsoup.select.NodeTraversor.filter(nodeFilter0, node1);
        org.junit.Assert.assertTrue("'" + filterResult2 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.CONTINUE + "'", filterResult2.equals(org.jsoup.select.NodeFilter.FilterResult.CONTINUE));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        String str3 = dataNode2.getWholeData();
        org.jsoup.nodes.DataNode dataNode5 = dataNode2.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str6 = dataNode2.getWholeData();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(dataNode5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((Object) 1);
        String str6 = document1.tagName();
        org.jsoup.nodes.Element element7 = document1.head();
        String str8 = document1.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList1.iterator();
        org.jsoup.parser.ParseError parseError7 = null;
        parseErrorList1.add(0, parseError7);
        Object obj9 = parseErrorList1.clone();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[null]");
        org.junit.Assert.assertEquals(String.valueOf(obj9), "[null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[null]");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        String str0 = org.jsoup.nodes.DocumentType.PUBLIC_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PUBLIC" + "'", str0, "PUBLIC");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.parser.TreeBuilder treeBuilder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Parser parser9 = parser5.setTreeBuilder(treeBuilder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"parser\" because \"treeBuilder\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        String str1 = org.jsoup.parser.TokenQueue.unescape("#root");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#root" + "'", str1, "#root");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan5 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean6 = document1.is((org.jsoup.select.Evaluator) indexLessThan5);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType9 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        org.jsoup.nodes.Element element14 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType9, (org.jsoup.nodes.Element) document11);
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
        boolean boolean35 = indexLessThan5.matches(element14, (org.jsoup.nodes.Element) document28);
        String str36 = indexLessThan5.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ":lt(52)" + "'", str36, ":lt(52)");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.headers();
        java.net.Proxy proxy7 = request4.proxy();
        boolean boolean10 = request4.hasHeaderWithValue("#doctype", "#root");
        // The following exception was thrown during execution in test generation
        try {
            String str12 = request4.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        String str1 = org.jsoup.parser.TokenQueue.unescape(":only-child");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":only-child" + "'", str1, ":only-child");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "multipart/form-data");
        String str3 = attributeWithValue2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]" + "'", str3, "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        String[] strArray11 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean12 = org.jsoup.internal.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.internal.StringUtil.in("", strArray11);
        String str15 = org.jsoup.internal.StringUtil.join(strArray11, " hi!=\"multipart/form-data\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.data(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str15, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.parser.ParseError[] parseErrorArray8 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList9 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9, parseErrorArray8);
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        int int12 = parseErrorList9.indexOf((Object) parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList9.iterator();
        boolean boolean14 = elements5.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9);
        elements5.ensureCapacity((int) (short) 1);
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
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean4 = tokenQueue1.consumeWhitespace();
        String str6 = tokenQueue1.chompTo("#text");
        String str7 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart/form-data" + "'", str6, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        org.jsoup.nodes.TextNode textNode4 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node6 = textNode4.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node8 = textNode4.removeAttr("#document");
        int int9 = parseErrorList0.lastIndexOf((Object) node8);
        org.jsoup.nodes.Entities entities10 = new org.jsoup.nodes.Entities();
        boolean boolean11 = parseErrorList0.remove((Object) entities10);
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap10 = request9.multiHeaders();
        java.util.Map<String, String> strMap11 = request9.headers();
        java.net.Proxy proxy12 = request9.proxy();
        org.jsoup.Connection connection13 = httpConnection0.request(request9);
        java.util.Map<String, java.util.List<String>> strMap14 = request9.multiHeaders();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.parser.ParseError[] parseErrorArray8 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList9 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9, parseErrorArray8);
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        int int12 = parseErrorList9.indexOf((Object) parseErrorList11);
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
        boolean boolean30 = parseErrorList9.remove((Object) request29);
        boolean boolean33 = request29.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", " hi!=\"multipart/form-data\"");
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
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element5 = element3.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.selectFirst(":eq(-1)");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Index must be numeric");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("PUBLIC");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = org.jsoup.parser.Parser.parseFragment("", element1, "", parseErrorList3);
        Object obj5 = parseErrorList3.clone();
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        String str0 = org.jsoup.nodes.DocumentType.SYSTEM_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SYSTEM" + "'", str0, "SYSTEM");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.select.Elements elements9 = elements7.tagName("Content-Encoding");
        org.jsoup.nodes.Element element10 = elements7.first();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        String str3 = dataNode2.getWholeData();
        String str5 = dataNode2.attr("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan5 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean6 = document1.is((org.jsoup.select.Evaluator) indexLessThan5);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType9 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        org.jsoup.nodes.Element element14 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType9, (org.jsoup.nodes.Element) document11);
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
        boolean boolean35 = indexLessThan5.matches(element14, (org.jsoup.nodes.Element) document28);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = element14.clearAttributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNull(element14);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.io.InputStream inputStream3 = null;
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key(":eq(-1)");
        java.io.InputStream inputStream7 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream10 = new org.jsoup.internal.ConstrainableInputStream(inputStream7, 1, (int) (byte) 0);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.inputStream((java.io.InputStream) constrainableInputStream10);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = constrainableInputStream10.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 1, -1, 100, -1]");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(":contains(content-encoding)", ":only-child");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        String str7 = request4.header("");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = org.jsoup.parser.Parser.parseXmlFragment("SYSTEM", "#text");
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.jsoup.Connection connection16 = httpConnection0.requestBody("PUBLIC");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType7 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str10 = document9.id();
        org.jsoup.select.Elements elements11 = document9.previousElementSiblings();
        org.jsoup.nodes.Element element12 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType7, (org.jsoup.nodes.Element) document9);
        boolean boolean13 = document1.is((org.jsoup.select.Evaluator) isNthLastOfType7);
        String str14 = isNthLastOfType7.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ":nth-last-of-type(100n-1)" + "'", str14, ":nth-last-of-type(100n-1)");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.jsoup.select.Elements elements33 = document24.getElementsMatchingOwnText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str36 = document35.id();
        org.jsoup.select.Elements elements37 = document35.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor38 = elements37.listIterator();
        boolean boolean40 = elements37.equals((Object) 1.0d);
        String str41 = elements37.text();
        org.jsoup.select.Elements elements43 = elements37.wrap("#root");
        org.jsoup.select.Elements elements45 = elements43.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements47 = elements43.html("#text");
        boolean boolean48 = elements33.contains((Object) elements43);
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        String str4 = tokenQueue1.consumeWord();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume(":eq(-1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart" + "'", str4, "multipart");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        org.jsoup.Connection.Request request13 = request4.cookie("#document", "#document");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Request request17 = request4.data((org.jsoup.Connection.KeyVal) keyVal16);
        String str18 = keyVal16.key();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#root" + "'", str18, "#root");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.select.Selector selector0 = new org.jsoup.select.Selector();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            constrainableInputStream3.skipNBytes((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.root();
        String str5 = textNode2.absUrl("#declaration");
        boolean boolean7 = textNode2.hasAttr("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        boolean boolean14 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        String str15 = elements3.toString();
        org.jsoup.select.Elements elements16 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements3);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.helper.DataUtil.load(inputStream0, ":eq(-1)", "Content-Encoding", parser6);
        String str8 = document7.val();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.headers();
        boolean boolean8 = request4.hasHeader("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean2 = org.jsoup.Jsoup.isValid("hi!", whitelist1);
        String[] strArray12 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist15 = whitelist1.addProtocols("                                   ", "", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        String str4 = tokenQueue1.toString();
        String str5 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data" + "'", str4, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart" + "'", str5, "multipart");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element5 = document1.toggleClass("multipart");
        org.jsoup.select.Elements elements6 = document1.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = org.jsoup.helper.DataUtil.load((java.io.InputStream) constrainableInputStream3, "SYSTEM", " ", parser9);
            org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: Read timeout");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap10 = request9.multiHeaders();
        java.util.Map<String, String> strMap11 = request9.headers();
        java.net.Proxy proxy12 = request9.proxy();
        org.jsoup.Connection connection13 = httpConnection0.request(request9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = request9.hasHeaderWithValue("#root", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        String str1 = org.jsoup.parser.TokenQueue.unescape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            constrainableInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resetting to invalid mark");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document8 = document1.parser(parser7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser7.settings();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        String str3 = tag1.toString();
        String str4 = tag1.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean2 = org.jsoup.Jsoup.isValid("hi!", whitelist1);
        org.jsoup.safety.Whitelist whitelist5 = whitelist1.removeEnforcedAttribute("Content-Encoding", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist8 = whitelist1.removeEnforcedAttribute("", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(whitelist5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request8 = request4.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#root=\"\"", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        String str2 = textNode1.nodeName();
        boolean boolean3 = textNode1.isBlank();
        String str4 = textNode1.text();
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#text" + "'", str2, "#text");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        String str5 = tokenQueue1.chompTo("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str6 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.text("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = element6.before(":contains(content-encoding)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            String str5 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        String[] strArray8 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("", strArray8);
        String str12 = org.jsoup.internal.StringUtil.join(strArray8, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean13 = org.jsoup.internal.StringUtil.in("#root", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!" + "'", str12, "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements8.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.cookies();
        org.jsoup.Connection.Request request9 = request4.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#root");
        String str10 = request9.requestBody();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request12 = request9.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.io.InputStream inputStream37 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream40 = new org.jsoup.internal.ConstrainableInputStream(inputStream37, 1, (int) (byte) 0);
        org.jsoup.Connection connection41 = httpConnection21.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream40);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection42 = httpConnection0.data("", "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Data key must not be empty");
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
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection41);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = attributes0.clone();
        attributes1.remove("#root");
        boolean boolean4 = attributes1.isEmpty();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection11 = httpConnection0.header("#text", "#text");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        String str22 = document13.tagName();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#root" + "'", str22, "#root");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings2 = outputSettings0.charset(":contains(content-encoding)");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: :contains(content-encoding)");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType32 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str35 = document34.wholeText();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str38 = document37.className();
        boolean boolean39 = isNthLastOfType32.matches((org.jsoup.nodes.Element) document34, (org.jsoup.nodes.Element) document37);
        org.jsoup.nodes.Document document40 = document34.clone();
        String str41 = document34.title();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str44 = document43.id();
        String str45 = document43.baseUri();
        org.jsoup.nodes.Element element48 = document43.attr("", true);
        org.jsoup.nodes.Node node51 = document43.attr("#text", "");
        org.jsoup.nodes.Document.QuirksMode quirksMode52 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document53 = document43.quirksMode(quirksMode52);
        boolean boolean54 = indexLessThan1.matches((org.jsoup.nodes.Element) document34, (org.jsoup.nodes.Element) document43);
        org.jsoup.nodes.Document document56 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str57 = document56.className();
        String str58 = document56.outerHtml();
        boolean boolean60 = document56.hasSameValue((Object) 1);
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str63 = document62.className();
        String str65 = document62.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str66 = document62.normalName();
        String str67 = document62.html();
        boolean boolean68 = indexLessThan1.matches((org.jsoup.nodes.Element) document56, (org.jsoup.nodes.Element) document62);
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
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + quirksMode52 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode52.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str58, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "#root" + "'", str66, "#root");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str67, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) '#');
        String str2 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(35)" + "'", str2, ":gt(35)");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Elements elements8 = org.jsoup.select.Selector.select("#document", (org.jsoup.nodes.Element) document2);
        boolean boolean9 = elements8.hasText();
        org.jsoup.nodes.Element element10 = elements8.first();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        String str1 = isFirstOfType0.toString();
        String str2 = isFirstOfType0.toString();
        String str3 = isFirstOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-of-type" + "'", str1, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-of-type" + "'", str2, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":first-of-type" + "'", str3, ":first-of-type");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.select.Evaluator.IsFirstChild isFirstChild0 = new org.jsoup.select.Evaluator.IsFirstChild();
        String str1 = isFirstChild0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        org.jsoup.Connection connection17 = httpConnection0.cookie("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = request4.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.DocumentType documentType5 = new org.jsoup.nodes.DocumentType("multipart", ":last-of-type", "multipart", "application/x-www-form-urlencoded", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        String str4 = xmlDeclaration3.getWholeDeclaration();
        String str5 = xmlDeclaration3.nodeName();
        String str6 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.canContainBlock();
        String str4 = tag1.normalName();
        boolean boolean5 = tag1.isData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.root();
        String str5 = textNode2.absUrl("#declaration");
        boolean boolean6 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements5.val();
        org.jsoup.select.Elements elements7 = elements5.nextAll();
        org.jsoup.select.Elements elements9 = elements7.select("SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = elements7.prevAll("                                   ");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '                                   ': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        String str5 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        String str3 = dataNode2.getWholeData();
        org.jsoup.nodes.DataNode dataNode5 = dataNode2.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        int int6 = dataNode5.childNodeSize();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(dataNode5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = attributes0.clone();
        boolean boolean3 = attributes0.hasKeyIgnoreCase("#doctype");
        org.jsoup.nodes.Attributes attributes6 = attributes0.put("hi!", false);
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.select.Elements elements2 = document1.getAllElements();
        String str3 = elements2.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>" + "'", str3, "<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.after("");
        java.util.List<String> strList9 = elements8.eachText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.helper.Validate.isTrue(true, "hi!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        boolean boolean6 = textNode2.hasAttr(":first-of-type");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        String str0 = org.jsoup.helper.HttpConnection.CONTENT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Content-Type" + "'", str0, "Content-Type");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.helper.Validate.notEmpty("#document");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.Element element1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = org.jsoup.parser.Parser.parseFragment("", element1, "", parseErrorList3);
        boolean boolean5 = parseErrorList3.isEmpty();
        int int6 = parseErrorList3.size();
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor8 = parseErrorList7.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream9 = parseErrorList7.parallelStream();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor14 = elements13.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements13.listIterator();
        org.jsoup.select.Elements elements16 = elements13.empty();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str19 = document18.id();
        org.jsoup.select.Elements elements20 = document18.previousElementSiblings();
        org.jsoup.select.Elements elements22 = elements20.prev("#text");
        boolean boolean23 = elements20.hasText();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str26 = document25.id();
        org.jsoup.select.Elements elements27 = document25.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor28 = elements27.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements27.listIterator();
        org.jsoup.select.Elements elements30 = elements27.empty();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str33 = document32.id();
        org.jsoup.select.Elements elements34 = document32.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor35 = elements34.listIterator();
        boolean boolean37 = elements34.equals((Object) 1.0d);
        String str38 = elements34.text();
        org.jsoup.select.Elements elements40 = elements34.wrap("#root");
        org.jsoup.select.Elements[] elementsArray41 = new org.jsoup.select.Elements[] { elements13, elements20, elements27, elements40 };
        org.jsoup.select.Elements[] elementsArray42 = parseErrorList7.toArray(elementsArray41);
        boolean boolean43 = parseErrorList3.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
        org.jsoup.parser.ParseError parseError45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError46 = parseErrorList3.set((int) (byte) 0, parseError45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertNotNull(parseErrorItor8);
        org.junit.Assert.assertNotNull(parseErrorStream9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementItor14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elementItor28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elementItor35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(elementsArray41);
        org.junit.Assert.assertNotNull(elementsArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.jsoup.select.Elements elements21 = document9.getElementsMatchingOwnText("multipart/form-data");
        org.jsoup.select.Elements elements23 = elements21.eq((int) (short) 1);
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
        org.junit.Assert.assertNotNull(elements23);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        char char3 = tokenQueue1.consume();
        tokenQueue1.advance();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'm' + "'", char3 == 'm');
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        String str3 = dataNode2.getWholeData();
        org.jsoup.nodes.DataNode dataNode5 = dataNode2.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.DataNode dataNode7 = dataNode2.setWholeData("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.DataNode dataNode9 = dataNode2.setWholeData("#document");
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(dataNode5);
        org.junit.Assert.assertNotNull(dataNode7);
        org.junit.Assert.assertNotNull(dataNode9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        java.io.InputStream inputStream11 = null;
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse(inputStream11, "", "#root", parser14);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser14);
        java.io.InputStream inputStream17 = null;
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request21 = httpConnection20.request();
        org.jsoup.Connection.Request request24 = request21.addHeader("multipart/form-data", "hi!");
        boolean boolean26 = request24.hasHeader("multipart/form-data");
        boolean boolean28 = request24.hasCookie("#text");
        org.jsoup.parser.Parser parser29 = request24.parser();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse(inputStream17, "", "multipart/form-data", parser29);
        org.jsoup.nodes.Document document31 = document16.parser(parser29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse((java.io.InputStream) constrainableInputStream3, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!", ":lt(52)", parser29);
            org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: Read timeout");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document31);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element5 = element3.html("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = element5.before(":gt(35)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document1.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        String str2 = org.jsoup.parser.Parser.unescapeEntities(":first-child", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":first-child" + "'", str2, ":first-child");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        String str3 = tokenQueue1.remainder();
        boolean boolean4 = tokenQueue1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data" + "'", str3, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal Capacity: -1");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method9 = request4.method();
        org.jsoup.Connection.Method method10 = request4.method();
        boolean boolean11 = request4.ignoreHttpErrors();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        org.jsoup.select.Elements elements4 = elements1.attr(":eq(-1)", "[]");
        org.jsoup.select.Elements elements6 = elements1.tagName("Content-Encoding=\"#root\"");
        org.jsoup.select.Elements elements7 = elements6.prev();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.helper.Validate.notEmpty("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", "Content-Type");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#root", "#root", true);
        String str4 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!#root!>" + "'", str4, "<!#root!>");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.examples.HtmlToPlainText htmlToPlainText0 = new org.jsoup.examples.HtmlToPlainText();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.wholeText();
        org.jsoup.select.Elements elements4 = document2.parents();
        org.jsoup.nodes.Element element6 = document2.appendElement("#root=\"\"");
        String str7 = htmlToPlainText0.getPlainText((org.jsoup.nodes.Element) document2);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.fail(":gt(35)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: :gt(35)");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#document");
        String str7 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.select.Elements elements11 = elements9.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = elements9.html("#text");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str16 = document15.id();
        String str17 = document15.baseUri();
        org.jsoup.nodes.Element element18 = document15.clearAttributes();
        java.util.Map<String, String> strMap19 = document15.dataset();
        boolean boolean20 = elements9.add((org.jsoup.nodes.Element) document15);
        int int21 = document15.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = document15.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList3.replaceAll(parseErrorUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr(":first-child");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        String str4 = response1.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            String str5 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList1.parallelStream();
        String str4 = parseErrorList1.toString();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap11 = request10.multiHeaders();
        java.util.Map<String, String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        java.io.InputStream inputStream16 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream19 = new org.jsoup.internal.ConstrainableInputStream(inputStream16, 1, (int) (byte) 0);
        org.jsoup.Connection connection20 = httpConnection0.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream19);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = constrainableInputStream19.transferTo(outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out");
        } catch (NullPointerException e) {
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
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.postDataCharset("#root=\"\"");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #root=\"\"");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document9 = document2.parser(parser8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select("[]", (org.jsoup.nodes.Element) document2);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.headers();
        java.net.Proxy proxy7 = request4.proxy();
        org.jsoup.Connection.Request request9 = request4.removeHeader("#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request11 = request4.postDataCharset("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: [hi!<html>? <head></head>? <body>?  hi!? </body>?</html>hi!<html>? <head></head>? <body>?  hi!? </body>?</html><html>? <head></head>? <body>?  hi!? </body>?</html>multipart/form-data<html>? <head></head>? <body>?  hi!? </body>?</html>hi!=multipart/form-data]");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.select.NodeFilter.FilterResult filterResult0 = org.jsoup.select.NodeFilter.FilterResult.REMOVE;
        org.junit.Assert.assertTrue("'" + filterResult0 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.REMOVE + "'", filterResult0.equals(org.jsoup.select.NodeFilter.FilterResult.REMOVE));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.nodes.Attribute attribute3 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes2);
        String str4 = attribute3.getValue();
        String str6 = attribute3.setValue("#root");
        String str7 = attribute3.getKey();
        attribute3.setKey("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str10 = attribute3.html();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root" + "'", str4, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Encoding" + "'", str7, "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"" + "'", str10, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        boolean boolean11 = request9.hasHeader("multipart/form-data");
        boolean boolean13 = request9.hasCookie("#text");
        org.jsoup.parser.Parser parser14 = request9.parser();
        org.jsoup.nodes.Document document15 = document1.parser(parser14);
        String str16 = document15.cssSelector();
        org.jsoup.nodes.Element element19 = document15.attr("multipart", "application/x-www-form-urlencoded");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element23 = document21.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            element19.replaceWith((org.jsoup.nodes.Node) document21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#root" + "'", str16, "#root");
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace(1048576);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes6 = attributes5.clone();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", attributes5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse(inputStream0, "", "#root", parser3);
        org.jsoup.parser.ParseErrorList parseErrorList5 = parser3.getErrors();
        org.jsoup.parser.ParseErrorList parseErrorList6 = parser3.getErrors();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request8 = httpConnection7.request();
        org.jsoup.Connection.Request request11 = request8.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap12 = request11.multiHeaders();
        org.jsoup.Connection.Request request14 = request11.ignoreHttpErrors(true);
        java.net.URL uRL15 = request14.url();
        java.util.List<String> strList17 = request14.headers("[]");
        boolean boolean18 = parseErrorList6.contains((Object) "[]");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(request14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str7 = document6.id();
        String str8 = document6.baseUri();
        org.jsoup.nodes.Element element11 = document6.attr("", true);
        org.jsoup.select.Elements elements13 = document6.getElementsContainingOwnText("[]");
        int int14 = parseErrorList1.indexOf((Object) "[]");
        parseErrorList1.clear();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection4 = httpConnection0.header("#root", "multipart/form-data");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        org.jsoup.select.Elements elements53 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements3);
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
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        String str1 = org.jsoup.nodes.Entities.escape(":first-child");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":first-child" + "'", str1, ":first-child");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        String str1 = org.jsoup.internal.Normalizer.normalize(":last-of-type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag(" hi!=\"multipart/form-data\"");
        boolean boolean2 = tag1.isInline();
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslSocketFactory(sSLSocketFactory4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection3.sslSocketFactory(sSLSocketFactory6);
        org.jsoup.Connection.Request request8 = httpConnection3.request();
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request10 = httpConnection9.request();
        org.jsoup.Connection.Request request13 = request10.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap14 = request13.multiHeaders();
        java.util.Map<String, String> strMap15 = request13.cookies();
        org.jsoup.Connection connection16 = httpConnection3.headers(strMap15);
        java.io.InputStream inputStream19 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream22 = new org.jsoup.internal.ConstrainableInputStream(inputStream19, 1, (int) (byte) 0);
        org.jsoup.Connection connection23 = httpConnection3.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream22);
        boolean boolean24 = tag1.equals((Object) "#declaration");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("[]", "#text");
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.className();
        String str7 = document4.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element9 = document4.text("");
        org.jsoup.select.Elements elements11 = element9.getElementsContainingText("multipart");
        boolean boolean13 = element9.hasClass(":eq(-1)");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = document2.after((org.jsoup.nodes.Node) element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.nodes.Element element8 = element6.html(":eq(-1)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        boolean boolean27 = keyVal26.hasInputStream();
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
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        String str2 = org.jsoup.internal.StringUtil.resolve(":only-child", "#document");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        String str6 = org.jsoup.internal.StringUtil.join((java.util.Collection) elements3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = elements3.append("#declaration");
        org.jsoup.select.Elements elements10 = elements8.before(":first-child");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.text("");
        String str7 = document1.cssSelector();
        org.jsoup.nodes.Node node8 = document1.shallowClone();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#root" + "'", str7, "#root");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(true, false);
        boolean boolean3 = parseSettings2.preserveAttributeCase();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes2.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes8 = attributes2.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes11);
        String str13 = attribute12.getValue();
        org.jsoup.nodes.Attributes attributes14 = attributes2.put(attribute12);
        org.jsoup.nodes.Attributes attributes17 = attributes2.put("Content-Encoding=\"#root\"", "SYSTEM");
        org.jsoup.nodes.Attribute attribute18 = new org.jsoup.nodes.Attribute(" hi!=\"multipart/form-data\"", "multipart/form-data", attributes17);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#root!>", "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.jsoup.nodes.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = document13.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
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
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.tagName("");
        elements3.clear();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        String str13 = attribute10.getKey();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Content-Encoding" + "'", str13, "Content-Encoding");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection6 = connection4.requestBody("multipart/form-data");
        org.jsoup.Connection.Response response7 = connection4.response();
        org.jsoup.Connection.Response response8 = connection4.response();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.util.List<String> strList3 = response1.headers(" hi!=\"multipart/form-data\"");
        org.jsoup.Connection.Response response5 = response1.removeHeader(":nth-last-of-type(100n-1)");
        // The following exception was thrown during execution in test generation
        try {
            String str6 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data(":lt(52)");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.jsoup.select.Elements elements21 = document9.getElementsMatchingOwnText("multipart/form-data");
        java.util.stream.Stream<org.jsoup.nodes.Element> elementStream22 = elements21.stream();
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
        org.junit.Assert.assertNotNull(elementStream22);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        String str3 = tag1.toString();
        boolean boolean4 = tag1.isInline();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isInline();
        boolean boolean3 = tag1.isData();
        boolean boolean4 = tag1.preserveWhitespace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.helper.DataUtil.load(inputStream0, ":eq(-1)", "Content-Encoding", parser6);
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan9 = new org.jsoup.select.Evaluator.IndexLessThan((int) (short) 0);
        boolean boolean10 = document7.is((org.jsoup.select.Evaluator) indexLessThan9);
        String str11 = document7.ownText();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingText("#text");
        org.jsoup.select.Elements elements10 = elements8.addClass("Content-Encoding");
        org.jsoup.select.Elements elements12 = elements10.before("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.select.Elements elements13 = elements12.nextAll();
        java.util.List<org.jsoup.nodes.FormElement> formElementList14 = elements13.forms();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(formElementList14);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.Matches matches1 = new org.jsoup.select.Evaluator.Matches(pattern0);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str4 = document3.className();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan6 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType9 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        org.jsoup.nodes.Element element14 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType9, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str17 = document16.className();
        String str18 = document16.outerHtml();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str21 = document20.id();
        String str22 = document20.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan24 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean25 = document20.is((org.jsoup.select.Evaluator) indexLessThan24);
        boolean boolean26 = isNthLastOfType9.matches((org.jsoup.nodes.Element) document16, (org.jsoup.nodes.Element) document20);
        String str27 = document20.cssSelector();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str30 = document29.className();
        String str31 = document29.outerHtml();
        boolean boolean33 = document29.hasSameValue((Object) 1);
        boolean boolean34 = indexLessThan6.matches((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document29);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType37 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str40 = document39.wholeText();
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str43 = document42.className();
        boolean boolean44 = isNthLastOfType37.matches((org.jsoup.nodes.Element) document39, (org.jsoup.nodes.Element) document42);
        org.jsoup.nodes.Document document45 = document39.clone();
        String str46 = document39.title();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str49 = document48.id();
        String str50 = document48.baseUri();
        org.jsoup.nodes.Element element53 = document48.attr("", true);
        org.jsoup.nodes.Node node56 = document48.attr("#text", "");
        org.jsoup.nodes.Document.QuirksMode quirksMode57 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document58 = document48.quirksMode(quirksMode57);
        boolean boolean59 = indexLessThan6.matches((org.jsoup.nodes.Element) document39, (org.jsoup.nodes.Element) document48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = matches1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
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
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + quirksMode57 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode57.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.select.Elements elements11 = elements9.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = elements9.html("#text");
        org.jsoup.select.Elements elements15 = elements9.removeClass(":last-of-type");
        org.jsoup.select.Elements elements16 = elements9.next();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements18 = elements16.nextAll("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((Object) parseErrorList3);
        org.jsoup.parser.ParseError parseError5 = null;
        boolean boolean6 = parseErrorList1.add(parseError5);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList1.iterator();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(parseErrorItor7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasCookie("#text");
        org.jsoup.Connection.Request request11 = request4.cookie("#doctype", "#root=\"\"");
        String str13 = request4.header("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.Matches matches1 = new org.jsoup.select.Evaluator.Matches(pattern0);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element5 = document3.val("hi!");
        String str6 = document3.cssSelector();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str9 = document8.className();
        String str10 = document8.outerHtml();
        boolean boolean12 = document8.hasSameValue((Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = matches1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot("#text", "#text");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.text("");
        org.jsoup.select.Elements elements7 = document1.getAllElements();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        String str7 = elements3.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements9 = elements3.before("#doctype");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements3.replaceAll(elementUnaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse(inputStream0, "", "#root", parser3);
        org.jsoup.parser.ParseErrorList parseErrorList5 = parser3.getErrors();
        org.jsoup.nodes.Document document8 = parser3.parseInput("#text", "#declaration");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str6 = document5.id();
        org.jsoup.select.Elements elements7 = document5.previousElementSiblings();
        org.jsoup.nodes.Element element8 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType3, (org.jsoup.nodes.Element) document5);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str11 = document10.className();
        String str12 = document10.outerHtml();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str15 = document14.id();
        String str16 = document14.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan18 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean19 = document14.is((org.jsoup.select.Evaluator) indexLessThan18);
        boolean boolean20 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document10, (org.jsoup.nodes.Element) document14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeFilter.FilterResult filterResult21 = org.jsoup.select.NodeTraversor.filter(nodeFilter0, (org.jsoup.nodes.Node) document10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.NodeFilter.head(org.jsoup.nodes.Node, int)\" because \"filter\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str12, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.isTrue(false, "multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: multipart/form-data");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = document1.getElementsByAttributeValueStarting("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", ":lt(52)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.noTracking();
        int int23 = parseErrorList20.indexOf((Object) parseErrorList22);
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        org.jsoup.Connection connection26 = httpConnection24.sslSocketFactory(sSLSocketFactory25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        org.jsoup.Connection connection28 = httpConnection24.sslSocketFactory(sSLSocketFactory27);
        org.jsoup.Connection connection30 = httpConnection24.ignoreContentType(true);
        boolean boolean31 = parseErrorList20.equals((Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray32 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList33 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33, parseErrorArray32);
        parseErrorList33.ensureCapacity(10);
        boolean boolean37 = parseErrorList20.remove((Object) parseErrorList33);
        boolean boolean38 = parseErrorList20.isEmpty();
        String str39 = parseErrorList20.toString();
        boolean boolean40 = parseErrorList14.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20);
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList14.replaceAll(parseErrorUnaryOperator41);
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
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        String str4 = xmlDeclaration3.getWholeDeclaration();
        String str5 = xmlDeclaration3.nodeName();
        String str6 = xmlDeclaration3.baseUri();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#declaration" + "'", str5, "#declaration");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.isTrue(false, ":last-of-type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: :last-of-type");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements5.val();
        org.jsoup.select.Elements elements8 = elements5.addClass("Content-Encoding");
        org.jsoup.select.Elements elements9 = elements5.nextAll();
        String str10 = elements9.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        String str4 = xmlDeclaration3.nodeName();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType7 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str10 = document9.className();
        String str11 = document9.outerHtml();
        boolean boolean13 = document9.hasSameValue((Object) 1);
        String str14 = document9.tagName();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element18 = document16.val("hi!");
        boolean boolean19 = isNthLastOfType7.matches((org.jsoup.nodes.Element) document9, element18);
        String str20 = document9.wholeText();
        org.jsoup.nodes.Element element22 = document9.removeClass("#root=\"\"");
        org.jsoup.nodes.Document document23 = document9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.after((org.jsoup.nodes.Node) document9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#root" + "'", str14, "#root");
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        java.nio.charset.Charset charset5 = document1.charset();
        org.jsoup.nodes.Element element7 = document1.tagName("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(element7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.select.QueryParser queryParser1 = new org.jsoup.select.QueryParser("#root");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 100, (int) 'm');
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.MatchesOwn matchesOwn1 = new org.jsoup.select.Evaluator.MatchesOwn(pattern0);
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
        org.jsoup.parser.Parser parser32 = document17.parser();
        String str33 = document17.val();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element37 = document35.val("hi!");
        org.jsoup.nodes.Element element39 = element37.html("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = matchesOwn1.matches((org.jsoup.nodes.Element) document17, element39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(parser32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements4 = elements3.remove();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList7 = elements3.subList((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        String str7 = document1.title();
        String str8 = document1.className();
        org.jsoup.nodes.Document document11 = org.jsoup.parser.Parser.parse(" hi!=\"multipart/form-data\"", "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.before((org.jsoup.nodes.Node) document11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        String str2 = elements1.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        org.jsoup.Connection.Request request13 = request4.addHeader("multipart", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request1.header("#root=\"\"", ":eq(-1)");
        org.jsoup.Connection.Request request9 = request1.removeCookie("Content-Encoding");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse(file0, ":only-child", ":first-child");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "multipart");
        String str4 = textNode2.attr("#text");
        String str5 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType0 = new org.jsoup.select.Evaluator.IsFirstOfType();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element4 = document2.val("hi!");
        org.jsoup.nodes.Element element6 = element4.html("");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType9 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.wholeText();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str15 = document14.className();
        boolean boolean16 = isNthLastOfType9.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document14);
        org.jsoup.nodes.Document document17 = document11.clone();
        document17.setBaseUri("#root");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType24 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.nodes.Element element29 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType24, (org.jsoup.nodes.Element) document26);
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str32 = document31.className();
        String str33 = document31.outerHtml();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str36 = document35.id();
        String str37 = document35.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan39 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean40 = document35.is((org.jsoup.select.Evaluator) indexLessThan39);
        boolean boolean41 = isNthLastOfType24.matches((org.jsoup.nodes.Element) document31, (org.jsoup.nodes.Element) document35);
        String str42 = document35.cssSelector();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str45 = document44.className();
        String str46 = document44.outerHtml();
        boolean boolean48 = document44.hasSameValue((Object) 1);
        boolean boolean49 = indexLessThan21.matches((org.jsoup.nodes.Element) document35, (org.jsoup.nodes.Element) document44);
        org.jsoup.nodes.Element element50 = document17.prependChild((org.jsoup.nodes.Node) document44);
        org.jsoup.nodes.Element element52 = element50.removeClass("#root");
        boolean boolean53 = isFirstOfType0.matches(element4, element50);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document17);
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
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str46, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.nodes.CDataNode cDataNode1 = new org.jsoup.nodes.CDataNode("multipart/form-data");
        String str2 = cDataNode1.text();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((-1), (int) '#');
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap5 = request4.multiHeaders();
        java.util.Map<String, String> strMap6 = request4.headers();
        java.util.List<String> strList8 = request4.headers("Content-Type");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = org.jsoup.parser.Parser.parseXmlFragment("SYSTEM", "#root=\"\"");
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements5.val();
        org.jsoup.select.Elements elements7 = elements5.nextAll();
        org.jsoup.select.Elements elements9 = elements7.before("PUBLIC");
        boolean boolean11 = elements9.remove((Object) "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue(" ");
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume(":eq(-1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList8.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList8.parallelStream();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements14.listIterator();
        org.jsoup.select.Elements elements17 = elements14.empty();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.select.Elements elements23 = elements21.prev("#text");
        boolean boolean24 = elements21.hasText();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements28.listIterator();
        org.jsoup.select.Elements elements31 = elements28.empty();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        boolean boolean38 = elements35.equals((Object) 1.0d);
        String str39 = elements35.text();
        org.jsoup.select.Elements elements41 = elements35.wrap("#root");
        org.jsoup.select.Elements[] elementsArray42 = new org.jsoup.select.Elements[] { elements14, elements21, elements28, elements41 };
        org.jsoup.select.Elements[] elementsArray43 = parseErrorList8.toArray(elementsArray42);
        int int44 = elements3.indexOf((Object) parseErrorList8);
        String str45 = elements3.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parseErrorItor9);
        org.junit.Assert.assertNotNull(parseErrorStream10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertNotNull(elementItor16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertNotNull(elementItor30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elementItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elementsArray42);
        org.junit.Assert.assertNotNull(elementsArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap10 = request9.multiHeaders();
        java.util.Map<String, String> strMap11 = request9.headers();
        java.net.Proxy proxy12 = request9.proxy();
        org.jsoup.Connection connection13 = httpConnection0.request(request9);
        org.jsoup.Connection connection15 = httpConnection0.followRedirects(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.safety.Whitelist whitelist2 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean3 = org.jsoup.Jsoup.isValid("hi!", whitelist2);
        org.jsoup.safety.Whitelist whitelist6 = whitelist2.removeEnforcedAttribute("Content-Encoding", "#root");
        String str7 = org.jsoup.Jsoup.clean("", whitelist6);
        org.jsoup.parser.TokenQueue tokenQueue10 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String[] strArray15 = new String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        String str16 = tokenQueue10.consumeToAny(strArray15);
        org.jsoup.safety.Whitelist whitelist17 = whitelist6.removeAttributes("multipart", strArray15);
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean21 = tokenQueue19.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        String str23 = tokenQueue19.chompTo("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String[] strArray31 = new String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean32 = org.jsoup.internal.StringUtil.in("", strArray31);
        boolean boolean33 = org.jsoup.internal.StringUtil.in("", strArray31);
        boolean boolean34 = tokenQueue19.matchesAny(strArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist35 = whitelist6.addTags(strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(whitelist6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(whitelist17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "multipart/form-data" + "'", str23, "multipart/form-data");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.KeyVal keyVal3 = httpConnection0.data("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection5 = httpConnection0.url("SYSTEM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: SYSTEM");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(keyVal3);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        boolean boolean1 = org.jsoup.nodes.Entities.isBaseNamedEntity(":last-of-type");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.select.Evaluator.Class class1 = new org.jsoup.select.Evaluator.Class("Content-Encoding");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str4 = document3.wholeText();
        org.jsoup.select.Elements elements5 = document3.parents();
        org.jsoup.nodes.Element element7 = document3.appendElement("#root=\"\"");
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str10 = document9.wholeText();
        org.jsoup.select.Elements elements11 = document9.parents();
        java.nio.charset.Charset charset12 = document9.charset();
        org.jsoup.select.Elements elements14 = document9.getElementsByIndexGreaterThan((int) '#');
        boolean boolean15 = class1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document9);
        int int16 = document9.siblingIndex();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        boolean boolean11 = request9.hasHeader("multipart/form-data");
        boolean boolean13 = request9.hasCookie("#text");
        org.jsoup.parser.Parser parser14 = request9.parser();
        org.jsoup.nodes.Document document15 = document1.parser(parser14);
        org.jsoup.nodes.DataNode dataNode18 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        String str19 = dataNode18.getWholeData();
        org.jsoup.nodes.DataNode dataNode21 = dataNode18.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.DataNode dataNode23 = dataNode18.setWholeData("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        String str24 = dataNode18.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element25 = document1.after((org.jsoup.nodes.Node) dataNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dataNode18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#text" + "'", str19, "#text");
        org.junit.Assert.assertNotNull(dataNode21);
        org.junit.Assert.assertNotNull(dataNode23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" + "'", str24, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isInline();
        boolean boolean3 = tag1.isData();
        boolean boolean4 = tag1.canContainBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        String str8 = request4.cookie("#root");
        org.jsoup.Connection.Request request10 = request4.timeout((int) ' ');
        int int11 = request10.maxBodySize();
        java.net.URL uRL12 = request10.url();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1048576 + "'", int11 == 1048576);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.select.Elements elements11 = elements9.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str12 = elements11.outerHtml();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.body();
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request6 = httpConnection5.request();
        org.jsoup.Connection.Request request9 = request6.addHeader("multipart/form-data", "hi!");
        boolean boolean11 = request9.hasHeader("multipart/form-data");
        boolean boolean13 = request9.hasCookie("#text");
        org.jsoup.parser.Parser parser14 = request9.parser();
        org.jsoup.nodes.Document document15 = document1.parser(parser14);
        org.jsoup.nodes.Node node16 = document15.parent();
        org.jsoup.nodes.Node node17 = document15.shallowClone();
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
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax0 = org.jsoup.nodes.Document.OutputSettings.Syntax.xml;
        org.junit.Assert.assertTrue("'" + syntax0 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.xml + "'", syntax0.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.xml));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#doctype");
        String str3 = attributeWithValueContaining2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]" + "'", str3, "[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node3 = textNode2.root();
        String str5 = textNode2.absUrl("#declaration");
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("#root=\"\"");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        String str3 = attributeWithValueNot2.toString();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str9 = document8.wholeText();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str12 = document11.className();
        boolean boolean13 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str16 = document15.id();
        int int17 = document15.elementSiblingIndex();
        boolean boolean18 = attributeWithValueNot2.matches((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[:eq(-1)!=#doctype]" + "'", str3, "[:eq(-1)!=#doctype]");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        boolean boolean5 = tokenQueue1.matchesCS(":only-child");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean9 = request4.hasCookie("#doctype");
        java.net.URL uRL10 = request4.url();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.select.Elements elements0 = new org.jsoup.select.Elements();
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.after("");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator(0);
        org.jsoup.select.Elements elements11 = elements3.remove();
        org.jsoup.nodes.Element element12 = elements3.first();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.select.Elements elements12 = document4.getElementsByIndexEquals((int) (short) 10);
        String str13 = document4.data();
        org.jsoup.select.Elements elements14 = document4.siblingElements();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = constrainableInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.listIterator();
        String str4 = parseErrorList1.toString();
        parseErrorList1.clear();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream6 = parseErrorList1.stream();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(parseErrorStream6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str5 = document1.normalName();
        String str6 = document1.html();
        org.jsoup.nodes.Element element9 = document1.attr(":only-child", "#doctype");
        String str10 = element9.baseUri();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str5 = document4.className();
        String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((Object) 1);
        String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        org.jsoup.select.Elements elements15 = element13.nextElementSiblings();
        org.jsoup.select.Elements elements17 = elements15.not("Content-Encoding");
        boolean boolean19 = elements15.hasClass("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        char char4 = tokenQueue1.consume();
        char char5 = tokenQueue1.consume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'm' + "'", char4 == 'm');
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'u' + "'", char5 == 'u');
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = element6.childNodesCopy();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.nodes.Node node9 = document1.attr("#text", "");
        org.jsoup.nodes.Element element11 = document1.html("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.Element element12 = document1.previousElementSibling();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertNull(element12);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator1 = attributes0.spliterator();
        org.junit.Assert.assertNotNull(attributeSpliterator1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.select.Elements elements5 = elements3.addClass("hi!");
        org.jsoup.select.Elements elements8 = elements5.attr(":eq(-1)", ":eq(-1)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#text");
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
        org.jsoup.parser.Parser parser32 = document17.parser();
        String str33 = document17.val();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType36 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str39 = document38.className();
        String str40 = document38.outerHtml();
        boolean boolean42 = document38.hasSameValue((Object) 1);
        String str43 = document38.tagName();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element47 = document45.val("hi!");
        boolean boolean48 = isNthLastOfType36.matches((org.jsoup.nodes.Element) document38, element47);
        boolean boolean49 = tag1.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document38);
        org.jsoup.nodes.DocumentType documentType54 = new org.jsoup.nodes.DocumentType("hi!", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", "#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node55 = document38.before((org.jsoup.nodes.Node) documentType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(parser32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str40, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "#root" + "'", str43, "#root");
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements8.listIterator();
        org.jsoup.select.Elements elements11 = elements8.empty();
        boolean boolean12 = attributes4.equals((Object) elements8);
        String str13 = elements8.toString();
        org.jsoup.select.Elements elements15 = elements8.before(":eq(-1)");
        org.jsoup.select.Elements elements16 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements15);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements5.val();
        org.jsoup.select.Elements elements7 = elements5.nextAll();
        java.util.List<String> strList9 = elements5.eachAttr("amultipart");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor2 = parseErrorList1.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList1.parallelStream();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str6 = document5.id();
        org.jsoup.select.Elements elements7 = document5.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements7.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements7.listIterator();
        org.jsoup.select.Elements elements10 = elements7.empty();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        org.jsoup.select.Elements elements16 = elements14.prev("#text");
        boolean boolean17 = elements14.hasText();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        org.jsoup.select.Elements elements24 = elements21.empty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        boolean boolean31 = elements28.equals((Object) 1.0d);
        String str32 = elements28.text();
        org.jsoup.select.Elements elements34 = elements28.wrap("#root");
        org.jsoup.select.Elements[] elementsArray35 = new org.jsoup.select.Elements[] { elements7, elements14, elements21, elements34 };
        org.jsoup.select.Elements[] elementsArray36 = parseErrorList1.toArray(elementsArray35);
        org.jsoup.select.Selector.SelectorParseException selectorParseException37 = new org.jsoup.select.Selector.SelectorParseException("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]", (Object[]) elementsArray35);
        org.junit.Assert.assertNotNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parseErrorItor2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elementItor8);
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elementItor22);
        org.junit.Assert.assertNotNull(elementItor23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elementsArray35);
        org.junit.Assert.assertNotNull(elementsArray36);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((Object) 1.0d);
        String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.parser.ParseError[] parseErrorArray10 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList11 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11, parseErrorArray10);
        parseErrorList11.ensureCapacity(10);
        parseErrorList11.ensureCapacity(100);
        boolean boolean17 = elements9.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(parseErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.Tag tag0 = null;
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes2.clone();
        org.jsoup.parser.ParseSettings parseSettings6 = new org.jsoup.parser.ParseSettings(false, true);
        boolean boolean7 = parseSettings6.preserveTagCase();
        int int8 = attributes2.deduplicate(parseSettings6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.PseudoTextElement pseudoTextElement9 = new org.jsoup.nodes.PseudoTextElement(tag0, "", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = connection15.proxy("hi!", 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:1048576");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean2 = outputSettings1.outline();
        int int3 = outputSettings1.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax4 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.syntax(syntax4);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        String str7 = org.jsoup.nodes.Entities.escape("", outputSettings5);
        boolean boolean8 = outputSettings5.outline();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + syntax4 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax4.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("Content-Encoding", "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        String str1 = org.jsoup.nodes.Entities.getByName("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        parseErrorList1.ensureCapacity(10);
        parseErrorList1.ensureCapacity(100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError8 = parseErrorList1.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        String str6 = elements5.val();
        org.jsoup.select.Elements elements8 = elements5.addClass("Content-Encoding");
        String str9 = elements8.toString();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("Content-Encoding=\"#root\"");
        org.jsoup.parser.Tag tag2 = document1.tag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        String str2 = org.jsoup.internal.StringUtil.resolve("#doctype", "application/x-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.outline(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings3.charset("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: Content-Type");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(outputSettings3);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.noTracking();
        int int23 = parseErrorList20.indexOf((Object) parseErrorList22);
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        org.jsoup.Connection connection26 = httpConnection24.sslSocketFactory(sSLSocketFactory25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        org.jsoup.Connection connection28 = httpConnection24.sslSocketFactory(sSLSocketFactory27);
        org.jsoup.Connection connection30 = httpConnection24.ignoreContentType(true);
        boolean boolean31 = parseErrorList20.equals((Object) true);
        org.jsoup.parser.ParseError[] parseErrorArray32 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList33 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33, parseErrorArray32);
        parseErrorList33.ensureCapacity(10);
        boolean boolean37 = parseErrorList20.remove((Object) parseErrorList33);
        boolean boolean38 = parseErrorList20.isEmpty();
        String str39 = parseErrorList20.toString();
        boolean boolean40 = parseErrorList14.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20);
        String str41 = parseErrorList20.toString();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "#document", true);
        boolean boolean4 = xmlDeclaration3.hasParent();
        String str5 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        String str5 = tokenQueue1.consumeTo("multipart");
        boolean boolean6 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str21 = document20.className();
        String str23 = document20.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        String str24 = document20.normalName();
        String str25 = document20.html();
        org.jsoup.nodes.Element element27 = document20.addClass("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        // The following exception was thrown during execution in test generation
        try {
            element18.replaceWith((org.jsoup.nodes.Node) element27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#root" + "'", str24, "#root");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element27);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.KeyVal keyVal3 = httpConnection0.data("Content-Encoding");
        org.jsoup.Connection connection5 = httpConnection0.timeout(0);
        org.jsoup.Connection.Method method6 = org.jsoup.Connection.Method.OPTIONS;
        org.jsoup.Connection connection7 = httpConnection0.method(method6);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(keyVal3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertTrue("'" + method6 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method6.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.select.Evaluator.IsNthLastChild isNthLastChild2 = new org.jsoup.select.Evaluator.IsNthLastChild((int) 'u', (int) '4');
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("#document", "#root=\"\"", inputStream2);
        String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#root=\"\"" + "'", str4, "#root=\"\"");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        String str3 = tag1.toString();
        boolean boolean4 = tag1.isFormSubmittable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        String str2 = response1.statusMessage();
        String str3 = response1.statusMessage();
        org.jsoup.Connection.Method method4 = response1.method();
        String str5 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document("");
        String str2 = document1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#document" + "'", str2, "#document");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements6 = elements5.prev();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request1.header("#root=\"\"", ":eq(-1)");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request9 = request7.postDataCharset("<!#root!>");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: <!#root!>");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection.Response response6 = response4.removeCookie("SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response4.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int[] intArray4 = new int[] { (short) 1, 100, (short) 1 };
        int int5 = org.jsoup.nodes.Entities.codepointsForName("hi!", intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.jsoup.Connection.Request request19 = httpConnection0.request();
        org.jsoup.Connection.Request request22 = request19.addHeader("#document", " hi!=\"multipart/form-data\"");
        org.jsoup.Connection.Request request24 = request22.requestBody("Content-Type");
        String str26 = request22.header("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
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
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        String str6 = tokenQueue1.chompBalanced('4', ' ');
        String str7 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ultipart" + "'", str7, "ultipart");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.KeyVal keyVal3 = httpConnection0.data("Content-Encoding");
        org.jsoup.Connection connection5 = httpConnection0.maxBodySize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(keyVal3);
        org.junit.Assert.assertNotNull(connection5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        // The following exception was thrown during execution in test generation
        try {
            document13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (IllegalArgumentException e) {
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
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = parser5.parseInput(reader9, "Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("Content-Encoding=\"#root\"", (int) (short) 1, ":nth-last-of-type(100n-1)");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsContainingText("#text");
        String str9 = document1.ownText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList8.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList8.parallelStream();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements14.listIterator();
        org.jsoup.select.Elements elements17 = elements14.empty();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.select.Elements elements23 = elements21.prev("#text");
        boolean boolean24 = elements21.hasText();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements28.listIterator();
        org.jsoup.select.Elements elements31 = elements28.empty();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        boolean boolean38 = elements35.equals((Object) 1.0d);
        String str39 = elements35.text();
        org.jsoup.select.Elements elements41 = elements35.wrap("#root");
        org.jsoup.select.Elements[] elementsArray42 = new org.jsoup.select.Elements[] { elements14, elements21, elements28, elements41 };
        org.jsoup.select.Elements[] elementsArray43 = parseErrorList8.toArray(elementsArray42);
        int int44 = elements3.indexOf((Object) parseErrorList8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError46 = parseErrorList8.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parseErrorItor9);
        org.junit.Assert.assertNotNull(parseErrorStream10);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertNotNull(elementItor16);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elementItor29);
        org.junit.Assert.assertNotNull(elementItor30);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertNotNull(elementItor36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(elementsArray42);
        org.junit.Assert.assertNotNull(elementsArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        String str2 = textNode1.getWholeText();
        boolean boolean3 = textNode1.isBlank();
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        String str3 = document2.id();
        String str4 = document2.baseUri();
        org.jsoup.nodes.Element element5 = document2.clearAttributes();
        java.util.Map<String, String> strMap6 = document2.dataset();
        org.jsoup.Connection connection7 = httpConnection0.data(strMap6);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request12 = httpConnection11.request();
        org.jsoup.Connection.Request request15 = request12.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap16 = request15.multiHeaders();
        java.util.Map<String, String> strMap17 = request15.cookies();
        org.jsoup.Connection connection18 = connection10.headers(strMap17);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
        org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError15 = parseErrorList1.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(parseErrorStream13);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        java.util.Map<String, String> strMap11 = request4.headers();
        String str13 = request4.header("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        java.util.Map<String, java.util.List<String>> strMap11 = request10.multiHeaders();
        java.util.Map<String, String> strMap12 = request10.cookies();
        org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
        java.io.InputStream inputStream16 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream19 = new org.jsoup.internal.ConstrainableInputStream(inputStream16, 1, (int) (byte) 0);
        org.jsoup.Connection connection20 = httpConnection0.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream19);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = constrainableInputStream19.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
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
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        String str27 = keyVal3.contentType();
        String str28 = keyVal3.key();
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Content-Encoding" + "'", str28, "Content-Encoding");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection4.sslSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection4.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection.Request request9 = httpConnection4.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        org.jsoup.Connection.Request request14 = request11.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method15 = request11.method();
        org.jsoup.Connection connection16 = httpConnection4.method(method15);
        org.jsoup.Connection connection17 = httpConnection0.method(method15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
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
        org.junit.Assert.assertTrue("'" + method15 + "' != '" + org.jsoup.Connection.Method.GET + "'", method15.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection17);
    }
}

