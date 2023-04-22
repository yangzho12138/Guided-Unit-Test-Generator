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
    public void testAttributesget1650854880() {
        Attributes attributes = new Attributes();
        attributes.get("http-equiv");
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
    public void testAttributesget1221() {
        Attributes attributes = new Attributes();
        attributes.get("[");
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
    public void testAttributesget37412() {
        Attributes attributes = new Attributes();
        attributes.get("tr");
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
    public void testAttributesget987183() {
        Attributes attributes = new Attributes();
        attributes.get("cok");
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
    public void testAttributesget1143074() {
        Attributes attributes = new Attributes();
        attributes.get("svg");
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
    public void testAttributesgetIgnoreCase19390() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("<0");
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
    public void testAttributesgetIgnoreCase26152041() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("UTF,");
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
    public void testAttributesgetIgnoreCase1003134662() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("image");
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
    public void testAttributesgetIgnoreCase21156131433() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("noembed");
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
    public void testAttributesgetIgnoreCase1434() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("p");
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
    public void testAttributesadd11608600() {
        Attributes attributes = new Attributes();
        attributes.add("DOCTYPD","frameses");
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
    public void testAttributesadd1070429141() {
        Attributes attributes = new Attributes();
        attributes.add("mati","namd");
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
    public void testAttributesadd8230024892() {
        Attributes attributes = new Attributes();
        attributes.add("tbody",":root");
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
    public void testAttributesadd18795616293() {
        Attributes attributes = new Attributes();
        attributes.add(":roou","titlf");
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
    public void testAttributesadd16579055984() {
        Attributes attributes = new Attributes();
        attributes.add(":first-child",":lt(");
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
    public void testAttributesput1515855810() {
        Attributes attributes = new Attributes();
        attributes.put("httpr",":matchesOwn)");
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
    public void testAttributesput1103853811() {
        Attributes attributes = new Attributes();
        attributes.put("lj","tfoot");
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
    public void testAttributesput1048136122() {
        Attributes attributes = new Attributes();
        attributes.put("link",":lt'");
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
    public void testAttributesput11481070963() {
        Attributes attributes = new Attributes();
        attributes.put("#texs","#roou");
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
    public void testAttributesput771654574() {
        Attributes attributes = new Attributes();
        attributes.put("DOCTYPF","basefonu");
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
    public void testAttributesput991536150() {
        Attributes attributes = new Attributes();
        attributes.put("heae",true);
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
    public void testAttributesput4059299271() {
        Attributes attributes = new Attributes();
        attributes.put("isindey",true);
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
    public void testAttributesput34942() {
        Attributes attributes = new Attributes();
        attributes.put("*",true);
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
    public void testAttributesput11107209083() {
        Attributes attributes = new Attributes();
        attributes.put("#roos",true);
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
    public void testAttributesput11852486504() {
        Attributes attributes = new Attributes();
        attributes.put("imagd",true);
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
    public void testAttributesput310() {
        Attributes attributes = new Attributes();
        attributes.put((Attribute) null);
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
    public void testAttributesput311() {
        Attributes attributes = new Attributes();
        attributes.put((Attribute) null);
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
    public void testAttributesput312() {
        Attributes attributes = new Attributes();
        attributes.put((Attribute) null);
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
    public void testAttributesput313() {
        Attributes attributes = new Attributes();
        attributes.put((Attribute) null);
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
    public void testAttributesput314() {
        Attributes attributes = new Attributes();
        attributes.put((Attribute) null);
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
    public void testAttributesremove1857353270() {
        Attributes attributes = new Attributes();
        attributes.remove("US-ASCII");
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
    public void testAttributesremove2882752491() {
        Attributes attributes = new Attributes();
        attributes.remove(":nth-child)");
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
    public void testAttributesremove18353342() {
        Attributes attributes = new Attributes();
        attributes.remove(":lt)");
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
    public void testAttributesremove32132583() {
        Attributes attributes = new Attributes();
        attributes.remove("html");
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
    public void testAttributesremove13776877274() {
        Attributes attributes = new Attributes();
        attributes.remove("button");
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
    public void testAttributesremoveIgnoreCase15368918750() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("checkboy");
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
    public void testAttributesremoveIgnoreCase15515509541() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("noscrips");
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
    public void testAttributesremoveIgnoreCase16183955612() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase(":only-of-typf");
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
    public void testAttributesremoveIgnoreCase358296673() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("#roos");
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
    public void testAttributesremoveIgnoreCase1003581224() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("inpuu");
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
    public void testAttributeshasKey14580() {
        Attributes attributes = new Attributes();
        attributes.hasKey("*}");
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
    public void testAttributeshasKey9076856541() {
        Attributes attributes = new Attributes();
        attributes.hasKey("script");
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
    public void testAttributeshasKey14562253612() {
        Attributes attributes = new Attributes();
        attributes.hasKey(":matches)");
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
    public void testAttributeshasKey30164333() {
        Attributes attributes = new Attributes();
        attributes.hasKey("basf");
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
    public void testAttributeshasKey1188384() {
        Attributes attributes = new Attributes();
        attributes.hasKey("xml");
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
    public void testAttributeshasKeyIgnoreCase18285130() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase(":eq(");
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
    public void testAttributeshasKeyIgnoreCase19732341991() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("plaintexu");
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
    public void testAttributeshasKeyIgnoreCase17209582742() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("basefons");
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
    public void testAttributeshasKeyIgnoreCase996170343() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("https");
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
    public void testAttributeshasKeyIgnoreCase569515654() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase(":not'");
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
    public void testAttributesaddAll310() {
        Attributes attributes = new Attributes();
        attributes.addAll((Attributes) null);
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
    public void testAttributesaddAll311() {
        Attributes attributes = new Attributes();
        attributes.addAll((Attributes) null);
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
    public void testAttributesaddAll312() {
        Attributes attributes = new Attributes();
        attributes.addAll((Attributes) null);
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
    public void testAttributesaddAll313() {
        Attributes attributes = new Attributes();
        attributes.addAll((Attributes) null);
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
    public void testAttributesaddAll314() {
        Attributes attributes = new Attributes();
        attributes.addAll((Attributes) null);
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
    public void testAttributesdeduplicate310() {
        Attributes attributes = new Attributes();
        attributes.deduplicate((ParseSettings) null);
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
    public void testAttributesdeduplicate311() {
        Attributes attributes = new Attributes();
        attributes.deduplicate((ParseSettings) null);
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
    public void testAttributesdeduplicate312() {
        Attributes attributes = new Attributes();
        attributes.deduplicate((ParseSettings) null);
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
    public void testAttributesdeduplicate313() {
        Attributes attributes = new Attributes();
        attributes.deduplicate((ParseSettings) null);
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
    public void testAttributesdeduplicate314() {
        Attributes attributes = new Attributes();
        attributes.deduplicate((ParseSettings) null);
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
    public void testEntitiesisNamedEntity16449536110() {
        Entities entities = new Entities();
        entities.isNamedEntity("frameseu");
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
    public void testEntitiesisNamedEntity21156131441() {
        Entities entities = new Entities();
        entities.isNamedEntity("noembee");
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
    public void testEntitiesisNamedEntity358799192() {
        Entities entities = new Entities();
        entities.isNamedEntity("#text");
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
    public void testEntitiesisNamedEntity1082706193() {
        Entities entities = new Entities();
        entities.isNamedEntity("radip");
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
    public void testEntitiesisNamedEntity570706524() {
        Entities entities = new Entities();
        entities.isNamedEntity(":roou");
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
    public void testEntitiesisBaseNamedEntity1044190() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("imh");
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
    public void testEntitiesisBaseNamedEntity18245811() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":alk");
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
    public void testEntitiesisBaseNamedEntity1188382() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("xml");
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
    public void testEntitiesisBaseNamedEntity31490283() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("forn");
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
    public void testEntitiesisBaseNamedEntity567593344() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":has'");
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
    public void testEntitiesgetCharacterByName10032436860() {
        Entities entities = new Entities();
        entities.getCharacterByName("textareb");
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
    public void testEntitiesgetCharacterByName1102773761() {
        Entities entities = new Entities();
        entities.getCharacterByName("tfoos");
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
    public void testEntitiesgetCharacterByName35756412() {
        Entities entities = new Entities();
        entities.getCharacterByName("type");
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
    public void testEntitiesgetCharacterByName35367453() {
        Entities entities = new Entities();
        entities.getCharacterByName("span");
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
    public void testEntitiesgetCharacterByName21011358004() {
        Entities entities = new Entities();
        entities.getCharacterByName(":matchTexu");
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
    public void testEntitiesgetByName9503947300() {
        Entities entities = new Entities();
        entities.getByName("command");
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
    public void testEntitiesgetByName1143071() {
        Entities entities = new Entities();
        entities.getByName("svg");
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
    public void testEntitiesgetByName26152042() {
        Entities entities = new Entities();
        entities.getByName("UTF,");
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
    public void testEntitiesgetByName1003134663() {
        Entities entities = new Entities();
        entities.getByName("image");
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
    public void testEntitiesgetByName10761623194() {
        Entities entities = new Entities();
        entities.getByName(":contains)");
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
    public void testEntitiescodepointsForName19983607670() {
        Entities entities = new Entities();
        entities.codepointsForName("hiddem",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100,55396,101,102,103,239,240,1114211,500,187,57342,57343});
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
    public void testEntitiescodepointsForName18321168361() {
        Entities entities = new Entities();
        entities.codepointsForName("checkec",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112});
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
    public void testEntitiescodepointsForName1698191962() {
        Entities entities = new Entities();
        entities.codepointsForName("selecu",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100,55396,101,102,103,239,240,1114211,500,187,57342});
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
    public void testEntitiescodepointsForName5881880863() {
        Entities entities = new Entities();
        entities.codepointsForName("isindex",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100,55396,101,102,103,239,240});
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
    public void testEntitiescodepointsForName4698717834() {
        Entities entities = new Entities();
        entities.codepointsForName("image",new int[]{0,-1,55296,192,1,55297,2,3,4});
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
    public void testEntitiesescape1907689550() {
        Entities entities = new Entities();
        entities.escape("disabled",(Document.OutputSettings) null);
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
    public void testEntitiesescape1096391261() {
        Entities entities = new Entities();
        entities.escape("spao",(Document.OutputSettings) null);
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
    public void testEntitiesescape8800731402() {
        Entities entities = new Entities();
        entities.escape("tbodx",(Document.OutputSettings) null);
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
    public void testEntitiesescape1088658003() {
        Entities entities = new Entities();
        entities.escape("rubx",(Document.OutputSettings) null);
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
    public void testEntitiesescape16597409004() {
        Entities entities = new Entities();
        entities.escape(":first-child",(Document.OutputSettings) null);
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
    public void testEntitiesescape940() {
        Entities entities = new Entities();
        entities.escape("?");
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
    public void testEntitiesescape901() {
        Entities entities = new Entities();
        entities.escape(";");
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
    public void testEntitiesescape1003581212() {
        Entities entities = new Entities();
        entities.escape("input");
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
    public void testEntitiesescape29875583() {
        Entities entities = new Entities();
        entities.escape("abs9");
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
    public void testEntitiesescape35118014() {
        Entities entities = new Entities();
        entities.escape("ruby");
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
    public void testEntitiesunescape569515670() {
        Entities entities = new Entities();
        entities.unescape(":not)");
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
    public void testEntitiesunescape16449536131() {
        Entities entities = new Entities();
        entities.unescape("frameses");
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
    public void testEntitiesunescape32302() {
        Entities entities = new Entities();
        entities.unescape("dc");
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
    public void testEntitiesunescape33737393() {
        Entities entities = new Entities();
        entities.unescape("namf");
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
    public void testEntitiesunescape33737394() {
        Entities entities = new Entities();
        entities.unescape("namf");
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
    public void testStringUtiljoin10761632490() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,":contains)");
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
    public void testStringUtiljoin17209573431() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,"basefont");
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
    public void testStringUtiljoin3081280962() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,":last-child");
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
    public void testStringUtiljoin10176260273() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,":nth-last-of-type(");
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
    public void testStringUtiljoin570715824() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,":roou");
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
    public void testStringUtiljoin569524960() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,":not(");
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
    public void testStringUtiljoin1102783081() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,"tfoou");
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
    public void testStringUtiljoin1108312() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,"odc");
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
    public void testStringUtiljoin7423148563() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,"checked");
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
    public void testStringUtiljoin12068409624() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,"http:/");
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
    public void testStringUtiljoin13586753410() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox"},"optgrouo");
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
    public void testStringUtiljoin1831477791() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao"},":last-chile");
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
    public void testStringUtiljoin1243172302() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style"},"lj");
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
    public void testStringUtiljoin989072863() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^"},":empty");
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
    public void testStringUtiljoin5082107534() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","boundarx","imf","imh","link","linl","linj","basefont","basefonu","head","heae","nobs","nobr","nobq",":empty","commane",":emptx"},":matchesOwn)");
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
    public void testStringUtilpadding573730() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(57342);
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
    public void testStringUtilpadding11141431() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(1114112);
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
    public void testStringUtilpadding1312() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(100);
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
    public void testStringUtilpadding5313() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(500);
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
    public void testStringUtilpadding5314() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(500);
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
    public void testStringUtilisBlank1650854870() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("http-equiw");
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
    public void testStringUtilisBlank923491() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("]]>");
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
    public void testStringUtilisBlank33682() {
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
    public void testStringUtilisBlank30164313() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("basd");
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
    public void testStringUtilisBlank1003581214() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("input");
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
    public void testStringUtilisNumeric19788929330() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric(":containsOwn)");
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
    public void testStringUtilisNumeric19732341971() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("plaintexs");
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
    public void testStringUtilisNumeric33702() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("hs");
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
    public void testStringUtilisNumeric713() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("(");
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
    public void testStringUtilisNumeric31984624() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("heac");
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
    public void testStringUtilisWhitespace2230() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(192);
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
    public void testStringUtilisWhitespace1321() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(101);
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
    public void testStringUtilisWhitespace553282() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(55297);
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
    public void testStringUtilisWhitespace572743() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(57243);
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
    public void testStringUtilisWhitespace554274() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(55396);
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
    public void testStringUtilisActuallyWhitespace2710() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(240);
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
    public void testStringUtilisActuallyWhitespace553281() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(55297);
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
    public void testStringUtilisActuallyWhitespace322() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(1);
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
    public void testStringUtilisActuallyWhitespace333() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(2);
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
    public void testStringUtilisActuallyWhitespace2704() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(239);
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
    public void testStringUtilisInvisibleChar11141430() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(1114112);
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
    public void testStringUtilisInvisibleChar301() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(-1);
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
        stringutil.isInvisibleChar(102);
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
    public void testStringUtilisInvisibleChar683() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(-99);
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
    public void testStringUtilisInvisibleChar1324() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(101);
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
    public void testStringUtilnormaliseWhitespace17480897440() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("DOCTYPD");
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
    public void testStringUtilnormaliseWhitespace14711890841() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace(":nth-last-child'");
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
    public void testStringUtilnormaliseWhitespace19732341982() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("plaintext");
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
    public void testStringUtilnormaliseWhitespace18353333() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace(":lt(");
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
    public void testStringUtilnormaliseWhitespace33480044() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("meta");
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
    public void testStringUtilappendNormalisedWhitespace5051637840() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(":containsData)",":root",true);
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
    public void testStringUtilappendNormalisedWhitespace876410071() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(":first-chilc","#",true);
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
    public void testStringUtilappendNormalisedWhitespace1381922932() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace("checkbow","deflate",true);
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
    public void testStringUtilappendNormalisedWhitespace18038811803() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace("titlf","inpuu",true);
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
    public void testStringUtilappendNormalisedWhitespace3233826534() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace("http-equiv",":gt)",true);
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
    public void testStringUtilin7458574440() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("svh","checkee");
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
    public void testStringUtilin3392496411() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("colgroup",":only-child");
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
    public void testStringUtilin14514103272() {
        StringUtil stringutil = new StringUtil();
        stringutil.in(":has(",":last-chilc");
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
    public void testStringUtilin34111243() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("$<","name");
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
    public void testStringUtilin1620252604() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("cok","http-equiw");
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
    public void testStringUtilinSorted20520114440() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted(":roos",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>"});
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
    public void testStringUtilinSorted13443000511() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("dc",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not("});
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
    public void testStringUtilinSorted14162582442() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("noscrips",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos"});
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
    public void testStringUtilinSorted15823397293() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("hidden",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq"});
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
    public void testStringUtilinSorted6675402404() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("^<",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","boundarx","imf","imh","link","linl","linj","basefont","basefonu","head"});
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
    public void testStringUtilresolve10030() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"*");
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
    public void testStringUtilresolve41141() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"bs");
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
    public void testStringUtilresolve1003143972() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"imagf");
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
    public void testStringUtilresolve15515518853() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"noscript");
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
    public void testStringUtilresolve569524974() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,":not)");
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
    public void testStringUtilresolve10918573230() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("table","plaintexu");
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
    public void testStringUtilresolve10325721441() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("textareb","hree");
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
    public void testStringUtilresolve16359501402() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(":nth-last-child(",":eq'");
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
    public void testStringUtilresolve18629670773() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("colgrouo","text/");
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
    public void testStringUtilresolve18688071844() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(":root","https");
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
    public void testStringUtilreleaseBuilder37270() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder("td");
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
    public void testStringUtilreleaseBuilder32471() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder("dt");
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
    public void testStringUtilreleaseBuilder10032436862() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder("textareb");
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
    public void testStringUtilreleaseBuilder996170343() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder("https");
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
    public void testStringUtilreleaseBuilder1003134654() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder("imagd");
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
    public void testNormalizerlowerCase20353119910() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase(":first-of-typd");
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
    public void testNormalizerlowerCase10552537231() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase(":matchesOwn)");
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
    public void testNormalizerlowerCase9503947302() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("command");
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
    public void testNormalizerlowerCase713() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("(");
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
    public void testNormalizerlowerCase16183955594() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase(":only-of-typd");
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
    public void testNormalizernormalize14711890850() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize(":nth-last-child(");
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
    public void testNormalizernormalize1143081() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("svh");
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
    public void testNormalizernormalize34842() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("li");
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
    public void testNormalizernormalize18912061153() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize(":nth-of-type)");
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
    public void testNormalizernormalize1605222314() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("bgsound");
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
    public void testConstrainableInputStreamwrap345705560() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,1114211,224);
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
    public void testConstrainableInputStreamwrap345673641() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,1114112,101);
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
    public void testConstrainableInputStreamwrap903262() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,103,57342);
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
    public void testConstrainableInputStreamwrap819883() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,-100,55297);
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
    public void testConstrainableInputStreamwrap267214() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,-99,-1);
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
    public void testConstrainableInputStreamreadToByteBuffer300() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(-1);
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
    public void testConstrainableInputStreamreadToByteBuffer2551() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(224);
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
    public void testConstrainableInputStreamreadToByteBuffer11142422() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(1114211);
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
    public void testConstrainableInputStreamreadToByteBuffer4313() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(400);
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
    public void testConstrainableInputStreamreadToByteBuffer684() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(-99);
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
    public void testConstrainableInputStreamtimeout10610() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(-1,100);
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
        constrainableinputstream.timeout(1,1);
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
    public void testConstrainableInputStreamtimeout9612() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(0,-1);
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
    public void testConstrainableInputStreamtimeout9933() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(1,1);
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
    public void testConstrainableInputStreamtimeout40614() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(100,-1);
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
    public void testJsoupparse17648637710() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("link","[a-zA-Z_:][-a-zA-Z0-9_:.]+");
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
    public void testJsoupparse8770201991() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("text.","$=");
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
    public void testJsoupparse70802002() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("svf","span");
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
    public void testJsoupparse945183() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("(","]]=");
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
    public void testJsoupparse17595430964() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(":has(","ts");
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
    public void testJsoupparse9336790610() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("frameset","bgsounc",(Parser) null);
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
    public void testJsoupparse8734207881() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("--","theac",(Parser) null);
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
    public void testJsoupparse15630829232() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("optgroup","optioo",(Parser) null);
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
    public void testJsoupparse1337812183() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("http:/","lj",(Parser) null);
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
    public void testJsoupparse10504339264() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("style",":only-of-typf",(Parser) null);
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
    public void testJsoupparse32470() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("dt");
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
    public void testJsoupparse16449536121() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("frameset");
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
    public void testJsoupparse1102563202() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("text.");
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
    public void testJsoupparse35118013() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("ruby");
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
    public void testJsoupparse1003134664() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("image");
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
    public void testJsoupconnect30294420() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("bodz");
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
    public void testJsoupconnect34851() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("lj");
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
    public void testJsoupconnect12072() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("$<");
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
    public void testJsoupconnect16449536133() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("frameses");
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
    public void testJsoupconnect11154() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("!=");
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
    public void testJsoupparse5242195490() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"noscripu","buttom");
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
    public void testJsoupparse16771100621() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"noframer","gzio");
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
    public void testJsoupparse14364992162() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"charseu","^");
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
    public void testJsoupparse8243964793() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"table",":not)");
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
    public void testJsoupparse17595682814() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,":has'","a");
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
    public void testJsoupparse1003590510() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"input");
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
    public void testJsoupparse30173611() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"basd");
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
    public void testJsoupparse9076847232() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"scripu");
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
    public void testJsoupparse15451135793() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"deflatd");
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
    public void testJsoupparse33228114() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"link");
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
    public void testJsoupparse9158380470() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"hiddem","httq");
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
    public void testJsoupparse11832680011() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"http:/","sarcasn");
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
    public void testJsoupparse17860658852() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"tbodz","selecs");
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
    public void testJsoupparse7424027723() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"<.","checked");
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
    public void testJsoupparse1105242164() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"~>","titlf");
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
    public void testJsoupparse16428607800() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"ds",":matchesOwn)",(Parser) null);
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
    public void testJsoupparse1101915771() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"odc","xmk",(Parser) null);
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
    public void testJsoupparse5209247762() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"htmk","iframd",(Parser) null);
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
    public void testJsoupparse1746202823() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"basefont","linl",(Parser) null);
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
    public void testJsoupparse610354974() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"tc",":all",(Parser) null);
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
    public void testJsoupparseBodyFragment18913569920() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("optgrouo","input");
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
    public void testJsoupparseBodyFragment9586914761() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":last-chile","name");
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
    public void testJsoupparseBodyFragment19762944872() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("com","plaintext");
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
    public void testJsoupparseBodyFragment4022062693() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("checkbox","heac");
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
    public void testJsoupparseBodyFragment35492484() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("$>","rubx");
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
    public void testJsoupparseBodyFragment996170340() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("https");
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
    public void testJsoupparseBodyFragment20353119911() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":first-of-typd");
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
    public void testJsoupparseBodyFragment567593352() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":has(");
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
    public void testJsoupparseBodyFragment31490263() {
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
    public void testJsoupparseBodyFragment6361976034() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("colgrouo");
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
    public void testJsoupparse12000() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,239);
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
    public void testJsoupparse8611() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,-100);
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
    public void testJsoupparse11151722() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,1114211);
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
    public void testJsoupparse9633() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,2);
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
    public void testJsoupparse9654() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,4);
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
    public void testJsoupclean1688542510() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("basefons","spam",(Whitelist) null);
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
    public void testJsoupclean7685717331() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":nth-last-child(","h0",(Whitelist) null);
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
    public void testJsoupclean9116113702() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":nth-last-of-type'","[a-zA-Z_:][-a-zA-Z0-9_:.]+",(Whitelist) null);
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
    public void testJsoupclean1065724203() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("tr","linj",(Whitelist) null);
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
    public void testJsoupclean9172656074() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("rubx","]]?",(Whitelist) null);
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
    public void testJsoupclean16597408690() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":first-chile",(Whitelist) null);
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
    public void testJsoupclean16437928461() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("DOCTYPF",(Whitelist) null);
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
    public void testJsoupclean15368951952() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("checkec",(Whitelist) null);
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
    public void testJsoupclean1080353() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("lj",(Whitelist) null);
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
    public void testJsoupclean996178494() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("http",(Whitelist) null);
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
    public void testJsoupclean20654860820() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("forn","caption",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean18195005551() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("br",":first-of-typf",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean2164379842() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("noembee","plaintexu",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean14543163923() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("h6","captiom",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean13333121014() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("]]?","text0",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupisValid16803279420() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("noframes",(Whitelist) null);
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
    public void testJsoupisValid12634923331() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("Set-Cookid",(Whitelist) null);
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
    public void testJsoupisValid996178492() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("http",(Whitelist) null);
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
    public void testJsoupisValid28523() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("=",(Whitelist) null);
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
    public void testJsoupisValid860672534() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("\"\"",(Whitelist) null);
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
    public void testParserparseInput16342668510() {
        Parser parser = new Parser();
        parser.parseInput(":nth-last-child(","ruby");
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
    public void testParserparseInput180892981() {
        Parser parser = new Parser();
        parser.parseInput("gzip","optgrouo");
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
    public void testParserparseInput21016575182() {
        Parser parser = new Parser();
        parser.parseInput(":matches)","li");
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
    public void testParserparseInput16468729443() {
        Parser parser = new Parser();
        parser.parseInput(":matchesOwn(","*");
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
    public void testParserparseInput1137997754() {
        Parser parser = new Parser();
        parser.parseInput("svf","text.");
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
    public void testParserparseInput1197730() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"xmq");
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
    public void testParserparseInput567602651() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,":has(");
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
    public void testParserparseInput996502() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"com");
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
    public void testParserparseInput1082715473() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"radin");
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
    public void testParserparseInput46584() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"te");
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
    public void testParserparseFragmentInput10401885910() {
        Parser parser = new Parser();
        parser.parseFragmentInput("nobs",(Element) null,"--");
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
    public void testParserparseFragmentInput1338862791() {
        Parser parser = new Parser();
        parser.parseFragmentInput("http:.",(Element) null,"^<");
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
    public void testParserparseFragmentInput6750618772() {
        Parser parser = new Parser();
        parser.parseFragmentInput(":emptz",(Element) null,"imf");
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
    public void testParserparseFragmentInput13722043() {
        Parser parser = new Parser();
        parser.parseFragmentInput("metb",(Element) null,":contains(");
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
    public void testParserparseFragmentInput1872662284() {
        Parser parser = new Parser();
        parser.parseFragmentInput("#texs",(Element) null,":last-chilc");
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
    public void testParsersetTreeBuilder310() {
        Parser parser = new Parser();
        parser.setTreeBuilder((TreeBuilder) null);
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
    public void testParsersetTreeBuilder311() {
        Parser parser = new Parser();
        parser.setTreeBuilder((TreeBuilder) null);
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
    public void testParsersetTreeBuilder312() {
        Parser parser = new Parser();
        parser.setTreeBuilder((TreeBuilder) null);
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
    public void testParsersetTreeBuilder313() {
        Parser parser = new Parser();
        parser.setTreeBuilder((TreeBuilder) null);
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
    public void testParsersetTreeBuilder314() {
        Parser parser = new Parser();
        parser.setTreeBuilder((TreeBuilder) null);
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
    public void testParsersetTrackErrors11141430() {
        Parser parser = new Parser();
        parser.setTrackErrors(1114112);
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
    public void testParsersetTrackErrors4321() {
        Parser parser = new Parser();
        parser.setTrackErrors(401);
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
    public void testParsersetTrackErrors553282() {
        Parser parser = new Parser();
        parser.setTrackErrors(55297);
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
    public void testParsersetTrackErrors553273() {
        Parser parser = new Parser();
        parser.setTrackErrors(55296);
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
    public void testParsersetTrackErrors553274() {
        Parser parser = new Parser();
        parser.setTrackErrors(55296);
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
    public void testParsersettings310() {
        Parser parser = new Parser();
        parser.settings((ParseSettings) null);
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
    public void testParsersettings311() {
        Parser parser = new Parser();
        parser.settings((ParseSettings) null);
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
    public void testParsersettings312() {
        Parser parser = new Parser();
        parser.settings((ParseSettings) null);
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
    public void testParsersettings313() {
        Parser parser = new Parser();
        parser.settings((ParseSettings) null);
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
    public void testParsersettings314() {
        Parser parser = new Parser();
        parser.settings((ParseSettings) null);
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
    public void testParserparse12143142910() {
        Parser parser = new Parser();
        parser.parse(":containsOwn'",":alk");
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
    public void testParserparse5316369221() {
        Parser parser = new Parser();
        parser.parse("[a-zA-Z_:][-a-zA-Z0-9_:.]*","checkbow");
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
    public void testParserparse17560844932() {
        Parser parser = new Parser();
        parser.parse("colgrouo","namd");
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
    public void testParserparse15594274343() {
        Parser parser = new Parser();
        parser.parse(":first-chile","image");
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
    public void testParserparse20928180014() {
        Parser parser = new Parser();
        parser.parse("type","isindex");
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
    public void testParserparseFragment28878470() {
        Parser parser = new Parser();
        parser.parseFragment("^<",(Element) null,"*");
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
    public void testParserparseFragment20914245481() {
        Parser parser = new Parser();
        parser.parseFragment("^",(Element) null,"isindew");
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
    public void testParserparseFragment10062723142() {
        Parser parser = new Parser();
        parser.parseFragment("plaintext",(Element) null,"iframe");
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
    public void testParserparseFragment69732843() {
        Parser parser = new Parser();
        parser.parseFragment("ti",(Element) null,"nobq");
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
    public void testParserparseFragment20160789364() {
        Parser parser = new Parser();
        parser.parseFragment("forn",(Element) null,"optiom");
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
    public void testParserparseFragment17759387170() {
        Parser parser = new Parser();
        parser.parseFragment("tablf",(Element) null,"tablf",(ParseErrorList) null);
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
    public void testParserparseFragment14824680761() {
        Parser parser = new Parser();
        parser.parseFragment("boundary",(Element) null,"svf",(ParseErrorList) null);
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
    public void testParserparseFragment7478987402() {
        Parser parser = new Parser();
        parser.parseFragment("imagf",(Element) null,"typd",(ParseErrorList) null);
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
    public void testParserparseFragment21245588083() {
        Parser parser = new Parser();
        parser.parseFragment("nobs",(Element) null,":all",(ParseErrorList) null);
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
    public void testParserparseFragment15067719184() {
        Parser parser = new Parser();
        parser.parseFragment(":only-chile",(Element) null,"typd",(ParseErrorList) null);
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
    public void testParserparseXmlFragment18100970350() {
        Parser parser = new Parser();
        parser.parseXmlFragment("basefons","</");
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
    public void testParserparseXmlFragment11491159461() {
        Parser parser = new Parser();
        parser.parseXmlFragment("optioo","inpuu");
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
    public void testParserparseXmlFragment11625576312() {
        Parser parser = new Parser();
        parser.parseXmlFragment("radio",":matchTexu");
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
    public void testParserparseXmlFragment1037921213() {
        Parser parser = new Parser();
        parser.parseXmlFragment("metb","~<");
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
    public void testParserparseXmlFragment3493715994() {
        Parser parser = new Parser();
        parser.parseXmlFragment("iframe","button");
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
    public void testParserparseBodyFragment32256910() {
        Parser parser = new Parser();
        parser.parseBodyFragment("dd","even");
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
    public void testParserparseBodyFragment2846651331() {
        Parser parser = new Parser();
        parser.parseBodyFragment(":nth-of-type)","hidden");
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
    public void testParserparseBodyFragment15368985012() {
        Parser parser = new Parser();
        parser.parseBodyFragment("checked","h3");
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
    public void testParserparseBodyFragment5460467263() {
        Parser parser = new Parser();
        parser.parseBodyFragment("frameses","$=");
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
    public void testParserparseBodyFragment821057444() {
        Parser parser = new Parser();
        parser.parseBodyFragment("iframf","frameses");
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
    public void testParserunescapeEntities8770200830() {
        Parser parser = new Parser();
        parser.unescapeEntities("text0",true);
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
    public void testParserunescapeEntities28640811() {
        Parser parser = new Parser();
        parser.unescapeEntities("]]?",true);
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
    public void testParserunescapeEntities17691913812() {
        Parser parser = new Parser();
        parser.unescapeEntities(":roos",true);
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
    public void testParserunescapeEntities11618014153() {
        Parser parser = new Parser();
        parser.unescapeEntities("actioo",true);
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
    public void testParserunescapeEntities943864() {
        Parser parser = new Parser();
        parser.unescapeEntities("^<",true);
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
    public void testParserparseBodyFragmentRelaxed2657440790() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed(":containsOwn)","commane");
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
    public void testParserparseBodyFragmentRelaxed1922313011() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("abs9","https");
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
    public void testParserparseBodyFragmentRelaxed598718972() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed(":gt(","evem");
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
    public void testParserparseBodyFragmentRelaxed1074885233() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed(":empty",":nth-last-child'");
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
    public void testParserparseBodyFragmentRelaxed7808619304() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("optgrouo","optiom");
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
    public void testTagvalueOf601090() {
        Tag tag = new Tag();
        tag.valueOf("<0",(ParseSettings) null);
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
    public void testTagvalueOf1156921() {
        Tag tag = new Tag();
        tag.valueOf("ti",(ParseSettings) null);
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
    public void testTagvalueOf1088658002() {
        Tag tag = new Tag();
        tag.valueOf("rubx",(ParseSettings) null);
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
    public void testTagvalueOf8784015873() {
        Tag tag = new Tag();
        tag.valueOf(":last-of-typf",(ParseSettings) null);
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
    public void testTagvalueOf10407179634() {
        Tag tag = new Tag();
        tag.valueOf("plaintexs",(ParseSettings) null);
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
    public void testTagvalueOf31840() {
        Tag tag = new Tag();
        tag.valueOf("bs");
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
    public void testTagvalueOf358296691() {
        Tag tag = new Tag();
        tag.valueOf("#roou");
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
    public void testTagvalueOf15451126492() {
        Tag tag = new Tag();
        tag.valueOf("deflatd");
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
    public void testTagvalueOf3081290273() {
        Tag tag = new Tag();
        tag.valueOf(":last-chilc");
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
    public void testTagvalueOf17480897444() {
        Tag tag = new Tag();
        tag.valueOf("DOCTYPD");
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
    public void testTagisKnownTag10032436870() {
        Tag tag = new Tag();
        tag.isKnownTag("textarea");
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
    public void testTagisKnownTag9060216051() {
        Tag tag = new Tag();
        tag.isKnownTag("select");
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
    public void testTagisKnownTag30062() {
        Tag tag = new Tag();
        tag.isKnownTag("^=");
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
    public void testTagisKnownTag37263() {
        Tag tag = new Tag();
        tag.isKnownTag("tc");
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
    public void testTagisKnownTag923484() {
        Tag tag = new Tag();
        tag.isKnownTag("]]=");
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
    public void testParseErrorListtracking11141430() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(1114112);
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
    public void testParseErrorListtracking554271() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(55396);
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
    public void testParseErrorListtracking2222() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(191);
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
    public void testParseErrorListtracking1343() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(103);
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
    public void testParseErrorListtracking2234() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(192);
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
    public void testCharacterReaderconsumeTo1230() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo('\\');
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
    public void testCharacterReaderconsumeTo1421() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo('o');
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
    public void testCharacterReaderconsumeTo1002() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo('E');
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
    public void testCharacterReaderconsumeTo1243() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo(']');
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
    public void testCharacterReaderconsumeTo924() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo('=');
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
    public void testCharacterReaderconsumeToAny1010() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('F');
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
    public void testCharacterReaderconsumeToAny781() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('/');
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
    public void testCharacterReaderconsumeToAny672() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('$');
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
    public void testCharacterReaderconsumeToAny1263() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('_');
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
    public void testCharacterReaderconsumeToAny914() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('<');
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
    public void testDataUtilload10275930790() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,"[CDATA[","bodx");
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
    public void testDataUtilload369091() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,"|","h2");
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
    public void testDataUtilload9055222322() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,"namf","option");
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
    public void testDataUtilload19740850663() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,"nobr","sarcasm");
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
    public void testDataUtilload97224054() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,":matches(",":only-child");
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
    public void testDataUtilload11154318790() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"#texu","evem");
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
    public void testDataUtilload1448931() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"ts","=");
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
    public void testDataUtilload3705805932() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"htmk","disabled");
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
    public void testDataUtilload6598993583() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"text0","checkbow");
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
    public void testDataUtilload15402720604() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"checkee","meta");
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
    public void testDataUtilload7390856630() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"namd","optgroup",(Parser) null);
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
    public void testDataUtilload9964135951() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"*|",":contains'",(Parser) null);
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
    public void testDataUtilload7694222182() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,":nth-last-child'","<0",(Parser) null);
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
    public void testDataUtilload5647632413() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"text/","template",(Parser) null);
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
    public void testDataUtilload14085057654() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"html","noframes",(Parser) null);
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
    public void testDataUtilreadToByteBuffer8610() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,-100);
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
    public void testDataUtilreadToByteBuffer9601() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,-1);
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
    public void testDataUtilreadToByteBuffer14612() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,500);
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
    public void testDataUtilreadToByteBuffer9653() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,4);
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
    public void testDataUtilreadToByteBuffer563574() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,55396);
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
    public void testValidatenotNull310() {
        Validate validate = new Validate();
        validate.notNull((Object) null);
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
    public void testValidatenotNull311() {
        Validate validate = new Validate();
        validate.notNull((Object) null);
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
    public void testValidatenotNull312() {
        Validate validate = new Validate();
        validate.notNull((Object) null);
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
    public void testValidatenotNull313() {
        Validate validate = new Validate();
        validate.notNull((Object) null);
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
    public void testValidatenotNull314() {
        Validate validate = new Validate();
        validate.notNull((Object) null);
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
    public void testValidatenotNull11346646210() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"keygeo");
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
    public void testValidatenotNull1101167511() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"table");
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
    public void testValidatenotNull33877932() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"nobq");
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
    public void testValidatenotNull1103723763() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"titld");
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
    public void testValidatenotNull19788920054() {
        Validate validate = new Validate();
        validate.notNull((Object) null,":containsOwn'");
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
        validate.isTrue(true);
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
        validate.isTrue(true);
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
        validate.isTrue(true);
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
        validate.isTrue(true);
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
        validate.isTrue(true);
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
    public void testValidateisTrue1102954120() {
        Validate validate = new Validate();
        validate.isTrue(true,"text/");
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
    public void testValidateisTrue423231() {
        Validate validate = new Validate();
        validate.isTrue(true,"de");
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
    public void testValidateisTrue430892() {
        Validate validate = new Validate();
        validate.isTrue(true,"~=");
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
    public void testValidateisTrue571097433() {
        Validate validate = new Validate();
        validate.isTrue(true,":roou");
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
    public void testValidateisTrue423984() {
        Validate validate = new Validate();
        validate.isTrue(true,"h4");
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
        validate.isFalse(true);
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
        validate.isFalse(true);
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
        validate.isFalse(true);
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
        validate.isFalse(true);
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
        validate.isFalse(true);
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
    public void testValidateisFalse996561240() {
        Validate validate = new Validate();
        validate.isFalse(true,"httpr");
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
    public void testValidateisFalse19732732881() {
        Validate validate = new Validate();
        validate.isFalse(true,"plaintexs");
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
    public void testValidateisFalse410302() {
        Validate validate = new Validate();
        validate.isFalse(true,"<0");
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
    public void testValidateisFalse34259543() {
        Validate validate = new Validate();
        validate.isFalse(true,"nobq");
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
    public void testValidateisFalse34128284() {
        Validate validate = new Validate();
        validate.isFalse(true,"namd");
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
    public void testValidatenoNullElements267280800() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
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
    public void testValidatenoNullElements10767707791() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
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
    public void testValidatenoNullElements20414165262() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
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
    public void testValidatenoNullElements5028009753() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
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
    public void testValidatenoNullElements5769368954() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
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
    public void testValidatenoNullElements16840431770() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"ds");
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
    public void testValidatenoNullElements8491034601() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"^<");
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
    public void testValidatenoNullElements10599036512() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"noframes");
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
    public void testValidatenoNullElements2704102993() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"br");
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
    public void testValidatenoNullElements11903865754() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"$>");
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
    public void testValidatenotEmpty14700() {
        Validate validate = new Validate();
        validate.notEmpty("-,");
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
    public void testValidatenotEmpty35367461() {
        Validate validate = new Validate();
        validate.notEmpty("spao");
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
    public void testValidatenotEmpty14722() {
        Validate validate = new Validate();
        validate.notEmpty("-.");
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
    public void testValidatenotEmpty29875583() {
        Validate validate = new Validate();
        validate.notEmpty("abs9");
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
    public void testValidatenotEmpty17571249774() {
        Validate validate = new Validate();
        validate.notEmpty(":emptx");
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
    public void testValidatenotEmpty17527139400() {
        Validate validate = new Validate();
        validate.notEmpty("colgrouo","bs");
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
    public void testValidatenotEmpty807386701() {
        Validate validate = new Validate();
        validate.notEmpty("!<","optgroup");
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
    public void testValidatenotEmpty8783976212() {
        Validate validate = new Validate();
        validate.notEmpty(":last-of-typf","~<");
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
    public void testValidatenotEmpty16769392253() {
        Validate validate = new Validate();
        validate.notEmpty("action",":matches'");
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
    public void testValidatenotEmpty36841934() {
        Validate validate = new Validate();
        validate.notEmpty("xmp","[");
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
    public void testValidatefail33040() {
        Validate validate = new Validate();
        validate.fail("h1");
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
    public void testValidatefail1103268991() {
        Validate validate = new Validate();
        validate.fail("thead");
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
    public void testValidatefail11414281682() {
        Validate validate = new Validate();
        validate.fail("[CDATA[");
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
    public void testValidatefail1097804313() {
        Validate validate = new Validate();
        validate.fail("styld");
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
    public void testValidatefail39974() {
        Validate validate = new Validate();
        validate.fail("~<");
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
    public void testHttpConnectionconnect807731740() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("optgrouo");
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
    public void testHttpConnectionconnect13776877281() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("buttom");
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
    public void testHttpConnectionconnect31842() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("bs");
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
    public void testHttpConnectionconnect567593363() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect(":has)");
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
    public void testHttpConnectionconnect16449536114() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("frameseu");
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
    public void testHttpConnectionconnect310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect((URL) null);
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
    public void testHttpConnectionconnect311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect((URL) null);
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
    public void testHttpConnectionconnect312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect((URL) null);
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
    public void testHttpConnectionconnect313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect((URL) null);
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
    public void testHttpConnectionconnect314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect((URL) null);
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
    public void testHttpConnectionurl310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url((URL) null);
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
    public void testHttpConnectionurl311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url((URL) null);
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
        httpconnection.url((URL) null);
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
    public void testHttpConnectionurl313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url((URL) null);
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
    public void testHttpConnectionurl314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url((URL) null);
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
    public void testHttpConnectionurl569515650() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url(":not'");
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
    public void testHttpConnectionurl1605222301() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("bgsoune");
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
    public void testHttpConnectionurl11927218622() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("noframes");
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
    public void testHttpConnectionurl1857353263() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("US-ASCIJ");
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
    public void testHttpConnectionurl17480897424() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("DOCTYPF");
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
    public void testHttpConnectionproxy310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy((Proxy) null);
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
    public void testHttpConnectionproxy311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy((Proxy) null);
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
        httpconnection.proxy((Proxy) null);
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
    public void testHttpConnectionproxy313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy((Proxy) null);
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
    public void testHttpConnectionproxy314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy((Proxy) null);
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
    public void testHttpConnectionproxy11852497480() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("image",102);
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
    public void testHttpConnectionproxy1006571() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("dt",0);
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
    public void testHttpConnectionproxy434062() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("*=",192);
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
    public void testHttpConnectionproxy968926143() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("eveo",192);
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
    public void testHttpConnectionproxy19817283644() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("templatd",4);
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
    public void testHttpConnectionuserAgent1099010() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("odc");
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
    public void testHttpConnectionuserAgent30294401() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("bodx");
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
    public void testHttpConnectionuserAgent6361976022() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("colgroup");
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
    public void testHttpConnectionuserAgent37273() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("td");
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
    public void testHttpConnectionuserAgent31844() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("bs");
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
        httpconnection.timeout(224);
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
    public void testHttpConnectiontimeout331() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(2);
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
    public void testHttpConnectiontimeout573742() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(57343);
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
    public void testHttpConnectiontimeout303() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(-1);
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
    public void testHttpConnectiontimeout1334() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(102);
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
    public void testHttpConnectionmaxBodySize573730() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(57342);
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
    public void testHttpConnectionmaxBodySize1331() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(102);
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
    public void testHttpConnectionmaxBodySize11142422() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(1114211);
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
    public void testHttpConnectionmaxBodySize1313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(100);
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
    public void testHttpConnectionmaxBodySize2234() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(192);
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
        httpconnection.followRedirects(true);
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
        httpconnection.followRedirects(true);
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
        httpconnection.followRedirects(true);
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
        httpconnection.followRedirects(true);
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
        httpconnection.followRedirects(true);
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
    public void testHttpConnectionreferrer29875600() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("abs;");
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
    public void testHttpConnectionreferrer31490261() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("forl");
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
    public void testHttpConnectionreferrer1082706182() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("radio");
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
    public void testHttpConnectionreferrer30294403() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("bodx");
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
    public void testHttpConnectionreferrer1605222314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("bgsound");
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
    public void testHttpConnectionmethod310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method((Method) null);
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
    public void testHttpConnectionmethod311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method((Method) null);
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
    public void testHttpConnectionmethod312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method((Method) null);
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
    public void testHttpConnectionmethod313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method((Method) null);
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
    public void testHttpConnectionmethod314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method((Method) null);
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
        httpconnection.ignoreHttpErrors(true);
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
        httpconnection.ignoreHttpErrors(true);
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
        httpconnection.ignoreHttpErrors(true);
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
        httpconnection.ignoreHttpErrors(true);
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
        httpconnection.ignoreHttpErrors(true);
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
        httpconnection.ignoreContentType(true);
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
        httpconnection.ignoreContentType(true);
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
        httpconnection.ignoreContentType(true);
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
        httpconnection.ignoreContentType(true);
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
        httpconnection.ignoreContentType(true);
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
    public void testHttpConnectiondata14426219220() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("titlf",":containsOwn'");
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
    public void testHttpConnectiondata996210181() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("htto","dd");
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
    public void testHttpConnectiondata16279133592() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("US-ASCII","http-equiw");
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
    public void testHttpConnectiondata21099048653() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("sarcasl","rubz");
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
    public void testHttpConnectiondata9385781064() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("radin","?");
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
    public void testHttpConnectionsslSocketFactory310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory((SSLSocketFactory) null);
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
    public void testHttpConnectionsslSocketFactory311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory((SSLSocketFactory) null);
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
    public void testHttpConnectionsslSocketFactory312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory((SSLSocketFactory) null);
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
    public void testHttpConnectionsslSocketFactory313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory((SSLSocketFactory) null);
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
    public void testHttpConnectionsslSocketFactory314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory((SSLSocketFactory) null);
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
    public void testHttpConnectiondata13334400070() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("command","US-ASCIJ",(InputStream) null);
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
    public void testHttpConnectiondata9723589311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("matg","rubx",(InputStream) null);
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
    public void testHttpConnectiondata9962088602() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("gziq","[a-zA-Z_:][-a-zA-Z0-9_:.]+",(InputStream) null);
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
    public void testHttpConnectiondata888479223() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("]]=","h2",(InputStream) null);
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
    public void testHttpConnectiondata1242311414() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":matches)","commanc",(InputStream) null);
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
    public void testHttpConnectiondata35367460() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("spao");
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
    public void testHttpConnectiondata9503947291() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("commanc");
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
    public void testHttpConnectiondata26152062() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("UTF.");
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
    public void testHttpConnectiondata35756413() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("type");
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
    public void testHttpConnectiondata33737374() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("namd");
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
    public void testHttpConnectiondata21065455180() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":last-of-type");
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
    public void testHttpConnectiondata10176250981() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":nth-last-of-type)");
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
    public void testHttpConnectiondata37272() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("td");
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
    public void testHttpConnectiondata11346655523() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("keygen");
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
    public void testHttpConnectiondata17571249784() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":empty");
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
    public void testHttpConnectiondata310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data((Collection<Connection.KeyVal>) null);
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
    public void testHttpConnectiondata311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data((Collection<Connection.KeyVal>) null);
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
    public void testHttpConnectiondata312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data((Collection<Connection.KeyVal>) null);
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
    public void testHttpConnectiondata313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data((Collection<Connection.KeyVal>) null);
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
    public void testHttpConnectiondata314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data((Collection<Connection.KeyVal>) null);
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
    public void testHttpConnectiondata31255610() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("even");
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
    public void testHttpConnectiondata3081290261() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":last-child");
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
    public void testHttpConnectiondata33868642() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("nobr");
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
    public void testHttpConnectiondata18245813() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":alk");
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
    public void testHttpConnectiondata14562253634() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":matches'");
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
    public void testHttpConnectionrequestBody1188370() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("xmk");
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
    public void testHttpConnectionrequestBody17480897421() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("DOCTYPF");
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
    public void testHttpConnectionrequestBody32134802() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("httq");
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
    public void testHttpConnectionrequestBody33693() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("hr");
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
    public void testHttpConnectionrequestBody19374() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("<.");
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
    public void testHttpConnectionheader2665947100() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("thead","[CDATA[");
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
    public void testHttpConnectionheader6029971471() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("frameseu",":not)");
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
    public void testHttpConnectionheader991524302() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("heae",".");
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
    public void testHttpConnectionheader6227183373() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header(":containsData(","meta");
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
    public void testHttpConnectionheader13495346154() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("colgrouq","noframet");
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
    public void testHttpConnectionheaders2709408280() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers("disablee");
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
    public void testHttpConnectionheaders32461() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers("ds");
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
    public void testHttpConnectionheaders14711890862() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers(":nth-last-child)");
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
    public void testHttpConnectionheaders16449536123() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers("frameset");
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
    public void testHttpConnectionheaders30294414() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers("body");
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
    public void testHttpConnectioncookie32506760() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("$=","htmm");
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
    public void testHttpConnectioncookie11107197121() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("#roos","#");
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
    public void testHttpConnectioncookie568966562() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie(":lt'","*>");
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
    public void testHttpConnectioncookie5483054563() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("disablee","charset");
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
    public void testHttpConnectioncookie18758253824() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie(":not'","theac");
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
    public void testHttpConnectioncookies2709408270() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies("disabled");
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
    public void testHttpConnectioncookies1101158201() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies("tabld");
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
    public void testHttpConnectioncookies33062() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies("h3");
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
    public void testHttpConnectioncookies19383() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies("</");
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
    public void testHttpConnectioncookies32134794() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies("http");
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
    public void testHttpConnectionparser310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser((Parser) null);
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
    public void testHttpConnectionparser311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser((Parser) null);
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
    public void testHttpConnectionparser312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser((Parser) null);
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
    public void testHttpConnectionparser313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser((Parser) null);
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
    public void testHttpConnectionparser314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser((Parser) null);
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
    public void testHttpConnectionrequest310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request((Connection.Request) null);
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
    public void testHttpConnectionrequest311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request((Connection.Request) null);
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
    public void testHttpConnectionrequest312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request((Connection.Request) null);
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
    public void testHttpConnectionrequest313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request((Connection.Request) null);
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
        httpconnection.request((Connection.Request) null);
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
    public void testHttpConnectionresponse310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response((Connection.Response) null);
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
        httpconnection.response((Connection.Response) null);
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
    public void testHttpConnectionresponse312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response((Connection.Response) null);
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
    public void testHttpConnectionresponse313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response((Connection.Response) null);
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
    public void testHttpConnectionresponse314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response((Connection.Response) null);
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
    public void testHttpConnectionpostDataCharset20919604270() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset(":only-chile");
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
    public void testHttpConnectionpostDataCharset2709408271() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("disabled");
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
    public void testHttpConnectionpostDataCharset1097804332() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("stylf");
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
    public void testHttpConnectionpostDataCharset11153() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("!=");
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
    public void testHttpConnectionpostDataCharset35756404() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("typd");
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
    public void testW3CDomfromJsoup310() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup((org.jsoup.nodes.Document) null);
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
    public void testW3CDomfromJsoup311() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup((org.jsoup.nodes.Document) null);
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
    public void testW3CDomfromJsoup312() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup((org.jsoup.nodes.Document) null);
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
    public void testW3CDomfromJsoup313() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup((org.jsoup.nodes.Document) null);
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
    public void testW3CDomfromJsoup314() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup((org.jsoup.nodes.Document) null);
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
    public void testW3CDomconvert9610() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert((org.jsoup.nodes.Document) null,(Document) null);
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
    public void testW3CDomconvert9611() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert((org.jsoup.nodes.Document) null,(Document) null);
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
    public void testW3CDomconvert9612() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert((org.jsoup.nodes.Document) null,(Document) null);
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
    public void testW3CDomconvert9613() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert((org.jsoup.nodes.Document) null,(Document) null);
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
    public void testW3CDomconvert9614() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert((org.jsoup.nodes.Document) null,(Document) null);
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
    public void testW3CDomasString310() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString((Document) null);
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
        w3cdom.asString((Document) null);
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
    public void testW3CDomasString312() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString((Document) null);
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
    public void testW3CDomasString313() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString((Document) null);
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
    public void testW3CDomasString314() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString((Document) null);
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
    public void testTokenQueueaddFirst960() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst('A');
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
    public void testTokenQueueaddFirst1261() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst('_');
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
    public void testTokenQueueaddFirst672() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst('$');
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
    public void testTokenQueueaddFirst953() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst('@');
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
    public void testTokenQueueaddFirst924() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst('=');
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
    public void testTokenQueueaddFirst923490() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("]]>");
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
    public void testTokenQueueaddFirst1103714481() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("titlf");
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
    public void testTokenQueueaddFirst31832() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("br");
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
    public void testTokenQueueaddFirst14713() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("--");
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
    public void testTokenQueueaddFirst1650854884() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("http-equiv");
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
    public void testTokenQueuematches1103714460() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("titld");
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
    public void testTokenQueuematches9060216041() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("selecu");
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
    public void testTokenQueuematches20919604272() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches(":only-chile");
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
    public void testTokenQueuematches9076856533() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("scripu");
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
    public void testTokenQueuematches1284() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("a");
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
    public void testTokenQueuematchesCS11414281680() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("[CDATA[");
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
    public void testTokenQueuematchesCS1082706171() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("radin");
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
    public void testTokenQueuematchesCS26152042() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("UTF,");
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
    public void testTokenQueuematchesCS18305273() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS(":gt'");
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
    public void testTokenQueuematchesCS21156131444() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("noembee");
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
    public void testTokenQueuematchesAny32134780() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("htto");
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
    public void testTokenQueuematchesAny18305291() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(":gt)");
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
    public void testTokenQueuematchesAny1103268982() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("theac");
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
    public void testTokenQueuematchesAny33693() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("hr");
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
    public void testTokenQueuematchesAny32110814() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("hree");
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
    public void testTokenQueuematchesAny740() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('+');
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
    public void testTokenQueuematchesAny701() {
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
    public void testTokenQueuematchesAny1022() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('G');
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
    public void testTokenQueuematchesAny1423() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('o');
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
    public void testTokenQueuematchesAny1214() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('Z');
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
    public void testTokenQueuematchChomp1605222320() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("bgsounc");
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
    public void testTokenQueuematchChomp19804204671() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("Set-Cookid");
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
    public void testTokenQueuematchChomp33480042() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("meta");
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
    public void testTokenQueuematchChomp923() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("=");
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
    public void testTokenQueuematchChomp2709408264() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("disablec");
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
    public void testTokenQueueconsume900() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume(";");
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
    public void testTokenQueueconsume1082706171() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("radin");
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
    public void testTokenQueueconsume26152052() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("UTF-");
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
    public void testTokenQueueconsume33218823() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("linl");
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
    public void testTokenQueueconsume1857353284() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("US-ASCIH");
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
    public void testTokenQueueconsumeTo31984630() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("head");
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
    public void testTokenQueueconsumeTo19788929351() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo(":containsOwn'");
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
    public void testTokenQueueconsumeTo1188372() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("xmk");
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
    public void testTokenQueueconsumeTo13215465993() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("template");
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
    public void testTokenQueueconsumeTo7390744104() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("charses");
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
    public void testTokenQueueconsumeToIgnoreCase21156131440() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("noembee");
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
    public void testTokenQueueconsumeToIgnoreCase941() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("?");
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
    public void testTokenQueueconsumeToIgnoreCase1044192() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("imh");
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
    public void testTokenQueueconsumeToIgnoreCase10552537223() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase(":matchesOwn(");
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
    public void testTokenQueueconsumeToIgnoreCase1003581214() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("input");
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
    public void testTokenQueueconsumeToAny13776877270() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("button");
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
    public void testTokenQueueconsumeToAny19381() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("</");
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
    public void testTokenQueueconsumeToAny19804204662() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("Set-Cookie");
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
    public void testTokenQueueconsumeToAny903() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny(";");
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
    public void testTokenQueueconsumeToAny1082706194() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("radip");
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
    public void testTokenQueuechompTo13940() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("*=");
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
    public void testTokenQueuechompTo19804204661() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("Set-Cookie");
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
    public void testTokenQueuechompTo19804204672() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("Set-Cookid");
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
    public void testTokenQueuechompTo9076856543() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("script");
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
    public void testTokenQueuechompTo14714() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("--");
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
    public void testTokenQueuechompToIgnoreCase1082706190() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("radip");
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
    public void testTokenQueuechompToIgnoreCase14581() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("*}");
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
    public void testTokenQueuechompToIgnoreCase31842() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("bs");
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
    public void testTokenQueuechompToIgnoreCase17571249783() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase(":empty");
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
    public void testTokenQueuechompToIgnoreCase714() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("(");
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
    public void testTokenQueuechompBalanced25400() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('/','z');
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
    public void testTokenQueuechompBalanced28541() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced(':','_');
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
    public void testTokenQueuechompBalanced41612() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('e','E');
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
    public void testTokenQueuechompBalanced31763() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('F','-');
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
    public void testTokenQueuechompBalanced28234() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced(':','@');
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
    public void testTokenQueueunescape29875590() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("abs:");
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
    public void testTokenQueueunescape12068418921() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("http:/");
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
    public void testTokenQueueunescape37412() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("tr");
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
    public void testTokenQueueunescape1103268993() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("thead");
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
    public void testTokenQueueunescape13215466004() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("templatd");
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
    public void testParseSettingsnormalizeTag21153115430() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("boundary");
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
    public void testParseSettingsnormalizeTag13215465981() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("templatf");
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
    public void testParseSettingsnormalizeTag1103268982() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("theac");
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
    public void testParseSettingsnormalizeTag11163() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("!>");
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
    public void testParseSettingsnormalizeTag14229508264() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("actioo");
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
    public void testParseSettingsnormalizeAttribute9060216050() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("select");
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
    public void testParseSettingsnormalizeAttribute32461() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("ds");
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
    public void testParseSettingsnormalizeAttribute27763632() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("\"\"");
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
    public void testParseSettingsnormalizeAttribute21153115433() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("boundary");
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
    public void testParseSettingsnormalizeAttribute10761623174() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute(":contains'");
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
    public void testCleanerclean310() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean((Document) null);
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
    public void testCleanerclean311() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean((Document) null);
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
    public void testCleanerclean312() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean((Document) null);
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
    public void testCleanerclean313() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean((Document) null);
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
    public void testCleanerclean314() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean((Document) null);
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
    public void testCleanerisValid310() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid((Document) null);
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
    public void testCleanerisValid311() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid((Document) null);
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
    public void testCleanerisValid312() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid((Document) null);
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
    public void testCleanerisValid313() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid((Document) null);
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
    public void testCleanerisValid314() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid((Document) null);
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
    public void testCleanerisValidBodyHtml12174874140() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("hiddeo");
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
    public void testCleanerisValidBodyHtml1650854871() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("http-equiw");
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
    public void testCleanerisValidBodyHtml32322() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("de");
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
    public void testCleanerisValidBodyHtml35367443() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("spam");
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
    public void testCleanerisValidBodyHtml1101158204() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("tabld");
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
    public void testWhitelistaddTags358799200() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("#texu");
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
    public void testWhitelistaddTags20353119921() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags(":first-of-type");
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
    public void testWhitelistaddTags30052() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("^<");
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
    public void testWhitelistaddTags996170343() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("https");
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
    public void testWhitelistaddTags1044174() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("imf");
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
    public void testWhitelistremoveTags32132580() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("html");
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
    public void testWhitelistremoveTags31255601() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("evem");
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
    public void testWhitelistremoveTags31255602() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("evem");
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
    public void testWhitelistremoveTags15451126493() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("deflatd");
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
    public void testWhitelistremoveTags35756424() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("typf");
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
    public void testWhitelistaddAttributes11491663300() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("bodx",":matchesOwn'");
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
    public void testWhitelistaddAttributes18232722411() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("boundarx","templatd");
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
    public void testWhitelistaddAttributes34781472() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("hr","namf");
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
    public void testWhitelistaddAttributes1104874183() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("ts","title");
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
    public void testWhitelistaddAttributes9076836384() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("#","scripu");
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
    public void testWhitelistremoveAttributes12458054140() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("http:.","heae");
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
    public void testWhitelistremoveAttributes2431779751() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("button",":alm");
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
    public void testWhitelistremoveAttributes15053415992() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes(":nth-of-type'","gzip");
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
    public void testWhitelistremoveAttributes1019287163() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("heae","\"\"");
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
    public void testWhitelistremoveAttributes21250409784() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("deflatf",":nth-last-child'");
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
    public void testWhitelistaddEnforcedAttribute1316769700() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("theac",":nth-last-of-type)","img");
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
    public void testWhitelistaddEnforcedAttribute5145255641() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute(":emptx","^>","bgsoune");
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
    public void testWhitelistaddEnforcedAttribute17564928582() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("forl",":matchText","Set-Cookif");
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
    public void testWhitelistaddEnforcedAttribute21307297493() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute(":containsData'","[","tabld");
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
    public void testWhitelistaddEnforcedAttribute19948671674() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute(":last-chilc","DOCTYPD","theac");
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
    public void testWhitelistremoveEnforcedAttribute16252975620() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("US-ASCIJ","http:.");
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
    public void testWhitelistremoveEnforcedAttribute2070082121() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("eveo","table");
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
    public void testWhitelistremoveEnforcedAttribute288658902() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("span","optgrouo");
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
    public void testWhitelistremoveEnforcedAttribute561320863() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute(":contains(",":first-chilc");
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
    public void testWhitelistremoveEnforcedAttribute1088659554() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("ruby","|");
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
        whitelist.preserveRelativeLinks(true);
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
        whitelist.preserveRelativeLinks(true);
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
        whitelist.preserveRelativeLinks(true);
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
        whitelist.preserveRelativeLinks(true);
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
        whitelist.preserveRelativeLinks(true);
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
    public void testWhitelistaddProtocols13197642680() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("</",":nth-of-type'",":nth-last-child(");
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
    public void testWhitelistaddProtocols996113531() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("^>","basd","htmk");
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
    public void testWhitelistaddProtocols9898804142() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("disablee",":only-chile",":matchesOwn)");
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
    public void testWhitelistaddProtocols21462471913() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("Set-Cookie",":nth-last-child(","UTF.");
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
    public void testWhitelistaddProtocols7665801724() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("hr","tbody","text.");
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
    public void testWhitelistremoveProtocols17079971030() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("cok",":nth-last-child(","http-equiv");
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
    public void testWhitelistremoveProtocols17140552321() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("eveo",":only-child","rubz");
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
    public void testWhitelistremoveProtocols3761509732() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("disablec","http:.","svh");
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
    public void testWhitelistremoveProtocols21296316543() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("inpuu","type","httpr");
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
    public void testWhitelistremoveProtocols19632581064() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("option","option","textareb");
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
    public void testHtmlToPlainTextmain1857353260() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("US-ASCIJ");
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
    public void testHtmlToPlainTextmain32132581() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("html");
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
    public void testHtmlToPlainTextmain1650854882() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("http-equiv");
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
    public void testHtmlToPlainTextmain30294413() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("body");
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
    public void testHtmlToPlainTextmain567593364() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main(":has)");
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
    public void testHtmlToPlainTextgetPlainText310() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText((Element) null);
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
    public void testHtmlToPlainTextgetPlainText311() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText((Element) null);
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
    public void testHtmlToPlainTextgetPlainText312() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText((Element) null);
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
    public void testHtmlToPlainTextgetPlainText313() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText((Element) null);
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
    public void testHtmlToPlainTextgetPlainText314() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText((Element) null);
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
    public void testWikipediamain21434371480() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])"});
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
    public void testWikipediamain2608409561() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes"});
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
    public void testWikipediamain18915026662() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]="});
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
    public void testWikipediamain5570235983() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae"});
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
    public void testWikipediamain12765040924() throws Exception {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD"});
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
    public void testListLinksmain5971910300() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf"});
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
    public void testListLinksmain6034433241() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee"});
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
    public void testListLinksmain5108543242() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp"});
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
    public void testListLinksmain21009619923() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed"});
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
    public void testListLinksmain4870754954() throws Exception {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^="});
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
    public void testNodeTraversortraverse310() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((Node) null);
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
    public void testNodeTraversortraverse311() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((Node) null);
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
    public void testNodeTraversortraverse312() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((Node) null);
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
    public void testNodeTraversortraverse313() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((Node) null);
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
    public void testNodeTraversortraverse314() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((Node) null);
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
    public void testNodeTraversortraverse9610() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Node) null);
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
    public void testNodeTraversortraverse9611() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Node) null);
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
    public void testNodeTraversortraverse9612() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Node) null);
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
    public void testNodeTraversortraverse9613() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Node) null);
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
    public void testNodeTraversortraverse9614() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Node) null);
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
    public void testNodeTraversortraverse9610() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Elements) null);
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
    public void testNodeTraversortraverse9611() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Elements) null);
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
    public void testNodeTraversortraverse9612() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Elements) null);
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
    public void testNodeTraversortraverse9613() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Elements) null);
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
    public void testNodeTraversortraverse9614() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse((NodeVisitor) null,(Elements) null);
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
    public void testNodeTraversorfilter9610() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Node) null);
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
    public void testNodeTraversorfilter9611() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Node) null);
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
    public void testNodeTraversorfilter9612() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Node) null);
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
    public void testNodeTraversorfilter9613() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Node) null);
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
    public void testNodeTraversorfilter9614() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Node) null);
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
    public void testNodeTraversorfilter9610() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Elements) null);
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
    public void testNodeTraversorfilter9611() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Elements) null);
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
    public void testNodeTraversorfilter9612() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Elements) null);
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
    public void testNodeTraversorfilter9613() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Elements) null);
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
    public void testNodeTraversorfilter9614() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter((NodeFilter) null,(Elements) null);
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
    public void testCollectorcollect9610() {
        Collector collector = new Collector();
        collector.collect((Evaluator) null,(Element) null);
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
    public void testCollectorcollect9611() {
        Collector collector = new Collector();
        collector.collect((Evaluator) null,(Element) null);
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
    public void testCollectorcollect9612() {
        Collector collector = new Collector();
        collector.collect((Evaluator) null,(Element) null);
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
    public void testCollectorcollect9613() {
        Collector collector = new Collector();
        collector.collect((Evaluator) null,(Element) null);
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
    public void testCollectorcollect9614() {
        Collector collector = new Collector();
        collector.collect((Evaluator) null,(Element) null);
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
    public void testCollectorfindFirst9610() {
        Collector collector = new Collector();
        collector.findFirst((Evaluator) null,(Element) null);
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
    public void testCollectorfindFirst9611() {
        Collector collector = new Collector();
        collector.findFirst((Evaluator) null,(Element) null);
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
    public void testCollectorfindFirst9612() {
        Collector collector = new Collector();
        collector.findFirst((Evaluator) null,(Element) null);
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
    public void testCollectorfindFirst9613() {
        Collector collector = new Collector();
        collector.findFirst((Evaluator) null,(Element) null);
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
    public void testCollectorfindFirst9614() {
        Collector collector = new Collector();
        collector.findFirst((Evaluator) null,(Element) null);
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
    public void testElementsattr32134780() {
        Elements elements = new Elements();
        elements.attr("htto");
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
    public void testElementsattr27763631() {
        Elements elements = new Elements();
        elements.attr("\"\"");
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
    public void testElementsattr18305292() {
        Elements elements = new Elements();
        elements.attr(":gt)");
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
    public void testElementsattr5525734453() {
        Elements elements = new Elements();
        elements.attr("caption");
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
    public void testElementsattr26152044() {
        Elements elements = new Elements();
        elements.attr("UTF,");
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
    public void testElementshasAttr21156131440() {
        Elements elements = new Elements();
        elements.hasAttr("noembee");
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
    public void testElementshasAttr32110831() {
        Elements elements = new Elements();
        elements.hasAttr("hreg");
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
    public void testElementshasAttr17480897422() {
        Elements elements = new Elements();
        elements.hasAttr("DOCTYPF");
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
    public void testElementshasAttr10101369393() {
        Elements elements = new Elements();
        elements.hasAttr("optioo");
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
    public void testElementshasAttr31824() {
        Elements elements = new Elements();
        elements.hasAttr("bq");
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
    public void testElementseachAttr33868650() {
        Elements elements = new Elements();
        elements.eachAttr("nobs");
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
    public void testElementseachAttr33681() {
        Elements elements = new Elements();
        elements.eachAttr("hq");
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
    public void testElementseachAttr33062() {
        Elements elements = new Elements();
        elements.eachAttr("h3");
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
    public void testElementseachAttr1099033() {
        Elements elements = new Elements();
        elements.eachAttr("ode");
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
    public void testElementseachAttr15368918744() {
        Elements elements = new Elements();
        elements.eachAttr("checkbox");
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
    public void testElementsattr11483238430() {
        Elements elements = new Elements();
        elements.attr("boundary",":alk");
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
    public void testElementsattr8148903221() {
        Elements elements = new Elements();
        elements.attr("keygem","li");
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
    public void testElementsattr8782873422() {
        Elements elements = new Elements();
        elements.attr(":last-of-type","svg");
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
    public void testElementsattr996110593() {
        Elements elements = new Elements();
        elements.attr("html","=");
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
    public void testElementsattr10210320294() {
        Elements elements = new Elements();
        elements.attr("odd",":nth-last-of-type)");
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
    public void testElementsremoveAttr39990() {
        Elements elements = new Elements();
        elements.removeAttr("~>");
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
    public void testElementsremoveAttr17209582731() {
        Elements elements = new Elements();
        elements.removeAttr("basefont");
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
    public void testElementsremoveAttr1103268992() {
        Elements elements = new Elements();
        elements.removeAttr("thead");
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
    public void testElementsremoveAttr1188393() {
        Elements elements = new Elements();
        elements.removeAttr("xmm");
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
    public void testElementsremoveAttr358296694() {
        Elements elements = new Elements();
        elements.removeAttr("#roou");
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
    public void testElementsaddClass30164310() {
        Elements elements = new Elements();
        elements.addClass("basd");
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
    public void testElementsaddClass15368918751() {
        Elements elements = new Elements();
        elements.addClass("checkboy");
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
    public void testElementsaddClass29875602() {
        Elements elements = new Elements();
        elements.addClass("abs;");
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
    public void testElementsaddClass34853() {
        Elements elements = new Elements();
        elements.addClass("lj");
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
    public void testElementsaddClass11912143964() {
        Elements elements = new Elements();
        elements.addClass("iframf");
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
    public void testElementsremoveClass31891140() {
        Elements elements = new Elements();
        elements.removeClass("gziq");
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
    public void testElementsremoveClass1101158201() {
        Elements elements = new Elements();
        elements.removeClass("tabld");
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
    public void testElementsremoveClass9076856552() {
        Elements elements = new Elements();
        elements.removeClass("scrips");
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
    public void testElementsremoveClass17571249793() {
        Elements elements = new Elements();
        elements.removeClass(":emptz");
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
    public void testElementsremoveClass17480897424() {
        Elements elements = new Elements();
        elements.removeClass("DOCTYPF");
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
    public void testElementstoggleClass569515650() {
        Elements elements = new Elements();
        elements.toggleClass(":not'");
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
    public void testElementstoggleClass358296691() {
        Elements elements = new Elements();
        elements.toggleClass("#roou");
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
    public void testElementstoggleClass3081290272() {
        Elements elements = new Elements();
        elements.toggleClass(":last-chilc");
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
    public void testElementstoggleClass19788929333() {
        Elements elements = new Elements();
        elements.toggleClass(":containsOwn)");
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
    public void testElementstoggleClass33218814() {
        Elements elements = new Elements();
        elements.toggleClass("link");
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
    public void testElementshasClass17209582730() {
        Elements elements = new Elements();
        elements.hasClass("basefont");
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
    public void testElementshasClass10101369401() {
        Elements elements = new Elements();
        elements.hasClass("option");
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
    public void testElementshasClass35367462() {
        Elements elements = new Elements();
        elements.hasClass("spao");
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
    public void testElementshasClass1102563223() {
        Elements elements = new Elements();
        elements.hasClass("text0");
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
    public void testElementshasClass13776877284() {
        Elements elements = new Elements();
        elements.hasClass("buttom");
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
    public void testElementsval15368918740() {
        Elements elements = new Elements();
        elements.val("checkbox");
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
    public void testElementsval1605222311() {
        Elements elements = new Elements();
        elements.val("bgsound");
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
    public void testElementsval18353332() {
        Elements elements = new Elements();
        elements.val(":lt(");
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
    public void testElementsval29875593() {
        Elements elements = new Elements();
        elements.val("abs:");
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
    public void testElementsval14229508284() {
        Elements elements = new Elements();
        elements.val("actiom");
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
    public void testElementstagName26152050() {
        Elements elements = new Elements();
        elements.tagName("UTF-");
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
    public void testElementstagName19391() {
        Elements elements = new Elements();
        elements.tagName("<0");
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
    public void testElementstagName34852() {
        Elements elements = new Elements();
        elements.tagName("lj");
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
    public void testElementstagName20913044553() {
        Elements elements = new Elements();
        elements.tagName("isindex");
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
    public void testElementstagName5525734464() {
        Elements elements = new Elements();
        elements.tagName("captioo");
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
    public void testElementshtml30294400() {
        Elements elements = new Elements();
        elements.html("bodx");
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
    public void testElementshtml31841() {
        Elements elements = new Elements();
        elements.html("bs");
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
    public void testElementshtml32134782() {
        Elements elements = new Elements();
        elements.html("htto");
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
    public void testElementshtml11346655533() {
        Elements elements = new Elements();
        elements.html("keygem");
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
    public void testElementshtml30294424() {
        Elements elements = new Elements();
        elements.html("bodz");
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
    public void testElementsprepend1188370() {
        Elements elements = new Elements();
        elements.prepend("xmk");
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
    public void testElementsprepend31821() {
        Elements elements = new Elements();
        elements.prepend("bq");
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
    public void testElementsprepend1650854892() {
        Elements elements = new Elements();
        elements.prepend("http-equiu");
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
    public void testElementsprepend1103714463() {
        Elements elements = new Elements();
        elements.prepend("titld");
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
    public void testElementsprepend1101578784() {
        Elements elements = new Elements();
        elements.prepend("tbodz");
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
    public void testElementsappend1044180() {
        Elements elements = new Elements();
        elements.append("img");
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
    public void testElementsappend18690634831() {
        Elements elements = new Elements();
        elements.append("sarcasm");
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
    public void testElementsappend13215465992() {
        Elements elements = new Elements();
        elements.append("template");
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
    public void testElementsappend10548386283() {
        Elements elements = new Elements();
        elements.append(":first-child");
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
    public void testElementsappend31891134() {
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
    public void testElementsbefore20913044540() {
        Elements elements = new Elements();
        elements.before("isindew");
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
    public void testElementsbefore2709408281() {
        Elements elements = new Elements();
        elements.before("disablee");
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
    public void testElementsbefore11346655522() {
        Elements elements = new Elements();
        elements.before("keygen");
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
    public void testElementsbefore18245823() {
        Elements elements = new Elements();
        elements.before(":all");
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
    public void testElementsbefore15451126494() {
        Elements elements = new Elements();
        elements.before("deflatd");
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
    public void testElementsafter5525734440() {
        Elements elements = new Elements();
        elements.after("captiom");
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
    public void testElementsafter32110831() {
        Elements elements = new Elements();
        elements.after("hreg");
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
    public void testElementsafter3081290272() {
        Elements elements = new Elements();
        elements.after(":last-chilc");
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
    public void testElementsafter11927218633() {
        Elements elements = new Elements();
        elements.after("noframet");
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
    public void testElementsafter29224() {
        Elements elements = new Elements();
        elements.after("\'");
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
    public void testElementswrap35118020() {
        Elements elements = new Elements();
        elements.wrap("rubz");
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
    public void testElementswrap1099011() {
        Elements elements = new Elements();
        elements.wrap("odc");
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
    public void testElementswrap923502() {
        Elements elements = new Elements();
        elements.wrap("]]?");
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
    public void testElementswrap1283() {
        Elements elements = new Elements();
        elements.wrap("a");
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
    public void testElementswrap6361976014() {
        Elements elements = new Elements();
        elements.wrap("colgrouq");
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
    public void testElementsselect32132570() {
        Elements elements = new Elements();
        elements.select("htmk");
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
    public void testElementsselect11912143971() {
        Elements elements = new Elements();
        elements.select("iframe");
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
    public void testElementsselect37412() {
        Elements elements = new Elements();
        elements.select("tr");
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
    public void testElementsselect14711890843() {
        Elements elements = new Elements();
        elements.select(":nth-last-child'");
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
    public void testElementsselect11912143984() {
        Elements elements = new Elements();
        elements.select("iframd");
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
    public void testElementsnot2709408260() {
        Elements elements = new Elements();
        elements.not("disablec");
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
    public void testElementsnot1101158211() {
        Elements elements = new Elements();
        elements.not("table");
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
    public void testElementsnot987192() {
        Elements elements = new Elements();
        elements.not("col");
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
    public void testElementsnot15515509553() {
        Elements elements = new Elements();
        elements.not("noscript");
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
    public void testElementsnot20913044544() {
        Elements elements = new Elements();
        elements.not("isindew");
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
    public void testElementseq680() {
        Elements elements = new Elements();
        elements.eq(-99);
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
    public void testElementseq5311() {
        Elements elements = new Elements();
        elements.eq(500);
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
    public void testElementseq352() {
        Elements elements = new Elements();
        elements.eq(4);
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
    public void testElementseq2183() {
        Elements elements = new Elements();
        elements.eq(187);
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
    public void testElementseq11141434() {
        Elements elements = new Elements();
        elements.eq(1114112);
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
    public void testElementsis31984630() {
        Elements elements = new Elements();
        elements.is("head");
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
    public void testElementsis26152041() {
        Elements elements = new Elements();
        elements.is("UTF,");
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
    public void testElementsis1097804332() {
        Elements elements = new Elements();
        elements.is("stylf");
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
    public void testElementsis1101158213() {
        Elements elements = new Elements();
        elements.is("table");
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
    public void testElementsis17480897424() {
        Elements elements = new Elements();
        elements.is("DOCTYPF");
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
    public void testElementsnext16183955600() {
        Elements elements = new Elements();
        elements.next(":only-of-type");
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
    public void testElementsnext1103714481() {
        Elements elements = new Elements();
        elements.next("titlf");
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
    public void testElementsnext9503947312() {
        Elements elements = new Elements();
        elements.next("commane");
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
    public void testElementsnext32110813() {
        Elements elements = new Elements();
        elements.next("hree");
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
    public void testElementsnext19732341984() {
        Elements elements = new Elements();
        elements.next("plaintext");
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
    public void testElementsnextAll30294400() {
        Elements elements = new Elements();
        elements.nextAll("bodx");
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
    public void testElementsnextAll569515671() {
        Elements elements = new Elements();
        elements.nextAll(":not)");
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
    public void testElementsnextAll18690634832() {
        Elements elements = new Elements();
        elements.nextAll("sarcasm");
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
    public void testElementsnextAll33218803() {
        Elements elements = new Elements();
        elements.nextAll("linj");
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
    public void testElementsnextAll1103269004() {
        Elements elements = new Elements();
        elements.nextAll("theae");
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
    public void testElementsprev29170() {
        Elements elements = new Elements();
        elements.prev("\"");
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
    public void testElementsprev31891141() {
        Elements elements = new Elements();
        elements.prev("gziq");
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
    public void testElementsprev1143062() {
        Elements elements = new Elements();
        elements.prev("svf");
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
    public void testElementsprev12269463003() {
        Elements elements = new Elements();
        elements.prev(":containsData(");
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
    public void testElementsprev14714() {
        Elements elements = new Elements();
        elements.prev("--");
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
    public void testElementsprevAll1188430() {
        Elements elements = new Elements();
        elements.prevAll("xmq");
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
    public void testElementsprevAll570706521() {
        Elements elements = new Elements();
        elements.prevAll(":roou");
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
    public void testElementsprevAll31822() {
        Elements elements = new Elements();
        elements.prevAll("bq");
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
    public void testElementsprevAll358296683() {
        Elements elements = new Elements();
        elements.prevAll("#root");
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
    public void testElementsprevAll1143064() {
        Elements elements = new Elements();
        elements.prevAll("svf");
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
    public void testElementstraverse310() {
        Elements elements = new Elements();
        elements.traverse((NodeVisitor) null);
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
    public void testElementstraverse311() {
        Elements elements = new Elements();
        elements.traverse((NodeVisitor) null);
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
    public void testElementstraverse312() {
        Elements elements = new Elements();
        elements.traverse((NodeVisitor) null);
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
    public void testElementstraverse313() {
        Elements elements = new Elements();
        elements.traverse((NodeVisitor) null);
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
    public void testElementstraverse314() {
        Elements elements = new Elements();
        elements.traverse((NodeVisitor) null);
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
    public void testElementsfilter310() {
        Elements elements = new Elements();
        elements.filter((NodeFilter) null);
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
    public void testElementsfilter311() {
        Elements elements = new Elements();
        elements.filter((NodeFilter) null);
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
    public void testElementsfilter312() {
        Elements elements = new Elements();
        elements.filter((NodeFilter) null);
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
    public void testElementsfilter313() {
        Elements elements = new Elements();
        elements.filter((NodeFilter) null);
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
    public void testElementsfilter314() {
        Elements elements = new Elements();
        elements.filter((NodeFilter) null);
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
    public void testQueryParserparse1044180() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("img");
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
    public void testQueryParserparse21156131421() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("noembec");
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
    public void testQueryParserparse35118002() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("rubx");
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
    public void testQueryParserparse31490273() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("form");
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
    public void testQueryParserparse10761623174() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse(":contains'");
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
    public void testSelectorselect1006260() {
        Selector selector = new Selector();
        selector.select("ds",(Element) null);
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
    public void testSelectorselect4262638281() {
        Selector selector = new Selector();
        selector.select(":only-child",(Element) null);
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
    public void testSelectorselect12426069812() {
        Selector selector = new Selector();
        selector.select("http:.",(Element) null);
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
    public void testSelectorselect1045858473() {
        Selector selector = new Selector();
        selector.select("namd",(Element) null);
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
    public void testSelectorselect36839474() {
        Selector selector = new Selector();
        selector.select("xmk",(Element) null);
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
    public void testSelectorselect9610() {
        Selector selector = new Selector();
        selector.select((Evaluator) null,(Element) null);
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
    public void testSelectorselect9611() {
        Selector selector = new Selector();
        selector.select((Evaluator) null,(Element) null);
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
    public void testSelectorselect9612() {
        Selector selector = new Selector();
        selector.select((Evaluator) null,(Element) null);
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
    public void testSelectorselect9613() {
        Selector selector = new Selector();
        selector.select((Evaluator) null,(Element) null);
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
    public void testSelectorselect9614() {
        Selector selector = new Selector();
        selector.select((Evaluator) null,(Element) null);
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
    public void testSelectorselect935093610() {
        Selector selector = new Selector();
        selector.select("basd",(Iterable<Element>) null);
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
    public void testSelectorselect6025344731() {
        Selector selector = new Selector();
        selector.select("commanc",(Iterable<Element>) null);
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
    public void testSelectorselect13298376572() {
        Selector selector = new Selector();
        selector.select(":first-of-typf",(Iterable<Element>) null);
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
    public void testSelectorselect13298377193() {
        Selector selector = new Selector();
        selector.select(":first-of-typd",(Iterable<Element>) null);
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
    public void testSelectorselect1024554() {
        Selector selector = new Selector();
        selector.select("h2",(Iterable<Element>) null);
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
    public void testSelectorselectFirst12634922710() {
        Selector selector = new Selector();
        selector.selectFirst("Set-Cookif",(Element) null);
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
    public void testSelectorselectFirst345651() {
        Selector selector = new Selector();
        selector.selectFirst("!=",(Element) null);
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
    public void testSelectorselectFirst456322() {
        Selector selector = new Selector();
        selector.selectFirst("-.",(Element) null);
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
    public void testSelectorselectFirst8917738733() {
        Selector selector = new Selector();
        selector.selectFirst("stylf",(Element) null);
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
    public void testSelectorselectFirst4059286344() {
        Selector selector = new Selector();
        selector.selectFirst("isindew",(Element) null);
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