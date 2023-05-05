/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package edu.illinois.cs.test.generator;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.type.ReferenceType;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.SourceRoot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static com.github.javaparser.StaticJavaParser.parse;

public class TestGenerator extends VoidVisitorAdapter{static class __CLR4_4_1l7l7lh9yvg8r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,1595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Set<Integer> integersPool;
    Set<String> stringsPool;
    Set<Character> charactersPool;
    Set<Long> longsPool;
    Set<Boolean> booleansPool;
    public static Set<Object> objectsPool = PoolInit.valuePool.objectsPool;

    List<MethodDeclaration> methods;
    List<ConstructorDeclaration> constructors;
    List<ClassOrInterfaceDeclaration> classes;
//    List<List<Object>> argumentsList;

    StringBuilder sb;

    // to prevent the duplicate test methods name
    Set<String> testMethodsName;

    public Set<Object> getObjectPoolSize(){try{__CLR4_4_1l7l7lh9yvg8r.R.inc(763);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(764);return objectsPool;
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public Object getObjectFromPool(String type){try{__CLR4_4_1l7l7lh9yvg8r.R.inc(765);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(766);Random random = new Random();
        // find a random object in the object pool
        __CLR4_4_1l7l7lh9yvg8r.R.inc(767);Iterator<Object> it = objectsPool.iterator();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(768);List<Object> list = new ArrayList<>(objectsPool);

        // create a set of indexes of such type
        __CLR4_4_1l7l7lh9yvg8r.R.inc(769);Set<Integer> indexes = new HashSet<>();

        // add indexes of objects of such type
        __CLR4_4_1l7l7lh9yvg8r.R.inc(770);for (int i = 0; (((i < list.size())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(771)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(772)==0&false)); i++) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(773);Object s = it.next();
//            System.out.println(s.getClass().toString());
//            System.out.println(type);
//            System.out.println("=====================================");
            __CLR4_4_1l7l7lh9yvg8r.R.inc(774);if ((((s.getClass().toString().contains(type))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(775)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(776)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(777);indexes.add(i);
            }
        }}

        // get a random index from the set
        }__CLR4_4_1l7l7lh9yvg8r.R.inc(778);if ((((indexes.size() == 0)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(779)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(780)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(781);return null;
        }
        }__CLR4_4_1l7l7lh9yvg8r.R.inc(782);int randomIndex = random.nextInt(indexes.size());
        __CLR4_4_1l7l7lh9yvg8r.R.inc(783);int i = 0;
        __CLR4_4_1l7l7lh9yvg8r.R.inc(784);for (Integer idx : indexes) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(785);if ((((i == randomIndex)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(786)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(787)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(788);return list.get(idx);
            }
            }__CLR4_4_1l7l7lh9yvg8r.R.inc(789);i++;
        }

        }__CLR4_4_1l7l7lh9yvg8r.R.inc(790);return null;
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public void putObjectToPool(Object obj){try{__CLR4_4_1l7l7lh9yvg8r.R.inc(791);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(792);if ((((obj.getClass().toString().equals("class java.lang.String") || obj.getClass().toString().equals("class java.lang.Integer") || obj.getClass().toString().equals("class java.lang.Character") || obj.getClass().toString().equals("class java.lang.Long") || obj.getClass().toString().equals("class java.lang.Boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(793)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(794)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(795);return;
        }
        }__CLR4_4_1l7l7lh9yvg8r.R.inc(796);objectsPool.add(obj);
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public TestGenerator(String target) {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(797);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(798);integersPool = PoolInit.valuePool.integersPool;
        __CLR4_4_1l7l7lh9yvg8r.R.inc(799);stringsPool = PoolInit.valuePool.stringsPool;
        __CLR4_4_1l7l7lh9yvg8r.R.inc(800);charactersPool = PoolInit.valuePool.charactersPool;
        __CLR4_4_1l7l7lh9yvg8r.R.inc(801);longsPool = PoolInit.valuePool.longsPool;
        __CLR4_4_1l7l7lh9yvg8r.R.inc(802);booleansPool = PoolInit.valuePool.booleansPool;
//        objectsPool = PoolInit.valuePool.objectsPool;
        __CLR4_4_1l7l7lh9yvg8r.R.inc(803);methods = new ArrayList<>();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(804);constructors = new ArrayList<>();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(805);classes = new ArrayList<>();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(806);testMethodsName = new HashSet<>();

//        argumentsList = new ArrayList<>();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(807);MethodTraverse(target);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(808);sb = new StringBuilder();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(809);sb.append("package " + "org.jsoup.mytests" + ";\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(810);sb.append("import edu.illinois.cs.test.generator.TestGenerator;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(811);sb.append("import edu.illinois.cs.test.generator.PoolGenerator;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(812);sb.append("import edu.illinois.cs.test.generator.PoolInit;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(813);sb.append("import org.junit.Test;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(814);sb.append("import static org.junit.Assert.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(815);sb.append("import org.jsoup.nodes.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(816);sb.append("import org.jsoup.select.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(817);sb.append("import org.jsoup.examples.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(818);sb.append("import org.jsoup.parser.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(819);sb.append("import org.jsoup.helper.*;\n");
//        sb.append("import org.jsoup.helper.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(820);sb.append("import org.jsoup.internal.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(821);sb.append("import org.jsoup.safety.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(822);sb.append("import org.jsoup.branch.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(823);sb.append("import org.jsoup.*;\n");

        __CLR4_4_1l7l7lh9yvg8r.R.inc(824);sb.append("import java.io.InputStream;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(825);sb.append("import java.nio.charset.Charset;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(826);sb.append("import java.util.regex.Pattern;\n");

        __CLR4_4_1l7l7lh9yvg8r.R.inc(827);sb.append("import java.io.File;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(828);sb.append("import java.io.IOException;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(829);sb.append("import java.io.InputStream;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(830);sb.append("import java.io.Reader;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(831);sb.append("import java.net.URL;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(832);sb.append("import java.nio.ByteBuffer;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(833);sb.append("import java.util.*;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(834);sb.append("import org.jsoup.nodes.Document.OutputSettings;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(835);sb.append("import org.jsoup.nodes.Document.QuirksMode;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(836);sb.append("import org.jsoup.Connection.Method;\n");
//        sb.append("import org.jsoup.parser.helper.Validate;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(837);sb.append("import javax.net.ssl.SSLSocketFactory;\n\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(838);sb.append("import java.net.Proxy;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(839);sb.append("import org.jsoup.select.NodeFilter.FilterResult;\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(840);sb.append("\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(841);sb.append("public class " + "AutomatedTest" + " {\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(842);sb.append("    PoolInit pool = new PoolInit(\"src/main/java/org/jsoup/\");\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(843);sb.append("    PoolGenerator pg = new PoolGenerator(\"src/main/java/org/jsoup/\");\n");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(844);sb.append("\n");
//        System.out.println(objectsPool);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(845);construct();

        __CLR4_4_1l7l7lh9yvg8r.R.inc(846);generateTest();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(847);generateTestFile();

        __CLR4_4_1l7l7lh9yvg8r.R.inc(848);for(Object obj : objectsPool){{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(849);System.out.println(obj.getClass());
        }
//        try{
//            Thread.sleep(10000000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        System.out.println(objectsPool);
    }}finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public void MethodTraverse(String target) {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(850);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(851);Path sourcePath = Paths.get(target);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(852);SourceRoot sourceRoot = new SourceRoot(sourcePath);

        __CLR4_4_1l7l7lh9yvg8r.R.inc(853);try {
            __CLR4_4_1l7l7lh9yvg8r.R.inc(854);Files.walk(sourcePath)
                    .filter(path -> path.toString().endsWith(".java"))
                    .forEach(path -> {
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(855);try {
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(856);CompilationUnit cu = parse(path.toFile());
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(857);visit(cu, null);
                        } catch (FileNotFoundException e) {
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(858);e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            __CLR4_4_1l7l7lh9yvg8r.R.inc(859);e.printStackTrace();
        }
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    @Override
    public void visit(MethodDeclaration n, Object arg) {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(860);

        __CLR4_4_1l7l7lh9yvg8r.R.inc(861);if((((n.isPublic())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(862)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(863)==0&false))){{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(864);methods.add(n);
        }

        }__CLR4_4_1l7l7lh9yvg8r.R.inc(865);super.visit(n, arg);
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    @Override
    public void visit(ClassOrInterfaceDeclaration n, Object arg) {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(866);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(867);super.visit(n, arg);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(868);if((((!n.isInterface() && !n.isAbstract() && n.isPublic() && !n.isInnerClass() && !n.isStatic())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(869)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(870)==0&false))){{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(871);classes.add(n);
        }
    }}finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public Map constructMap(String type){try{__CLR4_4_1l7l7lh9yvg8r.R.inc(872);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(873);type = type.substring(type.indexOf("<") + 1, type.indexOf(">"));
        __CLR4_4_1l7l7lh9yvg8r.R.inc(874);String[] types = type.split(",");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(875);Map map = new HashMap();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(876);Random random = new Random();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(877);int randomNumber = random.nextInt(10);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(878);while((((randomNumber -- > 0)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(879)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(880)==0&false))){{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(881);map.put(getValueFromPool(types[0]), getValueFromPool(types[1]));
        }
        }__CLR4_4_1l7l7lh9yvg8r.R.inc(882);return map;
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public Object getValueFromPool(String type) {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(883);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(884);if((((type.contains("Map"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(885)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(886)==0&false))){{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(887);return constructMap(type);
        }}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(888);if ((((type.contains("[]") || type.contains("List") || type.contains("Set"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(889)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(890)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(891);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(892)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(893)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(894);Random random = new Random();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(895);int randomNumber = random.nextInt(integersPool.size());

                __CLR4_4_1l7l7lh9yvg8r.R.inc(896);if((((type.contains("List"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(897)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(898)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(899);List<Integer> intList = new ArrayList<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(900);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(901);Iterator<Integer> it = integersPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(902);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(903)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(904)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(905);intList.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(906);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(907);return intList;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(908);if((((type.contains("Set"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(909)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(910)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(911);Set<Integer> intSet = new HashSet<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(912);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(913);Iterator<Integer> it = integersPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(914);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(915)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(916)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(917);intSet.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(918);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(919);return intSet;
                }
                }}__CLR4_4_1l7l7lh9yvg8r.R.inc(920);int[] intArray = new int[randomNumber];
                __CLR4_4_1l7l7lh9yvg8r.R.inc(921);int j = 0;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(922);Iterator<Integer> it = integersPool.iterator();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(923);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(924)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(925)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(926);intArray[j] = it.next();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(927);j++;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(928);return intArray;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(929);if ((((type.contains("String"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(930)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(931)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(932);Random random = new Random();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(933);int randomNumber = random.nextInt(stringsPool.size());

                __CLR4_4_1l7l7lh9yvg8r.R.inc(934);if((((type.contains("List"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(935)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(936)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(937);List<String> stringList = new ArrayList<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(938);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(939);Iterator<String> it = stringsPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(940);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(941)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(942)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(943);stringList.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(944);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(945);return stringList;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(946);if((((type.contains("Set"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(947)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(948)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(949);Set<String> stringSet = new HashSet<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(950);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(951);Iterator<String> it = stringsPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(952);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(953)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(954)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(955);stringSet.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(956);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(957);return stringSet;
                }

                }}__CLR4_4_1l7l7lh9yvg8r.R.inc(958);if((((type.contains("StringBuilder"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(959)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(960)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(961);StringBuilder[] stringArray = new StringBuilder[randomNumber];
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(962);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(963);Iterator<String> it = stringsPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(964);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(965)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(966)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(967);stringArray[j] = new StringBuilder(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(968);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(969);return stringArray;
                }

                }__CLR4_4_1l7l7lh9yvg8r.R.inc(970);String[] stringArray = new String[randomNumber];
                __CLR4_4_1l7l7lh9yvg8r.R.inc(971);int j = 0;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(972);Iterator<String> it = stringsPool.iterator();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(973);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(974)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(975)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(976);stringArray[j] = it.next();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(977);j++;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(978);return stringArray;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(979);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(980)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(981)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(982);Random random = new Random();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(983);int randomNumber = random.nextInt(charactersPool.size());

                __CLR4_4_1l7l7lh9yvg8r.R.inc(984);if((((type.contains("List"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(985)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(986)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(987);List<Character> charList = new ArrayList<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(988);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(989);Iterator<Character> it = charactersPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(990);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(991)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(992)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(993);charList.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(994);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(995);return charList;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(996);if((((type.contains("Set"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(997)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(998)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(999);Set<Character> charSet = new HashSet<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1000);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1001);Iterator<Character> it = charactersPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1002);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1003)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1004)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1005);charSet.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1006);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1007);return charSet;
                }

                }}__CLR4_4_1l7l7lh9yvg8r.R.inc(1008);Character[] charArray = new Character[randomNumber];
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1009);int j = 0;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1010);Iterator<Character> it = charactersPool.iterator();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1011);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1012)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1013)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1014);charArray[j] = it.next();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1015);j++;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1016);return charArray;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1017);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1018)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1019)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1020);Random random = new Random();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1021);int randomNumber = random.nextInt(longsPool.size());

                __CLR4_4_1l7l7lh9yvg8r.R.inc(1022);if((((type.contains("List"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1023)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1024)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1025);List<Long> longList = new ArrayList<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1026);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1027);Iterator<Long> it = longsPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1028);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1029)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1030)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1031);longList.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1032);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1033);return longList;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1034);if((((type.contains("Set"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1035)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1036)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1037);Set<Long> longSet = new HashSet<>();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1038);int j = 0;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1039);Iterator<Long> it = longsPool.iterator();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1040);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1041)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1042)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1043);longSet.add(it.next());
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1044);j++;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1045);return longSet;
                }

                }}__CLR4_4_1l7l7lh9yvg8r.R.inc(1046);long[] longArray = new long[randomNumber];
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1047);int j = 0;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1048);Iterator<Long> it = longsPool.iterator();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1049);while ((((it.hasNext() && j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1050)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1051)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1052);longArray[j] = it.next();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1053);j++;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1054);return longArray;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1055);if ((((type.contains("boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1056)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1057)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1058);boolean[] boolArray = new boolean[2];
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1059);boolArray[0] = true;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1060);return boolArray;
            }
//            } else {
//                Random random = new Random();
//                int randomNumber = random.nextInt(objectsPool.size());
////                System.out.println(type);
//                Object[] objectArray = new Object[randomNumber];
//                int j = 0;
//                Iterator<Object> it = objectsPool.iterator();
//                while (it.hasNext() && j < randomNumber) {
//                    objectArray[j] = it.next();
//                    j++;
//                }
//                return objectArray;
//            }
        }}}}}} }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1061);if ((((type.contains("String"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1062)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1063)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1064);Random random = new Random();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1065);int index = random.nextInt(stringsPool.size());

            __CLR4_4_1l7l7lh9yvg8r.R.inc(1066);if((((type.contains("StringBuilder"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1067)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1068)==0&false))){{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1069);Iterator<String> it = stringsPool.iterator();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1070);int i = 0;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1071);while((((it.hasNext())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1072)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1073)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1074);String s = it.next();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1075);if((((i == index)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1076)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1077)==0&false))){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1078);StringBuilder sb = new StringBuilder(s);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1079);return sb;
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1080);i++;
                }
            }}

            // find a random string in the string pool
            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1081);Iterator<String> it = stringsPool.iterator();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1082);int i = 0;
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1083);while ((((it.hasNext())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1084)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1085)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1086);String s = it.next();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1087);if ((((i == index)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1088)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1089)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1090);return s;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1091);i++;
            }
        }} }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1092);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1093)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1094)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1095);Random random = new Random();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1096);int index = random.nextInt(integersPool.size());

            // find a random int in the int pool
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1097);Iterator<Integer> it = integersPool.iterator();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1098);int i = 0;
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1099);while ((((it.hasNext())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1100)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1101)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1102);Integer s = it.next();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1103);if ((((i == index)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1104)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1105)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1106);return s;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1107);i++;
            }
        }} }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1108);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1109)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1110)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1111);Random random = new Random();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1112);int index = random.nextInt(charactersPool.size());

            // find a random char in the char pool
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1113);Iterator<Character> it = charactersPool.iterator();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1114);int i = 0;
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1115);while ((((it.hasNext())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1116)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1117)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1118);Character s = it.next();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1119);if ((((i == index)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1120)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1121)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1122);return s;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1123);i++;
            }
        }} }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1124);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1125)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1126)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1127);Random random = new Random();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1128);int index = random.nextInt(longsPool.size());

            // find a random long in the long pool
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1129);Iterator<Long> it = longsPool.iterator();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1130);int i = 0;
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1131);while ((((it.hasNext())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1132)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1133)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1134);Long s = it.next();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1135);if ((((i == index)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1136)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1137)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1138);return s;
                }
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1139);i++;
            }
        }} }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1140);if ((((type.contains("boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1141)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1142)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1143);Random random = new Random();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1144);int index = random.nextInt(1);

            __CLR4_4_1l7l7lh9yvg8r.R.inc(1145);return index == 0;
        }
//        } else {
//        else {
//            Random random = new Random();
////            System.out.println(type);
//            // find a random object in the object pool
//            Iterator<Object> it = objectsPool.iterator();
//            List<Object> list = new ArrayList<>(objectsPool);
//
//            // create a set of indexes of such type
//            Set<Integer> indexes = new HashSet<>();
//
//            // add indexes of objects of such type
//            for (int i = 0; i < list.size(); i++) {
//                Object s = it.next();
//                if (s.getClass().toString().equals(type)) {
//                    indexes.add(i);
//                }
//            }
//
//            // get a random index from the set
//            if (indexes.size() == 0) {
//                return null;
//            }
//            int randomIndex = random.nextInt(indexes.size());
//            int i = 0;
//            for (Integer idx : indexes) {
//                if (i == randomIndex) {
//                    return list.get(idx);
//                }
//                i++;
//            }
//        }
        }}}}}}}__CLR4_4_1l7l7lh9yvg8r.R.inc(1146);return null;
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

