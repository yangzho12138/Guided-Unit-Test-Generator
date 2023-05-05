/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests for FormElement
 *
 * @author Jonathan Hedley
 */
public class FormElementTest {static class __CLR4_4_1uavuavlh9yvhq2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255516450L,8589935092L,39365,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test public void hasAssociatedControls() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1vz4fvnuav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.hasAssociatedControls",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39271,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1vz4fvnuav(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39271);
        //"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39272);String html = "<form id=1><button id=1><fieldset id=2 /><input id=3><keygen id=4><object id=5><output id=6>" +
                "<select id=7><option></select><textarea id=8><p id=9>";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39273);Document doc = Jsoup.parse(html);

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39274);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39275);assertEquals(8, form.elements().size());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void createsFormData() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_173ucssub0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.createsFormData",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_173ucssub0(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39276);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39277);String html = "<form><input name='one' value='two'><select name='three'><option value='not'>" +
                "<option value='four' selected><option value='five' selected><textarea name=six>seven</textarea>" +
                "<input name='seven' type='radio' value='on' checked><input name='seven' type='radio' value='off'>" +
                "<input name='eight' type='checkbox' checked><input name='nine' type='checkbox' value='unset'>" +
                "<input name='ten' value='text' disabled>" +
                "<input name='eleven' value='text' type='button'>" +
                "</form>";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39278);Document doc = Jsoup.parse(html);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39279);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39280);List<Connection.KeyVal> data = form.formData();

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39281);assertEquals(6, data.size());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39282);assertEquals("one=two", data.get(0).toString());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39283);assertEquals("three=four", data.get(1).toString());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39284);assertEquals("three=five", data.get(2).toString());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39285);assertEquals("six=seven", data.get(3).toString());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39286);assertEquals("seven=on", data.get(4).toString()); // set
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39287);assertEquals("eight=on", data.get(5).toString()); // default
        // nine should not appear, not checked checkbox
        // ten should not appear, disabled
        // eleven should not appear, button
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void formDataUsesFirstAttribute() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qjbey5ubc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.formDataUsesFirstAttribute",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qjbey5ubc(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39288);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39289);String html = "<form><input name=test value=foo name=test2 value=bar>";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39290);Document doc = Jsoup.parse(html);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39291);FormElement form = (FormElement) doc.selectFirst("form");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39292);assertEquals("test=foo", form.formData().get(0).toString());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void createsSubmitableConnection() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jicnvyubh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.createsSubmitableConnection",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jicnvyubh(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39293);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39294);String html = "<form action='/search'><input name='q'></form>";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39295);Document doc = Jsoup.parse(html, "http://example.com/");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39296);doc.select("[name=q]").attr("value", "jsoup");

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39297);FormElement form = ((FormElement) doc.select("form").first());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39298);Connection con = form.submit();

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39299);assertEquals(Connection.Method.GET, con.request().method());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39300);assertEquals("http://example.com/search", con.request().url().toExternalForm());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39301);List<Connection.KeyVal> dataList = (List<Connection.KeyVal>) con.request().data();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39302);assertEquals("q=jsoup", dataList.get(0).toString());

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39303);doc.select("form").attr("method", "post");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39304);Connection con2 = form.submit();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39305);assertEquals(Connection.Method.POST, con2.request().method());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void actionWithNoValue() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y08kzfubu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.actionWithNoValue",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y08kzfubu(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39306);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39307);String html = "<form><input name='q'></form>";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39308);Document doc = Jsoup.parse(html, "http://example.com/");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39309);FormElement form = ((FormElement) doc.select("form").first());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39310);Connection con = form.submit();

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39311);assertEquals("http://example.com/", con.request().url().toExternalForm());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void actionWithNoBaseUri() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ywxj8luc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.actionWithNoBaseUri",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ywxj8luc0(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39312);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39313);String html = "<form><input name='q'></form>";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39314);Document doc = Jsoup.parse(html);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39315);FormElement form = ((FormElement) doc.select("form").first());


        __CLR4_4_1uavuavlh9yvhq2.R.inc(39316);boolean threw = false;
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39317);try {
            __CLR4_4_1uavuavlh9yvhq2.R.inc(39318);Connection con = form.submit();
        } catch (IllegalArgumentException e) {
            __CLR4_4_1uavuavlh9yvhq2.R.inc(39319);threw = true;
            __CLR4_4_1uavuavlh9yvhq2.R.inc(39320);assertEquals("Could not determine a form action URL for submit. Ensure you set a base URI when parsing.",
                    e.getMessage());
        }
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39321);assertTrue(threw);
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void formsAddedAfterParseAreFormElements() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14xoei6uca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.formsAddedAfterParseAreFormElements",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39322,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14xoei6uca(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39322);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39323);Document doc = Jsoup.parse("<body />");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39324);doc.body().html("<form action='http://example.com/search'><input name='q' value='search'>");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39325);Element formEl = doc.select("form").first();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39326);assertTrue(formEl instanceof FormElement);

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39327);FormElement form = (FormElement) formEl;
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39328);assertEquals(1, form.elements().size());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void controlsAddedAfterParseAreLinkedWithForms() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1x51nlouch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.controlsAddedAfterParseAreLinkedWithForms",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1x51nlouch(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39329);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39330);Document doc = Jsoup.parse("<body />");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39331);doc.body().html("<form />");

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39332);Element formEl = doc.select("form").first();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39333);formEl.append("<input name=foo value=bar>");

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39334);assertTrue(formEl instanceof FormElement);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39335);FormElement form = (FormElement) formEl;
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39336);assertEquals(1, form.elements().size());

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39337);List<Connection.KeyVal> data = form.formData();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39338);assertEquals("foo=bar", data.get(0).toString());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void usesOnForCheckboxValueIfNoValueSet() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1f70g4mucr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.usesOnForCheckboxValueIfNoValueSet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39339,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1f70g4mucr(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39339);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39340);Document doc = Jsoup.parse("<form><input type=checkbox checked name=foo></form>");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39341);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39342);List<Connection.KeyVal> data = form.formData();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39343);assertEquals("on", data.get(0).value());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39344);assertEquals("foo", data.get(0).key());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void adoptedFormsRetainInputs() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_161wyqzucx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.adoptedFormsRetainInputs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_161wyqzucx(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39345);
        // test for https://github.com/jhy/jsoup/issues/249
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39346);String html = "<html>\n" +
                "<body>  \n" +
                "  <table>\n" +
                "      <form action=\"/hello.php\" method=\"post\">\n" +
                "      <tr><td>User:</td><td> <input type=\"text\" name=\"user\" /></td></tr>\n" +
                "      <tr><td>Password:</td><td> <input type=\"password\" name=\"pass\" /></td></tr>\n" +
                "      <tr><td><input type=\"submit\" name=\"login\" value=\"login\" /></td></tr>\n" +
                "   </form>\n" +
                "  </table>\n" +
                "</body>\n" +
                "</html>";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39347);Document doc = Jsoup.parse(html);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39348);FormElement form = (FormElement) doc.select("form").first();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39349);List<Connection.KeyVal> data = form.formData();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39350);assertEquals(3, data.size());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39351);assertEquals("user", data.get(0).key());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39352);assertEquals("pass", data.get(1).key());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39353);assertEquals("login", data.get(2).key());
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}

    @Test public void removeFormElement() {__CLR4_4_1uavuavlh9yvhq2.R.globalSliceStart(getClass().getName(),39354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l64vgbud6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1uavuavlh9yvhq2.R.rethrow($CLV_t2$);}finally{__CLR4_4_1uavuavlh9yvhq2.R.globalSliceEnd(getClass().getName(),"org.jsoup.nodes.FormElementTest.removeFormElement",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),39354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l64vgbud6(){try{__CLR4_4_1uavuavlh9yvhq2.R.inc(39354);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39355);String html = "<html>\n" +
                "  <body> \n" +
                "      <form action=\"/hello.php\" method=\"post\">\n" +
                "      User:<input type=\"text\" name=\"user\" />\n" +
                "      Password:<input type=\"password\" name=\"pass\" />\n" +
                "      <input type=\"submit\" name=\"login\" value=\"login\" />\n" +
                "   </form>\n" +
                "  </body>\n" +
                "</html>  ";
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39356);Document doc = Jsoup.parse(html);
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39357);FormElement form = (FormElement) doc.selectFirst("form");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39358);Element pass = form.selectFirst("input[name=pass]");
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39359);pass.remove();

        __CLR4_4_1uavuavlh9yvhq2.R.inc(39360);List<Connection.KeyVal> data = form.formData();
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39361);assertEquals(2, data.size());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39362);assertEquals("user", data.get(0).key());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39363);assertEquals("login", data.get(1).key());
        __CLR4_4_1uavuavlh9yvhq2.R.inc(39364);assertEquals(null, doc.selectFirst("input[name=pass]"));
    }finally{__CLR4_4_1uavuavlh9yvhq2.R.flushNeeded();}}
}
