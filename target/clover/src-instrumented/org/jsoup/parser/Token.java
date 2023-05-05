/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;

import static org.jsoup.internal.Normalizer.lowerCase;

/**
 * Parse tokens for the Tokeniser.
 */
abstract class Token {public static class __CLR4_4_16ld6ldlh9yvgpw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,8750,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    TokenType type;

    private Token() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8545);
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    
    String tokenType() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8546);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8547);return this.getClass().getSimpleName();
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    /**
     * Reset the data represent by this token, for reuse. Prevents the need to create transfer objects for every
     * piece of data, which immediately get GCed.
     */
    abstract Token reset();

    static void reset(StringBuilder sb) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8548);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8549);if ((((sb != null)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8550)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8551)==0&false))) {{
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8552);sb.delete(0, sb.length());
        }
    }}finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    static final class Doctype extends Token {
        final StringBuilder name = new StringBuilder();
        String pubSysKey = null;
        final StringBuilder publicIdentifier = new StringBuilder();
        final StringBuilder systemIdentifier = new StringBuilder();
        boolean forceQuirks = false;

        Doctype() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8553);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8554);type = TokenType.Doctype;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8555);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8556);reset(name);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8557);pubSysKey = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8558);reset(publicIdentifier);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8559);reset(systemIdentifier);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8560);forceQuirks = false;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8561);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        String getName() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8562);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8563);return name.toString();
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        String getPubSysKey() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8564);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8565);return pubSysKey;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        String getPublicIdentifier() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8566);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8567);return publicIdentifier.toString();
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        public String getSystemIdentifier() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8568);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8569);return systemIdentifier.toString();
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        public boolean isForceQuirks() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8570);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8571);return forceQuirks;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    }

    static abstract class Tag extends Token {
        protected String tagName;
        protected String normalName; // lc version of tag name, for case insensitive tree build
        private String pendingAttributeName; // attribute names are generally caught in one hop, not accumulated
        private StringBuilder pendingAttributeValue = new StringBuilder(); // but values are accumulated, from e.g. & in hrefs
        private String pendingAttributeValueS; // try to get attr vals in one shot, vs Builder
        private boolean hasEmptyAttributeValue = false; // distinguish boolean attribute from empty string value
        private boolean hasPendingAttributeValue = false;
        boolean selfClosing = false;
        Attributes attributes; // start tags get attributes on construction. End tags get attributes on first new attribute (but only for parser convenience, not used).

        @Override
        Tag reset() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8572);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8573);tagName = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8574);normalName = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8575);pendingAttributeName = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8576);reset(pendingAttributeValue);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8577);pendingAttributeValueS = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8578);hasEmptyAttributeValue = false;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8579);hasPendingAttributeValue = false;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8580);selfClosing = false;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8581);attributes = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8582);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void newAttribute() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8583);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8584);if ((((attributes == null)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8585)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8586)==0&false)))
                {__CLR4_4_16ld6ldlh9yvgpw.R.inc(8587);attributes = new Attributes();

            }__CLR4_4_16ld6ldlh9yvgpw.R.inc(8588);if ((((pendingAttributeName != null)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8589)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8590)==0&false))) {{
                // the tokeniser has skipped whitespace control chars, but trimming could collapse to empty for other control codes, so verify here
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8591);pendingAttributeName = pendingAttributeName.trim();
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8592);if ((((pendingAttributeName.length() > 0)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8593)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8594)==0&false))) {{
                    __CLR4_4_16ld6ldlh9yvgpw.R.inc(8595);String value;
                    __CLR4_4_16ld6ldlh9yvgpw.R.inc(8596);if ((((hasPendingAttributeValue)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8597)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8598)==0&false)))
                        {__CLR4_4_16ld6ldlh9yvgpw.R.inc(8599);value = (((pendingAttributeValue.length() > 0 )&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8600)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8601)==0&false))? pendingAttributeValue.toString() : pendingAttributeValueS;
                    }else {__CLR4_4_16ld6ldlh9yvgpw.R.inc(8602);if ((((hasEmptyAttributeValue)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8603)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8604)==0&false)))
                        {__CLR4_4_16ld6ldlh9yvgpw.R.inc(8605);value = "";
                    }else
                        {__CLR4_4_16ld6ldlh9yvgpw.R.inc(8606);value = null;
                    // note that we add, not put. So that the first is kept, and rest are deduped, once in a context where case sensitivity is known (the appropriate tree builder).
                    }}__CLR4_4_16ld6ldlh9yvgpw.R.inc(8607);attributes.add(pendingAttributeName, value);
                }
            }}
            }__CLR4_4_16ld6ldlh9yvgpw.R.inc(8608);pendingAttributeName = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8609);hasEmptyAttributeValue = false;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8610);hasPendingAttributeValue = false;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8611);reset(pendingAttributeValue);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8612);pendingAttributeValueS = null;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void finaliseTag() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8613);
            // finalises for emit
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8614);if ((((pendingAttributeName != null)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8615)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8616)==0&false))) {{
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8617);newAttribute();
            }
        }}finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        /** Preserves case */
        final String name() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8618); // preserves case, for input into Tag.valueOf (which may drop case)
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8619);Validate.isFalse(tagName == null || tagName.length() == 0);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8620);return tagName;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        /** Lower case */
        final String normalName() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8621); // lower case, used in tree building for working out where in tree it should go
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8622);return normalName;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final Tag name(String name) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8623);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8624);tagName = name;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8625);normalName = lowerCase(name);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8626);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final boolean isSelfClosing() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8627);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8628);return selfClosing;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @SuppressWarnings({"TypeMayBeWeakened"})
        final Attributes getAttributes() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8629);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8630);return attributes;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        // these appenders are rarely hit in not null state-- caused by null chars.
        final void appendTagName(String append) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8631);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8632);tagName = (((tagName == null )&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8633)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8634)==0&false))? append : tagName.concat(append);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8635);normalName = lowerCase(tagName);
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void appendTagName(char append) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8636);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8637);appendTagName(String.valueOf(append));
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void appendAttributeName(String append) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8638);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8639);pendingAttributeName = (((pendingAttributeName == null )&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8640)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8641)==0&false))? append : pendingAttributeName.concat(append);
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void appendAttributeName(char append) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8642);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8643);appendAttributeName(String.valueOf(append));
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void appendAttributeValue(String append) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8644);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8645);ensureAttributeValue();
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8646);if ((((pendingAttributeValue.length() == 0)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8647)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8648)==0&false))) {{
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8649);pendingAttributeValueS = append;
            } }else {{
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8650);pendingAttributeValue.append(append);
            }
        }}finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void appendAttributeValue(char append) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8651);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8652);ensureAttributeValue();
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8653);pendingAttributeValue.append(append);
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void appendAttributeValue(char[] append) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8654);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8655);ensureAttributeValue();
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8656);pendingAttributeValue.append(append);
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        final void appendAttributeValue(int[] appendCodepoints) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8657);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8658);ensureAttributeValue();
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8659);for (int codepoint : appendCodepoints) {{
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8660);pendingAttributeValue.appendCodePoint(codepoint);
            }
        }}finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
        
        final void setEmptyAttributeValue() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8661);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8662);hasEmptyAttributeValue = true;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        private void ensureAttributeValue() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8663);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8664);hasPendingAttributeValue = true;
            // if on second hit, we'll need to move to the builder
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8665);if ((((pendingAttributeValueS != null)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8666)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8667)==0&false))) {{
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8668);pendingAttributeValue.append(pendingAttributeValueS);
                __CLR4_4_16ld6ldlh9yvgpw.R.inc(8669);pendingAttributeValueS = null;
            }
        }}finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    }

    final static class StartTag extends Tag {
        StartTag() {
            super();__CLR4_4_16ld6ldlh9yvgpw.R.inc(8671);try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8670);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8672);attributes = new Attributes();
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8673);type = TokenType.StartTag;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        Tag reset() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8674);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8675);super.reset();
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8676);attributes = new Attributes();
            // todo - would prefer these to be null, but need to check Element assertions
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8677);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        StartTag nameAttr(String name, Attributes attributes) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8678);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8679);this.tagName = name;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8680);this.attributes = attributes;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8681);normalName = lowerCase(tagName);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8682);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8683);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8684);if ((((attributes != null && attributes.size() > 0)&&(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8685)!=0|true))||(__CLR4_4_16ld6ldlh9yvgpw.R.iget(8686)==0&false)))
                {__CLR4_4_16ld6ldlh9yvgpw.R.inc(8687);return "<" + name() + " " + attributes.toString() + ">";
            }else
                {__CLR4_4_16ld6ldlh9yvgpw.R.inc(8688);return "<" + name() + ">";
        }}finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    }

    final static class EndTag extends Tag{
        EndTag() {
            super();__CLR4_4_16ld6ldlh9yvgpw.R.inc(8690);try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8689);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8691);type = TokenType.EndTag;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8692);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8693);return "</" + name() + ">";
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    }

    final static class Comment extends Token {
        final StringBuilder data = new StringBuilder();
        boolean bogus = false;

        @Override
        Token reset() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8694);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8695);reset(data);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8696);bogus = false;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8697);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        Comment() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8698);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8699);type = TokenType.Comment;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        String getData() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8700);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8701);return data.toString();
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8702);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8703);return "<!--" + getData() + "-->";
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    }

    static class Character extends Token {
        private String data;

        Character() {
            super();__CLR4_4_16ld6ldlh9yvgpw.R.inc(8705);try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8704);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8706);type = TokenType.Character;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8707);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8708);data = null;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8709);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        Character data(String data) {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8710);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8711);this.data = data;
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8712);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        String getData() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8713);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8714);return data;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8715);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8716);return getData();
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    }

    final static class CData extends Character {
        CData(String data) {
            super();__CLR4_4_16ld6ldlh9yvgpw.R.inc(8718);try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8717);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8719);this.data(data);
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8720);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8721);return "<![CDATA[" + getData() + "]]>";
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    }

    final static class EOF extends Token {
        EOF() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8722);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8723);type = Token.TokenType.EOF;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

        @Override
        Token reset() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8724);
            __CLR4_4_16ld6ldlh9yvgpw.R.inc(8725);return this;
        }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}
    }

    final boolean isDoctype() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8726);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8727);return type == TokenType.Doctype;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final Doctype asDoctype() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8728);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8729);return (Doctype) this;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final boolean isStartTag() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8730);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8731);return type == TokenType.StartTag;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final StartTag asStartTag() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8732);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8733);return (StartTag) this;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final boolean isEndTag() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8734);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8735);return type == TokenType.EndTag;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final EndTag asEndTag() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8736);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8737);return (EndTag) this;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final boolean isComment() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8738);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8739);return type == TokenType.Comment;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final Comment asComment() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8740);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8741);return (Comment) this;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final boolean isCharacter() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8742);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8743);return type == TokenType.Character;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final boolean isCData() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8744);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8745);return this instanceof CData;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final Character asCharacter() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8746);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8747);return (Character) this;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    final boolean isEOF() {try{__CLR4_4_16ld6ldlh9yvgpw.R.inc(8748);
        __CLR4_4_16ld6ldlh9yvgpw.R.inc(8749);return type == TokenType.EOF;
    }finally{__CLR4_4_16ld6ldlh9yvgpw.R.flushNeeded();}}

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character, // note no CData - treated in builder as an extension of Character
        EOF
    }
}
