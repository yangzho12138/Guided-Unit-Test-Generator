/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * A HTML Form Element provides ready access to the form fields/controls that are associated with it. It also allows a
 * form to easily be submitted.
 */
public class FormElement extends Element {public static class __CLR4_4_13vf3vflh9yvgla{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,5087,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Elements elements = new Elements();

    /**
     * Create a new, standalone form element.
     *
     * @param tag        tag of this element
     * @param baseUri    the base URI
     * @param attributes initial attributes
     */
    public FormElement(Tag tag, String baseUri, Attributes attributes) {
        super(tag, baseUri, attributes);__CLR4_4_13vf3vflh9yvgla.R.inc(5020);try{__CLR4_4_13vf3vflh9yvgla.R.inc(5019);
    }finally{__CLR4_4_13vf3vflh9yvgla.R.flushNeeded();}}

    /**
     * Get the list of form control elements associated with this form.
     * @return form controls associated with this element.
     */
    public Elements elements() {try{__CLR4_4_13vf3vflh9yvgla.R.inc(5021);
        __CLR4_4_13vf3vflh9yvgla.R.inc(5022);return elements;
    }finally{__CLR4_4_13vf3vflh9yvgla.R.flushNeeded();}}

    /**
     * Add a form control element to this form.
     * @param element form control to add
     * @return this form element, for chaining
     */
    public FormElement addElement(Element element) {try{__CLR4_4_13vf3vflh9yvgla.R.inc(5023);
        __CLR4_4_13vf3vflh9yvgla.R.inc(5024);elements.add(element);
        __CLR4_4_13vf3vflh9yvgla.R.inc(5025);return this;
    }finally{__CLR4_4_13vf3vflh9yvgla.R.flushNeeded();}}

    @Override
    protected void removeChild(Node out) {try{__CLR4_4_13vf3vflh9yvgla.R.inc(5026);
        __CLR4_4_13vf3vflh9yvgla.R.inc(5027);super.removeChild(out);
        __CLR4_4_13vf3vflh9yvgla.R.inc(5028);elements.remove(out);
    }finally{__CLR4_4_13vf3vflh9yvgla.R.flushNeeded();}}

    /**
     * Prepare to submit this form. A Connection object is created with the request set up from the form values. You
     * can then set up other options (like user-agent, timeout, cookies), then execute it.
     * @return a connection prepared from the values of this form.
     * @throws IllegalArgumentException if the form's absolute action URL cannot be determined. Make sure you pass the
     * document's base URI when parsing.
     */
    public Connection submit() {try{__CLR4_4_13vf3vflh9yvgla.R.inc(5029);
        __CLR4_4_13vf3vflh9yvgla.R.inc(5030);String action = (((hasAttr("action") )&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5031)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5032)==0&false))? absUrl("action") : baseUri();
        __CLR4_4_13vf3vflh9yvgla.R.inc(5033);Validate.notEmpty(action, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.");
        __CLR4_4_13vf3vflh9yvgla.R.inc(5034);Connection.Method method = (((attr("method").toUpperCase().equals("POST") )&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5035)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5036)==0&false))?
                Connection.Method.POST : Connection.Method.GET;

