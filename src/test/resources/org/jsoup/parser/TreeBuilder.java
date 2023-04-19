package org.jsoup.parser;

import org.jsoup.parser.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonathan Hedley
 */
abstract class TreeBuilder {
    protected Parser parser;
    CharacterReader reader;
    edu.illinois.cs.test.generator.org.jsoup.parser.Tokeniser tokeniser;
    protected Document doc; // current doc we are building into
    protected ArrayList<Element> stack; // the stack of open elements
    protected String baseUri; // current base uri, for creating new elements
    protected edu.illinois.cs.test.generator.org.jsoup.parser.Token currentToken; // currentToken is used only for error tracking.
    protected ParseSettings settings;

    private edu.illinois.cs.test.generator.org.jsoup.parser.Token.StartTag start = new edu.illinois.cs.test.generator.org.jsoup.parser.Token.StartTag(); // start tag to process
    private edu.illinois.cs.test.generator.org.jsoup.parser.Token.EndTag end  = new edu.illinois.cs.test.generator.org.jsoup.parser.Token.EndTag();
    abstract ParseSettings defaultSettings();

    protected void initialiseParse(Reader input, String baseUri, Parser parser) {
        Validate.notNull(input, "String input must not be null");
        Validate.notNull(baseUri, "BaseURI must not be null");

        doc = new Document(baseUri);
        doc.parser(parser);
        this.parser = parser;
        settings = parser.settings();
        reader = new CharacterReader(input);
        currentToken = null;
        tokeniser = new edu.illinois.cs.test.generator.org.jsoup.parser.Tokeniser(reader, parser.getErrors());
        stack = new ArrayList<>(32);
        this.baseUri = baseUri;
    }

    Document parse(Reader input, String baseUri, Parser parser) {
        initialiseParse(input, baseUri, parser);
        runParser();
        return doc;
    }

    abstract List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser);

    protected void runParser() {
        while (true) {
            edu.illinois.cs.test.generator.org.jsoup.parser.Token token = tokeniser.read();
            process(token);
            token.reset();

            if (token.type == edu.illinois.cs.test.generator.org.jsoup.parser.Token.TokenType.EOF)
                break;
        }
    }

    protected abstract boolean process(edu.illinois.cs.test.generator.org.jsoup.parser.Token token);

    protected boolean processStartTag(String name) {
        if (currentToken == start) { // don't recycle an in-use token
            return process(new edu.illinois.cs.test.generator.org.jsoup.parser.Token.StartTag().name(name));
        }
        return process(start.reset().name(name));
    }

    public boolean processStartTag(String name, Attributes attrs) {
        if (currentToken == start) { // don't recycle an in-use token
            return process(new edu.illinois.cs.test.generator.org.jsoup.parser.Token.StartTag().nameAttr(name, attrs));
        }
        start.reset();
        start.nameAttr(name, attrs);
        return process(start);
    }

    protected boolean processEndTag(String name) {
        if (currentToken == end) { // don't recycle an in-use token
            return process(new edu.illinois.cs.test.generator.org.jsoup.parser.Token.EndTag().name(name));
        }
        return process(end.reset().name(name));
    }


    protected Element currentElement() {
        int size = stack.size();
        return size > 0 ? stack.get(size-1) : null;
    }


    /**
     * If the parser is tracking errors, and an error at the current position.
     * @param msg error message
     */
    protected void error(String msg) {
        ParseErrorList errors = parser.getErrors();
        if (errors.canAddError())
            errors.add(new ParseError(reader.pos(), msg));
    }
}
