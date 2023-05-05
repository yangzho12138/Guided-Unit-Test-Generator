/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.select;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CssTest {static class __CLR4_4_1vwovwolh9yvhue{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,41494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private Document html = null;
	private static String htmlString;
	
	@BeforeClass
	public static void initClass() {try{__CLR4_4_1vwovwolh9yvhue.R.inc(41352);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41353);StringBuilder sb = new StringBuilder("<html><head></head><body>");
		
		__CLR4_4_1vwovwolh9yvhue.R.inc(41354);sb.append("<div id='pseudo'>");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41355);for (int i = 1; (((i <= 10)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41356)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41357)==0&false)); i++) {{
			__CLR4_4_1vwovwolh9yvhue.R.inc(41358);sb.append(String.format("<p>%d</p>",i));
		}
		}__CLR4_4_1vwovwolh9yvhue.R.inc(41359);sb.append("</div>");

		__CLR4_4_1vwovwolh9yvhue.R.inc(41360);sb.append("<div id='type'>");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41361);for (int i = 1; (((i <= 10)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41362)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41363)==0&false)); i++) {{
			__CLR4_4_1vwovwolh9yvhue.R.inc(41364);sb.append(String.format("<p>%d</p>",i));
			__CLR4_4_1vwovwolh9yvhue.R.inc(41365);sb.append(String.format("<span>%d</span>",i));
			__CLR4_4_1vwovwolh9yvhue.R.inc(41366);sb.append(String.format("<em>%d</em>",i));
            __CLR4_4_1vwovwolh9yvhue.R.inc(41367);sb.append(String.format("<svg>%d</svg>",i));
		}
		}__CLR4_4_1vwovwolh9yvhue.R.inc(41368);sb.append("</div>");

		__CLR4_4_1vwovwolh9yvhue.R.inc(41369);sb.append("<span id='onlySpan'><br /></span>");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41370);sb.append("<p class='empty'><!-- Comment only is still empty! --></p>");
		
		__CLR4_4_1vwovwolh9yvhue.R.inc(41371);sb.append("<div id='only'>");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41372);sb.append("Some text before the <em>only</em> child in this div");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41373);sb.append("</div>");
		
		__CLR4_4_1vwovwolh9yvhue.R.inc(41374);sb.append("</body></html>");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41375);htmlString = sb.toString();
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Before
	public void init() {try{__CLR4_4_1vwovwolh9yvhue.R.inc(41376);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41377);html  = Jsoup.parse(htmlString);
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}
	
	@Test
	public void firstChild() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hq7evnvxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.firstChild",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41378,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hq7evnvxe(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41378);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41379);check(html.select("#pseudo :first-child"), "1");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41380);check(html.select("html:first-child"));
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void lastChild() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hks819vxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.lastChild",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41381,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hks819vxh(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41381);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41382);check(html.select("#pseudo :last-child"), "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41383);check(html.select("html:last-child"));
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}
	
	@Test
	public void nthChild_simple() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qyd52avxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthChild_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qyd52avxk(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41384);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41385);for(int i = 1; (((i <=10)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41386)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41387)==0&false)); i++) {{
			__CLR4_4_1vwovwolh9yvhue.R.inc(41388);check(html.select(String.format("#pseudo :nth-child(%d)", i)), String.valueOf(i));
		}
	}}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

    @Test
    public void nthOfType_unknownTag() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ypmnk3vxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthOfType_unknownTag",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ypmnk3vxp(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41389);
        __CLR4_4_1vwovwolh9yvhue.R.inc(41390);for(int i = 1; (((i <=10)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41391)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41392)==0&false)); i++) {{
            __CLR4_4_1vwovwolh9yvhue.R.inc(41393);check(html.select(String.format("#type svg:nth-of-type(%d)", i)), String.valueOf(i));
        }
    }}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void nthLastChild_simple() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12v2nzgvxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastChild_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12v2nzgvxu(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41394);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41395);for(int i = 1; (((i <=10)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41396)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41397)==0&false)); i++) {{
			__CLR4_4_1vwovwolh9yvhue.R.inc(41398);check(html.select(String.format("#pseudo :nth-last-child(%d)", i)), String.valueOf(11-i));
		}
	}}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void nthOfType_simple() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nz5mezvxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthOfType_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41399,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nz5mezvxz(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41399);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41400);for(int i = 1; (((i <=10)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41401)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41402)==0&false)); i++) {{
			__CLR4_4_1vwovwolh9yvhue.R.inc(41403);check(html.select(String.format("#type p:nth-of-type(%d)", i)), String.valueOf(i));
		}
	}}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}
	
	@Test
	public void nthLastOfType_simple() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cjqj9rvy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastOfType_simple",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41404,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cjqj9rvy4(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41404);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41405);for(int i = 1; (((i <=10)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41406)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41407)==0&false)); i++) {{
			__CLR4_4_1vwovwolh9yvhue.R.inc(41408);check(html.select(String.format("#type :nth-last-of-type(%d)", i)), String.valueOf(11-i),String.valueOf(11-i),String.valueOf(11-i),String.valueOf(11-i));
		}
	}}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void nthChild_advanced() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1u72wtuvy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthChild_advanced",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1u72wtuvy9(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41409);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41410);check(html.select("#pseudo :nth-child(-5)"));
		__CLR4_4_1vwovwolh9yvhue.R.inc(41411);check(html.select("#pseudo :nth-child(odd)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41412);check(html.select("#pseudo :nth-child(2n-1)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41413);check(html.select("#pseudo :nth-child(2n+1)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41414);check(html.select("#pseudo :nth-child(2n+3)"), "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41415);check(html.select("#pseudo :nth-child(even)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41416);check(html.select("#pseudo :nth-child(2n)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41417);check(html.select("#pseudo :nth-child(3n-1)"), "2", "5", "8");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41418);check(html.select("#pseudo :nth-child(-2n+5)"), "1", "3", "5");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41419);check(html.select("#pseudo :nth-child(+5)"), "5");
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void nthOfType_advanced() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_19jwbpnvyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthOfType_advanced",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_19jwbpnvyk(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41420);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41421);check(html.select("#type :nth-of-type(-5)"));
		__CLR4_4_1vwovwolh9yvhue.R.inc(41422);check(html.select("#type p:nth-of-type(odd)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41423);check(html.select("#type em:nth-of-type(2n-1)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41424);check(html.select("#type p:nth-of-type(2n+1)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41425);check(html.select("#type span:nth-of-type(2n+3)"), "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41426);check(html.select("#type p:nth-of-type(even)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41427);check(html.select("#type p:nth-of-type(2n)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41428);check(html.select("#type p:nth-of-type(3n-1)"), "2", "5", "8");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41429);check(html.select("#type p:nth-of-type(-2n+5)"), "1", "3", "5");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41430);check(html.select("#type :nth-of-type(+5)"), "5", "5", "5", "5");
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	
	@Test
	public void nthLastChild_advanced() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yf6w58vyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastChild_advanced",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41431,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yf6w58vyv(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41431);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41432);check(html.select("#pseudo :nth-last-child(-5)"));
		__CLR4_4_1vwovwolh9yvhue.R.inc(41433);check(html.select("#pseudo :nth-last-child(odd)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41434);check(html.select("#pseudo :nth-last-child(2n-1)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41435);check(html.select("#pseudo :nth-last-child(2n+1)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41436);check(html.select("#pseudo :nth-last-child(2n+3)"), "2", "4", "6", "8");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41437);check(html.select("#pseudo :nth-last-child(even)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41438);check(html.select("#pseudo :nth-last-child(2n)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41439);check(html.select("#pseudo :nth-last-child(3n-1)"), "3", "6", "9");

		__CLR4_4_1vwovwolh9yvhue.R.inc(41440);check(html.select("#pseudo :nth-last-child(-2n+5)"), "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41441);check(html.select("#pseudo :nth-last-child(+5)"), "6");
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void nthLastOfType_advanced() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11iwdfjvz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.nthLastOfType_advanced",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11iwdfjvz6(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41442);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41443);check(html.select("#type :nth-last-of-type(-5)"));
		__CLR4_4_1vwovwolh9yvhue.R.inc(41444);check(html.select("#type p:nth-last-of-type(odd)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41445);check(html.select("#type em:nth-last-of-type(2n-1)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41446);check(html.select("#type p:nth-last-of-type(2n+1)"), "2", "4", "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41447);check(html.select("#type span:nth-last-of-type(2n+3)"), "2", "4", "6", "8");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41448);check(html.select("#type p:nth-last-of-type(even)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41449);check(html.select("#type p:nth-last-of-type(2n)"), "1", "3", "5", "7", "9");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41450);check(html.select("#type p:nth-last-of-type(3n-1)"), "3", "6", "9");

		__CLR4_4_1vwovwolh9yvhue.R.inc(41451);check(html.select("#type span:nth-last-of-type(-2n+5)"), "6", "8", "10");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41452);check(html.select("#type :nth-last-of-type(+5)"), "6", "6", "6", "6");
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}
	
	@Test
	public void firstOfType() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tvxm7cvzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.firstOfType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tvxm7cvzh(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41453);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41454);check(html.select("div:not(#only) :first-of-type"), "1", "1", "1", "1", "1");
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void lastOfType() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p7uq1avzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.lastOfType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41455,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p7uq1avzj(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41455);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41456);check(html.select("div:not(#only) :last-of-type"), "10", "10", "10", "10", "10");
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	@Test
	public void empty() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g4yvp0vzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.empty",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41457,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g4yvp0vzl(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41457);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41458);final Elements sel = html.select(":empty");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41459);assertEquals(3, sel.size());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41460);assertEquals("head", sel.get(0).tagName());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41461);assertEquals("br", sel.get(1).tagName());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41462);assertEquals("p", sel.get(2).tagName());
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}
	
	@Test
	public void onlyChild() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1iif507vzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.onlyChild",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1iif507vzr(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41463);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41464);final Elements sel = html.select("span :only-child");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41465);assertEquals(1, sel.size());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41466);assertEquals("br", sel.get(0).tagName());
		
		__CLR4_4_1vwovwolh9yvhue.R.inc(41467);check(html.select("#only :only-child"), "only");
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}
	
	@Test
	public void onlyOfType() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1guixukvzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.onlyOfType",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41468,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1guixukvzw(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41468);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41469);final Elements sel = html.select(":only-of-type");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41470);assertEquals(6, sel.size());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41471);assertEquals("head", sel.get(0).tagName());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41472);assertEquals("body", sel.get(1).tagName());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41473);assertEquals("span", sel.get(2).tagName());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41474);assertEquals("br", sel.get(3).tagName());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41475);assertEquals("p", sel.get(4).tagName());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41476);assertTrue(sel.get(4).hasClass("empty"));
		__CLR4_4_1vwovwolh9yvhue.R.inc(41477);assertEquals("em", sel.get(5).tagName());
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}
	
	protected void check(Elements result, String...expectedContent ) {try{__CLR4_4_1vwovwolh9yvhue.R.inc(41478);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41479);assertEquals("Number of elements", expectedContent.length, result.size());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41480);for (int i = 0; (((i < expectedContent.length)&&(__CLR4_4_1vwovwolh9yvhue.R.iget(41481)!=0|true))||(__CLR4_4_1vwovwolh9yvhue.R.iget(41482)==0&false)); i++) {{
			__CLR4_4_1vwovwolh9yvhue.R.inc(41483);assertNotNull(result.get(i));
			__CLR4_4_1vwovwolh9yvhue.R.inc(41484);assertEquals("Expected element",expectedContent[i], result.get(i).ownText());
		}
	}}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

	
	@Test
	public void root() {__CLR4_4_1vwovwolh9yvhue.R.globalSliceStart(getClass().getName(),41485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rnvqw9w0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1vwovwolh9yvhue.R.rethrow($CLV_t2$);}finally{__CLR4_4_1vwovwolh9yvhue.R.globalSliceEnd(getClass().getName(),"org.jsoup.select.CssTest.root",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),41485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rnvqw9w0d(){try{__CLR4_4_1vwovwolh9yvhue.R.inc(41485);
		__CLR4_4_1vwovwolh9yvhue.R.inc(41486);Elements sel = html.select(":root");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41487);assertEquals(1, sel.size());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41488);assertNotNull(sel.get(0));
		__CLR4_4_1vwovwolh9yvhue.R.inc(41489);assertEquals(Tag.valueOf("html"), sel.get(0).tag());

		__CLR4_4_1vwovwolh9yvhue.R.inc(41490);Elements sel2 = html.select("body").select(":root");
		__CLR4_4_1vwovwolh9yvhue.R.inc(41491);assertEquals(1, sel2.size());
		__CLR4_4_1vwovwolh9yvhue.R.inc(41492);assertNotNull(sel2.get(0));
		__CLR4_4_1vwovwolh9yvhue.R.inc(41493);assertEquals(Tag.valueOf("body"), sel2.get(0).tag());
	}finally{__CLR4_4_1vwovwolh9yvhue.R.flushNeeded();}}

}
