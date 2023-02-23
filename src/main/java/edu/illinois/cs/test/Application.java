package edu.illinois.cs.test;

import edu.illinois.cs.test.generator.PoolInit;
import org.checkerframework.checker.units.qual.A;

public class Application extends Thread{

    public static void main(String[] args) {
        // init the pool
        PoolInit pool = new PoolInit();

    }


    @Override
    public void run() {

    }
}
