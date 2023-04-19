package edu.illinois.cs.test;

import edu.illinois.cs.test.generator.PoolInit;
import edu.illinois.cs.test.generator.TestGenerator;
import org.checkerframework.checker.units.qual.A;

public class Application{

    public static void main(String[] args) {
        // init the pool
        PoolInit pool = new PoolInit("src/main/java/org/jsoup/");

        TestGenerator tg = new TestGenerator("src/main/java/org/jsoup/");
    }
}
