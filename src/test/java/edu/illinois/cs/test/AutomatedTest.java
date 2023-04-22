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
    public void testAttributesget19380() {
        Attributes attributes = new Attributes();
        attributes.get("</");
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
    public void testAttributesget21065455191() {
        Attributes attributes = new Attributes();
        attributes.get(":last-of-typd");
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
    public void testAttributesget31842() {
        Attributes attributes = new Attributes();
        attributes.get("bs");
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
    public void testAttributesget18305293() {
        Attributes attributes = new Attributes();
        attributes.get(":gt)");
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
    public void testAttributesget32132594() {
        Attributes attributes = new Attributes();
        attributes.get("htmm");
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
    public void testAttributesgetIgnoreCase18285120() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase(":eq'");
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
    public void testAttributesgetIgnoreCase32461() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("ds");
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
    public void testAttributesgetIgnoreCase7423139252() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("checkec");
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
    public void testAttributesgetIgnoreCase1223() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("[");
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
    public void testAttributesgetIgnoreCase11912143964() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("iframf");
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
    public void testAttributesadd9961676250() {
        Attributes attributes = new Attributes();
        attributes.add("httpt",":only-chilc");
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
    public void testAttributesadd1343780281() {
        Attributes attributes = new Attributes();
        attributes.add("titlf","charset");
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
    public void testAttributesadd5690223122() {
        Attributes attributes = new Attributes();
        attributes.add("colgroup","plaintexs");
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
    public void testAttributesadd1984899613() {
        Attributes attributes = new Attributes();
        attributes.add("span",":last-chile");
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
    public void testAttributesadd10552882254() {
        Attributes attributes = new Attributes();
        attributes.add("!<",":matchesOwn(");
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
    public void testAttributesput18371751460() {
        Attributes attributes = new Attributes();
        attributes.put("iframe","tabld");
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
    public void testAttributesput12868830151() {
        Attributes attributes = new Attributes();
        attributes.put("checked",":nth-last-child)");
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
    public void testAttributesput1169642() {
        Attributes attributes = new Attributes();
        attributes.put("td","*}");
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
    public void testAttributesput20114581143() {
        Attributes attributes = new Attributes();
        attributes.put("[a-zA-Z_:][-a-zA-Z0-9_:.]+",":roos");
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
    public void testAttributesput3080051204() {
        Attributes attributes = new Attributes();
        attributes.put("~=",":last-chilc");
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
    public void testAttributesput8917727040() {
        Attributes attributes = new Attributes();
        attributes.put("styld",true);
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
    public void testAttributesput444141() {
        Attributes attributes = new Attributes();
        attributes.put("*<",true);
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
    public void testAttributesput12068380422() {
        Attributes attributes = new Attributes();
        attributes.put("httpr",true);
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
    public void testAttributesput968936533() {
        Attributes attributes = new Attributes();
        attributes.put("eveo",true);
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
    public void testAttributesput6538531254() {
        Attributes attributes = new Attributes();
        attributes.put("deflate",true);
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
    public void testAttributesremove14229508270() {
        Attributes attributes = new Attributes();
        attributes.remove("action");
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
    public void testAttributesremove7423139271() {
        Attributes attributes = new Attributes();
        attributes.remove("checkee");
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
    public void testAttributesremove14702() {
        Attributes attributes = new Attributes();
        attributes.remove("-,");
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
    public void testAttributesremove12174874143() {
        Attributes attributes = new Attributes();
        attributes.remove("hiddeo");
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
    public void testAttributesremove31984644() {
        Attributes attributes = new Attributes();
        attributes.remove("heae");
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
    public void testAttributesremoveIgnoreCase15515509540() {
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
    public void testAttributesremoveIgnoreCase1101578781() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("tbodz");
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
    public void testAttributesremoveIgnoreCase3081290252() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase(":last-chile");
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
    public void testAttributesremoveIgnoreCase1102563213() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("text/");
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
    public void testAttributesremoveIgnoreCase35367464() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("spao");
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
    public void testAttributeshasKey18285120() {
        Attributes attributes = new Attributes();
        attributes.hasKey(":eq'");
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
    public void testAttributeshasKey20919604281() {
        Attributes attributes = new Attributes();
        attributes.hasKey(":only-child");
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
    public void testAttributeshasKey20919604272() {
        Attributes attributes = new Attributes();
        attributes.hasKey(":only-chile");
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
    public void testAttributeshasKey807731743() {
        Attributes attributes = new Attributes();
        attributes.hasKey("optgrouo");
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
    public void testAttributeshasKey14711890854() {
        Attributes attributes = new Attributes();
        attributes.hasKey(":nth-last-child(");
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
    public void testAttributeshasKeyIgnoreCase19788929330() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase(":containsOwn)");
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
    public void testAttributeshasKeyIgnoreCase10552537211() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase(":matchesOwn'");
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
    public void testAttributeshasKeyIgnoreCase21011357982() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase(":matchTexs");
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
    public void testAttributeshasKeyIgnoreCase1605222303() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("bgsoune");
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
    public void testAttributeshasKeyIgnoreCase32314() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("dd");
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
    public void testEntitiesisNamedEntity33441680() {
        Entities entities = new Entities();
        entities.isNamedEntity("mati");
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
    public void testEntitiesisNamedEntity10176250971() {
        Entities entities = new Entities();
        entities.isNamedEntity(":nth-last-of-type(");
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
    public void testEntitiesisNamedEntity20919604292() {
        Entities entities = new Entities();
        entities.isNamedEntity(":only-chilc");
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
    public void testEntitiesisNamedEntity31255603() {
        Entities entities = new Entities();
        entities.isNamedEntity("evem");
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
    public void testEntitiesisNamedEntity33044() {
        Entities entities = new Entities();
        entities.isNamedEntity("h1");
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
    public void testEntitiesisBaseNamedEntity17571249780() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":empty");
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
    public void testEntitiesisBaseNamedEntity13776877261() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("buttoo");
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
    public void testEntitiesisBaseNamedEntity13776877282() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("buttom");
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
    public void testEntitiesisBaseNamedEntity7390744113() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("charset");
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
    public void testEntitiesisBaseNamedEntity1082706194() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("radip");
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
    public void testEntitiesgetCharacterByName32110830() {
        Entities entities = new Entities();
        entities.getCharacterByName("hreg");
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
    public void testEntitiesgetCharacterByName33041() {
        Entities entities = new Entities();
        entities.getCharacterByName("h1");
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
    public void testEntitiesgetCharacterByName1188372() {
        Entities entities = new Entities();
        entities.getCharacterByName("xmk");
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
    public void testEntitiesgetCharacterByName19393() {
        Entities entities = new Entities();
        entities.getCharacterByName("<0");
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
    public void testEntitiesgetCharacterByName16449536124() {
        Entities entities = new Entities();
        entities.getCharacterByName("frameset");
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
    public void testEntitiesgetByName32320() {
        Entities entities = new Entities();
        entities.getByName("de");
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
    public void testEntitiesgetByName10101369401() {
        Entities entities = new Entities();
        entities.getByName("option");
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
    public void testEntitiesgetByName1097804312() {
        Entities entities = new Entities();
        entities.getByName("styld");
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
    public void testEntitiesgetByName33053() {
        Entities entities = new Entities();
        entities.getByName("h2");
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
    public void testEntitiesgetByName358296684() {
        Entities entities = new Entities();
        entities.getByName("#root");
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
    public void testEntitiescodepointsForName5069894160() {
        Entities entities = new Entities();
        entities.codepointsForName("text/",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100});
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
    public void testEntitiescodepointsForName5848514371() {
        Entities entities = new Entities();
        entities.codepointsForName("tbodz",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100,55396,101,102,103,239,240});
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
    public void testEntitiescodepointsForName21448602242() {
        Entities entities = new Entities();
        entities.codepointsForName("com",new int[]{0,-1,55296,192,1,55297,2,3,4,199});
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
    public void testEntitiescodepointsForName1822623353() {
        Entities entities = new Entities();
        entities.codepointsForName("?",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100,55396,101,102,103,239,240,1114211,500});
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
    public void testEntitiescodepointsForName9443628644() {
        Entities entities = new Entities();
        entities.codepointsForName(":first-chilc",new int[]{0,-1,55296,192,1,55297,2,3,4,199,400,1114112,401,57243,224,-99,-100,100,55396,101,102});
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
    public void testEntitiesescape4262638590() {
        Entities entities = new Entities();
        entities.escape(":only-chilc",(Document.OutputSettings) null);
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
    public void testEntitiesescape8917739041() {
        Entities entities = new Entities();
        entities.escape("style",(Document.OutputSettings) null);
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
    public void testEntitiesescape1907689242() {
        Entities entities = new Entities();
        entities.escape("disablee",(Document.OutputSettings) null);
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
    public void testEntitiesescape39683() {
        Entities entities = new Entities();
        entities.escape("a",(Document.OutputSettings) null);
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
    public void testEntitiesescape21016540344() {
        Entities entities = new Entities();
        entities.escape(":matches(",(Document.OutputSettings) null);
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
    public void testEntitiesescape33218810() {
        Entities entities = new Entities();
        entities.escape("link");
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
    public void testEntitiesescape3081290261() {
        Entities entities = new Entities();
        entities.escape(":last-child");
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
    public void testEntitiesescape21153115422() {
        Entities entities = new Entities();
        entities.escape("boundarz");
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
    public void testEntitiesescape1650854873() {
        Entities entities = new Entities();
        entities.escape("http-equiw");
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
    public void testEntitiesescape33094() {
        Entities entities = new Entities();
        entities.escape("h6");
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
    public void testEntitiesunescape1143070() {
        Entities entities = new Entities();
        entities.unescape("svg");
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
    public void testEntitiesunescape16449536121() {
        Entities entities = new Entities();
        entities.unescape("frameset");
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
    public void testEntitiesunescape1099012() {
        Entities entities = new Entities();
        entities.unescape("odc");
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
    public void testEntitiesunescape10761623173() {
        Entities entities = new Entities();
        entities.unescape(":contains'");
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
    public void testEntitiesunescape17209582724() {
        Entities entities = new Entities();
        entities.unescape("basefonu");
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
    public void testStringUtiljoin19732351270() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,"plaintexs");
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
    public void testStringUtiljoin1108311() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,"odc");
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
    public void testStringUtiljoin9503956602() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,"command");
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
    public void testStringUtiljoin12068409613() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,"http:0");
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
    public void testStringUtiljoin33877954() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Collection) null,"nobs");
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
    public void testStringUtiljoin13215456680() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,"templatf");
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
    public void testStringUtiljoin10761632471() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,":contains'");
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
    public void testStringUtiljoin10522() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,"[");
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
    public void testStringUtiljoin9076847243() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,"script");
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
    public void testStringUtiljoin20919594984() {
        StringUtil stringutil = new StringUtil();
        stringutil.join((Iterator) null,":only-child");
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
    public void testStringUtiljoin14412790420() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript"},":gt'");
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
    public void testStringUtiljoin4947886051() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae"},"ruby");
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
    public void testStringUtiljoin1211096342() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr"},"hree");
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
    public void testStringUtiljoin18559134263() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root"},"xml");
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
    public void testStringUtiljoin15065129094() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom"},":not)");
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
    public void testStringUtilpadding11142420() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(1114211);
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
    public void testStringUtilpadding2231() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(192);
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
    public void testStringUtilpadding11141432() {
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
    public void testStringUtilpadding553273() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(55296);
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
    public void testStringUtilpadding1324() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(101);
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
    public void testStringUtilisBlank1099030() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("ode");
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
    public void testStringUtilisBlank921() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("=");
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
    public void testStringUtilisBlank10176250982() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank(":nth-last-of-type)");
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
    public void testStringUtilisBlank19393() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("<0");
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
    public void testStringUtilisBlank734() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("*");
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
    public void testStringUtilisNumeric21156131430() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("noembed");
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
    public void testStringUtilisNumeric13776877271() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("button");
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
    public void testStringUtilisNumeric17571249772() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric(":emptx");
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
    public void testStringUtilisNumeric31984643() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("heae");
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
    public void testStringUtilisNumeric1097804314() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("styld");
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
    public void testStringUtilisWhitespace2300() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(199);
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
    public void testStringUtilisWhitespace341() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(3);
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
    public void testStringUtilisWhitespace682() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(-99);
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
    public void testStringUtilisWhitespace5313() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(500);
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
    public void testStringUtilisWhitespace4314() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(400);
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
    public void testStringUtilisActuallyWhitespace11141430() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(1114112);
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
    public void testStringUtilisActuallyWhitespace681() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(-99);
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
    public void testStringUtilisActuallyWhitespace1332() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(102);
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
    public void testStringUtilisActuallyWhitespace2713() {
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
    public void testStringUtilisActuallyWhitespace684() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(-99);
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
    public void testStringUtilisInvisibleChar690() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(-100);
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
    public void testStringUtilisInvisibleChar553271() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(55296);
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
    public void testStringUtilisInvisibleChar11141432() {
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
    public void testStringUtilisInvisibleChar693() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(-100);
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
    public void testStringUtilisInvisibleChar1334() {
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
    public void testStringUtilnormaliseWhitespace33441660() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("matg");
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
    public void testStringUtilnormaliseWhitespace39971() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("~<");
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
    public void testStringUtilnormaliseWhitespace16449536122() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("frameset");
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
    public void testStringUtilnormaliseWhitespace9076856533() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("scripu");
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
    public void testStringUtilnormaliseWhitespace35756414() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("type");
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
    public void testStringUtilappendNormalisedWhitespace5460756100() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace((StringBuilder) null,"frameses",true);
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
    public void testStringUtilappendNormalisedWhitespace1030083411() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace((StringBuilder) null,"linj",true);
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
    public void testStringUtilappendNormalisedWhitespace35735782() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace((StringBuilder) null,"svg",true);
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
    public void testStringUtilappendNormalisedWhitespace567139643() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace((StringBuilder) null,":eq(",true);
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
    public void testStringUtilappendNormalisedWhitespace995736034() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace((StringBuilder) null,"href",true);
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
    public void testStringUtilin11293264630() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("forn",":containsData(");
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
    public void testStringUtilin16101134651() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("typd","basefons");
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
    public void testStringUtilin8247212472() {
        StringUtil stringutil = new StringUtil();
        stringutil.in(":emptz",":last-of-typd");
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
    public void testStringUtilin8800730493() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("tbodx","[");
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
    public void testStringUtilin1115075444() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("img","radin");
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
    public void testStringUtilinSorted3754356230() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("abs:",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf"});
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
    public void testStringUtilinSorted18384898861() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("#text",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'"});
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
    public void testStringUtilinSorted21191824052() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("body",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs"});
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
    public void testStringUtilinSorted18001249853() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("^>",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo"});
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
    public void testStringUtilinSorted6675494784() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("h0",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips"});
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
    public void testStringUtilresolve10240() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"?");
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
    public void testStringUtilresolve570715821() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,":roou");
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
    public void testStringUtilresolve1103278292() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"thead");
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
    public void testStringUtilresolve46723() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"ts");
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
    public void testStringUtilresolve10101360104() throws Exception {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve((URL) null,"option");
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
    public void testStringUtilresolve8148926590() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("keygen","!>");
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
    public void testStringUtilresolve17513261301() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("http-equiu","basefonu");
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
    public void testStringUtilresolve13819833832() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("disabled","iframe");
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
    public void testStringUtilresolve11526384913() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("textare`",":last-of-type");
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
    public void testStringUtilresolve8731794954() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("tfoou","gziq");
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
    public void testStringUtilreleaseBuilder310() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder((StringBuilder) null);
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
    public void testStringUtilreleaseBuilder311() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder((StringBuilder) null);
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
    public void testStringUtilreleaseBuilder312() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder((StringBuilder) null);
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
    public void testStringUtilreleaseBuilder313() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder((StringBuilder) null);
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
        stringutil.releaseBuilder((StringBuilder) null);
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
    public void testNormalizerlowerCase7423139260() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("checked");
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
    public void testNormalizerlowerCase7390744121() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("charseu");
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
    public void testNormalizerlowerCase10032436882() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("textare`");
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
    public void testNormalizerlowerCase35367463() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("spao");
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
    public void testNormalizerlowerCase18245814() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase(":alk");
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
    public void testNormalizernormalize11927218630() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("noframet");
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
    public void testNormalizernormalize31984632() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("head");
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
    public void testNormalizernormalize34853() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("lj");
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
    public void testNormalizernormalize18912061174() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize(":nth-of-type'");
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
    public void testConstrainableInputStreamwrap298910() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,0,100);
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
    public void testConstrainableInputStreamwrap18627891() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,57342,55396);
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
    public void testConstrainableInputStreamwrap18047242() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,57243,400);
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
    public void testConstrainableInputStreamwrap454833() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,500,192);
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
    public void testConstrainableInputStreamwrap18045634() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap((InputStream) null,57243,239);
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
    public void testConstrainableInputStreamreadToByteBuffer340() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(3);
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
    public void testConstrainableInputStreamreadToByteBuffer554271() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(55396);
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
    public void testConstrainableInputStreamreadToByteBuffer554272() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(55396);
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
    public void testConstrainableInputStreamreadToByteBuffer554273() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(55396);
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
    public void testConstrainableInputStreamreadToByteBuffer1334() throws Exception {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(102);
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
        constrainableinputstream.timeout(0,0);
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
    public void testConstrainableInputStreamtimeout40621() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(100,1);
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
        constrainableinputstream.timeout(-1,-100);
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
    public void testConstrainableInputStreamtimeout40303() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(-100,0);
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
    public void testConstrainableInputStreamtimeout10924() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(1,100);
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
    public void testJsoupparse19733422010() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("lj","plaintexs");
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
    public void testJsoupparse8130584741() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("keygem",":lt'");
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
    public void testJsoupparse1102818142() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("~>","tbodx");
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
    public void testJsoupparse18911036293() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("h4",":nth-of-type)");
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
    public void testJsoupparse1060004() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("h5","lh");
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
    public void testJsoupparse208040700() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("https","Set-Cookif",(Parser) null);
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
    public void testJsoupparse3994495341() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("noembee","imagd",(Parser) null);
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
    public void testJsoupparse18969800372() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("US-ASCIJ","=",(Parser) null);
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
    public void testJsoupparse36846603() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("th","dc",(Parser) null);
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
    public void testJsoupparse15454546864() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("linl",":matchesOwn)",(Parser) null);
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
    public void testJsoupparse33441660() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("matg");
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
    public void testJsoupparse7423139271() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("checkee");
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
    public void testJsoupparse21153115422() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("boundarz");
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
    public void testJsoupparse30164313() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("basd");
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
    public void testJsoupparse31891124() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("gzio");
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
    public void testJsoupconnect996170340() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("https");
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
    public void testJsoupconnect19788929341() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect(":containsOwn(");
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
    public void testJsoupconnect7390744122() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("charseu");
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
    public void testJsoupconnect11143() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("!<");
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
    public void testJsoupconnect1082706194() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("radip");
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
    public void testJsoupparse16468410340() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,":matchesOwn'","bs");
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
    public void testJsoupparse997654871() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"http","xmm");
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
    public void testJsoupparse37165962() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"xmo","tc");
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
    public void testJsoupparse30922723() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"col","bs");
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
    public void testJsoupparse7368074094() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"basefons","DOCTYPD");
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
    public void testJsoupparse2709417580() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"disablee");
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
    public void testJsoupparse1152381() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"svh");
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
    public void testJsoupparse33228122() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"linl");
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
    public void testJsoupparse1101167523() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"tablf");
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
    public void testJsoupparse35765724() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((File) null,"typf");
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
    public void testJsoupparse30920630() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"cok","^=");
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
    public void testJsoupparse6768982921() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"isindex","disablee");
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
    public void testJsoupparse34969052() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"~=","mati");
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
    public void testJsoupparse1477183() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"ts","\"");
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
    public void testJsoupparse16217771224() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"head","basefons");
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
    public void testJsoupparse18769593230() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"form","boundary",(Parser) null);
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
    public void testJsoupparse19204880781() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"colgrouq","theac",(Parser) null);
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
    public void testJsoupparse18110067092() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"rubz","style",(Parser) null);
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
    public void testJsoupparse4527734593() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"noframes","eveo",(Parser) null);
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
    public void testJsoupparse11682426614() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((InputStream) null,"forl","httq",(Parser) null);
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
    public void testJsoupparseBodyFragment9987050830() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":contains(","*}");
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
    public void testJsoupparseBodyFragment1050971401() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("nobq","img");
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
    public void testJsoupparseBodyFragment68914912() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("svg","metb");
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
    public void testJsoupparseBodyFragment3278360873() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":lt'","disablec");
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
    public void testJsoupparseBodyFragment20685092834() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("typf","noembec");
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
    public void testJsoupparseBodyFragment33030() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("h0");
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
    public void testJsoupparseBodyFragment21011357991() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":matchText");
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
    public void testJsoupparseBodyFragment1650854882() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("http-equiv");
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
    public void testJsoupparseBodyFragment10176250983() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment(":nth-last-of-type)");
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
    public void testJsoupparseBodyFragment7423139254() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("checkec");
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
    public void testJsoupparse10630() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,102);
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
    public void testJsoupparse12001() throws Exception {
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
    public void testJsoupparse11482() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,187);
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
    public void testJsoupparse562573() throws Exception {
        Jsoup jsoup = new Jsoup();
        jsoup.parse((URL) null,55296);
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
    public void testJsoupparse9634() throws Exception {
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
    public void testJsoupclean4598224260() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("colgroup","plaintexu",(Whitelist) null);
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
    public void testJsoupclean12887533801() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":has'","h2",(Whitelist) null);
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
    public void testJsoupclean5741452672() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":last-child","keygen",(Whitelist) null);
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
    public void testJsoupclean12688325323() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("col",":empty",(Whitelist) null);
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
    public void testJsoupclean15141954() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("-,","h3",(Whitelist) null);
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
    public void testJsoupclean991523530() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("head",(Whitelist) null);
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
    public void testJsoupclean16468729551() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":matchesOwn)",(Whitelist) null);
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
    public void testJsoupclean11594980242() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("noembee",(Whitelist) null);
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
    public void testJsoupclean8148937443() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("keygen",(Whitelist) null);
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
    public void testJsoupclean36841024() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("xmp",(Whitelist) null);
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
    public void testJsoupclean9546514250() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("scripu","deflatd",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean7303727371() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("sarcasl","textare`",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean20591041762() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("type","httq",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean9368204863() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("hidden","odd",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupclean50942614() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("^","*|",(Whitelist) null,(Document.OutputSettings) null);
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
    public void testJsoupisValid18100989420() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("basefons",(Whitelist) null);
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
    public void testJsoupisValid988625031() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("gzip",(Whitelist) null);
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
    public void testJsoupisValid12494740682() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("option",(Whitelist) null);
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
    public void testJsoupisValid345963() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("!>",(Whitelist) null);
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
    public void testJsoupisValid21016540034() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid(":matches'",(Whitelist) null);
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
    public void testParserparseInput12220030580() {
        Parser parser = new Parser();
        parser.parseInput("hreg","templatd");
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
    public void testParserparseInput30191901() {
        Parser parser = new Parser();
        parser.parseInput(";","basd");
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
    public void testParserparseInput2197548542() {
        Parser parser = new Parser();
        parser.parseInput("spam","table");
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
    public void testParserparseInput1108481173() {
        Parser parser = new Parser();
        parser.parseInput("typd","h5");
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
    public void testParserparseInput6538558624() {
        Parser parser = new Parser();
        parser.parseInput("deflate","~>");
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
    public void testParserparseInput1101167500() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"tabld");
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
    public void testParserparseInput32120131() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"hreg");
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
    public void testParserparseInput1101167502() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"tabld");
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
    public void testParserparseInput10073() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,".");
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
    public void testParserparseInput17209573444() {
        Parser parser = new Parser();
        parser.parseInput((Reader) null,"basefons");
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
    public void testParserparseFragmentInput12284002610() {
        Parser parser = new Parser();
        parser.parseFragmentInput("gziq",(Element) null,":eq'");
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
    public void testParserparseFragmentInput18988007761() {
        Parser parser = new Parser();
        parser.parseFragmentInput("US-ASCIH",(Element) null,":alm");
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
    public void testParserparseFragmentInput16100586662() {
        Parser parser = new Parser();
        parser.parseFragmentInput("titlf",(Element) null,"button");
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
    public void testParserparseFragmentInput15994322313() {
        Parser parser = new Parser();
        parser.parseFragmentInput("even",(Element) null,":last-chile");
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
    public void testParserparseFragmentInput15124581894() {
        Parser parser = new Parser();
        parser.parseFragmentInput("tbodz",(Element) null,"li");
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
    public void testParsersetTrackErrors690() {
        Parser parser = new Parser();
        parser.setTrackErrors(-100);
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
    public void testParsersetTrackErrors4311() {
        Parser parser = new Parser();
        parser.setTrackErrors(400);
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
    public void testParsersetTrackErrors4322() {
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
    public void testParsersetTrackErrors693() {
        Parser parser = new Parser();
        parser.setTrackErrors(-100);
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
    public void testParsersetTrackErrors554274() {
        Parser parser = new Parser();
        parser.setTrackErrors(55396);
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
    public void testParserparse567496710() {
        Parser parser = new Parser();
        parser.parse(":gt)","h0");
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
    public void testParserparse1072010841() {
        Parser parser = new Parser();
        parser.parse("namf","UTF.");
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
    public void testParserparse6091323142() {
        Parser parser = new Parser();
        parser.parse("tbody","disablec");
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
    public void testParserparse1499883() {
        Parser parser = new Parser();
        parser.parse("--","img");
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
    public void testParserparse17686969474() {
        Parser parser = new Parser();
        parser.parse(":not'","head");
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
    public void testParserparseFragment14107961240() {
        Parser parser = new Parser();
        parser.parseFragment("script",(Element) null,"textarea");
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
    public void testParserparseFragment1974190931() {
        Parser parser = new Parser();
        parser.parseFragment(":first-chilc",(Element) null,"stylf");
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
    public void testParserparseFragment14195782942() {
        Parser parser = new Parser();
        parser.parseFragment("Set-Cookid",(Element) null,"selecu");
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
    public void testParserparseFragment8766938363() {
        Parser parser = new Parser();
        parser.parseFragment("sarcasm",(Element) null,"base");
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
    public void testParserparseFragment2052964() {
        Parser parser = new Parser();
        parser.parseFragment(";",(Element) null,"xmk");
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
    public void testParserparseFragment8013228390() {
        Parser parser = new Parser();
        parser.parseFragment("charses",(Element) null,":last-child",(ParseErrorList) null);
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
    public void testParserparseFragment13945402031() {
        Parser parser = new Parser();
        parser.parseFragment("selecs",(Element) null,"image",(ParseErrorList) null);
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
    public void testParserparseFragment1111047752() {
        Parser parser = new Parser();
        parser.parseFragment("tc",(Element) null,"hs",(ParseErrorList) null);
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
    public void testParserparseFragment11022091943() {
        Parser parser = new Parser();
        parser.parseFragment("thead",(Element) null,"svf",(ParseErrorList) null);
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
    public void testParserparseFragment13755930964() {
        Parser parser = new Parser();
        parser.parseFragment("even",(Element) null,"ds",(ParseErrorList) null);
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
    public void testParserparseXmlFragment12177585360() {
        Parser parser = new Parser();
        parser.parseXmlFragment("met`","templatf");
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
    public void testParserparseXmlFragment465168101() {
        Parser parser = new Parser();
        parser.parseXmlFragment("captiom","type");
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
    public void testParserparseXmlFragment4133058322() {
        Parser parser = new Parser();
        parser.parseXmlFragment(":empty","commanc");
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
    public void testParserparseXmlFragment1822057323() {
        Parser parser = new Parser();
        parser.parseXmlFragment(":only-of-type","noscript");
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
    public void testParserparseXmlFragment8768840594() {
        Parser parser = new Parser();
        parser.parseXmlFragment("tbodx","gzio");
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
    public void testParserparseBodyFragment9060178550() {
        Parser parser = new Parser();
        parser.parseBodyFragment("[","selecs");
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
    public void testParserparseBodyFragment8762498281() {
        Parser parser = new Parser();
        parser.parseBodyFragment("tfoos","xmq");
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
    public void testParserparseBodyFragment3134932972() {
        Parser parser = new Parser();
        parser.parseBodyFragment(":first-chile","plaintexs");
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
    public void testParserparseBodyFragment16326222483() {
        Parser parser = new Parser();
        parser.parseBodyFragment("UTF,","noscript");
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
    public void testParserparseBodyFragment6873839234() {
        Parser parser = new Parser();
        parser.parseBodyFragment(":nth-last-child(","commanc");
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
    public void testParserunescapeEntities567476300() {
        Parser parser = new Parser();
        parser.unescapeEntities(":gt)",true);
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
    public void testParserunescapeEntities16437940771() {
        Parser parser = new Parser();
        parser.unescapeEntities("DOCTYPF",true);
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
    public void testParserunescapeEntities17910001642() {
        Parser parser = new Parser();
        parser.unescapeEntities("optgroup",true);
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
    public void testParserunescapeEntities21016552343() {
        Parser parser = new Parser();
        parser.unescapeEntities(":matches'",true);
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
    public void testParserunescapeEntities926155914() {
        Parser parser = new Parser();
        parser.unescapeEntities("abs;",true);
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
    public void testParserparseBodyFragmentRelaxed12419584730() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("action",":nth-of-type)");
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
    public void testParserparseBodyFragmentRelaxed2067811() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("h0","imh");
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
    public void testParserparseBodyFragmentRelaxed567615042() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("(",":has'");
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
    public void testParserparseBodyFragmentRelaxed20387990413() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("templatf",":roos");
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
    public void testParserparseBodyFragmentRelaxed2208810824() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed(":has)","Set-Cookid");
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
    public void testTagvalueOf600780() {
        Tag tag = new Tag();
        tag.valueOf("</",(ParseSettings) null);
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
    public void testTagvalueOf1155371() {
        Tag tag = new Tag();
        tag.valueOf("td",(ParseSettings) null);
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
    public void testTagvalueOf500923892() {
        Tag tag = new Tag();
        tag.valueOf("caption",(ParseSettings) null);
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
    public void testTagvalueOf8148937753() {
        Tag tag = new Tag();
        tag.valueOf("keygem",(ParseSettings) null);
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
    public void testTagvalueOf35434864() {
        Tag tag = new Tag();
        tag.valueOf("svf",(ParseSettings) null);
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
    public void testTagvalueOf1044170() {
        Tag tag = new Tag();
        tag.valueOf("imf");
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
    public void testTagvalueOf10032436871() {
        Tag tag = new Tag();
        tag.valueOf("textarea");
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
    public void testTagvalueOf2709408272() {
        Tag tag = new Tag();
        tag.valueOf("disabled");
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
    public void testTagvalueOf14711890863() {
        Tag tag = new Tag();
        tag.valueOf(":nth-last-child)");
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
    public void testTagvalueOf31490264() {
        Tag tag = new Tag();
        tag.valueOf("forl");
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
    public void testTagisKnownTag20919604290() {
        Tag tag = new Tag();
        tag.isKnownTag(":only-chilc");
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
    public void testTagisKnownTag11141() {
        Tag tag = new Tag();
        tag.isKnownTag("!<");
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
    public void testTagisKnownTag10548386282() {
        Tag tag = new Tag();
        tag.isKnownTag(":first-child");
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
    public void testTagisKnownTag1099023() {
        Tag tag = new Tag();
        tag.isKnownTag("odd");
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
    public void testTagisKnownTag1082706194() {
        Tag tag = new Tag();
        tag.isKnownTag("radip");
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
    public void testParseErrorListtracking2550() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(224);
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
    public void testParseErrorListtracking2701() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(239);
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
    public void testParseErrorListtracking2182() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(187);
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
    public void testParseErrorListtracking333() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(2);
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
    public void testParseErrorListtracking554274() {
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
    public void testCharacterReaderconsumeTo1330() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo('f');
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
    public void testCharacterReaderconsumeTo721() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo(')');
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
    public void testCharacterReaderconsumeTo1322() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo('e');
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
    public void testCharacterReaderconsumeTo1023() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo('G');
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
    public void testCharacterReaderconsumeToAny1260() {
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
    public void testCharacterReaderconsumeToAny1561() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('}');
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
    public void testCharacterReaderconsumeToAny1342() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('g');
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
    public void testCharacterReaderconsumeToAny653() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('"');
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
    public void testCharacterReaderconsumeToAny1334() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny('f');
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
    public void testDataUtilload16467253490() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,":matchesOwn(","xml");
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
    public void testDataUtilload11917769821() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,"buttoo","commanc");
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
    public void testDataUtilload1096716262() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,"span","ti");
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
    public void testDataUtilload8757575843() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,":last-of-typf","UTF,");
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
    public void testDataUtilload13356708434() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((File) null,":nth-last-child'","templatd");
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
    public void testDataUtilload8461308790() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"metb","checkec");
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
    public void testDataUtilload14276554361() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"disablee",":only-of-typf");
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
    public void testDataUtilload566831892() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,":all","]]=");
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
    public void testDataUtilload1011604063() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"forl","ruby");
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
    public void testDataUtilload21157658494() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"~<","noembed");
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
    public void testDataUtilload11302365810() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"scripu","checkee",(Parser) null);
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
    public void testDataUtilload1147955421() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"bq","type",(Parser) null);
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
    public void testDataUtilload18608840442() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,":nth-of-type(","input",(Parser) null);
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
    public void testDataUtilload12466201793() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"dt","http:0",(Parser) null);
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
    public void testDataUtilload9581136134() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.load((InputStream) null,"br",":last-chilc",(Parser) null);
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
    public void testDataUtilreadToByteBuffer11480() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,187);
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
    public void testDataUtilreadToByteBuffer13611() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,400);
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
    public void testDataUtilreadToByteBuffer582042() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,57243);
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
    public void testDataUtilreadToByteBuffer10613() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,100);
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
    public void testDataUtilreadToByteBuffer11484() throws Exception {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer((InputStream) null,187);
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
    public void testValidatenotNull11912134660() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"iframf");
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
    public void testValidatenotNull9503956591() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"commanc");
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
    public void testValidatenotNull10222() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"=");
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
    public void testValidatenotNull32141883() {
        Validate validate = new Validate();
        validate.notNull((Object) null,"html");
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
    public void testValidatenotNull2882761784() {
        Validate validate = new Validate();
        validate.notNull((Object) null,":nth-child(");
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
    public void testValidateisTrue1103164680() {
        Validate validate = new Validate();
        validate.isTrue(true,"tfoot");
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
    public void testValidateisTrue9059825151() {
        Validate validate = new Validate();
        validate.isTrue(true,"selecs");
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
    public void testValidateisTrue12269072092() {
        Validate validate = new Validate();
        validate.isTrue(true,":containsData(");
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
    public void testValidateisTrue31646533() {
        Validate validate = new Validate();
        validate.isTrue(true,"eveo");
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
    public void testValidateisTrue18678029604() {
        Validate validate = new Validate();
        validate.isTrue(true,"[a-zA-Z_:][-a-zA-Z0-9_:.]+");
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
    public void testValidateisFalse410300() {
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
    public void testValidateisFalse18744251() {
        Validate validate = new Validate();
        validate.isFalse(true,":lt)");
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
    public void testValidateisFalse19732732882() {
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
    public void testValidateisFalse30685323() {
        Validate validate = new Validate();
        validate.isFalse(true,"body");
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
    public void testValidateisFalse14712281764() {
        Validate validate = new Validate();
        validate.isFalse(true,":nth-last-child(");
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
    public void testValidatenoNullElements16840400740() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"p");
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
    public void testValidatenoNullElements17567921201() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"scrips");
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
    public void testValidatenoNullElements1294313472() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"nobr");
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
    public void testValidatenoNullElements2704120243() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"*}");
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
    public void testValidatenoNullElements11903865774() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"$<");
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
    public void testValidatenotEmpty31255600() {
        Validate validate = new Validate();
        validate.notEmpty("evem");
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
    public void testValidatenotEmpty32471() {
        Validate validate = new Validate();
        validate.notEmpty("dt");
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
    public void testValidatenotEmpty30052() {
        Validate validate = new Validate();
        validate.notEmpty("^<");
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
    public void testValidatenotEmpty21153115423() {
        Validate validate = new Validate();
        validate.notEmpty("boundarz");
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
    public void testValidatenotEmpty37284() {
        Validate validate = new Validate();
        validate.notEmpty("te");
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
    public void testValidatenotEmpty15047677230() {
        Validate validate = new Validate();
        validate.notEmpty(":nth-of-type(","UTF.");
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
    public void testValidatenotEmpty31518491() {
        Validate validate = new Validate();
        validate.notEmpty("=","forn");
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
    public void testValidatenotEmpty9385770852() {
        Validate validate = new Validate();
        validate.notEmpty("radin","!=");
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
    public void testValidatenotEmpty1102182753() {
        Validate validate = new Validate();
        validate.notEmpty("h3","tabld");
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
    public void testValidatenotEmpty500923234() {
        Validate validate = new Validate();
        validate.notEmpty("captioo","#");
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
    public void testValidatefail17209582740() {
        Validate validate = new Validate();
        validate.fail("basefons");
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
    public void testValidatefail31490271() {
        Validate validate = new Validate();
        validate.fail("form");
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
    public void testValidatefail37322() {
        Validate validate = new Validate();
        validate.fail("ti");
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
    public void testValidatefail21153115423() {
        Validate validate = new Validate();
        validate.fail("boundarz");
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
    public void testValidatefail1103714464() {
        Validate validate = new Validate();
        validate.fail("titld");
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
    public void testHttpConnectionconnect15451126510() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("deflatf");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect13215465991() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("template");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect12068418912() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("http:0");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect32110823() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("href");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionconnect1188384() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("xml");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testHttpConnectionurl19788929330() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url(":containsOwn)");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl31891121() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("gzio");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl30294422() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("bodz");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl30164313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("basd");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionurl32464() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("ds");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testHttpConnectionproxy456980() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("*}",500);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy19781012851() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("selecs",-1);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy566838032() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy(":eq(",-100);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy14827211153() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy(":nth-last-of-type'",1114211);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionproxy10357830334() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("textarea",192);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent32134790() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("http");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent14561() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("*{");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent7390744102() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("charses");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent1102773763() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("tfoos");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionuserAgent1857353274() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("US-ASCII");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout340() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(3);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout341() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(3);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout554272() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(55396);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout4313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(400);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiontimeout2714() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(240);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize2710() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(240);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize2181() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(187);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize2552() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(224);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize303() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(-1);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionmaxBodySize553274() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(55296);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testHttpConnectionreferrer807731730() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("optgroup");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer923491() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("]]>");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer37402() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("tq");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer1253() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("^");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionreferrer18912061164() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer(":nth-of-type(");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testHttpConnectiondata16146520400() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("US-ASCIJ","hidden");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata20684300451() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("[a-zA-Z_:][-a-zA-Z0-9_:.]+","col");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata9987033282() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":contains)","bq");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata19768769503() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("svh","Set-Cookid");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata5491710804() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("frameses","eveo");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testHttpConnectiondata1081694780() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("tg","namf",(InputStream) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata13493930721() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("optgrouo","textarea",(InputStream) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata5924744762() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("]]?","bgsound",(InputStream) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata14453133() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("*}","*{",(InputStream) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata64313534() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("^=","svh",(InputStream) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
        httpconnection.data((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
        httpconnection.data((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
        httpconnection.data((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
        httpconnection.data((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
        httpconnection.data((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata30294400() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("bodx");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata18678420511() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("[a-zA-Z_:][-a-zA-Z0-9_:.]+");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata2882752472() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":nth-child'");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata37323() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("ti");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata15515509554() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("noscript");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testHttpConnectiondata3081290250() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":last-chile");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata923501() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("]]?");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata31255602() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("evem");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata10761623193() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":contains)");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectiondata30164314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("basd");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody1650854880() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("http-equiv");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody10176250971() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody(":nth-last-of-type(");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody772() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody(".");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody713() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("(");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionrequestBody21065455174() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody(":last-of-typf");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader6883538300() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("noscript","http-equiv");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader18719865631() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header(":containsOwn(","http:/");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader565654652() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header(":alk","lj");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader20366315873() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("script","tabld");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheader33178874() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("hr","http");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionheaders314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie5826123360() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("textareb",":only-of-typf");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie8733537811() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("titld","com");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie8770180702() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("text/","h3");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie9611988193() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("optioo",":nth-child)");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookie8781633674() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("tablf","htto");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies310() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies311() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies312() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies313() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectioncookies314() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies((Map<String, String>) null);
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testHttpConnectionpostDataCharset18245810() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset(":alk");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset33441681() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("mati");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset32482() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("du");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset37273() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("td");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
            fail("httpconnection.hashCode() throws an exception");
        }
        try {
            httpconnection.toString();
        } catch (Exception e) {
            fail("httpconnection.toString() throws an exception");
        }
    }
    @Test
    public void testHttpConnectionpostDataCharset19804204664() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("Set-Cookie");
        assertTrue(httpconnection.equals(httpconnection));
        try {
            httpconnection.equals(httpconnection);
        } catch (Exception e) {
            fail("httpconnection.equals(httpconnection) throws an exception");
        }
        try {
            httpconnection.hashCode();
        } catch (Exception e) {
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
    public void testTokenQueueaddFirst920() {
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
    public void testTokenQueueaddFirst1541() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst('{');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst1262() {
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
    public void testTokenQueueaddFirst1263() {
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
    public void testTokenQueueaddFirst894() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(':');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst1099010() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("odc");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst39971() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("~<");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst9060216052() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("select");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst11912143963() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("iframf");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueaddFirst14711890864() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(":nth-last-child)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches31984640() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("heae");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches31984631() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("head");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches1003134672() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("imagf");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches32483() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("du");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematches807731744() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("optgrouo");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS27763630() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("\"\"");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS358799181() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("#texs");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS37272() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("td");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS11912143983() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("iframd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesCS35118014() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("ruby");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny1605222310() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("bgsound");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny2709408261() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("disablec");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny21065455182() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(":last-of-type");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny30164323() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("base");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny15515509544() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("noscrips");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny1270() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('`');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny951() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('@');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny932() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('>');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny1013() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('F');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchesAny1544() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny('{');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
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
    public void testTokenQueuematchChomp9503947310() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("commane");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp33051() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("h2");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp19372() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("<.");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp16449536113() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("frameseu");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuematchChomp7423139254() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("checkec");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
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
    public void testTokenQueueconsume33080() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("h5");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume941() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("?");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume10552537232() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume(":matchesOwn)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume33683() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("hq");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsume30074() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("^>");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo10552537230() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo(":matchesOwn)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo21011358001() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo(":matchTexu");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo31490272() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("form");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo19804204663() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("Set-Cookie");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeTo11144() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("!<");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
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
    public void testTokenQueueconsumeToIgnoreCase18245821() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase(":all");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase569515652() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase(":not'");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase33737373() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("namd");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToIgnoreCase1103268984() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("theac");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny32132570() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("htmk");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny12071() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("$<");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny16183955602() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny(":only-of-type");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny10101369403() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("option");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueconsumeToAny20913044544() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("isindew");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo26152060() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("UTF.");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo1103268991() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("thead");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo996170352() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("httpt");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo17571249793() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo(":emptz");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompTo14711890864() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo(":nth-last-child)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase13776877260() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("buttoo");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase12081() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("$=");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase20913044542() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("isindew");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase1103269003() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("theae");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompToIgnoreCase14229508274() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("action");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced48340() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('{','<');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced42261() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('f','g');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced41312() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('e',"'");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced40063() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('`','E');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueuechompBalanced24484() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced('.','=');
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape1101578760() {
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
    public void testTokenQueueunescape31255601() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("evem");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape32302() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("dc");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape10552537233() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape(":matchesOwn)");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
            fail("tokenqueue.hashCode() throws an exception");
        }
        try {
            tokenqueue.toString();
        } catch (Exception e) {
            fail("tokenqueue.toString() throws an exception");
        }
    }
    @Test
    public void testTokenQueueunescape12269463014() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape(":containsData'");
        assertTrue(tokenqueue.equals(tokenqueue));
        try {
            tokenqueue.equals(tokenqueue);
        } catch (Exception e) {
            fail("tokenqueue.equals(tokenqueue) throws an exception");
        }
        try {
            tokenqueue.hashCode();
        } catch (Exception e) {
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
    public void testParseSettingsnormalizeTag19804204650() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("Set-Cookif");
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
    public void testParseSettingsnormalizeTag33868631() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("nobq");
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
    public void testParseSettingsnormalizeTag31984622() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("heac");
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
    public void testParseSettingsnormalizeTag11153() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("!=");
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
    public void testParseSettingsnormalizeTag1102563214() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("text/");
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
    public void testParseSettingsnormalizeAttribute570706510() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute(":root");
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
    public void testParseSettingsnormalizeAttribute1103268991() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("thead");
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
    public void testParseSettingsnormalizeAttribute16449536122() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("frameset");
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
    public void testParseSettingsnormalizeAttribute33043() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("h1");
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
    public void testParseSettingsnormalizeAttribute1650854874() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("http-equiw");
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
    public void testCleanerisValidBodyHtml21011357990() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml(":matchText");
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
    public void testCleanerisValidBodyHtml13776877281() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("buttom");
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
    public void testCleanerisValidBodyHtml14702() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("-,");
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
    public void testCleanerisValidBodyHtml15515509553() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("noscript");
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
    public void testCleanerisValidBodyHtml26152064() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("UTF.");
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
    public void testWhitelistaddTags21011358000() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags(":matchTexu");
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
    public void testWhitelistaddTags18353321() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags(":lt'");
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
    public void testWhitelistaddTags16449536122() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("frameset");
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
    public void testWhitelistaddTags37263() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("tc");
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
    public void testWhitelistaddTags30164314() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("basd");
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
    public void testWhitelistremoveTags7423139270() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("checkee");
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
    public void testWhitelistremoveTags13215466001() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("templatd");
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
    public void testWhitelistremoveTags31984632() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("head");
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
    public void testWhitelistremoveTags1605222313() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("bgsound");
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
    public void testWhitelistremoveTags21065455174() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags(":last-of-typf");
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
    public void testWhitelistaddAttributes10177237080() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("bq",":nth-last-of-type(");
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
    public void testWhitelistaddAttributes568651451() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes(":gt'","xmm");
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
    public void testWhitelistaddAttributes8770212722() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("text0","*");
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
    public void testWhitelistaddAttributes21012513363() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("te",":matchText");
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
    public void testWhitelistaddAttributes19265195244() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("scripu","tc");
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
    public void testWhitelistremoveAttributes5496211900() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("frameset","type");
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
    public void testWhitelistremoveAttributes1814121201() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes(":emptz","deflate");
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
    public void testWhitelistremoveAttributes8117447482() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("keygen","form");
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
    public void testWhitelistremoveAttributes20959716863() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("plaintext",":matchesOwn)");
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
    public void testWhitelistremoveAttributes14487146714() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("optgroup",":matchesOwn)");
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
    public void testWhitelistaddEnforcedAttribute1635957200() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("*|","\'","http-equiw");
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
    public void testWhitelistaddEnforcedAttribute10362774131() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("</",":only-of-type",":nth-of-type'");
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
    public void testWhitelistaddEnforcedAttribute2662713032() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("rubz","deflate","hr");
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
    public void testWhitelistaddEnforcedAttribute672568163() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("buttoo","plaintexs","th");
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
    public void testWhitelistaddEnforcedAttribute9465338044() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("imagf","charseu","\"");
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
    public void testWhitelistremoveEnforcedAttribute10933890580() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("boundarz",":has(");
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
    public void testWhitelistremoveEnforcedAttribute602689981() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute(":lt'","namd");
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
    public void testWhitelistremoveEnforcedAttribute14627234232() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("US-ASCIJ","img");
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
    public void testWhitelistremoveEnforcedAttribute12032636023() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("httpt","typd");
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
    public void testWhitelistremoveEnforcedAttribute5385522144() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute(":not(",":containsData'");
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
    public void testWhitelistaddProtocols20746653600() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("tfoou","http-equiw","~>");
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
    public void testWhitelistaddProtocols7716737671() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols(":lt(",":has)","=");
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
    public void testWhitelistaddProtocols9386589922() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("UTF-","selecu","checkee");
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
    public void testWhitelistaddProtocols20885190893() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("tfoos","gzip","script");
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
    public void testWhitelistaddProtocols2889688064() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("xmm","tbody",":first-child");
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
    public void testWhitelistremoveProtocols11472128340() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("UTF,",":only-of-typd","metb");
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
    public void testWhitelistremoveProtocols8036974731() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols(":nth-of-type'",":nth-last-of-type)","te");
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
    public void testWhitelistremoveProtocols904529542() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("US-ASCII","basefonu","type");
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
    public void testWhitelistremoveProtocols9902505933() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols(":roou","selecu",":eq(");
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
    public void testWhitelistremoveProtocols18021914494() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols(":roou","basf","selecu");
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
    public void testHtmlToPlainTextmain567593340() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main(":has'");
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
    public void testHtmlToPlainTextmain7423139261() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("checked");
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
    public void testHtmlToPlainTextmain1188432() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("xmq");
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
    public void testHtmlToPlainTextmain32132573() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("htmk");
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
    public void testHtmlToPlainTextmain30294424() throws Exception {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("bodz");
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
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)"});
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
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH"});
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
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead"});
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
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|"});
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
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","charses","\"","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio","gzip",":has(","gziq",":has)","<.","</","[a-zA-Z_:][-a-zA-Z0-9_:.]+","<0","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html","Set-Cookie",":first-child","htmk","Set-Cookid",":first-chilc","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","boundarx","imf","imh","link","linl","linj","basefont","basefonu","head","heae","nobs","nobr","nobq",":empty","commane",":emptx","#texs","rubx","command","rubz","heac","commanc"});
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
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq"});
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
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen"});
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
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de"});
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
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden"});
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
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du","http-equiu",":eq)","$<","http-equiv",":eq(","$=","http-equiw",":eq'","$>","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name","httq",":nth-of-type)","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea"});
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
    public void testElementsattr940() {
        Elements elements = new Elements();
        elements.attr("?");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr18305291() {
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
    public void testElementsattr18285142() {
        Elements elements = new Elements();
        elements.attr(":eq)");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr17571249773() {
        Elements elements = new Elements();
        elements.attr(":emptx");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr11927218624() {
        Elements elements = new Elements();
        elements.attr("noframes");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr17571249790() {
        Elements elements = new Elements();
        elements.hasAttr(":emptz");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr1101578781() {
        Elements elements = new Elements();
        elements.hasAttr("tbodz");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr7423139262() {
        Elements elements = new Elements();
        elements.hasAttr("checked");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr13776877283() {
        Elements elements = new Elements();
        elements.hasAttr("buttom");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasAttr33064() {
        Elements elements = new Elements();
        elements.hasAttr("h3");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr32480() {
        Elements elements = new Elements();
        elements.eachAttr("du");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr10761623171() {
        Elements elements = new Elements();
        elements.eachAttr(":contains'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr12068418912() {
        Elements elements = new Elements();
        elements.eachAttr("http:0");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseachAttr1857353263() {
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
    public void testElementseachAttr20919604294() {
        Elements elements = new Elements();
        elements.eachAttr(":only-chilc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr11851575640() {
        Elements elements = new Elements();
        elements.attr("imagd","]]=");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr7107017561() {
        Elements elements = new Elements();
        elements.attr(":matchText","*}");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr20797431542() {
        Elements elements = new Elements();
        elements.attr("htmm","noembee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr16579163803() {
        Elements elements = new Elements();
        elements.attr(":first-chilc",":all");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsattr14722998674() {
        Elements elements = new Elements();
        elements.attr("charses","#root");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr30164330() {
        Elements elements = new Elements();
        elements.removeAttr("basf");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr567593351() {
        Elements elements = new Elements();
        elements.removeAttr(":has(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr358296692() {
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
    public void testElementsremoveAttr2709408263() {
        Elements elements = new Elements();
        elements.removeAttr("disablec");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveAttr2709408264() {
        Elements elements = new Elements();
        elements.removeAttr("disablec");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass710() {
        Elements elements = new Elements();
        elements.addClass("(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass570706501() {
        Elements elements = new Elements();
        elements.addClass(":roos");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass33868652() {
        Elements elements = new Elements();
        elements.addClass("nobs");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass33043() {
        Elements elements = new Elements();
        elements.addClass("h1");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsaddClass1101158214() {
        Elements elements = new Elements();
        elements.addClass("table");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass10548386270() {
        Elements elements = new Elements();
        elements.removeClass(":first-chilc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass10761623191() {
        Elements elements = new Elements();
        elements.removeClass(":contains)");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass21065455192() {
        Elements elements = new Elements();
        elements.removeClass(":last-of-typd");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass7390744113() {
        Elements elements = new Elements();
        elements.removeClass("charset");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsremoveClass13776877264() {
        Elements elements = new Elements();
        elements.removeClass("buttoo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass1103714460() {
        Elements elements = new Elements();
        elements.toggleClass("titld");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass1143071() {
        Elements elements = new Elements();
        elements.toggleClass("svg");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass19788929332() {
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
    public void testElementstoggleClass26152053() {
        Elements elements = new Elements();
        elements.toggleClass("UTF-");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstoggleClass35756404() {
        Elements elements = new Elements();
        elements.toggleClass("typd");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass10032436870() {
        Elements elements = new Elements();
        elements.hasClass("textarea");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass20353119921() {
        Elements elements = new Elements();
        elements.hasClass(":first-of-type");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass662() {
        Elements elements = new Elements();
        elements.hasClass("#");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass32132593() {
        Elements elements = new Elements();
        elements.hasClass("htmm");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshasClass12174874144() {
        Elements elements = new Elements();
        elements.hasClass("hiddeo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementsval13776877260() {
        Elements elements = new Elements();
        elements.val("buttoo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval30164321() {
        Elements elements = new Elements();
        elements.val("base");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval10101369402() {
        Elements elements = new Elements();
        elements.val("option");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval807731723() {
        Elements elements = new Elements();
        elements.val("optgrouq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsval16449536124() {
        Elements elements = new Elements();
        elements.val("frameset");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementstagName35756410() {
        Elements elements = new Elements();
        elements.tagName("type");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName17571249771() {
        Elements elements = new Elements();
        elements.tagName(":emptx");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName2709408282() {
        Elements elements = new Elements();
        elements.tagName("disablee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName33093() {
        Elements elements = new Elements();
        elements.tagName("h6");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementstagName2882752474() {
        Elements elements = new Elements();
        elements.tagName(":nth-child'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml37260() {
        Elements elements = new Elements();
        elements.html("tc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml996170351() {
        Elements elements = new Elements();
        elements.html("httpt");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml29875592() {
        Elements elements = new Elements();
        elements.html("abs:");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml37323() {
        Elements elements = new Elements();
        elements.html("ti");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementshtml1102563214() {
        Elements elements = new Elements();
        elements.html("text/");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend807731720() {
        Elements elements = new Elements();
        elements.prepend("optgrouq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend37411() {
        Elements elements = new Elements();
        elements.prepend("tr");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend13932() {
        Elements elements = new Elements();
        elements.prepend("*<");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend1143073() {
        Elements elements = new Elements();
        elements.prepend("svg");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprepend12094() {
        Elements elements = new Elements();
        elements.prepend("$>");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend13776877260() {
        Elements elements = new Elements();
        elements.append("buttoo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend33441671() {
        Elements elements = new Elements();
        elements.append("math");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend1044182() {
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
    public void testElementsappend18245813() {
        Elements elements = new Elements();
        elements.append(":alk");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsappend11927218624() {
        Elements elements = new Elements();
        elements.append("noframes");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore14229508270() {
        Elements elements = new Elements();
        elements.before("action");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore33480031() {
        Elements elements = new Elements();
        elements.before("met`");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore35756412() {
        Elements elements = new Elements();
        elements.before("type");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore3081290263() {
        Elements elements = new Elements();
        elements.before(":last-child");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsbefore6361976014() {
        Elements elements = new Elements();
        elements.before("colgrouq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter660() {
        Elements elements = new Elements();
        elements.after("#");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter30051() {
        Elements elements = new Elements();
        elements.after("^<");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter14229508262() {
        Elements elements = new Elements();
        elements.after("actioo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter1857353283() {
        Elements elements = new Elements();
        elements.after("US-ASCIH");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsafter29875604() {
        Elements elements = new Elements();
        elements.after("abs;");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap32300() {
        Elements elements = new Elements();
        elements.wrap("dc");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap12269463001() {
        Elements elements = new Elements();
        elements.wrap(":containsData(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap32134782() {
        Elements elements = new Elements();
        elements.wrap("htto");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap570706503() {
        Elements elements = new Elements();
        elements.wrap(":roos");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementswrap10548386284() {
        Elements elements = new Elements();
        elements.wrap(":first-child");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementsselect31490260() {
        Elements elements = new Elements();
        elements.select("forl");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect12269463011() {
        Elements elements = new Elements();
        elements.select(":containsData'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect14711890862() {
        Elements elements = new Elements();
        elements.select(":nth-last-child)");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect12174874143() {
        Elements elements = new Elements();
        elements.select("hiddeo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsselect7423139254() {
        Elements elements = new Elements();
        elements.select("checkec");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot18245810() {
        Elements elements = new Elements();
        elements.not(":alk");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot12081() {
        Elements elements = new Elements();
        elements.not("$=");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot31984622() {
        Elements elements = new Elements();
        elements.not("heac");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot14562253633() {
        Elements elements = new Elements();
        elements.not(":matches'");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnot987204() {
        Elements elements = new Elements();
        elements.not("com");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementseq11141431() {
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
    public void testElementseq2702() {
        Elements elements = new Elements();
        elements.eq(239);
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementseq1313() {
        Elements elements = new Elements();
        elements.eq(100);
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
        elements.eq(57243);
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis33090() {
        Elements elements = new Elements();
        elements.is("h6");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis21156131441() {
        Elements elements = new Elements();
        elements.is("noembee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis39992() {
        Elements elements = new Elements();
        elements.is("~>");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis19383() {
        Elements elements = new Elements();
        elements.is("</");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsis12068418934() {
        Elements elements = new Elements();
        elements.is("http:.");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementsnext20919604270() {
        Elements elements = new Elements();
        elements.next(":only-chile");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext31255621() {
        Elements elements = new Elements();
        elements.next("eveo");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnext2709408282() {
        Elements elements = new Elements();
        elements.next("disablee");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementsnext2709408274() {
        Elements elements = new Elements();
        elements.next("disabled");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementsnextAll33737370() {
        Elements elements = new Elements();
        elements.nextAll("namd");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll567593351() {
        Elements elements = new Elements();
        elements.nextAll(":has(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll5525734442() {
        Elements elements = new Elements();
        elements.nextAll("captiom");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll923() {
        Elements elements = new Elements();
        elements.nextAll("=");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsnextAll21011357984() {
        Elements elements = new Elements();
        elements.nextAll(":matchTexs");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementsprev15368918750() {
        Elements elements = new Elements();
        elements.prev("checkboy");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev6361976011() {
        Elements elements = new Elements();
        elements.prev("colgrouq");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev5525734452() {
        Elements elements = new Elements();
        elements.prev("caption");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev10761623183() {
        Elements elements = new Elements();
        elements.prev(":contains(");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprev15368918754() {
        Elements elements = new Elements();
        elements.prev("checkboy");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testElementsprevAll11414281680() {
        Elements elements = new Elements();
        elements.prevAll("[CDATA[");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll7390744101() {
        Elements elements = new Elements();
        elements.prevAll("charses");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll1188372() {
        Elements elements = new Elements();
        elements.prevAll("xmk");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll29875583() {
        Elements elements = new Elements();
        elements.prevAll("abs9");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
            fail("elements.hashCode() throws an exception");
        }
        try {
            elements.toString();
        } catch (Exception e) {
            fail("elements.toString() throws an exception");
        }
    }
    @Test
    public void testElementsprevAll18678420534() {
        Elements elements = new Elements();
        elements.prevAll("[a-zA-Z_:][-a-zA-Z0-9_:.])");
        assertTrue(elements.equals(elements));
        try {
            elements.equals(elements);
        } catch (Exception e) {
            fail("elements.equals(elements) throws an exception");
        }
        try {
            elements.hashCode();
        } catch (Exception e) {
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
    public void testQueryParserparse31891140() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("gziq");
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
    public void testQueryParserparse31984621() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("heac");
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
    public void testQueryParserparse33218802() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("linj");
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
    public void testQueryParserparse9503947293() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("commanc");
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
    public void testQueryParserparse31490274() {
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
    public void testSelectorselect21016540030() {
        Selector selector = new Selector();
        selector.select(":matches'",(Element) null);
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
    public void testSelectorselect28627881() {
        Selector selector = new Selector();
        selector.select("]]=",(Element) null);
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
    public void testSelectorselect11838655762() {
        Selector selector = new Selector();
        selector.select("inpus",(Element) null);
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
    public void testSelectorselect13693451923() {
        Selector selector = new Selector();
        selector.select(":only-of-type",(Element) null);
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
    public void testSelectorselect1088658624() {
        Selector selector = new Selector();
        selector.select("rubz",(Element) null);
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
    public void testSelectorselect19265157670() {
        Selector selector = new Selector();
        selector.select("scrips",(Iterable<Element>) null);
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
    public void testSelectorselect17527108491() {
        Selector selector = new Selector();
        selector.select("colgrouq",(Iterable<Element>) null);
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
    public void testSelectorselect15021525792() {
        Selector selector = new Selector();
        selector.select(":nth-of-type)",(Iterable<Element>) null);
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
    public void testSelectorselect28628503() {
        Selector selector = new Selector();
        selector.select("]]?",(Iterable<Element>) null);
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
    public void testSelectorselect34069624() {
        Selector selector = new Selector();
        selector.select("odd",(Iterable<Element>) null);
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
    public void testSelectorselectFirst16437928150() {
        Selector selector = new Selector();
        selector.selectFirst("DOCTYPE",(Element) null);
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
    public void testSelectorselectFirst18100989421() {
        Selector selector = new Selector();
        selector.selectFirst("basefons",(Element) null);
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
    public void testSelectorselectFirst14364702612() {
        Selector selector = new Selector();
        selector.selectFirst("charset",(Element) null);
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
    public void testSelectorselectFirst988625033() {
        Selector selector = new Selector();
        selector.selectFirst("gzip",(Element) null);
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
    public void testSelectorselectFirst20685287334() {
        Selector selector = new Selector();
        selector.selectFirst("[a-zA-Z_:][-a-zA-Z0-9_:.]+",(Element) null);
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