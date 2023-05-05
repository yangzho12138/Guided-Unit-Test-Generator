/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.util.ArrayList;

/**
 * The Tree Builder's current state. Each state embodies the processing for the state, and transitions to other states.
 */
@java.lang.SuppressWarnings({"fallthrough"}) enum HtmlTreeBuilderState {
    Initial {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6570);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6571);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6572)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6573)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6574);return true; // ignore whitespace
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6575);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6576)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6577)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6578);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6579);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6580)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6581)==0&false))) {{
                // todo: parse error check on expected doctypes
                // todo: quirk state check on doctype ids
                __CLR4_4_152i52ilh9yvgoq.R.inc(6582);Token.Doctype d = t.asDoctype();
                __CLR4_4_152i52ilh9yvgoq.R.inc(6583);DocumentType doctype = new DocumentType(
                    tb.settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
                __CLR4_4_152i52ilh9yvgoq.R.inc(6584);doctype.setPubSysKey(d.getPubSysKey());
                __CLR4_4_152i52ilh9yvgoq.R.inc(6585);tb.getDocument().appendChild(doctype);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6586);if ((((d.isForceQuirks())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6587)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6588)==0&false)))
                    {__CLR4_4_152i52ilh9yvgoq.R.inc(6589);tb.getDocument().quirksMode(Document.QuirksMode.quirks);
                }__CLR4_4_152i52ilh9yvgoq.R.inc(6590);tb.transition(BeforeHtml);
            } }else {{
                // todo: check not iframe srcdoc
                __CLR4_4_152i52ilh9yvgoq.R.inc(6591);tb.transition(BeforeHtml);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6592);return tb.process(t); // re-process token
            }
            }}}__CLR4_4_152i52ilh9yvgoq.R.inc(6593);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    BeforeHtml {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6594);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6595);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6596)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6597)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6598);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6599);return false;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6600);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6601)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6602)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6603);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6604);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6605)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6606)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6607);return true; // ignore whitespace
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6608);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6609)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6610)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6611);tb.insert(t.asStartTag());
                __CLR4_4_152i52ilh9yvgoq.R.inc(6612);tb.transition(BeforeHead);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6613);if ((((t.isEndTag() && (StringUtil.in(t.asEndTag().normalName(), "head", "body", "html", "br")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6614)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6615)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6616);return anythingElse(t, tb);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6617);if ((((t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6618)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6619)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6620);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6621);return false;
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6622);return anythingElse(t, tb);
            }
            }}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(6623);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6624);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6625);tb.insertStartTag("html");
            __CLR4_4_152i52ilh9yvgoq.R.inc(6626);tb.transition(BeforeHead);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6627);return tb.process(t);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    BeforeHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6628);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6629);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6630)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6631)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6632);return true;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6633);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6634)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6635)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6636);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6637);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6638)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6639)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6640);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6641);return false;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6642);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6643)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6644)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6645);return InBody.process(t, tb); // does not transition
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6646);if ((((t.isStartTag() && t.asStartTag().normalName().equals("head"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6647)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6648)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6649);Element head = tb.insert(t.asStartTag());
                __CLR4_4_152i52ilh9yvgoq.R.inc(6650);tb.setHeadElement(head);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6651);tb.transition(InHead);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6652);if ((((t.isEndTag() && (StringUtil.in(t.asEndTag().normalName(), "head", "body", "html", "br")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6653)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6654)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6655);tb.processStartTag("head");
                __CLR4_4_152i52ilh9yvgoq.R.inc(6656);return tb.process(t);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6657);if ((((t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6658)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6659)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6660);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6661);return false;
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6662);tb.processStartTag("head");
                __CLR4_4_152i52ilh9yvgoq.R.inc(6663);return tb.process(t);
            }
            }}}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(6664);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6665);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6666);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6667)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6668)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6669);tb.insert(t.asCharacter());
                __CLR4_4_152i52ilh9yvgoq.R.inc(6670);return true;
            }
            }boolean __CLB4_4_1_bool0=false;__CLR4_4_152i52ilh9yvgoq.R.inc(6671);switch (t.type) {
                case Comment:if (!__CLB4_4_1_bool0) {__CLR4_4_152i52ilh9yvgoq.R.inc(6672);__CLB4_4_1_bool0=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6673);tb.insert(t.asComment());
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6674);break;
                case Doctype:if (!__CLB4_4_1_bool0) {__CLR4_4_152i52ilh9yvgoq.R.inc(6675);__CLB4_4_1_bool0=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6676);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6677);return false;
                case StartTag:if (!__CLB4_4_1_bool0) {__CLR4_4_152i52ilh9yvgoq.R.inc(6678);__CLB4_4_1_bool0=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6679);Token.StartTag start = t.asStartTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6680);String name = start.normalName();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6681);if ((((name.equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6682)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6683)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6684);return InBody.process(t, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6685);if ((((StringUtil.in(name, "base", "basefont", "bgsound", "command", "link"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6686)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6687)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6688);Element el = tb.insertEmpty(start);
                        // jsoup special: update base the frist time it is seen
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6689);if ((((name.equals("base") && el.hasAttr("href"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6690)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6691)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(6692);tb.maybeSetBaseUri(el);
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6693);if ((((name.equals("meta"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6694)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6695)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6696);Element meta = tb.insertEmpty(start);
                        // todo: charset switches
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6697);if ((((name.equals("title"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6698)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6699)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6700);handleRcData(start, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6701);if ((((StringUtil.in(name, "noframes", "style"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6702)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6703)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6704);handleRawtext(start, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6705);if ((((name.equals("noscript"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6706)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6707)==0&false))) {{
                        // else if noscript && scripting flag = true: rawtext (jsoup doesn't run script, to handle as noscript)
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6708);tb.insert(start);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6709);tb.transition(InHeadNoscript);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6710);if ((((name.equals("script"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6711)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6712)==0&false))) {{
                        // skips some script rules as won't execute them

                        __CLR4_4_152i52ilh9yvgoq.R.inc(6713);tb.tokeniser.transition(TokeniserState.ScriptData);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6714);tb.markInsertionMode();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6715);tb.transition(Text);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6716);tb.insert(start);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6717);if ((((name.equals("head"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6718)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6719)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6720);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6721);return false;
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6722);return anythingElse(t, tb);
                    }
                    }}}}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(6723);break;
                case EndTag:if (!__CLB4_4_1_bool0) {__CLR4_4_152i52ilh9yvgoq.R.inc(6724);__CLB4_4_1_bool0=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6725);Token.EndTag end = t.asEndTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6726);name = end.normalName();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6727);if ((((name.equals("head"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6728)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6729)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6730);tb.pop();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6731);tb.transition(AfterHead);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6732);if ((((StringUtil.in(name, "body", "html", "br"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6733)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6734)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6735);return anythingElse(t, tb);
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6736);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6737);return false;
                    }
                    }}__CLR4_4_152i52ilh9yvgoq.R.inc(6738);break;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_152i52ilh9yvgoq.R.inc(6739);__CLB4_4_1_bool0=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6740);return anythingElse(t, tb);
            }
            __CLR4_4_152i52ilh9yvgoq.R.inc(6741);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, TreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6742);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6743);tb.processEndTag("head");
            __CLR4_4_152i52ilh9yvgoq.R.inc(6744);return tb.process(t);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InHeadNoscript {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6745);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6746);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6747)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6748)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6749);tb.error(this);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6750);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6751)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6752)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6753);return tb.process(t, InBody);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6754);if ((((t.isEndTag() && t.asEndTag().normalName().equals("noscript"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6755)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6756)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6757);tb.pop();
                __CLR4_4_152i52ilh9yvgoq.R.inc(6758);tb.transition(InHead);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6759);if ((((isWhitespace(t) || t.isComment() || (t.isStartTag() && StringUtil.in(t.asStartTag().normalName(),
                    "basefont", "bgsound", "link", "meta", "noframes", "style")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6760)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6761)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6762);return tb.process(t, InHead);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6763);if ((((t.isEndTag() && t.asEndTag().normalName().equals("br"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6764)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6765)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6766);return anythingElse(t, tb);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6767);if (((((t.isStartTag() && StringUtil.in(t.asStartTag().normalName(), "head", "noscript")) || t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6768)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6769)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6770);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(6771);return false;
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6772);return anythingElse(t, tb);
            }
            }}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(6773);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6774);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6775);tb.error(this);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6776);tb.insert(new Token.Character().data(t.toString()));
            __CLR4_4_152i52ilh9yvgoq.R.inc(6777);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    AfterHead {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6778);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6779);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6780)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6781)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6782);tb.insert(t.asCharacter());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6783);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6784)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6785)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6786);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6787);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6788)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6789)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6790);tb.error(this);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6791);if ((((t.isStartTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6792)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6793)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6794);Token.StartTag startTag = t.asStartTag();
                __CLR4_4_152i52ilh9yvgoq.R.inc(6795);String name = startTag.normalName();
                __CLR4_4_152i52ilh9yvgoq.R.inc(6796);if ((((name.equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6797)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6798)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6799);return tb.process(t, InBody);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6800);if ((((name.equals("body"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6801)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6802)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6803);tb.insert(startTag);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6804);tb.framesetOk(false);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6805);tb.transition(InBody);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6806);if ((((name.equals("frameset"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6807)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6808)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6809);tb.insert(startTag);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6810);tb.transition(InFrameset);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6811);if ((((StringUtil.in(name, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6812)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6813)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6814);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6815);Element head = tb.getHeadElement();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6816);tb.push(head);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6817);tb.process(t, InHead);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6818);tb.removeFromStack(head);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6819);if ((((name.equals("head"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6820)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6821)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6822);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6823);return false;
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6824);anythingElse(t, tb);
                }
            }}}}}} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6825);if ((((t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6826)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6827)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6828);if ((((StringUtil.in(t.asEndTag().normalName(), "body", "html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6829)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6830)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6831);anythingElse(t, tb);
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6832);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6833);return false;
                }
            }} }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(6834);anythingElse(t, tb);
            }
            }}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(6835);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6836);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6837);tb.processStartTag("body");
            __CLR4_4_152i52ilh9yvgoq.R.inc(6838);tb.framesetOk(true);
            __CLR4_4_152i52ilh9yvgoq.R.inc(6839);return tb.process(t);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(6840);
            boolean __CLB4_4_1_bool1=false;__CLR4_4_152i52ilh9yvgoq.R.inc(6841);switch (t.type) {
                case Character:if (!__CLB4_4_1_bool1) {__CLR4_4_152i52ilh9yvgoq.R.inc(6842);__CLB4_4_1_bool1=true;} {
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6843);Token.Character c = t.asCharacter();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6844);if ((((c.getData().equals(nullString))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6845)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6846)==0&false))) {{
                        // todo confirm that check
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6847);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6848);return false;
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6849);if ((((tb.framesetOk() && isWhitespace(c))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6850)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6851)==0&false))) {{ // don't check if whitespace if frames already closed
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6852);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6853);tb.insert(c);
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6854);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6855);tb.insert(c);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6856);tb.framesetOk(false);
                    }
                    }}__CLR4_4_152i52ilh9yvgoq.R.inc(6857);break;
                }
                case Comment:if (!__CLB4_4_1_bool1) {__CLR4_4_152i52ilh9yvgoq.R.inc(6858);__CLB4_4_1_bool1=true;} {
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6859);tb.insert(t.asComment());
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6860);break;
                }
                case Doctype:if (!__CLB4_4_1_bool1) {__CLR4_4_152i52ilh9yvgoq.R.inc(6861);__CLB4_4_1_bool1=true;} {
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6862);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6863);return false;
                }
                case StartTag:if (!__CLB4_4_1_bool1) {__CLR4_4_152i52ilh9yvgoq.R.inc(6864);__CLB4_4_1_bool1=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6865);Token.StartTag startTag = t.asStartTag();
                    // todo - refactor to a switch statement
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6866);String name = startTag.normalName();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(6867);if ((((name.equals("a"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6868)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6869)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6870);if ((((tb.getActiveFormattingElement("a") != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6871)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6872)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6873);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6874);tb.processEndTag("a");

                            // still on stack?
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6875);Element remainingA = tb.getFromStack("a");
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6876);if ((((remainingA != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6877)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6878)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(6879);tb.removeFromActiveFormattingElements(remainingA);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(6880);tb.removeFromStack(remainingA);
                            }
                        }}
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(6881);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6882);Element a = tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6883);tb.pushActiveFormattingElements(a);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6884);if ((((StringUtil.inSorted(name, Constants.InBodyStartEmptyFormatters))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6885)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6886)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6887);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6888);tb.insertEmpty(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6889);tb.framesetOk(false);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6890);if ((((StringUtil.inSorted(name, Constants.InBodyStartPClosers))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6891)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6892)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6893);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6894)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6895)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6896);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(6897);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6898);if ((((name.equals("span"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6899)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6900)==0&false))) {{
                        // same as final else, but short circuits lots of checks
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6901);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6902);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6903);if ((((name.equals("li"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6904)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6905)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6906);tb.framesetOk(false);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6907);ArrayList<Element> stack = tb.getStack();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6908);for (int i = stack.size() - 1; (((i > 0)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6909)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6910)==0&false)); i--) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6911);Element el = stack.get(i);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6912);if ((((el.normalName().equals("li"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6913)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6914)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(6915);tb.processEndTag("li");
                                __CLR4_4_152i52ilh9yvgoq.R.inc(6916);break;
                            }
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(6917);if ((((tb.isSpecial(el) && !StringUtil.inSorted(el.normalName(), Constants.InBodyStartLiBreakers))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6918)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6919)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(6920);break;
                        }}
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(6921);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6922)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6923)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6924);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(6925);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6926);if ((((name.equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6927)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6928)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6929);tb.error(this);
                        // merge attributes onto real html
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6930);Element html = tb.getStack().get(0);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6931);for (Attribute attribute : startTag.getAttributes()) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6932);if ((((!html.hasAttr(attribute.getKey()))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6933)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6934)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(6935);html.attributes().put(attribute);
                        }}
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6936);if ((((StringUtil.inSorted(name, Constants.InBodyStartToHead))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6937)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6938)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6939);return tb.process(t, InHead);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6940);if ((((name.equals("body"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6941)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6942)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6943);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6944);ArrayList<Element> stack = tb.getStack();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6945);if ((((stack.size() == 1 || (stack.size() > 2 && !stack.get(1).normalName().equals("body")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6946)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6947)==0&false))) {{
                            // only in fragment case
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6948);return false; // ignore
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6949);tb.framesetOk(false);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6950);Element body = stack.get(1);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6951);for (Attribute attribute : startTag.getAttributes()) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(6952);if ((((!body.hasAttr(attribute.getKey()))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6953)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6954)==0&false)))
                                    {__CLR4_4_152i52ilh9yvgoq.R.inc(6955);body.attributes().put(attribute);
                            }}
                        }}
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6956);if ((((name.equals("frameset"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6957)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6958)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6959);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6960);ArrayList<Element> stack = tb.getStack();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6961);if ((((stack.size() == 1 || (stack.size() > 2 && !stack.get(1).normalName().equals("body")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6962)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6963)==0&false))) {{
                            // only in fragment case
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6964);return false; // ignore
                        } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6965);if ((((!tb.framesetOk())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6966)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6967)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6968);return false; // ignore frameset
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6969);Element second = stack.get(1);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6970);if ((((second.parent() != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6971)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6972)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(6973);second.remove();
                            // pop up to html element
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(6974);while ((((stack.size() > 1)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6975)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6976)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(6977);stack.remove(stack.size()-1);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(6978);tb.insert(startTag);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6979);tb.transition(InFrameset);
                        }
                    }}} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6980);if ((((StringUtil.inSorted(name, Constants.Headings))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6981)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6982)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6983);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6984)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6985)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6986);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(6987);if ((((StringUtil.inSorted(tb.currentElement().normalName(), Constants.Headings))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6988)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6989)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6990);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6991);tb.pop();
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(6992);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(6993);if ((((StringUtil.inSorted(name, Constants.InBodyStartPreListing))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6994)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6995)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(6996);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(6997)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(6998)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(6999);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7000);tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7001);tb.reader.matchConsume("\n"); // ignore LF if next token
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7002);tb.framesetOk(false);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7003);if ((((name.equals("form"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7004)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7005)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7006);if ((((tb.getFormElement() != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7007)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7008)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7009);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7010);return false;
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7011);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7012)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7013)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7014);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7015);tb.insertForm(startTag, true);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7016);if ((((StringUtil.inSorted(name, Constants.DdDt))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7017)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7018)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7019);tb.framesetOk(false);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7020);ArrayList<Element> stack = tb.getStack();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7021);for (int i = stack.size() - 1; (((i > 0)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7022)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7023)==0&false)); i--) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7024);Element el = stack.get(i);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7025);if ((((StringUtil.inSorted(el.normalName(), Constants.DdDt))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7026)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7027)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7028);tb.processEndTag(el.normalName());
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7029);break;
                            }
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7030);if ((((tb.isSpecial(el) && !StringUtil.inSorted(el.normalName(), Constants.InBodyStartLiBreakers))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7031)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7032)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7033);break;
                        }}
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7034);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7035)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7036)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7037);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7038);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7039);if ((((name.equals("plaintext"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7040)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7041)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7042);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7043)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7044)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7045);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7046);tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7047);tb.tokeniser.transition(TokeniserState.PLAINTEXT); // once in, never gets out
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7048);if ((((name.equals("button"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7049)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7050)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7051);if ((((tb.inButtonScope("button"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7052)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7053)==0&false))) {{
                            // close and reprocess
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7054);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7055);tb.processEndTag("button");
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7056);tb.process(startTag);
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7057);tb.reconstructFormattingElements();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7058);tb.insert(startTag);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7059);tb.framesetOk(false);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7060);if ((((StringUtil.inSorted(name, Constants.Formatters))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7061)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7062)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7063);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7064);Element el = tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7065);tb.pushActiveFormattingElements(el);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7066);if ((((name.equals("nobr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7067)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7068)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7069);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7070);if ((((tb.inScope("nobr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7071)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7072)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7073);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7074);tb.processEndTag("nobr");
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7075);tb.reconstructFormattingElements();
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7076);Element el = tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7077);tb.pushActiveFormattingElements(el);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7078);if ((((StringUtil.inSorted(name, Constants.InBodyStartApplets))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7079)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7080)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7081);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7082);tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7083);tb.insertMarkerToFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7084);tb.framesetOk(false);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7085);if ((((name.equals("table"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7086)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7087)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7088);if ((((tb.getDocument().quirksMode() != Document.QuirksMode.quirks && tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7089)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7090)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7091);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7092);tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7093);tb.framesetOk(false);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7094);tb.transition(InTable);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7095);if ((((name.equals("input"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7096)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7097)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7098);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7099);Element el = tb.insertEmpty(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7100);if ((((!el.attr("type").equalsIgnoreCase("hidden"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7101)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7102)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7103);tb.framesetOk(false);
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7104);if ((((StringUtil.inSorted(name, Constants.InBodyStartMedia))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7105)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7106)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7107);tb.insertEmpty(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7108);if ((((name.equals("hr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7109)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7110)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7111);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7112)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7113)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7114);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7115);tb.insertEmpty(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7116);tb.framesetOk(false);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7117);if ((((name.equals("image"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7118)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7119)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7120);if ((((tb.getFromStack("svg") == null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7121)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7122)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7123);return tb.process(startTag.name("img")); // change <image> to <img>, unless in svg
                        }else
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7124);tb.insert(startTag);
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7125);if ((((name.equals("isindex"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7126)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7127)==0&false))) {{
                        // how much do we care about the early 90s?
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7128);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7129);if ((((tb.getFormElement() != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7130)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7131)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7132);return false;

                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7133);tb.processStartTag("form");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7134);if ((((startTag.attributes.hasKey("action"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7135)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7136)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7137);Element form = tb.getFormElement();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7138);form.attr("action", startTag.attributes.get("action"));
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7139);tb.processStartTag("hr");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7140);tb.processStartTag("label");
                        // hope you like english.
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7141);String prompt = (((startTag.attributes.hasKey("prompt") )&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7142)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7143)==0&false))?
                                startTag.attributes.get("prompt") :
                                "This is a searchable index. Enter search keywords: ";

                        __CLR4_4_152i52ilh9yvgoq.R.inc(7144);tb.process(new Token.Character().data(prompt));

                        // input
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7145);Attributes inputAttribs = new Attributes();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7146);for (Attribute attr : startTag.attributes) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7147);if ((((!StringUtil.inSorted(attr.getKey(), Constants.InBodyStartInputAttribs))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7148)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7149)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7150);inputAttribs.put(attr);
                        }}
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7151);inputAttribs.put("name", "isindex");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7152);tb.processStartTag("input", inputAttribs);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7153);tb.processEndTag("label");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7154);tb.processStartTag("hr");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7155);tb.processEndTag("form");
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7156);if ((((name.equals("textarea"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7157)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7158)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7159);tb.insert(startTag);
                        // todo: If the next token is a U+000A LINE FEED (LF) character token, then ignore that token and move on to the next one. (Newlines at the start of textarea elements are ignored as an authoring convenience.)
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7160);tb.tokeniser.transition(TokeniserState.Rcdata);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7161);tb.markInsertionMode();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7162);tb.framesetOk(false);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7163);tb.transition(Text);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7164);if ((((name.equals("xmp"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7165)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7166)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7167);if ((((tb.inButtonScope("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7168)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7169)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7170);tb.processEndTag("p");
                        }
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7171);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7172);tb.framesetOk(false);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7173);handleRawtext(startTag, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7174);if ((((name.equals("iframe"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7175)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7176)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7177);tb.framesetOk(false);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7178);handleRawtext(startTag, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7179);if ((((name.equals("noembed"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7180)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7181)==0&false))) {{
                        // also handle noscript if script enabled
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7182);handleRawtext(startTag, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7183);if ((((name.equals("select"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7184)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7185)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7186);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7187);tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7188);tb.framesetOk(false);

                        __CLR4_4_152i52ilh9yvgoq.R.inc(7189);HtmlTreeBuilderState state = tb.state();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7190);if ((((state.equals(InTable) || state.equals(InCaption) || state.equals(InTableBody) || state.equals(InRow) || state.equals(InCell))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7191)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7192)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7193);tb.transition(InSelectInTable);
                        }else
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7194);tb.transition(InSelect);
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7195);if ((((StringUtil.inSorted(name, Constants.InBodyStartOptions))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7196)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7197)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7198);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7199)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7200)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7201);tb.processEndTag("option");
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7202);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7203);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7204);if ((((StringUtil.inSorted(name, Constants.InBodyStartRuby))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7205)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7206)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7207);if ((((tb.inScope("ruby"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7208)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7209)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7210);tb.generateImpliedEndTags();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7211);if ((((!tb.currentElement().normalName().equals("ruby"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7212)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7213)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7214);tb.error(this);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7215);tb.popStackToBefore("ruby"); // i.e. close up to but not include name
                            }
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7216);tb.insert(startTag);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7217);if ((((name.equals("math"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7218)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7219)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7220);tb.reconstructFormattingElements();
                        // todo: handle A start tag whose tag name is "math" (i.e. foreign, mathml)
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7221);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7222);if ((((name.equals("svg"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7223)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7224)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7225);tb.reconstructFormattingElements();
                        // todo: handle A start tag whose tag name is "svg" (xlink, svg)
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7226);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7227);if ((((StringUtil.inSorted(name, Constants.InBodyStartDrop))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7228)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7229)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7230);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7231);return false;
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7232);tb.reconstructFormattingElements();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7233);tb.insert(startTag);
                    }
                    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(7234);break;

                case EndTag:if (!__CLB4_4_1_bool1) {__CLR4_4_152i52ilh9yvgoq.R.inc(7235);__CLB4_4_1_bool1=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7236);Token.EndTag endTag = t.asEndTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7237);name = endTag.normalName();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7238);if ((((StringUtil.inSorted(name, Constants.InBodyEndAdoptionFormatters))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7239)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7240)==0&false))) {{
                        // Adoption Agency Algorithm.
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7241);for (int i = 0; (((i < 8)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7242)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7243)==0&false)); i++) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7244);Element formatEl = tb.getActiveFormattingElement(name);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7245);if ((((formatEl == null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7246)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7247)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7248);return anyOtherEndTag(t, tb);
                            }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7249);if ((((!tb.onStack(formatEl))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7250)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7251)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7252);tb.error(this);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7253);tb.removeFromActiveFormattingElements(formatEl);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7254);return true;
                            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7255);if ((((!tb.inScope(formatEl.normalName()))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7256)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7257)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7258);tb.error(this);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7259);return false;
                            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7260);if ((((tb.currentElement() != formatEl)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7261)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7262)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7263);tb.error(this);

                            }}}}__CLR4_4_152i52ilh9yvgoq.R.inc(7264);Element furthestBlock = null;
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7265);Element commonAncestor = null;
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7266);boolean seenFormattingElement = false;
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7267);ArrayList<Element> stack = tb.getStack();
                            // the spec doesn't limit to < 64, but in degenerate cases (9000+ stack depth) this prevents
                            // run-aways
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7268);final int stackSize = stack.size();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7269);for (int si = 0; (((si < stackSize && si < 64)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7270)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7271)==0&false)); si++) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7272);Element el = stack.get(si);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7273);if ((((el == formatEl)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7274)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7275)==0&false))) {{
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7276);commonAncestor = stack.get(si - 1);
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7277);seenFormattingElement = true;
                                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7278);if ((((seenFormattingElement && tb.isSpecial(el))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7279)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7280)==0&false))) {{
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7281);furthestBlock = el;
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7282);break;
                                }
                            }}}
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7283);if ((((furthestBlock == null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7284)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7285)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7286);tb.popStackToClose(formatEl.normalName());
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7287);tb.removeFromActiveFormattingElements(formatEl);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7288);return true;
                            }

                            // todo: Let a bookmark note the position of the formatting element in the list of active formatting elements relative to the elements on either side of it in the list.
                            // does that mean: int pos of format el in list?
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7289);Element node = furthestBlock;
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7290);Element lastNode = furthestBlock;
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7291);for (int j = 0; (((j < 3)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7292)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7293)==0&false)); j++) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7294);if ((((tb.onStack(node))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7295)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7296)==0&false)))
                                    {__CLR4_4_152i52ilh9yvgoq.R.inc(7297);node = tb.aboveOnStack(node);
                                }__CLR4_4_152i52ilh9yvgoq.R.inc(7298);if ((((!tb.isInActiveFormattingElements(node))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7299)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7300)==0&false))) {{ // note no bookmark check
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7301);tb.removeFromStack(node);
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7302);continue;
                                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7303);if ((((node == formatEl)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7304)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7305)==0&false)))
                                    {__CLR4_4_152i52ilh9yvgoq.R.inc(7306);break;

                                }}__CLR4_4_152i52ilh9yvgoq.R.inc(7307);Element replacement = new Element(Tag.valueOf(node.nodeName(), ParseSettings.preserveCase), tb.getBaseUri());
                                // case will follow the original node (so honours ParseSettings)
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7308);tb.replaceActiveFormattingElement(node, replacement);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7309);tb.replaceOnStack(node, replacement);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7310);node = replacement;

                                __CLR4_4_152i52ilh9yvgoq.R.inc(7311);if ((((lastNode == furthestBlock)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7312)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7313)==0&false))) {{
                                    // todo: move the aforementioned bookmark to be immediately after the new node in the list of active formatting elements.
                                    // not getting how this bookmark both straddles the element above, but is inbetween here...
                                }
                                }__CLR4_4_152i52ilh9yvgoq.R.inc(7314);if ((((lastNode.parent() != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7315)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7316)==0&false)))
                                    {__CLR4_4_152i52ilh9yvgoq.R.inc(7317);lastNode.remove();
                                }__CLR4_4_152i52ilh9yvgoq.R.inc(7318);node.appendChild(lastNode);

                                __CLR4_4_152i52ilh9yvgoq.R.inc(7319);lastNode = node;
                            }

                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7320);if ((((StringUtil.inSorted(commonAncestor.normalName(), Constants.InBodyEndTableFosters))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7321)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7322)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7323);if ((((lastNode.parent() != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7324)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7325)==0&false)))
                                    {__CLR4_4_152i52ilh9yvgoq.R.inc(7326);lastNode.remove();
                                }__CLR4_4_152i52ilh9yvgoq.R.inc(7327);tb.insertInFosterParent(lastNode);
                            } }else {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7328);if ((((lastNode.parent() != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7329)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7330)==0&false)))
                                    {__CLR4_4_152i52ilh9yvgoq.R.inc(7331);lastNode.remove();
                                }__CLR4_4_152i52ilh9yvgoq.R.inc(7332);commonAncestor.appendChild(lastNode);
                            }

                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7333);Element adopter = new Element(formatEl.tag(), tb.getBaseUri());
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7334);adopter.attributes().addAll(formatEl.attributes());
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7335);Node[] childNodes = furthestBlock.childNodes().toArray(new Node[0]);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7336);for (Node childNode : childNodes) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7337);adopter.appendChild(childNode); // append will reparent. thus the clone to avoid concurrent mod.
                            }
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7338);furthestBlock.appendChild(adopter);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7339);tb.removeFromActiveFormattingElements(formatEl);
                            // todo: insert the new element into the list of active formatting elements at the position of the aforementioned bookmark.
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7340);tb.removeFromStack(formatEl);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7341);tb.insertOnStackAfter(furthestBlock, adopter);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7342);if ((((StringUtil.inSorted(name, Constants.InBodyEndClosers))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7343)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7344)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7345);if ((((!tb.inScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7346)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7347)==0&false))) {{
                            // nothing to close
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7348);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7349);return false;
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7350);tb.generateImpliedEndTags();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7351);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7352)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7353)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7354);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7355);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7356);if ((((name.equals("span"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7357)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7358)==0&false))) {{
                        // same as final fall through, but saves short circuit
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7359);return anyOtherEndTag(t, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7360);if ((((name.equals("li"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7361)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7362)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7363);if ((((!tb.inListItemScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7364)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7365)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7366);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7367);return false;
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7368);tb.generateImpliedEndTags(name);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7369);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7370)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7371)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7372);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7373);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7374);if ((((name.equals("body"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7375)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7376)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7377);if ((((!tb.inScope("body"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7378)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7379)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7380);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7381);return false;
                        } }else {{
                            // todo: error if stack contains something not dd, dt, li, optgroup, option, p, rp, rt, tbody, td, tfoot, th, thead, tr, body, html
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7382);tb.transition(AfterBody);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7383);if ((((name.equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7384)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7385)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7386);boolean notIgnored = tb.processEndTag("body");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7387);if ((((notIgnored)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7388)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7389)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7390);return tb.process(endTag);
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7391);if ((((name.equals("form"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7392)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7393)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7394);Element currentForm = tb.getFormElement();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7395);tb.setFormElement(null);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7396);if ((((currentForm == null || !tb.inScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7397)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7398)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7399);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7400);return false;
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7401);tb.generateImpliedEndTags();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7402);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7403)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7404)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7405);tb.error(this);
                            // remove currentForm from stack. will shift anything under up.
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7406);tb.removeFromStack(currentForm);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7407);if ((((name.equals("p"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7408)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7409)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7410);if ((((!tb.inButtonScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7411)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7412)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7413);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7414);tb.processStartTag(name); // if no p to close, creates an empty <p></p>
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7415);return tb.process(endTag);
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7416);tb.generateImpliedEndTags(name);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7417);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7418)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7419)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7420);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7421);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7422);if ((((StringUtil.inSorted(name, Constants.DdDt))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7423)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7424)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7425);if ((((!tb.inScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7426)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7427)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7428);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7429);return false;
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7430);tb.generateImpliedEndTags(name);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7431);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7432)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7433)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7434);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7435);tb.popStackToClose(name);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7436);if ((((StringUtil.inSorted(name, Constants.Headings))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7437)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7438)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7439);if ((((!tb.inScope(Constants.Headings))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7440)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7441)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7442);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7443);return false;
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7444);tb.generateImpliedEndTags(name);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7445);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7446)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7447)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7448);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7449);tb.popStackToClose(Constants.Headings);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7450);if ((((name.equals("sarcasm"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7451)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7452)==0&false))) {{
                        // *sigh*
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7453);return anyOtherEndTag(t, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7454);if ((((StringUtil.inSorted(name, Constants.InBodyStartApplets))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7455)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7456)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7457);if ((((!tb.inScope("name"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7458)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7459)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7460);if ((((!tb.inScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7461)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7462)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7463);tb.error(this);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7464);return false;
                            }
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7465);tb.generateImpliedEndTags();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7466);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7467)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7468)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7469);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(7470);tb.popStackToClose(name);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7471);tb.clearFormattingElementsToLastMarker();
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7472);if ((((name.equals("br"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7473)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7474)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7475);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7476);tb.processStartTag("br");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7477);return false;
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7478);return anyOtherEndTag(t, tb);
                    }

                    }}}}}}}}}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(7479);break;
                case EOF:if (!__CLB4_4_1_bool1) {__CLR4_4_152i52ilh9yvgoq.R.inc(7480);__CLB4_4_1_bool1=true;}
                    // todo: error if stack contains something not dd, dt, li, p, tbody, td, tfoot, th, thead, tr, body, html
                    // stop parsing
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7481);break;
            }
            __CLR4_4_152i52ilh9yvgoq.R.inc(7482);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        boolean anyOtherEndTag(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7483);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7484);String name = t.asEndTag().normalName; // case insensitive search - goal is to preserve output case, not for the parse to be case sensitive
            __CLR4_4_152i52ilh9yvgoq.R.inc(7485);ArrayList<Element> stack = tb.getStack();
            __CLR4_4_152i52ilh9yvgoq.R.inc(7486);for (int pos = stack.size() -1; (((pos >= 0)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7487)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7488)==0&false)); pos--) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7489);Element node = stack.get(pos);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7490);if ((((node.normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7491)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7492)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7493);tb.generateImpliedEndTags(name);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7494);if ((((!name.equals(tb.currentElement().normalName()))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7495)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7496)==0&false)))
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7497);tb.error(this);
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7498);tb.popStackToClose(name);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7499);break;
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7500);if ((((tb.isSpecial(node))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7501)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7502)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7503);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7504);return false;
                    }
                }}
            }}
            }__CLR4_4_152i52ilh9yvgoq.R.inc(7505);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    Text {
        // in script, style etc. normally treated as data tags
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7506);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7507);if ((((t.isCharacter())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7508)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7509)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7510);tb.insert(t.asCharacter());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7511);if ((((t.isEOF())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7512)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7513)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7514);tb.error(this);
                // if current node is script: already started
                __CLR4_4_152i52ilh9yvgoq.R.inc(7515);tb.pop();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7516);tb.transition(tb.originalState());
                __CLR4_4_152i52ilh9yvgoq.R.inc(7517);return tb.process(t);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7518);if ((((t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7519)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7520)==0&false))) {{
                // if: An end tag whose tag name is "script" -- scripting nesting level, if evaluating scripts
                __CLR4_4_152i52ilh9yvgoq.R.inc(7521);tb.pop();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7522);tb.transition(tb.originalState());
            }
            }}}__CLR4_4_152i52ilh9yvgoq.R.inc(7523);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InTable {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7524);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7525);if ((((t.isCharacter())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7526)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7527)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7528);tb.newPendingTableCharacters();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7529);tb.markInsertionMode();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7530);tb.transition(InTableText);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7531);return tb.process(t);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7532);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7533)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7534)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7535);tb.insert(t.asComment());
                __CLR4_4_152i52ilh9yvgoq.R.inc(7536);return true;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7537);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7538)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7539)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7540);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7541);return false;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7542);if ((((t.isStartTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7543)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7544)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7545);Token.StartTag startTag = t.asStartTag();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7546);String name = startTag.normalName();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7547);if ((((name.equals("caption"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7548)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7549)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7550);tb.clearStackToTableContext();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7551);tb.insertMarkerToFormattingElements();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7552);tb.insert(startTag);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7553);tb.transition(InCaption);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7554);if ((((name.equals("colgroup"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7555)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7556)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7557);tb.clearStackToTableContext();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7558);tb.insert(startTag);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7559);tb.transition(InColumnGroup);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7560);if ((((name.equals("col"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7561)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7562)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7563);tb.processStartTag("colgroup");
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7564);return tb.process(t);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7565);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7566)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7567)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7568);tb.clearStackToTableContext();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7569);tb.insert(startTag);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7570);tb.transition(InTableBody);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7571);if ((((StringUtil.in(name, "td", "th", "tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7572)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7573)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7574);tb.processStartTag("tbody");
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7575);return tb.process(t);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7576);if ((((name.equals("table"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7577)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7578)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7579);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7580);boolean processed = tb.processEndTag("table");
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7581);if ((((processed)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7582)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7583)==0&false))) // only ignored if in fragment
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7584);return tb.process(t);
                }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7585);if ((((StringUtil.in(name, "style", "script"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7586)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7587)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7588);return tb.process(t, InHead);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7589);if ((((name.equals("input"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7590)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7591)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7592);if ((((!startTag.attributes.get("type").equalsIgnoreCase("hidden"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7593)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7594)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7595);return anythingElse(t, tb);
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7596);tb.insertEmpty(startTag);
                    }
                }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7597);if ((((name.equals("form"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7598)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7599)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7600);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7601);if ((((tb.getFormElement() != null)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7602)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7603)==0&false)))
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7604);return false;
                    }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7605);tb.insertForm(startTag, false);
                    }
                }} }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7606);return anythingElse(t, tb);
                }
                }}}}}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(7607);return true; // todo: check if should return processed http://www.whatwg.org/specs/web-apps/current-work/multipage/tree-construction.html#parsing-main-intable
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7608);if ((((t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7609)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7610)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7611);Token.EndTag endTag = t.asEndTag();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7612);String name = endTag.normalName();

                __CLR4_4_152i52ilh9yvgoq.R.inc(7613);if ((((name.equals("table"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7614)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7615)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7616);if ((((!tb.inTableScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7617)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7618)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7619);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7620);return false;
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7621);tb.popStackToClose("table");
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7622);tb.resetInsertionMode();
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7623);if ((((StringUtil.in(name,
                        "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7624)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7625)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7626);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7627);return false;
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7628);return anythingElse(t, tb);
                }
                }}__CLR4_4_152i52ilh9yvgoq.R.inc(7629);return true; // todo: as above todo
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7630);if ((((t.isEOF())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7631)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7632)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7633);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7634)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7635)==0&false)))
                    {__CLR4_4_152i52ilh9yvgoq.R.inc(7636);tb.error(this);
                }__CLR4_4_152i52ilh9yvgoq.R.inc(7637);return true; // stops parsing
            }
            }}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(7638);return anythingElse(t, tb);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7639);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7640);tb.error(this);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7641);boolean processed;
            __CLR4_4_152i52ilh9yvgoq.R.inc(7642);if ((((StringUtil.in(tb.currentElement().normalName(), "table", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7643)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7644)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7645);tb.setFosterInserts(true);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7646);processed = tb.process(t, InBody);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7647);tb.setFosterInserts(false);
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7648);processed = tb.process(t, InBody);
            }
            }__CLR4_4_152i52ilh9yvgoq.R.inc(7649);return processed;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InTableText {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7650);
            boolean __CLB4_4_1_bool2=false;__CLR4_4_152i52ilh9yvgoq.R.inc(7651);switch (t.type) {
                case Character:if (!__CLB4_4_1_bool2) {__CLR4_4_152i52ilh9yvgoq.R.inc(7652);__CLB4_4_1_bool2=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7653);Token.Character c = t.asCharacter();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7654);if ((((c.getData().equals(nullString))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7655)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7656)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7657);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7658);return false;
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7659);tb.getPendingTableCharacters().add(c.getData());
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7660);break;
                default:if (!__CLB4_4_1_bool2) {__CLR4_4_152i52ilh9yvgoq.R.inc(7661);__CLB4_4_1_bool2=true;}
                    // todo - don't really like the way these table character data lists are built
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7662);if ((((tb.getPendingTableCharacters().size() > 0)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7663)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7664)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7665);for (String character : tb.getPendingTableCharacters()) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7666);if ((((!isWhitespace(character))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7667)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7668)==0&false))) {{
                                // InTable anything else section:
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7669);tb.error(this);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(7670);if ((((StringUtil.in(tb.currentElement().normalName(), "table", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7671)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7672)==0&false))) {{
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7673);tb.setFosterInserts(true);
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7674);tb.process(new Token.Character().data(character), InBody);
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7675);tb.setFosterInserts(false);
                                } }else {{
                                    __CLR4_4_152i52ilh9yvgoq.R.inc(7676);tb.process(new Token.Character().data(character), InBody);
                                }
                            }} }else
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(7677);tb.insert(new Token.Character().data(character));
                        }}
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7678);tb.newPendingTableCharacters();
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7679);tb.transition(tb.originalState());
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7680);return tb.process(t);
            }
            __CLR4_4_152i52ilh9yvgoq.R.inc(7681);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InCaption {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7682);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7683);if ((((t.isEndTag() && t.asEndTag().normalName().equals("caption"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7684)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7685)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7686);Token.EndTag endTag = t.asEndTag();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7687);String name = endTag.normalName();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7688);if ((((!tb.inTableScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7689)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7690)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7691);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7692);return false;
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7693);tb.generateImpliedEndTags();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7694);if ((((!tb.currentElement().normalName().equals("caption"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7695)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7696)==0&false)))
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7697);tb.error(this);
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7698);tb.popStackToClose("caption");
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7699);tb.clearFormattingElementsToLastMarker();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7700);tb.transition(InTable);
                }
            }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7701);if (((((
                    t.isStartTag() && StringUtil.in(t.asStartTag().normalName(),
                            "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr") ||
                            t.isEndTag() && t.asEndTag().normalName().equals("table"))
                    )&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7702)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7703)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7704);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7705);boolean processed = tb.processEndTag("caption");
                __CLR4_4_152i52ilh9yvgoq.R.inc(7706);if ((((processed)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7707)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7708)==0&false)))
                    {__CLR4_4_152i52ilh9yvgoq.R.inc(7709);return tb.process(t);
            }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7710);if ((((t.isEndTag() && StringUtil.in(t.asEndTag().normalName(),
                    "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7711)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7712)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7713);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7714);return false;
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7715);return tb.process(t, InBody);
            }
            }}}__CLR4_4_152i52ilh9yvgoq.R.inc(7716);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InColumnGroup {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7717);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7718);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7719)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7720)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7721);tb.insert(t.asCharacter());
                __CLR4_4_152i52ilh9yvgoq.R.inc(7722);return true;
            }
            }boolean __CLB4_4_1_bool3=false;__CLR4_4_152i52ilh9yvgoq.R.inc(7723);switch (t.type) {
                case Comment:if (!__CLB4_4_1_bool3) {__CLR4_4_152i52ilh9yvgoq.R.inc(7724);__CLB4_4_1_bool3=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7725);tb.insert(t.asComment());
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7726);break;
                case Doctype:if (!__CLB4_4_1_bool3) {__CLR4_4_152i52ilh9yvgoq.R.inc(7727);__CLB4_4_1_bool3=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7728);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7729);break;
                case StartTag:if (!__CLB4_4_1_bool3) {__CLR4_4_152i52ilh9yvgoq.R.inc(7730);__CLB4_4_1_bool3=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7731);Token.StartTag startTag = t.asStartTag();
                    boolean __CLB4_4_1_bool4=false;__CLR4_4_152i52ilh9yvgoq.R.inc(7732);switch (startTag.normalName()) {
                        case "html":if (!__CLB4_4_1_bool4) {__CLR4_4_152i52ilh9yvgoq.R.inc(7733);__CLB4_4_1_bool4=true;}
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7734);return tb.process(t, InBody);
                        case "col":if (!__CLB4_4_1_bool4) {__CLR4_4_152i52ilh9yvgoq.R.inc(7735);__CLB4_4_1_bool4=true;}
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7736);tb.insertEmpty(startTag);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7737);break;
                        default:if (!__CLB4_4_1_bool4) {__CLR4_4_152i52ilh9yvgoq.R.inc(7738);__CLB4_4_1_bool4=true;}
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7739);return anythingElse(t, tb);
                    }
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7740);break;
                case EndTag:if (!__CLB4_4_1_bool3) {__CLR4_4_152i52ilh9yvgoq.R.inc(7741);__CLB4_4_1_bool3=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7742);Token.EndTag endTag = t.asEndTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7743);if ((((endTag.normalName.equals("colgroup"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7744)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7745)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7746);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7747)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7748)==0&false))) {{ // frag case
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7749);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7750);return false;
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7751);tb.pop();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7752);tb.transition(InTable);
                        }
                    }} }else
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7753);return anythingElse(t, tb);
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7754);break;
                case EOF:if (!__CLB4_4_1_bool3) {__CLR4_4_152i52ilh9yvgoq.R.inc(7755);__CLB4_4_1_bool3=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7756);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7757)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7758)==0&false)))
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7759);return true; // stop parsing; frag case
                    }else
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7760);return anythingElse(t, tb);
                }default:if (!__CLB4_4_1_bool3) {__CLR4_4_152i52ilh9yvgoq.R.inc(7761);__CLB4_4_1_bool3=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7762);return anythingElse(t, tb);
            }
            __CLR4_4_152i52ilh9yvgoq.R.inc(7763);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, TreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7764);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7765);boolean processed = tb.processEndTag("colgroup");
            __CLR4_4_152i52ilh9yvgoq.R.inc(7766);if ((((processed)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7767)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7768)==0&false))) // only ignored in frag case
                {__CLR4_4_152i52ilh9yvgoq.R.inc(7769);return tb.process(t);
            }__CLR4_4_152i52ilh9yvgoq.R.inc(7770);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InTableBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7771);
            boolean __CLB4_4_1_bool5=false;__CLR4_4_152i52ilh9yvgoq.R.inc(7772);switch (t.type) {
                case StartTag:if (!__CLB4_4_1_bool5) {__CLR4_4_152i52ilh9yvgoq.R.inc(7773);__CLB4_4_1_bool5=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7774);Token.StartTag startTag = t.asStartTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7775);String name = startTag.normalName();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7776);if ((((name.equals("template"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7777)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7778)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7779);tb.insert(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7780);if ((((name.equals("tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7781)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7782)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7783);tb.clearStackToTableBodyContext();
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7784);tb.insert(startTag);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7785);tb.transition(InRow);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7786);if ((((StringUtil.in(name, "th", "td"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7787)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7788)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7789);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7790);tb.processStartTag("tr");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7791);return tb.process(startTag);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7792);if ((((StringUtil.in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7793)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7794)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7795);return exitTableBody(t, tb);
                    } }else
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7796);return anythingElse(t, tb);
                    }}}}__CLR4_4_152i52ilh9yvgoq.R.inc(7797);break;
                case EndTag:if (!__CLB4_4_1_bool5) {__CLR4_4_152i52ilh9yvgoq.R.inc(7798);__CLB4_4_1_bool5=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7799);Token.EndTag endTag = t.asEndTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7800);name = endTag.normalName();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7801);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7802)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7803)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7804);if ((((!tb.inTableScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7805)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7806)==0&false))) {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7807);tb.error(this);
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7808);return false;
                        } }else {{
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7809);tb.clearStackToTableBodyContext();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7810);tb.pop();
                            __CLR4_4_152i52ilh9yvgoq.R.inc(7811);tb.transition(InTable);
                        }
                    }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7812);if ((((name.equals("table"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7813)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7814)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7815);return exitTableBody(t, tb);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7816);if ((((StringUtil.in(name, "body", "caption", "col", "colgroup", "html", "td", "th", "tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7817)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7818)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7819);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7820);return false;
                    } }else
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7821);return anythingElse(t, tb);
                    }}}__CLR4_4_152i52ilh9yvgoq.R.inc(7822);break;
                default:if (!__CLB4_4_1_bool5) {__CLR4_4_152i52ilh9yvgoq.R.inc(7823);__CLB4_4_1_bool5=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7824);return anythingElse(t, tb);
            }
            __CLR4_4_152i52ilh9yvgoq.R.inc(7825);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean exitTableBody(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7826);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7827);if ((((!(tb.inTableScope("tbody") || tb.inTableScope("thead") || tb.inScope("tfoot")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7828)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7829)==0&false))) {{
                // frag case
                __CLR4_4_152i52ilh9yvgoq.R.inc(7830);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7831);return false;
            }
            }__CLR4_4_152i52ilh9yvgoq.R.inc(7832);tb.clearStackToTableBodyContext();
            __CLR4_4_152i52ilh9yvgoq.R.inc(7833);tb.processEndTag(tb.currentElement().normalName()); // tbody, tfoot, thead
            __CLR4_4_152i52ilh9yvgoq.R.inc(7834);return tb.process(t);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7835);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7836);return tb.process(t, InTable);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InRow {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7837);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7838);if ((((t.isStartTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7839)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7840)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7841);Token.StartTag startTag = t.asStartTag();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7842);String name = startTag.normalName();

                __CLR4_4_152i52ilh9yvgoq.R.inc(7843);if ((((name.equals("template"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7844)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7845)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7846);tb.insert(startTag);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7847);if ((((StringUtil.in(name, "th", "td"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7848)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7849)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7850);tb.clearStackToTableRowContext();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7851);tb.insert(startTag);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7852);tb.transition(InCell);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7853);tb.insertMarkerToFormattingElements();
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7854);if ((((StringUtil.in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7855)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7856)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7857);return handleMissingTr(t, tb);
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7858);return anythingElse(t, tb);
                }
            }}}} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7859);if ((((t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7860)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7861)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7862);Token.EndTag endTag = t.asEndTag();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7863);String name = endTag.normalName();

                __CLR4_4_152i52ilh9yvgoq.R.inc(7864);if ((((name.equals("tr"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7865)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7866)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7867);if ((((!tb.inTableScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7868)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7869)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7870);tb.error(this); // frag
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7871);return false;
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7872);tb.clearStackToTableRowContext();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7873);tb.pop(); // tr
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7874);tb.transition(InTableBody);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7875);if ((((name.equals("table"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7876)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7877)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7878);return handleMissingTr(t, tb);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7879);if ((((StringUtil.in(name, "tbody", "tfoot", "thead"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7880)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7881)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7882);if ((((!tb.inTableScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7883)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7884)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7885);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7886);return false;
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7887);tb.processEndTag("tr");
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7888);return tb.process(t);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7889);if ((((StringUtil.in(name, "body", "caption", "col", "colgroup", "html", "td", "th"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7890)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7891)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7892);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7893);return false;
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7894);return anythingElse(t, tb);
                }
            }}}}} }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7895);return anythingElse(t, tb);
            }
            }}__CLR4_4_152i52ilh9yvgoq.R.inc(7896);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7897);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7898);return tb.process(t, InTable);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean handleMissingTr(Token t, TreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7899);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7900);boolean processed = tb.processEndTag("tr");
            __CLR4_4_152i52ilh9yvgoq.R.inc(7901);if ((((processed)&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7902)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7903)==0&false)))
                {__CLR4_4_152i52ilh9yvgoq.R.inc(7904);return tb.process(t);
            }else
                {__CLR4_4_152i52ilh9yvgoq.R.inc(7905);return false;
        }}finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InCell {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7906);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7907);if ((((t.isEndTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7908)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7909)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7910);Token.EndTag endTag = t.asEndTag();
                __CLR4_4_152i52ilh9yvgoq.R.inc(7911);String name = endTag.normalName();

                __CLR4_4_152i52ilh9yvgoq.R.inc(7912);if ((((StringUtil.inSorted(name, Constants.InCellNames))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7913)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7914)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7915);if ((((!tb.inTableScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7916)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7917)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7918);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7919);tb.transition(InRow); // might not be in scope if empty: <td /> and processing fake end tag
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7920);return false;
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7921);tb.generateImpliedEndTags();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7922);if ((((!tb.currentElement().normalName().equals(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7923)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7924)==0&false)))
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7925);tb.error(this);
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7926);tb.popStackToClose(name);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7927);tb.clearFormattingElementsToLastMarker();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7928);tb.transition(InRow);
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7929);if ((((StringUtil.inSorted(name, Constants.InCellBody))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7930)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7931)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7932);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7933);return false;
                } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7934);if ((((StringUtil.inSorted(name, Constants.InCellTable))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7935)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7936)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7937);if ((((!tb.inTableScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7938)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7939)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7940);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7941);return false;
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7942);closeCell(tb);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7943);return tb.process(t);
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7944);return anythingElse(t, tb);
                }
            }}}} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7945);if ((((t.isStartTag() &&
                    StringUtil.inSorted(t.asStartTag().normalName(), Constants.InCellCol))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7946)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7947)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7948);if ((((!(tb.inTableScope("td") || tb.inTableScope("th")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7949)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7950)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7951);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7952);return false;
                }
                }__CLR4_4_152i52ilh9yvgoq.R.inc(7953);closeCell(tb);
                __CLR4_4_152i52ilh9yvgoq.R.inc(7954);return tb.process(t);
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(7955);return anythingElse(t, tb);
            }
            }}__CLR4_4_152i52ilh9yvgoq.R.inc(7956);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7957);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7958);return tb.process(t, InBody);
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private void closeCell(HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7959);
            __CLR4_4_152i52ilh9yvgoq.R.inc(7960);if ((((tb.inTableScope("td"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7961)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7962)==0&false)))
                {__CLR4_4_152i52ilh9yvgoq.R.inc(7963);tb.processEndTag("td");
            }else
                {__CLR4_4_152i52ilh9yvgoq.R.inc(7964);tb.processEndTag("th"); // only here if th or td in scope
        }}finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InSelect {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(7965);
            boolean __CLB4_4_1_bool6=false;__CLR4_4_152i52ilh9yvgoq.R.inc(7966);switch (t.type) {
                case Character:if (!__CLB4_4_1_bool6) {__CLR4_4_152i52ilh9yvgoq.R.inc(7967);__CLB4_4_1_bool6=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7968);Token.Character c = t.asCharacter();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7969);if ((((c.getData().equals(nullString))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7970)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7971)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7972);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7973);return false;
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7974);tb.insert(c);
                    }
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(7975);break;
                case Comment:if (!__CLB4_4_1_bool6) {__CLR4_4_152i52ilh9yvgoq.R.inc(7976);__CLB4_4_1_bool6=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7977);tb.insert(t.asComment());
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7978);break;
                case Doctype:if (!__CLB4_4_1_bool6) {__CLR4_4_152i52ilh9yvgoq.R.inc(7979);__CLB4_4_1_bool6=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7980);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7981);return false;
                case StartTag:if (!__CLB4_4_1_bool6) {__CLR4_4_152i52ilh9yvgoq.R.inc(7982);__CLB4_4_1_bool6=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7983);Token.StartTag start = t.asStartTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7984);String name = start.normalName();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(7985);if ((((name.equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7986)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7987)==0&false)))
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(7988);return tb.process(start, InBody);
                    }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7989);if ((((name.equals("option"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7990)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7991)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(7992);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7993)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7994)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(7995);tb.processEndTag("option");
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(7996);tb.insert(start);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(7997);if ((((name.equals("optgroup"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(7998)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(7999)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8000);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8001)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8002)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(8003);tb.processEndTag("option");
                        }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8004);if ((((tb.currentElement().normalName().equals("optgroup"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8005)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8006)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(8007);tb.processEndTag("optgroup");
                        }}__CLR4_4_152i52ilh9yvgoq.R.inc(8008);tb.insert(start);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8009);if ((((name.equals("select"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8010)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8011)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8012);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8013);return tb.processEndTag("select");
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8014);if ((((StringUtil.in(name, "input", "keygen", "textarea"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8015)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8016)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8017);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8018);if ((((!tb.inSelectScope("select"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8019)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8020)==0&false)))
                            {__CLR4_4_152i52ilh9yvgoq.R.inc(8021);return false; // frag
                        }__CLR4_4_152i52ilh9yvgoq.R.inc(8022);tb.processEndTag("select");
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8023);return tb.process(start);
                    } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8024);if ((((name.equals("script"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8025)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8026)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8027);return tb.process(t, InHead);
                    } }else {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8028);return anythingElse(t, tb);
                    }
                    }}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(8029);break;
                case EndTag:if (!__CLB4_4_1_bool6) {__CLR4_4_152i52ilh9yvgoq.R.inc(8030);__CLB4_4_1_bool6=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8031);Token.EndTag end = t.asEndTag();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8032);name = end.normalName();
                    boolean __CLB4_4_1_bool7=false;__CLR4_4_152i52ilh9yvgoq.R.inc(8033);switch (name) {
                        case "optgroup":if (!__CLB4_4_1_bool7) {__CLR4_4_152i52ilh9yvgoq.R.inc(8034);__CLB4_4_1_bool7=true;}
                            __CLR4_4_152i52ilh9yvgoq.R.inc(8035);if ((((tb.currentElement().normalName().equals("option") && tb.aboveOnStack(tb.currentElement()) != null && tb.aboveOnStack(tb.currentElement()).normalName().equals("optgroup"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8036)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8037)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(8038);tb.processEndTag("option");
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(8039);if ((((tb.currentElement().normalName().equals("optgroup"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8040)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8041)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(8042);tb.pop();
                            }else
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(8043);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(8044);break;
                        case "option":if (!__CLB4_4_1_bool7) {__CLR4_4_152i52ilh9yvgoq.R.inc(8045);__CLB4_4_1_bool7=true;}
                            __CLR4_4_152i52ilh9yvgoq.R.inc(8046);if ((((tb.currentElement().normalName().equals("option"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8047)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8048)==0&false)))
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(8049);tb.pop();
                            }else
                                {__CLR4_4_152i52ilh9yvgoq.R.inc(8050);tb.error(this);
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(8051);break;
                        case "select":if (!__CLB4_4_1_bool7) {__CLR4_4_152i52ilh9yvgoq.R.inc(8052);__CLB4_4_1_bool7=true;}
                            __CLR4_4_152i52ilh9yvgoq.R.inc(8053);if ((((!tb.inSelectScope(name))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8054)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8055)==0&false))) {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(8056);tb.error(this);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(8057);return false;
                            } }else {{
                                __CLR4_4_152i52ilh9yvgoq.R.inc(8058);tb.popStackToClose(name);
                                __CLR4_4_152i52ilh9yvgoq.R.inc(8059);tb.resetInsertionMode();
                            }
                            }__CLR4_4_152i52ilh9yvgoq.R.inc(8060);break;
                        default:if (!__CLB4_4_1_bool7) {__CLR4_4_152i52ilh9yvgoq.R.inc(8061);__CLB4_4_1_bool7=true;}
                            __CLR4_4_152i52ilh9yvgoq.R.inc(8062);return anythingElse(t, tb);
                    }
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8063);break;
                case EOF:if (!__CLB4_4_1_bool6) {__CLR4_4_152i52ilh9yvgoq.R.inc(8064);__CLB4_4_1_bool6=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8065);if ((((!tb.currentElement().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8066)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8067)==0&false)))
                        {__CLR4_4_152i52ilh9yvgoq.R.inc(8068);tb.error(this);
                    }__CLR4_4_152i52ilh9yvgoq.R.inc(8069);break;
                default:if (!__CLB4_4_1_bool6) {__CLR4_4_152i52ilh9yvgoq.R.inc(8070);__CLB4_4_1_bool6=true;}
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8071);return anythingElse(t, tb);
            }
            __CLR4_4_152i52ilh9yvgoq.R.inc(8072);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

        private boolean anythingElse(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8073);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8074);tb.error(this);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8075);return false;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InSelectInTable {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8076);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8077);if ((((t.isStartTag() && StringUtil.in(t.asStartTag().normalName(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8078)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8079)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8080);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8081);tb.processEndTag("select");
                __CLR4_4_152i52ilh9yvgoq.R.inc(8082);return tb.process(t);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8083);if ((((t.isEndTag() && StringUtil.in(t.asEndTag().normalName(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8084)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8085)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8086);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8087);if ((((tb.inTableScope(t.asEndTag().normalName()))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8088)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8089)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8090);tb.processEndTag("select");
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8091);return (tb.process(t));
                } }else
                    {__CLR4_4_152i52ilh9yvgoq.R.inc(8092);return false;
            }} }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8093);return tb.process(t, InSelect);
            }
        }}}finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    AfterBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8094);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8095);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8096)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8097)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8098);return tb.process(t, InBody);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8099);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8100)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8101)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8102);tb.insert(t.asComment()); // into html node
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8103);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8104)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8105)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8106);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8107);return false;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8108);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8109)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8110)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8111);return tb.process(t, InBody);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8112);if ((((t.isEndTag() && t.asEndTag().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8113)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8114)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8115);if ((((tb.isFragmentParsing())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8116)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8117)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8118);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8119);return false;
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8120);tb.transition(AfterAfterBody);
                }
            }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8121);if ((((t.isEOF())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8122)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8123)==0&false))) {{
                // chillax! we're done
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8124);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8125);tb.transition(InBody);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8126);return tb.process(t);
            }
            }}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(8127);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    InFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8128);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8129);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8130)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8131)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8132);tb.insert(t.asCharacter());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8133);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8134)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8135)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8136);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8137);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8138)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8139)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8140);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8141);return false;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8142);if ((((t.isStartTag())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8143)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8144)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8145);Token.StartTag start = t.asStartTag();
                boolean __CLB4_4_1_bool8=false;__CLR4_4_152i52ilh9yvgoq.R.inc(8146);switch (start.normalName()) {
                    case "html":if (!__CLB4_4_1_bool8) {__CLR4_4_152i52ilh9yvgoq.R.inc(8147);__CLB4_4_1_bool8=true;}
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8148);return tb.process(start, InBody);
                    case "frameset":if (!__CLB4_4_1_bool8) {__CLR4_4_152i52ilh9yvgoq.R.inc(8149);__CLB4_4_1_bool8=true;}
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8150);tb.insert(start);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8151);break;
                    case "frame":if (!__CLB4_4_1_bool8) {__CLR4_4_152i52ilh9yvgoq.R.inc(8152);__CLB4_4_1_bool8=true;}
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8153);tb.insertEmpty(start);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8154);break;
                    case "noframes":if (!__CLB4_4_1_bool8) {__CLR4_4_152i52ilh9yvgoq.R.inc(8155);__CLB4_4_1_bool8=true;}
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8156);return tb.process(start, InHead);
                    default:if (!__CLB4_4_1_bool8) {__CLR4_4_152i52ilh9yvgoq.R.inc(8157);__CLB4_4_1_bool8=true;}
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8158);tb.error(this);
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8159);return false;
                }
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8160);if ((((t.isEndTag() && t.asEndTag().normalName().equals("frameset"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8161)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8162)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8163);if ((((tb.currentElement().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8164)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8165)==0&false))) {{ // frag
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8166);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8167);return false;
                } }else {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8168);tb.pop();
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8169);if ((((!tb.isFragmentParsing() && !tb.currentElement().normalName().equals("frameset"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8170)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8171)==0&false))) {{
                        __CLR4_4_152i52ilh9yvgoq.R.inc(8172);tb.transition(AfterFrameset);
                    }
                }}
            }} }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8173);if ((((t.isEOF())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8174)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8175)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8176);if ((((!tb.currentElement().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8177)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8178)==0&false))) {{
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8179);tb.error(this);
                    __CLR4_4_152i52ilh9yvgoq.R.inc(8180);return true;
                }
            }} }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8181);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8182);return false;
            }
            }}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(8183);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    AfterFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8184);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8185);if ((((isWhitespace(t))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8186)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8187)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8188);tb.insert(t.asCharacter());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8189);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8190)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8191)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8192);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8193);if ((((t.isDoctype())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8194)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8195)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8196);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8197);return false;
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8198);if ((((t.isStartTag() && t.asStartTag().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8199)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8200)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8201);return tb.process(t, InBody);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8202);if ((((t.isEndTag() && t.asEndTag().normalName().equals("html"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8203)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8204)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8205);tb.transition(AfterAfterFrameset);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8206);if ((((t.isStartTag() && t.asStartTag().normalName().equals("noframes"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8207)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8208)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8209);return tb.process(t, InHead);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8210);if ((((t.isEOF())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8211)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8212)==0&false))) {{
                // cool your heels, we're complete
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8213);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8214);return false;
            }
            }}}}}}}__CLR4_4_152i52ilh9yvgoq.R.inc(8215);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    AfterAfterBody {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8216);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8217);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8218)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8219)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8220);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8221);if ((((t.isDoctype() || isWhitespace(t) || (t.isStartTag() && t.asStartTag().normalName().equals("html")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8222)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8223)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8224);return tb.process(t, InBody);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8225);if ((((t.isEOF())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8226)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8227)==0&false))) {{
                // nice work chuck
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8228);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8229);tb.transition(InBody);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8230);return tb.process(t);
            }
            }}}__CLR4_4_152i52ilh9yvgoq.R.inc(8231);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    AfterAfterFrameset {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8232);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8233);if ((((t.isComment())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8234)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8235)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8236);tb.insert(t.asComment());
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8237);if ((((t.isDoctype() || isWhitespace(t) || (t.isStartTag() && t.asStartTag().normalName().equals("html")))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8238)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8239)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8240);return tb.process(t, InBody);
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8241);if ((((t.isEOF())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8242)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8243)==0&false))) {{
                // nice work chuck
            } }else {__CLR4_4_152i52ilh9yvgoq.R.inc(8244);if ((((t.isStartTag() && t.asStartTag().normalName().equals("noframes"))&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8245)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8246)==0&false))) {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8247);return tb.process(t, InHead);
            } }else {{
                __CLR4_4_152i52ilh9yvgoq.R.inc(8248);tb.error(this);
                __CLR4_4_152i52ilh9yvgoq.R.inc(8249);return false;
            }
            }}}}__CLR4_4_152i52ilh9yvgoq.R.inc(8250);return true;
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    },
    ForeignContent {
        boolean process(Token t, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8251);
            __CLR4_4_152i52ilh9yvgoq.R.inc(8252);return true;
            // todo: implement. Also; how do we get here?
        }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}
    };

    private static String nullString = String.valueOf('\u0000');

    abstract boolean process(Token t, HtmlTreeBuilder tb);

    private static boolean isWhitespace(Token t) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8253);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8254);if ((((t.isCharacter())&&(__CLR4_4_152i52ilh9yvgoq.R.iget(8255)!=0|true))||(__CLR4_4_152i52ilh9yvgoq.R.iget(8256)==0&false))) {{
            __CLR4_4_152i52ilh9yvgoq.R.inc(8257);String data = t.asCharacter().getData();
            __CLR4_4_152i52ilh9yvgoq.R.inc(8258);return isWhitespace(data);
        }
        }__CLR4_4_152i52ilh9yvgoq.R.inc(8259);return false;
    }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

    private static boolean isWhitespace(String data) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8260);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8261);return StringUtil.isBlank(data);
    }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

    private static void handleRcData(Token.StartTag startTag, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8262);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8263);tb.tokeniser.transition(TokeniserState.Rcdata);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8264);tb.markInsertionMode();
        __CLR4_4_152i52ilh9yvgoq.R.inc(8265);tb.transition(Text);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8266);tb.insert(startTag);
    }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

    private static void handleRawtext(Token.StartTag startTag, HtmlTreeBuilder tb) {try{__CLR4_4_152i52ilh9yvgoq.R.inc(8267);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8268);tb.tokeniser.transition(TokeniserState.Rawtext);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8269);tb.markInsertionMode();
        __CLR4_4_152i52ilh9yvgoq.R.inc(8270);tb.transition(Text);
        __CLR4_4_152i52ilh9yvgoq.R.inc(8271);tb.insert(startTag);
    }finally{__CLR4_4_152i52ilh9yvgoq.R.flushNeeded();}}

    // lists of tags to search through. A little harder to read here, but causes less GC than dynamic varargs.
    // was contributing around 10% of parse GC load.
    // must make sure these are sorted, as used in findSorted. MUST update HtmlTreebuilderStateTest if more arrays added.
    static final class Constants {
        static final String[] InBodyStartToHead = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
        static final String[] InBodyStartPClosers = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl",
            "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol",
            "p", "section", "summary", "ul"};
        static final String[] Headings = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] InBodyStartPreListing = new String[]{"listing", "pre"};
        static final String[] InBodyStartLiBreakers = new String[]{"address", "div", "p"};
        static final String[] DdDt = new String[]{"dd", "dt"};
        static final String[] Formatters = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] InBodyStartApplets = new String[]{"applet", "marquee", "object"};
        static final String[] InBodyStartEmptyFormatters = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
        static final String[] InBodyStartMedia = new String[]{"param", "source", "track"};
        static final String[] InBodyStartInputAttribs = new String[]{"action", "name", "prompt"};
        static final String[] InBodyStartOptions = new String[]{"optgroup", "option"};
        static final String[] InBodyStartRuby = new String[]{"rp", "rt"};
        static final String[] InBodyStartDrop = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] InBodyEndClosers = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div",
            "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu",
            "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] InBodyEndAdoptionFormatters = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        static final String[] InBodyEndTableFosters = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InCellNames = new String[]{"td", "th"};
        static final String[] InCellBody = new String[]{"body", "caption", "col", "colgroup", "html"};
        static final String[] InCellTable = new String[]{ "table", "tbody", "tfoot", "thead", "tr"};
        static final String[] InCellCol = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }
;public static class __CLR4_4_152i52ilh9yvgoq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,8272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