//    public void invokeMethod(List<String> parametersList, int i, MethodDeclaration n, int argumentLength, List<Object> arguments) {
//        if (i == argumentLength) {
//            // get class object and method
//            System.out.println(arguments);
//            argumentsList.add(arguments);
//            return;
//        }
//        String currentParameter = parametersList.get(i);
//        if (currentParameter.equals("String")) {
//            for (String stringValueFromPool : stringsPool) {
//                arguments.add(stringValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(stringValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("int")) {
//            for (int intValueFromPool: integersPool) {
//                arguments.add(intValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove((Object) intValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("Character")) {
//            for (Character charValueFromPool: charactersPool) {
//                arguments.add(charValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(charValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("long")) {
//            for (Long longValueFromPool: longsPool) {
//                arguments.add(longValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(longValueFromPool);
//            }
//        }
//        else if (currentParameter.equals("boolean")) {
//            for (boolean boolValueFromPool: booleansPool) {
//                arguments.add(boolValueFromPool);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(boolValueFromPool);
//            }
//        }
//        else if(currentParameter.contains("[]")){
//            if(currentParameter.contains("int")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(integersPool.size());
//                int[] intArray = new int[randomNumber];
//                int j = 0;
//                Iterator<Integer> it = integersPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    intArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(intArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(intArray);
//            }
//            else if(currentParameter.contains("String")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(stringsPool.size());
//                String[] stringArray = new String[randomNumber];
//                int j = 0;
//                Iterator<String> it = stringsPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    stringArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(stringArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(stringArray);
//            }
//            else if(currentParameter.contains("Character")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(charactersPool.size());
//                Character[] charArray = new Character[randomNumber];
//                int j = 0;
//                Iterator<Character> it = charactersPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    charArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(charArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(charArray);
//            }
//            else if(currentParameter.contains("long")){
//                Random random = new Random();
//                int randomNumber = random.nextInt(longsPool.size());
//                long[] longArray = new long[randomNumber];
//                int j = 0;
//                Iterator<Long> it = longsPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    longArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(longArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(longArray);
//            }
//            else if(currentParameter.contains("boolean")){
//                boolean[] boolArray = new boolean[2];
//                boolArray[0] = true;
//                arguments.add(boolArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(boolArray);
//            }
//            else{
//                Random random = new Random();
//                int randomNumber = random.nextInt(objectsPool.size());
//                Object[] objectArray = new Object[randomNumber];
//                int j = 0;
//                Iterator<Object> it = objectsPool.iterator();
//                while(it.hasNext() && j < randomNumber){
//                    objectArray[j] = it.next();
//                    j++;
//                }
//                arguments.add(objectArray);
//                invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                arguments.remove(objectArray);
//            }
//        }
//        else {
//            for (Object objectValueFromPool: objectsPool) {
//                System.out.println(objectsPool);
//                if (objectsPool.size() == 1 || currentParameter.equals(objectValueFromPool.getClass().toString())) {
//                    arguments.add(objectValueFromPool);
//                    invokeMethod(parametersList, i + 1, n, argumentLength, arguments);
//                    arguments.remove(objectValueFromPool);
//                }
//            }
//        }
//    }

    public void generateTestFile() {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(1147);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1148);Path dir = Paths.get("src/test/java/org/jsoup/mytests");
