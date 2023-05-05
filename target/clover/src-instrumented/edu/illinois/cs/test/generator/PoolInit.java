/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.CharLiteralExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import edu.illinois.cs.test.pojo.ValuePool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import static com.github.javaparser.StaticJavaParser.parse;

// scan the target resources to generate the primitive value pool
public class PoolInit extends VoidVisitorAdapter {public static class __CLR4_4_1fwfwlh9yvg7f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static public ValuePool valuePool;

    public PoolInit(String target){try{__CLR4_4_1fwfwlh9yvg7f.R.inc(572);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(573);this.valuePool = new ValuePool();
//        valuePool.addValue(null);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(574);valuePool.addValue(true);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(575);valuePool.addValue(false);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(576);valuePool.addValue(0L);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(577);valuePool.addValue(1L);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(578);valuePool.addValue(-1L);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(579);valuePool.addValue(100L);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(580);valuePool.addValue(-100L);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(581);preParse(target);
    }finally{__CLR4_4_1fwfwlh9yvg7f.R.flushNeeded();}}


    public void preParse(String target){try{__CLR4_4_1fwfwlh9yvg7f.R.inc(582);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(583);Path sourcePath = Paths.get(target);
//        SourceRoot sourceRoot = new SourceRoot(sourcePath);

        __CLR4_4_1fwfwlh9yvg7f.R.inc(584);try{
            __CLR4_4_1fwfwlh9yvg7f.R.inc(585);Files.walk(sourcePath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(586);try{
                            __CLR4_4_1fwfwlh9yvg7f.R.inc(587);CompilationUnit cu = parse(path.toFile());
                            __CLR4_4_1fwfwlh9yvg7f.R.inc(588);visit(cu, null);
                        } catch (FileNotFoundException e) {
                            __CLR4_4_1fwfwlh9yvg7f.R.inc(589);e.printStackTrace();
                        }
                    });
        }catch (IOException e){
            __CLR4_4_1fwfwlh9yvg7f.R.inc(590);e.printStackTrace();
        }
    }finally{__CLR4_4_1fwfwlh9yvg7f.R.flushNeeded();}}

