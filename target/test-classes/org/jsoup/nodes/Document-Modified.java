package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

    private OutputSettings outputSettings = new OutputSettings();

    private Parser parser;

    private QuirksMode quirksMode = QuirksMode.noQuirks;

    private String location;

    private boolean updateMetaCharset = false;

    public Document(String baseUri) {
        super(Tag.valueOf("#root", ParseSettings.htmlDefault), baseUri);
        this.location = baseUri;
    }

    public static Document createShell(String baseUri) {
        Validate.notNull(baseUri);
        Document doc = new Document(baseUri);
        doc.parser = doc.parser();
        Element html = doc.appendElement("html");
        html.appendElement("head");
        html.appendElement("body");
        return doc;
    }

    public String location() {
        return location;
    }

    public Element head() {
        return findFirstElementByTagName("head", this);
    }

    public Element body() {
        return findFirstElementByTagName("body", this);
    }

    public String title() {
        Element titleEl = getElementsByTag("title").first();
        return null != titleEl ? StringUtil.normaliseWhitespace(titleEl.text()).trim() : "";
    }

    public void title(String title) {
        Validate.notNull(title);
        Element titleEl = getElementsByTag("title").first();
        if (null == titleEl) {
            head().appendElement("title").text(title);
        } else {
            titleEl.text(title);
        }
    }

    public Element createElement(String tagName) {
        return new Element(Tag.valueOf(tagName, ParseSettings.preserveCase), this.baseUri());
    }

    public Document normalise() {
        Element htmlEl = findFirstElementByTagName("html", this);
        if (null == htmlEl)
            htmlEl = appendElement("html");
        if (null == head())
            htmlEl.prependElement("head");
        if (null == body())
            htmlEl.appendElement("body");
        normaliseTextNodes(head());
        normaliseTextNodes(htmlEl);
        normaliseTextNodes(this);
        normaliseStructure("head", htmlEl);
        normaliseStructure("body", htmlEl);
        ensureMetaCharsetElement();
        return this;
    }

    private void normaliseTextNodes(Element element) {
        List<Node> toMove = new ArrayList<>();
        for (Node node : element.childNodes) {
            if (node instanceof TextNode) {
                TextNode tn = (TextNode) node;
                if (!tn.isBlank())
                    toMove.add(tn);
            }
        }
        for (int i = toMove.size() - 1; i >= 0; i--) {
            Node node = toMove.get(i);
            element.removeChild(node);
            body().prependChild(new TextNode(" "));
            body().prependChild(node);
        }
    }

    private void normaliseStructure(String tag, Element htmlEl) {
        Elements elements = this.getElementsByTag(tag);
        Element master = elements.first();
        if (elements.size() > 1) {
            List<Node> toMove = new ArrayList<>();
            for (int i = 1; i < elements.size(); i++) {
                Node dupe = elements.get(i);
                toMove.addAll(dupe.ensureChildNodes());
                dupe.remove();
            }
            for (Node dupe : toMove) master.appendChild(dupe);
        }
        if (!master.parent().equals(htmlEl)) {
            htmlEl.appendChild(master);
        }
    }

    private Element findFirstElementByTagName(String tag, Node node) {
        if (node.nodeName().equals(tag))
            return (Element) node;
        else {
            int size = node.childNodeSize();
            for (int i = 0; i < size; i++) {
                Element found = findFirstElementByTagName(tag, node.childNode(i));
                if (null != found)
                    return found;
            }
        }
        return null;
    }

    @Override
    public String outerHtml() {
        return super.html();
    }

    @Override
    public Element text(String text) {
        body().text(text);
        return this;
    }

    @Override
    public String nodeName() {
        return "#document";
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        outputSettings.charset(charset);
        ensureMetaCharsetElement();
    }

    public Charset charset() {
        return outputSettings.charset();
    }

    public void updateMetaCharsetElement(boolean update) {
        this.updateMetaCharset = update;
    }

    public boolean updateMetaCharsetElement() {
        return updateMetaCharset;
    }

    @Override
    public Document clone() {
        Document clone = (Document) super.clone();
        clone.outputSettings = this.outputSettings.clone();
        return clone;
    }

    private void ensureMetaCharsetElement() {
        if (updateMetaCharset) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element metaCharset = select("meta[charset]").first();
                if (null != metaCharset) {
                    metaCharset.attr("charset", charset().displayName());
                } else {
                    Element head = head();
                    if (null != head) {
                        head.appendElement("meta").attr("charset", charset().displayName());
                    }
                }
                select("meta[name=charset]").remove();
            } else if (syntax == OutputSettings.Syntax.xml) {
                Node node = childNodes().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration decl = (XmlDeclaration) node;
                    if (decl.name().equals("xml")) {
                        decl.attr("encoding", charset().displayName());
                        final String version = decl.attr("version");
                        if (null != version) {
                            decl.attr("version", "1.0");
                        }
                    } else {
                        decl = new XmlDeclaration("xml", false);
                        decl.attr("version", "1.0");
                        decl.attr("encoding", charset().displayName());
                        prependChild(decl);
                    }
                } else {
                    XmlDeclaration decl = new XmlDeclaration("xml", false);
                    decl.attr("version", "1.0");
                    decl.attr("encoding", charset().displayName());
                    prependChild(decl);
                }
            }
        }
    }

    public static class OutputSettings implements Cloneable {

        public enum Syntax {

            html, xml
        }

        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;

        private Charset charset;

        private ThreadLocal<CharsetEncoder> encoderThreadLocal = new ThreadLocal<>();

        Entities.CoreCharset coreCharset;

        private boolean prettyPrint = true;

        private boolean outline = false;

        private int indentAmount = 1;

        private Syntax syntax = Syntax.html;

        public OutputSettings() {
            charset(Charset.forName("UTF8"));
        }

        public Entities.EscapeMode escapeMode() {
            return escapeMode;
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.escapeMode = escapeMode;
            return this;
        }

        public Charset charset() {
            return charset;
        }

        public OutputSettings charset(Charset charset) {
            this.charset = charset;
            return this;
        }

        public OutputSettings charset(String charset) {
            charset(Charset.forName(charset));
            return this;
        }

        CharsetEncoder prepareEncoder() {
            CharsetEncoder encoder = charset.newEncoder();
            encoderThreadLocal.set(encoder);
            coreCharset = Entities.CoreCharset.byName(encoder.charset().name());
            return encoder;
        }

        CharsetEncoder encoder() {
            CharsetEncoder encoder = encoderThreadLocal.get();
            return null != encoder ? encoder : prepareEncoder();
        }

        public Syntax syntax() {
            return syntax;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.syntax = syntax;
            return this;
        }

        public boolean prettyPrint() {
            return prettyPrint;
        }

        public OutputSettings prettyPrint(boolean pretty) {
            prettyPrint = pretty;
            return this;
        }

        public boolean outline() {
            return outline;
        }

        public OutputSettings outline(boolean outlineMode) {
            outline = outlineMode;
            return this;
        }

        public int indentAmount() {
            return indentAmount;
        }

        public OutputSettings indentAmount(int indentAmount) {
            Validate.isTrue(indentAmount >= 0);
            this.indentAmount = indentAmount;
            return this;
        }

        @Override
        public OutputSettings clone() {
            OutputSettings clone;
            try {
                clone = (OutputSettings) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
            clone.charset(charset.name());
            clone.escapeMode = Entities.EscapeMode.valueOf(escapeMode.name());
            return clone;
        }
    }

    public OutputSettings outputSettings() {
        return outputSettings;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public enum QuirksMode {

        noQuirks, quirks, limitedQuirks
    }

    public QuirksMode quirksMode() {
        return quirksMode;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }

    public Parser parser() {
        return parser;
    }

    public Document parser(Parser parser) {
        this.parser = parser;
        return this;
    }
}

