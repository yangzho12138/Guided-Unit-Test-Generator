package org.jsoup.mytests;
import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import org.jsoup.examples.*;
import org.jsoup.parser.*;
import org.jsoup.helper.*;
import org.jsoup.internal.*;
import org.jsoup.safety.*;
import org.jsoup.*;

public class AutomatedTest {
    @Test
    public void testAttributesget32110810() {
        Attributes attributes = new Attributes();
        attributes.get("hree");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesget14721() {
        Attributes attributes = new Attributes();
        attributes.get("-.");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesget17571249782() {
        Attributes attributes = new Attributes();
        attributes.get(":empty");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesget11153() {
        Attributes attributes = new Attributes();
        attributes.get("!=");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesget29224() {
        Attributes attributes = new Attributes();
        attributes.get("\'");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesgetIgnoreCase1857353270() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("US-ASCII");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesgetIgnoreCase807731721() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("optgrouq");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesgetIgnoreCase1102563202() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("text.");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesgetIgnoreCase3081290273() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase(":last-chilc");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesgetIgnoreCase35118024() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("rubz");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesadd31114340() {
        Attributes attributes = new Attributes();
        attributes.add("~<","abs9");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesadd15021562761() {
        Attributes attributes = new Attributes();
        attributes.add(":nth-of-type)","te");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesadd1083638052() {
        Attributes attributes = new Attributes();
        attributes.add("^>","radip");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesadd1008333153() {
        Attributes attributes = new Attributes();
        attributes.add("forn","htto");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesadd1913276754() {
        Attributes attributes = new Attributes();
        attributes.add("UTF.","text.");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput1784260560() {
        Attributes attributes = new Attributes();
        attributes.put("scripu","DOCTYPF");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput19919432971() {
        Attributes attributes = new Attributes();
        attributes.put("tbodx","actiom");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput10967337912() {
        Attributes attributes = new Attributes();
        attributes.put("radin",":first-of-typd");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput8736476083() {
        Attributes attributes = new Attributes();
        attributes.put("text0","namd");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput18628266394() {
        Attributes attributes = new Attributes();
        attributes.put("colgrouq","table");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput1045871090() {
        Attributes attributes = new Attributes();
        attributes.put("name",);
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput8784004181() {
        Attributes attributes = new Attributes();
        attributes.put(":last-of-typd",);
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput996121982() {
        Attributes attributes = new Attributes();
        attributes.put("htmk",);
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput19817296533() {
        Attributes attributes = new Attributes();
        attributes.put("templatf",);
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput9987052794() {
        Attributes attributes = new Attributes();
        attributes.put(":contains(",);
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput3880431240() {
        Attributes attributes = new Attributes();
        attributes.put();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput631() {
        Attributes attributes = new Attributes();
        attributes.put();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput322() {
        Attributes attributes = new Attributes();
        attributes.put();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput323() {
        Attributes attributes = new Attributes();
        attributes.put();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesput18738595964() {
        Attributes attributes = new Attributes();
        attributes.put();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremove39980() {
        Attributes attributes = new Attributes();
        attributes.remove("~=");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremove37411() {
        Attributes attributes = new Attributes();
        attributes.remove("tr");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremove7390744122() {
        Attributes attributes = new Attributes();
        attributes.remove("charseu");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremove2709408273() {
        Attributes attributes = new Attributes();
        attributes.remove("disabled");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremove13776877284() {
        Attributes attributes = new Attributes();
        attributes.remove("buttom");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremoveIgnoreCase14229508270() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("action");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremoveIgnoreCase1281() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("a");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremoveIgnoreCase37422() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("ts");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremoveIgnoreCase1102563223() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("text0");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesremoveIgnoreCase1102773764() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("tfoos");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKey567593350() {
        Attributes attributes = new Attributes();
        attributes.hasKey(":has(");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKey1082706171() {
        Attributes attributes = new Attributes();
        attributes.hasKey("radin");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKey9060216042() {
        Attributes attributes = new Attributes();
        attributes.hasKey("selecu");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKey923503() {
        Attributes attributes = new Attributes();
        attributes.hasKey("]]?");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKey570706504() {
        Attributes attributes = new Attributes();
        attributes.hasKey(":roos");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKeyIgnoreCase35756400() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("typd");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKeyIgnoreCase2709408281() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("disablee");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKeyIgnoreCase15368918732() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("checkbow");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKeyIgnoreCase39983() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("~=");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshasKeyIgnoreCase12269463004() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase(":containsData(");
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributessize10() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributessize11() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributessize12() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributessize13() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributessize14() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesisEmpty10() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesisEmpty11() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesisEmpty12() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesisEmpty13() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesisEmpty14() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesaddAll2824321650() {
        Attributes attributes = new Attributes();
        attributes.addAll();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesaddAll18432892591() {
        Attributes attributes = new Attributes();
        attributes.addAll();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesaddAll20504041212() {
        Attributes attributes = new Attributes();
        attributes.addAll();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesaddAll15614086493() {
        Attributes attributes = new Attributes();
        attributes.addAll();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesaddAll18738595964() {
        Attributes attributes = new Attributes();
        attributes.addAll();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesasList10() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesasList11() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesasList12() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesasList13() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesasList14() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdataset10() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdataset11() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdataset12() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdataset13() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdataset14() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshtml10() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshtml11() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshtml12() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshtml13() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributeshtml14() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesnormalize10() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesnormalize11() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesnormalize12() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesnormalize13() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesnormalize14() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdeduplicate320() {
        Attributes attributes = new Attributes();
        attributes.deduplicate();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdeduplicate321() {
        Attributes attributes = new Attributes();
        attributes.deduplicate();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdeduplicate3880431242() {
        Attributes attributes = new Attributes();
        attributes.deduplicate();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdeduplicate1885761753() {
        Attributes attributes = new Attributes();
        attributes.deduplicate();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testAttributesdeduplicate634() {
        Attributes attributes = new Attributes();
        attributes.deduplicate();
        assertTrue(attributes.equals(attributes));
        try {
            attributes.equals(attributes);
        } catch (Exception e) {
            fail("attributes.equals(attributes) throws an exception");
        }
        try {
            attributes.hashCode();
        } catch (Exception e) {
            fail("attributes.hashCode() throws an exception");
        }
        try {
            attributes.toString();
        } catch (Exception e) {
            fail("attributes.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisNamedEntity10101369410() {
        Entities entities = new Entities();
        entities.isNamedEntity("optiom");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisNamedEntity33701() {
        Entities entities = new Entities();
        entities.isNamedEntity("hs");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisNamedEntity7423139272() {
        Entities entities = new Entities();
        entities.isNamedEntity("checkee");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisNamedEntity12174874143() {
        Entities entities = new Entities();
        entities.isNamedEntity("hiddeo");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisNamedEntity34844() {
        Entities entities = new Entities();
        entities.isNamedEntity("li");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisBaseNamedEntity33040() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("h1");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisBaseNamedEntity10761623181() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":contains(");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisBaseNamedEntity1188392() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("xmm");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisBaseNamedEntity20919604283() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":only-child");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesisBaseNamedEntity2882752474() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":nth-child'");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetCharacterByName17209582720() {
        Entities entities = new Entities();
        entities.getCharacterByName("basefonu");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetCharacterByName13215466001() {
        Entities entities = new Entities();
        entities.getCharacterByName("templatd");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetCharacterByName11912143962() {
        Entities entities = new Entities();
        entities.getCharacterByName("iframf");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetCharacterByName1223() {
        Entities entities = new Entities();
        entities.getCharacterByName("[");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetCharacterByName9503947314() {
        Entities entities = new Entities();
        entities.getCharacterByName("commane");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetByName7390744100() {
        Entities entities = new Entities();
        entities.getByName("charses");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetByName1101578771() {
        Entities entities = new Entities();
        entities.getByName("tbody");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetByName18912061172() {
        Entities entities = new Entities();
        entities.getByName(":nth-of-type'");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetByName12083() {
        Entities entities = new Entities();
        entities.getByName("$=");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesgetByName16183955594() {
        Entities entities = new Entities();
        entities.getByName(":only-of-typd");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiescodepointsForName10813248940() {
        Entities entities = new Entities();
        entities.codepointsForName(":lt(",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99});
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiescodepointsForName16677939101() {
        Entities entities = new Entities();
        entities.codepointsForName("hs",new int[]{0,-1,55296});
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiescodepointsForName19784106432() {
        Entities entities = new Entities();
        entities.codepointsForName("noembec",new int[]{});
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiescodepointsForName18000114233() {
        Entities entities = new Entities();
        entities.codepointsForName(":has)",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100,55396,101,102,103,239,240,1114211,500,187});
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiescodepointsForName456720754() {
        Entities entities = new Entities();
        entities.codepointsForName("inpuu",new int[]{0,-1,55296,192,1,55297,2,3,4,199});
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape16549179790() {
        Entities entities = new Entities();
        entities.escape("basd",);
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape8380763711() {
        Entities entities = new Entities();
        entities.escape("textareb",);
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape14650778712() {
        Entities entities = new Entities();
        entities.escape("meta",);
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape2861959813() {
        Entities entities = new Entities();
        entities.escape("form",);
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape7587553054() {
        Entities entities = new Entities();
        entities.escape("command",);
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape9060216040() {
        Entities entities = new Entities();
        entities.escape("selecu");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape9060216061() {
        Entities entities = new Entities();
        entities.escape("selecs");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape2882752492() {
        Entities entities = new Entities();
        entities.escape(":nth-child)");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape9060216053() {
        Entities entities = new Entities();
        entities.escape("select");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesescape15451126504() {
        Entities entities = new Entities();
        entities.escape("deflate");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesunescape570706520() {
        Entities entities = new Entities();
        entities.unescape(":roou");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesunescape35756421() {
        Entities entities = new Entities();
        entities.unescape("typf");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesunescape2709408262() {
        Entities entities = new Entities();
        entities.unescape("disablec");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesunescape10761623183() {
        Entities entities = new Entities();
        entities.unescape(":contains(");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testEntitiesunescape1044184() {
        Entities entities = new Entities();
        entities.unescape("img");
        assertTrue(entities.equals(entities));
        try {
            entities.equals(entities);
        } catch (Exception e) {
            fail("entities.equals(entities) throws an exception");
        }
        try {
            entities.hashCode();
        } catch (Exception e) {
            fail("entities.hashCode() throws an exception");
        }
        try {
            entities.toString();
        } catch (Exception e) {
            fail("entities.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin16505111320() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"https");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin56621() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"tq");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin17170134482() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"noscripu");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin16814400703() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"basf");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin8864636714() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"linl");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin8601463870() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,":lt(");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin12728841141() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,":nth-last-child'");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin1003590812() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"inpus");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin20397758603() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"xmm");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin2746521314() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(,"Set-Cookie");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin1988328270() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type"},"checkee");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin11117946231() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","boundarx","imf","imh","link","linl","linj","basefont","basefonu","head","heae","nobs","nobr","nobq",":empty","commane",":emptx","#texs","rubx","command","rubz"},"*|");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin6747049452() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf"},"*>");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin18994404413() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","boundarx","imf","imh","link","linl","linj","basefont","basefonu","head","heae","nobs","nobr","nobq",":empty","commane",":emptx","#texs","rubx","command","rubz"},"ode");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtiljoin18110883954() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq"},"colgrouo");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilpadding2180() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilpadding573731() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilpadding352() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilpadding2223() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilpadding1314() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisBlank31255600() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("evem");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisBlank33681() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("hq");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisBlank10176250962() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank(":nth-last-of-type'");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisBlank31255603() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("evem");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisBlank14562253634() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank(":matches'");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisNumeric31255600() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("evem");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisNumeric31490281() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("forn");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisNumeric29875582() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("abs9");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisNumeric358799203() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("#texu");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisNumeric1103269004() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("theae");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisWhitespace320() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisWhitespace4321() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisWhitespace692() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisWhitespace313() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisWhitespace553274() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisActuallyWhitespace350() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisActuallyWhitespace2301() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisActuallyWhitespace2702() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisActuallyWhitespace2183() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisActuallyWhitespace553284() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisInvisibleChar4320() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisInvisibleChar573731() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisInvisibleChar1332() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisInvisibleChar1313() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilisInvisibleChar573734() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilnormaliseWhitespace358799200() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("#texu");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilnormaliseWhitespace6361976011() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("colgrouq");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilnormaliseWhitespace19392() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("<0");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilnormaliseWhitespace1003581223() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("inpuu");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilnormaliseWhitespace19732341974() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("plaintexs");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilappendNormalisedWhitespace14801608920() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(,"template",);
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilappendNormalisedWhitespace10264729731() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(,"selecs",);
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilappendNormalisedWhitespace3290780912() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(,"charset",);
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilappendNormalisedWhitespace30903193() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(,"cok",);
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilappendNormalisedWhitespace32679804() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(,"img",);
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilin8917707030() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("style","de");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilin1354406031() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("htmk","#roos");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilin8763685322() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("tfoou",".");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilin33214213() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("lh","http");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilin14477732404() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("noembee",":nth-child'");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilinSorted12187091470() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("th",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http"});
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilinSorted13616377361() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("noscripu",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http"});
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilinSorted8625587032() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted(":matches)",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'"});
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilinSorted12844095343() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted(":emptz",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com"});
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilinSorted4209829524() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("actioo",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou"});
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve7984944240() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(,":root");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve16818412981() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(,"UTF-");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve8555639612() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(,"!<");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve6872456283() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(,":nth-last-of-type)");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve16843421954() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(,"svh");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve566873260() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(":eq'","lj");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve11539909511() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("head",":first-chile");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve13693439842() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(":only-of-typf","$=");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve3932680023() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("nobr",":nth-child)");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilresolve16449161644() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("$>","frameset");
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilborrowBuilder10() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilborrowBuilder11() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilborrowBuilder12() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilborrowBuilder13() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilborrowBuilder14() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilreleaseBuilder13612897780() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilreleaseBuilder15614086491() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilreleaseBuilder15614086492() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilreleaseBuilder2664372633() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testStringUtilreleaseBuilder314() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder();
        assertTrue(stringutil.equals(stringutil));
        try {
            stringutil.equals(stringutil);
        } catch (Exception e) {
            fail("stringutil.equals(stringutil) throws an exception");
        }
        try {
            stringutil.hashCode();
        } catch (Exception e) {
            fail("stringutil.hashCode() throws an exception");
        }
        try {
            stringutil.toString();
        } catch (Exception e) {
            fail("stringutil.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizerlowerCase33868650() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("nobs");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizerlowerCase9503947311() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("commane");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizerlowerCase922() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("=");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizerlowerCase39983() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("~=");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizerlowerCase11912143984() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("iframd");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizernormalize14711890860() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize(":nth-last-child)");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizernormalize31255611() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("even");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizernormalize33737382() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("name");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizernormalize1605222323() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("bgsounc");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testNormalizernormalize807731734() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("optgroup");
        assertTrue(normalizer.equals(normalizer));
        try {
            normalizer.equals(normalizer);
        } catch (Exception e) {
            fail("normalizer.equals(normalizer) throws an exception");
        }
        try {
            normalizer.hashCode();
        } catch (Exception e) {
            fail("normalizer.hashCode() throws an exception");
        }
        try {
            normalizer.toString();
        } catch (Exception e) {
            fail("normalizer.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamwrap15701257550() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(,,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamwrap15701315611() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(,,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamwrap16517582442() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(,,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamwrap308163() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(,,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamwrap9515700254() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(,,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamreadToByteBuffer2710() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamreadToByteBuffer2301() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamreadToByteBuffer352() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamreadToByteBuffer553273() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamreadToByteBuffer2714() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamtimeout9610() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamtimeout9931() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamtimeout10602() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamtimeout10603() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testConstrainableInputStreamtimeout41614() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(,);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
        try {
            constrainableinputstream.equals(constrainableinputstream);
        } catch (Exception e) {
            fail("constrainableinputstream.equals(constrainableinputstream) throws an exception");
        }
        try {
            constrainableinputstream.hashCode();
        } catch (Exception e) {
            fail("constrainableinputstream.hashCode() throws an exception");
        }
        try {
            constrainableinputstream.toString();
        } catch (Exception e) {
            fail("constrainableinputstream.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse1102320670() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("template",":only-chile");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse7317081231() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("noembee",":nth-of-type(");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse20959717172() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("plaintexu",":matchesOwn)");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse7427584823() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("xmp","charset");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse1004065894() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("^<","imagd");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse21415288040() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("checkbox",":nth-last-child(",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse17456644351() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(":lt)","http-equiw",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse15653419912() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("~<","^>",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse9887065643() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("xmk",":only-of-type",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse3957752394() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("select","inpus",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse33700() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("hs");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse20913044561() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("isindey");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse37312() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("th");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse20353119913() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(":first-of-typd");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse10548386284() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(":first-child");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupconnect33737370() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("namd");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupconnect37261() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("tc");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupconnect1252() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("^");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupconnect1605222313() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("bgsound");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupconnect17209582744() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("basefons");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse18284891750() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"tbodz","htto");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse5789250161() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"http","$<");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse10580213922() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"lh",":nth-of-type(");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse350661943() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"#texu","Set-Cookif");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse1257424() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"^>","tc");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse15139756280() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,":nth-of-type)");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse1102572831() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"text0");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse33489352() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"metb");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse16276971673() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,":has)");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse15576467664() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"action");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse10215332620() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"inpus",":nth-last-of-type)");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse1430017531() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"#roos",":emptz");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse15867849152() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"checkboy","h3");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse4200289003() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,":gt)","http:/");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse4830269804() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"command","svf");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse15366189670() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"matg","action",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse11205181901() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"noframet",":nth-last-of-type)",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse18490916342() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,":all","p",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse9114957053() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,"sarcasn","[a-zA-Z_:][-a-zA-Z0-9_:.])",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse13533161574() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,":last-chile","#roos",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment4126639380() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("optgroup","isindey");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment31519111() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("?","forn");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment11482425612() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("isindex","checkee");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment7390767683() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(".","charseu");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment988657494() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("gzio","h5");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment9503947300() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("command");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment31490261() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("forl");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment1188422() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("xmp");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment19804204653() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("Set-Cookif");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparseBodyFragment3081290264() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":last-child");
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse1655197660() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse8555649421() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse11601419752() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse7496896553() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupparse20398942674() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean8046886970() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("span","abs;",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean19668233181() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("caption","command",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean12830876722() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("templatf","html",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean12003498953() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("tfoot","disablee",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean2205726454() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("noembec",":matches)",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean996109990() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("htmk",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean4227116091() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("radio",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean20685287632() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("[a-zA-Z_:][-a-zA-Z0-9_:.]*",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean4849355153() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("eveo",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean1108449034() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("type",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean14071732820() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":only-of-type","htmk",,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean18587489251() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("linl","hr",,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean16572028822() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("#roos","bq",,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean14032873943() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("dt","tabld",,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupclean10135554744() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("</","tfoos",,);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupisValid19307548880() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid(":lt(",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupisValid9063693271() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("meta",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupisValid6914969652() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("tbody",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupisValid8187961803() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("httpr",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testJsoupisValid2984511534() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid(":first-child",);
        assertTrue(jsoup.equals(jsoup));
        try {
            jsoup.equals(jsoup);
        } catch (Exception e) {
            fail("jsoup.equals(jsoup) throws an exception");
        }
        try {
            jsoup.hashCode();
        } catch (Exception e) {
            fail("jsoup.hashCode() throws an exception");
        }
        try {
            jsoup.toString();
        } catch (Exception e) {
            fail("jsoup.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput6793973440() {
        Parser parser = new Parser();
        parser.parseInput("bgsounc",":alm");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput1061767441() {
        Parser parser = new Parser();
        parser.parseInput("link","heae");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput13540090872() {
        Parser parser = new Parser();
        parser.parseInput(":last-chilc",":containsOwn)");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput8534426233() {
        Parser parser = new Parser();
        parser.parseInput("noscript","h2");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput386924554() {
        Parser parser = new Parser();
        parser.parseInput("]]>","#roos");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput13240906780() {
        Parser parser = new Parser();
        parser.parseInput(,"boundary");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput13068906601() {
        Parser parser = new Parser();
        parser.parseInput(,"[CDATA[");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput20919585052() {
        Parser parser = new Parser();
        parser.parseInput(,":only-chile");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput7463418693() {
        Parser parser = new Parser();
        parser.parseInput(,"meta");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseInput5737064724() {
        Parser parser = new Parser();
        parser.parseInput(,":nth-child(");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragmentInput10004356770() {
        Parser parser = new Parser();
        parser.parseFragmentInput("\'",,"textare`");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragmentInput9065734321() {
        Parser parser = new Parser();
        parser.parseFragmentInput("frameses",,"tc");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragmentInput4900066792() {
        Parser parser = new Parser();
        parser.parseFragmentInput(":has)",,":matches'");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragmentInput1894012623() {
        Parser parser = new Parser();
        parser.parseFragmentInput("htmk",,":nth-last-of-type'");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragmentInput14109250394() {
        Parser parser = new Parser();
        parser.parseFragmentInput("imf",,"gzip");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetTreeBuilder10() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetTreeBuilder11() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetTreeBuilder12() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetTreeBuilder13() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetTreeBuilder14() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTreeBuilder13612897780() {
        Parser parser = new Parser();
        parser.setTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTreeBuilder8025812341() {
        Parser parser = new Parser();
        parser.setTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTreeBuilder15614086492() {
        Parser parser = new Parser();
        parser.setTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTreeBuilder633() {
        Parser parser = new Parser();
        parser.setTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTreeBuilder18432892594() {
        Parser parser = new Parser();
        parser.setTreeBuilder();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserisTrackErrors10() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserisTrackErrors11() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserisTrackErrors12() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserisTrackErrors13() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserisTrackErrors14() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTrackErrors4320() {
        Parser parser = new Parser();
        parser.setTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTrackErrors321() {
        Parser parser = new Parser();
        parser.setTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTrackErrors572742() {
        Parser parser = new Parser();
        parser.setTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTrackErrors2233() {
        Parser parser = new Parser();
        parser.setTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersetTrackErrors694() {
        Parser parser = new Parser();
        parser.setTrackErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetErrors10() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetErrors11() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetErrors12() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetErrors13() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsergetErrors14() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings630() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings1885761751() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings8025812342() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings2664372633() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings324() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings10() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings11() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings12() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings13() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParsersettings14() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparse11595902810() {
        Parser parser = new Parser();
        parser.parse("noembec","]]?");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparse9260028561() {
        Parser parser = new Parser();
        parser.parse("textare`","styld");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparse70319502() {
        Parser parser = new Parser();
        parser.parse("xml","met`");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparse16184387123() {
        Parser parser = new Parser();
        parser.parse("*<",":only-of-type");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparse1138703534() {
        Parser parser = new Parser();
        parser.parse("svf","theac");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment42206020() {
        Parser parser = new Parser();
        parser.parseFragment(":nth-last-of-type(",,"httq");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment6145412061() {
        Parser parser = new Parser();
        parser.parseFragment("textarea",,"disablec");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment16458617772() {
        Parser parser = new Parser();
        parser.parseFragment("com",,"com");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment14215975183() {
        Parser parser = new Parser();
        parser.parseFragment("xmo",,"a");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment1034712584() {
        Parser parser = new Parser();
        parser.parseFragment("imf",,"evem");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment15817848650() {
        Parser parser = new Parser();
        parser.parseFragment("style",,"frameset",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment20668293041() {
        Parser parser = new Parser();
        parser.parseFragment("met`",,"#roou",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment7865024272() {
        Parser parser = new Parser();
        parser.parseFragment("abs9",,"namf",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment13538551863() {
        Parser parser = new Parser();
        parser.parseFragment("*<",,"met`",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseFragment15724919644() {
        Parser parser = new Parser();
        parser.parseFragment("linl",,"evem",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseXmlFragment5494192570() {
        Parser parser = new Parser();
        parser.parseXmlFragment("frameses","namf");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseXmlFragment971261191() {
        Parser parser = new Parser();
        parser.parseXmlFragment("body","http");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseXmlFragment18099945232() {
        Parser parser = new Parser();
        parser.parseXmlFragment("basefont","imh");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseXmlFragment11134960713() {
        Parser parser = new Parser();
        parser.parseXmlFragment("#roou","\"\"");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseXmlFragment8983483884() {
        Parser parser = new Parser();
        parser.parseXmlFragment(":contains)","inpuu");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragment996180040() {
        Parser parser = new Parser();
        parser.parseBodyFragment("httq","|");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragment3499849281() {
        Parser parser = new Parser();
        parser.parseBodyFragment(":nth-child(","nobq");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragment20586110082() {
        Parser parser = new Parser();
        parser.parseBodyFragment("disablee","[a-zA-Z_:][-a-zA-Z0-9_:.])");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragment5941677083() {
        Parser parser = new Parser();
        parser.parseBodyFragment("text/",":nth-last-child'");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragment13298343854() {
        Parser parser = new Parser();
        parser.parseBodyFragment(":first-of-typf","h0");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserunescapeEntities8813756450() {
        Parser parser = new Parser();
        parser.unescapeEntities("tabld",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserunescapeEntities1018881() {
        Parser parser = new Parser();
        parser.unescapeEntities("dt",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserunescapeEntities36853022() {
        Parser parser = new Parser();
        parser.unescapeEntities("xmo",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserunescapeEntities5460468423() {
        Parser parser = new Parser();
        parser.unescapeEntities("frameseu",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserunescapeEntities968935914() {
        Parser parser = new Parser();
        parser.unescapeEntities("evem",);
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragmentRelaxed6358122530() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("#texu","DOCTYPF");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragmentRelaxed144326671() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("sarcasm",":only-chile");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragmentRelaxed968924372() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("even",".");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragmentRelaxed20094990093() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("thead","keygeo");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserparseBodyFragmentRelaxed36870784() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("xmp","^>");
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserhtmlParser10() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserhtmlParser11() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserhtmlParser12() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserhtmlParser13() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserhtmlParser14() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserxmlParser10() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserxmlParser11() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserxmlParser12() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserxmlParser13() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testParserxmlParser14() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
        try {
            parser.equals(parser);
        } catch (Exception e) {
            fail("parser.equals(parser) throws an exception");
        }
        try {
            parser.hashCode();
        } catch (Exception e) {
            fail("parser.hashCode() throws an exception");
        }
        try {
            parser.toString();
        } catch (Exception e) {
            fail("parser.toString() throws an exception");
        }
    }
    @Test
    public void testTaggetName10() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTaggetName11() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTaggetName12() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTaggetName13() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTaggetName14() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagnormalName10() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagnormalName11() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagnormalName12() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagnormalName13() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagnormalName14() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf2931788030() {
        Tag tag = new Tag();
        tag.valueOf("bgsounc",);
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf16179706601() {
        Tag tag = new Tag();
        tag.valueOf(":all",);
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf3453450052() {
        Tag tag = new Tag();
        tag.valueOf("textare`",);
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf3815844563() {
        Tag tag = new Tag();
        tag.valueOf("heac",);
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf13933036684() {
        Tag tag = new Tag();
        tag.valueOf(":first-child",);
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf14562253610() {
        Tag tag = new Tag();
        tag.valueOf(":matches)");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf16183955611() {
        Tag tag = new Tag();
        tag.valueOf(":only-of-typf");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf10176250972() {
        Tag tag = new Tag();
        tag.valueOf(":nth-last-of-type(");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf21156131443() {
        Tag tag = new Tag();
        tag.valueOf("noembee");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagvalueOf11912143984() {
        Tag tag = new Tag();
        tag.valueOf("iframd");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisBlock10() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisBlock11() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisBlock12() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisBlock13() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisBlock14() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagformatAsBlock10() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagformatAsBlock11() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagformatAsBlock12() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagformatAsBlock13() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagformatAsBlock14() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagcanContainBlock10() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagcanContainBlock11() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagcanContainBlock12() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagcanContainBlock13() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagcanContainBlock14() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisInline10() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisInline11() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisInline12() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisInline13() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisInline14() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisData10() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisData11() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisData12() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisData13() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisData14() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisEmpty10() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisEmpty11() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisEmpty12() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisEmpty13() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisEmpty14() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisSelfClosing10() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisSelfClosing11() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisSelfClosing12() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisSelfClosing13() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisSelfClosing14() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag10() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag11() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag12() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag13() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag14() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag1102563220() {
        Tag tag = new Tag();
        tag.isKnownTag("text0");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag13776877271() {
        Tag tag = new Tag();
        tag.isKnownTag("button");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag11927218612() {
        Tag tag = new Tag();
        tag.isKnownTag("noframer");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag1188423() {
        Tag tag = new Tag();
        tag.isKnownTag("xmp");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisKnownTag21153115444() {
        Tag tag = new Tag();
        tag.isKnownTag("boundarx");
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagpreserveWhitespace10() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagpreserveWhitespace11() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagpreserveWhitespace12() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagpreserveWhitespace13() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagpreserveWhitespace14() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormListed10() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormListed11() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormListed12() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormListed13() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormListed14() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormSubmittable10() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormSubmittable11() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormSubmittable12() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormSubmittable13() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testTagisFormSubmittable14() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
        try {
            tag.equals(tag);
        } catch (Exception e) {
            fail("tag.equals(tag) throws an exception");
        }
        try {
            tag.hashCode();
        } catch (Exception e) {
            fail("tag.hashCode() throws an exception");
        }
        try {
            tag.toString();
        } catch (Exception e) {
            fail("tag.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetErrorMessage10() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetErrorMessage11() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetErrorMessage12() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetErrorMessage13() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetErrorMessage14() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetPosition10() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetPosition11() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetPosition12() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetPosition13() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorgetPosition14() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
        try {
            parseerror.equals(parseerror);
        } catch (Exception e) {
            fail("parseerror.equals(parseerror) throws an exception");
        }
        try {
            parseerror.hashCode();
        } catch (Exception e) {
            fail("parseerror.hashCode() throws an exception");
        }
        try {
            parseerror.toString();
        } catch (Exception e) {
            fail("parseerror.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListnoTracking10() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListnoTracking11() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListnoTracking12() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListnoTracking13() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListnoTracking14() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListtracking553270() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListtracking321() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListtracking332() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListtracking553283() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testParseErrorListtracking553284() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
        try {
            parseerrorlist.equals(parseerrorlist);
        } catch (Exception e) {
            fail("parseerrorlist.equals(parseerrorlist) throws an exception");
        }
        try {
            parseerrorlist.hashCode();
        } catch (Exception e) {
            fail("parseerrorlist.hashCode() throws an exception");
        }
        try {
            parseerrorlist.toString();
        } catch (Exception e) {
            fail("parseerrorlist.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderpos10() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderpos11() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderpos12() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderpos13() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderpos14() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderisEmpty10() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderisEmpty11() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderisEmpty12() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderisEmpty13() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderisEmpty14() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReadercurrent10() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReadercurrent11() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReadercurrent12() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReadercurrent13() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReadercurrent14() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderadvance10() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderadvance11() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderadvance12() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderadvance13() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderadvance14() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeTo650() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo(""");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeTo921() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo("=");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeTo922() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo("=");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeTo1003() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo("E");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeTo1424() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo("o");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeToAny1440() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny("q");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeToAny1561() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny("}");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeToAny882() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny("9");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeToAny693() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny("&");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testCharacterReaderconsumeToAny794() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny("0");
        assertTrue(characterreader.equals(characterreader));
        try {
            characterreader.equals(characterreader);
        } catch (Exception e) {
            fail("characterreader.equals(characterreader) throws an exception");
        }
        try {
            characterreader.hashCode();
        } catch (Exception e) {
            fail("characterreader.hashCode() throws an exception");
        }
        try {
            characterreader.toString();
        } catch (Exception e) {
            fail("characterreader.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload15420799820() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"spao","odc");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload75496181() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"evem",":containsOwn)");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload6230461862() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"h1",":matches)");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload16272402103() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"*|",":roos");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload19688489384() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,":containsOwn'","lh");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload8233090570() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"scripu","deflate");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload6751548201() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,".","nobs");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload19603700762() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,":last-of-type",":matches(");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload15090269293() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,":lt(",":nth-of-type)");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload8731126324() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"]]=","#text");
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload4513056550() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"action","[a-zA-Z_:][-a-zA-Z0-9_:.]*",);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload10796411171() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"gziq","templatd",);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload11601443202() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"captioo","[a-zA-Z_:][-a-zA-Z0-9_:.])",);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload11389371233() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"buttom","button",);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilload6687309654() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load(,"gzio","boundarz",);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilreadToByteBuffer11590282640() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(,);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilreadToByteBuffer8555077021() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(,);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilreadToByteBuffer13073923722() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(,);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilreadToByteBuffer572503() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(,);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testDataUtilreadToByteBuffer1654626264() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(,);
        assertTrue(datautil.equals(datautil));
        try {
            datautil.equals(datautil);
        } catch (Exception e) {
            fail("datautil.equals(datautil) throws an exception");
        }
        try {
            datautil.hashCode();
        } catch (Exception e) {
            fail("datautil.hashCode() throws an exception");
        }
        try {
            datautil.toString();
        } catch (Exception e) {
            fail("datautil.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull8025812340() {
        Validate validate = new Validate();
        validate.notNull();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull3880431241() {
        Validate validate = new Validate();
        validate.notNull();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull2664372632() {
        Validate validate = new Validate();
        validate.notNull();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull3880431243() {
        Validate validate = new Validate();
        validate.notNull();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull3880431244() {
        Validate validate = new Validate();
        validate.notNull();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull3303783540() {
        Validate validate = new Validate();
        validate.notNull(,"!>");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull9985056011() {
        Validate validate = new Validate();
        validate.notNull(,"bgsound");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull1686757492() {
        Validate validate = new Validate();
        validate.notNull(,"htmk");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull2709417893() {
        Validate validate = new Validate();
        validate.notNull(,"disablee");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotNull16844564324() {
        Validate validate = new Validate();
        validate.notNull(,"(");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue12620() {
        Validate validate = new Validate();
        validate.isTrue();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue12621() {
        Validate validate = new Validate();
        validate.isTrue();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue12622() {
        Validate validate = new Validate();
        validate.isTrue();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue12623() {
        Validate validate = new Validate();
        validate.isTrue();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue12624() {
        Validate validate = new Validate();
        validate.isTrue();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue428230() {
        Validate validate = new Validate();
        validate.isTrue(,"ti");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue428191() {
        Validate validate = new Validate();
        validate.isTrue(,"te");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue35758362() {
        Validate validate = new Validate();
        validate.isTrue(,"span");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue20353510823() {
        Validate validate = new Validate();
        validate.isTrue(,":first-of-typd");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisTrue18911670244() {
        Validate validate = new Validate();
        validate.isTrue(,":nth-of-type)");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse12620() {
        Validate validate = new Validate();
        validate.isFalse();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse12621() {
        Validate validate = new Validate();
        validate.isFalse();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse12622() {
        Validate validate = new Validate();
        validate.isFalse();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse12623() {
        Validate validate = new Validate();
        validate.isFalse();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse12624() {
        Validate validate = new Validate();
        validate.isFalse();
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse420970() {
        Validate validate = new Validate();
        validate.isFalse(,"^=");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse1314401() {
        Validate validate = new Validate();
        validate.isFalse(,"]]>");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse18676032() {
        Validate validate = new Validate();
        validate.isFalse(,":eq'");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse18676043() {
        Validate validate = new Validate();
        validate.isFalse(,":eq(");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidateisFalse2709799184() {
        Validate validate = new Validate();
        validate.isFalse(,"disabled");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements3228362520() {
        Validate validate = new Validate();
        validate.noNullElements(});
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements13706511121() {
        Validate validate = new Validate();
        validate.noNullElements(});
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements4500037112() {
        Validate validate = new Validate();
        validate.noNullElements(});
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements21349916633() {
        Validate validate = new Validate();
        validate.noNullElements(});
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements4809718024() {
        Validate validate = new Validate();
        validate.noNullElements(});
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements20573385240() {
        Validate validate = new Validate();
        validate.noNullElements(},"style");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements8880685651() {
        Validate validate = new Validate();
        validate.noNullElements(},"basd");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements3223898252() {
        Validate validate = new Validate();
        validate.noNullElements(},":matches'");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements3956683403() {
        Validate validate = new Validate();
        validate.noNullElements(},"sarcasl");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenoNullElements267443414() {
        Validate validate = new Validate();
        validate.noNullElements(},"[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty358296690() {
        Validate validate = new Validate();
        validate.notEmpty("#roou");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty570706501() {
        Validate validate = new Validate();
        validate.notEmpty(":roos");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty12068418922() {
        Validate validate = new Validate();
        validate.notEmpty("http:/");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty31255613() {
        Validate validate = new Validate();
        validate.notEmpty("even");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty1188384() {
        Validate validate = new Validate();
        validate.notEmpty("xml");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty2140444130() {
        Validate validate = new Validate();
        validate.notEmpty("meta","text.");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty19434688791() {
        Validate validate = new Validate();
        validate.notEmpty("textareb","script");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty17953689902() {
        Validate validate = new Validate();
        validate.notEmpty(":has'","#roos");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty14400070053() {
        Validate validate = new Validate();
        validate.notEmpty("charseu","spam");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatenotEmpty32494994() {
        Validate validate = new Validate();
        validate.notEmpty("~>","even");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatefail11912143970() {
        Validate validate = new Validate();
        validate.fail("iframe");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatefail33737371() {
        Validate validate = new Validate();
        validate.fail("namd");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatefail14229508282() {
        Validate validate = new Validate();
        validate.fail("actiom");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatefail21156131433() {
        Validate validate = new Validate();
        validate.fail("noembed");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testValidatefail16449536134() {
        Validate validate = new Validate();
        validate.fail("frameses");
        assertTrue(validate.equals(validate));
        try {
            validate.equals(validate);
        } catch (Exception e) {
            fail("validate.equals(validate) throws an exception");
        }
        try {
            validate.hashCode();
        } catch (Exception e) {
            fail("validate.hashCode() throws an exception");
        }
        try {
            validate.toString();
        } catch (Exception e) {
            fail("validate.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect20919604290() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect(":only-chilc");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect10101369391() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("optioo");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect1082706192() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("radip");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect11912143973() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("iframe");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect358799194() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("#text");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect2664372630() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect13811282921() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect1885761752() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect1885761753() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect324() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl2664372630() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl18432892591() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl18738595963() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl18738595964() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl33868640() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("nobr");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl37281() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("te");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl35367442() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("spam");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl13776877283() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("buttom");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl904() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url(";");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy18432892590() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy3880431241() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy13811282923() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy8025812344() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy591780() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("[",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy13298375011() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy(":first-of-type",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy11118338512() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("#roou",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy1023553() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("h2",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy10407733214() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("plaintexu",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent7390744120() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("charseu");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent10032436881() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("textare`");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent567593362() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent(":has)");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent14723() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("-.");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent10032436864() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("textareb");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout2550() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout1331() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout4322() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout11141433() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout11141434() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize553270() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize2701() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize1322() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize693() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize5314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionfollowRedirects12620() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionfollowRedirects12621() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionfollowRedirects12622() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionfollowRedirects12623() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionfollowRedirects12624() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer35756410() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("type");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer21153115431() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("boundary");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer5525734442() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("captiom");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer358296683() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("#root");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer13934() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("*<");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmethod13612897780() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmethod18432892591() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmethod322() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmethod18738595963() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmethod2824321654() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreHttpErrors12620() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreHttpErrors12621() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreHttpErrors12622() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreHttpErrors12623() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreHttpErrors12624() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreContentType12620() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreContentType12621() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreContentType12622() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreContentType12623() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionignoreContentType12624() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata20685276190() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("[a-zA-Z_:][-a-zA-Z0-9_:.])","$<");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata10745935491() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("plaintexu","boundary");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata926156922() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("abs:","*=");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata10553616953() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("li",":matchesOwn(");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata8770566784() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("tbodz","basd");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionsslSocketFactory320() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionsslSocketFactory13612897781() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionsslSocketFactory13612897782() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionsslSocketFactory1885761753() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionsslSocketFactory2824321654() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata19388026890() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("optgrouo",":containsData(",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata15359782391() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("dd","hidden",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata20298177342() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("~=",":has(",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata17790579163() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":containsOwn'","dc",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata367277054() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("text/","?",);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata20504041210() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata2664372631() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata18432892592() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata13612897783() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata13612897784() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata10176250960() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":nth-last-of-type'");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata18912061161() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":nth-of-type(");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata32132582() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("html");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata567593343() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":has'");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata27763634() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("\"\"");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata20504041210() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata15614086491() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata8025812342() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata13612897783() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata2824321654() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata20919604280() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":only-child");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata10101369391() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("optioo");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata1082706172() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("radin");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata13215466003() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("templatd");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata1099024() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("odd");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody14562253630() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody(":matches'");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody2709408281() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("disablee");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody33737372() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("namd");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody33073() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("h4");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody3081290274() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody(":last-chilc");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader6042358800() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("checkbox","textarea");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader16885934801() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("boundarx",":matches)");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader16576172622() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("frameseu","isindew");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader1096423413() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("spao","ds");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader3855233194() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("frameset","bgsoune");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders3880431240() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders631() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders18738595962() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders2824321653() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders2664372634() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie598730150() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie(":eq)","gzio");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie6326764361() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("image","caption");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie11928373672() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("td","noframer");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie15419753013() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("linl","frameset");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie2563926464() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie(":contains'","checked");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies630() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies2664372631() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies18432892592() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies16082306803() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies2664372634() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionparser1885761750() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionparser8025812341() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionparser2824321652() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionparser323() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionparser13612897784() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionget10() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionget11() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionget12() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionget13() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionget14() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpost10() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpost11() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpost12() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpost13() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpost14() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionexecute10() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionexecute11() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionexecute12() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionexecute13() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionexecute14() throws Exception {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest10() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest11() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest12() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest13() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest14() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest18432892590() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest13612897781() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest15614086492() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest1885761753() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequest314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse10() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse11() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse12() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse13() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse14() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse13811282920() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse18738595962() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse20504041213() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionresponse15614086494() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset33040() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("h1");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset1650854891() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("http-equiu");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset13932() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("*<");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset18305283() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset(":gt(");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset30064() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("^=");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomfromJsoup8025812340() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomfromJsoup13811282921() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomfromJsoup2664372632() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomfromJsoup18432892593() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomfromJsoup324() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomconvert17391636570() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(,);
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomconvert6734055451() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(,);
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomconvert1346959082() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(,);
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomconvert1477362263() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(,);
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomconvert11590278634() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(,);
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomasString15614086490() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomasString311() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomasString632() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomasString13612897783() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testW3CDomasString2664372634() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString();
        assertTrue(w3cdom.equals(w3cdom));
        try {
            w3cdom.equals(w3cdom);
        } catch (Exception e) {
            fail("w3cdom.equals(w3cdom) throws an exception");
        }
        try {
            w3cdom.hashCode();
        } catch (Exception e) {
            fail("w3cdom.hashCode() throws an exception");
        }
        try {
            w3cdom.toString();
        } catch (Exception e) {
            fail("w3cdom.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueisEmpty10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueisEmpty11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueisEmpty12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueisEmpty13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueisEmpty14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuepeek10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuepeek11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuepeek12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuepeek13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuepeek14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst690() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("&");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst691() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("&");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst1442() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("q");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst773() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(".");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst1344() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("g");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst32134780() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("htto");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst1044171() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("imf");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst12269462992() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(":containsData)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst14711890853() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(":nth-last-child(");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst35118024() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("rubz");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches19380() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("</");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches14562253611() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches(":matches)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches567593352() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches(":has(");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches1103269003() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("theae");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches18912061174() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches(":nth-of-type'");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS31891120() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("gzio");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS17571249791() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS(":emptz");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS7423139272() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("checkee");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS14713() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("--");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS1082706194() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("radip");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny18245810() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(":alk");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny10101369391() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("optioo");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny14572() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("*|");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny17209582733() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("basefont");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny29875594() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("abs:");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny700() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("'");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny921() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("=");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny1282() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("a");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny1333() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("f");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny654() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(""");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesStartTag10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesStartTag11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesStartTag12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesStartTag13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesStartTag14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp21065455190() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp(":last-of-typd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp358296681() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("#root");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp14229508262() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("actioo");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp18678420533() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("[a-zA-Z_:][-a-zA-Z0-9_:.])");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp1102563214() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("text/");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWhitespace10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWhitespace11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWhitespace12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWhitespace13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWhitespace14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWord10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWord11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWord12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWord13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesWord14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueadvance10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueadvance11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueadvance12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueadvance13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueadvance14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume33070() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("h4");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume21065455191() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume(":last-of-typd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume31255612() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("even");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume32132593() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("htmm");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume10032436864() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("textareb");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo32310() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("dd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo11927218611() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("noframer");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo9503947302() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("command");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo20919604293() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo(":only-chilc");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo35756424() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("typf");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase567593350() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase(":has(");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase14562253621() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase(":matches(");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase9076856542() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("script");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase18353333() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase(":lt(");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase1101578764() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("tbodx");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny17480897440() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("DOCTYPD");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny16183955591() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny(":only-of-typd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny7390744102() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("charses");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny1099033() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("ode");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny9076856544() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("script");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo32480() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("du");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo33091() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("h6");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo19392() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("<0");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo31984633() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("head");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo37304() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("tg");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase14711890860() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase(":nth-last-child)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase1102563201() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("text.");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase30164312() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("basd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase19732341983() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("plaintext");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase19394() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("<0");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced23960() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced(",","G");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced40701() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced("a","f");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced22702() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced(")","&");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced25103() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced("0","=");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced39984() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced("`","=");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape15451126490() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("deflatd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape1101578761() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("tbodx");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape18912061162() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape(":nth-of-type(");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape33063() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("h3");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape19804204654() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("Set-Cookif");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWhitespace10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWhitespace11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWhitespace12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWhitespace13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWhitespace14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWord10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWord11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWord12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWord13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeWord14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTagName10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTagName11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTagName12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTagName13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTagName14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeElementSelector10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeElementSelector11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeElementSelector12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeElementSelector13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeElementSelector14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeCssIdentifier10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeCssIdentifier11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeCssIdentifier12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeCssIdentifier13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeCssIdentifier14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeAttributeKey10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeAttributeKey11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeAttributeKey12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeAttributeKey13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeAttributeKey14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueremainder10() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueremainder11() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueremainder12() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueremainder13() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueremainder14() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveTagCase10() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveTagCase11() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveTagCase12() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveTagCase13() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveTagCase14() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveAttributeCase10() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveAttributeCase11() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveAttributeCase12() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveAttributeCase13() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingspreserveAttributeCase14() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeTag33737390() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("namf");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeTag1103714461() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("titld");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeTag18678420522() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeTag570706513() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag(":root");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeTag21153115424() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("boundarz");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeAttribute1003581220() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("inpuu");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeAttribute11912143981() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("iframd");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeAttribute1003581202() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("inpus");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeAttribute32303() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("dc");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testParseSettingsnormalizeAttribute15515509564() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("noscripu");
        assertTrue(parsesettings.equals(parsesettings));
        try {
            parsesettings.equals(parsesettings);
        } catch (Exception e) {
            fail("parsesettings.equals(parsesettings) throws an exception");
        }
        try {
            parsesettings.hashCode();
        } catch (Exception e) {
            fail("parsesettings.hashCode() throws an exception");
        }
        try {
            parsesettings.toString();
        } catch (Exception e) {
            fail("parsesettings.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerclean1885761750() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerclean18738595961() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerclean13612897782() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerclean20504041213() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerclean3880431244() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValid8025812340() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValid2664372631() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValid18738595962() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValid13612897783() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValid8025812344() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid();
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValidBodyHtml7390744110() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("charset");
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValidBodyHtml37281() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("te");
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValidBodyHtml20919604272() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml(":only-chile");
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValidBodyHtml17480897433() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("DOCTYPE");
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testCleanerisValidBodyHtml35367464() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("spao");
        assertTrue(cleaner.equals(cleaner));
        try {
            cleaner.equals(cleaner);
        } catch (Exception e) {
            fail("cleaner.equals(cleaner) throws an exception");
        }
        try {
            cleaner.hashCode();
        } catch (Exception e) {
            fail("cleaner.hashCode() throws an exception");
        }
        try {
            cleaner.toString();
        } catch (Exception e) {
            fail("cleaner.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistnone10() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistnone11() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistnone12() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistnone13() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistnone14() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistsimpleText10() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistsimpleText11() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistsimpleText12() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistsimpleText13() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistsimpleText14() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasic10() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasic11() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasic12() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasic13() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasic14() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasicWithImages10() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasicWithImages11() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasicWithImages12() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasicWithImages13() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistbasicWithImages14() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistrelaxed10() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistrelaxed11() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistrelaxed12() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistrelaxed13() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistrelaxed14() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddTags570706500() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags(":roos");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddTags21065455181() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags(":last-of-type");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddTags14711890862() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags(":nth-last-child)");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddTags11414281683() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("[CDATA[");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddTags12068418934() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("http:.");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveTags34850() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("lj");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveTags37301() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("tg");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveTags9076856552() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("scrips");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveTags1102773763() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("tfoos");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveTags2882752474() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags(":nth-child'");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddAttributes1038804420() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("meta","]]>");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddAttributes926174821() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("abs:","bs");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddAttributes1015872() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("dd","*|");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddAttributes600943093() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes(":gt'","met`");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddAttributes11138686734() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("#roos","form");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveAttributes17915951190() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("htmm",":nth-of-type'");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveAttributes1026273991() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("html","base");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveAttributes19976528232() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("disablee",":last-of-type");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveAttributes6241512773() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("bgsounc",":roos");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveAttributes38029084() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("xmp","xmk");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddEnforcedAttribute3992545190() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("|","checkbox","cok");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddEnforcedAttribute3411673431() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute(":last-chile","hs","image");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddEnforcedAttribute15105128662() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute(":nth-of-type)",".",":last-of-type");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddEnforcedAttribute13535765393() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute(":nth-child(","nobq","selecs");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddEnforcedAttribute5493509134() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("[","frameses","gziq");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveEnforcedAttribute3331476730() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("select","frameses");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveEnforcedAttribute11821243511() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("imagd","even");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveEnforcedAttribute1083306332() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("<.","radin");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveEnforcedAttribute12460872673() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("optiom","nobq");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveEnforcedAttribute2167614() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("h3","svf");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistpreserveRelativeLinks12620() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistpreserveRelativeLinks12621() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistpreserveRelativeLinks12622() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistpreserveRelativeLinks12623() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistpreserveRelativeLinks12624() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks();
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddProtocols68461480() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("?","svh","html");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddProtocols3319425571() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("plaintext",":matchTexu",":first-chile");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddProtocols17971762312() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols(":matches)",":roos",":lt'");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddProtocols16187647553() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("disablee","h6","^=");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistaddProtocols17237689884() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("deflate",":only-of-type","typf");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveProtocols931480540() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("deflate","#texs","ds");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveProtocols21302130761() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("eveo","titlf","*=");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveProtocols1046893962() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("<.","http","href");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveProtocols14537435353() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("gzip",":matchesOwn(","#texu");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testWhitelistremoveProtocols20206495034() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols(":containsData'","$<","<0");
        assertTrue(whitelist.equals(whitelist));
        try {
            whitelist.equals(whitelist);
        } catch (Exception e) {
            fail("whitelist.equals(whitelist) throws an exception");
        }
        try {
            whitelist.hashCode();
        } catch (Exception e) {
            fail("whitelist.hashCode() throws an exception");
        }
        try {
            whitelist.toString();
        } catch (Exception e) {
            fail("whitelist.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextmain1101158200() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("tabld");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextmain9060216051() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("select");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextmain18285142() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main(":eq)");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextmain570706503() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main(":roos");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextmain734() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("*");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextgetPlainText16082306800() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText();
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextgetPlainText631() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText();
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextgetPlainText2664372632() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText();
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextgetPlainText15614086493() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText();
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testHtmlToPlainTextgetPlainText634() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText();
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
        try {
            htmltoplaintext.equals(htmltoplaintext);
        } catch (Exception e) {
            fail("htmltoplaintext.equals(htmltoplaintext) throws an exception");
        }
        try {
            htmltoplaintext.hashCode();
        } catch (Exception e) {
            fail("htmltoplaintext.hashCode() throws an exception");
        }
        try {
            htmltoplaintext.toString();
        } catch (Exception e) {
            fail("htmltoplaintext.toString() throws an exception");
        }
    }
    @Test
    public void testWikipediamain8762139320() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'"});
        assertTrue(wikipedia.equals(wikipedia));
        try {
            wikipedia.equals(wikipedia);
        } catch (Exception e) {
            fail("wikipedia.equals(wikipedia) throws an exception");
        }
        try {
            wikipedia.hashCode();
        } catch (Exception e) {
            fail("wikipedia.hashCode() throws an exception");
        }
        try {
            wikipedia.toString();
        } catch (Exception e) {
            fail("wikipedia.toString() throws an exception");
        }
    }
    @Test
    public void testWikipediamain2305280441() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>"});
        assertTrue(wikipedia.equals(wikipedia));
        try {
            wikipedia.equals(wikipedia);
        } catch (Exception e) {
            fail("wikipedia.equals(wikipedia) throws an exception");
        }
        try {
            wikipedia.hashCode();
        } catch (Exception e) {
            fail("wikipedia.hashCode() throws an exception");
        }
        try {
            wikipedia.toString();
        } catch (Exception e) {
            fail("wikipedia.toString() throws an exception");
        }
    }
    @Test
    public void testWikipediamain19095468072() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'"});
        assertTrue(wikipedia.equals(wikipedia));
        try {
            wikipedia.equals(wikipedia);
        } catch (Exception e) {
            fail("wikipedia.equals(wikipedia) throws an exception");
        }
        try {
            wikipedia.hashCode();
        } catch (Exception e) {
            fail("wikipedia.hashCode() throws an exception");
        }
        try {
            wikipedia.toString();
        } catch (Exception e) {
            fail("wikipedia.toString() throws an exception");
        }
    }
    @Test
    public void testWikipediamain3927813303() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<"});
        assertTrue(wikipedia.equals(wikipedia));
        try {
            wikipedia.equals(wikipedia);
        } catch (Exception e) {
            fail("wikipedia.equals(wikipedia) throws an exception");
        }
        try {
            wikipedia.hashCode();
        } catch (Exception e) {
            fail("wikipedia.hashCode() throws an exception");
        }
        try {
            wikipedia.toString();
        } catch (Exception e) {
            fail("wikipedia.toString() throws an exception");
        }
    }
    @Test
    public void testWikipediamain18223831484() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";"});
        assertTrue(wikipedia.equals(wikipedia));
        try {
            wikipedia.equals(wikipedia);
        } catch (Exception e) {
            fail("wikipedia.equals(wikipedia) throws an exception");
        }
        try {
            wikipedia.hashCode();
        } catch (Exception e) {
            fail("wikipedia.hashCode() throws an exception");
        }
        try {
            wikipedia.toString();
        } catch (Exception e) {
            fail("wikipedia.toString() throws an exception");
        }
    }
    @Test
    public void testListLinksmain2330215820() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv"});
        assertTrue(listlinks.equals(listlinks));
        try {
            listlinks.equals(listlinks);
        } catch (Exception e) {
            fail("listlinks.equals(listlinks) throws an exception");
        }
        try {
            listlinks.hashCode();
        } catch (Exception e) {
            fail("listlinks.hashCode() throws an exception");
        }
        try {
            listlinks.toString();
        } catch (Exception e) {
            fail("listlinks.toString() throws an exception");
        }
    }
    @Test
    public void testListLinksmain19913132671() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio"});
        assertTrue(listlinks.equals(listlinks));
        try {
            listlinks.equals(listlinks);
        } catch (Exception e) {
            fail("listlinks.equals(listlinks) throws an exception");
        }
        try {
            listlinks.hashCode();
        } catch (Exception e) {
            fail("listlinks.hashCode() throws an exception");
        }
        try {
            listlinks.toString();
        } catch (Exception e) {
            fail("listlinks.toString() throws an exception");
        }
    }
    @Test
    public void testListLinksmain7367789632() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","boundarx","imf","imh","link","linl","linj","basefont","basefonu","head","heae","nobs","nobr","nobq",":empty","commane",":emptx","#texs","rubx","command","rubz","heac"});
        assertTrue(listlinks.equals(listlinks));
        try {
            listlinks.equals(listlinks);
        } catch (Exception e) {
            fail("listlinks.equals(listlinks) throws an exception");
        }
        try {
            listlinks.hashCode();
        } catch (Exception e) {
            fail("listlinks.hashCode() throws an exception");
        }
        try {
            listlinks.toString();
        } catch (Exception e) {
            fail("listlinks.toString() throws an exception");
        }
    }
    @Test
    public void testListLinksmain10320007833() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody"});
        assertTrue(listlinks.equals(listlinks));
        try {
            listlinks.equals(listlinks);
        } catch (Exception e) {
            fail("listlinks.equals(listlinks) throws an exception");
        }
        try {
            listlinks.hashCode();
        } catch (Exception e) {
            fail("listlinks.hashCode() throws an exception");
        }
        try {
            listlinks.toString();
        } catch (Exception e) {
            fail("listlinks.toString() throws an exception");
        }
    }
    @Test
    public void testListLinksmain7709112544() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo"});
        assertTrue(listlinks.equals(listlinks));
        try {
            listlinks.equals(listlinks);
        } catch (Exception e) {
            fail("listlinks.equals(listlinks) throws an exception");
        }
        try {
            listlinks.hashCode();
        } catch (Exception e) {
            fail("listlinks.hashCode() throws an exception");
        }
        try {
            listlinks.toString();
        } catch (Exception e) {
            fail("listlinks.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetMimeType10() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetMimeType11() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetMimeType12() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetMimeType13() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetMimeType14() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetUrl10() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetUrl11() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetUrl12() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetUrl13() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testUnsupportedMimeTypeExceptiongetUrl14() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
        try {
            unsupportedmimetypeexception.equals(unsupportedmimetypeexception);
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.equals(unsupportedmimetypeexception) throws an exception");
        }
        try {
            unsupportedmimetypeexception.hashCode();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.hashCode() throws an exception");
        }
        try {
            unsupportedmimetypeexception.toString();
        } catch (Exception e) {
            fail("unsupportedmimetypeexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetStatusCode10() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetStatusCode11() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetStatusCode12() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetStatusCode13() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetStatusCode14() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetUrl10() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetUrl11() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetUrl12() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetUrl13() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testHttpStatusExceptiongetUrl14() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
        try {
            httpstatusexception.equals(httpstatusexception);
        } catch (Exception e) {
            fail("httpstatusexception.equals(httpstatusexception) throws an exception");
        }
        try {
            httpstatusexception.hashCode();
        } catch (Exception e) {
            fail("httpstatusexception.hashCode() throws an exception");
        }
        try {
            httpstatusexception.toString();
        } catch (Exception e) {
            fail("httpstatusexception.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse2824321650() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse();
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse15614086491() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse();
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse322() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse();
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse18738595963() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse();
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse15614086494() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse();
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse6669889000() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse13629449061() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse8555650432() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse13612917003() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse10507488224() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse17548111720() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse3303794391() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse6786049212() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse8897854903() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversortraverse9934() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter8025821950() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter12926502051() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter19532() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter18432911813() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter18513185244() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter13007142480() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter13612907391() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter15614095792() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter3880440543() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testNodeTraversorfilter15745308154() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(,);
        assertTrue(nodetraversor.equals(nodetraversor));
        try {
            nodetraversor.equals(nodetraversor);
        } catch (Exception e) {
            fail("nodetraversor.equals(nodetraversor) throws an exception");
        }
        try {
            nodetraversor.hashCode();
        } catch (Exception e) {
            fail("nodetraversor.hashCode() throws an exception");
        }
        try {
            nodetraversor.toString();
        } catch (Exception e) {
            fail("nodetraversor.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorcollect12964133790() {
        Collector collector = new Collector();
        collector.collect(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorcollect6734055451() {
        Collector collector = new Collector();
        collector.collect(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorcollect10118778762() {
        Collector collector = new Collector();
        collector.collect(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorcollect8897855223() {
        Collector collector = new Collector();
        collector.collect(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorcollect9877241844() {
        Collector collector = new Collector();
        collector.collect(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorfindFirst8702136020() {
        Collector collector = new Collector();
        collector.findFirst(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorfindFirst12620798681() {
        Collector collector = new Collector();
        collector.findFirst(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorfindFirst6314384192() {
        Collector collector = new Collector();
        collector.findFirst(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorfindFirst8897855223() {
        Collector collector = new Collector();
        collector.findFirst(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testCollectorfindFirst8117187764() {
        Collector collector = new Collector();
        collector.findFirst(,);
        assertTrue(collector.equals(collector));
        try {
            collector.equals(collector);
        } catch (Exception e) {
            fail("collector.equals(collector) throws an exception");
        }
        try {
            collector.hashCode();
        } catch (Exception e) {
            fail("collector.hashCode() throws an exception");
        }
        try {
            collector.toString();
        } catch (Exception e) {
            fail("collector.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr15451126500() {
        Elements elements = new Elements();
        elements.attr("deflate");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr30061() {
        Elements elements = new Elements();
        elements.attr("^=");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr14711890852() {
        Elements elements = new Elements();
        elements.attr(":nth-last-child(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr9076856533() {
        Elements elements = new Elements();
        elements.attr("scripu");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr16183955594() {
        Elements elements = new Elements();
        elements.attr(":only-of-typd");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr32320() {
        Elements elements = new Elements();
        elements.hasAttr("de");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr20913044551() {
        Elements elements = new Elements();
        elements.hasAttr("isindex");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr31255612() {
        Elements elements = new Elements();
        elements.hasAttr("even");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr33693() {
        Elements elements = new Elements();
        elements.hasAttr("hr");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr14229508284() {
        Elements elements = new Elements();
        elements.hasAttr("actiom");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr7390744120() {
        Elements elements = new Elements();
        elements.eachAttr("charseu");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr567593361() {
        Elements elements = new Elements();
        elements.eachAttr(":has)");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr1857353262() {
        Elements elements = new Elements();
        elements.eachAttr("US-ASCIJ");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr30063() {
        Elements elements = new Elements();
        elements.eachAttr("^=");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr30064() {
        Elements elements = new Elements();
        elements.eachAttr("^=");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr17691934850() {
        Elements elements = new Elements();
        elements.attr(":roou","h1");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr2546606031() {
        Elements elements = new Elements();
        elements.attr(":nth-last-of-type(",":containsData'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr976198522() {
        Elements elements = new Elements();
        elements.attr("forl",".");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr18545914163() {
        Elements elements = new Elements();
        elements.attr("#texu","checkee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr11791280314() {
        Elements elements = new Elements();
        elements.attr("[CDATA[","isindey");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr13776877280() {
        Elements elements = new Elements();
        elements.removeAttr("buttom");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr807731741() {
        Elements elements = new Elements();
        elements.removeAttr("optgrouo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr2882752482() {
        Elements elements = new Elements();
        elements.removeAttr(":nth-child(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr733() {
        Elements elements = new Elements();
        elements.removeAttr("*");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr21065455184() {
        Elements elements = new Elements();
        elements.removeAttr(":last-of-type");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass18912061170() {
        Elements elements = new Elements();
        elements.addClass(":nth-of-type'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass996170341() {
        Elements elements = new Elements();
        elements.addClass("https");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass29875582() {
        Elements elements = new Elements();
        elements.addClass("abs9");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass33683() {
        Elements elements = new Elements();
        elements.addClass("hq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass20919604274() {
        Elements elements = new Elements();
        elements.addClass(":only-chile");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass30294400() {
        Elements elements = new Elements();
        elements.removeClass("bodx");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass18305291() {
        Elements elements = new Elements();
        elements.removeClass(":gt)");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass29875602() {
        Elements elements = new Elements();
        elements.removeClass("abs;");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass21065455183() {
        Elements elements = new Elements();
        elements.removeClass(":last-of-type");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass33480044() {
        Elements elements = new Elements();
        elements.removeClass("meta");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass33737370() {
        Elements elements = new Elements();
        elements.toggleClass("namd");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass37401() {
        Elements elements = new Elements();
        elements.toggleClass("tq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass33032() {
        Elements elements = new Elements();
        elements.toggleClass("h0");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass10548386293() {
        Elements elements = new Elements();
        elements.toggleClass(":first-chile");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass9060216054() {
        Elements elements = new Elements();
        elements.toggleClass("select");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass5525734460() {
        Elements elements = new Elements();
        elements.hasClass("captioo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass9503947301() {
        Elements elements = new Elements();
        elements.hasClass("command");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass2882752482() {
        Elements elements = new Elements();
        elements.hasClass(":nth-child(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass30164333() {
        Elements elements = new Elements();
        elements.hasClass("basf");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass7423139274() {
        Elements elements = new Elements();
        elements.hasClass("checkee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval10() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval11() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval12() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval13() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval14() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval34830() {
        Elements elements = new Elements();
        elements.val("lh");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval32134791() {
        Elements elements = new Elements();
        elements.val("http");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval5525734442() {
        Elements elements = new Elements();
        elements.val("captiom");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval17480897443() {
        Elements elements = new Elements();
        elements.val("DOCTYPD");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval1650854874() {
        Elements elements = new Elements();
        elements.val("http-equiw");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstext10() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstext11() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstext12() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstext13() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstext14() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasText10() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasText11() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasText12() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasText13() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasText14() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachText10() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachText11() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachText12() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachText13() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachText14() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml10() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml11() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml12() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml13() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml14() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsouterHtml10() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsouterHtml11() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsouterHtml12() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsouterHtml13() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsouterHtml14() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName358296680() {
        Elements elements = new Elements();
        elements.tagName("#root");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName12071() {
        Elements elements = new Elements();
        elements.tagName("$<");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName12092() {
        Elements elements = new Elements();
        elements.tagName("$>");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName21156131443() {
        Elements elements = new Elements();
        elements.tagName("noembee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName19788929354() {
        Elements elements = new Elements();
        elements.tagName(":containsOwn'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml18912061170() {
        Elements elements = new Elements();
        elements.html(":nth-of-type'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml18305271() {
        Elements elements = new Elements();
        elements.html(":gt'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml21153115422() {
        Elements elements = new Elements();
        elements.html("boundarz");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml35367443() {
        Elements elements = new Elements();
        elements.html("spam");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml31490284() {
        Elements elements = new Elements();
        elements.html("forn");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend1102563200() {
        Elements elements = new Elements();
        elements.prepend("text.");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend35367441() {
        Elements elements = new Elements();
        elements.prepend("spam");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend32134792() {
        Elements elements = new Elements();
        elements.prepend("http");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend5525734453() {
        Elements elements = new Elements();
        elements.prepend("caption");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend14714() {
        Elements elements = new Elements();
        elements.prepend("--");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend19804204660() {
        Elements elements = new Elements();
        elements.append("Set-Cookie");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend31891131() {
        Elements elements = new Elements();
        elements.append("gzip");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend1097804332() {
        Elements elements = new Elements();
        elements.append("stylf");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend33480053() {
        Elements elements = new Elements();
        elements.append("metb");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend10548386274() {
        Elements elements = new Elements();
        elements.append(":first-chilc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore32132580() {
        Elements elements = new Elements();
        elements.before("html");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore358799201() {
        Elements elements = new Elements();
        elements.before("#texu");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore32134792() {
        Elements elements = new Elements();
        elements.before("http");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore14229508283() {
        Elements elements = new Elements();
        elements.before("actiom");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore1102773774() {
        Elements elements = new Elements();
        elements.before("tfoot");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter14229508270() {
        Elements elements = new Elements();
        elements.after("action");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter19381() {
        Elements elements = new Elements();
        elements.after("</");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter20353119922() {
        Elements elements = new Elements();
        elements.after(":first-of-type");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter32110813() {
        Elements elements = new Elements();
        elements.after("hree");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter1101158214() {
        Elements elements = new Elements();
        elements.after("table");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap19788929330() {
        Elements elements = new Elements();
        elements.wrap(":containsOwn)");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap33081() {
        Elements elements = new Elements();
        elements.wrap("h5");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap1044182() {
        Elements elements = new Elements();
        elements.wrap("img");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap1102563203() {
        Elements elements = new Elements();
        elements.wrap("text.");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap15515509544() {
        Elements elements = new Elements();
        elements.wrap("noscrips");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsunwrap10() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsunwrap11() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsunwrap12() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsunwrap13() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsunwrap14() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsempty10() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsempty11() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsempty12() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsempty13() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsempty14() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremove10() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremove11() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremove12() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremove13() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremove14() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect18690634840() {
        Elements elements = new Elements();
        elements.select("sarcasn");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect358296681() {
        Elements elements = new Elements();
        elements.select("#root");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect32312() {
        Elements elements = new Elements();
        elements.select("dd");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect33218813() {
        Elements elements = new Elements();
        elements.select("link");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect13215465994() {
        Elements elements = new Elements();
        elements.select("template");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot30050() {
        Elements elements = new Elements();
        elements.not("^<");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot31255621() {
        Elements elements = new Elements();
        elements.not("eveo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot18912061162() {
        Elements elements = new Elements();
        elements.not(":nth-of-type(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot3081290273() {
        Elements elements = new Elements();
        elements.not(":last-chilc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot20919604294() {
        Elements elements = new Elements();
        elements.not(":only-chilc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseq2180() {
        Elements elements = new Elements();
        elements.eq();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseq2221() {
        Elements elements = new Elements();
        elements.eq();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseq573732() {
        Elements elements = new Elements();
        elements.eq();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseq573733() {
        Elements elements = new Elements();
        elements.eq();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseq572744() {
        Elements elements = new Elements();
        elements.eq();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis20919604290() {
        Elements elements = new Elements();
        elements.is(":only-chilc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis10032436861() {
        Elements elements = new Elements();
        elements.is("textareb");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis1552() {
        Elements elements = new Elements();
        elements.is("|");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis18353333() {
        Elements elements = new Elements();
        elements.is(":lt(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis35756414() {
        Elements elements = new Elements();
        elements.is("type");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext10() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext11() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext12() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext13() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext14() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext32460() {
        Elements elements = new Elements();
        elements.next("ds");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext9060216051() {
        Elements elements = new Elements();
        elements.next("select");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext567593342() {
        Elements elements = new Elements();
        elements.next(":has'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext10552537223() {
        Elements elements = new Elements();
        elements.next(":matchesOwn(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext33218804() {
        Elements elements = new Elements();
        elements.next("linj");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll10() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll11() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll12() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll13() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll14() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll570706520() {
        Elements elements = new Elements();
        elements.nextAll(":roou");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll14562253631() {
        Elements elements = new Elements();
        elements.nextAll(":matches'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll29875582() {
        Elements elements = new Elements();
        elements.nextAll("abs9");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll14563() {
        Elements elements = new Elements();
        elements.nextAll("*{");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll33034() {
        Elements elements = new Elements();
        elements.nextAll("h0");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev10() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev11() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev12() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev13() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev14() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev19804204660() {
        Elements elements = new Elements();
        elements.prev("Set-Cookie");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev1103269001() {
        Elements elements = new Elements();
        elements.prev("theae");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev16183955612() {
        Elements elements = new Elements();
        elements.prev(":only-of-typf");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev7423139273() {
        Elements elements = new Elements();
        elements.prev("checkee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev12174874144() {
        Elements elements = new Elements();
        elements.prev("hiddeo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll10() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll11() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll12() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll13() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll14() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll33868630() {
        Elements elements = new Elements();
        elements.prevAll("nobq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll31891141() {
        Elements elements = new Elements();
        elements.prevAll("gziq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll5525734462() {
        Elements elements = new Elements();
        elements.prevAll("captioo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll1102773763() {
        Elements elements = new Elements();
        elements.prevAll("tfoos");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll21065455194() {
        Elements elements = new Elements();
        elements.prevAll(":last-of-typd");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsparents10() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsparents11() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsparents12() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsparents13() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsparents14() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfirst10() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfirst11() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfirst12() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfirst13() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfirst14() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementslast10() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementslast11() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementslast12() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementslast13() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementslast14() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstraverse2664372630() {
        Elements elements = new Elements();
        elements.traverse();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstraverse15614086491() {
        Elements elements = new Elements();
        elements.traverse();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstraverse15614086492() {
        Elements elements = new Elements();
        elements.traverse();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstraverse2664372633() {
        Elements elements = new Elements();
        elements.traverse();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstraverse18432892594() {
        Elements elements = new Elements();
        elements.traverse();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfilter8025812340() {
        Elements elements = new Elements();
        elements.filter();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfilter20504041211() {
        Elements elements = new Elements();
        elements.filter();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfilter8025812342() {
        Elements elements = new Elements();
        elements.filter();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfilter16082306803() {
        Elements elements = new Elements();
        elements.filter();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsfilter8025812344() {
        Elements elements = new Elements();
        elements.filter();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsforms10() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsforms11() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsforms12() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsforms13() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsforms14() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testQueryParserparse18912061170() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse(":nth-of-type'");
        assertTrue(queryparser.equals(queryparser));
        try {
            queryparser.equals(queryparser);
        } catch (Exception e) {
            fail("queryparser.equals(queryparser) throws an exception");
        }
        try {
            queryparser.hashCode();
        } catch (Exception e) {
            fail("queryparser.hashCode() throws an exception");
        }
        try {
            queryparser.toString();
        } catch (Exception e) {
            fail("queryparser.toString() throws an exception");
        }
    }
    @Test
    public void testQueryParserparse15515509541() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("noscrips");
        assertTrue(queryparser.equals(queryparser));
        try {
            queryparser.equals(queryparser);
        } catch (Exception e) {
            fail("queryparser.equals(queryparser) throws an exception");
        }
        try {
            queryparser.hashCode();
        } catch (Exception e) {
            fail("queryparser.hashCode() throws an exception");
        }
        try {
            queryparser.toString();
        } catch (Exception e) {
            fail("queryparser.toString() throws an exception");
        }
    }
    @Test
    public void testQueryParserparse1101578782() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("tbodz");
        assertTrue(queryparser.equals(queryparser));
        try {
            queryparser.equals(queryparser);
        } catch (Exception e) {
            fail("queryparser.equals(queryparser) throws an exception");
        }
        try {
            queryparser.hashCode();
        } catch (Exception e) {
            fail("queryparser.hashCode() throws an exception");
        }
        try {
            queryparser.toString();
        } catch (Exception e) {
            fail("queryparser.toString() throws an exception");
        }
    }
    @Test
    public void testQueryParserparse1143063() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("svf");
        assertTrue(queryparser.equals(queryparser));
        try {
            queryparser.equals(queryparser);
        } catch (Exception e) {
            fail("queryparser.equals(queryparser) throws an exception");
        }
        try {
            queryparser.hashCode();
        } catch (Exception e) {
            fail("queryparser.hashCode() throws an exception");
        }
        try {
            queryparser.toString();
        } catch (Exception e) {
            fail("queryparser.toString() throws an exception");
        }
    }
    @Test
    public void testQueryParserparse21065455194() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse(":last-of-typd");
        assertTrue(queryparser.equals(queryparser));
        try {
            queryparser.equals(queryparser);
        } catch (Exception e) {
            fail("queryparser.equals(queryparser) throws an exception");
        }
        try {
            queryparser.hashCode();
        } catch (Exception e) {
            fail("queryparser.hashCode() throws an exception");
        }
        try {
            queryparser.toString();
        } catch (Exception e) {
            fail("queryparser.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect1024240() {
        Selector selector = new Selector();
        selector.select("h1",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect1037881561() {
        Selector selector = new Selector();
        selector.select("metb",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect13978958082() {
        Selector selector = new Selector();
        selector.select("noframes",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect4059286343() {
        Selector selector = new Selector();
        selector.select("isindew",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect3452698084() {
        Selector selector = new Selector();
        selector.select(":containsOwn(",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect8025831560() {
        Selector selector = new Selector();
        selector.select(,);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect872043191() {
        Selector selector = new Selector();
        selector.select(,);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect15614095792() {
        Selector selector = new Selector();
        selector.select(,);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect2664391853() {
        Selector selector = new Selector();
        selector.select(,);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect13811292224() {
        Selector selector = new Selector();
        selector.select(,);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect1946692300() {
        Selector selector = new Selector();
        selector.select("[a-zA-Z_:][-a-zA-Z0-9_:.])",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect15614518011() {
        Selector selector = new Selector();
        selector.select("*<",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect19429070772() {
        Selector selector = new Selector();
        selector.select("http",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect19847044363() {
        Selector selector = new Selector();
        selector.select("type",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselect21063930954() {
        Selector selector = new Selector();
        selector.select("sarcasl",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselectFirst4699497080() {
        Selector selector = new Selector();
        selector.selectFirst("templatd",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselectFirst5850826441() {
        Selector selector = new Selector();
        selector.selectFirst(":matches'",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselectFirst4849355152() {
        Selector selector = new Selector();
        selector.selectFirst("eveo",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselectFirst18739621443() {
        Selector selector = new Selector();
        selector.selectFirst("h6",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
    @Test
    public void testSelectorselectFirst4447894614() {
        Selector selector = new Selector();
        selector.selectFirst(":gt(",);
        assertTrue(selector.equals(selector));
        try {
            selector.equals(selector);
        } catch (Exception e) {
            fail("selector.equals(selector) throws an exception");
        }
        try {
            selector.hashCode();
        } catch (Exception e) {
            fail("selector.hashCode() throws an exception");
        }
        try {
            selector.toString();
        } catch (Exception e) {
            fail("selector.toString() throws an exception");
        }
    }
}