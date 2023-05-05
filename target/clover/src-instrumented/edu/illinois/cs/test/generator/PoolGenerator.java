/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static com.github.javaparser.StaticJavaParser.parse;

public class PoolGenerator extends VoidVisitorAdapter {public static class __CLR4_4_12323lh9yvg6r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,572,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Set<Integer> integersPool;
    Set<String> stringsPool;
    Set<Character> charactersPool;
    Set<Long> longsPool;
    Set<Boolean> booleansPool;
    public static Set<Object> objectsPool = PoolInit.valuePool.objectsPool;

    List<MethodDeclaration> methods;
    List<ConstructorDeclaration> constructors;
    List<ClassOrInterfaceDeclaration> classes;

    // to prevent the duplicate test methods name
    Set<String> testMethodsName;


    public static Object getObjectFromPool(String type) {try{__CLR4_4_12323lh9yvg6r.R.inc(75);
        __CLR4_4_12323lh9yvg6r.R.inc(76);boolean flag = false;
        __CLR4_4_12323lh9yvg6r.R.inc(77);if((((type.contains("Collection"))&&(__CLR4_4_12323lh9yvg6r.R.iget(78)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(79)==0&false))){{
            __CLR4_4_12323lh9yvg6r.R.inc(80);String[] s = type.split(" ");
            __CLR4_4_12323lh9yvg6r.R.inc(81);type = s[s.length-1].substring(0, s[s.length-1].length()-1);
            __CLR4_4_12323lh9yvg6r.R.inc(82);flag = true;
        }
        }__CLR4_4_12323lh9yvg6r.R.inc(83);Random random = new Random();
        // find a random object in the object pool
        __CLR4_4_12323lh9yvg6r.R.inc(84);Iterator<Object> it = objectsPool.iterator();
        __CLR4_4_12323lh9yvg6r.R.inc(85);List<Object> list = new ArrayList<>(objectsPool);

        // create a set of indexes of such type
        __CLR4_4_12323lh9yvg6r.R.inc(86);Set<Integer> indexes = new HashSet<>();

        __CLR4_4_12323lh9yvg6r.R.inc(87);List<Object> resultList = new ArrayList<>();
        // add indexes of objects of such type
        __CLR4_4_12323lh9yvg6r.R.inc(88);for (int i = 0; (((i < list.size())&&(__CLR4_4_12323lh9yvg6r.R.iget(89)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(90)==0&false)); i++) {{
            __CLR4_4_12323lh9yvg6r.R.inc(91);Object s = it.next();
            __CLR4_4_12323lh9yvg6r.R.inc(92);String[] ss = s.getClass().toString().split("\\.");
            __CLR4_4_12323lh9yvg6r.R.inc(93);String[] tt = type.split("\\.");
            __CLR4_4_12323lh9yvg6r.R.inc(94);if ((((ss[ss.length - 1].equals(tt[tt.length - 1]))&&(__CLR4_4_12323lh9yvg6r.R.iget(95)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(96)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(97);System.out.println(s.getClass().toString());
                __CLR4_4_12323lh9yvg6r.R.inc(98);System.out.println(type);
                __CLR4_4_12323lh9yvg6r.R.inc(99);System.out.println("=====================================");
                __CLR4_4_12323lh9yvg6r.R.inc(100);indexes.add(i);
                __CLR4_4_12323lh9yvg6r.R.inc(101);resultList.add(list.get(i));
            }
        }}

        // get a random index from the set
        }__CLR4_4_12323lh9yvg6r.R.inc(102);if ((((indexes.size() == 0)&&(__CLR4_4_12323lh9yvg6r.R.iget(103)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(104)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(105);return null;
        }

        }__CLR4_4_12323lh9yvg6r.R.inc(106);if((((flag)&&(__CLR4_4_12323lh9yvg6r.R.iget(107)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(108)==0&false))){{
            __CLR4_4_12323lh9yvg6r.R.inc(109);return resultList;
        }

        }__CLR4_4_12323lh9yvg6r.R.inc(110);int randomIndex = random.nextInt(indexes.size());
        __CLR4_4_12323lh9yvg6r.R.inc(111);int i = 0;
        __CLR4_4_12323lh9yvg6r.R.inc(112);for (Integer idx : indexes) {{
            __CLR4_4_12323lh9yvg6r.R.inc(113);if ((((i == randomIndex)&&(__CLR4_4_12323lh9yvg6r.R.iget(114)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(115)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(116);return list.get(idx);
            }
            }__CLR4_4_12323lh9yvg6r.R.inc(117);i++;
        }

        }__CLR4_4_12323lh9yvg6r.R.inc(118);return null;
    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public static void putObjectToPool(Object obj) {try{__CLR4_4_12323lh9yvg6r.R.inc(119);
        __CLR4_4_12323lh9yvg6r.R.inc(120);if ((((obj == null)&&(__CLR4_4_12323lh9yvg6r.R.iget(121)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(122)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(123);return;
        }
        }__CLR4_4_12323lh9yvg6r.R.inc(124);if ((((obj.getClass().toString().equals("class java.lang.String") || obj.getClass().toString().equals("class java.lang.Integer") || obj.getClass().toString().equals("class java.lang.Character") || obj.getClass().toString().equals("class java.lang.Long") || obj.getClass().toString().equals("class java.lang.Boolean"))&&(__CLR4_4_12323lh9yvg6r.R.iget(125)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(126)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(127);return;
        }
        }__CLR4_4_12323lh9yvg6r.R.inc(128);objectsPool.add(obj);
    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public PoolGenerator(String target) {try{__CLR4_4_12323lh9yvg6r.R.inc(129);
        __CLR4_4_12323lh9yvg6r.R.inc(130);integersPool = PoolInit.valuePool.integersPool;
        __CLR4_4_12323lh9yvg6r.R.inc(131);stringsPool = PoolInit.valuePool.stringsPool;
        __CLR4_4_12323lh9yvg6r.R.inc(132);charactersPool = PoolInit.valuePool.charactersPool;
        __CLR4_4_12323lh9yvg6r.R.inc(133);longsPool = PoolInit.valuePool.longsPool;
        __CLR4_4_12323lh9yvg6r.R.inc(134);booleansPool = PoolInit.valuePool.booleansPool;
//        objectsPool = PoolInit.valuePool.objectsPool;
        __CLR4_4_12323lh9yvg6r.R.inc(135);methods = new ArrayList<>();
        __CLR4_4_12323lh9yvg6r.R.inc(136);constructors = new ArrayList<>();
        __CLR4_4_12323lh9yvg6r.R.inc(137);classes = new ArrayList<>();
        __CLR4_4_12323lh9yvg6r.R.inc(138);testMethodsName = new HashSet<>();

//        argumentsList = new ArrayList<>();
        __CLR4_4_12323lh9yvg6r.R.inc(139);MethodTraverse(target);
        __CLR4_4_12323lh9yvg6r.R.inc(140);construct();

//        for(Object obj : objectsPool){
//            System.out.println(obj.getClass());
//        }

    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public void MethodTraverse(String target) {try{__CLR4_4_12323lh9yvg6r.R.inc(141);
        __CLR4_4_12323lh9yvg6r.R.inc(142);Path sourcePath = Paths.get(target);
        __CLR4_4_12323lh9yvg6r.R.inc(143);SourceRoot sourceRoot = new SourceRoot(sourcePath);

        __CLR4_4_12323lh9yvg6r.R.inc(144);try {
            __CLR4_4_12323lh9yvg6r.R.inc(145);Files.walk(sourcePath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        __CLR4_4_12323lh9yvg6r.R.inc(146);try {
                            __CLR4_4_12323lh9yvg6r.R.inc(147);CompilationUnit cu = parse(path.toFile());
                            __CLR4_4_12323lh9yvg6r.R.inc(148);visit(cu, null);
                        } catch (FileNotFoundException e) {
                            __CLR4_4_12323lh9yvg6r.R.inc(149);e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            __CLR4_4_12323lh9yvg6r.R.inc(150);e.printStackTrace();
        }
    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    @Override
    public void visit(MethodDeclaration n, Object arg) {try{__CLR4_4_12323lh9yvg6r.R.inc(151);

        __CLR4_4_12323lh9yvg6r.R.inc(152);if ((((n.isPublic())&&(__CLR4_4_12323lh9yvg6r.R.iget(153)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(154)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(155);methods.add(n);
        }

        }__CLR4_4_12323lh9yvg6r.R.inc(156);super.visit(n, arg);
    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    @Override
    public void visit(ClassOrInterfaceDeclaration n, Object arg) {try{__CLR4_4_12323lh9yvg6r.R.inc(157);
        __CLR4_4_12323lh9yvg6r.R.inc(158);super.visit(n, arg);
        __CLR4_4_12323lh9yvg6r.R.inc(159);if ((((!n.isInterface() && !n.isAbstract() && n.isPublic() && !n.isInnerClass() && !n.isStatic())&&(__CLR4_4_12323lh9yvg6r.R.iget(160)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(161)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(162);classes.add(n);
        }
    }}finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public Map constructMap(String type) {try{__CLR4_4_12323lh9yvg6r.R.inc(163);
        __CLR4_4_12323lh9yvg6r.R.inc(164);type = type.substring(type.indexOf("<") + 1, type.indexOf(">"));
        __CLR4_4_12323lh9yvg6r.R.inc(165);String[] types = type.split(",");
        __CLR4_4_12323lh9yvg6r.R.inc(166);Map map = new HashMap();
        __CLR4_4_12323lh9yvg6r.R.inc(167);Random random = new Random();
        __CLR4_4_12323lh9yvg6r.R.inc(168);int randomNumber = random.nextInt(10);
        __CLR4_4_12323lh9yvg6r.R.inc(169);while ((((randomNumber-- > 0)&&(__CLR4_4_12323lh9yvg6r.R.iget(170)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(171)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(172);map.put(getValueFromPool(types[0]), getValueFromPool(types[1]));
        }
        }__CLR4_4_12323lh9yvg6r.R.inc(173);return map;
    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public Object getValueFromPool(String type) {try{__CLR4_4_12323lh9yvg6r.R.inc(174);
        __CLR4_4_12323lh9yvg6r.R.inc(175);if ((((type.contains("Map"))&&(__CLR4_4_12323lh9yvg6r.R.iget(176)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(177)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(178);return constructMap(type);
        } }else {__CLR4_4_12323lh9yvg6r.R.inc(179);if ((((type.contains("[]") || type.contains("List") || type.contains("Set"))&&(__CLR4_4_12323lh9yvg6r.R.iget(180)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(181)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(182);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_12323lh9yvg6r.R.iget(183)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(184)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(185);Random random = new Random();
                __CLR4_4_12323lh9yvg6r.R.inc(186);int randomNumber = random.nextInt(integersPool.size());

                __CLR4_4_12323lh9yvg6r.R.inc(187);if ((((type.contains("List"))&&(__CLR4_4_12323lh9yvg6r.R.iget(188)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(189)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(190);List<Integer> intList = new ArrayList<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(191);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(192);Iterator<Integer> it = integersPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(193);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(194)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(195)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(196);intList.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(197);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(198);return intList;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(199);if ((((type.contains("Set"))&&(__CLR4_4_12323lh9yvg6r.R.iget(200)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(201)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(202);Set<Integer> intSet = new HashSet<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(203);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(204);Iterator<Integer> it = integersPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(205);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(206)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(207)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(208);intSet.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(209);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(210);return intSet;
                }
                }}__CLR4_4_12323lh9yvg6r.R.inc(211);int[] intArray = new int[randomNumber];
                __CLR4_4_12323lh9yvg6r.R.inc(212);int j = 0;
                __CLR4_4_12323lh9yvg6r.R.inc(213);Iterator<Integer> it = integersPool.iterator();
                __CLR4_4_12323lh9yvg6r.R.inc(214);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(215)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(216)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(217);intArray[j] = it.next();
                    __CLR4_4_12323lh9yvg6r.R.inc(218);j++;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(219);return intArray;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(220);if ((((type.contains("String"))&&(__CLR4_4_12323lh9yvg6r.R.iget(221)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(222)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(223);Random random = new Random();
                __CLR4_4_12323lh9yvg6r.R.inc(224);int randomNumber = random.nextInt(stringsPool.size());

                __CLR4_4_12323lh9yvg6r.R.inc(225);if ((((type.contains("List"))&&(__CLR4_4_12323lh9yvg6r.R.iget(226)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(227)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(228);List<String> stringList = new ArrayList<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(229);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(230);Iterator<String> it = stringsPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(231);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(232)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(233)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(234);stringList.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(235);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(236);return stringList;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(237);if ((((type.contains("Set"))&&(__CLR4_4_12323lh9yvg6r.R.iget(238)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(239)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(240);Set<String> stringSet = new HashSet<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(241);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(242);Iterator<String> it = stringsPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(243);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(244)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(245)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(246);stringSet.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(247);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(248);return stringSet;
                }

                }}__CLR4_4_12323lh9yvg6r.R.inc(249);if ((((type.contains("StringBuilder"))&&(__CLR4_4_12323lh9yvg6r.R.iget(250)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(251)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(252);StringBuilder[] stringArray = new StringBuilder[randomNumber];
                    __CLR4_4_12323lh9yvg6r.R.inc(253);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(254);Iterator<String> it = stringsPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(255);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(256)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(257)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(258);stringArray[j] = new StringBuilder(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(259);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(260);return stringArray;
                }

                }__CLR4_4_12323lh9yvg6r.R.inc(261);String[] stringArray = new String[randomNumber];
                __CLR4_4_12323lh9yvg6r.R.inc(262);int j = 0;
                __CLR4_4_12323lh9yvg6r.R.inc(263);Iterator<String> it = stringsPool.iterator();
                __CLR4_4_12323lh9yvg6r.R.inc(264);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(265)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(266)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(267);stringArray[j] = it.next();
                    __CLR4_4_12323lh9yvg6r.R.inc(268);j++;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(269);return stringArray;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(270);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_12323lh9yvg6r.R.iget(271)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(272)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(273);Random random = new Random();
                __CLR4_4_12323lh9yvg6r.R.inc(274);int randomNumber = random.nextInt(charactersPool.size());

                __CLR4_4_12323lh9yvg6r.R.inc(275);if ((((type.contains("List"))&&(__CLR4_4_12323lh9yvg6r.R.iget(276)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(277)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(278);List<Character> charList = new ArrayList<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(279);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(280);Iterator<Character> it = charactersPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(281);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(282)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(283)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(284);charList.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(285);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(286);return charList;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(287);if ((((type.contains("Set"))&&(__CLR4_4_12323lh9yvg6r.R.iget(288)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(289)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(290);Set<Character> charSet = new HashSet<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(291);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(292);Iterator<Character> it = charactersPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(293);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(294)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(295)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(296);charSet.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(297);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(298);return charSet;
                }

                }}__CLR4_4_12323lh9yvg6r.R.inc(299);Character[] charArray = new Character[randomNumber];
                __CLR4_4_12323lh9yvg6r.R.inc(300);int j = 0;
                __CLR4_4_12323lh9yvg6r.R.inc(301);Iterator<Character> it = charactersPool.iterator();
                __CLR4_4_12323lh9yvg6r.R.inc(302);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(303)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(304)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(305);charArray[j] = it.next();
                    __CLR4_4_12323lh9yvg6r.R.inc(306);j++;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(307);return charArray;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(308);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_12323lh9yvg6r.R.iget(309)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(310)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(311);Random random = new Random();
                __CLR4_4_12323lh9yvg6r.R.inc(312);int randomNumber = random.nextInt(longsPool.size());

                __CLR4_4_12323lh9yvg6r.R.inc(313);if ((((type.contains("List"))&&(__CLR4_4_12323lh9yvg6r.R.iget(314)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(315)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(316);List<Long> longList = new ArrayList<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(317);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(318);Iterator<Long> it = longsPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(319);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(320)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(321)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(322);longList.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(323);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(324);return longList;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(325);if ((((type.contains("Set"))&&(__CLR4_4_12323lh9yvg6r.R.iget(326)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(327)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(328);Set<Long> longSet = new HashSet<>();
                    __CLR4_4_12323lh9yvg6r.R.inc(329);int j = 0;
                    __CLR4_4_12323lh9yvg6r.R.inc(330);Iterator<Long> it = longsPool.iterator();
                    __CLR4_4_12323lh9yvg6r.R.inc(331);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(332)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(333)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(334);longSet.add(it.next());
                        __CLR4_4_12323lh9yvg6r.R.inc(335);j++;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(336);return longSet;
                }

                }}__CLR4_4_12323lh9yvg6r.R.inc(337);long[] longArray = new long[randomNumber];
                __CLR4_4_12323lh9yvg6r.R.inc(338);int j = 0;
                __CLR4_4_12323lh9yvg6r.R.inc(339);Iterator<Long> it = longsPool.iterator();
                __CLR4_4_12323lh9yvg6r.R.inc(340);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(341)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(342)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(343);longArray[j] = it.next();
                    __CLR4_4_12323lh9yvg6r.R.inc(344);j++;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(345);return longArray;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(346);if ((((type.contains("boolean"))&&(__CLR4_4_12323lh9yvg6r.R.iget(347)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(348)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(349);boolean[] boolArray = new boolean[2];
                __CLR4_4_12323lh9yvg6r.R.inc(350);boolArray[0] = true;
                __CLR4_4_12323lh9yvg6r.R.inc(351);return boolArray;
            }
        }}}}}} }else {__CLR4_4_12323lh9yvg6r.R.inc(352);if ((((type.contains("String"))&&(__CLR4_4_12323lh9yvg6r.R.iget(353)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(354)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(355);Random random = new Random();
            __CLR4_4_12323lh9yvg6r.R.inc(356);int index = random.nextInt(stringsPool.size());

            __CLR4_4_12323lh9yvg6r.R.inc(357);if ((((type.contains("StringBuilder"))&&(__CLR4_4_12323lh9yvg6r.R.iget(358)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(359)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(360);Iterator<String> it = stringsPool.iterator();
                __CLR4_4_12323lh9yvg6r.R.inc(361);int i = 0;
                __CLR4_4_12323lh9yvg6r.R.inc(362);while ((((it.hasNext())&&(__CLR4_4_12323lh9yvg6r.R.iget(363)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(364)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(365);String s = it.next();
                    __CLR4_4_12323lh9yvg6r.R.inc(366);if ((((i == index)&&(__CLR4_4_12323lh9yvg6r.R.iget(367)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(368)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(369);StringBuilder sb = new StringBuilder(s);
                        __CLR4_4_12323lh9yvg6r.R.inc(370);return sb;
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(371);i++;
                }
            }}

            // find a random string in the string pool
            }__CLR4_4_12323lh9yvg6r.R.inc(372);Iterator<String> it = stringsPool.iterator();
            __CLR4_4_12323lh9yvg6r.R.inc(373);int i = 0;
            __CLR4_4_12323lh9yvg6r.R.inc(374);while ((((it.hasNext())&&(__CLR4_4_12323lh9yvg6r.R.iget(375)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(376)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(377);String s = it.next();
                __CLR4_4_12323lh9yvg6r.R.inc(378);if ((((i == index)&&(__CLR4_4_12323lh9yvg6r.R.iget(379)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(380)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(381);return s;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(382);i++;
            }
        }} }else {__CLR4_4_12323lh9yvg6r.R.inc(383);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_12323lh9yvg6r.R.iget(384)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(385)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(386);Random random = new Random();
            __CLR4_4_12323lh9yvg6r.R.inc(387);int index = random.nextInt(integersPool.size());

            // find a random int in the int pool
            __CLR4_4_12323lh9yvg6r.R.inc(388);Iterator<Integer> it = integersPool.iterator();
            __CLR4_4_12323lh9yvg6r.R.inc(389);int i = 0;
            __CLR4_4_12323lh9yvg6r.R.inc(390);while ((((it.hasNext())&&(__CLR4_4_12323lh9yvg6r.R.iget(391)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(392)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(393);Integer s = it.next();
                __CLR4_4_12323lh9yvg6r.R.inc(394);if ((((i == index)&&(__CLR4_4_12323lh9yvg6r.R.iget(395)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(396)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(397);return s;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(398);i++;
            }
        }} }else {__CLR4_4_12323lh9yvg6r.R.inc(399);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_12323lh9yvg6r.R.iget(400)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(401)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(402);Random random = new Random();
            __CLR4_4_12323lh9yvg6r.R.inc(403);int index = random.nextInt(charactersPool.size());

            // find a random char in the char pool
            __CLR4_4_12323lh9yvg6r.R.inc(404);Iterator<Character> it = charactersPool.iterator();
            __CLR4_4_12323lh9yvg6r.R.inc(405);int i = 0;
            __CLR4_4_12323lh9yvg6r.R.inc(406);while ((((it.hasNext())&&(__CLR4_4_12323lh9yvg6r.R.iget(407)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(408)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(409);Character s = it.next();
                __CLR4_4_12323lh9yvg6r.R.inc(410);if ((((i == index)&&(__CLR4_4_12323lh9yvg6r.R.iget(411)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(412)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(413);return s;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(414);i++;
            }
        }} }else {__CLR4_4_12323lh9yvg6r.R.inc(415);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_12323lh9yvg6r.R.iget(416)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(417)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(418);Random random = new Random();
            __CLR4_4_12323lh9yvg6r.R.inc(419);int index = random.nextInt(longsPool.size());

            // find a random long in the long pool
            __CLR4_4_12323lh9yvg6r.R.inc(420);Iterator<Long> it = longsPool.iterator();
            __CLR4_4_12323lh9yvg6r.R.inc(421);int i = 0;
            __CLR4_4_12323lh9yvg6r.R.inc(422);while ((((it.hasNext())&&(__CLR4_4_12323lh9yvg6r.R.iget(423)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(424)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(425);Long s = it.next();
                __CLR4_4_12323lh9yvg6r.R.inc(426);if ((((i == index)&&(__CLR4_4_12323lh9yvg6r.R.iget(427)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(428)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(429);return s;
                }
                }__CLR4_4_12323lh9yvg6r.R.inc(430);i++;
            }
        }} }else {__CLR4_4_12323lh9yvg6r.R.inc(431);if ((((type.contains("boolean"))&&(__CLR4_4_12323lh9yvg6r.R.iget(432)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(433)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(434);Random random = new Random();
            __CLR4_4_12323lh9yvg6r.R.inc(435);int index = random.nextInt(1);

            __CLR4_4_12323lh9yvg6r.R.inc(436);return index == 0;
        }
        }}}}}}}__CLR4_4_12323lh9yvg6r.R.inc(437);return null;
    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    // Recursive method to search for the class
    private void searchForClass(File directory, String className, List<Class<?>> clazzes) throws ClassNotFoundException {try{__CLR4_4_12323lh9yvg6r.R.inc(438);
        __CLR4_4_12323lh9yvg6r.R.inc(439);File[] files = directory.listFiles();
        __CLR4_4_12323lh9yvg6r.R.inc(440);if ((((files != null)&&(__CLR4_4_12323lh9yvg6r.R.iget(441)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(442)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(443);for (File file : files) {{
                __CLR4_4_12323lh9yvg6r.R.inc(444);if ((((file.isDirectory())&&(__CLR4_4_12323lh9yvg6r.R.iget(445)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(446)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(447);searchForClass(file, className, clazzes);
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(448);if ((((file.getName().endsWith(".class"))&&(__CLR4_4_12323lh9yvg6r.R.iget(449)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(450)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(451);String fileName = file.getName().substring(0, file.getName().length() - 6);
                    __CLR4_4_12323lh9yvg6r.R.inc(452);String fullClassName = directory.getPath().substring(directory.getPath().lastIndexOf("org")).replace('/', '.') + "." + fileName;
                    __CLR4_4_12323lh9yvg6r.R.inc(453);if ((((fullClassName.endsWith(className))&&(__CLR4_4_12323lh9yvg6r.R.iget(454)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(455)==0&false))) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(456);Class<?> clazz = Class.forName(fullClassName);
                        __CLR4_4_12323lh9yvg6r.R.inc(457);clazzes.add(clazz);
                    }
                }}
            }}}
        }}
    }}finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public Object[] getConstructorParam(List<String> parametersTypeList) {try{__CLR4_4_12323lh9yvg6r.R.inc(458);
        __CLR4_4_12323lh9yvg6r.R.inc(459);Object[] arguments = new Object[parametersTypeList.size()];
        __CLR4_4_12323lh9yvg6r.R.inc(460);for (int i = 0; (((i < parametersTypeList.size())&&(__CLR4_4_12323lh9yvg6r.R.iget(461)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(462)==0&false)); i++) {{
            __CLR4_4_12323lh9yvg6r.R.inc(463);String type = parametersTypeList.get(i);
            __CLR4_4_12323lh9yvg6r.R.inc(464);if ((((type.contains("[]"))&&(__CLR4_4_12323lh9yvg6r.R.iget(465)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(466)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(467);if ((((type.contains("String"))&&(__CLR4_4_12323lh9yvg6r.R.iget(468)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(469)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(470);String[] strs = (String[]) getValueFromPool(type);
                    __CLR4_4_12323lh9yvg6r.R.inc(471);arguments[i] = strs;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(472);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_12323lh9yvg6r.R.iget(473)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(474)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(475);int[] ints = (int[]) getValueFromPool(type);
                    __CLR4_4_12323lh9yvg6r.R.inc(476);arguments[i] = ints;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(477);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_12323lh9yvg6r.R.iget(478)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(479)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(480);long[] longs = (long[]) getValueFromPool(type);
                    __CLR4_4_12323lh9yvg6r.R.inc(481);arguments[i] = longs;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(482);if ((((type.contains("boolean"))&&(__CLR4_4_12323lh9yvg6r.R.iget(483)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(484)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(485);boolean[] bools = (boolean[]) getValueFromPool(type);
                    __CLR4_4_12323lh9yvg6r.R.inc(486);arguments[i] = bools;
                } }else {__CLR4_4_12323lh9yvg6r.R.inc(487);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_12323lh9yvg6r.R.iget(488)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(489)==0&false))) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(490);Character[] chars = (Character[]) getValueFromPool(type);
                    __CLR4_4_12323lh9yvg6r.R.inc(491);arguments[i] = chars;
                } }else {{
                    __CLR4_4_12323lh9yvg6r.R.inc(492);Random random = new Random();
                    __CLR4_4_12323lh9yvg6r.R.inc(493);int randomNumber = random.nextInt(objectsPool.size());
                    __CLR4_4_12323lh9yvg6r.R.inc(494);Object[] objectArray = new Object[randomNumber];
                    __CLR4_4_12323lh9yvg6r.R.inc(495);for (int j = 0; (((j < randomNumber)&&(__CLR4_4_12323lh9yvg6r.R.iget(496)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(497)==0&false)); j++) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(498);objectArray[j] = getObjectFromPool(type);
                    }
                    }__CLR4_4_12323lh9yvg6r.R.inc(499);arguments[i] = objectArray;
                }
            }}}}}} }else {__CLR4_4_12323lh9yvg6r.R.inc(500);if ((((type.contains("String"))&&(__CLR4_4_12323lh9yvg6r.R.iget(501)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(502)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(503);String s = (String) getValueFromPool(type);
                __CLR4_4_12323lh9yvg6r.R.inc(504);arguments[i] = s;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(505);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_12323lh9yvg6r.R.iget(506)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(507)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(508);int in = (int) getValueFromPool(type);
                __CLR4_4_12323lh9yvg6r.R.inc(509);arguments[i] = in;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(510);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_12323lh9yvg6r.R.iget(511)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(512)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(513);long l = (long) getValueFromPool(type);
                __CLR4_4_12323lh9yvg6r.R.inc(514);arguments[i] = l;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(515);if ((((type.contains("boolean"))&&(__CLR4_4_12323lh9yvg6r.R.iget(516)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(517)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(518);boolean b = (boolean) getValueFromPool(type);
                __CLR4_4_12323lh9yvg6r.R.inc(519);arguments[i] = b;
            } }else {__CLR4_4_12323lh9yvg6r.R.inc(520);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_12323lh9yvg6r.R.iget(521)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(522)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(523);char ch = (char) getValueFromPool(type);
                __CLR4_4_12323lh9yvg6r.R.inc(524);arguments[i] = ch;
            } }else {{
                __CLR4_4_12323lh9yvg6r.R.inc(525);Object o = getObjectFromPool(type);
                __CLR4_4_12323lh9yvg6r.R.inc(526);arguments[i] = o;
            }
        }}}}}}}
        }__CLR4_4_12323lh9yvg6r.R.inc(527);return arguments;
    }finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public void getInstance(String className, boolean flag){try{__CLR4_4_12323lh9yvg6r.R.inc(528);
        __CLR4_4_12323lh9yvg6r.R.inc(529);List<Class<?>> clazzes = new ArrayList<>();

        __CLR4_4_12323lh9yvg6r.R.inc(530);try {
            __CLR4_4_12323lh9yvg6r.R.inc(531);ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            __CLR4_4_12323lh9yvg6r.R.inc(532);Enumeration<URL> resources = classLoader.getResources("org/jsoup");
            __CLR4_4_12323lh9yvg6r.R.inc(533);while ((((resources.hasMoreElements())&&(__CLR4_4_12323lh9yvg6r.R.iget(534)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(535)==0&false))) {{
                __CLR4_4_12323lh9yvg6r.R.inc(536);URL resource = resources.nextElement();
                __CLR4_4_12323lh9yvg6r.R.inc(537);File directory = new File(resource.getFile());
                __CLR4_4_12323lh9yvg6r.R.inc(538);searchForClass(directory, className, clazzes);
            }
        }} catch (Exception e) {
            __CLR4_4_12323lh9yvg6r.R.inc(539);e.printStackTrace();
        }

        __CLR4_4_12323lh9yvg6r.R.inc(540);if ((((clazzes.size() != 0)&&(__CLR4_4_12323lh9yvg6r.R.iget(541)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(542)==0&false))) {{
            __CLR4_4_12323lh9yvg6r.R.inc(543);try {
                // generate the constructor without arguments
                __CLR4_4_12323lh9yvg6r.R.inc(544);if((((flag)&&(__CLR4_4_12323lh9yvg6r.R.iget(545)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(546)==0&false))){{
                    __CLR4_4_12323lh9yvg6r.R.inc(547);for (Class<?> cl : clazzes) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(548);Constructor<?>[] constructors = cl.getConstructors();
                        __CLR4_4_12323lh9yvg6r.R.inc(549);for (Constructor<?> constructor : constructors) {{
                            __CLR4_4_12323lh9yvg6r.R.inc(550);if ((((constructor.getParameterCount() == 0)&&(__CLR4_4_12323lh9yvg6r.R.iget(551)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(552)==0&false))) {{
                                __CLR4_4_12323lh9yvg6r.R.inc(553);Object obj = constructor.newInstance();
                                __CLR4_4_12323lh9yvg6r.R.inc(554);objectsPool.add(obj);
                            }
                        }}
                    }}
                }}

                // generate the constructor with arguments
                }__CLR4_4_12323lh9yvg6r.R.inc(555);for (Class<?> cl : clazzes) {{
                    __CLR4_4_12323lh9yvg6r.R.inc(556);Constructor<?>[] constructors = cl.getConstructors();
                    __CLR4_4_12323lh9yvg6r.R.inc(557);for (Constructor<?> constructor : constructors) {{
                        __CLR4_4_12323lh9yvg6r.R.inc(558);if ((((constructor.getParameterCount() != 0)&&(__CLR4_4_12323lh9yvg6r.R.iget(559)!=0|true))||(__CLR4_4_12323lh9yvg6r.R.iget(560)==0&false))) {{
                            __CLR4_4_12323lh9yvg6r.R.inc(561);Class<?>[] parameterTypes = constructor.getParameterTypes();
                            __CLR4_4_12323lh9yvg6r.R.inc(562);List<String> parametersTypeList = new ArrayList<>();
                            __CLR4_4_12323lh9yvg6r.R.inc(563);for (Class<?> parameterType : parameterTypes) {{
                                __CLR4_4_12323lh9yvg6r.R.inc(564);parametersTypeList.add(parameterType.toString());
                            }
                            }__CLR4_4_12323lh9yvg6r.R.inc(565);Object[] arguments = getConstructorParam(parametersTypeList);
                            __CLR4_4_12323lh9yvg6r.R.inc(566);Object obj = constructor.newInstance(arguments);
                            __CLR4_4_12323lh9yvg6r.R.inc(567);objectsPool.add(obj);
                        }
                    }}
                }}

            }} catch (Exception e) {
//                    e.printStackTrace();
            }
        }
    }}finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}

    public void construct() {try{__CLR4_4_12323lh9yvg6r.R.inc(568);
        __CLR4_4_12323lh9yvg6r.R.inc(569);for (ClassOrInterfaceDeclaration c : classes) {{
            __CLR4_4_12323lh9yvg6r.R.inc(570);String className = c.getNameAsString();

            __CLR4_4_12323lh9yvg6r.R.inc(571);getInstance(className, true);
        }
    }}finally{__CLR4_4_12323lh9yvg6r.R.flushNeeded();}}
}
