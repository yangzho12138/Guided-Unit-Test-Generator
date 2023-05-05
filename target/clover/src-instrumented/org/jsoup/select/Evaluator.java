/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jsoup.internal.Normalizer.lowerCase;
import static org.jsoup.internal.Normalizer.normalize;


/**
 * Evaluates that an element matches the selector.
 */
public abstract class Evaluator {public static class __CLR4_4_18ve8velh9yvgsk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,11784,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected Evaluator() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11498);
    }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    /**
     * Test if the element meets the evaluator's requirements.
     *
     * @param root    Root of the matching subtree
     * @param element tested element
     * @return Returns <tt>true</tt> if the requirements are met or
     * <tt>false</tt> otherwise
     */
    public abstract boolean matches(Element root, Element element);

    /**
     * Evaluator for tag name
     */
    public static final class Tag extends Evaluator {
        private String tagName;

        public Tag(String tagName) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11499);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11500);this.tagName = tagName;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11501);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11502);return (element.tagName().equalsIgnoreCase(tagName));
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11503);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11504);return String.format("%s", tagName);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }


    /**
     * Evaluator for tag name that ends with
     */
    public static final class TagEndsWith extends Evaluator {
        private String tagName;

        public TagEndsWith(String tagName) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11505);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11506);this.tagName = tagName;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11507);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11508);return (element.tagName().endsWith(tagName));
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11509);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11510);return String.format("%s", tagName);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for element id
     */
    public static final class Id extends Evaluator {
        private String id;

        public Id(String id) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11511);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11512);this.id = id;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11513);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11514);return (id.equals(element.id()));
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11515);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11516);return String.format("#%s", id);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for element class
     */
    public static final class Class extends Evaluator {
        private String className;

        public Class(String className) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11517);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11518);this.className = className;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11519);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11520);return (element.hasClass(className));
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11521);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11522);return String.format(".%s", className);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name matching
     */
    public static final class Attribute extends Evaluator {
        private String key;

        public Attribute(String key) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11523);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11524);this.key = key;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11525);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11526);return element.hasAttr(key);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11527);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11528);return String.format("[%s]", key);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name prefix matching
     */
    public static final class AttributeStarting extends Evaluator {
        private String keyPrefix;

        public AttributeStarting(String keyPrefix) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11529);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11530);Validate.notEmpty(keyPrefix);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11531);this.keyPrefix = lowerCase(keyPrefix);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11532);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11533);List<org.jsoup.nodes.Attribute> values = element.attributes().asList();
            __CLR4_4_18ve8velh9yvgsk.R.inc(11534);for (org.jsoup.nodes.Attribute attribute : values) {{
                __CLR4_4_18ve8velh9yvgsk.R.inc(11535);if ((((lowerCase(attribute.getKey()).startsWith(keyPrefix))&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11536)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11537)==0&false)))
                    {__CLR4_4_18ve8velh9yvgsk.R.inc(11538);return true;
            }}
            }__CLR4_4_18ve8velh9yvgsk.R.inc(11539);return false;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11540);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11541);return String.format("[^%s]", keyPrefix);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching
     */
    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String key, String value) {
            super(key, value);__CLR4_4_18ve8velh9yvgsk.R.inc(11543);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11542);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11544);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11545);return element.hasAttr(key) && value.equalsIgnoreCase(element.attr(key).trim());
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11546);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11547);return String.format("[%s=%s]", key, value);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name != value matching
     */
    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String key, String value) {
            super(key, value);__CLR4_4_18ve8velh9yvgsk.R.inc(11549);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11548);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11550);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11551);return !value.equalsIgnoreCase(element.attr(key));
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11552);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11553);return String.format("[%s!=%s]", key, value);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value prefix)
     */
    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String key, String value) {
            super(key, value);__CLR4_4_18ve8velh9yvgsk.R.inc(11555);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11554);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11556);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11557);return element.hasAttr(key) && lowerCase(element.attr(key)).startsWith(value); // value is lower case already
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11558);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11559);return String.format("[%s^=%s]", key, value);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value ending)
     */
    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String key, String value) {
            super(key, value);__CLR4_4_18ve8velh9yvgsk.R.inc(11561);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11560);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11562);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11563);return element.hasAttr(key) && lowerCase(element.attr(key)).endsWith(value); // value is lower case
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11564);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11565);return String.format("[%s$=%s]", key, value);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value containing)
     */
    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String key, String value) {
            super(key, value);__CLR4_4_18ve8velh9yvgsk.R.inc(11567);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11566);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11568);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11569);return element.hasAttr(key) && lowerCase(element.attr(key)).contains(value); // value is lower case
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11570);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11571);return String.format("[%s*=%s]", key, value);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for attribute name/value matching (value regex matching)
     */
    public static final class AttributeWithValueMatching extends Evaluator {
        String key;
        Pattern pattern;

        public AttributeWithValueMatching(String key, Pattern pattern) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11572);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11573);this.key = normalize(key);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11574);this.pattern = pattern;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11575);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11576);return element.hasAttr(key) && pattern.matcher(element.attr(key)).find();
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11577);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11578);return String.format("[%s~=%s]", key, pattern.toString());
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Abstract evaluator for attribute name/value matching
     */
    public abstract static class AttributeKeyPair extends Evaluator {
        String key;
        String value;

        public AttributeKeyPair(String key, String value) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11579);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11580);Validate.notEmpty(key);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11581);Validate.notEmpty(value);

            __CLR4_4_18ve8velh9yvgsk.R.inc(11582);this.key = normalize(key);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11583);if ((((value.startsWith("\"") && value.endsWith("\"")
                    || value.startsWith("'") && value.endsWith("'"))&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11584)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11585)==0&false))) {{
                __CLR4_4_18ve8velh9yvgsk.R.inc(11586);value = value.substring(1, value.length()-1);
            }
            }__CLR4_4_18ve8velh9yvgsk.R.inc(11587);this.value = normalize(value);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for any / all element matching
     */
    public static final class AllElements extends Evaluator {

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11588);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11589);return true;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11590);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11591);return "*";
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching by sibling index number (e {@literal <} idx)
     */
    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int index) {
            super(index);__CLR4_4_18ve8velh9yvgsk.R.inc(11593);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11592);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11594);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11595);return root != element && element.elementSiblingIndex() < index;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11596);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11597);return String.format(":lt(%d)", index);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching by sibling index number (e {@literal >} idx)
     */
    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int index) {
            super(index);__CLR4_4_18ve8velh9yvgsk.R.inc(11599);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11598);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11600);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11601);return element.elementSiblingIndex() > index;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11602);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11603);return String.format(":gt(%d)", index);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching by sibling index number (e = idx)
     */
    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int index) {
            super(index);__CLR4_4_18ve8velh9yvgsk.R.inc(11605);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11604);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11606);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11607);return element.elementSiblingIndex() == index;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11608);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11609);return String.format(":eq(%d)", index);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    }

    /**
     * Evaluator for matching the last sibling (css :last-child)
     */
    public static final class IsLastChild extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11610);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11611);final Element p = element.parent();
			__CLR4_4_18ve8velh9yvgsk.R.inc(11612);return p != null && !(p instanceof Document) && element.elementSiblingIndex() == p.children().size()-1;
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		@Override
		public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11613);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11614);return ":last-child";
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    public static final class IsFirstOfType extends IsNthOfType {
		public IsFirstOfType() {
			super(0,1);__CLR4_4_18ve8velh9yvgsk.R.inc(11616);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11615);
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
		@Override
		public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11617);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11618);return ":first-of-type";
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    public static final class IsLastOfType extends IsNthLastOfType {
		public IsLastOfType() {
			super(0,1);__CLR4_4_18ve8velh9yvgsk.R.inc(11620);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11619);
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
		@Override
		public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11621);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11622);return ":last-of-type";
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }


    public static abstract class CssNthEvaluator extends Evaluator {
    	protected final int a, b;

    	public CssNthEvaluator(int a, int b) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11623);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11624);this.a = a;
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11625);this.b = b;
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    	public CssNthEvaluator(int b) {
    		this(0,b);__CLR4_4_18ve8velh9yvgsk.R.inc(11627);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11626);
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11628);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11629);final Element p = element.parent();
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11630);if ((((p == null || (p instanceof Document))&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11631)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11632)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11633);return false;

    		}__CLR4_4_18ve8velh9yvgsk.R.inc(11634);final int pos = calculatePosition(root, element);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11635);if ((((a == 0)&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11636)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11637)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11638);return pos == b;

    		}__CLR4_4_18ve8velh9yvgsk.R.inc(11639);return (pos-b)*a >= 0 && (pos-b)%a==0;
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		@Override
		public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11640);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11641);if ((((a == 0)&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11642)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11643)==0&false)))
				{__CLR4_4_18ve8velh9yvgsk.R.inc(11644);return String.format(":%s(%d)",getPseudoClass(), b);
			}__CLR4_4_18ve8velh9yvgsk.R.inc(11645);if ((((b == 0)&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11646)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11647)==0&false)))
				{__CLR4_4_18ve8velh9yvgsk.R.inc(11648);return String.format(":%s(%dn)",getPseudoClass(), a);
			}__CLR4_4_18ve8velh9yvgsk.R.inc(11649);return String.format(":%s(%dn%+d)", getPseudoClass(),a, b);
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		protected abstract String getPseudoClass();
		protected abstract int calculatePosition(Element root, Element element);
    }


    /**
     * css-compatible Evaluator for :eq (css :nth-child)
     *
     * @see IndexEquals
     */
    public static final class IsNthChild extends CssNthEvaluator {

    	public IsNthChild(int a, int b) {
    		super(a,b);__CLR4_4_18ve8velh9yvgsk.R.inc(11651);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11650);
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		protected int calculatePosition(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11652);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11653);return element.elementSiblingIndex()+1;
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}


		protected String getPseudoClass() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11654);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11655);return "nth-child";
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * css pseudo class :nth-last-child)
     *
     * @see IndexEquals
     */
    public static final class IsNthLastChild extends CssNthEvaluator {
    	public IsNthLastChild(int a, int b) {
    		super(a,b);__CLR4_4_18ve8velh9yvgsk.R.inc(11657);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11656);
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        protected int calculatePosition(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11658);
        	__CLR4_4_18ve8velh9yvgsk.R.inc(11659);return element.parent().children().size() - element.elementSiblingIndex();
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11660);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11661);return "nth-last-child";
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * css pseudo class nth-of-type
     *
     */
    public static class IsNthOfType extends CssNthEvaluator {
    	public IsNthOfType(int a, int b) {
    		super(a,b);__CLR4_4_18ve8velh9yvgsk.R.inc(11663);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11662);
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		protected int calculatePosition(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11664);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11665);int pos = 0;
        	__CLR4_4_18ve8velh9yvgsk.R.inc(11666);Elements family = element.parent().children();
            __CLR4_4_18ve8velh9yvgsk.R.inc(11667);for (Element el : family) {{
                __CLR4_4_18ve8velh9yvgsk.R.inc(11668);if ((((el.tag().equals(element.tag()))&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11669)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11670)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11671);pos++;
                }__CLR4_4_18ve8velh9yvgsk.R.inc(11672);if ((((el == element)&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11673)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11674)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11675);break;
            }}
			}__CLR4_4_18ve8velh9yvgsk.R.inc(11676);return pos;
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11677);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11678);return "nth-of-type";
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    public static class IsNthLastOfType extends CssNthEvaluator {

		public IsNthLastOfType(int a, int b) {
			super(a, b);__CLR4_4_18ve8velh9yvgsk.R.inc(11680);try{__CLR4_4_18ve8velh9yvgsk.R.inc(11679);
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		@Override
		protected int calculatePosition(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11681);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11682);int pos = 0;
        	__CLR4_4_18ve8velh9yvgsk.R.inc(11683);Elements family = element.parent().children();
        	__CLR4_4_18ve8velh9yvgsk.R.inc(11684);for (int i = element.elementSiblingIndex(); (((i < family.size())&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11685)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11686)==0&false)); i++) {{
        		__CLR4_4_18ve8velh9yvgsk.R.inc(11687);if ((((family.get(i).tag().equals(element.tag()))&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11688)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11689)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11690);pos++;
        	}}
			}__CLR4_4_18ve8velh9yvgsk.R.inc(11691);return pos;
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

		@Override
		protected String getPseudoClass() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11692);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11693);return "nth-last-of-type";
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching the first sibling (css :first-child)
     */
    public static final class IsFirstChild extends Evaluator {
    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11694);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11695);final Element p = element.parent();
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11696);return p != null && !(p instanceof Document) && element.elementSiblingIndex() == 0;
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

    	@Override
    	public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11697);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11698);return ":first-child";
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * css3 pseudo-class :root
     * @see <a href="http://www.w3.org/TR/selectors/#root-pseudo">:root selector</a>
     *
     */
    public static final class IsRoot extends Evaluator {
    	@Override
    	public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11699);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11700);final Element r = (((root instanceof Document)&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11701)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11702)==0&false))?root.child(0):root;
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11703);return element == r;
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11704);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11705);return ":root";
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    public static final class IsOnlyChild extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11706);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11707);final Element p = element.parent();
			__CLR4_4_18ve8velh9yvgsk.R.inc(11708);return p!=null && !(p instanceof Document) && element.siblingElements().isEmpty();
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11709);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11710);return ":only-child";
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    public static final class IsOnlyOfType extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11711);
			__CLR4_4_18ve8velh9yvgsk.R.inc(11712);final Element p = element.parent();
			__CLR4_4_18ve8velh9yvgsk.R.inc(11713);if ((((p==null || p instanceof Document)&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11714)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11715)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11716);return false;

			}__CLR4_4_18ve8velh9yvgsk.R.inc(11717);int pos = 0;
        	__CLR4_4_18ve8velh9yvgsk.R.inc(11718);Elements family = p.children();
            __CLR4_4_18ve8velh9yvgsk.R.inc(11719);for (Element el : family) {{
                __CLR4_4_18ve8velh9yvgsk.R.inc(11720);if ((((el.tag().equals(element.tag()))&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11721)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11722)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11723);pos++;
            }}
        	}__CLR4_4_18ve8velh9yvgsk.R.inc(11724);return pos == 1;
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11725);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11726);return ":only-of-type";
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    public static final class IsEmpty extends Evaluator {
		@Override
		public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11727);
        	__CLR4_4_18ve8velh9yvgsk.R.inc(11728);List<Node> family = element.childNodes();
            __CLR4_4_18ve8velh9yvgsk.R.inc(11729);for (Node n : family) {{
                __CLR4_4_18ve8velh9yvgsk.R.inc(11730);if ((((!(n instanceof Comment || n instanceof XmlDeclaration || n instanceof DocumentType))&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11731)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11732)==0&false))) {__CLR4_4_18ve8velh9yvgsk.R.inc(11733);return false;
            }}
        	}__CLR4_4_18ve8velh9yvgsk.R.inc(11734);return true;
		}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    	@Override
    	public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11735);
    		__CLR4_4_18ve8velh9yvgsk.R.inc(11736);return ":empty";
    	}finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Abstract evaluator for sibling index matching
     *
     * @author ant
     */
    public abstract static class IndexEvaluator extends Evaluator {
        int index;

        public IndexEvaluator(int index) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11737);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11738);this.index = index;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) text
     */
    public static final class ContainsText extends Evaluator {
        private String searchText;

        public ContainsText(String searchText) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11739);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11740);this.searchText = lowerCase(searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11741);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11742);return lowerCase(element.text()).contains(searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11743);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11744);return String.format(":contains(%s)", searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) data
     */
    public static final class ContainsData extends Evaluator {
        private String searchText;

        public ContainsData(String searchText) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11745);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11746);this.searchText = lowerCase(searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11747);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11748);return lowerCase(element.data()).contains(searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11749);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11750);return String.format(":containsData(%s)", searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element's own text
     */
    public static final class ContainsOwnText extends Evaluator {
        private String searchText;

        public ContainsOwnText(String searchText) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11751);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11752);this.searchText = lowerCase(searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11753);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11754);return lowerCase(element.ownText()).contains(searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11755);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11756);return String.format(":containsOwn(%s)", searchText);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element (and its descendants) text with regex
     */
    public static final class Matches extends Evaluator {
        private Pattern pattern;

        public Matches(Pattern pattern) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11757);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11758);this.pattern = pattern;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11759);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11760);Matcher m = pattern.matcher(element.text());
            __CLR4_4_18ve8velh9yvgsk.R.inc(11761);return m.find();
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11762);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11763);return String.format(":matches(%s)", pattern);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    /**
     * Evaluator for matching Element's own text with regex
     */
    public static final class MatchesOwn extends Evaluator {
        private Pattern pattern;

        public MatchesOwn(Pattern pattern) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11764);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11765);this.pattern = pattern;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11766);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11767);Matcher m = pattern.matcher(element.ownText());
            __CLR4_4_18ve8velh9yvgsk.R.inc(11768);return m.find();
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11769);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11770);return String.format(":matchesOwn(%s)", pattern);
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }

    public static final class MatchText extends Evaluator {

        @Override
        public boolean matches(Element root, Element element) {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11771);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11772);if ((((element instanceof PseudoTextElement)&&(__CLR4_4_18ve8velh9yvgsk.R.iget(11773)!=0|true))||(__CLR4_4_18ve8velh9yvgsk.R.iget(11774)==0&false)))
                {__CLR4_4_18ve8velh9yvgsk.R.inc(11775);return true;

            }__CLR4_4_18ve8velh9yvgsk.R.inc(11776);List<TextNode> textNodes = element.textNodes();
            __CLR4_4_18ve8velh9yvgsk.R.inc(11777);for (TextNode textNode : textNodes) {{
                __CLR4_4_18ve8velh9yvgsk.R.inc(11778);PseudoTextElement pel = new PseudoTextElement(
                    org.jsoup.parser.Tag.valueOf(element.tagName()), element.baseUri(), element.attributes());
                __CLR4_4_18ve8velh9yvgsk.R.inc(11779);textNode.replaceWith(pel);
                __CLR4_4_18ve8velh9yvgsk.R.inc(11780);pel.appendChild(textNode);
            }
            }__CLR4_4_18ve8velh9yvgsk.R.inc(11781);return false;
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_4_18ve8velh9yvgsk.R.inc(11782);
            __CLR4_4_18ve8velh9yvgsk.R.inc(11783);return ":matchText";
        }finally{__CLR4_4_18ve8velh9yvgsk.R.flushNeeded();}}
    }
}