//        Path dir = Paths.get("src/test/java/org/jsoup/mytests");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1149);if ((((!Files.exists(dir))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1150)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1151)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1152);try {
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1153);Files.createDirectories(dir);
            } catch (IOException e) {
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1154);e.printStackTrace();
            }
        }
        }__CLR4_4_1l7l7lh9yvg8r.R.inc(1155);Path file = dir.resolve("AutomatedTest.java");
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1156);try {
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1157);Files.write(file, sb.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1158);e.printStackTrace();
        }
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    // Recursive method to search for the class
    private void searchForClass(File directory, String className, List<Class<?>> clazzes) throws ClassNotFoundException {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(1159);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1160);File[] files = directory.listFiles();
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1161);if ((((files != null)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1162)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1163)==0&false))) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1164);for (File file : files) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1165);if ((((file.isDirectory())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1166)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1167)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1168);searchForClass(file, className, clazzes);
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1169);if ((((file.getName().endsWith(".class"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1170)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1171)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1172);String fileName = file.getName().substring(0, file.getName().length() - 6);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1173);String fullClassName = directory.getPath().substring(directory.getPath().lastIndexOf("org")).replace('/', '.') + "." + fileName;
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1174);if ((((fullClassName.endsWith(className))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1175)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1176)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1177);Class<?> clazz = Class.forName(fullClassName);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1178);clazzes.add(clazz);
                    }
                }}
            }}}
        }}
    }}finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public Object[] getConstructorParam(List<String> parametersTypeList){try{__CLR4_4_1l7l7lh9yvg8r.R.inc(1179);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1180);Object[] arguments = new Object[parametersTypeList.size()];
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1181);for(int i = 0; (((i < parametersTypeList.size())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1182)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1183)==0&false)); i++){{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1184);String type = parametersTypeList.get(i);
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1185);if((((type.contains("[]"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1186)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1187)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1188);if ((((type.contains("String"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1189)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1190)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1191);String[] strs = (String[]) getValueFromPool(type);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1192);arguments[i] = strs;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1193);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1194)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1195)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1196);int[] ints = (int[]) getValueFromPool(type);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1197);arguments[i] = ints;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1198);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1199)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1200)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1201);long[] longs = (long[]) getValueFromPool(type);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1202);arguments[i] = longs;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1203);if ((((type.contains("boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1204)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1205)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1206);boolean[] bools = (boolean[]) getValueFromPool(type);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1207);arguments[i] = bools;
                } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1208);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1209)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1210)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1211);Character[] chars = (Character[]) getValueFromPool(type);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1212);arguments[i] = chars;
                } }else {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1213);Random random = new Random();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1214);int randomNumber = random.nextInt(objectsPool.size());
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1215);Object[] objectArray = new Object[randomNumber];
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1216);for(int j = 0; (((j < randomNumber)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1217)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1218)==0&false)); j++){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1219);objectArray[j] = getObjectFromPool(type);
                    }
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1220);arguments[i] = objectArray;
                }
            }}}}}}}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1221);if ((((type.contains("String"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1222)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1223)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1224);String s = (String) getValueFromPool(type);
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1225);arguments[i] = s;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1226);if ((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1227)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1228)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1229);int in = (int) getValueFromPool(type);
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1230);arguments[i] = in;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1231);if ((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1232)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1233)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1234);long l = (long) getValueFromPool(type);
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1235);arguments[i] = l;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1236);if ((((type.contains("boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1237)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1238)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1239);boolean b = (boolean) getValueFromPool(type);
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1240);arguments[i] = b;
            } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1241);if ((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1242)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1243)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1244);char ch = (char) getValueFromPool(type);
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1245);arguments[i] = ch;
            } }else {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1246);Object o = getObjectFromPool(type);
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1247);arguments[i] = o;
            }
        }}}}}}}
        }__CLR4_4_1l7l7lh9yvg8r.R.inc(1248);return arguments;
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public void construct() {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(1249);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1250);for (ClassOrInterfaceDeclaration c : classes){{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1251);String className = c.getNameAsString();

            __CLR4_4_1l7l7lh9yvg8r.R.inc(1252);List<Class<?>> clazzes = new ArrayList<>();

            __CLR4_4_1l7l7lh9yvg8r.R.inc(1253);try{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1254);ClassLoader classLoader = ClassLoader.getSystemClassLoader();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1255);Enumeration<URL> resources = classLoader.getResources("org/jsoup");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1256);while ((((resources.hasMoreElements())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1257)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1258)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1259);URL resource = resources.nextElement();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1260);File directory = new File(resource.getFile());
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1261);searchForClass(directory, className, clazzes);
                }
            }}catch(Exception e){
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1262);e.printStackTrace();
            }

            __CLR4_4_1l7l7lh9yvg8r.R.inc(1263);if((((clazzes.size() != 0)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1264)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1265)==0&false))){{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1266);try {
                    // generate the constructor without arguments
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1267);for(Class<?> cl : clazzes){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1268);Constructor<?>[] constructors = cl.getConstructors();
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1269);for (Constructor<?> constructor : constructors) {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1270);if ((((constructor.getParameterCount() == 0)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1271)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1272)==0&false))) {{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1273);Object obj = constructor.newInstance();
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1274);objectsPool.add(obj);
                            }
                        }}
                    }}

                    // generate the constructor with arguments
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1275);for(Class<?> cl : clazzes){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1276);Constructor<?>[] constructors = cl.getConstructors();
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1277);for (Constructor<?> constructor : constructors) {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1278);if ((((constructor.getParameterCount() != 0)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1279)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1280)==0&false))) {{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1281);Class<?>[] parameterTypes = constructor.getParameterTypes();
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1282);List<String> parametersTypeList = new ArrayList<>();
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1283);for (Class<?> parameterType : parameterTypes) {{
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1284);parametersTypeList.add(parameterType.toString());
                                }
                                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1285);Object[] arguments = getConstructorParam(parametersTypeList);
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1286);Object obj = constructor.newInstance(arguments);
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1287);objectsPool.add(obj);
                            }
                        }}
                    }}

                }} catch (Exception e) {
//                    e.printStackTrace();
                }
            }
        }}
    }}finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}

    public void generateTest() {try{__CLR4_4_1l7l7lh9yvg8r.R.inc(1288);
        __CLR4_4_1l7l7lh9yvg8r.R.inc(1289);for (MethodDeclaration method : methods) {{
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1290);if(((("Optional.empty".equals(method.findAncestor(ClassOrInterfaceDeclaration.class).toString()))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1291)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1292)==0&false))){{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1293);continue;
            }
            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1294);if((((method.findAncestor(ClassOrInterfaceDeclaration.class).get().isPrivate() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isProtected() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isStatic() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isAbstract() || method.findAncestor(ClassOrInterfaceDeclaration.class).get().isInterface())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1295)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1296)==0&false))){{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1297);continue;
            }

            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1298);if ((((Objects.equals(method.getName().toString(), "iterator"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1299)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1300)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1301);continue;
            }
            // Pass the override method
            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1302);if ((((method.isAnnotationPresent("Override"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1303)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1304)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1305);continue;
            }

            // check if the return type is an abstract class
//            String returnClass = method.getType().toString();
            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1306);if ((((method.getName().asString().equals("getTreeBuilder") || method.getName().asString().equals("setTreeBuilder"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1307)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1308)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1309);continue;
            }

            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1310);if ((((method.getName().asString().equals("data") && method.getParameters().toString().equals("[String... keyvals]"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1311)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1312)==0&false))) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1313);continue;
            }
            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1314);String className = method.findAncestor(ClassOrInterfaceDeclaration.class).get().getNameAsString();

            __CLR4_4_1l7l7lh9yvg8r.R.inc(1315);NodeList<ReferenceType> exceptionList = method.getThrownExceptions();

            // find parameter types
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1316);NodeList<Parameter> parameters = method.getParameters();
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1317);List<String> parametersList = new ArrayList<>();

            __CLR4_4_1l7l7lh9yvg8r.R.inc(1318);for (Parameter p : parameters) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1319);parametersList.add(p.getType().toString());
            }
