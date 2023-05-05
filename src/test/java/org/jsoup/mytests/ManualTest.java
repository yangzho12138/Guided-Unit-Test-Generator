package org.jsoup.mytests;

import org.jsoup.Jsoup;
import org.jsoup.TextUtil;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;

public class ManualTest {

    @Test public void testIframe() {
        Document doc = Jsoup.parse("<html><head id=2><iframe id=1></iframe></head></html>");

        Element iframe = doc.getElementById("1");
        iframe.html("good");
        assertEquals("good", iframe.html());
        iframe.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", iframe.html());

        Element head = doc.getElementById("2");
        head.html("<iframe><i>bad</i></iframe>");
        assertEquals("<iframe>&lt;i&gt;bad&lt;/i&gt;</iframe>", head.html());
    }

    @Test public void testScript() {
        Document doc = Jsoup.parse("<html><head id=2><script id=1></script></head></html>");

        Element script = doc.getElementById("1");
        script.html("good");
        assertEquals("good", script.html());
        script.html("<i>bad</i>");
        assertEquals("&lt;i&gt;bad&lt;/i&gt;", script.html());
    }

    @Test public void testNoScript() {
        Document doc = Jsoup.parse("<html><head id=2><noscript id=1></noscript></head></html>");

        Element noscript = doc.getElementById("1");
        noscript.html("good");
        assertEquals("good", noscript.html());
        //noscript.html("<i>bad</i>");
        //assertEquals("&lt;i&gt;bad&lt;/i&gt;", noscript.html());
    }

    @Test public void testPlainText() {
        Document doc = Jsoup.parse("<html><head id=2><plaintext id=1></plaintext></head></html>");

        Element plaintext = doc.getElementById("1");
        plaintext.html("good");
        assertEquals("good", plaintext.html());
        //noscript.html("<i>bad</i>");
        //assertEquals("&lt;i&gt;bad&lt;/i&gt;", noscript.html());
    }

}