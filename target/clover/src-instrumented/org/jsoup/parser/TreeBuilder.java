/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
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
public abstract class TreeBuilder {public static class __CLR4_4_187p87plh9yvgr9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,10701,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Parser parser;
    CharacterReader reader;
    Tokeniser tokeniser;
    protected Document doc; // current doc we are building into
    protected ArrayList<Element> stack; // the stack of open elements
    protected String baseUri; // current base uri, for creating new elements
    protected Token currentToken; // currentToken is used only for error tracking.
    protected ParseSettings settings;

    private Token.StartTag start = new Token.StartTag(); // start tag to process
    private Token.EndTag end  = new Token.EndTag();
    abstract ParseSettings defaultSettings();

    protected void initialiseParse(Reader input, String baseUri, Parser parser) {try{__CLR4_4_187p87plh9yvgr9.R.inc(10645);
        __CLR4_4_187p87plh9yvgr9.R.inc(10646);Validate.notNull(input, "String input must not be null");
        __CLR4_4_187p87plh9yvgr9.R.inc(10647);Validate.notNull(baseUri, "BaseURI must not be null");

        __CLR4_4_187p87plh9yvgr9.R.inc(10648);doc = new Document(baseUri);
        __CLR4_4_187p87plh9yvgr9.R.inc(10649);doc.parser(parser);
        __CLR4_4_187p87plh9yvgr9.R.inc(10650);this.parser = parser;
        __CLR4_4_187p87plh9yvgr9.R.inc(10651);settings = parser.settings();
        __CLR4_4_187p87plh9yvgr9.R.inc(10652);reader = new CharacterReader(input);
        __CLR4_4_187p87plh9yvgr9.R.inc(10653);currentToken = null;
        __CLR4_4_187p87plh9yvgr9.R.inc(10654);tokeniser = new Tokeniser(reader, parser.getErrors());
        __CLR4_4_187p87plh9yvgr9.R.inc(10655);stack = new ArrayList<>(32);
        __CLR4_4_187p87plh9yvgr9.R.inc(10656);this.baseUri = baseUri;
    }finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}

    Document parse(Reader input, String baseUri, Parser parser) {try{__CLR4_4_187p87plh9yvgr9.R.inc(10657);
        __CLR4_4_187p87plh9yvgr9.R.inc(10658);initialiseParse(input, baseUri, parser);
        __CLR4_4_187p87plh9yvgr9.R.inc(10659);runParser();
        __CLR4_4_187p87plh9yvgr9.R.inc(10660);return doc;
    }finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}

    abstract List<Node> parseFragment(String inputFragment, Element context, String baseUri, Parser parser);

    protected void runParser() {try{__CLR4_4_187p87plh9yvgr9.R.inc(10661);
        __CLR4_4_187p87plh9yvgr9.R.inc(10662);while (true) {{
            __CLR4_4_187p87plh9yvgr9.R.inc(10663);Token token = tokeniser.read();
            __CLR4_4_187p87plh9yvgr9.R.inc(10664);process(token);
            __CLR4_4_187p87plh9yvgr9.R.inc(10665);token.reset();

            __CLR4_4_187p87plh9yvgr9.R.inc(10666);if ((((token.type == Token.TokenType.EOF)&&(__CLR4_4_187p87plh9yvgr9.R.iget(10667)!=0|true))||(__CLR4_4_187p87plh9yvgr9.R.iget(10668)==0&false)))
                {__CLR4_4_187p87plh9yvgr9.R.inc(10669);break;
        }}
    }}finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}

    protected abstract boolean process(Token token);

    protected boolean processStartTag(String name) {try{__CLR4_4_187p87plh9yvgr9.R.inc(10670);
        __CLR4_4_187p87plh9yvgr9.R.inc(10671);if ((((currentToken == start)&&(__CLR4_4_187p87plh9yvgr9.R.iget(10672)!=0|true))||(__CLR4_4_187p87plh9yvgr9.R.iget(10673)==0&false))) {{ // don't recycle an in-use token
            __CLR4_4_187p87plh9yvgr9.R.inc(10674);return process(new Token.StartTag().name(name));
        }
        }__CLR4_4_187p87plh9yvgr9.R.inc(10675);return process(start.reset().name(name));
    }finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}

    public boolean processStartTag(String name, Attributes attrs) {try{__CLR4_4_187p87plh9yvgr9.R.inc(10676);
        __CLR4_4_187p87plh9yvgr9.R.inc(10677);if ((((currentToken == start)&&(__CLR4_4_187p87plh9yvgr9.R.iget(10678)!=0|true))||(__CLR4_4_187p87plh9yvgr9.R.iget(10679)==0&false))) {{ // don't recycle an in-use token
            __CLR4_4_187p87plh9yvgr9.R.inc(10680);return process(new Token.StartTag().nameAttr(name, attrs));
        }
        }__CLR4_4_187p87plh9yvgr9.R.inc(10681);start.reset();
        __CLR4_4_187p87plh9yvgr9.R.inc(10682);start.nameAttr(name, attrs);
        __CLR4_4_187p87plh9yvgr9.R.inc(10683);return process(start);
    }finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}

    protected boolean processEndTag(String name) {try{__CLR4_4_187p87plh9yvgr9.R.inc(10684);
        __CLR4_4_187p87plh9yvgr9.R.inc(10685);if ((((currentToken == end)&&(__CLR4_4_187p87plh9yvgr9.R.iget(10686)!=0|true))||(__CLR4_4_187p87plh9yvgr9.R.iget(10687)==0&false))) {{ // don't recycle an in-use token
            __CLR4_4_187p87plh9yvgr9.R.inc(10688);return process(new Token.EndTag().name(name));
        }
        }__CLR4_4_187p87plh9yvgr9.R.inc(10689);return process(end.reset().name(name));
    }finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}


    protected Element currentElement() {try{__CLR4_4_187p87plh9yvgr9.R.inc(10690);
        __CLR4_4_187p87plh9yvgr9.R.inc(10691);int size = stack.size();
        __CLR4_4_187p87plh9yvgr9.R.inc(10692);return (((size > 0 )&&(__CLR4_4_187p87plh9yvgr9.R.iget(10693)!=0|true))||(__CLR4_4_187p87plh9yvgr9.R.iget(10694)==0&false))? stack.get(size-1) : null;
    }finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}


    /**
     * If the parser is tracking errors, and an error at the current position.
     * @param msg error message
     */
    protected void error(String msg) {try{__CLR4_4_187p87plh9yvgr9.R.inc(10695);
        __CLR4_4_187p87plh9yvgr9.R.inc(10696);ParseErrorList errors = parser.getErrors();
        __CLR4_4_187p87plh9yvgr9.R.inc(10697);if ((((errors.canAddError())&&(__CLR4_4_187p87plh9yvgr9.R.iget(10698)!=0|true))||(__CLR4_4_187p87plh9yvgr9.R.iget(10699)==0&false)))
            {__CLR4_4_187p87plh9yvgr9.R.inc(10700);errors.add(new ParseError(reader.pos(), msg));
    }}finally{__CLR4_4_187p87plh9yvgr9.R.flushNeeded();}}
}