//            System.out.println(parametersList);

            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1320);List<List<Object>> argumentsList = new ArrayList<>();

            // generate 3 groups of arguments for each method
            // TODO: test case number for each method
            __CLR4_4_1l7l7lh9yvg8r.R.inc(1321);for (int num = 0; (((num < 5)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1322)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1323)==0&false)); num++) {{
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1324);List<Object> arguments = new ArrayList<>();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1325);for (int i = 0; (((i < parametersList.size())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1326)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1327)==0&false)); i++) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1328);String type = parametersList.get(i);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1329);if ((((type.equals("String"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1330)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1331)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1332);String s = (String) getValueFromPool(type);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1333);arguments.add(s);
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1334);if ((((type.equals("Integer") || type.equals("int"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1335)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1336)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1337);int in = (int) getValueFromPool(type);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1338);arguments.add(in);
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1339);if ((((type.equals("Long") || type.equals("long"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1340)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1341)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1342);long l = (long) getValueFromPool(type);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1343);arguments.add(l);
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1344);if ((((type.equals("boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1345)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1346)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1347);boolean b = (boolean) getValueFromPool(type);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1348);arguments.add(b);
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1349);if ((((type.equals("Character") || type.equals("char"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1350)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1351)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1352);char c = (char) getValueFromPool(type);
//                        System.out.println(c);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1353);arguments.add(c);
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1354);if((((type.contains("[]"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1355)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1356)==0&false))){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1357);if((((type.contains("String"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1358)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1359)==0&false))){{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1360);String[] strs = (String[]) getValueFromPool(type);
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1361);arguments.add(strs);
                        }}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1362);if((((type.contains("Integer") || type.contains("int"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1363)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1364)==0&false))) {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1365);int[] ints = (int[]) getValueFromPool(type);
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1366);arguments.add(ints);
                        }}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1367);if((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1368)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1369)==0&false))) {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1370);long[] longs = (long[]) getValueFromPool(type);
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1371);arguments.add(longs);
                        }}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1372);if((((type.contains("boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1373)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1374)==0&false))) {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1375);boolean[] bools = (boolean[]) getValueFromPool(type);
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1376);arguments.add(bools);
                        }}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1377);if((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1378)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1379)==0&false))) {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1380);Character[] chars = (Character[]) getValueFromPool(type);
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1381);arguments.add(chars);
                        }}else{{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1382);Object[] objects = (Object[]) getValueFromPool(type);
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1383);arguments.add(objects);
                        }
                    }}}}}} }else {{
//                        System.out.println(type);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1384);Object o = getValueFromPool(type);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1385);arguments.add(o);
                    }
                }}}}}}}
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1386);argumentsList.add(arguments);
            }