//    @Override
//    public void visit(MethodDeclaration n, Object arg) {
//        super.visit(n, arg);
//
//        System.out.println(n);


    @Override
    public void visit(IfStmt n, Object arg) {try{__CLR4_4_1fwfwlh9yvg7f.R.inc(591);
        __CLR4_4_1fwfwlh9yvg7f.R.inc(592);super.visit(n, arg);

//        System.out.println(arg);
        // TODO
        // parse the code to get values add to pool
        __CLR4_4_1fwfwlh9yvg7f.R.inc(593);Expression condition = n.getCondition();
        __CLR4_4_1fwfwlh9yvg7f.R.inc(594);Set<Object> candidateValues = new HashSet<>();
        __CLR4_4_1fwfwlh9yvg7f.R.inc(595);Object[] objects = condition.stream().toArray();
        __CLR4_4_1fwfwlh9yvg7f.R.inc(596);for(Object o : objects){{
//            System.out.println(o);
//            System.out.println(o.getClass().toString());
            // Long type
            __CLR4_4_1fwfwlh9yvg7f.R.inc(597);if((((o instanceof BinaryExpr &&
                    (((BinaryExpr) o).getLeft().isLongLiteralExpr() ||
                            ((BinaryExpr) o).getRight().isLongLiteralExpr()))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(598)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(599)==0&false))){{
                __CLR4_4_1fwfwlh9yvg7f.R.inc(600);BinaryExpr expr = (BinaryExpr) o;
                __CLR4_4_1fwfwlh9yvg7f.R.inc(601);long boundValue = 0;
                __CLR4_4_1fwfwlh9yvg7f.R.inc(602);if((((expr.getLeft().isLongLiteralExpr())&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(603)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(604)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(605);boundValue = Long.parseLong(expr.getLeft().toString().trim());
                }}else{{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(606);boundValue = Long.parseLong(expr.getRight().toString().trim());
                }
                }__CLR4_4_1fwfwlh9yvg7f.R.inc(607);BinaryExpr.Operator operator = expr.getOperator();
                __CLR4_4_1fwfwlh9yvg7f.R.inc(608);if((((operator.equals(BinaryExpr.Operator.EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(609)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(610)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(611);candidateValues.add(boundValue);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(612);if((((operator.equals(BinaryExpr.Operator.LESS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(613)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(614)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(615);candidateValues.add(boundValue - 1L); // double precise
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(616);if((((operator.equals(BinaryExpr.Operator.LESS_EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(617)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(618)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(619);candidateValues.add(boundValue);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(620);candidateValues.add(boundValue - 1L);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(621);if((((operator.equals(BinaryExpr.Operator.GREATER))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(622)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(623)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(624);candidateValues.add(boundValue + 1L);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(625);if((((operator.equals(BinaryExpr.Operator.GREATER_EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(626)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(627)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(628);candidateValues.add(boundValue);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(629);candidateValues.add(boundValue + 1L);
                }
            }}}}}}
            // Integer Type
            }__CLR4_4_1fwfwlh9yvg7f.R.inc(630);if((((o instanceof BinaryExpr &&
                    (((BinaryExpr) o).getLeft().isIntegerLiteralExpr() ||
                            ((BinaryExpr) o).getRight().isIntegerLiteralExpr()))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(631)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(632)==0&false))){{
                __CLR4_4_1fwfwlh9yvg7f.R.inc(633);BinaryExpr expr = (BinaryExpr) o;
                __CLR4_4_1fwfwlh9yvg7f.R.inc(634);int boundValue = 0;
                __CLR4_4_1fwfwlh9yvg7f.R.inc(635);if((((expr.getLeft().isIntegerLiteralExpr())&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(636)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(637)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(638);String num = expr.getLeft().toString().trim();
                    // Hexadecimal
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(639);if((((num.startsWith("0x"))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(640)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(641)==0&false))){{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(642);num = num.substring(2);
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(643);boundValue = Integer.parseInt(num,16);
                    }}else{{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(644);boundValue = Integer.parseInt(num);
                    }
                }}}else{{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(645);String num = expr.getRight().toString().trim();
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(646);if((((num.startsWith("0x"))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(647)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(648)==0&false))){{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(649);num = num.substring(2);
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(650);boundValue = Integer.parseInt(num,16);
                    }}else{{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(651);boundValue = Integer.parseInt(num);
                    }
                }}
                }__CLR4_4_1fwfwlh9yvg7f.R.inc(652);BinaryExpr.Operator operator = expr.getOperator();
                __CLR4_4_1fwfwlh9yvg7f.R.inc(653);if((((operator.equals(BinaryExpr.Operator.EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(654)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(655)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(656);candidateValues.add(boundValue);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(657);if((((operator.equals(BinaryExpr.Operator.LESS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(658)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(659)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(660);candidateValues.add(boundValue - 1);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(661);if((((operator.equals(BinaryExpr.Operator.LESS_EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(662)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(663)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(664);candidateValues.add(boundValue);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(665);candidateValues.add(boundValue - 1);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(666);if((((operator.equals(BinaryExpr.Operator.GREATER))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(667)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(668)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(669);candidateValues.add(boundValue + 1);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(670);if((((operator.equals(BinaryExpr.Operator.GREATER_EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(671)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(672)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(673);candidateValues.add(boundValue);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(674);candidateValues.add(boundValue + 1);
                }
            }}}}}}
            // String Type
            }__CLR4_4_1fwfwlh9yvg7f.R.inc(675);if((((o instanceof StringLiteralExpr)&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(676)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(677)==0&false))){{
                __CLR4_4_1fwfwlh9yvg7f.R.inc(678);String s = ((StringLiteralExpr) o).asString().trim();
                __CLR4_4_1fwfwlh9yvg7f.R.inc(679);if ((((s.length() == 1)&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(680)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(681)==0&false))) {{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(682);char c = s.charAt(s.length() - 1);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(683);if ((((c == '\\')&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(684)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(685)==0&false))) {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(686);candidateValues.add("\\\\");
                    }
                    }else {__CLR4_4_1fwfwlh9yvg7f.R.inc(687);if ((((c == '\'')&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(688)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(689)==0&false))) {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(690);candidateValues.add("\\\'");
                    }
                    }else {__CLR4_4_1fwfwlh9yvg7f.R.inc(691);if ((((c == '\"')&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(692)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(693)==0&false))) {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(694);candidateValues.add("\\\"");
                    } }else {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(695);candidateValues.add(s);
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(696);candidateValues.add((char)(c + 1));
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(697);candidateValues.add((char)(c - 1));
                    }
                }}}}
                }else {__CLR4_4_1fwfwlh9yvg7f.R.inc(698);if((((s.length() != 0)&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(699)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(700)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(701);char c = s.charAt(s.length() - 1);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(702);candidateValues.add(s);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(703);if (((((char)(c + 1) == '\\')&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(704)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(705)==0&false))) {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(706);continue;
                    } }else {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(707);candidateValues.add(s.substring(0, s.length() - 1) + (char)(c + 1));
                    }
                    }__CLR4_4_1fwfwlh9yvg7f.R.inc(708);if (((((char)(c - 1) == '\\')&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(709)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(710)==0&false))) {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(711);continue;
                    } }else {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(712);candidateValues.add(s.substring(0, s.length() - 1) + (char)(c - 1));
                    }
                }}}else{{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(713);candidateValues.add("\\\"\\\"");
                }
            }}}
            // Char Type
            }__CLR4_4_1fwfwlh9yvg7f.R.inc(714);if((((o instanceof CharLiteralExpr)&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(715)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(716)==0&false))){{
                __CLR4_4_1fwfwlh9yvg7f.R.inc(717);char c = ((CharLiteralExpr) o).asChar();
                // continue when unmeaningful char

                __CLR4_4_1fwfwlh9yvg7f.R.inc(718);if ((((c != 92 && c != 39 && c != 34 && c != 32 && c != 9 && c != 10 && c != 13 && c != 12 && c != 8 && c != 0)&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(719)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(720)==0&false))) {{
//                    System.out.println(c);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(721);if (((((c < 90 && c > 65) || (c < 122 && c > 97))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(722)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(723)==0&false))) {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(724);candidateValues.add(c);
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(725);candidateValues.add((char)(c + 1));
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(726);candidateValues.add((char)(c - 1));
                    }
                    }else {{
                        __CLR4_4_1fwfwlh9yvg7f.R.inc(727);candidateValues.add(c);
                    }
                }}
            }}
            // Double type
            }__CLR4_4_1fwfwlh9yvg7f.R.inc(728);if((((o instanceof BinaryExpr &&
                    (((BinaryExpr) o).getLeft().isDoubleLiteralExpr() ||
                            ((BinaryExpr) o).getRight().isDoubleLiteralExpr()))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(729)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(730)==0&false))){{

                __CLR4_4_1fwfwlh9yvg7f.R.inc(731);BinaryExpr expr = (BinaryExpr) o;
                __CLR4_4_1fwfwlh9yvg7f.R.inc(732);double boundValue = 0;
                __CLR4_4_1fwfwlh9yvg7f.R.inc(733);if((((expr.getLeft().isDoubleLiteralExpr())&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(734)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(735)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(736);boundValue = Double.parseDouble(expr.getLeft().toString().trim());
                }}else{{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(737);boundValue = Double.parseDouble(expr.getRight().toString().trim());
                }
                }__CLR4_4_1fwfwlh9yvg7f.R.inc(738);BinaryExpr.Operator operator = expr.getOperator();
                __CLR4_4_1fwfwlh9yvg7f.R.inc(739);if((((operator.equals(BinaryExpr.Operator.EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(740)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(741)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(742);candidateValues.add(boundValue);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(743);if((((operator.equals(BinaryExpr.Operator.LESS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(744)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(745)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(746);candidateValues.add(boundValue - 10e-16); // double precise
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(747);if((((operator.equals(BinaryExpr.Operator.LESS_EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(748)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(749)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(750);candidateValues.add(boundValue);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(751);candidateValues.add(boundValue - 10e-16);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(752);if((((operator.equals(BinaryExpr.Operator.GREATER))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(753)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(754)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(755);candidateValues.add(boundValue + 10e-16);
                }}else {__CLR4_4_1fwfwlh9yvg7f.R.inc(756);if((((operator.equals(BinaryExpr.Operator.GREATER_EQUALS))&&(__CLR4_4_1fwfwlh9yvg7f.R.iget(757)!=0|true))||(__CLR4_4_1fwfwlh9yvg7f.R.iget(758)==0&false))){{
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(759);candidateValues.add(boundValue);
                    __CLR4_4_1fwfwlh9yvg7f.R.inc(760);candidateValues.add(boundValue + 10e-16);
                }
            }}}}}}
        }}

        }__CLR4_4_1fwfwlh9yvg7f.R.inc(761);for(Object o : candidateValues){{
            __CLR4_4_1fwfwlh9yvg7f.R.inc(762);valuePool.addValue(o);
        }
    }}finally{__CLR4_4_1fwfwlh9yvg7f.R.flushNeeded();}}

}