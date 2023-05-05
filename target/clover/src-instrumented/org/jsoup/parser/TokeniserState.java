/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.nodes.DocumentType;

/**
 * States and transition activations for the Tokeniser.
 */
@java.lang.SuppressWarnings({"fallthrough"}) enum TokeniserState {
    Data {
        // in data state, gather characters until a character reference or tag is found
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9200);
            boolean __CLB4_4_1_bool0=false;__CLR4_4_173k73klh9yvgqz.R.inc(9201);switch (r.current()) {
                case '&':if (!__CLB4_4_1_bool0) {__CLR4_4_173k73klh9yvgqz.R.inc(9202);__CLB4_4_1_bool0=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9203);t.advanceTransition(CharacterReferenceInData);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9204);break;
                case '<':if (!__CLB4_4_1_bool0) {__CLR4_4_173k73klh9yvgqz.R.inc(9205);__CLB4_4_1_bool0=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9206);t.advanceTransition(TagOpen);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9207);break;
                case nullChar:if (!__CLB4_4_1_bool0) {__CLR4_4_173k73klh9yvgqz.R.inc(9208);__CLB4_4_1_bool0=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9209);t.error(this); // NOT replacement character (oddly?)
                    __CLR4_4_173k73klh9yvgqz.R.inc(9210);t.emit(r.consume());
                    __CLR4_4_173k73klh9yvgqz.R.inc(9211);break;
                case eof:if (!__CLB4_4_1_bool0) {__CLR4_4_173k73klh9yvgqz.R.inc(9212);__CLB4_4_1_bool0=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9213);t.emit(new Token.EOF());
                    __CLR4_4_173k73klh9yvgqz.R.inc(9214);break;
                default:if (!__CLB4_4_1_bool0) {__CLR4_4_173k73klh9yvgqz.R.inc(9215);__CLB4_4_1_bool0=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9216);String data = r.consumeData();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9217);t.emit(data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9218);break;
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CharacterReferenceInData {
        // from & in data
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9219);
            __CLR4_4_173k73klh9yvgqz.R.inc(9220);readCharRef(t, Data);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    Rcdata {
        /// handles data in title, textarea etc
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9221);
            boolean __CLB4_4_1_bool1=false;__CLR4_4_173k73klh9yvgqz.R.inc(9222);switch (r.current()) {
                case '&':if (!__CLB4_4_1_bool1) {__CLR4_4_173k73klh9yvgqz.R.inc(9223);__CLB4_4_1_bool1=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9224);t.advanceTransition(CharacterReferenceInRcdata);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9225);break;
                case '<':if (!__CLB4_4_1_bool1) {__CLR4_4_173k73klh9yvgqz.R.inc(9226);__CLB4_4_1_bool1=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9227);t.advanceTransition(RcdataLessthanSign);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9228);break;
                case nullChar:if (!__CLB4_4_1_bool1) {__CLR4_4_173k73klh9yvgqz.R.inc(9229);__CLB4_4_1_bool1=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9230);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9231);r.advance();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9232);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9233);break;
                case eof:if (!__CLB4_4_1_bool1) {__CLR4_4_173k73klh9yvgqz.R.inc(9234);__CLB4_4_1_bool1=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9235);t.emit(new Token.EOF());
                    __CLR4_4_173k73klh9yvgqz.R.inc(9236);break;
                default:if (!__CLB4_4_1_bool1) {__CLR4_4_173k73klh9yvgqz.R.inc(9237);__CLB4_4_1_bool1=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9238);String data = r.consumeToAny('&', '<', nullChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9239);t.emit(data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9240);break;
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CharacterReferenceInRcdata {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9241);
            __CLR4_4_173k73klh9yvgqz.R.inc(9242);readCharRef(t, Rcdata);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    Rawtext {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9243);
            __CLR4_4_173k73klh9yvgqz.R.inc(9244);readData(t, r, this, RawtextLessthanSign);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptData {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9245);
            __CLR4_4_173k73klh9yvgqz.R.inc(9246);readData(t, r, this, ScriptDataLessthanSign);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    PLAINTEXT {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9247);
            boolean __CLB4_4_1_bool2=false;__CLR4_4_173k73klh9yvgqz.R.inc(9248);switch (r.current()) {
                case nullChar:if (!__CLB4_4_1_bool2) {__CLR4_4_173k73klh9yvgqz.R.inc(9249);__CLB4_4_1_bool2=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9250);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9251);r.advance();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9252);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9253);break;
                case eof:if (!__CLB4_4_1_bool2) {__CLR4_4_173k73klh9yvgqz.R.inc(9254);__CLB4_4_1_bool2=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9255);t.emit(new Token.EOF());
                    __CLR4_4_173k73klh9yvgqz.R.inc(9256);break;
                default:if (!__CLB4_4_1_bool2) {__CLR4_4_173k73klh9yvgqz.R.inc(9257);__CLB4_4_1_bool2=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9258);String data = r.consumeTo(nullChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9259);t.emit(data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9260);break;
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    TagOpen {
        // from < in data
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9261);
            boolean __CLB4_4_1_bool3=false;__CLR4_4_173k73klh9yvgqz.R.inc(9262);switch (r.current()) {
                case '!':if (!__CLB4_4_1_bool3) {__CLR4_4_173k73klh9yvgqz.R.inc(9263);__CLB4_4_1_bool3=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9264);t.advanceTransition(MarkupDeclarationOpen);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9265);break;
                case '/':if (!__CLB4_4_1_bool3) {__CLR4_4_173k73klh9yvgqz.R.inc(9266);__CLB4_4_1_bool3=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9267);t.advanceTransition(EndTagOpen);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9268);break;
                case '?':if (!__CLB4_4_1_bool3) {__CLR4_4_173k73klh9yvgqz.R.inc(9269);__CLB4_4_1_bool3=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9270);t.advanceTransition(BogusComment);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9271);break;
                default:if (!__CLB4_4_1_bool3) {__CLR4_4_173k73klh9yvgqz.R.inc(9272);__CLB4_4_1_bool3=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9273);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9274)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9275)==0&false))) {{
                        __CLR4_4_173k73klh9yvgqz.R.inc(9276);t.createTagPending(true);
                        __CLR4_4_173k73klh9yvgqz.R.inc(9277);t.transition(TagName);
                    } }else {{
                        __CLR4_4_173k73klh9yvgqz.R.inc(9278);t.error(this);
                        __CLR4_4_173k73klh9yvgqz.R.inc(9279);t.emit('<'); // char that got us here
                        __CLR4_4_173k73klh9yvgqz.R.inc(9280);t.transition(Data);
                    }
                    }__CLR4_4_173k73klh9yvgqz.R.inc(9281);break;
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    EndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9282);
            __CLR4_4_173k73klh9yvgqz.R.inc(9283);if ((((r.isEmpty())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9284)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9285)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9286);t.eofError(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(9287);t.emit("</");
                __CLR4_4_173k73klh9yvgqz.R.inc(9288);t.transition(Data);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(9289);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9290)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9291)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9292);t.createTagPending(false);
                __CLR4_4_173k73klh9yvgqz.R.inc(9293);t.transition(TagName);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(9294);if ((((r.matches('>'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9295)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9296)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9297);t.error(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(9298);t.advanceTransition(Data);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9299);t.error(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(9300);t.advanceTransition(BogusComment);
            }
        }}}}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    TagName {
        // from < or </ in data, will have start or end tag pending
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9301);
            // previous TagOpen state did NOT consume, will have a letter char in current
            //String tagName = r.consumeToAnySorted(tagCharsSorted).toLowerCase();
            __CLR4_4_173k73klh9yvgqz.R.inc(9302);String tagName = r.consumeTagName();
            __CLR4_4_173k73klh9yvgqz.R.inc(9303);t.tagPending.appendTagName(tagName);

            __CLR4_4_173k73klh9yvgqz.R.inc(9304);char c = r.consume();
            boolean __CLB4_4_1_bool4=false;__CLR4_4_173k73klh9yvgqz.R.inc(9305);switch (c) {
                case '\t':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9306);__CLB4_4_1_bool4=true;}
                case '\n':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9307);__CLB4_4_1_bool4=true;}
                case '\r':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9308);__CLB4_4_1_bool4=true;}
                case '\f':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9309);__CLB4_4_1_bool4=true;}
                case ' ':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9310);__CLB4_4_1_bool4=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9311);t.transition(BeforeAttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9312);break;
                case '/':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9313);__CLB4_4_1_bool4=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9314);t.transition(SelfClosingStartTag);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9315);break;
                case '<':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9316);__CLB4_4_1_bool4=true;} // NOTE: out of spec, but clear author intent
                    __CLR4_4_173k73klh9yvgqz.R.inc(9317);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9318);r.unconsume();
                    // intended fall through to next >
                case '>':if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9319);__CLB4_4_1_bool4=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9320);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9321);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9322);break;
                case nullChar:if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9323);__CLB4_4_1_bool4=true;} // replacement
                    __CLR4_4_173k73klh9yvgqz.R.inc(9324);t.tagPending.appendTagName(replacementStr);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9325);break;
                case eof:if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9326);__CLB4_4_1_bool4=true;} // should emit pending tag?
                    __CLR4_4_173k73klh9yvgqz.R.inc(9327);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9328);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9329);break;
                default:if (!__CLB4_4_1_bool4) {__CLR4_4_173k73klh9yvgqz.R.inc(9330);__CLB4_4_1_bool4=true;} // buffer underrun
                    __CLR4_4_173k73klh9yvgqz.R.inc(9331);t.tagPending.appendTagName(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    RcdataLessthanSign {
        // from < in rcdata
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9332);
            __CLR4_4_173k73klh9yvgqz.R.inc(9333);if ((((r.matches('/'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9334)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9335)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9336);t.createTempBuffer();
                __CLR4_4_173k73klh9yvgqz.R.inc(9337);t.advanceTransition(RCDATAEndTagOpen);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(9338);if ((((r.matchesLetter() && t.appropriateEndTagName() != null && !r.containsIgnoreCase("</" + t.appropriateEndTagName()))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9339)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9340)==0&false))) {{
                // diverge from spec: got a start tag, but there's no appropriate end tag (</title>), so rather than
                // consuming to EOF; break out here
                __CLR4_4_173k73klh9yvgqz.R.inc(9341);t.tagPending = t.createTagPending(false).name(t.appropriateEndTagName());
                __CLR4_4_173k73klh9yvgqz.R.inc(9342);t.emitTagPending();
                __CLR4_4_173k73klh9yvgqz.R.inc(9343);r.unconsume(); // undo "<"
                __CLR4_4_173k73klh9yvgqz.R.inc(9344);t.transition(Data);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9345);t.emit("<");
                __CLR4_4_173k73klh9yvgqz.R.inc(9346);t.transition(Rcdata);
            }
        }}}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    RCDATAEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9347);
            __CLR4_4_173k73klh9yvgqz.R.inc(9348);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9349)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9350)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9351);t.createTagPending(false);
                __CLR4_4_173k73klh9yvgqz.R.inc(9352);t.tagPending.appendTagName(r.current());
                __CLR4_4_173k73klh9yvgqz.R.inc(9353);t.dataBuffer.append(r.current());
                __CLR4_4_173k73klh9yvgqz.R.inc(9354);t.advanceTransition(RCDATAEndTagName);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9355);t.emit("</");
                __CLR4_4_173k73klh9yvgqz.R.inc(9356);t.transition(Rcdata);
            }
        }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    RCDATAEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9357);
            __CLR4_4_173k73klh9yvgqz.R.inc(9358);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9359)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9360)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9361);String name = r.consumeLetterSequence();
                __CLR4_4_173k73klh9yvgqz.R.inc(9362);t.tagPending.appendTagName(name);
                __CLR4_4_173k73klh9yvgqz.R.inc(9363);t.dataBuffer.append(name);
                __CLR4_4_173k73klh9yvgqz.R.inc(9364);return;
            }

            }__CLR4_4_173k73klh9yvgqz.R.inc(9365);char c = r.consume();
            boolean __CLB4_4_1_bool5=false;__CLR4_4_173k73klh9yvgqz.R.inc(9366);switch (c) {
                case '\t':if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9367);__CLB4_4_1_bool5=true;}
                case '\n':if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9368);__CLB4_4_1_bool5=true;}
                case '\r':if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9369);__CLB4_4_1_bool5=true;}
                case '\f':if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9370);__CLB4_4_1_bool5=true;}
                case ' ':if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9371);__CLB4_4_1_bool5=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9372);if ((((t.isAppropriateEndTagToken())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9373)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9374)==0&false)))
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9375);t.transition(BeforeAttributeName);
                    }else
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9376);anythingElse(t, r);
                    }__CLR4_4_173k73klh9yvgqz.R.inc(9377);break;
                case '/':if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9378);__CLB4_4_1_bool5=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9379);if ((((t.isAppropriateEndTagToken())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9380)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9381)==0&false)))
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9382);t.transition(SelfClosingStartTag);
                    }else
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9383);anythingElse(t, r);
                    }__CLR4_4_173k73klh9yvgqz.R.inc(9384);break;
                case '>':if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9385);__CLB4_4_1_bool5=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9386);if ((((t.isAppropriateEndTagToken())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9387)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9388)==0&false))) {{
                        __CLR4_4_173k73klh9yvgqz.R.inc(9389);t.emitTagPending();
                        __CLR4_4_173k73klh9yvgqz.R.inc(9390);t.transition(Data);
                    }
                    }else
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9391);anythingElse(t, r);
                    }__CLR4_4_173k73klh9yvgqz.R.inc(9392);break;
                default:if (!__CLB4_4_1_bool5) {__CLR4_4_173k73klh9yvgqz.R.inc(9393);__CLB4_4_1_bool5=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9394);anythingElse(t, r);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}

        private void anythingElse(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9395);
            __CLR4_4_173k73klh9yvgqz.R.inc(9396);t.emit("</" + t.dataBuffer.toString());
            __CLR4_4_173k73klh9yvgqz.R.inc(9397);r.unconsume();
            __CLR4_4_173k73klh9yvgqz.R.inc(9398);t.transition(Rcdata);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    RawtextLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9399);
            __CLR4_4_173k73klh9yvgqz.R.inc(9400);if ((((r.matches('/'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9401)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9402)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9403);t.createTempBuffer();
                __CLR4_4_173k73klh9yvgqz.R.inc(9404);t.advanceTransition(RawtextEndTagOpen);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9405);t.emit('<');
                __CLR4_4_173k73klh9yvgqz.R.inc(9406);t.transition(Rawtext);
            }
        }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    RawtextEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9407);
            __CLR4_4_173k73klh9yvgqz.R.inc(9408);readEndTag(t, r, RawtextEndTagName, Rawtext);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    RawtextEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9409);
            __CLR4_4_173k73klh9yvgqz.R.inc(9410);handleDataEndTag(t, r, Rawtext);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9411);
            boolean __CLB4_4_1_bool6=false;__CLR4_4_173k73klh9yvgqz.R.inc(9412);switch (r.consume()) {
                case '/':if (!__CLB4_4_1_bool6) {__CLR4_4_173k73klh9yvgqz.R.inc(9413);__CLB4_4_1_bool6=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9414);t.createTempBuffer();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9415);t.transition(ScriptDataEndTagOpen);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9416);break;
                case '!':if (!__CLB4_4_1_bool6) {__CLR4_4_173k73klh9yvgqz.R.inc(9417);__CLB4_4_1_bool6=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9418);t.emit("<!");
                    __CLR4_4_173k73klh9yvgqz.R.inc(9419);t.transition(ScriptDataEscapeStart);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9420);break;
                default:if (!__CLB4_4_1_bool6) {__CLR4_4_173k73klh9yvgqz.R.inc(9421);__CLB4_4_1_bool6=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9422);t.emit("<");
                    __CLR4_4_173k73klh9yvgqz.R.inc(9423);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9424);t.transition(ScriptData);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9425);
            __CLR4_4_173k73klh9yvgqz.R.inc(9426);readEndTag(t, r, ScriptDataEndTagName, ScriptData);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9427);
            __CLR4_4_173k73klh9yvgqz.R.inc(9428);handleDataEndTag(t, r, ScriptData);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscapeStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9429);
            __CLR4_4_173k73klh9yvgqz.R.inc(9430);if ((((r.matches('-'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9431)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9432)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9433);t.emit('-');
                __CLR4_4_173k73klh9yvgqz.R.inc(9434);t.advanceTransition(ScriptDataEscapeStartDash);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9435);t.transition(ScriptData);
            }
        }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscapeStartDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9436);
            __CLR4_4_173k73klh9yvgqz.R.inc(9437);if ((((r.matches('-'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9438)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9439)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9440);t.emit('-');
                __CLR4_4_173k73klh9yvgqz.R.inc(9441);t.advanceTransition(ScriptDataEscapedDashDash);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9442);t.transition(ScriptData);
            }
        }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscaped {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9443);
            __CLR4_4_173k73klh9yvgqz.R.inc(9444);if ((((r.isEmpty())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9445)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9446)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9447);t.eofError(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(9448);t.transition(Data);
                __CLR4_4_173k73klh9yvgqz.R.inc(9449);return;
            }

            }boolean __CLB4_4_1_bool7=false;__CLR4_4_173k73klh9yvgqz.R.inc(9450);switch (r.current()) {
                case '-':if (!__CLB4_4_1_bool7) {__CLR4_4_173k73klh9yvgqz.R.inc(9451);__CLB4_4_1_bool7=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9452);t.emit('-');
                    __CLR4_4_173k73klh9yvgqz.R.inc(9453);t.advanceTransition(ScriptDataEscapedDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9454);break;
                case '<':if (!__CLB4_4_1_bool7) {__CLR4_4_173k73klh9yvgqz.R.inc(9455);__CLB4_4_1_bool7=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9456);t.advanceTransition(ScriptDataEscapedLessthanSign);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9457);break;
                case nullChar:if (!__CLB4_4_1_bool7) {__CLR4_4_173k73klh9yvgqz.R.inc(9458);__CLB4_4_1_bool7=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9459);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9460);r.advance();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9461);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9462);break;
                default:if (!__CLB4_4_1_bool7) {__CLR4_4_173k73klh9yvgqz.R.inc(9463);__CLB4_4_1_bool7=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9464);String data = r.consumeToAny('-', '<', nullChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9465);t.emit(data);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscapedDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9466);
            __CLR4_4_173k73klh9yvgqz.R.inc(9467);if ((((r.isEmpty())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9468)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9469)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9470);t.eofError(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(9471);t.transition(Data);
                __CLR4_4_173k73klh9yvgqz.R.inc(9472);return;
            }

            }__CLR4_4_173k73klh9yvgqz.R.inc(9473);char c = r.consume();
            boolean __CLB4_4_1_bool8=false;__CLR4_4_173k73klh9yvgqz.R.inc(9474);switch (c) {
                case '-':if (!__CLB4_4_1_bool8) {__CLR4_4_173k73klh9yvgqz.R.inc(9475);__CLB4_4_1_bool8=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9476);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9477);t.transition(ScriptDataEscapedDashDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9478);break;
                case '<':if (!__CLB4_4_1_bool8) {__CLR4_4_173k73klh9yvgqz.R.inc(9479);__CLB4_4_1_bool8=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9480);t.transition(ScriptDataEscapedLessthanSign);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9481);break;
                case nullChar:if (!__CLB4_4_1_bool8) {__CLR4_4_173k73klh9yvgqz.R.inc(9482);__CLB4_4_1_bool8=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9483);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9484);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9485);t.transition(ScriptDataEscaped);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9486);break;
                default:if (!__CLB4_4_1_bool8) {__CLR4_4_173k73klh9yvgqz.R.inc(9487);__CLB4_4_1_bool8=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9488);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9489);t.transition(ScriptDataEscaped);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscapedDashDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9490);
            __CLR4_4_173k73klh9yvgqz.R.inc(9491);if ((((r.isEmpty())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9492)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9493)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9494);t.eofError(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(9495);t.transition(Data);
                __CLR4_4_173k73klh9yvgqz.R.inc(9496);return;
            }

            }__CLR4_4_173k73klh9yvgqz.R.inc(9497);char c = r.consume();
            boolean __CLB4_4_1_bool9=false;__CLR4_4_173k73klh9yvgqz.R.inc(9498);switch (c) {
                case '-':if (!__CLB4_4_1_bool9) {__CLR4_4_173k73klh9yvgqz.R.inc(9499);__CLB4_4_1_bool9=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9500);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9501);break;
                case '<':if (!__CLB4_4_1_bool9) {__CLR4_4_173k73klh9yvgqz.R.inc(9502);__CLB4_4_1_bool9=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9503);t.transition(ScriptDataEscapedLessthanSign);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9504);break;
                case '>':if (!__CLB4_4_1_bool9) {__CLR4_4_173k73klh9yvgqz.R.inc(9505);__CLB4_4_1_bool9=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9506);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9507);t.transition(ScriptData);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9508);break;
                case nullChar:if (!__CLB4_4_1_bool9) {__CLR4_4_173k73klh9yvgqz.R.inc(9509);__CLB4_4_1_bool9=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9510);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9511);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9512);t.transition(ScriptDataEscaped);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9513);break;
                default:if (!__CLB4_4_1_bool9) {__CLR4_4_173k73klh9yvgqz.R.inc(9514);__CLB4_4_1_bool9=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9515);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9516);t.transition(ScriptDataEscaped);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscapedLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9517);
            __CLR4_4_173k73klh9yvgqz.R.inc(9518);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9519)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9520)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9521);t.createTempBuffer();
                __CLR4_4_173k73klh9yvgqz.R.inc(9522);t.dataBuffer.append(r.current());
                __CLR4_4_173k73klh9yvgqz.R.inc(9523);t.emit("<" + r.current());
                __CLR4_4_173k73klh9yvgqz.R.inc(9524);t.advanceTransition(ScriptDataDoubleEscapeStart);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(9525);if ((((r.matches('/'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9526)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9527)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9528);t.createTempBuffer();
                __CLR4_4_173k73klh9yvgqz.R.inc(9529);t.advanceTransition(ScriptDataEscapedEndTagOpen);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9530);t.emit('<');
                __CLR4_4_173k73klh9yvgqz.R.inc(9531);t.transition(ScriptDataEscaped);
            }
        }}}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscapedEndTagOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9532);
            __CLR4_4_173k73klh9yvgqz.R.inc(9533);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(9534)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9535)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9536);t.createTagPending(false);
                __CLR4_4_173k73klh9yvgqz.R.inc(9537);t.tagPending.appendTagName(r.current());
                __CLR4_4_173k73klh9yvgqz.R.inc(9538);t.dataBuffer.append(r.current());
                __CLR4_4_173k73klh9yvgqz.R.inc(9539);t.advanceTransition(ScriptDataEscapedEndTagName);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9540);t.emit("</");
                __CLR4_4_173k73klh9yvgqz.R.inc(9541);t.transition(ScriptDataEscaped);
            }
        }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataEscapedEndTagName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9542);
            __CLR4_4_173k73klh9yvgqz.R.inc(9543);handleDataEndTag(t, r, ScriptDataEscaped);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapeStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9544);
            __CLR4_4_173k73klh9yvgqz.R.inc(9545);handleDataDoubleEscapeTag(t, r, ScriptDataDoubleEscaped, ScriptDataEscaped);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataDoubleEscaped {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9546);
            __CLR4_4_173k73klh9yvgqz.R.inc(9547);char c = r.current();
            boolean __CLB4_4_1_bool10=false;__CLR4_4_173k73klh9yvgqz.R.inc(9548);switch (c) {
                case '-':if (!__CLB4_4_1_bool10) {__CLR4_4_173k73klh9yvgqz.R.inc(9549);__CLB4_4_1_bool10=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9550);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9551);t.advanceTransition(ScriptDataDoubleEscapedDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9552);break;
                case '<':if (!__CLB4_4_1_bool10) {__CLR4_4_173k73klh9yvgqz.R.inc(9553);__CLB4_4_1_bool10=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9554);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9555);t.advanceTransition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9556);break;
                case nullChar:if (!__CLB4_4_1_bool10) {__CLR4_4_173k73klh9yvgqz.R.inc(9557);__CLB4_4_1_bool10=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9558);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9559);r.advance();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9560);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9561);break;
                case eof:if (!__CLB4_4_1_bool10) {__CLR4_4_173k73klh9yvgqz.R.inc(9562);__CLB4_4_1_bool10=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9563);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9564);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9565);break;
                default:if (!__CLB4_4_1_bool10) {__CLR4_4_173k73klh9yvgqz.R.inc(9566);__CLB4_4_1_bool10=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9567);String data = r.consumeToAny('-', '<', nullChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9568);t.emit(data);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9569);
            __CLR4_4_173k73klh9yvgqz.R.inc(9570);char c = r.consume();
            boolean __CLB4_4_1_bool11=false;__CLR4_4_173k73klh9yvgqz.R.inc(9571);switch (c) {
                case '-':if (!__CLB4_4_1_bool11) {__CLR4_4_173k73klh9yvgqz.R.inc(9572);__CLB4_4_1_bool11=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9573);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9574);t.transition(ScriptDataDoubleEscapedDashDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9575);break;
                case '<':if (!__CLB4_4_1_bool11) {__CLR4_4_173k73klh9yvgqz.R.inc(9576);__CLB4_4_1_bool11=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9577);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9578);t.transition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9579);break;
                case nullChar:if (!__CLB4_4_1_bool11) {__CLR4_4_173k73klh9yvgqz.R.inc(9580);__CLB4_4_1_bool11=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9581);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9582);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9583);t.transition(ScriptDataDoubleEscaped);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9584);break;
                case eof:if (!__CLB4_4_1_bool11) {__CLR4_4_173k73klh9yvgqz.R.inc(9585);__CLB4_4_1_bool11=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9586);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9587);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9588);break;
                default:if (!__CLB4_4_1_bool11) {__CLR4_4_173k73klh9yvgqz.R.inc(9589);__CLB4_4_1_bool11=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9590);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9591);t.transition(ScriptDataDoubleEscaped);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedDashDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9592);
            __CLR4_4_173k73klh9yvgqz.R.inc(9593);char c = r.consume();
            boolean __CLB4_4_1_bool12=false;__CLR4_4_173k73klh9yvgqz.R.inc(9594);switch (c) {
                case '-':if (!__CLB4_4_1_bool12) {__CLR4_4_173k73klh9yvgqz.R.inc(9595);__CLB4_4_1_bool12=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9596);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9597);break;
                case '<':if (!__CLB4_4_1_bool12) {__CLR4_4_173k73klh9yvgqz.R.inc(9598);__CLB4_4_1_bool12=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9599);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9600);t.transition(ScriptDataDoubleEscapedLessthanSign);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9601);break;
                case '>':if (!__CLB4_4_1_bool12) {__CLR4_4_173k73klh9yvgqz.R.inc(9602);__CLB4_4_1_bool12=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9603);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9604);t.transition(ScriptData);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9605);break;
                case nullChar:if (!__CLB4_4_1_bool12) {__CLR4_4_173k73klh9yvgqz.R.inc(9606);__CLB4_4_1_bool12=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9607);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9608);t.emit(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9609);t.transition(ScriptDataDoubleEscaped);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9610);break;
                case eof:if (!__CLB4_4_1_bool12) {__CLR4_4_173k73klh9yvgqz.R.inc(9611);__CLB4_4_1_bool12=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9612);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9613);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9614);break;
                default:if (!__CLB4_4_1_bool12) {__CLR4_4_173k73klh9yvgqz.R.inc(9615);__CLB4_4_1_bool12=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9616);t.emit(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9617);t.transition(ScriptDataDoubleEscaped);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapedLessthanSign {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9618);
            __CLR4_4_173k73klh9yvgqz.R.inc(9619);if ((((r.matches('/'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9620)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9621)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9622);t.emit('/');
                __CLR4_4_173k73klh9yvgqz.R.inc(9623);t.createTempBuffer();
                __CLR4_4_173k73klh9yvgqz.R.inc(9624);t.advanceTransition(ScriptDataDoubleEscapeEnd);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9625);t.transition(ScriptDataDoubleEscaped);
            }
        }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    ScriptDataDoubleEscapeEnd {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9626);
            __CLR4_4_173k73klh9yvgqz.R.inc(9627);handleDataDoubleEscapeTag(t,r, ScriptDataEscaped, ScriptDataDoubleEscaped);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BeforeAttributeName {
        // from tagname <xxx
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9628);
            __CLR4_4_173k73klh9yvgqz.R.inc(9629);char c = r.consume();
            boolean __CLB4_4_1_bool13=false;__CLR4_4_173k73klh9yvgqz.R.inc(9630);switch (c) {
                case '\t':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9631);__CLB4_4_1_bool13=true;}
                case '\n':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9632);__CLB4_4_1_bool13=true;}
                case '\r':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9633);__CLB4_4_1_bool13=true;}
                case '\f':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9634);__CLB4_4_1_bool13=true;}
                case ' ':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9635);__CLB4_4_1_bool13=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9636);break; // ignore whitespace
                case '/':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9637);__CLB4_4_1_bool13=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9638);t.transition(SelfClosingStartTag);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9639);break;
                case '<':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9640);__CLB4_4_1_bool13=true;} // NOTE: out of spec, but clear (spec has this as a part of the attribute name)
                    __CLR4_4_173k73klh9yvgqz.R.inc(9641);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9642);r.unconsume();
                    // intended fall through as if >
                case '>':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9643);__CLB4_4_1_bool13=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9644);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9645);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9646);break;
                case nullChar:if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9647);__CLB4_4_1_bool13=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9648);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9649);t.tagPending.newAttribute();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9650);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9651);t.transition(AttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9652);break;
                case eof:if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9653);__CLB4_4_1_bool13=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9654);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9655);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9656);break;
                case '"':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9657);__CLB4_4_1_bool13=true;}
                case '\'':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9658);__CLB4_4_1_bool13=true;}
                case '=':if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9659);__CLB4_4_1_bool13=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9660);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9661);t.tagPending.newAttribute();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9662);t.tagPending.appendAttributeName(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9663);t.transition(AttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9664);break;
                default:if (!__CLB4_4_1_bool13) {__CLR4_4_173k73klh9yvgqz.R.inc(9665);__CLB4_4_1_bool13=true;} // A-Z, anything else
                    __CLR4_4_173k73klh9yvgqz.R.inc(9666);t.tagPending.newAttribute();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9667);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9668);t.transition(AttributeName);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AttributeName {
        // from before attribute name
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9669);
            __CLR4_4_173k73klh9yvgqz.R.inc(9670);String name = r.consumeToAnySorted(attributeNameCharsSorted);
            __CLR4_4_173k73klh9yvgqz.R.inc(9671);t.tagPending.appendAttributeName(name);

            __CLR4_4_173k73klh9yvgqz.R.inc(9672);char c = r.consume();
            boolean __CLB4_4_1_bool14=false;__CLR4_4_173k73klh9yvgqz.R.inc(9673);switch (c) {
                case '\t':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9674);__CLB4_4_1_bool14=true;}
                case '\n':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9675);__CLB4_4_1_bool14=true;}
                case '\r':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9676);__CLB4_4_1_bool14=true;}
                case '\f':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9677);__CLB4_4_1_bool14=true;}
                case ' ':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9678);__CLB4_4_1_bool14=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9679);t.transition(AfterAttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9680);break;
                case '/':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9681);__CLB4_4_1_bool14=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9682);t.transition(SelfClosingStartTag);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9683);break;
                case '=':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9684);__CLB4_4_1_bool14=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9685);t.transition(BeforeAttributeValue);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9686);break;
                case '>':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9687);__CLB4_4_1_bool14=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9688);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9689);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9690);break;
                case nullChar:if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9691);__CLB4_4_1_bool14=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9692);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9693);t.tagPending.appendAttributeName(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9694);break;
                case eof:if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9695);__CLB4_4_1_bool14=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9696);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9697);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9698);break;
                case '"':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9699);__CLB4_4_1_bool14=true;}
                case '\'':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9700);__CLB4_4_1_bool14=true;}
                case '<':if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9701);__CLB4_4_1_bool14=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9702);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9703);t.tagPending.appendAttributeName(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9704);break;
                default:if (!__CLB4_4_1_bool14) {__CLR4_4_173k73klh9yvgqz.R.inc(9705);__CLB4_4_1_bool14=true;} // buffer underrun
                    __CLR4_4_173k73klh9yvgqz.R.inc(9706);t.tagPending.appendAttributeName(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AfterAttributeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9707);
            __CLR4_4_173k73klh9yvgqz.R.inc(9708);char c = r.consume();
            boolean __CLB4_4_1_bool15=false;__CLR4_4_173k73klh9yvgqz.R.inc(9709);switch (c) {
                case '\t':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9710);__CLB4_4_1_bool15=true;}
                case '\n':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9711);__CLB4_4_1_bool15=true;}
                case '\r':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9712);__CLB4_4_1_bool15=true;}
                case '\f':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9713);__CLB4_4_1_bool15=true;}
                case ' ':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9714);__CLB4_4_1_bool15=true;}
                    // ignore
                    __CLR4_4_173k73klh9yvgqz.R.inc(9715);break;
                case '/':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9716);__CLB4_4_1_bool15=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9717);t.transition(SelfClosingStartTag);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9718);break;
                case '=':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9719);__CLB4_4_1_bool15=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9720);t.transition(BeforeAttributeValue);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9721);break;
                case '>':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9722);__CLB4_4_1_bool15=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9723);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9724);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9725);break;
                case nullChar:if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9726);__CLB4_4_1_bool15=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9727);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9728);t.tagPending.appendAttributeName(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9729);t.transition(AttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9730);break;
                case eof:if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9731);__CLB4_4_1_bool15=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9732);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9733);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9734);break;
                case '"':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9735);__CLB4_4_1_bool15=true;}
                case '\'':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9736);__CLB4_4_1_bool15=true;}
                case '<':if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9737);__CLB4_4_1_bool15=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9738);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9739);t.tagPending.newAttribute();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9740);t.tagPending.appendAttributeName(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9741);t.transition(AttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9742);break;
                default:if (!__CLB4_4_1_bool15) {__CLR4_4_173k73klh9yvgqz.R.inc(9743);__CLB4_4_1_bool15=true;} // A-Z, anything else
                    __CLR4_4_173k73klh9yvgqz.R.inc(9744);t.tagPending.newAttribute();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9745);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9746);t.transition(AttributeName);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BeforeAttributeValue {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9747);
            __CLR4_4_173k73klh9yvgqz.R.inc(9748);char c = r.consume();
            boolean __CLB4_4_1_bool16=false;__CLR4_4_173k73klh9yvgqz.R.inc(9749);switch (c) {
                case '\t':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9750);__CLB4_4_1_bool16=true;}
                case '\n':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9751);__CLB4_4_1_bool16=true;}
                case '\r':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9752);__CLB4_4_1_bool16=true;}
                case '\f':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9753);__CLB4_4_1_bool16=true;}
                case ' ':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9754);__CLB4_4_1_bool16=true;}
                    // ignore
                    __CLR4_4_173k73klh9yvgqz.R.inc(9755);break;
                case '"':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9756);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9757);t.transition(AttributeValue_doubleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9758);break;
                case '&':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9759);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9760);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9761);t.transition(AttributeValue_unquoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9762);break;
                case '\'':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9763);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9764);t.transition(AttributeValue_singleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9765);break;
                case nullChar:if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9766);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9767);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9768);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9769);t.transition(AttributeValue_unquoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9770);break;
                case eof:if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9771);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9772);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9773);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9774);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9775);break;
                case '>':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9776);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9777);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9778);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9779);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9780);break;
                case '<':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9781);__CLB4_4_1_bool16=true;}
                case '=':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9782);__CLB4_4_1_bool16=true;}
                case '`':if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9783);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9784);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9785);t.tagPending.appendAttributeValue(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9786);t.transition(AttributeValue_unquoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9787);break;
                default:if (!__CLB4_4_1_bool16) {__CLR4_4_173k73klh9yvgqz.R.inc(9788);__CLB4_4_1_bool16=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9789);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9790);t.transition(AttributeValue_unquoted);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AttributeValue_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9791);
            __CLR4_4_173k73klh9yvgqz.R.inc(9792);String value = r.consumeToAny(attributeDoubleValueCharsSorted);
            __CLR4_4_173k73klh9yvgqz.R.inc(9793);if ((((value.length() > 0)&&(__CLR4_4_173k73klh9yvgqz.R.iget(9794)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9795)==0&false)))
                {__CLR4_4_173k73klh9yvgqz.R.inc(9796);t.tagPending.appendAttributeValue(value);
            }else
                {__CLR4_4_173k73klh9yvgqz.R.inc(9797);t.tagPending.setEmptyAttributeValue();

            }__CLR4_4_173k73klh9yvgqz.R.inc(9798);char c = r.consume();
            boolean __CLB4_4_1_bool17=false;__CLR4_4_173k73klh9yvgqz.R.inc(9799);switch (c) {
                case '"':if (!__CLB4_4_1_bool17) {__CLR4_4_173k73klh9yvgqz.R.inc(9800);__CLB4_4_1_bool17=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9801);t.transition(AfterAttributeValue_quoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9802);break;
                case '&':if (!__CLB4_4_1_bool17) {__CLR4_4_173k73klh9yvgqz.R.inc(9803);__CLB4_4_1_bool17=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9804);int[] ref = t.consumeCharacterReference('"', true);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9805);if ((((ref != null)&&(__CLR4_4_173k73klh9yvgqz.R.iget(9806)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9807)==0&false)))
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9808);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9809);t.tagPending.appendAttributeValue('&');
                    }__CLR4_4_173k73klh9yvgqz.R.inc(9810);break;
                case nullChar:if (!__CLB4_4_1_bool17) {__CLR4_4_173k73klh9yvgqz.R.inc(9811);__CLB4_4_1_bool17=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9812);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9813);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9814);break;
                case eof:if (!__CLB4_4_1_bool17) {__CLR4_4_173k73klh9yvgqz.R.inc(9815);__CLB4_4_1_bool17=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9816);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9817);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9818);break;
                default:if (!__CLB4_4_1_bool17) {__CLR4_4_173k73klh9yvgqz.R.inc(9819);__CLB4_4_1_bool17=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_4_173k73klh9yvgqz.R.inc(9820);t.tagPending.appendAttributeValue(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AttributeValue_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9821);
            __CLR4_4_173k73klh9yvgqz.R.inc(9822);String value = r.consumeToAny(attributeSingleValueCharsSorted);
            __CLR4_4_173k73klh9yvgqz.R.inc(9823);if ((((value.length() > 0)&&(__CLR4_4_173k73klh9yvgqz.R.iget(9824)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9825)==0&false)))
                {__CLR4_4_173k73klh9yvgqz.R.inc(9826);t.tagPending.appendAttributeValue(value);
            }else
                {__CLR4_4_173k73klh9yvgqz.R.inc(9827);t.tagPending.setEmptyAttributeValue();

            }__CLR4_4_173k73klh9yvgqz.R.inc(9828);char c = r.consume();
            boolean __CLB4_4_1_bool18=false;__CLR4_4_173k73klh9yvgqz.R.inc(9829);switch (c) {
                case '\'':if (!__CLB4_4_1_bool18) {__CLR4_4_173k73klh9yvgqz.R.inc(9830);__CLB4_4_1_bool18=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9831);t.transition(AfterAttributeValue_quoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9832);break;
                case '&':if (!__CLB4_4_1_bool18) {__CLR4_4_173k73klh9yvgqz.R.inc(9833);__CLB4_4_1_bool18=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9834);int[] ref = t.consumeCharacterReference('\'', true);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9835);if ((((ref != null)&&(__CLR4_4_173k73klh9yvgqz.R.iget(9836)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9837)==0&false)))
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9838);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9839);t.tagPending.appendAttributeValue('&');
                    }__CLR4_4_173k73klh9yvgqz.R.inc(9840);break;
                case nullChar:if (!__CLB4_4_1_bool18) {__CLR4_4_173k73klh9yvgqz.R.inc(9841);__CLB4_4_1_bool18=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9842);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9843);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9844);break;
                case eof:if (!__CLB4_4_1_bool18) {__CLR4_4_173k73klh9yvgqz.R.inc(9845);__CLB4_4_1_bool18=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9846);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9847);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9848);break;
                default:if (!__CLB4_4_1_bool18) {__CLR4_4_173k73klh9yvgqz.R.inc(9849);__CLB4_4_1_bool18=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_4_173k73klh9yvgqz.R.inc(9850);t.tagPending.appendAttributeValue(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AttributeValue_unquoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9851);
            __CLR4_4_173k73klh9yvgqz.R.inc(9852);String value = r.consumeToAnySorted(attributeValueUnquoted);
            __CLR4_4_173k73klh9yvgqz.R.inc(9853);if ((((value.length() > 0)&&(__CLR4_4_173k73klh9yvgqz.R.iget(9854)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9855)==0&false)))
                {__CLR4_4_173k73klh9yvgqz.R.inc(9856);t.tagPending.appendAttributeValue(value);

            }__CLR4_4_173k73klh9yvgqz.R.inc(9857);char c = r.consume();
            boolean __CLB4_4_1_bool19=false;__CLR4_4_173k73klh9yvgqz.R.inc(9858);switch (c) {
                case '\t':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9859);__CLB4_4_1_bool19=true;}
                case '\n':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9860);__CLB4_4_1_bool19=true;}
                case '\r':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9861);__CLB4_4_1_bool19=true;}
                case '\f':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9862);__CLB4_4_1_bool19=true;}
                case ' ':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9863);__CLB4_4_1_bool19=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9864);t.transition(BeforeAttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9865);break;
                case '&':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9866);__CLB4_4_1_bool19=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9867);int[] ref = t.consumeCharacterReference('>', true);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9868);if ((((ref != null)&&(__CLR4_4_173k73klh9yvgqz.R.iget(9869)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9870)==0&false)))
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9871);t.tagPending.appendAttributeValue(ref);
                    }else
                        {__CLR4_4_173k73klh9yvgqz.R.inc(9872);t.tagPending.appendAttributeValue('&');
                    }__CLR4_4_173k73klh9yvgqz.R.inc(9873);break;
                case '>':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9874);__CLB4_4_1_bool19=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9875);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9876);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9877);break;
                case nullChar:if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9878);__CLB4_4_1_bool19=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9879);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9880);t.tagPending.appendAttributeValue(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9881);break;
                case eof:if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9882);__CLB4_4_1_bool19=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9883);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9884);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9885);break;
                case '"':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9886);__CLB4_4_1_bool19=true;}
                case '\'':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9887);__CLB4_4_1_bool19=true;}
                case '<':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9888);__CLB4_4_1_bool19=true;}
                case '=':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9889);__CLB4_4_1_bool19=true;}
                case '`':if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9890);__CLB4_4_1_bool19=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9891);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9892);t.tagPending.appendAttributeValue(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9893);break;
                default:if (!__CLB4_4_1_bool19) {__CLR4_4_173k73klh9yvgqz.R.inc(9894);__CLB4_4_1_bool19=true;} // hit end of buffer in first read, still in attribute
                    __CLR4_4_173k73klh9yvgqz.R.inc(9895);t.tagPending.appendAttributeValue(c);
            }

        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    // CharacterReferenceInAttributeValue state handled inline
    AfterAttributeValue_quoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9896);
            __CLR4_4_173k73klh9yvgqz.R.inc(9897);char c = r.consume();
            boolean __CLB4_4_1_bool20=false;__CLR4_4_173k73klh9yvgqz.R.inc(9898);switch (c) {
                case '\t':if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9899);__CLB4_4_1_bool20=true;}
                case '\n':if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9900);__CLB4_4_1_bool20=true;}
                case '\r':if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9901);__CLB4_4_1_bool20=true;}
                case '\f':if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9902);__CLB4_4_1_bool20=true;}
                case ' ':if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9903);__CLB4_4_1_bool20=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9904);t.transition(BeforeAttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9905);break;
                case '/':if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9906);__CLB4_4_1_bool20=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9907);t.transition(SelfClosingStartTag);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9908);break;
                case '>':if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9909);__CLB4_4_1_bool20=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9910);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9911);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9912);break;
                case eof:if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9913);__CLB4_4_1_bool20=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9914);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9915);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9916);break;
                default:if (!__CLB4_4_1_bool20) {__CLR4_4_173k73klh9yvgqz.R.inc(9917);__CLB4_4_1_bool20=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9918);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9919);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9920);t.transition(BeforeAttributeName);
            }

        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    SelfClosingStartTag {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9921);
            __CLR4_4_173k73klh9yvgqz.R.inc(9922);char c = r.consume();
            boolean __CLB4_4_1_bool21=false;__CLR4_4_173k73klh9yvgqz.R.inc(9923);switch (c) {
                case '>':if (!__CLB4_4_1_bool21) {__CLR4_4_173k73klh9yvgqz.R.inc(9924);__CLB4_4_1_bool21=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9925);t.tagPending.selfClosing = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(9926);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9927);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9928);break;
                case eof:if (!__CLB4_4_1_bool21) {__CLR4_4_173k73klh9yvgqz.R.inc(9929);__CLB4_4_1_bool21=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9930);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9931);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9932);break;
                default:if (!__CLB4_4_1_bool21) {__CLR4_4_173k73klh9yvgqz.R.inc(9933);__CLB4_4_1_bool21=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9934);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9935);r.unconsume();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9936);t.transition(BeforeAttributeName);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BogusComment {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9937);
            // todo: handle bogus comment starting from eof. when does that trigger?
            // rewind to capture character that lead us here
            __CLR4_4_173k73klh9yvgqz.R.inc(9938);r.unconsume();
            __CLR4_4_173k73klh9yvgqz.R.inc(9939);Token.Comment comment = new Token.Comment();
            __CLR4_4_173k73klh9yvgqz.R.inc(9940);comment.bogus = true;
            __CLR4_4_173k73klh9yvgqz.R.inc(9941);comment.data.append(r.consumeTo('>'));
            // todo: replace nullChar with replaceChar
            __CLR4_4_173k73klh9yvgqz.R.inc(9942);t.emit(comment);
            __CLR4_4_173k73klh9yvgqz.R.inc(9943);t.advanceTransition(Data);
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    MarkupDeclarationOpen {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9944);
            __CLR4_4_173k73klh9yvgqz.R.inc(9945);if ((((r.matchConsume("--"))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9946)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9947)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9948);t.createCommentPending();
                __CLR4_4_173k73klh9yvgqz.R.inc(9949);t.transition(CommentStart);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(9950);if ((((r.matchConsumeIgnoreCase("DOCTYPE"))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9951)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9952)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9953);t.transition(Doctype);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(9954);if ((((r.matchConsume("[CDATA["))&&(__CLR4_4_173k73klh9yvgqz.R.iget(9955)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(9956)==0&false))) {{
                // todo: should actually check current namepspace, and only non-html allows cdata. until namespace
                // is implemented properly, keep handling as cdata
                //} else if (!t.currentNodeInHtmlNS() && r.matchConsume("[CDATA[")) {
                __CLR4_4_173k73klh9yvgqz.R.inc(9957);t.createTempBuffer();
                __CLR4_4_173k73klh9yvgqz.R.inc(9958);t.transition(CdataSection);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(9959);t.error(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(9960);t.advanceTransition(BogusComment); // advance so this character gets in bogus comment data's rewind
            }
        }}}}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CommentStart {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9961);
            __CLR4_4_173k73klh9yvgqz.R.inc(9962);char c = r.consume();
            boolean __CLB4_4_1_bool22=false;__CLR4_4_173k73klh9yvgqz.R.inc(9963);switch (c) {
                case '-':if (!__CLB4_4_1_bool22) {__CLR4_4_173k73klh9yvgqz.R.inc(9964);__CLB4_4_1_bool22=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9965);t.transition(CommentStartDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9966);break;
                case nullChar:if (!__CLB4_4_1_bool22) {__CLR4_4_173k73klh9yvgqz.R.inc(9967);__CLB4_4_1_bool22=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9968);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9969);t.commentPending.data.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9970);t.transition(Comment);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9971);break;
                case '>':if (!__CLB4_4_1_bool22) {__CLR4_4_173k73klh9yvgqz.R.inc(9972);__CLB4_4_1_bool22=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9973);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9974);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9975);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9976);break;
                case eof:if (!__CLB4_4_1_bool22) {__CLR4_4_173k73klh9yvgqz.R.inc(9977);__CLB4_4_1_bool22=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9978);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9979);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9980);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9981);break;
                default:if (!__CLB4_4_1_bool22) {__CLR4_4_173k73klh9yvgqz.R.inc(9982);__CLB4_4_1_bool22=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9983);t.commentPending.data.append(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9984);t.transition(Comment);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CommentStartDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(9985);
            __CLR4_4_173k73klh9yvgqz.R.inc(9986);char c = r.consume();
            boolean __CLB4_4_1_bool23=false;__CLR4_4_173k73klh9yvgqz.R.inc(9987);switch (c) {
                case '-':if (!__CLB4_4_1_bool23) {__CLR4_4_173k73klh9yvgqz.R.inc(9988);__CLB4_4_1_bool23=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9989);t.transition(CommentStartDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9990);break;
                case nullChar:if (!__CLB4_4_1_bool23) {__CLR4_4_173k73klh9yvgqz.R.inc(9991);__CLB4_4_1_bool23=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9992);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9993);t.commentPending.data.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9994);t.transition(Comment);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9995);break;
                case '>':if (!__CLB4_4_1_bool23) {__CLR4_4_173k73klh9yvgqz.R.inc(9996);__CLB4_4_1_bool23=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(9997);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(9998);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(9999);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10000);break;
                case eof:if (!__CLB4_4_1_bool23) {__CLR4_4_173k73klh9yvgqz.R.inc(10001);__CLB4_4_1_bool23=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10002);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10003);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10004);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10005);break;
                default:if (!__CLB4_4_1_bool23) {__CLR4_4_173k73klh9yvgqz.R.inc(10006);__CLB4_4_1_bool23=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10007);t.commentPending.data.append(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10008);t.transition(Comment);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    Comment {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10009);
            __CLR4_4_173k73klh9yvgqz.R.inc(10010);char c = r.current();
            boolean __CLB4_4_1_bool24=false;__CLR4_4_173k73klh9yvgqz.R.inc(10011);switch (c) {
                case '-':if (!__CLB4_4_1_bool24) {__CLR4_4_173k73klh9yvgqz.R.inc(10012);__CLB4_4_1_bool24=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10013);t.advanceTransition(CommentEndDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10014);break;
                case nullChar:if (!__CLB4_4_1_bool24) {__CLR4_4_173k73klh9yvgqz.R.inc(10015);__CLB4_4_1_bool24=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10016);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10017);r.advance();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10018);t.commentPending.data.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10019);break;
                case eof:if (!__CLB4_4_1_bool24) {__CLR4_4_173k73klh9yvgqz.R.inc(10020);__CLB4_4_1_bool24=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10021);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10022);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10023);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10024);break;
                default:if (!__CLB4_4_1_bool24) {__CLR4_4_173k73klh9yvgqz.R.inc(10025);__CLB4_4_1_bool24=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10026);t.commentPending.data.append(r.consumeToAny('-', nullChar));
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CommentEndDash {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10027);
            __CLR4_4_173k73klh9yvgqz.R.inc(10028);char c = r.consume();
            boolean __CLB4_4_1_bool25=false;__CLR4_4_173k73klh9yvgqz.R.inc(10029);switch (c) {
                case '-':if (!__CLB4_4_1_bool25) {__CLR4_4_173k73klh9yvgqz.R.inc(10030);__CLB4_4_1_bool25=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10031);t.transition(CommentEnd);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10032);break;
                case nullChar:if (!__CLB4_4_1_bool25) {__CLR4_4_173k73klh9yvgqz.R.inc(10033);__CLB4_4_1_bool25=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10034);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10035);t.commentPending.data.append('-').append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10036);t.transition(Comment);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10037);break;
                case eof:if (!__CLB4_4_1_bool25) {__CLR4_4_173k73klh9yvgqz.R.inc(10038);__CLB4_4_1_bool25=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10039);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10040);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10041);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10042);break;
                default:if (!__CLB4_4_1_bool25) {__CLR4_4_173k73klh9yvgqz.R.inc(10043);__CLB4_4_1_bool25=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10044);t.commentPending.data.append('-').append(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10045);t.transition(Comment);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CommentEnd {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10046);
            __CLR4_4_173k73klh9yvgqz.R.inc(10047);char c = r.consume();
            boolean __CLB4_4_1_bool26=false;__CLR4_4_173k73klh9yvgqz.R.inc(10048);switch (c) {
                case '>':if (!__CLB4_4_1_bool26) {__CLR4_4_173k73klh9yvgqz.R.inc(10049);__CLB4_4_1_bool26=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10050);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10051);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10052);break;
                case nullChar:if (!__CLB4_4_1_bool26) {__CLR4_4_173k73klh9yvgqz.R.inc(10053);__CLB4_4_1_bool26=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10054);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10055);t.commentPending.data.append("--").append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10056);t.transition(Comment);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10057);break;
                case '!':if (!__CLB4_4_1_bool26) {__CLR4_4_173k73klh9yvgqz.R.inc(10058);__CLB4_4_1_bool26=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10059);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10060);t.transition(CommentEndBang);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10061);break;
                case '-':if (!__CLB4_4_1_bool26) {__CLR4_4_173k73klh9yvgqz.R.inc(10062);__CLB4_4_1_bool26=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10063);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10064);t.commentPending.data.append('-');
                    __CLR4_4_173k73klh9yvgqz.R.inc(10065);break;
                case eof:if (!__CLB4_4_1_bool26) {__CLR4_4_173k73klh9yvgqz.R.inc(10066);__CLB4_4_1_bool26=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10067);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10068);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10069);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10070);break;
                default:if (!__CLB4_4_1_bool26) {__CLR4_4_173k73klh9yvgqz.R.inc(10071);__CLB4_4_1_bool26=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10072);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10073);t.commentPending.data.append("--").append(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10074);t.transition(Comment);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CommentEndBang {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10075);
            __CLR4_4_173k73klh9yvgqz.R.inc(10076);char c = r.consume();
            boolean __CLB4_4_1_bool27=false;__CLR4_4_173k73klh9yvgqz.R.inc(10077);switch (c) {
                case '-':if (!__CLB4_4_1_bool27) {__CLR4_4_173k73klh9yvgqz.R.inc(10078);__CLB4_4_1_bool27=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10079);t.commentPending.data.append("--!");
                    __CLR4_4_173k73klh9yvgqz.R.inc(10080);t.transition(CommentEndDash);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10081);break;
                case '>':if (!__CLB4_4_1_bool27) {__CLR4_4_173k73klh9yvgqz.R.inc(10082);__CLB4_4_1_bool27=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10083);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10084);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10085);break;
                case nullChar:if (!__CLB4_4_1_bool27) {__CLR4_4_173k73klh9yvgqz.R.inc(10086);__CLB4_4_1_bool27=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10087);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10088);t.commentPending.data.append("--!").append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10089);t.transition(Comment);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10090);break;
                case eof:if (!__CLB4_4_1_bool27) {__CLR4_4_173k73klh9yvgqz.R.inc(10091);__CLB4_4_1_bool27=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10092);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10093);t.emitCommentPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10094);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10095);break;
                default:if (!__CLB4_4_1_bool27) {__CLR4_4_173k73klh9yvgqz.R.inc(10096);__CLB4_4_1_bool27=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10097);t.commentPending.data.append("--!").append(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10098);t.transition(Comment);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    Doctype {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10099);
            __CLR4_4_173k73klh9yvgqz.R.inc(10100);char c = r.consume();
            boolean __CLB4_4_1_bool28=false;__CLR4_4_173k73klh9yvgqz.R.inc(10101);switch (c) {
                case '\t':if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10102);__CLB4_4_1_bool28=true;}
                case '\n':if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10103);__CLB4_4_1_bool28=true;}
                case '\r':if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10104);__CLB4_4_1_bool28=true;}
                case '\f':if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10105);__CLB4_4_1_bool28=true;}
                case ' ':if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10106);__CLB4_4_1_bool28=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10107);t.transition(BeforeDoctypeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10108);break;
                case eof:if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10109);__CLB4_4_1_bool28=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10110);t.eofError(this);
                    // note: fall through to > case
                case '>':if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10111);__CLB4_4_1_bool28=true;} // catch invalid <!DOCTYPE>
                    __CLR4_4_173k73klh9yvgqz.R.inc(10112);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10113);t.createDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10114);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10115);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10116);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10117);break;
                default:if (!__CLB4_4_1_bool28) {__CLR4_4_173k73klh9yvgqz.R.inc(10118);__CLB4_4_1_bool28=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10119);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10120);t.transition(BeforeDoctypeName);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BeforeDoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10121);
            __CLR4_4_173k73klh9yvgqz.R.inc(10122);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10123)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10124)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10125);t.createDoctypePending();
                __CLR4_4_173k73klh9yvgqz.R.inc(10126);t.transition(DoctypeName);
                __CLR4_4_173k73klh9yvgqz.R.inc(10127);return;
            }
            }__CLR4_4_173k73klh9yvgqz.R.inc(10128);char c = r.consume();
            boolean __CLB4_4_1_bool29=false;__CLR4_4_173k73klh9yvgqz.R.inc(10129);switch (c) {
                case '\t':if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10130);__CLB4_4_1_bool29=true;}
                case '\n':if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10131);__CLB4_4_1_bool29=true;}
                case '\r':if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10132);__CLB4_4_1_bool29=true;}
                case '\f':if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10133);__CLB4_4_1_bool29=true;}
                case ' ':if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10134);__CLB4_4_1_bool29=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10135);break; // ignore whitespace
                case nullChar:if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10136);__CLB4_4_1_bool29=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10137);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10138);t.createDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10139);t.doctypePending.name.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10140);t.transition(DoctypeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10141);break;
                case eof:if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10142);__CLB4_4_1_bool29=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10143);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10144);t.createDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10145);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10146);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10147);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10148);break;
                default:if (!__CLB4_4_1_bool29) {__CLR4_4_173k73klh9yvgqz.R.inc(10149);__CLB4_4_1_bool29=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10150);t.createDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10151);t.doctypePending.name.append(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10152);t.transition(DoctypeName);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    DoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10153);
            __CLR4_4_173k73klh9yvgqz.R.inc(10154);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10155)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10156)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10157);String name = r.consumeLetterSequence();
                __CLR4_4_173k73klh9yvgqz.R.inc(10158);t.doctypePending.name.append(name);
                __CLR4_4_173k73klh9yvgqz.R.inc(10159);return;
            }
            }__CLR4_4_173k73klh9yvgqz.R.inc(10160);char c = r.consume();
            boolean __CLB4_4_1_bool30=false;__CLR4_4_173k73klh9yvgqz.R.inc(10161);switch (c) {
                case '>':if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10162);__CLB4_4_1_bool30=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10163);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10164);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10165);break;
                case '\t':if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10166);__CLB4_4_1_bool30=true;}
                case '\n':if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10167);__CLB4_4_1_bool30=true;}
                case '\r':if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10168);__CLB4_4_1_bool30=true;}
                case '\f':if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10169);__CLB4_4_1_bool30=true;}
                case ' ':if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10170);__CLB4_4_1_bool30=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10171);t.transition(AfterDoctypeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10172);break;
                case nullChar:if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10173);__CLB4_4_1_bool30=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10174);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10175);t.doctypePending.name.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10176);break;
                case eof:if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10177);__CLB4_4_1_bool30=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10178);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10179);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10180);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10181);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10182);break;
                default:if (!__CLB4_4_1_bool30) {__CLR4_4_173k73klh9yvgqz.R.inc(10183);__CLB4_4_1_bool30=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10184);t.doctypePending.name.append(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AfterDoctypeName {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10185);
            __CLR4_4_173k73klh9yvgqz.R.inc(10186);if ((((r.isEmpty())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10187)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10188)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10189);t.eofError(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(10190);t.doctypePending.forceQuirks = true;
                __CLR4_4_173k73klh9yvgqz.R.inc(10191);t.emitDoctypePending();
                __CLR4_4_173k73klh9yvgqz.R.inc(10192);t.transition(Data);
                __CLR4_4_173k73klh9yvgqz.R.inc(10193);return;
            }
            }__CLR4_4_173k73klh9yvgqz.R.inc(10194);if ((((r.matchesAny('\t', '\n', '\r', '\f', ' '))&&(__CLR4_4_173k73klh9yvgqz.R.iget(10195)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10196)==0&false)))
                {__CLR4_4_173k73klh9yvgqz.R.inc(10197);r.advance(); // ignore whitespace
            }else {__CLR4_4_173k73klh9yvgqz.R.inc(10198);if ((((r.matches('>'))&&(__CLR4_4_173k73klh9yvgqz.R.iget(10199)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10200)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10201);t.emitDoctypePending();
                __CLR4_4_173k73klh9yvgqz.R.inc(10202);t.advanceTransition(Data);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(10203);if ((((r.matchConsumeIgnoreCase(DocumentType.PUBLIC_KEY))&&(__CLR4_4_173k73klh9yvgqz.R.iget(10204)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10205)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10206);t.doctypePending.pubSysKey = DocumentType.PUBLIC_KEY;
                __CLR4_4_173k73klh9yvgqz.R.inc(10207);t.transition(AfterDoctypePublicKeyword);
            } }else {__CLR4_4_173k73klh9yvgqz.R.inc(10208);if ((((r.matchConsumeIgnoreCase(DocumentType.SYSTEM_KEY))&&(__CLR4_4_173k73klh9yvgqz.R.iget(10209)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10210)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10211);t.doctypePending.pubSysKey = DocumentType.SYSTEM_KEY;
                __CLR4_4_173k73klh9yvgqz.R.inc(10212);t.transition(AfterDoctypeSystemKeyword);
            } }else {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10213);t.error(this);
                __CLR4_4_173k73klh9yvgqz.R.inc(10214);t.doctypePending.forceQuirks = true;
                __CLR4_4_173k73klh9yvgqz.R.inc(10215);t.advanceTransition(BogusDoctype);
            }

        }}}}}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AfterDoctypePublicKeyword {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10216);
            __CLR4_4_173k73klh9yvgqz.R.inc(10217);char c = r.consume();
            boolean __CLB4_4_1_bool31=false;__CLR4_4_173k73klh9yvgqz.R.inc(10218);switch (c) {
                case '\t':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10219);__CLB4_4_1_bool31=true;}
                case '\n':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10220);__CLB4_4_1_bool31=true;}
                case '\r':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10221);__CLB4_4_1_bool31=true;}
                case '\f':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10222);__CLB4_4_1_bool31=true;}
                case ' ':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10223);__CLB4_4_1_bool31=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10224);t.transition(BeforeDoctypePublicIdentifier);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10225);break;
                case '"':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10226);__CLB4_4_1_bool31=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10227);t.error(this);
                    // set public id to empty string
                    __CLR4_4_173k73klh9yvgqz.R.inc(10228);t.transition(DoctypePublicIdentifier_doubleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10229);break;
                case '\'':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10230);__CLB4_4_1_bool31=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10231);t.error(this);
                    // set public id to empty string
                    __CLR4_4_173k73klh9yvgqz.R.inc(10232);t.transition(DoctypePublicIdentifier_singleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10233);break;
                case '>':if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10234);__CLB4_4_1_bool31=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10235);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10236);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10237);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10238);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10239);break;
                case eof:if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10240);__CLB4_4_1_bool31=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10241);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10242);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10243);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10244);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10245);break;
                default:if (!__CLB4_4_1_bool31) {__CLR4_4_173k73klh9yvgqz.R.inc(10246);__CLB4_4_1_bool31=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10247);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10248);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10249);t.transition(BogusDoctype);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BeforeDoctypePublicIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10250);
            __CLR4_4_173k73klh9yvgqz.R.inc(10251);char c = r.consume();
            boolean __CLB4_4_1_bool32=false;__CLR4_4_173k73klh9yvgqz.R.inc(10252);switch (c) {
                case '\t':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10253);__CLB4_4_1_bool32=true;}
                case '\n':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10254);__CLB4_4_1_bool32=true;}
                case '\r':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10255);__CLB4_4_1_bool32=true;}
                case '\f':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10256);__CLB4_4_1_bool32=true;}
                case ' ':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10257);__CLB4_4_1_bool32=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10258);break;
                case '"':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10259);__CLB4_4_1_bool32=true;}
                    // set public id to empty string
                    __CLR4_4_173k73klh9yvgqz.R.inc(10260);t.transition(DoctypePublicIdentifier_doubleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10261);break;
                case '\'':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10262);__CLB4_4_1_bool32=true;}
                    // set public id to empty string
                    __CLR4_4_173k73klh9yvgqz.R.inc(10263);t.transition(DoctypePublicIdentifier_singleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10264);break;
                case '>':if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10265);__CLB4_4_1_bool32=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10266);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10267);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10268);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10269);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10270);break;
                case eof:if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10271);__CLB4_4_1_bool32=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10272);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10273);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10274);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10275);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10276);break;
                default:if (!__CLB4_4_1_bool32) {__CLR4_4_173k73klh9yvgqz.R.inc(10277);__CLB4_4_1_bool32=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10278);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10279);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10280);t.transition(BogusDoctype);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    DoctypePublicIdentifier_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10281);
            __CLR4_4_173k73klh9yvgqz.R.inc(10282);char c = r.consume();
            boolean __CLB4_4_1_bool33=false;__CLR4_4_173k73klh9yvgqz.R.inc(10283);switch (c) {
                case '"':if (!__CLB4_4_1_bool33) {__CLR4_4_173k73klh9yvgqz.R.inc(10284);__CLB4_4_1_bool33=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10285);t.transition(AfterDoctypePublicIdentifier);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10286);break;
                case nullChar:if (!__CLB4_4_1_bool33) {__CLR4_4_173k73klh9yvgqz.R.inc(10287);__CLB4_4_1_bool33=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10288);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10289);t.doctypePending.publicIdentifier.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10290);break;
                case '>':if (!__CLB4_4_1_bool33) {__CLR4_4_173k73klh9yvgqz.R.inc(10291);__CLB4_4_1_bool33=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10292);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10293);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10294);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10295);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10296);break;
                case eof:if (!__CLB4_4_1_bool33) {__CLR4_4_173k73klh9yvgqz.R.inc(10297);__CLB4_4_1_bool33=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10298);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10299);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10300);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10301);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10302);break;
                default:if (!__CLB4_4_1_bool33) {__CLR4_4_173k73klh9yvgqz.R.inc(10303);__CLB4_4_1_bool33=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10304);t.doctypePending.publicIdentifier.append(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    DoctypePublicIdentifier_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10305);
            __CLR4_4_173k73klh9yvgqz.R.inc(10306);char c = r.consume();
            boolean __CLB4_4_1_bool34=false;__CLR4_4_173k73klh9yvgqz.R.inc(10307);switch (c) {
                case '\'':if (!__CLB4_4_1_bool34) {__CLR4_4_173k73klh9yvgqz.R.inc(10308);__CLB4_4_1_bool34=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10309);t.transition(AfterDoctypePublicIdentifier);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10310);break;
                case nullChar:if (!__CLB4_4_1_bool34) {__CLR4_4_173k73klh9yvgqz.R.inc(10311);__CLB4_4_1_bool34=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10312);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10313);t.doctypePending.publicIdentifier.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10314);break;
                case '>':if (!__CLB4_4_1_bool34) {__CLR4_4_173k73klh9yvgqz.R.inc(10315);__CLB4_4_1_bool34=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10316);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10317);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10318);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10319);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10320);break;
                case eof:if (!__CLB4_4_1_bool34) {__CLR4_4_173k73klh9yvgqz.R.inc(10321);__CLB4_4_1_bool34=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10322);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10323);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10324);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10325);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10326);break;
                default:if (!__CLB4_4_1_bool34) {__CLR4_4_173k73klh9yvgqz.R.inc(10327);__CLB4_4_1_bool34=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10328);t.doctypePending.publicIdentifier.append(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AfterDoctypePublicIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10329);
            __CLR4_4_173k73klh9yvgqz.R.inc(10330);char c = r.consume();
            boolean __CLB4_4_1_bool35=false;__CLR4_4_173k73klh9yvgqz.R.inc(10331);switch (c) {
                case '\t':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10332);__CLB4_4_1_bool35=true;}
                case '\n':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10333);__CLB4_4_1_bool35=true;}
                case '\r':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10334);__CLB4_4_1_bool35=true;}
                case '\f':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10335);__CLB4_4_1_bool35=true;}
                case ' ':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10336);__CLB4_4_1_bool35=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10337);t.transition(BetweenDoctypePublicAndSystemIdentifiers);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10338);break;
                case '>':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10339);__CLB4_4_1_bool35=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10340);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10341);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10342);break;
                case '"':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10343);__CLB4_4_1_bool35=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10344);t.error(this);
                    // system id empty
                    __CLR4_4_173k73klh9yvgqz.R.inc(10345);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10346);break;
                case '\'':if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10347);__CLB4_4_1_bool35=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10348);t.error(this);
                    // system id empty
                    __CLR4_4_173k73klh9yvgqz.R.inc(10349);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10350);break;
                case eof:if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10351);__CLB4_4_1_bool35=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10352);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10353);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10354);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10355);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10356);break;
                default:if (!__CLB4_4_1_bool35) {__CLR4_4_173k73klh9yvgqz.R.inc(10357);__CLB4_4_1_bool35=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10358);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10359);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10360);t.transition(BogusDoctype);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10361);
            __CLR4_4_173k73klh9yvgqz.R.inc(10362);char c = r.consume();
            boolean __CLB4_4_1_bool36=false;__CLR4_4_173k73klh9yvgqz.R.inc(10363);switch (c) {
                case '\t':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10364);__CLB4_4_1_bool36=true;}
                case '\n':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10365);__CLB4_4_1_bool36=true;}
                case '\r':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10366);__CLB4_4_1_bool36=true;}
                case '\f':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10367);__CLB4_4_1_bool36=true;}
                case ' ':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10368);__CLB4_4_1_bool36=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10369);break;
                case '>':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10370);__CLB4_4_1_bool36=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10371);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10372);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10373);break;
                case '"':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10374);__CLB4_4_1_bool36=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10375);t.error(this);
                    // system id empty
                    __CLR4_4_173k73klh9yvgqz.R.inc(10376);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10377);break;
                case '\'':if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10378);__CLB4_4_1_bool36=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10379);t.error(this);
                    // system id empty
                    __CLR4_4_173k73klh9yvgqz.R.inc(10380);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10381);break;
                case eof:if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10382);__CLB4_4_1_bool36=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10383);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10384);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10385);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10386);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10387);break;
                default:if (!__CLB4_4_1_bool36) {__CLR4_4_173k73klh9yvgqz.R.inc(10388);__CLB4_4_1_bool36=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10389);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10390);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10391);t.transition(BogusDoctype);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AfterDoctypeSystemKeyword {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10392);
            __CLR4_4_173k73klh9yvgqz.R.inc(10393);char c = r.consume();
            boolean __CLB4_4_1_bool37=false;__CLR4_4_173k73klh9yvgqz.R.inc(10394);switch (c) {
                case '\t':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10395);__CLB4_4_1_bool37=true;}
                case '\n':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10396);__CLB4_4_1_bool37=true;}
                case '\r':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10397);__CLB4_4_1_bool37=true;}
                case '\f':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10398);__CLB4_4_1_bool37=true;}
                case ' ':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10399);__CLB4_4_1_bool37=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10400);t.transition(BeforeDoctypeSystemIdentifier);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10401);break;
                case '>':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10402);__CLB4_4_1_bool37=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10403);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10404);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10405);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10406);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10407);break;
                case '"':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10408);__CLB4_4_1_bool37=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10409);t.error(this);
                    // system id empty
                    __CLR4_4_173k73klh9yvgqz.R.inc(10410);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10411);break;
                case '\'':if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10412);__CLB4_4_1_bool37=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10413);t.error(this);
                    // system id empty
                    __CLR4_4_173k73klh9yvgqz.R.inc(10414);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10415);break;
                case eof:if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10416);__CLB4_4_1_bool37=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10417);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10418);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10419);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10420);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10421);break;
                default:if (!__CLB4_4_1_bool37) {__CLR4_4_173k73klh9yvgqz.R.inc(10422);__CLB4_4_1_bool37=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10423);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10424);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10425);t.emitDoctypePending();
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BeforeDoctypeSystemIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10426);
            __CLR4_4_173k73klh9yvgqz.R.inc(10427);char c = r.consume();
            boolean __CLB4_4_1_bool38=false;__CLR4_4_173k73klh9yvgqz.R.inc(10428);switch (c) {
                case '\t':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10429);__CLB4_4_1_bool38=true;}
                case '\n':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10430);__CLB4_4_1_bool38=true;}
                case '\r':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10431);__CLB4_4_1_bool38=true;}
                case '\f':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10432);__CLB4_4_1_bool38=true;}
                case ' ':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10433);__CLB4_4_1_bool38=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10434);break;
                case '"':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10435);__CLB4_4_1_bool38=true;}
                    // set system id to empty string
                    __CLR4_4_173k73klh9yvgqz.R.inc(10436);t.transition(DoctypeSystemIdentifier_doubleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10437);break;
                case '\'':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10438);__CLB4_4_1_bool38=true;}
                    // set public id to empty string
                    __CLR4_4_173k73klh9yvgqz.R.inc(10439);t.transition(DoctypeSystemIdentifier_singleQuoted);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10440);break;
                case '>':if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10441);__CLB4_4_1_bool38=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10442);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10443);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10444);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10445);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10446);break;
                case eof:if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10447);__CLB4_4_1_bool38=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10448);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10449);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10450);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10451);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10452);break;
                default:if (!__CLB4_4_1_bool38) {__CLR4_4_173k73klh9yvgqz.R.inc(10453);__CLB4_4_1_bool38=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10454);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10455);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10456);t.transition(BogusDoctype);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    DoctypeSystemIdentifier_doubleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10457);
            __CLR4_4_173k73klh9yvgqz.R.inc(10458);char c = r.consume();
            boolean __CLB4_4_1_bool39=false;__CLR4_4_173k73klh9yvgqz.R.inc(10459);switch (c) {
                case '"':if (!__CLB4_4_1_bool39) {__CLR4_4_173k73klh9yvgqz.R.inc(10460);__CLB4_4_1_bool39=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10461);t.transition(AfterDoctypeSystemIdentifier);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10462);break;
                case nullChar:if (!__CLB4_4_1_bool39) {__CLR4_4_173k73klh9yvgqz.R.inc(10463);__CLB4_4_1_bool39=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10464);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10465);t.doctypePending.systemIdentifier.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10466);break;
                case '>':if (!__CLB4_4_1_bool39) {__CLR4_4_173k73klh9yvgqz.R.inc(10467);__CLB4_4_1_bool39=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10468);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10469);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10470);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10471);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10472);break;
                case eof:if (!__CLB4_4_1_bool39) {__CLR4_4_173k73klh9yvgqz.R.inc(10473);__CLB4_4_1_bool39=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10474);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10475);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10476);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10477);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10478);break;
                default:if (!__CLB4_4_1_bool39) {__CLR4_4_173k73klh9yvgqz.R.inc(10479);__CLB4_4_1_bool39=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10480);t.doctypePending.systemIdentifier.append(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    DoctypeSystemIdentifier_singleQuoted {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10481);
            __CLR4_4_173k73klh9yvgqz.R.inc(10482);char c = r.consume();
            boolean __CLB4_4_1_bool40=false;__CLR4_4_173k73klh9yvgqz.R.inc(10483);switch (c) {
                case '\'':if (!__CLB4_4_1_bool40) {__CLR4_4_173k73klh9yvgqz.R.inc(10484);__CLB4_4_1_bool40=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10485);t.transition(AfterDoctypeSystemIdentifier);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10486);break;
                case nullChar:if (!__CLB4_4_1_bool40) {__CLR4_4_173k73klh9yvgqz.R.inc(10487);__CLB4_4_1_bool40=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10488);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10489);t.doctypePending.systemIdentifier.append(replacementChar);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10490);break;
                case '>':if (!__CLB4_4_1_bool40) {__CLR4_4_173k73klh9yvgqz.R.inc(10491);__CLB4_4_1_bool40=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10492);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10493);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10494);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10495);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10496);break;
                case eof:if (!__CLB4_4_1_bool40) {__CLR4_4_173k73klh9yvgqz.R.inc(10497);__CLB4_4_1_bool40=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10498);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10499);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10500);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10501);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10502);break;
                default:if (!__CLB4_4_1_bool40) {__CLR4_4_173k73klh9yvgqz.R.inc(10503);__CLB4_4_1_bool40=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10504);t.doctypePending.systemIdentifier.append(c);
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    AfterDoctypeSystemIdentifier {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10505);
            __CLR4_4_173k73klh9yvgqz.R.inc(10506);char c = r.consume();
            boolean __CLB4_4_1_bool41=false;__CLR4_4_173k73klh9yvgqz.R.inc(10507);switch (c) {
                case '\t':if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10508);__CLB4_4_1_bool41=true;}
                case '\n':if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10509);__CLB4_4_1_bool41=true;}
                case '\r':if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10510);__CLB4_4_1_bool41=true;}
                case '\f':if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10511);__CLB4_4_1_bool41=true;}
                case ' ':if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10512);__CLB4_4_1_bool41=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10513);break;
                case '>':if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10514);__CLB4_4_1_bool41=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10515);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10516);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10517);break;
                case eof:if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10518);__CLB4_4_1_bool41=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10519);t.eofError(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10520);t.doctypePending.forceQuirks = true;
                    __CLR4_4_173k73klh9yvgqz.R.inc(10521);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10522);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10523);break;
                default:if (!__CLB4_4_1_bool41) {__CLR4_4_173k73klh9yvgqz.R.inc(10524);__CLB4_4_1_bool41=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10525);t.error(this);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10526);t.transition(BogusDoctype);
                    // NOT force quirks
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    BogusDoctype {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10527);
            __CLR4_4_173k73klh9yvgqz.R.inc(10528);char c = r.consume();
            boolean __CLB4_4_1_bool42=false;__CLR4_4_173k73klh9yvgqz.R.inc(10529);switch (c) {
                case '>':if (!__CLB4_4_1_bool42) {__CLR4_4_173k73klh9yvgqz.R.inc(10530);__CLB4_4_1_bool42=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10531);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10532);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10533);break;
                case eof:if (!__CLB4_4_1_bool42) {__CLR4_4_173k73klh9yvgqz.R.inc(10534);__CLB4_4_1_bool42=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10535);t.emitDoctypePending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10536);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10537);break;
                default:if (!__CLB4_4_1_bool42) {__CLR4_4_173k73klh9yvgqz.R.inc(10538);__CLB4_4_1_bool42=true;}
                    // ignore char
                    __CLR4_4_173k73klh9yvgqz.R.inc(10539);break;
            }
        }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    },
    CdataSection {
        void read(Tokeniser t, CharacterReader r) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10540);
            __CLR4_4_173k73klh9yvgqz.R.inc(10541);String data = r.consumeTo("]]>");
            __CLR4_4_173k73klh9yvgqz.R.inc(10542);t.dataBuffer.append(data);
            __CLR4_4_173k73klh9yvgqz.R.inc(10543);if ((((r.matchConsume("]]>") || r.isEmpty())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10544)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10545)==0&false))) {{
                __CLR4_4_173k73klh9yvgqz.R.inc(10546);t.emit(new Token.CData(t.dataBuffer.toString()));
                __CLR4_4_173k73klh9yvgqz.R.inc(10547);t.transition(Data);
            }// otherwise, buffer underrun, stay in data section
        }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
    };


    abstract void read(Tokeniser t, CharacterReader r);

    static final char nullChar = '\u0000';
    // char searches. must be sorted, used in inSorted. MUST update TokenisetStateTest if more arrays are added.
    static final char[] attributeSingleValueCharsSorted = new char[]{nullChar, '&', '\''};
    static final char[] attributeDoubleValueCharsSorted = new char[]{nullChar, '"', '&'};
    static final char[] attributeNameCharsSorted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '"', '\'', '/', '<', '=', '>'};
    static final char[] attributeValueUnquoted = new char[]{nullChar, '\t', '\n', '\f', '\r', ' ', '"', '&', '\'', '<', '=', '>', '`'};

    private static final char replacementChar = Tokeniser.replacementChar;
    private static final String replacementStr = String.valueOf(Tokeniser.replacementChar);
    private static final char eof = CharacterReader.EOF;

    /**
     * Handles RawtextEndTagName, ScriptDataEndTagName, and ScriptDataEscapedEndTagName. Same body impl, just
     * different else exit transitions.
     */
    private static void handleDataEndTag(Tokeniser t, CharacterReader r, TokeniserState elseTransition) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10548);
        __CLR4_4_173k73klh9yvgqz.R.inc(10549);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10550)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10551)==0&false))) {{
            __CLR4_4_173k73klh9yvgqz.R.inc(10552);String name = r.consumeLetterSequence();
            __CLR4_4_173k73klh9yvgqz.R.inc(10553);t.tagPending.appendTagName(name);
            __CLR4_4_173k73klh9yvgqz.R.inc(10554);t.dataBuffer.append(name);
            __CLR4_4_173k73klh9yvgqz.R.inc(10555);return;
        }

        }__CLR4_4_173k73klh9yvgqz.R.inc(10556);boolean needsExitTransition = false;
        __CLR4_4_173k73klh9yvgqz.R.inc(10557);if ((((t.isAppropriateEndTagToken() && !r.isEmpty())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10558)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10559)==0&false))) {{
            __CLR4_4_173k73klh9yvgqz.R.inc(10560);char c = r.consume();
            boolean __CLB4_4_1_bool43=false;__CLR4_4_173k73klh9yvgqz.R.inc(10561);switch (c) {
                case '\t':if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10562);__CLB4_4_1_bool43=true;}
                case '\n':if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10563);__CLB4_4_1_bool43=true;}
                case '\r':if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10564);__CLB4_4_1_bool43=true;}
                case '\f':if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10565);__CLB4_4_1_bool43=true;}
                case ' ':if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10566);__CLB4_4_1_bool43=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10567);t.transition(BeforeAttributeName);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10568);break;
                case '/':if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10569);__CLB4_4_1_bool43=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10570);t.transition(SelfClosingStartTag);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10571);break;
                case '>':if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10572);__CLB4_4_1_bool43=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10573);t.emitTagPending();
                    __CLR4_4_173k73klh9yvgqz.R.inc(10574);t.transition(Data);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10575);break;
                default:if (!__CLB4_4_1_bool43) {__CLR4_4_173k73klh9yvgqz.R.inc(10576);__CLB4_4_1_bool43=true;}
                    __CLR4_4_173k73klh9yvgqz.R.inc(10577);t.dataBuffer.append(c);
                    __CLR4_4_173k73klh9yvgqz.R.inc(10578);needsExitTransition = true;
            }
        } }else {{
            __CLR4_4_173k73klh9yvgqz.R.inc(10579);needsExitTransition = true;
        }

        }__CLR4_4_173k73klh9yvgqz.R.inc(10580);if ((((needsExitTransition)&&(__CLR4_4_173k73klh9yvgqz.R.iget(10581)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10582)==0&false))) {{
            __CLR4_4_173k73klh9yvgqz.R.inc(10583);t.emit("</" + t.dataBuffer.toString());
            __CLR4_4_173k73klh9yvgqz.R.inc(10584);t.transition(elseTransition);
        }
    }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}

    private static void readData(Tokeniser t, CharacterReader r, TokeniserState current, TokeniserState advance) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10585);
        boolean __CLB4_4_1_bool44=false;__CLR4_4_173k73klh9yvgqz.R.inc(10586);switch (r.current()) {
            case '<':if (!__CLB4_4_1_bool44) {__CLR4_4_173k73klh9yvgqz.R.inc(10587);__CLB4_4_1_bool44=true;}
                __CLR4_4_173k73klh9yvgqz.R.inc(10588);t.advanceTransition(advance);
                __CLR4_4_173k73klh9yvgqz.R.inc(10589);break;
            case nullChar:if (!__CLB4_4_1_bool44) {__CLR4_4_173k73klh9yvgqz.R.inc(10590);__CLB4_4_1_bool44=true;}
                __CLR4_4_173k73klh9yvgqz.R.inc(10591);t.error(current);
                __CLR4_4_173k73klh9yvgqz.R.inc(10592);r.advance();
                __CLR4_4_173k73klh9yvgqz.R.inc(10593);t.emit(replacementChar);
                __CLR4_4_173k73klh9yvgqz.R.inc(10594);break;
            case eof:if (!__CLB4_4_1_bool44) {__CLR4_4_173k73klh9yvgqz.R.inc(10595);__CLB4_4_1_bool44=true;}
                __CLR4_4_173k73klh9yvgqz.R.inc(10596);t.emit(new Token.EOF());
                __CLR4_4_173k73klh9yvgqz.R.inc(10597);break;
            default:if (!__CLB4_4_1_bool44) {__CLR4_4_173k73klh9yvgqz.R.inc(10598);__CLB4_4_1_bool44=true;}
                __CLR4_4_173k73klh9yvgqz.R.inc(10599);String data = r.consumeToAny('<', nullChar); // todo - why hunt for null here? Just consumeTo'<'?
                __CLR4_4_173k73klh9yvgqz.R.inc(10600);t.emit(data);
                __CLR4_4_173k73klh9yvgqz.R.inc(10601);break;
        }
    }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}

    private static void readCharRef(Tokeniser t, TokeniserState advance) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10602);
        __CLR4_4_173k73klh9yvgqz.R.inc(10603);int[] c = t.consumeCharacterReference(null, false);
        __CLR4_4_173k73klh9yvgqz.R.inc(10604);if ((((c == null)&&(__CLR4_4_173k73klh9yvgqz.R.iget(10605)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10606)==0&false)))
            {__CLR4_4_173k73klh9yvgqz.R.inc(10607);t.emit('&');
        }else
            {__CLR4_4_173k73klh9yvgqz.R.inc(10608);t.emit(c);
        }__CLR4_4_173k73klh9yvgqz.R.inc(10609);t.transition(advance);
    }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}

    private static void readEndTag(Tokeniser t, CharacterReader r, TokeniserState a, TokeniserState b) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10610);
        __CLR4_4_173k73klh9yvgqz.R.inc(10611);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10612)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10613)==0&false))) {{
            __CLR4_4_173k73klh9yvgqz.R.inc(10614);t.createTagPending(false);
            __CLR4_4_173k73klh9yvgqz.R.inc(10615);t.transition(a);
        } }else {{
            __CLR4_4_173k73klh9yvgqz.R.inc(10616);t.emit("</");
            __CLR4_4_173k73klh9yvgqz.R.inc(10617);t.transition(b);
        }
    }}finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}

    private static void handleDataDoubleEscapeTag(Tokeniser t, CharacterReader r, TokeniserState primary, TokeniserState fallback) {try{__CLR4_4_173k73klh9yvgqz.R.inc(10618);
        __CLR4_4_173k73klh9yvgqz.R.inc(10619);if ((((r.matchesLetter())&&(__CLR4_4_173k73klh9yvgqz.R.iget(10620)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10621)==0&false))) {{
            __CLR4_4_173k73klh9yvgqz.R.inc(10622);String name = r.consumeLetterSequence();
            __CLR4_4_173k73klh9yvgqz.R.inc(10623);t.dataBuffer.append(name);
            __CLR4_4_173k73klh9yvgqz.R.inc(10624);t.emit(name);
            __CLR4_4_173k73klh9yvgqz.R.inc(10625);return;
        }

        }__CLR4_4_173k73klh9yvgqz.R.inc(10626);char c = r.consume();
        boolean __CLB4_4_1_bool45=false;__CLR4_4_173k73klh9yvgqz.R.inc(10627);switch (c) {
            case '\t':if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10628);__CLB4_4_1_bool45=true;}
            case '\n':if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10629);__CLB4_4_1_bool45=true;}
            case '\r':if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10630);__CLB4_4_1_bool45=true;}
            case '\f':if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10631);__CLB4_4_1_bool45=true;}
            case ' ':if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10632);__CLB4_4_1_bool45=true;}
            case '/':if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10633);__CLB4_4_1_bool45=true;}
            case '>':if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10634);__CLB4_4_1_bool45=true;}
                __CLR4_4_173k73klh9yvgqz.R.inc(10635);if ((((t.dataBuffer.toString().equals("script"))&&(__CLR4_4_173k73klh9yvgqz.R.iget(10636)!=0|true))||(__CLR4_4_173k73klh9yvgqz.R.iget(10637)==0&false)))
                    {__CLR4_4_173k73klh9yvgqz.R.inc(10638);t.transition(primary);
                }else
                    {__CLR4_4_173k73klh9yvgqz.R.inc(10639);t.transition(fallback);
                }__CLR4_4_173k73klh9yvgqz.R.inc(10640);t.emit(c);
                __CLR4_4_173k73klh9yvgqz.R.inc(10641);break;
            default:if (!__CLB4_4_1_bool45) {__CLR4_4_173k73klh9yvgqz.R.inc(10642);__CLB4_4_1_bool45=true;}
                __CLR4_4_173k73klh9yvgqz.R.inc(10643);r.unconsume();
                __CLR4_4_173k73klh9yvgqz.R.inc(10644);t.transition(fallback);
        }
    }finally{__CLR4_4_173k73klh9yvgqz.R.flushNeeded();}}
;public static class __CLR4_4_173k73klh9yvgqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,10645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}