//            if(method.getName().toString().equals("put")){
//                System.out.println(argumentsList);
//            }

            // \u6839\u636e\u65b9\u6cd5\u6240\u5728\u7684\u7c7b\uff0c\u53bbconstructor list\u4e2d\u627e\u5230\u5bf9\u5e94\u7684\u5b9e\u4f53\uff0c\u8c03\u7528\u8be5\u51fd\u6570\uff0c\u751f\u6210test
            // TODO: Object can not be put into the code directly!!!
            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1387);for (int i = 0; (((i < argumentsList.size())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1388)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1389)==0&false)); i++) {{

                // get the parameter list
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1390);List<Object> currentArguments = argumentsList.get(i);

                __CLR4_4_1l7l7lh9yvg8r.R.inc(1391);sb.append("    @Test\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1392);String throwException;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1393);if ((((exceptionList.size() != 0)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1394)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1395)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1396);throwException = "throws Exception ";
                } }else {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1397);throwException = "";
                }

                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1398);Random random = new Random();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1399);int randomNum = random.nextInt(99999999);
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1400);String methodName = "test" + className + method.getName() + randomNum;
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1401);while((((testMethodsName.contains(methodName))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1402)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1403)==0&false))){{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1404);randomNum = random.nextInt(99999999);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1405);methodName = "test" + className + method.getName() + randomNum;
                }

                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1406);testMethodsName.add(methodName);

                __CLR4_4_1l7l7lh9yvg8r.R.inc(1407);sb.append("    public void " + methodName + "() " + throwException + "{\n");

                // TODO: add parameters
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1408);sb.append("        try {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1409);sb.append("            " + className + " " + className.toLowerCase() + " = (" + className + ") " + "PoolGenerator.getObjectFromPool(\"" + className + "\");\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1410);sb.append("            " + "if (" + className.toLowerCase() + " == null) {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1411);sb.append("                pg.getInstance(\"" + className + "\", false);\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1412);sb.append("                " + className.toLowerCase() + " = (" + className + ") " + "PoolGenerator.getObjectFromPool(\"" + className + "\");\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1413);sb.append("                if (" + className.toLowerCase() + " == null) {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1414);sb.append("                    return;\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1415);sb.append("                }\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1416);sb.append("            }\n");

                __CLR4_4_1l7l7lh9yvg8r.R.inc(1417);StringBuilder parameterList = new StringBuilder();
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1418);parameterList.append("(");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1419);for (int j = 0; (((j < currentArguments.size())&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1420)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1421)==0&false)); j++) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1422);Object o = currentArguments.get(j);
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1423);if((((o != null)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1424)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1425)==0&false))){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1426);String type = o.getClass().toString();
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1427);if((((type.contains("[L") || type.contains("[I"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1428)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1429)==0&false))){{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1430);if((((type.contains("String"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1431)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1432)==0&false))) {{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1433);parameterList.append("new String[]{");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1434);for(int k = 0; (((k < ((String[]) o).length)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1435)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1436)==0&false)); k++){{
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1437);parameterList.append("\"" + ((String[]) o)[k] + "\"");
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1438);if((((k != ((String[]) o).length - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1439)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1440)==0&false))){{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1441);parameterList.append(",");
                                    }
                                }}
                            }}}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1442);if((((type.contains("Integer") || type.contains("int") || type.contains("[I"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1443)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1444)==0&false))) {{
//                                System.out.println("int array");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1445);parameterList.append("new int[]{");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1446);for (int k = 0; (((k < ((int[]) o).length)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1447)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1448)==0&false)); k++) {{
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1449);parameterList.append(((int[]) o)[k]);
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1450);if ((((k != ((int[]) o).length - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1451)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1452)==0&false))) {{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1453);parameterList.append(",");
                                    }
                                }}
                            }}}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1454);if((((type.contains("Long") || type.contains("long"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1455)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1456)==0&false))) {{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1457);parameterList.append("new long[]{");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1458);for (int k = 0; (((k < ((long[]) o).length)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1459)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1460)==0&false)); k++) {{
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1461);parameterList.append(((long[]) o)[k]);
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1462);if ((((k != ((long[]) o).length - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1463)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1464)==0&false))) {{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1465);parameterList.append(",");
                                    }
                                }}
                            }}}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1466);if((((type.contains("boolean"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1467)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1468)==0&false))) {{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1469);parameterList.append("new boolean[]{");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1470);for (int k = 0; (((k < ((boolean[]) o).length)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1471)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1472)==0&false)); k++) {{
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1473);parameterList.append(((boolean[]) o)[k]);
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1474);if ((((k != ((boolean[]) o).length - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1475)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1476)==0&false))) {{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1477);parameterList.append(",");
                                    }
                                }}
                            }}}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1478);if((((type.contains("Character") || type.contains("char"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1479)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1480)==0&false))) {{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1481);parameterList.append("new Character[]{");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1482);for (int k = 0; (((k < ((Character[]) o).length)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1483)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1484)==0&false)); k++) {{
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1485);Character c = ((Character[]) o)[k];
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1486);System.out.println(c);
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1487);if ((((c == '\\')&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1488)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1489)==0&false))) {{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1490);parameterList.append("'\\\\'");
                                    }}else{{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1491);parameterList.append("\'" + c + "\'");
                                    }
                                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1492);if ((((k != ((Character[]) o).length - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1493)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1494)==0&false))) {{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1495);parameterList.append(",");
                                    }
                                }}
                            }}}else{{
//                                System.out.println("Object array");
                                // Get object array from pool as parameter
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1496);parameterList.append("String type = " + type + ";");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1497);parameterList.append("new Object[]{");
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1498);for (int k = 0; (((k < ((Object[]) o).length)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1499)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1500)==0&false)); k++) {{
//                                    System.out.println(type);
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1501);parameterList.append("PoolGenerator.getObjectFromPool(\"type\")");
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1502);if ((((k != ((Object[]) o).length - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1503)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1504)==0&false))) {{
                                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1505);parameterList.append(",");
                                    }
                                }}
                            }}
                            }}}}}__CLR4_4_1l7l7lh9yvg8r.R.inc(1506);parameterList.append("}");
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1507);if((((j != currentArguments.size() - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1508)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1509)==0&false))){{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1510);parameterList.append(",");
                            }
                            }__CLR4_4_1l7l7lh9yvg8r.R.inc(1511);continue;
                        }
                    }}
                    }__CLR4_4_1l7l7lh9yvg8r.R.inc(1512);if ((((o instanceof String)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1513)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1514)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1515);parameterList.append("\"" + o + "\"");
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1516);if((((o instanceof Character)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1517)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1518)==0&false))){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1519);if(((((Character) o == '\\')&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1520)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1521)==0&false))){{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1522);parameterList.append("'\\\\'");
                        }}else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1523);if (((((Character) o == '\'')&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1524)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1525)==0&false))){{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1526);parameterList.append("\'\\" + o + "\'");
                        } }else {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1527);parameterList.append("\'" + o + "\'");
                        }
                    }}}
                    }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1528);if ((((o instanceof Integer)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1529)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1530)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1531);parameterList.append(o);
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1532);if ((((o instanceof Long)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1533)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1534)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1535);parameterList.append(o);
                    } }else {__CLR4_4_1l7l7lh9yvg8r.R.inc(1536);if ((((o instanceof Boolean)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1537)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1538)==0&false))) {{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1539);parameterList.append(o);
                    } }else {{
                        // Get object from pool as parameter
//                        System.out.println(o.getClass());
//                        parameterList.append(o);
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1540);String type = parametersList.get(j);
//                        parameterList.append("String type = " + type + ";");
//                        System.out.println(type);
//                        if(o == null){
////                            System.out.println("null");
//                            parameterList.append("(" + type + ") " + "null");
//                        }else{

                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1541);if((((className.toLowerCase().contains("w3cdom"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1542)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1543)==0&false))){{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1544);if((((method.getName().toString().contains("convert"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1545)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1546)==0&false))){{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1547);if ((((j == 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1548)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1549)==0&false))){{
                                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1550);type = "org.w3c.dom.Document";
                                }
                            }}}else{{
                                __CLR4_4_1l7l7lh9yvg8r.R.inc(1551);type = "org.w3c.dom.Document";
                            }
                        }}
                        }__CLR4_4_1l7l7lh9yvg8r.R.inc(1552);if((((method.getName().toString().contains("fromJsoup"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1553)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1554)==0&false))) {{
                            __CLR4_4_1l7l7lh9yvg8r.R.inc(1555);type = "Document";
                        }
                        }__CLR4_4_1l7l7lh9yvg8r.R.inc(1556);parameterList.append("(" + type + ") " + "PoolGenerator.getObjectFromPool(\"" + type + "\")");
