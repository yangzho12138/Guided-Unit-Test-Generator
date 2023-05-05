import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        byte[] byteArray8 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = constrainableInputStream3.read(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: Read timeout");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        org.jsoup.select.NodeFilter nodeFilter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = document14.filter(nodeFilter21);
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList0.parallelStream();
        int int3 = parseErrorList0.size();
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.select.Elements elements11 = elements9.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = elements9.html("#text");
        org.jsoup.select.Elements elements15 = elements9.removeClass(":last-of-type");
        org.jsoup.select.Elements elements16 = elements9.next();
        org.jsoup.select.Elements elements18 = elements16.eq(100);
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
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.select.Evaluator evaluator0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.wholeText();
        org.jsoup.select.Elements elements4 = document2.parents();
        org.jsoup.nodes.Element element5 = document2.shallowClone();
        java.lang.Object obj6 = null;
        boolean boolean7 = document2.hasSameValue(obj6);
        org.jsoup.nodes.Element element9 = document2.appendText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = org.jsoup.select.Selector.select(evaluator0, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(element9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#text");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.id();
        org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        org.jsoup.nodes.Element element11 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.className();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.id();
        java.lang.String str19 = document17.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean22 = document17.is((org.jsoup.select.Evaluator) indexLessThan21);
        boolean boolean23 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document17);
        java.lang.String str24 = document17.cssSelector();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.className();
        java.lang.String str28 = document26.outerHtml();
        boolean boolean30 = document26.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = indexLessThan3.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document26);
        org.jsoup.parser.Parser parser32 = document17.parser();
        java.lang.String str33 = document17.val();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType36 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str39 = document38.className();
        java.lang.String str40 = document38.outerHtml();
        boolean boolean42 = document38.hasSameValue((java.lang.Object) 1);
        java.lang.String str43 = document38.tagName();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element47 = document45.val("hi!");
        boolean boolean48 = isNthLastOfType36.matches((org.jsoup.nodes.Element) document38, element47);
        boolean boolean49 = tag1.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document38);
        org.jsoup.nodes.TextNode textNode52 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node53 = textNode52.root();
        java.lang.String str55 = textNode52.absUrl("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = document17.before((org.jsoup.nodes.Node) textNode52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(textNode52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection7 = httpConnection0.cookie("amultipart", "<!#root!>");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration(":contains(content-encoding)", "SYSTEM", true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str4 = tokenQueue1.consumeWord();
        java.lang.String str5 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart" + "'", str4, "multipart");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.helper.DataUtil dataUtil0 = new org.jsoup.helper.DataUtil();
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.nodes.CDataNode cDataNode1 = new org.jsoup.nodes.CDataNode(" hi!=\"multipart/form-data\"");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.select.Elements elements9 = document7.getElementsByIndexLessThan(0);
        java.lang.String str10 = document7.outerHtml();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>" + "'", str10, "<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.nodes.DocumentType documentType3 = new org.jsoup.nodes.DocumentType("application/x-www-form-urlencoded", ":lt(52)", "");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.relaxed();
        org.junit.Assert.assertNotNull(whitelist0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("");
        int int2 = textNode1.childNodeSize();
        java.lang.String str3 = textNode1.outerHtml();
        org.junit.Assert.assertNotNull(textNode1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse(inputStream0, "", "#root", parser3);
        org.jsoup.nodes.DocumentType documentType9 = new org.jsoup.nodes.DocumentType("hi!", "#text", "#root", "#document");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document4.before((org.jsoup.nodes.Node) documentType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection7 = httpConnection0.cookie("multipart", "#doctype");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        org.jsoup.parser.Parser parser30 = document15.parser();
        org.jsoup.select.Elements elements32 = document15.getElementsByIndexGreaterThan((int) (short) -1);
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
        org.junit.Assert.assertNull(parser30);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean2 = outputSettings1.outline();
        int int3 = outputSettings1.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax4 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.syntax(syntax4);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape(":gt(35)", outputSettings5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + syntax4 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax4.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":gt(35)" + "'", str7, ":gt(35)");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        org.jsoup.Connection.Request request18 = request15.header(":lt(52)", "[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request18);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.basicWithImages();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist11 = whitelist0.addTags(strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        boolean boolean3 = document1.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create(" ", "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        java.util.Set<java.lang.String> strSet3 = document1.classNames();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        java.io.InputStream inputStream16 = null;
        org.jsoup.Connection connection17 = connection13.data("#document", "hi!", inputStream16);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request19 = httpConnection18.request();
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection18.data("#root", "Content-Encoding", inputStream22, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.helper.HttpConnection httpConnection25 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request26 = httpConnection25.request();
        org.jsoup.Connection.Request request29 = request26.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = request29.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = request29.cookies();
        org.jsoup.Connection connection32 = httpConnection18.headers(strMap31);
        org.jsoup.Connection connection33 = connection13.data(strMap31);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection33);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#root", "#root", true);
        java.lang.String str4 = xmlDeclaration3.nodeName();
        java.lang.String str5 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.io.InputStream inputStream16 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream19 = new org.jsoup.internal.ConstrainableInputStream(inputStream16, 1, (int) (byte) 0);
        org.jsoup.Connection connection20 = httpConnection0.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream19);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = constrainableInputStream19.readToByteBuffer(0);
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        java.net.URL uRL8 = request7.url();
        java.util.List<java.lang.String> strList10 = request7.headers("[]");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = request7.cookies();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements6 = elements5.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.ParseErrorList parseErrorList9 = parser5.getErrors();
        boolean boolean10 = parser5.isTrackErrors();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.nodes.DataNode dataNode1 = new org.jsoup.nodes.DataNode(" ");
        java.lang.String str2 = dataNode1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#data" + "'", str2, "#data");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        boolean boolean1 = org.jsoup.nodes.Entities.isNamedEntity(":last-of-type");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element14 = document12.val("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = elements3.set((int) 'u', (org.jsoup.nodes.Element) document12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 117 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean4 = tokenQueue1.consumeWhitespace();
        java.lang.String str6 = tokenQueue1.chompTo("#text");
        java.lang.String str7 = tokenQueue1.consumeWord();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart/form-data" + "'", str6, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = document1.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request22 = httpConnection21.request();
        org.jsoup.Connection.Request request25 = request22.addHeader("multipart/form-data", "hi!");
        boolean boolean27 = request25.hasHeader("multipart/form-data");
        boolean boolean29 = request25.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method30 = request25.method();
        org.jsoup.Connection.Method method31 = request25.method();
        org.jsoup.Connection.Request request34 = request25.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection connection35 = httpConnection0.request(request25);
        boolean boolean37 = request25.hasCookie(":first-child");
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
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + method30 + "' != '" + org.jsoup.Connection.Method.GET + "'", method30.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements7 = elements5.prev("#root");
        org.jsoup.select.Elements elements9 = elements7.tagName("Content-Encoding");
        org.jsoup.select.Elements elements11 = elements7.addClass("");
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements11.replaceAll(elementUnaryOperator12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        constrainableInputStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer9 = constrainableInputStream3.readToByteBuffer((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: Read timeout");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.KeyVal keyVal3 = httpConnection0.data("Content-Encoding");
        org.jsoup.Connection connection5 = httpConnection0.timeout(0);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection0.sslSocketFactory(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(keyVal3);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.safety.Whitelist whitelist1 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean2 = org.jsoup.Jsoup.isValid("hi!", whitelist1);
        org.jsoup.safety.Whitelist whitelist5 = whitelist1.removeEnforcedAttribute("Content-Encoding", "#root");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean14 = org.jsoup.internal.StringUtil.in("", strArray13);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("", strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist16 = whitelist1.removeTags(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(whitelist5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = null;
        org.jsoup.Connection connection24 = httpConnection22.sslSocketFactory(sSLSocketFactory23);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        org.jsoup.Connection connection26 = httpConnection22.sslSocketFactory(sSLSocketFactory25);
        org.jsoup.Connection.Request request27 = httpConnection22.request();
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request29 = httpConnection28.request();
        org.jsoup.Connection.Request request32 = request29.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = request32.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = request32.cookies();
        org.jsoup.Connection connection35 = httpConnection22.headers(strMap34);
        org.jsoup.Connection connection38 = connection35.data("multipart/form-data", "");
        org.jsoup.helper.HttpConnection httpConnection39 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request40 = httpConnection39.request();
        org.jsoup.Connection.Request request43 = request40.addHeader("multipart/form-data", "hi!");
        boolean boolean45 = request43.hasHeader("multipart/form-data");
        boolean boolean47 = request43.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method48 = request43.method();
        boolean boolean49 = method48.hasBody();
        org.jsoup.Connection connection50 = connection35.method(method48);
        org.jsoup.Connection.Request request51 = request20.method(method48);
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
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(request43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + method48 + "' != '" + org.jsoup.Connection.Method.GET + "'", method48.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(request51);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements4 = elements3.remove();
        org.jsoup.select.Elements elements6 = elements3.val("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.jsoup.select.Elements elements8 = elements6.html("Content-Encoding=#declaration");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        org.jsoup.Connection connection30 = connection27.proxy("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!", (int) (byte) 100);
        org.jsoup.Connection.KeyVal keyVal32 = connection30.data("ultipart");
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
        org.junit.Assert.assertNull(keyVal32);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        java.lang.String str3 = tag1.toString();
        boolean boolean4 = tag1.isBlock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        java.lang.String str5 = attribute3.html();
        java.lang.String str6 = attribute3.getKey();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root=\"\"" + "'", str5, "#root=\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection.Response response6 = httpConnection0.response();
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request8 = httpConnection7.request();
        org.jsoup.Connection connection10 = httpConnection7.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        org.jsoup.Connection connection13 = httpConnection11.sslSocketFactory(sSLSocketFactory12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        org.jsoup.Connection connection15 = httpConnection11.sslSocketFactory(sSLSocketFactory14);
        org.jsoup.Connection.Request request16 = httpConnection11.request();
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request18 = httpConnection17.request();
        org.jsoup.Connection.Request request21 = request18.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = request21.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = request21.cookies();
        org.jsoup.Connection connection24 = httpConnection11.headers(strMap23);
        org.jsoup.Connection connection25 = httpConnection7.data(strMap23);
        org.jsoup.Connection.Request request26 = httpConnection7.request();
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response28 = httpConnection27.response();
        java.lang.String str29 = response28.statusMessage();
        java.lang.String str30 = response28.statusMessage();
        org.jsoup.Connection.Method method31 = response28.method();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = response28.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = response28.cookies();
        org.jsoup.Connection connection34 = httpConnection7.data(strMap33);
        org.jsoup.Connection connection35 = httpConnection0.headers(strMap33);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection35);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.nodes.Attribute attribute2 = new org.jsoup.nodes.Attribute(":first-child", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.Matches matches1 = new org.jsoup.select.Evaluator.Matches(pattern0);
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
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element24 = document22.val("hi!");
        int int25 = document22.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = matches1.matches(element19, (org.jsoup.nodes.Element) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((java.lang.Object) 1);
        java.lang.String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        java.lang.String str15 = document4.title();
        org.jsoup.nodes.Node node16 = document4.parent();
        boolean boolean17 = document4.updateMetaCharsetElement();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.jsoup.Connection connection23 = httpConnection0.ignoreHttpErrors(false);
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
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements8.listIterator();
        org.jsoup.select.Elements elements11 = elements8.empty();
        boolean boolean12 = attributes4.equals((java.lang.Object) elements8);
        java.lang.String str13 = elements8.toString();
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection14.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Connection connection18 = httpConnection14.ignoreContentType(true);
        boolean boolean19 = elements8.equals((java.lang.Object) connection18);
        org.jsoup.select.Elements elements20 = elements8.unwrap();
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
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(elements20);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.Validate.isFalse(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        java.lang.String str6 = elements5.val();
        org.jsoup.select.Elements elements7 = elements5.nextAll();
        org.jsoup.select.Elements elements9 = elements7.select("SYSTEM");
        java.lang.Object[] objArray10 = elements7.toArray();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(":last-of-type");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslSocketFactory(sSLSocketFactory4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        org.jsoup.Connection connection7 = httpConnection3.sslSocketFactory(sSLSocketFactory6);
        org.jsoup.Connection.Request request8 = httpConnection3.request();
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request10 = httpConnection9.request();
        org.jsoup.Connection.Request request13 = request10.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method14 = request10.method();
        org.jsoup.Connection connection15 = httpConnection3.method(method14);
        org.jsoup.Connection.Request request16 = connection15.request();
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request18 = httpConnection17.request();
        org.jsoup.Connection.Request request21 = request18.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method22 = request18.method();
        org.jsoup.Connection connection23 = connection15.method(method22);
        boolean boolean24 = method22.hasBody();
        org.jsoup.Connection.Request request25 = request2.method(method22);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertTrue("'" + method22 + "' != '" + org.jsoup.Connection.Method.GET + "'", method22.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(request25);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor41 = parseErrorList20.iterator();
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.select.Evaluator.IsLastChild isLastChild0 = new org.jsoup.select.Evaluator.IsLastChild();
        java.lang.String str1 = isLastChild0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-child" + "'", str1, ":last-child");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.nodes.Element element12 = document4.tagName("#root");
        org.jsoup.select.Elements elements14 = document4.getElementsByIndexLessThan(100);
        java.util.Iterator<org.jsoup.nodes.Element> elementItor15 = elements14.iterator();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNotNull(elementItor15);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements((int) (byte) 0);
        java.lang.String str2 = elements1.html();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.MatchesOwn matchesOwn1 = new org.jsoup.select.Evaluator.MatchesOwn(pattern0);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("SYSTEM");
        java.util.regex.Pattern pattern5 = null;
        org.jsoup.select.Elements elements6 = document3.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", pattern5);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.id();
        org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor11 = elements10.listIterator();
        boolean boolean13 = elements10.equals((java.lang.Object) 1.0d);
        java.lang.String str14 = elements10.text();
        org.jsoup.select.Elements elements16 = elements10.wrap("#root");
        org.jsoup.select.Elements elements18 = elements16.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements20 = elements16.html("#text");
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str23 = document22.id();
        java.lang.String str24 = document22.baseUri();
        org.jsoup.nodes.Element element25 = document22.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = document22.dataset();
        boolean boolean27 = elements16.add((org.jsoup.nodes.Element) document22);
        int int28 = document22.elementSiblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = matchesOwn1.matches((org.jsoup.nodes.Element) document3, (org.jsoup.nodes.Element) document22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(elementItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream9);
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream14);
        java.io.InputStream inputStream16 = keyVal15.inputStream();
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        org.jsoup.Connection connection19 = httpConnection17.sslSocketFactory(sSLSocketFactory18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        org.jsoup.Connection connection21 = httpConnection17.sslSocketFactory(sSLSocketFactory20);
        org.jsoup.Connection.Request request22 = httpConnection17.request();
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request24 = httpConnection23.request();
        org.jsoup.Connection.Request request27 = request24.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = request27.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = request27.cookies();
        org.jsoup.Connection connection30 = httpConnection17.headers(strMap29);
        java.io.InputStream inputStream33 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream36 = new org.jsoup.internal.ConstrainableInputStream(inputStream33, 1, (int) (byte) 0);
        org.jsoup.Connection connection37 = httpConnection17.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream36);
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = keyVal15.inputStream((java.io.InputStream) constrainableInputStream36);
        constrainableInputStream36.skipNBytes(0L);
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = keyVal10.inputStream((java.io.InputStream) constrainableInputStream36);
        byte[] byteArray43 = new byte[] { (byte) 100 };
        int int46 = constrainableInputStream36.read(byteArray43, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = constrainableInputStream3.read(byteArray43);
            org.junit.Assert.fail("Expected exception of type java.net.SocketTimeoutException; message: Read timeout");
        } catch (java.net.SocketTimeoutException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNotNull(keyVal41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection3 = httpConnection0.url(":lt(52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: :lt(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements8.listIterator();
        org.jsoup.select.Elements elements11 = elements8.empty();
        boolean boolean12 = attributes4.equals((java.lang.Object) elements8);
        org.jsoup.select.Elements elements13 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements8);
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 1);
        org.jsoup.nodes.Entities.EscapeMode escapeMode4 = org.jsoup.nodes.Entities.EscapeMode.extended;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.escapeMode(escapeMode4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(outputSettings3);
        org.junit.Assert.assertTrue("'" + escapeMode4 + "' != '" + org.jsoup.nodes.Entities.EscapeMode.extended + "'", escapeMode4.equals(org.jsoup.nodes.Entities.EscapeMode.extended));
        org.junit.Assert.assertNotNull(outputSettings5);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jsoup.nodes.Document.OutputSettings outputSettings1 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean2 = outputSettings1.outline();
        int int3 = outputSettings1.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax4 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings1.syntax(syntax4);
        java.nio.charset.Charset charset6 = outputSettings5.charset();
        java.lang.String str7 = org.jsoup.nodes.Entities.escape("", outputSettings5);
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = outputSettings5.indentAmount((int) (short) 10);
        int int10 = outputSettings5.indentAmount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + syntax4 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax4.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings5);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(outputSettings9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method9 = request4.method();
        org.jsoup.Connection.Method method10 = request4.method();
        org.jsoup.Connection.Request request13 = request4.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection.Request request16 = request13.addHeader("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", "                                   ");
        org.jsoup.Connection.Method method17 = request16.method();
        java.lang.String str18 = request16.requestBody();
        java.util.List<java.lang.String> strList20 = request16.headers("[]");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertTrue("'" + method17 + "' != '" + org.jsoup.Connection.Method.GET + "'", method17.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        org.jsoup.nodes.DataNode dataNode15 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        java.lang.String str16 = dataNode15.getWholeData();
        org.jsoup.nodes.DataNode dataNode18 = dataNode15.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.LeafNode[] leafNodeArray19 = new org.jsoup.nodes.LeafNode[] { dataNode18 };
        org.jsoup.nodes.LeafNode[] leafNodeArray20 = parseErrorList1.toArray(leafNodeArray19);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator21 = parseErrorList1.spliterator();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dataNode15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#text" + "'", str16, "#text");
        org.junit.Assert.assertNotNull(dataNode18);
        org.junit.Assert.assertNotNull(leafNodeArray19);
        org.junit.Assert.assertNotNull(leafNodeArray20);
        org.junit.Assert.assertNotNull(parseErrorSpliterator21);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.lang.String str2 = response1.statusMessage();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = response1.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        boolean boolean8 = response1.hasCookie(":last-child");
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((java.lang.Object) 1);
        java.lang.String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        java.lang.String str15 = document4.title();
        org.jsoup.nodes.Node node16 = document4.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = node16.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.KeyVal[] keyValArray17 = new org.jsoup.Connection.KeyVal[] { keyVal16 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList18 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList18, keyValArray17);
        org.jsoup.Connection connection20 = connection13.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = connection13.get();
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
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyValArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        boolean boolean14 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        java.lang.String str15 = elements3.toString();
        org.jsoup.parser.ParseError[] parseErrorArray16 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList17 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList17, parseErrorArray16);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType21 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str24 = document23.className();
        java.lang.String str25 = document23.outerHtml();
        boolean boolean27 = document23.hasSameValue((java.lang.Object) 1);
        java.lang.String str28 = document23.tagName();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element32 = document30.val("hi!");
        boolean boolean33 = isNthLastOfType21.matches((org.jsoup.nodes.Element) document23, element32);
        java.lang.String str34 = document23.wholeText();
        int int35 = parseErrorList17.indexOf((java.lang.Object) document23);
        boolean boolean36 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList17);
        org.jsoup.select.Elements elements38 = elements3.wrap("application/x-www-form-urlencoded");
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
        org.junit.Assert.assertNotNull(parseErrorArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements38);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        java.lang.String str9 = request7.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request11 = request7.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList8.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList8.parallelStream();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements14.listIterator();
        org.jsoup.select.Elements elements17 = elements14.empty();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.select.Elements elements23 = elements21.prev("#text");
        boolean boolean24 = elements21.hasText();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements28.listIterator();
        org.jsoup.select.Elements elements31 = elements28.empty();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        boolean boolean38 = elements35.equals((java.lang.Object) 1.0d);
        java.lang.String str39 = elements35.text();
        org.jsoup.select.Elements elements41 = elements35.wrap("#root");
        org.jsoup.select.Elements[] elementsArray42 = new org.jsoup.select.Elements[] { elements14, elements21, elements28, elements41 };
        org.jsoup.select.Elements[] elementsArray43 = parseErrorList8.toArray(elementsArray42);
        int int44 = elements3.indexOf((java.lang.Object) parseErrorList8);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator45 = parseErrorList8.spliterator();
        parseErrorList8.trimToSize();
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
        org.junit.Assert.assertNotNull(parseErrorSpliterator45);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        // The following exception was thrown during execution in test generation
        try {
            long long41 = constrainableInputStream29.skip((long) 10);
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
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request25 = httpConnection24.request();
        org.jsoup.Connection connection27 = httpConnection24.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        org.jsoup.Connection connection30 = httpConnection28.sslSocketFactory(sSLSocketFactory29);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        org.jsoup.Connection connection32 = httpConnection28.sslSocketFactory(sSLSocketFactory31);
        org.jsoup.Connection.Request request33 = httpConnection28.request();
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request35 = httpConnection34.request();
        org.jsoup.Connection.Request request38 = request35.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = request38.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = request38.cookies();
        org.jsoup.Connection connection41 = httpConnection28.headers(strMap40);
        org.jsoup.Connection connection42 = httpConnection24.data(strMap40);
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
        org.jsoup.Connection connection74 = httpConnection24.data("[:eq(-1)!=#doctype]", ":contains(content-encoding)", (java.io.InputStream) constrainableInputStream69);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection76 = httpConnection0.data("<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>", "", (java.io.InputStream) constrainableInputStream69, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
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
        org.junit.Assert.assertNotNull(connection74);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.className();
        java.lang.String str5 = document2.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element7 = document2.text("");
        java.lang.String str8 = document2.cssSelector();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor14 = elements13.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements13.listIterator();
        org.jsoup.select.Elements elements17 = elements13.next("#text");
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor19 = parseErrorList18.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream20 = parseErrorList18.parallelStream();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str23 = document22.id();
        org.jsoup.select.Elements elements24 = document22.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor25 = elements24.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor26 = elements24.listIterator();
        org.jsoup.select.Elements elements27 = elements24.empty();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str30 = document29.id();
        org.jsoup.select.Elements elements31 = document29.previousElementSiblings();
        org.jsoup.select.Elements elements33 = elements31.prev("#text");
        boolean boolean34 = elements31.hasText();
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str37 = document36.id();
        org.jsoup.select.Elements elements38 = document36.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor39 = elements38.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor40 = elements38.listIterator();
        org.jsoup.select.Elements elements41 = elements38.empty();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str44 = document43.id();
        org.jsoup.select.Elements elements45 = document43.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor46 = elements45.listIterator();
        boolean boolean48 = elements45.equals((java.lang.Object) 1.0d);
        java.lang.String str49 = elements45.text();
        org.jsoup.select.Elements elements51 = elements45.wrap("#root");
        org.jsoup.select.Elements[] elementsArray52 = new org.jsoup.select.Elements[] { elements24, elements31, elements38, elements51 };
        org.jsoup.select.Elements[] elementsArray53 = parseErrorList18.toArray(elementsArray52);
        int int54 = elements13.indexOf((java.lang.Object) parseErrorList18);
        java.util.List<org.jsoup.nodes.Node> nodeList55 = org.jsoup.parser.Parser.parseFragment("amultipart", (org.jsoup.nodes.Element) document2, ":first-of-type", parseErrorList18);
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elementItor14);
        org.junit.Assert.assertNotNull(elementItor15);
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseErrorItor19);
        org.junit.Assert.assertNotNull(parseErrorStream20);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(elementItor25);
        org.junit.Assert.assertNotNull(elementItor26);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(elementItor39);
        org.junit.Assert.assertNotNull(elementItor40);
        org.junit.Assert.assertNotNull(elements41);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(elementItor46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elementsArray52);
        org.junit.Assert.assertNotNull(elementsArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(nodeList55);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "#doctype");
        org.jsoup.nodes.Document document4 = document3.normalise();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = org.jsoup.parser.Parser.parseFragment("[:eq(-1)!=#doctype]", (org.jsoup.nodes.Element) document3, " ");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax3 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.syntax(syntax3);
        java.nio.charset.Charset charset5 = outputSettings4.charset();
        boolean boolean6 = outputSettings4.outline();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + syntax3 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax3.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request22 = httpConnection21.request();
        org.jsoup.Connection.Request request25 = request22.addHeader("multipart/form-data", "hi!");
        boolean boolean27 = request25.hasHeader("multipart/form-data");
        boolean boolean29 = request25.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method30 = request25.method();
        org.jsoup.Connection.Method method31 = request25.method();
        org.jsoup.Connection.Request request34 = request25.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection connection35 = httpConnection0.request(request25);
        org.jsoup.Connection connection37 = connection35.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
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
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + method30 + "' != '" + org.jsoup.Connection.Method.GET + "'", method30.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding");
        java.lang.String str5 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Encoding" + "'", str5, "Content-Encoding");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element6 = document1.text("");
        org.jsoup.select.Elements elements8 = element6.getElementsContainingText("multipart");
        boolean boolean10 = element6.hasClass(":eq(-1)");
        boolean boolean12 = element6.hasClass("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = document1.dataNodes();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan7 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType10 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        org.jsoup.nodes.Element element15 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType10, (org.jsoup.nodes.Element) document12);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.className();
        java.lang.String str19 = document17.outerHtml();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str22 = document21.id();
        java.lang.String str23 = document21.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan25 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean26 = document21.is((org.jsoup.select.Evaluator) indexLessThan25);
        boolean boolean27 = isNthLastOfType10.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document21);
        java.lang.String str28 = document21.cssSelector();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str31 = document30.className();
        java.lang.String str32 = document30.outerHtml();
        boolean boolean34 = document30.hasSameValue((java.lang.Object) 1);
        boolean boolean35 = indexLessThan7.matches((org.jsoup.nodes.Element) document21, (org.jsoup.nodes.Element) document30);
        org.jsoup.nodes.Document.QuirksMode quirksMode36 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document37 = document30.quirksMode(quirksMode36);
        org.jsoup.select.Elements elements40 = document37.getElementsByAttributeValueMatching("multipart/form-data", "hi!");
        java.util.Set<java.lang.String> strSet41 = document37.classNames();
        org.jsoup.nodes.Element element42 = document1.appendTo((org.jsoup.nodes.Element) document37);
        java.lang.String str43 = document37.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertNull(element15);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str32, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + quirksMode36 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode36.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>" + "'", str43, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr(" ");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList1.parallelStream();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType16 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str19 = document18.className();
        java.lang.String str20 = document18.outerHtml();
        boolean boolean22 = document18.hasSameValue((java.lang.Object) 1);
        java.lang.String str23 = document18.tagName();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element27 = document25.val("hi!");
        boolean boolean28 = isNthLastOfType16.matches((org.jsoup.nodes.Element) document18, element27);
        java.lang.String str29 = document18.wholeText();
        org.jsoup.nodes.Attributes attributes30 = document18.attributes();
        int int31 = parseErrorList1.indexOf((java.lang.Object) document18);
        java.lang.String str32 = document18.data();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorStream13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream1 = parseErrorList0.stream();
        parseErrorList0.ensureCapacity(10);
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorStream1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("SYSTEM");
        java.util.regex.Pattern pattern3 = null;
        org.jsoup.select.Elements elements4 = document1.getElementsByAttributeValueMatching("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", pattern3);
        org.jsoup.select.Elements elements6 = elements4.addClass(":contains(content-encoding)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", ":eq(-1)");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = comment2.asXmlDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [1, -1) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.net.Proxy proxy2 = request1.proxy();
        java.lang.String str3 = request1.requestBody();
        org.jsoup.Connection.Request request5 = request1.removeCookie("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = request1.hasHeaderWithValue("", "Content-Encoding=\"#root\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.simpleText();
        org.jsoup.safety.Cleaner cleaner1 = new org.jsoup.safety.Cleaner(whitelist0);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean13 = org.jsoup.internal.StringUtil.in("", strArray12);
        boolean boolean14 = org.jsoup.internal.StringUtil.in("", strArray12);
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) strArray12);
        boolean boolean16 = org.jsoup.internal.StringUtil.inSorted(" hi!=\"multipart/form-data\"", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist17 = whitelist0.removeProtocols("#doctype", "Content-Encoding=#declaration", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot remove a protocol that is not set.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.formatAsBlock();
        java.lang.String str4 = tag1.normalName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        boolean boolean48 = element43.is("#document");
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList3 = document1.siblingNodes();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve("[public=<!#root!>]", ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.nodes.Document document8 = document7.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements10 = document8.getElementsByClass("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.wholeText();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.className();
        boolean boolean10 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document5, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document11 = document5.clone();
        document11.setBaseUri("#root");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType16 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str19 = document18.className();
        java.lang.String str20 = document18.outerHtml();
        boolean boolean22 = document18.hasSameValue((java.lang.Object) 1);
        java.lang.String str23 = document18.tagName();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element27 = document25.val("hi!");
        boolean boolean28 = isNthLastOfType16.matches((org.jsoup.nodes.Element) document18, element27);
        boolean boolean29 = isOnlyChild0.matches((org.jsoup.nodes.Element) document11, (org.jsoup.nodes.Element) document18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = document18.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        java.lang.String str9 = request4.requestBody();
        org.jsoup.parser.Parser parser10 = request4.parser();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        boolean boolean27 = keyVal3.hasInputStream();
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.indentAmount(1);
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = outputSettings0.prettyPrint(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(outputSettings6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.safety.Whitelist whitelist4 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean5 = org.jsoup.Jsoup.isValid("hi!", whitelist4);
        org.jsoup.safety.Whitelist whitelist8 = whitelist4.removeEnforcedAttribute("Content-Encoding", "#root");
        java.lang.String str9 = org.jsoup.Jsoup.clean("", whitelist8);
        org.jsoup.parser.TokenQueue tokenQueue12 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String[] strArray17 = new java.lang.String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        java.lang.String str18 = tokenQueue12.consumeToAny(strArray17);
        org.jsoup.safety.Whitelist whitelist19 = whitelist8.removeAttributes("multipart", strArray17);
        java.lang.String str20 = org.jsoup.Jsoup.clean(":lt(52)", ":lt(52)", whitelist8);
        org.junit.Assert.assertNotNull(whitelist4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(whitelist8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(whitelist19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ":lt(52)" + "'", str20, ":lt(52)");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int[] intArray4 = new int[] { 100, 'm', 10 };
        int int5 = org.jsoup.nodes.Entities.codepointsForName("PUBLIC", intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 109, 10]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.nodes.Document document8 = document7.normalise();
        int int9 = document8.childNodeSize();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("<!#root!>");
        boolean boolean14 = textNode10.hasAttr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#text" + "'", str6, "#text");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("[]", "#text");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList3 = document2.dataNodes();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(dataNodeList3);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType3 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.className();
        java.lang.String str7 = document5.outerHtml();
        boolean boolean9 = document5.hasSameValue((java.lang.Object) 1);
        java.lang.String str10 = document5.tagName();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element14 = document12.val("hi!");
        boolean boolean15 = isNthLastOfType3.matches((org.jsoup.nodes.Element) document5, element14);
        java.lang.String str16 = document5.wholeText();
        org.jsoup.nodes.Element element18 = document5.removeClass("#root=\"\"");
        org.jsoup.nodes.Element element19 = element18.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements20 = org.jsoup.select.Selector.select("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", element19);
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>?    <head>?        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">?    </head>?    <body>hi!</body>?</html>?': unexpected token at '<html>?    <head>?        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">?    </head>?    <body>hi!</body>?</html>?'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str7, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#root" + "'", str10, "#root");
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element19);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element2 = document1.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element2);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) 'm', (int) (byte) 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        org.jsoup.select.Elements elements5 = element4.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = attributes0.clone();
        org.jsoup.parser.ParseSettings parseSettings4 = new org.jsoup.parser.ParseSettings(false, true);
        boolean boolean5 = parseSettings4.preserveTagCase();
        int int6 = attributes0.deduplicate(parseSettings4);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor7 = attributes0.iterator();
        java.lang.String str8 = attributes0.html();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(attributeItor7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        org.jsoup.nodes.Attribute attribute5 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute6 = attribute3.clone();
        org.jsoup.nodes.Attribute attribute7 = attribute3.clone();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attribute5);
        org.junit.Assert.assertNotNull(attribute6);
        org.junit.Assert.assertNotNull(attribute7);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        java.lang.String str9 = request7.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request7.cookies();
        java.util.List<java.lang.String> strList12 = request7.headers("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.select.Evaluator evaluator1 = org.jsoup.select.QueryParser.parse("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(evaluator1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) 'u');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.select.Elements elements9 = document7.getElementsByIndexLessThan(0);
        java.lang.String str10 = document7.text();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.nodes.Node node9 = document1.attr("#text", "");
        org.jsoup.nodes.Element element10 = document1.shallowClone();
        org.jsoup.select.NodeFilter nodeFilter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document1.filter(nodeFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.listIterator();
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request5 = httpConnection4.request();
        org.jsoup.Connection.Request request8 = request5.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method9 = request5.method();
        int int10 = parseErrorList1.indexOf((java.lang.Object) request5);
        java.net.URL uRL11 = request5.url();
        org.jsoup.Connection.Request request14 = request5.header("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", "multipart/form-data");
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(request14);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse(inputStream0, "", "#root", parser3);
        org.jsoup.parser.ParseErrorList parseErrorList5 = parser3.getErrors();
        org.jsoup.parser.ParseErrorList parseErrorList6 = parser3.getErrors();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Parser parser8 = parser3.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder7);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertNotNull(parser8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType7 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str10 = document9.id();
        org.jsoup.select.Elements elements11 = document9.previousElementSiblings();
        org.jsoup.nodes.Element element12 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType7, (org.jsoup.nodes.Element) document9);
        boolean boolean13 = document1.is((org.jsoup.select.Evaluator) isNthLastOfType7);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element17 = document15.html("Content-Encoding");
        org.jsoup.select.Elements elements18 = org.jsoup.select.Selector.select((org.jsoup.select.Evaluator) isNthLastOfType7, (org.jsoup.nodes.Element) document15);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNull(element12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(elements18);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        java.util.Map<java.lang.String, java.lang.String> strMap19 = request15.cookies();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str17 = document16.id();
        org.jsoup.select.Elements elements18 = document16.previousElementSiblings();
        org.jsoup.select.Elements elements20 = elements18.prev("#text");
        org.jsoup.select.Elements elements22 = elements20.prev("#root");
        org.jsoup.parser.ParseError[] parseErrorArray23 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList24 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList24, parseErrorArray23);
        org.jsoup.parser.ParseErrorList parseErrorList26 = org.jsoup.parser.ParseErrorList.noTracking();
        int int27 = parseErrorList24.indexOf((java.lang.Object) parseErrorList26);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList24.iterator();
        boolean boolean29 = elements20.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList24);
        org.jsoup.parser.ParseError parseError30 = null;
        boolean boolean31 = parseErrorList24.add(parseError30);
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.nodes.Attribute attribute35 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes34);
        java.lang.String str36 = attribute35.getValue();
        java.lang.String str38 = attribute35.setValue("#root");
        java.lang.String str39 = attribute35.getKey();
        boolean boolean40 = parseErrorList24.equals((java.lang.Object) attribute35);
        boolean boolean41 = elements5.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList24);
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str45 = document44.id();
        org.jsoup.select.Elements elements46 = document44.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor47 = elements46.listIterator();
        boolean boolean49 = elements46.equals((java.lang.Object) 1.0d);
        java.lang.String str50 = elements46.text();
        org.jsoup.nodes.Element element52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList54 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList55 = org.jsoup.parser.Parser.parseFragment("", element52, "", parseErrorList54);
        boolean boolean56 = parseErrorList54.isEmpty();
        int int57 = parseErrorList54.size();
        org.jsoup.parser.ParseErrorList parseErrorList58 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor59 = parseErrorList58.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream60 = parseErrorList58.parallelStream();
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str63 = document62.id();
        org.jsoup.select.Elements elements64 = document62.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor65 = elements64.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor66 = elements64.listIterator();
        org.jsoup.select.Elements elements67 = elements64.empty();
        org.jsoup.nodes.Document document69 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str70 = document69.id();
        org.jsoup.select.Elements elements71 = document69.previousElementSiblings();
        org.jsoup.select.Elements elements73 = elements71.prev("#text");
        boolean boolean74 = elements71.hasText();
        org.jsoup.nodes.Document document76 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str77 = document76.id();
        org.jsoup.select.Elements elements78 = document76.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor79 = elements78.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor80 = elements78.listIterator();
        org.jsoup.select.Elements elements81 = elements78.empty();
        org.jsoup.nodes.Document document83 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str84 = document83.id();
        org.jsoup.select.Elements elements85 = document83.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor86 = elements85.listIterator();
        boolean boolean88 = elements85.equals((java.lang.Object) 1.0d);
        java.lang.String str89 = elements85.text();
        org.jsoup.select.Elements elements91 = elements85.wrap("#root");
        org.jsoup.select.Elements[] elementsArray92 = new org.jsoup.select.Elements[] { elements64, elements71, elements78, elements91 };
        org.jsoup.select.Elements[] elementsArray93 = parseErrorList58.toArray(elementsArray92);
        boolean boolean94 = parseErrorList54.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList58);
        boolean boolean95 = elements46.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList58);
        boolean boolean96 = parseErrorList24.addAll((int) (byte) 0, (java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList58);
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
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(parseErrorArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#root" + "'", str36, "#root");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#root" + "'", str38, "#root");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Content-Encoding" + "'", str39, "Content-Encoding");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(elements46);
        org.junit.Assert.assertNotNull(elementItor47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(parseErrorList54);
        org.junit.Assert.assertNotNull(nodeList55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(parseErrorList58);
        org.junit.Assert.assertNotNull(parseErrorItor59);
        org.junit.Assert.assertNotNull(parseErrorStream60);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(elementItor65);
        org.junit.Assert.assertNotNull(elementItor66);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(elements71);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(elements78);
        org.junit.Assert.assertNotNull(elementItor79);
        org.junit.Assert.assertNotNull(elementItor80);
        org.junit.Assert.assertNotNull(elements81);
        org.junit.Assert.assertNotNull(document83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(elements85);
        org.junit.Assert.assertNotNull(elementItor86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(elements91);
        org.junit.Assert.assertNotNull(elementsArray92);
        org.junit.Assert.assertNotNull(elementsArray93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.Matches matches1 = new org.jsoup.select.Evaluator.Matches(pattern0);
        java.lang.String str2 = matches1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matches(null)" + "'", str2, ":matches(null)");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((java.lang.Object) 1);
        java.lang.String str6 = document1.tagName();
        org.jsoup.nodes.Element element7 = document1.head();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "multipart/form-data");
        org.jsoup.nodes.Element element11 = document1.prependChild((org.jsoup.nodes.Node) document10);
        java.lang.String str12 = document10.nodeName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#document" + "'", str12, "#document");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("", "#root=\"\"");
        org.jsoup.nodes.Node node3 = document2.nextSibling();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.wholeText();
        org.jsoup.select.Elements elements7 = document5.parents();
        org.jsoup.nodes.Element element9 = document5.appendElement("#root=\"\"");
        org.jsoup.nodes.Element element10 = element9.empty();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = document2.before((org.jsoup.nodes.Node) element10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(element10);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.safety.Whitelist whitelist1 = new org.jsoup.safety.Whitelist();
        org.jsoup.safety.Whitelist whitelist3 = whitelist1.preserveRelativeLinks(true);
        boolean boolean4 = org.jsoup.Jsoup.isValid(":last-of-type", whitelist3);
        org.junit.Assert.assertNotNull(whitelist3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Element element4 = document1.body();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        attributes6.removeIgnoreCase("#comment");
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.safety.Whitelist whitelist2 = org.jsoup.safety.Whitelist.none();
        boolean boolean3 = org.jsoup.Jsoup.isValid("hi!", whitelist2);
        boolean boolean4 = org.jsoup.Jsoup.isValid("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", whitelist2);
        org.junit.Assert.assertNotNull(whitelist2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.nodes.TextNode textNode1 = org.jsoup.nodes.TextNode.createFromEncoded("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"");
        org.junit.Assert.assertNotNull(textNode1);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        tokenQueue1.addFirst((java.lang.Character) 'a');
        java.lang.String str4 = tokenQueue1.consumeTagName();
        java.lang.String str5 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "amultipart" + "'", str4, "amultipart");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/form-data" + "'", str5, "/form-data");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        org.jsoup.Connection.Request request22 = request19.addHeader("#document", " hi!=\"multipart/form-data\"");
        org.jsoup.Connection.Request request25 = request22.proxy("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", (int) (byte) 100);
        boolean boolean27 = request22.hasCookie("SYSTEM");
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
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.io.InputStream inputStream0 = null;
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request4 = httpConnection3.request();
        org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        boolean boolean9 = request7.hasHeader("multipart/form-data");
        boolean boolean11 = request7.hasCookie("#text");
        org.jsoup.parser.Parser parser12 = request7.parser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        org.jsoup.nodes.Document document14 = document13.normalise();
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements10 = elements8.toggleClass("Content-Type");
        boolean boolean11 = elements10.isEmpty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        org.jsoup.nodes.TextNode textNode4 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node6 = textNode4.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node8 = textNode4.removeAttr("#document");
        int int9 = parseErrorList0.lastIndexOf((java.lang.Object) node8);
        java.lang.Object[] objArray10 = parseErrorList0.toArray();
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements6 = elements3.prev();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith("#comment");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes1 = attributes0.clone();
        attributes1.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.wholeText();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.className();
        boolean boolean13 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document11);
        org.jsoup.nodes.Document document14 = document8.clone();
        boolean boolean15 = attributes1.equals((java.lang.Object) document14);
        boolean boolean16 = attributes1.isEmpty();
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        org.jsoup.select.Elements elements36 = elements34.prev("#doctype");
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
        org.junit.Assert.assertNotNull(elements36);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsContainingOwnText("[]");
        org.jsoup.nodes.Element element10 = document1.tagName("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String str11 = document1.html();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        org.jsoup.nodes.Node node16 = document15.parent();
        org.jsoup.select.Elements elements17 = document15.children();
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
        org.junit.Assert.assertNotNull(elements17);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsContainingOwnText("[]");
        org.jsoup.select.Elements elements10 = elements8.not("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        boolean boolean6 = elements3.hasText();
        org.jsoup.select.Elements elements7 = elements3.empty();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#document", "#data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#root");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#document", "[public=<!#root!>]");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        int int1 = attributes0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.nodes.Element element12 = document4.tagName("#root");
        java.lang.String str13 = element12.tagName();
        org.jsoup.nodes.Node node14 = element12.clone();
        java.lang.String[] strArray42 = new java.lang.String[] { "<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>", "[public=<!#root!>]", "                                   ", " hi!=\"multipart/form-data\"", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#doctype", ":gt(35)", ":last-child", ":contains(content-encoding)", "#root", "Content-Encoding", ":first-child", "[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]", "multipart/form-data", ":only-child", "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!", ":first-child", ":only-child", ":lt(52)", "[]", "application/x-www-form-urlencoded", "<!#root!>", "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n", "SYSTEM", "SYSTEM", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        org.jsoup.nodes.Element element45 = element12.classNames((java.util.Set<java.lang.String>) strSet43);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#root" + "'", str13, "#root");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.canContainBlock();
        boolean boolean4 = tag1.isFormSubmittable();
        java.lang.String str5 = tag1.normalName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#document" + "'", str5, "#document");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.select.Elements elements7 = document1.getElementsMatchingText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = document1.dataNodes();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node11 = textNode9.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node13 = textNode9.removeAttr("#document");
        org.jsoup.nodes.Element element14 = document1.prependChild(node13);
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        attributes15.normalize();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#text");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.id();
        org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        org.jsoup.nodes.Element element11 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.className();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.id();
        java.lang.String str19 = document17.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean22 = document17.is((org.jsoup.select.Evaluator) indexLessThan21);
        boolean boolean23 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document17);
        java.lang.String str24 = document17.cssSelector();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.className();
        java.lang.String str28 = document26.outerHtml();
        boolean boolean30 = document26.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = indexLessThan3.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document26);
        org.jsoup.parser.Parser parser32 = document17.parser();
        java.lang.String str33 = document17.val();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType36 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str39 = document38.className();
        java.lang.String str40 = document38.outerHtml();
        boolean boolean42 = document38.hasSameValue((java.lang.Object) 1);
        java.lang.String str43 = document38.tagName();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element47 = document45.val("hi!");
        boolean boolean48 = isNthLastOfType36.matches((org.jsoup.nodes.Element) document38, element47);
        boolean boolean49 = tag1.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document38);
        org.jsoup.nodes.Element element52 = document38.attr(":last-child", false);
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
        org.junit.Assert.assertNotNull(element52);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        // The following exception was thrown during execution in test generation
        try {
            int int51 = constrainableInputStream45.read();
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request4.headers();
        boolean boolean8 = request4.hasCookie(":last-child");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve(" ", ":gt(35)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean23 = org.jsoup.internal.StringUtil.in("", strArray22);
        boolean boolean24 = org.jsoup.internal.StringUtil.in("", strArray22);
        java.lang.String str26 = org.jsoup.internal.StringUtil.join(strArray22, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection27 = httpConnection0.data(strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!" + "'", str26, "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.nodes.DataNode dataNode1 = new org.jsoup.nodes.DataNode("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.Attributes attributes2 = dataNode1.attributes();
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot2 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        java.lang.String str6 = document4.baseUri();
        org.jsoup.nodes.Element element9 = document4.attr("", true);
        org.jsoup.nodes.Node node12 = document4.attr("#text", "");
        org.jsoup.nodes.Element element13 = document4.shallowClone();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.id();
        java.lang.String str17 = document15.baseUri();
        org.jsoup.nodes.Element element18 = document15.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = document15.dataset();
        org.jsoup.nodes.Element element21 = document15.html("#root=\"\"");
        boolean boolean22 = attributeWithValueNot2.matches(element13, (org.jsoup.nodes.Element) document15);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("multipart/form-data");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str7 = textNode2.attr("multipart");
        java.lang.String str9 = textNode2.absUrl("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean10 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) '#', (int) (short) 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str3 = tokenQueue1.chompTo("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String str4 = tokenQueue1.consumeCssIdentifier();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data" + "'", str3, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.select.Evaluator.TagEndsWith tagEndsWith1 = new org.jsoup.select.Evaluator.TagEndsWith(":lt(52)");
        java.lang.String str2 = tagEndsWith1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":lt(52)" + "'", str2, ":lt(52)");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        org.jsoup.Connection.Response response7 = response4.charset("PUBLIC");
        org.jsoup.Connection.Method method8 = response7.method();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.select.Elements elements6 = elements5.prev();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType32 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str35 = document34.wholeText();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str38 = document37.className();
        boolean boolean39 = isNthLastOfType32.matches((org.jsoup.nodes.Element) document34, (org.jsoup.nodes.Element) document37);
        org.jsoup.nodes.Document document40 = document34.clone();
        java.lang.String str41 = document34.title();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str44 = document43.id();
        java.lang.String str45 = document43.baseUri();
        org.jsoup.nodes.Element element48 = document43.attr("", true);
        org.jsoup.nodes.Node node51 = document43.attr("#text", "");
        org.jsoup.nodes.Document.QuirksMode quirksMode52 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document53 = document43.quirksMode(quirksMode52);
        boolean boolean54 = indexLessThan1.matches((org.jsoup.nodes.Element) document34, (org.jsoup.nodes.Element) document43);
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan56 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType59 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str62 = document61.id();
        org.jsoup.select.Elements elements63 = document61.previousElementSiblings();
        org.jsoup.nodes.Element element64 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType59, (org.jsoup.nodes.Element) document61);
        org.jsoup.nodes.Document document66 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str67 = document66.className();
        java.lang.String str68 = document66.outerHtml();
        org.jsoup.nodes.Document document70 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str71 = document70.id();
        java.lang.String str72 = document70.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan74 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean75 = document70.is((org.jsoup.select.Evaluator) indexLessThan74);
        boolean boolean76 = isNthLastOfType59.matches((org.jsoup.nodes.Element) document66, (org.jsoup.nodes.Element) document70);
        java.lang.String str77 = document70.cssSelector();
        org.jsoup.nodes.Document document79 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str80 = document79.className();
        java.lang.String str81 = document79.outerHtml();
        boolean boolean83 = document79.hasSameValue((java.lang.Object) 1);
        boolean boolean84 = indexLessThan56.matches((org.jsoup.nodes.Element) document70, (org.jsoup.nodes.Element) document79);
        org.jsoup.nodes.Document.QuirksMode quirksMode85 = org.jsoup.nodes.Document.QuirksMode.quirks;
        org.jsoup.nodes.Document document86 = document79.quirksMode(quirksMode85);
        org.jsoup.select.Elements elements89 = document86.getElementsByAttributeValueMatching("multipart/form-data", "hi!");
        java.util.Set<java.lang.String> strSet90 = document86.classNames();
        org.jsoup.nodes.Element element91 = document43.classNames(strSet90);
        java.lang.String str92 = document43.nodeName();
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
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNull(element64);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str68, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "#root" + "'", str77, "#root");
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str81, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + quirksMode85 + "' != '" + org.jsoup.nodes.Document.QuirksMode.quirks + "'", quirksMode85.equals(org.jsoup.nodes.Document.QuirksMode.quirks));
        org.junit.Assert.assertNotNull(document86);
        org.junit.Assert.assertNotNull(elements89);
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertNotNull(element91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "#document" + "'", str92, "#document");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.noTracking();
        int int4 = parseErrorList1.indexOf((java.lang.Object) parseErrorList3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError6 = parseErrorList1.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Method method7 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean8 = method7.hasBody();
        org.jsoup.Connection connection9 = httpConnection0.method(method7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = connection9.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertTrue("'" + method7 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method7.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.id();
        java.lang.String str7 = document5.baseUri();
        org.jsoup.nodes.Element element8 = document5.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document5.dataset();
        org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
        org.jsoup.Connection connection13 = httpConnection0.proxy("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a valid URL");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element22 = document20.val("hi!");
        org.jsoup.nodes.Element element23 = document20.clone();
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan25 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) '#');
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parseBodyFragment("");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType30 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str33 = document32.className();
        java.lang.String str34 = document32.outerHtml();
        boolean boolean36 = document32.hasSameValue((java.lang.Object) 1);
        java.lang.String str37 = document32.tagName();
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element41 = document39.val("hi!");
        boolean boolean42 = isNthLastOfType30.matches((org.jsoup.nodes.Element) document32, element41);
        java.lang.String str43 = document32.title();
        org.jsoup.select.Elements elements45 = document32.getElementsMatchingText("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean46 = indexGreaterThan25.matches((org.jsoup.nodes.Element) document27, (org.jsoup.nodes.Element) document32);
        boolean boolean47 = allElements0.matches((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document32);
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
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str34, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#root" + "'", str37, "#root");
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.io.InputStream inputStream3 = null;
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse(inputStream3, "", "#root", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser6);
        org.jsoup.parser.ParseSettings parseSettings9 = parser6.settings();
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf(":first-child", parseSettings9);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        org.jsoup.parser.Parser parser30 = document15.parser();
        org.jsoup.select.Evaluator.IsFirstOfType isFirstOfType31 = new org.jsoup.select.Evaluator.IsFirstOfType();
        java.lang.String str32 = isFirstOfType31.toString();
        boolean boolean33 = document15.is((org.jsoup.select.Evaluator) isFirstOfType31);
        java.lang.String str34 = isFirstOfType31.toString();
        java.lang.String str35 = isFirstOfType31.toString();
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
        org.junit.Assert.assertNull(parser30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":first-of-type" + "'", str32, ":first-of-type");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ":first-of-type" + "'", str34, ":first-of-type");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ":first-of-type" + "'", str35, ":first-of-type");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("Content-Encoding");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        int int6 = document4.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("[]", "#text");
        boolean boolean10 = containsText1.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = document4.after("Content-Encoding=#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(content-encoding)" + "'", str2, ":contains(content-encoding)");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.select.NodeVisitor nodeVisitor0 = null;
        org.jsoup.select.NodeTraversor nodeTraversor1 = new org.jsoup.select.NodeTraversor(nodeVisitor0);
        org.jsoup.nodes.DataNode dataNode4 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        java.lang.String str5 = dataNode4.getWholeData();
        // The following exception was thrown during execution in test generation
        try {
            nodeTraversor1.traverse((org.jsoup.nodes.Node) dataNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.NodeVisitor.head(org.jsoup.nodes.Node, int)\" because \"visitor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataNode4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#text" + "'", str5, "#text");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request38 = httpConnection37.request();
        org.jsoup.Connection connection40 = httpConnection37.referrer("multipart/form-data");
        org.jsoup.Connection.Response response41 = httpConnection37.response();
        org.jsoup.Connection connection43 = httpConnection37.ignoreContentType(false);
        java.io.InputStream inputStream46 = null;
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse(inputStream46, "", "#root", parser49);
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser49);
        org.jsoup.Connection connection52 = connection43.parser(parser49);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse((java.io.InputStream) constrainableInputStream32, "#text", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", parser49);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(connection52);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request22 = httpConnection21.request();
        org.jsoup.Connection.Request request25 = request22.addHeader("multipart/form-data", "hi!");
        boolean boolean27 = request25.hasHeader("multipart/form-data");
        boolean boolean29 = request25.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method30 = request25.method();
        org.jsoup.Connection.Method method31 = request25.method();
        org.jsoup.Connection.Request request34 = request25.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection connection35 = httpConnection0.request(request25);
        org.jsoup.Connection.Method method36 = org.jsoup.Connection.Method.PATCH;
        org.jsoup.Connection.Request request37 = request25.method(method36);
        java.lang.String str38 = request37.requestBody();
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
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + method30 + "' != '" + org.jsoup.Connection.Method.GET + "'", method30.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertTrue("'" + method36 + "' != '" + org.jsoup.Connection.Method.PATCH + "'", method36.equals(org.jsoup.Connection.Method.PATCH));
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragment("amultipart", "Content-Encoding");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("SYSTEM");
        java.lang.String str2 = containsOwnText1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsOwn(system)" + "'", str2, ":containsOwn(system)");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jsoup.select.Evaluator.ContainsOwnText containsOwnText1 = new org.jsoup.select.Evaluator.ContainsOwnText("#declaration");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.parser.Parser parser5 = request4.parser();
        boolean boolean7 = request4.hasCookie("multipart/form-data");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((java.lang.Object) 1);
        java.lang.String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        org.jsoup.select.Elements elements15 = element13.nextElementSiblings();
        java.lang.String str17 = element13.attr("[]");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsContainingOwnText("[]");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str11 = document10.id();
        org.jsoup.select.Elements elements12 = document10.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor13 = elements12.listIterator();
        boolean boolean15 = elements12.equals((java.lang.Object) 1.0d);
        java.lang.String str16 = elements12.text();
        org.jsoup.select.Elements elements18 = elements12.wrap("#root");
        org.jsoup.select.Elements elements20 = elements18.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements22 = elements18.html("#text");
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str25 = document24.id();
        java.lang.String str26 = document24.baseUri();
        org.jsoup.nodes.Element element27 = document24.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = document24.dataset();
        boolean boolean29 = elements18.add((org.jsoup.nodes.Element) document24);
        int int30 = document24.elementSiblingIndex();
        org.jsoup.nodes.Element element31 = document1.prependChild((org.jsoup.nodes.Node) document24);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elementItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements18);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(element31);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean4 = tokenQueue1.consumeWhitespace();
        java.lang.String str6 = tokenQueue1.chompTo("#text");
        boolean boolean8 = tokenQueue1.matchChomp("ultipart");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart/form-data" + "'", str6, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Method method5 = request1.method();
        java.net.Proxy proxy6 = request1.proxy();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = request1.multiHeaders();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + method5 + "' != '" + org.jsoup.Connection.Method.GET + "'", method5.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        org.jsoup.helper.HttpConnection httpConnection4 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request5 = httpConnection4.request();
        org.jsoup.Connection.Request request8 = request5.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = request8.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = request8.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = request8.cookies();
        org.jsoup.Connection connection12 = httpConnection0.data(strMap11);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        java.lang.Object[] objArray6 = elements5.toArray();
        org.jsoup.select.Elements elements7 = elements5.nextAll();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        java.lang.String str10 = document4.className();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection9 = httpConnection0.data("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "Content-Encoding", inputStream7, "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request11 = httpConnection10.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        org.jsoup.Connection connection13 = httpConnection10.sslSocketFactory(sSLSocketFactory12);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.id();
        java.lang.String str17 = document15.baseUri();
        org.jsoup.nodes.Element element18 = document15.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = document15.dataset();
        org.jsoup.Connection connection20 = httpConnection10.cookies(strMap19);
        org.jsoup.Connection connection22 = httpConnection10.ignoreContentType(false);
        org.jsoup.Connection connection25 = connection22.proxy("Content-Encoding=\"#root\"", (int) 'u');
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
        org.jsoup.helper.HttpConnection.KeyVal keyVal42 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.KeyVal[] keyValArray43 = new org.jsoup.Connection.KeyVal[] { keyVal42 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList44 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList44, keyValArray43);
        org.jsoup.Connection connection46 = connection39.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList44);
        org.jsoup.Connection connection47 = connection25.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList44);
        org.jsoup.Connection connection48 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList44);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(keyVal42);
        org.junit.Assert.assertNotNull(keyValArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection48);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor2 = parseErrorList0.iterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList0.stream();
        org.jsoup.parser.ParseErrorList parseErrorList5 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream6 = parseErrorList5.stream();
        boolean boolean7 = parseErrorList0.addAll((int) (short) 0, (java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList5);
        int int8 = parseErrorList0.size();
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorItor2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parseErrorStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.examples.Wikipedia wikipedia0 = new org.jsoup.examples.Wikipedia();
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.Connection.Method method0 = org.jsoup.Connection.Method.POST;
        org.junit.Assert.assertTrue("'" + method0 + "' != '" + org.jsoup.Connection.Method.POST + "'", method0.equals(org.jsoup.Connection.Method.POST));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        java.lang.String str6 = elements3.text();
        java.util.List<org.jsoup.nodes.FormElement> formElementList7 = elements3.forms();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(formElementList7);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.Connection connection8 = httpConnection0.timeout(10);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String[] strArray6 = new java.lang.String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        java.lang.String str7 = tokenQueue1.consumeToAny(strArray6);
        tokenQueue1.addFirst(":containsOwn(system)");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.nodes.DocumentType documentType5 = new org.jsoup.nodes.DocumentType("Content-Type", ":eq(-1)", "                                   ", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", ":nth-last-of-type(100n-1)");
        documentType5.setPubSysKey("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        java.lang.Object obj5 = null;
        boolean boolean6 = document1.hasSameValue(obj5);
        org.jsoup.nodes.Element element8 = document1.appendText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Node node10 = element8.removeAttr("ultipart");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.postDataCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
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
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.lang.String str1 = org.jsoup.nodes.Entities.getByName("Content-Encoding=#declaration");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        boolean boolean8 = attributes0.hasKeyIgnoreCase(":lt(52)");
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str23 = document22.className();
        java.lang.String str24 = document22.outerHtml();
        boolean boolean26 = document22.hasSameValue((java.lang.Object) 1);
        java.lang.String str27 = document22.tagName();
        org.jsoup.nodes.Element element28 = document22.head();
        org.jsoup.nodes.Element element29 = document22.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = document14.appendTo(element29);
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
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str24, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#root" + "'", str27, "#root");
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNull(element29);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("");
        java.lang.String str2 = document1.tagName();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.select.Elements elements12 = document4.getElementsByIndexEquals((int) (short) 10);
        java.lang.String str14 = document4.absUrl(" ");
        org.jsoup.nodes.Element element16 = document4.appendText("#root=\"\"");
        org.jsoup.nodes.Document document17 = document4.normalise();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(document17);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream6 = constrainableInputStream3.timeout((long) ' ', (long) (short) 1);
        constrainableInputStream3.close();
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream10 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream3, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            constrainableInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constrainableInputStream6);
        org.junit.Assert.assertNotNull(constrainableInputStream10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("", strArray8);
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) strArray8);
        org.jsoup.select.Selector.SelectorParseException selectorParseException12 = new org.jsoup.select.Selector.SelectorParseException("#doctype", (java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.lang.String str35 = keyVal34.value();
        org.jsoup.Connection.KeyVal keyVal37 = keyVal34.contentType("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str38 = keyVal37.contentType();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#declaration" + "'", str35, "#declaration");
        org.junit.Assert.assertNotNull(keyVal37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str38, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) (short) 10, (int) 'm');
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.util.List<java.lang.String> strList3 = response1.headers(" hi!=\"multipart/form-data\"");
        org.jsoup.Connection.Response response6 = response1.addHeader("#root", ":gt(35)");
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = document1.dataNodes();
        java.lang.String str6 = document1.nodeName();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "hi!");
        org.jsoup.nodes.Node node11 = textNode9.removeAttr("multipart/form-data");
        org.jsoup.nodes.Node node13 = textNode9.removeAttr("#document");
        org.jsoup.nodes.Element element14 = document1.prependChild(node13);
        org.jsoup.nodes.Attributes attributes15 = element14.attributes();
        java.lang.String str16 = element14.wholeText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!" + "'", str16, "hi!hi!");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        boolean boolean5 = tokenQueue1.matches("");
        java.lang.String str6 = tokenQueue1.consumeWord();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart" + "'", str6, "multipart");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request7 = httpConnection6.request();
        org.jsoup.Connection.Request request10 = request7.addHeader("multipart/form-data", "hi!");
        boolean boolean12 = request10.hasHeader("multipart/form-data");
        boolean boolean14 = request10.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method15 = request10.method();
        org.jsoup.Connection.Request request16 = request4.method(method15);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + method15 + "' != '" + org.jsoup.Connection.Method.GET + "'", method15.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request16);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.safety.Whitelist whitelist0 = org.jsoup.safety.Whitelist.simpleText();
        org.jsoup.parser.TokenQueue tokenQueue3 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str4 = tokenQueue3.toString();
        boolean boolean5 = tokenQueue3.consumeWhitespace();
        java.lang.String str7 = tokenQueue3.consumeTo("multipart");
        tokenQueue3.addFirst("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean18 = org.jsoup.internal.StringUtil.in("", strArray17);
        boolean boolean19 = org.jsoup.internal.StringUtil.in("", strArray17);
        java.lang.String str21 = org.jsoup.internal.StringUtil.join(strArray17, " hi!=\"multipart/form-data\"");
        java.lang.String str22 = tokenQueue3.consumeToAny(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.safety.Whitelist whitelist23 = whitelist0.removeAttributes("Content-Encoding", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(whitelist0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data" + "'", str4, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str21, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.net.Proxy proxy2 = request1.proxy();
        boolean boolean5 = request1.hasHeaderWithValue("Content-Encoding", "hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.util.List<java.lang.String> strList7 = request1.headers(":only-child");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parse(uRL0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        boolean boolean21 = request15.hasHeaderWithValue("application/x-www-form-urlencoded", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jsoup.nodes.DataNode dataNode1 = new org.jsoup.nodes.DataNode("");
        java.lang.String str2 = dataNode1.getWholeData();
        org.jsoup.nodes.Node node4 = dataNode1.removeAttr("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Node node5 = dataNode1.nextSibling();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.removeClass("multipart");
        org.jsoup.select.Elements elements10 = elements8.nextAll("#doctype");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.id();
        java.lang.String str15 = document13.baseUri();
        org.jsoup.nodes.Element element18 = document13.attr("", true);
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document20 = document13.parser(parser19);
        // The following exception was thrown during execution in test generation
        try {
            elements10.add(100, (org.jsoup.nodes.Element) document20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        boolean boolean13 = parseErrorList11.isEmpty();
        int int14 = parseErrorList11.size();
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList15.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList15.parallelStream();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        org.jsoup.select.Elements elements24 = elements21.empty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.select.Elements elements30 = elements28.prev("#text");
        boolean boolean31 = elements28.hasText();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        org.jsoup.select.Elements elements38 = elements35.empty();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str41 = document40.id();
        org.jsoup.select.Elements elements42 = document40.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor43 = elements42.listIterator();
        boolean boolean45 = elements42.equals((java.lang.Object) 1.0d);
        java.lang.String str46 = elements42.text();
        org.jsoup.select.Elements elements48 = elements42.wrap("#root");
        org.jsoup.select.Elements[] elementsArray49 = new org.jsoup.select.Elements[] { elements21, elements28, elements35, elements48 };
        org.jsoup.select.Elements[] elementsArray50 = parseErrorList15.toArray(elementsArray49);
        boolean boolean51 = parseErrorList11.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        boolean boolean52 = elements3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        boolean boolean54 = elements3.hasAttr(":eq(-1)");
        org.jsoup.select.Elements elements56 = elements3.addClass("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements56);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        java.lang.String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor13 = attributes0.iterator();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeItor13);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = connection2.url(":last-child");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: :last-child");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("Content-Encoding=#declaration");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor7 = elements6.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements6.listIterator();
        org.jsoup.select.Elements elements10 = elements6.next("#text");
        boolean boolean11 = tag1.equals((java.lang.Object) "#text");
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag1, "#data");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elementItor7);
        org.junit.Assert.assertNotNull(elementItor8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        org.jsoup.Connection.KeyVal keyVal5 = httpConnection0.data("Content-Encoding=#declaration");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNull(keyVal5);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        org.jsoup.Connection connection23 = httpConnection0.data("#declaration", "Content-Type");
        org.jsoup.Connection.Response response24 = httpConnection0.response();
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
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator();
        java.util.Spliterator<org.jsoup.nodes.Element> elementSpliterator11 = elements3.spliterator();
        org.jsoup.select.Elements elements13 = elements3.html("#document");
        org.jsoup.select.Elements elements15 = elements13.removeAttr("*");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elementSpliterator11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((java.lang.Object) 1);
        java.lang.String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        java.lang.String str15 = document4.wholeText();
        int int16 = document4.siblingIndex();
        java.lang.String str17 = document4.title();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        boolean boolean6 = tag1.isInline();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str3 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        org.jsoup.select.Elements elements10 = pseudoTextElement8.getElementsByIndexEquals((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        org.jsoup.Connection.Request request13 = request4.cookie("#document", "#document");
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.Request request17 = request4.data((org.jsoup.Connection.KeyVal) keyVal16);
        java.lang.String str18 = keyVal16.key();
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection7 = httpConnection0.cookie("multipart", "#doctype");
        org.jsoup.Connection.Response response8 = connection7.response();
        org.jsoup.Connection connection10 = connection7.userAgent("Content-Encoding=\"#root\"");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jsoup.nodes.CDataNode cDataNode1 = new org.jsoup.nodes.CDataNode("#comment");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsContainingOwnText("[]");
        org.jsoup.nodes.Element element10 = document1.tagName("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.select.Elements elements12 = document1.getElementsByTag("multipart");
        org.jsoup.parser.ParseError[] parseErrorArray13 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList14 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14, parseErrorArray13);
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.noTracking();
        int int17 = parseErrorList14.indexOf((java.lang.Object) parseErrorList16);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor18 = parseErrorList14.iterator();
        org.jsoup.parser.ParseError parseError20 = null;
        parseErrorList14.add(0, parseError20);
        int int22 = parseErrorList14.size();
        boolean boolean23 = elements12.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14);
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList14.replaceAll(parseErrorUnaryOperator24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(parseErrorArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        java.lang.String str8 = request4.cookie("#root");
        org.jsoup.Connection.Request request10 = request4.timeout((int) ' ');
        org.jsoup.Connection.Request request12 = request4.removeHeader("[]");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = request12.multiHeaders();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response4.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        org.jsoup.select.Elements elements4 = elements1.attr(":eq(-1)", "[]");
        org.jsoup.select.Elements elements6 = elements1.tagName("Content-Encoding=\"#root\"");
        org.jsoup.select.Elements elements8 = elements1.tagName("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse(inputStream0, "", "#root", parser3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser3.settings();
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parseSettings5);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.nodes.Document document8 = document7.normalise();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = document8.selectFirst("[]");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: String must not be empty");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("");
        org.jsoup.select.Elements elements8 = element4.getElementsContainingText("#text");
        org.jsoup.select.Elements elements10 = elements8.addClass("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        org.jsoup.Connection connection13 = httpConnection11.sslSocketFactory(sSLSocketFactory12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        org.jsoup.Connection connection15 = httpConnection11.sslSocketFactory(sSLSocketFactory14);
        org.jsoup.Connection.Request request16 = httpConnection11.request();
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request18 = httpConnection17.request();
        org.jsoup.Connection.Request request21 = request18.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = request21.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = request21.cookies();
        org.jsoup.Connection connection24 = httpConnection11.headers(strMap23);
        org.jsoup.Connection connection27 = connection24.data("multipart/form-data", "");
        org.jsoup.Connection connection29 = connection24.ignoreContentType(false);
        org.jsoup.helper.HttpConnection httpConnection30 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        org.jsoup.Connection connection32 = httpConnection30.sslSocketFactory(sSLSocketFactory31);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory33 = null;
        org.jsoup.Connection connection34 = httpConnection30.sslSocketFactory(sSLSocketFactory33);
        org.jsoup.Connection.Request request35 = httpConnection30.request();
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request37 = httpConnection36.request();
        org.jsoup.Connection.Request request40 = request37.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = request40.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = request40.cookies();
        org.jsoup.Connection connection43 = httpConnection30.headers(strMap42);
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection.KeyVal[] keyValArray47 = new org.jsoup.Connection.KeyVal[] { keyVal46 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList48 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList48, keyValArray47);
        org.jsoup.Connection connection50 = connection43.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList48);
        org.jsoup.Connection connection51 = connection29.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList48);
        boolean boolean52 = elements10.contains((java.lang.Object) keyValList48);
        org.jsoup.parser.ParseErrorList parseErrorList53 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor54 = parseErrorList53.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream55 = parseErrorList53.parallelStream();
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str58 = document57.id();
        org.jsoup.select.Elements elements59 = document57.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor60 = elements59.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor61 = elements59.listIterator();
        org.jsoup.select.Elements elements62 = elements59.empty();
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str65 = document64.id();
        org.jsoup.select.Elements elements66 = document64.previousElementSiblings();
        org.jsoup.select.Elements elements68 = elements66.prev("#text");
        boolean boolean69 = elements66.hasText();
        org.jsoup.nodes.Document document71 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str72 = document71.id();
        org.jsoup.select.Elements elements73 = document71.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor74 = elements73.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor75 = elements73.listIterator();
        org.jsoup.select.Elements elements76 = elements73.empty();
        org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str79 = document78.id();
        org.jsoup.select.Elements elements80 = document78.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor81 = elements80.listIterator();
        boolean boolean83 = elements80.equals((java.lang.Object) 1.0d);
        java.lang.String str84 = elements80.text();
        org.jsoup.select.Elements elements86 = elements80.wrap("#root");
        org.jsoup.select.Elements[] elementsArray87 = new org.jsoup.select.Elements[] { elements59, elements66, elements73, elements86 };
        org.jsoup.select.Elements[] elementsArray88 = parseErrorList53.toArray(elementsArray87);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream89 = parseErrorList53.stream();
        boolean boolean90 = elements10.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList53);
        org.jsoup.select.Elements elements91 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements10);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request37);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(keyVal46);
        org.junit.Assert.assertNotNull(keyValArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(parseErrorList53);
        org.junit.Assert.assertNotNull(parseErrorItor54);
        org.junit.Assert.assertNotNull(parseErrorStream55);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(elements59);
        org.junit.Assert.assertNotNull(elementItor60);
        org.junit.Assert.assertNotNull(elementItor61);
        org.junit.Assert.assertNotNull(elements62);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(elements66);
        org.junit.Assert.assertNotNull(elements68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertNotNull(elementItor74);
        org.junit.Assert.assertNotNull(elementItor75);
        org.junit.Assert.assertNotNull(elements76);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(elements80);
        org.junit.Assert.assertNotNull(elementItor81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(elements86);
        org.junit.Assert.assertNotNull(elementsArray87);
        org.junit.Assert.assertNotNull(elementsArray88);
        org.junit.Assert.assertNotNull(parseErrorStream89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements4 = elements3.remove();
        org.jsoup.select.Elements elements6 = elements3.val("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.jsoup.select.Elements elements9 = elements3.attr(":matches(null)", "[]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Method method7 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean8 = method7.hasBody();
        org.jsoup.Connection connection9 = httpConnection0.method(method7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser11 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder10);
        org.jsoup.Connection connection12 = httpConnection0.parser(parser11);
        org.jsoup.parser.TreeBuilder treeBuilder13 = parser11.getTreeBuilder();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertTrue("'" + method7 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method7.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(treeBuilder13);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, ":matchesOwn(null)", "*");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList8.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList8.parallelStream();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor15 = elements14.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor16 = elements14.listIterator();
        org.jsoup.select.Elements elements17 = elements14.empty();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        org.jsoup.select.Elements elements23 = elements21.prev("#text");
        boolean boolean24 = elements21.hasText();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor29 = elements28.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor30 = elements28.listIterator();
        org.jsoup.select.Elements elements31 = elements28.empty();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        boolean boolean38 = elements35.equals((java.lang.Object) 1.0d);
        java.lang.String str39 = elements35.text();
        org.jsoup.select.Elements elements41 = elements35.wrap("#root");
        org.jsoup.select.Elements[] elementsArray42 = new org.jsoup.select.Elements[] { elements14, elements21, elements28, elements41 };
        org.jsoup.select.Elements[] elementsArray43 = parseErrorList8.toArray(elementsArray42);
        int int44 = elements3.indexOf((java.lang.Object) parseErrorList8);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator45 = parseErrorList8.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor47 = parseErrorList8.listIterator((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(parseErrorSpliterator45);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str5 = tokenQueue1.chompTo("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str6 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection.Response response6 = response4.removeCookie("SYSTEM");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response4.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.select.Elements elements12 = document4.getElementsByIndexEquals((int) (short) 10);
        org.jsoup.select.Elements elements14 = elements12.before(":containsOwn(system)");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(elements14);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        org.jsoup.nodes.Document.OutputSettings outputSettings3 = outputSettings0.indentAmount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document.OutputSettings outputSettings5 = outputSettings0.charset("#root");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #root");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(outputSettings3);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request4.headers();
        java.net.Proxy proxy7 = request4.proxy();
        org.jsoup.Connection.Request request9 = request4.removeHeader("#doctype");
        java.net.Proxy proxy10 = request9.proxy();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method9 = request4.method();
        org.jsoup.Connection.Method method10 = request4.method();
        org.jsoup.Connection.Request request13 = request4.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection.Request request16 = request13.addHeader("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", "                                   ");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request18 = request16.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request16);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        java.net.URL uRL8 = request7.url();
        int int9 = request7.maxBodySize();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = request7.multiHeaders();
        boolean boolean12 = request7.hasHeader("[public=<!#root!>]");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1048576 + "'", int9 == 1048576);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        java.lang.String str6 = elements5.val();
        org.jsoup.select.Elements elements7 = elements5.nextAll();
        org.jsoup.select.Elements elements9 = elements7.select("SYSTEM");
        java.io.InputStream inputStream11 = null;
        org.jsoup.nodes.Document document14 = org.jsoup.helper.DataUtil.load(inputStream11, "#root=\"\"", "#text");
        // The following exception was thrown during execution in test generation
        try {
            elements7.add(1, (org.jsoup.nodes.Element) document14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection9 = connection6.proxy("multipart", (int) (byte) 1);
        org.jsoup.Connection connection11 = connection6.requestBody("");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.id();
        java.lang.String str5 = document3.baseUri();
        org.jsoup.nodes.Element element8 = document3.attr("", true);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document10 = document3.parser(parser9);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse(":only-child", "Content-Encoding=\"#root\"", parser9);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        org.jsoup.nodes.Attributes attributes4 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes4.clone();
        attributes5.remove("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.PseudoTextElement pseudoTextElement8 = new org.jsoup.nodes.PseudoTextElement(tag1, "#root", attributes5);
        java.util.regex.Pattern pattern10 = null;
        org.jsoup.select.Elements elements11 = pseudoTextElement8.getElementsByAttributeValueMatching("hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!", pattern10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#text");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parse(":matchesOwn(null)");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        org.jsoup.nodes.DataNode dataNode4 = dataNode2.setWholeData("multipart");
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertNotNull(dataNode4);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        boolean boolean13 = parseErrorList11.isEmpty();
        int int14 = parseErrorList11.size();
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList15.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList15.parallelStream();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        org.jsoup.select.Elements elements24 = elements21.empty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.select.Elements elements30 = elements28.prev("#text");
        boolean boolean31 = elements28.hasText();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        org.jsoup.select.Elements elements38 = elements35.empty();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str41 = document40.id();
        org.jsoup.select.Elements elements42 = document40.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor43 = elements42.listIterator();
        boolean boolean45 = elements42.equals((java.lang.Object) 1.0d);
        java.lang.String str46 = elements42.text();
        org.jsoup.select.Elements elements48 = elements42.wrap("#root");
        org.jsoup.select.Elements[] elementsArray49 = new org.jsoup.select.Elements[] { elements21, elements28, elements35, elements48 };
        org.jsoup.select.Elements[] elementsArray50 = parseErrorList15.toArray(elementsArray49);
        boolean boolean51 = parseErrorList11.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        boolean boolean52 = elements3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        boolean boolean54 = elements3.hasAttr(":eq(-1)");
        org.jsoup.select.Elements elements55 = elements3.nextAll();
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(elements55);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList1.parallelStream();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType16 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str19 = document18.className();
        java.lang.String str20 = document18.outerHtml();
        boolean boolean22 = document18.hasSameValue((java.lang.Object) 1);
        java.lang.String str23 = document18.tagName();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element27 = document25.val("hi!");
        boolean boolean28 = isNthLastOfType16.matches((org.jsoup.nodes.Element) document18, element27);
        java.lang.String str29 = document18.wholeText();
        org.jsoup.nodes.Attributes attributes30 = document18.attributes();
        int int31 = parseErrorList1.indexOf((java.lang.Object) document18);
        boolean boolean32 = parseErrorList1.isEmpty();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(parseErrorStream13);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str20, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#root" + "'", str23, "#root");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document37 = org.jsoup.helper.DataUtil.load((java.io.InputStream) constrainableInputStream29, ":first-of-type", "#text");
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
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String str1 = org.jsoup.nodes.Entities.unescape(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.io.InputStream inputStream3 = null;
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean7 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.nodes.DataNode dataNode4 = org.jsoup.nodes.DataNode.createFromEncoded("", ":first-of-type");
        org.jsoup.nodes.Attributes attributes5 = dataNode4.attributes();
        org.jsoup.nodes.Attribute attribute6 = new org.jsoup.nodes.Attribute("#document", " hi!=\"multipart/form-data\"", attributes5);
        org.jsoup.nodes.Attributes attributes9 = attributes5.put("[]", true);
        attributes9.normalize();
        org.junit.Assert.assertNotNull(dataNode4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("[public=<!#root!>]");
        org.jsoup.Connection connection4 = connection2.userAgent("");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        boolean boolean14 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        org.jsoup.select.NodeFilter nodeFilter15 = null;
        org.jsoup.nodes.Node node16 = null;
        org.jsoup.select.NodeFilter.FilterResult filterResult17 = org.jsoup.select.NodeTraversor.filter(nodeFilter15, node16);
        org.jsoup.select.NodeFilter.FilterResult filterResult18 = org.jsoup.select.NodeFilter.FilterResult.CONTINUE;
        org.jsoup.select.NodeFilter.FilterResult filterResult19 = org.jsoup.select.NodeFilter.FilterResult.SKIP_ENTIRELY;
        org.jsoup.select.NodeFilter.FilterResult filterResult20 = org.jsoup.select.NodeFilter.FilterResult.STOP;
        org.jsoup.select.NodeFilter.FilterResult[] filterResultArray21 = new org.jsoup.select.NodeFilter.FilterResult[] { filterResult17, filterResult18, filterResult19, filterResult20 };
        org.jsoup.select.NodeFilter.FilterResult[] filterResultArray22 = parseErrorList11.toArray(filterResultArray21);
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
        org.junit.Assert.assertTrue("'" + filterResult17 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.CONTINUE + "'", filterResult17.equals(org.jsoup.select.NodeFilter.FilterResult.CONTINUE));
        org.junit.Assert.assertTrue("'" + filterResult18 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.CONTINUE + "'", filterResult18.equals(org.jsoup.select.NodeFilter.FilterResult.CONTINUE));
        org.junit.Assert.assertTrue("'" + filterResult19 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.SKIP_ENTIRELY + "'", filterResult19.equals(org.jsoup.select.NodeFilter.FilterResult.SKIP_ENTIRELY));
        org.junit.Assert.assertTrue("'" + filterResult20 + "' != '" + org.jsoup.select.NodeFilter.FilterResult.STOP + "'", filterResult20.equals(org.jsoup.select.NodeFilter.FilterResult.STOP));
        org.junit.Assert.assertNotNull(filterResultArray21);
        org.junit.Assert.assertNotNull(filterResultArray22);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.lang.String str16 = document15.cssSelector();
        org.jsoup.nodes.Element element19 = document15.attr("multipart", "application/x-www-form-urlencoded");
        java.lang.String str20 = document15.text();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document2 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((java.lang.Object) 1);
        java.lang.String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        org.jsoup.select.Elements elements15 = element13.nextElementSiblings();
        java.util.List<org.jsoup.nodes.FormElement> formElementList16 = elements15.forms();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(formElementList16);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        boolean boolean13 = parseErrorList1.isEmpty();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        org.jsoup.Connection connection23 = httpConnection0.data("#declaration", "Content-Type");
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request25 = httpConnection24.request();
        org.jsoup.Connection connection27 = httpConnection24.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        org.jsoup.Connection connection30 = httpConnection28.sslSocketFactory(sSLSocketFactory29);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        org.jsoup.Connection connection32 = httpConnection28.sslSocketFactory(sSLSocketFactory31);
        org.jsoup.Connection.Request request33 = httpConnection28.request();
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request35 = httpConnection34.request();
        org.jsoup.Connection.Request request38 = request35.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap39 = request38.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = request38.cookies();
        org.jsoup.Connection connection41 = httpConnection28.headers(strMap40);
        org.jsoup.Connection connection42 = httpConnection24.data(strMap40);
        org.jsoup.Connection.Request request43 = httpConnection24.request();
        org.jsoup.Connection.Request request46 = request43.addHeader("#document", " hi!=\"multipart/form-data\"");
        org.jsoup.Connection.Request request49 = request46.proxy("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", (int) (byte) 100);
        org.jsoup.Connection connection50 = httpConnection0.request(request46);
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
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(request43);
        org.junit.Assert.assertNotNull(request46);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection6 = httpConnection0.header("#data", ":only-child");
        org.jsoup.Connection connection8 = httpConnection0.userAgent("multipart/form-data");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = request4.cookies();
        org.jsoup.Connection.Request request9 = request4.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#root");
        java.net.Proxy proxy10 = request4.proxy();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.listIterator();
        java.lang.String str4 = parseErrorList1.toString();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str7 = document6.id();
        org.jsoup.select.Elements elements8 = document6.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor9 = elements8.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements8.listIterator();
        org.jsoup.select.Elements elements12 = elements8.next("#text");
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = org.jsoup.parser.Parser.parseFragment("", element14, "", parseErrorList16);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor18 = parseErrorList16.iterator();
        boolean boolean19 = elements8.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList16);
        int int20 = parseErrorList1.lastIndexOf((java.lang.Object) elements8);
        org.jsoup.select.Elements elements22 = elements8.tagName("#document");
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor9);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseErrorItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.parser.TokenQueue tokenQueue2 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String[] strArray7 = new java.lang.String[] { "multipart/form-data", "Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36" };
        java.lang.String str8 = tokenQueue2.consumeToAny(strArray7);
        boolean boolean9 = org.jsoup.internal.StringUtil.inSorted("[]", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = org.jsoup.parser.ParseSettings.preserveCase;
        org.jsoup.parser.Parser parser10 = parser5.settings(parseSettings9);
        boolean boolean11 = parser5.isTrackErrors();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str6 = response4.statusMessage();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode4 = document1.quirksMode();
        boolean boolean6 = document1.hasClass("multipart/form-data");
        org.jsoup.parser.Tag tag7 = document1.tag();
        boolean boolean8 = tag7.isEmpty();
        java.lang.String str9 = tag7.getName();
        boolean boolean10 = tag7.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + quirksMode4 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode4.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        org.jsoup.select.Elements elements4 = elements1.attr(":eq(-1)", "[]");
        org.jsoup.select.Elements elements5 = elements4.prevAll();
        org.jsoup.nodes.Element element6 = elements4.last();
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.select.Elements elements11 = elements9.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = elements9.html("#text");
        boolean boolean14 = elements13.hasText();
        org.jsoup.select.Elements elements16 = elements13.before("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        java.util.Iterator<org.jsoup.nodes.Element> elementItor17 = elements16.iterator();
        org.jsoup.select.Elements elements19 = elements16.prepend("SYSTEM");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertNotNull(elementItor17);
        org.junit.Assert.assertNotNull(elements19);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection.Request request7 = request5.maxBodySize((int) (byte) 10);
        java.lang.String str8 = request7.requestBody();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean4 = tokenQueue1.matchesCS("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.lang.String str6 = org.jsoup.internal.StringUtil.join((java.util.Collection) elements3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = elements3.append("#declaration");
        org.jsoup.select.Elements elements10 = elements3.eq((int) 'u');
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Method method7 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean8 = method7.hasBody();
        org.jsoup.Connection connection9 = httpConnection0.method(method7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser11 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder10);
        org.jsoup.Connection connection12 = httpConnection0.parser(parser11);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = parser11.parseInput(reader13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertTrue("'" + method7 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method7.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String str1 = org.jsoup.internal.StringUtil.padding(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request2 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request2.ignoreHttpErrors(false);
        org.jsoup.Connection.Request request6 = request2.requestBody("PUBLIC");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request2);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList5 = document1.dataNodes();
        org.jsoup.parser.TokenQueue tokenQueue7 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean9 = tokenQueue7.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str10 = tokenQueue7.consumeWord();
        boolean boolean11 = document1.equals((java.lang.Object) tokenQueue7);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(dataNodeList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "multipart" + "'", str10, "multipart");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        org.jsoup.Connection connection16 = connection13.data("multipart/form-data", "");
        org.jsoup.Connection connection18 = connection13.ignoreContentType(false);
        org.jsoup.Connection connection21 = connection18.data("hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str24 = document23.wholeText();
        org.jsoup.select.Elements elements25 = document23.parents();
        org.jsoup.select.Elements elements27 = elements25.addClass("hi!");
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request29 = httpConnection28.request();
        org.jsoup.Connection.Request request32 = request29.addHeader("multipart/form-data", "hi!");
        boolean boolean34 = request32.hasHeader("multipart/form-data");
        boolean boolean36 = request32.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method37 = request32.method();
        org.jsoup.Connection.Method method38 = request32.method();
        org.jsoup.Connection.Request request41 = request32.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection.Request request44 = request41.addHeader("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", "                                   ");
        org.jsoup.Connection.Method method45 = request44.method();
        java.lang.String str46 = request44.requestBody();
        boolean boolean47 = elements27.equals((java.lang.Object) request44);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = request44.cookies();
        org.jsoup.Connection connection49 = connection21.headers(strMap48);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + method37 + "' != '" + org.jsoup.Connection.Method.GET + "'", method37.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method38 + "' != '" + org.jsoup.Connection.Method.GET + "'", method38.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertTrue("'" + method45 + "' != '" + org.jsoup.Connection.Method.GET + "'", method45.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(connection49);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        boolean boolean1 = org.jsoup.internal.StringUtil.isInvisibleChar((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.lang.String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        java.lang.String str6 = response1.header("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedInputStream bufferedInputStream6 = response4.bodyStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.Method method7 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean8 = method7.hasBody();
        org.jsoup.Connection connection9 = httpConnection0.method(method7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser11 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder10);
        org.jsoup.Connection connection12 = httpConnection0.parser(parser11);
        boolean boolean13 = parser11.isTrackErrors();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertTrue("'" + method7 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method7.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!hi!", "multipart");
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method9 = request4.method();
        org.jsoup.Connection.Method method10 = request4.method();
        org.jsoup.Connection.Request request13 = request4.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection.Request request16 = request13.addHeader("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", "                                   ");
        org.jsoup.Connection.Method method17 = request16.method();
        java.lang.String str18 = request16.requestBody();
        org.jsoup.Connection.Request request21 = request16.proxy("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", (int) 'a');
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + method9 + "' != '" + org.jsoup.Connection.Method.GET + "'", method9.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method10 + "' != '" + org.jsoup.Connection.Method.GET + "'", method10.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertTrue("'" + method17 + "' != '" + org.jsoup.Connection.Method.GET + "'", method17.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(request21);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.safety.Whitelist whitelist4 = org.jsoup.safety.Whitelist.basicWithImages();
        boolean boolean5 = org.jsoup.Jsoup.isValid("hi!", whitelist4);
        boolean boolean6 = org.jsoup.Jsoup.isValid("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", whitelist4);
        java.lang.String str7 = org.jsoup.Jsoup.clean(":first-child", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", whitelist4);
        org.junit.Assert.assertNotNull(whitelist4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ":first-child" + "'", str7, ":first-child");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.clearAttributes();
        org.jsoup.select.Elements elements7 = document1.getElementsByAttributeValue("[public=<!#root!>]", ":matches(null)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) 'm');
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        java.io.InputStream inputStream1 = null;
        org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream1, "#root=\"\"", "#text");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeFilter.FilterResult filterResult5 = org.jsoup.select.NodeTraversor.filter(nodeFilter0, (org.jsoup.nodes.Node) document4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.NodeFilter.head(org.jsoup.nodes.Node, int)\" because \"filter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean9 = org.jsoup.internal.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.internal.StringUtil.in("", strArray8);
        java.lang.String str12 = org.jsoup.internal.StringUtil.join(strArray8, " hi!=\"multipart/form-data\"");
        boolean boolean13 = org.jsoup.internal.StringUtil.in("hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str12, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#text");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.id();
        org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        org.jsoup.nodes.Element element11 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.className();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.id();
        java.lang.String str19 = document17.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean22 = document17.is((org.jsoup.select.Evaluator) indexLessThan21);
        boolean boolean23 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document17);
        java.lang.String str24 = document17.cssSelector();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.className();
        java.lang.String str28 = document26.outerHtml();
        boolean boolean30 = document26.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = indexLessThan3.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document26);
        org.jsoup.parser.Parser parser32 = document17.parser();
        java.lang.String str33 = document17.val();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType36 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str39 = document38.className();
        java.lang.String str40 = document38.outerHtml();
        boolean boolean42 = document38.hasSameValue((java.lang.Object) 1);
        java.lang.String str43 = document38.tagName();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element47 = document45.val("hi!");
        boolean boolean48 = isNthLastOfType36.matches((org.jsoup.nodes.Element) document38, element47);
        boolean boolean49 = tag1.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document38);
        org.jsoup.select.Elements elements50 = document38.children();
        java.lang.String str51 = document38.id();
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
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection9 = httpConnection0.header("[]", "/form-data");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", ":eq(-1)");
        java.lang.String str3 = comment2.nodeName();
        java.lang.String str4 = comment2.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#comment" + "'", str3, "#comment");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Response response3 = response1.charset("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response1.bufferUp();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.lang.String str6 = org.jsoup.internal.StringUtil.join((java.util.Collection) elements3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements8 = elements3.append("#declaration");
        boolean boolean9 = elements3.hasText();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode4 = document1.quirksMode();
        boolean boolean6 = document1.hasClass("multipart/form-data");
        org.jsoup.parser.Tag tag7 = document1.tag();
        org.jsoup.select.Elements elements9 = document1.getElementsByAttribute("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + quirksMode4 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode4.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        java.nio.charset.Charset charset4 = document1.charset();
        org.jsoup.nodes.Document document5 = document1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = document1.before("                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(charset4);
        org.junit.Assert.assertNotNull(document5);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("#root", "multipart/form-data");
        org.jsoup.select.Evaluator.IsEmpty isEmpty3 = new org.jsoup.select.Evaluator.IsEmpty();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.id();
        java.lang.String str7 = document5.baseUri();
        org.jsoup.nodes.Element element10 = document5.attr("", true);
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot13 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.id();
        org.jsoup.select.Elements elements17 = document15.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode18 = document15.quirksMode();
        boolean boolean20 = document15.hasClass("multipart/form-data");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType23 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str26 = document25.wholeText();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str29 = document28.className();
        boolean boolean30 = isNthLastOfType23.matches((org.jsoup.nodes.Element) document25, (org.jsoup.nodes.Element) document28);
        boolean boolean31 = attributeWithValueNot13.matches((org.jsoup.nodes.Element) document15, (org.jsoup.nodes.Element) document25);
        org.jsoup.nodes.Element element33 = document15.createElement("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        boolean boolean34 = isEmpty3.matches(element10, (org.jsoup.nodes.Element) document15);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str37 = document36.className();
        org.jsoup.select.Elements elements40 = document36.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element42 = document36.text("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>");
        boolean boolean43 = attributeWithValue2.matches((org.jsoup.nodes.Element) document15, element42);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element10);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertTrue("'" + quirksMode18 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode18.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("[]", "#text");
        java.lang.String str3 = document2.baseUri();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.select.Evaluator.AttributeWithValueContaining attributeWithValueContaining2 = new org.jsoup.select.Evaluator.AttributeWithValueContaining("                                                                                                    ", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean5 = document1.isBlock();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (short) 0);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        boolean boolean5 = tokenQueue1.matches("");
        java.lang.String str6 = tokenQueue1.consumeTagName();
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart" + "'", str6, "multipart");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.nodes.Attribute attribute10 = new org.jsoup.nodes.Attribute("Content-Encoding", "#root", attributes9);
        java.lang.String str11 = attribute10.getValue();
        org.jsoup.nodes.Attributes attributes12 = attributes0.put(attribute10);
        java.util.Spliterator<org.jsoup.nodes.Attribute> attributeSpliterator13 = attributes0.spliterator();
        org.jsoup.nodes.Attributes attributes16 = attributes0.put("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", " ");
        org.jsoup.parser.ParseSettings parseSettings17 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str19 = parseSettings17.normalizeAttribute("#root");
        int int20 = attributes0.deduplicate(parseSettings17);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#root" + "'", str11, "#root");
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributeSpliterator13);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#root" + "'", str19, "#root");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("multipart/form-data", ":matchesOwn(null)");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.isBlock();
        org.jsoup.nodes.Element element5 = new org.jsoup.nodes.Element(tag1, "ultipart");
        java.lang.String str6 = tag1.normalName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#document" + "'", str6, "#document");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) ' ');
        org.jsoup.select.Elements elements10 = document1.getElementsByIndexLessThan((int) (byte) -1);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("                                   ", ":first-child");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream37 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream32, (int) (short) 0, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(constrainableInputStream37);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        java.net.URL uRL8 = request7.url();
        int int9 = request7.maxBodySize();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = request7.multiHeaders();
        org.jsoup.Connection.Request request12 = request7.ignoreHttpErrors(false);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1048576 + "'", int9 == 1048576);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(request12);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.select.Evaluator.IndexEquals indexEquals1 = new org.jsoup.select.Evaluator.IndexEquals((int) (byte) -1);
        java.lang.String str2 = indexEquals1.toString();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType5 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        boolean boolean11 = document7.hasSameValue((java.lang.Object) 1);
        java.lang.String str12 = document7.tagName();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element16 = document14.val("hi!");
        boolean boolean17 = isNthLastOfType5.matches((org.jsoup.nodes.Element) document7, element16);
        java.lang.String str18 = document7.wholeText();
        org.jsoup.nodes.Element element20 = document7.removeClass("#root=\"\"");
        org.jsoup.nodes.Document document21 = document7.ownerDocument();
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str24 = document23.className();
        java.lang.String str25 = document23.outerHtml();
        boolean boolean27 = document23.hasSameValue((java.lang.Object) 1);
        java.lang.String str28 = document23.tagName();
        org.jsoup.nodes.Element element29 = document23.shallowClone();
        boolean boolean30 = indexEquals1.matches((org.jsoup.nodes.Element) document21, (org.jsoup.nodes.Element) document23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":eq(-1)" + "'", str2, ":eq(-1)");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str25, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#root" + "'", str28, "#root");
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request4.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean10 = request4.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = request4.headers();
        org.jsoup.Connection.Request request13 = request4.ignoreContentType(false);
        boolean boolean16 = request4.hasHeaderWithValue("Content-Type", " hi!=\"multipart/form-data\"");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("                                   ", "multipart/form-data");
        org.junit.Assert.assertNotNull(document2);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.nodes.Comment comment2 = new org.jsoup.nodes.Comment("", ":eq(-1)");
        boolean boolean3 = comment2.isXmlDeclaration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection8 = httpConnection0.data("#document", "hi!", inputStream7);
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        boolean boolean1 = org.jsoup.internal.StringUtil.isNumeric(":contains(content-encoding)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.wholeText();
        org.jsoup.select.Elements elements3 = document1.parents();
        org.jsoup.nodes.Element element4 = document1.shallowClone();
        java.lang.Object obj5 = null;
        boolean boolean6 = document1.hasSameValue(obj5);
        org.jsoup.nodes.Element element8 = document1.removeAttr(":last-of-type");
        document1.title(":matches(null)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(element8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream1 = parseErrorList0.stream();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.id();
        org.jsoup.select.Elements elements5 = document3.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor6 = elements5.listIterator();
        boolean boolean8 = elements5.equals((java.lang.Object) 1.0d);
        org.jsoup.select.Elements elements10 = elements5.after("");
        int int11 = parseErrorList0.indexOf((java.lang.Object) "");
        java.lang.String str12 = parseErrorList0.toString();
        java.util.function.UnaryOperator<org.jsoup.parser.ParseError> parseErrorUnaryOperator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            parseErrorList0.replaceAll(parseErrorUnaryOperator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorStream1);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(elementItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element5 = document1.toggleClass("multipart");
        org.jsoup.select.Elements elements6 = element5.children();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertNotNull(elements6);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.io.InputStream inputStream3 = null;
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key(":eq(-1)");
        boolean boolean7 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        org.jsoup.Connection connection16 = connection13.data("multipart/form-data", "");
        org.jsoup.Connection connection18 = connection13.ignoreContentType(false);
        org.jsoup.Connection connection21 = connection18.data("hi!", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.Connection connection24 = connection21.cookie(":gt(35)", "Content-Encoding=#declaration");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.internal.StringUtil.resolve(uRL0, "[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: [mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        org.jsoup.select.Elements elements26 = document13.getElementsByIndexGreaterThan(0);
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
        org.junit.Assert.assertNotNull(elements26);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        org.jsoup.Connection connection46 = httpConnection0.data("application/x-www-form-urlencoded", ":eq(-1)");
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
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue(" ");
        java.lang.String str2 = tokenQueue1.consumeWord();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = tokenQueue1.chompToIgnoreCase("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 1) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((java.lang.Object) 1);
        java.lang.String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        java.lang.String str15 = document4.location();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        org.jsoup.parser.ParseError parseError16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError17 = parseErrorList9.set((int) (byte) 0, parseError16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.parser.ParseSettings parseSettings2 = new org.jsoup.parser.ParseSettings(false, true);
        java.lang.String str4 = parseSettings2.normalizeAttribute("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.HttpStatusException httpStatusException3 = new org.jsoup.HttpStatusException("Content-Type", (-1), "#declaration");
        java.lang.String str4 = httpStatusException3.getUrl();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#declaration" + "'", str4, "#declaration");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.nodes.Node node9 = document1.attr("#text", "");
        org.jsoup.nodes.Document.QuirksMode quirksMode10 = org.jsoup.nodes.Document.QuirksMode.noQuirks;
        org.jsoup.nodes.Document document11 = document1.quirksMode(quirksMode10);
        org.jsoup.select.Elements elements13 = document1.getElementsByAttribute("ultipart");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + quirksMode10 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode10.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(elements13);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        boolean boolean1 = org.jsoup.parser.Tag.isKnownTag("#text");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.after("");
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor10 = elements3.listIterator(0);
        org.jsoup.select.Elements elements11 = elements3.remove();
        org.jsoup.select.Elements elements13 = elements11.append(":contains(content-encoding)");
        org.jsoup.select.Elements elements15 = elements11.toggleClass(":matches(null)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elementItor10);
        org.junit.Assert.assertNotNull(elements11);
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.lang.String str1 = org.jsoup.nodes.Entities.escape(" hi!=\"multipart/form-data\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!=\"multipart/form-data\"" + "'", str1, " hi!=\"multipart/form-data\"");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.internal.StringUtil.join(iterator0, "#root=\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Iterator.hasNext()\" because \"strings\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("                                                                                                    ");
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType5 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        java.lang.String str9 = document7.outerHtml();
        boolean boolean11 = document7.hasSameValue((java.lang.Object) 1);
        java.lang.String str12 = document7.tagName();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element16 = document14.val("hi!");
        boolean boolean17 = isNthLastOfType5.matches((org.jsoup.nodes.Element) document7, element16);
        java.lang.String str18 = document7.wholeText();
        int int19 = parseErrorList1.indexOf((java.lang.Object) document7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError21 = parseErrorList1.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str9, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#root" + "'", str12, "#root");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.nodes.Document document2 = org.jsoup.parser.Parser.parse("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]", "[public=<!#root!>]");
        org.jsoup.nodes.Element element4 = document2.text("[public=<!#root!>]");
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertNotNull(element4);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.lang.String str3 = response1.header("Content-Encoding");
        int int4 = response1.statusCode();
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
            byte[] byteArray53 = constrainableInputStream45.readNBytes(1048576);
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        boolean boolean1 = org.jsoup.internal.StringUtil.isBlank("[:eq(-1)!=#doctype]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.MatchesOwn matchesOwn1 = new org.jsoup.select.Evaluator.MatchesOwn(pattern0);
        java.lang.String str2 = matchesOwn1.toString();
        java.lang.String str3 = matchesOwn1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matchesOwn(null)" + "'", str2, ":matchesOwn(null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ":matchesOwn(null)" + "'", str3, ":matchesOwn(null)");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        org.jsoup.nodes.Element element7 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType2, (org.jsoup.nodes.Element) document4);
        org.jsoup.select.Elements elements9 = document4.getElementsContainingOwnText(":matches(null)");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(elements9);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.nodes.Document.OutputSettings outputSettings0 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean1 = outputSettings0.outline();
        int int2 = outputSettings0.indentAmount();
        org.jsoup.nodes.Document.OutputSettings outputSettings4 = outputSettings0.indentAmount(1);
        java.nio.charset.Charset charset5 = outputSettings4.charset();
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = outputSettings4.indentAmount(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(outputSettings4);
        org.junit.Assert.assertNotNull(charset5);
        org.junit.Assert.assertNotNull(outputSettings7);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.parser.ParseError[] parseErrorArray1 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList2 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList2, parseErrorArray1);
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.noTracking();
        int int5 = parseErrorList2.indexOf((java.lang.Object) parseErrorList4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslSocketFactory(sSLSocketFactory7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        org.jsoup.Connection connection10 = httpConnection6.sslSocketFactory(sSLSocketFactory9);
        org.jsoup.Connection connection12 = httpConnection6.ignoreContentType(true);
        boolean boolean13 = parseErrorList2.equals((java.lang.Object) true);
        org.jsoup.nodes.DataNode dataNode16 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        java.lang.String str17 = dataNode16.getWholeData();
        org.jsoup.nodes.DataNode dataNode19 = dataNode16.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.LeafNode[] leafNodeArray20 = new org.jsoup.nodes.LeafNode[] { dataNode19 };
        org.jsoup.nodes.LeafNode[] leafNodeArray21 = parseErrorList2.toArray(leafNodeArray20);
        org.jsoup.select.Selector.SelectorParseException selectorParseException22 = new org.jsoup.select.Selector.SelectorParseException(":lt(52)", (java.lang.Object[]) leafNodeArray21);
        java.lang.Throwable[] throwableArray23 = selectorParseException22.getSuppressed();
        java.lang.String str24 = selectorParseException22.toString();
        org.junit.Assert.assertNotNull(parseErrorArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dataNode16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#text" + "'", str17, "#text");
        org.junit.Assert.assertNotNull(dataNode19);
        org.junit.Assert.assertNotNull(leafNodeArray20);
        org.junit.Assert.assertNotNull(leafNodeArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.jsoup.select.Selector$SelectorParseException: :lt(52)" + "'", str24, "org.jsoup.select.Selector$SelectorParseException: :lt(52)");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.util.Set<java.lang.String> strSet35 = document31.classNames();
        org.jsoup.nodes.DocumentType documentType40 = new org.jsoup.nodes.DocumentType("hi!", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", "#root");
        java.lang.String str41 = documentType40.nodeName();
        documentType40.setPubSysKey(":eq(-1)");
        boolean boolean45 = documentType40.hasAttr("");
        org.jsoup.nodes.Node node46 = documentType40.shallowClone();
        org.jsoup.nodes.Element element47 = document31.prependChild(node46);
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
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#doctype" + "'", str41, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("multipart");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.id();
        java.lang.String str7 = document5.baseUri();
        org.jsoup.nodes.Element element8 = document5.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document5.dataset();
        org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection connection15 = connection12.proxy("Content-Encoding=\"#root\"", (int) 'u');
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request17 = httpConnection16.request();
        org.jsoup.Connection.Request request20 = request17.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request23 = request20.cookie("#text", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean26 = request20.hasHeaderWithValue("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", "#document");
        org.jsoup.Connection.Request request29 = request20.cookie("#document", "#document");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = request29.headers();
        org.jsoup.Connection connection31 = connection15.data(strMap30);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(" ");
        java.lang.String str2 = containsData1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":containsData( )" + "'", str2, ":containsData( )");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.nodes.DataNode dataNode2 = org.jsoup.nodes.DataNode.createFromEncoded("#text", "");
        java.lang.String str3 = dataNode2.getWholeData();
        org.jsoup.nodes.DataNode dataNode5 = dataNode2.setWholeData("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.DataNode dataNode7 = dataNode5.setWholeData("<!#root!>");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = dataNode5.childNodes();
        java.lang.String str9 = dataNode5.toString();
        java.lang.String str10 = dataNode5.toString();
        org.junit.Assert.assertNotNull(dataNode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#text" + "'", str3, "#text");
        org.junit.Assert.assertNotNull(dataNode5);
        org.junit.Assert.assertNotNull(dataNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!#root!>" + "'", str9, "<!#root!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!#root!>" + "'", str10, "<!#root!>");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Malformed URL: application/x-www-form-urlencoded");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.select.Elements elements11 = elements9.toggleClass("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements13 = elements9.html("#text");
        org.jsoup.select.Elements elements15 = elements9.removeClass(":last-of-type");
        org.jsoup.select.Elements elements16 = new org.jsoup.select.Elements((java.util.Collection<org.jsoup.nodes.Element>) elements9);
        java.util.function.UnaryOperator<org.jsoup.nodes.Element> elementUnaryOperator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            elements16.replaceAll(elementUnaryOperator17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Element element4 = elements3.last();
        java.lang.String str6 = org.jsoup.internal.StringUtil.join((java.util.Collection) elements3, "");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.io.InputStream inputStream3 = null;
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key(":eq(-1)");
        java.io.InputStream inputStream7 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream10 = new org.jsoup.internal.ConstrainableInputStream(inputStream7, 1, (int) (byte) 0);
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.inputStream((java.io.InputStream) constrainableInputStream10);
        java.lang.String str12 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ":eq(-1)" + "'", str12, ":eq(-1)");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        org.jsoup.parser.ParseError[] parseErrorArray6 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList7 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7, parseErrorArray6);
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.noTracking();
        int int10 = parseErrorList7.indexOf((java.lang.Object) parseErrorList9);
        boolean boolean11 = elements5.equals((java.lang.Object) parseErrorList9);
        org.jsoup.nodes.Element element13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = org.jsoup.parser.Parser.parseFragment("", element13, "", parseErrorList15);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor17 = parseErrorList15.listIterator();
        boolean boolean18 = parseErrorList9.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(parseErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(parseErrorItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element5 = element3.html("");
        java.lang.String str6 = element3.tagName();
        org.jsoup.select.Elements elements8 = element3.getElementsByAttribute("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.select.Elements elements10 = elements8.addClass("#root=\"\"");
        java.lang.String str11 = elements8.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(element5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertNotNull(elements10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.io.InputStream inputStream0 = null;
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request4 = httpConnection3.request();
        org.jsoup.Connection.Request request7 = request4.addHeader("multipart/form-data", "hi!");
        boolean boolean9 = request7.hasHeader("multipart/form-data");
        boolean boolean11 = request7.hasCookie("#text");
        org.jsoup.parser.Parser parser12 = request7.parser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "multipart/form-data", parser12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = document13.after("[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = request4.hasHeaderWithValue("Content-Encoding=\"#root\"", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        org.jsoup.Connection.Method method14 = request9.method();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertTrue("'" + method14 + "' != '" + org.jsoup.Connection.Method.GET + "'", method14.equals(org.jsoup.Connection.Method.GET));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements11 = elements3.not("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<html>?    <head>?        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">?    </head>?    <body>hi!</body>?</html>?': unexpected token at '<html>?    <head>?        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">?    </head>?    <body>hi!</body>?</html>?'");
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
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        org.jsoup.Connection connection23 = httpConnection0.data(":last-of-type", "Content-Encoding=\"#root\"");
        org.jsoup.nodes.Attributes attributes24 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute27 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes28 = attributes24.put(attribute27);
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str31 = document30.id();
        org.jsoup.select.Elements elements32 = document30.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor33 = elements32.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor34 = elements32.listIterator();
        org.jsoup.select.Elements elements35 = elements32.empty();
        boolean boolean36 = attributes28.equals((java.lang.Object) elements32);
        org.jsoup.nodes.Attributes attributes39 = attributes28.add("#root=\"\"", " hi!=\"multipart/form-data\"");
        boolean boolean40 = attributes39.isEmpty();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = attributes39.dataset();
        org.jsoup.Connection connection42 = httpConnection0.headers(strMap41);
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
        org.junit.Assert.assertNotNull(attribute27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNotNull(elementItor33);
        org.junit.Assert.assertNotNull(elementItor34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(connection42);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType(10, (int) (short) 100);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element6 = document4.val("hi!");
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = isNthOfType2.matches(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.nodes.Element.parent()\" because \"element\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.io.InputStream inputStream0 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream3 = new org.jsoup.internal.ConstrainableInputStream(inputStream0, 1, (int) (byte) 0);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream6);
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream11);
        java.io.InputStream inputStream13 = keyVal12.inputStream();
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection14.sslSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        org.jsoup.Connection connection18 = httpConnection14.sslSocketFactory(sSLSocketFactory17);
        org.jsoup.Connection.Request request19 = httpConnection14.request();
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request21 = httpConnection20.request();
        org.jsoup.Connection.Request request24 = request21.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap25 = request24.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = request24.cookies();
        org.jsoup.Connection connection27 = httpConnection14.headers(strMap26);
        java.io.InputStream inputStream30 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream33 = new org.jsoup.internal.ConstrainableInputStream(inputStream30, 1, (int) (byte) 0);
        org.jsoup.Connection connection34 = httpConnection14.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream33);
        org.jsoup.helper.HttpConnection.KeyVal keyVal35 = keyVal12.inputStream((java.io.InputStream) constrainableInputStream33);
        constrainableInputStream33.skipNBytes(0L);
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = keyVal7.inputStream((java.io.InputStream) constrainableInputStream33);
        byte[] byteArray40 = new byte[] { (byte) 100 };
        int int43 = constrainableInputStream33.read(byteArray40, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = constrainableInputStream3.read(byteArray40, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(keyVal35);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[100]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.select.Elements elements5 = elements3.prev("#text");
        java.lang.String str6 = elements5.val();
        org.jsoup.select.Elements elements8 = elements5.addClass("Content-Encoding");
        org.jsoup.select.Elements elements9 = new org.jsoup.select.Elements((java.util.List<org.jsoup.nodes.Element>) elements5);
        elements5.trimToSize();
        java.lang.String str11 = elements5.text();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("Content-Encoding=\"#root\"");
        boolean boolean2 = document1.hasParent();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        boolean boolean13 = parseErrorList11.isEmpty();
        int int14 = parseErrorList11.size();
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList15.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList15.parallelStream();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str20 = document19.id();
        org.jsoup.select.Elements elements21 = document19.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements21.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor23 = elements21.listIterator();
        org.jsoup.select.Elements elements24 = elements21.empty();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.id();
        org.jsoup.select.Elements elements28 = document26.previousElementSiblings();
        org.jsoup.select.Elements elements30 = elements28.prev("#text");
        boolean boolean31 = elements28.hasText();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str34 = document33.id();
        org.jsoup.select.Elements elements35 = document33.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor36 = elements35.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor37 = elements35.listIterator();
        org.jsoup.select.Elements elements38 = elements35.empty();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str41 = document40.id();
        org.jsoup.select.Elements elements42 = document40.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor43 = elements42.listIterator();
        boolean boolean45 = elements42.equals((java.lang.Object) 1.0d);
        java.lang.String str46 = elements42.text();
        org.jsoup.select.Elements elements48 = elements42.wrap("#root");
        org.jsoup.select.Elements[] elementsArray49 = new org.jsoup.select.Elements[] { elements21, elements28, elements35, elements48 };
        org.jsoup.select.Elements[] elementsArray50 = parseErrorList15.toArray(elementsArray49);
        boolean boolean51 = parseErrorList11.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        boolean boolean52 = elements3.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Element> elementList55 = elements3.subList((int) '#', 1048576);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 1048576");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        org.jsoup.select.Elements elements5 = document1.getElementsByAttributeValueMatching("multipart/form-data", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.util.List<java.lang.String> strList7 = elements5.eachAttr("#text");
        org.jsoup.select.Elements elements9 = elements5.after("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.select.Elements elements11 = elements9.prevAll("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        java.lang.String str7 = attributes6.html();
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request9 = httpConnection8.request();
        org.jsoup.Connection.Request request12 = request9.addHeader("multipart/form-data", "hi!");
        boolean boolean14 = request12.hasHeader("multipart/form-data");
        boolean boolean16 = request12.hasHeader("multipart/form-data");
        boolean boolean17 = attributes6.equals((java.lang.Object) request12);
        org.jsoup.parser.ParseSettings parseSettings18 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str20 = parseSettings18.normalizeTag("#doctype");
        int int21 = attributes6.deduplicate(parseSettings18);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!=\"multipart/form-data\"" + "'", str7, " hi!=\"multipart/form-data\"");
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#doctype" + "'", str20, "#doctype");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document1);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        parseErrorList9.clear();
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
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslSocketFactory(sSLSocketFactory3);
        org.jsoup.Connection connection6 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection9 = connection6.proxy("multipart", (int) (byte) 1);
        org.jsoup.Connection connection12 = connection6.proxy(":matches(null)", (int) ' ');
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.Collection<org.jsoup.nodes.Element> elementCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(elementCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.toArray()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.util.List<java.lang.String> strList3 = response1.headers(" hi!=\"multipart/form-data\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        java.lang.String str11 = document4.nodeName();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#document" + "'", str11, "#document");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        org.jsoup.Connection.Method method2 = org.jsoup.Connection.Method.OPTIONS;
        boolean boolean3 = method2.hasBody();
        org.jsoup.Connection.Response response4 = response1.method(method2);
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertTrue("'" + method2 + "' != '" + org.jsoup.Connection.Method.OPTIONS + "'", method2.equals(org.jsoup.Connection.Method.OPTIONS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element4 = document1.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = document1.dataset();
        document1.updateMetaCharsetElement(true);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.nodes.CDataNode cDataNode1 = new org.jsoup.nodes.CDataNode("multipart/form-data");
        org.jsoup.helper.Validate.notNull((java.lang.Object) cDataNode1, "#document");
        java.lang.String str4 = cDataNode1.text();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data" + "'", str4, "multipart/form-data");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode4 = document1.quirksMode();
        boolean boolean6 = document1.hasClass("multipart/form-data");
        org.jsoup.parser.Tag tag7 = document1.tag();
        java.lang.String str8 = tag7.toString();
        boolean boolean9 = tag7.isKnownTag();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertTrue("'" + quirksMode4 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode4.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#root" + "'", str8, "#root");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isFormListed();
        boolean boolean3 = tag1.canContainBlock();
        java.lang.String str4 = tag1.normalName();
        boolean boolean5 = tag1.formatAsBlock();
        boolean boolean6 = tag1.isEmpty();
        java.lang.String str7 = tag1.normalName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#document" + "'", str7, "#document");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        org.jsoup.select.Elements elements8 = document1.getElementsByIndexEquals((int) ' ');
        java.lang.String str9 = elements8.val();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(elements8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        org.jsoup.select.Elements elements34 = document22.siblingElements();
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
        org.junit.Assert.assertNotNull(elements34);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#text");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.id();
        org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        org.jsoup.nodes.Element element11 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.className();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.id();
        java.lang.String str19 = document17.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean22 = document17.is((org.jsoup.select.Evaluator) indexLessThan21);
        boolean boolean23 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document17);
        java.lang.String str24 = document17.cssSelector();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.className();
        java.lang.String str28 = document26.outerHtml();
        boolean boolean30 = document26.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = indexLessThan3.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document26);
        org.jsoup.parser.Parser parser32 = document17.parser();
        java.lang.String str33 = document17.val();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType36 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str39 = document38.className();
        java.lang.String str40 = document38.outerHtml();
        boolean boolean42 = document38.hasSameValue((java.lang.Object) 1);
        java.lang.String str43 = document38.tagName();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element47 = document45.val("hi!");
        boolean boolean48 = isNthLastOfType36.matches((org.jsoup.nodes.Element) document38, element47);
        boolean boolean49 = tag1.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document38);
        java.lang.String str50 = tag1.toString();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str53 = document52.wholeText();
        org.jsoup.select.Elements elements54 = document52.parents();
        org.jsoup.nodes.Element element55 = document52.shallowClone();
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str58 = document57.id();
        java.lang.String str59 = document57.baseUri();
        org.jsoup.nodes.Element element62 = document57.attr("", true);
        org.jsoup.nodes.Node node65 = document57.attr("#text", "");
        org.jsoup.nodes.Element element67 = document57.html("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean68 = tag1.matches(element55, element67);
        org.jsoup.nodes.Element element69 = null;
        org.jsoup.nodes.Element element70 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = tag1.matches(element69, element70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.nodes.Element.tagName()\" because \"element\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#text" + "'", str50, "#text");
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("#root", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("Content-Encoding");
        org.jsoup.Connection.KeyVal keyVal6 = keyVal4.value("multipart");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve(":lt(52)", "Content-Encoding");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.select.Elements elements9 = elements3.addClass("<!#root!>");
        java.lang.String str11 = elements9.attr("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jsoup.nodes.CDataNode cDataNode1 = new org.jsoup.nodes.CDataNode("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str2 = cDataNode1.nodeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#cdata" + "'", str2, "#cdata");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String str2 = org.jsoup.internal.StringUtil.resolve(":gt(35)", "Content-Type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        boolean boolean50 = document46.hasClass("");
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.select.Evaluator.AttributeWithValue attributeWithValue2 = new org.jsoup.select.Evaluator.AttributeWithValue("#root", "multipart/form-data");
        org.jsoup.nodes.Document document5 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("*", "<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>");
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeWithValue2.matches((org.jsoup.nodes.Element) document5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.nodes.Element.hasAttr(String)\" because \"element\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document5);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        java.lang.String str3 = document1.baseUri();
        org.jsoup.nodes.Element element6 = document1.attr("", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = document1.after("                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream53 = org.jsoup.internal.ConstrainableInputStream.wrap((java.io.InputStream) constrainableInputStream45, 0, 100);
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
        org.junit.Assert.assertNotNull(constrainableInputStream53);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str5 = tokenQueue1.consumeTo("multipart");
        java.lang.String str7 = tokenQueue1.chompTo("                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data" + "'", str7, "multipart/form-data");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.className();
        java.lang.String str6 = document4.outerHtml();
        boolean boolean8 = document4.hasSameValue((java.lang.Object) 1);
        java.lang.String str9 = document4.tagName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element13 = document11.val("hi!");
        boolean boolean14 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, element13);
        org.jsoup.select.Elements elements15 = element13.nextElementSiblings();
        org.jsoup.select.Elements elements16 = elements15.parents();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.lang.String str5 = response4.statusMessage();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasCookie("#text");
        org.jsoup.parser.Parser parser9 = request4.parser();
        org.jsoup.Connection.Request request12 = request4.header("#text", "multipart/form-data");
        boolean boolean15 = request12.hasHeaderWithValue(":nth-last-of-type(100n-1)", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = org.jsoup.helper.HttpConnection.KeyVal.create("SYSTEM", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str19 = keyVal18.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = keyVal18.value("");
        java.io.InputStream inputStream22 = keyVal21.inputStream();
        org.jsoup.Connection.Request request23 = request12.data((org.jsoup.Connection.KeyVal) keyVal21);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str19, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(request23);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.select.Evaluator.IndexGreaterThan indexGreaterThan1 = new org.jsoup.select.Evaluator.IndexGreaterThan((int) (short) 100);
        java.lang.String str2 = indexGreaterThan1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":gt(100)" + "'", str2, ":gt(100)");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
        java.lang.String str2 = characterReader1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n" + "'", str2, "<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>hi!</body>\n</html>\n");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        org.jsoup.Connection.KeyVal keyVal19 = connection17.data("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(keyVal19);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str5 = tokenQueue1.chompTo("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean14 = org.jsoup.internal.StringUtil.in("", strArray13);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("", strArray13);
        boolean boolean16 = tokenQueue1.matchesAny(strArray13);
        boolean boolean18 = tokenQueue1.matches("#cdata");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.io.InputStream inputStream2 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse(inputStream2, "", "#root", parser5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", "#root", parser5);
        org.jsoup.nodes.Document document8 = document7.normalise();
        java.lang.String str9 = document8.normalName();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.className();
        java.lang.String str14 = document11.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.jsoup.nodes.Element element16 = document11.removeAttr("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        org.jsoup.nodes.Element element17 = document8.appendChild((org.jsoup.nodes.Node) document11);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#root" + "'", str9, "#root");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertNotNull(element17);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.select.Evaluator.ContainsData containsData1 = new org.jsoup.select.Evaluator.ContainsData(":containsData( )");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.isInline();
        boolean boolean3 = tag1.isData();
        java.lang.String str4 = tag1.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#document" + "'", str4, "#document");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream9);
        java.io.InputStream inputStream11 = keyVal10.inputStream();
        java.io.InputStream inputStream14 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal15 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "#declaration", inputStream14);
        java.io.InputStream inputStream16 = keyVal15.inputStream();
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        org.jsoup.Connection connection19 = httpConnection17.sslSocketFactory(sSLSocketFactory18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        org.jsoup.Connection connection21 = httpConnection17.sslSocketFactory(sSLSocketFactory20);
        org.jsoup.Connection.Request request22 = httpConnection17.request();
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request24 = httpConnection23.request();
        org.jsoup.Connection.Request request27 = request24.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = request27.multiHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = request27.cookies();
        org.jsoup.Connection connection30 = httpConnection17.headers(strMap29);
        java.io.InputStream inputStream33 = null;
        org.jsoup.internal.ConstrainableInputStream constrainableInputStream36 = new org.jsoup.internal.ConstrainableInputStream(inputStream33, 1, (int) (byte) 0);
        org.jsoup.Connection connection37 = httpConnection17.data("#declaration", "[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]", (java.io.InputStream) constrainableInputStream36);
        org.jsoup.helper.HttpConnection.KeyVal keyVal38 = keyVal15.inputStream((java.io.InputStream) constrainableInputStream36);
        constrainableInputStream36.skipNBytes(0L);
        org.jsoup.helper.HttpConnection.KeyVal keyVal41 = keyVal10.inputStream((java.io.InputStream) constrainableInputStream36);
        org.jsoup.Connection connection43 = httpConnection0.data("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", " ", (java.io.InputStream) constrainableInputStream36, "ultipart");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray44 = constrainableInputStream36.readAllBytes();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(keyVal15);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(keyVal38);
        org.junit.Assert.assertNotNull(keyVal41);
        org.junit.Assert.assertNotNull(connection43);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str5 = tokenQueue1.consumeTo("multipart");
        tokenQueue1.addFirst("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean16 = org.jsoup.internal.StringUtil.in("", strArray15);
        boolean boolean17 = org.jsoup.internal.StringUtil.in("", strArray15);
        java.lang.String str19 = org.jsoup.internal.StringUtil.join(strArray15, " hi!=\"multipart/form-data\"");
        java.lang.String str20 = tokenQueue1.consumeToAny(strArray15);
        boolean boolean21 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!" + "'", str19, "hi! hi!=\"multipart/form-data\"hi! hi!=\"multipart/form-data\" hi!=\"multipart/form-data\"multipart/form-data hi!=\"multipart/form-data\"hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.String str1 = org.jsoup.internal.Normalizer.normalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request1.header("#root=\"\"", ":eq(-1)");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Request request9 = request7.postDataCharset("#cdata");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: #cdata");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("                                   ", ":matchesOwn(null)");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        java.lang.String str2 = tokenQueue1.toString();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str5 = tokenQueue1.consumeTo("multipart");
        java.lang.String str6 = tokenQueue1.remainder();
        java.lang.String str8 = tokenQueue1.consumeTo("Content-Encoding");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "multipart/form-data" + "'", str2, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart/form-data" + "'", str6, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.parser.Tag tag1 = new org.jsoup.parser.Tag("#document");
        boolean boolean2 = tag1.formatAsBlock();
        java.lang.String str3 = tag1.toString();
        org.jsoup.nodes.Attributes attributes5 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes8 = attributes5.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes11 = attributes5.add("hi!", "multipart/form-data");
        java.lang.String str12 = attributes11.html();
        org.jsoup.nodes.Attributes attributes13 = attributes11.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor14 = attributes11.iterator();
        org.jsoup.nodes.PseudoTextElement pseudoTextElement15 = new org.jsoup.nodes.PseudoTextElement(tag1, "ultipart", attributes11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#document" + "'", str3, "#document");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!=\"multipart/form-data\"" + "'", str12, " hi!=\"multipart/form-data\"");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributeItor14);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str5 = document1.normalName();
        int int6 = document1.elementSiblingIndex();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes2.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes8 = attributes2.add("hi!", "multipart/form-data");
        java.lang.String str9 = attributes8.html();
        org.jsoup.nodes.Attributes attributes10 = attributes8.clone();
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor11 = attributes8.iterator();
        org.jsoup.nodes.Attribute attribute12 = new org.jsoup.nodes.Attribute(":gt(35)", "<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", attributes8);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!=\"multipart/form-data\"" + "'", str9, " hi!=\"multipart/form-data\"");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributeItor11);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.wholeText();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str8 = document7.className();
        boolean boolean9 = isNthLastOfType2.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document7);
        org.jsoup.nodes.Document document10 = document4.clone();
        org.jsoup.nodes.Element element12 = document4.tagName("#root");
        org.jsoup.select.Elements elements14 = document4.getElementsByIndexLessThan(100);
        java.lang.String str15 = document4.data();
        org.jsoup.nodes.Node node16 = document4.parent();
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor2 = parseErrorList0.iterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList0.stream();
        org.jsoup.parser.ParseErrorList parseErrorList5 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream6 = parseErrorList5.stream();
        boolean boolean7 = parseErrorList0.addAll((int) (short) 0, (java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList5);
        org.jsoup.parser.ParseError[] parseErrorArray9 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList10 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10, parseErrorArray9);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor12 = parseErrorList10.listIterator();
        java.lang.String str13 = parseErrorList10.toString();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str16 = document15.id();
        org.jsoup.select.Elements elements17 = document15.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor18 = elements17.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor19 = elements17.listIterator();
        org.jsoup.select.Elements elements21 = elements17.next("#text");
        org.jsoup.nodes.Element element23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = org.jsoup.parser.Parser.parseFragment("", element23, "", parseErrorList25);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList25.iterator();
        boolean boolean28 = elements17.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList25);
        int int29 = parseErrorList10.lastIndexOf((java.lang.Object) elements17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = parseErrorList5.addAll((int) (short) 1, (java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorItor2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parseErrorStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parseErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parseErrorItor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(elements17);
        org.junit.Assert.assertNotNull(elementItor18);
        org.junit.Assert.assertNotNull(elementItor19);
        org.junit.Assert.assertNotNull(elements21);
        org.junit.Assert.assertNotNull(parseErrorList25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.select.Evaluator.IsLastOfType isLastOfType0 = new org.jsoup.select.Evaluator.IsLastOfType();
        java.lang.String str1 = isLastOfType0.toString();
        java.lang.String str2 = isLastOfType0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ":last-of-type" + "'", str1, ":last-of-type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":last-of-type" + "'", str2, ":last-of-type");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.nodes.Document document1 = new org.jsoup.nodes.Document(":matches(null)");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        parseErrorList1.ensureCapacity(10);
        java.lang.Object[] objArray5 = parseErrorList1.toArray();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str5 = tokenQueue1.chompTo("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean14 = org.jsoup.internal.StringUtil.in("", strArray13);
        boolean boolean15 = org.jsoup.internal.StringUtil.in("", strArray13);
        boolean boolean16 = tokenQueue1.matchesAny(strArray13);
        java.lang.String str17 = tokenQueue1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType2 = new org.jsoup.select.Evaluator.IsNthLastOfType((int) (short) 10, (int) '\uffff');
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.nodes.Attributes attributes2 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes5 = attributes2.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        java.util.Iterator<org.jsoup.nodes.Attribute> attributeItor6 = attributes2.iterator();
        org.jsoup.nodes.Attribute attribute7 = new org.jsoup.nodes.Attribute("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>=\"#root\"", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>", attributes2);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributeItor6);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        java.lang.String str7 = elements3.text();
        org.jsoup.select.Elements elements9 = elements3.wrap("#root");
        org.jsoup.select.Elements elements11 = elements9.prevAll("#document");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.lang.String str8 = response4.contentType();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        org.jsoup.Connection connection39 = connection37.userAgent("");
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
        org.junit.Assert.assertNotNull(connection39);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.select.Evaluator.IsOnlyChild isOnlyChild0 = new org.jsoup.select.Evaluator.IsOnlyChild();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.id();
        java.lang.String str4 = document2.baseUri();
        org.jsoup.nodes.Element element6 = document2.toggleClass("multipart");
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.className();
        java.lang.String str10 = document8.outerHtml();
        boolean boolean12 = document8.hasSameValue((java.lang.Object) 1);
        boolean boolean13 = isOnlyChild0.matches((org.jsoup.nodes.Element) document2, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = new org.jsoup.nodes.Document.OutputSettings();
        boolean boolean15 = outputSettings14.outline();
        int int16 = outputSettings14.indentAmount();
        org.jsoup.nodes.Document.OutputSettings.Syntax syntax17 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = outputSettings14.syntax(syntax17);
        java.nio.charset.Charset charset19 = outputSettings18.charset();
        document2.charset(charset19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = document2.is("                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '                                                                                                    ': unexpected token at ''");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str10, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + syntax17 + "' != '" + org.jsoup.nodes.Document.OutputSettings.Syntax.html + "'", syntax17.equals(org.jsoup.nodes.Document.OutputSettings.Syntax.html));
        org.junit.Assert.assertNotNull(outputSettings18);
        org.junit.Assert.assertNotNull(charset19);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes3 = attributes0.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes6 = attributes0.add("hi!", "multipart/form-data");
        attributes6.normalize();
        org.jsoup.nodes.Attributes attributes10 = attributes6.put(":eq(-1)", "SYSTEM");
        org.jsoup.nodes.Attributes attributes13 = attributes6.put("#root", false);
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.jsoup.nodes.Document document19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cleaner1.isValid(document19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.select.Evaluator.MatchText matchText0 = new org.jsoup.select.Evaluator.MatchText();
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.select.Evaluator.Tag tag1 = new org.jsoup.select.Evaluator.Tag("#text");
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan3 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.id();
        org.jsoup.select.Elements elements10 = document8.previousElementSiblings();
        org.jsoup.nodes.Element element11 = org.jsoup.select.Collector.findFirst((org.jsoup.select.Evaluator) isNthLastOfType6, (org.jsoup.nodes.Element) document8);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str14 = document13.className();
        java.lang.String str15 = document13.outerHtml();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str18 = document17.id();
        java.lang.String str19 = document17.baseUri();
        org.jsoup.select.Evaluator.IndexLessThan indexLessThan21 = new org.jsoup.select.Evaluator.IndexLessThan((int) '4');
        boolean boolean22 = document17.is((org.jsoup.select.Evaluator) indexLessThan21);
        boolean boolean23 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document13, (org.jsoup.nodes.Element) document17);
        java.lang.String str24 = document17.cssSelector();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str27 = document26.className();
        java.lang.String str28 = document26.outerHtml();
        boolean boolean30 = document26.hasSameValue((java.lang.Object) 1);
        boolean boolean31 = indexLessThan3.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document26);
        org.jsoup.parser.Parser parser32 = document17.parser();
        java.lang.String str33 = document17.val();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType36 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str39 = document38.className();
        java.lang.String str40 = document38.outerHtml();
        boolean boolean42 = document38.hasSameValue((java.lang.Object) 1);
        java.lang.String str43 = document38.tagName();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element47 = document45.val("hi!");
        boolean boolean48 = isNthLastOfType36.matches((org.jsoup.nodes.Element) document38, element47);
        boolean boolean49 = tag1.matches((org.jsoup.nodes.Element) document17, (org.jsoup.nodes.Element) document38);
        org.jsoup.select.Elements elements50 = document38.children();
        org.jsoup.nodes.Element element51 = document38.clone();
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
        org.junit.Assert.assertNotNull(elements50);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        java.io.InputStream inputStream4 = null;
        org.jsoup.Connection connection6 = httpConnection0.data("#root", "Content-Encoding", inputStream4, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = connection6.postDataCharset(":last-child");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: :last-child");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        boolean boolean6 = request4.hasHeader("multipart/form-data");
        boolean boolean8 = request4.hasCookie("#text");
        org.jsoup.parser.Parser parser9 = request4.parser();
        org.jsoup.Connection.Request request12 = request4.header("#text", "multipart/form-data");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = request12.multiHeaders();
        boolean boolean15 = request12.hasCookie("[:eq(-1)!=#doctype]");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        boolean boolean24 = elements21.hasClass(":gt(35)");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        org.jsoup.parser.ParseSettings parseSettings16 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str18 = parseSettings16.normalizeTag("#doctype");
        org.jsoup.parser.Parser parser19 = parser12.settings(parseSettings16);
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertNotNull(parser19);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jsoup.helper.Validate.isFalse(false, "*");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.listIterator();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType6 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str9 = document8.wholeText();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.className();
        boolean boolean13 = isNthLastOfType6.matches((org.jsoup.nodes.Element) document8, (org.jsoup.nodes.Element) document11);
        boolean boolean14 = parseErrorList1.equals((java.lang.Object) document11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor15 = parseErrorList1.iterator();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parseErrorItor15);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.select.Evaluator.IsNthOfType isNthOfType2 = new org.jsoup.select.Evaluator.IsNthOfType((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        org.jsoup.Connection.KeyVal keyVal36 = keyVal34.contentType("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<#root value=\"hi!\">\n <html>\n  <head></head>\n  <body>\n   hi!\n  </body>\n </html>\n</#root>");
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
        org.junit.Assert.assertNotNull(keyVal36);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.nodes.DocumentType documentType3 = new org.jsoup.nodes.DocumentType(":matches(null)", "#document", ":first-child");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.select.Evaluator.IsEmpty isEmpty0 = new org.jsoup.select.Evaluator.IsEmpty();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.id();
        java.lang.String str4 = document2.baseUri();
        org.jsoup.nodes.Element element7 = document2.attr("", true);
        org.jsoup.select.Evaluator.AttributeWithValueNot attributeWithValueNot10 = new org.jsoup.select.Evaluator.AttributeWithValueNot(":eq(-1)", "#doctype");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str13 = document12.id();
        org.jsoup.select.Elements elements14 = document12.previousElementSiblings();
        org.jsoup.nodes.Document.QuirksMode quirksMode15 = document12.quirksMode();
        boolean boolean17 = document12.hasClass("multipart/form-data");
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType20 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str23 = document22.wholeText();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str26 = document25.className();
        boolean boolean27 = isNthLastOfType20.matches((org.jsoup.nodes.Element) document22, (org.jsoup.nodes.Element) document25);
        boolean boolean28 = attributeWithValueNot10.matches((org.jsoup.nodes.Element) document12, (org.jsoup.nodes.Element) document22);
        org.jsoup.nodes.Element element30 = document12.createElement("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        boolean boolean31 = isEmpty0.matches(element7, (org.jsoup.nodes.Element) document12);
        java.lang.String str32 = isEmpty0.toString();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(elements14);
        org.junit.Assert.assertTrue("'" + quirksMode15 + "' != '" + org.jsoup.nodes.Document.QuirksMode.noQuirks + "'", quirksMode15.equals(org.jsoup.nodes.Document.QuirksMode.noQuirks));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ":empty" + "'", str32, ":empty");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.nodes.Attributes attributes0 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attribute attribute3 = org.jsoup.nodes.Attribute.createFromEncoded("#root", "");
        org.jsoup.nodes.Attributes attributes4 = attributes0.put(attribute3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = attributes4.dataset();
        org.junit.Assert.assertNotNull(attribute3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.select.Elements elements9 = elements3.addClass("<!#root!>");
        org.jsoup.select.Elements elements11 = elements3.html("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertNotNull(elementItor5);
        org.junit.Assert.assertNotNull(elements7);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(elements11);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.select.Evaluator.Id id1 = new org.jsoup.select.Evaluator.Id(":first-child");
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request8 = httpConnection7.request();
        org.jsoup.Connection.Request request11 = request8.addHeader("multipart/form-data", "hi!");
        boolean boolean13 = request11.hasHeader("multipart/form-data");
        boolean boolean15 = request11.hasCookie("#text");
        org.jsoup.parser.Parser parser16 = request11.parser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse(inputStream4, "", "multipart/form-data", parser16);
        boolean boolean18 = parser16.isTrackErrors();
        org.jsoup.parser.Parser parser20 = parser16.setTrackErrors(10);
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("PUBLIC", "Content-Type", parser20);
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str24 = document23.wholeText();
        org.jsoup.select.Elements elements25 = document23.parents();
        org.jsoup.nodes.Element element26 = document23.shallowClone();
        java.lang.Object obj27 = null;
        boolean boolean28 = document23.hasSameValue(obj27);
        org.jsoup.nodes.Element element30 = document23.appendText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Element element31 = document23.root();
        org.jsoup.nodes.Element element33 = document23.createElement("application/x-www-form-urlencoded");
        boolean boolean34 = id1.matches((org.jsoup.nodes.Element) document21, element33);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(elements25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.helper.W3CDom w3CDom0 = new org.jsoup.helper.W3CDom();
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.className();
        java.lang.String str5 = document2.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str6 = document2.normalName();
        org.w3c.dom.Document document7 = w3CDom0.fromJsoup(document2);
        org.jsoup.nodes.Document document8 = document2.ownerDocument();
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#root" + "'", str6, "#root");
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull("document7.getDocumentURI() == null", document7.getDocumentURI());
        org.junit.Assert.assertNull("document7.getInputEncoding() == null", document7.getInputEncoding());
        org.junit.Assert.assertNull("document7.getXmlEncoding() == null", document7.getXmlEncoding());
        org.junit.Assert.assertEquals(document7.getXmlVersion(), "1.0");
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = request4.multiHeaders();
        org.jsoup.Connection.Request request7 = request4.ignoreHttpErrors(true);
        java.net.URL uRL8 = request7.url();
        boolean boolean9 = request7.ignoreContentType();
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.lang.String str16 = document3.text();
        org.jsoup.nodes.Element element18 = document3.appendElement("#data");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(element18);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.nodes.CDataNode cDataNode1 = new org.jsoup.nodes.CDataNode(":empty");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection.Request request4 = request1.addHeader("multipart/form-data", "hi!");
        org.jsoup.Connection.Request request7 = request1.header("#root=\"\"", ":eq(-1)");
        boolean boolean8 = request1.followRedirects();
        java.lang.String str10 = request1.header("ultipart");
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        org.jsoup.select.Elements elements8 = elements3.nextAll(":matches(null)");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.parser.ParseErrorList parseErrorList0 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor1 = parseErrorList0.listIterator();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList0.parallelStream();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        org.jsoup.select.Elements elements6 = document4.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor7 = elements6.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor8 = elements6.listIterator();
        org.jsoup.select.Elements elements9 = elements6.empty();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str12 = document11.id();
        org.jsoup.select.Elements elements13 = document11.previousElementSiblings();
        org.jsoup.select.Elements elements15 = elements13.prev("#text");
        boolean boolean16 = elements13.hasText();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str19 = document18.id();
        org.jsoup.select.Elements elements20 = document18.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor21 = elements20.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor22 = elements20.listIterator();
        org.jsoup.select.Elements elements23 = elements20.empty();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str26 = document25.id();
        org.jsoup.select.Elements elements27 = document25.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor28 = elements27.listIterator();
        boolean boolean30 = elements27.equals((java.lang.Object) 1.0d);
        java.lang.String str31 = elements27.text();
        org.jsoup.select.Elements elements33 = elements27.wrap("#root");
        org.jsoup.select.Elements[] elementsArray34 = new org.jsoup.select.Elements[] { elements6, elements13, elements20, elements33 };
        org.jsoup.select.Elements[] elementsArray35 = parseErrorList0.toArray(elementsArray34);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream36 = parseErrorList0.stream();
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request38 = httpConnection37.request();
        org.jsoup.Connection.KeyVal keyVal40 = httpConnection37.data("Content-Encoding");
        org.jsoup.Connection connection42 = httpConnection37.maxBodySize((int) (short) 100);
        org.jsoup.Connection connection44 = httpConnection37.timeout((int) '4');
        boolean boolean45 = parseErrorList0.equals((java.lang.Object) httpConnection37);
        org.junit.Assert.assertNotNull(parseErrorList0);
        org.junit.Assert.assertNotNull(parseErrorItor1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNotNull(elementItor7);
        org.junit.Assert.assertNotNull(elementItor8);
        org.junit.Assert.assertNotNull(elements9);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(elements13);
        org.junit.Assert.assertNotNull(elements15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elementItor21);
        org.junit.Assert.assertNotNull(elementItor22);
        org.junit.Assert.assertNotNull(elements23);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elementItor28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(elementsArray34);
        org.junit.Assert.assertNotNull(elementsArray35);
        org.junit.Assert.assertNotNull(parseErrorStream36);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNull(keyVal40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor5 = elements3.listIterator();
        org.jsoup.select.Elements elements7 = elements3.next("#text");
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.noTracking();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = org.jsoup.parser.Parser.parseFragment("", element9, "", parseErrorList11);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        boolean boolean14 = elements3.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        org.jsoup.select.Elements elements16 = elements3.before("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        boolean boolean18 = elements3.is("#text");
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
        org.junit.Assert.assertNotNull(elements16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.referrer("[public=<!#root!>]");
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.url(uRL3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("SYSTEM", "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("");
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        org.jsoup.Connection.KeyVal keyVal8 = keyVal5.contentType("#declaration");
        org.jsoup.Connection.KeyVal keyVal10 = keyVal8.contentType("multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str3, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "hi!", "", "multipart/form-data", "hi!" };
        boolean boolean44 = org.jsoup.internal.StringUtil.in("", strArray43);
        boolean boolean45 = org.jsoup.internal.StringUtil.in("", strArray43);
        org.jsoup.helper.Validate.noNullElements((java.lang.Object[]) strArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection47 = httpConnection0.data(strArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply an even number of key value pairs");
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
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.select.Evaluator.ContainsText containsText1 = new org.jsoup.select.Evaluator.ContainsText("Content-Encoding");
        java.lang.String str2 = containsText1.toString();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str5 = document4.id();
        int int6 = document4.elementSiblingIndex();
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parse("[]", "#text");
        boolean boolean10 = containsText1.matches((org.jsoup.nodes.Element) document4, (org.jsoup.nodes.Element) document9);
        org.jsoup.nodes.Element element12 = document9.addClass("org.jsoup.select.Selector$SelectorParseException: :lt(52)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":contains(content-encoding)" + "'", str2, ":contains(content-encoding)");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        org.jsoup.Connection connection21 = httpConnection0.maxBodySize(1);
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
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        boolean boolean1 = org.jsoup.internal.StringUtil.isWhitespace((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.MatchesOwn matchesOwn1 = new org.jsoup.select.Evaluator.MatchesOwn(pattern0);
        java.lang.String str2 = matchesOwn1.toString();
        org.jsoup.select.Evaluator.Tag tag4 = new org.jsoup.select.Evaluator.Tag("#text");
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
        java.lang.String str36 = document20.val();
        org.jsoup.select.Evaluator.IsNthLastOfType isNthLastOfType39 = new org.jsoup.select.Evaluator.IsNthLastOfType(100, (int) (byte) -1);
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str42 = document41.className();
        java.lang.String str43 = document41.outerHtml();
        boolean boolean45 = document41.hasSameValue((java.lang.Object) 1);
        java.lang.String str46 = document41.tagName();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element50 = document48.val("hi!");
        boolean boolean51 = isNthLastOfType39.matches((org.jsoup.nodes.Element) document41, element50);
        boolean boolean52 = tag4.matches((org.jsoup.nodes.Element) document20, (org.jsoup.nodes.Element) document41);
        java.lang.String str53 = tag4.toString();
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str56 = document55.wholeText();
        org.jsoup.select.Elements elements57 = document55.parents();
        org.jsoup.nodes.Element element58 = document55.shallowClone();
        org.jsoup.nodes.Document document60 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str61 = document60.id();
        java.lang.String str62 = document60.baseUri();
        org.jsoup.nodes.Element element65 = document60.attr("", true);
        org.jsoup.nodes.Node node68 = document60.attr("#text", "");
        org.jsoup.nodes.Element element70 = document60.html("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        boolean boolean71 = tag4.matches(element58, element70);
        org.jsoup.nodes.Document document73 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str74 = document73.wholeText();
        org.jsoup.select.Elements elements75 = document73.parents();
        org.jsoup.nodes.Element element76 = document73.shallowClone();
        java.lang.Object obj77 = null;
        boolean boolean78 = document73.hasSameValue(obj77);
        org.jsoup.nodes.Element element80 = document73.appendText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = matchesOwn1.matches(element70, element80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ":matchesOwn(null)" + "'", str2, ":matchesOwn(null)");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str43, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#root" + "'", str46, "#root");
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(element50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "#text" + "'", str53, "#text");
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(elements57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(elements75);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(element80);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.lang.String str2 = response1.statusMessage();
        org.jsoup.Connection.Response response4 = response1.removeCookie("Content-Encoding");
        org.jsoup.Connection.Response response7 = response1.cookie("[mozilla/5.0 (macintosh; intel mac os x 10_11_6) applewebkit/537.36 (khtml, like gecko) chrome/53.0.2785.143 safari/537.36*=#doctype]", ":nth-last-of-type(100n-1)");
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str5 = document1.normalName();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element8 = document1.addClass("[hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!=multipart/form-data]");
        org.jsoup.nodes.Document document9 = document1.normalise();
        java.lang.StringBuilder stringBuilder10 = org.jsoup.internal.StringUtil.borrowBuilder();
        java.lang.String str11 = org.jsoup.internal.StringUtil.releaseBuilder(stringBuilder10);
        java.lang.Appendable appendable12 = document9.html((java.lang.Appendable) stringBuilder10);
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#root" + "'", str5, "#root");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str6, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(appendable12);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.select.Elements elements1 = new org.jsoup.select.Elements(0);
        org.jsoup.select.Elements elements4 = elements1.attr(":eq(-1)", "[]");
        boolean boolean6 = elements1.hasClass(":gt(100)");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("multipart/form-data");
        boolean boolean3 = tokenQueue1.matchesCS("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        java.lang.String str4 = tokenQueue1.consumeWord();
        // The following exception was thrown during execution in test generation
        try {
            tokenQueue1.consume(" hi!=\"multipart/form-data\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Queue did not match expected sequence");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart" + "'", str4, "multipart");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.io.InputStream inputStream0 = java.io.InputStream.nullInputStream();
        org.junit.Assert.assertNotNull(inputStream0);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        org.jsoup.Connection connection3 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection.Response response4 = httpConnection0.response();
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection connection7 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = connection7.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must be specified to connect");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(request1);
        org.junit.Assert.assertNotNull(connection3);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Response response1 = httpConnection0.response();
        java.lang.String str2 = response1.statusMessage();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = response1.multiHeaders();
        org.jsoup.Connection.Response response7 = response1.charset("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jsoup.nodes.DataNode dataNode1 = new org.jsoup.nodes.DataNode("#document");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        org.jsoup.nodes.Element element6 = elements5.first();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNull(element6);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        org.jsoup.Connection connection16 = connection13.data("multipart/form-data", "");
        org.jsoup.Connection connection18 = connection13.ignoreContentType(false);
        org.jsoup.Connection connection20 = connection18.timeout((int) (short) 0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        org.jsoup.nodes.Element element23 = element21.appendText("[hi!   hi!  hi!   hi!     hi!  multipart/form-data   hi!  hi!=multipart/form-data]");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = element23.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(elements6);
        org.junit.Assert.assertNull(element7);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>" + "'", str11, "<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>\n<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#root" + "'", str20, "#root");
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request33 = httpConnection32.request();
        org.jsoup.Connection connection35 = httpConnection32.referrer("multipart/form-data");
        org.jsoup.Connection.Response response36 = httpConnection32.response();
        org.jsoup.Connection connection38 = httpConnection32.ignoreContentType(false);
        org.jsoup.Connection.Request request39 = httpConnection32.request();
        org.jsoup.Connection connection42 = httpConnection32.cookie(":lt(52)", "multipart/form-data");
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
        org.jsoup.Connection connection66 = httpConnection32.data("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!", "<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", (java.io.InputStream) constrainableInputStream64);
        boolean boolean67 = element31.equals((java.lang.Object) httpConnection32);
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
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(request52);
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.CharacterReader characterReader2 = new org.jsoup.parser.CharacterReader(reader0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.parser.ParseSettings parseSettings0 = org.jsoup.parser.ParseSettings.preserveCase;
        java.lang.String str2 = parseSettings0.normalizeAttribute("#root");
        boolean boolean3 = parseSettings0.preserveTagCase();
        org.junit.Assert.assertNotNull(parseSettings0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#root" + "'", str2, "#root");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.select.Evaluator.MatchesOwn matchesOwn1 = new org.jsoup.select.Evaluator.MatchesOwn(pattern0);
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str4 = document3.wholeText();
        org.jsoup.select.Elements elements5 = document3.parents();
        org.jsoup.nodes.Element element7 = document3.appendElement("#root=\"\"");
        org.jsoup.nodes.Element element8 = element7.empty();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str11 = document10.wholeText();
        org.jsoup.select.Elements elements12 = document10.parents();
        org.jsoup.nodes.Element element13 = document10.shallowClone();
        java.lang.Object obj14 = null;
        boolean boolean15 = document10.hasSameValue(obj14);
        org.jsoup.nodes.Element element17 = document10.appendText("hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html><html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>multipart/form-data<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>hi!");
        org.jsoup.nodes.Element element18 = document10.root();
        org.jsoup.nodes.Element element20 = document10.createElement("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = matchesOwn1.matches(element8, element20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.regex.Pattern.matcher(java.lang.CharSequence)\" because \"this.pattern\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(elements5);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNotNull(element8);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(elements12);
        org.junit.Assert.assertNotNull(element13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(element20);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.id();
        org.jsoup.select.Elements elements3 = document1.previousElementSiblings();
        java.util.ListIterator<org.jsoup.nodes.Element> elementItor4 = elements3.listIterator();
        boolean boolean6 = elements3.equals((java.lang.Object) 1.0d);
        org.jsoup.select.Elements elements7 = elements3.clone();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(elements3);
        org.junit.Assert.assertNotNull(elementItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(elements7);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request1 = httpConnection0.request();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = null;
        org.jsoup.Connection connection3 = httpConnection0.sslSocketFactory(sSLSocketFactory2);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str6 = document5.id();
        java.lang.String str7 = document5.baseUri();
        org.jsoup.nodes.Element element8 = document5.clearAttributes();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = document5.dataset();
        org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
        org.jsoup.Connection connection12 = httpConnection0.userAgent("#declaration");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        long long36 = constrainableInputStream32.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            constrainableInputStream32.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resetting to invalid mark");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.select.NodeFilter nodeFilter0 = null;
        org.jsoup.nodes.Document document2 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str3 = document2.wholeText();
        org.jsoup.select.Elements elements4 = document2.parents();
        org.jsoup.nodes.Element element6 = document2.appendElement("#root=\"\"");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.NodeFilter.FilterResult filterResult7 = org.jsoup.select.NodeTraversor.filter(nodeFilter0, (org.jsoup.nodes.Node) element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.select.NodeFilter.head(org.jsoup.nodes.Node, int)\" because \"filter\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(elements4);
        org.junit.Assert.assertNotNull(element6);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.html("Content-Encoding");
        org.jsoup.select.Elements elements5 = document1.getElementsByIndexEquals((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = elements5.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements5);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection.Request request22 = httpConnection21.request();
        org.jsoup.Connection.Request request25 = request22.addHeader("multipart/form-data", "hi!");
        boolean boolean27 = request25.hasHeader("multipart/form-data");
        boolean boolean29 = request25.hasHeader("multipart/form-data");
        org.jsoup.Connection.Method method30 = request25.method();
        org.jsoup.Connection.Method method31 = request25.method();
        org.jsoup.Connection.Request request34 = request25.addHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36", ":eq(-1)");
        org.jsoup.Connection connection35 = httpConnection0.request(request25);
        org.jsoup.Connection connection38 = connection35.cookie("<html>\n <head></head> \n <body>\n   hi!  \n </body>\n</html>", "org.jsoup.select.Selector$SelectorParseException: :lt(52)");
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
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + method30 + "' != '" + org.jsoup.Connection.Method.GET + "'", method30.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertTrue("'" + method31 + "' != '" + org.jsoup.Connection.Method.GET + "'", method31.equals(org.jsoup.Connection.Method.GET));
        org.junit.Assert.assertNotNull(request34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.nodes.Document document1 = org.jsoup.nodes.Document.createShell("Content-Encoding=\"#root\"");
        org.jsoup.nodes.Element element3 = document1.appendElement("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(element3);
    }
}