        __CLR4_4_13vf3vflh9yvgla.R.inc(5037);return Jsoup.connect(action)
                .data(formData())
                .method(method);
    }finally{__CLR4_4_13vf3vflh9yvgla.R.flushNeeded();}}

    /**
     * Get the data that this form submits. The returned list is a copy of the data, and changes to the contents of the
     * list will not be reflected in the DOM.
     * @return a list of key vals
     */
    public List<Connection.KeyVal> formData() {try{__CLR4_4_13vf3vflh9yvgla.R.inc(5038);
        __CLR4_4_13vf3vflh9yvgla.R.inc(5039);ArrayList<Connection.KeyVal> data = new ArrayList<>();

        // iterate the form control elements and accumulate their values
        __CLR4_4_13vf3vflh9yvgla.R.inc(5040);for (Element el: elements) {{
            __CLR4_4_13vf3vflh9yvgla.R.inc(5041);if ((((!el.tag().isFormSubmittable())&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5042)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5043)==0&false))) {__CLR4_4_13vf3vflh9yvgla.R.inc(5044);continue; // contents are form listable, superset of submitable
            }__CLR4_4_13vf3vflh9yvgla.R.inc(5045);if ((((el.hasAttr("disabled"))&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5046)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5047)==0&false))) {__CLR4_4_13vf3vflh9yvgla.R.inc(5048);continue; // skip disabled form inputs
            }__CLR4_4_13vf3vflh9yvgla.R.inc(5049);String name = el.attr("name");
            __CLR4_4_13vf3vflh9yvgla.R.inc(5050);if ((((name.length() == 0)&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5051)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5052)==0&false))) {__CLR4_4_13vf3vflh9yvgla.R.inc(5053);continue;
            }__CLR4_4_13vf3vflh9yvgla.R.inc(5054);String type = el.attr("type");

            __CLR4_4_13vf3vflh9yvgla.R.inc(5055);if ((((type.equalsIgnoreCase("button"))&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5056)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5057)==0&false))) {__CLR4_4_13vf3vflh9yvgla.R.inc(5058);continue; // browsers don't submit these

            }__CLR4_4_13vf3vflh9yvgla.R.inc(5059);if (((("select".equals(el.normalName()))&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5060)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5061)==0&false))) {{
                __CLR4_4_13vf3vflh9yvgla.R.inc(5062);Elements options = el.select("option[selected]");
                __CLR4_4_13vf3vflh9yvgla.R.inc(5063);boolean set = false;
                __CLR4_4_13vf3vflh9yvgla.R.inc(5064);for (Element option: options) {{
                    __CLR4_4_13vf3vflh9yvgla.R.inc(5065);data.add(HttpConnection.KeyVal.create(name, option.val()));
                    __CLR4_4_13vf3vflh9yvgla.R.inc(5066);set = true;
                }
                }__CLR4_4_13vf3vflh9yvgla.R.inc(5067);if ((((!set)&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5068)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5069)==0&false))) {{
                    __CLR4_4_13vf3vflh9yvgla.R.inc(5070);Element option = el.select("option").first();
                    __CLR4_4_13vf3vflh9yvgla.R.inc(5071);if ((((option != null)&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5072)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5073)==0&false)))
                        {__CLR4_4_13vf3vflh9yvgla.R.inc(5074);data.add(HttpConnection.KeyVal.create(name, option.val()));
                }}
            }} }else {__CLR4_4_13vf3vflh9yvgla.R.inc(5075);if (((("checkbox".equalsIgnoreCase(type) || "radio".equalsIgnoreCase(type))&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5076)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5077)==0&false))) {{
                // only add checkbox or radio if they have the checked attribute
                __CLR4_4_13vf3vflh9yvgla.R.inc(5078);if ((((el.hasAttr("checked"))&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5079)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5080)==0&false))) {{
                    __CLR4_4_13vf3vflh9yvgla.R.inc(5081);final String val = (((el.val().length() >  0 )&&(__CLR4_4_13vf3vflh9yvgla.R.iget(5082)!=0|true))||(__CLR4_4_13vf3vflh9yvgla.R.iget(5083)==0&false))? el.val() : "on";
                    __CLR4_4_13vf3vflh9yvgla.R.inc(5084);data.add(HttpConnection.KeyVal.create(name, val));
                }
            }} }else {{
                __CLR4_4_13vf3vflh9yvgla.R.inc(5085);data.add(HttpConnection.KeyVal.create(name, el.val()));
            }
        }}}
        }__CLR4_4_13vf3vflh9yvgla.R.inc(5086);return data;
    }finally{__CLR4_4_13vf3vflh9yvgla.R.flushNeeded();}}
}
