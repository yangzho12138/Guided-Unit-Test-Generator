package edu.illinois.cs.test;

import edu.illinois.cs.test.generator.PoolInit;
import edu.illinois.cs.test.generator.TestGenerator;

public class Application{

    public static void main(String[] args) {
        // init the pool
        long startTime = System.currentTimeMillis();
        PoolInit pool = new PoolInit("src/main/java/org/jsoup/");

        TestGenerator tg = new TestGenerator("src/main/java/org/jsoup/");

        // Get end time
        long endTime = System.currentTimeMillis();

        // Calculate runtime in milliseconds
        long runtime = endTime - startTime;

        System.out.println("Program runtime: " + runtime + " ms");
    }
}
