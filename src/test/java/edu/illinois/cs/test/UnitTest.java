package edu.illinois.cs.test;
import org.junit.Test;
import static org.junit.Assert.*;
public class UnitTest {
    @Test
    public void testcheckCapacity0() {
        Attributes attributes = new Attributes();
        attributes.checkCapacity(187);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcheckCapacity1() {
        Attributes attributes = new Attributes();
        attributes.checkCapacity(55297);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcheckCapacity2() {
        Attributes attributes = new Attributes();
        attributes.checkCapacity(103);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcopyOf0() {
        Attributes attributes = new Attributes();
        attributes.copyOf(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs"},401);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcopyOf1() {
        Attributes attributes = new Attributes();
        attributes.copyOf(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$="},55296);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcopyOf2() {
        Attributes attributes = new Attributes();
        attributes.copyOf(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1"},191);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testindexOfKey0() {
        Attributes attributes = new Attributes();
        attributes.indexOfKey("h0");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testindexOfKey1() {
        Attributes attributes = new Attributes();
        attributes.indexOfKey("]]>");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testindexOfKey2() {
        Attributes attributes = new Attributes();
        attributes.indexOfKey(":first-of-typf");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testindexOfKeyIgnoreCase0() {
        Attributes attributes = new Attributes();
        attributes.indexOfKeyIgnoreCase("namf");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testindexOfKeyIgnoreCase1() {
        Attributes attributes = new Attributes();
        attributes.indexOfKeyIgnoreCase("checkbox");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testindexOfKeyIgnoreCase2() {
        Attributes attributes = new Attributes();
        attributes.indexOfKeyIgnoreCase("rubz");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcheckNotNull0() {
        Attributes attributes = new Attributes();
        attributes.checkNotNull(":nth-last-child)");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcheckNotNull1() {
        Attributes attributes = new Attributes();
        attributes.checkNotNull(":all");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testcheckNotNull2() {
        Attributes attributes = new Attributes();
        attributes.checkNotNull("even");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testget0() {
        Attributes attributes = new Attributes();
        attributes.get("meta");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testget1() {
        Attributes attributes = new Attributes();
        attributes.get("basd");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testget2() {
        Attributes attributes = new Attributes();
        attributes.get(":emptx");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testgetIgnoreCase0() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("[CDATAZ");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testgetIgnoreCase1() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase("[");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testgetIgnoreCase2() {
        Attributes attributes = new Attributes();
        attributes.getIgnoreCase(":matches'");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testadd0() {
        Attributes attributes = new Attributes();
        attributes.add(":containsData'","*}");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testadd1() {
        Attributes attributes = new Attributes();
        attributes.add("met`",":containsData'");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testadd2() {
        Attributes attributes = new Attributes();
        attributes.add("isindey","~>");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput0() {
        Attributes attributes = new Attributes();
        attributes.put(":matchTexs","#roou");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput1() {
        Attributes attributes = new Attributes();
        attributes.put(":only-of-typf",":only-of-typd");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput2() {
        Attributes attributes = new Attributes();
        attributes.put("noembee","bodx");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testputIgnoreCase0() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("[a-zA-Z_:][-a-zA-Z0-9_:.]*","*<");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testputIgnoreCase1() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("inpuu","heac");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testputIgnoreCase2() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("checkec","#text");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput0() {
        Attributes attributes = new Attributes();
        attributes.put(":matchesOwn)",true);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput1() {
        Attributes attributes = new Attributes();
        attributes.put("noframer",true);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput2() {
        Attributes attributes = new Attributes();
        attributes.put(":gt(",true);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput0() {
        Attributes attributes = new Attributes();
        attributes.put(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput1() {
        Attributes attributes = new Attributes();
        attributes.put(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testput2() {
        Attributes attributes = new Attributes();
        attributes.put(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove0() {
        Attributes attributes = new Attributes();
        attributes.remove(500);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove1() {
        Attributes attributes = new Attributes();
        attributes.remove(239);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove2() {
        Attributes attributes = new Attributes();
        attributes.remove(401);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove0() {
        Attributes attributes = new Attributes();
        attributes.remove("optioo");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove1() {
        Attributes attributes = new Attributes();
        attributes.remove("eveo");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove2() {
        Attributes attributes = new Attributes();
        attributes.remove("evem");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremoveIgnoreCase0() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("disabled");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremoveIgnoreCase1() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase(":lt(");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremoveIgnoreCase2() {
        Attributes attributes = new Attributes();
        attributes.removeIgnoreCase("#roou");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasKey0() {
        Attributes attributes = new Attributes();
        attributes.hasKey("tr");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasKey1() {
        Attributes attributes = new Attributes();
        attributes.hasKey("[CDATAZ");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasKey2() {
        Attributes attributes = new Attributes();
        attributes.hasKey("keygeo");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasKeyIgnoreCase0() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("stylf");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasKeyIgnoreCase1() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("frameset");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasKeyIgnoreCase2() {
        Attributes attributes = new Attributes();
        attributes.hasKeyIgnoreCase("<.");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testsize0() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testsize1() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testsize2() {
        Attributes attributes = new Attributes();
        attributes.size();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testisEmpty0() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testisEmpty1() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testisEmpty2() {
        Attributes attributes = new Attributes();
        attributes.isEmpty();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testaddAll0() {
        Attributes attributes = new Attributes();
        attributes.addAll(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testaddAll1() {
        Attributes attributes = new Attributes();
        attributes.addAll(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testaddAll2() {
        Attributes attributes = new Attributes();
        attributes.addAll(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasNext0() {
        Attributes attributes = new Attributes();
        attributes.hasNext();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasNext1() {
        Attributes attributes = new Attributes();
        attributes.hasNext();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhasNext2() {
        Attributes attributes = new Attributes();
        attributes.hasNext();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testnext0() {
        Attributes attributes = new Attributes();
        attributes.next();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testnext1() {
        Attributes attributes = new Attributes();
        attributes.next();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testnext2() {
        Attributes attributes = new Attributes();
        attributes.next();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove0() {
        Attributes attributes = new Attributes();
        attributes.remove();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove1() {
        Attributes attributes = new Attributes();
        attributes.remove();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testremove2() {
        Attributes attributes = new Attributes();
        attributes.remove();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testiterator0() {
        Attributes attributes = new Attributes();
        attributes.iterator();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testiterator1() {
        Attributes attributes = new Attributes();
        attributes.iterator();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testiterator2() {
        Attributes attributes = new Attributes();
        attributes.iterator();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testasList0() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testasList1() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testasList2() {
        Attributes attributes = new Attributes();
        attributes.asList();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdataset0() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdataset1() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdataset2() {
        Attributes attributes = new Attributes();
        attributes.dataset();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhtml0() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhtml1() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhtml2() {
        Attributes attributes = new Attributes();
        attributes.html();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhtml0() {
        Attributes attributes = new Attributes();
        attributes.html(null,null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhtml1() {
        Attributes attributes = new Attributes();
        attributes.html(null,null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhtml2() {
        Attributes attributes = new Attributes();
        attributes.html(null,null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testtoString0() {
        Attributes attributes = new Attributes();
        attributes.toString();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testtoString1() {
        Attributes attributes = new Attributes();
        attributes.toString();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testtoString2() {
        Attributes attributes = new Attributes();
        attributes.toString();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testequals0() {
        Attributes attributes = new Attributes();
        attributes.equals(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testequals1() {
        Attributes attributes = new Attributes();
        attributes.equals(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testequals2() {
        Attributes attributes = new Attributes();
        attributes.equals(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhashCode0() {
        Attributes attributes = new Attributes();
        attributes.hashCode();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhashCode1() {
        Attributes attributes = new Attributes();
        attributes.hashCode();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testhashCode2() {
        Attributes attributes = new Attributes();
        attributes.hashCode();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testclone0() {
        Attributes attributes = new Attributes();
        attributes.clone();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testclone1() {
        Attributes attributes = new Attributes();
        attributes.clone();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testclone2() {
        Attributes attributes = new Attributes();
        attributes.clone();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testnormalize0() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testnormalize1() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testnormalize2() {
        Attributes attributes = new Attributes();
        attributes.normalize();
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdeduplicate0() {
        Attributes attributes = new Attributes();
        attributes.deduplicate(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdeduplicate1() {
        Attributes attributes = new Attributes();
        attributes.deduplicate(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdeduplicate2() {
        Attributes attributes = new Attributes();
        attributes.deduplicate(null);
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testentrySet0() {
        Dataset dataset = new Dataset();
        dataset.entrySet();
        assertTrue(dataset.equals(dataset));
    }
    @Test
    public void testentrySet1() {
        Dataset dataset = new Dataset();
        dataset.entrySet();
        assertTrue(dataset.equals(dataset));
    }
    @Test
    public void testentrySet2() {
        Dataset dataset = new Dataset();
        dataset.entrySet();
        assertTrue(dataset.equals(dataset));
    }
    @Test
    public void testput0() {
        Dataset dataset = new Dataset();
        dataset.put("commane","[");
        assertTrue(dataset.equals(dataset));
    }
    @Test
    public void testput1() {
        Dataset dataset = new Dataset();
        dataset.put("noframer","even");
        assertTrue(dataset.equals(dataset));
    }
    @Test
    public void testput2() {
        Dataset dataset = new Dataset();
        dataset.put("namd","lj");
        assertTrue(dataset.equals(dataset));
    }
    @Test
    public void testiterator0() {
        EntrySet entryset = new EntrySet();
        entryset.iterator();
        assertTrue(entryset.equals(entryset));
    }
    @Test
    public void testiterator1() {
        EntrySet entryset = new EntrySet();
        entryset.iterator();
        assertTrue(entryset.equals(entryset));
    }
    @Test
    public void testiterator2() {
        EntrySet entryset = new EntrySet();
        entryset.iterator();
        assertTrue(entryset.equals(entryset));
    }
    @Test
    public void testsize0() {
        EntrySet entryset = new EntrySet();
        entryset.size();
        assertTrue(entryset.equals(entryset));
    }
    @Test
    public void testsize1() {
        EntrySet entryset = new EntrySet();
        entryset.size();
        assertTrue(entryset.equals(entryset));
    }
    @Test
    public void testsize2() {
        EntrySet entryset = new EntrySet();
        entryset.size();
        assertTrue(entryset.equals(entryset));
    }
    @Test
    public void testhasNext0() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.hasNext();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testhasNext1() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.hasNext();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testhasNext2() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.hasNext();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testnext0() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.next();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testnext1() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.next();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testnext2() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.next();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testremove0() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.remove();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testremove1() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.remove();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testremove2() {
        DatasetIterator datasetiterator = new DatasetIterator();
        datasetiterator.remove();
        assertTrue(datasetiterator.equals(datasetiterator));
    }
    @Test
    public void testdataKey0() {
        Attributes attributes = new Attributes();
        attributes.dataKey("linj");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdataKey1() {
        Attributes attributes = new Attributes();
        attributes.dataKey("#roou");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testdataKey2() {
        Attributes attributes = new Attributes();
        attributes.dataKey("Set-Cookie");
        assertTrue(attributes.equals(attributes));
    }
    @Test
    public void testensureChildNodes0() {
        Element element = new Element();
        element.ensureChildNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testensureChildNodes1() {
        Element element = new Element();
        element.ensureChildNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testensureChildNodes2() {
        Element element = new Element();
        element.ensureChildNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasAttributes0() {
        Element element = new Element();
        element.hasAttributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasAttributes1() {
        Element element = new Element();
        element.hasAttributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasAttributes2() {
        Element element = new Element();
        element.hasAttributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testattributes0() {
        Element element = new Element();
        element.attributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testattributes1() {
        Element element = new Element();
        element.attributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testattributes2() {
        Element element = new Element();
        element.attributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testbaseUri0() {
        Element element = new Element();
        element.baseUri();
        assertTrue(element.equals(element));
    }
    @Test
    public void testbaseUri1() {
        Element element = new Element();
        element.baseUri();
        assertTrue(element.equals(element));
    }
    @Test
    public void testbaseUri2() {
        Element element = new Element();
        element.baseUri();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdoSetBaseUri0() {
        Element element = new Element();
        element.doSetBaseUri("linj");
        assertTrue(element.equals(element));
    }
    @Test
    public void testdoSetBaseUri1() {
        Element element = new Element();
        element.doSetBaseUri(":last-chilc");
        assertTrue(element.equals(element));
    }
    @Test
    public void testdoSetBaseUri2() {
        Element element = new Element();
        element.doSetBaseUri(":last-child");
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildNodeSize0() {
        Element element = new Element();
        element.childNodeSize();
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildNodeSize1() {
        Element element = new Element();
        element.childNodeSize();
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildNodeSize2() {
        Element element = new Element();
        element.childNodeSize();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnodeName0() {
        Element element = new Element();
        element.nodeName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnodeName1() {
        Element element = new Element();
        element.nodeName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnodeName2() {
        Element element = new Element();
        element.nodeName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtagName0() {
        Element element = new Element();
        element.tagName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtagName1() {
        Element element = new Element();
        element.tagName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtagName2() {
        Element element = new Element();
        element.tagName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnormalName0() {
        Element element = new Element();
        element.normalName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnormalName1() {
        Element element = new Element();
        element.normalName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnormalName2() {
        Element element = new Element();
        element.normalName();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtagName0() {
        Element element = new Element();
        element.tagName("*|");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtagName1() {
        Element element = new Element();
        element.tagName("styld");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtagName2() {
        Element element = new Element();
        element.tagName("namf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtag0() {
        Element element = new Element();
        element.tag();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtag1() {
        Element element = new Element();
        element.tag();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtag2() {
        Element element = new Element();
        element.tag();
        assertTrue(element.equals(element));
    }
    @Test
    public void testisBlock0() {
        Element element = new Element();
        element.isBlock();
        assertTrue(element.equals(element));
    }
    @Test
    public void testisBlock1() {
        Element element = new Element();
        element.isBlock();
        assertTrue(element.equals(element));
    }
    @Test
    public void testisBlock2() {
        Element element = new Element();
        element.isBlock();
        assertTrue(element.equals(element));
    }
    @Test
    public void testid0() {
        Element element = new Element();
        element.id();
        assertTrue(element.equals(element));
    }
    @Test
    public void testid1() {
        Element element = new Element();
        element.id();
        assertTrue(element.equals(element));
    }
    @Test
    public void testid2() {
        Element element = new Element();
        element.id();
        assertTrue(element.equals(element));
    }
    @Test
    public void testattr0() {
        Element element = new Element();
        element.attr(":matchText","plaintexu");
        assertTrue(element.equals(element));
    }
    @Test
    public void testattr1() {
        Element element = new Element();
        element.attr("DOCTYPE","^>");
        assertTrue(element.equals(element));
    }
    @Test
    public void testattr2() {
        Element element = new Element();
        element.attr("tq","option");
        assertTrue(element.equals(element));
    }
    @Test
    public void testattr0() {
        Element element = new Element();
        element.attr("script",true);
        assertTrue(element.equals(element));
    }
    @Test
    public void testattr1() {
        Element element = new Element();
        element.attr("#roos",true);
        assertTrue(element.equals(element));
    }
    @Test
    public void testattr2() {
        Element element = new Element();
        element.attr("actioo",true);
        assertTrue(element.equals(element));
    }
    @Test
    public void testdataset0() {
        Element element = new Element();
        element.dataset();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdataset1() {
        Element element = new Element();
        element.dataset();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdataset2() {
        Element element = new Element();
        element.dataset();
        assertTrue(element.equals(element));
    }
    @Test
    public void testparent0() {
        Element element = new Element();
        element.parent();
        assertTrue(element.equals(element));
    }
    @Test
    public void testparent1() {
        Element element = new Element();
        element.parent();
        assertTrue(element.equals(element));
    }
    @Test
    public void testparent2() {
        Element element = new Element();
        element.parent();
        assertTrue(element.equals(element));
    }
    @Test
    public void testparents0() {
        Element element = new Element();
        element.parents();
        assertTrue(element.equals(element));
    }
    @Test
    public void testparents1() {
        Element element = new Element();
        element.parents();
        assertTrue(element.equals(element));
    }
    @Test
    public void testparents2() {
        Element element = new Element();
        element.parents();
        assertTrue(element.equals(element));
    }
    @Test
    public void testaccumulateParents0() {
        Element element = new Element();
        element.accumulateParents(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testaccumulateParents1() {
        Element element = new Element();
        element.accumulateParents(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testaccumulateParents2() {
        Element element = new Element();
        element.accumulateParents(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testchild0() {
        Element element = new Element();
        element.child(199);
        assertTrue(element.equals(element));
    }
    @Test
    public void testchild1() {
        Element element = new Element();
        element.child(103);
        assertTrue(element.equals(element));
    }
    @Test
    public void testchild2() {
        Element element = new Element();
        element.child(55296);
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildren0() {
        Element element = new Element();
        element.children();
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildren1() {
        Element element = new Element();
        element.children();
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildren2() {
        Element element = new Element();
        element.children();
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildElementsList0() {
        Element element = new Element();
        element.childElementsList();
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildElementsList1() {
        Element element = new Element();
        element.childElementsList();
        assertTrue(element.equals(element));
    }
    @Test
    public void testchildElementsList2() {
        Element element = new Element();
        element.childElementsList();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnodelistChanged0() {
        Element element = new Element();
        element.nodelistChanged();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnodelistChanged1() {
        Element element = new Element();
        element.nodelistChanged();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnodelistChanged2() {
        Element element = new Element();
        element.nodelistChanged();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtextNodes0() {
        Element element = new Element();
        element.textNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtextNodes1() {
        Element element = new Element();
        element.textNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtextNodes2() {
        Element element = new Element();
        element.textNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdataNodes0() {
        Element element = new Element();
        element.dataNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdataNodes1() {
        Element element = new Element();
        element.dataNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdataNodes2() {
        Element element = new Element();
        element.dataNodes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testselect0() {
        Element element = new Element();
        element.select("ts");
        assertTrue(element.equals(element));
    }
    @Test
    public void testselect1() {
        Element element = new Element();
        element.select("US-ASCII");
        assertTrue(element.equals(element));
    }
    @Test
    public void testselect2() {
        Element element = new Element();
        element.select("basefont");
        assertTrue(element.equals(element));
    }
    @Test
    public void testselectFirst0() {
        Element element = new Element();
        element.selectFirst("li");
        assertTrue(element.equals(element));
    }
    @Test
    public void testselectFirst1() {
        Element element = new Element();
        element.selectFirst("gziq");
        assertTrue(element.equals(element));
    }
    @Test
    public void testselectFirst2() {
        Element element = new Element();
        element.selectFirst(":last-of-typf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testis0() {
        Element element = new Element();
        element.is("bs");
        assertTrue(element.equals(element));
    }
    @Test
    public void testis1() {
        Element element = new Element();
        element.is("href");
        assertTrue(element.equals(element));
    }
    @Test
    public void testis2() {
        Element element = new Element();
        element.is("typf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testis0() {
        Element element = new Element();
        element.is(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testis1() {
        Element element = new Element();
        element.is(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testis2() {
        Element element = new Element();
        element.is(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendChild0() {
        Element element = new Element();
        element.appendChild(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendChild1() {
        Element element = new Element();
        element.appendChild(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendChild2() {
        Element element = new Element();
        element.appendChild(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendTo0() {
        Element element = new Element();
        element.appendTo(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendTo1() {
        Element element = new Element();
        element.appendTo(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendTo2() {
        Element element = new Element();
        element.appendTo(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependChild0() {
        Element element = new Element();
        element.prependChild(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependChild1() {
        Element element = new Element();
        element.prependChild(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependChild2() {
        Element element = new Element();
        element.prependChild(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testinsertChildren0() {
        Element element = new Element();
        element.insertChildren(3,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testinsertChildren1() {
        Element element = new Element();
        element.insertChildren(55396,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testinsertChildren2() {
        Element element = new Element();
        element.insertChildren(103,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testinsertChildren0() {
        Element element = new Element();
        element.insertChildren(400,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testinsertChildren1() {
        Element element = new Element();
        element.insertChildren(-100,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testinsertChildren2() {
        Element element = new Element();
        element.insertChildren(55297,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendElement0() {
        Element element = new Element();
        element.appendElement("svf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendElement1() {
        Element element = new Element();
        element.appendElement("noframet");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendElement2() {
        Element element = new Element();
        element.appendElement(":nth-of-type)");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependElement0() {
        Element element = new Element();
        element.prependElement("te");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependElement1() {
        Element element = new Element();
        element.prependElement(":first-of-typf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependElement2() {
        Element element = new Element();
        element.prependElement("odd");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendText0() {
        Element element = new Element();
        element.appendText(":emptz");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendText1() {
        Element element = new Element();
        element.appendText("type");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendText2() {
        Element element = new Element();
        element.appendText("imagf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependText0() {
        Element element = new Element();
        element.prependText("scrips");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependText1() {
        Element element = new Element();
        element.prependText("gzip");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprependText2() {
        Element element = new Element();
        element.prependText("frameset");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappend0() {
        Element element = new Element();
        element.append("httq");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappend1() {
        Element element = new Element();
        element.append("dd");
        assertTrue(element.equals(element));
    }
    @Test
    public void testappend2() {
        Element element = new Element();
        element.append("tbodx");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprepend0() {
        Element element = new Element();
        element.prepend("^=");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprepend1() {
        Element element = new Element();
        element.prepend(":last-of-type");
        assertTrue(element.equals(element));
    }
    @Test
    public void testprepend2() {
        Element element = new Element();
        element.prepend("plaintexs");
        assertTrue(element.equals(element));
    }
    @Test
    public void testbefore0() {
        Element element = new Element();
        element.before("optiom");
        assertTrue(element.equals(element));
    }
    @Test
    public void testbefore1() {
        Element element = new Element();
        element.before(":matches(");
        assertTrue(element.equals(element));
    }
    @Test
    public void testbefore2() {
        Element element = new Element();
        element.before("~>");
        assertTrue(element.equals(element));
    }
    @Test
    public void testbefore0() {
        Element element = new Element();
        element.before(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testbefore1() {
        Element element = new Element();
        element.before(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testbefore2() {
        Element element = new Element();
        element.before(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testafter0() {
        Element element = new Element();
        element.after("^");
        assertTrue(element.equals(element));
    }
    @Test
    public void testafter1() {
        Element element = new Element();
        element.after("radio");
        assertTrue(element.equals(element));
    }
    @Test
    public void testafter2() {
        Element element = new Element();
        element.after("noembed");
        assertTrue(element.equals(element));
    }
    @Test
    public void testafter0() {
        Element element = new Element();
        element.after(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testafter1() {
        Element element = new Element();
        element.after(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testafter2() {
        Element element = new Element();
        element.after(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testempty0() {
        Element element = new Element();
        element.empty();
        assertTrue(element.equals(element));
    }
    @Test
    public void testempty1() {
        Element element = new Element();
        element.empty();
        assertTrue(element.equals(element));
    }
    @Test
    public void testempty2() {
        Element element = new Element();
        element.empty();
        assertTrue(element.equals(element));
    }
    @Test
    public void testwrap0() {
        Element element = new Element();
        element.wrap("namf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testwrap1() {
        Element element = new Element();
        element.wrap("metb");
        assertTrue(element.equals(element));
    }
    @Test
    public void testwrap2() {
        Element element = new Element();
        element.wrap("httpr");
        assertTrue(element.equals(element));
    }
    @Test
    public void testcssSelector0() {
        Element element = new Element();
        element.cssSelector();
        assertTrue(element.equals(element));
    }
    @Test
    public void testcssSelector1() {
        Element element = new Element();
        element.cssSelector();
        assertTrue(element.equals(element));
    }
    @Test
    public void testcssSelector2() {
        Element element = new Element();
        element.cssSelector();
        assertTrue(element.equals(element));
    }
    @Test
    public void testsiblingElements0() {
        Element element = new Element();
        element.siblingElements();
        assertTrue(element.equals(element));
    }
    @Test
    public void testsiblingElements1() {
        Element element = new Element();
        element.siblingElements();
        assertTrue(element.equals(element));
    }
    @Test
    public void testsiblingElements2() {
        Element element = new Element();
        element.siblingElements();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSibling0() {
        Element element = new Element();
        element.nextElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSibling1() {
        Element element = new Element();
        element.nextElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSibling2() {
        Element element = new Element();
        element.nextElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSiblings0() {
        Element element = new Element();
        element.nextElementSiblings();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSiblings1() {
        Element element = new Element();
        element.nextElementSiblings();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSiblings2() {
        Element element = new Element();
        element.nextElementSiblings();
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreviousElementSibling0() {
        Element element = new Element();
        element.previousElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreviousElementSibling1() {
        Element element = new Element();
        element.previousElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreviousElementSibling2() {
        Element element = new Element();
        element.previousElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreviousElementSiblings0() {
        Element element = new Element();
        element.previousElementSiblings();
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreviousElementSiblings1() {
        Element element = new Element();
        element.previousElementSiblings();
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreviousElementSiblings2() {
        Element element = new Element();
        element.previousElementSiblings();
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSiblings0() {
        Element element = new Element();
        element.nextElementSiblings(true);
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSiblings1() {
        Element element = new Element();
        element.nextElementSiblings(true);
        assertTrue(element.equals(element));
    }
    @Test
    public void testnextElementSiblings2() {
        Element element = new Element();
        element.nextElementSiblings(true);
        assertTrue(element.equals(element));
    }
    @Test
    public void testfirstElementSibling0() {
        Element element = new Element();
        element.firstElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testfirstElementSibling1() {
        Element element = new Element();
        element.firstElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testfirstElementSibling2() {
        Element element = new Element();
        element.firstElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testelementSiblingIndex0() {
        Element element = new Element();
        element.elementSiblingIndex();
        assertTrue(element.equals(element));
    }
    @Test
    public void testelementSiblingIndex1() {
        Element element = new Element();
        element.elementSiblingIndex();
        assertTrue(element.equals(element));
    }
    @Test
    public void testelementSiblingIndex2() {
        Element element = new Element();
        element.elementSiblingIndex();
        assertTrue(element.equals(element));
    }
    @Test
    public void testlastElementSibling0() {
        Element element = new Element();
        element.lastElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testlastElementSibling1() {
        Element element = new Element();
        element.lastElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testlastElementSibling2() {
        Element element = new Element();
        element.lastElementSibling();
        assertTrue(element.equals(element));
    }
    @Test
    public void testindexInList0() {
        Element element = new Element();
        element.indexInList(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testindexInList1() {
        Element element = new Element();
        element.indexInList(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testindexInList2() {
        Element element = new Element();
        element.indexInList(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByTag0() {
        Element element = new Element();
        element.getElementsByTag("[a-zA-Z_:][-a-zA-Z0-9_:.])");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByTag1() {
        Element element = new Element();
        element.getElementsByTag("cok");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByTag2() {
        Element element = new Element();
        element.getElementsByTag("type");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementById0() {
        Element element = new Element();
        element.getElementById("odd");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementById1() {
        Element element = new Element();
        element.getElementById("[CDATAZ");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementById2() {
        Element element = new Element();
        element.getElementById("#texu");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByClass0() {
        Element element = new Element();
        element.getElementsByClass("title");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByClass1() {
        Element element = new Element();
        element.getElementsByClass("noframer");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByClass2() {
        Element element = new Element();
        element.getElementsByClass(":containsOwn'");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttribute0() {
        Element element = new Element();
        element.getElementsByAttribute(":contains)");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttribute1() {
        Element element = new Element();
        element.getElementsByAttribute("*=");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttribute2() {
        Element element = new Element();
        element.getElementsByAttribute("cok");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeStarting0() {
        Element element = new Element();
        element.getElementsByAttributeStarting("cok");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeStarting1() {
        Element element = new Element();
        element.getElementsByAttributeStarting("radip");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeStarting2() {
        Element element = new Element();
        element.getElementsByAttributeStarting("img");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValue0() {
        Element element = new Element();
        element.getElementsByAttributeValue("deflate","noembed");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValue1() {
        Element element = new Element();
        element.getElementsByAttributeValue("h2","forl");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValue2() {
        Element element = new Element();
        element.getElementsByAttributeValue("DOCTYPF",":first-chile");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueNot0() {
        Element element = new Element();
        element.getElementsByAttributeValueNot("boundarz",":containsOwn'");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueNot1() {
        Element element = new Element();
        element.getElementsByAttributeValueNot("namd","|");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueNot2() {
        Element element = new Element();
        element.getElementsByAttributeValueNot(":eq'","buttoo");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueStarting0() {
        Element element = new Element();
        element.getElementsByAttributeValueStarting(":only-of-type","br");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueStarting1() {
        Element element = new Element();
        element.getElementsByAttributeValueStarting("xmq",":nth-last-of-type'");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueStarting2() {
        Element element = new Element();
        element.getElementsByAttributeValueStarting("commanc","deflatf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueEnding0() {
        Element element = new Element();
        element.getElementsByAttributeValueEnding("~<",":only-child");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueEnding1() {
        Element element = new Element();
        element.getElementsByAttributeValueEnding(":has)",":empty");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueEnding2() {
        Element element = new Element();
        element.getElementsByAttributeValueEnding("iframf",":all");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueContaining0() {
        Element element = new Element();
        element.getElementsByAttributeValueContaining("deflatd","httq");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueContaining1() {
        Element element = new Element();
        element.getElementsByAttributeValueContaining(":nth-of-type'",":first-of-typd");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueContaining2() {
        Element element = new Element();
        element.getElementsByAttributeValueContaining("svf","deflate");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueMatching0() {
        Element element = new Element();
        element.getElementsByAttributeValueMatching("col",null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueMatching1() {
        Element element = new Element();
        element.getElementsByAttributeValueMatching("du",null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueMatching2() {
        Element element = new Element();
        element.getElementsByAttributeValueMatching("commane",null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueMatching0() {
        Element element = new Element();
        element.getElementsByAttributeValueMatching("a","link");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueMatching1() {
        Element element = new Element();
        element.getElementsByAttributeValueMatching("DOCTYPF","US-ASCII");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByAttributeValueMatching2() {
        Element element = new Element();
        element.getElementsByAttributeValueMatching("iframd","tablf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexLessThan0() {
        Element element = new Element();
        element.getElementsByIndexLessThan(1114112);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexLessThan1() {
        Element element = new Element();
        element.getElementsByIndexLessThan(103);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexLessThan2() {
        Element element = new Element();
        element.getElementsByIndexLessThan(102);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexGreaterThan0() {
        Element element = new Element();
        element.getElementsByIndexGreaterThan(55297);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexGreaterThan1() {
        Element element = new Element();
        element.getElementsByIndexGreaterThan(240);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexGreaterThan2() {
        Element element = new Element();
        element.getElementsByIndexGreaterThan(-1);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexEquals0() {
        Element element = new Element();
        element.getElementsByIndexEquals(1);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexEquals1() {
        Element element = new Element();
        element.getElementsByIndexEquals(500);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsByIndexEquals2() {
        Element element = new Element();
        element.getElementsByIndexEquals(224);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsContainingText0() {
        Element element = new Element();
        element.getElementsContainingText("tbodz");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsContainingText1() {
        Element element = new Element();
        element.getElementsContainingText("plaintexs");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsContainingText2() {
        Element element = new Element();
        element.getElementsContainingText(":lt)");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsContainingOwnText0() {
        Element element = new Element();
        element.getElementsContainingOwnText(":last-chile");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsContainingOwnText1() {
        Element element = new Element();
        element.getElementsContainingOwnText("\'");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsContainingOwnText2() {
        Element element = new Element();
        element.getElementsContainingOwnText("textareb");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingText0() {
        Element element = new Element();
        element.getElementsMatchingText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingText1() {
        Element element = new Element();
        element.getElementsMatchingText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingText2() {
        Element element = new Element();
        element.getElementsMatchingText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingText0() {
        Element element = new Element();
        element.getElementsMatchingText("basd");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingText1() {
        Element element = new Element();
        element.getElementsMatchingText("US-ASCIJ");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingText2() {
        Element element = new Element();
        element.getElementsMatchingText("lj");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingOwnText0() {
        Element element = new Element();
        element.getElementsMatchingOwnText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingOwnText1() {
        Element element = new Element();
        element.getElementsMatchingOwnText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingOwnText2() {
        Element element = new Element();
        element.getElementsMatchingOwnText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingOwnText0() {
        Element element = new Element();
        element.getElementsMatchingOwnText("basefont");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingOwnText1() {
        Element element = new Element();
        element.getElementsMatchingOwnText("DOCTYPE");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetElementsMatchingOwnText2() {
        Element element = new Element();
        element.getElementsMatchingOwnText("col");
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetAllElements0() {
        Element element = new Element();
        element.getAllElements();
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetAllElements1() {
        Element element = new Element();
        element.getAllElements();
        assertTrue(element.equals(element));
    }
    @Test
    public void testgetAllElements2() {
        Element element = new Element();
        element.getAllElements();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhead0() {
        Element element = new Element();
        element.head(null,199);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhead1() {
        Element element = new Element();
        element.head(null,400);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhead2() {
        Element element = new Element();
        element.head(null,-99);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtail0() {
        Element element = new Element();
        element.tail(null,102);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtail1() {
        Element element = new Element();
        element.tail(null,101);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtail2() {
        Element element = new Element();
        element.tail(null,-90);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtext0() {
        Element element = new Element();
        element.text();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtext1() {
        Element element = new Element();
        element.text();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtext2() {
        Element element = new Element();
        element.text();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhead0() {
        Element element = new Element();
        element.head(null,55297);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhead1() {
        Element element = new Element();
        element.head(null,500);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhead2() {
        Element element = new Element();
        element.head(null,57243);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtail0() {
        Element element = new Element();
        element.tail(null,55296);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtail1() {
        Element element = new Element();
        element.tail(null,191);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtail2() {
        Element element = new Element();
        element.tail(null,224);
        assertTrue(element.equals(element));
    }
    @Test
    public void testwholeText0() {
        Element element = new Element();
        element.wholeText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testwholeText1() {
        Element element = new Element();
        element.wholeText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testwholeText2() {
        Element element = new Element();
        element.wholeText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testownText0() {
        Element element = new Element();
        element.ownText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testownText1() {
        Element element = new Element();
        element.ownText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testownText2() {
        Element element = new Element();
        element.ownText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testownText0() {
        Element element = new Element();
        element.ownText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testownText1() {
        Element element = new Element();
        element.ownText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testownText2() {
        Element element = new Element();
        element.ownText(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendNormalisedText0() {
        Element element = new Element();
        element.appendNormalisedText(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendNormalisedText1() {
        Element element = new Element();
        element.appendNormalisedText(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendNormalisedText2() {
        Element element = new Element();
        element.appendNormalisedText(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendWhitespaceIfBr0() {
        Element element = new Element();
        element.appendWhitespaceIfBr(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendWhitespaceIfBr1() {
        Element element = new Element();
        element.appendWhitespaceIfBr(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testappendWhitespaceIfBr2() {
        Element element = new Element();
        element.appendWhitespaceIfBr(null,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreserveWhitespace0() {
        Element element = new Element();
        element.preserveWhitespace(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreserveWhitespace1() {
        Element element = new Element();
        element.preserveWhitespace(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testpreserveWhitespace2() {
        Element element = new Element();
        element.preserveWhitespace(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtext0() {
        Element element = new Element();
        element.text(":nth-child)");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtext1() {
        Element element = new Element();
        element.text("DOCTYPF");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtext2() {
        Element element = new Element();
        element.text("#texu");
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasText0() {
        Element element = new Element();
        element.hasText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasText1() {
        Element element = new Element();
        element.hasText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasText2() {
        Element element = new Element();
        element.hasText();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdata0() {
        Element element = new Element();
        element.data();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdata1() {
        Element element = new Element();
        element.data();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdata2() {
        Element element = new Element();
        element.data();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassName0() {
        Element element = new Element();
        element.className();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassName1() {
        Element element = new Element();
        element.className();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassName2() {
        Element element = new Element();
        element.className();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassNames0() {
        Element element = new Element();
        element.classNames();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassNames1() {
        Element element = new Element();
        element.classNames();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassNames2() {
        Element element = new Element();
        element.classNames();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassNames0() {
        Element element = new Element();
        element.classNames(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassNames1() {
        Element element = new Element();
        element.classNames(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testclassNames2() {
        Element element = new Element();
        element.classNames(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasClass0() {
        Element element = new Element();
        element.hasClass("metb");
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasClass1() {
        Element element = new Element();
        element.hasClass("[a-zA-Z_:][-a-zA-Z0-9_:.]+");
        assertTrue(element.equals(element));
    }
    @Test
    public void testhasClass2() {
        Element element = new Element();
        element.hasClass("*=");
        assertTrue(element.equals(element));
    }
    @Test
    public void testaddClass0() {
        Element element = new Element();
        element.addClass("disabled");
        assertTrue(element.equals(element));
    }
    @Test
    public void testaddClass1() {
        Element element = new Element();
        element.addClass("#text");
        assertTrue(element.equals(element));
    }
    @Test
    public void testaddClass2() {
        Element element = new Element();
        element.addClass("#roos");
        assertTrue(element.equals(element));
    }
    @Test
    public void testremoveClass0() {
        Element element = new Element();
        element.removeClass("DOCTYPD");
        assertTrue(element.equals(element));
    }
    @Test
    public void testremoveClass1() {
        Element element = new Element();
        element.removeClass("optiom");
        assertTrue(element.equals(element));
    }
    @Test
    public void testremoveClass2() {
        Element element = new Element();
        element.removeClass("hq");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtoggleClass0() {
        Element element = new Element();
        element.toggleClass("http");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtoggleClass1() {
        Element element = new Element();
        element.toggleClass("charseu");
        assertTrue(element.equals(element));
    }
    @Test
    public void testtoggleClass2() {
        Element element = new Element();
        element.toggleClass("actioo");
        assertTrue(element.equals(element));
    }
    @Test
    public void testval0() {
        Element element = new Element();
        element.val();
        assertTrue(element.equals(element));
    }
    @Test
    public void testval1() {
        Element element = new Element();
        element.val();
        assertTrue(element.equals(element));
    }
    @Test
    public void testval2() {
        Element element = new Element();
        element.val();
        assertTrue(element.equals(element));
    }
    @Test
    public void testval0() {
        Element element = new Element();
        element.val("deflatf");
        assertTrue(element.equals(element));
    }
    @Test
    public void testval1() {
        Element element = new Element();
        element.val("sarcasl");
        assertTrue(element.equals(element));
    }
    @Test
    public void testval2() {
        Element element = new Element();
        element.val(":first-child");
        assertTrue(element.equals(element));
    }
    @Test
    public void testouterHtmlHead0() {
        Element element = new Element();
        element.outerHtmlHead(null,187,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testouterHtmlHead1() {
        Element element = new Element();
        element.outerHtmlHead(null,102,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testouterHtmlHead2() {
        Element element = new Element();
        element.outerHtmlHead(null,55297,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testouterHtmlTail0() {
        Element element = new Element();
        element.outerHtmlTail(null,199,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testouterHtmlTail1() {
        Element element = new Element();
        element.outerHtmlTail(null,1114112,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testouterHtmlTail2() {
        Element element = new Element();
        element.outerHtmlTail(null,-90,null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml0() {
        Element element = new Element();
        element.html();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml1() {
        Element element = new Element();
        element.html();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml2() {
        Element element = new Element();
        element.html();
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml0() {
        Element element = new Element();
        element.html(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml1() {
        Element element = new Element();
        element.html(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml2() {
        Element element = new Element();
        element.html(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml0() {
        Element element = new Element();
        element.html("Set-Cookif");
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml1() {
        Element element = new Element();
        element.html(":alm");
        assertTrue(element.equals(element));
    }
    @Test
    public void testhtml2() {
        Element element = new Element();
        element.html("bgsound");
        assertTrue(element.equals(element));
    }
    @Test
    public void testclone0() {
        Element element = new Element();
        element.clone();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclone1() {
        Element element = new Element();
        element.clone();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclone2() {
        Element element = new Element();
        element.clone();
        assertTrue(element.equals(element));
    }
    @Test
    public void testshallowClone0() {
        Element element = new Element();
        element.shallowClone();
        assertTrue(element.equals(element));
    }
    @Test
    public void testshallowClone1() {
        Element element = new Element();
        element.shallowClone();
        assertTrue(element.equals(element));
    }
    @Test
    public void testshallowClone2() {
        Element element = new Element();
        element.shallowClone();
        assertTrue(element.equals(element));
    }
    @Test
    public void testdoClone0() {
        Element element = new Element();
        element.doClone(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testdoClone1() {
        Element element = new Element();
        element.doClone(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testdoClone2() {
        Element element = new Element();
        element.doClone(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testclearAttributes0() {
        Element element = new Element();
        element.clearAttributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclearAttributes1() {
        Element element = new Element();
        element.clearAttributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testclearAttributes2() {
        Element element = new Element();
        element.clearAttributes();
        assertTrue(element.equals(element));
    }
    @Test
    public void testremoveAttr0() {
        Element element = new Element();
        element.removeAttr("heae");
        assertTrue(element.equals(element));
    }
    @Test
    public void testremoveAttr1() {
        Element element = new Element();
        element.removeAttr(":containsOwn)");
        assertTrue(element.equals(element));
    }
    @Test
    public void testremoveAttr2() {
        Element element = new Element();
        element.removeAttr(":roos");
        assertTrue(element.equals(element));
    }
    @Test
    public void testroot0() {
        Element element = new Element();
        element.root();
        assertTrue(element.equals(element));
    }
    @Test
    public void testroot1() {
        Element element = new Element();
        element.root();
        assertTrue(element.equals(element));
    }
    @Test
    public void testroot2() {
        Element element = new Element();
        element.root();
        assertTrue(element.equals(element));
    }
    @Test
    public void testtraverse0() {
        Element element = new Element();
        element.traverse(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtraverse1() {
        Element element = new Element();
        element.traverse(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testtraverse2() {
        Element element = new Element();
        element.traverse(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testfilter0() {
        Element element = new Element();
        element.filter(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testfilter1() {
        Element element = new Element();
        element.filter(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testfilter2() {
        Element element = new Element();
        element.filter(null);
        assertTrue(element.equals(element));
    }
    @Test
    public void testonContentsChanged0() {
        NodeList nodelist = new NodeList();
        nodelist.onContentsChanged();
        assertTrue(nodelist.equals(nodelist));
    }
    @Test
    public void testonContentsChanged1() {
        NodeList nodelist = new NodeList();
        nodelist.onContentsChanged();
        assertTrue(nodelist.equals(nodelist));
    }
    @Test
    public void testonContentsChanged2() {
        NodeList nodelist = new NodeList();
        nodelist.onContentsChanged();
        assertTrue(nodelist.equals(nodelist));
    }
    @Test
    public void testnodeName0() {
        Node node = new Node();
        node.nodeName();
        assertTrue(node.equals(node));
    }
    @Test
    public void testnodeName1() {
        Node node = new Node();
        node.nodeName();
        assertTrue(node.equals(node));
    }
    @Test
    public void testnodeName2() {
        Node node = new Node();
        node.nodeName();
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasAttributes0() {
        Node node = new Node();
        node.hasAttributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasAttributes1() {
        Node node = new Node();
        node.hasAttributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasAttributes2() {
        Node node = new Node();
        node.hasAttributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasParent0() {
        Node node = new Node();
        node.hasParent();
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasParent1() {
        Node node = new Node();
        node.hasParent();
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasParent2() {
        Node node = new Node();
        node.hasParent();
        assertTrue(node.equals(node));
    }
    @Test
    public void testattr0() {
        Node node = new Node();
        node.attr("image");
        assertTrue(node.equals(node));
    }
    @Test
    public void testattr1() {
        Node node = new Node();
        node.attr(":containsOwn(");
        assertTrue(node.equals(node));
    }
    @Test
    public void testattr2() {
        Node node = new Node();
        node.attr("plaintexs");
        assertTrue(node.equals(node));
    }
    @Test
    public void testattributes0() {
        Node node = new Node();
        node.attributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testattributes1() {
        Node node = new Node();
        node.attributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testattributes2() {
        Node node = new Node();
        node.attributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testattr0() {
        Node node = new Node();
        node.attr("scripu","select");
        assertTrue(node.equals(node));
    }
    @Test
    public void testattr1() {
        Node node = new Node();
        node.attr(":matchText","scrips");
        assertTrue(node.equals(node));
    }
    @Test
    public void testattr2() {
        Node node = new Node();
        node.attr("$<","http");
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasAttr0() {
        Node node = new Node();
        node.hasAttr("noembee");
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasAttr1() {
        Node node = new Node();
        node.hasAttr("xmp");
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasAttr2() {
        Node node = new Node();
        node.hasAttr("linj");
        assertTrue(node.equals(node));
    }
    @Test
    public void testremoveAttr0() {
        Node node = new Node();
        node.removeAttr("linj");
        assertTrue(node.equals(node));
    }
    @Test
    public void testremoveAttr1() {
        Node node = new Node();
        node.removeAttr("du");
        assertTrue(node.equals(node));
    }
    @Test
    public void testremoveAttr2() {
        Node node = new Node();
        node.removeAttr("tbodx");
        assertTrue(node.equals(node));
    }
    @Test
    public void testclearAttributes0() {
        Node node = new Node();
        node.clearAttributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testclearAttributes1() {
        Node node = new Node();
        node.clearAttributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testclearAttributes2() {
        Node node = new Node();
        node.clearAttributes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testbaseUri0() {
        Node node = new Node();
        node.baseUri();
        assertTrue(node.equals(node));
    }
    @Test
    public void testbaseUri1() {
        Node node = new Node();
        node.baseUri();
        assertTrue(node.equals(node));
    }
    @Test
    public void testbaseUri2() {
        Node node = new Node();
        node.baseUri();
        assertTrue(node.equals(node));
    }
    @Test
    public void testdoSetBaseUri0() {
        Node node = new Node();
        node.doSetBaseUri("#roos");
        assertTrue(node.equals(node));
    }
    @Test
    public void testdoSetBaseUri1() {
        Node node = new Node();
        node.doSetBaseUri("<0");
        assertTrue(node.equals(node));
    }
    @Test
    public void testdoSetBaseUri2() {
        Node node = new Node();
        node.doSetBaseUri("form");
        assertTrue(node.equals(node));
    }
    @Test
    public void testhead0() {
        Node node = new Node();
        node.head(null,101);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhead1() {
        Node node = new Node();
        node.head(null,101);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhead2() {
        Node node = new Node();
        node.head(null,1114112);
        assertTrue(node.equals(node));
    }
    @Test
    public void testtail0() {
        Node node = new Node();
        node.tail(null,401);
        assertTrue(node.equals(node));
    }
    @Test
    public void testtail1() {
        Node node = new Node();
        node.tail(null,-100);
        assertTrue(node.equals(node));
    }
    @Test
    public void testtail2() {
        Node node = new Node();
        node.tail(null,57342);
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetBaseUri0() {
        Node node = new Node();
        node.setBaseUri("textareb");
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetBaseUri1() {
        Node node = new Node();
        node.setBaseUri(":nth-last-child(");
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetBaseUri2() {
        Node node = new Node();
        node.setBaseUri("tfoos");
        assertTrue(node.equals(node));
    }
    @Test
    public void testabsUrl0() {
        Node node = new Node();
        node.absUrl("matg");
        assertTrue(node.equals(node));
    }
    @Test
    public void testabsUrl1() {
        Node node = new Node();
        node.absUrl("bgsounc");
        assertTrue(node.equals(node));
    }
    @Test
    public void testabsUrl2() {
        Node node = new Node();
        node.absUrl("dc");
        assertTrue(node.equals(node));
    }
    @Test
    public void testensureChildNodes0() {
        Node node = new Node();
        node.ensureChildNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testensureChildNodes1() {
        Node node = new Node();
        node.ensureChildNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testensureChildNodes2() {
        Node node = new Node();
        node.ensureChildNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNode0() {
        Node node = new Node();
        node.childNode(191);
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNode1() {
        Node node = new Node();
        node.childNode(57342);
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNode2() {
        Node node = new Node();
        node.childNode(57243);
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodes0() {
        Node node = new Node();
        node.childNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodes1() {
        Node node = new Node();
        node.childNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodes2() {
        Node node = new Node();
        node.childNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodesCopy0() {
        Node node = new Node();
        node.childNodesCopy();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodesCopy1() {
        Node node = new Node();
        node.childNodesCopy();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodesCopy2() {
        Node node = new Node();
        node.childNodesCopy();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodeSize0() {
        Node node = new Node();
        node.childNodeSize();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodeSize1() {
        Node node = new Node();
        node.childNodeSize();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodeSize2() {
        Node node = new Node();
        node.childNodeSize();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodesAsArray0() {
        Node node = new Node();
        node.childNodesAsArray();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodesAsArray1() {
        Node node = new Node();
        node.childNodesAsArray();
        assertTrue(node.equals(node));
    }
    @Test
    public void testchildNodesAsArray2() {
        Node node = new Node();
        node.childNodesAsArray();
        assertTrue(node.equals(node));
    }
    @Test
    public void testparent0() {
        Node node = new Node();
        node.parent();
        assertTrue(node.equals(node));
    }
    @Test
    public void testparent1() {
        Node node = new Node();
        node.parent();
        assertTrue(node.equals(node));
    }
    @Test
    public void testparent2() {
        Node node = new Node();
        node.parent();
        assertTrue(node.equals(node));
    }
    @Test
    public void testparentNode0() {
        Node node = new Node();
        node.parentNode();
        assertTrue(node.equals(node));
    }
    @Test
    public void testparentNode1() {
        Node node = new Node();
        node.parentNode();
        assertTrue(node.equals(node));
    }
    @Test
    public void testparentNode2() {
        Node node = new Node();
        node.parentNode();
        assertTrue(node.equals(node));
    }
    @Test
    public void testroot0() {
        Node node = new Node();
        node.root();
        assertTrue(node.equals(node));
    }
    @Test
    public void testroot1() {
        Node node = new Node();
        node.root();
        assertTrue(node.equals(node));
    }
    @Test
    public void testroot2() {
        Node node = new Node();
        node.root();
        assertTrue(node.equals(node));
    }
    @Test
    public void testownerDocument0() {
        Node node = new Node();
        node.ownerDocument();
        assertTrue(node.equals(node));
    }
    @Test
    public void testownerDocument1() {
        Node node = new Node();
        node.ownerDocument();
        assertTrue(node.equals(node));
    }
    @Test
    public void testownerDocument2() {
        Node node = new Node();
        node.ownerDocument();
        assertTrue(node.equals(node));
    }
    @Test
    public void testremove0() {
        Node node = new Node();
        node.remove();
        assertTrue(node.equals(node));
    }
    @Test
    public void testremove1() {
        Node node = new Node();
        node.remove();
        assertTrue(node.equals(node));
    }
    @Test
    public void testremove2() {
        Node node = new Node();
        node.remove();
        assertTrue(node.equals(node));
    }
    @Test
    public void testbefore0() {
        Node node = new Node();
        node.before("*{");
        assertTrue(node.equals(node));
    }
    @Test
    public void testbefore1() {
        Node node = new Node();
        node.before("name");
        assertTrue(node.equals(node));
    }
    @Test
    public void testbefore2() {
        Node node = new Node();
        node.before(":gt'");
        assertTrue(node.equals(node));
    }
    @Test
    public void testbefore0() {
        Node node = new Node();
        node.before(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testbefore1() {
        Node node = new Node();
        node.before(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testbefore2() {
        Node node = new Node();
        node.before(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testafter0() {
        Node node = new Node();
        node.after("frameset");
        assertTrue(node.equals(node));
    }
    @Test
    public void testafter1() {
        Node node = new Node();
        node.after(":matchesOwn(");
        assertTrue(node.equals(node));
    }
    @Test
    public void testafter2() {
        Node node = new Node();
        node.after("bgsoune");
        assertTrue(node.equals(node));
    }
    @Test
    public void testafter0() {
        Node node = new Node();
        node.after(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testafter1() {
        Node node = new Node();
        node.after(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testafter2() {
        Node node = new Node();
        node.after(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddSiblingHtml0() {
        Node node = new Node();
        node.addSiblingHtml(0,"~<");
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddSiblingHtml1() {
        Node node = new Node();
        node.addSiblingHtml(55396,":nth-child(");
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddSiblingHtml2() {
        Node node = new Node();
        node.addSiblingHtml(57342,"]]=");
        assertTrue(node.equals(node));
    }
    @Test
    public void testwrap0() {
        Node node = new Node();
        node.wrap("tbodx");
        assertTrue(node.equals(node));
    }
    @Test
    public void testwrap1() {
        Node node = new Node();
        node.wrap("nobr");
        assertTrue(node.equals(node));
    }
    @Test
    public void testwrap2() {
        Node node = new Node();
        node.wrap("hiddeo");
        assertTrue(node.equals(node));
    }
    @Test
    public void testunwrap0() {
        Node node = new Node();
        node.unwrap();
        assertTrue(node.equals(node));
    }
    @Test
    public void testunwrap1() {
        Node node = new Node();
        node.unwrap();
        assertTrue(node.equals(node));
    }
    @Test
    public void testunwrap2() {
        Node node = new Node();
        node.unwrap();
        assertTrue(node.equals(node));
    }
    @Test
    public void testgetDeepChild0() {
        Node node = new Node();
        node.getDeepChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testgetDeepChild1() {
        Node node = new Node();
        node.getDeepChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testgetDeepChild2() {
        Node node = new Node();
        node.getDeepChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testnodelistChanged0() {
        Node node = new Node();
        node.nodelistChanged();
        assertTrue(node.equals(node));
    }
    @Test
    public void testnodelistChanged1() {
        Node node = new Node();
        node.nodelistChanged();
        assertTrue(node.equals(node));
    }
    @Test
    public void testnodelistChanged2() {
        Node node = new Node();
        node.nodelistChanged();
        assertTrue(node.equals(node));
    }
    @Test
    public void testreplaceWith0() {
        Node node = new Node();
        node.replaceWith(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreplaceWith1() {
        Node node = new Node();
        node.replaceWith(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreplaceWith2() {
        Node node = new Node();
        node.replaceWith(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetParentNode0() {
        Node node = new Node();
        node.setParentNode(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetParentNode1() {
        Node node = new Node();
        node.setParentNode(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetParentNode2() {
        Node node = new Node();
        node.setParentNode(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreplaceChild0() {
        Node node = new Node();
        node.replaceChild(null,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreplaceChild1() {
        Node node = new Node();
        node.replaceChild(null,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreplaceChild2() {
        Node node = new Node();
        node.replaceChild(null,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testremoveChild0() {
        Node node = new Node();
        node.removeChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testremoveChild1() {
        Node node = new Node();
        node.removeChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testremoveChild2() {
        Node node = new Node();
        node.removeChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddChildren0() {
        Node node = new Node();
        node.addChildren(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddChildren1() {
        Node node = new Node();
        node.addChildren(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddChildren2() {
        Node node = new Node();
        node.addChildren(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddChildren0() {
        Node node = new Node();
        node.addChildren(-99,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddChildren1() {
        Node node = new Node();
        node.addChildren(1114211,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testaddChildren2() {
        Node node = new Node();
        node.addChildren(240,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreparentChild0() {
        Node node = new Node();
        node.reparentChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreparentChild1() {
        Node node = new Node();
        node.reparentChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreparentChild2() {
        Node node = new Node();
        node.reparentChild(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreindexChildren0() {
        Node node = new Node();
        node.reindexChildren(239);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreindexChildren1() {
        Node node = new Node();
        node.reindexChildren(192);
        assertTrue(node.equals(node));
    }
    @Test
    public void testreindexChildren2() {
        Node node = new Node();
        node.reindexChildren(4);
        assertTrue(node.equals(node));
    }
    @Test
    public void testsiblingNodes0() {
        Node node = new Node();
        node.siblingNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testsiblingNodes1() {
        Node node = new Node();
        node.siblingNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testsiblingNodes2() {
        Node node = new Node();
        node.siblingNodes();
        assertTrue(node.equals(node));
    }
    @Test
    public void testnextSibling0() {
        Node node = new Node();
        node.nextSibling();
        assertTrue(node.equals(node));
    }
    @Test
    public void testnextSibling1() {
        Node node = new Node();
        node.nextSibling();
        assertTrue(node.equals(node));
    }
    @Test
    public void testnextSibling2() {
        Node node = new Node();
        node.nextSibling();
        assertTrue(node.equals(node));
    }
    @Test
    public void testpreviousSibling0() {
        Node node = new Node();
        node.previousSibling();
        assertTrue(node.equals(node));
    }
    @Test
    public void testpreviousSibling1() {
        Node node = new Node();
        node.previousSibling();
        assertTrue(node.equals(node));
    }
    @Test
    public void testpreviousSibling2() {
        Node node = new Node();
        node.previousSibling();
        assertTrue(node.equals(node));
    }
    @Test
    public void testsiblingIndex0() {
        Node node = new Node();
        node.siblingIndex();
        assertTrue(node.equals(node));
    }
    @Test
    public void testsiblingIndex1() {
        Node node = new Node();
        node.siblingIndex();
        assertTrue(node.equals(node));
    }
    @Test
    public void testsiblingIndex2() {
        Node node = new Node();
        node.siblingIndex();
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetSiblingIndex0() {
        Node node = new Node();
        node.setSiblingIndex(239);
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetSiblingIndex1() {
        Node node = new Node();
        node.setSiblingIndex(101);
        assertTrue(node.equals(node));
    }
    @Test
    public void testsetSiblingIndex2() {
        Node node = new Node();
        node.setSiblingIndex(-90);
        assertTrue(node.equals(node));
    }
    @Test
    public void testtraverse0() {
        Node node = new Node();
        node.traverse(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testtraverse1() {
        Node node = new Node();
        node.traverse(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testtraverse2() {
        Node node = new Node();
        node.traverse(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testfilter0() {
        Node node = new Node();
        node.filter(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testfilter1() {
        Node node = new Node();
        node.filter(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testfilter2() {
        Node node = new Node();
        node.filter(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtml0() {
        Node node = new Node();
        node.outerHtml();
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtml1() {
        Node node = new Node();
        node.outerHtml();
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtml2() {
        Node node = new Node();
        node.outerHtml();
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtml0() {
        Node node = new Node();
        node.outerHtml(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtml1() {
        Node node = new Node();
        node.outerHtml(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtml2() {
        Node node = new Node();
        node.outerHtml(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtmlHead0() {
        Node node = new Node();
        node.outerHtmlHead(null,-99,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtmlHead1() {
        Node node = new Node();
        node.outerHtmlHead(null,224,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtmlHead2() {
        Node node = new Node();
        node.outerHtmlHead(null,-99,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtmlTail0() {
        Node node = new Node();
        node.outerHtmlTail(null,4,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtmlTail1() {
        Node node = new Node();
        node.outerHtmlTail(null,4,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testouterHtmlTail2() {
        Node node = new Node();
        node.outerHtmlTail(null,57343,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhtml0() {
        Node node = new Node();
        node.html(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhtml1() {
        Node node = new Node();
        node.html(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhtml2() {
        Node node = new Node();
        node.html(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testtoString0() {
        Node node = new Node();
        node.toString();
        assertTrue(node.equals(node));
    }
    @Test
    public void testtoString1() {
        Node node = new Node();
        node.toString();
        assertTrue(node.equals(node));
    }
    @Test
    public void testtoString2() {
        Node node = new Node();
        node.toString();
        assertTrue(node.equals(node));
    }
    @Test
    public void testindent0() {
        Node node = new Node();
        node.indent(null,187,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testindent1() {
        Node node = new Node();
        node.indent(null,1114112,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testindent2() {
        Node node = new Node();
        node.indent(null,100,null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testequals0() {
        Node node = new Node();
        node.equals(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testequals1() {
        Node node = new Node();
        node.equals(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testequals2() {
        Node node = new Node();
        node.equals(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasSameValue0() {
        Node node = new Node();
        node.hasSameValue(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasSameValue1() {
        Node node = new Node();
        node.hasSameValue(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhasSameValue2() {
        Node node = new Node();
        node.hasSameValue(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testclone0() {
        Node node = new Node();
        node.clone();
        assertTrue(node.equals(node));
    }
    @Test
    public void testclone1() {
        Node node = new Node();
        node.clone();
        assertTrue(node.equals(node));
    }
    @Test
    public void testclone2() {
        Node node = new Node();
        node.clone();
        assertTrue(node.equals(node));
    }
    @Test
    public void testshallowClone0() {
        Node node = new Node();
        node.shallowClone();
        assertTrue(node.equals(node));
    }
    @Test
    public void testshallowClone1() {
        Node node = new Node();
        node.shallowClone();
        assertTrue(node.equals(node));
    }
    @Test
    public void testshallowClone2() {
        Node node = new Node();
        node.shallowClone();
        assertTrue(node.equals(node));
    }
    @Test
    public void testdoClone0() {
        Node node = new Node();
        node.doClone(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testdoClone1() {
        Node node = new Node();
        node.doClone(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testdoClone2() {
        Node node = new Node();
        node.doClone(null);
        assertTrue(node.equals(node));
    }
    @Test
    public void testhead0() {
        OuterHtmlVisitor outerhtmlvisitor = new OuterHtmlVisitor();
        outerhtmlvisitor.head(null,57343);
        assertTrue(outerhtmlvisitor.equals(outerhtmlvisitor));
    }
    @Test
    public void testhead1() {
        OuterHtmlVisitor outerhtmlvisitor = new OuterHtmlVisitor();
        outerhtmlvisitor.head(null,-90);
        assertTrue(outerhtmlvisitor.equals(outerhtmlvisitor));
    }
    @Test
    public void testhead2() {
        OuterHtmlVisitor outerhtmlvisitor = new OuterHtmlVisitor();
        outerhtmlvisitor.head(null,9);
        assertTrue(outerhtmlvisitor.equals(outerhtmlvisitor));
    }
    @Test
    public void testtail0() {
        OuterHtmlVisitor outerhtmlvisitor = new OuterHtmlVisitor();
        outerhtmlvisitor.tail(null,102);
        assertTrue(outerhtmlvisitor.equals(outerhtmlvisitor));
    }
    @Test
    public void testtail1() {
        OuterHtmlVisitor outerhtmlvisitor = new OuterHtmlVisitor();
        outerhtmlvisitor.tail(null,57342);
        assertTrue(outerhtmlvisitor.equals(outerhtmlvisitor));
    }
    @Test
    public void testtail2() {
        OuterHtmlVisitor outerhtmlvisitor = new OuterHtmlVisitor();
        outerhtmlvisitor.tail(null,224);
        assertTrue(outerhtmlvisitor.equals(outerhtmlvisitor));
    }
    @Test
    public void testisBooleanAttribute0() {
        BooleanAttribute booleanattribute = new BooleanAttribute();
        booleanattribute.isBooleanAttribute();
        assertTrue(booleanattribute.equals(booleanattribute));
    }
    @Test
    public void testisBooleanAttribute1() {
        BooleanAttribute booleanattribute = new BooleanAttribute();
        booleanattribute.isBooleanAttribute();
        assertTrue(booleanattribute.equals(booleanattribute));
    }
    @Test
    public void testisBooleanAttribute2() {
        BooleanAttribute booleanattribute = new BooleanAttribute();
        booleanattribute.isBooleanAttribute();
        assertTrue(booleanattribute.equals(booleanattribute));
    }
    @Test
    public void testhasAttributes0() {
        LeafNode leafnode = new LeafNode();
        leafnode.hasAttributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testhasAttributes1() {
        LeafNode leafnode = new LeafNode();
        leafnode.hasAttributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testhasAttributes2() {
        LeafNode leafnode = new LeafNode();
        leafnode.hasAttributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattributes0() {
        LeafNode leafnode = new LeafNode();
        leafnode.attributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattributes1() {
        LeafNode leafnode = new LeafNode();
        leafnode.attributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattributes2() {
        LeafNode leafnode = new LeafNode();
        leafnode.attributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testensureAttributes0() {
        LeafNode leafnode = new LeafNode();
        leafnode.ensureAttributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testensureAttributes1() {
        LeafNode leafnode = new LeafNode();
        leafnode.ensureAttributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testensureAttributes2() {
        LeafNode leafnode = new LeafNode();
        leafnode.ensureAttributes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testcoreValue0() {
        LeafNode leafnode = new LeafNode();
        leafnode.coreValue();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testcoreValue1() {
        LeafNode leafnode = new LeafNode();
        leafnode.coreValue();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testcoreValue2() {
        LeafNode leafnode = new LeafNode();
        leafnode.coreValue();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testcoreValue0() {
        LeafNode leafnode = new LeafNode();
        leafnode.coreValue(":nth-last-child)");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testcoreValue1() {
        LeafNode leafnode = new LeafNode();
        leafnode.coreValue(":nth-child)");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testcoreValue2() {
        LeafNode leafnode = new LeafNode();
        leafnode.coreValue("bgsounc");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattr0() {
        LeafNode leafnode = new LeafNode();
        leafnode.attr(":has'");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattr1() {
        LeafNode leafnode = new LeafNode();
        leafnode.attr("frameset");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattr2() {
        LeafNode leafnode = new LeafNode();
        leafnode.attr(":containsOwn)");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattr0() {
        LeafNode leafnode = new LeafNode();
        leafnode.attr("isindex",":first-chile");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattr1() {
        LeafNode leafnode = new LeafNode();
        leafnode.attr("ruby","optiom");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testattr2() {
        LeafNode leafnode = new LeafNode();
        leafnode.attr("script","xmp");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testhasAttr0() {
        LeafNode leafnode = new LeafNode();
        leafnode.hasAttr("li");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testhasAttr1() {
        LeafNode leafnode = new LeafNode();
        leafnode.hasAttr("td");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testhasAttr2() {
        LeafNode leafnode = new LeafNode();
        leafnode.hasAttr(":lt)");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testremoveAttr0() {
        LeafNode leafnode = new LeafNode();
        leafnode.removeAttr(":containsData'");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testremoveAttr1() {
        LeafNode leafnode = new LeafNode();
        leafnode.removeAttr("[CDATA\");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testremoveAttr2() {
        LeafNode leafnode = new LeafNode();
        leafnode.removeAttr("basf");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testabsUrl0() {
        LeafNode leafnode = new LeafNode();
        leafnode.absUrl("text/");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testabsUrl1() {
        LeafNode leafnode = new LeafNode();
        leafnode.absUrl("httq");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testabsUrl2() {
        LeafNode leafnode = new LeafNode();
        leafnode.absUrl("actiom");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testbaseUri0() {
        LeafNode leafnode = new LeafNode();
        leafnode.baseUri();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testbaseUri1() {
        LeafNode leafnode = new LeafNode();
        leafnode.baseUri();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testbaseUri2() {
        LeafNode leafnode = new LeafNode();
        leafnode.baseUri();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testdoSetBaseUri0() {
        LeafNode leafnode = new LeafNode();
        leafnode.doSetBaseUri("http:0");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testdoSetBaseUri1() {
        LeafNode leafnode = new LeafNode();
        leafnode.doSetBaseUri(":last-chile");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testdoSetBaseUri2() {
        LeafNode leafnode = new LeafNode();
        leafnode.doSetBaseUri("[");
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testchildNodeSize0() {
        LeafNode leafnode = new LeafNode();
        leafnode.childNodeSize();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testchildNodeSize1() {
        LeafNode leafnode = new LeafNode();
        leafnode.childNodeSize();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testchildNodeSize2() {
        LeafNode leafnode = new LeafNode();
        leafnode.childNodeSize();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testensureChildNodes0() {
        LeafNode leafnode = new LeafNode();
        leafnode.ensureChildNodes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testensureChildNodes1() {
        LeafNode leafnode = new LeafNode();
        leafnode.ensureChildNodes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testensureChildNodes2() {
        LeafNode leafnode = new LeafNode();
        leafnode.ensureChildNodes();
        assertTrue(leafnode.equals(leafnode));
    }
    @Test
    public void testcreateShell0() {
        Document document = new Document();
        document.createShell("httpt");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateShell1() {
        Document document = new Document();
        document.createShell("noembec");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateShell2() {
        Document document = new Document();
        document.createShell("hiddem");
        assertTrue(document.equals(document));
    }
    @Test
    public void testlocation0() {
        Document document = new Document();
        document.location();
        assertTrue(document.equals(document));
    }
    @Test
    public void testlocation1() {
        Document document = new Document();
        document.location();
        assertTrue(document.equals(document));
    }
    @Test
    public void testlocation2() {
        Document document = new Document();
        document.location();
        assertTrue(document.equals(document));
    }
    @Test
    public void testhead0() {
        Document document = new Document();
        document.head();
        assertTrue(document.equals(document));
    }
    @Test
    public void testhead1() {
        Document document = new Document();
        document.head();
        assertTrue(document.equals(document));
    }
    @Test
    public void testhead2() {
        Document document = new Document();
        document.head();
        assertTrue(document.equals(document));
    }
    @Test
    public void testbody0() {
        Document document = new Document();
        document.body();
        assertTrue(document.equals(document));
    }
    @Test
    public void testbody1() {
        Document document = new Document();
        document.body();
        assertTrue(document.equals(document));
    }
    @Test
    public void testbody2() {
        Document document = new Document();
        document.body();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle0() {
        Document document = new Document();
        document.title();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle1() {
        Document document = new Document();
        document.title();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle2() {
        Document document = new Document();
        document.title();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle0() {
        Document document = new Document();
        document.title("hr");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle1() {
        Document document = new Document();
        document.title("actiom");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle2() {
        Document document = new Document();
        document.title(":not)");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateElement0() {
        Document document = new Document();
        document.createElement("noscripu");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateElement1() {
        Document document = new Document();
        document.createElement("frameseu");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateElement2() {
        Document document = new Document();
        document.createElement(":has(");
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormalise0() {
        Document document = new Document();
        document.normalise();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormalise1() {
        Document document = new Document();
        document.normalise();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormalise2() {
        Document document = new Document();
        document.normalise();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseTextNodes0() {
        Document document = new Document();
        document.normaliseTextNodes(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseTextNodes1() {
        Document document = new Document();
        document.normaliseTextNodes(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseTextNodes2() {
        Document document = new Document();
        document.normaliseTextNodes(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseStructure0() {
        Document document = new Document();
        document.normaliseStructure("odc",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseStructure1() {
        Document document = new Document();
        document.normaliseStructure("theac",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseStructure2() {
        Document document = new Document();
        document.normaliseStructure("image",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testfindFirstElementByTagName0() {
        Document document = new Document();
        document.findFirstElementByTagName("]]?",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testfindFirstElementByTagName1() {
        Document document = new Document();
        document.findFirstElementByTagName("thead",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testfindFirstElementByTagName2() {
        Document document = new Document();
        document.findFirstElementByTagName("templatd",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testouterHtml0() {
        Document document = new Document();
        document.outerHtml();
        assertTrue(document.equals(document));
    }
    @Test
    public void testouterHtml1() {
        Document document = new Document();
        document.outerHtml();
        assertTrue(document.equals(document));
    }
    @Test
    public void testouterHtml2() {
        Document document = new Document();
        document.outerHtml();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtext0() {
        Document document = new Document();
        document.text("span");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtext1() {
        Document document = new Document();
        document.text("htmm");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtext2() {
        Document document = new Document();
        document.text(":last-child");
        assertTrue(document.equals(document));
    }
    @Test
    public void testnodeName0() {
        Document document = new Document();
        document.nodeName();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnodeName1() {
        Document document = new Document();
        document.nodeName();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnodeName2() {
        Document document = new Document();
        document.nodeName();
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset0() {
        Document document = new Document();
        document.charset(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset1() {
        Document document = new Document();
        document.charset(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset2() {
        Document document = new Document();
        document.charset(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset0() {
        Document document = new Document();
        document.charset();
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset1() {
        Document document = new Document();
        document.charset();
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset2() {
        Document document = new Document();
        document.charset();
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement0() {
        Document document = new Document();
        document.updateMetaCharsetElement(true);
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement1() {
        Document document = new Document();
        document.updateMetaCharsetElement(true);
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement2() {
        Document document = new Document();
        document.updateMetaCharsetElement(true);
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement0() {
        Document document = new Document();
        document.updateMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement1() {
        Document document = new Document();
        document.updateMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement2() {
        Document document = new Document();
        document.updateMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testclone0() {
        Document document = new Document();
        document.clone();
        assertTrue(document.equals(document));
    }
    @Test
    public void testclone1() {
        Document document = new Document();
        document.clone();
        assertTrue(document.equals(document));
    }
    @Test
    public void testclone2() {
        Document document = new Document();
        document.clone();
        assertTrue(document.equals(document));
    }
    @Test
    public void testensureMetaCharsetElement0() {
        Document document = new Document();
        document.ensureMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testensureMetaCharsetElement1() {
        Document document = new Document();
        document.ensureMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testensureMetaCharsetElement2() {
        Document document = new Document();
        document.ensureMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testescapeMode0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset("xmm");
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset("heac");
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset("US-ASCIJ");
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprepareEncoder0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prepareEncoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprepareEncoder1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prepareEncoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprepareEncoder2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prepareEncoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testencoder0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.encoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testencoder1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.encoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testencoder2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.encoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount(100);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount(1);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount(1114211);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testclone0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.clone();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testclone1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.clone();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testclone2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.clone();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutputSettings0() {
        Document document = new Document();
        document.outputSettings();
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings1() {
        Document document = new Document();
        document.outputSettings();
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings2() {
        Document document = new Document();
        document.outputSettings();
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings0() {
        Document document = new Document();
        document.outputSettings(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings1() {
        Document document = new Document();
        document.outputSettings(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings2() {
        Document document = new Document();
        document.outputSettings(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode0() {
        Document document = new Document();
        document.quirksMode();
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode1() {
        Document document = new Document();
        document.quirksMode();
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode2() {
        Document document = new Document();
        document.quirksMode();
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode0() {
        Document document = new Document();
        document.quirksMode(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode1() {
        Document document = new Document();
        document.quirksMode(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode2() {
        Document document = new Document();
        document.quirksMode(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser0() {
        Document document = new Document();
        document.parser();
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser1() {
        Document document = new Document();
        document.parser();
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser2() {
        Document document = new Document();
        document.parser();
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser0() {
        Document document = new Document();
        document.parser(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser1() {
        Document document = new Document();
        document.parser(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser2() {
        Document document = new Document();
        document.parser(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnodeName0() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.nodeName();
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testnodeName1() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.nodeName();
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testnodeName2() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.nodeName();
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testtext0() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.text();
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testtext1() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.text();
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testtext2() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.text();
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testouterHtmlHead0() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.outerHtmlHead(null,101,null);
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testouterHtmlHead1() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.outerHtmlHead(null,102,null);
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testouterHtmlHead2() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.outerHtmlHead(null,400,null);
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testouterHtmlTail0() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.outerHtmlTail(null,224,null);
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testouterHtmlTail1() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.outerHtmlTail(null,191,null);
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testouterHtmlTail2() {
        CDataNode cdatanode = new CDataNode();
        cdatanode.outerHtmlTail(null,224,null);
        assertTrue(cdatanode.equals(cdatanode));
    }
    @Test
    public void testcreateShell0() {
        Document document = new Document();
        document.createShell(":last-child");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateShell1() {
        Document document = new Document();
        document.createShell("checkee");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateShell2() {
        Document document = new Document();
        document.createShell(":eq(");
        assertTrue(document.equals(document));
    }
    @Test
    public void testlocation0() {
        Document document = new Document();
        document.location();
        assertTrue(document.equals(document));
    }
    @Test
    public void testlocation1() {
        Document document = new Document();
        document.location();
        assertTrue(document.equals(document));
    }
    @Test
    public void testlocation2() {
        Document document = new Document();
        document.location();
        assertTrue(document.equals(document));
    }
    @Test
    public void testhead0() {
        Document document = new Document();
        document.head();
        assertTrue(document.equals(document));
    }
    @Test
    public void testhead1() {
        Document document = new Document();
        document.head();
        assertTrue(document.equals(document));
    }
    @Test
    public void testhead2() {
        Document document = new Document();
        document.head();
        assertTrue(document.equals(document));
    }
    @Test
    public void testbody0() {
        Document document = new Document();
        document.body();
        assertTrue(document.equals(document));
    }
    @Test
    public void testbody1() {
        Document document = new Document();
        document.body();
        assertTrue(document.equals(document));
    }
    @Test
    public void testbody2() {
        Document document = new Document();
        document.body();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle0() {
        Document document = new Document();
        document.title();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle1() {
        Document document = new Document();
        document.title();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle2() {
        Document document = new Document();
        document.title();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle0() {
        Document document = new Document();
        document.title("checkbow");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle1() {
        Document document = new Document();
        document.title("li");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtitle2() {
        Document document = new Document();
        document.title("US-ASCIH");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateElement0() {
        Document document = new Document();
        document.createElement("tg");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateElement1() {
        Document document = new Document();
        document.createElement("heae");
        assertTrue(document.equals(document));
    }
    @Test
    public void testcreateElement2() {
        Document document = new Document();
        document.createElement("tr");
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormalise0() {
        Document document = new Document();
        document.normalise();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormalise1() {
        Document document = new Document();
        document.normalise();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormalise2() {
        Document document = new Document();
        document.normalise();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseTextNodes0() {
        Document document = new Document();
        document.normaliseTextNodes(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseTextNodes1() {
        Document document = new Document();
        document.normaliseTextNodes(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseTextNodes2() {
        Document document = new Document();
        document.normaliseTextNodes(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseStructure0() {
        Document document = new Document();
        document.normaliseStructure("buttoo",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseStructure1() {
        Document document = new Document();
        document.normaliseStructure("bgsound",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testnormaliseStructure2() {
        Document document = new Document();
        document.normaliseStructure("sarcasl",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testfindFirstElementByTagName0() {
        Document document = new Document();
        document.findFirstElementByTagName("gziq",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testfindFirstElementByTagName1() {
        Document document = new Document();
        document.findFirstElementByTagName("scrips",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testfindFirstElementByTagName2() {
        Document document = new Document();
        document.findFirstElementByTagName("bodx",null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testouterHtml0() {
        Document document = new Document();
        document.outerHtml();
        assertTrue(document.equals(document));
    }
    @Test
    public void testouterHtml1() {
        Document document = new Document();
        document.outerHtml();
        assertTrue(document.equals(document));
    }
    @Test
    public void testouterHtml2() {
        Document document = new Document();
        document.outerHtml();
        assertTrue(document.equals(document));
    }
    @Test
    public void testtext0() {
        Document document = new Document();
        document.text("bgsounc");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtext1() {
        Document document = new Document();
        document.text(":matches'");
        assertTrue(document.equals(document));
    }
    @Test
    public void testtext2() {
        Document document = new Document();
        document.text("#");
        assertTrue(document.equals(document));
    }
    @Test
    public void testnodeName0() {
        Document document = new Document();
        document.nodeName();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnodeName1() {
        Document document = new Document();
        document.nodeName();
        assertTrue(document.equals(document));
    }
    @Test
    public void testnodeName2() {
        Document document = new Document();
        document.nodeName();
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset0() {
        Document document = new Document();
        document.charset(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset1() {
        Document document = new Document();
        document.charset(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset2() {
        Document document = new Document();
        document.charset(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset0() {
        Document document = new Document();
        document.charset();
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset1() {
        Document document = new Document();
        document.charset();
        assertTrue(document.equals(document));
    }
    @Test
    public void testcharset2() {
        Document document = new Document();
        document.charset();
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement0() {
        Document document = new Document();
        document.updateMetaCharsetElement(true);
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement1() {
        Document document = new Document();
        document.updateMetaCharsetElement(true);
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement2() {
        Document document = new Document();
        document.updateMetaCharsetElement(true);
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement0() {
        Document document = new Document();
        document.updateMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement1() {
        Document document = new Document();
        document.updateMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testupdateMetaCharsetElement2() {
        Document document = new Document();
        document.updateMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testclone0() {
        Document document = new Document();
        document.clone();
        assertTrue(document.equals(document));
    }
    @Test
    public void testclone1() {
        Document document = new Document();
        document.clone();
        assertTrue(document.equals(document));
    }
    @Test
    public void testclone2() {
        Document document = new Document();
        document.clone();
        assertTrue(document.equals(document));
    }
    @Test
    public void testensureMetaCharsetElement0() {
        Document document = new Document();
        document.ensureMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testensureMetaCharsetElement1() {
        Document document = new Document();
        document.ensureMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testensureMetaCharsetElement2() {
        Document document = new Document();
        document.ensureMetaCharsetElement();
        assertTrue(document.equals(document));
    }
    @Test
    public void testescapeMode0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testescapeMode2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.escapeMode(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset("rubz");
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset("isindex");
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testcharset2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.charset("abs:");
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprepareEncoder0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prepareEncoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprepareEncoder1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prepareEncoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprepareEncoder2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prepareEncoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testencoder0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.encoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testencoder1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.encoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testencoder2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.encoder();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testsyntax2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.syntax(null);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testprettyPrint2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.prettyPrint(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutline2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.outline(true);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount(57343);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount(400);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testindentAmount2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.indentAmount(240);
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testclone0() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.clone();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testclone1() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.clone();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testclone2() {
        OutputSettings outputsettings = new OutputSettings();
        outputsettings.clone();
        assertTrue(outputsettings.equals(outputsettings));
    }
    @Test
    public void testoutputSettings0() {
        Document document = new Document();
        document.outputSettings();
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings1() {
        Document document = new Document();
        document.outputSettings();
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings2() {
        Document document = new Document();
        document.outputSettings();
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings0() {
        Document document = new Document();
        document.outputSettings(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings1() {
        Document document = new Document();
        document.outputSettings(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testoutputSettings2() {
        Document document = new Document();
        document.outputSettings(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode0() {
        Document document = new Document();
        document.quirksMode();
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode1() {
        Document document = new Document();
        document.quirksMode();
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode2() {
        Document document = new Document();
        document.quirksMode();
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode0() {
        Document document = new Document();
        document.quirksMode(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode1() {
        Document document = new Document();
        document.quirksMode(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testquirksMode2() {
        Document document = new Document();
        document.quirksMode(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser0() {
        Document document = new Document();
        document.parser();
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser1() {
        Document document = new Document();
        document.parser();
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser2() {
        Document document = new Document();
        document.parser();
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser0() {
        Document document = new Document();
        document.parser(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser1() {
        Document document = new Document();
        document.parser(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testparser2() {
        Document document = new Document();
        document.parser(null);
        assertTrue(document.equals(document));
    }
    @Test
    public void testcodepointForName0() {
        Entities entities = new Entities();
        entities.codepointForName("hree");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcodepointForName1() {
        Entities entities = new Entities();
        entities.codepointForName("span");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcodepointForName2() {
        Entities entities = new Entities();
        entities.codepointForName(":alk");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testnameForCodepoint0() {
        Entities entities = new Entities();
        entities.nameForCodepoint(100);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testnameForCodepoint1() {
        Entities entities = new Entities();
        entities.nameForCodepoint(100);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testnameForCodepoint2() {
        Entities entities = new Entities();
        entities.nameForCodepoint(55297);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testsize0() {
        Entities entities = new Entities();
        entities.size();
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testsize1() {
        Entities entities = new Entities();
        entities.size();
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testsize2() {
        Entities entities = new Entities();
        entities.size();
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testisNamedEntity0() {
        Entities entities = new Entities();
        entities.isNamedEntity("keygem");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testisNamedEntity1() {
        Entities entities = new Entities();
        entities.isNamedEntity("inpuu");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testisNamedEntity2() {
        Entities entities = new Entities();
        entities.isNamedEntity("radip");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testisBaseNamedEntity0() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":contains)");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testisBaseNamedEntity1() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity("[a-zA-Z_:][-a-zA-Z0-9_:.])");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testisBaseNamedEntity2() {
        Entities entities = new Entities();
        entities.isBaseNamedEntity(":has'");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testgetCharacterByName0() {
        Entities entities = new Entities();
        entities.getCharacterByName("http-equiu");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testgetCharacterByName1() {
        Entities entities = new Entities();
        entities.getCharacterByName("captioo");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testgetCharacterByName2() {
        Entities entities = new Entities();
        entities.getCharacterByName("[CDATA[");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testgetByName0() {
        Entities entities = new Entities();
        entities.getByName("[CDATAZ");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testgetByName1() {
        Entities entities = new Entities();
        entities.getByName("styld");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testgetByName2() {
        Entities entities = new Entities();
        entities.getByName("buttoo");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcodepointsForName0() {
        Entities entities = new Entities();
        entities.codepointsForName("*>",[I@1068e947);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcodepointsForName1() {
        Entities entities = new Entities();
        entities.codepointsForName("iframe",[I@7dc222ae);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcodepointsForName2() {
        Entities entities = new Entities();
        entities.codepointsForName(":containsData(",[I@aecb35a);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape0() {
        Entities entities = new Entities();
        entities.escape("US-ASCIJ",null);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape1() {
        Entities entities = new Entities();
        entities.escape("bodx",null);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape2() {
        Entities entities = new Entities();
        entities.escape("nobq",null);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape0() {
        Entities entities = new Entities();
        entities.escape("*|");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape1() {
        Entities entities = new Entities();
        entities.escape("title");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape2() {
        Entities entities = new Entities();
        entities.escape(":nth-child'");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape0() {
        Entities entities = new Entities();
        entities.escape(null,"disablee",null,true,true,true);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape1() {
        Entities entities = new Entities();
        entities.escape(null,"inpus",null,true,true,true);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testescape2() {
        Entities entities = new Entities();
        entities.escape(null,"Set-Cookif",null,true,true,true);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testappendEncoded0() {
        Entities entities = new Entities();
        entities.appendEncoded(null,null,57243);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testappendEncoded1() {
        Entities entities = new Entities();
        entities.appendEncoded(null,null,-100);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testappendEncoded2() {
        Entities entities = new Entities();
        entities.appendEncoded(null,null,-1);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testunescape0() {
        Entities entities = new Entities();
        entities.unescape("title");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testunescape1() {
        Entities entities = new Entities();
        entities.unescape("charseu");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testunescape2() {
        Entities entities = new Entities();
        entities.unescape("bs");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testunescape0() {
        Entities entities = new Entities();
        entities.unescape("?",true);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testunescape1() {
        Entities entities = new Entities();
        entities.unescape("noembee",true);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testunescape2() {
        Entities entities = new Entities();
        entities.unescape("link",true);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcanEncode0() {
        Entities entities = new Entities();
        entities.canEncode(null,0,null);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcanEncode1() {
        Entities entities = new Entities();
        entities.canEncode(null,*,null);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testcanEncode2() {
        Entities entities = new Entities();
        entities.canEncode(null,!,null);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testbyName0() {
        Entities entities = new Entities();
        entities.byName("abs:");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testbyName1() {
        Entities entities = new Entities();
        entities.byName("http:/");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testbyName2() {
        Entities entities = new Entities();
        entities.byName("head");
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testload0() {
        Entities entities = new Entities();
        entities.load(null,"tfoos",-90);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testload1() {
        Entities entities = new Entities();
        entities.load(null,"hs",55296);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testload2() {
        Entities entities = new Entities();
        entities.load(null,":has)",240);
        assertTrue(entities.equals(entities));
    }
    @Test
    public void testnodeName0() {
        DataNode datanode = new DataNode();
        datanode.nodeName();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testnodeName1() {
        DataNode datanode = new DataNode();
        datanode.nodeName();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testnodeName2() {
        DataNode datanode = new DataNode();
        datanode.nodeName();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testgetWholeData0() {
        DataNode datanode = new DataNode();
        datanode.getWholeData();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testgetWholeData1() {
        DataNode datanode = new DataNode();
        datanode.getWholeData();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testgetWholeData2() {
        DataNode datanode = new DataNode();
        datanode.getWholeData();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testsetWholeData0() {
        DataNode datanode = new DataNode();
        datanode.setWholeData(":first-of-type");
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testsetWholeData1() {
        DataNode datanode = new DataNode();
        datanode.setWholeData("boundarz");
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testsetWholeData2() {
        DataNode datanode = new DataNode();
        datanode.setWholeData("colgrouq");
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testouterHtmlHead0() {
        DataNode datanode = new DataNode();
        datanode.outerHtmlHead(null,-99,null);
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testouterHtmlHead1() {
        DataNode datanode = new DataNode();
        datanode.outerHtmlHead(null,2,null);
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testouterHtmlHead2() {
        DataNode datanode = new DataNode();
        datanode.outerHtmlHead(null,55297,null);
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testouterHtmlTail0() {
        DataNode datanode = new DataNode();
        datanode.outerHtmlTail(null,0,null);
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testouterHtmlTail1() {
        DataNode datanode = new DataNode();
        datanode.outerHtmlTail(null,-99,null);
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testouterHtmlTail2() {
        DataNode datanode = new DataNode();
        datanode.outerHtmlTail(null,199,null);
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testtoString0() {
        DataNode datanode = new DataNode();
        datanode.toString();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testtoString1() {
        DataNode datanode = new DataNode();
        datanode.toString();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testtoString2() {
        DataNode datanode = new DataNode();
        datanode.toString();
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testcreateFromEncoded0() {
        DataNode datanode = new DataNode();
        datanode.createFromEncoded(":matchesOwn'","abs;");
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testcreateFromEncoded1() {
        DataNode datanode = new DataNode();
        datanode.createFromEncoded(":contains'","^");
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testcreateFromEncoded2() {
        DataNode datanode = new DataNode();
        datanode.createFromEncoded("ode",":first-chile");
        assertTrue(datanode.equals(datanode));
    }
    @Test
    public void testnodeName0() {
        Comment comment = new Comment();
        comment.nodeName();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testnodeName1() {
        Comment comment = new Comment();
        comment.nodeName();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testnodeName2() {
        Comment comment = new Comment();
        comment.nodeName();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testgetData0() {
        Comment comment = new Comment();
        comment.getData();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testgetData1() {
        Comment comment = new Comment();
        comment.getData();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testgetData2() {
        Comment comment = new Comment();
        comment.getData();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testouterHtmlHead0() {
        Comment comment = new Comment();
        comment.outerHtmlHead(null,500,null);
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testouterHtmlHead1() {
        Comment comment = new Comment();
        comment.outerHtmlHead(null,3,null);
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testouterHtmlHead2() {
        Comment comment = new Comment();
        comment.outerHtmlHead(null,102,null);
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testouterHtmlTail0() {
        Comment comment = new Comment();
        comment.outerHtmlTail(null,100,null);
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testouterHtmlTail1() {
        Comment comment = new Comment();
        comment.outerHtmlTail(null,55396,null);
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testouterHtmlTail2() {
        Comment comment = new Comment();
        comment.outerHtmlTail(null,187,null);
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testtoString0() {
        Comment comment = new Comment();
        comment.toString();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testtoString1() {
        Comment comment = new Comment();
        comment.toString();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testtoString2() {
        Comment comment = new Comment();
        comment.toString();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testisXmlDeclaration0() {
        Comment comment = new Comment();
        comment.isXmlDeclaration();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testisXmlDeclaration1() {
        Comment comment = new Comment();
        comment.isXmlDeclaration();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testisXmlDeclaration2() {
        Comment comment = new Comment();
        comment.isXmlDeclaration();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testasXmlDeclaration0() {
        Comment comment = new Comment();
        comment.asXmlDeclaration();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testasXmlDeclaration1() {
        Comment comment = new Comment();
        comment.asXmlDeclaration();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testasXmlDeclaration2() {
        Comment comment = new Comment();
        comment.asXmlDeclaration();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testoutputSettings0() {
        NodeUtils nodeutils = new NodeUtils();
        nodeutils.outputSettings(null);
        assertTrue(nodeutils.equals(nodeutils));
    }
    @Test
    public void testoutputSettings1() {
        NodeUtils nodeutils = new NodeUtils();
        nodeutils.outputSettings(null);
        assertTrue(nodeutils.equals(nodeutils));
    }
    @Test
    public void testoutputSettings2() {
        NodeUtils nodeutils = new NodeUtils();
        nodeutils.outputSettings(null);
        assertTrue(nodeutils.equals(nodeutils));
    }
    @Test
    public void testparser0() {
        NodeUtils nodeutils = new NodeUtils();
        nodeutils.parser(null);
        assertTrue(nodeutils.equals(nodeutils));
    }
    @Test
    public void testparser1() {
        NodeUtils nodeutils = new NodeUtils();
        nodeutils.parser(null);
        assertTrue(nodeutils.equals(nodeutils));
    }
    @Test
    public void testparser2() {
        NodeUtils nodeutils = new NodeUtils();
        nodeutils.parser(null);
        assertTrue(nodeutils.equals(nodeutils));
    }
    @Test
    public void testnodeName0() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.nodeName();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testnodeName1() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.nodeName();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testnodeName2() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.nodeName();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testname0() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.name();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testname1() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.name();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testname2() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.name();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testgetWholeDeclaration0() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.getWholeDeclaration();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testgetWholeDeclaration1() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.getWholeDeclaration();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testgetWholeDeclaration2() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.getWholeDeclaration();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testgetWholeDeclaration0() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.getWholeDeclaration(null,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testgetWholeDeclaration1() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.getWholeDeclaration(null,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testgetWholeDeclaration2() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.getWholeDeclaration(null,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testouterHtmlHead0() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.outerHtmlHead(null,191,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testouterHtmlHead1() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.outerHtmlHead(null,4,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testouterHtmlHead2() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.outerHtmlHead(null,2,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testouterHtmlTail0() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.outerHtmlTail(null,57243,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testouterHtmlTail1() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.outerHtmlTail(null,240,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testouterHtmlTail2() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.outerHtmlTail(null,2,null);
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testtoString0() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.toString();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testtoString1() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.toString();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testtoString2() {
        XmlDeclaration xmldeclaration = new XmlDeclaration();
        xmldeclaration.toString();
        assertTrue(xmldeclaration.equals(xmldeclaration));
    }
    @Test
    public void testelements0() {
        FormElement formelement = new FormElement();
        formelement.elements();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testelements1() {
        FormElement formelement = new FormElement();
        formelement.elements();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testelements2() {
        FormElement formelement = new FormElement();
        formelement.elements();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testaddElement0() {
        FormElement formelement = new FormElement();
        formelement.addElement(null);
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testaddElement1() {
        FormElement formelement = new FormElement();
        formelement.addElement(null);
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testaddElement2() {
        FormElement formelement = new FormElement();
        formelement.addElement(null);
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testremoveChild0() {
        FormElement formelement = new FormElement();
        formelement.removeChild(null);
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testremoveChild1() {
        FormElement formelement = new FormElement();
        formelement.removeChild(null);
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testremoveChild2() {
        FormElement formelement = new FormElement();
        formelement.removeChild(null);
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testsubmit0() {
        FormElement formelement = new FormElement();
        formelement.submit();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testsubmit1() {
        FormElement formelement = new FormElement();
        formelement.submit();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testsubmit2() {
        FormElement formelement = new FormElement();
        formelement.submit();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testformData0() {
        FormElement formelement = new FormElement();
        formelement.formData();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testformData1() {
        FormElement formelement = new FormElement();
        formelement.formData();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testformData2() {
        FormElement formelement = new FormElement();
        formelement.formData();
        assertTrue(formelement.equals(formelement));
    }
    @Test
    public void testsetPubSysKey0() {
        DocumentType documenttype = new DocumentType();
        documenttype.setPubSysKey("~=");
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testsetPubSysKey1() {
        DocumentType documenttype = new DocumentType();
        documenttype.setPubSysKey("h6");
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testsetPubSysKey2() {
        DocumentType documenttype = new DocumentType();
        documenttype.setPubSysKey("basefonu");
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testnodeName0() {
        DocumentType documenttype = new DocumentType();
        documenttype.nodeName();
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testnodeName1() {
        DocumentType documenttype = new DocumentType();
        documenttype.nodeName();
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testnodeName2() {
        DocumentType documenttype = new DocumentType();
        documenttype.nodeName();
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testouterHtmlHead0() {
        DocumentType documenttype = new DocumentType();
        documenttype.outerHtmlHead(null,100,null);
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testouterHtmlHead1() {
        DocumentType documenttype = new DocumentType();
        documenttype.outerHtmlHead(null,400,null);
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testouterHtmlHead2() {
        DocumentType documenttype = new DocumentType();
        documenttype.outerHtmlHead(null,1,null);
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testouterHtmlTail0() {
        DocumentType documenttype = new DocumentType();
        documenttype.outerHtmlTail(null,400,null);
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testouterHtmlTail1() {
        DocumentType documenttype = new DocumentType();
        documenttype.outerHtmlTail(null,1114112,null);
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testouterHtmlTail2() {
        DocumentType documenttype = new DocumentType();
        documenttype.outerHtmlTail(null,240,null);
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testhas0() {
        DocumentType documenttype = new DocumentType();
        documenttype.has("image");
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testhas1() {
        DocumentType documenttype = new DocumentType();
        documenttype.has("xmq");
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testhas2() {
        DocumentType documenttype = new DocumentType();
        documenttype.has("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        assertTrue(documenttype.equals(documenttype));
    }
    @Test
    public void testgetKey0() {
        Attribute attribute = new Attribute();
        attribute.getKey();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testgetKey1() {
        Attribute attribute = new Attribute();
        attribute.getKey();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testgetKey2() {
        Attribute attribute = new Attribute();
        attribute.getKey();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testsetKey0() {
        Attribute attribute = new Attribute();
        attribute.setKey("type");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testsetKey1() {
        Attribute attribute = new Attribute();
        attribute.setKey("forl");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testsetKey2() {
        Attribute attribute = new Attribute();
        attribute.setKey("https");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testgetValue0() {
        Attribute attribute = new Attribute();
        attribute.getValue();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testgetValue1() {
        Attribute attribute = new Attribute();
        attribute.getValue();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testgetValue2() {
        Attribute attribute = new Attribute();
        attribute.getValue();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testsetValue0() {
        Attribute attribute = new Attribute();
        attribute.setValue("thead");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testsetValue1() {
        Attribute attribute = new Attribute();
        attribute.setValue("checkee");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testsetValue2() {
        Attribute attribute = new Attribute();
        attribute.setValue("radio");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml0() {
        Attribute attribute = new Attribute();
        attribute.html();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml1() {
        Attribute attribute = new Attribute();
        attribute.html();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml2() {
        Attribute attribute = new Attribute();
        attribute.html();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml0() {
        Attribute attribute = new Attribute();
        attribute.html(":only-child","odc",null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml1() {
        Attribute attribute = new Attribute();
        attribute.html("Set-Cookif","plaintext",null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml2() {
        Attribute attribute = new Attribute();
        attribute.html("nobq","ruby",null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml0() {
        Attribute attribute = new Attribute();
        attribute.html(null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml1() {
        Attribute attribute = new Attribute();
        attribute.html(null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhtml2() {
        Attribute attribute = new Attribute();
        attribute.html(null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testtoString0() {
        Attribute attribute = new Attribute();
        attribute.toString();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testtoString1() {
        Attribute attribute = new Attribute();
        attribute.toString();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testtoString2() {
        Attribute attribute = new Attribute();
        attribute.toString();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testcreateFromEncoded0() {
        Attribute attribute = new Attribute();
        attribute.createFromEncoded("frameset","sarcasn");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testcreateFromEncoded1() {
        Attribute attribute = new Attribute();
        attribute.createFromEncoded("stylf","~>");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testcreateFromEncoded2() {
        Attribute attribute = new Attribute();
        attribute.createFromEncoded("linj","bodx");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisDataAttribute0() {
        Attribute attribute = new Attribute();
        attribute.isDataAttribute();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisDataAttribute1() {
        Attribute attribute = new Attribute();
        attribute.isDataAttribute();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisDataAttribute2() {
        Attribute attribute = new Attribute();
        attribute.isDataAttribute();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisDataAttribute0() {
        Attribute attribute = new Attribute();
        attribute.isDataAttribute("bq");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisDataAttribute1() {
        Attribute attribute = new Attribute();
        attribute.isDataAttribute("tc");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisDataAttribute2() {
        Attribute attribute = new Attribute();
        attribute.isDataAttribute("$>");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testshouldCollapseAttribute0() {
        Attribute attribute = new Attribute();
        attribute.shouldCollapseAttribute(null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testshouldCollapseAttribute1() {
        Attribute attribute = new Attribute();
        attribute.shouldCollapseAttribute(null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testshouldCollapseAttribute2() {
        Attribute attribute = new Attribute();
        attribute.shouldCollapseAttribute(null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testshouldCollapseAttribute0() {
        Attribute attribute = new Attribute();
        attribute.shouldCollapseAttribute("^","frameset",null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testshouldCollapseAttribute1() {
        Attribute attribute = new Attribute();
        attribute.shouldCollapseAttribute("DOCTYPD",":containsData)",null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testshouldCollapseAttribute2() {
        Attribute attribute = new Attribute();
        attribute.shouldCollapseAttribute(":nth-last-child)","actiom",null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisBooleanAttribute0() {
        Attribute attribute = new Attribute();
        attribute.isBooleanAttribute();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisBooleanAttribute1() {
        Attribute attribute = new Attribute();
        attribute.isBooleanAttribute();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisBooleanAttribute2() {
        Attribute attribute = new Attribute();
        attribute.isBooleanAttribute();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisBooleanAttribute0() {
        Attribute attribute = new Attribute();
        attribute.isBooleanAttribute("<.");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisBooleanAttribute1() {
        Attribute attribute = new Attribute();
        attribute.isBooleanAttribute("hree");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testisBooleanAttribute2() {
        Attribute attribute = new Attribute();
        attribute.isBooleanAttribute("cok");
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testequals0() {
        Attribute attribute = new Attribute();
        attribute.equals(null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testequals1() {
        Attribute attribute = new Attribute();
        attribute.equals(null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testequals2() {
        Attribute attribute = new Attribute();
        attribute.equals(null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhashCode0() {
        Attribute attribute = new Attribute();
        attribute.hashCode();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhashCode1() {
        Attribute attribute = new Attribute();
        attribute.hashCode();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testhashCode2() {
        Attribute attribute = new Attribute();
        attribute.hashCode();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testclone0() {
        Attribute attribute = new Attribute();
        attribute.clone();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testclone1() {
        Attribute attribute = new Attribute();
        attribute.clone();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testclone2() {
        Attribute attribute = new Attribute();
        attribute.clone();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testnodeName0() {
        TextNode textnode = new TextNode();
        textnode.nodeName();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testnodeName1() {
        TextNode textnode = new TextNode();
        textnode.nodeName();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testnodeName2() {
        TextNode textnode = new TextNode();
        textnode.nodeName();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtext0() {
        TextNode textnode = new TextNode();
        textnode.text();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtext1() {
        TextNode textnode = new TextNode();
        textnode.text();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtext2() {
        TextNode textnode = new TextNode();
        textnode.text();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtext0() {
        TextNode textnode = new TextNode();
        textnode.text("ode");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtext1() {
        TextNode textnode = new TextNode();
        textnode.text("meta");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtext2() {
        TextNode textnode = new TextNode();
        textnode.text("metb");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testgetWholeText0() {
        TextNode textnode = new TextNode();
        textnode.getWholeText();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testgetWholeText1() {
        TextNode textnode = new TextNode();
        textnode.getWholeText();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testgetWholeText2() {
        TextNode textnode = new TextNode();
        textnode.getWholeText();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testisBlank0() {
        TextNode textnode = new TextNode();
        textnode.isBlank();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testisBlank1() {
        TextNode textnode = new TextNode();
        textnode.isBlank();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testisBlank2() {
        TextNode textnode = new TextNode();
        textnode.isBlank();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testsplitText0() {
        TextNode textnode = new TextNode();
        textnode.splitText(57343);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testsplitText1() {
        TextNode textnode = new TextNode();
        textnode.splitText(192);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testsplitText2() {
        TextNode textnode = new TextNode();
        textnode.splitText(57342);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testouterHtmlHead0() {
        TextNode textnode = new TextNode();
        textnode.outerHtmlHead(null,-90,null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testouterHtmlHead1() {
        TextNode textnode = new TextNode();
        textnode.outerHtmlHead(null,240,null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testouterHtmlHead2() {
        TextNode textnode = new TextNode();
        textnode.outerHtmlHead(null,55296,null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testouterHtmlTail0() {
        TextNode textnode = new TextNode();
        textnode.outerHtmlTail(null,55396,null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testouterHtmlTail1() {
        TextNode textnode = new TextNode();
        textnode.outerHtmlTail(null,55396,null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testouterHtmlTail2() {
        TextNode textnode = new TextNode();
        textnode.outerHtmlTail(null,55296,null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtoString0() {
        TextNode textnode = new TextNode();
        textnode.toString();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtoString1() {
        TextNode textnode = new TextNode();
        textnode.toString();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testtoString2() {
        TextNode textnode = new TextNode();
        textnode.toString();
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testcreateFromEncoded0() {
        TextNode textnode = new TextNode();
        textnode.createFromEncoded(":lt(",":emptz");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testcreateFromEncoded1() {
        TextNode textnode = new TextNode();
        textnode.createFromEncoded("^","base");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testcreateFromEncoded2() {
        TextNode textnode = new TextNode();
        textnode.createFromEncoded("hreg","!=");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testcreateFromEncoded0() {
        TextNode textnode = new TextNode();
        textnode.createFromEncoded("UTF,");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testcreateFromEncoded1() {
        TextNode textnode = new TextNode();
        textnode.createFromEncoded("optgroup");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testcreateFromEncoded2() {
        TextNode textnode = new TextNode();
        textnode.createFromEncoded("h6");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testnormaliseWhitespace0() {
        TextNode textnode = new TextNode();
        textnode.normaliseWhitespace("*=");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testnormaliseWhitespace1() {
        TextNode textnode = new TextNode();
        textnode.normaliseWhitespace("httpr");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testnormaliseWhitespace2() {
        TextNode textnode = new TextNode();
        textnode.normaliseWhitespace(":eq)");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void teststripLeadingWhitespace0() {
        TextNode textnode = new TextNode();
        textnode.stripLeadingWhitespace(":nth-child)");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void teststripLeadingWhitespace1() {
        TextNode textnode = new TextNode();
        textnode.stripLeadingWhitespace("heac");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void teststripLeadingWhitespace2() {
        TextNode textnode = new TextNode();
        textnode.stripLeadingWhitespace("$>");
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testlastCharIsWhitespace0() {
        TextNode textnode = new TextNode();
        textnode.lastCharIsWhitespace(null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testlastCharIsWhitespace1() {
        TextNode textnode = new TextNode();
        textnode.lastCharIsWhitespace(null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testlastCharIsWhitespace2() {
        TextNode textnode = new TextNode();
        textnode.lastCharIsWhitespace(null);
        assertTrue(textnode.equals(textnode));
    }
    @Test
    public void testouterHtmlHead0() {
        PseudoTextElement pseudotextelement = new PseudoTextElement();
        pseudotextelement.outerHtmlHead(null,1114112,null);
        assertTrue(pseudotextelement.equals(pseudotextelement));
    }
    @Test
    public void testouterHtmlHead1() {
        PseudoTextElement pseudotextelement = new PseudoTextElement();
        pseudotextelement.outerHtmlHead(null,57342,null);
        assertTrue(pseudotextelement.equals(pseudotextelement));
    }
    @Test
    public void testouterHtmlHead2() {
        PseudoTextElement pseudotextelement = new PseudoTextElement();
        pseudotextelement.outerHtmlHead(null,1114211,null);
        assertTrue(pseudotextelement.equals(pseudotextelement));
    }
    @Test
    public void testouterHtmlTail0() {
        PseudoTextElement pseudotextelement = new PseudoTextElement();
        pseudotextelement.outerHtmlTail(null,401,null);
        assertTrue(pseudotextelement.equals(pseudotextelement));
    }
    @Test
    public void testouterHtmlTail1() {
        PseudoTextElement pseudotextelement = new PseudoTextElement();
        pseudotextelement.outerHtmlTail(null,55396,null);
        assertTrue(pseudotextelement.equals(pseudotextelement));
    }
    @Test
    public void testouterHtmlTail2() {
        PseudoTextElement pseudotextelement = new PseudoTextElement();
        pseudotextelement.outerHtmlTail(null,187,null);
        assertTrue(pseudotextelement.equals(pseudotextelement));
    }
    @Test
    public void testioException0() {
        UncheckedIOException uncheckedioexception = new UncheckedIOException();
        uncheckedioexception.ioException();
        assertTrue(uncheckedioexception.equals(uncheckedioexception));
    }
    @Test
    public void testioException1() {
        UncheckedIOException uncheckedioexception = new UncheckedIOException();
        uncheckedioexception.ioException();
        assertTrue(uncheckedioexception.equals(uncheckedioexception));
    }
    @Test
    public void testioException2() {
        UncheckedIOException uncheckedioexception = new UncheckedIOException();
        uncheckedioexception.ioException();
        assertTrue(uncheckedioexception.equals(uncheckedioexception));
    }
    @Test
    public void testjoin0() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(null,"linj");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin1() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(null,":lt(");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin2() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(null,"]]?");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin0() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(null,"xmq");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin1() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(null,"href");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin2() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(null,"p");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin0() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml"},"optgrouq");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin1() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy"},":first-chilc");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testjoin2() {
        StringUtil stringutil = new StringUtil();
        stringutil.join(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html",":first-child","Set-Cookie","htmk",":first-chilc","Set-Cookid","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","[CDATAZ","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","[CDATA\","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","imf","boundarx","imh","link","linl","linj","basefont","basefonu","head","heae","nobs","nobr","nobq",":empty"},"keygen");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testpadding0() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(400);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testpadding1() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(-99);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testpadding2() {
        StringUtil stringutil = new StringUtil();
        stringutil.padding(1114211);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisBlank0() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank(":alk");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisBlank1() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("noscripu");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisBlank2() {
        StringUtil stringutil = new StringUtil();
        stringutil.isBlank("#roos");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisNumeric0() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("theae");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisNumeric1() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("[CDATA[");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisNumeric2() {
        StringUtil stringutil = new StringUtil();
        stringutil.isNumeric("#text");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisWhitespace0() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(0);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisWhitespace1() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(500);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisWhitespace2() {
        StringUtil stringutil = new StringUtil();
        stringutil.isWhitespace(400);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisActuallyWhitespace0() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(103);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisActuallyWhitespace1() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(55396);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisActuallyWhitespace2() {
        StringUtil stringutil = new StringUtil();
        stringutil.isActuallyWhitespace(1114112);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisInvisibleChar0() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(-1);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisInvisibleChar1() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(57342);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testisInvisibleChar2() {
        StringUtil stringutil = new StringUtil();
        stringutil.isInvisibleChar(-1);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testnormaliseWhitespace0() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("metb");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testnormaliseWhitespace1() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("https");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testnormaliseWhitespace2() {
        StringUtil stringutil = new StringUtil();
        stringutil.normaliseWhitespace("input");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testappendNormalisedWhitespace0() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(null,"name",true);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testappendNormalisedWhitespace1() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(null,"]]?",true);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testappendNormalisedWhitespace2() {
        StringUtil stringutil = new StringUtil();
        stringutil.appendNormalisedWhitespace(null,"captioo",true);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testin0() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("metb","h1");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testin1() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("checkee","$=");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testin2() {
        StringUtil stringutil = new StringUtil();
        stringutil.in("textare`","$=");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testinSorted0() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("forl",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc"});
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testinSorted1() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("textarea",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p"});
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testinSorted2() {
        StringUtil stringutil = new StringUtil();
        stringutil.inSorted("hs",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'"});
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testresolve0() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(null,":alm");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testresolve1() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(null,"httpt");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testresolve2() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(null,"text.");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testresolve0() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(":nth-last-of-type(","rubx");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testresolve1() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve("iframd",":root");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testresolve2() {
        StringUtil stringutil = new StringUtil();
        stringutil.resolve(":nth-of-type(","svg");
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testborrowBuilder0() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testborrowBuilder1() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testborrowBuilder2() {
        StringUtil stringutil = new StringUtil();
        stringutil.borrowBuilder();
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testreleaseBuilder0() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder(null);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testreleaseBuilder1() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder(null);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testreleaseBuilder2() {
        StringUtil stringutil = new StringUtil();
        stringutil.releaseBuilder(null);
        assertTrue(stringutil.equals(stringutil));
    }
    @Test
    public void testlowerCase0() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("noframet");
        assertTrue(normalizer.equals(normalizer));
    }
    @Test
    public void testlowerCase1() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("h0");
        assertTrue(normalizer.equals(normalizer));
    }
    @Test
    public void testlowerCase2() {
        Normalizer normalizer = new Normalizer();
        normalizer.lowerCase("US-ASCIH");
        assertTrue(normalizer.equals(normalizer));
    }
    @Test
    public void testnormalize0() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("ruby");
        assertTrue(normalizer.equals(normalizer));
    }
    @Test
    public void testnormalize1() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize(":nth-child'");
        assertTrue(normalizer.equals(normalizer));
    }
    @Test
    public void testnormalize2() {
        Normalizer normalizer = new Normalizer();
        normalizer.normalize("li");
        assertTrue(normalizer.equals(normalizer));
    }
    @Test
    public void testwrap0() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(null,9,102);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testwrap1() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(null,57342,9);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testwrap2() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.wrap(null,240,57343);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testread0() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.read(new Object[]{},-99,100);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testread1() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.read(new Object[]{},192,100);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testread2() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.read(new Object[]{},-90,9);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testreadToByteBuffer0() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(-99);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testreadToByteBuffer1() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(400);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testreadToByteBuffer2() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.readToByteBuffer(100);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testreset0() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.reset();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testreset1() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.reset();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testreset2() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.reset();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testtimeout0() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(-100,-100);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testtimeout1() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(-100,1);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testtimeout2() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.timeout(-1,0);
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testexpired0() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.expired();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testexpired1() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.expired();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testexpired2() {
        ConstrainableInputStream constrainableinputstream = new ConstrainableInputStream();
        constrainableinputstream.expired();
        assertTrue(constrainableinputstream.equals(constrainableinputstream));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("imf",":emptx");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("*","sarcasl");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("charseu",":matchTexu");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("gzio","thead",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(":nth-last-child)","cok",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("hreg","br",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(":matches)");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse("hiddeo");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(":matches)");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testconnect0() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect(":emptx");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testconnect1() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("optioo");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testconnect2() {
        Jsoup jsoup = new Jsoup();
        jsoup.connect("math");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"inpus","h3");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"abs9",":has(");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"matg","ts");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,":gt)");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"link");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,":alm");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"^=","lh");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,":only-of-typf","UTF.");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"tablf","bs");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,":matchesOwn(",":matchesOwn(",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"typd",":last-of-typf",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,"theae","href",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparseBodyFragment0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("basf","h2");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparseBodyFragment1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("tg","*>");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparseBodyFragment2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("noscrips",":contains)");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparseBodyFragment0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("tfoot");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparseBodyFragment1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("noframer");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparseBodyFragment2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parseBodyFragment("boundary");
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse0() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,-90);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse1() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,500);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparse2() {
        Jsoup jsoup = new Jsoup();
        jsoup.parse(null,-100);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean0() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("inpus",":alk",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean1() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(";","bodx",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean2() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("optgroup","htmk",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean0() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("httpr",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean1() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("DOCTYPF",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean2() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean(":matchesOwn(",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean0() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("svh","tabld",null,null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean1() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("isindew","~>",null,null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testclean2() {
        Jsoup jsoup = new Jsoup();
        jsoup.clean("#texu","[a-zA-Z_:][-a-zA-Z0-9_:.]*",null,null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testisValid0() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid(":matches)",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testisValid1() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("hr",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testisValid2() {
        Jsoup jsoup = new Jsoup();
        jsoup.isValid("US-ASCIH",null);
        assertTrue(jsoup.equals(jsoup));
    }
    @Test
    public void testparseInput0() {
        Parser parser = new Parser();
        parser.parseInput(":matchTexu",":alk");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseInput1() {
        Parser parser = new Parser();
        parser.parseInput("noscrips","style");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseInput2() {
        Parser parser = new Parser();
        parser.parseInput(":contains(","UTF.");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseInput0() {
        Parser parser = new Parser();
        parser.parseInput(null,"metb");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseInput1() {
        Parser parser = new Parser();
        parser.parseInput(null,"noframet");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseInput2() {
        Parser parser = new Parser();
        parser.parseInput(null,"imagf");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragmentInput0() {
        Parser parser = new Parser();
        parser.parseFragmentInput("h0",null,"textarea");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragmentInput1() {
        Parser parser = new Parser();
        parser.parseFragmentInput("hiddem",null,"dt");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragmentInput2() {
        Parser parser = new Parser();
        parser.parseFragmentInput("type",null,"basefonu");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testgetTreeBuilder0() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testgetTreeBuilder1() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testgetTreeBuilder2() {
        Parser parser = new Parser();
        parser.getTreeBuilder();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsetTreeBuilder0() {
        Parser parser = new Parser();
        parser.setTreeBuilder(null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsetTreeBuilder1() {
        Parser parser = new Parser();
        parser.setTreeBuilder(null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsetTreeBuilder2() {
        Parser parser = new Parser();
        parser.setTreeBuilder(null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testisTrackErrors0() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testisTrackErrors1() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testisTrackErrors2() {
        Parser parser = new Parser();
        parser.isTrackErrors();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsetTrackErrors0() {
        Parser parser = new Parser();
        parser.setTrackErrors(1114211);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsetTrackErrors1() {
        Parser parser = new Parser();
        parser.setTrackErrors(1114211);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsetTrackErrors2() {
        Parser parser = new Parser();
        parser.setTrackErrors(4);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testgetErrors0() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testgetErrors1() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testgetErrors2() {
        Parser parser = new Parser();
        parser.getErrors();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsettings0() {
        Parser parser = new Parser();
        parser.settings(null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsettings1() {
        Parser parser = new Parser();
        parser.settings(null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsettings2() {
        Parser parser = new Parser();
        parser.settings(null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsettings0() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsettings1() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testsettings2() {
        Parser parser = new Parser();
        parser.settings();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparse0() {
        Parser parser = new Parser();
        parser.parse(":last-chile","*");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparse1() {
        Parser parser = new Parser();
        parser.parse(":last-of-type","basf");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparse2() {
        Parser parser = new Parser();
        parser.parse("optgroup","hidden");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragment0() {
        Parser parser = new Parser();
        parser.parseFragment("*}",null,"noembed");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragment1() {
        Parser parser = new Parser();
        parser.parseFragment("html",null,"[");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragment2() {
        Parser parser = new Parser();
        parser.parseFragment("action",null,"xmm");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragment0() {
        Parser parser = new Parser();
        parser.parseFragment(":has'",null,"input",null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragment1() {
        Parser parser = new Parser();
        parser.parseFragment(":matchesOwn(",null,"boundary",null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseFragment2() {
        Parser parser = new Parser();
        parser.parseFragment("tg",null,"span",null);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseXmlFragment0() {
        Parser parser = new Parser();
        parser.parseXmlFragment("http:.","optgroup");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseXmlFragment1() {
        Parser parser = new Parser();
        parser.parseXmlFragment("xml",":not'");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseXmlFragment2() {
        Parser parser = new Parser();
        parser.parseXmlFragment("typd","$<");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseBodyFragment0() {
        Parser parser = new Parser();
        parser.parseBodyFragment("Set-Cookif","[CDATAZ");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseBodyFragment1() {
        Parser parser = new Parser();
        parser.parseBodyFragment("abs9","namd");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseBodyFragment2() {
        Parser parser = new Parser();
        parser.parseBodyFragment("*|","h6");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testunescapeEntities0() {
        Parser parser = new Parser();
        parser.unescapeEntities("radip",true);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testunescapeEntities1() {
        Parser parser = new Parser();
        parser.unescapeEntities(":all",true);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testunescapeEntities2() {
        Parser parser = new Parser();
        parser.unescapeEntities("nobs",true);
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseBodyFragmentRelaxed0() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("captioo",":matchText");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseBodyFragmentRelaxed1() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("Set-Cookid","DOCTYPD");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testparseBodyFragmentRelaxed2() {
        Parser parser = new Parser();
        parser.parseBodyFragmentRelaxed("scrips",":gt)");
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testhtmlParser0() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testhtmlParser1() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testhtmlParser2() {
        Parser parser = new Parser();
        parser.htmlParser();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testxmlParser0() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testxmlParser1() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testxmlParser2() {
        Parser parser = new Parser();
        parser.xmlParser();
        assertTrue(parser.equals(parser));
    }
    @Test
    public void testgetName0() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testgetName1() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testgetName2() {
        Tag tag = new Tag();
        tag.getName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnormalName0() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnormalName1() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnormalName2() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testvalueOf0() {
        Tag tag = new Tag();
        tag.valueOf("image",null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testvalueOf1() {
        Tag tag = new Tag();
        tag.valueOf("[a-zA-Z_:][-a-zA-Z0-9_:.]+",null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testvalueOf2() {
        Tag tag = new Tag();
        tag.valueOf("theae",null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testvalueOf0() {
        Tag tag = new Tag();
        tag.valueOf(":containsData'");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testvalueOf1() {
        Tag tag = new Tag();
        tag.valueOf("]]>");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testvalueOf2() {
        Tag tag = new Tag();
        tag.valueOf("http-equiu");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisBlock0() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisBlock1() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisBlock2() {
        Tag tag = new Tag();
        tag.isBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testformatAsBlock0() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testformatAsBlock1() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testformatAsBlock2() {
        Tag tag = new Tag();
        tag.formatAsBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testcanContainBlock0() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testcanContainBlock1() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testcanContainBlock2() {
        Tag tag = new Tag();
        tag.canContainBlock();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisInline0() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisInline1() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisInline2() {
        Tag tag = new Tag();
        tag.isInline();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisData0() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisData1() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisData2() {
        Tag tag = new Tag();
        tag.isData();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisEmpty0() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisEmpty1() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisEmpty2() {
        Tag tag = new Tag();
        tag.isEmpty();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisSelfClosing0() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisSelfClosing1() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisSelfClosing2() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisKnownTag0() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisKnownTag1() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisKnownTag2() {
        Tag tag = new Tag();
        tag.isKnownTag();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisKnownTag0() {
        Tag tag = new Tag();
        tag.isKnownTag(":first-of-type");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisKnownTag1() {
        Tag tag = new Tag();
        tag.isKnownTag("httq");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisKnownTag2() {
        Tag tag = new Tag();
        tag.isKnownTag("https");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testpreserveWhitespace0() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testpreserveWhitespace1() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testpreserveWhitespace2() {
        Tag tag = new Tag();
        tag.preserveWhitespace();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisFormListed0() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisFormListed1() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisFormListed2() {
        Tag tag = new Tag();
        tag.isFormListed();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisFormSubmittable0() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisFormSubmittable1() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisFormSubmittable2() {
        Tag tag = new Tag();
        tag.isFormSubmittable();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testsetSelfClosing0() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testsetSelfClosing1() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testsetSelfClosing2() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testequals0() {
        Tag tag = new Tag();
        tag.equals(null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testequals1() {
        Tag tag = new Tag();
        tag.equals(null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testequals2() {
        Tag tag = new Tag();
        tag.equals(null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testhashCode0() {
        Tag tag = new Tag();
        tag.hashCode();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testhashCode1() {
        Tag tag = new Tag();
        tag.hashCode();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testhashCode2() {
        Tag tag = new Tag();
        tag.hashCode();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testtoString0() {
        Tag tag = new Tag();
        tag.toString();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testtoString1() {
        Tag tag = new Tag();
        tag.toString();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testtoString2() {
        Tag tag = new Tag();
        tag.toString();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testregister0() {
        Tag tag = new Tag();
        tag.register(null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testregister1() {
        Tag tag = new Tag();
        tag.register(null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testregister2() {
        Tag tag = new Tag();
        tag.register(null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testread0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.read();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testread1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.read();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testread2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.read();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit("#roou");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit("scripu");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit("optioo");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z,[,\,]});
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z,[,\,],^,_,`,a,b,e,f,g,o});
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(new Character[]{ ,,,	,
,});
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit([I@5fcd892a);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit([I@8b87145);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit([I@6483f5ae);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(f);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(0);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemit2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emit(z);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testgetState0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.getState();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testgetState1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.getState();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testgetState2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.getState();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testtransition0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.transition(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testtransition1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.transition(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testtransition2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.transition(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testadvanceTransition0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.advanceTransition(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testadvanceTransition1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.advanceTransition(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testadvanceTransition2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.advanceTransition(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testconsumeCharacterReference0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.consumeCharacterReference(],true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testconsumeCharacterReference1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.consumeCharacterReference(o,true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testconsumeCharacterReference2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.consumeCharacterReference(!,true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateTagPending0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createTagPending(true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateTagPending1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createTagPending(true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateTagPending2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createTagPending(true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitTagPending0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitTagPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitTagPending1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitTagPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitTagPending2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitTagPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateCommentPending0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createCommentPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateCommentPending1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createCommentPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateCommentPending2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createCommentPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitCommentPending0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitCommentPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitCommentPending1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitCommentPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitCommentPending2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitCommentPending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateDoctypePending0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createDoctypePending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateDoctypePending1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createDoctypePending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateDoctypePending2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createDoctypePending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitDoctypePending0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitDoctypePending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitDoctypePending1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitDoctypePending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testemitDoctypePending2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.emitDoctypePending();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateTempBuffer0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createTempBuffer();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateTempBuffer1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createTempBuffer();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcreateTempBuffer2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.createTempBuffer();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testisAppropriateEndTagToken0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.isAppropriateEndTagToken();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testisAppropriateEndTagToken1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.isAppropriateEndTagToken();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testisAppropriateEndTagToken2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.isAppropriateEndTagToken();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testappropriateEndTagName0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.appropriateEndTagName();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testappropriateEndTagName1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.appropriateEndTagName();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testappropriateEndTagName2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.appropriateEndTagName();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testerror0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.error(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testerror1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.error(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testerror2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.error(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testeofError0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.eofError(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testeofError1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.eofError(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testeofError2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.eofError(null);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcharacterReferenceError0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.characterReferenceError("h5");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcharacterReferenceError1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.characterReferenceError("nobq");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcharacterReferenceError2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.characterReferenceError("de");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testerror0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.error("*");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testerror1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.error("templatd");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testerror2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.error("te");
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcurrentNodeInHtmlNS0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.currentNodeInHtmlNS();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcurrentNodeInHtmlNS1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.currentNodeInHtmlNS();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testcurrentNodeInHtmlNS2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.currentNodeInHtmlNS();
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testunescapeEntities0() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.unescapeEntities(true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testunescapeEntities1() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.unescapeEntities(true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testunescapeEntities2() {
        Tokeniser tokeniser = new Tokeniser();
        tokeniser.unescapeEntities(true);
        assertTrue(tokeniser.equals(tokeniser));
    }
    @Test
    public void testgetErrorMessage0() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testgetErrorMessage1() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testgetErrorMessage2() {
        ParseError parseerror = new ParseError();
        parseerror.getErrorMessage();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testgetPosition0() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testgetPosition1() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testgetPosition2() {
        ParseError parseerror = new ParseError();
        parseerror.getPosition();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testtoString0() {
        ParseError parseerror = new ParseError();
        parseerror.toString();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testtoString1() {
        ParseError parseerror = new ParseError();
        parseerror.toString();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testtoString2() {
        ParseError parseerror = new ParseError();
        parseerror.toString();
        assertTrue(parseerror.equals(parseerror));
    }
    @Test
    public void testcanAddError0() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.canAddError();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testcanAddError1() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.canAddError();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testcanAddError2() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.canAddError();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testgetMaxSize0() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.getMaxSize();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testgetMaxSize1() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.getMaxSize();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testgetMaxSize2() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.getMaxSize();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testnoTracking0() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testnoTracking1() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testnoTracking2() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.noTracking();
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testtracking0() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(55296);
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testtracking1() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(103);
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testtracking2() {
        ParseErrorList parseerrorlist = new ParseErrorList();
        parseerrorlist.tracking(102);
        assertTrue(parseerrorlist.equals(parseerrorlist));
    }
    @Test
    public void testdefaultSettings0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.defaultSettings();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testdefaultSettings1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.defaultSettings();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testdefaultSettings2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.defaultSettings();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testinitialiseParse0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.initialiseParse(null,"cok",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testinitialiseParse1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.initialiseParse(null,"deflate",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testinitialiseParse2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.initialiseParse(null,"lj",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testparse0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.parse(null,"nobq",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testparse1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.parse(null,"iframf",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testparse2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.parse(null,"mati",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testparseFragment0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.parseFragment("boundary",null,"input",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testparseFragment1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.parseFragment("nobs",null,"col",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testparseFragment2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.parseFragment("$=",null,"nobr",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testrunParser0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.runParser();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testrunParser1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.runParser();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testrunParser2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.runParser();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocess0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.process(null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocess1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.process(null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocess2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.process(null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessStartTag0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processStartTag("tq");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessStartTag1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processStartTag("even");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessStartTag2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processStartTag("colgroup");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessStartTag0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processStartTag(":containsOwn'",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessStartTag1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processStartTag("*|",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessStartTag2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processStartTag("li",null);
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessEndTag0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processEndTag(":gt'");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessEndTag1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processEndTag(":roos");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testprocessEndTag2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.processEndTag("title");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testcurrentElement0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.currentElement();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testcurrentElement1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.currentElement();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testcurrentElement2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.currentElement();
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testerror0() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.error("radio");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testerror1() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.error("isindew");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testerror2() {
        TreeBuilder treebuilder = new TreeBuilder();
        treebuilder.error("typd");
        assertTrue(treebuilder.equals(treebuilder));
    }
    @Test
    public void testtokenType0() {
        Token token = new Token();
        token.tokenType();
        assertTrue(token.equals(token));
    }
    @Test
    public void testtokenType1() {
        Token token = new Token();
        token.tokenType();
        assertTrue(token.equals(token));
    }
    @Test
    public void testtokenType2() {
        Token token = new Token();
        token.tokenType();
        assertTrue(token.equals(token));
    }
    @Test
    public void testreset0() {
        Token token = new Token();
        token.reset();
        assertTrue(token.equals(token));
    }
    @Test
    public void testreset1() {
        Token token = new Token();
        token.reset();
        assertTrue(token.equals(token));
    }
    @Test
    public void testreset2() {
        Token token = new Token();
        token.reset();
        assertTrue(token.equals(token));
    }
    @Test
    public void testreset0() {
        Token token = new Token();
        token.reset(null);
        assertTrue(token.equals(token));
    }
    @Test
    public void testreset1() {
        Token token = new Token();
        token.reset(null);
        assertTrue(token.equals(token));
    }
    @Test
    public void testreset2() {
        Token token = new Token();
        token.reset(null);
        assertTrue(token.equals(token));
    }
    @Test
    public void testreset0() {
        Doctype doctype = new Doctype();
        doctype.reset();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testreset1() {
        Doctype doctype = new Doctype();
        doctype.reset();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testreset2() {
        Doctype doctype = new Doctype();
        doctype.reset();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetName0() {
        Doctype doctype = new Doctype();
        doctype.getName();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetName1() {
        Doctype doctype = new Doctype();
        doctype.getName();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetName2() {
        Doctype doctype = new Doctype();
        doctype.getName();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetPubSysKey0() {
        Doctype doctype = new Doctype();
        doctype.getPubSysKey();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetPubSysKey1() {
        Doctype doctype = new Doctype();
        doctype.getPubSysKey();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetPubSysKey2() {
        Doctype doctype = new Doctype();
        doctype.getPubSysKey();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetPublicIdentifier0() {
        Doctype doctype = new Doctype();
        doctype.getPublicIdentifier();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetPublicIdentifier1() {
        Doctype doctype = new Doctype();
        doctype.getPublicIdentifier();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetPublicIdentifier2() {
        Doctype doctype = new Doctype();
        doctype.getPublicIdentifier();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetSystemIdentifier0() {
        Doctype doctype = new Doctype();
        doctype.getSystemIdentifier();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetSystemIdentifier1() {
        Doctype doctype = new Doctype();
        doctype.getSystemIdentifier();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testgetSystemIdentifier2() {
        Doctype doctype = new Doctype();
        doctype.getSystemIdentifier();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testisForceQuirks0() {
        Doctype doctype = new Doctype();
        doctype.isForceQuirks();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testisForceQuirks1() {
        Doctype doctype = new Doctype();
        doctype.isForceQuirks();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testisForceQuirks2() {
        Doctype doctype = new Doctype();
        doctype.isForceQuirks();
        assertTrue(doctype.equals(doctype));
    }
    @Test
    public void testreset0() {
        Tag tag = new Tag();
        tag.reset();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testreset1() {
        Tag tag = new Tag();
        tag.reset();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testreset2() {
        Tag tag = new Tag();
        tag.reset();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnewAttribute0() {
        Tag tag = new Tag();
        tag.newAttribute();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnewAttribute1() {
        Tag tag = new Tag();
        tag.newAttribute();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnewAttribute2() {
        Tag tag = new Tag();
        tag.newAttribute();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testfinaliseTag0() {
        Tag tag = new Tag();
        tag.finaliseTag();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testfinaliseTag1() {
        Tag tag = new Tag();
        tag.finaliseTag();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testfinaliseTag2() {
        Tag tag = new Tag();
        tag.finaliseTag();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testname0() {
        Tag tag = new Tag();
        tag.name();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testname1() {
        Tag tag = new Tag();
        tag.name();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testname2() {
        Tag tag = new Tag();
        tag.name();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnormalName0() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnormalName1() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testnormalName2() {
        Tag tag = new Tag();
        tag.normalName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testname0() {
        Tag tag = new Tag();
        tag.name("[CDATA[");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testname1() {
        Tag tag = new Tag();
        tag.name("https");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testname2() {
        Tag tag = new Tag();
        tag.name("caption");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisSelfClosing0() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisSelfClosing1() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testisSelfClosing2() {
        Tag tag = new Tag();
        tag.isSelfClosing();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testgetAttributes0() {
        Tag tag = new Tag();
        tag.getAttributes();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testgetAttributes1() {
        Tag tag = new Tag();
        tag.getAttributes();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testgetAttributes2() {
        Tag tag = new Tag();
        tag.getAttributes();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendTagName0() {
        Tag tag = new Tag();
        tag.appendTagName("\"\"");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendTagName1() {
        Tag tag = new Tag();
        tag.appendTagName("svf");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendTagName2() {
        Tag tag = new Tag();
        tag.appendTagName(":contains)");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendTagName0() {
        Tag tag = new Tag();
        tag.appendTagName();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendTagName1() {
        Tag tag = new Tag();
        tag.appendTagName(@);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendTagName2() {
        Tag tag = new Tag();
        tag.appendTagName(});
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeName0() {
        Tag tag = new Tag();
        tag.appendAttributeName("htto");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeName1() {
        Tag tag = new Tag();
        tag.appendAttributeName(":lt'");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeName2() {
        Tag tag = new Tag();
        tag.appendAttributeName("colgrouo");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeName0() {
        Tag tag = new Tag();
        tag.appendAttributeName(	);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeName1() {
        Tag tag = new Tag();
        tag.appendAttributeName(z);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeName2() {
        Tag tag = new Tag();
        tag.appendAttributeName(?);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue0() {
        Tag tag = new Tag();
        tag.appendAttributeValue("imh");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue1() {
        Tag tag = new Tag();
        tag.appendAttributeValue("script");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue2() {
        Tag tag = new Tag();
        tag.appendAttributeValue("[a-zA-Z_:][-a-zA-Z0-9_:.])");
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue0() {
        Tag tag = new Tag();
        tag.appendAttributeValue(>);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue1() {
        Tag tag = new Tag();
        tag.appendAttributeValue(z);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue2() {
        Tag tag = new Tag();
        tag.appendAttributeValue(Z);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue0() {
        Tag tag = new Tag();
        tag.appendAttributeValue(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z});
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue1() {
        Tag tag = new Tag();
        tag.appendAttributeValue(new Character[]{ ,,,	,
,,,,,});
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue2() {
        Tag tag = new Tag();
        tag.appendAttributeValue(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z,[,\,],^,_});
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue0() {
        Tag tag = new Tag();
        tag.appendAttributeValue([I@b9afc07);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue1() {
        Tag tag = new Tag();
        tag.appendAttributeValue([I@382db087);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testappendAttributeValue2() {
        Tag tag = new Tag();
        tag.appendAttributeValue([I@73d4cc9e);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testsetEmptyAttributeValue0() {
        Tag tag = new Tag();
        tag.setEmptyAttributeValue();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testsetEmptyAttributeValue1() {
        Tag tag = new Tag();
        tag.setEmptyAttributeValue();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testsetEmptyAttributeValue2() {
        Tag tag = new Tag();
        tag.setEmptyAttributeValue();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testensureAttributeValue0() {
        Tag tag = new Tag();
        tag.ensureAttributeValue();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testensureAttributeValue1() {
        Tag tag = new Tag();
        tag.ensureAttributeValue();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testensureAttributeValue2() {
        Tag tag = new Tag();
        tag.ensureAttributeValue();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testreset0() {
        StartTag starttag = new StartTag();
        starttag.reset();
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testreset1() {
        StartTag starttag = new StartTag();
        starttag.reset();
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testreset2() {
        StartTag starttag = new StartTag();
        starttag.reset();
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testnameAttr0() {
        StartTag starttag = new StartTag();
        starttag.nameAttr("li",null);
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testnameAttr1() {
        StartTag starttag = new StartTag();
        starttag.nameAttr("svh",null);
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testnameAttr2() {
        StartTag starttag = new StartTag();
        starttag.nameAttr("keygen",null);
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testtoString0() {
        StartTag starttag = new StartTag();
        starttag.toString();
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testtoString1() {
        StartTag starttag = new StartTag();
        starttag.toString();
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testtoString2() {
        StartTag starttag = new StartTag();
        starttag.toString();
        assertTrue(starttag.equals(starttag));
    }
    @Test
    public void testtoString0() {
        EndTag endtag = new EndTag();
        endtag.toString();
        assertTrue(endtag.equals(endtag));
    }
    @Test
    public void testtoString1() {
        EndTag endtag = new EndTag();
        endtag.toString();
        assertTrue(endtag.equals(endtag));
    }
    @Test
    public void testtoString2() {
        EndTag endtag = new EndTag();
        endtag.toString();
        assertTrue(endtag.equals(endtag));
    }
    @Test
    public void testreset0() {
        Comment comment = new Comment();
        comment.reset();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testreset1() {
        Comment comment = new Comment();
        comment.reset();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testreset2() {
        Comment comment = new Comment();
        comment.reset();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testgetData0() {
        Comment comment = new Comment();
        comment.getData();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testgetData1() {
        Comment comment = new Comment();
        comment.getData();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testgetData2() {
        Comment comment = new Comment();
        comment.getData();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testtoString0() {
        Comment comment = new Comment();
        comment.toString();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testtoString1() {
        Comment comment = new Comment();
        comment.toString();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testtoString2() {
        Comment comment = new Comment();
        comment.toString();
        assertTrue(comment.equals(comment));
    }
    @Test
    public void testreset0() {
        Character character = new Character();
        character.reset();
        assertTrue(character.equals(character));
    }
    @Test
    public void testreset1() {
        Character character = new Character();
        character.reset();
        assertTrue(character.equals(character));
    }
    @Test
    public void testreset2() {
        Character character = new Character();
        character.reset();
        assertTrue(character.equals(character));
    }
    @Test
    public void testdata0() {
        Character character = new Character();
        character.data("#texu");
        assertTrue(character.equals(character));
    }
    @Test
    public void testdata1() {
        Character character = new Character();
        character.data("theae");
        assertTrue(character.equals(character));
    }
    @Test
    public void testdata2() {
        Character character = new Character();
        character.data("link");
        assertTrue(character.equals(character));
    }
    @Test
    public void testgetData0() {
        Character character = new Character();
        character.getData();
        assertTrue(character.equals(character));
    }
    @Test
    public void testgetData1() {
        Character character = new Character();
        character.getData();
        assertTrue(character.equals(character));
    }
    @Test
    public void testgetData2() {
        Character character = new Character();
        character.getData();
        assertTrue(character.equals(character));
    }
    @Test
    public void testtoString0() {
        Character character = new Character();
        character.toString();
        assertTrue(character.equals(character));
    }
    @Test
    public void testtoString1() {
        Character character = new Character();
        character.toString();
        assertTrue(character.equals(character));
    }
    @Test
    public void testtoString2() {
        Character character = new Character();
        character.toString();
        assertTrue(character.equals(character));
    }
    @Test
    public void testtoString0() {
        CData cdata = new CData();
        cdata.toString();
        assertTrue(cdata.equals(cdata));
    }
    @Test
    public void testtoString1() {
        CData cdata = new CData();
        cdata.toString();
        assertTrue(cdata.equals(cdata));
    }
    @Test
    public void testtoString2() {
        CData cdata = new CData();
        cdata.toString();
        assertTrue(cdata.equals(cdata));
    }
    @Test
    public void testreset0() {
        EOF eof = new EOF();
        eof.reset();
        assertTrue(eof.equals(eof));
    }
    @Test
    public void testreset1() {
        EOF eof = new EOF();
        eof.reset();
        assertTrue(eof.equals(eof));
    }
    @Test
    public void testreset2() {
        EOF eof = new EOF();
        eof.reset();
        assertTrue(eof.equals(eof));
    }
    @Test
    public void testisDoctype0() {
        Token token = new Token();
        token.isDoctype();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisDoctype1() {
        Token token = new Token();
        token.isDoctype();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisDoctype2() {
        Token token = new Token();
        token.isDoctype();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasDoctype0() {
        Token token = new Token();
        token.asDoctype();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasDoctype1() {
        Token token = new Token();
        token.asDoctype();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasDoctype2() {
        Token token = new Token();
        token.asDoctype();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisStartTag0() {
        Token token = new Token();
        token.isStartTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisStartTag1() {
        Token token = new Token();
        token.isStartTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisStartTag2() {
        Token token = new Token();
        token.isStartTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasStartTag0() {
        Token token = new Token();
        token.asStartTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasStartTag1() {
        Token token = new Token();
        token.asStartTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasStartTag2() {
        Token token = new Token();
        token.asStartTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisEndTag0() {
        Token token = new Token();
        token.isEndTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisEndTag1() {
        Token token = new Token();
        token.isEndTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisEndTag2() {
        Token token = new Token();
        token.isEndTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasEndTag0() {
        Token token = new Token();
        token.asEndTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasEndTag1() {
        Token token = new Token();
        token.asEndTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasEndTag2() {
        Token token = new Token();
        token.asEndTag();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisComment0() {
        Token token = new Token();
        token.isComment();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisComment1() {
        Token token = new Token();
        token.isComment();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisComment2() {
        Token token = new Token();
        token.isComment();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasComment0() {
        Token token = new Token();
        token.asComment();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasComment1() {
        Token token = new Token();
        token.asComment();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasComment2() {
        Token token = new Token();
        token.asComment();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisCharacter0() {
        Token token = new Token();
        token.isCharacter();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisCharacter1() {
        Token token = new Token();
        token.isCharacter();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisCharacter2() {
        Token token = new Token();
        token.isCharacter();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisCData0() {
        Token token = new Token();
        token.isCData();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisCData1() {
        Token token = new Token();
        token.isCData();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisCData2() {
        Token token = new Token();
        token.isCData();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasCharacter0() {
        Token token = new Token();
        token.asCharacter();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasCharacter1() {
        Token token = new Token();
        token.asCharacter();
        assertTrue(token.equals(token));
    }
    @Test
    public void testasCharacter2() {
        Token token = new Token();
        token.asCharacter();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisEOF0() {
        Token token = new Token();
        token.isEOF();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisEOF1() {
        Token token = new Token();
        token.isEOF();
        assertTrue(token.equals(token));
    }
    @Test
    public void testisEOF2() {
        Token token = new Token();
        token.isEOF();
        assertTrue(token.equals(token));
    }
    @Test
    public void testbufferUp0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.bufferUp();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testbufferUp1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.bufferUp();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testbufferUp2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.bufferUp();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testpos0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testpos1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testpos2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.pos();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisEmpty0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisEmpty1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisEmpty2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmpty();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisEmptyNoBufferUp0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmptyNoBufferUp();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisEmptyNoBufferUp1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmptyNoBufferUp();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisEmptyNoBufferUp2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isEmptyNoBufferUp();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcurrent0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcurrent1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcurrent2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.current();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsume0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consume();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsume1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consume();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsume2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consume();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testunconsume0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.unconsume();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testunconsume1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.unconsume();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testunconsume2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.unconsume();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testadvance0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testadvance1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testadvance2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.advance();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmark0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.mark();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmark1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.mark();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmark2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.mark();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrewindToMark0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rewindToMark();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrewindToMark1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rewindToMark();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrewindToMark2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rewindToMark();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testnextIndexOf0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.nextIndexOf(	);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testnextIndexOf1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.nextIndexOf();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testnextIndexOf2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.nextIndexOf(>);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testnextIndexOf0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.nextIndexOf(null);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testnextIndexOf1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.nextIndexOf(null);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testnextIndexOf2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.nextIndexOf(null);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTo0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo(-);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTo1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo(b);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTo2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo(();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTo0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo("http:0");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTo1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo("*}");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTo2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTo(":contains(");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToAny0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny());
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToAny1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny(");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToAny2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAny(,);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToAnySorted0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAnySorted(E);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToAnySorted1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAnySorted(o);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToAnySorted2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToAnySorted();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeData0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeData();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeData1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeData();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeData2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeData();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTagName0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTagName();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTagName1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTagName();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeTagName2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeTagName();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToEnd0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToEnd();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToEnd1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToEnd();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeToEnd2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeToEnd();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeLetterSequence0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeLetterSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeLetterSequence1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeLetterSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeLetterSequence2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeLetterSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeLetterThenDigitSequence0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeLetterThenDigitSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeLetterThenDigitSequence1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeLetterThenDigitSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeLetterThenDigitSequence2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeLetterThenDigitSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeHexSequence0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeHexSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeHexSequence1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeHexSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeHexSequence2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeHexSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeDigitSequence0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeDigitSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeDigitSequence1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeDigitSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testconsumeDigitSequence2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.consumeDigitSequence();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatches0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matches(_);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatches1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matches(,);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatches2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matches(~);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatches0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matches(":matchTexu");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatches1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matches("action");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatches2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matches("hidden");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesIgnoreCase0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesIgnoreCase("tfoos");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesIgnoreCase1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesIgnoreCase("disabled");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesIgnoreCase2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesIgnoreCase("h0");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesAny0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesAny(-);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesAny1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesAny(^);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesAny2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesAny();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesAnySorted0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesAnySorted(new Character[]{ ,,,	,
,,,,,, ,!,",#,$});
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesAnySorted1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesAnySorted(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z,[,\,],^,_,`});
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesAnySorted2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesAnySorted(new Character[]{ ,,,	,
,,,,,, ,!,",#});
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesLetter0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesLetter();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesLetter1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesLetter();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesLetter2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesLetter();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesDigit0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesDigit();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesDigit1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesDigit();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchesDigit2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchesDigit();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchConsume0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchConsume(":empty");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchConsume1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchConsume("typf");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchConsume2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchConsume("tfoot");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchConsumeIgnoreCase0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchConsumeIgnoreCase("th");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchConsumeIgnoreCase1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchConsumeIgnoreCase("name");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testmatchConsumeIgnoreCase2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.matchConsumeIgnoreCase("dc");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcontainsIgnoreCase0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.containsIgnoreCase("xml");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcontainsIgnoreCase1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.containsIgnoreCase(":alm");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcontainsIgnoreCase2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.containsIgnoreCase("hs");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisBinary0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isBinary();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisBinary1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isBinary();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testisBinary2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.isBinary();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testtoString0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.toString();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testtoString1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.toString();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testtoString2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.toString();
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcacheString0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.cacheString(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du"},191,100);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcacheString1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.cacheString(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos"},-99,400);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testcacheString2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.cacheString(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html",":first-child","Set-Cookie","htmk",":first-chilc","Set-Cookid","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","[CDATAZ","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","[CDATA\","#roou","#roos","#root"},9,191);
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrangeEquals0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rangeEquals(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/},3,57342,":has'");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrangeEquals1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rangeEquals(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z,[,\,],^,_,`,a,b,e,f,g},-90,57343,"scripu");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrangeEquals2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rangeEquals(new Character[]{ ,,,	,
,,,,,, ,!,",#,$,%,&,',(,),*,+,,,-,.,/,0,1,8,9,:,<,=,>,?,@,A,B,E,F,G,Y,Z,[,\,],^,_,`,a,b,e,f,g,o,q,y,z,{,},~},100,500,"#roou");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrangeEquals0() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rangeEquals(-90,500,"text/");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrangeEquals1() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rangeEquals(187,2,"disablec");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testrangeEquals2() {
        CharacterReader characterreader = new CharacterReader();
        characterreader.rangeEquals(187,199,"namd");
        assertTrue(characterreader.equals(characterreader));
    }
    @Test
    public void testdefaultSettings0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.defaultSettings();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testdefaultSettings1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.defaultSettings();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testdefaultSettings2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.defaultSettings();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinitialiseParse0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.initialiseParse(null,"h3",null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinitialiseParse1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.initialiseParse(null,":eq(",null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinitialiseParse2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.initialiseParse(null,"theae",null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testparseFragment0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.parseFragment(":has(",null,":containsData'",null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testparseFragment1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.parseFragment("US-ASCII",null,"href",null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testparseFragment2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.parseFragment("ruby",null,":nth-child(",null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testprocess0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.process(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testprocess1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.process(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testprocess2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.process(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testprocess0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.process(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testprocess1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.process(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testprocess2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.process(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testtransition0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.transition(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testtransition1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.transition(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testtransition2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.transition(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void teststate0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.state();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void teststate1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.state();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void teststate2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.state();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testmarkInsertionMode0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.markInsertionMode();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testmarkInsertionMode1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.markInsertionMode();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testmarkInsertionMode2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.markInsertionMode();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testoriginalState0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.originalState();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testoriginalState1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.originalState();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testoriginalState2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.originalState();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testframesetOk0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.framesetOk(true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testframesetOk1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.framesetOk(true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testframesetOk2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.framesetOk(true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testframesetOk0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.framesetOk();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testframesetOk1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.framesetOk();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testframesetOk2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.framesetOk();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetDocument0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getDocument();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetDocument1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getDocument();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetDocument2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getDocument();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetBaseUri0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getBaseUri();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetBaseUri1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getBaseUri();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetBaseUri2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getBaseUri();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testmaybeSetBaseUri0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.maybeSetBaseUri(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testmaybeSetBaseUri1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.maybeSetBaseUri(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testmaybeSetBaseUri2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.maybeSetBaseUri(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisFragmentParsing0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isFragmentParsing();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisFragmentParsing1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isFragmentParsing();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisFragmentParsing2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isFragmentParsing();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testerror0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.error(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testerror1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.error(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testerror2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.error(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertStartTag0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertStartTag(":lt(");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertStartTag1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertStartTag(":only-of-typd");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertStartTag2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertStartTag("captioo");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertEmpty0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertEmpty(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertEmpty1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertEmpty(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertEmpty2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertEmpty(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertForm0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertForm(null,true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertForm1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertForm(null,true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertForm2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertForm(null,true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsert2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insert(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertNode0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertNode(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertNode1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertNode(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertNode2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertNode(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpop0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.pop();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpop1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.pop();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpop2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.pop();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpush0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.push(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpush1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.push(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpush2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.push(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetStack0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getStack();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetStack1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getStack();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetStack2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getStack();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testonStack0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.onStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testonStack1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.onStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testonStack2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.onStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisElementInQueue0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isElementInQueue(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisElementInQueue1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isElementInQueue(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisElementInQueue2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isElementInQueue(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetFromStack0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getFromStack(":matchTexu");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetFromStack1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getFromStack("!=");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetFromStack2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getFromStack("[CDATA[");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveFromStack0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeFromStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveFromStack1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeFromStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveFromStack2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeFromStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToClose0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToClose("abs9");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToClose1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToClose("tfoot");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToClose2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToClose("plaintext");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToClose0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToClose("tfoou");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToClose1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToClose("actiom");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToClose2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToClose(":first-chilc");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToBefore0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToBefore("#text");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToBefore1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToBefore("~>");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpopStackToBefore2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.popStackToBefore("xmq");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableContext0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableContext1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableContext2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableBodyContext0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableBodyContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableBodyContext1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableBodyContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableBodyContext2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableBodyContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableRowContext0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableRowContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableRowContext1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableRowContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToTableRowContext2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToTableRowContext();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToContext0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToContext("[a-zA-Z_:][-a-zA-Z0-9_:.])");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToContext1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToContext(":matches(");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearStackToContext2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearStackToContext("template");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testaboveOnStack0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.aboveOnStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testaboveOnStack1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.aboveOnStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testaboveOnStack2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.aboveOnStack(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertOnStackAfter0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertOnStackAfter(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertOnStackAfter1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertOnStackAfter(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertOnStackAfter2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertOnStackAfter(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceOnStack0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceOnStack(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceOnStack1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceOnStack(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceOnStack2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceOnStack(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceInQueue0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceInQueue(null,null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceInQueue1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceInQueue(null,null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceInQueue2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceInQueue(null,null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testresetInsertionMode0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.resetInsertionMode();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testresetInsertionMode1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.resetInsertionMode();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testresetInsertionMode2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.resetInsertionMode();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSpecificScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSpecificScope("optgrouo",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSpecificScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSpecificScope("html",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSpecificScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSpecificScope("image",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSpecificScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSpecificScope(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSpecificScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSpecificScope(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\""},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSpecificScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSpecificScope(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select"},new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$="});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope("httq");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope("li");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope("xmo");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope("button",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope("hq",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html",":first-child","Set-Cookie","htmk",":first-chilc","Set-Cookid","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","[CDATAZ","--","^>","UTF-","noembed","[CDATA[","-.","UTF,"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inScope(":only-of-typf",new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled"});
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinListItemScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inListItemScope("forn");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinListItemScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inListItemScope(":only-of-typf");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinListItemScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inListItemScope("inpus");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinButtonScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inButtonScope("tc");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinButtonScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inButtonScope("textarea");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinButtonScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inButtonScope("disablee");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinTableScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inTableScope("odd");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinTableScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inTableScope("xmk");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinTableScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inTableScope("imagf");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSelectScope0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSelectScope(":emptx");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSelectScope1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSelectScope("noscrips");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinSelectScope2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.inSelectScope("lj");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetHeadElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setHeadElement(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetHeadElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setHeadElement(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetHeadElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setHeadElement(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetHeadElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getHeadElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetHeadElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getHeadElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetHeadElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getHeadElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisFosterInserts0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isFosterInserts();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisFosterInserts1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isFosterInserts();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisFosterInserts2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isFosterInserts();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetFosterInserts0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setFosterInserts(true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetFosterInserts1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setFosterInserts(true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetFosterInserts2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setFosterInserts(true);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetFormElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getFormElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetFormElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getFormElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetFormElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getFormElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetFormElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setFormElement(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetFormElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setFormElement(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testsetFormElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.setFormElement(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testnewPendingTableCharacters0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.newPendingTableCharacters();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testnewPendingTableCharacters1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.newPendingTableCharacters();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testnewPendingTableCharacters2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.newPendingTableCharacters();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetPendingTableCharacters0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getPendingTableCharacters();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetPendingTableCharacters1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getPendingTableCharacters();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetPendingTableCharacters2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getPendingTableCharacters();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgenerateImpliedEndTags0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.generateImpliedEndTags("svf");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgenerateImpliedEndTags1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.generateImpliedEndTags("lj");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgenerateImpliedEndTags2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.generateImpliedEndTags(":first-child");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgenerateImpliedEndTags0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.generateImpliedEndTags();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgenerateImpliedEndTags1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.generateImpliedEndTags();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgenerateImpliedEndTags2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.generateImpliedEndTags();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisSpecial0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isSpecial(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisSpecial1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isSpecial(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisSpecial2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isSpecial(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testlastFormattingElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.lastFormattingElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testlastFormattingElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.lastFormattingElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testlastFormattingElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.lastFormattingElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveLastFormattingElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeLastFormattingElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveLastFormattingElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeLastFormattingElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveLastFormattingElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeLastFormattingElement();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpushActiveFormattingElements0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.pushActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpushActiveFormattingElements1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.pushActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testpushActiveFormattingElements2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.pushActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisSameFormattingElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isSameFormattingElement(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisSameFormattingElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isSameFormattingElement(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisSameFormattingElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isSameFormattingElement(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreconstructFormattingElements0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.reconstructFormattingElements();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreconstructFormattingElements1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.reconstructFormattingElements();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreconstructFormattingElements2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.reconstructFormattingElements();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearFormattingElementsToLastMarker0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearFormattingElementsToLastMarker();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearFormattingElementsToLastMarker1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearFormattingElementsToLastMarker();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testclearFormattingElementsToLastMarker2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.clearFormattingElementsToLastMarker();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveFromActiveFormattingElements0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeFromActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveFromActiveFormattingElements1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeFromActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testremoveFromActiveFormattingElements2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.removeFromActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisInActiveFormattingElements0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isInActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisInActiveFormattingElements1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isInActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisInActiveFormattingElements2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.isInActiveFormattingElements(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetActiveFormattingElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getActiveFormattingElement("\'");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetActiveFormattingElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getActiveFormattingElement("hq");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testgetActiveFormattingElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.getActiveFormattingElement("text/");
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceActiveFormattingElement0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceActiveFormattingElement(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceActiveFormattingElement1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceActiveFormattingElement(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testreplaceActiveFormattingElement2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.replaceActiveFormattingElement(null,null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertMarkerToFormattingElements0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertMarkerToFormattingElements();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertMarkerToFormattingElements1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertMarkerToFormattingElements();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertMarkerToFormattingElements2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertMarkerToFormattingElements();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertInFosterParent0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertInFosterParent(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertInFosterParent1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertInFosterParent(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testinsertInFosterParent2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.insertInFosterParent(null);
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testtoString0() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.toString();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testtoString1() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.toString();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testtoString2() {
        HtmlTreeBuilder htmltreebuilder = new HtmlTreeBuilder();
        htmltreebuilder.toString();
        assertTrue(htmltreebuilder.equals(htmltreebuilder));
    }
    @Test
    public void testisEmpty0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testisEmpty1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testisEmpty2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.isEmpty();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testremainingLength0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainingLength();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testremainingLength1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainingLength();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testremainingLength2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainingLength();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testpeek0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testpeek1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testpeek2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.peek();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testaddFirst0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(});
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testaddFirst1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(E);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testaddFirst2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(.);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testaddFirst0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("US-ASCII");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testaddFirst1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst("met`");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testaddFirst2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.addFirst(":nth-last-of-type'");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatches0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("select");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatches1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches("^");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatches2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matches(":only-of-typf");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesCS0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("</");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesCS1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS("actioo");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesCS2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesCS(":containsOwn'");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesAny0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny("isindew");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesAny1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(":eq)");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesAny2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(":containsOwn(");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesAny0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(B);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesAny1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(o);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesAny2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesAny(*);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesStartTag0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesStartTag1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesStartTag2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesStartTag();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchChomp0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("img");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchChomp1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp(":containsOwn'");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchChomp2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchChomp("*<");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesWhitespace0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesWhitespace1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesWhitespace2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesWord0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesWord1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testmatchesWord2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.matchesWord();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testadvance0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testadvance1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testadvance2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.advance();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsume0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsume1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsume2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsume0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume(":first-chilc");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsume1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("--");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsume2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consume("UTF.");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeTo0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo(":only-of-type");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeTo1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo(":lt(");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeTo2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTo("noscrips");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeToIgnoreCase0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("scripu");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeToIgnoreCase1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeToIgnoreCase2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToIgnoreCase("http:/");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeToAny0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("frameset");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeToAny1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("]]=");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeToAny2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeToAny("form");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompTo0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("$<");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompTo1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo("keygem");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompTo2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompTo(":has'");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompToIgnoreCase0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase(":first-of-typf");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompToIgnoreCase1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase("]]?");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompToIgnoreCase2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompToIgnoreCase(":gt(");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompBalanced0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced(,q);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompBalanced1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced(*,);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testchompBalanced2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.chompBalanced(z,);
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testunescape0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("*|");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testunescape1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("keygeo");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testunescape2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.unescape("sarcasl");
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeWhitespace0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeWhitespace1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeWhitespace2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWhitespace();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeWord0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeWord1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeWord2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeWord();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeTagName0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeTagName1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeTagName2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeTagName();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeElementSelector0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeElementSelector1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeElementSelector2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeElementSelector();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeCssIdentifier0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeCssIdentifier1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeCssIdentifier2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeCssIdentifier();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeAttributeKey0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeAttributeKey1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testconsumeAttributeKey2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.consumeAttributeKey();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testremainder0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testremainder1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testremainder2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.remainder();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testtoString0() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.toString();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testtoString1() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.toString();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testtoString2() {
        TokenQueue tokenqueue = new TokenQueue();
        tokenqueue.toString();
        assertTrue(tokenqueue.equals(tokenqueue));
    }
    @Test
    public void testpreserveTagCase0() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testpreserveTagCase1() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testpreserveTagCase2() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveTagCase();
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testpreserveAttributeCase0() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testpreserveAttributeCase1() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testpreserveAttributeCase2() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.preserveAttributeCase();
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeTag0() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("htto");
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeTag1() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("buttom");
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeTag2() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeTag("noscrips");
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeAttribute0() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute(":nth-of-type'");
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeAttribute1() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("p");
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeAttribute2() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttribute("[a-zA-Z_:][-a-zA-Z0-9_:.]+");
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeAttributes0() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttributes(null);
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeAttributes1() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttributes(null);
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testnormalizeAttributes2() {
        ParseSettings parsesettings = new ParseSettings();
        parsesettings.normalizeAttributes(null);
        assertTrue(parsesettings.equals(parsesettings));
    }
    @Test
    public void testdefaultSettings0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.defaultSettings();
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testdefaultSettings1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.defaultSettings();
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testdefaultSettings2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.defaultSettings();
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinitialiseParse0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.initialiseParse(null,"captioo",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinitialiseParse1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.initialiseParse(null,"]]>",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinitialiseParse2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.initialiseParse(null,"<.",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparse0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parse(null,"textarea");
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparse1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parse(null,"[");
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparse2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parse(null,":last-child");
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparse0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parse("\"\"","xmk");
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparse1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parse("noembee","checkbow");
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparse2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parse("image","imagf");
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testprocess0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.process(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testprocess1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.process(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testprocess2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.process(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsertNode0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insertNode(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsertNode1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insertNode(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsertNode2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insertNode(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testinsert2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.insert(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testpopStackToClose0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.popStackToClose(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testpopStackToClose1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.popStackToClose(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testpopStackToClose2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.popStackToClose(null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparseFragment0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parseFragment("DOCTYPD","stylf",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparseFragment1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parseFragment("hs",":only-child",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparseFragment2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parseFragment("option","xmp",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparseFragment0() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parseFragment("text/",null,"math",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparseFragment1() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parseFragment(":only-of-type",null,"a",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testparseFragment2() {
        XmlTreeBuilder xmltreebuilder = new XmlTreeBuilder();
        xmltreebuilder.parseFragment("!=",null,"radio",null);
        assertTrue(xmltreebuilder.equals(xmltreebuilder));
    }
    @Test
    public void testclean0() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testclean1() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testclean2() {
        Cleaner cleaner = new Cleaner();
        cleaner.clean(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testisValid0() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testisValid1() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testisValid2() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValid(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testisValidBodyHtml0() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("caption");
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testisValidBodyHtml1() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("spam");
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testisValidBodyHtml2() {
        Cleaner cleaner = new Cleaner();
        cleaner.isValidBodyHtml("htmm");
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testhead0() {
        CleaningVisitor cleaningvisitor = new CleaningVisitor();
        cleaningvisitor.head(null,55297);
        assertTrue(cleaningvisitor.equals(cleaningvisitor));
    }
    @Test
    public void testhead1() {
        CleaningVisitor cleaningvisitor = new CleaningVisitor();
        cleaningvisitor.head(null,192);
        assertTrue(cleaningvisitor.equals(cleaningvisitor));
    }
    @Test
    public void testhead2() {
        CleaningVisitor cleaningvisitor = new CleaningVisitor();
        cleaningvisitor.head(null,9);
        assertTrue(cleaningvisitor.equals(cleaningvisitor));
    }
    @Test
    public void testtail0() {
        CleaningVisitor cleaningvisitor = new CleaningVisitor();
        cleaningvisitor.tail(null,240);
        assertTrue(cleaningvisitor.equals(cleaningvisitor));
    }
    @Test
    public void testtail1() {
        CleaningVisitor cleaningvisitor = new CleaningVisitor();
        cleaningvisitor.tail(null,239);
        assertTrue(cleaningvisitor.equals(cleaningvisitor));
    }
    @Test
    public void testtail2() {
        CleaningVisitor cleaningvisitor = new CleaningVisitor();
        cleaningvisitor.tail(null,240);
        assertTrue(cleaningvisitor.equals(cleaningvisitor));
    }
    @Test
    public void testcopySafeNodes0() {
        Cleaner cleaner = new Cleaner();
        cleaner.copySafeNodes(null,null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testcopySafeNodes1() {
        Cleaner cleaner = new Cleaner();
        cleaner.copySafeNodes(null,null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testcopySafeNodes2() {
        Cleaner cleaner = new Cleaner();
        cleaner.copySafeNodes(null,null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testcreateSafeElement0() {
        Cleaner cleaner = new Cleaner();
        cleaner.createSafeElement(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testcreateSafeElement1() {
        Cleaner cleaner = new Cleaner();
        cleaner.createSafeElement(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testcreateSafeElement2() {
        Cleaner cleaner = new Cleaner();
        cleaner.createSafeElement(null);
        assertTrue(cleaner.equals(cleaner));
    }
    @Test
    public void testnone0() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testnone1() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testnone2() {
        Whitelist whitelist = new Whitelist();
        whitelist.none();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testsimpleText0() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testsimpleText1() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testsimpleText2() {
        Whitelist whitelist = new Whitelist();
        whitelist.simpleText();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testbasic0() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testbasic1() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testbasic2() {
        Whitelist whitelist = new Whitelist();
        whitelist.basic();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testbasicWithImages0() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testbasicWithImages1() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testbasicWithImages2() {
        Whitelist whitelist = new Whitelist();
        whitelist.basicWithImages();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testrelaxed0() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testrelaxed1() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testrelaxed2() {
        Whitelist whitelist = new Whitelist();
        whitelist.relaxed();
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddTags0() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("actiom");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddTags1() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("=");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddTags2() {
        Whitelist whitelist = new Whitelist();
        whitelist.addTags("action");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveTags0() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("]]?");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveTags1() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("command");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveTags2() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeTags("checkec");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddAttributes0() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("~>","bgsoune");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddAttributes1() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes(":has)","*}");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddAttributes2() {
        Whitelist whitelist = new Whitelist();
        whitelist.addAttributes("bgsound","checkee");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveAttributes0() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("deflatd","scripu");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveAttributes1() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes("plaintexu","buttom");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveAttributes2() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeAttributes(":nth-last-child(","namd");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddEnforcedAttribute0() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("http-equiv","isindey","tbodx");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddEnforcedAttribute1() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("tfoos","textareb","textareb");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddEnforcedAttribute2() {
        Whitelist whitelist = new Whitelist();
        whitelist.addEnforcedAttribute("checkee","optgrouo","iframf");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveEnforcedAttribute0() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute(":first-of-typf","link");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveEnforcedAttribute1() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute("frameses","*");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveEnforcedAttribute2() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeEnforcedAttribute(":first-chilc","#text");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testpreserveRelativeLinks0() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks(true);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testpreserveRelativeLinks1() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks(true);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testpreserveRelativeLinks2() {
        Whitelist whitelist = new Whitelist();
        whitelist.preserveRelativeLinks(true);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddProtocols0() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("~=","basf","h2");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddProtocols1() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("xmm","Set-Cookif","basd");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testaddProtocols2() {
        Whitelist whitelist = new Whitelist();
        whitelist.addProtocols("basf",":lt'","href");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveProtocols0() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("ode","*|","matg");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveProtocols1() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("spao",":root","dt");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testremoveProtocols2() {
        Whitelist whitelist = new Whitelist();
        whitelist.removeProtocols("image","[a-zA-Z_:][-a-zA-Z0-9_:.]+","noembed");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisSafeTag0() {
        Whitelist whitelist = new Whitelist();
        whitelist.isSafeTag("option");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisSafeTag1() {
        Whitelist whitelist = new Whitelist();
        whitelist.isSafeTag("rubx");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisSafeTag2() {
        Whitelist whitelist = new Whitelist();
        whitelist.isSafeTag("#");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisSafeAttribute0() {
        Whitelist whitelist = new Whitelist();
        whitelist.isSafeAttribute("h1",null,null);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisSafeAttribute1() {
        Whitelist whitelist = new Whitelist();
        whitelist.isSafeAttribute("rubz",null,null);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisSafeAttribute2() {
        Whitelist whitelist = new Whitelist();
        whitelist.isSafeAttribute("]]>",null,null);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testtestValidProtocol0() {
        Whitelist whitelist = new Whitelist();
        whitelist.testValidProtocol(null,null,null);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testtestValidProtocol1() {
        Whitelist whitelist = new Whitelist();
        whitelist.testValidProtocol(null,null,null);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testtestValidProtocol2() {
        Whitelist whitelist = new Whitelist();
        whitelist.testValidProtocol(null,null,null);
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisValidAnchor0() {
        Whitelist whitelist = new Whitelist();
        whitelist.isValidAnchor("tfoot");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisValidAnchor1() {
        Whitelist whitelist = new Whitelist();
        whitelist.isValidAnchor("optiom");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testisValidAnchor2() {
        Whitelist whitelist = new Whitelist();
        whitelist.isValidAnchor("metb");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testgetEnforcedAttributes0() {
        Whitelist whitelist = new Whitelist();
        whitelist.getEnforcedAttributes(":nth-of-type'");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testgetEnforcedAttributes1() {
        Whitelist whitelist = new Whitelist();
        whitelist.getEnforcedAttributes("#text");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testgetEnforcedAttributes2() {
        Whitelist whitelist = new Whitelist();
        whitelist.getEnforcedAttributes("typd");
        assertTrue(whitelist.equals(whitelist));
    }
    @Test
    public void testvalueOf0() {
        TagName tagname = new TagName();
        tagname.valueOf("optioo");
        assertTrue(tagname.equals(tagname));
    }
    @Test
    public void testvalueOf1() {
        TagName tagname = new TagName();
        tagname.valueOf("US-ASCII");
        assertTrue(tagname.equals(tagname));
    }
    @Test
    public void testvalueOf2() {
        TagName tagname = new TagName();
        tagname.valueOf("selecs");
        assertTrue(tagname.equals(tagname));
    }
    @Test
    public void testvalueOf0() {
        AttributeKey attributekey = new AttributeKey();
        attributekey.valueOf(":nth-of-type'");
        assertTrue(attributekey.equals(attributekey));
    }
    @Test
    public void testvalueOf1() {
        AttributeKey attributekey = new AttributeKey();
        attributekey.valueOf("h3");
        assertTrue(attributekey.equals(attributekey));
    }
    @Test
    public void testvalueOf2() {
        AttributeKey attributekey = new AttributeKey();
        attributekey.valueOf("image");
        assertTrue(attributekey.equals(attributekey));
    }
    @Test
    public void testvalueOf0() {
        AttributeValue attributevalue = new AttributeValue();
        attributevalue.valueOf("checkboy");
        assertTrue(attributevalue.equals(attributevalue));
    }
    @Test
    public void testvalueOf1() {
        AttributeValue attributevalue = new AttributeValue();
        attributevalue.valueOf(":alk");
        assertTrue(attributevalue.equals(attributevalue));
    }
    @Test
    public void testvalueOf2() {
        AttributeValue attributevalue = new AttributeValue();
        attributevalue.valueOf(":emptz");
        assertTrue(attributevalue.equals(attributevalue));
    }
    @Test
    public void testvalueOf0() {
        Protocol protocol = new Protocol();
        protocol.valueOf("US-ASCIJ");
        assertTrue(protocol.equals(protocol));
    }
    @Test
    public void testvalueOf1() {
        Protocol protocol = new Protocol();
        protocol.valueOf("tbodz");
        assertTrue(protocol.equals(protocol));
    }
    @Test
    public void testvalueOf2() {
        Protocol protocol = new Protocol();
        protocol.valueOf("col");
        assertTrue(protocol.equals(protocol));
    }
    @Test
    public void testhashCode0() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.hashCode();
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testhashCode1() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.hashCode();
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testhashCode2() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.hashCode();
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testequals0() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.equals(null);
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testequals1() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.equals(null);
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testequals2() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.equals(null);
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testtoString0() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.toString();
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testtoString1() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.toString();
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testtoString2() {
        TypedValue typedvalue = new TypedValue();
        typedvalue.toString();
        assertTrue(typedvalue.equals(typedvalue));
    }
    @Test
    public void testmain0() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("boundary");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
    }
    @Test
    public void testmain1() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("hiddem");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
    }
    @Test
    public void testmain2() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.main("imh");
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
    }
    @Test
    public void testgetPlainText0() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText(null);
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
    }
    @Test
    public void testgetPlainText1() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText(null);
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
    }
    @Test
    public void testgetPlainText2() {
        HtmlToPlainText htmltoplaintext = new HtmlToPlainText();
        htmltoplaintext.getPlainText(null);
        assertTrue(htmltoplaintext.equals(htmltoplaintext));
    }
    @Test
    public void testhead0() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.head(null,199);
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testhead1() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.head(null,1114211);
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testhead2() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.head(null,-90);
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testtail0() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.tail(null,191);
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testtail1() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.tail(null,100);
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testtail2() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.tail(null,1);
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testappend0() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.append("<.");
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testappend1() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.append(":only-of-typf");
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testappend2() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.append(":last-chilc");
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testtoString0() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.toString();
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testtoString1() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.toString();
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testtoString2() {
        FormattingVisitor formattingvisitor = new FormattingVisitor();
        formattingvisitor.toString();
        assertTrue(formattingvisitor.equals(formattingvisitor));
    }
    @Test
    public void testmain0() {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col"});
        assertTrue(wikipedia.equals(wikipedia));
    }
    @Test
    public void testmain1() {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif","bgsounc","radip",":not(",":not'","body","bodz",":nth-last-child'","radin",":nth-last-child(","radio","bodx",":nth-last-child)","*{","*|","*}",":not)","checkee","checkec","checked",":first-chile","html",":first-child","Set-Cookie","htmk",":first-chilc","Set-Cookid","DOCTYPE","htmm","DOCTYPF","^<","DOCTYPD","-,","^=","UTF.","noembee","[CDATAZ","--","^>","UTF-","noembed","[CDATA[","-.","UTF,","[CDATA\","#roou","#roos","#root","US-ASCIH","http:/","http:.","US-ASCIJ","noembec","US-ASCII","http:0","noscrips","noscript","noscripu","optioo","optiom","option","boundary","boundarz","img","imf","boundarx","imh","link","linl","linj","basefont","basefonu","head","heae","nobs","nobr","nobq",":empty","commane",":emptx","#texs","rubx","command","rubz","heac","commanc","ruby"});
        assertTrue(wikipedia.equals(wikipedia));
    }
    @Test
    public void testmain2() {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati"});
        assertTrue(wikipedia.equals(wikipedia));
    }
    @Test
    public void testlog0() {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.log("table",":last-child");
        assertTrue(wikipedia.equals(wikipedia));
    }
    @Test
    public void testlog1() {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.log("noframes","imagd");
        assertTrue(wikipedia.equals(wikipedia));
    }
    @Test
    public void testlog2() {
        Wikipedia wikipedia = new Wikipedia();
        wikipedia.log("buttom","type");
        assertTrue(wikipedia.equals(wikipedia));
    }
    @Test
    public void testmain0() {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1"});
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testmain1() {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","("});
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testmain2() {
        ListLinks listlinks = new ListLinks();
        listlinks.main(new String[]{":last-of-typd",":last-of-type",":last-of-typf",":first-of-typd",":first-of-type",":first-of-typf","xml","xmk","xmm","xmp","xmo","xmq","#","abs;","abs:","frameseu","frameset","frameses","(","abs9","*",".","inpuu","text/","input","text0","inpus","deflatd","text.","deflate","deflatf","metb","meta","met`",":containsData)",":only-chile",":only-child",":containsData'",";",":only-chilc",":containsData(","!<",":nth-child)","!=","!>","=",":nth-child'","?",":nth-child(","bq","br","bs","checkbox","checkbow",":matchesOwn)","disabled","iframf","disablee","iframe","[","iframd","disablec",":matchesOwn(","^","checkboy",":matchesOwn'","a","svf","svh","svg","plaintexu","plaintext","plaintexs","tc","p","td","tfoot","te","tfoou","tfoos","tg","th","ti",":gt)","sarcasn",":gt(","sarcasm",":gt'","sarcasl","|","tq","tr","ts","dc","dd","de","optgrouq","optgroup","optgrouo","tbodx","tbody","tbodz","ds","dt","du",":eq)","$<","http-equiu",":eq(","$=","http-equiv",":eq'","$>","http-equiw","]]=","]]?","]]>","imagd","image",":matches)",":matchText",":matchTexu","imagf",":matchTexs","noframes","noframer","htto","name",":nth-of-type)","httq","namd","http",":nth-of-type'",":nth-of-type(",":matches(",":matches'","noframet","namf","theac","titld","hidden","hiddeo","theae","hiddem","thead","h0","h1","h2",":contains'","h3",":contains(","title","keygeo","h4","titlf","h5","keygem","h6","keygen","button","buttoo","buttom",":contains)","colgrouo","colgroup","forl","form","forn","basf","basd","base","selecu","select","selecs","textareb","captioo","textarea","hq","caption","textare`","hr","captiom","hs","type","typf","typd","colgrouq","actioo","action","hree","actiom","httpr","href","https","hreg","httpt","\"\"","scripu","script","odd","scrips","odc","ode",":alm","matg","eveo","even","evem","stylf",":lt'","style","mati",":lt(","styld","math",":lt)",":all",":alk","template","charseu","isindew","templatf","charset",":last-chile","templatd","\"","charses","\'",":nth-last-of-type)",":nth-last-of-type(","isindex",":nth-last-of-type'","isindey",":containsOwn)","*<","*=","*>",":containsOwn'",":containsOwn(","tabld","table","tablf",":has'","gzio",":has(","gzip",":has)","gziq","<.","</","<0","[a-zA-Z_:][-a-zA-Z0-9_:.]+","[a-zA-Z_:][-a-zA-Z0-9_:.])","[a-zA-Z_:][-a-zA-Z0-9_:.]*",":root",":roou","lh","spam",":last-chilc","li",":roos",":last-child","lj","spao","cok","~<","span","~=","com","~>","col","bgsound","bgsoune","Set-Cookif"});
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testprint0() {
        ListLinks listlinks = new ListLinks();
        listlinks.print("DOCTYPE",null);
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testprint1() {
        ListLinks listlinks = new ListLinks();
        listlinks.print("imagf",null);
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testprint2() {
        ListLinks listlinks = new ListLinks();
        listlinks.print("boundarz",null);
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testtrim0() {
        ListLinks listlinks = new ListLinks();
        listlinks.trim("abs;",-100);
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testtrim1() {
        ListLinks listlinks = new ListLinks();
        listlinks.trim(":containsOwn'",55296);
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testtrim2() {
        ListLinks listlinks = new ListLinks();
        listlinks.trim("ode",0);
        assertTrue(listlinks.equals(listlinks));
    }
    @Test
    public void testhasBody0() {
        Connection connection = new Connection();
        connection.hasBody();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testhasBody1() {
        Connection connection = new Connection();
        connection.hasBody();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testhasBody2() {
        Connection connection = new Connection();
        connection.hasBody();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testurl0() {
        Connection connection = new Connection();
        connection.url(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testurl1() {
        Connection connection = new Connection();
        connection.url(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testurl2() {
        Connection connection = new Connection();
        connection.url(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testurl0() {
        Connection connection = new Connection();
        connection.url("theae");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testurl1() {
        Connection connection = new Connection();
        connection.url("matg");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testurl2() {
        Connection connection = new Connection();
        connection.url(":matchTexu");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testproxy0() {
        Connection connection = new Connection();
        connection.proxy(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testproxy1() {
        Connection connection = new Connection();
        connection.proxy(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testproxy2() {
        Connection connection = new Connection();
        connection.proxy(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testproxy0() {
        Connection connection = new Connection();
        connection.proxy("htmm",3);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testproxy1() {
        Connection connection = new Connection();
        connection.proxy("bgsound",1114211);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testproxy2() {
        Connection connection = new Connection();
        connection.proxy("titld",-90);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testuserAgent0() {
        Connection connection = new Connection();
        connection.userAgent("hreg");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testuserAgent1() {
        Connection connection = new Connection();
        connection.userAgent("basefons");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testuserAgent2() {
        Connection connection = new Connection();
        connection.userAgent("#texu");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testtimeout0() {
        Connection connection = new Connection();
        connection.timeout(57243);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testtimeout1() {
        Connection connection = new Connection();
        connection.timeout(-1);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testtimeout2() {
        Connection connection = new Connection();
        connection.timeout(0);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testmaxBodySize0() {
        Connection connection = new Connection();
        connection.maxBodySize(1114211);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testmaxBodySize1() {
        Connection connection = new Connection();
        connection.maxBodySize(-99);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testmaxBodySize2() {
        Connection connection = new Connection();
        connection.maxBodySize(9);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testreferrer0() {
        Connection connection = new Connection();
        connection.referrer("bodz");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testreferrer1() {
        Connection connection = new Connection();
        connection.referrer("charseu");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testreferrer2() {
        Connection connection = new Connection();
        connection.referrer("htto");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testfollowRedirects0() {
        Connection connection = new Connection();
        connection.followRedirects(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testfollowRedirects1() {
        Connection connection = new Connection();
        connection.followRedirects(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testfollowRedirects2() {
        Connection connection = new Connection();
        connection.followRedirects(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testmethod0() {
        Connection connection = new Connection();
        connection.method(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testmethod1() {
        Connection connection = new Connection();
        connection.method(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testmethod2() {
        Connection connection = new Connection();
        connection.method(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testignoreHttpErrors0() {
        Connection connection = new Connection();
        connection.ignoreHttpErrors(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testignoreHttpErrors1() {
        Connection connection = new Connection();
        connection.ignoreHttpErrors(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testignoreHttpErrors2() {
        Connection connection = new Connection();
        connection.ignoreHttpErrors(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testignoreContentType0() {
        Connection connection = new Connection();
        connection.ignoreContentType(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testignoreContentType1() {
        Connection connection = new Connection();
        connection.ignoreContentType(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testignoreContentType2() {
        Connection connection = new Connection();
        connection.ignoreContentType(true);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testsslSocketFactory0() {
        Connection connection = new Connection();
        connection.sslSocketFactory(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testsslSocketFactory1() {
        Connection connection = new Connection();
        connection.sslSocketFactory(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testsslSocketFactory2() {
        Connection connection = new Connection();
        connection.sslSocketFactory(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata0() {
        Connection connection = new Connection();
        connection.data("select","bodz");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata1() {
        Connection connection = new Connection();
        connection.data(":containsData'","bq");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata2() {
        Connection connection = new Connection();
        connection.data("colgroup","plaintexu");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata0() {
        Connection connection = new Connection();
        connection.data(":nth-last-child(","]]?",null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata1() {
        Connection connection = new Connection();
        connection.data("form","li",null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata2() {
        Connection connection = new Connection();
        connection.data("inpus","imagf",null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata0() {
        Connection connection = new Connection();
        connection.data("h2","Set-Cookid",null,"h0");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata1() {
        Connection connection = new Connection();
        connection.data(":last-of-typd","select",null,"theac");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata2() {
        Connection connection = new Connection();
        connection.data(":only-of-typf",":matchesOwn)",null,"textarea");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata0() {
        Connection connection = new Connection();
        connection.data(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata1() {
        Connection connection = new Connection();
        connection.data(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata2() {
        Connection connection = new Connection();
        connection.data(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata0() {
        Connection connection = new Connection();
        connection.data(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata1() {
        Connection connection = new Connection();
        connection.data(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata2() {
        Connection connection = new Connection();
        connection.data(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata0() {
        Connection connection = new Connection();
        connection.data("basd");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata1() {
        Connection connection = new Connection();
        connection.data(":contains)");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata2() {
        Connection connection = new Connection();
        connection.data("!=");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata0() {
        Connection connection = new Connection();
        connection.data("te");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata1() {
        Connection connection = new Connection();
        connection.data("optioo");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testdata2() {
        Connection connection = new Connection();
        connection.data("rubx");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequestBody0() {
        Connection connection = new Connection();
        connection.requestBody("#");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequestBody1() {
        Connection connection = new Connection();
        connection.requestBody("checkbox");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequestBody2() {
        Connection connection = new Connection();
        connection.requestBody("Set-Cookif");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testheader0() {
        Connection connection = new Connection();
        connection.header("te","rubz");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testheader1() {
        Connection connection = new Connection();
        connection.header("titld","boundarx");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testheader2() {
        Connection connection = new Connection();
        connection.header("span","US-ASCII");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testheaders0() {
        Connection connection = new Connection();
        connection.headers(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testheaders1() {
        Connection connection = new Connection();
        connection.headers(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testheaders2() {
        Connection connection = new Connection();
        connection.headers(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testcookie0() {
        Connection connection = new Connection();
        connection.cookie("$<",":containsOwn)");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testcookie1() {
        Connection connection = new Connection();
        connection.cookie(":first-child","http-equiw");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testcookie2() {
        Connection connection = new Connection();
        connection.cookie("htmm","boundarx");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testcookies0() {
        Connection connection = new Connection();
        connection.cookies(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testcookies1() {
        Connection connection = new Connection();
        connection.cookies(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testcookies2() {
        Connection connection = new Connection();
        connection.cookies(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testparser0() {
        Connection connection = new Connection();
        connection.parser(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testparser1() {
        Connection connection = new Connection();
        connection.parser(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testparser2() {
        Connection connection = new Connection();
        connection.parser(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testpostDataCharset0() {
        Connection connection = new Connection();
        connection.postDataCharset("radin");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testpostDataCharset1() {
        Connection connection = new Connection();
        connection.postDataCharset("htto");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testpostDataCharset2() {
        Connection connection = new Connection();
        connection.postDataCharset("styld");
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testget0() {
        Connection connection = new Connection();
        connection.get();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testget1() {
        Connection connection = new Connection();
        connection.get();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testget2() {
        Connection connection = new Connection();
        connection.get();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testpost0() {
        Connection connection = new Connection();
        connection.post();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testpost1() {
        Connection connection = new Connection();
        connection.post();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testpost2() {
        Connection connection = new Connection();
        connection.post();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testexecute0() {
        Connection connection = new Connection();
        connection.execute();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testexecute1() {
        Connection connection = new Connection();
        connection.execute();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testexecute2() {
        Connection connection = new Connection();
        connection.execute();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequest0() {
        Connection connection = new Connection();
        connection.request();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequest1() {
        Connection connection = new Connection();
        connection.request();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequest2() {
        Connection connection = new Connection();
        connection.request();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequest0() {
        Connection connection = new Connection();
        connection.request(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequest1() {
        Connection connection = new Connection();
        connection.request(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testrequest2() {
        Connection connection = new Connection();
        connection.request(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testresponse0() {
        Connection connection = new Connection();
        connection.response();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testresponse1() {
        Connection connection = new Connection();
        connection.response();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testresponse2() {
        Connection connection = new Connection();
        connection.response();
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testresponse0() {
        Connection connection = new Connection();
        connection.response(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testresponse1() {
        Connection connection = new Connection();
        connection.response(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testresponse2() {
        Connection connection = new Connection();
        connection.response(null);
        assertTrue(connection.equals(connection));
    }
    @Test
    public void testurl0() {
        Base base = new Base();
        base.url();
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl1() {
        Base base = new Base();
        base.url();
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl2() {
        Base base = new Base();
        base.url();
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl0() {
        Base base = new Base();
        base.url(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl1() {
        Base base = new Base();
        base.url(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl2() {
        Base base = new Base();
        base.url(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod0() {
        Base base = new Base();
        base.method();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod1() {
        Base base = new Base();
        base.method();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod2() {
        Base base = new Base();
        base.method();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod0() {
        Base base = new Base();
        base.method(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod1() {
        Base base = new Base();
        base.method(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod2() {
        Base base = new Base();
        base.method(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader0() {
        Base base = new Base();
        base.header(":first-chilc");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader1() {
        Base base = new Base();
        base.header("dt");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader2() {
        Base base = new Base();
        base.header("titld");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders0() {
        Base base = new Base();
        base.headers("*|");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders1() {
        Base base = new Base();
        base.headers("<.");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders2() {
        Base base = new Base();
        base.headers("bgsound");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader0() {
        Base base = new Base();
        base.header("colgrouo",":matchesOwn'");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader1() {
        Base base = new Base();
        base.header(":contains(","$<");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader2() {
        Base base = new Base();
        base.header("basefont","stylf");
        assertTrue(base.equals(base));
    }
    @Test
    public void testaddHeader0() {
        Base base = new Base();
        base.addHeader("sarcasm","bgsounc");
        assertTrue(base.equals(base));
    }
    @Test
    public void testaddHeader1() {
        Base base = new Base();
        base.addHeader("style","du");
        assertTrue(base.equals(base));
    }
    @Test
    public void testaddHeader2() {
        Base base = new Base();
        base.addHeader("theae","meta");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeader0() {
        Base base = new Base();
        base.hasHeader(":empty");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeader1() {
        Base base = new Base();
        base.hasHeader(":matchesOwn'");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeader2() {
        Base base = new Base();
        base.hasHeader("*");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeaderWithValue0() {
        Base base = new Base();
        base.hasHeaderWithValue("iframd","bgsoune");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeaderWithValue1() {
        Base base = new Base();
        base.hasHeaderWithValue("#",":only-child");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeaderWithValue2() {
        Base base = new Base();
        base.hasHeaderWithValue("image","US-ASCII");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveHeader0() {
        Base base = new Base();
        base.removeHeader("p");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveHeader1() {
        Base base = new Base();
        base.removeHeader("h5");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveHeader2() {
        Base base = new Base();
        base.removeHeader("ode");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders0() {
        Base base = new Base();
        base.headers();
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders1() {
        Base base = new Base();
        base.headers();
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders2() {
        Base base = new Base();
        base.headers();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmultiHeaders0() {
        Base base = new Base();
        base.multiHeaders();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmultiHeaders1() {
        Base base = new Base();
        base.multiHeaders();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmultiHeaders2() {
        Base base = new Base();
        base.multiHeaders();
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie0() {
        Base base = new Base();
        base.cookie("US-ASCIJ");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie1() {
        Base base = new Base();
        base.cookie("p");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie2() {
        Base base = new Base();
        base.cookie("htmm");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie0() {
        Base base = new Base();
        base.cookie("DOCTYPF","nobq");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie1() {
        Base base = new Base();
        base.cookie(":gt)","gzio");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie2() {
        Base base = new Base();
        base.cookie(":gt)","title");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasCookie0() {
        Base base = new Base();
        base.hasCookie("nobr");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasCookie1() {
        Base base = new Base();
        base.hasCookie(":nth-of-type)");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasCookie2() {
        Base base = new Base();
        base.hasCookie("image");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveCookie0() {
        Base base = new Base();
        base.removeCookie(":nth-child'");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveCookie1() {
        Base base = new Base();
        base.removeCookie(":matchesOwn'");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveCookie2() {
        Base base = new Base();
        base.removeCookie("captiom");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookies0() {
        Base base = new Base();
        base.cookies();
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookies1() {
        Base base = new Base();
        base.cookies();
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookies2() {
        Base base = new Base();
        base.cookies();
        assertTrue(base.equals(base));
    }
    @Test
    public void testproxy0() {
        Request request = new Request();
        request.proxy();
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy1() {
        Request request = new Request();
        request.proxy();
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy2() {
        Request request = new Request();
        request.proxy();
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy0() {
        Request request = new Request();
        request.proxy(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy1() {
        Request request = new Request();
        request.proxy(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy2() {
        Request request = new Request();
        request.proxy(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy0() {
        Request request = new Request();
        request.proxy(":first-chilc",103);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy1() {
        Request request = new Request();
        request.proxy(":only-of-type",100);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy2() {
        Request request = new Request();
        request.proxy(":only-of-typd",1114211);
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout0() {
        Request request = new Request();
        request.timeout();
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout1() {
        Request request = new Request();
        request.timeout();
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout2() {
        Request request = new Request();
        request.timeout();
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout0() {
        Request request = new Request();
        request.timeout(400);
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout1() {
        Request request = new Request();
        request.timeout(57243);
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout2() {
        Request request = new Request();
        request.timeout(192);
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize0() {
        Request request = new Request();
        request.maxBodySize();
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize1() {
        Request request = new Request();
        request.maxBodySize();
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize2() {
        Request request = new Request();
        request.maxBodySize();
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize0() {
        Request request = new Request();
        request.maxBodySize(55296);
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize1() {
        Request request = new Request();
        request.maxBodySize(-1);
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize2() {
        Request request = new Request();
        request.maxBodySize(191);
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects0() {
        Request request = new Request();
        request.followRedirects();
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects1() {
        Request request = new Request();
        request.followRedirects();
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects2() {
        Request request = new Request();
        request.followRedirects();
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects0() {
        Request request = new Request();
        request.followRedirects(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects1() {
        Request request = new Request();
        request.followRedirects(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects2() {
        Request request = new Request();
        request.followRedirects(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors0() {
        Request request = new Request();
        request.ignoreHttpErrors();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors1() {
        Request request = new Request();
        request.ignoreHttpErrors();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors2() {
        Request request = new Request();
        request.ignoreHttpErrors();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors0() {
        Request request = new Request();
        request.ignoreHttpErrors(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors1() {
        Request request = new Request();
        request.ignoreHttpErrors(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors2() {
        Request request = new Request();
        request.ignoreHttpErrors(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType0() {
        Request request = new Request();
        request.ignoreContentType();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType1() {
        Request request = new Request();
        request.ignoreContentType();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType2() {
        Request request = new Request();
        request.ignoreContentType();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType0() {
        Request request = new Request();
        request.ignoreContentType(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType1() {
        Request request = new Request();
        request.ignoreContentType(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType2() {
        Request request = new Request();
        request.ignoreContentType(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory0() {
        Request request = new Request();
        request.sslSocketFactory();
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory1() {
        Request request = new Request();
        request.sslSocketFactory();
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory2() {
        Request request = new Request();
        request.sslSocketFactory();
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory0() {
        Request request = new Request();
        request.sslSocketFactory(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory1() {
        Request request = new Request();
        request.sslSocketFactory(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory2() {
        Request request = new Request();
        request.sslSocketFactory(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata0() {
        Request request = new Request();
        request.data(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata1() {
        Request request = new Request();
        request.data(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata2() {
        Request request = new Request();
        request.data(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata0() {
        Request request = new Request();
        request.data();
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata1() {
        Request request = new Request();
        request.data();
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata2() {
        Request request = new Request();
        request.data();
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody0() {
        Request request = new Request();
        request.requestBody(":first-child");
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody1() {
        Request request = new Request();
        request.requestBody(":not'");
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody2() {
        Request request = new Request();
        request.requestBody("#texs");
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody0() {
        Request request = new Request();
        request.requestBody();
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody1() {
        Request request = new Request();
        request.requestBody();
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody2() {
        Request request = new Request();
        request.requestBody();
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser0() {
        Request request = new Request();
        request.parser(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser1() {
        Request request = new Request();
        request.parser(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser2() {
        Request request = new Request();
        request.parser(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser0() {
        Request request = new Request();
        request.parser();
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser1() {
        Request request = new Request();
        request.parser();
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser2() {
        Request request = new Request();
        request.parser();
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset0() {
        Request request = new Request();
        request.postDataCharset("noscripu");
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset1() {
        Request request = new Request();
        request.postDataCharset("bgsounc");
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset2() {
        Request request = new Request();
        request.postDataCharset("link");
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset0() {
        Request request = new Request();
        request.postDataCharset();
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset1() {
        Request request = new Request();
        request.postDataCharset();
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset2() {
        Request request = new Request();
        request.postDataCharset();
        assertTrue(request.equals(request));
    }
    @Test
    public void teststatusCode0() {
        Response response = new Response();
        response.statusCode();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusCode1() {
        Response response = new Response();
        response.statusCode();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusCode2() {
        Response response = new Response();
        response.statusCode();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusMessage0() {
        Response response = new Response();
        response.statusMessage();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusMessage1() {
        Response response = new Response();
        response.statusMessage();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusMessage2() {
        Response response = new Response();
        response.statusMessage();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset0() {
        Response response = new Response();
        response.charset();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset1() {
        Response response = new Response();
        response.charset();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset2() {
        Response response = new Response();
        response.charset();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset0() {
        Response response = new Response();
        response.charset("checked");
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset1() {
        Response response = new Response();
        response.charset("checkee");
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset2() {
        Response response = new Response();
        response.charset("style");
        assertTrue(response.equals(response));
    }
    @Test
    public void testcontentType0() {
        Response response = new Response();
        response.contentType();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcontentType1() {
        Response response = new Response();
        response.contentType();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcontentType2() {
        Response response = new Response();
        response.contentType();
        assertTrue(response.equals(response));
    }
    @Test
    public void testparse0() {
        Response response = new Response();
        response.parse();
        assertTrue(response.equals(response));
    }
    @Test
    public void testparse1() {
        Response response = new Response();
        response.parse();
        assertTrue(response.equals(response));
    }
    @Test
    public void testparse2() {
        Response response = new Response();
        response.parse();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbody0() {
        Response response = new Response();
        response.body();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbody1() {
        Response response = new Response();
        response.body();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbody2() {
        Response response = new Response();
        response.body();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyAsBytes0() {
        Response response = new Response();
        response.bodyAsBytes();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyAsBytes1() {
        Response response = new Response();
        response.bodyAsBytes();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyAsBytes2() {
        Response response = new Response();
        response.bodyAsBytes();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbufferUp0() {
        Response response = new Response();
        response.bufferUp();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbufferUp1() {
        Response response = new Response();
        response.bufferUp();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbufferUp2() {
        Response response = new Response();
        response.bufferUp();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyStream0() {
        Response response = new Response();
        response.bodyStream();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyStream1() {
        Response response = new Response();
        response.bodyStream();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyStream2() {
        Response response = new Response();
        response.bodyStream();
        assertTrue(response.equals(response));
    }
    @Test
    public void testkey0() {
        KeyVal keyval = new KeyVal();
        keyval.key("basefons");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey1() {
        KeyVal keyval = new KeyVal();
        keyval.key("evem");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey2() {
        KeyVal keyval = new KeyVal();
        keyval.key("=");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey0() {
        KeyVal keyval = new KeyVal();
        keyval.key();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey1() {
        KeyVal keyval = new KeyVal();
        keyval.key();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey2() {
        KeyVal keyval = new KeyVal();
        keyval.key();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue0() {
        KeyVal keyval = new KeyVal();
        keyval.value("hree");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue1() {
        KeyVal keyval = new KeyVal();
        keyval.value(":nth-last-of-type'");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue2() {
        KeyVal keyval = new KeyVal();
        keyval.value("image");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue0() {
        KeyVal keyval = new KeyVal();
        keyval.value();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue1() {
        KeyVal keyval = new KeyVal();
        keyval.value();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue2() {
        KeyVal keyval = new KeyVal();
        keyval.value();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream0() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream(null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream1() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream(null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream2() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream(null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream0() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream1() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream2() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testhasInputStream0() {
        KeyVal keyval = new KeyVal();
        keyval.hasInputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testhasInputStream1() {
        KeyVal keyval = new KeyVal();
        keyval.hasInputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testhasInputStream2() {
        KeyVal keyval = new KeyVal();
        keyval.hasInputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType0() {
        KeyVal keyval = new KeyVal();
        keyval.contentType(":only-chilc");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType1() {
        KeyVal keyval = new KeyVal();
        keyval.contentType("DOCTYPD");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType2() {
        KeyVal keyval = new KeyVal();
        keyval.contentType("DOCTYPD");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType0() {
        KeyVal keyval = new KeyVal();
        keyval.contentType();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType1() {
        KeyVal keyval = new KeyVal();
        keyval.contentType();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType2() {
        KeyVal keyval = new KeyVal();
        keyval.contentType();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testgetMimeType0() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testgetMimeType1() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testgetMimeType2() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getMimeType();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testgetUrl0() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testgetUrl1() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testgetUrl2() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.getUrl();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testtoString0() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.toString();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testtoString1() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.toString();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testtoString2() {
        UnsupportedMimeTypeException unsupportedmimetypeexception = new UnsupportedMimeTypeException();
        unsupportedmimetypeexception.toString();
        assertTrue(unsupportedmimetypeexception.equals(unsupportedmimetypeexception));
    }
    @Test
    public void testgetStatusCode0() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testgetStatusCode1() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testgetStatusCode2() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getStatusCode();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testgetUrl0() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testgetUrl1() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testgetUrl2() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.getUrl();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testtoString0() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.toString();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testtoString1() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.toString();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testtoString2() {
        HttpStatusException httpstatusexception = new HttpStatusException();
        httpstatusexception.toString();
        assertTrue(httpstatusexception.equals(httpstatusexception));
    }
    @Test
    public void testtraverse0() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse1() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse2() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse0() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse1() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse2() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse0() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse1() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testtraverse2() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.traverse(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testfilter0() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testfilter1() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testfilter2() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testfilter0() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testfilter1() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testfilter2() {
        NodeTraversor nodetraversor = new NodeTraversor();
        nodetraversor.filter(null,null);
        assertTrue(nodetraversor.equals(nodetraversor));
    }
    @Test
    public void testmatches0() {
        Root root = new Root();
        root.matches(null,null);
        assertTrue(root.equals(root));
    }
    @Test
    public void testmatches1() {
        Root root = new Root();
        root.matches(null,null);
        assertTrue(root.equals(root));
    }
    @Test
    public void testmatches2() {
        Root root = new Root();
        root.matches(null,null);
        assertTrue(root.equals(root));
    }
    @Test
    public void testmatches0() {
        Has has = new Has();
        has.matches(null,null);
        assertTrue(has.equals(has));
    }
    @Test
    public void testmatches1() {
        Has has = new Has();
        has.matches(null,null);
        assertTrue(has.equals(has));
    }
    @Test
    public void testmatches2() {
        Has has = new Has();
        has.matches(null,null);
        assertTrue(has.equals(has));
    }
    @Test
    public void testtoString0() {
        Has has = new Has();
        has.toString();
        assertTrue(has.equals(has));
    }
    @Test
    public void testtoString1() {
        Has has = new Has();
        has.toString();
        assertTrue(has.equals(has));
    }
    @Test
    public void testtoString2() {
        Has has = new Has();
        has.toString();
        assertTrue(has.equals(has));
    }
    @Test
    public void testmatches0() {
        Not not = new Not();
        not.matches(null,null);
        assertTrue(not.equals(not));
    }
    @Test
    public void testmatches1() {
        Not not = new Not();
        not.matches(null,null);
        assertTrue(not.equals(not));
    }
    @Test
    public void testmatches2() {
        Not not = new Not();
        not.matches(null,null);
        assertTrue(not.equals(not));
    }
    @Test
    public void testtoString0() {
        Not not = new Not();
        not.toString();
        assertTrue(not.equals(not));
    }
    @Test
    public void testtoString1() {
        Not not = new Not();
        not.toString();
        assertTrue(not.equals(not));
    }
    @Test
    public void testtoString2() {
        Not not = new Not();
        not.toString();
        assertTrue(not.equals(not));
    }
    @Test
    public void testmatches0() {
        Parent parent = new Parent();
        parent.matches(null,null);
        assertTrue(parent.equals(parent));
    }
    @Test
    public void testmatches1() {
        Parent parent = new Parent();
        parent.matches(null,null);
        assertTrue(parent.equals(parent));
    }
    @Test
    public void testmatches2() {
        Parent parent = new Parent();
        parent.matches(null,null);
        assertTrue(parent.equals(parent));
    }
    @Test
    public void testtoString0() {
        Parent parent = new Parent();
        parent.toString();
        assertTrue(parent.equals(parent));
    }
    @Test
    public void testtoString1() {
        Parent parent = new Parent();
        parent.toString();
        assertTrue(parent.equals(parent));
    }
    @Test
    public void testtoString2() {
        Parent parent = new Parent();
        parent.toString();
        assertTrue(parent.equals(parent));
    }
    @Test
    public void testmatches0() {
        ImmediateParent immediateparent = new ImmediateParent();
        immediateparent.matches(null,null);
        assertTrue(immediateparent.equals(immediateparent));
    }
    @Test
    public void testmatches1() {
        ImmediateParent immediateparent = new ImmediateParent();
        immediateparent.matches(null,null);
        assertTrue(immediateparent.equals(immediateparent));
    }
    @Test
    public void testmatches2() {
        ImmediateParent immediateparent = new ImmediateParent();
        immediateparent.matches(null,null);
        assertTrue(immediateparent.equals(immediateparent));
    }
    @Test
    public void testtoString0() {
        ImmediateParent immediateparent = new ImmediateParent();
        immediateparent.toString();
        assertTrue(immediateparent.equals(immediateparent));
    }
    @Test
    public void testtoString1() {
        ImmediateParent immediateparent = new ImmediateParent();
        immediateparent.toString();
        assertTrue(immediateparent.equals(immediateparent));
    }
    @Test
    public void testtoString2() {
        ImmediateParent immediateparent = new ImmediateParent();
        immediateparent.toString();
        assertTrue(immediateparent.equals(immediateparent));
    }
    @Test
    public void testmatches0() {
        PreviousSibling previoussibling = new PreviousSibling();
        previoussibling.matches(null,null);
        assertTrue(previoussibling.equals(previoussibling));
    }
    @Test
    public void testmatches1() {
        PreviousSibling previoussibling = new PreviousSibling();
        previoussibling.matches(null,null);
        assertTrue(previoussibling.equals(previoussibling));
    }
    @Test
    public void testmatches2() {
        PreviousSibling previoussibling = new PreviousSibling();
        previoussibling.matches(null,null);
        assertTrue(previoussibling.equals(previoussibling));
    }
    @Test
    public void testtoString0() {
        PreviousSibling previoussibling = new PreviousSibling();
        previoussibling.toString();
        assertTrue(previoussibling.equals(previoussibling));
    }
    @Test
    public void testtoString1() {
        PreviousSibling previoussibling = new PreviousSibling();
        previoussibling.toString();
        assertTrue(previoussibling.equals(previoussibling));
    }
    @Test
    public void testtoString2() {
        PreviousSibling previoussibling = new PreviousSibling();
        previoussibling.toString();
        assertTrue(previoussibling.equals(previoussibling));
    }
    @Test
    public void testmatches0() {
        ImmediatePreviousSibling immediateprevioussibling = new ImmediatePreviousSibling();
        immediateprevioussibling.matches(null,null);
        assertTrue(immediateprevioussibling.equals(immediateprevioussibling));
    }
    @Test
    public void testmatches1() {
        ImmediatePreviousSibling immediateprevioussibling = new ImmediatePreviousSibling();
        immediateprevioussibling.matches(null,null);
        assertTrue(immediateprevioussibling.equals(immediateprevioussibling));
    }
    @Test
    public void testmatches2() {
        ImmediatePreviousSibling immediateprevioussibling = new ImmediatePreviousSibling();
        immediateprevioussibling.matches(null,null);
        assertTrue(immediateprevioussibling.equals(immediateprevioussibling));
    }
    @Test
    public void testtoString0() {
        ImmediatePreviousSibling immediateprevioussibling = new ImmediatePreviousSibling();
        immediateprevioussibling.toString();
        assertTrue(immediateprevioussibling.equals(immediateprevioussibling));
    }
    @Test
    public void testtoString1() {
        ImmediatePreviousSibling immediateprevioussibling = new ImmediatePreviousSibling();
        immediateprevioussibling.toString();
        assertTrue(immediateprevioussibling.equals(immediateprevioussibling));
    }
    @Test
    public void testtoString2() {
        ImmediatePreviousSibling immediateprevioussibling = new ImmediatePreviousSibling();
        immediateprevioussibling.toString();
        assertTrue(immediateprevioussibling.equals(immediateprevioussibling));
    }
    @Test
    public void testcollect0() {
        Collector collector = new Collector();
        collector.collect(null,null);
        assertTrue(collector.equals(collector));
    }
    @Test
    public void testcollect1() {
        Collector collector = new Collector();
        collector.collect(null,null);
        assertTrue(collector.equals(collector));
    }
    @Test
    public void testcollect2() {
        Collector collector = new Collector();
        collector.collect(null,null);
        assertTrue(collector.equals(collector));
    }
    @Test
    public void testhead0() {
        Accumulator accumulator = new Accumulator();
        accumulator.head(null,4);
        assertTrue(accumulator.equals(accumulator));
    }
    @Test
    public void testhead1() {
        Accumulator accumulator = new Accumulator();
        accumulator.head(null,-1);
        assertTrue(accumulator.equals(accumulator));
    }
    @Test
    public void testhead2() {
        Accumulator accumulator = new Accumulator();
        accumulator.head(null,-90);
        assertTrue(accumulator.equals(accumulator));
    }
    @Test
    public void testtail0() {
        Accumulator accumulator = new Accumulator();
        accumulator.tail(null,199);
        assertTrue(accumulator.equals(accumulator));
    }
    @Test
    public void testtail1() {
        Accumulator accumulator = new Accumulator();
        accumulator.tail(null,-100);
        assertTrue(accumulator.equals(accumulator));
    }
    @Test
    public void testtail2() {
        Accumulator accumulator = new Accumulator();
        accumulator.tail(null,1);
        assertTrue(accumulator.equals(accumulator));
    }
    @Test
    public void testfindFirst0() {
        Collector collector = new Collector();
        collector.findFirst(null,null);
        assertTrue(collector.equals(collector));
    }
    @Test
    public void testfindFirst1() {
        Collector collector = new Collector();
        collector.findFirst(null,null);
        assertTrue(collector.equals(collector));
    }
    @Test
    public void testfindFirst2() {
        Collector collector = new Collector();
        collector.findFirst(null,null);
        assertTrue(collector.equals(collector));
    }
    @Test
    public void testhead0() {
        FirstFinder firstfinder = new FirstFinder();
        firstfinder.head(null,2);
        assertTrue(firstfinder.equals(firstfinder));
    }
    @Test
    public void testhead1() {
        FirstFinder firstfinder = new FirstFinder();
        firstfinder.head(null,-90);
        assertTrue(firstfinder.equals(firstfinder));
    }
    @Test
    public void testhead2() {
        FirstFinder firstfinder = new FirstFinder();
        firstfinder.head(null,224);
        assertTrue(firstfinder.equals(firstfinder));
    }
    @Test
    public void testtail0() {
        FirstFinder firstfinder = new FirstFinder();
        firstfinder.tail(null,57243);
        assertTrue(firstfinder.equals(firstfinder));
    }
    @Test
    public void testtail1() {
        FirstFinder firstfinder = new FirstFinder();
        firstfinder.tail(null,-90);
        assertTrue(firstfinder.equals(firstfinder));
    }
    @Test
    public void testtail2() {
        FirstFinder firstfinder = new FirstFinder();
        firstfinder.tail(null,1114112);
        assertTrue(firstfinder.equals(firstfinder));
    }
    @Test
    public void testclone0() {
        Elements elements = new Elements();
        elements.clone();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testclone1() {
        Elements elements = new Elements();
        elements.clone();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testclone2() {
        Elements elements = new Elements();
        elements.clone();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testattr0() {
        Elements elements = new Elements();
        elements.attr("|");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testattr1() {
        Elements elements = new Elements();
        elements.attr("isindey");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testattr2() {
        Elements elements = new Elements();
        elements.attr("US-ASCII");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasAttr0() {
        Elements elements = new Elements();
        elements.hasAttr("basefons");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasAttr1() {
        Elements elements = new Elements();
        elements.hasAttr(":matchesOwn)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasAttr2() {
        Elements elements = new Elements();
        elements.hasAttr("optioo");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeachAttr0() {
        Elements elements = new Elements();
        elements.eachAttr("evem");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeachAttr1() {
        Elements elements = new Elements();
        elements.eachAttr("mati");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeachAttr2() {
        Elements elements = new Elements();
        elements.eachAttr("du");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testattr0() {
        Elements elements = new Elements();
        elements.attr("colgroup","titlf");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testattr1() {
        Elements elements = new Elements();
        elements.attr("noembed","math");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testattr2() {
        Elements elements = new Elements();
        elements.attr("<0",":alm");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremoveAttr0() {
        Elements elements = new Elements();
        elements.removeAttr("imh");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremoveAttr1() {
        Elements elements = new Elements();
        elements.removeAttr("[a-zA-Z_:][-a-zA-Z0-9_:.]+");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremoveAttr2() {
        Elements elements = new Elements();
        elements.removeAttr("theac");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testaddClass0() {
        Elements elements = new Elements();
        elements.addClass("br");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testaddClass1() {
        Elements elements = new Elements();
        elements.addClass("noframet");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testaddClass2() {
        Elements elements = new Elements();
        elements.addClass("!=");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremoveClass0() {
        Elements elements = new Elements();
        elements.removeClass("checkboy");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremoveClass1() {
        Elements elements = new Elements();
        elements.removeClass("span");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremoveClass2() {
        Elements elements = new Elements();
        elements.removeClass(":eq)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtoggleClass0() {
        Elements elements = new Elements();
        elements.toggleClass(":has)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtoggleClass1() {
        Elements elements = new Elements();
        elements.toggleClass(":matchText");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtoggleClass2() {
        Elements elements = new Elements();
        elements.toggleClass("hidden");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasClass0() {
        Elements elements = new Elements();
        elements.hasClass("namd");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasClass1() {
        Elements elements = new Elements();
        elements.hasClass(":matchesOwn)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasClass2() {
        Elements elements = new Elements();
        elements.hasClass(":not)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testval0() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testval1() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testval2() {
        Elements elements = new Elements();
        elements.val();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testval0() {
        Elements elements = new Elements();
        elements.val("~<");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testval1() {
        Elements elements = new Elements();
        elements.val("#root");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testval2() {
        Elements elements = new Elements();
        elements.val("captiom");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtext0() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtext1() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtext2() {
        Elements elements = new Elements();
        elements.text();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasText0() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasText1() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhasText2() {
        Elements elements = new Elements();
        elements.hasText();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeachText0() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeachText1() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeachText2() {
        Elements elements = new Elements();
        elements.eachText();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhtml0() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhtml1() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhtml2() {
        Elements elements = new Elements();
        elements.html();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testouterHtml0() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testouterHtml1() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testouterHtml2() {
        Elements elements = new Elements();
        elements.outerHtml();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtoString0() {
        Elements elements = new Elements();
        elements.toString();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtoString1() {
        Elements elements = new Elements();
        elements.toString();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtoString2() {
        Elements elements = new Elements();
        elements.toString();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtagName0() {
        Elements elements = new Elements();
        elements.tagName("http:0");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtagName1() {
        Elements elements = new Elements();
        elements.tagName("titlf");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtagName2() {
        Elements elements = new Elements();
        elements.tagName("hreg");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhtml0() {
        Elements elements = new Elements();
        elements.html("#texu");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhtml1() {
        Elements elements = new Elements();
        elements.html(":lt)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testhtml2() {
        Elements elements = new Elements();
        elements.html("noembee");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprepend0() {
        Elements elements = new Elements();
        elements.prepend("typd");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprepend1() {
        Elements elements = new Elements();
        elements.prepend("text0");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprepend2() {
        Elements elements = new Elements();
        elements.prepend("http-equiu");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testappend0() {
        Elements elements = new Elements();
        elements.append(":has)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testappend1() {
        Elements elements = new Elements();
        elements.append("styld");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testappend2() {
        Elements elements = new Elements();
        elements.append(":last-chile");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testbefore0() {
        Elements elements = new Elements();
        elements.before("#texs");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testbefore1() {
        Elements elements = new Elements();
        elements.before("http-equiw");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testbefore2() {
        Elements elements = new Elements();
        elements.before("h2");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testafter0() {
        Elements elements = new Elements();
        elements.after("a");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testafter1() {
        Elements elements = new Elements();
        elements.after("captiom");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testafter2() {
        Elements elements = new Elements();
        elements.after("spao");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testwrap0() {
        Elements elements = new Elements();
        elements.wrap("htmk");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testwrap1() {
        Elements elements = new Elements();
        elements.wrap("charseu");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testwrap2() {
        Elements elements = new Elements();
        elements.wrap("sarcasl");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testunwrap0() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testunwrap1() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testunwrap2() {
        Elements elements = new Elements();
        elements.unwrap();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testempty0() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testempty1() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testempty2() {
        Elements elements = new Elements();
        elements.empty();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremove0() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremove1() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testremove2() {
        Elements elements = new Elements();
        elements.remove();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testselect0() {
        Elements elements = new Elements();
        elements.select("plaintexs");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testselect1() {
        Elements elements = new Elements();
        elements.select("disabled");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testselect2() {
        Elements elements = new Elements();
        elements.select("selecu");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnot0() {
        Elements elements = new Elements();
        elements.not("h2");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnot1() {
        Elements elements = new Elements();
        elements.not("script");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnot2() {
        Elements elements = new Elements();
        elements.not(":only-of-typd");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeq0() {
        Elements elements = new Elements();
        elements.eq(239);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeq1() {
        Elements elements = new Elements();
        elements.eq(1);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testeq2() {
        Elements elements = new Elements();
        elements.eq(187);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testis0() {
        Elements elements = new Elements();
        elements.is(":only-of-type");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testis1() {
        Elements elements = new Elements();
        elements.is("sarcasl");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testis2() {
        Elements elements = new Elements();
        elements.is("heae");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnext0() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnext1() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnext2() {
        Elements elements = new Elements();
        elements.next();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnext0() {
        Elements elements = new Elements();
        elements.next("noscrips");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnext1() {
        Elements elements = new Elements();
        elements.next("]]>");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnext2() {
        Elements elements = new Elements();
        elements.next("h4");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnextAll0() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnextAll1() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnextAll2() {
        Elements elements = new Elements();
        elements.nextAll();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnextAll0() {
        Elements elements = new Elements();
        elements.nextAll("isindex");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnextAll1() {
        Elements elements = new Elements();
        elements.nextAll("rubx");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testnextAll2() {
        Elements elements = new Elements();
        elements.nextAll(":nth-child)");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprev0() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprev1() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprev2() {
        Elements elements = new Elements();
        elements.prev();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprev0() {
        Elements elements = new Elements();
        elements.prev("radip");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprev1() {
        Elements elements = new Elements();
        elements.prev("name");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprev2() {
        Elements elements = new Elements();
        elements.prev("noscripu");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprevAll0() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprevAll1() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprevAll2() {
        Elements elements = new Elements();
        elements.prevAll();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprevAll0() {
        Elements elements = new Elements();
        elements.prevAll("forl");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprevAll1() {
        Elements elements = new Elements();
        elements.prevAll("*|");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testprevAll2() {
        Elements elements = new Elements();
        elements.prevAll("#texu");
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testsiblings0() {
        Elements elements = new Elements();
        elements.siblings("*=",true,true);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testsiblings1() {
        Elements elements = new Elements();
        elements.siblings(":nth-last-of-type)",true,true);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testsiblings2() {
        Elements elements = new Elements();
        elements.siblings("abs9",true,true);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testparents0() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testparents1() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testparents2() {
        Elements elements = new Elements();
        elements.parents();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testfirst0() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testfirst1() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testfirst2() {
        Elements elements = new Elements();
        elements.first();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testlast0() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testlast1() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testlast2() {
        Elements elements = new Elements();
        elements.last();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtraverse0() {
        Elements elements = new Elements();
        elements.traverse(null);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtraverse1() {
        Elements elements = new Elements();
        elements.traverse(null);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testtraverse2() {
        Elements elements = new Elements();
        elements.traverse(null);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testfilter0() {
        Elements elements = new Elements();
        elements.filter(null);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testfilter1() {
        Elements elements = new Elements();
        elements.filter(null);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testfilter2() {
        Elements elements = new Elements();
        elements.filter(null);
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testforms0() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testforms1() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testforms2() {
        Elements elements = new Elements();
        elements.forms();
        assertTrue(elements.equals(elements));
    }
    @Test
    public void testparse0() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("radin");
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testparse1() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("tr");
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testparse2() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse("mati");
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testparse0() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testparse1() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testparse2() {
        QueryParser queryparser = new QueryParser();
        queryparser.parse();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcombinator0() {
        QueryParser queryparser = new QueryParser();
        queryparser.combinator(A);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcombinator1() {
        QueryParser queryparser = new QueryParser();
        queryparser.combinator(Y);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcombinator2() {
        QueryParser queryparser = new QueryParser();
        queryparser.combinator();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testconsumeSubQuery0() {
        QueryParser queryparser = new QueryParser();
        queryparser.consumeSubQuery();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testconsumeSubQuery1() {
        QueryParser queryparser = new QueryParser();
        queryparser.consumeSubQuery();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testconsumeSubQuery2() {
        QueryParser queryparser = new QueryParser();
        queryparser.consumeSubQuery();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testfindElements0() {
        QueryParser queryparser = new QueryParser();
        queryparser.findElements();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testfindElements1() {
        QueryParser queryparser = new QueryParser();
        queryparser.findElements();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testfindElements2() {
        QueryParser queryparser = new QueryParser();
        queryparser.findElements();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyId0() {
        QueryParser queryparser = new QueryParser();
        queryparser.byId();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyId1() {
        QueryParser queryparser = new QueryParser();
        queryparser.byId();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyId2() {
        QueryParser queryparser = new QueryParser();
        queryparser.byId();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyClass0() {
        QueryParser queryparser = new QueryParser();
        queryparser.byClass();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyClass1() {
        QueryParser queryparser = new QueryParser();
        queryparser.byClass();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyClass2() {
        QueryParser queryparser = new QueryParser();
        queryparser.byClass();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyTag0() {
        QueryParser queryparser = new QueryParser();
        queryparser.byTag();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyTag1() {
        QueryParser queryparser = new QueryParser();
        queryparser.byTag();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyTag2() {
        QueryParser queryparser = new QueryParser();
        queryparser.byTag();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyAttribute0() {
        QueryParser queryparser = new QueryParser();
        queryparser.byAttribute();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyAttribute1() {
        QueryParser queryparser = new QueryParser();
        queryparser.byAttribute();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testbyAttribute2() {
        QueryParser queryparser = new QueryParser();
        queryparser.byAttribute();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testallElements0() {
        QueryParser queryparser = new QueryParser();
        queryparser.allElements();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testallElements1() {
        QueryParser queryparser = new QueryParser();
        queryparser.allElements();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testallElements2() {
        QueryParser queryparser = new QueryParser();
        queryparser.allElements();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexLessThan0() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexLessThan();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexLessThan1() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexLessThan();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexLessThan2() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexLessThan();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexGreaterThan0() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexGreaterThan();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexGreaterThan1() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexGreaterThan();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexGreaterThan2() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexGreaterThan();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexEquals0() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexEquals();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexEquals1() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexEquals();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testindexEquals2() {
        QueryParser queryparser = new QueryParser();
        queryparser.indexEquals();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcssNthChild0() {
        QueryParser queryparser = new QueryParser();
        queryparser.cssNthChild(true,true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcssNthChild1() {
        QueryParser queryparser = new QueryParser();
        queryparser.cssNthChild(true,true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcssNthChild2() {
        QueryParser queryparser = new QueryParser();
        queryparser.cssNthChild(true,true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testconsumeIndex0() {
        QueryParser queryparser = new QueryParser();
        queryparser.consumeIndex();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testconsumeIndex1() {
        QueryParser queryparser = new QueryParser();
        queryparser.consumeIndex();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testconsumeIndex2() {
        QueryParser queryparser = new QueryParser();
        queryparser.consumeIndex();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testhas0() {
        QueryParser queryparser = new QueryParser();
        queryparser.has();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testhas1() {
        QueryParser queryparser = new QueryParser();
        queryparser.has();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testhas2() {
        QueryParser queryparser = new QueryParser();
        queryparser.has();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcontains0() {
        QueryParser queryparser = new QueryParser();
        queryparser.contains(true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcontains1() {
        QueryParser queryparser = new QueryParser();
        queryparser.contains(true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcontains2() {
        QueryParser queryparser = new QueryParser();
        queryparser.contains(true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcontainsData0() {
        QueryParser queryparser = new QueryParser();
        queryparser.containsData();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcontainsData1() {
        QueryParser queryparser = new QueryParser();
        queryparser.containsData();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testcontainsData2() {
        QueryParser queryparser = new QueryParser();
        queryparser.containsData();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testmatches0() {
        QueryParser queryparser = new QueryParser();
        queryparser.matches(true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testmatches1() {
        QueryParser queryparser = new QueryParser();
        queryparser.matches(true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testmatches2() {
        QueryParser queryparser = new QueryParser();
        queryparser.matches(true);
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testnot0() {
        QueryParser queryparser = new QueryParser();
        queryparser.not();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testnot1() {
        QueryParser queryparser = new QueryParser();
        queryparser.not();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testnot2() {
        QueryParser queryparser = new QueryParser();
        queryparser.not();
        assertTrue(queryparser.equals(queryparser));
    }
    @Test
    public void testrightMostEvaluator0() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.rightMostEvaluator();
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testrightMostEvaluator1() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.rightMostEvaluator();
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testrightMostEvaluator2() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.rightMostEvaluator();
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testreplaceRightMostEvaluator0() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.replaceRightMostEvaluator(null);
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testreplaceRightMostEvaluator1() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.replaceRightMostEvaluator(null);
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testreplaceRightMostEvaluator2() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.replaceRightMostEvaluator(null);
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testupdateNumEvaluators0() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.updateNumEvaluators();
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testupdateNumEvaluators1() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.updateNumEvaluators();
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testupdateNumEvaluators2() {
        CombiningEvaluator combiningevaluator = new CombiningEvaluator();
        combiningevaluator.updateNumEvaluators();
        assertTrue(combiningevaluator.equals(combiningevaluator));
    }
    @Test
    public void testmatches0() {
        And and = new And();
        and.matches(null,null);
        assertTrue(and.equals(and));
    }
    @Test
    public void testmatches1() {
        And and = new And();
        and.matches(null,null);
        assertTrue(and.equals(and));
    }
    @Test
    public void testmatches2() {
        And and = new And();
        and.matches(null,null);
        assertTrue(and.equals(and));
    }
    @Test
    public void testtoString0() {
        And and = new And();
        and.toString();
        assertTrue(and.equals(and));
    }
    @Test
    public void testtoString1() {
        And and = new And();
        and.toString();
        assertTrue(and.equals(and));
    }
    @Test
    public void testtoString2() {
        And and = new And();
        and.toString();
        assertTrue(and.equals(and));
    }
    @Test
    public void testadd0() {
        Or or = new Or();
        or.add(null);
        assertTrue(or.equals(or));
    }
    @Test
    public void testadd1() {
        Or or = new Or();
        or.add(null);
        assertTrue(or.equals(or));
    }
    @Test
    public void testadd2() {
        Or or = new Or();
        or.add(null);
        assertTrue(or.equals(or));
    }
    @Test
    public void testmatches0() {
        Or or = new Or();
        or.matches(null,null);
        assertTrue(or.equals(or));
    }
    @Test
    public void testmatches1() {
        Or or = new Or();
        or.matches(null,null);
        assertTrue(or.equals(or));
    }
    @Test
    public void testmatches2() {
        Or or = new Or();
        or.matches(null,null);
        assertTrue(or.equals(or));
    }
    @Test
    public void testtoString0() {
        Or or = new Or();
        or.toString();
        assertTrue(or.equals(or));
    }
    @Test
    public void testtoString1() {
        Or or = new Or();
        or.toString();
        assertTrue(or.equals(or));
    }
    @Test
    public void testtoString2() {
        Or or = new Or();
        or.toString();
        assertTrue(or.equals(or));
    }
    @Test
    public void testselect0() {
        Selector selector = new Selector();
        selector.select("http:0",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect1() {
        Selector selector = new Selector();
        selector.select("~=",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect2() {
        Selector selector = new Selector();
        selector.select(":containsOwn'",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect0() {
        Selector selector = new Selector();
        selector.select(null,null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect1() {
        Selector selector = new Selector();
        selector.select(null,null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect2() {
        Selector selector = new Selector();
        selector.select(null,null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect0() {
        Selector selector = new Selector();
        selector.select("namd",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect1() {
        Selector selector = new Selector();
        selector.select("lj",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselect2() {
        Selector selector = new Selector();
        selector.select("checkbow",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testfilterOut0() {
        Selector selector = new Selector();
        selector.filterOut(null,null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testfilterOut1() {
        Selector selector = new Selector();
        selector.filterOut(null,null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testfilterOut2() {
        Selector selector = new Selector();
        selector.filterOut(null,null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselectFirst0() {
        Selector selector = new Selector();
        selector.selectFirst(":only-chilc",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselectFirst1() {
        Selector selector = new Selector();
        selector.selectFirst("http-equiw",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testselectFirst2() {
        Selector selector = new Selector();
        selector.selectFirst("svg",null);
        assertTrue(selector.equals(selector));
    }
    @Test
    public void testmatches0() {
        Evaluator evaluator = new Evaluator();
        evaluator.matches(null,null);
        assertTrue(evaluator.equals(evaluator));
    }
    @Test
    public void testmatches1() {
        Evaluator evaluator = new Evaluator();
        evaluator.matches(null,null);
        assertTrue(evaluator.equals(evaluator));
    }
    @Test
    public void testmatches2() {
        Evaluator evaluator = new Evaluator();
        evaluator.matches(null,null);
        assertTrue(evaluator.equals(evaluator));
    }
    @Test
    public void testmatches0() {
        Tag tag = new Tag();
        tag.matches(null,null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testmatches1() {
        Tag tag = new Tag();
        tag.matches(null,null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testmatches2() {
        Tag tag = new Tag();
        tag.matches(null,null);
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testtoString0() {
        Tag tag = new Tag();
        tag.toString();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testtoString1() {
        Tag tag = new Tag();
        tag.toString();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testtoString2() {
        Tag tag = new Tag();
        tag.toString();
        assertTrue(tag.equals(tag));
    }
    @Test
    public void testmatches0() {
        TagEndsWith tagendswith = new TagEndsWith();
        tagendswith.matches(null,null);
        assertTrue(tagendswith.equals(tagendswith));
    }
    @Test
    public void testmatches1() {
        TagEndsWith tagendswith = new TagEndsWith();
        tagendswith.matches(null,null);
        assertTrue(tagendswith.equals(tagendswith));
    }
    @Test
    public void testmatches2() {
        TagEndsWith tagendswith = new TagEndsWith();
        tagendswith.matches(null,null);
        assertTrue(tagendswith.equals(tagendswith));
    }
    @Test
    public void testtoString0() {
        TagEndsWith tagendswith = new TagEndsWith();
        tagendswith.toString();
        assertTrue(tagendswith.equals(tagendswith));
    }
    @Test
    public void testtoString1() {
        TagEndsWith tagendswith = new TagEndsWith();
        tagendswith.toString();
        assertTrue(tagendswith.equals(tagendswith));
    }
    @Test
    public void testtoString2() {
        TagEndsWith tagendswith = new TagEndsWith();
        tagendswith.toString();
        assertTrue(tagendswith.equals(tagendswith));
    }
    @Test
    public void testmatches0() {
        Id id = new Id();
        id.matches(null,null);
        assertTrue(id.equals(id));
    }
    @Test
    public void testmatches1() {
        Id id = new Id();
        id.matches(null,null);
        assertTrue(id.equals(id));
    }
    @Test
    public void testmatches2() {
        Id id = new Id();
        id.matches(null,null);
        assertTrue(id.equals(id));
    }
    @Test
    public void testtoString0() {
        Id id = new Id();
        id.toString();
        assertTrue(id.equals(id));
    }
    @Test
    public void testtoString1() {
        Id id = new Id();
        id.toString();
        assertTrue(id.equals(id));
    }
    @Test
    public void testtoString2() {
        Id id = new Id();
        id.toString();
        assertTrue(id.equals(id));
    }
    @Test
    public void testmatches0() {
        Class class = new Class();
        class.matches(null,null);
        assertTrue(class.equals(class));
    }
    @Test
    public void testmatches1() {
        Class class = new Class();
        class.matches(null,null);
        assertTrue(class.equals(class));
    }
    @Test
    public void testmatches2() {
        Class class = new Class();
        class.matches(null,null);
        assertTrue(class.equals(class));
    }
    @Test
    public void testtoString0() {
        Class class = new Class();
        class.toString();
        assertTrue(class.equals(class));
    }
    @Test
    public void testtoString1() {
        Class class = new Class();
        class.toString();
        assertTrue(class.equals(class));
    }
    @Test
    public void testtoString2() {
        Class class = new Class();
        class.toString();
        assertTrue(class.equals(class));
    }
    @Test
    public void testmatches0() {
        Attribute attribute = new Attribute();
        attribute.matches(null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testmatches1() {
        Attribute attribute = new Attribute();
        attribute.matches(null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testmatches2() {
        Attribute attribute = new Attribute();
        attribute.matches(null,null);
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testtoString0() {
        Attribute attribute = new Attribute();
        attribute.toString();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testtoString1() {
        Attribute attribute = new Attribute();
        attribute.toString();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testtoString2() {
        Attribute attribute = new Attribute();
        attribute.toString();
        assertTrue(attribute.equals(attribute));
    }
    @Test
    public void testmatches0() {
        AttributeStarting attributestarting = new AttributeStarting();
        attributestarting.matches(null,null);
        assertTrue(attributestarting.equals(attributestarting));
    }
    @Test
    public void testmatches1() {
        AttributeStarting attributestarting = new AttributeStarting();
        attributestarting.matches(null,null);
        assertTrue(attributestarting.equals(attributestarting));
    }
    @Test
    public void testmatches2() {
        AttributeStarting attributestarting = new AttributeStarting();
        attributestarting.matches(null,null);
        assertTrue(attributestarting.equals(attributestarting));
    }
    @Test
    public void testtoString0() {
        AttributeStarting attributestarting = new AttributeStarting();
        attributestarting.toString();
        assertTrue(attributestarting.equals(attributestarting));
    }
    @Test
    public void testtoString1() {
        AttributeStarting attributestarting = new AttributeStarting();
        attributestarting.toString();
        assertTrue(attributestarting.equals(attributestarting));
    }
    @Test
    public void testtoString2() {
        AttributeStarting attributestarting = new AttributeStarting();
        attributestarting.toString();
        assertTrue(attributestarting.equals(attributestarting));
    }
    @Test
    public void testmatches0() {
        AttributeWithValue attributewithvalue = new AttributeWithValue();
        attributewithvalue.matches(null,null);
        assertTrue(attributewithvalue.equals(attributewithvalue));
    }
    @Test
    public void testmatches1() {
        AttributeWithValue attributewithvalue = new AttributeWithValue();
        attributewithvalue.matches(null,null);
        assertTrue(attributewithvalue.equals(attributewithvalue));
    }
    @Test
    public void testmatches2() {
        AttributeWithValue attributewithvalue = new AttributeWithValue();
        attributewithvalue.matches(null,null);
        assertTrue(attributewithvalue.equals(attributewithvalue));
    }
    @Test
    public void testtoString0() {
        AttributeWithValue attributewithvalue = new AttributeWithValue();
        attributewithvalue.toString();
        assertTrue(attributewithvalue.equals(attributewithvalue));
    }
    @Test
    public void testtoString1() {
        AttributeWithValue attributewithvalue = new AttributeWithValue();
        attributewithvalue.toString();
        assertTrue(attributewithvalue.equals(attributewithvalue));
    }
    @Test
    public void testtoString2() {
        AttributeWithValue attributewithvalue = new AttributeWithValue();
        attributewithvalue.toString();
        assertTrue(attributewithvalue.equals(attributewithvalue));
    }
    @Test
    public void testmatches0() {
        AttributeWithValueNot attributewithvaluenot = new AttributeWithValueNot();
        attributewithvaluenot.matches(null,null);
        assertTrue(attributewithvaluenot.equals(attributewithvaluenot));
    }
    @Test
    public void testmatches1() {
        AttributeWithValueNot attributewithvaluenot = new AttributeWithValueNot();
        attributewithvaluenot.matches(null,null);
        assertTrue(attributewithvaluenot.equals(attributewithvaluenot));
    }
    @Test
    public void testmatches2() {
        AttributeWithValueNot attributewithvaluenot = new AttributeWithValueNot();
        attributewithvaluenot.matches(null,null);
        assertTrue(attributewithvaluenot.equals(attributewithvaluenot));
    }
    @Test
    public void testtoString0() {
        AttributeWithValueNot attributewithvaluenot = new AttributeWithValueNot();
        attributewithvaluenot.toString();
        assertTrue(attributewithvaluenot.equals(attributewithvaluenot));
    }
    @Test
    public void testtoString1() {
        AttributeWithValueNot attributewithvaluenot = new AttributeWithValueNot();
        attributewithvaluenot.toString();
        assertTrue(attributewithvaluenot.equals(attributewithvaluenot));
    }
    @Test
    public void testtoString2() {
        AttributeWithValueNot attributewithvaluenot = new AttributeWithValueNot();
        attributewithvaluenot.toString();
        assertTrue(attributewithvaluenot.equals(attributewithvaluenot));
    }
    @Test
    public void testmatches0() {
        AttributeWithValueStarting attributewithvaluestarting = new AttributeWithValueStarting();
        attributewithvaluestarting.matches(null,null);
        assertTrue(attributewithvaluestarting.equals(attributewithvaluestarting));
    }
    @Test
    public void testmatches1() {
        AttributeWithValueStarting attributewithvaluestarting = new AttributeWithValueStarting();
        attributewithvaluestarting.matches(null,null);
        assertTrue(attributewithvaluestarting.equals(attributewithvaluestarting));
    }
    @Test
    public void testmatches2() {
        AttributeWithValueStarting attributewithvaluestarting = new AttributeWithValueStarting();
        attributewithvaluestarting.matches(null,null);
        assertTrue(attributewithvaluestarting.equals(attributewithvaluestarting));
    }
    @Test
    public void testtoString0() {
        AttributeWithValueStarting attributewithvaluestarting = new AttributeWithValueStarting();
        attributewithvaluestarting.toString();
        assertTrue(attributewithvaluestarting.equals(attributewithvaluestarting));
    }
    @Test
    public void testtoString1() {
        AttributeWithValueStarting attributewithvaluestarting = new AttributeWithValueStarting();
        attributewithvaluestarting.toString();
        assertTrue(attributewithvaluestarting.equals(attributewithvaluestarting));
    }
    @Test
    public void testtoString2() {
        AttributeWithValueStarting attributewithvaluestarting = new AttributeWithValueStarting();
        attributewithvaluestarting.toString();
        assertTrue(attributewithvaluestarting.equals(attributewithvaluestarting));
    }
    @Test
    public void testmatches0() {
        AttributeWithValueEnding attributewithvalueending = new AttributeWithValueEnding();
        attributewithvalueending.matches(null,null);
        assertTrue(attributewithvalueending.equals(attributewithvalueending));
    }
    @Test
    public void testmatches1() {
        AttributeWithValueEnding attributewithvalueending = new AttributeWithValueEnding();
        attributewithvalueending.matches(null,null);
        assertTrue(attributewithvalueending.equals(attributewithvalueending));
    }
    @Test
    public void testmatches2() {
        AttributeWithValueEnding attributewithvalueending = new AttributeWithValueEnding();
        attributewithvalueending.matches(null,null);
        assertTrue(attributewithvalueending.equals(attributewithvalueending));
    }
    @Test
    public void testtoString0() {
        AttributeWithValueEnding attributewithvalueending = new AttributeWithValueEnding();
        attributewithvalueending.toString();
        assertTrue(attributewithvalueending.equals(attributewithvalueending));
    }
    @Test
    public void testtoString1() {
        AttributeWithValueEnding attributewithvalueending = new AttributeWithValueEnding();
        attributewithvalueending.toString();
        assertTrue(attributewithvalueending.equals(attributewithvalueending));
    }
    @Test
    public void testtoString2() {
        AttributeWithValueEnding attributewithvalueending = new AttributeWithValueEnding();
        attributewithvalueending.toString();
        assertTrue(attributewithvalueending.equals(attributewithvalueending));
    }
    @Test
    public void testmatches0() {
        AttributeWithValueContaining attributewithvaluecontaining = new AttributeWithValueContaining();
        attributewithvaluecontaining.matches(null,null);
        assertTrue(attributewithvaluecontaining.equals(attributewithvaluecontaining));
    }
    @Test
    public void testmatches1() {
        AttributeWithValueContaining attributewithvaluecontaining = new AttributeWithValueContaining();
        attributewithvaluecontaining.matches(null,null);
        assertTrue(attributewithvaluecontaining.equals(attributewithvaluecontaining));
    }
    @Test
    public void testmatches2() {
        AttributeWithValueContaining attributewithvaluecontaining = new AttributeWithValueContaining();
        attributewithvaluecontaining.matches(null,null);
        assertTrue(attributewithvaluecontaining.equals(attributewithvaluecontaining));
    }
    @Test
    public void testtoString0() {
        AttributeWithValueContaining attributewithvaluecontaining = new AttributeWithValueContaining();
        attributewithvaluecontaining.toString();
        assertTrue(attributewithvaluecontaining.equals(attributewithvaluecontaining));
    }
    @Test
    public void testtoString1() {
        AttributeWithValueContaining attributewithvaluecontaining = new AttributeWithValueContaining();
        attributewithvaluecontaining.toString();
        assertTrue(attributewithvaluecontaining.equals(attributewithvaluecontaining));
    }
    @Test
    public void testtoString2() {
        AttributeWithValueContaining attributewithvaluecontaining = new AttributeWithValueContaining();
        attributewithvaluecontaining.toString();
        assertTrue(attributewithvaluecontaining.equals(attributewithvaluecontaining));
    }
    @Test
    public void testmatches0() {
        AttributeWithValueMatching attributewithvaluematching = new AttributeWithValueMatching();
        attributewithvaluematching.matches(null,null);
        assertTrue(attributewithvaluematching.equals(attributewithvaluematching));
    }
    @Test
    public void testmatches1() {
        AttributeWithValueMatching attributewithvaluematching = new AttributeWithValueMatching();
        attributewithvaluematching.matches(null,null);
        assertTrue(attributewithvaluematching.equals(attributewithvaluematching));
    }
    @Test
    public void testmatches2() {
        AttributeWithValueMatching attributewithvaluematching = new AttributeWithValueMatching();
        attributewithvaluematching.matches(null,null);
        assertTrue(attributewithvaluematching.equals(attributewithvaluematching));
    }
    @Test
    public void testtoString0() {
        AttributeWithValueMatching attributewithvaluematching = new AttributeWithValueMatching();
        attributewithvaluematching.toString();
        assertTrue(attributewithvaluematching.equals(attributewithvaluematching));
    }
    @Test
    public void testtoString1() {
        AttributeWithValueMatching attributewithvaluematching = new AttributeWithValueMatching();
        attributewithvaluematching.toString();
        assertTrue(attributewithvaluematching.equals(attributewithvaluematching));
    }
    @Test
    public void testtoString2() {
        AttributeWithValueMatching attributewithvaluematching = new AttributeWithValueMatching();
        attributewithvaluematching.toString();
        assertTrue(attributewithvaluematching.equals(attributewithvaluematching));
    }
    @Test
    public void testmatches0() {
        AllElements allelements = new AllElements();
        allelements.matches(null,null);
        assertTrue(allelements.equals(allelements));
    }
    @Test
    public void testmatches1() {
        AllElements allelements = new AllElements();
        allelements.matches(null,null);
        assertTrue(allelements.equals(allelements));
    }
    @Test
    public void testmatches2() {
        AllElements allelements = new AllElements();
        allelements.matches(null,null);
        assertTrue(allelements.equals(allelements));
    }
    @Test
    public void testtoString0() {
        AllElements allelements = new AllElements();
        allelements.toString();
        assertTrue(allelements.equals(allelements));
    }
    @Test
    public void testtoString1() {
        AllElements allelements = new AllElements();
        allelements.toString();
        assertTrue(allelements.equals(allelements));
    }
    @Test
    public void testtoString2() {
        AllElements allelements = new AllElements();
        allelements.toString();
        assertTrue(allelements.equals(allelements));
    }
    @Test
    public void testmatches0() {
        IndexLessThan indexlessthan = new IndexLessThan();
        indexlessthan.matches(null,null);
        assertTrue(indexlessthan.equals(indexlessthan));
    }
    @Test
    public void testmatches1() {
        IndexLessThan indexlessthan = new IndexLessThan();
        indexlessthan.matches(null,null);
        assertTrue(indexlessthan.equals(indexlessthan));
    }
    @Test
    public void testmatches2() {
        IndexLessThan indexlessthan = new IndexLessThan();
        indexlessthan.matches(null,null);
        assertTrue(indexlessthan.equals(indexlessthan));
    }
    @Test
    public void testtoString0() {
        IndexLessThan indexlessthan = new IndexLessThan();
        indexlessthan.toString();
        assertTrue(indexlessthan.equals(indexlessthan));
    }
    @Test
    public void testtoString1() {
        IndexLessThan indexlessthan = new IndexLessThan();
        indexlessthan.toString();
        assertTrue(indexlessthan.equals(indexlessthan));
    }
    @Test
    public void testtoString2() {
        IndexLessThan indexlessthan = new IndexLessThan();
        indexlessthan.toString();
        assertTrue(indexlessthan.equals(indexlessthan));
    }
    @Test
    public void testmatches0() {
        IndexGreaterThan indexgreaterthan = new IndexGreaterThan();
        indexgreaterthan.matches(null,null);
        assertTrue(indexgreaterthan.equals(indexgreaterthan));
    }
    @Test
    public void testmatches1() {
        IndexGreaterThan indexgreaterthan = new IndexGreaterThan();
        indexgreaterthan.matches(null,null);
        assertTrue(indexgreaterthan.equals(indexgreaterthan));
    }
    @Test
    public void testmatches2() {
        IndexGreaterThan indexgreaterthan = new IndexGreaterThan();
        indexgreaterthan.matches(null,null);
        assertTrue(indexgreaterthan.equals(indexgreaterthan));
    }
    @Test
    public void testtoString0() {
        IndexGreaterThan indexgreaterthan = new IndexGreaterThan();
        indexgreaterthan.toString();
        assertTrue(indexgreaterthan.equals(indexgreaterthan));
    }
    @Test
    public void testtoString1() {
        IndexGreaterThan indexgreaterthan = new IndexGreaterThan();
        indexgreaterthan.toString();
        assertTrue(indexgreaterthan.equals(indexgreaterthan));
    }
    @Test
    public void testtoString2() {
        IndexGreaterThan indexgreaterthan = new IndexGreaterThan();
        indexgreaterthan.toString();
        assertTrue(indexgreaterthan.equals(indexgreaterthan));
    }
    @Test
    public void testmatches0() {
        IndexEquals indexequals = new IndexEquals();
        indexequals.matches(null,null);
        assertTrue(indexequals.equals(indexequals));
    }
    @Test
    public void testmatches1() {
        IndexEquals indexequals = new IndexEquals();
        indexequals.matches(null,null);
        assertTrue(indexequals.equals(indexequals));
    }
    @Test
    public void testmatches2() {
        IndexEquals indexequals = new IndexEquals();
        indexequals.matches(null,null);
        assertTrue(indexequals.equals(indexequals));
    }
    @Test
    public void testtoString0() {
        IndexEquals indexequals = new IndexEquals();
        indexequals.toString();
        assertTrue(indexequals.equals(indexequals));
    }
    @Test
    public void testtoString1() {
        IndexEquals indexequals = new IndexEquals();
        indexequals.toString();
        assertTrue(indexequals.equals(indexequals));
    }
    @Test
    public void testtoString2() {
        IndexEquals indexequals = new IndexEquals();
        indexequals.toString();
        assertTrue(indexequals.equals(indexequals));
    }
    @Test
    public void testmatches0() {
        IsLastChild islastchild = new IsLastChild();
        islastchild.matches(null,null);
        assertTrue(islastchild.equals(islastchild));
    }
    @Test
    public void testmatches1() {
        IsLastChild islastchild = new IsLastChild();
        islastchild.matches(null,null);
        assertTrue(islastchild.equals(islastchild));
    }
    @Test
    public void testmatches2() {
        IsLastChild islastchild = new IsLastChild();
        islastchild.matches(null,null);
        assertTrue(islastchild.equals(islastchild));
    }
    @Test
    public void testtoString0() {
        IsLastChild islastchild = new IsLastChild();
        islastchild.toString();
        assertTrue(islastchild.equals(islastchild));
    }
    @Test
    public void testtoString1() {
        IsLastChild islastchild = new IsLastChild();
        islastchild.toString();
        assertTrue(islastchild.equals(islastchild));
    }
    @Test
    public void testtoString2() {
        IsLastChild islastchild = new IsLastChild();
        islastchild.toString();
        assertTrue(islastchild.equals(islastchild));
    }
    @Test
    public void testtoString0() {
        IsFirstOfType isfirstoftype = new IsFirstOfType();
        isfirstoftype.toString();
        assertTrue(isfirstoftype.equals(isfirstoftype));
    }
    @Test
    public void testtoString1() {
        IsFirstOfType isfirstoftype = new IsFirstOfType();
        isfirstoftype.toString();
        assertTrue(isfirstoftype.equals(isfirstoftype));
    }
    @Test
    public void testtoString2() {
        IsFirstOfType isfirstoftype = new IsFirstOfType();
        isfirstoftype.toString();
        assertTrue(isfirstoftype.equals(isfirstoftype));
    }
    @Test
    public void testtoString0() {
        IsLastOfType islastoftype = new IsLastOfType();
        islastoftype.toString();
        assertTrue(islastoftype.equals(islastoftype));
    }
    @Test
    public void testtoString1() {
        IsLastOfType islastoftype = new IsLastOfType();
        islastoftype.toString();
        assertTrue(islastoftype.equals(islastoftype));
    }
    @Test
    public void testtoString2() {
        IsLastOfType islastoftype = new IsLastOfType();
        islastoftype.toString();
        assertTrue(islastoftype.equals(islastoftype));
    }
    @Test
    public void testmatches0() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.matches(null,null);
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testmatches1() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.matches(null,null);
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testmatches2() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.matches(null,null);
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testtoString0() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.toString();
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testtoString1() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.toString();
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testtoString2() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.toString();
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testgetPseudoClass0() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.getPseudoClass();
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testgetPseudoClass1() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.getPseudoClass();
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testgetPseudoClass2() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.getPseudoClass();
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testcalculatePosition0() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.calculatePosition(null,null);
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testcalculatePosition1() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.calculatePosition(null,null);
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testcalculatePosition2() {
        CssNthEvaluator cssnthevaluator = new CssNthEvaluator();
        cssnthevaluator.calculatePosition(null,null);
        assertTrue(cssnthevaluator.equals(cssnthevaluator));
    }
    @Test
    public void testcalculatePosition0() {
        IsNthChild isnthchild = new IsNthChild();
        isnthchild.calculatePosition(null,null);
        assertTrue(isnthchild.equals(isnthchild));
    }
    @Test
    public void testcalculatePosition1() {
        IsNthChild isnthchild = new IsNthChild();
        isnthchild.calculatePosition(null,null);
        assertTrue(isnthchild.equals(isnthchild));
    }
    @Test
    public void testcalculatePosition2() {
        IsNthChild isnthchild = new IsNthChild();
        isnthchild.calculatePosition(null,null);
        assertTrue(isnthchild.equals(isnthchild));
    }
    @Test
    public void testgetPseudoClass0() {
        IsNthChild isnthchild = new IsNthChild();
        isnthchild.getPseudoClass();
        assertTrue(isnthchild.equals(isnthchild));
    }
    @Test
    public void testgetPseudoClass1() {
        IsNthChild isnthchild = new IsNthChild();
        isnthchild.getPseudoClass();
        assertTrue(isnthchild.equals(isnthchild));
    }
    @Test
    public void testgetPseudoClass2() {
        IsNthChild isnthchild = new IsNthChild();
        isnthchild.getPseudoClass();
        assertTrue(isnthchild.equals(isnthchild));
    }
    @Test
    public void testcalculatePosition0() {
        IsNthLastChild isnthlastchild = new IsNthLastChild();
        isnthlastchild.calculatePosition(null,null);
        assertTrue(isnthlastchild.equals(isnthlastchild));
    }
    @Test
    public void testcalculatePosition1() {
        IsNthLastChild isnthlastchild = new IsNthLastChild();
        isnthlastchild.calculatePosition(null,null);
        assertTrue(isnthlastchild.equals(isnthlastchild));
    }
    @Test
    public void testcalculatePosition2() {
        IsNthLastChild isnthlastchild = new IsNthLastChild();
        isnthlastchild.calculatePosition(null,null);
        assertTrue(isnthlastchild.equals(isnthlastchild));
    }
    @Test
    public void testgetPseudoClass0() {
        IsNthLastChild isnthlastchild = new IsNthLastChild();
        isnthlastchild.getPseudoClass();
        assertTrue(isnthlastchild.equals(isnthlastchild));
    }
    @Test
    public void testgetPseudoClass1() {
        IsNthLastChild isnthlastchild = new IsNthLastChild();
        isnthlastchild.getPseudoClass();
        assertTrue(isnthlastchild.equals(isnthlastchild));
    }
    @Test
    public void testgetPseudoClass2() {
        IsNthLastChild isnthlastchild = new IsNthLastChild();
        isnthlastchild.getPseudoClass();
        assertTrue(isnthlastchild.equals(isnthlastchild));
    }
    @Test
    public void testcalculatePosition0() {
        IsNthOfType isnthoftype = new IsNthOfType();
        isnthoftype.calculatePosition(null,null);
        assertTrue(isnthoftype.equals(isnthoftype));
    }
    @Test
    public void testcalculatePosition1() {
        IsNthOfType isnthoftype = new IsNthOfType();
        isnthoftype.calculatePosition(null,null);
        assertTrue(isnthoftype.equals(isnthoftype));
    }
    @Test
    public void testcalculatePosition2() {
        IsNthOfType isnthoftype = new IsNthOfType();
        isnthoftype.calculatePosition(null,null);
        assertTrue(isnthoftype.equals(isnthoftype));
    }
    @Test
    public void testgetPseudoClass0() {
        IsNthOfType isnthoftype = new IsNthOfType();
        isnthoftype.getPseudoClass();
        assertTrue(isnthoftype.equals(isnthoftype));
    }
    @Test
    public void testgetPseudoClass1() {
        IsNthOfType isnthoftype = new IsNthOfType();
        isnthoftype.getPseudoClass();
        assertTrue(isnthoftype.equals(isnthoftype));
    }
    @Test
    public void testgetPseudoClass2() {
        IsNthOfType isnthoftype = new IsNthOfType();
        isnthoftype.getPseudoClass();
        assertTrue(isnthoftype.equals(isnthoftype));
    }
    @Test
    public void testcalculatePosition0() {
        IsNthLastOfType isnthlastoftype = new IsNthLastOfType();
        isnthlastoftype.calculatePosition(null,null);
        assertTrue(isnthlastoftype.equals(isnthlastoftype));
    }
    @Test
    public void testcalculatePosition1() {
        IsNthLastOfType isnthlastoftype = new IsNthLastOfType();
        isnthlastoftype.calculatePosition(null,null);
        assertTrue(isnthlastoftype.equals(isnthlastoftype));
    }
    @Test
    public void testcalculatePosition2() {
        IsNthLastOfType isnthlastoftype = new IsNthLastOfType();
        isnthlastoftype.calculatePosition(null,null);
        assertTrue(isnthlastoftype.equals(isnthlastoftype));
    }
    @Test
    public void testgetPseudoClass0() {
        IsNthLastOfType isnthlastoftype = new IsNthLastOfType();
        isnthlastoftype.getPseudoClass();
        assertTrue(isnthlastoftype.equals(isnthlastoftype));
    }
    @Test
    public void testgetPseudoClass1() {
        IsNthLastOfType isnthlastoftype = new IsNthLastOfType();
        isnthlastoftype.getPseudoClass();
        assertTrue(isnthlastoftype.equals(isnthlastoftype));
    }
    @Test
    public void testgetPseudoClass2() {
        IsNthLastOfType isnthlastoftype = new IsNthLastOfType();
        isnthlastoftype.getPseudoClass();
        assertTrue(isnthlastoftype.equals(isnthlastoftype));
    }
    @Test
    public void testmatches0() {
        IsFirstChild isfirstchild = new IsFirstChild();
        isfirstchild.matches(null,null);
        assertTrue(isfirstchild.equals(isfirstchild));
    }
    @Test
    public void testmatches1() {
        IsFirstChild isfirstchild = new IsFirstChild();
        isfirstchild.matches(null,null);
        assertTrue(isfirstchild.equals(isfirstchild));
    }
    @Test
    public void testmatches2() {
        IsFirstChild isfirstchild = new IsFirstChild();
        isfirstchild.matches(null,null);
        assertTrue(isfirstchild.equals(isfirstchild));
    }
    @Test
    public void testtoString0() {
        IsFirstChild isfirstchild = new IsFirstChild();
        isfirstchild.toString();
        assertTrue(isfirstchild.equals(isfirstchild));
    }
    @Test
    public void testtoString1() {
        IsFirstChild isfirstchild = new IsFirstChild();
        isfirstchild.toString();
        assertTrue(isfirstchild.equals(isfirstchild));
    }
    @Test
    public void testtoString2() {
        IsFirstChild isfirstchild = new IsFirstChild();
        isfirstchild.toString();
        assertTrue(isfirstchild.equals(isfirstchild));
    }
    @Test
    public void testmatches0() {
        IsRoot isroot = new IsRoot();
        isroot.matches(null,null);
        assertTrue(isroot.equals(isroot));
    }
    @Test
    public void testmatches1() {
        IsRoot isroot = new IsRoot();
        isroot.matches(null,null);
        assertTrue(isroot.equals(isroot));
    }
    @Test
    public void testmatches2() {
        IsRoot isroot = new IsRoot();
        isroot.matches(null,null);
        assertTrue(isroot.equals(isroot));
    }
    @Test
    public void testtoString0() {
        IsRoot isroot = new IsRoot();
        isroot.toString();
        assertTrue(isroot.equals(isroot));
    }
    @Test
    public void testtoString1() {
        IsRoot isroot = new IsRoot();
        isroot.toString();
        assertTrue(isroot.equals(isroot));
    }
    @Test
    public void testtoString2() {
        IsRoot isroot = new IsRoot();
        isroot.toString();
        assertTrue(isroot.equals(isroot));
    }
    @Test
    public void testmatches0() {
        IsOnlyChild isonlychild = new IsOnlyChild();
        isonlychild.matches(null,null);
        assertTrue(isonlychild.equals(isonlychild));
    }
    @Test
    public void testmatches1() {
        IsOnlyChild isonlychild = new IsOnlyChild();
        isonlychild.matches(null,null);
        assertTrue(isonlychild.equals(isonlychild));
    }
    @Test
    public void testmatches2() {
        IsOnlyChild isonlychild = new IsOnlyChild();
        isonlychild.matches(null,null);
        assertTrue(isonlychild.equals(isonlychild));
    }
    @Test
    public void testtoString0() {
        IsOnlyChild isonlychild = new IsOnlyChild();
        isonlychild.toString();
        assertTrue(isonlychild.equals(isonlychild));
    }
    @Test
    public void testtoString1() {
        IsOnlyChild isonlychild = new IsOnlyChild();
        isonlychild.toString();
        assertTrue(isonlychild.equals(isonlychild));
    }
    @Test
    public void testtoString2() {
        IsOnlyChild isonlychild = new IsOnlyChild();
        isonlychild.toString();
        assertTrue(isonlychild.equals(isonlychild));
    }
    @Test
    public void testmatches0() {
        IsOnlyOfType isonlyoftype = new IsOnlyOfType();
        isonlyoftype.matches(null,null);
        assertTrue(isonlyoftype.equals(isonlyoftype));
    }
    @Test
    public void testmatches1() {
        IsOnlyOfType isonlyoftype = new IsOnlyOfType();
        isonlyoftype.matches(null,null);
        assertTrue(isonlyoftype.equals(isonlyoftype));
    }
    @Test
    public void testmatches2() {
        IsOnlyOfType isonlyoftype = new IsOnlyOfType();
        isonlyoftype.matches(null,null);
        assertTrue(isonlyoftype.equals(isonlyoftype));
    }
    @Test
    public void testtoString0() {
        IsOnlyOfType isonlyoftype = new IsOnlyOfType();
        isonlyoftype.toString();
        assertTrue(isonlyoftype.equals(isonlyoftype));
    }
    @Test
    public void testtoString1() {
        IsOnlyOfType isonlyoftype = new IsOnlyOfType();
        isonlyoftype.toString();
        assertTrue(isonlyoftype.equals(isonlyoftype));
    }
    @Test
    public void testtoString2() {
        IsOnlyOfType isonlyoftype = new IsOnlyOfType();
        isonlyoftype.toString();
        assertTrue(isonlyoftype.equals(isonlyoftype));
    }
    @Test
    public void testmatches0() {
        IsEmpty isempty = new IsEmpty();
        isempty.matches(null,null);
        assertTrue(isempty.equals(isempty));
    }
    @Test
    public void testmatches1() {
        IsEmpty isempty = new IsEmpty();
        isempty.matches(null,null);
        assertTrue(isempty.equals(isempty));
    }
    @Test
    public void testmatches2() {
        IsEmpty isempty = new IsEmpty();
        isempty.matches(null,null);
        assertTrue(isempty.equals(isempty));
    }
    @Test
    public void testtoString0() {
        IsEmpty isempty = new IsEmpty();
        isempty.toString();
        assertTrue(isempty.equals(isempty));
    }
    @Test
    public void testtoString1() {
        IsEmpty isempty = new IsEmpty();
        isempty.toString();
        assertTrue(isempty.equals(isempty));
    }
    @Test
    public void testtoString2() {
        IsEmpty isempty = new IsEmpty();
        isempty.toString();
        assertTrue(isempty.equals(isempty));
    }
    @Test
    public void testmatches0() {
        ContainsText containstext = new ContainsText();
        containstext.matches(null,null);
        assertTrue(containstext.equals(containstext));
    }
    @Test
    public void testmatches1() {
        ContainsText containstext = new ContainsText();
        containstext.matches(null,null);
        assertTrue(containstext.equals(containstext));
    }
    @Test
    public void testmatches2() {
        ContainsText containstext = new ContainsText();
        containstext.matches(null,null);
        assertTrue(containstext.equals(containstext));
    }
    @Test
    public void testtoString0() {
        ContainsText containstext = new ContainsText();
        containstext.toString();
        assertTrue(containstext.equals(containstext));
    }
    @Test
    public void testtoString1() {
        ContainsText containstext = new ContainsText();
        containstext.toString();
        assertTrue(containstext.equals(containstext));
    }
    @Test
    public void testtoString2() {
        ContainsText containstext = new ContainsText();
        containstext.toString();
        assertTrue(containstext.equals(containstext));
    }
    @Test
    public void testmatches0() {
        ContainsData containsdata = new ContainsData();
        containsdata.matches(null,null);
        assertTrue(containsdata.equals(containsdata));
    }
    @Test
    public void testmatches1() {
        ContainsData containsdata = new ContainsData();
        containsdata.matches(null,null);
        assertTrue(containsdata.equals(containsdata));
    }
    @Test
    public void testmatches2() {
        ContainsData containsdata = new ContainsData();
        containsdata.matches(null,null);
        assertTrue(containsdata.equals(containsdata));
    }
    @Test
    public void testtoString0() {
        ContainsData containsdata = new ContainsData();
        containsdata.toString();
        assertTrue(containsdata.equals(containsdata));
    }
    @Test
    public void testtoString1() {
        ContainsData containsdata = new ContainsData();
        containsdata.toString();
        assertTrue(containsdata.equals(containsdata));
    }
    @Test
    public void testtoString2() {
        ContainsData containsdata = new ContainsData();
        containsdata.toString();
        assertTrue(containsdata.equals(containsdata));
    }
    @Test
    public void testmatches0() {
        ContainsOwnText containsowntext = new ContainsOwnText();
        containsowntext.matches(null,null);
        assertTrue(containsowntext.equals(containsowntext));
    }
    @Test
    public void testmatches1() {
        ContainsOwnText containsowntext = new ContainsOwnText();
        containsowntext.matches(null,null);
        assertTrue(containsowntext.equals(containsowntext));
    }
    @Test
    public void testmatches2() {
        ContainsOwnText containsowntext = new ContainsOwnText();
        containsowntext.matches(null,null);
        assertTrue(containsowntext.equals(containsowntext));
    }
    @Test
    public void testtoString0() {
        ContainsOwnText containsowntext = new ContainsOwnText();
        containsowntext.toString();
        assertTrue(containsowntext.equals(containsowntext));
    }
    @Test
    public void testtoString1() {
        ContainsOwnText containsowntext = new ContainsOwnText();
        containsowntext.toString();
        assertTrue(containsowntext.equals(containsowntext));
    }
    @Test
    public void testtoString2() {
        ContainsOwnText containsowntext = new ContainsOwnText();
        containsowntext.toString();
        assertTrue(containsowntext.equals(containsowntext));
    }
    @Test
    public void testmatches0() {
        Matches matches = new Matches();
        matches.matches(null,null);
        assertTrue(matches.equals(matches));
    }
    @Test
    public void testmatches1() {
        Matches matches = new Matches();
        matches.matches(null,null);
        assertTrue(matches.equals(matches));
    }
    @Test
    public void testmatches2() {
        Matches matches = new Matches();
        matches.matches(null,null);
        assertTrue(matches.equals(matches));
    }
    @Test
    public void testtoString0() {
        Matches matches = new Matches();
        matches.toString();
        assertTrue(matches.equals(matches));
    }
    @Test
    public void testtoString1() {
        Matches matches = new Matches();
        matches.toString();
        assertTrue(matches.equals(matches));
    }
    @Test
    public void testtoString2() {
        Matches matches = new Matches();
        matches.toString();
        assertTrue(matches.equals(matches));
    }
    @Test
    public void testmatches0() {
        MatchesOwn matchesown = new MatchesOwn();
        matchesown.matches(null,null);
        assertTrue(matchesown.equals(matchesown));
    }
    @Test
    public void testmatches1() {
        MatchesOwn matchesown = new MatchesOwn();
        matchesown.matches(null,null);
        assertTrue(matchesown.equals(matchesown));
    }
    @Test
    public void testmatches2() {
        MatchesOwn matchesown = new MatchesOwn();
        matchesown.matches(null,null);
        assertTrue(matchesown.equals(matchesown));
    }
    @Test
    public void testtoString0() {
        MatchesOwn matchesown = new MatchesOwn();
        matchesown.toString();
        assertTrue(matchesown.equals(matchesown));
    }
    @Test
    public void testtoString1() {
        MatchesOwn matchesown = new MatchesOwn();
        matchesown.toString();
        assertTrue(matchesown.equals(matchesown));
    }
    @Test
    public void testtoString2() {
        MatchesOwn matchesown = new MatchesOwn();
        matchesown.toString();
        assertTrue(matchesown.equals(matchesown));
    }
    @Test
    public void testmatches0() {
        MatchText matchtext = new MatchText();
        matchtext.matches(null,null);
        assertTrue(matchtext.equals(matchtext));
    }
    @Test
    public void testmatches1() {
        MatchText matchtext = new MatchText();
        matchtext.matches(null,null);
        assertTrue(matchtext.equals(matchtext));
    }
    @Test
    public void testmatches2() {
        MatchText matchtext = new MatchText();
        matchtext.matches(null,null);
        assertTrue(matchtext.equals(matchtext));
    }
    @Test
    public void testtoString0() {
        MatchText matchtext = new MatchText();
        matchtext.toString();
        assertTrue(matchtext.equals(matchtext));
    }
    @Test
    public void testtoString1() {
        MatchText matchtext = new MatchText();
        matchtext.toString();
        assertTrue(matchtext.equals(matchtext));
    }
    @Test
    public void testtoString2() {
        MatchText matchtext = new MatchText();
        matchtext.toString();
        assertTrue(matchtext.equals(matchtext));
    }
    @Test
    public void testhead0() {
        NodeFilter nodefilter = new NodeFilter();
        nodefilter.head(null,57342);
        assertTrue(nodefilter.equals(nodefilter));
    }
    @Test
    public void testhead1() {
        NodeFilter nodefilter = new NodeFilter();
        nodefilter.head(null,4);
        assertTrue(nodefilter.equals(nodefilter));
    }
    @Test
    public void testhead2() {
        NodeFilter nodefilter = new NodeFilter();
        nodefilter.head(null,-1);
        assertTrue(nodefilter.equals(nodefilter));
    }
    @Test
    public void testtail0() {
        NodeFilter nodefilter = new NodeFilter();
        nodefilter.tail(null,-1);
        assertTrue(nodefilter.equals(nodefilter));
    }
    @Test
    public void testtail1() {
        NodeFilter nodefilter = new NodeFilter();
        nodefilter.tail(null,1114211);
        assertTrue(nodefilter.equals(nodefilter));
    }
    @Test
    public void testtail2() {
        NodeFilter nodefilter = new NodeFilter();
        nodefilter.tail(null,1114211);
        assertTrue(nodefilter.equals(nodefilter));
    }
    @Test
    public void testhead0() {
        NodeVisitor nodevisitor = new NodeVisitor();
        nodevisitor.head(null,4);
        assertTrue(nodevisitor.equals(nodevisitor));
    }
    @Test
    public void testhead1() {
        NodeVisitor nodevisitor = new NodeVisitor();
        nodevisitor.head(null,55297);
        assertTrue(nodevisitor.equals(nodevisitor));
    }
    @Test
    public void testhead2() {
        NodeVisitor nodevisitor = new NodeVisitor();
        nodevisitor.head(null,100);
        assertTrue(nodevisitor.equals(nodevisitor));
    }
    @Test
    public void testtail0() {
        NodeVisitor nodevisitor = new NodeVisitor();
        nodevisitor.tail(null,0);
        assertTrue(nodevisitor.equals(nodevisitor));
    }
    @Test
    public void testtail1() {
        NodeVisitor nodevisitor = new NodeVisitor();
        nodevisitor.tail(null,1114211);
        assertTrue(nodevisitor.equals(nodevisitor));
    }
    @Test
    public void testtail2() {
        NodeVisitor nodevisitor = new NodeVisitor();
        nodevisitor.tail(null,2);
        assertTrue(nodevisitor.equals(nodevisitor));
    }
    @Test
    public void testload0() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,"noscripu","[CDATA\");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload1() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,"]]=",":emptx");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload2() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,":matches)","checkboy");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload0() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,"UTF-","imagf");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload1() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,"tfoou",":last-of-typd");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload2() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,"keygen","keygen");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload0() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,"[","meta",null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload1() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,"actioo","odc",null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testload2() {
        DataUtil datautil = new DataUtil();
        datautil.load(null,":roou","tfoos",null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testcrossStreams0() {
        DataUtil datautil = new DataUtil();
        datautil.crossStreams(null,null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testcrossStreams1() {
        DataUtil datautil = new DataUtil();
        datautil.crossStreams(null,null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testcrossStreams2() {
        DataUtil datautil = new DataUtil();
        datautil.crossStreams(null,null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testparseInputStream0() {
        DataUtil datautil = new DataUtil();
        datautil.parseInputStream(null,"gziq","ti",null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testparseInputStream1() {
        DataUtil datautil = new DataUtil();
        datautil.parseInputStream(null,":last-chilc","td",null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testparseInputStream2() {
        DataUtil datautil = new DataUtil();
        datautil.parseInputStream(null,":lt'","noframet",null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testreadToByteBuffer0() {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(null,1);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testreadToByteBuffer1() {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(null,187);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testreadToByteBuffer2() {
        DataUtil datautil = new DataUtil();
        datautil.readToByteBuffer(null,1114211);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testemptyByteBuffer0() {
        DataUtil datautil = new DataUtil();
        datautil.emptyByteBuffer();
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testemptyByteBuffer1() {
        DataUtil datautil = new DataUtil();
        datautil.emptyByteBuffer();
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testemptyByteBuffer2() {
        DataUtil datautil = new DataUtil();
        datautil.emptyByteBuffer();
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testgetCharsetFromContentType0() {
        DataUtil datautil = new DataUtil();
        datautil.getCharsetFromContentType("textare`");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testgetCharsetFromContentType1() {
        DataUtil datautil = new DataUtil();
        datautil.getCharsetFromContentType("li");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testgetCharsetFromContentType2() {
        DataUtil datautil = new DataUtil();
        datautil.getCharsetFromContentType(":last-child");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testvalidateCharset0() {
        DataUtil datautil = new DataUtil();
        datautil.validateCharset("-.");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testvalidateCharset1() {
        DataUtil datautil = new DataUtil();
        datautil.validateCharset("image");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testvalidateCharset2() {
        DataUtil datautil = new DataUtil();
        datautil.validateCharset("dt");
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testmimeBoundary0() {
        DataUtil datautil = new DataUtil();
        datautil.mimeBoundary();
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testmimeBoundary1() {
        DataUtil datautil = new DataUtil();
        datautil.mimeBoundary();
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testmimeBoundary2() {
        DataUtil datautil = new DataUtil();
        datautil.mimeBoundary();
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testdetectCharsetFromBom0() {
        DataUtil datautil = new DataUtil();
        datautil.detectCharsetFromBom(null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testdetectCharsetFromBom1() {
        DataUtil datautil = new DataUtil();
        datautil.detectCharsetFromBom(null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testdetectCharsetFromBom2() {
        DataUtil datautil = new DataUtil();
        datautil.detectCharsetFromBom(null);
        assertTrue(datautil.equals(datautil));
    }
    @Test
    public void testonContentsChanged0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.onContentsChanged();
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testonContentsChanged1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.onContentsChanged();
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testonContentsChanged2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.onContentsChanged();
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testset0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.set(55396,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testset1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.set(2,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testset2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.set(57342,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testadd0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.add(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testadd1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.add(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testadd2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.add(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testadd0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.add(103,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testadd1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.add(240,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testadd2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.add(1,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremove0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.remove(240);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremove1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.remove(240);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremove2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.remove(9);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremove0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.remove(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremove1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.remove(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremove2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.remove(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testclear0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.clear();
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testclear1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.clear();
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testclear2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.clear();
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testaddAll0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.addAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testaddAll1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.addAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testaddAll2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.addAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testaddAll0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.addAll(9,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testaddAll1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.addAll(55296,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testaddAll2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.addAll(401,null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremoveRange0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.removeRange(103,500);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremoveRange1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.removeRange(57243,-99);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremoveRange2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.removeRange(239,55296);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremoveAll0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.removeAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremoveAll1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.removeAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testremoveAll2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.removeAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testretainAll0() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.retainAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testretainAll1() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.retainAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testretainAll2() {
        ChangeNotifyingArrayList changenotifyingarraylist = new ChangeNotifyingArrayList();
        changenotifyingarraylist.retainAll(null);
        assertTrue(changenotifyingarraylist.equals(changenotifyingarraylist));
    }
    @Test
    public void testnotNull0() {
        Validate validate = new Validate();
        validate.notNull(null);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotNull1() {
        Validate validate = new Validate();
        validate.notNull(null);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotNull2() {
        Validate validate = new Validate();
        validate.notNull(null);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotNull0() {
        Validate validate = new Validate();
        validate.notNull(null,"^<");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotNull1() {
        Validate validate = new Validate();
        validate.notNull(null,"ruby");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotNull2() {
        Validate validate = new Validate();
        validate.notNull(null,"forl");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisTrue0() {
        Validate validate = new Validate();
        validate.isTrue(true);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisTrue1() {
        Validate validate = new Validate();
        validate.isTrue(true);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisTrue2() {
        Validate validate = new Validate();
        validate.isTrue(true);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisTrue0() {
        Validate validate = new Validate();
        validate.isTrue(true,"a");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisTrue1() {
        Validate validate = new Validate();
        validate.isTrue(true,":last-child");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisTrue2() {
        Validate validate = new Validate();
        validate.isTrue(true,"^<");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisFalse0() {
        Validate validate = new Validate();
        validate.isFalse(true);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisFalse1() {
        Validate validate = new Validate();
        validate.isFalse(true);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisFalse2() {
        Validate validate = new Validate();
        validate.isFalse(true);
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisFalse0() {
        Validate validate = new Validate();
        validate.isFalse(true,"script");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisFalse1() {
        Validate validate = new Validate();
        validate.isFalse(true,":containsData'");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testisFalse2() {
        Validate validate = new Validate();
        validate.isFalse(true,"xml");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnoNullElements0() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnoNullElements1() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnoNullElements2() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{});
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnoNullElements0() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"keygen");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnoNullElements1() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"*}");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnoNullElements2() {
        Validate validate = new Validate();
        validate.noNullElements(new Object[]{},"basf");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotEmpty0() {
        Validate validate = new Validate();
        validate.notEmpty(":nth-last-child)");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotEmpty1() {
        Validate validate = new Validate();
        validate.notEmpty("img");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotEmpty2() {
        Validate validate = new Validate();
        validate.notEmpty("*|");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotEmpty0() {
        Validate validate = new Validate();
        validate.notEmpty("checkee","hiddem");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotEmpty1() {
        Validate validate = new Validate();
        validate.notEmpty("radin","li");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testnotEmpty2() {
        Validate validate = new Validate();
        validate.notEmpty("-,","select");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testfail0() {
        Validate validate = new Validate();
        validate.fail("--");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testfail1() {
        Validate validate = new Validate();
        validate.fail("h6");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testfail2() {
        Validate validate = new Validate();
        validate.fail("keygeo");
        assertTrue(validate.equals(validate));
    }
    @Test
    public void testconnect0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("lh");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testconnect1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("text.");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testconnect2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect("metb");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testconnect0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testconnect1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testconnect2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.connect(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeUrl0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeUrl("plaintext");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeUrl1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeUrl("forn");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeUrl2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeUrl("noembec");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeUrl0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeUrl(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeUrl1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeUrl(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeUrl2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeUrl(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeMimeName0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeMimeName("math");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeMimeName1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeMimeName(":nth-last-of-type'");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testencodeMimeName2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.encodeMimeName("US-ASCII");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testurl0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testurl1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testurl2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testurl0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("de");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testurl1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("template");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testurl2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.url("mati");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testproxy0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testproxy1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testproxy2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testproxy0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("hree",9);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testproxy1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy("gzio",500);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testproxy2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.proxy(":not(",57342);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testuserAgent0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("selecs");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testuserAgent1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent(":first-chile");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testuserAgent2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.userAgent("]]?");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testtimeout0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(1114112);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testtimeout1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(9);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testtimeout2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.timeout(57343);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testmaxBodySize0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(239);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testmaxBodySize1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(100);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testmaxBodySize2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.maxBodySize(500);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testfollowRedirects0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testfollowRedirects1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testfollowRedirects2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.followRedirects(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testreferrer0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("h5");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testreferrer1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("te");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testreferrer2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.referrer("du");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testmethod0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testmethod1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testmethod2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.method(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testignoreHttpErrors0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testignoreHttpErrors1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testignoreHttpErrors2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreHttpErrors(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testignoreContentType0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testignoreContentType1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testignoreContentType2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.ignoreContentType(true);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("html","keygem");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("sarcasn","type");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("bodx",":not(");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testsslSocketFactory0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testsslSocketFactory1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testsslSocketFactory2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.sslSocketFactory(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("tablf","<.",null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("$>","-.",null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("lh","\"",null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("frameseu",":has(",null,"head");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("dc","namf",null,"keygeo");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("*}","noframet",null,"captioo");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("http:/");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("checkbow");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("xmp");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data(":lt)");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("\"");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testdata2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.data("commane");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequestBody0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("option");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequestBody1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("#text");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequestBody2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.requestBody("#texs");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testheader0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header(":containsOwn'","bgsoune");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testheader1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("radio","li");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testheader2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.header("htmk","svh");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testheaders0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testheaders1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testheaders2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.headers(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testcookie0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("plaintexs",":emptx");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testcookie1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("templatf",":matches'");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testcookie2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookie("http:/","*|");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testcookies0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testcookies1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testcookies2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.cookies(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testparser0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testparser1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testparser2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.parser(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testget0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testget1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testget2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.get();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testpost0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testpost1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testpost2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.post();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testexecute0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testexecute1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testexecute2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.execute();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequest0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequest1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequest2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequest0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequest1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testrequest2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.request(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testresponse0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testresponse1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testresponse2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response();
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testresponse0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testresponse1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testresponse2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.response(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testpostDataCharset0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("abs9");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testpostDataCharset1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("bodx");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testpostDataCharset2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.postDataCharset("#roos");
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testurl0() {
        Base base = new Base();
        base.url();
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl1() {
        Base base = new Base();
        base.url();
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl2() {
        Base base = new Base();
        base.url();
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl0() {
        Base base = new Base();
        base.url(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl1() {
        Base base = new Base();
        base.url(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testurl2() {
        Base base = new Base();
        base.url(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod0() {
        Base base = new Base();
        base.method();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod1() {
        Base base = new Base();
        base.method();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod2() {
        Base base = new Base();
        base.method();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod0() {
        Base base = new Base();
        base.method(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod1() {
        Base base = new Base();
        base.method(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testmethod2() {
        Base base = new Base();
        base.method(null);
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader0() {
        Base base = new Base();
        base.header(":matchTexs");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader1() {
        Base base = new Base();
        base.header("matg");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader2() {
        Base base = new Base();
        base.header(":eq)");
        assertTrue(base.equals(base));
    }
    @Test
    public void testaddHeader0() {
        Base base = new Base();
        base.addHeader("[CDATA\","checkbow");
        assertTrue(base.equals(base));
    }
    @Test
    public void testaddHeader1() {
        Base base = new Base();
        base.addHeader(":containsOwn)","link");
        assertTrue(base.equals(base));
    }
    @Test
    public void testaddHeader2() {
        Base base = new Base();
        base.addHeader("*{","button");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders0() {
        Base base = new Base();
        base.headers("heae");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders1() {
        Base base = new Base();
        base.headers("basf");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders2() {
        Base base = new Base();
        base.headers("style");
        assertTrue(base.equals(base));
    }
    @Test
    public void testfixHeaderEncoding0() {
        Base base = new Base();
        base.fixHeaderEncoding("imf");
        assertTrue(base.equals(base));
    }
    @Test
    public void testfixHeaderEncoding1() {
        Base base = new Base();
        base.fixHeaderEncoding(":matchTexs");
        assertTrue(base.equals(base));
    }
    @Test
    public void testfixHeaderEncoding2() {
        Base base = new Base();
        base.fixHeaderEncoding(":emptz");
        assertTrue(base.equals(base));
    }
    @Test
    public void testlooksLikeUtf80() {
        Base base = new Base();
        base.looksLikeUtf8(new Object[]{});
        assertTrue(base.equals(base));
    }
    @Test
    public void testlooksLikeUtf81() {
        Base base = new Base();
        base.looksLikeUtf8(new Object[]{});
        assertTrue(base.equals(base));
    }
    @Test
    public void testlooksLikeUtf82() {
        Base base = new Base();
        base.looksLikeUtf8(new Object[]{});
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader0() {
        Base base = new Base();
        base.header("[CDATA\","]]>");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader1() {
        Base base = new Base();
        base.header("sarcasl","iframe");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheader2() {
        Base base = new Base();
        base.header("textareb","http");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeader0() {
        Base base = new Base();
        base.hasHeader(":nth-child'");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeader1() {
        Base base = new Base();
        base.hasHeader(":matchTexu");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeader2() {
        Base base = new Base();
        base.hasHeader("http");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeaderWithValue0() {
        Base base = new Base();
        base.hasHeaderWithValue("evem","typf");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeaderWithValue1() {
        Base base = new Base();
        base.hasHeaderWithValue("^","Set-Cookif");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasHeaderWithValue2() {
        Base base = new Base();
        base.hasHeaderWithValue("tbodz","nobq");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveHeader0() {
        Base base = new Base();
        base.removeHeader("^>");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveHeader1() {
        Base base = new Base();
        base.removeHeader("lj");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveHeader2() {
        Base base = new Base();
        base.removeHeader("plaintexu");
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders0() {
        Base base = new Base();
        base.headers();
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders1() {
        Base base = new Base();
        base.headers();
        assertTrue(base.equals(base));
    }
    @Test
    public void testheaders2() {
        Base base = new Base();
        base.headers();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmultiHeaders0() {
        Base base = new Base();
        base.multiHeaders();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmultiHeaders1() {
        Base base = new Base();
        base.multiHeaders();
        assertTrue(base.equals(base));
    }
    @Test
    public void testmultiHeaders2() {
        Base base = new Base();
        base.multiHeaders();
        assertTrue(base.equals(base));
    }
    @Test
    public void testgetHeadersCaseInsensitive0() {
        Base base = new Base();
        base.getHeadersCaseInsensitive("abs9");
        assertTrue(base.equals(base));
    }
    @Test
    public void testgetHeadersCaseInsensitive1() {
        Base base = new Base();
        base.getHeadersCaseInsensitive(":all");
        assertTrue(base.equals(base));
    }
    @Test
    public void testgetHeadersCaseInsensitive2() {
        Base base = new Base();
        base.getHeadersCaseInsensitive(":nth-child(");
        assertTrue(base.equals(base));
    }
    @Test
    public void testscanHeaders0() {
        Base base = new Base();
        base.scanHeaders(":emptx");
        assertTrue(base.equals(base));
    }
    @Test
    public void testscanHeaders1() {
        Base base = new Base();
        base.scanHeaders("-.");
        assertTrue(base.equals(base));
    }
    @Test
    public void testscanHeaders2() {
        Base base = new Base();
        base.scanHeaders("style");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie0() {
        Base base = new Base();
        base.cookie("\'");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie1() {
        Base base = new Base();
        base.cookie("iframf");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie2() {
        Base base = new Base();
        base.cookie("US-ASCIJ");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie0() {
        Base base = new Base();
        base.cookie("text.","colgrouo");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie1() {
        Base base = new Base();
        base.cookie("base","disablee");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookie2() {
        Base base = new Base();
        base.cookie(":not)","isindey");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasCookie0() {
        Base base = new Base();
        base.hasCookie("disablec");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasCookie1() {
        Base base = new Base();
        base.hasCookie("bodz");
        assertTrue(base.equals(base));
    }
    @Test
    public void testhasCookie2() {
        Base base = new Base();
        base.hasCookie(":nth-child'");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveCookie0() {
        Base base = new Base();
        base.removeCookie("http");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveCookie1() {
        Base base = new Base();
        base.removeCookie("templatd");
        assertTrue(base.equals(base));
    }
    @Test
    public void testremoveCookie2() {
        Base base = new Base();
        base.removeCookie("text.");
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookies0() {
        Base base = new Base();
        base.cookies();
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookies1() {
        Base base = new Base();
        base.cookies();
        assertTrue(base.equals(base));
    }
    @Test
    public void testcookies2() {
        Base base = new Base();
        base.cookies();
        assertTrue(base.equals(base));
    }
    @Test
    public void testproxy0() {
        Request request = new Request();
        request.proxy();
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy1() {
        Request request = new Request();
        request.proxy();
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy2() {
        Request request = new Request();
        request.proxy();
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy0() {
        Request request = new Request();
        request.proxy(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy1() {
        Request request = new Request();
        request.proxy(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy2() {
        Request request = new Request();
        request.proxy(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy0() {
        Request request = new Request();
        request.proxy(":nth-child)",3);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy1() {
        Request request = new Request();
        request.proxy("\"\"",500);
        assertTrue(request.equals(request));
    }
    @Test
    public void testproxy2() {
        Request request = new Request();
        request.proxy("selecu",199);
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout0() {
        Request request = new Request();
        request.timeout();
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout1() {
        Request request = new Request();
        request.timeout();
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout2() {
        Request request = new Request();
        request.timeout();
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout0() {
        Request request = new Request();
        request.timeout(-90);
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout1() {
        Request request = new Request();
        request.timeout(-100);
        assertTrue(request.equals(request));
    }
    @Test
    public void testtimeout2() {
        Request request = new Request();
        request.timeout(240);
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize0() {
        Request request = new Request();
        request.maxBodySize();
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize1() {
        Request request = new Request();
        request.maxBodySize();
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize2() {
        Request request = new Request();
        request.maxBodySize();
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize0() {
        Request request = new Request();
        request.maxBodySize(-1);
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize1() {
        Request request = new Request();
        request.maxBodySize(192);
        assertTrue(request.equals(request));
    }
    @Test
    public void testmaxBodySize2() {
        Request request = new Request();
        request.maxBodySize(1114112);
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects0() {
        Request request = new Request();
        request.followRedirects();
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects1() {
        Request request = new Request();
        request.followRedirects();
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects2() {
        Request request = new Request();
        request.followRedirects();
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects0() {
        Request request = new Request();
        request.followRedirects(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects1() {
        Request request = new Request();
        request.followRedirects(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testfollowRedirects2() {
        Request request = new Request();
        request.followRedirects(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors0() {
        Request request = new Request();
        request.ignoreHttpErrors();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors1() {
        Request request = new Request();
        request.ignoreHttpErrors();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors2() {
        Request request = new Request();
        request.ignoreHttpErrors();
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory0() {
        Request request = new Request();
        request.sslSocketFactory();
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory1() {
        Request request = new Request();
        request.sslSocketFactory();
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory2() {
        Request request = new Request();
        request.sslSocketFactory();
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory0() {
        Request request = new Request();
        request.sslSocketFactory(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory1() {
        Request request = new Request();
        request.sslSocketFactory(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testsslSocketFactory2() {
        Request request = new Request();
        request.sslSocketFactory(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors0() {
        Request request = new Request();
        request.ignoreHttpErrors(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors1() {
        Request request = new Request();
        request.ignoreHttpErrors(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreHttpErrors2() {
        Request request = new Request();
        request.ignoreHttpErrors(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType0() {
        Request request = new Request();
        request.ignoreContentType();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType1() {
        Request request = new Request();
        request.ignoreContentType();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType2() {
        Request request = new Request();
        request.ignoreContentType();
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType0() {
        Request request = new Request();
        request.ignoreContentType(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType1() {
        Request request = new Request();
        request.ignoreContentType(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testignoreContentType2() {
        Request request = new Request();
        request.ignoreContentType(true);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata0() {
        Request request = new Request();
        request.data(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata1() {
        Request request = new Request();
        request.data(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata2() {
        Request request = new Request();
        request.data(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata0() {
        Request request = new Request();
        request.data();
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata1() {
        Request request = new Request();
        request.data();
        assertTrue(request.equals(request));
    }
    @Test
    public void testdata2() {
        Request request = new Request();
        request.data();
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody0() {
        Request request = new Request();
        request.requestBody("#roou");
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody1() {
        Request request = new Request();
        request.requestBody("!=");
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody2() {
        Request request = new Request();
        request.requestBody("US-ASCIH");
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody0() {
        Request request = new Request();
        request.requestBody();
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody1() {
        Request request = new Request();
        request.requestBody();
        assertTrue(request.equals(request));
    }
    @Test
    public void testrequestBody2() {
        Request request = new Request();
        request.requestBody();
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser0() {
        Request request = new Request();
        request.parser(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser1() {
        Request request = new Request();
        request.parser(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser2() {
        Request request = new Request();
        request.parser(null);
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser0() {
        Request request = new Request();
        request.parser();
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser1() {
        Request request = new Request();
        request.parser();
        assertTrue(request.equals(request));
    }
    @Test
    public void testparser2() {
        Request request = new Request();
        request.parser();
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset0() {
        Request request = new Request();
        request.postDataCharset("svg");
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset1() {
        Request request = new Request();
        request.postDataCharset(":nth-child'");
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset2() {
        Request request = new Request();
        request.postDataCharset(":nth-last-child'");
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset0() {
        Request request = new Request();
        request.postDataCharset();
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset1() {
        Request request = new Request();
        request.postDataCharset();
        assertTrue(request.equals(request));
    }
    @Test
    public void testpostDataCharset2() {
        Request request = new Request();
        request.postDataCharset();
        assertTrue(request.equals(request));
    }
    @Test
    public void testexecute0() {
        Response response = new Response();
        response.execute(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testexecute1() {
        Response response = new Response();
        response.execute(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testexecute2() {
        Response response = new Response();
        response.execute(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testexecute0() {
        Response response = new Response();
        response.execute(null,null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testexecute1() {
        Response response = new Response();
        response.execute(null,null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testexecute2() {
        Response response = new Response();
        response.execute(null,null);
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusCode0() {
        Response response = new Response();
        response.statusCode();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusCode1() {
        Response response = new Response();
        response.statusCode();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusCode2() {
        Response response = new Response();
        response.statusCode();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusMessage0() {
        Response response = new Response();
        response.statusMessage();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusMessage1() {
        Response response = new Response();
        response.statusMessage();
        assertTrue(response.equals(response));
    }
    @Test
    public void teststatusMessage2() {
        Response response = new Response();
        response.statusMessage();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset0() {
        Response response = new Response();
        response.charset();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset1() {
        Response response = new Response();
        response.charset();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset2() {
        Response response = new Response();
        response.charset();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset0() {
        Response response = new Response();
        response.charset("(");
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset1() {
        Response response = new Response();
        response.charset("te");
        assertTrue(response.equals(response));
    }
    @Test
    public void testcharset2() {
        Response response = new Response();
        response.charset("actioo");
        assertTrue(response.equals(response));
    }
    @Test
    public void testcontentType0() {
        Response response = new Response();
        response.contentType();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcontentType1() {
        Response response = new Response();
        response.contentType();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcontentType2() {
        Response response = new Response();
        response.contentType();
        assertTrue(response.equals(response));
    }
    @Test
    public void testparse0() {
        Response response = new Response();
        response.parse();
        assertTrue(response.equals(response));
    }
    @Test
    public void testparse1() {
        Response response = new Response();
        response.parse();
        assertTrue(response.equals(response));
    }
    @Test
    public void testparse2() {
        Response response = new Response();
        response.parse();
        assertTrue(response.equals(response));
    }
    @Test
    public void testprepareByteData0() {
        Response response = new Response();
        response.prepareByteData();
        assertTrue(response.equals(response));
    }
    @Test
    public void testprepareByteData1() {
        Response response = new Response();
        response.prepareByteData();
        assertTrue(response.equals(response));
    }
    @Test
    public void testprepareByteData2() {
        Response response = new Response();
        response.prepareByteData();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbody0() {
        Response response = new Response();
        response.body();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbody1() {
        Response response = new Response();
        response.body();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbody2() {
        Response response = new Response();
        response.body();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyAsBytes0() {
        Response response = new Response();
        response.bodyAsBytes();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyAsBytes1() {
        Response response = new Response();
        response.bodyAsBytes();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyAsBytes2() {
        Response response = new Response();
        response.bodyAsBytes();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbufferUp0() {
        Response response = new Response();
        response.bufferUp();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbufferUp1() {
        Response response = new Response();
        response.bufferUp();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbufferUp2() {
        Response response = new Response();
        response.bufferUp();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyStream0() {
        Response response = new Response();
        response.bodyStream();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyStream1() {
        Response response = new Response();
        response.bodyStream();
        assertTrue(response.equals(response));
    }
    @Test
    public void testbodyStream2() {
        Response response = new Response();
        response.bodyStream();
        assertTrue(response.equals(response));
    }
    @Test
    public void testcreateConnection0() {
        Response response = new Response();
        response.createConnection(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testcreateConnection1() {
        Response response = new Response();
        response.createConnection(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testcreateConnection2() {
        Response response = new Response();
        response.createConnection(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testsafeClose0() {
        Response response = new Response();
        response.safeClose();
        assertTrue(response.equals(response));
    }
    @Test
    public void testsafeClose1() {
        Response response = new Response();
        response.safeClose();
        assertTrue(response.equals(response));
    }
    @Test
    public void testsafeClose2() {
        Response response = new Response();
        response.safeClose();
        assertTrue(response.equals(response));
    }
    @Test
    public void testsetupFromConnection0() {
        Response response = new Response();
        response.setupFromConnection(null,null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testsetupFromConnection1() {
        Response response = new Response();
        response.setupFromConnection(null,null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testsetupFromConnection2() {
        Response response = new Response();
        response.setupFromConnection(null,null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testcreateHeaderMap0() {
        Response response = new Response();
        response.createHeaderMap(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testcreateHeaderMap1() {
        Response response = new Response();
        response.createHeaderMap(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testcreateHeaderMap2() {
        Response response = new Response();
        response.createHeaderMap(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testprocessResponseHeaders0() {
        Response response = new Response();
        response.processResponseHeaders(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testprocessResponseHeaders1() {
        Response response = new Response();
        response.processResponseHeaders(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testprocessResponseHeaders2() {
        Response response = new Response();
        response.processResponseHeaders(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testsetOutputContentType0() {
        Response response = new Response();
        response.setOutputContentType(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testsetOutputContentType1() {
        Response response = new Response();
        response.setOutputContentType(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testsetOutputContentType2() {
        Response response = new Response();
        response.setOutputContentType(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testwritePost0() {
        Response response = new Response();
        response.writePost(null,null,"frameses");
        assertTrue(response.equals(response));
    }
    @Test
    public void testwritePost1() {
        Response response = new Response();
        response.writePost(null,null,"selecs");
        assertTrue(response.equals(response));
    }
    @Test
    public void testwritePost2() {
        Response response = new Response();
        response.writePost(null,null,"*|");
        assertTrue(response.equals(response));
    }
    @Test
    public void testgetRequestCookieString0() {
        Response response = new Response();
        response.getRequestCookieString(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testgetRequestCookieString1() {
        Response response = new Response();
        response.getRequestCookieString(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testgetRequestCookieString2() {
        Response response = new Response();
        response.getRequestCookieString(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testserialiseRequestUrl0() {
        Response response = new Response();
        response.serialiseRequestUrl(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testserialiseRequestUrl1() {
        Response response = new Response();
        response.serialiseRequestUrl(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testserialiseRequestUrl2() {
        Response response = new Response();
        response.serialiseRequestUrl(null);
        assertTrue(response.equals(response));
    }
    @Test
    public void testneedsMultipart0() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.needsMultipart(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testneedsMultipart1() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.needsMultipart(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testneedsMultipart2() {
        HttpConnection httpconnection = new HttpConnection();
        httpconnection.needsMultipart(null);
        assertTrue(httpconnection.equals(httpconnection));
    }
    @Test
    public void testcreate0() {
        KeyVal keyval = new KeyVal();
        keyval.create("ti","svg");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcreate1() {
        KeyVal keyval = new KeyVal();
        keyval.create("Set-Cookif","bq");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcreate2() {
        KeyVal keyval = new KeyVal();
        keyval.create("(","tr");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcreate0() {
        KeyVal keyval = new KeyVal();
        keyval.create("title","charses",null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcreate1() {
        KeyVal keyval = new KeyVal();
        keyval.create(":only-of-typd","captioo",null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcreate2() {
        KeyVal keyval = new KeyVal();
        keyval.create(".","tbodx",null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey0() {
        KeyVal keyval = new KeyVal();
        keyval.key("form");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey1() {
        KeyVal keyval = new KeyVal();
        keyval.key("svf");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey2() {
        KeyVal keyval = new KeyVal();
        keyval.key("xmo");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey0() {
        KeyVal keyval = new KeyVal();
        keyval.key();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey1() {
        KeyVal keyval = new KeyVal();
        keyval.key();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testkey2() {
        KeyVal keyval = new KeyVal();
        keyval.key();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue0() {
        KeyVal keyval = new KeyVal();
        keyval.value("htto");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue1() {
        KeyVal keyval = new KeyVal();
        keyval.value("[a-zA-Z_:][-a-zA-Z0-9_:.]+");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue2() {
        KeyVal keyval = new KeyVal();
        keyval.value("noembed");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue0() {
        KeyVal keyval = new KeyVal();
        keyval.value();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue1() {
        KeyVal keyval = new KeyVal();
        keyval.value();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testvalue2() {
        KeyVal keyval = new KeyVal();
        keyval.value();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream0() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream(null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream1() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream(null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream2() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream(null);
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream0() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream1() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testinputStream2() {
        KeyVal keyval = new KeyVal();
        keyval.inputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testhasInputStream0() {
        KeyVal keyval = new KeyVal();
        keyval.hasInputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testhasInputStream1() {
        KeyVal keyval = new KeyVal();
        keyval.hasInputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testhasInputStream2() {
        KeyVal keyval = new KeyVal();
        keyval.hasInputStream();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType0() {
        KeyVal keyval = new KeyVal();
        keyval.contentType("#roou");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType1() {
        KeyVal keyval = new KeyVal();
        keyval.contentType(":emptx");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType2() {
        KeyVal keyval = new KeyVal();
        keyval.contentType("option");
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType0() {
        KeyVal keyval = new KeyVal();
        keyval.contentType();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType1() {
        KeyVal keyval = new KeyVal();
        keyval.contentType();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testcontentType2() {
        KeyVal keyval = new KeyVal();
        keyval.contentType();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testtoString0() {
        KeyVal keyval = new KeyVal();
        keyval.toString();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testtoString1() {
        KeyVal keyval = new KeyVal();
        keyval.toString();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testtoString2() {
        KeyVal keyval = new KeyVal();
        keyval.toString();
        assertTrue(keyval.equals(keyval));
    }
    @Test
    public void testfromJsoup0() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testfromJsoup1() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testfromJsoup2() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testconvert0() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(null,null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testconvert1() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(null,null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testconvert2() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.convert(null,null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testhead0() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.head(null,1114112);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testhead1() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.head(null,401);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testhead2() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.head(null,103);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testtail0() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.tail(null,57342);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testtail1() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.tail(null,-100);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testtail2() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.tail(null,55296);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testcopyAttributes0() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.copyAttributes(null,null);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testcopyAttributes1() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.copyAttributes(null,null);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testcopyAttributes2() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.copyAttributes(null,null);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testupdateNamespaces0() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.updateNamespaces(null);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testupdateNamespaces1() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.updateNamespaces(null);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testupdateNamespaces2() {
        W3CBuilder w3cbuilder = new W3CBuilder();
        w3cbuilder.updateNamespaces(null);
        assertTrue(w3cbuilder.equals(w3cbuilder));
    }
    @Test
    public void testasString0() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString(null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testasString1() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString(null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testasString2() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.asString(null);
        assertTrue(w3cdom.equals(w3cdom));
    }
    @Test
    public void testtest0() {
        Test test = new Test();
        test.test(101,":nth-child(");
        assertTrue(test.equals(test));
    }
    @Test
    public void testtest1() {
        Test test = new Test();
        test.test(9,"sarcasn");
        assertTrue(test.equals(test));
    }
    @Test
    public void testtest2() {
        Test test = new Test();
        test.test(57243,"bq");
        assertTrue(test.equals(test));
    }
}