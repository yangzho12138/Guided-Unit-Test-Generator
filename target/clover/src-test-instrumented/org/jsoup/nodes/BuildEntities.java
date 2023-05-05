/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.integration.UrlConnectTestUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/**
 * Fetches HTML entity names from w3.org json, and outputs data files for optimized used in Entities.
 * I refuse to believe that entity names like "NotNestedLessLess" are valuable or useful for HTML authors. Implemented
 * only to be complete.
 */
class BuildEntities {public static class __CLR4_4_1t7qt7qlh9yvhoq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,37933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws IOException {try{__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37862);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37863);String url = "https://www.w3.org/TR/2012/WD-html5-20121025/entities.json";
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37864);Connection.Response res = Jsoup.connect(url)
            .ignoreContentType(true)
            .userAgent(UrlConnectTestUtil.browserUa)
            .execute();

        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37865);Gson gson = new Gson();
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37866);Map<String, CharacterRef> input = gson.fromJson(res.body(),
            new TypeToken<Map<String, CharacterRef>>() {
            }.getType());


        // build name sorted base and full character lists:
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37867);ArrayList<CharacterRef> base = new ArrayList<>();
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37868);ArrayList<CharacterRef> full = new ArrayList<>();

        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37869);for (Map.Entry<String, CharacterRef> entry : input.entrySet()) {{
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37870);String name = entry.getKey().substring(1); // name is like &acute or &acute; , trim &
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37871);CharacterRef ref = entry.getValue();
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37872);if ((((name.endsWith(";"))&&(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37873)!=0|true))||(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37874)==0&false))) {{
                __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37875);name = name.substring(0, name.length() - 1);
                __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37876);full.add(ref);
            } }else {{
                __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37877);base.add(ref);
            }
            }__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37878);ref.name = name;
        }
        }__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37879);Collections.sort(base, byName);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37880);Collections.sort(full, byName);

        // now determine code point order
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37881);ArrayList<CharacterRef> baseByCode = new ArrayList<>(base);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37882);ArrayList<CharacterRef> fullByCode = new ArrayList<>(full);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37883);Collections.sort(baseByCode, byCode);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37884);Collections.sort(fullByCode, byCode);

        // and update their codepoint index.
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37885);@SuppressWarnings("unchecked") ArrayList<CharacterRef>[] codelists = new ArrayList[]{baseByCode, fullByCode};
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37886);for (ArrayList<CharacterRef> codelist : codelists) {{
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37887);for (int i = 0; (((i < codelist.size())&&(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37888)!=0|true))||(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37889)==0&false)); i++) {{
                __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37890);codelist.get(i).codeIndex = i;
            }
        }}

        // now write them
        }__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37891);persist("entities-full", full);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37892);persist("entities-base", base);

        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37893);System.out.println("Full size: " + full.size() + ", base size: " + base.size());
    }finally{__CLR4_4_1t7qt7qlh9yvhoq.R.flushNeeded();}}

    private static void persist(String name, ArrayList<CharacterRef> refs) throws IOException {try{__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37894);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37895);File file = Files.createTempFile(name, ".txt").toFile();
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37896);FileWriter writer = new FileWriter(file, false);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37897);writer.append("static final String points = \"");
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37898);for (CharacterRef ref : refs) {{
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37899);writer.append(ref.toString()).append('&');
        }
        }__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37900);writer.append("\";\n");
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37901);writer.close();

        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37902);System.out.println("Wrote " + name + " to " + file.getAbsolutePath());
    }finally{__CLR4_4_1t7qt7qlh9yvhoq.R.flushNeeded();}}


    private static class CharacterRef {
        int[] codepoints;
        String name;
        int codeIndex;

        @Override
        public String toString() {try{__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37903);
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37904);return name
                + "="
                + d(codepoints[0])
                + ((((codepoints.length > 1 )&&(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37905)!=0|true))||(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37906)==0&false))? "," + d(codepoints[1]) : "")
                + ";" + d(codeIndex);
        }finally{__CLR4_4_1t7qt7qlh9yvhoq.R.flushNeeded();}}
    }

    private static String d(int d) {try{__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37907);
        __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37908);return Integer.toString(d, Entities.codepointRadix);
    }finally{__CLR4_4_1t7qt7qlh9yvhoq.R.flushNeeded();}}

    private static class ByName implements Comparator<CharacterRef> {
        public int compare(CharacterRef o1, CharacterRef o2) {try{__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37909);
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37910);return o1.name.compareTo(o2.name);
        }finally{__CLR4_4_1t7qt7qlh9yvhoq.R.flushNeeded();}}
    }

    private static class ByCode implements Comparator<CharacterRef> {
        public int compare(CharacterRef o1, CharacterRef o2) {try{__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37911);
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37912);int[] c1 = o1.codepoints;
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37913);int[] c2 = o2.codepoints;
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37914);int first = c1[0] - c2[0];
            __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37915);if ((((first != 0)&&(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37916)!=0|true))||(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37917)==0&false)))
                {__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37918);return first;
            }__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37919);if ((((c1.length == 1 && c2.length == 1)&&(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37920)!=0|true))||(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37921)==0&false))) {{ // for the same code, use the shorter name
                __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37922);int len = o2.name.length() - o1.name.length();
                __CLR4_4_1t7qt7qlh9yvhoq.R.inc(37923);if ((((len != 0)&&(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37924)!=0|true))||(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37925)==0&false)))
                    {__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37926);return len;
                }__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37927);return o1.name.compareTo(o2.name);
            }
            }__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37928);if ((((c1.length == 2 && c2.length == 2)&&(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37929)!=0|true))||(__CLR4_4_1t7qt7qlh9yvhoq.R.iget(37930)==0&false)))
                {__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37931);return c1[1] - c2[1];
            }else
                {__CLR4_4_1t7qt7qlh9yvhoq.R.inc(37932);return c2.length - c1.length; // pushes multi down the list so hits on singles first (don't support multi lookup by codepoint yet)
        }}finally{__CLR4_4_1t7qt7qlh9yvhoq.R.flushNeeded();}}
    }

    private static ByName byName = new ByName();
    private static ByCode byCode = new ByCode();
}
