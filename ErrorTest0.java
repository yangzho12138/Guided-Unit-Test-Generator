import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str3 = document1.outerHtml();
        boolean boolean5 = document1.hasSameValue((java.lang.Object) 1);
        java.lang.String str6 = document1.tagName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = document1.firstElementSibling();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element4 = document1.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = document1.firstElementSibling();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        org.jsoup.nodes.Element element3 = document1.val("hi!");
        org.jsoup.nodes.Element element5 = element3.html("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = element5.text("#text");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element4 = document1.wrap("Content-Encoding");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser1 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
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
        org.jsoup.nodes.Attributes attributes15 = new org.jsoup.nodes.Attributes();
        org.jsoup.nodes.Attributes attributes18 = attributes15.put("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>", false);
        org.jsoup.nodes.Attributes attributes21 = attributes15.add("hi!", "multipart/form-data");
        java.lang.String str22 = attributes21.html();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = treeBuilder13.processStartTag("<!#root!>", attributes21);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element58 = document45.firstElementSibling();
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.String str2 = document1.className();
        java.lang.String str4 = document1.attr("<html>\n <head></head>\n <body>\n  hi!\n </body>\n</html>");
        java.lang.String str5 = document1.normalName();
        java.lang.String str6 = document1.html();
        org.jsoup.nodes.Element element9 = document1.attr(":only-child", "#doctype");
        java.lang.String str10 = element9.baseUri();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = element9.firstElementSibling();
    }
}