//                        }
                    }
                    }}}}}__CLR4_4_1l7l7lh9yvg8r.R.inc(1557);if((((j != currentArguments.size() - 1)&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1558)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1559)==0&false))){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1560);parameterList.append(",");
                    }
                }}

                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1561);parameterList.append(")");
//                sb.append("        " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");

                // get the return type of the MethodDeclaration method

                __CLR4_4_1l7l7lh9yvg8r.R.inc(1562);if ((((!Objects.equals(method.getType().toString(), "void"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1563)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1564)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1565);String returnType = method.getType().toString();
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1566);if((((method.getName().toString().contains("fromJsoup"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1567)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1568)==0&false))){{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1569);sb.append("            " + returnType + " result = (Document) " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");
                    }}else{{
                        __CLR4_4_1l7l7lh9yvg8r.R.inc(1570);sb.append("            " + returnType + " result = " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");
                    }
                }} }else {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1571);sb.append("            " + className.toLowerCase() + "." + method.getName() + parameterList + ";\n");
                }
                // add the return value from previous step
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1572);if ((((!Objects.equals(method.getType().toString(), "void"))&&(__CLR4_4_1l7l7lh9yvg8r.R.iget(1573)!=0|true))||(__CLR4_4_1l7l7lh9yvg8r.R.iget(1574)==0&false))) {{
                    __CLR4_4_1l7l7lh9yvg8r.R.inc(1575);sb.append("            " + "PoolGenerator.putObjectToPool(result);\n");
                }
                // o.equals(o)==true
                }__CLR4_4_1l7l7lh9yvg8r.R.inc(1576);sb.append("            " + "assertTrue(" + className.toLowerCase() + ".equals(" + className.toLowerCase() + "));\n");
                // o.equals(o) throws no exception
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1577);sb.append("            " + "try {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1578);sb.append("                " + className.toLowerCase() + ".equals(" + className.toLowerCase() + ");\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1579);sb.append("            " + "} catch (Exception e) {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1580);sb.append("                " + "fail(\""+ className.toLowerCase() + ".equals(" + className.toLowerCase() +") throws an exception\");\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1581);sb.append("            " + "}\n");
                // o.hashCode() throws no exception
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1582);sb.append("            " + "try {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1583);sb.append("                " + className.toLowerCase() + ".hashCode();\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1584);sb.append("            " + "} catch (Exception e) {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1585);sb.append("                " + "fail(\""+ className.toLowerCase() + ".hashCode() throws an exception\");\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1586);sb.append("            " + "}\n");
                // o.toString() throws no exception
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1587);sb.append("            " + "try {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1588);sb.append("                " + className.toLowerCase() + ".toString();\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1589);sb.append("            " + "} catch (Exception e) {\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1590);sb.append("                " + "fail(\""+ className.toLowerCase() + ".toString() throws an exception\");\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1591);sb.append("            " + "}\n");
                __CLR4_4_1l7l7lh9yvg8r.R.inc(1592);sb.append("        " + "}catch(Exception e){}\n");

                __CLR4_4_1l7l7lh9yvg8r.R.inc(1593);sb.append("    }\n");
            }
        }}
        }__CLR4_4_1l7l7lh9yvg8r.R.inc(1594);sb.append("}");
    }finally{__CLR4_4_1l7l7lh9yvg8r.R.flushNeeded();}}
}