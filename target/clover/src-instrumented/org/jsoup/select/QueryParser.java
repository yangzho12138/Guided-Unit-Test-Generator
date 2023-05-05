/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jsoup.internal.Normalizer.normalize;

/**
 * Parses a CSS selector into an Evaluator tree.
 */
public class QueryParser {public static class __CLR4_4_1960960lh9yvgt7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,12251,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static String[] combinators = {",", ">", "+", "~", " "};
    private static final String[] AttributeEvals = new String[]{"=", "!=", "^=", "$=", "*=", "~="};

    private TokenQueue tq;
    private String query;
    private List<Evaluator> evals = new ArrayList<>();

    /**
     * Create a new QueryParser.
     * @param query CSS query
     */
    public QueryParser(String query) {try{__CLR4_4_1960960lh9yvgt7.R.inc(11880);
        __CLR4_4_1960960lh9yvgt7.R.inc(11881);this.query = query;
        __CLR4_4_1960960lh9yvgt7.R.inc(11882);this.tq = new TokenQueue(query);
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    /**
     * Parse a CSS query into an Evaluator.
     * @param query CSS query
     * @return Evaluator
     */
    public static Evaluator parse(String query) {try{__CLR4_4_1960960lh9yvgt7.R.inc(11883);
        __CLR4_4_1960960lh9yvgt7.R.inc(11884);try {
            __CLR4_4_1960960lh9yvgt7.R.inc(11885);QueryParser p = new QueryParser(query);
            __CLR4_4_1960960lh9yvgt7.R.inc(11886);return p.parse();
        } catch (IllegalArgumentException e) {
            __CLR4_4_1960960lh9yvgt7.R.inc(11887);throw new Selector.SelectorParseException(e.getMessage());
        }
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    /**
     * Parse the query
     * @return Evaluator
     */
    Evaluator parse() {try{__CLR4_4_1960960lh9yvgt7.R.inc(11888);
        __CLR4_4_1960960lh9yvgt7.R.inc(11889);tq.consumeWhitespace();

        __CLR4_4_1960960lh9yvgt7.R.inc(11890);if ((((tq.matchesAny(combinators))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11891)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11892)==0&false))) {{ // if starts with a combinator, use root as elements
            __CLR4_4_1960960lh9yvgt7.R.inc(11893);evals.add(new StructuralEvaluator.Root());
            __CLR4_4_1960960lh9yvgt7.R.inc(11894);combinator(tq.consume());
        } }else {{
            __CLR4_4_1960960lh9yvgt7.R.inc(11895);findElements();
        }

        }__CLR4_4_1960960lh9yvgt7.R.inc(11896);while ((((!tq.isEmpty())&&(__CLR4_4_1960960lh9yvgt7.R.iget(11897)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11898)==0&false))) {{
            // hierarchy and extras
            __CLR4_4_1960960lh9yvgt7.R.inc(11899);boolean seenWhite = tq.consumeWhitespace();

            __CLR4_4_1960960lh9yvgt7.R.inc(11900);if ((((tq.matchesAny(combinators))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11901)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11902)==0&false))) {{
                __CLR4_4_1960960lh9yvgt7.R.inc(11903);combinator(tq.consume());
            } }else {__CLR4_4_1960960lh9yvgt7.R.inc(11904);if ((((seenWhite)&&(__CLR4_4_1960960lh9yvgt7.R.iget(11905)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11906)==0&false))) {{
                __CLR4_4_1960960lh9yvgt7.R.inc(11907);combinator(' ');
            } }else {{ // E.class, E#id, E[attr] etc. AND
                __CLR4_4_1960960lh9yvgt7.R.inc(11908);findElements(); // take next el, #. etc off queue
            }
        }}}

        }__CLR4_4_1960960lh9yvgt7.R.inc(11909);if ((((evals.size() == 1)&&(__CLR4_4_1960960lh9yvgt7.R.iget(11910)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11911)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11912);return evals.get(0);

        }__CLR4_4_1960960lh9yvgt7.R.inc(11913);return new CombiningEvaluator.And(evals);
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void combinator(char combinator) {try{__CLR4_4_1960960lh9yvgt7.R.inc(11914);
        __CLR4_4_1960960lh9yvgt7.R.inc(11915);tq.consumeWhitespace();
        __CLR4_4_1960960lh9yvgt7.R.inc(11916);String subQuery = consumeSubQuery(); // support multi > childs

        __CLR4_4_1960960lh9yvgt7.R.inc(11917);Evaluator rootEval; // the new topmost evaluator
        __CLR4_4_1960960lh9yvgt7.R.inc(11918);Evaluator currentEval; // the evaluator the new eval will be combined to. could be root, or rightmost or.
        __CLR4_4_1960960lh9yvgt7.R.inc(11919);Evaluator newEval = parse(subQuery); // the evaluator to add into target evaluator
        __CLR4_4_1960960lh9yvgt7.R.inc(11920);boolean replaceRightMost = false;

        __CLR4_4_1960960lh9yvgt7.R.inc(11921);if ((((evals.size() == 1)&&(__CLR4_4_1960960lh9yvgt7.R.iget(11922)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11923)==0&false))) {{
            __CLR4_4_1960960lh9yvgt7.R.inc(11924);rootEval = currentEval = evals.get(0);
            // make sure OR (,) has precedence:
            __CLR4_4_1960960lh9yvgt7.R.inc(11925);if ((((rootEval instanceof CombiningEvaluator.Or && combinator != ',')&&(__CLR4_4_1960960lh9yvgt7.R.iget(11926)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11927)==0&false))) {{
                __CLR4_4_1960960lh9yvgt7.R.inc(11928);currentEval = ((CombiningEvaluator.Or) currentEval).rightMostEvaluator();
                __CLR4_4_1960960lh9yvgt7.R.inc(11929);replaceRightMost = true;
            }
        }}
        }else {{
            __CLR4_4_1960960lh9yvgt7.R.inc(11930);rootEval = currentEval = new CombiningEvaluator.And(evals);
        }
        }__CLR4_4_1960960lh9yvgt7.R.inc(11931);evals.clear();

        // for most combinators: change the current eval into an AND of the current eval and the new eval
        __CLR4_4_1960960lh9yvgt7.R.inc(11932);if ((((combinator == '>')&&(__CLR4_4_1960960lh9yvgt7.R.iget(11933)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11934)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11935);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.ImmediateParent(currentEval));
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(11936);if ((((combinator == ' ')&&(__CLR4_4_1960960lh9yvgt7.R.iget(11937)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11938)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11939);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.Parent(currentEval));
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(11940);if ((((combinator == '+')&&(__CLR4_4_1960960lh9yvgt7.R.iget(11941)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11942)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11943);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.ImmediatePreviousSibling(currentEval));
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(11944);if ((((combinator == '~')&&(__CLR4_4_1960960lh9yvgt7.R.iget(11945)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11946)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11947);currentEval = new CombiningEvaluator.And(newEval, new StructuralEvaluator.PreviousSibling(currentEval));
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(11948);if ((((combinator == ',')&&(__CLR4_4_1960960lh9yvgt7.R.iget(11949)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11950)==0&false))) {{ // group or.
            __CLR4_4_1960960lh9yvgt7.R.inc(11951);CombiningEvaluator.Or or;
            __CLR4_4_1960960lh9yvgt7.R.inc(11952);if ((((currentEval instanceof CombiningEvaluator.Or)&&(__CLR4_4_1960960lh9yvgt7.R.iget(11953)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11954)==0&false))) {{
                __CLR4_4_1960960lh9yvgt7.R.inc(11955);or = (CombiningEvaluator.Or) currentEval;
                __CLR4_4_1960960lh9yvgt7.R.inc(11956);or.add(newEval);
            } }else {{
                __CLR4_4_1960960lh9yvgt7.R.inc(11957);or = new CombiningEvaluator.Or();
                __CLR4_4_1960960lh9yvgt7.R.inc(11958);or.add(currentEval);
                __CLR4_4_1960960lh9yvgt7.R.inc(11959);or.add(newEval);
            }
            }__CLR4_4_1960960lh9yvgt7.R.inc(11960);currentEval = or;
        }
        }else
            {__CLR4_4_1960960lh9yvgt7.R.inc(11961);throw new Selector.SelectorParseException("Unknown combinator: " + combinator);

        }}}}}__CLR4_4_1960960lh9yvgt7.R.inc(11962);if ((((replaceRightMost)&&(__CLR4_4_1960960lh9yvgt7.R.iget(11963)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11964)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11965);((CombiningEvaluator.Or) rootEval).replaceRightMostEvaluator(currentEval);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(11966);rootEval = currentEval;
        }__CLR4_4_1960960lh9yvgt7.R.inc(11967);evals.add(rootEval);
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private String consumeSubQuery() {try{__CLR4_4_1960960lh9yvgt7.R.inc(11968);
        __CLR4_4_1960960lh9yvgt7.R.inc(11969);StringBuilder sq = StringUtil.borrowBuilder();
        __CLR4_4_1960960lh9yvgt7.R.inc(11970);while ((((!tq.isEmpty())&&(__CLR4_4_1960960lh9yvgt7.R.iget(11971)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11972)==0&false))) {{
            __CLR4_4_1960960lh9yvgt7.R.inc(11973);if ((((tq.matches("("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11974)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11975)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(11976);sq.append("(").append(tq.chompBalanced('(', ')')).append(")");
            }else {__CLR4_4_1960960lh9yvgt7.R.inc(11977);if ((((tq.matches("["))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11978)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11979)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(11980);sq.append("[").append(tq.chompBalanced('[', ']')).append("]");
            }else {__CLR4_4_1960960lh9yvgt7.R.inc(11981);if ((((tq.matchesAny(combinators))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11982)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11983)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(11984);break;
            }else
                {__CLR4_4_1960960lh9yvgt7.R.inc(11985);sq.append(tq.consume());
        }}}}
        }__CLR4_4_1960960lh9yvgt7.R.inc(11986);return StringUtil.releaseBuilder(sq);
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void findElements() {try{__CLR4_4_1960960lh9yvgt7.R.inc(11987);
        __CLR4_4_1960960lh9yvgt7.R.inc(11988);if ((((tq.matchChomp("#"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11989)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11990)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11991);byId();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(11992);if ((((tq.matchChomp("."))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11993)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11994)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11995);byClass();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(11996);if ((((tq.matchesWord() || tq.matches("*|"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(11997)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(11998)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(11999);byTag();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12000);if ((((tq.matches("["))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12001)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12002)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12003);byAttribute();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12004);if ((((tq.matchChomp("*"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12005)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12006)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12007);allElements();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12008);if ((((tq.matchChomp(":lt("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12009)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12010)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12011);indexLessThan();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12012);if ((((tq.matchChomp(":gt("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12013)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12014)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12015);indexGreaterThan();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12016);if ((((tq.matchChomp(":eq("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12017)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12018)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12019);indexEquals();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12020);if ((((tq.matches(":has("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12021)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12022)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12023);has();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12024);if ((((tq.matches(":contains("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12025)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12026)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12027);contains(false);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12028);if ((((tq.matches(":containsOwn("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12029)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12030)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12031);contains(true);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12032);if ((((tq.matches(":containsData("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12033)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12034)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12035);containsData();
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12036);if ((((tq.matches(":matches("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12037)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12038)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12039);matches(false);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12040);if ((((tq.matches(":matchesOwn("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12041)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12042)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12043);matches(true);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12044);if ((((tq.matches(":not("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12045)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12046)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12047);not();
		}else {__CLR4_4_1960960lh9yvgt7.R.inc(12048);if ((((tq.matchChomp(":nth-child("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12049)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12050)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12051);cssNthChild(false, false);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12052);if ((((tq.matchChomp(":nth-last-child("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12053)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12054)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12055);cssNthChild(true, false);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12056);if ((((tq.matchChomp(":nth-of-type("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12057)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12058)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12059);cssNthChild(false, true);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12060);if ((((tq.matchChomp(":nth-last-of-type("))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12061)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12062)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12063);cssNthChild(true, true);
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12064);if ((((tq.matchChomp(":first-child"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12065)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12066)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12067);evals.add(new Evaluator.IsFirstChild());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12068);if ((((tq.matchChomp(":last-child"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12069)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12070)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12071);evals.add(new Evaluator.IsLastChild());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12072);if ((((tq.matchChomp(":first-of-type"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12073)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12074)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12075);evals.add(new Evaluator.IsFirstOfType());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12076);if ((((tq.matchChomp(":last-of-type"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12077)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12078)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12079);evals.add(new Evaluator.IsLastOfType());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12080);if ((((tq.matchChomp(":only-child"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12081)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12082)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12083);evals.add(new Evaluator.IsOnlyChild());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12084);if ((((tq.matchChomp(":only-of-type"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12085)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12086)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12087);evals.add(new Evaluator.IsOnlyOfType());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12088);if ((((tq.matchChomp(":empty"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12089)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12090)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12091);evals.add(new Evaluator.IsEmpty());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12092);if ((((tq.matchChomp(":root"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12093)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12094)==0&false)))
        	{__CLR4_4_1960960lh9yvgt7.R.inc(12095);evals.add(new Evaluator.IsRoot());
        }else {__CLR4_4_1960960lh9yvgt7.R.inc(12096);if ((((tq.matchChomp(":matchText"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12097)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12098)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12099);evals.add(new Evaluator.MatchText());
		}else // unhandled
            {__CLR4_4_1960960lh9yvgt7.R.inc(12100);throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", query, tq.remainder());

    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void byId() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12101);
        __CLR4_4_1960960lh9yvgt7.R.inc(12102);String id = tq.consumeCssIdentifier();
        __CLR4_4_1960960lh9yvgt7.R.inc(12103);Validate.notEmpty(id);
        __CLR4_4_1960960lh9yvgt7.R.inc(12104);evals.add(new Evaluator.Id(id));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void byClass() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12105);
        __CLR4_4_1960960lh9yvgt7.R.inc(12106);String className = tq.consumeCssIdentifier();
        __CLR4_4_1960960lh9yvgt7.R.inc(12107);Validate.notEmpty(className);
        __CLR4_4_1960960lh9yvgt7.R.inc(12108);evals.add(new Evaluator.Class(className.trim()));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void byTag() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12109);
        __CLR4_4_1960960lh9yvgt7.R.inc(12110);String tagName = tq.consumeElementSelector();

        __CLR4_4_1960960lh9yvgt7.R.inc(12111);Validate.notEmpty(tagName);

        // namespaces: wildcard match equals(tagName) or ending in ":"+tagName
        __CLR4_4_1960960lh9yvgt7.R.inc(12112);if ((((tagName.startsWith("*|"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12113)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12114)==0&false))) {{
            __CLR4_4_1960960lh9yvgt7.R.inc(12115);evals.add(new CombiningEvaluator.Or(new Evaluator.Tag(normalize(tagName)), new Evaluator.TagEndsWith(normalize(tagName.replace("*|", ":")))));
        } }else {{
            // namespaces: if element name is "abc:def", selector must be "abc|def", so flip:
            __CLR4_4_1960960lh9yvgt7.R.inc(12116);if ((((tagName.contains("|"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12117)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12118)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12119);tagName = tagName.replace("|", ":");

            }__CLR4_4_1960960lh9yvgt7.R.inc(12120);evals.add(new Evaluator.Tag(tagName.trim()));
        }
    }}finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void byAttribute() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12121);
        __CLR4_4_1960960lh9yvgt7.R.inc(12122);TokenQueue cq = new TokenQueue(tq.chompBalanced('[', ']')); // content queue
        __CLR4_4_1960960lh9yvgt7.R.inc(12123);String key = cq.consumeToAny(AttributeEvals); // eq, not, start, end, contain, match, (no val)
        __CLR4_4_1960960lh9yvgt7.R.inc(12124);Validate.notEmpty(key);
        __CLR4_4_1960960lh9yvgt7.R.inc(12125);cq.consumeWhitespace();

        __CLR4_4_1960960lh9yvgt7.R.inc(12126);if ((((cq.isEmpty())&&(__CLR4_4_1960960lh9yvgt7.R.iget(12127)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12128)==0&false))) {{
            __CLR4_4_1960960lh9yvgt7.R.inc(12129);if ((((key.startsWith("^"))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12130)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12131)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12132);evals.add(new Evaluator.AttributeStarting(key.substring(1)));
            }else
                {__CLR4_4_1960960lh9yvgt7.R.inc(12133);evals.add(new Evaluator.Attribute(key));
        }} }else {{
            __CLR4_4_1960960lh9yvgt7.R.inc(12134);if ((((cq.matchChomp("="))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12135)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12136)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12137);evals.add(new Evaluator.AttributeWithValue(key, cq.remainder()));

            }else {__CLR4_4_1960960lh9yvgt7.R.inc(12138);if ((((cq.matchChomp("!="))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12139)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12140)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12141);evals.add(new Evaluator.AttributeWithValueNot(key, cq.remainder()));

            }else {__CLR4_4_1960960lh9yvgt7.R.inc(12142);if ((((cq.matchChomp("^="))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12143)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12144)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12145);evals.add(new Evaluator.AttributeWithValueStarting(key, cq.remainder()));

            }else {__CLR4_4_1960960lh9yvgt7.R.inc(12146);if ((((cq.matchChomp("$="))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12147)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12148)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12149);evals.add(new Evaluator.AttributeWithValueEnding(key, cq.remainder()));

            }else {__CLR4_4_1960960lh9yvgt7.R.inc(12150);if ((((cq.matchChomp("*="))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12151)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12152)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12153);evals.add(new Evaluator.AttributeWithValueContaining(key, cq.remainder()));

            }else {__CLR4_4_1960960lh9yvgt7.R.inc(12154);if ((((cq.matchChomp("~="))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12155)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12156)==0&false)))
                {__CLR4_4_1960960lh9yvgt7.R.inc(12157);evals.add(new Evaluator.AttributeWithValueMatching(key, Pattern.compile(cq.remainder())));
            }else
                {__CLR4_4_1960960lh9yvgt7.R.inc(12158);throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", query, cq.remainder());
        }}}}}}}
    }}finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void allElements() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12159);
        __CLR4_4_1960960lh9yvgt7.R.inc(12160);evals.add(new Evaluator.AllElements());
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    // pseudo selectors :lt, :gt, :eq
    private void indexLessThan() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12161);
        __CLR4_4_1960960lh9yvgt7.R.inc(12162);evals.add(new Evaluator.IndexLessThan(consumeIndex()));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void indexGreaterThan() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12163);
        __CLR4_4_1960960lh9yvgt7.R.inc(12164);evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private void indexEquals() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12165);
        __CLR4_4_1960960lh9yvgt7.R.inc(12166);evals.add(new Evaluator.IndexEquals(consumeIndex()));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}
    
    //pseudo selectors :first-child, :last-child, :nth-child, ...
    private static final Pattern NTH_AB = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", Pattern.CASE_INSENSITIVE);
    private static final Pattern NTH_B  = Pattern.compile("([+-])?(\\d+)");

	private void cssNthChild(boolean backwards, boolean ofType) {try{__CLR4_4_1960960lh9yvgt7.R.inc(12167);
		__CLR4_4_1960960lh9yvgt7.R.inc(12168);String argS = normalize(tq.chompTo(")"));
		__CLR4_4_1960960lh9yvgt7.R.inc(12169);Matcher mAB = NTH_AB.matcher(argS);
		__CLR4_4_1960960lh9yvgt7.R.inc(12170);Matcher mB = NTH_B.matcher(argS);
		__CLR4_4_1960960lh9yvgt7.R.inc(12171);final int a, b;
		__CLR4_4_1960960lh9yvgt7.R.inc(12172);if (((("odd".equals(argS))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12173)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12174)==0&false))) {{
			__CLR4_4_1960960lh9yvgt7.R.inc(12175);a = 2;
			__CLR4_4_1960960lh9yvgt7.R.inc(12176);b = 1;
		} }else {__CLR4_4_1960960lh9yvgt7.R.inc(12177);if (((("even".equals(argS))&&(__CLR4_4_1960960lh9yvgt7.R.iget(12178)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12179)==0&false))) {{
			__CLR4_4_1960960lh9yvgt7.R.inc(12180);a = 2;
			__CLR4_4_1960960lh9yvgt7.R.inc(12181);b = 0;
		} }else {__CLR4_4_1960960lh9yvgt7.R.inc(12182);if ((((mAB.matches())&&(__CLR4_4_1960960lh9yvgt7.R.iget(12183)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12184)==0&false))) {{
			__CLR4_4_1960960lh9yvgt7.R.inc(12185);a = (((mAB.group(3) != null )&&(__CLR4_4_1960960lh9yvgt7.R.iget(12186)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12187)==0&false))? Integer.parseInt(mAB.group(1).replaceFirst("^\\+", "")) : 1;
			__CLR4_4_1960960lh9yvgt7.R.inc(12188);b = (((mAB.group(4) != null )&&(__CLR4_4_1960960lh9yvgt7.R.iget(12189)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12190)==0&false))? Integer.parseInt(mAB.group(4).replaceFirst("^\\+", "")) : 0;
		} }else {__CLR4_4_1960960lh9yvgt7.R.inc(12191);if ((((mB.matches())&&(__CLR4_4_1960960lh9yvgt7.R.iget(12192)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12193)==0&false))) {{
			__CLR4_4_1960960lh9yvgt7.R.inc(12194);a = 0;
			__CLR4_4_1960960lh9yvgt7.R.inc(12195);b = Integer.parseInt(mB.group().replaceFirst("^\\+", ""));
		} }else {{
			__CLR4_4_1960960lh9yvgt7.R.inc(12196);throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", argS);
		}
		}}}}__CLR4_4_1960960lh9yvgt7.R.inc(12197);if ((((ofType)&&(__CLR4_4_1960960lh9yvgt7.R.iget(12198)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12199)==0&false)))
			{__CLR4_4_1960960lh9yvgt7.R.inc(12200);if ((((backwards)&&(__CLR4_4_1960960lh9yvgt7.R.iget(12201)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12202)==0&false)))
				{__CLR4_4_1960960lh9yvgt7.R.inc(12203);evals.add(new Evaluator.IsNthLastOfType(a, b));
			}else
				{__CLR4_4_1960960lh9yvgt7.R.inc(12204);evals.add(new Evaluator.IsNthOfType(a, b));
		}}else {{
			__CLR4_4_1960960lh9yvgt7.R.inc(12205);if ((((backwards)&&(__CLR4_4_1960960lh9yvgt7.R.iget(12206)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12207)==0&false)))
				{__CLR4_4_1960960lh9yvgt7.R.inc(12208);evals.add(new Evaluator.IsNthLastChild(a, b));
			}else
				{__CLR4_4_1960960lh9yvgt7.R.inc(12209);evals.add(new Evaluator.IsNthChild(a, b));
		}}
	}}finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    private int consumeIndex() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12210);
        __CLR4_4_1960960lh9yvgt7.R.inc(12211);String indexS = tq.chompTo(")").trim();
        __CLR4_4_1960960lh9yvgt7.R.inc(12212);Validate.isTrue(StringUtil.isNumeric(indexS), "Index must be numeric");
        __CLR4_4_1960960lh9yvgt7.R.inc(12213);return Integer.parseInt(indexS);
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    // pseudo selector :has(el)
    private void has() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12214);
        __CLR4_4_1960960lh9yvgt7.R.inc(12215);tq.consume(":has");
        __CLR4_4_1960960lh9yvgt7.R.inc(12216);String subQuery = tq.chompBalanced('(', ')');
        __CLR4_4_1960960lh9yvgt7.R.inc(12217);Validate.notEmpty(subQuery, ":has(el) subselect must not be empty");
        __CLR4_4_1960960lh9yvgt7.R.inc(12218);evals.add(new StructuralEvaluator.Has(parse(subQuery)));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    // pseudo selector :contains(text), containsOwn(text)
    private void contains(boolean own) {try{__CLR4_4_1960960lh9yvgt7.R.inc(12219);
        __CLR4_4_1960960lh9yvgt7.R.inc(12220);tq.consume((((own )&&(__CLR4_4_1960960lh9yvgt7.R.iget(12221)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12222)==0&false))? ":containsOwn" : ":contains");
        __CLR4_4_1960960lh9yvgt7.R.inc(12223);String searchText = TokenQueue.unescape(tq.chompBalanced('(', ')'));
        __CLR4_4_1960960lh9yvgt7.R.inc(12224);Validate.notEmpty(searchText, ":contains(text) query must not be empty");
        __CLR4_4_1960960lh9yvgt7.R.inc(12225);if ((((own)&&(__CLR4_4_1960960lh9yvgt7.R.iget(12226)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12227)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12228);evals.add(new Evaluator.ContainsOwnText(searchText));
        }else
            {__CLR4_4_1960960lh9yvgt7.R.inc(12229);evals.add(new Evaluator.ContainsText(searchText));
    }}finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    // pseudo selector :containsData(data)
    private void containsData() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12230);
        __CLR4_4_1960960lh9yvgt7.R.inc(12231);tq.consume(":containsData");
        __CLR4_4_1960960lh9yvgt7.R.inc(12232);String searchText = TokenQueue.unescape(tq.chompBalanced('(', ')'));
        __CLR4_4_1960960lh9yvgt7.R.inc(12233);Validate.notEmpty(searchText, ":containsData(text) query must not be empty");
        __CLR4_4_1960960lh9yvgt7.R.inc(12234);evals.add(new Evaluator.ContainsData(searchText));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    // :matches(regex), matchesOwn(regex)
    private void matches(boolean own) {try{__CLR4_4_1960960lh9yvgt7.R.inc(12235);
        __CLR4_4_1960960lh9yvgt7.R.inc(12236);tq.consume((((own )&&(__CLR4_4_1960960lh9yvgt7.R.iget(12237)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12238)==0&false))? ":matchesOwn" : ":matches");
        __CLR4_4_1960960lh9yvgt7.R.inc(12239);String regex = tq.chompBalanced('(', ')'); // don't unescape, as regex bits will be escaped
        __CLR4_4_1960960lh9yvgt7.R.inc(12240);Validate.notEmpty(regex, ":matches(regex) query must not be empty");

        __CLR4_4_1960960lh9yvgt7.R.inc(12241);if ((((own)&&(__CLR4_4_1960960lh9yvgt7.R.iget(12242)!=0|true))||(__CLR4_4_1960960lh9yvgt7.R.iget(12243)==0&false)))
            {__CLR4_4_1960960lh9yvgt7.R.inc(12244);evals.add(new Evaluator.MatchesOwn(Pattern.compile(regex)));
        }else
            {__CLR4_4_1960960lh9yvgt7.R.inc(12245);evals.add(new Evaluator.Matches(Pattern.compile(regex)));
    }}finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}

    // :not(selector)
    private void not() {try{__CLR4_4_1960960lh9yvgt7.R.inc(12246);
        __CLR4_4_1960960lh9yvgt7.R.inc(12247);tq.consume(":not");
        __CLR4_4_1960960lh9yvgt7.R.inc(12248);String subQuery = tq.chompBalanced('(', ')');
        __CLR4_4_1960960lh9yvgt7.R.inc(12249);Validate.notEmpty(subQuery, ":not(selector) subselect must not be empty");

        __CLR4_4_1960960lh9yvgt7.R.inc(12250);evals.add(new StructuralEvaluator.Not(parse(subQuery)));
    }finally{__CLR4_4_1960960lh9yvgt7.R.flushNeeded();}}
}
